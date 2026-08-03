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
        if (this.f2800g) {
            return;
        }
        this.f2800g = true;
        this.f2798e.mo645h(this);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: b */
    public final View mo736b() {
        WeakReference weakReference = this.f2799f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: c */
    public final MenuC2204lr mo737c() {
        return this.f2801h;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public final boolean mo233d(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        return ((InterfaceC0302H0) this.f2798e.f2089b).mo643d(this, menuItem);
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
    public final void mo743j(View view) {
        this.f2797d.setCustomView(view);
        this.f2799f = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: k */
    public final void mo744k(int i) {
        mo745l(this.f2796c.getString(i));
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: l */
    public final void mo745l(CharSequence charSequence) {
        this.f2797d.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: m */
    public final void mo746m(int i) {
        mo747o(this.f2796c.getString(i));
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public final void mo241n(MenuC2204lr menuC2204lr) {
        mo741h();
        C0130D0 c0130d0 = this.f2797d.f3728d;
        if (c0130d0 != null) {
            c0130d0.m223l();
        }
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: o */
    public final void mo747o(CharSequence charSequence) {
        this.f2797d.setTitle(charSequence);
    }

    @Override // p000.AbstractC0345I0
    /* JADX INFO: renamed from: p */
    public final void mo748p(boolean z) {
        this.f1162b = z;
        this.f2797d.setTitleOptional(z);
    }
}
