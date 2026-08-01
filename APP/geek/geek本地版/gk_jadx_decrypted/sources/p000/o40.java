package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class o40 extends AbstractC0506n1 implements InterfaceC0350iu {

    /* JADX INFO: renamed from: c */
    public Context f3487c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f3488d;

    /* JADX INFO: renamed from: e */
    public C0138d4 f3489e;

    /* JADX INFO: renamed from: f */
    public WeakReference f3490f;

    /* JADX INFO: renamed from: g */
    public boolean f3491g;

    /* JADX INFO: renamed from: h */
    public MenuC0424ku f3492h;

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: a */
    public final void mo1882a() {
        if (this.f3491g) {
            return;
        }
        this.f3491g = true;
        this.f3489e.m873D(this);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: b */
    public final View mo1883b() {
        WeakReference weakReference = this.f3490f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: c */
    public final MenuC0424ku mo1884c() {
        return this.f3492h;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo1885d() {
        return new k50(this.f3488d.getContext());
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: e */
    public final CharSequence mo1886e() {
        return this.f3488d.getSubtitle();
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: f */
    public final CharSequence mo1887f() {
        return this.f3488d.getTitle();
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: g */
    public final void mo1888g() {
        this.f3489e.m874E(this, this.f3492h);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: h */
    public final boolean mo1889h() {
        return this.f3488d.f251s;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: i */
    public final void mo1890i(View view) {
        this.f3488d.setCustomView(view);
        this.f3490f = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: j */
    public final void mo1891j(int i) {
        mo1892l(this.f3487c.getString(i));
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: k */
    public final void mo925k(MenuC0424ku menuC0424ku) {
        mo1888g();
        C0358j1 c0358j1 = this.f3488d.f236d;
        if (c0358j1 != null) {
            c0358j1.m1542l();
        }
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: l */
    public final void mo1892l(CharSequence charSequence) {
        this.f3488d.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: m */
    public final void mo1893m(int i) {
        mo1894o(this.f3487c.getString(i));
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: n */
    public final boolean mo926n(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        return ((C0009a8) this.f3489e.f1363b).m27c(this, menuItem);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: o */
    public final void mo1894o(CharSequence charSequence) {
        this.f3488d.setTitle(charSequence);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: p */
    public final void mo1895p(boolean z) {
        this.f3305b = z;
        this.f3488d.setTitleOptional(z);
    }
}
