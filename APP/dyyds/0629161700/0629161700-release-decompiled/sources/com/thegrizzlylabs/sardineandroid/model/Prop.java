package com.thegrizzlylabs.sardineandroid.model;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
@org.simpleframework.xml.Namespace(prefix = "D", reference = "DAV:")
@org.simpleframework.xml.Root(strict = false)
public class Prop implements com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement {

    @org.simpleframework.xml.Element(required = false)
    protected com.thegrizzlylabs.sardineandroid.model.Acl acl;
    protected java.util.List<org.w3c.dom.Element> any;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String creationdate;

    @org.simpleframework.xml.Element(name = "current-user-privilege-set")
    private com.thegrizzlylabs.sardineandroid.model.CurrentUserPrivilegeSet currentUserPrivilegeSet;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String displayname;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String getcontentlanguage;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String getcontentlength;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String getcontenttype;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String getetag;

    @org.simpleframework.xml.Element(required = false)
    protected java.lang.String getlastmodified;

    @org.simpleframework.xml.Element(required = false)
    protected com.thegrizzlylabs.sardineandroid.model.Group group;

    @org.simpleframework.xml.Element(required = false)
    protected com.thegrizzlylabs.sardineandroid.model.Lockdiscovery lockdiscovery;

    @org.simpleframework.xml.Element(required = false)
    protected com.thegrizzlylabs.sardineandroid.model.Owner owner;

    @org.simpleframework.xml.Element(name = "principal-collection-set", required = false)
    private com.thegrizzlylabs.sardineandroid.model.PrincipalCollectionSet principalCollectionSet;

    @org.simpleframework.xml.Element(name = "current-user-principal", required = false)
    private com.thegrizzlylabs.sardineandroid.model.PrincipalURL principalURL;

    @org.simpleframework.xml.Element(name = "quota-available-bytes", required = false)
    protected com.thegrizzlylabs.sardineandroid.model.QuotaAvailableBytes quotaAvailableBytes;

    @org.simpleframework.xml.Element(name = "quota-used-bytes", required = false)
    protected com.thegrizzlylabs.sardineandroid.model.QuotaUsedBytes quotaUsedBytes;

    @org.simpleframework.xml.Element(required = false)
    protected com.thegrizzlylabs.sardineandroid.model.Resourcetype resourcetype;

    @org.simpleframework.xml.Element(required = false)
    protected com.thegrizzlylabs.sardineandroid.model.Supportedlock supportedlock;

    public Prop() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.thegrizzlylabs.sardineandroid.model.Acl getAcl() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Acl r0 = r0.acl
            return r0
    }

    @Override // com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement
    public java.util.List<org.w3c.dom.Element> getAny() {
            r1 = this;
            java.util.List<org.w3c.dom.Element> r0 = r1.any
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.any = r0
        Lb:
            return r0
    }

    public java.lang.String getCreationdate() {
            r0 = this;
            java.lang.String r0 = r0.creationdate
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.CurrentUserPrivilegeSet getCurrentUserPrivilegeSet() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.CurrentUserPrivilegeSet r0 = r0.currentUserPrivilegeSet
            return r0
    }

    public java.lang.String getDisplayname() {
            r0 = this;
            java.lang.String r0 = r0.displayname
            return r0
    }

    public java.lang.String getGetcontentlanguage() {
            r0 = this;
            java.lang.String r0 = r0.getcontentlanguage
            return r0
    }

    public java.lang.String getGetcontentlength() {
            r0 = this;
            java.lang.String r0 = r0.getcontentlength
            return r0
    }

    public java.lang.String getGetcontenttype() {
            r0 = this;
            java.lang.String r0 = r0.getcontenttype
            return r0
    }

    public java.lang.String getGetetag() {
            r0 = this;
            java.lang.String r0 = r0.getetag
            return r0
    }

    public java.lang.String getGetlastmodified() {
            r0 = this;
            java.lang.String r0 = r0.getlastmodified
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Group getGroup() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Group r0 = r0.group
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Lockdiscovery getLockdiscovery() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Lockdiscovery r0 = r0.lockdiscovery
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Owner getOwner() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Owner r0 = r0.owner
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.PrincipalCollectionSet getPrincipalCollectionSet() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.PrincipalCollectionSet r0 = r0.principalCollectionSet
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.PrincipalURL getPrincipalURL() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.PrincipalURL r0 = r0.principalURL
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.QuotaAvailableBytes getQuotaAvailableBytes() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.QuotaAvailableBytes r0 = r0.quotaAvailableBytes
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.QuotaUsedBytes getQuotaUsedBytes() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.QuotaUsedBytes r0 = r0.quotaUsedBytes
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Resourcetype getResourcetype() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Resourcetype r0 = r0.resourcetype
            return r0
    }

    public com.thegrizzlylabs.sardineandroid.model.Supportedlock getSupportedlock() {
            r0 = this;
            com.thegrizzlylabs.sardineandroid.model.Supportedlock r0 = r0.supportedlock
            return r0
    }

    public void setAcl(com.thegrizzlylabs.sardineandroid.model.Acl r1) {
            r0 = this;
            r0.acl = r1
            return
    }

    public void setCreationdate(java.lang.String r1) {
            r0 = this;
            r0.creationdate = r1
            return
    }

    public void setCurrentUserPrivilegeSet(com.thegrizzlylabs.sardineandroid.model.CurrentUserPrivilegeSet r1) {
            r0 = this;
            r0.currentUserPrivilegeSet = r1
            return
    }

    public void setDisplayname(java.lang.String r1) {
            r0 = this;
            r0.displayname = r1
            return
    }

    public void setGetcontentlanguage(java.lang.String r1) {
            r0 = this;
            r0.getcontentlanguage = r1
            return
    }

    public void setGetcontentlength(java.lang.String r1) {
            r0 = this;
            r0.getcontentlength = r1
            return
    }

    public void setGetcontenttype(java.lang.String r1) {
            r0 = this;
            r0.getcontenttype = r1
            return
    }

    public void setGetetag(java.lang.String r1) {
            r0 = this;
            r0.getetag = r1
            return
    }

    public void setGetlastmodified(java.lang.String r1) {
            r0 = this;
            r0.getlastmodified = r1
            return
    }

    public void setGroup(com.thegrizzlylabs.sardineandroid.model.Group r1) {
            r0 = this;
            r0.group = r1
            return
    }

    public void setLockdiscovery(com.thegrizzlylabs.sardineandroid.model.Lockdiscovery r1) {
            r0 = this;
            r0.lockdiscovery = r1
            return
    }

    public void setOwner(com.thegrizzlylabs.sardineandroid.model.Owner r1) {
            r0 = this;
            r0.owner = r1
            return
    }

    public void setPrincipalCollectionSet(com.thegrizzlylabs.sardineandroid.model.PrincipalCollectionSet r1) {
            r0 = this;
            r0.principalCollectionSet = r1
            return
    }

    public void setPrincipalURL(com.thegrizzlylabs.sardineandroid.model.PrincipalURL r1) {
            r0 = this;
            r0.principalURL = r1
            return
    }

    public void setQuotaAvailableBytes(com.thegrizzlylabs.sardineandroid.model.QuotaAvailableBytes r1) {
            r0 = this;
            r0.quotaAvailableBytes = r1
            return
    }

    public void setQuotaUsedBytes(com.thegrizzlylabs.sardineandroid.model.QuotaUsedBytes r1) {
            r0 = this;
            r0.quotaUsedBytes = r1
            return
    }

    public void setResourcetype(com.thegrizzlylabs.sardineandroid.model.Resourcetype r1) {
            r0 = this;
            r0.resourcetype = r1
            return
    }

    public void setSupportedlock(com.thegrizzlylabs.sardineandroid.model.Supportedlock r1) {
            r0 = this;
            r0.supportedlock = r1
            return
    }
}
