package p216p;

import android.content.Context;
import android.widget.EdgeEffect;
import p049I2.AbstractC0797o;

/* JADX INFO: renamed from: p.F */
/* JADX INFO: loaded from: classes.dex */
public final class C2813F extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f8860a;

    /* JADX INFO: renamed from: b */
    public float f8861b;

    public C2813F(Context context) {
        super(context);
        this.f8860a = AbstractC0797o.m1377a(context).f6729d * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i5) {
        this.f8861b = 0.0f;
        super.onAbsorb(i5);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f2, float f5) {
        this.f8861b = 0.0f;
        super.onPull(f2, f5);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f8861b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f2) {
        this.f8861b = 0.0f;
        super.onPull(f2);
    }
}
