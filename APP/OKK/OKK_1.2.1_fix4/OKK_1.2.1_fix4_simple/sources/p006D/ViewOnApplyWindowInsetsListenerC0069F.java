package p006D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: D.F */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0069F implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C0122q0 f215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0121q f217c;

    public ViewOnApplyWindowInsetsListenerC0069F(View r1, InterfaceC0121q r2) {
        this.f216b = r1;
        this.f217c = r2;
        this.f215a = null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View r6, WindowInsets r7) {
        C0122q0 r02 = C0122q0.m429d(r6, r7);
        int r1 = Build.VERSION.SDK_INT;
        InterfaceC0121q r2 = this.f217c;
        if (r1 >= 30) goto L8;
        AbstractC0070G.m211a(r7, this.f216b);
        if (r02.equals(this.f215a) == false) goto L8;
        return r2.mo8i(r6, r02).m431c();
    L8:
        this.f215a = r02;
        C0122q0 r72 = r2.mo8i(r6, r02);
        if (r1 >= 30) goto L11;
        Field r03 = AbstractC0080Q.f219a;
        AbstractC0068E.m210c(r6);
        return r72.m431c();
    L11:
        return r72.m431c();
    }
}
