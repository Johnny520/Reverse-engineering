package p000;

/* JADX INFO: renamed from: eg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0247eg implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3535;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f3536;

    public /* synthetic */ C0247eg(int r1, int r2) {
            r0 = this;
            r0.f3535 = r2
            r0.f3536 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f3535
            r1 = 0
            r2 = 1
            int r3 = r3.f3536
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L3d;
                case 2: goto L1e;
                default: goto L9;
            }
        L9:
            l91 r4 = (p000.l91) r4
            r4.getClass()
            java.lang.Object r4 = r4.f6503
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 < r3) goto L19
            r1 = r2
        L19:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L1e:
            id1 r4 = (p000.id1) r4
            r4.getClass()
            if (r3 == 0) goto L37
            java.lang.Integer r4 = r4.f5019
            if (r4 == 0) goto L30
            int r4 = r4.intValue()
            if (r4 > r3) goto L38
            goto L37
        L30:
            java.lang.String r3 = "Required value was null."
            p000.C1080.m7279(r3)
            r3 = 0
            goto L3c
        L37:
            r1 = r2
        L38:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
        L3c:
            return r3
        L3d:
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r4.getClass()
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L59
            tg r0 = p000.AbstractC0871ug.f10771
            java.lang.Integer r4 = p000.C0834tg.m5664(r4)
            if (r4 != 0) goto L53
            goto L59
        L53:
            int r4 = r4.intValue()
            if (r4 == r3) goto L5a
        L59:
            r1 = r2
        L5a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L5f:
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r4.getClass()
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L7b
            tg r0 = p000.AbstractC0871ug.f10771
            java.lang.Integer r4 = p000.C0834tg.m5664(r4)
            if (r4 != 0) goto L75
            goto L7b
        L75:
            int r4 = r4.intValue()
            if (r4 == r3) goto L7c
        L7b:
            r1 = r2
        L7c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }
}
