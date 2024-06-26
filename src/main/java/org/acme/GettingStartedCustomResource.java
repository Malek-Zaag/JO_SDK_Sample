package org.acme;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

// The actual custom Resource
@Group("org.acme")
@Version("v1")
public class GettingStartedCustomResource
                extends CustomResource<GettingStartedSpec, GettingStartedStatus>
                implements Namespaced {
}
