package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class dr implements dv, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public ku c;
    public ExpandedMenuView d;
    public cv e;
    public cr f;

    public dr(ContextWrapper r1) {
        this.a = r1;
        this.b = LayoutInflater.from(r1);
    }

    @Override // defpackage.dv
    public final void a(ku r2, boolean r3) {
        cv r0 = this.e;
        if (r0 == null) goto L6;
        r0.a(r2, r3);
        return;
    }

    @Override // defpackage.dv
    public final boolean c() {
        return false;
    }

    @Override // defpackage.dv
    public final boolean d(ou r1) {
        return false;
    }

    @Override // defpackage.dv
    public final void e(cv r1) {
        throw null;
    }

    @Override // defpackage.dv
    public final boolean g(ou r1) {
        return false;
    }

    @Override // defpackage.dv
    public final void h() {
        cr r0 = this.f;
        if (r0 == null) goto L6;
        r0.notifyDataSetChanged();
        return;
    }

    @Override // defpackage.dv
    public final void i(Context r2, ku r3) {
        if (this.a == null) goto L7;
        this.a = r2;
        if (this.b != null) goto L7;
        this.b = LayoutInflater.from(r2);
    L7:
        this.c = r3;
        cr r22 = this.f;
        if (r22 == null) goto L11;
        r22.notifyDataSetChanged();
        return;
    }

    @Override // defpackage.dv
    public final boolean k(c50 r7) {
        boolean r0 = r7.hasVisibleItems();
        Context r1 = r7.a;
        if (r0 == true) goto L6;
        return false;
    L6:
        lu r02 = new lu();
        r02.a = r7;
        f2 r2 = new f2(r1);
        b2 r4 = (b2) r2.b;
        dr r3 = new dr(r4.a);
        r02.c = r3;
        r3.e = r02;
        r7.b(r3, r1);
        dr r12 = r02.c;
        if (r12.f != null) goto L9;
        r12.f = new cr(r12);
    L9:
        r4.g = r12.f;
        r4.h = r02;
        View r13 = r7.o;
        if (r13 == null) goto L12;
        r4.e = r13;
    L13:
        r4.f = r02;
        g2 r14 = r2.a();
        r02.b = r14;
        r14.setOnDismissListener(r02);
        WindowManager.LayoutParams r15 = r02.b.getWindow().getAttributes();
        r15.type = 1003;
        r15.flags |= 131072;
        r02.b.show();
        cv r03 = this.e;
        if (r03 == null) goto L18;
        r03.q(r7);
        return true;
    L18:
        return true;
    L12:
        r4.c = r7.n;
        r4.d = r7.m;
        goto L13
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        this.c.q(this.f.b(r3), this, 0);
    }
}
