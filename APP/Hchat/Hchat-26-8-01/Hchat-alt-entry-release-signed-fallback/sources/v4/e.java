package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends v4.w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w4.a f14090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w4.a f14091j;

    public e(v4.d0 r1, v4.z r2) {
            r0 = this;
            r0.<init>(r1, r2)
            v4.c0 r1 = r2.f14132h
            java.lang.String r1 = r1.f14067g
            boolean r2 = r0.k()
            if (r2 == 0) goto L14
            w4.a r1 = w4.a.b(r1)
            r0.f14090i = r1
            goto L1a
        L14:
            w4.a r1 = w4.a.d(r1)
            r0.f14090i = r1
        L1a:
            r1 = 0
            r0.f14091j = r1
            return
    }

    @Override // v4.w, v4.a
    public final int e(v4.a r2) {
            r1 = this;
            int r0 = super.e(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            v4.e r2 = (v4.e) r2
            w4.a r0 = r1.f14090i
            w4.a r2 = r2.f14090i
            int r2 = r0.a(r2)
            return r2
    }

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            w4.a r0 = r1.f14090i
            w4.c r0 = r0.f14844h
            return r0
    }

    public final boolean k() {
            r5 = this;
            v4.d0 r0 = v4.d0.B
            v4.d0 r1 = r5.f14125g
            boolean r0 = r1.equals(r0)
            r2 = 0
            r3 = 1
            v4.z r4 = r5.f14126h
            if (r0 == 0) goto L28
            v4.c0 r0 = r4.f14131g
            java.lang.String r0 = r0.f14067g
            r0.getClass()
            java.lang.String r1 = "invoke"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L27
            java.lang.String r1 = "invokeExact"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L1df
        L27:
            return r3
        L28:
            v4.d0 r0 = v4.d0.C
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1df
            v4.c0 r0 = r4.f14131g
            java.lang.String r0 = r0.f14067g
            r0.getClass()
            int r1 = r0.hashCode()
            r4 = -1
            switch(r1) {
                case -1946504908: goto L1d0;
                case -1686727776: goto L1c5;
                case -1671098288: goto L1ba;
                case -1292078254: goto L1af;
                case -1117944904: goto L1a4;
                case -1103072857: goto L199;
                case -1032914329: goto L18e;
                case -1032892181: goto L183;
                case -794517348: goto L175;
                case -567150350: goto L167;
                case -240822786: goto L159;
                case -230706875: goto L14b;
                case -127361888: goto L13d;
                case -37641530: goto L12f;
                case 102230: goto L121;
                case 113762: goto L113;
                case 93645315: goto L105;
                case 101293086: goto Lf7;
                case 189872914: goto Le9;
                case 282707520: goto Ldb;
                case 282724865: goto Lcd;
                case 353422447: goto Lbf;
                case 470702883: goto Lb1;
                case 685319959: goto La3;
                case 748071969: goto L95;
                case 937077366: goto L87;
                case 1245632875: goto L79;
                case 1352153939: goto L6b;
                case 1483964149: goto L5d;
                case 2002508693: goto L4f;
                case 2013994287: goto L41;
                default: goto L3f;
            }
        L3f:
            goto L1da
        L41:
            java.lang.String r1 = "weakCompareAndSetRelease"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L1da
        L4b:
            r4 = 30
            goto L1da
        L4f:
            java.lang.String r1 = "getAndSetAcquire"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L1da
        L59:
            r4 = 29
            goto L1da
        L5d:
            java.lang.String r1 = "compareAndExchange"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            goto L1da
        L67:
            r4 = 28
            goto L1da
        L6b:
            java.lang.String r1 = "getAndBitwiseOr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L75
            goto L1da
        L75:
            r4 = 27
            goto L1da
        L79:
            java.lang.String r1 = "getAndBitwiseXorAcquire"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L83
            goto L1da
        L83:
            r4 = 26
            goto L1da
        L87:
            java.lang.String r1 = "getAndAddAcquire"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L91
            goto L1da
        L91:
            r4 = 25
            goto L1da
        L95:
            java.lang.String r1 = "compareAndExchangeAcquire"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9f
            goto L1da
        L9f:
            r4 = 24
            goto L1da
        La3:
            java.lang.String r1 = "getOpaque"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lad
            goto L1da
        Lad:
            r4 = 23
            goto L1da
        Lb1:
            java.lang.String r1 = "setOpaque"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbb
            goto L1da
        Lbb:
            r4 = 22
            goto L1da
        Lbf:
            java.lang.String r1 = "getAndBitwiseAndAcquire"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc9
            goto L1da
        Lc9:
            r4 = 21
            goto L1da
        Lcd:
            java.lang.String r1 = "getAndSet"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld7
            goto L1da
        Ld7:
            r4 = 20
            goto L1da
        Ldb:
            java.lang.String r1 = "getAndAdd"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Le5
            goto L1da
        Le5:
            r4 = 19
            goto L1da
        Le9:
            java.lang.String r1 = "getVolatile"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf3
            goto L1da
        Lf3:
            r4 = 18
            goto L1da
        Lf7:
            java.lang.String r1 = "setVolatile"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L101
            goto L1da
        L101:
            r4 = 17
            goto L1da
        L105:
            java.lang.String r1 = "getAndBitwiseOrAcquire"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10f
            goto L1da
        L10f:
            r4 = 16
            goto L1da
        L113:
            java.lang.String r1 = "set"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L11d
            goto L1da
        L11d:
            r4 = 15
            goto L1da
        L121:
            java.lang.String r1 = "get"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12b
            goto L1da
        L12b:
            r4 = 14
            goto L1da
        L12f:
            java.lang.String r1 = "getAndSetRelease"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L139
            goto L1da
        L139:
            r4 = 13
            goto L1da
        L13d:
            java.lang.String r1 = "getAcquire"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L147
            goto L1da
        L147:
            r4 = 12
            goto L1da
        L14b:
            java.lang.String r1 = "setRelease"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L155
            goto L1da
        L155:
            r4 = 11
            goto L1da
        L159:
            java.lang.String r1 = "weakCompareAndSetAcquire"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L163
            goto L1da
        L163:
            r4 = 10
            goto L1da
        L167:
            java.lang.String r1 = "weakCompareAndSetPlain"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L171
            goto L1da
        L171:
            r4 = 9
            goto L1da
        L175:
            java.lang.String r1 = "getAndBitwiseXorRelease"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17f
            goto L1da
        L17f:
            r4 = 8
            goto L1da
        L183:
            java.lang.String r1 = "getAndBitwiseXor"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18c
            goto L1da
        L18c:
            r4 = 7
            goto L1da
        L18e:
            java.lang.String r1 = "getAndBitwiseAnd"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L197
            goto L1da
        L197:
            r4 = 6
            goto L1da
        L199:
            java.lang.String r1 = "getAndAddRelease"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a2
            goto L1da
        L1a2:
            r4 = 5
            goto L1da
        L1a4:
            java.lang.String r1 = "weakCompareAndSet"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1ad
            goto L1da
        L1ad:
            r4 = 4
            goto L1da
        L1af:
            java.lang.String r1 = "compareAndExchangeRelease"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b8
            goto L1da
        L1b8:
            r4 = 3
            goto L1da
        L1ba:
            java.lang.String r1 = "compareAndSet"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c3
            goto L1da
        L1c3:
            r4 = 2
            goto L1da
        L1c5:
            java.lang.String r1 = "getAndBitwiseAndRelease"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1ce
            goto L1da
        L1ce:
            r4 = r3
            goto L1da
        L1d0:
            java.lang.String r1 = "getAndBitwiseOrRelease"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d9
            goto L1da
        L1d9:
            r4 = r2
        L1da:
            switch(r4) {
                case 0: goto L1de;
                case 1: goto L1de;
                case 2: goto L1de;
                case 3: goto L1de;
                case 4: goto L1de;
                case 5: goto L1de;
                case 6: goto L1de;
                case 7: goto L1de;
                case 8: goto L1de;
                case 9: goto L1de;
                case 10: goto L1de;
                case 11: goto L1de;
                case 12: goto L1de;
                case 13: goto L1de;
                case 14: goto L1de;
                case 15: goto L1de;
                case 16: goto L1de;
                case 17: goto L1de;
                case 18: goto L1de;
                case 19: goto L1de;
                case 20: goto L1de;
                case 21: goto L1de;
                case 22: goto L1de;
                case 23: goto L1de;
                case 24: goto L1de;
                case 25: goto L1de;
                case 26: goto L1de;
                case 27: goto L1de;
                case 28: goto L1de;
                case 29: goto L1de;
                case 30: goto L1de;
                default: goto L1dd;
            }
        L1dd:
            goto L1df
        L1de:
            return r3
        L1df:
            return r2
    }
}
