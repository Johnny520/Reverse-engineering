package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qu extends android.widget.FrameLayout implements defpackage.ya {
    public final android.view.CollapsibleActionView a;

    public qu(android.view.View r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            r0 = r2
            android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
            r1.a = r0
            r1.addView(r2)
            return
    }

    @Override // defpackage.ya
    public final void onActionViewCollapsed() {
            r1 = this;
            android.view.CollapsibleActionView r0 = r1.a
            r0.onActionViewCollapsed()
            return
    }

    @Override // defpackage.ya
    public final void onActionViewExpanded() {
            r1 = this;
            android.view.CollapsibleActionView r0 = r1.a
            r0.onActionViewExpanded()
            return
    }
}
