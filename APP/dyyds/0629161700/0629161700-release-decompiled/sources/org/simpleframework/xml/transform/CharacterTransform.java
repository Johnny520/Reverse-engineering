package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class CharacterTransform implements org.simpleframework.xml.transform.Transform<java.lang.Character> {
    public CharacterTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public java.lang.Character read(java.lang.String r2) {
            r1 = this;
            int r1 = r2.length()
            r0 = 1
            if (r1 != r0) goto L11
            r1 = 0
            char r1 = r2.charAt(r1)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
        L11:
            org.simpleframework.xml.transform.InvalidFormatException r1 = new org.simpleframework.xml.transform.InvalidFormatException
            java.lang.String r0 = "Cannot convert '%s' to a character"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.<init>(r0, r2)
            throw r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.Character read(java.lang.String r1) {
            r0 = this;
            java.lang.Character r0 = r0.read(r1)
            return r0
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.lang.Character r1) {
            r0 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.lang.Character r1) {
            r0 = this;
            java.lang.Character r1 = (java.lang.Character) r1
            java.lang.String r0 = r0.write2(r1)
            return r0
    }
}
