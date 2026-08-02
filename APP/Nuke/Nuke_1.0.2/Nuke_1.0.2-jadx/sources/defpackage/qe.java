package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qe extends SegmentFinder {
    public final /* synthetic */ dq1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qe(dq1 dq1Var) {
        this.a = dq1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int nextEndBoundary(int i) {
        return this.a.c(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int nextStartBoundary(int i) {
        return this.a.k(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int previousEndBoundary(int i) {
        return this.a.l(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int previousStartBoundary(int i) {
        return this.a.b(i);
    }
}
