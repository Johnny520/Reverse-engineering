package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h50 extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f2236a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0506n1 f2237b;

    public h50(Context context, AbstractC0506n1 abstractC0506n1) {
        this.f2236a = context;
        this.f2237b = abstractC0506n1;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2237b.mo1882a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2237b.mo1883b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0275gv(this.f2236a, this.f2237b.mo1884c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2237b.mo1885d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2237b.mo1886e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2237b.f3304a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2237b.mo1887f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2237b.f3305b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2237b.mo1888g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2237b.mo1889h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2237b.mo1890i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2237b.mo1892l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2237b.f3304a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2237b.mo1894o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f2237b.mo1895p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f2237b.mo1891j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f2237b.mo1893m(i);
    }
}
