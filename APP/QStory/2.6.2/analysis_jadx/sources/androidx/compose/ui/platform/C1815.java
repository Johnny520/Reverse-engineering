package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1587;
import java.util.ArrayList;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1815 implements InterfaceC1814 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] f5292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f5293;

    public C1815(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f5293 = new int[size];
        this.f5292 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f5293[i] = ((Integer) arrayList.get(i)).intValue();
            this.f5292[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m3440(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.f5292;
        if (z) {
            m3440((View) parent, fArr);
            InterfaceC6557 interfaceC6557 = AbstractC1836.f5337;
            C1587.m2894(fArr2);
            C1587.m2892(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC1836.m3459(fArr, fArr2);
            float left = view.getLeft();
            float top2 = view.getTop();
            C1587.m2894(fArr2);
            C1587.m2892(fArr2, left, top2);
            AbstractC1836.m3459(fArr, fArr2);
        } else {
            int[] iArr = this.f5293;
            view.getLocationInWindow(iArr);
            InterfaceC6557 interfaceC65572 = AbstractC1836.f5337;
            C1587.m2894(fArr2);
            C1587.m2892(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC1836.m3459(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            C1587.m2894(fArr2);
            C1587.m2892(fArr2, f, f2);
            AbstractC1836.m3459(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC1581.m2879(matrix, fArr2);
        AbstractC1836.m3459(fArr, fArr2);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1814
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo3439(View view, float[] fArr) {
        C1587.m2894(fArr);
        m3440(view, fArr);
    }

    public C1815(int i, int i2) {
        this.f5293 = new int[]{i, i2};
        this.f5292 = new float[]{0.0f, 1.0f};
    }

    public C1815(int i, int i2, int i3) {
        this.f5293 = new int[]{i, i2, i3};
        this.f5292 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C1815(float[] fArr) {
        this.f5292 = fArr;
        this.f5293 = new int[2];
    }
}
