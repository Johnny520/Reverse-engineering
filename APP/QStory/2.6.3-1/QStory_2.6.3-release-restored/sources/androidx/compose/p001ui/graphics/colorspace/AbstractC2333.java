package androidx.compose.p001ui.graphics.colorspace;

import androidx.collection.AbstractC1120;
import androidx.collection.C1093;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1093 f4613;

    static {
        C2330 c2330 = C2324.f4557;
        int i = c2330.f4580;
        C2323 c2323 = new C2323(c2330, c2330, 1);
        int i2 = c2330.f4580;
        C2334 c2334 = C2324.f4565;
        int i3 = (c2334.f4580 << 6) | i2;
        C2321 c2321 = new C2321(c2330, c2334, 0);
        int i4 = (i2 << 6) | c2334.f4580;
        C2321 c23212 = new C2321(c2334, c2330, 0);
        C1093 c1093 = AbstractC1120.f1323;
        C1093 c10932 = new C1093();
        c10932.m1350(i | (i << 6), c2323);
        c10932.m1350(i3, c2321);
        c10932.m1350(i4, c23212);
        f4613 = c10932;
    }
}
