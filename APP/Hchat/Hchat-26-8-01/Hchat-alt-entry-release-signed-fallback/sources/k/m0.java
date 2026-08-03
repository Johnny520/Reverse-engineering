package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends android.widget.EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7015b;

    public m0(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            u2.e r2 = be.h.a(r2)
            r0 = 1
            float r0 = (float) r0
            float r2 = r2.f13341g
            float r2 = r2 * r0
            r1.f7014a = r2
            return
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int r2) {
            r1 = this;
            r0 = 0
            r1.f7015b = r0
            super.onAbsorb(r2)
            return
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float r2) {
            r1 = this;
            r0 = 0
            r1.f7015b = r0
            super.onPull(r2)
            return
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float r2, float r3) {
            r1 = this;
            r0 = 0
            r1.f7015b = r0
            super.onPull(r2, r3)
            return
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
            r1 = this;
            r0 = 0
            r1.f7015b = r0
            super.onRelease()
            return
    }
}
