package androidx.compose.ui.layout;

import androidx.collection.C0246;
import androidx.compose.ui.node.C1755;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1681 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC1683[] f4930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0246 f4931;

    static {
        C0246 c0246 = new C0246(8);
        InterfaceC1683.f4942.getClass();
        C1680 c1680 = C1682.f4939;
        c0246.m790(1, c1680);
        C1680 c16802 = C1682.f4932;
        c0246.m790(2, c16802);
        C1680 c16803 = C1682.f4936;
        c0246.m790(4, c16803);
        C1680 c16804 = C1682.f4934;
        c0246.m790(8, c16804);
        C1680 c16805 = C1682.f4938;
        c0246.m790(16, c16805);
        C1680 c16806 = C1682.f4933;
        c0246.m790(32, c16806);
        C1680 c16807 = C1682.f4940;
        c0246.m790(64, c16807);
        C1680 c16808 = C1682.f4935;
        c0246.m790(128, c16808);
        f4931 = c0246;
        f4930 = new InterfaceC1683[]{c1680, c16802, c16803, c16807, c16805, c16806, c16804, C1682.f4941, c16808};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3119(InterfaceC1723 interfaceC1723, C1700 c1700, long j, int i, int i2) {
        if (AbstractC1670.m3109(j, -1L)) {
            return;
        }
        C1755 c1755 = (C1755) interfaceC1723;
        c1755.m3295(c1700.m3122(), (int) ((j >>> 48) & 65535));
        c1755.m3295(c1700.m3120(), (int) ((j >>> 32) & 65535));
        c1755.m3295(c1700.m3121(), i - ((int) ((j >>> 16) & 65535)));
        c1755.m3295(c1700.m3123(), i2 - ((int) (j & 65535)));
    }
}
