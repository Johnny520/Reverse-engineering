package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
class LabelKey {
    private final java.lang.Class label;
    private final java.lang.String name;
    private final java.lang.Class owner;
    private final java.lang.Class type;

    public LabelKey(org.simpleframework.xml.core.Contact r2, java.lang.annotation.Annotation r3) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getDeclaringClass()
            r1.owner = r0
            java.lang.Class r3 = r3.annotationType()
            r1.label = r3
            java.lang.String r3 = r2.getName()
            r1.name = r3
            java.lang.Class r2 = r2.getType()
            r1.type = r2
            return
    }

    private boolean equals(org.simpleframework.xml.core.LabelKey r4) {
            r3 = this;
            if (r4 != r3) goto L4
            r4 = 1
            return r4
        L4:
            java.lang.Class r0 = r4.label
            java.lang.Class r1 = r3.label
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            java.lang.Class r0 = r4.owner
            java.lang.Class r1 = r3.owner
            if (r0 == r1) goto L13
            return r2
        L13:
            java.lang.Class r0 = r4.type
            java.lang.Class r1 = r3.type
            if (r0 == r1) goto L1a
            return r2
        L1a:
            java.lang.String r4 = r4.name
            java.lang.String r0 = r3.name
            boolean r4 = r4.equals(r0)
            return r4
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.simpleframework.xml.core.LabelKey
            if (r0 == 0) goto Lb
            org.simpleframework.xml.core.LabelKey r2 = (org.simpleframework.xml.core.LabelKey) r2
            boolean r2 = r1.equals(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            java.lang.Class r1 = r2.owner
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.name
            java.lang.Class r1 = r2.owner
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "key '%s' for %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
