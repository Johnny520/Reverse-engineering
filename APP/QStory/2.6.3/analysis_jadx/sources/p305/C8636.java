package p305;

import p018.AbstractC6253;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8636 extends AbstractC6253 {
    @Override // p018.AbstractC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo11761(C8620 c8620, float f, float f2) {
        float f3 = f2 * f;
        c8620.m14302(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        C8634 c8634 = new C8634(0.0f, 0.0f, f4, f4);
        c8634.f24235 = 180.0f;
        c8634.f24240 = 90.0f;
        c8620.f24206.add(c8634);
        C8629 c8629 = new C8629(c8634);
        c8620.m14305(180.0f);
        c8620.f24212.add(c8629);
        c8620.f24208 = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        c8620.f24210 = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        c8620.f24209 = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
