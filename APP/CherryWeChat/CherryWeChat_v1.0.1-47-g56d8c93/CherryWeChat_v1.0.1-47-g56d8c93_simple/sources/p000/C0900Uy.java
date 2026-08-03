package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Uy */
/* JADX INFO: loaded from: classes.dex */
public final class C0900Uy extends AbstractC0345I0 implements InterfaceC2113jr {

    /* JADX INFO: renamed from: c */
    public Context f2796c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f2797d;

    /* JADX INFO: renamed from: e */
    public C0649P3 f2798e;

    /* JADX INFO: renamed from: f */
    public WeakReference f2799f;

    /* JADX INFO: renamed from: g */
    public boolean f2800g;

    /* JADX INFO: renamed from: h */
    public MenuC2204lr f2801h;

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: a */
    public final void mo735a() {
        if (this.f2800g == false) goto L5;
        return;
    L5:
        this.f2800g = true;
        this.f2798e.mo645h(this);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: b */
    public final View mo736b() {
        WeakReference r0 = this.f2799f;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (View) r0.get();
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: c */
    public final MenuC2204lr mo737c() {
        return this.f2801h;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public final boolean mo233d(MenuC2204lr r1, MenuItem r2) {
        return ((InterfaceC0302H0) this.f2798e.f2089b).mo643d(this, r2);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: e */
    public final MenuInflater mo738e() {
        return new C0515Lz(this.f2797d.getContext());
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: f */
    public final CharSequence mo739f() {
        return this.f2797d.getSubtitle();
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: g */
    public final CharSequence mo740g() {
        return this.f2797d.getTitle();
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: h */
    public final void mo741h() {
        this.f2798e.mo644g(this, this.f2801h);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: i */
    public final boolean mo742i() {
        return this.f2797d.f3743s;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: j */
    public final void mo743j(View r2) {
        this.f2797d.setCustomView(r2);
        if (r2 == null) goto L5;
        WeakReference r0 = new WeakReference(r2);
    L6:
        this.f2799f = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: k */
    public final void mo744k(int r2) {
        mo745l(this.f2796c.getString(r2));
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: l */
    public final void mo745l(CharSequence r2) {
        this.f2797d.setSubtitle(r2);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: m */
    public final void mo746m(int r2) {
        mo747o(this.f2796c.getString(r2));
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public final void mo241n(MenuC2204lr r1) {
        mo741h();
        C0130D0 r12 = this.f2797d.f3728d;
        if (r12 == null) goto L6;
        r12.m223l();
        return;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: o */
    public final void mo747o(CharSequence r2) {
        this.f2797d.setTitle(r2);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: p */
    public final void mo748p(boolean r2) {
        this.f1162b = r2;
        this.f2797d.setTitleOptional(r2);
    }
}
