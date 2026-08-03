package a9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101g;

    public /* synthetic */ h(int r1) {
            r0 = this;
            r0.f101g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f101g
            switch(r0) {
                case 0: goto L28e;
                case 1: goto L281;
                case 2: goto L274;
                case 3: goto L267;
                case 4: goto L25a;
                case 5: goto L24d;
                case 6: goto L238;
                case 7: goto L21f;
                case 8: goto L20a;
                case 9: goto L1f5;
                case 10: goto L1e0;
                case 11: goto L1c2;
                case 12: goto L1a4;
                case 13: goto L186;
                case 14: goto L168;
                case 15: goto L14a;
                case 16: goto L12c;
                case 17: goto L112;
                case 18: goto Lf7;
                case 19: goto Le2;
                case 20: goto Lc5;
                case 21: goto Lbc;
                case 22: goto Lab;
                case 23: goto L90;
                case 24: goto L7b;
                case 25: goto L62;
                case 26: goto L49;
                case 27: goto L30;
                case 28: goto L1f;
                default: goto L5;
            }
        L5:
            r4.a r3 = (r4.a) r3
            r4.a r4 = (r4.a) r4
            r4.s0 r3 = r3.f11353l
            int r3 = r3.e()
            r4.s0 r4 = r4.f11353l
            int r4 = r4.e()
            if (r3 >= r4) goto L19
            r3 = -1
            goto L1e
        L19:
            if (r3 <= r4) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            return r3
        L1f:
            sf.j r4 = (sf.j) r4
            java.lang.Object r4 = r4.f12430i
            java.lang.Integer r4 = (java.lang.Integer) r4
            sf.j r3 = (sf.j) r3
            java.lang.Object r3 = r3.f12430i
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = a7.a.m(r4, r3)
            return r3
        L30:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r4.compareTo(r3)
            return r3
        L49:
            h.Hchat.hooks.api.model.WeChatSnsPost r4 = (h.Hchat.hooks.api.model.WeChatSnsPost) r4
            long r0 = r4.getCreateTimeSeconds()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            h.Hchat.hooks.api.model.WeChatSnsPost r3 = (h.Hchat.hooks.api.model.WeChatSnsPost) r3
            long r0 = r3.getCreateTimeSeconds()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            int r3 = r4.compareTo(r3)
            return r3
        L62:
            h.Hchat.hooks.api.model.WeChatSnsPost r4 = (h.Hchat.hooks.api.model.WeChatSnsPost) r4
            long r0 = r4.getCreateTimeSeconds()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            h.Hchat.hooks.api.model.WeChatSnsPost r3 = (h.Hchat.hooks.api.model.WeChatSnsPost) r3
            long r0 = r3.getCreateTimeSeconds()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            int r3 = r4.compareTo(r3)
            return r3
        L7b:
            p8.i r3 = (p8.i) r3
            int r3 = r3.f10374d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            p8.i r4 = (p8.i) r4
            int r4 = r4.f10374d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = r3.compareTo(r4)
            return r3
        L90:
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r4.compareTo(r3)
            return r3
        Lab:
            sf.j r4 = (sf.j) r4
            java.lang.Object r4 = r4.f12430i
            java.lang.Integer r4 = (java.lang.Integer) r4
            sf.j r3 = (sf.j) r3
            java.lang.Object r3 = r3.f12430i
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = a7.a.m(r4, r3)
            return r3
        Lbc:
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r3 = r3.compareTo(r4)
            return r3
        Lc5:
            wb.jv r3 = (wb.jv) r3
            java.lang.String r3 = r3.f17141b
            java.util.Locale r0 = java.util.Locale.CHINA
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            wb.jv r4 = (wb.jv) r4
            java.lang.String r4 = r4.f17141b
            r0.getClass()
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r3 = r3.compareTo(r4)
            return r3
        Le2:
            hb.t r3 = (hb.t) r3
            long r0 = r3.f5469f
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            hb.t r4 = (hb.t) r4
            long r0 = r4.f5469f
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            int r3 = r3.compareTo(r4)
            return r3
        Lf7:
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r4.compareTo(r3)
            return r3
        L112:
            eb.c0 r3 = (eb.c0) r3
            java.lang.String r3 = r3.f2506a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            eb.c0 r4 = (eb.c0) r4
            java.lang.String r4 = r4.f2506a
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r3 = r3.compareTo(r4)
            return r3
        L12c:
            eb.a0 r3 = (eb.a0) r3
            eb.c0 r3 = r3.f2486a
            java.lang.String r3 = r3.f2506a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            eb.a0 r4 = (eb.a0) r4
            eb.c0 r4 = r4.f2486a
            java.lang.String r4 = r4.f2506a
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r3 = r3.compareTo(r4)
            return r3
        L14a:
            eb.a0 r3 = (eb.a0) r3
            eb.c0 r3 = r3.f2486a
            java.lang.String r3 = r3.f2506a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            eb.a0 r4 = (eb.a0) r4
            eb.c0 r4 = r4.f2486a
            java.lang.String r4 = r4.f2506a
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r3 = r3.compareTo(r4)
            return r3
        L168:
            eb.a0 r3 = (eb.a0) r3
            eb.c0 r3 = r3.f2486a
            java.lang.String r3 = r3.f2506a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            eb.a0 r4 = (eb.a0) r4
            eb.c0 r4 = r4.f2486a
            java.lang.String r4 = r4.f2506a
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r3 = r3.compareTo(r4)
            return r3
        L186:
            eb.a0 r3 = (eb.a0) r3
            eb.c0 r3 = r3.f2486a
            java.lang.String r3 = r3.f2506a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            eb.a0 r4 = (eb.a0) r4
            eb.c0 r4 = r4.f2486a
            java.lang.String r4 = r4.f2506a
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r3 = r3.compareTo(r4)
            return r3
        L1a4:
            eb.a0 r3 = (eb.a0) r3
            eb.c0 r3 = r3.f2486a
            java.lang.String r3 = r3.f2506a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            eb.a0 r4 = (eb.a0) r4
            eb.c0 r4 = r4.f2486a
            java.lang.String r4 = r4.f2506a
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r3 = r3.compareTo(r4)
            return r3
        L1c2:
            eb.a0 r3 = (eb.a0) r3
            eb.c0 r3 = r3.f2486a
            java.lang.String r3 = r3.f2506a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            eb.a0 r4 = (eb.a0) r4
            eb.c0 r4 = r4.f2486a
            java.lang.String r4 = r4.f2506a
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            int r3 = r3.compareTo(r4)
            return r3
        L1e0:
            db.c r3 = (db.c) r3
            long r0 = r3.f2174g
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            db.c r4 = (db.c) r4
            long r0 = r4.f2174g
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            int r3 = r3.compareTo(r4)
            return r3
        L1f5:
            db.c r3 = (db.c) r3
            long r0 = r3.f2174g
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            db.c r4 = (db.c) r4
            long r0 = r4.f2174g
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            int r3 = r3.compareTo(r4)
            return r3
        L20a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r3 = a7.a.m(r3, r4)
            return r3
        L21f:
            da.e r3 = (da.e) r3
            da.d r3 = r3.f2148b
            int r3 = r3.f2146b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            da.e r4 = (da.e) r4
            da.d r4 = r4.f2148b
            int r4 = r4.f2146b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = r3.compareTo(r4)
            return r3
        L238:
            hb.t r3 = (hb.t) r3
            long r0 = r3.f5469f
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            hb.t r4 = (hb.t) r4
            long r0 = r4.f5469f
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            int r3 = r3.compareTo(r4)
            return r3
        L24d:
            hh.o r3 = (hh.o) r3
            java.lang.String r3 = r3.f5568j
            hh.o r4 = (hh.o) r4
            java.lang.String r4 = r4.f5568j
            int r3 = a7.a.m(r3, r4)
            return r3
        L25a:
            hh.l r3 = (hh.l) r3
            java.lang.String r3 = r3.f5559j
            hh.l r4 = (hh.l) r4
            java.lang.String r4 = r4.f5559j
            int r3 = a7.a.m(r3, r4)
            return r3
        L267:
            hh.i r3 = (hh.i) r3
            java.lang.String r3 = r3.f5542j
            hh.i r4 = (hh.i) r4
            java.lang.String r4 = r4.f5542j
            int r3 = a7.a.m(r3, r4)
            return r3
        L274:
            hh.o r3 = (hh.o) r3
            java.lang.String r3 = r3.f5568j
            hh.o r4 = (hh.o) r4
            java.lang.String r4 = r4.f5568j
            int r3 = a7.a.m(r3, r4)
            return r3
        L281:
            hh.i r3 = (hh.i) r3
            java.lang.String r3 = r3.f5542j
            hh.i r4 = (hh.i) r4
            java.lang.String r4 = r4.f5542j
            int r3 = a7.a.m(r3, r4)
            return r3
        L28e:
            sf.e r4 = (sf.e) r4
            java.lang.Object r4 = r4.f12418g
            java.lang.Integer r4 = (java.lang.Integer) r4
            sf.e r3 = (sf.e) r3
            java.lang.Object r3 = r3.f12418g
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = a7.a.m(r4, r3)
            return r3
    }
}
