package Yue;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(29)
public class C8383 extends C8382 {
    @Override // Yue.C8374
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo27938(@InterfaceC6391 View view) {
        return view.getTransitionAlpha();
    }

    @Override // Yue.C8378, Yue.C8374
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo27940(@InterfaceC6391 View view, @InterfaceC6490 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // Yue.C8380, Yue.C8374
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo27941(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // Yue.C8374
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo27942(@InterfaceC6391 View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // Yue.C8382, Yue.C8374
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo27943(@InterfaceC6391 View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // Yue.C8378, Yue.C8374
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo27944(@InterfaceC6391 View view, @InterfaceC6391 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // Yue.C8378, Yue.C8374
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo27945(@InterfaceC6391 View view, @InterfaceC6391 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
