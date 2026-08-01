package p028F;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: renamed from: F.t */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0359t {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ Class m568A() {
        return DeleteGesture.class;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ Class m569B() {
        return JoinOrSplitGesture.class;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ Class m570C() {
        return InsertGesture.class;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Class m571D() {
        return RemoveSpaceGesture.class;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ InsertGesture m583l(Object obj) {
        return (InsertGesture) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ SelectGesture m584m(Object obj) {
        return (SelectGesture) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ Class m585n() {
        return SelectGesture.class;
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m590s(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ Class m594w() {
        return SelectRangeGesture.class;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m595x(Object obj) {
        return obj instanceof InsertGesture;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ Class m597z() {
        return DeleteRangeGesture.class;
    }
}
