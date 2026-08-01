package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class CharacterArrayTransform implements org.simpleframework.xml.transform.Transform {
    private final java.lang.Class entry;

    public CharacterArrayTransform(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.entry = r1
            return
    }

    private java.lang.Object read(char[] r3, int r4) {
            r2 = this;
            java.lang.Class r2 = r2.entry
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r4)
            r0 = 0
        L7:
            if (r0 >= r4) goto L15
            char r1 = r3[r0]
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.reflect.Array.set(r2, r0, r1)
            int r0 = r0 + 1
            goto L7
        L15:
            return r2
    }

    private java.lang.String write(java.lang.Object r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r0 = 0
        L6:
            if (r0 >= r4) goto L14
            java.lang.Object r1 = java.lang.reflect.Array.get(r3, r0)
            if (r1 == 0) goto L11
            r2.append(r1)
        L11:
            int r0 = r0 + 1
            goto L6
        L14:
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Object read(java.lang.String r4) {
            r3 = this;
            char[] r4 = r4.toCharArray()
            int r0 = r4.length
            java.lang.Class r1 = r3.entry
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r1 != r2) goto Lc
            return r4
        Lc:
            java.lang.Object r3 = r3.read(r4, r0)
            return r3
    }

    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.String write(java.lang.Object r4) {
            r3 = this;
            int r0 = java.lang.reflect.Array.getLength(r4)
            java.lang.Class r1 = r3.entry
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r1 != r2) goto L12
            char[] r4 = (char[]) r4
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            return r3
        L12:
            java.lang.String r3 = r3.write(r4, r0)
            return r3
    }
}
