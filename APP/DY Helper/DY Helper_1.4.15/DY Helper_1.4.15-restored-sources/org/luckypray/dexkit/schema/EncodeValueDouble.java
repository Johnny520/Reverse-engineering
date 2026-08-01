package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueDouble, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueDouble extends p000.p22 {
    public static final org.luckypray.dexkit.schema.EncodeValueDouble.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueDouble$Companion */
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

        public final void addValue(p000.b40 r4, double r5) {
                r3 = this;
                r4.getClass()
                r0 = 0
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r3 == 0) goto L1c
                r3 = 8
                r0 = 0
                r4.m735(r3, r0)
                java.nio.ByteBuffer r1 = r4.f1452
                int r2 = r4.f1453
                int r2 = r2 - r3
                r4.f1453 = r2
                r1.putDouble(r2, r5)
                r4.m736(r0)
            L1c:
                return
        }

        public final int createEncodeValueDouble(p000.b40 r2, double r3) {
                r1 = this;
                r2.getClass()
                r0 = 1
                r2.m737(r0)
                r1.addValue(r2, r3)
                int r1 = r1.endEncodeValueDouble(r2)
                return r1
        }

        public final int endEncodeValueDouble(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.EncodeValueDouble getRootAsEncodeValueDouble(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueDouble r0 = new org.luckypray.dexkit.schema.-EncodeValueDouble
                r0.<init>()
                org.luckypray.dexkit.schema.-EncodeValueDouble r1 = r1.getRootAsEncodeValueDouble(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.EncodeValueDouble getRootAsEncodeValueDouble(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.EncodeValueDouble r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-EncodeValueDouble r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startEncodeValueDouble(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                r0 = 1
                r1.m737(r0)
                return
        }

        public final void validateVersion() {
                r0 = this;
                return
        }
    }

    static {
            org.luckypray.dexkit.schema.-EncodeValueDouble$Companion r0 = new org.luckypray.dexkit.schema.-EncodeValueDouble$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.EncodeValueDouble.Companion = r0
            return
    }

    public EncodeValueDouble() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.EncodeValueDouble __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final double getValue() {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            double r0 = r1.getDouble(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean mutateValue(double r3) {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            r1.putDouble(r0, r3)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }
}
