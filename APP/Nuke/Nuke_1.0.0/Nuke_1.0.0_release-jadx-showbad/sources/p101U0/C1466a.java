package p101U0;

import android.text.SegmentFinder;
import p000A.C0038T0;

/* JADX INFO: renamed from: U0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1466a extends SegmentFinder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0038T0 f5144a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1466a(C0038T0 c0038t0) {
        this.f5144a = c0038t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int nextEndBoundary(int i5) {
        return this.f5144a.mo41j(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int nextStartBoundary(int i5) {
        return this.f5144a.mo46o(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int previousEndBoundary(int i5) {
        return this.f5144a.mo49r(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int previousStartBoundary(int i5) {
        return this.f5144a.mo40i(i5);
    }
}
