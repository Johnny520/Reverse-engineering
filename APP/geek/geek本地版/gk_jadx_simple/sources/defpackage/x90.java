package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x90 implements View.OnApplyWindowInsetsListener {
    public wc0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ qw c;

    public x90(View r1, qw r2) {
        this.b = r1;
        this.c = r2;
        this.a = null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View r6, WindowInsets r7) {
        wc0 r0 = wc0.g(r6, r7);
        int r1 = Build.VERSION.SDK_INT;
        qw r2 = this.c;
        if (r1 >= 30) goto L8;
        y90.a(r7, this.b);
        if (r0.equals(this.a) == false) goto L8;
        return r2.d(r6, r0).f();
    L8:
        this.a = r0;
        wc0 r72 = r2.d(r6, r0);
        if (r1 >= 30) goto L11;
        WeakHashMap r02 = ja0.a;
        w90.c(r6);
        return r72.f();
    L11:
        return r72.f();
    }
}
