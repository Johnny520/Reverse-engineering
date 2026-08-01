package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1587;
import java.util.ArrayList;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1815 implements InterfaceC1814 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] f5293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f5294;

    public C1815(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f5294 = new int[size];
        this.f5293 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f5294[i] = ((Integer) arrayList.get(i)).intValue();
            this.f5293[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m3450(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.f5293;
        if (z) {
            m3450((View) parent, fArr);
            InterfaceC6558 interfaceC6558 = AbstractC1836.f5338;
            C1587.m2904(fArr2);
            C1587.m2902(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC1836.m3469(fArr, fArr2);
            float left = view.getLeft();
            float top2 = view.getTop();
            C1587.m2904(fArr2);
            C1587.m2902(fArr2, left, top2);
            AbstractC1836.m3469(fArr, fArr2);
        } else {
            int[] iArr = this.f5294;
            view.getLocationInWindow(iArr);
            InterfaceC6558 interfaceC65582 = AbstractC1836.f5338;
            C1587.m2904(fArr2);
            C1587.m2902(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC1836.m3469(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            C1587.m2904(fArr2);
            C1587.m2902(fArr2, f, f2);
            AbstractC1836.m3469(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC1581.m2889(matrix, fArr2);
        AbstractC1836.m3469(fArr, fArr2);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1814
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo3449(View view, float[] fArr) {
        C1587.m2904(fArr);
        m3450(view, fArr);
    }

    public C1815(int i, int i2) {
        this.f5294 = new int[]{i, i2};
        this.f5293 = new float[]{0.0f, 1.0f};
    }

    public C1815(int i, int i2, int i3) {
        this.f5294 = new int[]{i, i2, i3};
        this.f5293 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C1815(float[] fArr) {
        this.f5293 = fArr;
        this.f5294 = new int[2];
    }
}
