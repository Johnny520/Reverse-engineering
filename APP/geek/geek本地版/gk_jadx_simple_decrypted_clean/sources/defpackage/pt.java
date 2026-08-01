package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class pt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pt(ut r1, c r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        switch(this.a) {
            case 0: goto L18;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        k70 r42 = (k70) this.c;
        Window.Callback r0 = r42.k;
        if (r0 != null) goto L7;
        return;
    L7:
        if (r42.l == false) goto L23;
        r0.onMenuItemSelected(0, (c1) this.b);
        return;
    L23:
        return;
    L10:
        ut r43 = (ut) this.c;
        LinearLayoutManager r02 = (LinearLayoutManager) r43.Y.getLayoutManager();
        View r03 = r02.K0(0, r02.v(), false);
        if (r03 != null) goto L13;
        int r04 = -1;
    L14:
        int r05 = r04 + 1;
        if (r05 >= r43.Y.getAdapter().a()) goto L24;
        Calendar r1 = u80.a(((c) this.b).c.a.a);
        r1.add(2, r05);
        r43.D(new zv(r1));
        return;
    L24:
        return;
    L13:
        r04 = nz.F(r03);
        goto L14
    L18:
        ut r44 = (ut) this.c;
        int r06 = ((LinearLayoutManager) r44.Y.getLayoutManager()).I0() - 1;
        if (r06 < 0) goto L25;
        Calendar r12 = u80.a(((c) this.b).c.a.a);
        r12.add(2, r06);
        r44.D(new zv(r12));
        return;
    }

    public pt(k70 r4) {
        this.a = 2;
        this.c = r4;
        Context r1 = r4.a.getContext();
        CharSequence r42 = r4.h;
        c1 r0 = new c1();
        r0.e = 4096;
        r0.g = 4096;
        r0.l = null;
        r0.m = null;
        r0.n = false;
        r0.o = false;
        r0.p = 16;
        r0.i = r1;
        r0.a = r42;
        this.b = r0;
    }
}
