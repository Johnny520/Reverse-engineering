package p189n;

import android.content.Context;
import android.widget.EdgeEffect;
import p121i3.AbstractC3170a;
import p121i3.C3179i;

/* JADX INFO: renamed from: n.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5194b1 extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f15839a;

    /* JADX INFO: renamed from: b */
    public float f15840b;

    public C5194b1(Context context) {
        super(context);
        this.f15839a = AbstractC3170a.m11960a(context).mo1233i1(C3179i.m12003k(1));
    }

    /* JADX INFO: renamed from: a */
    public final void m21290a(float f10) {
        float f11 = this.f15840b + f10;
        this.f15840b = f11;
        if (Math.abs(f11) > this.f15839a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.f15840b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.f15840b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f15840b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.f15840b = 0.0f;
        super.onPull(f10);
    }
}
