package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9624g;

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f9624g = r1
            r0.<init>()
            return
    }

    public /* synthetic */ e(int r1, r.p r2) {
            r0 = this;
            r1 = 28
            r0.f9624g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f9624g
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L157;
                case 1: goto L150;
                case 2: goto L13e;
                case 3: goto L137;
                case 4: goto L125;
                case 5: goto L120;
                case 6: goto L11b;
                case 7: goto L116;
                case 8: goto L111;
                case 9: goto L109;
                case 10: goto Lff;
                case 11: goto Lf7;
                case 12: goto Le3;
                case 13: goto Ld5;
                case 14: goto Lc7;
                case 15: goto Lb9;
                case 16: goto Lac;
                case 17: goto La5;
                case 18: goto L93;
                case 19: goto L8c;
                case 20: goto L7a;
                case 21: goto L6d;
                case 22: goto L61;
                case 23: goto L59;
                case 24: goto L51;
                case 25: goto L47;
                case 26: goto L41;
                case 27: goto L25;
                case 28: goto L20;
                default: goto L8;
            }
        L8:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r5.getClass()
            android.os.Handler r0 = r8.e.f11615a
            java.lang.Object r5 = r5.getValue()
            r8.d r5 = (r8.d) r5
            r8.c r5 = r5.f11608b
            boolean r5 = r8.e.b(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L20:
            s.z0 r5 = (s.z0) r5
            sf.n r5 = sf.n.f12433a
            return r5
        L25:
            java.util.List r5 = (java.util.List) r5
            r.z r0 = new r.z
            java.lang.Object r1 = r5.get(r3)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0.<init>(r1, r5)
            return r0
        L41:
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            return r1
        L47:
            wf.e r5 = (wf.e) r5
            boolean r0 = r5 instanceof qg.p
            if (r0 == 0) goto L50
            r1 = r5
            qg.p r1 = (qg.p) r1
        L50:
            return r1
        L51:
            qb.i r5 = (qb.i) r5
            r5.getClass()
            java.lang.String r5 = r5.f10829a
            return r5
        L59:
            qb.i r5 = (qb.i) r5
            r5.getClass()
            java.lang.String r5 = r5.f10829a
            return r5
        L61:
            qb.i r5 = (qb.i) r5
            r5.getClass()
            boolean r5 = r5.f10831c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L6d:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String r5 = java.util.regex.Pattern.quote(r5)
            r5.getClass()
            return r5
        L7a:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r5 = r5.length()
            if (r5 <= 0) goto L86
            goto L87
        L86:
            r2 = r3
        L87:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L8c:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        L93:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r5 = r5.length()
            if (r5 <= 0) goto L9f
            goto La0
        L9f:
            r2 = r3
        La0:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        La5:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        Lac:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.String r5 = r5.toGenericString()
            r5.getClass()
            return r5
        Lb9:
            java.lang.Class r5 = (java.lang.Class) r5
            r5.getClass()
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredConstructors(r5)
            dg.n r5 = tf.m.m1(r5)
            return r5
        Lc7:
            java.lang.Class r5 = (java.lang.Class) r5
            r5.getClass()
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            dg.n r5 = tf.m.m1(r5)
            return r5
        Ld5:
            java.lang.Class r5 = (java.lang.Class) r5
            r5.getClass()
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            dg.n r5 = tf.m.m1(r5)
            return r5
        Le3:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            r5.getClass()
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.Class r5 = r5.getType()
            boolean r5 = r0.isAssignableFrom(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Lf7:
            p8.s r5 = (p8.s) r5
            r5.getClass()
            java.lang.String r5 = r5.f10414c
            return r5
        Lff:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            r5.getClass()
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r1)
            return r5
        L109:
            p8.l r5 = (p8.l) r5
            r5.getClass()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L111:
            p.s1 r5 = (p.s1) r5
            p.b r5 = r5.f9987a
            return r5
        L116:
            p.s1 r5 = (p.s1) r5
            p.b r5 = r5.f9991e
            return r5
        L11b:
            p.s1 r5 = (p.s1) r5
            p.b r5 = r5.f9989c
            return r5
        L120:
            p.s1 r5 = (p.s1) r5
            p.b r5 = r5.f9992f
            return r5
        L125:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r5 = r5.length()
            if (r5 <= 0) goto L131
            goto L132
        L131:
            r2 = r3
        L132:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L137:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        L13e:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r5 = r5.length()
            if (r5 <= 0) goto L14a
            goto L14b
        L14a:
            r2 = r3
        L14b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L150:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        L157:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String r5 = java.util.regex.Pattern.quote(r5)
            r5.getClass()
            return r5
    }
}
