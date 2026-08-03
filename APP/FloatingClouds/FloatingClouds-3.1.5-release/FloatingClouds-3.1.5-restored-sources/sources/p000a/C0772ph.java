package p000a;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: a.ph */
/* JADX INFO: loaded from: classes.dex */
public class C0772ph extends C0726n9 {

    /* JADX INFO: renamed from: b */
    public final Window f3045b;

    public C0772ph(Window window, C0674ke c0674ke) {
        this.f3045b = window;
    }

    /* JADX INFO: renamed from: C */
    public final void m1813C(int i) {
        View decorView = this.f3045b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
