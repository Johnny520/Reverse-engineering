package p056;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p089.InterfaceC7181;
import p089.InterfaceC7184;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6583 implements InterfaceC6582 {
    public static final C6583 INSTANCE = new C6583();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5184 f17957 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(27));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6583);
    }

    @Override // p056.InterfaceC6582
    public final String getValue() {
        return "stopSequence";
    }

    public final int hashCode() {
        return 811533554;
    }

    public final InterfaceC7184 serializer() {
        return (InterfaceC7184) f17957.getValue();
    }

    public final String toString() {
        return "StopSequence";
    }
}
