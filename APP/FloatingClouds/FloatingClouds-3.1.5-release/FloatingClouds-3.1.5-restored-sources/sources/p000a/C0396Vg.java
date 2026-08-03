package p000a;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: a.Vg */
/* JADX INFO: loaded from: classes.dex */
public class C0396Vg extends C0378Ug {

    /* JADX INFO: renamed from: g */
    public static boolean f1522g = true;

    /* JADX INFO: renamed from: a.Vg$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m1039a(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // p000a.C0342Sg
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: c */
    public void mo936c(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo936c(view, i);
        } else if (f1522g) {
            try {
                a.m1039a(view, i);
            } catch (NoSuchMethodError unused) {
                f1522g = false;
            }
        }
    }
}
