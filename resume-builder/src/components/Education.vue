<template>
    <div>
    <div>
    
    <div class="header">Education:</div>
        <div>
        <input name="type-education" type="radio" class="js-education" value="High School">High school
        <input name="type-education" type="radio" class="js-education" value="University">University
        <input name="type-education" type="radio" class="js-education" value="None">None
        </div>
        </div>


    <p id="no-education" class="education-alert hidden">You have chosen to not add an Education section.</p>

    <div id="uni-education" class="uni-hidden resume-fields">
        <br>Name of University: <input type="text">
        <br>Degree Field: <input type="text">
        <br>Location: <input type="text">
        <br><input name="graduatedYN" type="checkbox" id="uni-grad">Graduated?
        <div name="gradbox" class="currentEnroll current-hidden">Expected Graduation: <input type="text"></div>
        <div name="gradbox" class="graduated graduated-hidden">Graduation Year: <input type="text"></div>
    </div>


        <div id="hs-education" class="hs-hidden resume-fields">
            <br>Name of High School: <input type="text">
            <br>Location: <input type="text">
            <br><input name="graduatedNY" type="checkbox" id="hs-grad">Graduated?
            <div name="gradbox" class="currentEnroll current-hidden">Current Grade/Year: <input type="text"></div>
            <div name="gradbox" class="graduated graduated-hidden">Graduation Year: <input type="text"></div>
        </div>

    </div>
</template>

<script>
export default {
    // Create and export component here
    name: 'Education',
    data() {
        return {
            errors: [],
        }
    },
    methods: {
        hiddenEducation() {
  
  // check radio button selection

  let education = Array.from(document.getElementsByClassName('js-education'))
  .forEach(element => {
    element.addEventListener('click', e => {

      let selectedEducation = document.querySelector('input[name="type-education"]:checked').value;

      if (selectedEducation == 'None') { // block that shows an alert stating no education field has been selected
        document.getElementById('no-education').classList.remove('hidden');
        document.getElementById('uni-education').classList.add('uni-hidden');
        document.getElementById('hs-education').classList.add('hs-hidden');
      }
      else if (selectedEducation == 'University') { // block that reveals the University education form fields
        document.getElementById('uni-education').classList.remove('uni-hidden');
        document.getElementById('no-education').classList.add('hidden');
        document.getElementById('hs-education').classList.add('hs-hidden');
      }
      else { // block that reveals the High School education form fields
        document.getElementById('hs-education').classList.remove('hs-hidden');
        document.getElementById('no-education').classList.add('hidden');
        document.getElementById('uni-education').classList.add('uni-hidden');
      }

      Array.from(document.getElementsByClassName('graduated')).forEach(el => el.classList.add('graduated-hidden'));
      Array.from(document.getElementsByClassName('currentEnroll')).forEach(el => el.classList.add('current-hidden'));

    })
  });

  // check graduation selection

    // university selected
    document.getElementById('uni-grad').addEventListener('click', e => {

    let checktest = document.querySelector('input[name="graduatedYN"]:checked');

    // If checked, field for graduation date will be displayed. If unchecked, field for expected graduation will be displayed.

    if (checktest) {
        Array.from(document.getElementsByClassName('graduated')).forEach(el => el.classList.remove('graduated-hidden'));
        Array.from(document.getElementsByClassName('currentEnroll')).forEach(el => el.classList.add('current-hidden'));
    } else {
        Array.from(document.getElementsByClassName('graduated')).forEach(el => el.classList.add('graduated-hidden'));
        Array.from(document.getElementsByClassName('currentEnroll')).forEach(el => el.classList.remove('current-hidden'));
    }

    })

    // high school selected
    document.getElementById('hs-grad').addEventListener('click', e => {

    let checktest = document.querySelector('input[name="graduatedNY"]:checked');

    // If checked, field for graduation date will be displayed. If unchecked, field for expected graduation will be displayed. 

    if (checktest) {
        Array.from(document.getElementsByClassName('graduated')).forEach(el => el.classList.remove('graduated-hidden'));
        Array.from(document.getElementsByClassName('currentEnroll')).forEach(el => el.classList.add('current-hidden'));
    } else {
        Array.from(document.getElementsByClassName('graduated')).forEach(el => el.classList.add('graduated-hidden'));
        Array.from(document.getElementsByClassName('currentEnroll')).forEach(el => el.classList.remove('current-hidden'));
    }

})

}
    }
}
</script>

<style>
    /* Write any style for this component here */
</style>