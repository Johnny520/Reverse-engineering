package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z71 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12997;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.d81 f12998;

    public /* synthetic */ z71(p000.d81 r1, int r2) {
            r0 = this;
            r0.f12997 = r2
            r0.f12998 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f12997
            switch(r0) {
                case 0: goto L49;
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            java.util.List r0 = p000.w71.f11592
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6668(r0)
            d81 r5 = r5.f12998
            r5.f2957 = r0
            r1 = 0
            r5.f2958 = r1
            p000.e81.m1886(r0)
            r5.m1673()
            s62 r5 = p000.s62.f9751
            return r5
        L1b:
            d81 r5 = r5.f12998
            int r0 = r5.m1672()
            r1 = 1
            if (r0 > r1) goto L25
            goto L46
        L25:
            int r0 = r5.f2958
            r2 = 4
            int r0 = r0 * r2
            r3 = 0
        L2a:
            java.util.List r4 = r5.f2957
            if (r3 >= r2) goto L34
            r4.remove(r0)
            int r3 = r3 + 1
            goto L2a
        L34:
            p000.e81.m1886(r4)
            int r0 = r5.f2958
            int r2 = r5.m1672()
            int r2 = r2 - r1
            if (r0 <= r2) goto L41
            r0 = r2
        L41:
            r5.f2958 = r0
            r5.m1673()
        L46:
            s62 r5 = p000.s62.f9751
            return r5
        L49:
            d81 r5 = r5.f12998
            int r0 = r5.m1672()
            r1 = 6
            r2 = 0
            if (r0 < r1) goto L5f
            android.app.Activity r5 = r5.f2948
            java.lang.String r0 = "最多可添加 6 组"
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r2)
            r5.show()
            goto L82
        L5f:
            java.util.List r0 = r5.f2957
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 4
            r1.<init>(r3)
        L67:
            if (r2 >= r3) goto L71
            java.lang.String r4 = ""
            r1.add(r4)
            int r2 = r2 + 1
            goto L67
        L71:
            r0.addAll(r1)
            java.util.List r0 = r5.f2957
            p000.e81.m1886(r0)
            int r0 = r5.m1672()
            int r0 = r0 + (-1)
            r5.m1671(r0)
        L82:
            s62 r5 = p000.s62.f9751
            return r5
    }
}
