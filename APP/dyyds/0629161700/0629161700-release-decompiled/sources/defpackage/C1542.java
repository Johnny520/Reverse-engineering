package defpackage;

/* JADX INFO: renamed from: ᛸᛸᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1542 extends android.widget.FrameLayout implements defpackage.InterfaceC1775 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.CollapsibleActionView f6848;

    public C1542(android.view.View r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            r0 = r2
            android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
            r1.f6848 = r0
            r1.addView(r2)
            return
    }

    @Override // defpackage.InterfaceC1775
    public final void onActionViewCollapsed() {
            r0 = this;
            android.view.CollapsibleActionView r0 = r0.f6848
            r0.onActionViewCollapsed()
            return
    }

    @Override // defpackage.InterfaceC1775
    public final void onActionViewExpanded() {
            r0 = this;
            android.view.CollapsibleActionView r0 = r0.f6848
            r0.onActionViewExpanded()
            return
    }
}
