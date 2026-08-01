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
    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m1424B(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m1425C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m1426D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ GraphemeClusterSegmentFinder m1433g(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ SegmentFinder m1434h(Object obj) {
        return (SegmentFinder) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ DeleteGesture m1435i(Object obj) {
        return (DeleteGesture) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m1436j(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ HandwritingGesture m1437k(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m1438l(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m1439m(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m1440n(Object obj) {
        return (SelectRangeGesture) obj;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1443q() {
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m1446t(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m1452z(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }
}
