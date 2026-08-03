package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class CharacterArrayTransform implements org.simpleframework.xml.transform.Transform {
    private final java.lang.Class entry;

    public CharacterArrayTransform(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.entry = r1
            return
    }

    private java.lang.Object read(char[] r4, int r5) throws java.lang.Exception {
            r3 = this;
            java.lang.Class r0 = r3.entry
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r5)
            r1 = 0
        L7:
            if (r1 >= r5) goto L15
            char r2 = r4[r1]
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.reflect.Array.set(r0, r1, r2)
            int r1 = r1 + 1
            goto L7
        L15:
            return r0
    }

    private java.lang.String write(java.lang.Object r4, int r5) throws java.lang.Exception {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r1 = 0
        L6:
            if (r1 >= r5) goto L14
            java.lang.Object r2 = java.lang.reflect.Array.get(r4, r1)
            if (r2 == 0) goto L11
            r0.append(r2)
        L11:
            int r1 = r1 + 1
            goto L6
        L14:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Object read(java.lang.String r4) throws java.lang.Exception {
            r3 = this;
            char[] r4 = r4.toCharArray()
            int r0 = r4.length
            java.lang.Class r1 = r3.entry
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r1 != r2) goto Lc
            return r4
        Lc:
            java.lang.Object r4 = r3.read(r4, r0)
            return r4
    }

    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.String write(java.lang.Object r4) throws java.lang.Exception {
            r3 = this;
            int r0 = java.lang.reflect.Array.getLength(r4)
            java.lang.Class r1 = r3.entry
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r1 != r2) goto L12
            char[] r4 = (char[]) r4
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            return r0
        L12:
            java.lang.String r4 = r3.write(r4, r0)
            return r4
    }
}
