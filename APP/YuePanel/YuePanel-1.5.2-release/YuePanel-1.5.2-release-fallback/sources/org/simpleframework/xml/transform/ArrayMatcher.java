package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class ArrayMatcher implements org.simpleframework.xml.transform.Matcher {
    private final org.simpleframework.xml.transform.Matcher primary;

    public ArrayMatcher(org.simpleframework.xml.transform.Matcher r1) {
            r0 = this;
            r0.<init>()
            r0.primary = r1
            return
    }

    private org.simpleframework.xml.transform.Transform matchArray(java.lang.Class r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.transform.Matcher r0 = r2.primary
            org.simpleframework.xml.transform.Transform r0 = r0.match(r3)
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            org.simpleframework.xml.transform.ArrayTransform r1 = new org.simpleframework.xml.transform.ArrayTransform
            r1.<init>(r0, r3)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public org.simpleframework.xml.transform.Transform match(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r2 = r2.getComponentType()
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r2 != r0) goto Le
            org.simpleframework.xml.transform.CharacterArrayTransform r0 = new org.simpleframework.xml.transform.CharacterArrayTransform
            r0.<init>(r2)
            return r0
        Le:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r2 != r0) goto L18
            org.simpleframework.xml.transform.CharacterArrayTransform r0 = new org.simpleframework.xml.transform.CharacterArrayTransform
            r0.<init>(r2)
            return r0
        L18:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L22
            org.simpleframework.xml.transform.StringArrayTransform r2 = new org.simpleframework.xml.transform.StringArrayTransform
            r2.<init>()
            return r2
        L22:
            org.simpleframework.xml.transform.Transform r2 = r1.matchArray(r2)
            return r2
    }
}
