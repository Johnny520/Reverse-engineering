package p000a;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: a.Wg */
/* JADX INFO: loaded from: classes.dex */
public final class C0414Wg extends C0396Vg {
    @Override // p000a.C0342Sg
    /* JADX INFO: renamed from: a */
    public final float mo934a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p000a.C0342Sg
    /* JADX INFO: renamed from: b */
    public final void mo935b(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000a.C0396Vg, p000a.C0342Sg
    /* JADX INFO: renamed from: c */
    public final void mo936c(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000a.C0360Tg
    /* JADX INFO: renamed from: d */
    public final void mo973d(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000a.C0360Tg
    /* JADX INFO: renamed from: e */
    public final void mo974e(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p000a.C0378Ug
    /* JADX INFO: renamed from: f */
    public final void mo1009f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
