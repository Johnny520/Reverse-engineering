package p006D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: D.F */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0069F implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C0122q0 f215a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0121q f217c;

    public ViewOnApplyWindowInsetsListenerC0069F(View view, InterfaceC0121q interfaceC0121q) {
        this.f216b = view;
        this.f217c = interfaceC0121q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0122q0 c0122q0M429d = C0122q0.m429d(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0121q interfaceC0121q = this.f217c;
        if (i2 < 30) {
            AbstractC0070G.m211a(windowInsets, this.f216b);
            if (c0122q0M429d.equals(this.f215a)) {
                return interfaceC0121q.mo8i(view, c0122q0M429d).m431c();
            }
        }
        this.f215a = c0122q0M429d;
        C0122q0 c0122q0Mo8i = interfaceC0121q.mo8i(view, c0122q0M429d);
        if (i2 >= 30) {
            return c0122q0Mo8i.m431c();
        }
        Field field = AbstractC0080Q.f219a;
        AbstractC0068E.m210c(view);
        return c0122q0Mo8i.m431c();
    }
}
