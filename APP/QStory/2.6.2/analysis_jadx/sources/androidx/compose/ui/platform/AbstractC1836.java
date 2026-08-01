package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.text.input.InterfaceC2020;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6557 f5337 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // p052.InterfaceC6557
        public final InterfaceC2020 invoke(InterfaceC2020 interfaceC2020) {
            return interfaceC2020;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3459(float[] fArr, float[] fArr2) {
        float fM3460 = m3460(fArr2, 0, fArr, 0);
        float fM34602 = m3460(fArr2, 0, fArr, 1);
        float fM34603 = m3460(fArr2, 0, fArr, 2);
        float fM34604 = m3460(fArr2, 0, fArr, 3);
        float fM34605 = m3460(fArr2, 1, fArr, 0);
        float fM34606 = m3460(fArr2, 1, fArr, 1);
        float fM34607 = m3460(fArr2, 1, fArr, 2);
        float fM34608 = m3460(fArr2, 1, fArr, 3);
        float fM34609 = m3460(fArr2, 2, fArr, 0);
        float fM346010 = m3460(fArr2, 2, fArr, 1);
        float fM346011 = m3460(fArr2, 2, fArr, 2);
        float fM346012 = m3460(fArr2, 2, fArr, 3);
        float fM346013 = m3460(fArr2, 3, fArr, 0);
        float fM346014 = m3460(fArr2, 3, fArr, 1);
        float fM346015 = m3460(fArr2, 3, fArr, 2);
        float fM346016 = m3460(fArr2, 3, fArr, 3);
        fArr[0] = fM3460;
        fArr[1] = fM34602;
        fArr[2] = fM34603;
        fArr[3] = fM34604;
        fArr[4] = fM34605;
        fArr[5] = fM34606;
        fArr[6] = fM34607;
        fArr[7] = fM34608;
        fArr[8] = fM34609;
        fArr[9] = fM346010;
        fArr[10] = fM346011;
        fArr[11] = fM346012;
        fArr[12] = fM346013;
        fArr[13] = fM346014;
        fArr[14] = fM346015;
        fArr[15] = fM346016;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float m3460(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3461(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }
}
