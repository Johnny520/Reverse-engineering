package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$runtime$2 extends p000.bp0 implements p000.p70 {
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06511 extends p000.bp0 implements p000.p70 {
        public static final org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.C06511 INSTANCE = null;

        static {
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1
                r0.<init>()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.C06511.INSTANCE = r0
                return
        }

        public C06511() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // p000.p70
        public final java.lang.Long invoke() {
                r2 = this;
                long r0 = org.luckypray.dexkit.DexKitCacheBridge.getIdleTimeoutMillis()
                java.lang.Long r2 = java.lang.Long.valueOf(r0)
                return r2
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                java.lang.Long r0 = r0.invoke()
                return r0
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public /* synthetic */ class C06522 extends p000.p80 implements p000.p70 {
        public C06522(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "createBridge()Lorg/luckypray/dexkit/DexKitBridge;"
                r6 = 0
                r1 = 0
                java.lang.Class<org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge> r3 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.class
                java.lang.String r4 = "createBridge"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge r0 = r0.invoke()
                return r0
        }

        @Override // p000.p70
        public final org.luckypray.dexkit.DexKitBridge invoke() {
                r0 = this;
                java.lang.Object r0 = r0.receiver
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r0
                org.luckypray.dexkit.DexKitBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$createBridge(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06533 extends p000.bp0 implements p000.p70 {
        final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

        public C06533(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                r0.m7390invoke()
                s62 r0 = p000.s62.f9751
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7390invoke() {
                r3 = this;
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r3 = r3.this$0
                java.util.concurrent.CopyOnWriteArraySet r0 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L25
                java.lang.Object r1 = r0.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r1 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r1
                org.luckypray.dexkit.DexKitCacheBridge r2 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r1.getClass()     // Catch: java.lang.Throwable -> Lc
                java.lang.String r2 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getAppTag$p(r3)     // Catch: java.lang.Throwable -> Lc
                r1.onBridgeCreated(r2)     // Catch: java.lang.Throwable -> Lc
                goto Lc
            L25:
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06544 extends p000.bp0 implements p000.p70 {
        final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

        public C06544(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                r0.m7391invoke()
                s62 r0 = p000.s62.f9751
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7391invoke() {
                r3 = this;
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r3 = r3.this$0
                java.util.concurrent.CopyOnWriteArraySet r0 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L25
                java.lang.Object r1 = r0.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r1 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r1
                org.luckypray.dexkit.DexKitCacheBridge r2 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r1.getClass()     // Catch: java.lang.Throwable -> Lc
                java.lang.String r2 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getAppTag$p(r3)     // Catch: java.lang.Throwable -> Lc
                r1.onBridgeReleased(r2)     // Catch: java.lang.Throwable -> Lc
                goto Lc
            L25:
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06555 extends p000.bp0 implements p000.p70 {
        final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

        public C06555(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                r0.m7392invoke()
                s62 r0 = p000.s62.f9751
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7392invoke() {
                r3 = this;
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r3 = r3.this$0
                java.util.concurrent.CopyOnWriteArraySet r0 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L25
                java.lang.Object r1 = r0.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r1 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r1
                org.luckypray.dexkit.DexKitCacheBridge r2 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                r1.getClass()     // Catch: java.lang.Throwable -> Lc
                java.lang.String r2 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getAppTag$p(r3)     // Catch: java.lang.Throwable -> Lc
                r1.onBridgeDestroyed(r2)     // Catch: java.lang.Throwable -> Lc
                goto Lc
            L25:
                return
        }
    }

    public DexKitCacheBridge$RecyclableBridge$runtime$2(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1) {
            r0 = this;
            r0.this$0 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r0 = this;
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = r0.invoke()
            return r0
    }

    @Override // p000.p70
    public final org.luckypray.dexkit.cache.CacheBridgeRuntime invoke() {
            r9 = this;
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = new org.luckypray.dexkit.cache.CacheBridgeRuntime
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r1 = r9.this$0
            java.lang.String r1 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getAppTag$p(r1)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r9.this$0
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = org.luckypray.dexkit.DexKitCacheBridge.access$getReaperScheduler$p()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1 r4 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.C06511.INSTANCE
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2 r5 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r6 = r9.this$0
            r5.<init>(r6)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3 r6 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r7 = r9.this$0
            r6.<init>(r7)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4 r7 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r8 = r9.this$0
            r7.<init>(r8)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5 r8 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r9 = r9.this$0
            r8.<init>(r9)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
