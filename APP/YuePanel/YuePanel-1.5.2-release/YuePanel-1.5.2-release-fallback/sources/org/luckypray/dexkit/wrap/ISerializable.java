package org.luckypray.dexkit.wrap;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lorg/luckypray/dexkit/wrap/ISerializable;", "", "serialize", "", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ISerializable {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.wrap.ISerializable.Companion Companion = null;

    @Yue.InterfaceC4201(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/wrap/ISerializable$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/ISerializable;", "descriptor", "", "deserializeAs", "T", "(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.wrap.ISerializable deserialize(@Yue.InterfaceC4418 java.lang.String r9) {
                r8 = this;
                java.lang.String r0 = "descriptor"
                Yue.C3329.m13906(r9, r0)
                r5 = 6
                r6 = 0
                java.lang.String r2 = "->"
                r3 = 0
                r4 = 0
                r1 = r9
                int r0 = Yue.C5989.m22364(r1, r2, r3, r4, r5, r6)
                r1 = -1
                if (r0 != r1) goto L19
                org.luckypray.dexkit.wrap.DexClass r0 = new org.luckypray.dexkit.wrap.DexClass
                r0.<init>(r9)
                goto L32
            L19:
                int r4 = r0 + 1
                r6 = 4
                r7 = 0
                java.lang.String r3 = ":"
                r5 = 0
                r2 = r9
                int r0 = Yue.C5989.m22364(r2, r3, r4, r5, r6, r7)
                if (r0 != r1) goto L2d
                org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
                r0.<init>(r9)
                goto L32
            L2d:
                org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
                r0.<init>(r9)
            L32:
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        public final <T extends org.luckypray.dexkit.wrap.ISerializable> T deserializeAs(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.wrap.ISerializable r2 = r1.deserialize(r2)
                java.lang.String r0 = "null cannot be cast to non-null type T of org.luckypray.dexkit.wrap.ISerializable.Companion.deserializeAs"
                Yue.C3329.m13904(r2, r0)
                return r2
        }
    }

    @Yue.InterfaceC4201(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Yue.InterfaceC4418
        public static java.lang.String serialize(@Yue.InterfaceC4418 org.luckypray.dexkit.wrap.ISerializable r0) {
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion.$$INSTANCE
            org.luckypray.dexkit.wrap.ISerializable.Companion = r0
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    static org.luckypray.dexkit.wrap.ISerializable deserialize(@Yue.InterfaceC4418 java.lang.String r1) {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion
            org.luckypray.dexkit.wrap.ISerializable r1 = r0.deserialize(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    static <T extends org.luckypray.dexkit.wrap.ISerializable> T deserializeAs(@Yue.InterfaceC4418 java.lang.String r1) {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion
            org.luckypray.dexkit.wrap.ISerializable r1 = r0.deserializeAs(r1)
            return r1
    }

    @Yue.InterfaceC4418
    java.lang.String serialize();
}
