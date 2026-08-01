package androidx.compose.ui.layout;

import androidx.collection.C0246;
import androidx.compose.ui.node.C1755;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1681 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC1683[] f4929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0246 f4930;

    static {
        C0246 c0246 = new C0246(8);
        InterfaceC1683.f4941.getClass();
        C1680 c1680 = C1682.f4938;
        c0246.m789(1, c1680);
        C1680 c16802 = C1682.f4931;
        c0246.m789(2, c16802);
        C1680 c16803 = C1682.f4935;
        c0246.m789(4, c16803);
        C1680 c16804 = C1682.f4933;
        c0246.m789(8, c16804);
        C1680 c16805 = C1682.f4937;
        c0246.m789(16, c16805);
        C1680 c16806 = C1682.f4932;
        c0246.m789(32, c16806);
        C1680 c16807 = C1682.f4939;
        c0246.m789(64, c16807);
        C1680 c16808 = C1682.f4934;
        c0246.m789(128, c16808);
        f4930 = c0246;
        f4929 = new InterfaceC1683[]{c1680, c16802, c16803, c16807, c16805, c16806, c16804, C1682.f4940, c16808};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3109(InterfaceC1723 interfaceC1723, C1700 c1700, long j, int i, int i2) {
        if (AbstractC1670.m3099(j, -1L)) {
            return;
        }
        C1755 c1755 = (C1755) interfaceC1723;
        c1755.m3285(c1700.m3112(), (int) ((j >>> 48) & 65535));
        c1755.m3285(c1700.m3110(), (int) ((j >>> 32) & 65535));
        c1755.m3285(c1700.m3111(), i - ((int) ((j >>> 16) & 65535)));
        c1755.m3285(c1700.m3113(), i2 - ((int) (j & 65535)));
    }
}
