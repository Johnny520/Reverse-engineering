package androidx.compose.p001ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p001ui.graphics.AbstractC2416;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2755 implements InterfaceC2649 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Matrix f6015 = new Matrix();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int[] f6014 = new int[2];

    @Override // androidx.compose.p001ui.platform.InterfaceC2649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo4009(View view, float[] fArr) {
        Matrix matrix = this.f6015;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f6014;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        AbstractC2416.m3449(matrix, fArr);
    }
}
