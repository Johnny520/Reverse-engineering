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

    public C2186lF(C2229mF r1, Context r2, C0649P3 r3) {
        this.f7627g = r1;
        this.f7623c = r2;
        this.f7625e = r3;
        MenuC2204lr r12 = new MenuC2204lr(r2);
        r12.f7671l = 1;
        this.f7624d = r12;
        r12.f7664e = this;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: a */
    public final void mo735a() {
        C2229mF r0 = this.f7627g;
        if (r0.f7780i == this) goto L5;
        return;
    L5:
        boolean r1 = r0.f7787p;
        boolean r2 = r0.f7788q;
        if (r1 == true) goto L10;
        if (r2 == true) goto L10;
        this.f7625e.mo645h(this);
    L11:
        this.f7625e = null;
        r0.m4513q(false);
        ActionBarContextView r22 = r0.f7777f;
        if (r22.f3735k != null) goto L14;
        r22.m2081e();
    L14:
        r0.f7774c.setHideOnContentScrollEnabled(r0.f7793v);
        r0.f7780i = null;
        return;
    L10:
        r0.f7781j = this;
        r0.f7782k = this.f7625e;
        goto L11
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: b */
    public final View mo736b() {
        WeakReference r0 = this.f7626f;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (View) r0.get();
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: c */
    public final MenuC2204lr mo737c() {
        return this.f7624d;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public final boolean mo233d(MenuC2204lr r1, MenuItem r2) {
        C0649P3 r12 = this.f7625e;
        if (r12 != null) goto L5;
        return false;
    L5:
        return ((InterfaceC0302H0) r12.f2089b).mo643d(this, r2);
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
        if (this.f7627g.f7780i == this) goto L5;
        return;
    L5:
        MenuC2204lr r0 = this.f7624d;
        r0.m4442w();
        this.f7625e.mo644g(this, r0);     // Catch: Throwable -> L9
        r0.m4441v();
        return;
    L9:
        th = move-exception;
        r0.m4441v();
        throw th;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: i */
    public final boolean mo742i() {
        return this.f7627g.f7777f.f3743s;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: j */
    public final void mo743j(View r2) {
        this.f7627g.f7777f.setCustomView(r2);
        this.f7626f = new WeakReference(r2);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: k */
    public final void mo744k(int r2) {
        mo745l(this.f7627g.f7772a.getResources().getString(r2));
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: l */
    public final void mo745l(CharSequence r2) {
        this.f7627g.f7777f.setSubtitle(r2);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: m */
    public final void mo746m(int r2) {
        mo747o(this.f7627g.f7772a.getResources().getString(r2));
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public final void mo241n(MenuC2204lr r1) {
        if (this.f7625e == null) goto L10;
        mo741h();
        C0130D0 r12 = this.f7627g.f7777f.f3728d;
        if (r12 == null) goto L9;
        r12.m223l();
        return;
    L9:
        return;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: o */
    public final void mo747o(CharSequence r2) {
        this.f7627g.f7777f.setTitle(r2);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: p */
    public final void mo748p(boolean r2) {
        this.f1162b = r2;
        this.f7627g.f7777f.setTitleOptional(r2);
    }
}
