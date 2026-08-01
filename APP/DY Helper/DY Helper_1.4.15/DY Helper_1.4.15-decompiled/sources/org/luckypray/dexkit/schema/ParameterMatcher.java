package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParameterMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ParameterMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.ParameterMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParameterMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final void addAnnotations(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final void addParameterType(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m727(r0, r2)
                return
        }

        public final int createParameterMatcher(p000.b40 r2, int r3, int r4) {
                r1 = this;
                r2.getClass()
                r0 = 2
                r2.m737(r0)
                r1.addParameterType(r2, r4)
                r1.addAnnotations(r2, r3)
                int r1 = r1.endParameterMatcher(r2)
                return r1
        }

        public final int endParameterMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.ParameterMatcher getRootAsParameterMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-ParameterMatcher r0 = new org.luckypray.dexkit.schema.-ParameterMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-ParameterMatcher r1 = r1.getRootAsParameterMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.ParameterMatcher getRootAsParameterMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.ParameterMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-ParameterMatcher r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startParameterMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m737(r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-ParameterMatcher$Companion r0 = new org.luckypray.dexkit.schema.-ParameterMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.ParameterMatcher.Companion = r0
            return
    }

    public ParameterMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.ParameterMatcher __assign(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r2.getClass()
            r0.__init(r1, r2)
            return r0
    }

    public final void __init(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r2.getClass()
            r0.__reset(r1, r2)
            return
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher annotations(org.luckypray.dexkit.schema.AnnotationsMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1b
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.AnnotationsMatcher getAnnotations() {
            r1 = this;
            org.luckypray.dexkit.schema.-AnnotationsMatcher r0 = new org.luckypray.dexkit.schema.-AnnotationsMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-AnnotationsMatcher r1 = r1.annotations(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher getParameterType() {
            r1 = this;
            org.luckypray.dexkit.schema.-ClassMatcher r0 = new org.luckypray.dexkit.schema.-ClassMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-ClassMatcher r1 = r1.parameterType(r0)
            return r1
    }

    public final org.luckypray.dexkit.schema.ClassMatcher parameterType(org.luckypray.dexkit.schema.ClassMatcher r3) {
            r2 = this;
            r3.getClass()
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1b
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-ClassMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }
}
