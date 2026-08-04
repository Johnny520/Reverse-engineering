package yyds;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛲᛸᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0424 extends AbstractC2408 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f2169;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0528 f2170;

    public /* synthetic */ C0424(C0528 c0528, int i) {
        this.f2169 = i;
        this.f2170 = c0528;
    }

    @Override // yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo1183() {
        View view;
        int i = this.f2169;
        C0528 c0528 = this.f2170;
        switch (i) {
            case 0:
                if (c0528.f2538 && (view = c0528.f2543) != null) {
                    view.setTranslationY(0.0f);
                    c0528.f2553.setTranslationY(0.0f);
                }
                c0528.f2553.setVisibility(8);
                c0528.f2553.setTransitioning(false);
                c0528.f2549 = null;
                C2133 c2133 = c0528.f2546;
                if (c2133 != null) {
                    c2133.m4053(c0528.f2548);
                    c0528.f2548 = null;
                    c0528.f2546 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0528.f2550;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                c0528.f2549 = null;
                c0528.f2553.requestLayout();
                break;
        }
    }
}
