package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: Iz */
/* JADX INFO: loaded from: classes.dex */
public final class C0386Iz extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f1322a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0345I0 f1323b;

    public C0386Iz(Context r1, AbstractC0345I0 r2) {
        this.f1322a = r1;
        this.f1323b = r2;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f1323b.mo735a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f1323b.mo736b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        MenuC2204lr r1 = this.f1323b.mo737c();
        return new MenuC0335Hr(this.f1322a, r1);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f1323b.mo738e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f1323b.mo739f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f1323b.f1161a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f1323b.mo740g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f1323b.f1162b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f1323b.mo741h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f1323b.mo742i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View r2) {
        this.f1323b.mo743j(r2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence r2) {
        this.f1323b.mo745l(r2);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object r2) {
        this.f1323b.f1161a = r2;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence r2) {
        this.f1323b.mo747o(r2);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean r2) {
        this.f1323b.mo748p(r2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r2) {
        this.f1323b.mo744k(r2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r2) {
        this.f1323b.mo746m(r2);
    }
}
