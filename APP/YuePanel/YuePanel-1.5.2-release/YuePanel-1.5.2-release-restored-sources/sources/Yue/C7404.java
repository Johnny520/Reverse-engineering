package Yue;

import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: renamed from: Yue.ۥۡۨۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7404 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m3606(@InterfaceC6399 Shader shader, @InterfaceC6399 InterfaceC5124<? super Matrix, C8107> interfaceC5124) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        interfaceC5124.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
