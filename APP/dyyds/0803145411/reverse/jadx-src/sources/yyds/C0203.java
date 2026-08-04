package yyds;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛱᲀᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0203 extends AbstractC0451 implements InterfaceC1643 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public WeakReference f1178;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f1179;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Context f1180;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C2133 f1181;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public MenuC0836 f1182;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public ActionBarContextView f1183;

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void mo830(int i) {
        mo835(this.f1180.getString(i));
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo381(MenuC0836 menuC0836, MenuItem menuItem) {
        return ((C0299) this.f1181.f10555).m946(this, menuItem);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void mo831(CharSequence charSequence) {
        this.f1183.setSubtitle(charSequence);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void mo832() {
        this.f1181.m4069(this, this.f1182);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final MenuInflater mo833() {
        return new C1623(this.f1183.getContext());
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo834() {
        if (this.f1179) {
            return;
        }
        this.f1179 = true;
        this.f1181.m4053(this);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void mo835(CharSequence charSequence) {
        this.f1183.setTitle(charSequence);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final View mo836() {
        WeakReference weakReference = this.f1178;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final CharSequence mo837() {
        return this.f1183.getTitle();
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void mo838(View view) {
        this.f1183.setCustomView(view);
        this.f1178 = view != null ? new WeakReference(view) : null;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void mo839(int i) {
        mo831(this.f1180.getString(i));
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean mo840() {
        return this.f1183.f96;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final MenuC0836 mo841() {
        return this.f1182;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void mo842(boolean z) {
        this.f2284 = z;
        this.f1183.setTitleOptional(z);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final CharSequence mo843() {
        return this.f1183.getSubtitle();
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo407(MenuC0836 menuC0836) {
        mo832();
        C1313 c1313 = this.f1183.f103;
        if (c1313 != null) {
            c1313.m2604();
        }
    }
}
