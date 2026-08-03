package p000a;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1038a;
import java.lang.ref.WeakReference;
import p000a.LayoutInflaterFactory2C0291Q0;

/* JADX INFO: renamed from: a.re */
/* JADX INFO: loaded from: classes.dex */
public final class C0807re extends AbstractC0272P implements C0998f.a {

    /* JADX INFO: renamed from: c */
    public Context f3197c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f3198d;

    /* JADX INFO: renamed from: e */
    public LayoutInflaterFactory2C0291Q0.d f3199e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f3200f;

    /* JADX INFO: renamed from: g */
    public boolean f3201g;

    /* JADX INFO: renamed from: h */
    public C0998f f3202h;

    @Override // androidx.appcompat.view.menu.C0998f.a
    /* JADX INFO: renamed from: a */
    public final boolean mo816a(C0998f c0998f, MenuItem menuItem) {
        return this.f3199e.f1044a.mo332d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0998f.a
    /* JADX INFO: renamed from: b */
    public final void mo817b(C0998f c0998f) {
        mo767i();
        C1038a c1038a = this.f3198d.f3049d;
        if (c1038a != null) {
            c1038a.m2400l();
        }
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: c */
    public final void mo761c() {
        if (this.f3201g) {
            return;
        }
        this.f3201g = true;
        this.f3199e.mo330b(this);
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: d */
    public final View mo762d() {
        WeakReference<View> weakReference = this.f3200f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: e */
    public final C0998f mo763e() {
        return this.f3202h;
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: f */
    public final MenuInflater mo764f() {
        return new C0161Ie(this.f3198d.getContext());
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: g */
    public final CharSequence mo765g() {
        return this.f3198d.getSubtitle();
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: h */
    public final CharSequence mo766h() {
        return this.f3198d.getTitle();
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: i */
    public final void mo767i() {
        this.f3199e.mo331c(this, this.f3202h);
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: j */
    public final boolean mo768j() {
        return this.f3198d.f3897s;
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: k */
    public final void mo769k(View view) {
        this.f3198d.setCustomView(view);
        this.f3200f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: l */
    public final void mo770l(int i) {
        mo771m(this.f3197c.getString(i));
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: m */
    public final void mo771m(CharSequence charSequence) {
        this.f3198d.setSubtitle(charSequence);
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: n */
    public final void mo772n(int i) {
        mo773o(this.f3197c.getString(i));
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: o */
    public final void mo773o(CharSequence charSequence) {
        this.f3198d.setTitle(charSequence);
    }

    @Override // p000a.AbstractC0272P
    /* JADX INFO: renamed from: p */
    public final void mo774p(boolean z) {
        this.f960b = z;
        this.f3198d.setTitleOptional(z);
    }
}
