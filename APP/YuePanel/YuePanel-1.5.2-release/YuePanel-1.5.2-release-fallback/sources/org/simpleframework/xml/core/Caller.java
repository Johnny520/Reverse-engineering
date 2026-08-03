package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
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

    public void commit(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Function r0 = r2.commit
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.Context r1 = r2.context
            r0.call(r1, r3)
        L9:
            return
    }

    public void complete(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Function r0 = r2.complete
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.Context r1 = r2.context
            r0.call(r1, r3)
        L9:
            return
    }

    public void persist(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Function r0 = r2.persist
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.Context r1 = r2.context
            r0.call(r1, r3)
        L9:
            return
    }

    public java.lang.Object replace(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Function r0 = r2.replace
            if (r0 == 0) goto La
            org.simpleframework.xml.core.Context r1 = r2.context
            java.lang.Object r3 = r0.call(r1, r3)
        La:
            return r3
    }

    public java.lang.Object resolve(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Function r0 = r2.resolve
            if (r0 == 0) goto La
            org.simpleframework.xml.core.Context r1 = r2.context
            java.lang.Object r3 = r0.call(r1, r3)
        La:
            return r3
    }

    public void validate(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.core.Function r0 = r2.validate
            if (r0 == 0) goto L9
            org.simpleframework.xml.core.Context r1 = r2.context
            r0.call(r1, r3)
        L9:
            return
    }
}
