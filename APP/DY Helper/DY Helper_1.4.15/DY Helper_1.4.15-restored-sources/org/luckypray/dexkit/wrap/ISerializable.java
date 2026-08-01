package org.luckypray.dexkit.wrap;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface ISerializable {
    public static final org.luckypray.dexkit.wrap.ISerializable.Companion Companion = null;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        static final /* synthetic */ org.luckypray.dexkit.wrap.ISerializable.Companion $$INSTANCE = null;

        static {
                org.luckypray.dexkit.wrap.ISerializable$Companion r0 = new org.luckypray.dexkit.wrap.ISerializable$Companion
                r0.<init>()
                org.luckypray.dexkit.wrap.ISerializable.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.wrap.ISerializable deserialize(java.lang.String r5) {
                r4 = this;
                r5.getClass()
                r4 = 6
                java.lang.String r0 = "->"
                r1 = 0
                int r4 = p000.q02.m4669(r5, r0, r1, r1, r4)
                r0 = -1
                if (r4 != r0) goto L14
                org.luckypray.dexkit.wrap.DexClass r4 = new org.luckypray.dexkit.wrap.DexClass
                r4.<init>(r5)
                return r4
            L14:
                int r4 = r4 + 1
                r2 = 4
                java.lang.String r3 = ":"
                int r4 = p000.q02.m4669(r5, r3, r4, r1, r2)
                if (r4 != r0) goto L25
                org.luckypray.dexkit.wrap.DexMethod r4 = new org.luckypray.dexkit.wrap.DexMethod
                r4.<init>(r5)
                return r4
            L25:
                org.luckypray.dexkit.wrap.DexField r4 = new org.luckypray.dexkit.wrap.DexField
                r4.<init>(r5)
                return r4
        }

        public final <T extends org.luckypray.dexkit.wrap.ISerializable> T deserializeAs(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.wrap.ISerializable r0 = r0.deserialize(r1)
                r0.getClass()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class DefaultImpls {
        public static java.lang.String serialize(org.luckypray.dexkit.wrap.ISerializable r0) {
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion.$$INSTANCE
            org.luckypray.dexkit.wrap.ISerializable.Companion = r0
            return
    }

    static org.luckypray.dexkit.wrap.ISerializable deserialize(java.lang.String r1) {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion
            org.luckypray.dexkit.wrap.ISerializable r1 = r0.deserialize(r1)
            return r1
    }

    static <T extends org.luckypray.dexkit.wrap.ISerializable> T deserializeAs(java.lang.String r1) {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion
            org.luckypray.dexkit.wrap.ISerializable r1 = r0.deserializeAs(r1)
            return r1
    }

    java.lang.String serialize();
}
