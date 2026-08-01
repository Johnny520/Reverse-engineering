package p000;

/* JADX INFO: renamed from: wu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0960wu implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11865;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.Switch f11866;

    public /* synthetic */ ViewOnClickListenerC0960wu(android.widget.Switch r1, int r2) {
            r0 = this;
            r0.f11865 = r2
            r0.f11866 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f11865
            switch(r0) {
                case 0: goto L45;
                case 1: goto L35;
                case 2: goto L29;
                case 3: goto L1d;
                case 4: goto L11;
                default: goto L5;
            }
        L5:
            android.widget.Switch r1 = r1.f11866
            boolean r2 = r1.isChecked()
            r2 = r2 ^ 1
            r1.setChecked(r2)
            return
        L11:
            android.widget.Switch r1 = r1.f11866
            boolean r2 = r1.isChecked()
            r2 = r2 ^ 1
            r1.setChecked(r2)
            return
        L1d:
            android.widget.Switch r1 = r1.f11866
            boolean r2 = r1.isChecked()
            r2 = r2 ^ 1
            r1.setChecked(r2)
            return
        L29:
            android.widget.Switch r1 = r1.f11866
            boolean r2 = r1.isChecked()
            r2 = r2 ^ 1
            r1.setChecked(r2)
            return
        L35:
            r0 = 3
            r2.performHapticFeedback(r0)
            android.widget.Switch r1 = r1.f11866
            boolean r2 = r1.isChecked()
            r2 = r2 ^ 1
            r1.setChecked(r2)
            return
        L45:
            r0 = 3
            r2.performHapticFeedback(r0)
            android.widget.Switch r1 = r1.f11866
            boolean r2 = r1.isChecked()
            r2 = r2 ^ 1
            r1.setChecked(r2)
            return
    }
}
