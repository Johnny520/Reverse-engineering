package p072;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p105.InterfaceC8010;
import p105.InterfaceC8013;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7412 implements InterfaceC7411 {
    public static final C7412 INSTANCE = new C7412();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC6016 f18302 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(27));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7412);
    }

    @Override // p072.InterfaceC7411
    public final String getValue() {
        return "stopSequence";
    }

    public final int hashCode() {
        return 811533554;
    }

    public final InterfaceC8013 serializer() {
        return (InterfaceC8013) f18302.getValue();
    }

    public final String toString() {
        return "StopSequence";
    }
}
