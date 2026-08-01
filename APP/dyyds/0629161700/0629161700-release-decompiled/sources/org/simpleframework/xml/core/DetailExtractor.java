package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class DetailExtractor {
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Detail> details;
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.ContactList> fields;
    private final org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.ContactList> methods;
    private final org.simpleframework.xml.DefaultType override;
    private final org.simpleframework.xml.core.Support support;

    public DetailExtractor(org.simpleframework.xml.core.Support r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DetailExtractor(org.simpleframework.xml.core.Support r2, org.simpleframework.xml.DefaultType r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.methods = r0
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.fields = r0
            org.simpleframework.xml.util.ConcurrentCache r0 = new org.simpleframework.xml.util.ConcurrentCache
            r0.<init>()
            r1.details = r0
            r1.override = r3
            r1.support = r2
            return
    }

    private org.simpleframework.xml.core.ContactList getFields(java.lang.Class r3, org.simpleframework.xml.core.Detail r4) {
            r2 = this;
            org.simpleframework.xml.core.FieldScanner r0 = new org.simpleframework.xml.core.FieldScanner
            org.simpleframework.xml.core.Support r1 = r2.support
            r0.<init>(r4, r1)
            if (r4 == 0) goto Le
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.ContactList> r2 = r2.fields
            r2.cache(r3, r0)
        Le:
            return r0
    }

    private org.simpleframework.xml.core.ContactList getMethods(java.lang.Class r3, org.simpleframework.xml.core.Detail r4) {
            r2 = this;
            org.simpleframework.xml.core.MethodScanner r0 = new org.simpleframework.xml.core.MethodScanner
            org.simpleframework.xml.core.Support r1 = r2.support
            r0.<init>(r4, r1)
            if (r4 == 0) goto Le
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.ContactList> r2 = r2.methods
            r2.cache(r3, r0)
        Le:
            return r0
    }

    public org.simpleframework.xml.core.Detail getDetail(java.lang.Class r3) {
            r2 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Detail> r0 = r2.details
            java.lang.Object r0 = r0.fetch(r3)
            org.simpleframework.xml.core.Detail r0 = (org.simpleframework.xml.core.Detail) r0
            if (r0 != 0) goto L16
            org.simpleframework.xml.core.DetailScanner r0 = new org.simpleframework.xml.core.DetailScanner
            org.simpleframework.xml.DefaultType r1 = r2.override
            r0.<init>(r3, r1)
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.Detail> r2 = r2.details
            r2.cache(r3, r0)
        L16:
            return r0
    }

    public org.simpleframework.xml.core.ContactList getFields(java.lang.Class r3) {
            r2 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.ContactList> r0 = r2.fields
            java.lang.Object r0 = r0.fetch(r3)
            org.simpleframework.xml.core.ContactList r0 = (org.simpleframework.xml.core.ContactList) r0
            if (r0 != 0) goto L15
            org.simpleframework.xml.core.Detail r1 = r2.getDetail(r3)
            if (r1 == 0) goto L15
            org.simpleframework.xml.core.ContactList r2 = r2.getFields(r3, r1)
            return r2
        L15:
            return r0
    }

    public org.simpleframework.xml.core.ContactList getMethods(java.lang.Class r3) {
            r2 = this;
            org.simpleframework.xml.util.Cache<org.simpleframework.xml.core.ContactList> r0 = r2.methods
            java.lang.Object r0 = r0.fetch(r3)
            org.simpleframework.xml.core.ContactList r0 = (org.simpleframework.xml.core.ContactList) r0
            if (r0 != 0) goto L15
            org.simpleframework.xml.core.Detail r1 = r2.getDetail(r3)
            if (r1 == 0) goto L15
            org.simpleframework.xml.core.ContactList r2 = r2.getMethods(r3, r1)
            return r2
        L15:
            return r0
    }
}
