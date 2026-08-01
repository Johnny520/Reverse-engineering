package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.datepicker.C0114c;
import java.util.Calendar;

/* JADX INFO: renamed from: tt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0756tt implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4576a;

    /* JADX INFO: renamed from: b */
    public final Object f4577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4578c;

    public /* synthetic */ ViewOnClickListenerC0756tt(C0942yt c0942yt, C0114c c0114c, int i) {
        this.f4576a = i;
        this.f4578c = c0942yt;
        this.f4577b = c0114c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4576a) {
            case Base64.DEFAULT /* 0 */:
                C0942yt c0942yt = (C0942yt) this.f4578c;
                int iM317I0 = ((LinearLayoutManager) c0942yt.f5498Y.getLayoutManager()).m317I0() - 1;
                if (iM317I0 >= 0) {
                    Calendar calendarM2819a = z80.m2819a(((C0114c) this.f4577b).f1049c.f3099a.f2060a);
                    calendarM2819a.add(2, iM317I0);
                    c0942yt.m2780D(new C0276gw(calendarM2819a));
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                C0942yt c0942yt2 = (C0942yt) this.f4578c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0942yt2.f5498Y.getLayoutManager();
                View viewM320K0 = linearLayoutManager.m320K0(0, linearLayoutManager.m2528v(), false);
                int iM2501F = (viewM320K0 == null ? -1 : AbstractC0799uz.m2501F(viewM320K0)) + 1;
                if (iM2501F < c0942yt2.f5498Y.getAdapter().mo715a()) {
                    Calendar calendarM2819a2 = z80.m2819a(((C0114c) this.f4577b).f1049c.f3099a.f2060a);
                    calendarM2819a2.add(2, iM2501F);
                    c0942yt2.m2780D(new C0276gw(calendarM2819a2));
                }
                break;
            default:
                q70 q70Var = (q70) this.f4578c;
                Window.Callback callback = q70Var.f3859k;
                if (callback != null && q70Var.f3860l) {
                    callback.onMenuItemSelected(0, (C0088c1) this.f4577b);
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC0756tt(q70 q70Var) {
        this.f4576a = 2;
        this.f4578c = q70Var;
        Context context = q70Var.f3849a.getContext();
        CharSequence charSequence = q70Var.f3856h;
        C0088c1 c0088c1 = new C0088c1();
        c0088c1.f798e = 4096;
        c0088c1.f800g = 4096;
        c0088c1.f805l = null;
        c0088c1.f806m = null;
        c0088c1.f807n = false;
        c0088c1.f808o = false;
        c0088c1.f809p = 16;
        c0088c1.f802i = context;
        c0088c1.f794a = charSequence;
        this.f4577b = c0088c1;
    }
}
