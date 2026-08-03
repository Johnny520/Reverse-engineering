package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class ArrayTransform implements org.simpleframework.xml.transform.Transform {
    private final org.simpleframework.xml.transform.Transform delegate;
    private final java.lang.Class entry;
    private final org.simpleframework.xml.transform.StringArrayTransform split;

    public ArrayTransform(org.simpleframework.xml.transform.Transform r2, java.lang.Class r3) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.transform.StringArrayTransform r0 = new org.simpleframework.xml.transform.StringArrayTransform
            r0.<init>()
            r1.split = r0
            r1.delegate = r2
            r1.entry = r3
            return
    }

    private java.lang.Object read(java.lang.String[] r5, int r6) throws java.lang.Exception {
            r4 = this;
            java.lang.Class r0 = r4.entry
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r6)
            r1 = 0
        L7:
            if (r1 >= r6) goto L19
            org.simpleframework.xml.transform.Transform r2 = r4.delegate
            r3 = r5[r1]
            java.lang.Object r2 = r2.read(r3)
            if (r2 == 0) goto L16
            java.lang.reflect.Array.set(r0, r1, r2)
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            return r0
    }

    private java.lang.String write(java.lang.Object r5, int r6) throws java.lang.Exception {
            r4 = this;
            java.lang.String[] r0 = new java.lang.String[r6]
            r1 = 0
        L3:
            if (r1 >= r6) goto L16
            java.lang.Object r2 = java.lang.reflect.Array.get(r5, r1)
            if (r2 == 0) goto L13
            org.simpleframework.xml.transform.Transform r3 = r4.delegate
            java.lang.String r2 = r3.write(r2)
            r0[r1] = r2
        L13:
            int r1 = r1 + 1
            goto L3
        L16:
            org.simpleframework.xml.transform.StringArrayTransform r5 = r4.split
            java.lang.String r5 = r5.write2(r0)
            return r5
    }

    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Object read(java.lang.String r2) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.transform.StringArrayTransform r0 = r1.split
            java.lang.String[] r2 = r0.read2(r2)
            int r0 = r2.length
            java.lang.Object r2 = r1.read(r2, r0)
            return r2
    }

    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.String write(java.lang.Object r2) throws java.lang.Exception {
            r1 = this;
            int r0 = java.lang.reflect.Array.getLength(r2)
            java.lang.String r2 = r1.write(r2, r0)
            return r2
    }
}
