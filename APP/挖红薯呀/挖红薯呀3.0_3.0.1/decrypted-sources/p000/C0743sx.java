package p000;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: sx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0743sx extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f5854a;

    /* JADX INFO: renamed from: b */
    public float f5855b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0743sx(Context context) {
        super(context);
        this.f5854a = pf1.m3046b(context).f195d * 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f5855b = 0.0f;
        super.onAbsorb(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.f5855b = 0.0f;
        super.onPull(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f5855b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.f5855b = 0.0f;
        super.onPull(f);
    }
}
