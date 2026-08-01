package p321;

import p034.AbstractC7082;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9465 extends AbstractC7082 {
    @Override // p034.AbstractC7082
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo12320(C9449 c9449, float f, float f2) {
        float f3 = f2 * f;
        c9449.m14861(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        C9463 c9463 = new C9463(0.0f, 0.0f, f4, f4);
        c9463.f24580 = 180.0f;
        c9463.f24585 = 90.0f;
        c9449.f24551.add(c9463);
        C9458 c9458 = new C9458(c9463);
        c9449.m14864(180.0f);
        c9449.f24557.add(c9458);
        c9449.f24553 = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        c9449.f24555 = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        c9449.f24554 = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
