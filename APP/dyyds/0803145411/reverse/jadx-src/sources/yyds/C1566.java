package yyds;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: yyds.ᛷᛵᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1566 extends C2060 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1669 f7961;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1213 f7962;

    public C1566(C1213 c1213) {
        this.f7962 = c1213;
        C1669 c1669 = this.f7961;
        if (c1669 != null) {
            this.f7961 = c1669;
        } else {
            this.f7961 = new C1669(this);
        }
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo1341(View view, int i, Bundle bundle) {
        if (super.mo1341(view, i, bundle)) {
            return true;
        }
        C1213 c1213 = this.f7962;
        if (c1213.m2429() || c1213.getLayoutManager() == null) {
            return false;
        }
        return c1213.getLayoutManager().mo146(i, bundle);
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1342(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1342(view, accessibilityEvent);
        if (!(view instanceof C1213) || this.f7962.m2429()) {
            return;
        }
        C1213 c1213 = (C1213) view;
        if (c1213.getLayoutManager() != null) {
            c1213.getLayoutManager().mo181(accessibilityEvent);
        }
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1343(View view, C0134 c0134) {
        this.f10201.onInitializeAccessibilityNodeInfo(view, c0134.f833);
        C1213 c1213 = this.f7962;
        if (c1213.m2429() || c1213.getLayoutManager() == null) {
            return;
        }
        AbstractC2551 layoutManager = c1213.getLayoutManager();
        C1213 c12132 = layoutManager.f12600;
        layoutManager.mo152(c12132.f5529, c12132.f5568, c0134);
    }
}
