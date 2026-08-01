package p068h;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p066g.InterfaceC0562b;

/* JADX INFO: renamed from: h.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0598q extends FrameLayout implements InterfaceC0562b {

    /* JADX INFO: renamed from: b */
    public final CollapsibleActionView f2089b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public C0598q(View view) {
        super(view.getContext());
        this.f2089b = (CollapsibleActionView) view;
        addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.InterfaceC0562b
    /* JADX INFO: renamed from: a */
    public final void mo678a() {
        this.f2089b.onActionViewExpanded();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.InterfaceC0562b
    /* JADX INFO: renamed from: c */
    public final void mo679c() {
        this.f2089b.onActionViewCollapsed();
    }
}
