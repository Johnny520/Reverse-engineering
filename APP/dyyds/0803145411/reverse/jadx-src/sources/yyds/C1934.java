package yyds;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: yyds.ᲀᛲᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1934 implements InterfaceC1824 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f9734 = false;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f9735;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ ActionBarContextView f9736;

    public C1934(ActionBarContextView actionBarContextView) {
        this.f9736 = actionBarContextView;
    }

    @Override // yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1183() {
        if (this.f9734) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f9736;
        actionBarContextView.f86 = null;
        super/*android.view.View*/.setVisibility(this.f9735);
    }

    @Override // yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo3309() {
        this.f9734 = true;
    }

    @Override // yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo2973() {
        super/*android.view.View*/.setVisibility(0);
        this.f9734 = false;
    }
}
