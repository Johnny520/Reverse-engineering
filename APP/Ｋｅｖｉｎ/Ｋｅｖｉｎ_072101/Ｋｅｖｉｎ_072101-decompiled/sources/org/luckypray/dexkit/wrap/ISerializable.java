package org.luckypray.dexkit.wrap;

/* JADX INFO: compiled from: ISerializable.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m115d2 = {"Lorg/luckypray/dexkit/wrap/ISerializable;", "", "serialize", "", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public interface ISerializable {
    public static final org.luckypray.dexkit.wrap.ISerializable.Companion Companion = null;

    /* JADX INFO: compiled from: ISerializable.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001b\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m115d2 = {"Lorg/luckypray/dexkit/wrap/ISerializable$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/ISerializable;", "descriptor", "", "deserializeAs", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.wrap.ISerializable deserialize(java.lang.String r9) {
                r8 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r1 = r9
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r5 = 6
                r6 = 0
                java.lang.String r2 = "->"
                r3 = 0
                r4 = 0
                int r0 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
                r1 = -1
                if (r0 != r1) goto L1e
                org.luckypray.dexkit.wrap.DexClass r1 = new org.luckypray.dexkit.wrap.DexClass
                r1.<init>(r9)
                org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1
                goto L3d
            L1e:
                r2 = r9
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r4 = r0 + 1
                r6 = 4
                r7 = 0
                java.lang.String r3 = ":"
                r5 = 0
                int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
                if (r2 != r1) goto L36
                org.luckypray.dexkit.wrap.DexMethod r1 = new org.luckypray.dexkit.wrap.DexMethod
                r1.<init>(r9)
                org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1
                goto L3d
            L36:
                org.luckypray.dexkit.wrap.DexField r1 = new org.luckypray.dexkit.wrap.DexField
                r1.<init>(r9)
                org.luckypray.dexkit.wrap.ISerializable r1 = (org.luckypray.dexkit.wrap.ISerializable) r1
            L3d:
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final <T> T deserializeAs(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.wrap.ISerializable r0 = r1.deserialize(r2)
                java.lang.Object r0 = (java.lang.Object) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: ISerializable.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class DefaultImpls {
        public static java.lang.String serialize(org.luckypray.dexkit.wrap.ISerializable r1) {
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion.$$INSTANCE
            org.luckypray.dexkit.wrap.ISerializable.Companion = r0
            return
    }

    @kotlin.jvm.JvmStatic
    static org.luckypray.dexkit.wrap.ISerializable deserialize(java.lang.String r1) {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion
            org.luckypray.dexkit.wrap.ISerializable r0 = r0.deserialize(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    static <T> T deserializeAs(java.lang.String r1) {
            org.luckypray.dexkit.wrap.ISerializable$Companion r0 = org.luckypray.dexkit.wrap.ISerializable.Companion
            java.lang.Object r0 = r0.deserializeAs(r1)
            return r0
    }

    java.lang.String serialize();
}
