---
title: jiraDeleteRemoteIssueLink
tags: [steps]
keywords: steps, remote, issuelink
summary: "More about jiraDeleteRemoteIssueLink step."
sidebar: jira_sidebar
permalink: jira_delete_remote_issuelink.html
folder: steps
---

## Overview

This step deletes a particular remote link of an issue.

## Input

* **idOrKey** - issue id or key.
* **linkId** - remote link id.
* **site** - Optional, default: `JIRA_SITE` environment variable.
* **failOnError** - Optional. default: `true`.

**Note**: It supports all the fields that any jira instance supports including custom fields. For more information about all available input fields, please refer to the [JIRA Api documentation](https://docs.atlassian.com/jira/REST/) depending on your JIRA version.

## Output

* Each step generates generic output, please refer to this [link](config.html#common-response--error-handling) for more information.
* The api response of this jira_delete_remote_issue_link step can be reused later in your script by doing `response.data.required_field_name`.
* You can see some example scenarios [here](https://jenkinsci.github.io/jira-steps-plugin/common_usages.html)
* All the available fields for a jira response can be found in [JIRA Api documentation](https://docs.atlassian.com/jira/REST/) depending on your JIRA version.

Note: response.data returns all the fields returned by JIRA API.

## Examples:

* With default [site](config#environment-variables) from global variables.

  ```groovy
  node {
    stage('JIRA') {
      def issueLink = jiraDeleteRemoteIssueLink idOrKey: 'TEST-27', linkId: '10000'
      echo issueLink.data.toString()
    }
  }
  ```
* `withEnv` to override the default site (or if there is not global site)

  ```groovy
  node {
    stage('JIRA') {
      withEnv(['JIRA_SITE=LOCAL']) {
        def issueLink = jiraDeleteRemoteIssueLink idOrKey: 'TEST-27', linkId: '10000'
        echo issueLink.data.toString()
      }
    }
  }
  ```
* Without environment variables.

  ```groovy
    def issueLink = jiraDeleteRemoteIssueLink idOrKey: 'TEST-27', linkId: '10000', site: 'LOCAL', failOnError: false
    echo issueLink.data.toString()
  ```

{% include links.html %}
