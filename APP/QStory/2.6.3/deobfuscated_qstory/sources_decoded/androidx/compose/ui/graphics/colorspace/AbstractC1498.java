package androidx.compose.ui.graphics.colorspace;

import androidx.collection.AbstractC0273;
import androidx.collection.C0246;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1498 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0246 f4268;

    static {
        C1495 c1495 = C1489.f4212;
        int i = c1495.f4235;
        C1488 c1488 = new C1488(c1495, c1495, 1);
        int i2 = c1495.f4235;
        C1499 c1499 = C1489.f4220;
        int i3 = (c1499.f4235 << 6) | i2;
        C1486 c1486 = new C1486(c1495, c1499, 0);
        int i4 = (i2 << 6) | c1499.f4235;
        C1486 c14862 = new C1486(c1499, c1495, 0);
        C0246 c0246 = AbstractC0273.f978;
        C0246 c02462 = new C0246();
        c02462.m790(i | (i << 6), c1488);
        c02462.m790(i3, c1486);
        c02462.m790(i4, c14862);
        f4268 = c02462;
    }
}
