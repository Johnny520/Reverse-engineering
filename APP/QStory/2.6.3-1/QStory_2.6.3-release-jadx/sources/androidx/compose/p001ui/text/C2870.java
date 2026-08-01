package androidx.compose.p001ui.text;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2870 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2881 f6350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2881 f6351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2881 f6352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2881 f6353;

    public C2870(C2881 c2881, C2881 c28812, C2881 c28813, C2881 c28814) {
        this.f6353 = c2881;
        this.f6352 = c28812;
        this.f6351 = c28813;
        this.f6350 = c28814;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2870)) {
            return false;
        }
        C2870 c2870 = (C2870) obj;
        return AbstractC5227.m9466(this.f6353, c2870.f6353) && AbstractC5227.m9466(this.f6352, c2870.f6352) && AbstractC5227.m9466(this.f6351, c2870.f6351) && AbstractC5227.m9466(this.f6350, c2870.f6350);
    }

    public final int hashCode() {
        C2881 c2881 = this.f6353;
        int iHashCode = (c2881 != null ? c2881.hashCode() : 0) * 31;
        C2881 c28812 = this.f6352;
        int iHashCode2 = (iHashCode + (c28812 != null ? c28812.hashCode() : 0)) * 31;
        C2881 c28813 = this.f6351;
        int iHashCode3 = (iHashCode2 + (c28813 != null ? c28813.hashCode() : 0)) * 31;
        C2881 c28814 = this.f6350;
        return iHashCode3 + (c28814 != null ? c28814.hashCode() : 0);
    }
}
