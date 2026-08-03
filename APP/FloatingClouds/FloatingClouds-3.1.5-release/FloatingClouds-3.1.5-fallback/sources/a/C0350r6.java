package a;

/* JADX INFO: renamed from: a.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0350r6 extends a.X1 {
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final int e;
    public final a.Me f;
    public final a.Me g;

    /* JADX INFO: renamed from: a.r6$a */
    public static final class a {
        public static a.C0350r6 a(org.luckypray.dexkit.DexKitBridge r9, a.C0290o r10) {
                java.lang.String r0 = "bridge"
                a.C0193i9.e(r9, r0)
                a.r6 r1 = new a.r6
                r0 = 4
                int r0 = r10.b(r0)
                r2 = 0
                if (r0 == 0) goto L1a
                java.nio.ByteBuffer r3 = r10.b
                int r4 = r10.f212a
                int r0 = r0 + r4
                int r0 = r3.getInt(r0)
                r3 = r0
                goto L1b
            L1a:
                r3 = r2
            L1b:
                r0 = 6
                int r0 = r10.b(r0)
                if (r0 == 0) goto L2d
                java.nio.ByteBuffer r4 = r10.b
                int r5 = r10.f212a
                int r0 = r0 + r5
                int r0 = r4.getInt(r0)
                r4 = r0
                goto L2e
            L2d:
                r4 = r2
            L2e:
                r0 = 8
                int r0 = r10.b(r0)
                if (r0 == 0) goto L41
                java.nio.ByteBuffer r5 = r10.b
                int r6 = r10.f212a
                int r0 = r0 + r6
                int r0 = r5.getInt(r0)
                r5 = r0
                goto L42
            L41:
                r5 = r2
            L42:
                r0 = 10
                int r0 = r10.b(r0)
                if (r0 == 0) goto L55
                java.nio.ByteBuffer r6 = r10.b
                int r7 = r10.f212a
                int r0 = r0 + r7
                int r0 = r6.getInt(r0)
                r6 = r0
                goto L56
            L55:
                r6 = r2
            L56:
                r0 = 12
                int r0 = r10.b(r0)
                if (r0 == 0) goto L67
                int r7 = r10.f212a
                int r0 = r0 + r7
                java.lang.String r0 = r10.d(r0)
            L65:
                r7 = r0
                goto L69
            L67:
                r0 = 0
                goto L65
            L69:
                a.C0193i9.b(r7)
                r0 = 14
                int r0 = r10.b(r0)
                if (r0 == 0) goto L7d
                java.nio.ByteBuffer r2 = r10.b
                int r10 = r10.f212a
                int r0 = r0 + r10
                int r2 = r2.getInt(r0)
            L7d:
                r8 = r2
                r2 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r1
        }
    }

    /* JADX INFO: renamed from: a.r6$b */
    public static final class b extends a.AbstractC0407u9 implements a.InterfaceC0369s7<java.util.List<? extends a.C0452x0>> {
        public final /* synthetic */ org.luckypray.dexkit.DexKitBridge b;
        public final /* synthetic */ a.C0350r6 c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public b(org.luckypray.dexkit.DexKitBridge r1, a.C0350r6 r2, int r3, int r4) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r0.e = r4
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final java.util.List<? extends a.C0452x0> a() {
                r8 = this;
                int r0 = r8.d
                int r1 = r8.e
                a.r6 r2 = r8.c
                r2.getClass()
                long r0 = a.X1.a(r0, r1)
                org.luckypray.dexkit.DexKitBridge r2 = r8.b
                r2.getClass()
                java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
                r3.lock()
                long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L7c
                r6 = 0
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 == 0) goto L74
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.f(r4, r0)     // Catch: java.lang.Throwable -> L7c
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
                if (r3 == 0) goto L5f
                int r3 = r1.f(r3)
                goto L60
            L5f:
                r3 = r4
            L60:
                if (r4 >= r3) goto L73
                a.c r5 = r1.g(r4)
                a.C0193i9.b(r5)
                a.x0 r5 = a.C0452x0.a.a(r2, r5)
                r0.add(r5)
                int r4 = r4 + 1
                goto L60
            L73:
                return r0
            L74:
                java.lang.String r0 = "DexKitBridge is not valid"
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L7c
                throw r1     // Catch: java.lang.Throwable -> L7c
            L7c:
                r0 = move-exception
                r3.unlock()
                throw r0
        }
    }

    /* JADX INFO: renamed from: a.r6$c */
    public static final class c extends a.AbstractC0407u9 implements a.InterfaceC0369s7<a.C0060b3> {
        public final /* synthetic */ org.luckypray.dexkit.DexKitBridge b;
        public final /* synthetic */ a.C0350r6 c;
        public final /* synthetic */ int d;

        public c(org.luckypray.dexkit.DexKitBridge r1, a.C0350r6 r2, int r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final a.C0060b3 a() {
                r4 = this;
                a.r6 r0 = r4.c
                int r0 = r0.b
                int r1 = r4.d
                long r0 = a.X1.a(r1, r0)
                r2 = 1
                long[] r2 = new long[r2]
                r3 = 0
                r2[r3] = r0
                org.luckypray.dexkit.DexKitBridge r0 = r4.b
                a.d3 r0 = r0.r(r2)
                java.lang.Object r0 = r0.a()
                a.b3 r0 = (a.C0060b3) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: a.r6$d */
    public static final class d extends a.AbstractC0407u9 implements a.InterfaceC0369s7<a.Y4> {
        public final /* synthetic */ a.C0350r6 b;

        public d(a.C0350r6 r1) {
                r0 = this;
                r0.b = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final a.Y4 a() {
                r2 = this;
                a.Y4 r0 = new a.Y4
                a.r6 r1 = r2.b
                java.lang.String r1 = r1.d
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.r6$e */
    public static final class e extends a.AbstractC0407u9 implements a.InterfaceC0369s7<a.C0302ob> {
        public final /* synthetic */ org.luckypray.dexkit.DexKitBridge b;
        public final /* synthetic */ a.C0350r6 c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public e(org.luckypray.dexkit.DexKitBridge r1, a.C0350r6 r2, int r3, int r4) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r0.e = r4
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final a.C0302ob a() {
                r8 = this;
                int r0 = r8.d
                int r1 = r8.e
                a.r6 r2 = r8.c
                r2.getClass()
                long r0 = a.X1.a(r0, r1)
                org.luckypray.dexkit.DexKitBridge r2 = r8.b
                r2.getClass()
                java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
                r3.lock()
                long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L73
                r6 = 0
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 == 0) goto L6b
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.a(r4, r0)     // Catch: java.lang.Throwable -> L73
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
            L57:
                if (r4 >= r3) goto L6a
                a.p r5 = r1.k(r4)
                a.C0193i9.b(r5)
                a.lb r5 = a.C0248lb.a.a(r2, r5)
                r0.add(r5)
                int r4 = r4 + 1
                goto L57
            L6a:
                return r0
            L6b:
                java.lang.String r0 = "DexKitBridge is not valid"
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L73
                throw r1     // Catch: java.lang.Throwable -> L73
            L73:
                r0 = move-exception
                r3.unlock()
                throw r0
        }
    }

    /* JADX INFO: renamed from: a.r6$f */
    public static final class f extends a.AbstractC0407u9 implements a.InterfaceC0369s7<a.C0060b3> {
        public final /* synthetic */ org.luckypray.dexkit.DexKitBridge b;
        public final /* synthetic */ a.C0350r6 c;
        public final /* synthetic */ int d;

        public f(org.luckypray.dexkit.DexKitBridge r1, a.C0350r6 r2, int r3) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final a.C0060b3 a() {
                r4 = this;
                a.r6 r0 = r4.c
                int r0 = r0.e
                int r1 = r4.d
                long r0 = a.X1.a(r1, r0)
                r2 = 1
                long[] r2 = new long[r2]
                r3 = 0
                r2[r3] = r0
                org.luckypray.dexkit.DexKitBridge r0 = r4.b
                a.d3 r0 = r0.r(r2)
                java.lang.Object r0 = r0.a()
                a.b3 r0 = (a.C0060b3) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: a.r6$g */
    public static final class g extends a.AbstractC0407u9 implements a.InterfaceC0369s7<a.C0302ob> {
        public final /* synthetic */ org.luckypray.dexkit.DexKitBridge b;
        public final /* synthetic */ a.C0350r6 c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public g(org.luckypray.dexkit.DexKitBridge r1, a.C0350r6 r2, int r3, int r4) {
                r0 = this;
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r0.e = r4
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final a.C0302ob a() {
                r8 = this;
                int r0 = r8.d
                int r1 = r8.e
                a.r6 r2 = r8.c
                r2.getClass()
                long r0 = a.X1.a(r0, r1)
                org.luckypray.dexkit.DexKitBridge r2 = r8.b
                r2.getClass()
                java.util.concurrent.locks.ReentrantReadWriteLock r3 = r2.b
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
                r3.lock()
                long r4 = r2.f1107a     // Catch: java.lang.Throwable -> L73
                r6 = 0
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 == 0) goto L6b
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.b(r4, r0)     // Catch: java.lang.Throwable -> L73
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
            L57:
                if (r4 >= r3) goto L6a
                a.p r5 = r1.k(r4)
                a.C0193i9.b(r5)
                a.lb r5 = a.C0248lb.a.a(r2, r5)
                r0.add(r5)
                int r4 = r4 + 1
                goto L57
            L6a:
                return r0
            L6b:
                java.lang.String r0 = "DexKitBridge is not valid"
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L73
                throw r1     // Catch: java.lang.Throwable -> L73
            L73:
                r0 = move-exception
                r3.unlock()
                throw r0
        }
    }

    public C0350r6(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, int r4, int r5, java.lang.String r6, int r7) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.b = r4
            r0.c = r5
            r0.d = r6
            r0.e = r7
            a.r6$d r4 = new a.r6$d
            r4.<init>(r0)
            a.Me r5 = new a.Me
            r5.<init>(r4)
            r0.f = r5
            a.r6$c r4 = new a.r6$c
            r4.<init>(r1, r0, r3)
            a.Me r5 = new a.Me
            r5.<init>(r4)
            a.r6$f r4 = new a.r6$f
            r4.<init>(r1, r0, r3)
            a.Me r5 = new a.Me
            r5.<init>(r4)
            r0.g = r5
            a.r6$b r4 = new a.r6$b
            r4.<init>(r1, r0, r3, r2)
            a.Me r5 = new a.Me
            r5.<init>(r4)
            a.r6$e r4 = new a.r6$e
            r4.<init>(r1, r0, r3, r2)
            a.Me r5 = new a.Me
            r5.<init>(r4)
            a.r6$g r4 = new a.r6$g
            r4.<init>(r1, r0, r3, r2)
            a.Me r1 = new a.Me
            r1.<init>(r4)
            return
    }

    public final a.Y4 b() {
            r1 = this;
            a.Me r0 = r1.f
            java.lang.Object r0 = r0.a()
            a.Y4 r0 = (a.Y4) r0
            return r0
    }

    public final a.C0060b3 c() {
            r1 = this;
            a.Me r0 = r1.g
            java.lang.Object r0 = r0.a()
            a.b3 r0 = (a.C0060b3) r0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof a.C0350r6
            if (r1 == 0) goto L15
            a.r6 r3 = (a.C0350r6) r3
            java.lang.String r3 = r3.d
            java.lang.String r1 = r2.d
            boolean r3 = a.C0193i9.a(r3, r1)
            if (r3 == 0) goto L15
            return r0
        L15:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.d
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            int r2 = r4.c
            if (r2 <= 0) goto L21
            java.lang.String r2 = java.lang.reflect.Modifier.toString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
        L21:
            a.Y4 r2 = r4.b()
            java.lang.String r2 = r2.c
            r0.append(r2)
            r0.append(r1)
            a.Y4 r1 = r4.b()
            java.lang.String r1 = r1.f350a
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            a.Y4 r1 = r4.b()
            java.lang.String r1 = r1.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}
