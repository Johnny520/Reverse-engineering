package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class ArrayMatcher implements org.simpleframework.xml.transform.Matcher {
    private final org.simpleframework.xml.transform.Matcher primary;

    public ArrayMatcher(org.simpleframework.xml.transform.Matcher r1) {
            r0 = this;
            r0.<init>()
            r0.primary = r1
            return
    }

    private org.simpleframework.xml.transform.Transform matchArray(java.lang.Class r2) {
            r1 = this;
            org.simpleframework.xml.transform.Matcher r1 = r1.primary
            org.simpleframework.xml.transform.Transform r1 = r1.match(r2)
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            org.simpleframework.xml.transform.ArrayTransform r0 = new org.simpleframework.xml.transform.ArrayTransform
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public org.simpleframework.xml.transform.Transform match(java.lang.Class r2) {
            r1 = this;
            java.lang.Class r2 = r2.getComponentType()
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r2 != r0) goto Le
            org.simpleframework.xml.transform.CharacterArrayTransform r1 = new org.simpleframework.xml.transform.CharacterArrayTransform
            r1.<init>(r2)
            return r1
        Le:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r2 != r0) goto L18
            org.simpleframework.xml.transform.CharacterArrayTransform r1 = new org.simpleframework.xml.transform.CharacterArrayTransform
            r1.<init>(r2)
            return r1
        L18:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L22
            org.simpleframework.xml.transform.StringArrayTransform r1 = new org.simpleframework.xml.transform.StringArrayTransform
            r1.<init>()
            return r1
        L22:
            org.simpleframework.xml.transform.Transform r1 = r1.matchArray(r2)
            return r1
    }
}
