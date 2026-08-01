package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.graphics.C1599;
import java.util.ArrayList;
import p007.AbstractC6136;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1544 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f4493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f4497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f4498;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f4499;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f4500;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f4501;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f4502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C1545 f4503;

    public C1544(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? C1599.f4696 : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.f4498 = str;
        this.f4497 = f;
        this.f4496 = f2;
        this.f4495 = f3;
        this.f4494 = f4;
        this.f4493 = j2;
        this.f4500 = i3;
        this.f4499 = z2;
        ArrayList arrayList = new ArrayList();
        this.f4502 = arrayList;
        C1545 c1545 = new C1545(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f4503 = c1545;
        arrayList.add(c1545);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m2812(C1544 c1544, ArrayList arrayList, int i, C1571 c1571, float f, int i2, float f2) {
        if (c1544.f4501) {
            AbstractC7935.m13395("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C1545) AbstractC6136.m11555(1, c1544.f4502)).f4513.add(new C1530("", arrayList, i, c1571, 1.0f, null, 1.0f, f, 0, i2, f2, 0.0f, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1543 m2813() {
        if (this.f4501) {
            AbstractC7935.m13395("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f4502;
            if (arrayList.size() <= 1) {
                C1545 c1545 = this.f4503;
                C1543 c1543 = new C1543(this.f4498, this.f4497, this.f4496, this.f4495, this.f4494, new C1540(c1545.f4509, c1545.f4508, c1545.f4507, c1545.f4506, c1545.f4505, c1545.f4504, c1545.f4511, c1545.f4510, c1545.f4512, c1545.f4513), this.f4493, this.f4500, this.f4499);
                this.f4501 = true;
                return c1543;
            }
            if (this.f4501) {
                AbstractC7935.m13395("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C1545 c15452 = (C1545) arrayList.remove(arrayList.size() - 1);
            ((C1545) AbstractC6136.m11555(1, arrayList)).f4513.add(new C1540(c15452.f4509, c15452.f4508, c15452.f4507, c15452.f4506, c15452.f4505, c15452.f4504, c15452.f4511, c15452.f4510, c15452.f4512, c15452.f4513));
        }
    }
}
