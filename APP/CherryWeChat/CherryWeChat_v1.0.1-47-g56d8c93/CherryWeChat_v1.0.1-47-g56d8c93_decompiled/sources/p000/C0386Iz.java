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

    public C0386Iz(Context context, AbstractC0345I0 abstractC0345I0) {
        this.f1322a = context;
        this.f1323b = abstractC0345I0;
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
        return new MenuC0335Hr(this.f1322a, this.f1323b.mo737c());
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
    public final void setCustomView(View view) {
        this.f1323b.mo743j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1323b.mo745l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f1323b.f1161a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1323b.mo747o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f1323b.mo748p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f1323b.mo744k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f1323b.mo746m(i);
    }
}
