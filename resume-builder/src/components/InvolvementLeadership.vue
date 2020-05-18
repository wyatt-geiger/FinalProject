<template>
    <div>
                <div class="resume-fields">
    <div class="header">Involvement and Leadership:</div>

    <p><textarea id="involvement-input" name="involvement-input" rows="5" cols="140"></textarea></p></div>
    <ul>
        <li>In this section, include any volunteer work or other classes that you have participated in, especially if they are relevant to the job you are applying for.</li>
        <li>Also list any important leadership roles you have been involved in.</li>
    </ul>

    <p><p><button type="submit" class="btn btn-primary" v-on:click.prevent="summSection">Submit Section</button></p></p>

    <div class="alert alert-danger" v-show="errors && errors.length > 0">
        <li v-for="error in errors" v-bind:key="error">{{ error }}</li> 
    </div>

    </div>
</template>

<script>
export default {
    name: 'InvolvementLeadership',
    data() {
        return {
            involvement: '',
            errors: []
        }
    },
    methods: {
        summSection() {
            this.errors = []
            if (this.involvement) {
                let resumeSummarySection = { "involvement-input": this.involvement }
                this.$emit('summary-info', resumeSummarySection)
            } else {
                this.errors.push('The Involvement and Leadership section must be completed. Please ensure that you have filled the Involvement and Leadership section out.')
            }
        }
    }
}
</script>

<style>
    /* Write any style for this component here */
</style>