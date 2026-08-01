package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: yu */
/* JADX INFO: loaded from: classes.dex */
public final class C0943yu extends FrameLayout implements InterfaceC0255gb {

    /* JADX INFO: renamed from: a */
    public final CollapsibleActionView f5503a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0943yu(View view) {
        super(view.getContext());
        this.f5503a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p000.InterfaceC0255gb
    public final void onActionViewCollapsed() {
        this.f5503a.onActionViewCollapsed();
    }

    @Override // p000.InterfaceC0255gb
    public final void onActionViewExpanded() {
        this.f5503a.onActionViewExpanded();
    }
}
