package p072;

import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7400 {
    public static final C7401 Companion = new C7401();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC6016[] f18286 = {null, AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(28)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f18288;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7981 f18289;

    public C7400(int i, String str, List list, C7981 c7981) {
        this.f18289 = (i & 1) == 0 ? AbstractC7431.f18321 : c7981;
        this.f18288 = (i & 2) == 0 ? null : list;
        if ((i & 4) == 0) {
            this.f18287 = "object";
        } else {
            this.f18287 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7400)) {
            return false;
        }
        C7400 c7400 = (C7400) obj;
        return AbstractC5227.m9466(this.f18289, c7400.f18289) && AbstractC5227.m9466(this.f18288, c7400.f18288);
    }

    public final int hashCode() {
        int iHashCode = this.f18289.f19461.hashCode() * 31;
        List list = this.f18288;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Input(properties=" + this.f18289 + ", required=" + this.f18288 + ')';
    }
}
