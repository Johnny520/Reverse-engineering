package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o50 extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f3405a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0506n1 f3406b;

    public o50(Context context, AbstractC0506n1 abstractC0506n1) {
        this.f3405a = context;
        this.f3406b = abstractC0506n1;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3406b.mo613a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3406b.mo614b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0573ov(this.f3405a, this.f3406b.mo615c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3406b.mo616d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3406b.mo617e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3406b.f3202a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3406b.mo618f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3406b.f3203b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3406b.mo619g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3406b.mo620h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3406b.mo621i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3406b.mo624l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3406b.f3202a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3406b.mo627o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f3406b.mo628p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f3406b.mo622j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f3406b.mo625m(i);
    }
}
