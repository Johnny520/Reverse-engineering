package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends u4.i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v4.c0 f13386o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v4.c0 f13387p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v4.c0 f13388q = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w4.e f13389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v4.y f13390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v4.y f13391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v4.a0 f13392n;

    static {
            v4.c0 r0 = new v4.c0
            java.lang.String r1 = "([Ljava/lang/Object;)Ljava/lang/Object;"
            r0.<init>(r1)
            u4.j.f13386o = r0
            v4.c0 r0 = new v4.c0
            java.lang.String r1 = "([Ljava/lang/Object;)V"
            r0.<init>(r1)
            u4.j.f13387p = r0
            v4.c0 r0 = new v4.c0
            java.lang.String r1 = "([Ljava/lang/Object;)Z"
            r0.<init>(r1)
            u4.j.f13388q = r0
            return
    }

    public j(u4.r r5, u4.t r6, u4.p r7, w4.e r8, v4.y r9) {
            r4 = this;
            r0 = 0
            r4.<init>(r5, r6, r0, r7)
            int r5 = r5.f13410e
            r6 = 6
            if (r5 != r6) goto L244
            if (r8 == 0) goto L23e
            r4.f13389k = r8
            if (r9 == 0) goto L238
            boolean r5 = r9.k()
            if (r5 == 0) goto L232
            r4.f13390l = r9
            v4.d0 r5 = r9.f14125g
            v4.z r7 = r9.f14126h
            v4.c0 r7 = r7.f14131g
            java.lang.String r8 = r7.f14067g
            v4.d0 r1 = v4.d0.B
            boolean r1 = r5.equals(r1)
            v4.c0 r2 = u4.j.f13386o
            if (r1 == 0) goto L45
            java.lang.String r1 = "invoke"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L39
            java.lang.String r1 = "invokeExact"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L45
        L39:
            v4.z r6 = new v4.z
            r6.<init>(r7, r2)
            v4.y r7 = new v4.y
            r7.<init>(r5, r6)
            goto L218
        L45:
            v4.d0 r1 = v4.d0.C
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L224
            r8.getClass()
            int r1 = r8.hashCode()
            r3 = -1
            switch(r1) {
                case -1946504908: goto L1e5;
                case -1686727776: goto L1d9;
                case -1671098288: goto L1cd;
                case -1292078254: goto L1c1;
                case -1117944904: goto L1b5;
                case -1103072857: goto L1a9;
                case -1032914329: goto L19f;
                case -1032892181: goto L193;
                case -794517348: goto L186;
                case -567150350: goto L178;
                case -240822786: goto L16a;
                case -230706875: goto L15c;
                case -127361888: goto L14e;
                case -37641530: goto L140;
                case 102230: goto L132;
                case 113762: goto L124;
                case 93645315: goto L116;
                case 101293086: goto L108;
                case 189872914: goto Lfa;
                case 282707520: goto Lec;
                case 282724865: goto Lde;
                case 353422447: goto Ld0;
                case 470702883: goto Lc3;
                case 685319959: goto Lb6;
                case 748071969: goto La9;
                case 937077366: goto L9c;
                case 1245632875: goto L8f;
                case 1352153939: goto L82;
                case 1483964149: goto L75;
                case 2002508693: goto L68;
                case 2013994287: goto L5b;
                default: goto L58;
            }
        L58:
            r6 = r3
            goto L1f0
        L5b:
            java.lang.String r6 = "weakCompareAndSetRelease"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L64
            goto L58
        L64:
            r6 = 30
            goto L1f0
        L68:
            java.lang.String r6 = "getAndSetAcquire"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L71
            goto L58
        L71:
            r6 = 29
            goto L1f0
        L75:
            java.lang.String r6 = "compareAndExchange"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L7e
            goto L58
        L7e:
            r6 = 28
            goto L1f0
        L82:
            java.lang.String r6 = "getAndBitwiseOr"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L8b
            goto L58
        L8b:
            r6 = 27
            goto L1f0
        L8f:
            java.lang.String r6 = "getAndBitwiseXorAcquire"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L98
            goto L58
        L98:
            r6 = 26
            goto L1f0
        L9c:
            java.lang.String r6 = "getAndAddAcquire"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto La5
            goto L58
        La5:
            r6 = 25
            goto L1f0
        La9:
            java.lang.String r6 = "compareAndExchangeAcquire"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto Lb2
            goto L58
        Lb2:
            r6 = 24
            goto L1f0
        Lb6:
            java.lang.String r6 = "getOpaque"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto Lbf
            goto L58
        Lbf:
            r6 = 23
            goto L1f0
        Lc3:
            java.lang.String r6 = "setOpaque"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto Lcc
            goto L58
        Lcc:
            r6 = 22
            goto L1f0
        Ld0:
            java.lang.String r6 = "getAndBitwiseAndAcquire"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto Lda
            goto L58
        Lda:
            r6 = 21
            goto L1f0
        Lde:
            java.lang.String r6 = "getAndSet"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto Le8
            goto L58
        Le8:
            r6 = 20
            goto L1f0
        Lec:
            java.lang.String r6 = "getAndAdd"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto Lf6
            goto L58
        Lf6:
            r6 = 19
            goto L1f0
        Lfa:
            java.lang.String r6 = "getVolatile"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L104
            goto L58
        L104:
            r6 = 18
            goto L1f0
        L108:
            java.lang.String r6 = "setVolatile"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L112
            goto L58
        L112:
            r6 = 17
            goto L1f0
        L116:
            java.lang.String r6 = "getAndBitwiseOrAcquire"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L120
            goto L58
        L120:
            r6 = 16
            goto L1f0
        L124:
            java.lang.String r6 = "set"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L12e
            goto L58
        L12e:
            r6 = 15
            goto L1f0
        L132:
            java.lang.String r6 = "get"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L13c
            goto L58
        L13c:
            r6 = 14
            goto L1f0
        L140:
            java.lang.String r6 = "getAndSetRelease"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L14a
            goto L58
        L14a:
            r6 = 13
            goto L1f0
        L14e:
            java.lang.String r6 = "getAcquire"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L158
            goto L58
        L158:
            r6 = 12
            goto L1f0
        L15c:
            java.lang.String r6 = "setRelease"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L166
            goto L58
        L166:
            r6 = 11
            goto L1f0
        L16a:
            java.lang.String r6 = "weakCompareAndSetAcquire"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L174
            goto L58
        L174:
            r6 = 10
            goto L1f0
        L178:
            java.lang.String r6 = "weakCompareAndSetPlain"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L182
            goto L58
        L182:
            r6 = 9
            goto L1f0
        L186:
            java.lang.String r6 = "getAndBitwiseXorRelease"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L190
            goto L58
        L190:
            r6 = 8
            goto L1f0
        L193:
            java.lang.String r6 = "getAndBitwiseXor"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L19d
            goto L58
        L19d:
            r6 = 7
            goto L1f0
        L19f:
            java.lang.String r1 = "getAndBitwiseAnd"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L1f0
            goto L58
        L1a9:
            java.lang.String r6 = "getAndAddRelease"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L1b3
            goto L58
        L1b3:
            r6 = 5
            goto L1f0
        L1b5:
            java.lang.String r6 = "weakCompareAndSet"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L1bf
            goto L58
        L1bf:
            r6 = 4
            goto L1f0
        L1c1:
            java.lang.String r6 = "compareAndExchangeRelease"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L1cb
            goto L58
        L1cb:
            r6 = 3
            goto L1f0
        L1cd:
            java.lang.String r6 = "compareAndSet"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L1d7
            goto L58
        L1d7:
            r6 = 2
            goto L1f0
        L1d9:
            java.lang.String r6 = "getAndBitwiseAndRelease"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L1e3
            goto L58
        L1e3:
            r6 = 1
            goto L1f0
        L1e5:
            java.lang.String r6 = "getAndBitwiseOrRelease"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L1ef
            goto L58
        L1ef:
            r6 = 0
        L1f0:
            switch(r6) {
                case 0: goto L20e;
                case 1: goto L20e;
                case 2: goto L201;
                case 3: goto L20e;
                case 4: goto L201;
                case 5: goto L20e;
                case 6: goto L20e;
                case 7: goto L20e;
                case 8: goto L20e;
                case 9: goto L201;
                case 10: goto L201;
                case 11: goto L1f4;
                case 12: goto L20e;
                case 13: goto L20e;
                case 14: goto L20e;
                case 15: goto L1f4;
                case 16: goto L20e;
                case 17: goto L1f4;
                case 18: goto L20e;
                case 19: goto L20e;
                case 20: goto L20e;
                case 21: goto L20e;
                case 22: goto L1f4;
                case 23: goto L20e;
                case 24: goto L20e;
                case 25: goto L20e;
                case 26: goto L20e;
                case 27: goto L20e;
                case 28: goto L20e;
                case 29: goto L20e;
                case 30: goto L201;
                default: goto L1f3;
            }
        L1f3:
            goto L224
        L1f4:
            v4.z r6 = new v4.z
            v4.c0 r8 = u4.j.f13387p
            r6.<init>(r7, r8)
            v4.y r7 = new v4.y
            r7.<init>(r5, r6)
            goto L218
        L201:
            v4.z r6 = new v4.z
            v4.c0 r8 = u4.j.f13388q
            r6.<init>(r7, r8)
            v4.y r7 = new v4.y
            r7.<init>(r5, r6)
            goto L218
        L20e:
            v4.z r6 = new v4.z
            r6.<init>(r7, r2)
            v4.y r7 = new v4.y
            r7.<init>(r5, r6)
        L218:
            r4.f13391m = r7
            v4.a0 r5 = new v4.a0
            w4.a r6 = r9.f14090i
            r5.<init>(r6)
            r4.f13392n = r5
            return
        L224:
            java.lang.String r5 = r9.a()
            java.lang.String r6 = "Unknown signature polymorphic method: "
            java.lang.String r5 = r6.concat(r5)
            j8.o.t(r5)
            throw r0
        L232:
            java.lang.String r5 = "callSiteMethod is not signature polymorphic"
            j8.o.t(r5)
            throw r0
        L238:
            java.lang.String r5 = "callSiteMethod == null"
            bsh.j.c(r5)
            throw r0
        L23e:
            java.lang.String r5 = "catches == null"
            bsh.j.c(r5)
            throw r0
        L244:
            java.lang.String r6 = "opcode with invalid branchingness: "
            java.lang.String r5 = eh.a.l(r5, r6)
            j8.o.t(r5)
            throw r0
    }

    @Override // u4.i
    public final void d(u4.h r1) {
            r0 = this;
            r1.j(r0)
            return
    }

    @Override // u4.i
    public final w4.e e() {
            r1 = this;
            w4.e r0 = r1.f13389k
            return r0
    }

    @Override // u4.i
    public final java.lang.String h() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v4.y r1 = r3.f13391m
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            v4.a0 r2 = r3.f13392n
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r0.append(r1)
            w4.e r1 = r3.f13389k
            java.lang.String r1 = u4.u.j(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // u4.i
    public final u4.i i(w4.c r7) {
            r6 = this;
            u4.j r0 = new u4.j
            w4.e r1 = r6.f13389k
            w4.e r4 = r1.d(r7)
            v4.y r5 = r6.f13390l
            u4.r r1 = r6.f13382g
            u4.t r2 = r6.f13383h
            u4.p r3 = r6.f13385j
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
