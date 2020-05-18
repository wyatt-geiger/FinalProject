<template>
    <div>

    <div class="resume-fields"> <!-- Generic resume fields class that is applied to the various resume blocks (e.g. Personal Information, Summary, etc.) -->
        <div class="header">Personal Information</div> <!-- Generic header class applied to the title of each resume block -->
            <br><input type="text" id="name-input" placeholder="First Name" v-model.trim="firstName">
                <input type="text" id="name-input" placeholder="Middle Initial" v-model.trim="middleInitial"> 
                <input type="text" id="name-input" placeholder="Last Name" v-model.trim="lastName">
            <br><input type="email" id="email-input" placeholder="Email" v-model.trim="emailAddress"> 
                <input type="text" id="phone-input" placeholder="Phone Number" v-model.trim="phoneNumber">
            <br><input type="text" id="street-input" placeholder="Street Address" v-model.trim="streetAddress"> 
                <input type="text" id="csZIP-input" placeholder="City" v-model.trim="city"> 
                <input type="text" id="csZIP-input" placeholder="State" v-model.trim="state"> 
                <input type="text" id="csZIP-input" placeholder="ZIP Code" v-model.trim="zipCode">

        <p><button type="submit" class="btn btn-primary" v-on:click.prevent="personalSection">Submit Section</button></p>

    <div class="alert alert-danger" v-show="errors && errors.length > 0">
        <li v-for="error in errors" v-bind:key="error">{{ error }}</li> 
    </div>
                
    </div>

    </div>
</template>

<script>
export default {

    name: 'PersonalInfo',
    data() {
        return {
            firstName: '',
            middleInitial: '',
            lastName: '',
            emailAddress: '',
            phoneNumber: '',
            streetAddress: '',
            city: '',
            state: '',
            zipCode: '',
            errors: []
        }
    },
    methods: {
        personalSection() {
            this.errors = []
            if (this.firstName && this.middleInitial && this.lastName && this.emailAddress && this.phoneNumber && this.streetAddress && this.city && this.state && this.zipCode) {
                let personalInfoSection = { nameInput: this.middleInitial }
                this.$emit('personal-info', personalInfoSection)
            } else {
                this.errors.push('All fields for the Personal Information section must be completed. Please ensure you have filled out the fields correctly.')
            }
        }
    }
}
</script>

<style>

    
</style>