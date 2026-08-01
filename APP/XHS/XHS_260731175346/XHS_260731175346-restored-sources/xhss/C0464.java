package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛳᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0464 extends xhss.AbstractC0352 implements xhss.InterfaceC0030 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ int f1676;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f1677;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge f1678;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1679;

    public /* synthetic */ C0464(org.luckypray.dexkit.DexKitBridge r1, xhss.AbstractC0954 r2, int r3, int r4, int r5) {
            r0 = this;
            r0.f1676 = r5
            r0.f1678 = r1
            r0.f1677 = r3
            r0.f1679 = r4
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // xhss.InterfaceC0030
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.lang.Object mo136() {
            r10 = this;
            int r0 = r10.f1676
            java.lang.String r1 = "DexKitBridge is not valid"
            r2 = 4
            r3 = 0
            r5 = 0
            switch(r0) {
                case 0: goto Le3;
                case 1: goto L77;
                default: goto Lb;
            }
        Lb:
            org.luckypray.dexkit.DexKitBridge r0 = r10.f1678
            int r6 = r10.f1677
            int r10 = r10.f1679
            long r6 = xhss.AbstractC0954.m1548(r6, r10)
            java.util.concurrent.locks.ReentrantReadWriteLock r10 = r0.f137
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r10.readLock()
            r10.lock()
            long r8 = r0.f136     // Catch: java.lang.Throwable -> L6b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L6d
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.m85(r8, r6)     // Catch: java.lang.Throwable -> L6b
            r10.unlock()
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r1)
            xhss.ᛳᲁᲇᛸ r1 = new xhss.ᛳᲁᲇᛸ
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r3)
            int r3 = r10.position()
            int r3 = r10.getInt(r3)
            int r4 = r10.position()
            int r4 = r4 + r3
            r1.m655(r4, r10)
            xhss.ᲈᛴᲀᛲ r10 = new xhss.ᲈᛴᲀᛲ
            r10.<init>()
            int r2 = r1.m654(r2)
            if (r2 == 0) goto L59
            int r2 = r1.m661(r2)
            goto L5a
        L59:
            r2 = r5
        L5a:
            if (r5 >= r2) goto L6a
            xhss.ᛳᲁᲇᛸ r3 = r1.m658(r5)
            xhss.ᛳᛸᛸᛵ r3 = xhss.AbstractC0775.m1318(r0, r3)
            r10.add(r3)
            int r5 = r5 + 1
            goto L5a
        L6a:
            return r10
        L6b:
            r0 = move-exception
            goto L73
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6b
        L73:
            r10.unlock()
            throw r0
        L77:
            org.luckypray.dexkit.DexKitBridge r0 = r10.f1678
            int r6 = r10.f1677
            int r10 = r10.f1679
            long r6 = xhss.AbstractC0954.m1548(r6, r10)
            java.util.concurrent.locks.ReentrantReadWriteLock r10 = r0.f137
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r10.readLock()
            r10.lock()
            long r8 = r0.f136     // Catch: java.lang.Throwable -> Ld7
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto Ld9
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.m84(r8, r6)     // Catch: java.lang.Throwable -> Ld7
            r10.unlock()
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r1)
            xhss.ᛳᲁᲇᛸ r1 = new xhss.ᛳᲁᲇᛸ
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r3)
            int r3 = r10.position()
            int r3 = r10.getInt(r3)
            int r4 = r10.position()
            int r4 = r4 + r3
            r1.m655(r4, r10)
            xhss.ᲈᛴᲀᛲ r10 = new xhss.ᲈᛴᲀᛲ
            r10.<init>()
            int r2 = r1.m654(r2)
            if (r2 == 0) goto Lc5
            int r2 = r1.m661(r2)
            goto Lc6
        Lc5:
            r2 = r5
        Lc6:
            if (r5 >= r2) goto Ld6
            xhss.ᛳᲁᲇᛸ r3 = r1.m658(r5)
            xhss.ᛳᛸᛸᛵ r3 = xhss.AbstractC0775.m1318(r0, r3)
            r10.add(r3)
            int r5 = r5 + 1
            goto Lc6
        Ld6:
            return r10
        Ld7:
            r0 = move-exception
            goto Ldf
        Ld9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld7
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld7
            throw r0     // Catch: java.lang.Throwable -> Ld7
        Ldf:
            r10.unlock()
            throw r0
        Le3:
            org.luckypray.dexkit.DexKitBridge r0 = r10.f1678
            int r6 = r10.f1677
            int r10 = r10.f1679
            long r6 = xhss.AbstractC0954.m1548(r6, r10)
            java.util.concurrent.locks.ReentrantReadWriteLock r10 = r0.f137
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r10.readLock()
            r10.lock()
            long r8 = r0.f136     // Catch: java.lang.Throwable -> L143
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L145
            byte[] r1 = org.luckypray.dexkit.DexKitBridge.m83(r8, r6)     // Catch: java.lang.Throwable -> L143
            r10.unlock()
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r1)
            xhss.ᛳᲁᲇᛸ r1 = new xhss.ᛳᲁᲇᛸ
            r1.<init>()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r3)
            int r3 = r10.position()
            int r3 = r10.getInt(r3)
            int r4 = r10.position()
            int r4 = r4 + r3
            r1.m655(r4, r10)
            xhss.ᲈᛴᲀᛲ r10 = new xhss.ᲈᛴᲀᛲ
            r10.<init>()
            int r2 = r1.m654(r2)
            if (r2 == 0) goto L131
            int r2 = r1.m661(r2)
            goto L132
        L131:
            r2 = r5
        L132:
            if (r5 >= r2) goto L142
            xhss.ᛳᲁᲇᛸ r3 = r1.m658(r5)
            xhss.ᛳᛸᛸᛵ r3 = xhss.AbstractC0775.m1318(r0, r3)
            r10.add(r3)
            int r5 = r5 + 1
            goto L132
        L142:
            return r10
        L143:
            r0 = move-exception
            goto L14b
        L145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L143
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L143
            throw r0     // Catch: java.lang.Throwable -> L143
        L14b:
            r10.unlock()
            throw r0
    }
}
