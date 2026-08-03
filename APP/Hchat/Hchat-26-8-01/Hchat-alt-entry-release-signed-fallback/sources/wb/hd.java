package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16552h;

    public /* synthetic */ hd(i0.a1 r1, int r2) {
            r0 = this;
            r0.f16551g = r2
            r0.f16552h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f16551g
            switch(r0) {
                case 0: goto L17a;
                case 1: goto L17a;
                case 2: goto L17a;
                case 3: goto L16e;
                case 4: goto L162;
                case 5: goto L12e;
                case 6: goto L122;
                case 7: goto Lee;
                case 8: goto Le2;
                case 9: goto Lae;
                case 10: goto La3;
                case 11: goto La3;
                case 12: goto La3;
                case 13: goto La3;
                case 14: goto La3;
                case 15: goto La3;
                case 16: goto La3;
                case 17: goto La3;
                case 18: goto L80;
                case 19: goto L75;
                case 20: goto L6a;
                case 21: goto L5f;
                case 22: goto L54;
                case 23: goto L49;
                case 24: goto L3e;
                case 25: goto L33;
                case 26: goto L28;
                case 27: goto L1d;
                case 28: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
        Lf:
            sf.n r6 = sf.n.f12433a
            return r6
        L12:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L1d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L28:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L33:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L3e:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L54:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L5f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L6a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L75:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L80:
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r6 = r9.e0.q(r6, r0, r1)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r0
            int r6 = ig.a.X(r6)
            float r6 = (float) r6
            float r6 = r6 / r0
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        La3:
            java.lang.String r6 = (java.lang.String) r6
            r0 = 19
        La7:
            i0.a1 r1 = r5.f16552h
            bc.e.r(r6, r6, r0, r1)
            goto Lf
        Lae:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
        Lbd:
            if (r2 >= r1) goto Ld7
            char r3 = r6.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 != 0) goto Ld1
            r4 = 46
            if (r3 == r4) goto Ld1
            r4 = 44
            if (r3 != r4) goto Ld4
        Ld1:
            r0.append(r3)
        Ld4:
            int r2 = r2 + 1
            goto Lbd
        Ld7:
            java.lang.String r6 = r0.toString()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        Le2:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        Lee:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
        Lfd:
            if (r2 >= r1) goto L117
            char r3 = r6.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 != 0) goto L111
            r4 = 46
            if (r3 == r4) goto L111
            r4 = 44
            if (r3 != r4) goto L114
        L111:
            r0.append(r3)
        L114:
            int r2 = r2 + 1
            goto Lfd
        L117:
            java.lang.String r6 = r0.toString()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L122:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L12e:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
        L13d:
            if (r2 >= r1) goto L157
            char r3 = r6.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 != 0) goto L151
            r4 = 46
            if (r3 == r4) goto L151
            r4 = 44
            if (r3 != r4) goto L154
        L151:
            r0.append(r3)
        L154:
            int r2 = r2 + 1
            goto L13d
        L157:
            java.lang.String r6 = r0.toString()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L162:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L16e:
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            i0.a1 r0 = r5.f16552h
            r0.setValue(r6)
            goto Lf
        L17a:
            java.lang.String r6 = (java.lang.String) r6
            r0 = 8
            goto La7
    }
}
