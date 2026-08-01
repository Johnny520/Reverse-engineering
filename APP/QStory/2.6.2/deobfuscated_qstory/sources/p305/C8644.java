package p305;

import p033.AbstractC6325;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8644 extends AbstractC6325 {
    @Override // p033.AbstractC6325
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo11881(C8628 c8628, float f, float f2) {
        float f3 = f2 * f;
        c8628.m14283(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        C8642 c8642 = new C8642(0.0f, 0.0f, f4, f4);
        c8642.f24244 = 180.0f;
        c8642.f24249 = 90.0f;
        c8628.f24215.add(c8642);
        C8637 c8637 = new C8637(c8642);
        c8628.m14286(180.0f);
        c8628.f24221.add(c8637);
        c8628.f24217 = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        c8628.f24219 = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        c8628.f24218 = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
