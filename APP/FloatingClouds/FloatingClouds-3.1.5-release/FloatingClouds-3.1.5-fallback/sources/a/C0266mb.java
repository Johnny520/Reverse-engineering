package a;

/* JADX INFO: renamed from: a.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0266mb extends a.AbstractC0407u9 implements a.InterfaceC0369s7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge c;
    public final /* synthetic */ a.X1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ C0266mb(org.luckypray.dexkit.DexKitBridge r1, a.X1 r2, int r3, int r4, int r5) {
            r0 = this;
            r0.b = r5
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r13 = this;
            int r0 = r13.b
            switch(r0) {
                case 0: goto L432;
                case 1: goto L3b8;
                case 2: goto L33e;
                case 3: goto L2d6;
                case 4: goto L213;
                case 5: goto L1c4;
                case 6: goto Lc6;
                case 7: goto L88;
                default: goto L5;
            }
        L5:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.b3 r2 = (a.C0060b3) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L83
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L7b
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.e(r4, r0)     // Catch: java.lang.Throwable -> L83
            r3.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r1 = "wrap(res)"
            a.C0193i9.d(r0, r1)
            a.a r1 = new a.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            int r3 = r0.position()
            int r3 = r0.getInt(r3)
            int r4 = r0.position()
            int r4 = r4 + r3
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 4
            int r3 = r1.b(r3)
            r4 = 0
            if (r3 == 0) goto L66
            int r3 = r1.f(r3)
            goto L67
        L66:
            r3 = r4
        L67:
            if (r4 >= r3) goto L7a
            a.c r5 = r1.g(r4)
            a.C0193i9.b(r5)
            a.x0 r5 = a.C0452x0.a.a(r2, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L67
        L7a:
            return r0
        L7b:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L83
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L83
            throw r1     // Catch: java.lang.Throwable -> L83
        L83:
            r0 = move-exception
            r3.unlock()
            throw r0
        L88:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.lb r2 = (a.C0248lb) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto Lb9
            java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.m(r4, r0)     // Catch: java.lang.Throwable -> Lc1
            r3.unlock()
            java.util.List r0 = a.N1.g0(r0)
            return r0
        Lb9:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lc1
            throw r1     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r0 = move-exception
            r3.unlock()
            throw r0
        Lc6:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.lb r2 = (a.C0248lb) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L1bf
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L1b7
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.l(r4, r0)     // Catch: java.lang.Throwable -> L1bf
            r3.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r1 = "wrap(res)"
            a.C0193i9.d(r0, r1)
            a.a r1 = new a.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            int r3 = r0.position()
            int r3 = r0.getInt(r3)
            int r4 = r0.position()
            int r4 = r4 + r3
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 4
            int r4 = r1.b(r3)
            r5 = 0
            if (r4 == 0) goto L127
            int r4 = r1.f(r4)
            goto L128
        L127:
            r4 = r5
        L128:
            r6 = r5
        L129:
            if (r6 >= r4) goto L1b6
            a.a r7 = new a.a
            r7.<init>()
            int r8 = r1.b(r3)
            r9 = 0
            java.lang.String r10 = "bb"
            if (r8 == 0) goto L14d
            int r8 = r1.e(r8)
            int r11 = r6 * 4
            int r11 = r11 + r8
            int r8 = r1.a(r11)
            java.nio.ByteBuffer r11 = r1.b
            a.C0193i9.d(r11, r10)
            r7.c(r8, r11)
            goto L14e
        L14d:
            r7 = r9
        L14e:
            a.C0193i9.b(r7)
            a.o r8 = new a.o
            r8.<init>()
            int r11 = r7.b(r3)
            if (r11 == 0) goto L16c
            int r9 = r7.f212a
            int r11 = r11 + r9
            int r9 = r7.a(r11)
            java.nio.ByteBuffer r11 = r7.b
            a.C0193i9.d(r11, r10)
            r8.c(r9, r11)
            r9 = r8
        L16c:
            a.C0193i9.b(r9)
            a.r6 r8 = a.C0350r6.a.a(r2, r9)
            r9 = 6
            int r10 = r7.b(r9)
            if (r10 == 0) goto L184
            java.nio.ByteBuffer r11 = r7.b
            int r12 = r7.f212a
            int r10 = r10 + r12
            byte r10 = r11.get(r10)
            goto L185
        L184:
            r10 = r5
        L185:
            r11 = 1
            if (r10 != r11) goto L18b
            a.u6 r7 = a.EnumC0404u6.f709a
            goto L190
        L18b:
            r11 = 2
            if (r10 != r11) goto L19b
            a.u6 r7 = a.EnumC0404u6.b
        L190:
            a.Yf r9 = new a.Yf
            r9.<init>(r8, r7)
            r0.add(r9)
            int r6 = r6 + 1
            goto L129
        L19b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r7.b(r9)
            if (r1 == 0) goto L1ac
            java.nio.ByteBuffer r2 = r7.b
            int r3 = r7.f212a
            int r1 = r1 + r3
            byte r5 = r2.get(r1)
        L1ac:
            java.lang.String r1 = "Unknown using type: "
            java.lang.String r1 = a.C0487z.e(r1, r5)
            r0.<init>(r1)
            throw r0
        L1b6:
            return r0
        L1b7:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1bf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1bf
            throw r1     // Catch: java.lang.Throwable -> L1bf
        L1bf:
            r0 = move-exception
            r3.unlock()
            throw r0
        L1c4:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.lb r2 = (a.C0248lb) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L20e
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L206
            java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.o(r4, r0)     // Catch: java.lang.Throwable -> L20e
            r3.unlock()
            if (r0 == 0) goto L204
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L1fa:
            if (r3 >= r2) goto L205
            r4 = r0[r3]
            r1.add(r4)
            int r3 = r3 + 1
            goto L1fa
        L204:
            r1 = 0
        L205:
            return r1
        L206:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L20e
            throw r1     // Catch: java.lang.Throwable -> L20e
        L20e:
            r0 = move-exception
            r3.unlock()
            throw r0
        L213:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.lb r2 = (a.C0248lb) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L2d1
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L2c9
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.n(r4, r0)     // Catch: java.lang.Throwable -> L2d1
            r3.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r1 = "wrap(res)"
            a.C0193i9.d(r0, r1)
            a.a r1 = new a.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            int r3 = r0.position()
            int r3 = r0.getInt(r3)
            int r4 = r0.position()
            int r4 = r4 + r3
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 4
            int r4 = r1.b(r3)
            r5 = 0
            if (r4 == 0) goto L274
            int r4 = r1.f(r4)
            goto L275
        L274:
            r4 = r5
        L275:
            r6 = r5
        L276:
            if (r6 >= r4) goto L2c8
            a.a r7 = new a.a
            r7.<init>()
            int r8 = r1.b(r3)
            if (r8 == 0) goto L299
            int r8 = r1.e(r8)
            int r9 = r6 * 4
            int r9 = r9 + r8
            int r8 = r1.a(r9)
            java.nio.ByteBuffer r9 = r1.b
            java.lang.String r10 = "bb"
            a.C0193i9.d(r9, r10)
            r7.c(r8, r9)
            goto L29a
        L299:
            r7 = 0
        L29a:
            a.C0193i9.b(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r7.b(r3)
            if (r9 == 0) goto L2ad
            int r9 = r7.f(r9)
            goto L2ae
        L2ad:
            r9 = r5
        L2ae:
            r10 = r5
        L2af:
            if (r10 >= r9) goto L2c2
            a.c r11 = r7.g(r10)
            a.C0193i9.b(r11)
            a.x0 r11 = a.C0452x0.a.a(r2, r11)
            r8.add(r11)
            int r10 = r10 + 1
            goto L2af
        L2c2:
            r0.add(r8)
            int r6 = r6 + 1
            goto L276
        L2c8:
            return r0
        L2c9:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2d1
            throw r1     // Catch: java.lang.Throwable -> L2d1
        L2d1:
            r0 = move-exception
            r3.unlock()
            throw r0
        L2d6:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.lb r2 = (a.C0248lb) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L339
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L331
            int[] r0 = org.luckypray.dexkit.DexKitBridge.k(r4, r0)     // Catch: java.lang.Throwable -> L339
            r3.unlock()
            java.lang.String r1 = "<this>"
            a.C0193i9.e(r0, r1)
            int r1 = r0.length
            if (r1 == 0) goto L32e
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L323
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
        L315:
            if (r3 >= r2) goto L330
            r4 = r0[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L315
        L323:
            r0 = r0[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r1 = a.C0435w1.K(r0)
            goto L330
        L32e:
            a.Y5 r1 = a.Y5.f351a
        L330:
            return r1
        L331:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L339
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L339
            throw r1     // Catch: java.lang.Throwable -> L339
        L339:
            r0 = move-exception
            r3.unlock()
            throw r0
        L33e:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.lb r2 = (a.C0248lb) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L3b3
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L3ab
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.h(r4, r0)     // Catch: java.lang.Throwable -> L3b3
            r3.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r1 = "wrap(res)"
            a.C0193i9.d(r0, r1)
            a.a r1 = new a.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            int r3 = r0.position()
            int r3 = r0.getInt(r3)
            int r4 = r0.position()
            int r4 = r4 + r3
            r1.c(r4, r0)
            a.ob r0 = new a.ob
            r0.<init>()
            int r3 = r1.j()
            r4 = 0
        L397:
            if (r4 >= r3) goto L3aa
            a.p r5 = r1.k(r4)
            a.C0193i9.b(r5)
            a.lb r5 = a.C0248lb.a.a(r2, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L397
        L3aa:
            return r0
        L3ab:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3b3
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3b3
            throw r1     // Catch: java.lang.Throwable -> L3b3
        L3b3:
            r0 = move-exception
            r3.unlock()
            throw r0
        L3b8:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.lb r2 = (a.C0248lb) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L42d
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L425
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.d(r4, r0)     // Catch: java.lang.Throwable -> L42d
            r3.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r1 = "wrap(res)"
            a.C0193i9.d(r0, r1)
            a.a r1 = new a.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            int r3 = r0.position()
            int r3 = r0.getInt(r3)
            int r4 = r0.position()
            int r4 = r4 + r3
            r1.c(r4, r0)
            a.ob r0 = new a.ob
            r0.<init>()
            int r3 = r1.j()
            r4 = 0
        L411:
            if (r4 >= r3) goto L424
            a.p r5 = r1.k(r4)
            a.C0193i9.b(r5)
            a.lb r5 = a.C0248lb.a.a(r2, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L411
        L424:
            return r0
        L425:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L42d
            throw r1     // Catch: java.lang.Throwable -> L42d
        L42d:
            r0 = move-exception
            r3.unlock()
            throw r0
        L432:
            int r0 = r13.e
            int r1 = r13.f
            a.X1 r2 = r13.d
            a.lb r2 = (a.C0248lb) r2
            r2.getClass()
            long r0 = a.X1.a(r0, r1)
            org.luckypray.dexkit.DexKitBridge r2 = r13.c
            r2.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L4b0
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L4a8
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.i(r4, r0)     // Catch: java.lang.Throwable -> L4b0
            r3.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r1 = "wrap(res)"
            a.C0193i9.d(r0, r1)
            a.a r1 = new a.a
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r3)
            int r3 = r0.position()
            int r3 = r0.getInt(r3)
            int r4 = r0.position()
            int r4 = r4 + r3
            r1.c(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = 4
            int r3 = r1.b(r3)
            r4 = 0
            if (r3 == 0) goto L493
            int r3 = r1.f(r3)
            goto L494
        L493:
            r3 = r4
        L494:
            if (r4 >= r3) goto L4a7
            a.c r5 = r1.g(r4)
            a.C0193i9.b(r5)
            a.x0 r5 = a.C0452x0.a.a(r2, r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L494
        L4a7:
            return r0
        L4a8:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b0
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4b0
            throw r1     // Catch: java.lang.Throwable -> L4b0
        L4b0:
            r0 = move-exception
            r3.unlock()
            throw r0
    }
}
