package yyds;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: yyds.ᛶᛱᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1260 extends FrameLayout implements InterfaceC2697 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final CollapsibleActionView f5818;

    /* JADX WARN: Multi-variable type inference failed */
    public C1260(View view) {
        super(view.getContext());
        this.f5818 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // yyds.InterfaceC2697
    public final void onActionViewCollapsed() {
        this.f5818.onActionViewCollapsed();
    }

    @Override // yyds.InterfaceC2697
    public final void onActionViewExpanded() {
        this.f5818.onActionViewExpanded();
    }
}
