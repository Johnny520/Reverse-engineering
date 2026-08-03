package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class Comparer {
    private static final java.lang.String NAME = "name";
    private final java.lang.String[] ignore;

    public Comparer() {
            r1 = this;
            java.lang.String r0 = "name"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.<init>(r0)
            return
    }

    public Comparer(java.lang.String... r1) {
            r0 = this;
            r0.<init>()
            r0.ignore = r1
            return
    }

    private boolean isIgnore(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.String r6 = r6.getName()
            java.lang.String[] r0 = r5.ignore
            r1 = 0
            if (r0 == 0) goto L1a
            int r2 = r0.length
            r3 = r1
        Lb:
            if (r3 >= r2) goto L1a
            r4 = r0[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L17
            r6 = 1
            return r6
        L17:
            int r3 = r3 + 1
            goto Lb
        L1a:
            return r1
    }

    public boolean equals(java.lang.annotation.Annotation r8, java.lang.annotation.Annotation r9) throws java.lang.Exception {
            r7 = this;
            java.lang.Class r0 = r8.annotationType()
            java.lang.Class r1 = r9.annotationType()
            java.lang.reflect.Method[] r2 = r0.getDeclaredMethods()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L34
            int r0 = r2.length
            r3 = r1
        L15:
            if (r3 >= r0) goto L32
            r4 = r2[r3]
            boolean r5 = r7.isIgnore(r4)
            if (r5 != 0) goto L2f
            r5 = 0
            java.lang.Object r6 = r4.invoke(r8, r5)
            java.lang.Object r4 = r4.invoke(r9, r5)
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L2f
            return r1
        L2f:
            int r3 = r3 + 1
            goto L15
        L32:
            r8 = 1
            return r8
        L34:
            return r1
    }
}
