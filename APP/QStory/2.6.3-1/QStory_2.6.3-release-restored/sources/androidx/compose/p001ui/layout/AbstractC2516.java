package androidx.compose.p001ui.layout;

import androidx.collection.C1093;
import androidx.compose.p001ui.node.C2590;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2516 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC2518[] f5275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1093 f5276;

    static {
        C1093 c1093 = new C1093(8);
        InterfaceC2518.f5287.getClass();
        C2515 c2515 = C2517.f5284;
        c1093.m1350(1, c2515);
        C2515 c25152 = C2517.f5277;
        c1093.m1350(2, c25152);
        C2515 c25153 = C2517.f5281;
        c1093.m1350(4, c25153);
        C2515 c25154 = C2517.f5279;
        c1093.m1350(8, c25154);
        C2515 c25155 = C2517.f5283;
        c1093.m1350(16, c25155);
        C2515 c25156 = C2517.f5278;
        c1093.m1350(32, c25156);
        C2515 c25157 = C2517.f5285;
        c1093.m1350(64, c25157);
        C2515 c25158 = C2517.f5280;
        c1093.m1350(128, c25158);
        f5276 = c1093;
        f5275 = new InterfaceC2518[]{c2515, c25152, c25153, c25157, c25155, c25156, c25154, C2517.f5286, c25158};
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3679(InterfaceC2558 interfaceC2558, C2535 c2535, long j, int i, int i2) {
        if (AbstractC2505.m3669(j, -1L)) {
            return;
        }
        C2590 c2590 = (C2590) interfaceC2558;
        c2590.m3855(c2535.m3682(), (int) ((j >>> 48) & 65535));
        c2590.m3855(c2535.m3680(), (int) ((j >>> 32) & 65535));
        c2590.m3855(c2535.m3681(), i - ((int) ((j >>> 16) & 65535)));
        c2590.m3855(c2535.m3683(), i2 - ((int) (j & 65535)));
    }
}
