package yyds;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛷᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1591 extends ActionMode {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Context f8085;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final AbstractC0451 f8086;

    public C1591(Context context, AbstractC0451 abstractC0451) {
        this.f8085 = context;
        this.f8086 = abstractC0451;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f8086.mo834();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f8086.mo836();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1946(this.f8085, this.f8086.mo841());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f8086.mo833();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f8086.mo843();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f8086.f2283;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f8086.mo837();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f8086.f2284;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f8086.mo832();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f8086.mo840();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f8086.mo838(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f8086.mo831(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f8086.f2283 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f8086.mo835(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f8086.mo842(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f8086.mo839(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f8086.mo830(i);
    }
}
