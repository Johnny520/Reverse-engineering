package p144k;

import android.content.Context;
import android.widget.EdgeEffect;
import be.AbstractC0283h;

/* JADX INFO: renamed from: k.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2190m0 extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f7268a;

    /* JADX INFO: renamed from: b */
    public float f7269b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2190m0(Context context) {
        super(context);
        this.f7268a = AbstractC0283h.m1147a(context).f13906g * 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i9) {
        this.f7269b = 0.0f;
        super.onAbsorb(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onPull(float f3, float f10) {
        this.f7269b = 0.0f;
        super.onPull(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f7269b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3) {
        this.f7269b = 0.0f;
        super.onPull(f3);
    }
}
