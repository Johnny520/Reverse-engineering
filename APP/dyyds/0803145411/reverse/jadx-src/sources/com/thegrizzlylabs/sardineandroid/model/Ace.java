package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Ace {

    @Element(required = false)
    private Deny deny;

    @Element(required = false)
    private Grant grant;

    @Element(required = false)
    private Inherited inherited;

    @Element(required = false)
    private Principal principal;

    @Element(name = "protected", required = false)
    private Protected protected1;

    public Deny getDeny() {
        return this.deny;
    }

    public Grant getGrant() {
        return this.grant;
    }

    public Inherited getInherited() {
        return this.inherited;
    }

    public Principal getPrincipal() {
        return this.principal;
    }

    public Protected getProtected() {
        return this.protected1;
    }

    public void setDeny(Deny deny) {
        this.deny = deny;
    }

    public void setGrant(Grant grant) {
        this.grant = grant;
    }

    public void setInherited(Inherited inherited) {
        this.inherited = inherited;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void setProtected(Protected r1) {
        this.protected1 = r1;
    }
}
