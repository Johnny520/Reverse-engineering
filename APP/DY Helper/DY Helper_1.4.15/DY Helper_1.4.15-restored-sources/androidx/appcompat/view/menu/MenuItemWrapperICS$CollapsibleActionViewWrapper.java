package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class MenuItemWrapperICS$CollapsibleActionViewWrapper extends android.widget.FrameLayout implements p000.InterfaceC0947wh {

    /* JADX INFO: renamed from: ε */
    public final android.view.CollapsibleActionView f453;

    public MenuItemWrapperICS$CollapsibleActionViewWrapper(android.view.View r2) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            r0 = r2
            android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
            r1.f453 = r0
            r1.addView(r2)
            return
    }

    @Override // p000.InterfaceC0947wh
    public final void onActionViewCollapsed() {
            r0 = this;
            android.view.CollapsibleActionView r0 = r0.f453
            r0.onActionViewCollapsed()
            return
    }

    @Override // p000.InterfaceC0947wh
    public final void onActionViewExpanded() {
            r0 = this;
            android.view.CollapsibleActionView r0 = r0.f453
            r0.onActionViewExpanded()
            return
    }
}
