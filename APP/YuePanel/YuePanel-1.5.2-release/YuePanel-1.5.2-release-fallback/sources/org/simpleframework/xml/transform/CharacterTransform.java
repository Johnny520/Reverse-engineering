package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class CharacterTransform implements org.simpleframework.xml.transform.Transform<java.lang.Character> {
    public CharacterTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Character read(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            int r0 = r3.length()
            r1 = 1
            if (r0 != r1) goto L11
            r0 = 0
            char r3 = r3.charAt(r0)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            return r3
        L11:
            org.simpleframework.xml.transform.InvalidFormatException r0 = new org.simpleframework.xml.transform.InvalidFormatException
            java.lang.String r1 = "Cannot convert '%s' to a character"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Character read(java.lang.String r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Character r1 = r0.read(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.Character r1) throws java.lang.Exception {
            r0 = this;
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Character r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Character r1 = (java.lang.Character) r1
            java.lang.String r1 = r0.write2(r1)
            return r1
    }
}
