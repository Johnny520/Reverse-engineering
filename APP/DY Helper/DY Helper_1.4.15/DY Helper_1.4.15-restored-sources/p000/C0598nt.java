package p000;

/* JADX INFO: renamed from: nt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0598nt implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7733;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.a80 f7734;

    public /* synthetic */ C0598nt(p000.a80 r1, int r2) {
            r0 = this;
            r0.f7733 = r2
            r0.f7734 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f7733
            s62 r1 = p000.s62.f9751
            a80 r6 = r6.f7734
            switch(r0) {
                case 0: goto L65;
                case 1: goto L5f;
                case 2: goto L55;
                default: goto L9;
            }
        L9:
            bv1 r0 = p000.bv1.f1853
            java.util.List r0 = p000.bv1.m1077()
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L17
            goto L41
        L17:
            java.util.Iterator r0 = r0.iterator()
            r2 = r3
        L1c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r0.next()
            ku1 r4 = (p000.ku1) r4
            java.lang.String r4 = r4.f6118
            java.lang.String r5 = "feed_right_control_hide_"
            java.lang.String r4 = r5.concat(r4)
            boolean r4 = p000.ui1.m5887(r4, r3)
            if (r4 == 0) goto L1c
            int r2 = r2 + 1
            if (r2 < 0) goto L3b
            goto L1c
        L3b:
            p000.AbstractC1021yh.m6916()
            r6 = 0
            throw r6
        L40:
            r3 = r2
        L41:
            if (r3 <= 0) goto L4c
            java.lang.String r0 = "已隐藏 "
            java.lang.String r2 = " 项"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r0, r3, r2)
            goto L4e
        L4c:
            java.lang.String r0 = "未隐藏"
        L4e:
            r6.invoke(r0)
            p000.bv1.m1078()
            return r1
        L55:
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = p000.bv1.m1041()
            r6.invoke(r0)
            return r1
        L5f:
            java.lang.String r0 = "已下载"
            r6.invoke(r0)
            return r1
        L65:
            java.util.concurrent.CopyOnWriteArraySet r0 = p000.C0810st.f10021
            r0.remove(r6)
            return r1
    }
}
