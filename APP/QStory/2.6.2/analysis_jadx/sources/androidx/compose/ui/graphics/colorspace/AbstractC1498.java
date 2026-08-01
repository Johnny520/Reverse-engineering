package androidx.compose.ui.graphics.colorspace;

import androidx.collection.AbstractC0273;
import androidx.collection.C0246;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1498 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0246 f4267;

    static {
        C1495 c1495 = C1489.f4211;
        int i = c1495.f4234;
        C1488 c1488 = new C1488(c1495, c1495, 1);
        int i2 = c1495.f4234;
        C1499 c1499 = C1489.f4219;
        int i3 = (c1499.f4234 << 6) | i2;
        C1486 c1486 = new C1486(c1495, c1499, 0);
        int i4 = (i2 << 6) | c1499.f4234;
        C1486 c14862 = new C1486(c1499, c1495, 0);
        C0246 c0246 = AbstractC0273.f978;
        C0246 c02462 = new C0246();
        c02462.m789(i | (i << 6), c1488);
        c02462.m789(i3, c1486);
        c02462.m789(i4, c14862);
        f4267 = c02462;
    }
}
