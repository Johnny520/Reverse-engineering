package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class o40 extends n1 implements iu {
    public Context c;
    public ActionBarContextView d;
    public d4 e;
    public WeakReference f;
    public boolean g;
    public ku h;

    @Override // defpackage.n1
    public final void a() {
        if (this.g == false) goto L5;
        return;
    L5:
        this.g = true;
        this.e.D(this);
    }

    @Override // defpackage.n1
    public final View b() {
        WeakReference r0 = this.f;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (View) r0.get();
    }

    @Override // defpackage.n1
    public final ku c() {
        return this.h;
    }

    @Override // defpackage.n1
    public final MenuInflater d() {
        return new k50(this.d.getContext());
    }

    @Override // defpackage.n1
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.n1
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // defpackage.n1
    public final void g() {
        this.e.E(this, this.h);
    }

    @Override // defpackage.n1
    public final boolean h() {
        return this.d.s;
    }

    @Override // defpackage.n1
    public final void i(View r2) {
        this.d.setCustomView(r2);
        if (r2 == null) goto L5;
        WeakReference r0 = new WeakReference(r2);
    L6:
        this.f = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // defpackage.n1
    public final void j(int r2) {
        l(this.c.getString(r2));
    }

    @Override // defpackage.iu
    public final void k(ku r1) {
        g();
        j1 r12 = this.d.d;
        if (r12 == null) goto L6;
        r12.l();
        return;
    }

    @Override // defpackage.n1
    public final void l(CharSequence r2) {
        this.d.setSubtitle(r2);
    }

    @Override // defpackage.n1
    public final void m(int r2) {
        o(this.c.getString(r2));
    }

    @Override // defpackage.iu
    public final boolean n(ku r1, MenuItem r2) {
        return ((a8) this.e.b).c(this, r2);
    }

    @Override // defpackage.n1
    public final void o(CharSequence r2) {
        this.d.setTitle(r2);
    }

    @Override // defpackage.n1
    public final void p(boolean r2) {
        this.b = r2;
        this.d.setTitleOptional(r2);
    }
}
