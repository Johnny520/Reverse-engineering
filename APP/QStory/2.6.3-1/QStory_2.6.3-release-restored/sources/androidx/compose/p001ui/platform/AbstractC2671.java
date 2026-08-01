package androidx.compose.p001ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p001ui.text.input.InterfaceC2854;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2671 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7387 f5683 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // p068.InterfaceC7387
        public final InterfaceC2854 invoke(InterfaceC2854 interfaceC2854) {
            return interfaceC2854;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m4029(float[] fArr, float[] fArr2) {
        float fM4030 = m4030(fArr2, 0, fArr, 0);
        float fM40302 = m4030(fArr2, 0, fArr, 1);
        float fM40303 = m4030(fArr2, 0, fArr, 2);
        float fM40304 = m4030(fArr2, 0, fArr, 3);
        float fM40305 = m4030(fArr2, 1, fArr, 0);
        float fM40306 = m4030(fArr2, 1, fArr, 1);
        float fM40307 = m4030(fArr2, 1, fArr, 2);
        float fM40308 = m4030(fArr2, 1, fArr, 3);
        float fM40309 = m4030(fArr2, 2, fArr, 0);
        float fM403010 = m4030(fArr2, 2, fArr, 1);
        float fM403011 = m4030(fArr2, 2, fArr, 2);
        float fM403012 = m4030(fArr2, 2, fArr, 3);
        float fM403013 = m4030(fArr2, 3, fArr, 0);
        float fM403014 = m4030(fArr2, 3, fArr, 1);
        float fM403015 = m4030(fArr2, 3, fArr, 2);
        float fM403016 = m4030(fArr2, 3, fArr, 3);
        fArr[0] = fM4030;
        fArr[1] = fM40302;
        fArr[2] = fM40303;
        fArr[3] = fM40304;
        fArr[4] = fM40305;
        fArr[5] = fM40306;
        fArr[6] = fM40307;
        fArr[7] = fM40308;
        fArr[8] = fM40309;
        fArr[9] = fM403010;
        fArr[10] = fM403011;
        fArr[11] = fM403012;
        fArr[12] = fM403013;
        fArr[13] = fM403014;
        fArr[14] = fM403015;
        fArr[15] = fM403016;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float m4030(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m4031(View view, View view2) {
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
