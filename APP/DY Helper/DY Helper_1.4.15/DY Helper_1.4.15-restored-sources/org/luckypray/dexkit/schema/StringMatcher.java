package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-StringMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.StringMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-StringMatcher$Companion */
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

        public final void addIgnoreCase(p000.b40 r1, boolean r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m720(r0, r2)
                return
        }

        public final void addMatchType(p000.b40 r1, byte r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m722(r0, r2)
                return
        }

        public final void addValue(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final int createStringMatcher(p000.b40 r2, int r3, byte r4, boolean r5) {
                r1 = this;
                r2.getClass()
                r0 = 3
                r2.m737(r0)
                r1.addValue(r2, r3)
                r1.addIgnoreCase(r2, r5)
                r1.addMatchType(r2, r4)
                int r1 = r1.endStringMatcher(r2)
                return r1
        }

        public final int endStringMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.StringMatcher getRootAsStringMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-StringMatcher r0 = new org.luckypray.dexkit.schema.-StringMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-StringMatcher r1 = r1.getRootAsStringMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.StringMatcher getRootAsStringMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.StringMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-StringMatcher r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startStringMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m737(r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-StringMatcher$Companion r0 = new org.luckypray.dexkit.schema.-StringMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.StringMatcher.Companion = r0
            return
    }

    public StringMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.StringMatcher __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final boolean getIgnoreCase() {
            r4 = this;
            r0 = 8
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L17
            byte r2 = (byte) r1
            java.nio.ByteBuffer r3 = r4.f8399bb
            int r4 = r4.bb_pos
            int r0 = r0 + r4
            byte r4 = r3.get(r0)
            if (r2 == r4) goto L17
            r4 = 1
            return r4
        L17:
            return r1
    }

    public final byte getMatchType() {
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

    public final java.lang.String getValue() {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto Lf
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            java.lang.String r2 = r2.__string(r0)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer getValueAsByteBuffer() {
            r2 = this;
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_as_bytebuffer(r0, r1)
            r2.getClass()
            return r2
    }

    public final boolean mutateIgnoreCase(boolean r3) {
            r2 = this;
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L13
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            byte r2 = (byte) r3
            r1.put(r0, r2)
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final boolean mutateMatchType(byte r3) {
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

    public final java.nio.ByteBuffer valueInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r3.getClass()
            r0 = 4
            r1 = 1
            java.nio.ByteBuffer r2 = r2.__vector_in_bytebuffer(r3, r0, r1)
            r2.getClass()
            return r2
    }
}
