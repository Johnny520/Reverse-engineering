package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements fg.s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f391g;

    public /* synthetic */ n(int r1) {
            r0 = this;
            r0.f391g = r1
            r0.<init>()
            return
    }

    @Override // fg.s
    public final java.lang.Object d(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r2 = this;
            int r0 = r2.f391g
            switch(r0) {
                case 0: goto Lbe;
                case 1: goto L51;
                default: goto L5;
            }
        L5:
            android.content.Context r3 = (android.content.Context) r3
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            i2.m0 r7 = (i2.m0) r7
            long r0 = r7.f6360a
            int r7 = i2.m0.f(r0)
            int r0 = i2.m0.e(r0)
            java.lang.CharSequence r6 = r6.subSequence(r7, r0)
            java.lang.String r6 = r6.toString()
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r0 = "android.intent.action.PROCESS_TEXT"
            android.content.Intent r7 = r7.setAction(r0)
            java.lang.String r0 = "text/plain"
            android.content.Intent r7 = r7.setType(r0)
            java.lang.String r0 = "android.intent.extra.PROCESS_TEXT_READONLY"
            android.content.Intent r5 = r7.putExtra(r0, r5)
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            java.lang.String r7 = r4.packageName
            java.lang.String r4 = r4.name
            android.content.Intent r4 = r5.setClassName(r7, r4)
            java.lang.String r5 = "android.intent.extra.PROCESS_TEXT"
            r4.putExtra(r5, r6)
            r3.startActivity(r4)
            sf.n r3 = sf.n.f12433a
            return r3
        L51:
            z.g r3 = (z.g) r3
            d0.d r4 = (d0.d) r4
            fg.a r5 = (fg.a) r5
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = r7 & 6
            if (r0 != 0) goto L77
            r0 = r7 & 8
            if (r0 != 0) goto L6c
            boolean r0 = r6.f(r3)
            goto L70
        L6c:
            boolean r0 = r6.h(r3)
        L70:
            if (r0 == 0) goto L74
            r0 = 4
            goto L75
        L74:
            r0 = 2
        L75:
            r0 = r0 | r7
            goto L78
        L77:
            r0 = r7
        L78:
            r1 = r7 & 48
            if (r1 != 0) goto L91
            r1 = r7 & 64
            if (r1 != 0) goto L85
            boolean r1 = r6.f(r4)
            goto L89
        L85:
            boolean r1 = r6.h(r4)
        L89:
            if (r1 == 0) goto L8e
            r1 = 32
            goto L90
        L8e:
            r1 = 16
        L90:
            r0 = r0 | r1
        L91:
            r7 = r7 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto La1
            boolean r7 = r6.h(r5)
            if (r7 == 0) goto L9e
            r7 = 256(0x100, float:3.59E-43)
            goto La0
        L9e:
            r7 = 128(0x80, float:1.8E-43)
        La0:
            r0 = r0 | r7
        La1:
            r7 = r0 & 1171(0x493, float:1.641E-42)
            r1 = 1170(0x492, float:1.64E-42)
            if (r7 == r1) goto La9
            r7 = 1
            goto Laa
        La9:
            r7 = 0
        Laa:
            r1 = r0 & 1
            boolean r7 = r6.S(r1, r7)
            if (r7 == 0) goto Lb8
            r7 = r0 & 1022(0x3fe, float:1.432E-42)
            b0.w.c(r3, r4, r5, r6, r7)
            goto Lbb
        Lb8:
            r6.V()
        Lbb:
            sf.n r3 = sf.n.f12433a
            return r3
        Lbe:
            z.g r3 = (z.g) r3
            d0.d r4 = (d0.d) r4
            fg.a r5 = (fg.a) r5
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = r7 & 6
            if (r0 != 0) goto Le4
            r0 = r7 & 8
            if (r0 != 0) goto Ld9
            boolean r0 = r6.f(r3)
            goto Ldd
        Ld9:
            boolean r0 = r6.h(r3)
        Ldd:
            if (r0 == 0) goto Le1
            r0 = 4
            goto Le2
        Le1:
            r0 = 2
        Le2:
            r0 = r0 | r7
            goto Le5
        Le4:
            r0 = r7
        Le5:
            r1 = r7 & 48
            if (r1 != 0) goto Lfe
            r1 = r7 & 64
            if (r1 != 0) goto Lf2
            boolean r1 = r6.f(r4)
            goto Lf6
        Lf2:
            boolean r1 = r6.h(r4)
        Lf6:
            if (r1 == 0) goto Lfb
            r1 = 32
            goto Lfd
        Lfb:
            r1 = 16
        Lfd:
            r0 = r0 | r1
        Lfe:
            r7 = r7 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L10e
            boolean r7 = r6.h(r5)
            if (r7 == 0) goto L10b
            r7 = 256(0x100, float:3.59E-43)
            goto L10d
        L10b:
            r7 = 128(0x80, float:1.8E-43)
        L10d:
            r0 = r0 | r7
        L10e:
            r7 = r0 & 1171(0x493, float:1.641E-42)
            r1 = 1170(0x492, float:1.64E-42)
            if (r7 == r1) goto L116
            r7 = 1
            goto L117
        L116:
            r7 = 0
        L117:
            r1 = r0 & 1
            boolean r7 = r6.S(r1, r7)
            if (r7 == 0) goto L125
            r7 = r0 & 1022(0x3fe, float:1.432E-42)
            b0.w.c(r3, r4, r5, r6, r7)
            goto L128
        L125:
            r6.V()
        L128:
            sf.n r3 = sf.n.f12433a
            return r3
    }
}
