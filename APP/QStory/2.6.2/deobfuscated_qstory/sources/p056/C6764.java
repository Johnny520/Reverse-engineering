package p056;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p089.InterfaceC7180;
import p089.InterfaceC7183;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰哲苏世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6764 implements InterfaceC6581 {
    public static final C6764 INSTANCE = new C6764();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5183 f18208 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(26));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6764);
    }

    @Override // p056.InterfaceC6581
    public final String getValue() {
        return "maxTokens";
    }

    public final int hashCode() {
        return 613133167;
    }

    public final InterfaceC7183 serializer() {
        return (InterfaceC7183) f18208.getValue();
    }

    public final String toString() {
        return "MaxTokens";
    }
}
