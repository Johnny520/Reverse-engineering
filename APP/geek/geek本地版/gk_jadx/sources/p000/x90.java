package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x90 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public wc0 f5141a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f5142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0649qw f5143c;

    public x90(View view, InterfaceC0649qw interfaceC0649qw) {
        this.f5142b = view;
        this.f5143c = interfaceC0649qw;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        wc0 wc0VarM2563g = wc0.m2563g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0649qw interfaceC0649qw = this.f5143c;
        if (i < 30) {
            y90.m2655a(windowInsets, this.f5142b);
            if (wc0VarM2563g.equals(this.f5141a)) {
                return interfaceC0649qw.mo474d(view, wc0VarM2563g).m2568f();
            }
        }
        this.f5141a = wc0VarM2563g;
        wc0 wc0VarMo474d = interfaceC0649qw.mo474d(view, wc0VarM2563g);
        if (i >= 30) {
            return wc0VarMo474d.m2568f();
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        w90.m2552c(view);
        return wc0VarMo474d.m2568f();
    }
}
