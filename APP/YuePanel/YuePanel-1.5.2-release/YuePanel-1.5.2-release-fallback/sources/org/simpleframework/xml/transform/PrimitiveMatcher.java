package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
class PrimitiveMatcher implements org.simpleframework.xml.transform.Matcher {
    public PrimitiveMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public org.simpleframework.xml.transform.Transform match(java.lang.Class r2) throws java.lang.Exception {
            r1 = this;
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto La
            org.simpleframework.xml.transform.IntegerTransform r2 = new org.simpleframework.xml.transform.IntegerTransform
            r2.<init>()
            return r2
        La:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 != r0) goto L14
            org.simpleframework.xml.transform.BooleanTransform r2 = new org.simpleframework.xml.transform.BooleanTransform
            r2.<init>()
            return r2
        L14:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 != r0) goto L1e
            org.simpleframework.xml.transform.LongTransform r2 = new org.simpleframework.xml.transform.LongTransform
            r2.<init>()
            return r2
        L1e:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L28
            org.simpleframework.xml.transform.DoubleTransform r2 = new org.simpleframework.xml.transform.DoubleTransform
            r2.<init>()
            return r2
        L28:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L32
            org.simpleframework.xml.transform.FloatTransform r2 = new org.simpleframework.xml.transform.FloatTransform
            r2.<init>()
            return r2
        L32:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r2 != r0) goto L3c
            org.simpleframework.xml.transform.ShortTransform r2 = new org.simpleframework.xml.transform.ShortTransform
            r2.<init>()
            return r2
        L3c:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r2 != r0) goto L46
            org.simpleframework.xml.transform.ByteTransform r2 = new org.simpleframework.xml.transform.ByteTransform
            r2.<init>()
            return r2
        L46:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r2 != r0) goto L50
            org.simpleframework.xml.transform.CharacterTransform r2 = new org.simpleframework.xml.transform.CharacterTransform
            r2.<init>()
            return r2
        L50:
            r2 = 0
            return r2
    }
}
