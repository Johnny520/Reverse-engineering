package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.text.input.InterfaceC2020;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6558 f5338 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // p052.InterfaceC6558
        public final InterfaceC2020 invoke(InterfaceC2020 interfaceC2020) {
            return interfaceC2020;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m3469(float[] fArr, float[] fArr2) {
        float fM3470 = m3470(fArr2, 0, fArr, 0);
        float fM34702 = m3470(fArr2, 0, fArr, 1);
        float fM34703 = m3470(fArr2, 0, fArr, 2);
        float fM34704 = m3470(fArr2, 0, fArr, 3);
        float fM34705 = m3470(fArr2, 1, fArr, 0);
        float fM34706 = m3470(fArr2, 1, fArr, 1);
        float fM34707 = m3470(fArr2, 1, fArr, 2);
        float fM34708 = m3470(fArr2, 1, fArr, 3);
        float fM34709 = m3470(fArr2, 2, fArr, 0);
        float fM347010 = m3470(fArr2, 2, fArr, 1);
        float fM347011 = m3470(fArr2, 2, fArr, 2);
        float fM347012 = m3470(fArr2, 2, fArr, 3);
        float fM347013 = m3470(fArr2, 3, fArr, 0);
        float fM347014 = m3470(fArr2, 3, fArr, 1);
        float fM347015 = m3470(fArr2, 3, fArr, 2);
        float fM347016 = m3470(fArr2, 3, fArr, 3);
        fArr[0] = fM3470;
        fArr[1] = fM34702;
        fArr[2] = fM34703;
        fArr[3] = fM34704;
        fArr[4] = fM34705;
        fArr[5] = fM34706;
        fArr[6] = fM34707;
        fArr[7] = fM34708;
        fArr[8] = fM34709;
        fArr[9] = fM347010;
        fArr[10] = fM347011;
        fArr[11] = fM347012;
        fArr[12] = fM347013;
        fArr[13] = fM347014;
        fArr[14] = fM347015;
        fArr[15] = fM347016;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float m3470(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m3471(View view, View view2) {
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
