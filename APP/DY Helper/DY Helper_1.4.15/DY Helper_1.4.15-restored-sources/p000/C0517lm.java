package p000;

/* JADX INFO: renamed from: lm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0517lm implements java.util.Comparator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f6710;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f6711;

    public /* synthetic */ C0517lm(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f6710 = r1
            r0.f6711 = r2
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f6710
            java.lang.Object r5 = r5.f6711
            switch(r0) {
                case 0: goto L21;
                case 1: goto L14;
                default: goto L7;
            }
        L7:
            e80 r5 = (p000.e80) r5
            java.lang.Object r5 = r5.invoke(r6, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L14:
            a30 r5 = (p000.a30) r5
            java.lang.Object r5 = r5.invoke(r6, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L21:
            a80[] r5 = (p000.a80[]) r5
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L26:
            if (r2 >= r0) goto L41
            r3 = r5[r2]
            java.lang.Object r4 = r3.invoke(r6)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Object r3 = r3.invoke(r7)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = p000.AbstractC0073bd.m877(r4, r3)
            if (r3 == 0) goto L3e
            r1 = r3
            goto L41
        L3e:
            int r2 = r2 + 1
            goto L26
        L41:
            return r1
    }
}
