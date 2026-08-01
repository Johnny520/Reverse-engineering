package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h50 extends ActionMode {
    public final Context a;
    public final n1 b;

    public h50(Context r1, n1 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        ku r1 = this.b.c();
        return new gv(this.a, r1);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View r2) {
        this.b.i(r2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence r2) {
        this.b.l(r2);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object r2) {
        this.b.a = r2;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence r2) {
        this.b.o(r2);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean r2) {
        this.b.p(r2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r2) {
        this.b.j(r2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r2) {
        this.b.m(r2);
    }
}
