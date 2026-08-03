package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge f5536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hh.i f5537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5538j;

    public g(hh.i r2, org.luckypray.dexkit.DexKitBridge r3, int r4) {
            r1 = this;
            r0 = 3
            r1.f5535g = r0
            r1.f5537i = r2
            r1.f5536h = r3
            r1.f5538j = r4
            r2 = 0
            r1.<init>(r2)
            return
    }

    public /* synthetic */ g(org.luckypray.dexkit.DexKitBridge r1, hh.i r2, int r3, int r4) {
            r0 = this;
            r0.f5535g = r4
            r0.f5536h = r1
            r0.f5537i = r2
            r0.f5538j = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r7 = this;
            int r0 = r7.f5535g
            int r1 = r7.f5538j
            org.luckypray.dexkit.DexKitBridge r2 = r7.f5536h
            hh.i r3 = r7.f5537i
            r4 = 0
            switch(r0) {
                case 0: goto L149;
                case 1: goto Ld9;
                case 2: goto L66;
                default: goto Lc;
            }
        Lc:
            java.lang.Integer r0 = r3.f5543k
            if (r0 == 0) goto L64
            int r0 = r0.intValue()
            long r0 = f1.n0.k(r1, r0)
            r3 = 1
            long[] r3 = new long[r3]
            r3[r4] = r0
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r5 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r2)
            byte[] r0 = bh.a.a(r0, r5, r3)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r3 = j8.b.d(r0, r3)
            int r5 = r0.position()
            int r5 = r5 + r3
            r1.c(r5, r0)
            hh.j r0 = new hh.j
            r0.<init>()
            int r3 = r1.l()
        L4a:
            if (r4 >= r3) goto L5d
            jh.d r5 = r1.i(r4)
            r5.getClass()
            hh.i r5 = f8.i.v(r2, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L4a
        L5d:
            java.lang.Object r0 = r0.a()
            hh.i r0 = (hh.i) r0
            goto L65
        L64:
            r0 = 0
        L65:
            return r0
        L66:
            java.util.ArrayList r0 = r3.f5545m
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = tf.n.e1(r0)
            r3.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L91
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            long r5 = f1.n0.k(r1, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.add(r5)
            goto L75
        L91:
            long[] r0 = tf.m.Q1(r3)
            bh.a r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r5 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r2)
            r1.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodByIds(r5, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r3 = j8.b.d(r0, r3)
            int r5 = r0.position()
            int r5 = r5 + r3
            r1.c(r5, r0)
            hh.p r0 = new hh.p
            r0.<init>()
            int r3 = r1.m()
        Lc5:
            if (r4 >= r3) goto Ld8
            jh.p r5 = r1.o(r4)
            r5.getClass()
            hh.o r5 = g4.a.p(r2, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto Lc5
        Ld8:
            return r0
        Ld9:
            java.util.ArrayList r0 = r3.f5544l
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = tf.n.e1(r0)
            r3.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        Le8:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L104
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            long r5 = f1.n0.k(r1, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.add(r5)
            goto Le8
        L104:
            long[] r0 = tf.m.Q1(r3)
            bh.a r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r5 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r2)
            byte[] r0 = bh.a.a(r1, r5, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r3 = j8.b.d(r0, r3)
            int r5 = r0.position()
            int r5 = r5 + r3
            r1.c(r5, r0)
            hh.j r0 = new hh.j
            r0.<init>()
            int r3 = r1.l()
        L135:
            if (r4 >= r3) goto L148
            jh.d r5 = r1.i(r4)
            r5.getClass()
            hh.i r5 = f8.i.v(r2, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L135
        L148:
            return r0
        L149:
            java.util.ArrayList r0 = r3.f5546n
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = tf.n.e1(r0)
            r3.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L158:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L174
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            long r5 = f1.n0.k(r1, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.add(r5)
            goto L158
        L174:
            long[] r0 = tf.m.Q1(r3)
            bh.a r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r5 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r2)
            r1.getClass()
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldByIds(r5, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r3 = j8.b.d(r0, r3)
            int r5 = r0.position()
            int r5 = r5 + r3
            r1.c(r5, r0)
            hh.m r0 = new hh.m
            r0.<init>()
            r3 = 4
            int r3 = r1.b(r3)
            if (r3 == 0) goto L1b0
            int r3 = r1.f(r3)
            goto L1b1
        L1b0:
            r3 = r4
        L1b1:
            if (r4 >= r3) goto L1c4
            jh.o r5 = r1.j(r4)
            r5.getClass()
            hh.l r5 = fb.v0.r(r2, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L1b1
        L1c4:
            return r0
    }
}
