package org.thoughtslive.jenkins.plugins.jira.api;

import java.io.Serializable;

import org.kohsuke.stapler.DataBoundConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__({ @DataBoundConstructor }))
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressFBWarnings
public class Issues implements Serializable {
	private final static long serialVersionUID = 7689184735166991068L;

	@JsonProperty("startAt")
	private int startAt;

	@JsonProperty("maxResults")
	private int maxResults;

	@JsonProperty("total")
	private int total;

	@JsonProperty("issueUpdates")
	private Issue[] issueUpdates;

	@JsonProperty("issues")
	private Issue[] issues;
}
