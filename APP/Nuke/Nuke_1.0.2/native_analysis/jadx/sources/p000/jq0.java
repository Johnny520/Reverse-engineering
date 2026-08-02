package p000;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f5155a;

    /* JADX INFO: renamed from: b */
    public float f5156b;

    public jq0(Context context) {
        super(context);
        this.f5155a = AbstractC0691se.m4842m(context).f4467h * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f5156b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.f5156b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f5156b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.f5156b = 0.0f;
        super.onPull(f);
    }
}
