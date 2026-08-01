package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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

    private boolean isIgnore(java.lang.reflect.Method r5) {
            r4 = this;
            java.lang.String r5 = r5.getName()
            java.lang.String[] r4 = r4.ignore
            r0 = 0
            if (r4 == 0) goto L1a
            int r1 = r4.length
            r2 = r0
        Lb:
            if (r2 >= r1) goto L1a
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            r4 = 1
            return r4
        L17:
            int r2 = r2 + 1
            goto Lb
        L1a:
            return r0
    }

    public boolean equals(java.lang.annotation.Annotation r8, java.lang.annotation.Annotation r9) {
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
            r7 = 1
            return r7
        L34:
            return r1
    }
}
