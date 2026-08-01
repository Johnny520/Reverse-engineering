package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ca0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public bd0 f858a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f859b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0945yw f860c;

    public ca0(View view, InterfaceC0945yw interfaceC0945yw) {
        this.f859b = view;
        this.f860c = interfaceC0945yw;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        bd0 bd0VarM515g = bd0.m515g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0945yw interfaceC0945yw = this.f860c;
        if (i < 30) {
            da0.m883a(windowInsets, this.f859b);
            if (bd0VarM515g.equals(this.f858a)) {
                return interfaceC0945yw.mo844e(view, bd0VarM515g).m520f();
            }
        }
        this.f858a = bd0VarM515g;
        bd0 bd0VarMo844e = interfaceC0945yw.mo844e(view, bd0VarM515g);
        if (i >= 30) {
            return bd0VarMo844e.m520f();
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        ba0.m506c(view);
        return bd0VarMo844e.m520f();
    }
}
