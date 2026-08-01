package androidx.compose.p001ui.graphics.vector;

import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.C2434;
import java.util.ArrayList;
import p025.AbstractC7012;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2379 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f4839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4841;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4842;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4844;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f4845;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f4846;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f4847;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f4848;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C2380 f4849;

    public C2379(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? C2434.f5042 : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.f4844 = str;
        this.f4843 = f;
        this.f4842 = f2;
        this.f4841 = f3;
        this.f4840 = f4;
        this.f4839 = j2;
        this.f4846 = i3;
        this.f4845 = z2;
        ArrayList arrayList = new ArrayList();
        this.f4848 = arrayList;
        C2380 c2380 = new C2380(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f4849 = c2380;
        arrayList.add(c2380);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m3382(C2379 c2379, ArrayList arrayList, int i, C2406 c2406, float f, int i2, float f2) {
        if (c2379.f4847) {
            AbstractC8765.m13982("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C2380) AbstractC7012.m12145(1, c2379.f4848)).f4859.add(new C2365("", arrayList, i, c2406, 1.0f, null, 1.0f, f, 0, i2, f2, 0.0f, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2378 m3383() {
        if (this.f4847) {
            AbstractC8765.m13982("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f4848;
            if (arrayList.size() <= 1) {
                C2380 c2380 = this.f4849;
                C2378 c2378 = new C2378(this.f4844, this.f4843, this.f4842, this.f4841, this.f4840, new C2375(c2380.f4855, c2380.f4854, c2380.f4853, c2380.f4852, c2380.f4851, c2380.f4850, c2380.f4857, c2380.f4856, c2380.f4858, c2380.f4859), this.f4839, this.f4846, this.f4845);
                this.f4847 = true;
                return c2378;
            }
            if (this.f4847) {
                AbstractC8765.m13982("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C2380 c23802 = (C2380) arrayList.remove(arrayList.size() - 1);
            ((C2380) AbstractC7012.m12145(1, arrayList)).f4859.add(new C2375(c23802.f4855, c23802.f4854, c23802.f4853, c23802.f4852, c23802.f4851, c23802.f4850, c23802.f4857, c23802.f4856, c23802.f4858, c23802.f4859));
        }
    }
}
