package p056;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p089.InterfaceC7180;
import p089.InterfaceC7183;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6582 implements InterfaceC6581 {
    public static final C6582 INSTANCE = new C6582();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5183 f17962 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(27));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6582);
    }

    @Override // p056.InterfaceC6581
    public final String getValue() {
        return "stopSequence";
    }

    public final int hashCode() {
        return 811533554;
    }

    public final InterfaceC7183 serializer() {
        return (InterfaceC7183) f17962.getValue();
    }

    public final String toString() {
        return "StopSequence";
    }
}
