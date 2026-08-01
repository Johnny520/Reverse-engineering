package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 extends n1 implements iu {
    public final Context c;
    public final ku d;
    public d4 e;
    public WeakReference f;
    public final /* synthetic */ yb0 g;

    public xb0(yb0 r1, Context r2, d4 r3) {
        this.g = r1;
        this.c = r2;
        this.e = r3;
        ku r12 = new ku(r2);
        r12.l = 1;
        this.d = r12;
        r12.e = this;
    }

    @Override // defpackage.n1
    public final void a() {
        yb0 r0 = this.g;
        if (r0.E == this) goto L6;
        return;
    L6:
        if (r0.L == false) goto L8;
        r0.F = this;
        r0.G = this.e;
    L9:
        this.e = null;
        r0.K(false);
        ActionBarContextView r2 = r0.B;
        if (r2.k != null) goto L12;
        r2.e();
    L12:
        r0.y.setHideOnContentScrollEnabled(r0.Q);
        r0.E = null;
        return;
    L8:
        this.e.D(this);
        goto L9
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
        return this.d;
    }

    @Override // defpackage.n1
    public final MenuInflater d() {
        return new k50(this.c);
    }

    @Override // defpackage.n1
    public final CharSequence e() {
        return this.g.B.getSubtitle();
    }

    @Override // defpackage.n1
    public final CharSequence f() {
        return this.g.B.getTitle();
    }

    @Override // defpackage.n1
    public final void g() {
        if (this.g.E == this) goto L5;
        return;
    L5:
        ku r0 = this.d;
        r0.w();
        this.e.E(this, r0);     // Catch: Throwable -> L9
        r0.v();
        return;
    L9:
        th = move-exception;
        r0.v();
        throw th;
    }

    @Override // defpackage.n1
    public final boolean h() {
        return this.g.B.s;
    }

    @Override // defpackage.n1
    public final void i(View r2) {
        this.g.B.setCustomView(r2);
        this.f = new WeakReference(r2);
    }

    @Override // defpackage.n1
    public final void j(int r2) {
        l(this.g.w.getResources().getString(r2));
    }

    @Override // defpackage.iu
    public final void k(ku r1) {
        if (this.e == null) goto L10;
        g();
        j1 r12 = this.g.B.d;
        if (r12 == null) goto L9;
        r12.l();
        return;
    L9:
        return;
    }

    @Override // defpackage.n1
    public final void l(CharSequence r2) {
        this.g.B.setSubtitle(r2);
    }

    @Override // defpackage.n1
    public final void m(int r2) {
        o(this.g.w.getResources().getString(r2));
    }

    @Override // defpackage.iu
    public final boolean n(ku r1, MenuItem r2) {
        d4 r12 = this.e;
        if (r12 != null) goto L5;
        return false;
    L5:
        return ((a8) r12.b).c(this, r2);
    }

    @Override // defpackage.n1
    public final void o(CharSequence r2) {
        this.g.B.setTitle(r2);
    }

    @Override // defpackage.n1
    public final void p(boolean r2) {
        this.b = r2;
        this.g.B.setTitleOptional(r2);
    }
}
