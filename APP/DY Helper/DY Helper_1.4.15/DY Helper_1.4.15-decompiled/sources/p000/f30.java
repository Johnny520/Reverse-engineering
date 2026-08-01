package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f30 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3738;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.g30 f3739;

    public /* synthetic */ f30(p000.g30 r1, int r2) {
            r0 = this;
            r0.f3738 = r2
            r0.f3739 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f3738
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            org.luckypray.dexkit.query.FindField r7 = (org.luckypray.dexkit.query.FindField) r7
            r7.getClass()
            f30 r0 = new f30
            r1 = 0
            g30 r6 = r6.f3739
            r0.<init>(r6, r1)
            r7.matcher(r0)
            s62 r6 = p000.s62.f9751
            return r6
        L18:
            r0 = r7
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r0.getClass()
            java.lang.String r7 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"
            java.lang.String r1 = p000.jf0.m2957(r7)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            g30 r6 = r6.f3739
            java.lang.String r7 = r6.f4222
            java.lang.String r1 = "boolean"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L41
            r4 = 6
            r5 = 0
            java.lang.String r1 = "boolean"
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher.type$default(r0, r1, r2, r3, r4, r5)
            goto L4a
        L41:
            java.lang.String r1 = r6.f4222
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher.type$default(r0, r1, r2, r3, r4, r5)
        L4a:
            s62 r6 = p000.s62.f9751
            return r6
    }
}
