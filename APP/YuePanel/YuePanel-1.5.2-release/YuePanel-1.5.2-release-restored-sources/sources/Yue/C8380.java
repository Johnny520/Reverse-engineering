package Yue;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۤۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(22)
public class C8380 extends C8378 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean f24984 = true;

    /* JADX INFO: renamed from: Yue.ۥۢۤۨۧ$ۥ */
    @InterfaceC7113(29)
    public static class C1512 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4364(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }

    @Override // Yue.C8374
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo27941(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        if (f24984) {
            try {
                C1512.m4364(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f24984 = false;
            }
        }
    }
}
