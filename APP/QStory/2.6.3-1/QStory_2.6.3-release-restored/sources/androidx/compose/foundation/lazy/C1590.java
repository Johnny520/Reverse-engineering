package androidx.compose.foundation.lazy;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.lazy.layout.C1553;
import androidx.compose.p001ui.C2949;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.AbstractC2560;
import androidx.compose.p001ui.unit.LayoutDirection;
import io.ktor.util.C5043;
import java.util.List;
import p068.InterfaceC7387;
import p192.AbstractC8570;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1590 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f2502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f2503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LayoutDirection f2504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2949 f2505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f2506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f2508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f2509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f2510 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int[] f2511;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f2512;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f2513;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f2514;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int f2515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1553 f2516;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f2517;

    public C1590(int i, List list, C2949 c2949, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, C1553 c1553, long j2) {
        this.f2507 = i;
        this.f2506 = list;
        this.f2505 = c2949;
        this.f2504 = layoutDirection;
        this.f2503 = i4;
        this.f2502 = j;
        this.f2513 = obj;
        this.f2512 = obj2;
        this.f2516 = c1553;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC2559 abstractC2559 = (AbstractC2559) list.get(i6);
            i5 += abstractC2559.f5342;
            iMax = Math.max(iMax, abstractC2559.f5344);
        }
        this.f2514 = i5;
        int i7 = i5 + this.f2503;
        this.f2515 = i7 >= 0 ? i7 : 0;
        this.f2509 = iMax;
        this.f2511 = new int[this.f2506.size() * 2];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2121(int i, int i2, int i3) {
        this.f2517 = i;
        this.f2510 = i3;
        List list = this.f2506;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2559 abstractC2559 = (AbstractC2559) list.get(i4);
            int i5 = i4 * 2;
            C2949 c2949 = this.f2505;
            if (c2949 == null) {
                AbstractC8570.m13655("null horizontalAlignment when isVertical == true");
                C5043.m9161();
                return;
            }
            int iM4418 = c2949.m4418(abstractC2559.f5344, i2, this.f2504);
            int[] iArr = this.f2511;
            iArr[i5] = iM4418;
            iArr[i5 + 1] = i;
            i += abstractC2559.f5342;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2122(AbstractC2543 abstractC2543) {
        if (this.f2510 == Integer.MIN_VALUE) {
            AbstractC8570.m13656("position() should be called first");
        }
        List list = this.f2506;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC2559 abstractC2559 = (AbstractC2559) list.get(i);
            int i2 = abstractC2559.f5342;
            long jM2123 = m2123(i);
            AbstractC0900.m697(this.f2516.f2357.m1317(this.f2513));
            long jM13921 = C8737.m13921(jM2123, this.f2502);
            InterfaceC7387 interfaceC7387 = AbstractC2560.f5346;
            abstractC2543.getClass();
            AbstractC2543.m3689(abstractC2543, abstractC2559);
            abstractC2559.mo3688(C8737.m13921(jM13921, abstractC2559.f5340), 0.0f, interfaceC7387);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m2123(int i) {
        if (i == 0 && this.f2506.size() == 0) {
            return ((long) this.f2517) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.f2511;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }
}
