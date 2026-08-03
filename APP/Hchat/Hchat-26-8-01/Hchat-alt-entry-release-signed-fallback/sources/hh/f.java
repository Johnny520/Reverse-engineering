package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge f5532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5534j;

    public /* synthetic */ f(org.luckypray.dexkit.DexKitBridge r1, f1.n0 r2, int r3, int r4, int r5) {
            r0 = this;
            r0.f5531g = r5
            r0.f5532h = r1
            r0.f5533i = r3
            r0.f5534j = r4
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r11 = this;
            int r0 = r11.f5531g
            switch(r0) {
                case 0: goto L30e;
                case 1: goto L2bf;
                case 2: goto L270;
                case 3: goto L221;
                case 4: goto L1d2;
                case 5: goto L183;
                case 6: goto L134;
                case 7: goto L118;
                case 8: goto La6;
                case 9: goto L79;
                case 10: goto L21;
                default: goto L5;
            }
        L5:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r3 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodUsingStrings(r3, r0)
            java.util.List r0 = tf.l.L0(r0)
            return r0
        L21:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodUsingFields(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 4
            int r2 = r1.b(r2)
            r4 = 0
            if (r2 == 0) goto L64
            int r2 = r1.f(r2)
            goto L65
        L64:
            r2 = r4
        L65:
            if (r4 >= r2) goto L78
            jh.a r5 = r1.n(r4)
            r5.getClass()
            hh.q r5 = ig.a.p(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L65
        L78:
            return r0
        L79:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r3 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetParameterNames(r3, r0)
            if (r0 == 0) goto La4
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L9a:
            if (r3 >= r2) goto La5
            r4 = r0[r3]
            r1.add(r4)
            int r3 = r3 + 1
            goto L9a
        La4:
            r1 = 0
        La5:
            return r1
        La6:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetParameterAnnotations(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 4
            int r2 = r1.b(r2)
            r4 = 0
            if (r2 == 0) goto Le9
            int r2 = r1.f(r2)
            goto Lea
        Le9:
            r2 = r4
        Lea:
            r5 = r4
        Leb:
            if (r5 >= r2) goto L117
            jh.a r6 = r1.h(r5)
            r6.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r6.k()
            r9 = r4
        Lfe:
            if (r9 >= r8) goto L111
            jh.c r10 = r6.g(r9)
            r10.getClass()
            hh.a r10 = ac.p.s(r3, r10)
            r7.add(r10)
            int r9 = r9 + 1
            goto Lfe
        L111:
            r0.add(r7)
            int r5 = r5 + 1
            goto Leb
        L117:
            return r0
        L118:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r3 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            int[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodOpCodes(r3, r0)
            java.util.List r0 = tf.l.K0(r0)
            return r0
        L134:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetInvokeMethods(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            hh.p r0 = new hh.p
            r0.<init>()
            int r2 = r1.m()
            r4 = 0
        L16f:
            if (r4 >= r2) goto L182
            jh.p r5 = r1.o(r4)
            r5.getClass()
            hh.o r5 = g4.a.p(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L16f
        L182:
            return r0
        L183:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetCallMethods(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            hh.p r0 = new hh.p
            r0.<init>()
            int r2 = r1.m()
            r4 = 0
        L1be:
            if (r4 >= r2) goto L1d1
            jh.p r5 = r1.o(r4)
            r5.getClass()
            hh.o r5 = g4.a.p(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L1be
        L1d1:
            return r0
        L1d2:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodAnnotations(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r1.k()
            r4 = 0
        L20d:
            if (r4 >= r2) goto L220
            jh.c r5 = r1.g(r4)
            r5.getClass()
            hh.a r5 = ac.p.s(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L20d
        L220:
            return r0
        L221:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFieldPutMethods(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            hh.p r0 = new hh.p
            r0.<init>()
            int r2 = r1.m()
            r4 = 0
        L25c:
            if (r4 >= r2) goto L26f
            jh.p r5 = r1.o(r4)
            r5.getClass()
            hh.o r5 = g4.a.p(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L25c
        L26f:
            return r0
        L270:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFieldGetMethods(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            hh.p r0 = new hh.p
            r0.<init>()
            int r2 = r1.m()
            r4 = 0
        L2ab:
            if (r4 >= r2) goto L2be
            jh.p r5 = r1.o(r4)
            r5.getClass()
            hh.o r5 = g4.a.p(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L2ab
        L2be:
            return r0
        L2bf:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldAnnotations(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r1.k()
            r4 = 0
        L2fa:
            if (r4 >= r2) goto L30d
            jh.c r5 = r1.g(r4)
            r5.getClass()
            hh.a r5 = ac.p.s(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L2fa
        L30d:
            return r0
        L30e:
            int r0 = r11.f5533i
            int r1 = r11.f5534j
            long r0 = f1.n0.k(r0, r1)
            bh.a r2 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r3 = r11.f5532h
            long r4 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            r2.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassAnnotations(r4, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r4 = r0.position()
            int r4 = r4 + r2
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r1.k()
            r4 = 0
        L349:
            if (r4 >= r2) goto L35c
            jh.c r5 = r1.g(r4)
            r5.getClass()
            hh.a r5 = ac.p.s(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L349
        L35c:
            return r0
    }
}
