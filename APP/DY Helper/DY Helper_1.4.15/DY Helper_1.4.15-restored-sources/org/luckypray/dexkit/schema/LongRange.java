package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-LongRange, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class LongRange extends p000.p22 {
    public static final org.luckypray.dexkit.schema.LongRange.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-LongRange$Companion */
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

        public final void addMax(p000.b40 r3, long r4) {
                r2 = this;
                r3.getClass()
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L10
                r3.m725(r4)
                r2 = 1
                r3.m736(r2)
            L10:
                return
        }

        public final void addMin(p000.b40 r3, long r4) {
                r2 = this;
                r3.getClass()
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto L10
                r3.m725(r4)
                r2 = 0
                r3.m736(r2)
            L10:
                return
        }

        public final int createLongRange(p000.b40 r2, long r3, long r5) {
                r1 = this;
                r2.getClass()
                r0 = 2
                r2.m737(r0)
                r1.addMax(r2, r5)
                r1.addMin(r2, r3)
                int r1 = r1.endLongRange(r2)
                return r1
        }

        public final int endLongRange(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.LongRange getRootAsLongRange(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-LongRange r0 = new org.luckypray.dexkit.schema.-LongRange
                r0.<init>()
                org.luckypray.dexkit.schema.-LongRange r1 = r1.getRootAsLongRange(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.LongRange getRootAsLongRange(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.LongRange r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-LongRange r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startLongRange(p000.b40 r1) {
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
            org.luckypray.dexkit.schema.-LongRange$Companion r0 = new org.luckypray.dexkit.schema.-LongRange$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.LongRange.Companion = r0
            return
    }

    public LongRange() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.LongRange __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final long getMax() {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            long r0 = r1.getLong(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final long getMin() {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            long r0 = r1.getLong(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean mutateMax(long r3) {
            r2 = this;
            r0 = 6
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.putLong(r0, r3)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final boolean mutateMin(long r3) {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.putLong(r0, r3)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }
}
