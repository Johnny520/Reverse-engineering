package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f505g;

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f505g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f505g
            switch(r0) {
                case 0: goto L11e;
                case 1: goto L107;
                case 2: goto Le8;
                case 3: goto Ldb;
                case 4: goto Lcb;
                case 5: goto Lbb;
                case 6: goto Lb2;
                case 7: goto L95;
                case 8: goto L58;
                case 9: goto L4b;
                case 10: goto L3e;
                case 11: goto L2b;
                default: goto L5;
            }
        L5:
            x1.f0 r6 = (x1.f0) r6
            x1.f0 r7 = (x1.f0) r7
            x1.j0 r0 = r6.M
            x1.v0 r0 = r0.f20966p
            float r0 = r0.K
            x1.j0 r1 = r7.M
            x1.v0 r1 = r1.f20966p
            float r1 = r1.K
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L26
            int r6 = r6.v()
            int r7 = r7.v()
            int r6 = gg.l.c(r6, r7)
            goto L2a
        L26:
            int r6 = java.lang.Float.compare(r0, r1)
        L2a:
            return r6
        L2b:
            r7.s r6 = (r7.s) r6
            r7.s r7 = (r7.s) r7
            int r0 = r6.S(r7)
            if (r0 != 0) goto L3d
            int r6 = r6.f7388g
            int r7 = r7.f7388g
            int r0 = y7.a.e(r6, r7)
        L3d:
            return r0
        L3e:
            r.q r6 = (r.q) r6
            r.q r7 = (r.q) r7
            int r6 = r6.f11236a
            int r7 = r7.f11236a
            int r6 = gg.l.c(r6, r7)
            return r6
        L4b:
            s.d1 r6 = (s.d1) r6
            s.d1 r7 = (s.d1) r7
            int r7 = r7.f11999a
            int r6 = r6.f11999a
            int r6 = gg.l.c(r7, r6)
            return r6
        L58:
            android.speech.tts.Voice r6 = (android.speech.tts.Voice) r6
            android.speech.tts.Voice r7 = (android.speech.tts.Voice) r7
            java.util.Comparator r0 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.getClass()
            java.util.Locale r1 = r6.getLocale()
            r2 = 0
            if (r1 == 0) goto L6d
            java.lang.String r1 = r1.toLanguageTag()
            goto L6e
        L6d:
            r1 = r2
        L6e:
            java.lang.String r3 = ""
            if (r1 != 0) goto L73
            r1 = r3
        L73:
            java.util.Locale r4 = r7.getLocale()
            if (r4 == 0) goto L7d
            java.lang.String r2 = r4.toLanguageTag()
        L7d:
            if (r2 != 0) goto L80
            goto L81
        L80:
            r3 = r2
        L81:
            int r1 = r0.compare(r1, r3)
            if (r1 == 0) goto L88
            goto L94
        L88:
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = r7.getName()
            int r1 = r0.compare(r6, r7)
        L94:
            return r1
        L95:
            nb.d r6 = (nb.d) r6
            nb.d r7 = (nb.d) r7
            java.util.Comparator r0 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.getClass()
            java.lang.String r1 = r6.f9227b
            java.lang.String r2 = r7.f9227b
            int r1 = r0.compare(r1, r2)
            if (r1 == 0) goto La9
            goto Lb1
        La9:
            java.lang.String r6 = r6.f9226a
            java.lang.String r7 = r7.f9226a
            int r1 = r0.compare(r6, r7)
        Lb1:
            return r1
        Lb2:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            int r6 = r6.compareTo(r7)
            return r6
        Lbb:
            ae.h r6 = (ae.h) r6
            ae.h r7 = (ae.h) r7
            if (r6 != r7) goto Lc3
            r6 = 0
            goto Lca
        Lc3:
            ae.h r6 = r6.f246j
            if (r6 != r7) goto Lc9
            r6 = 1
            goto Lca
        Lc9:
            r6 = -1
        Lca:
            return r6
        Lcb:
            lg.d r6 = (lg.d) r6
            lg.d r7 = (lg.d) r7
            int r0 = r6.f8043h
            int r6 = r6.f8042g
            int r0 = r0 - r6
            int r6 = r7.f8043h
            int r7 = r7.f8042g
            int r6 = r6 - r7
            int r0 = r0 - r6
            return r0
        Ldb:
            i0.n0 r6 = (i0.n0) r6
            i0.n0 r7 = (i0.n0) r7
            int r6 = r6.f5982b
            int r7 = r7.f5982b
            int r6 = gg.l.c(r6, r7)
            return r6
        Le8:
            byte[] r6 = (byte[]) r6
            byte[] r7 = (byte[]) r7
            int r0 = r6.length
            int r1 = r7.length
            if (r0 == r1) goto Lf4
            int r6 = r6.length
            int r7 = r7.length
            int r6 = r6 - r7
            goto L106
        Lf4:
            r0 = 0
            r1 = r0
        Lf6:
            int r2 = r6.length
            if (r1 >= r2) goto L105
            r2 = r6[r1]
            r3 = r7[r1]
            if (r2 == r3) goto L102
            int r6 = r2 - r3
            goto L106
        L102:
            int r1 = r1 + 1
            goto Lf6
        L105:
            r6 = r0
        L106:
            return r6
        L107:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r6 = r6.getKey()
            d6.i r6 = (d6.i) r6
            java.lang.Object r7 = r7.getKey()
            d6.i r7 = (d6.i) r7
            d6.e r0 = d6.i.f2022e
            int r6 = r0.compare(r6, r7)
            return r6
        L11e:
            b8.d r6 = (b8.d) r6
            b8.d r7 = (b8.d) r7
            java.lang.String r6 = r6.f506h
            java.lang.String r7 = r7.f506h
            int r6 = y7.a.c(r6, r7)
            return r6
    }
}
