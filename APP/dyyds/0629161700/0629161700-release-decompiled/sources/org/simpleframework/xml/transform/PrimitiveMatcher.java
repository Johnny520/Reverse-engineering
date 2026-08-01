package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class PrimitiveMatcher implements org.simpleframework.xml.transform.Matcher {
    public PrimitiveMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public org.simpleframework.xml.transform.Transform match(java.lang.Class r1) {
            r0 = this;
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto La
            org.simpleframework.xml.transform.IntegerTransform r0 = new org.simpleframework.xml.transform.IntegerTransform
            r0.<init>()
            return r0
        La:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L14
            org.simpleframework.xml.transform.BooleanTransform r0 = new org.simpleframework.xml.transform.BooleanTransform
            r0.<init>()
            return r0
        L14:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L1e
            org.simpleframework.xml.transform.LongTransform r0 = new org.simpleframework.xml.transform.LongTransform
            r0.<init>()
            return r0
        L1e:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L28
            org.simpleframework.xml.transform.DoubleTransform r0 = new org.simpleframework.xml.transform.DoubleTransform
            r0.<init>()
            return r0
        L28:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L32
            org.simpleframework.xml.transform.FloatTransform r0 = new org.simpleframework.xml.transform.FloatTransform
            r0.<init>()
            return r0
        L32:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L3c
            org.simpleframework.xml.transform.ShortTransform r0 = new org.simpleframework.xml.transform.ShortTransform
            r0.<init>()
            return r0
        L3c:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L46
            org.simpleframework.xml.transform.ByteTransform r0 = new org.simpleframework.xml.transform.ByteTransform
            r0.<init>()
            return r0
        L46:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L50
            org.simpleframework.xml.transform.CharacterTransform r0 = new org.simpleframework.xml.transform.CharacterTransform
            r0.<init>()
            return r0
        L50:
            r0 = 0
            return r0
    }
}
