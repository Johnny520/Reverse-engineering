package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class v40 extends AbstractC0506n1 implements InterfaceC0572ou {

    /* JADX INFO: renamed from: c */
    public Context f4897c;

    /* JADX INFO: renamed from: d */
    public ActionBarContextView f4898d;

    /* JADX INFO: renamed from: e */
    public C0138d4 f4899e;

    /* JADX INFO: renamed from: f */
    public WeakReference f4900f;

    /* JADX INFO: renamed from: g */
    public boolean f4901g;

    /* JADX INFO: renamed from: h */
    public MenuC0646qu f4902h;

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: a */
    public final void mo613a() {
        if (this.f4901g) {
            return;
        }
        this.f4901g = true;
        this.f4899e.m832D(this);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: b */
    public final View mo614b() {
        WeakReference weakReference = this.f4900f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: c */
    public final MenuC0646qu mo615c() {
        return this.f4902h;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo616d() {
        return new r50(this.f4898d.getContext());
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: e */
    public final CharSequence mo617e() {
        return this.f4898d.getSubtitle();
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: f */
    public final CharSequence mo618f() {
        return this.f4898d.getTitle();
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: g */
    public final void mo619g() {
        this.f4899e.m833E(this, this.f4902h);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: h */
    public final boolean mo620h() {
        return this.f4898d.f214s;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: i */
    public final void mo621i(View view) {
        this.f4898d.setCustomView(view);
        this.f4900f = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: j */
    public final void mo622j(int i) {
        mo624l(this.f4897c.getString(i));
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: k */
    public final void mo623k(MenuC0646qu menuC0646qu) {
        mo619g();
        C0358j1 c0358j1 = this.f4898d.f199d;
        if (c0358j1 != null) {
            c0358j1.m1562l();
        }
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: l */
    public final void mo624l(CharSequence charSequence) {
        this.f4898d.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: m */
    public final void mo625m(int i) {
        mo627o(this.f4897c.getString(i));
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: n */
    public final boolean mo626n(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        return ((C0402k8) this.f4899e.f1297b).m1663c(this, menuItem);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: o */
    public final void mo627o(CharSequence charSequence) {
        this.f4898d.setTitle(charSequence);
    }

    @Override // p000.AbstractC0506n1
    /* JADX INFO: renamed from: p */
    public final void mo628p(boolean z) {
        this.f3203b = z;
        this.f4898d.setTitleOptional(z);
    }
}
