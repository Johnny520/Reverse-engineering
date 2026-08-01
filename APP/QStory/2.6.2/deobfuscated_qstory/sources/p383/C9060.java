package p383;

import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p089.InterfaceC7180;
import p332.C8801;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9060 {
    public static final C9005 Companion = new C9005();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f25366 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C8801(12))};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f25367;

    public C9060(int i, List list) {
        if ((i & 1) == 0) {
            this.f25367 = EmptyList.INSTANCE;
        } else {
            this.f25367 = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9060) && AbstractC4394.m8917(this.f25367, ((C9060) obj).f25367);
    }

    public final int hashCode() {
        return this.f25367.hashCode();
    }

    public final String toString() {
        return "RichMsg(msgContent=" + this.f25367 + ')';
    }
}
