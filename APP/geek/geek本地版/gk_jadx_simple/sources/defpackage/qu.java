package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class qu extends FrameLayout implements ya {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public qu(View r2) {
        super(r2.getContext());
        this.a = (CollapsibleActionView) r2;
        addView(r2);
    }

    @Override // defpackage.ya
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.ya
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
