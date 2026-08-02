package p000;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: f9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0195f9 {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ Class m1557A() {
        return DeleteGesture.class;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ Class m1558B() {
        return JoinOrSplitGesture.class;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ Class m1559C() {
        return InsertGesture.class;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Class m1560D() {
        return RemoveSpaceGesture.class;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ GraphemeClusterSegmentFinder m1566f(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ SegmentFinder m1567g(Object obj) {
        return (SegmentFinder) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ Class m1568h() {
        return SelectGesture.class;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m1569i() {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Gainmap m1581u(Bitmap bitmap) {
        return new Gainmap(bitmap);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ Class m1582v() {
        return SelectRangeGesture.class;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ Class m1585y() {
        return DeleteRangeGesture.class;
    }
}
