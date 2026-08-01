package p000;

/* JADX INFO: renamed from: g */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0304g implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f4182;

    public ViewOnClickListenerC0304g(androidx.appcompat.widget.ActivityChooserView r1) {
            r0 = this;
            r0.<init>()
            r0.f4182 = r1
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            androidx.appcompat.widget.ActivityChooserView r2 = r2.f4182
            f r0 = r2.f529
            android.widget.FrameLayout r1 = r2.f534
            if (r3 == r1) goto L1d
            android.widget.FrameLayout r2 = r2.f532
            if (r3 != r2) goto L17
            r0.getClass()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "No data model. Did you call #setDataModel?"
            r2.<init>(r3)
            throw r2
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L1d:
            r2.m267()
            r0.getClass()
            r2 = 0
            throw r2
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView r1 = r1.f4182
            android.widget.PopupWindow$OnDismissListener r0 = r1.f538
            if (r0 == 0) goto L9
            r0.onDismiss()
        L9:
            ｘ r1 = r1.f535
            if (r1 == 0) goto L19
            androidx.appcompat.widget.γ r1 = r1.f13522
            if (r1 == 0) goto L19
            iz0 r1 = r1.f792
            if (r1 == 0) goto L19
            r0 = 0
            r1.m2831(r0)
        L19:
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.Adapter r1 = r1.getAdapter()
            f r1 = (p000.C0267f) r1
            r1.getClass()
            androidx.appcompat.widget.ActivityChooserView r0 = r0.f4182
            r0.m267()
            f r0 = r0.f529
            r0.getClass()
            r0 = 0
            throw r0
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView r1 = r1.f4182
            android.widget.FrameLayout r0 = r1.f534
            if (r2 != r0) goto Ld
            f r1 = r1.f529
            r1.getClass()
            r1 = 0
            throw r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }
}
