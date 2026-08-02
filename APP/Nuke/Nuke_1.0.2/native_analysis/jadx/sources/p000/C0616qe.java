package p000;

import android.text.SegmentFinder;

/* JADX INFO: renamed from: qe */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0616qe extends SegmentFinder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dq1 f8926a;

    public C0616qe(dq1 dq1Var) {
        this.f8926a = dq1Var;
    }

    public final int nextEndBoundary(int i) {
        return this.f8926a.mo1103c(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f8926a.mo1105k(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f8926a.mo1106l(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f8926a.mo1102b(i);
    }
}
