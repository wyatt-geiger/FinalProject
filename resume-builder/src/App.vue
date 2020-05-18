<template>

  <div id="app">

    <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css2?family=Baloo+Thambi+2:wght@500&display=swap" rel="stylesheet">

    </head>

    
    <div class="jumbotron">
        <h1 class="jumbofont">Resume Builder</h1>
    </div>

    <PersonalInfo v-on:personal-info="personalAdded"></PersonalInfo>
    <ResSummary v-on:summary-info="summaryAdded"></ResSummary>
    <Education v-on:education-info="educationAdded"></Education>
    <InvolvementLeadership v-on:involvement-info="involvementAdded"></InvolvementLeadership>
    <EmploymentHistory v-on:employment-info="employmentAdded"></EmploymentHistory>

  </div>
</template>

<script>

import PersonalInfo from './components/PersonalInfo.vue'
import ResSummary from './components/ResSummary.vue'
import Education from './components/Education.vue'
import InvolvementLeadership from './components/InvolvementLeadership.vue'
import EmploymentHistory from './components/EmploymentHistory.vue'

export default {
  name: 'App',
  data () {
    return {
      personal: [],
      ressum: [],
      edu: [],
      involvement: [],
      employment: []
    }
  },
  components: {
    PersonalInfo,
    ResSummary,
    Education,
    InvolvementLeadership,
    EmploymentHistory
  },
  personalAdded(personalInfoSection) {
    this.personal.push(personalInfoSection)
  },
  summaryAdded(resumeSummarySection) {
    this.ressum.push(resumeSummarySection)
  },
  educationAdded(educationSection) {
    this.edu.push(educationSection)
  },
  involvementAdded(involvementSection) {
    this.involvement.push(involvementSection)
  },
  employmentAdded(involvementSection) {
    this.employment.push(involvementSection)
  }
}
</script>

<style>



#app {
    font-family: 'Baloo Thambi 2', cursive;
    background-image: linear-gradient(#8583BA,#A8A6CF);
    text-align: center;
}

.jumbotron {
    background-color:#6764A5;
}

.jumbofont {
    font-size: 400%;
}

.header {
    font-size: 200%;
}

.resume-fields {
    margin-bottom: 50px;
}

.alert {
    background-color: rgb(255, 40, 40);
}

.alert-danger {
    font-weight: bold;
}

/** hidden class that hides education alert if None is not selected **/
.hidden {
    display: none;
}

.uni-hidden {
    display: none;
}

.hs-hidden {
    display: none;
}

.current-hidden {
    display: none;
}

.graduated-hidden {
    display: none;
}

/** color formatting for None selection **/
.education-alert {
    margin-top: 20px;
    padding: 15px 10px;
    background-color: #ff4c4c;
    border: 5px solid crimson;
    width: 380px;
}

.companies {
    border-style: dashed;
    width: 1150px;
    margin-bottom: 5px;
}

</style>
