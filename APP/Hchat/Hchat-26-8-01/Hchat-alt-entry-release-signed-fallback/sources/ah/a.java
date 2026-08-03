package ah;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements j8.m, f8.d, g1.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f252g;

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.f252g = r1
            r0.<init>()
            return
    }

    public static /* synthetic */ void d() {
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void e(int r1, int r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = ", char "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void f(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r2)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void g(int r2, java.lang.String r3) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void h(java.lang.Object r1) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void i(java.lang.Object r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void j(java.lang.Object r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            r1.append(r4)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void k(java.lang.String r1) {
            af.g r0 = new af.g
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void l(java.lang.String r1, int r2, int r3, java.lang.Object r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", offset "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void m(java.lang.String r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void n(java.lang.String r2, java.lang.Object r3, java.lang.Object r4, java.lang.Throwable r5) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2, r5)
            throw r0
    }

    public static /* synthetic */ void o(java.lang.String r1, java.lang.Object r2, java.lang.Throwable r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            r2.<init>(r1, r3)
            throw r2
    }

    public static /* synthetic */ void p(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
    }

    public static /* synthetic */ void q(java.lang.String r0, java.lang.Object[] r1) {
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ void r(java.lang.StringBuilder r0, java.lang.Object r1) {
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ void s(java.lang.StringBuilder r0, java.lang.Object r1, java.lang.Object r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ void t(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void u(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "For input string: \""
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "\""
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void v(java.lang.Object r2, java.lang.String r3) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void w(java.lang.String r1) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void x(java.lang.String r1, java.lang.Throwable r2) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            r0.<init>(r1, r2)
            throw r0
    }

    public static /* synthetic */ void y(int r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            r2.<init>(r1)
            throw r2
    }

    @Override // j8.m
    public void a(java.lang.String r1) {
            r0 = this;
            h.Hchat.ModuleEntry.b(r1)
            return
    }

    @Override // f8.d
    public void b(java.lang.Object r2) {
            r1 = this;
            f8.g r2 = (f8.g) r2
            eb.k r0 = eb.k.f2567a
            h.Hchat.hooks.items.script.ScriptMessageBean r0 = new h.Hchat.hooks.items.script.ScriptMessageBean
            r2.getClass()
            r0.<init>(r2)
            eb.k.i(r0)
            return
    }

    @Override // g1.j
    public double c(double r5) {
            r4 = this;
            int r0 = r4.f252g
            switch(r0) {
                case 28: goto L38;
                default: goto L5;
            }
        L5:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto Ld
            double r0 = -r5
            goto Le
        Ld:
            r0 = r5
        Le:
            r2 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L2d
            r2 = 4606712849170623328(0x3fee54edcd0aeb60, double:0.9478672985781991)
            double r2 = r2 * r0
            r0 = 4587673935106099715(0x3faab1232f514a03, double:0.05213270142180095)
            double r2 = r2 + r0
            r0 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r0 = java.lang.Math.pow(r2, r0)
            goto L33
        L2d:
            r2 = 4590241633823995264(0x3fb3d0722149b580, double:0.07739938080495357)
            double r0 = r0 * r2
        L33:
            double r5 = java.lang.Math.copySign(r0, r5)
            return r5
        L38:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L40
            double r0 = -r5
            goto L41
        L40:
            r0 = r5
        L41:
            r2 = 4569365567241691235(0x3f69a5c61c57a063, double:0.0031308049535603718)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L60
            r2 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4587673935106099715(0x3faab1232f514a03, double:0.05213270142180095)
            double r0 = r0 - r2
            r2 = 4606712849170623328(0x3fee54edcd0aeb60, double:0.9478672985781991)
        L5e:
            double r0 = r0 / r2
            goto L66
        L60:
            r2 = 4590241633823995264(0x3fb3d0722149b580, double:0.07739938080495357)
            goto L5e
        L66:
            double r5 = java.lang.Math.copySign(r0, r5)
            return r5
    }

    public void z(nd.b0 r2, int r3) {
            r1 = this;
            int r0 = r1.f252g
            switch(r0) {
                case 25: goto Ld;
                case 26: goto L9;
                default: goto L5;
            }
        L5:
            be.e.i(r2, r3)
            return
        L9:
            be.e.i(r2, r3)
            return
        Ld:
            be.e.i(r2, r3)
            return
    }
}
