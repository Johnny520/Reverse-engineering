package org.luckypray.dexkit.wrap;

import Yue.C4750;
import Yue.C5499;
import Yue.C7628;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m2699d2 = {"Lorg/luckypray/dexkit/wrap/ISerializable;", "", "serialize", "", "Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public interface ISerializable {

    @InterfaceC6399
    public static final Companion Companion = Companion.$$INSTANCE;

    @InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/wrap/ISerializable$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/ISerializable;", "descriptor", "", "deserializeAs", C4750.f10502, "(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @InterfaceC6399
        @InterfaceC5578
        public final ISerializable deserialize(@InterfaceC6399 String str) {
            C5499.m17103(str, "descriptor");
            int iM24057 = C7628.m24057(str, "->", 0, false, 6, null);
            return iM24057 == -1 ? new DexClass(str) : C7628.m24057(str, ":", iM24057 + 1, false, 4, null) == -1 ? new DexMethod(str) : new DexField(str);
        }

        @InterfaceC6399
        @InterfaceC5578
        public final <T extends ISerializable> T deserializeAs(@InterfaceC6399 String str) {
            C5499.m17103(str, "descriptor");
            T t = (T) deserialize(str);
            C5499.m17101(t, "null cannot be cast to non-null type T of org.luckypray.dexkit.wrap.ISerializable.Companion.deserializeAs");
            return t;
        }
    }

    @InterfaceC6211(m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class DefaultImpls {
        @InterfaceC6399
        public static String serialize(@InterfaceC6399 ISerializable iSerializable) {
            return iSerializable.toString();
        }
    }

    @InterfaceC6399
    @InterfaceC5578
    static ISerializable deserialize(@InterfaceC6399 String str) {
        return Companion.deserialize(str);
    }

    @InterfaceC6399
    @InterfaceC5578
    static <T extends ISerializable> T deserializeAs(@InterfaceC6399 String str) {
        return (T) Companion.deserializeAs(str);
    }

    @InterfaceC6399
    String serialize();
}
