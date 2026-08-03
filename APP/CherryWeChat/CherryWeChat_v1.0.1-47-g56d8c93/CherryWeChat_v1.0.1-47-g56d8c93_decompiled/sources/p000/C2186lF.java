package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lF */
/* JADX INFO: loaded from: classes.dex */
public final class C2186lF extends AbstractC0345I0 implements InterfaceC2113jr {

    /* JADX INFO: renamed from: c */
    public final Context f7623c;

    /* JADX INFO: renamed from: d */
    public final MenuC2204lr f7624d;

    /* JADX INFO: renamed from: e */
    public C0649P3 f7625e;

    /* JADX INFO: renamed from: f */
    public WeakReference f7626f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2229mF f7627g;

    public C2186lF(C2229mF c2229mF, Context context, C0649P3 c0649p3) {
        this.f7627g = c2229mF;
        this.f7623c = context;
        this.f7625e = c0649p3;
        MenuC2204lr menuC2204lr = new MenuC2204lr(context);
        menuC2204lr.f7671l = 1;
        this.f7624d = menuC2204lr;
        menuC2204lr.f7664e = this;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: a */
    public final void mo735a() {
        C2229mF c2229mF = this.f7627g;
        if (c2229mF.f7780i != this) {
            return;
        }
        boolean z = c2229mF.f7787p;
        boolean z2 = c2229mF.f7788q;
        if (z || z2) {
            c2229mF.f7781j = this;
            c2229mF.f7782k = this.f7625e;
        } else {
            this.f7625e.mo645h(this);
        }
        this.f7625e = null;
        c2229mF.m4513q(false);
        ActionBarContextView actionBarContextView = c2229mF.f7777f;
        if (actionBarContextView.f3735k == null) {
            actionBarContextView.m2081e();
        }
        c2229mF.f7774c.setHideOnContentScrollEnabled(c2229mF.f7793v);
        c2229mF.f7780i = null;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: b */
    public final View mo736b() {
        WeakReference weakReference = this.f7626f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: c */
    public final MenuC2204lr mo737c() {
        return this.f7624d;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public final boolean mo233d(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        C0649P3 c0649p3 = this.f7625e;
        if (c0649p3 != null) {
            return ((InterfaceC0302H0) c0649p3.f2089b).mo643d(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: e */
    public final MenuInflater mo738e() {
        return new C0515Lz(this.f7623c);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: f */
    public final CharSequence mo739f() {
        return this.f7627g.f7777f.getSubtitle();
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: g */
    public final CharSequence mo740g() {
        return this.f7627g.f7777f.getTitle();
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: h */
    public final void mo741h() {
        if (this.f7627g.f7780i != this) {
            return;
        }
        MenuC2204lr menuC2204lr = this.f7624d;
        menuC2204lr.m4442w();
        try {
            this.f7625e.mo644g(this, menuC2204lr);
        } finally {
            menuC2204lr.m4441v();
        }
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: i */
    public final boolean mo742i() {
        return this.f7627g.f7777f.f3743s;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: j */
    public final void mo743j(View view) {
        this.f7627g.f7777f.setCustomView(view);
        this.f7626f = new WeakReference(view);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: k */
    public final void mo744k(int i) {
        mo745l(this.f7627g.f7772a.getResources().getString(i));
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: l */
    public final void mo745l(CharSequence charSequence) {
        this.f7627g.f7777f.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: m */
    public final void mo746m(int i) {
        mo747o(this.f7627g.f7772a.getResources().getString(i));
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public final void mo241n(MenuC2204lr menuC2204lr) {
        if (this.f7625e == null) {
            return;
        }
        mo741h();
        C0130D0 c0130d0 = this.f7627g.f7777f.f3728d;
        if (c0130d0 != null) {
            c0130d0.m223l();
        }
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: o */
    public final void mo747o(CharSequence charSequence) {
        this.f7627g.f7777f.setTitle(charSequence);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: p */
    public final void mo748p(boolean z) {
        this.f1162b = z;
        this.f7627g.f7777f.setTitleOptional(z);
    }
}
