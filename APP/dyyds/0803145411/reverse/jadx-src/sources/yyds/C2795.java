package yyds;

import android.content.Context;
import android.view.MenuItem;

/* JADX INFO: renamed from: yyds.ᲈᲇᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2795 extends AbstractC2352 implements InterfaceC0541 {

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public C0052 f13659;

    @Override // yyds.AbstractC2352
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final C2045 mo4370(Context context, boolean z) {
        C1648 c1648 = new C1648(context, z);
        c1648.setHoverListener(this);
        return c1648;
    }

    @Override // yyds.InterfaceC0541
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public final void mo390(MenuC0836 menuC0836, C1148 c1148) {
        C0052 c0052 = this.f13659;
        if (c0052 != null) {
            c0052.mo390(menuC0836, c1148);
        }
    }

    @Override // yyds.InterfaceC0541
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final void mo395(MenuC0836 menuC0836, MenuItem menuItem) {
        C0052 c0052 = this.f13659;
        if (c0052 != null) {
            c0052.mo395(menuC0836, menuItem);
        }
    }
}
