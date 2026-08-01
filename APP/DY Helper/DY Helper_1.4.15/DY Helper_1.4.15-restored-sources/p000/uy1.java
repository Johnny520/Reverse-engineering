package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy1 implements p000.g80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11028;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f11029;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f11030;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.p70 f11031;

    public /* synthetic */ uy1(java.lang.Object r1, android.app.Activity r2, p000.p70 r3, int r4) {
            r0 = this;
            r0.f11028 = r4
            r0.f11030 = r1
            r0.f11029 = r2
            r0.f11031 = r3
            r0.<init>()
            return
    }

    @Override // p000.g80
    /* JADX INFO: renamed from: ε */
    public final java.lang.Object mo183(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
            r12 = this;
            int r0 = r12.f11028
            s62 r1 = p000.s62.f9751
            r2 = 0
            p70 r3 = r12.f11031
            android.app.Activity r4 = r12.f11029
            java.lang.Object r12 = r12.f11030
            switch(r0) {
                case 0: goto L4a;
                default: goto Le;
            }
        Le:
            ly1 r12 = (p000.ly1) r12
            ty1 r3 = (p000.ty1) r3
            my1 r13 = (p000.my1) r13
            java.lang.String r14 = (java.lang.String) r14
            r0 = r15
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0 = r16
            rd r0 = (p000.C0757rd) r0
            r13.getClass()
            r14.getClass()
            ry1 r5 = p000.ry1.f9602
            java.lang.String r5 = r12.f6842
            java.lang.String r12 = r12.f6843
            if (r0 != 0) goto L30
            rd r0 = new rd
            r0.<init>()
        L30:
            p000.ry1.m5248(r5, r12, r13, r14, r0)
            p000.xa1.m6548()
            boolean r12 = p000.dd1.m1714()
            p000.dd1.m1716(r4, r12)
            java.lang.String r12 = "分组规则已保存"
            android.widget.Toast r12 = android.widget.Toast.makeText(r4, r12, r2)
            r12.show()
            r3.invoke()
            return r1
        L4a:
            ky1 r12 = (p000.ky1) r12
            cu1 r3 = (p000.cu1) r3
            my1 r13 = (p000.my1) r13
            java.lang.String r14 = (java.lang.String) r14
            r0 = r15
            java.lang.Integer r0 = (java.lang.Integer) r0
            r5 = r16
            rd r5 = (p000.C0757rd) r5
            java.util.LinkedHashSet r6 = p000.jz1.f5676
            r13.getClass()
            r14.getClass()
            ry1 r6 = p000.ry1.f9602
            p000.ry1.m5249(r12, r13)
            p000.xa1.m6548()
            if (r5 == 0) goto L9c
            long r6 = r12.f6323
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 <= 0) goto L9c
            java.util.Map r13 = p000.v81.m6126()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.Object r13 = r13.get(r8)
            sd r13 = (p000.C0794sd) r13
            if (r13 != 0) goto L88
            sd r13 = new sd
            r13.<init>(r6)
        L88:
            ip1 r6 = r5.f9337
            ip1 r7 = r5.f9338
            ip1 r5 = r5.f9339
            sd r13 = p000.C0794sd.m5468(r13, r6, r7, r5)
            p000.v81.m6133(r13)
            boolean r13 = p000.dd1.m1714()
            p000.dd1.m1716(r4, r13)
        L9c:
            p000.ry1.m5247(r12, r0)
            java.lang.String r13 = "custom_on"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto Lad
            r13 = 1
            p000.jz1.m3093(r4, r12, r13)
            goto L16d
        Lad:
            java.lang.String r13 = "custom_off"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto Lba
            p000.jz1.m3093(r4, r12, r2)
            goto L16d
        Lba:
            java.util.ArrayList r13 = p000.jz1.m3091()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        Lc7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lde
            java.lang.Object r0 = r13.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = p000.jz1.m3089(r12, r5)
            if (r5 != 0) goto Lc7
            r14.add(r0)
            goto Lc7
        Lde:
            java.lang.Object r12 = p000.ui1.f10844
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = p000.AbstractC1021yh.m6889(r14, r13)
            r12.<init>(r13)
            java.util.Iterator r13 = r14.iterator()
        Lef:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L107
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.CharSequence r14 = p000.q02.m4660(r14)
            java.lang.String r14 = r14.toString()
            r12.add(r14)
            goto Lef
        L107:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L110:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L127
            java.lang.Object r14 = r12.next()
            r0 = r14
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L110
            r13.add(r14)
            goto L110
        L127:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r13 = r13.iterator()
        L135:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L15c
            java.lang.Object r14 = r13.next()
            r0 = r14
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = p000.jz1.m3090(r0)
            boolean r7 = p000.q02.m4671(r6)
            if (r7 == 0) goto L152
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r6 = p000.AbstractC0602nx.m4134(r6, r0, r6)
        L152:
            boolean r0 = r12.add(r6)
            if (r0 == 0) goto L135
            r5.add(r14)
            goto L135
        L15c:
            r10 = 0
            r11 = 62
            java.lang.String r6 = "\n"
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r12 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = "spark_custom_renew_rules"
            p000.ui1.m5875(r13, r12)
        L16d:
            java.lang.String r12 = "人员续火与小火人配置已保存"
            android.widget.Toast r12 = android.widget.Toast.makeText(r4, r12, r2)
            r12.show()
            r3.invoke()
            return r1
    }
}
