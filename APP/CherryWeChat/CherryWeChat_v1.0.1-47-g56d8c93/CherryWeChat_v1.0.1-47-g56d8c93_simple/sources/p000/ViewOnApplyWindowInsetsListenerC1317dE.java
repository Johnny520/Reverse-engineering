package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: dE */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1317dE implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C0489LF f4777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f4778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1470gt f4779c;

    public ViewOnApplyWindowInsetsListenerC1317dE(View r1, InterfaceC1470gt r2) {
        this.f4778b = r1;
        this.f4779c = r2;
        this.f4777a = null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View r6, WindowInsets r7) {
        C0489LF r0 = C0489LF.m939h(r6, r7);
        int r1 = Build.VERSION.SDK_INT;
        InterfaceC1470gt r2 = this.f4779c;
        if (r1 >= 30) goto L8;
        AbstractC1360eE.m2629a(r7, this.f4778b);
        if (r0.equals(this.f4777a) == false) goto L8;
        return r2.onApplyWindowInsets(r6, r0).m945g();
    L8:
        this.f4777a = r0;
        C0489LF r72 = r2.onApplyWindowInsets(r6, r0);
        if (r1 >= 30) goto L11;
        WeakHashMap r02 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r6);
        return r72.m945g();
    L11:
        return r72.m945g();
    }
}
