package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class p4 extends p000.ya {

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public androidx.recyclerview.widget.RecyclerView f889;

    public p4(android.content.Context r3, int r4) {
            r2 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [9, 26, -32} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [106, 98, -108, -91, -96, 118} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            r2.<init>(r3, r4)
            return
    }

    @Override // p000.ya
    /* JADX INFO: renamed from: ۥۣ۟ */
    public final android.view.View mo120() {
            r12 = this;
            r0 = 0
            android.widget.LinearLayout r1 = r12.m481()     // Catch: java.lang.Exception -> Leb
            android.view.View r2 = r12.mo165()     // Catch: java.lang.Exception -> Leb
            if (r2 == 0) goto Le
            r1.addView(r2)     // Catch: java.lang.Exception -> Leb
        Le:
            java.util.List r2 = r12.mo281()     // Catch: java.lang.Exception -> Leb
            if (r2 == 0) goto L28
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Leb
        L18:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Leb
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Leb
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Exception -> Leb
            r1.addView(r3)     // Catch: java.lang.Exception -> Leb
            goto L18
        L28:
            androidx.recyclerview.widget.RecyclerView r2 = new androidx.recyclerview.widget.RecyclerView     // Catch: java.lang.Exception -> Leb
            android.content.Context r3 = r12.m484()     // Catch: java.lang.Exception -> Leb
            r2.<init>(r3)     // Catch: java.lang.Exception -> Leb
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch: java.lang.Exception -> Leb
            android.content.Context r4 = r12.m484()     // Catch: java.lang.Exception -> Leb
            r3.<init>(r4)     // Catch: java.lang.Exception -> Leb
            r2.setLayoutManager(r3)     // Catch: java.lang.Exception -> Leb
            ۟.j8 r3 = new ۟.j8     // Catch: java.lang.Exception -> Leb
            r3.<init>()     // Catch: java.lang.Exception -> Leb
            r2.addItemDecoration(r3)     // Catch: java.lang.Exception -> Leb
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> Leb
            r4 = -1
            r3.<init>(r4, r4)     // Catch: java.lang.Exception -> Leb
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.weight = r4     // Catch: java.lang.Exception -> Leb
            r2.setLayoutParams(r3)     // Catch: java.lang.Exception -> Leb
            r12.f889 = r2     // Catch: java.lang.Exception -> Leb
            ۟.r1 r3 = new ۟.r1     // Catch: java.lang.Exception -> Leb
            java.util.List r4 = r12.mo164()     // Catch: java.lang.Exception -> Leb
            r3.<init>(r4)     // Catch: java.lang.Exception -> Leb
            r2.setAdapter(r3)     // Catch: java.lang.Exception -> Leb
            androidx.recyclerview.widget.RecyclerView r2 = r12.f889     // Catch: java.lang.Exception -> Leb
            if (r2 == 0) goto L82
            r1.addView(r2)     // Catch: java.lang.Exception -> Leb
            java.util.List r2 = r12.mo163()     // Catch: java.lang.Exception -> Leb
            if (r2 == 0) goto L81
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Leb
        L71:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Leb
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Leb
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Exception -> Leb
            r1.addView(r3)     // Catch: java.lang.Exception -> Leb
            goto L71
        L81:
            return r1
        L82:
            r1 = 13
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> Leb
            r2 = 85
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> Leb
            r2 = -123(0xffffffffffffff85, float:NaN)
            r4 = 1
            r1[r4] = r2     // Catch: java.lang.Exception -> Leb
            r2 = -101(0xffffffffffffff9b, float:NaN)
            r5 = 2
            r1[r5] = r2     // Catch: java.lang.Exception -> Leb
            r2 = -86
            r6 = 3
            r1[r6] = r2     // Catch: java.lang.Exception -> Leb
            r2 = -85
            r7 = 4
            r1[r7] = r2     // Catch: java.lang.Exception -> Leb
            r2 = 62
            r8 = 5
            r1[r8] = r2     // Catch: java.lang.Exception -> Leb
            r2 = 84
            r9 = 6
            r1[r9] = r2     // Catch: java.lang.Exception -> Leb
            r2 = 7
            r10 = -78
            r1[r2] = r10     // Catch: java.lang.Exception -> Leb
            r2 = 8
            r10 = -116(0xffffffffffffff8c, float:NaN)
            r1[r2] = r10     // Catch: java.lang.Exception -> Leb
            r2 = 9
            r10 = -97
            r1[r2] = r10     // Catch: java.lang.Exception -> Leb
            r2 = 10
            r10 = -69
            r1[r2] = r10     // Catch: java.lang.Exception -> Leb
            r2 = 11
            r10 = 56
            r1[r2] = r10     // Catch: java.lang.Exception -> Leb
            r2 = 12
            r11 = 79
            r1[r2] = r11     // Catch: java.lang.Exception -> Leb
            byte[] r2 = new byte[r9]     // Catch: java.lang.Exception -> Leb
            r2[r3] = r10     // Catch: java.lang.Exception -> Leb
            r3 = -41
            r2[r4] = r3     // Catch: java.lang.Exception -> Leb
            r3 = -2
            r2[r5] = r3     // Catch: java.lang.Exception -> Leb
            r3 = -55
            r2[r6] = r3     // Catch: java.lang.Exception -> Leb
            r3 = -46
            r2[r7] = r3     // Catch: java.lang.Exception -> Leb
            r3 = 93
            r2[r8] = r3     // Catch: java.lang.Exception -> Leb
            java.lang.String r1 = p000.oa.m332(r1, r2)     // Catch: java.lang.Exception -> Leb
            p000.h4.m191(r1)     // Catch: java.lang.Exception -> Leb
            throw r0     // Catch: java.lang.Exception -> Leb
        Leb:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۥ */
    public abstract java.util.List<android.view.View> mo163();

    /* JADX INFO: renamed from: ۥ۟ۦ */
    public java.util.List<android.view.View> mo281() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۧ */
    public abstract java.util.List<p000.p0> mo164();

    /* JADX INFO: renamed from: ۥ۟ۨ */
    public abstract android.view.View mo165();
}
