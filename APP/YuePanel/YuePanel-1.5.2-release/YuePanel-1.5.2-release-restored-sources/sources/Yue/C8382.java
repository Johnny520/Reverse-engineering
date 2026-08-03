package Yue;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(23)
public class C8382 extends C8380 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean f24985 = true;

    /* JADX INFO: renamed from: Yue.ۥۢۥ$ۥ */
    @InterfaceC7113(29)
    public static class C1513 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4366(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // Yue.C8374
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo27943(@InterfaceC6391 View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo27943(view, i);
        } else if (f24985) {
            try {
                C1513.m4366(view, i);
            } catch (NoSuchMethodError unused) {
                f24985 = false;
            }
        }
    }
}
