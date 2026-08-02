package p000;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class mp0 {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m3157A(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m3159C(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m3160D(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ HandwritingGesture m3170j(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ InsertGesture m3171k(Object obj) {
        return (InsertGesture) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m3172l(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m3173m(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ SelectGesture m3174n(Object obj) {
        return (SelectGesture) obj;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m3178r(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ HandwritingGesture m3182v(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m3184x(Object obj) {
        return obj instanceof InsertGesture;
    }
}
