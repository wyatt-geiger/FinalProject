<template>
<div>
    <div>
        <div class="resume-fields">
            <div class="header">Summary:</div>
                <ul>
                <li>Typically in a Summary section, you would add a couple of relevant skills for the job you're applying for and let them know why you're applying for this job.
                <li>In addition, you want to create one or two sentences that show general workplace skills, such as adaptibility.
                <li>Generally, this section should only be 2-4 sentences long.</li>
                </ul>
                <p><textarea id="summary-input" name="summary-input" rows="5" cols="140"></textarea></p>
        </div>
    </div>

    <p><p><button type="submit" class="btn btn-primary" v-on:click.prevent="summSection">Submit Section</button></p></p>

    <div class="alert alert-danger" v-show="errors && errors.length > 0">
        <li v-for="error in errors" v-bind:key="error">{{ error }}</li> 
    </div>
</div>
    
</template>

<script>
export default {
    name: 'ResSummary',
    data() {
        return {
            summ: '',
            errors: []
        }
    },
    methods: {
        summSection() {
            this.errors = []
            if (this.summ) {
                let resumeSummarySection = { "summary-input": this.summ }
                this.$emit('summary-info', resumeSummarySection)
            } else {
                this.errors.push('The Summary section must be completed. Please ensure that you have filled the Summary section out.')
            }
        }
    }
}
</script>

<style>
    /* Write any style for this component here */
</style>