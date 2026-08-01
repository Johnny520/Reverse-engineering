package org.luckypray.dexkit.schema;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueBoolean, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueBoolean extends p000.p22 {
    public static final org.luckypray.dexkit.schema.EncodeValueBoolean.Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion */
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

        public final void addValue(p000.b40 r1, boolean r2) {
                r0 = this;
                r1.getClass()
                r0 = 0
                r1.m720(r0, r2)
                return
        }

        public final int createEncodeValueBoolean(p000.b40 r2, boolean r3) {
                r1 = this;
                r2.getClass()
                r0 = 1
                r2.m737(r0)
                r1.addValue(r2, r3)
                int r1 = r1.endEncodeValueBoolean(r2)
                return r1
        }

        public final int endEncodeValueBoolean(p000.b40 r1) {
                r0 = this;
                r1.getClass()
                int r0 = r1.m731()
                return r0
        }

        public final org.luckypray.dexkit.schema.EncodeValueBoolean getRootAsEncodeValueBoolean(java.nio.ByteBuffer r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.schema.-EncodeValueBoolean r0 = new org.luckypray.dexkit.schema.-EncodeValueBoolean
                r0.<init>()
                org.luckypray.dexkit.schema.-EncodeValueBoolean r1 = r1.getRootAsEncodeValueBoolean(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.schema.EncodeValueBoolean getRootAsEncodeValueBoolean(java.nio.ByteBuffer r2, org.luckypray.dexkit.schema.EncodeValueBoolean r3) {
                r1 = this;
                r2.getClass()
                r3.getClass()
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                int r1 = p000.AbstractC0602nx.m4122(r2, r1)
                int r0 = r2.position()
                int r0 = r0 + r1
                org.luckypray.dexkit.schema.-EncodeValueBoolean r1 = r3.__assign(r0, r2)
                return r1
        }

        public final void startEncodeValueBoolean(p000.b40 r1) {
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
            org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion r0 = new org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.schema.EncodeValueBoolean.Companion = r0
            return
    }

    public EncodeValueBoolean() {
            r0 = this;
            r0.<init>()
            return
    }

    public final org.luckypray.dexkit.schema.EncodeValueBoolean __assign(int r1, java.nio.ByteBuffer r2) {
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

    public final boolean getValue() {
            r4 = this;
            r0 = 4
            int r0 = r4.__offset(r0)
            r1 = 0
            if (r0 == 0) goto L16
            byte r2 = (byte) r1
            java.nio.ByteBuffer r3 = r4.f8399bb
            int r4 = r4.bb_pos
            int r0 = r0 + r4
            byte r4 = r3.get(r0)
            if (r2 == r4) goto L16
            r4 = 1
            return r4
        L16:
            return r1
    }

    public final boolean mutateValue(boolean r3) {
            r2 = this;
            r0 = 4
            int r0 = r2.__offset(r0)
            if (r0 == 0) goto L12
            java.nio.ByteBuffer r1 = r2.f8399bb
            int r2 = r2.bb_pos
            int r0 = r0 + r2
            byte r2 = (byte) r3
            r1.put(r0, r2)
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }
}
