package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge f5563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hh.o f5564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5565j;

    public /* synthetic */ n(org.luckypray.dexkit.DexKitBridge r1, hh.o r2, int r3, int r4) {
            r0 = this;
            r0.f5562g = r4
            r0.f5563h = r1
            r0.f5564i = r2
            r0.f5565j = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r7 = this;
            int r0 = r7.f5562g
            int r1 = r7.f5565j
            hh.o r2 = r7.f5564i
            org.luckypray.dexkit.DexKitBridge r3 = r7.f5563h
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto Lce;
                case 1: goto L5e;
                default: goto Ld;
            }
        Ld:
            int r0 = r2.f5569k
            long r0 = f1.n0.k(r1, r0)
            long[] r2 = new long[r5]
            r2[r4] = r0
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r5 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            byte[] r0 = bh.a.a(r0, r5, r2)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r5 = r0.position()
            int r5 = r5 + r2
            r1.c(r5, r0)
            hh.j r0 = new hh.j
            r0.<init>()
            int r2 = r1.l()
        L44:
            if (r4 >= r2) goto L57
            jh.d r5 = r1.i(r4)
            r5.getClass()
            hh.i r5 = f8.i.v(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L44
        L57:
            java.lang.Object r0 = r0.a()
            hh.i r0 = (hh.i) r0
            return r0
        L5e:
            java.util.ArrayList r0 = r2.f5570l
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = tf.n.e1(r0)
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L6d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L89
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            long r5 = f1.n0.k(r1, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2.add(r5)
            goto L6d
        L89:
            long[] r0 = tf.m.Q1(r2)
            bh.a r1 = org.luckypray.dexkit.DexKitBridge.Companion
            long r5 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            byte[] r0 = bh.a.a(r1, r5, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r5 = r0.position()
            int r5 = r5 + r2
            r1.c(r5, r0)
            hh.j r0 = new hh.j
            r0.<init>()
            int r2 = r1.l()
        Lba:
            if (r4 >= r2) goto Lcd
            jh.d r5 = r1.i(r4)
            r5.getClass()
            hh.i r5 = f8.i.v(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto Lba
        Lcd:
            return r0
        Lce:
            int r0 = r2.f5566h
            long r0 = f1.n0.k(r1, r0)
            long[] r2 = new long[r5]
            r2[r4] = r0
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r5 = org.luckypray.dexkit.DexKitBridge.access$getSafeToken(r3)
            byte[] r0 = bh.a.a(r0, r5, r2)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            jh.a r1 = new jh.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r2 = j8.b.d(r0, r2)
            int r5 = r0.position()
            int r5 = r5 + r2
            r1.c(r5, r0)
            hh.j r0 = new hh.j
            r0.<init>()
            int r2 = r1.l()
        L105:
            if (r4 >= r2) goto L118
            jh.d r5 = r1.i(r4)
            r5.getClass()
            hh.i r5 = f8.i.v(r3, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L105
        L118:
            java.lang.Object r0 = r0.a()
            hh.i r0 = (hh.i) r0
            return r0
    }
}
