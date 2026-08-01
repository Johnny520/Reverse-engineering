package p000;

/* JADX INFO: renamed from: wi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0948wi implements java.util.function.Predicate {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f11724;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.a80 f11725;

    public /* synthetic */ C0948wi(p000.a80 r1, int r2) {
            r0 = this;
            r0.f11724 = r2
            r0.f11725 = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f11724
            a80 r1 = r1.f11725
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L2e;
                case 2: goto L21;
                case 3: goto L14;
                default: goto L7;
            }
        L7:
            mc r1 = (p000.C0544mc) r1
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L14:
            gh r1 = (p000.C0322gh) r1
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L21:
            mc r1 = (p000.C0544mc) r1
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L2e:
            gh r1 = (p000.C0322gh) r1
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L3b:
            gh r1 = (p000.C0322gh) r1
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }
}
