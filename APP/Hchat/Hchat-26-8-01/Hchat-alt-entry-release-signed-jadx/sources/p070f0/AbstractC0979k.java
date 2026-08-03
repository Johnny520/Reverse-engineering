package p070f0;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;

/* JADX INFO: renamed from: f0.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0979k {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.CharSequence), (r2v0 android.text.TextPaint) A[MD:(java.lang.CharSequence, android.text.TextPaint):void (c)] (LINE:3) call: android.text.GraphemeClusterSegmentFinder.<init>(java.lang.CharSequence, android.text.TextPaint):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ GraphemeClusterSegmentFinder m2418m(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.text.SegmentFinder) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ SegmentFinder m2419n(Object obj) {
        return (SegmentFinder) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m2422q() {
    }
}
