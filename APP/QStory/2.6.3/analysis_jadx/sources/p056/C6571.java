package p056;

import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6571 {
    public static final C6572 Companion = new C6572();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f17941 = {null, AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(28)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f17943;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7152 f17944;

    public C6571(int i, String str, List list, C7152 c7152) {
        this.f17944 = (i & 1) == 0 ? AbstractC6602.f17976 : c7152;
        this.f17943 = (i & 2) == 0 ? null : list;
        if ((i & 4) == 0) {
            this.f17942 = "object";
        } else {
            this.f17942 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6571)) {
            return false;
        }
        C6571 c6571 = (C6571) obj;
        return AbstractC4395.m8907(this.f17944, c6571.f17944) && AbstractC4395.m8907(this.f17943, c6571.f17943);
    }

    public final int hashCode() {
        int iHashCode = this.f17944.f19116.hashCode() * 31;
        List list = this.f17943;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Input(properties=" + this.f17944 + ", required=" + this.f17943 + ')';
    }
}
