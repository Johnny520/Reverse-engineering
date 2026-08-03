package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: dE */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1317dE implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C0489LF f4777a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f4778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1470gt f4779c;

    public ViewOnApplyWindowInsetsListenerC1317dE(View view, InterfaceC1470gt interfaceC1470gt) {
        this.f4778b = view;
        this.f4779c = interfaceC1470gt;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0489LF c0489lfM939h = C0489LF.m939h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC1470gt interfaceC1470gt = this.f4779c;
        if (i < 30) {
            AbstractC1360eE.m2629a(windowInsets, this.f4778b);
            if (c0489lfM939h.equals(this.f4777a)) {
                return interfaceC1470gt.onApplyWindowInsets(view, c0489lfM939h).m945g();
            }
        }
        this.f4777a = c0489lfM939h;
        C0489LF c0489lfOnApplyWindowInsets = interfaceC1470gt.onApplyWindowInsets(view, c0489lfM939h);
        if (i >= 30) {
            return c0489lfOnApplyWindowInsets.m945g();
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(view);
        return c0489lfOnApplyWindowInsets.m945g();
    }
}
