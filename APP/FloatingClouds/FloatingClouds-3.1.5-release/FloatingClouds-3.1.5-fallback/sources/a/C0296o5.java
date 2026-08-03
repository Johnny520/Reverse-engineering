package a;

/* JADX INFO: renamed from: a.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0296o5 implements a.InterfaceC0369s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f618a;
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.io.Serializable d;

    public /* synthetic */ C0296o5(org.luckypray.dexkit.DexKitBridge r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.f618a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            return
    }

    public /* synthetic */ C0296o5(org.luckypray.dexkit.DexKitBridge r2, java.lang.String[] r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.f618a = r0
            r1.<init>()
            r1.b = r2
            r1.d = r3
            r1.c = r4
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r8 = this;
            int r0 = r8.f618a
            switch(r0) {
                case 0: goto L40;
                default: goto L5;
            }
        L5:
            a.y6 r0 = new a.y6
            r0.<init>()
            java.io.Serializable r1 = r8.d
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = a.N1.g0(r1)
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r2 = "searchPackages"
            a.C0193i9.e(r1, r2)
            java.util.List r1 = a.N1.g0(r1)
            r0.f768a = r1
            a.e3 r1 = new a.e3
            r1.<init>()
            java.lang.String r2 = r8.c
            a.C0115e3.g(r1, r2)
            r0.b = r1
            org.luckypray.dexkit.DexKitBridge r1 = r8.b
            a.d3 r0 = r1.p(r0)
            return r0
        L40:
            a.z6 r0 = new a.z6
            r1 = 0
            r0.<init>(r1)
            a.t6 r1 = new a.t6
            r1.<init>()
            java.lang.String r2 = r8.c
            r3 = 0
            r4 = 5
            if (r2 == 0) goto L5b
            a.e3 r5 = new a.e3
            r5.<init>()
            r5.h(r2, r4, r3)
            r1.f695a = r5
        L5b:
            java.io.Serializable r2 = r8.d
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L6b
            a.e3 r5 = new a.e3
            r5.<init>()
            r5.h(r2, r4, r3)
            r1.b = r5
        L6b:
            r0.b = r1
            org.luckypray.dexkit.DexKitBridge r1 = r8.b
            r1.getClass()
            byte[] r0 = r0.g()
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r2.readLock()
            r2.lock()
            long r4 = r1.f1107a     // Catch: java.lang.Throwable -> Lef
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto Le7
            byte[] r0 = org.luckypray.dexkit.DexKitBridge.c(r4, r0)     // Catch: java.lang.Throwable -> Lef
            r2.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r2 = "wrap(res)"
            a.C0193i9.d(r0, r2)
            a.a r2 = new a.a
            r2.<init>()
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r4)
            int r4 = r0.position()
            int r4 = r0.getInt(r4)
            int r5 = r0.position()
            int r5 = r5 + r4
            r2.c(r5, r0)
            a.s6 r0 = new a.s6
            r0.<init>()
            r4 = 4
            int r4 = r2.b(r4)
            if (r4 == 0) goto Lc2
            int r4 = r2.f(r4)
            goto Lc3
        Lc2:
            r4 = r3
        Lc3:
            if (r3 >= r4) goto Ld6
            a.o r5 = r2.i(r3)
            a.C0193i9.b(r5)
            a.r6 r5 = a.C0350r6.a.a(r1, r5)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lc3
        Ld6:
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto Le6
            a.Z4 r1 = new a.Z4
            r2 = 1
            r1.<init>(r2)
            a.C0365s3.j0(r0, r1)
        Le6:
            return r0
        Le7:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lef
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lef
            throw r1     // Catch: java.lang.Throwable -> Lef
        Lef:
            r0 = move-exception
            r2.unlock()
            throw r0
    }
}
