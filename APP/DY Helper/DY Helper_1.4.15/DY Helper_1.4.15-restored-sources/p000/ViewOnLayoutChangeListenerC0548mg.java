package p000;

/* JADX INFO: renamed from: mg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0548mg implements android.view.View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f7121;

    public /* synthetic */ ViewOnLayoutChangeListenerC0548mg(int r1) {
            r0 = this;
            r0.f7121 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            int r0 = r0.f7121
            r1.getClass()
            switch(r0) {
                case 0: goto L17;
                default: goto L8;
            }
        L8:
            if (r2 != r6) goto L11
            if (r3 != r7) goto L11
            if (r4 != r8) goto L11
            if (r5 != r9) goto L11
            goto L16
        L11:
            tg r0 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5652(r1)
        L16:
            return
        L17:
            if (r2 != r6) goto L20
            if (r3 != r7) goto L20
            if (r4 != r8) goto L20
            if (r5 != r9) goto L20
            goto L25
        L20:
            tg r0 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5652(r1)
        L25:
            return
    }
}
