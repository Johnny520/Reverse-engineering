package p000a;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: renamed from: a.Ug */
/* JADX INFO: loaded from: classes.dex */
public class C0378Ug extends C0360Tg {

    /* JADX INFO: renamed from: f */
    public static boolean f1435f = true;

    /* JADX INFO: renamed from: a.Ug$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m1010a(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: f */
    public void mo1009f(View view, int i, int i2, int i3, int i4) {
        if (f1435f) {
            try {
                a.m1010a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f1435f = false;
            }
        }
    }
}
