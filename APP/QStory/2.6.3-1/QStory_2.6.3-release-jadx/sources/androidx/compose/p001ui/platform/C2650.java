package androidx.compose.p001ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2422;
import java.util.ArrayList;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2650 implements InterfaceC2649 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] f5638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f5639;

    public C2650(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f5639 = new int[size];
        this.f5638 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f5639[i] = ((Integer) arrayList.get(i)).intValue();
            this.f5638[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m4010(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.f5638;
        if (z) {
            m4010((View) parent, fArr);
            InterfaceC7387 interfaceC7387 = AbstractC2671.f5683;
            C2422.m3464(fArr2);
            C2422.m3462(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC2671.m4029(fArr, fArr2);
            float left = view.getLeft();
            float top2 = view.getTop();
            C2422.m3464(fArr2);
            C2422.m3462(fArr2, left, top2);
            AbstractC2671.m4029(fArr, fArr2);
        } else {
            int[] iArr = this.f5639;
            view.getLocationInWindow(iArr);
            InterfaceC7387 interfaceC73872 = AbstractC2671.f5683;
            C2422.m3464(fArr2);
            C2422.m3462(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC2671.m4029(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            C2422.m3464(fArr2);
            C2422.m3462(fArr2, f, f2);
            AbstractC2671.m4029(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC2416.m3449(matrix, fArr2);
        AbstractC2671.m4029(fArr, fArr2);
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo4009(View view, float[] fArr) {
        C2422.m3464(fArr);
        m4010(view, fArr);
    }

    public C2650(int i, int i2) {
        this.f5639 = new int[]{i, i2};
        this.f5638 = new float[]{0.0f, 1.0f};
    }

    public C2650(int i, int i2, int i3) {
        this.f5639 = new int[]{i, i2, i3};
        this.f5638 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C2650(float[] fArr) {
        this.f5638 = fArr;
        this.f5639 = new int[2];
    }
}
