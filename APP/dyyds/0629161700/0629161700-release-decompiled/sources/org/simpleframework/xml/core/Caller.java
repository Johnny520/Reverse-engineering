package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Caller {
    private final org.simpleframework.xml.core.Function commit;
    private final org.simpleframework.xml.core.Function complete;
    private final org.simpleframework.xml.core.Context context;
    private final org.simpleframework.xml.core.Function persist;
    private final org.simpleframework.xml.core.Function replace;
    private final org.simpleframework.xml.core.Function resolve;
    private final org.simpleframework.xml.core.Function validate;

    public Caller(org.simpleframework.xml.core.Scanner r2, org.simpleframework.xml.core.Context r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.Function r0 = r2.getValidate()
            r1.validate = r0
            org.simpleframework.xml.core.Function r0 = r2.getComplete()
            r1.complete = r0
            org.simpleframework.xml.core.Function r0 = r2.getReplace()
            r1.replace = r0
            org.simpleframework.xml.core.Function r0 = r2.getResolve()
            r1.resolve = r0
            org.simpleframework.xml.core.Function r0 = r2.getPersist()
            r1.persist = r0
            org.simpleframework.xml.core.Function r2 = r2.getCommit()
            r1.commit = r2
            r1.context = r3
            return
    }

    public void commit(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.commit
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.Context r1 = r1.context
            r0.call(r1, r2)
        L9:
            return
    }

    public void complete(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.complete
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.Context r1 = r1.context
            r0.call(r1, r2)
        L9:
            return
    }

    public void persist(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.persist
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.Context r1 = r1.context
            r0.call(r1, r2)
        L9:
            return
    }

    public java.lang.Object replace(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.replace
            if (r0 == 0) goto Lb
            org.simpleframework.xml.core.Context r1 = r1.context
            java.lang.Object r1 = r0.call(r1, r2)
            return r1
        Lb:
            return r2
    }

    public java.lang.Object resolve(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.resolve
            if (r0 == 0) goto Lb
            org.simpleframework.xml.core.Context r1 = r1.context
            java.lang.Object r1 = r0.call(r1, r2)
            return r1
        Lb:
            return r2
    }

    public void validate(java.lang.Object r2) {
            r1 = this;
            org.simpleframework.xml.core.Function r0 = r1.validate
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.Context r1 = r1.context
            r0.call(r1, r2)
        L9:
            return
    }
}
