package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 extends AbstractC0506n1 implements InterfaceC0350iu {

    /* JADX INFO: renamed from: c */
    public final Context f5151c;

    /* JADX INFO: renamed from: d */
    public final MenuC0424ku f5152d;

    /* JADX INFO: renamed from: e */
    public C0138d4 f5153e;

    /* JADX INFO: renamed from: f */
    public WeakReference f5154f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ yb0 f5155g;

    public xb0(yb0 yb0Var, Context context, C0138d4 c0138d4) {
        this.f5155g = yb0Var;
        this.f5151c = context;
        this.f5153e = c0138d4;
        MenuC0424ku menuC0424ku = new MenuC0424ku(context);
        menuC0424ku.f2961l = 1;
        this.f5152d = menuC0424ku;
        menuC0424ku.f2954e = this;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: a */
    public final void mo1882a() {
        yb0 yb0Var = this.f5155g;
        if (yb0Var.f5311E != this) {
            return;
        }
        if (yb0Var.f5318L) {
            yb0Var.f5312F = this;
            yb0Var.f5313G = this.f5153e;
        } else {
            this.f5153e.m873D(this);
        }
        this.f5153e = null;
        yb0Var.m2681K(false);
        ActionBarContextView actionBarContextView = yb0Var.f5308B;
        if (actionBarContextView.f243k == null) {
            actionBarContextView.m145e();
        }
        yb0Var.f5329y.setHideOnContentScrollEnabled(yb0Var.f5323Q);
        yb0Var.f5311E = null;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: b */
    public final View mo1883b() {
        WeakReference weakReference = this.f5154f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: c */
    public final MenuC0424ku mo1884c() {
        return this.f5152d;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo1885d() {
        return new k50(this.f5151c);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: e */
    public final CharSequence mo1886e() {
        return this.f5155g.f5308B.getSubtitle();
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: f */
    public final CharSequence mo1887f() {
        return this.f5155g.f5308B.getTitle();
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: g */
    public final void mo1888g() {
        if (this.f5155g.f5311E != this) {
            return;
        }
        MenuC0424ku menuC0424ku = this.f5152d;
        menuC0424ku.m1730w();
        try {
            this.f5153e.m874E(this, menuC0424ku);
        } finally {
            menuC0424ku.m1729v();
        }
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: h */
    public final boolean mo1889h() {
        return this.f5155g.f5308B.f251s;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: i */
    public final void mo1890i(View view) {
        this.f5155g.f5308B.setCustomView(view);
        this.f5154f = new WeakReference(view);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: j */
    public final void mo1891j(int i) {
        mo1892l(this.f5155g.f5327w.getResources().getString(i));
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: k */
    public final void mo925k(MenuC0424ku menuC0424ku) {
        if (this.f5153e == null) {
            return;
        }
        mo1888g();
        C0358j1 c0358j1 = this.f5155g.f5308B.f236d;
        if (c0358j1 != null) {
            c0358j1.m1542l();
        }
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: l */
    public final void mo1892l(CharSequence charSequence) {
        this.f5155g.f5308B.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: m */
    public final void mo1893m(int i) {
        mo1894o(this.f5155g.f5327w.getResources().getString(i));
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: n */
    public final boolean mo926n(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        C0138d4 c0138d4 = this.f5153e;
        if (c0138d4 != null) {
            return ((C0009a8) c0138d4.f1363b).m27c(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: o */
    public final void mo1894o(CharSequence charSequence) {
        this.f5155g.f5308B.setTitle(charSequence);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: p */
    public final void mo1895p(boolean z) {
        this.f3305b = z;
        this.f5155g.f5308B.setTitleOptional(z);
    }
}
