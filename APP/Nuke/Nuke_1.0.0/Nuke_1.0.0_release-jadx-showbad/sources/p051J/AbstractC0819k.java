package p051J;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: J.k */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0819k {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 java.lang.Object) (LINE:1) android.view.inputmethod.DeleteGesture */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m1424B(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 java.lang.Object) (LINE:1) android.view.inputmethod.SelectRangeGesture */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m1425C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 java.lang.Object) (LINE:1) android.view.inputmethod.DeleteRangeGesture */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m1426D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.CharSequence), (r2v0 android.text.TextPaint) A[MD:(java.lang.CharSequence, android.text.TextPaint):void (c)] (LINE:3) call: android.text.GraphemeClusterSegmentFinder.<init>(java.lang.CharSequence, android.text.TextPaint):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ GraphemeClusterSegmentFinder m1433g(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.text.SegmentFinder) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ SegmentFinder m1434h(Object obj) {
        return (SegmentFinder) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.inputmethod.DeleteGesture) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ DeleteGesture m1435i(Object obj) {
        return (DeleteGesture) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.inputmethod.DeleteRangeGesture) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m1436j(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.inputmethod.HandwritingGesture) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ HandwritingGesture m1437k(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.inputmethod.JoinOrSplitGesture) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m1438l(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.inputmethod.RemoveSpaceGesture) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m1439m(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.inputmethod.SelectRangeGesture) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m1440n(Object obj) {
        return (SelectRangeGesture) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1443q() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 java.lang.Object) (LINE:1) android.view.inputmethod.RemoveSpaceGesture */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m1446t(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 java.lang.Object) (LINE:1) android.view.inputmethod.JoinOrSplitGesture */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m1452z(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }
}
