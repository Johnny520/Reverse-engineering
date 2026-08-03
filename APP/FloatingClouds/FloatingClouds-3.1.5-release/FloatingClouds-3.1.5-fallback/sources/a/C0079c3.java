package a;

/* JADX INFO: renamed from: a.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0079c3 extends a.AbstractC0407u9 implements a.InterfaceC0369s7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge c;
    public final /* synthetic */ a.C0060b3 d;
    public final /* synthetic */ int e;

    public C0079c3(a.C0060b3 r2, org.luckypray.dexkit.DexKitBridge r3, int r4) {
            r1 = this;
            r0 = 3
            r1.b = r0
            r1.d = r2
            r1.c = r3
            r1.e = r4
            r2 = 0
            r1.<init>(r2)
            return
    }

    public /* synthetic */ C0079c3(org.luckypray.dexkit.DexKitBridge r1, a.C0060b3 r2, int r3, int r4) {
            r0 = this;
            r0.b = r4
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r11 = this;
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.String r1 = "wrap(res)"
            r2 = 0
            r4 = 10
            r5 = 0
            r6 = 1
            int r7 = r11.b
            switch(r7) {
                case 0: goto L108;
                case 1: goto Lce;
                case 2: goto L38;
                default: goto Lf;
            }
        Lf:
            a.b3 r0 = r11.d
            java.lang.Integer r0 = r0.d
            r1 = 0
            if (r0 == 0) goto L37
            int r0 = r0.intValue()
            int r2 = r11.e
            long r2 = a.X1.a(r2, r0)
            long[] r0 = new long[r6]
            r0[r5] = r2
            org.luckypray.dexkit.DexKitBridge r2 = r11.c
            a.d3 r0 = r2.r(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L31
            goto L35
        L31:
            java.lang.Object r1 = r0.a()
        L35:
            a.b3 r1 = (a.C0060b3) r1
        L37:
            return r1
        L38:
            a.b3 r7 = r11.d
            java.util.ArrayList r7 = r7.f
            java.util.ArrayList r8 = new java.util.ArrayList
            int r4 = a.C0312p3.g0(r7, r4)
            r8.<init>(r4)
            java.util.Iterator r4 = r7.iterator()
        L49:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L67
            java.lang.Object r7 = r4.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r9 = r11.e
            long r9 = a.X1.a(r9, r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8.add(r7)
            goto L49
        L67:
            long[] r4 = a.C0383t3.x0(r8)
            org.luckypray.dexkit.DexKitBridge r7 = r11.c
            r7.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r7.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()
            r8.lock()
            long r9 = r7.f1107a     // Catch: java.lang.Throwable -> Lc9
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 == 0) goto Lc3
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.j(r9, r4)     // Catch: java.lang.Throwable -> Lc9
            r8.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            a.C0193i9.d(r0, r1)
            a.a r1 = new a.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r2)
            int r2 = r0.position()
            int r2 = r0.getInt(r2)
            int r3 = r0.position()
            int r3 = r3 + r2
            r1.c(r3, r0)
            a.ob r0 = new a.ob
            r0.<init>()
            int r2 = r1.j()
        Lb0:
            if (r5 >= r2) goto Lc2
            a.p r3 = r1.k(r5)
            a.C0193i9.b(r3)
            a.lb r3 = a.C0248lb.a.a(r7, r3)
            r0.add(r3)
            int r5 = r5 + r6
            goto Lb0
        Lc2:
            return r0
        Lc3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lc9
            throw r1     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            r8.unlock()
            throw r0
        Lce:
            a.b3 r0 = r11.d
            java.util.ArrayList r0 = r0.e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = a.C0312p3.g0(r0, r4)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Ldf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lfd
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r3 = r11.e
            long r2 = a.X1.a(r3, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.add(r2)
            goto Ldf
        Lfd:
            long[] r0 = a.C0383t3.x0(r1)
            org.luckypray.dexkit.DexKitBridge r1 = r11.c
            a.d3 r0 = r1.r(r0)
            return r0
        L108:
            a.b3 r7 = r11.d
            java.util.ArrayList r7 = r7.g
            java.util.ArrayList r8 = new java.util.ArrayList
            int r4 = a.C0312p3.g0(r7, r4)
            r8.<init>(r4)
            java.util.Iterator r4 = r7.iterator()
        L119:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L137
            java.lang.Object r7 = r4.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r9 = r11.e
            long r9 = a.X1.a(r9, r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8.add(r7)
            goto L119
        L137:
            long[] r4 = a.C0383t3.x0(r8)
            org.luckypray.dexkit.DexKitBridge r7 = r11.c
            r7.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r7.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r8.readLock()
            r8.lock()
            long r9 = r7.f1107a     // Catch: java.lang.Throwable -> L1a2
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 == 0) goto L19c
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.g(r9, r4)     // Catch: java.lang.Throwable -> L1a2
            r8.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            a.C0193i9.d(r0, r1)
            a.a r1 = new a.a
            r1.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r2)
            int r2 = r0.position()
            int r2 = r0.getInt(r2)
            int r3 = r0.position()
            int r3 = r3 + r2
            r1.c(r3, r0)
            a.s6 r0 = new a.s6
            r0.<init>()
            r2 = 4
            int r2 = r1.b(r2)
            if (r2 == 0) goto L188
            int r2 = r1.f(r2)
            goto L189
        L188:
            r2 = r5
        L189:
            if (r5 >= r2) goto L19b
            a.o r3 = r1.i(r5)
            a.C0193i9.b(r3)
            a.r6 r3 = a.C0350r6.a.a(r7, r3)
            r0.add(r3)
            int r5 = r5 + r6
            goto L189
        L19b:
            return r0
        L19c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a2
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a2
            throw r1     // Catch: java.lang.Throwable -> L1a2
        L1a2:
            r0 = move-exception
            r8.unlock()
            throw r0
    }
}
