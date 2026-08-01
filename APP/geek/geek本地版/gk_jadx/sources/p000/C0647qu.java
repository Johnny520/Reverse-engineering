package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: qu */
/* JADX INFO: loaded from: classes.dex */
public final class C0647qu extends FrameLayout implements InterfaceC0923ya {

    /* JADX INFO: renamed from: a */
    public final CollapsibleActionView f4120a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0647qu(View view) {
        super(view.getContext());
        this.f4120a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p000.InterfaceC0923ya
    public final void onActionViewCollapsed() {
        this.f4120a.onActionViewCollapsed();
    }

    @Override // p000.InterfaceC0923ya
    public final void onActionViewExpanded() {
        this.f4120a.onActionViewExpanded();
    }
}
