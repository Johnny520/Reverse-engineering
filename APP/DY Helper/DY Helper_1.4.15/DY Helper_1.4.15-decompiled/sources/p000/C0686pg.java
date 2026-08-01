package p000;

/* JADX INFO: renamed from: pg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0686pg extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8546;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.C0834tg f8547;

    public /* synthetic */ C0686pg(p000.C0834tg r1, int r2) {
            r0 = this;
            r0.f8546 = r2
            r0.f8547 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r4) {
            r3 = this;
            int r0 = r3.f8546
            r4.getClass()
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L5a;
                case 2: goto L47;
                default: goto L8;
            }
        L8:
            java.lang.Object r4 = r4.f5691
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L11
            android.view.View r4 = (android.view.View) r4
            goto L12
        L11:
            r4 = 0
        L12:
            if (r4 != 0) goto L15
            goto L46
        L15:
            r0 = 2131618515(0x7f0dead3, float:1.8864042E38)
            java.lang.Object r1 = r4.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L25
            goto L46
        L25:
            r4.setTag(r0, r2)
            lg r0 = new lg
            r1 = 0
            r0.<init>(r1)
            r4.addOnAttachStateChangeListener(r0)
            hg r0 = new hg
            r0.<init>()
            r4.addOnLayoutChangeListener(r0)
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L46
            java.lang.String r0 = "constructor attached"
            tg r3 = r3.f8547
            r3.m5706(r4, r0)
        L46:
            return
        L47:
            java.lang.Object r4 = r4.f5691
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L50
            android.view.View r4 = (android.view.View) r4
            goto L51
        L50:
            r4 = 0
        L51:
            if (r4 != 0) goto L54
            goto L59
        L54:
            tg r3 = r3.f8547
            r3.m5692(r4)
        L59:
            return
        L5a:
            java.lang.Object[] r0 = r4.f5692
            r0.getClass()
            r1 = 1
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r1, r0)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L6c
            java.lang.String r0 = (java.lang.String) r0
            goto L6d
        L6c:
            r0 = r2
        L6d:
            java.lang.Object r4 = r4.f5694
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L76
            r2 = r4
            android.view.View r2 = (android.view.View) r2
        L76:
            tg r3 = r3.f8547
            r3.m5699(r2, r0)
            return
        L7c:
            java.lang.Object[] r0 = r4.f5692
            r0.getClass()
            r1 = 0
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r1, r0)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L8e
            java.lang.String r0 = (java.lang.String) r0
            goto L8f
        L8e:
            r0 = r2
        L8f:
            java.lang.Object r4 = r4.f5694
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L98
            r2 = r4
            android.view.View r2 = (android.view.View) r2
        L98:
            tg r3 = r3.f8547
            r3.m5699(r2, r0)
            return
    }
}
