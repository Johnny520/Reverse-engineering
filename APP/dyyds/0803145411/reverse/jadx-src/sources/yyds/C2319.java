package yyds;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᲁᲀᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2319 extends AbstractC0451 implements InterfaceC1643 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public WeakReference f11370;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0528 f11371;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Context f11372;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C2133 f11373;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final MenuC0836 f11374;

    public C2319(C0528 c0528, Context context, C2133 c2133) {
        this.f11371 = c0528;
        this.f11372 = context;
        this.f11373 = c2133;
        MenuC0836 menuC0836 = new MenuC0836(context);
        menuC0836.f3822 = 1;
        this.f11374 = menuC0836;
        menuC0836.f3834 = this;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo830(int i) {
        mo835(this.f11371.f2536.getResources().getString(i));
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo381(MenuC0836 menuC0836, MenuItem menuItem) {
        C2133 c2133 = this.f11373;
        if (c2133 != null) {
            return ((C0299) c2133.f10555).m946(this, menuItem);
        }
        return false;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo831(CharSequence charSequence) {
        this.f11371.f2552.setSubtitle(charSequence);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo832() {
        if (this.f11371.f2533 != this) {
            return;
        }
        MenuC0836 menuC0836 = this.f11374;
        menuC0836.m1905();
        try {
            this.f11373.m4069(this, menuC0836);
        } finally {
            menuC0836.m1908();
        }
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final MenuInflater mo833() {
        return new C1623(this.f11372);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo834() {
        C0528 c0528 = this.f11371;
        if (c0528.f2533 != this) {
            return;
        }
        if (c0528.f2551) {
            c0528.f2548 = this;
            c0528.f2546 = this.f11373;
        } else {
            this.f11373.m4053(this);
        }
        this.f11373 = null;
        c0528.m1366(false);
        ActionBarContextView actionBarContextView = c0528.f2552;
        if (actionBarContextView.f87 == null) {
            actionBarContextView.m38();
        }
        c0528.f2550.setHideOnContentScrollEnabled(c0528.f2545);
        c0528.f2533 = null;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final void mo835(CharSequence charSequence) {
        this.f11371.f2552.setTitle(charSequence);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final View mo836() {
        WeakReference weakReference = this.f11370;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final CharSequence mo837() {
        return this.f11371.f2552.getTitle();
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo838(View view) {
        this.f11371.f2552.setCustomView(view);
        this.f11370 = new WeakReference(view);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo839(int i) {
        mo831(this.f11371.f2536.getResources().getString(i));
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final boolean mo840() {
        return this.f11371.f2552.f96;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final MenuC0836 mo841() {
        return this.f11374;
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public final void mo842(boolean z) {
        this.f2284 = z;
        this.f11371.f2552.setTitleOptional(z);
    }

    @Override // yyds.AbstractC0451
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final CharSequence mo843() {
        return this.f11371.f2552.getSubtitle();
    }

    @Override // yyds.InterfaceC1643
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo407(MenuC0836 menuC0836) {
        if (this.f11373 == null) {
            return;
        }
        mo832();
        C1313 c1313 = this.f11371.f2552.f103;
        if (c1313 != null) {
            c1313.m2604();
        }
    }
}
