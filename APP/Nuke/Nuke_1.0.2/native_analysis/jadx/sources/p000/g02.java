package p000;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class g02 implements e02 {

    /* JADX INFO: renamed from: a */
    public final Magnifier f3222a;

    public g02(Magnifier magnifier) {
        this.f3222a = magnifier;
    }

    @Override // p000.e02
    /* JADX INFO: renamed from: a */
    public void mo1213a(long j, long j2) {
        this.f3222a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: b */
    public final void m1775b() {
        this.f3222a.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public final long m1776c() {
        return (((long) this.f3222a.getWidth()) << 32) | (((long) this.f3222a.getHeight()) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public final void m1777d() {
        this.f3222a.update();
    }
}
