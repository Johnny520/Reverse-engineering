package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-UsingFieldMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.UsingFieldMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-UsingFieldMatcher$Companion */
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

        public final void addField(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final void addUsingType(p000.b40 r1, byte r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m722(r0, r2)
                return
        }

        public final int createUsingFieldMatcher(p000.b40 r2, int r3, byte r4) {
                r1 = this;
                r2.getClass()
                r0 = 2
                r2.m737(r0)
                r1.addField(r2, r3)
                r1.addUsingType(r2, r4)
                int r1 = r1.endUsingFieldMatcher(r2)
                return r1
        }

        public final int endUsingFieldMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.UsingFieldMatcher getRootAsUsingFieldMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-UsingFieldMatcher r0 = new org.luckypray.dexkit.schema.-UsingFieldMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-UsingFieldMatcher r1 = r1.getRootAsUsingFieldMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.UsingFieldMatcher getRootAsUsingFieldMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.UsingFieldMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-UsingFieldMatcher r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startUsingFieldMatcher(p000.b40 r1) {
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
            org.luckypray.dexkit.schema.-UsingFieldMatcher$Companion r0 = new org.luckypray.dexkit.schema.-UsingFieldMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.UsingFieldMatcher.Companion = r0
            return
    }

    public UsingFieldMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.UsingFieldMatcher __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final org.luckypray.dexkit.schema.FieldMatcher field(org.luckypray.dexkit.schema.FieldMatcher r3) {
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
            org.luckypray.dexkit.schema.-FieldMatcher r2 = r3.__assign(r0, r2)
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.FieldMatcher getField() {
            r1 = this;
            org.luckypray.dexkit.schema.-FieldMatcher r0 = new org.luckypray.dexkit.schema.-FieldMatcher
            r0.<init>()
            org.luckypray.dexkit.schema.-FieldMatcher r1 = r1.field(r0)
            return r1
    }

    public final byte getUsingType() {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            byte r2 = r1.get(r0)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final boolean mutateUsingType(byte r3) {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.put(r0, r3)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }
}
