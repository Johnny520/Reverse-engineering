package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.datepicker.C0114c;
import java.util.Calendar;

/* JADX INFO: renamed from: pt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0609pt implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3947a;

    /* JADX INFO: renamed from: b */
    public final Object f3948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3949c;

    public /* synthetic */ ViewOnClickListenerC0609pt(C0794ut c0794ut, C0114c c0114c, int i) {
        this.f3947a = i;
        this.f3949c = c0794ut;
        this.f3948b = c0114c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3947a) {
            case Base64.DEFAULT /* 0 */:
                C0794ut c0794ut = (C0794ut) this.f3949c;
                int iM332I0 = ((LinearLayoutManager) c0794ut.f4766Y.getLayoutManager()).m332I0() - 1;
                if (iM332I0 >= 0) {
                    Calendar calendarM2426a = u80.m2426a(((C0114c) this.f3948b).f1124c.f909a.f5619a);
                    calendarM2426a.add(2, iM332I0);
                    c0794ut.m2469D(new C0981zv(calendarM2426a));
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                C0794ut c0794ut2 = (C0794ut) this.f3949c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0794ut2.f4766Y.getLayoutManager();
                View viewM335K0 = linearLayoutManager.m335K0(0, linearLayoutManager.m1980v(), false);
                int iM1953F = (viewM335K0 == null ? -1 : AbstractC0540nz.m1953F(viewM335K0)) + 1;
                if (iM1953F < c0794ut2.f4766Y.getAdapter().mo757a()) {
                    Calendar calendarM2426a2 = u80.m2426a(((C0114c) this.f3948b).f1124c.f909a.f5619a);
                    calendarM2426a2.add(2, iM1953F);
                    c0794ut2.m2469D(new C0981zv(calendarM2426a2));
                }
                break;
            default:
                k70 k70Var = (k70) this.f3949c;
                Window.Callback callback = k70Var.f2727k;
                if (callback != null && k70Var.f2728l) {
                    callback.onMenuItemSelected(0, (C0088c1) this.f3948b);
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC0609pt(k70 k70Var) {
        this.f3947a = 2;
        this.f3949c = k70Var;
        Context context = k70Var.f2717a.getContext();
        CharSequence charSequence = k70Var.f2724h;
        C0088c1 c0088c1 = new C0088c1();
        c0088c1.f867e = 4096;
        c0088c1.f869g = 4096;
        c0088c1.f874l = null;
        c0088c1.f875m = null;
        c0088c1.f876n = false;
        c0088c1.f877o = false;
        c0088c1.f878p = 16;
        c0088c1.f871i = context;
        c0088c1.f863a = charSequence;
        this.f3948b = c0088c1;
    }
}
