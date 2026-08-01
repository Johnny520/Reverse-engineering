package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class OpCodesMatcher extends p000.p22 {
    public static final org.luckypray.dexkit.schema.OpCodesMatcher.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher$Companion */
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

        public final void addMatchType(p000.b40 r1, byte r2) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m722(r0, r2)
                return
        }

        public final void addOpCodeCount(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m727(r0, r2)
                return
        }

        public final void addOpCodes(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m727(r0, r2)
                return
        }

        public final int createOpCodesMatcher(p000.b40 r2, int r3, byte r4, int r5) {
                r1 = this;
                r2.getClass()
                r0 = 3
                r2.m737(r0)
                r1.addOpCodeCount(r2, r5)
                r1.addOpCodes(r2, r3)
                r1.addMatchType(r2, r4)
                int r1 = r1.endOpCodesMatcher(r2)
                return r1
        }

        public final int createOpCodesVector(p000.b40 r2, short[] r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                r1 = 2
                int r0 = r3.length
                r2.m738(r1, r0, r1)
                int r1 = r3.length
                int r1 = r1 + (-1)
            Le:
                r0 = -1
                if (r0 >= r1) goto L19
                short r0 = r3[r1]
                r2.m728(r0)
                int r1 = r1 + (-1)
                goto Le
            L19:
                int r1 = r2.m732()
                return r1
        }

        public final int endOpCodesMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.OpCodesMatcher getRootAsOpCodesMatcher(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-OpCodesMatcher r0 = new org.luckypray.dexkit.schema.-OpCodesMatcher
                r0.<init>()
                org.luckypray.dexkit.schema.-OpCodesMatcher r1 = r1.getRootAsOpCodesMatcher(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.OpCodesMatcher getRootAsOpCodesMatcher(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.OpCodesMatcher r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-OpCodesMatcher r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startOpCodesMatcher(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 3
                r1.m737(r0)
                return
        }

        public final void startOpCodesVector(p000.b40 r1, int r2) {
                r0 = this;
                r1.getClass()
                r0 = 2
                r1.m738(r0, r2, r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-OpCodesMatcher$Companion r0 = new org.luckypray.dexkit.schema.-OpCodesMatcher$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.OpCodesMatcher.Companion = r0
            return
    }

    public OpCodesMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.OpCodesMatcher __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final org.luckypray.dexkit.schema.IntRange getOpCodeCount() {
            r1 = this;
            org.luckypray.dexkit.schema.-IntRange r0 = new org.luckypray.dexkit.schema.-IntRange
            r0.<init>()
            org.luckypray.dexkit.schema.-IntRange r1 = r1.opCodeCount(r0)
            return r1
    }

    public final java.nio.ByteBuffer getOpCodesAsByteBuffer() {
            r2 = this;
            r0 = 4
            r1 = 2
            java.nio.ByteBuffer r2 = r2.__vector_as_bytebuffer(r0, r1)
            r2.getClass()
            return r2
    }

    public final int getOpCodesLength() {
            r1 = this;
            r0 = 4
            int r0 = r1.__offset(r0)
            if (r0 == 0) goto Lc
            int r1 = r1.__vector_len(r0)
            return r1
        Lc:
            r1 = 0
            return r1
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

    public final boolean mutateOpCodes(int r3, short r4) {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.__vector(r0)
            int r3 = r3 * 2
            int r3 = r3 + r2
            r1.putShort(r3, r4)
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.schema.IntRange opCodeCount(org.luckypray.dexkit.schema.IntRange r3) {
            r2 = this;
            r3.getClass()
            r0 = 8
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L1c
            int r1 = r2.bb_pos
            int r0 = r0 + r1
            int r0 = r2.__indirect(r0)
            java.nio.ByteBuffer r2 = r2.f8399bb
            r2.getClass()
            org.luckypray.dexkit.schema.-IntRange r2 = r3.__assign(r0, r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final short opCodes(int r3) {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L15
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.__vector(r0)
            int r3 = r3 * 2
            int r3 = r3 + r2
            short r2 = r1.getShort(r3)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public final java.nio.ByteBuffer opCodesInByteBuffer(java.nio.ByteBuffer r3) {
            r2 = this;
            r3.getClass()
            r0 = 4
            r1 = 2
            java.nio.ByteBuffer r2 = r2.__vector_in_bytebuffer(r3, r0, r1)
            r2.getClass()
            return r2
    }
}
