package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class DexKitCacheBridge$RecyclableBridge$runtime$2 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<org.luckypray.dexkit.cache.CacheBridgeRuntime> {
    final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class AnonymousClass1 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.lang.Long> {
        public static final org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.AnonymousClass1 INSTANCE = null;

        static {
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1 r0 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1
                r0.<init>()
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.AnonymousClass1.INSTANCE = r0
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Yue.InterfaceC2823
        @Yue.InterfaceC4418
        public final java.lang.Long invoke() {
                r2 = this;
                long r0 = org.luckypray.dexkit.DexKitCacheBridge.getIdleTimeoutMillis()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ java.lang.Long invoke() {
                r1 = this;
                java.lang.Long r0 = r1.invoke()
                return r0
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2, reason: invalid class name */
    @Yue.InterfaceC4201(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends Yue.C2854 implements Yue.InterfaceC2823<org.luckypray.dexkit.DexKitBridge> {
        public AnonymousClass2(java.lang.Object r8) {
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

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ org.luckypray.dexkit.DexKitBridge invoke() {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge r0 = r1.invoke2()
                return r0
        }

        @Override // Yue.InterfaceC2823
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final org.luckypray.dexkit.DexKitBridge invoke2() {
                r1 = this;
                java.lang.Object r0 = r1.receiver
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = (org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge) r0
                org.luckypray.dexkit.DexKitBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$createBridge(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LYue/ۥۣۢ۠ۤ;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @Yue.InterfaceC5840({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n1849#3:1821\n1850#3:1825\n1#4:1823\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3\n*L\n235#1:1820\n235#1:1822\n235#1:1824\n235#1:1826\n235#1:1821\n235#1:1825\n235#1:1823\n*E\n"})
    public static final class AnonymousClass3 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<Yue.C6593> {
        final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

        public AnonymousClass3(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r4 = this;
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r4.this$0
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r1 = r1.iterator()
            Lc:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L39
                java.lang.Object r2 = r1.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r2 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r2
                org.luckypray.dexkit.DexKitCacheBridge r3 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = "listener"
                Yue.C3329.m13905(r2, r3)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getAppTag$p(r0)     // Catch: java.lang.Throwable -> L2e
                r2.onBridgeCreated(r3)     // Catch: java.lang.Throwable -> L2e
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2e
                Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> L2e
                goto Lc
            L2e:
                r2 = move-exception
                Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
                java.lang.Object r2 = Yue.C5391.m20390(r2)
                Yue.C5388.m20377(r2)
                goto Lc
            L39:
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LYue/ۥۣۢ۠ۤ;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @Yue.InterfaceC5840({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n1849#3:1821\n1850#3:1825\n1#4:1823\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4\n*L\n236#1:1820\n236#1:1822\n236#1:1824\n236#1:1826\n236#1:1821\n236#1:1825\n236#1:1823\n*E\n"})
    public static final class AnonymousClass4 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<Yue.C6593> {
        final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

        public AnonymousClass4(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r4 = this;
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r4.this$0
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r1 = r1.iterator()
            Lc:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L39
                java.lang.Object r2 = r1.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r2 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r2
                org.luckypray.dexkit.DexKitCacheBridge r3 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = "listener"
                Yue.C3329.m13905(r2, r3)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getAppTag$p(r0)     // Catch: java.lang.Throwable -> L2e
                r2.onBridgeReleased(r3)     // Catch: java.lang.Throwable -> L2e
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2e
                Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> L2e
                goto Lc
            L2e:
                r2 = move-exception
                Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
                java.lang.Object r2 = Yue.C5391.m20390(r2)
                Yue.C5388.m20377(r2)
                goto Lc
            L39:
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LYue/ۥۣۢ۠ۤ;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @Yue.InterfaceC5840({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$5\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n1849#3:1821\n1850#3:1825\n1#4:1823\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$5\n*L\n237#1:1820\n237#1:1822\n237#1:1824\n237#1:1826\n237#1:1821\n237#1:1825\n237#1:1823\n*E\n"})
    public static final class AnonymousClass5 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<Yue.C6593> {
        final /* synthetic */ org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge this$0;

        public AnonymousClass5(org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r4 = this;
                org.luckypray.dexkit.DexKitCacheBridge r0 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r4.this$0
                java.util.concurrent.CopyOnWriteArraySet r1 = org.luckypray.dexkit.DexKitCacheBridge.access$getListeners$p()
                java.util.Iterator r1 = r1.iterator()
            Lc:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L39
                java.lang.Object r2 = r1.next()
                org.luckypray.dexkit.DexKitCacheBridge$CacheBridgeListener r2 = (org.luckypray.dexkit.DexKitCacheBridge.CacheBridgeListener) r2
                org.luckypray.dexkit.DexKitCacheBridge r3 = org.luckypray.dexkit.DexKitCacheBridge.INSTANCE
                Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = "listener"
                Yue.C3329.m13905(r2, r3)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getAppTag$p(r0)     // Catch: java.lang.Throwable -> L2e
                r2.onBridgeDestroyed(r3)     // Catch: java.lang.Throwable -> L2e
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2e
                Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> L2e
                goto Lc
            L2e:
                r2 = move-exception
                Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
                java.lang.Object r2 = Yue.C5391.m20390(r2)
                Yue.C5388.m20377(r2)
                goto Lc
            L39:
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

    @Override // Yue.InterfaceC2823
    public /* bridge */ /* synthetic */ org.luckypray.dexkit.cache.CacheBridgeRuntime invoke() {
            r1 = this;
            org.luckypray.dexkit.cache.CacheBridgeRuntime r0 = r1.invoke2()
            return r0
    }

    @Override // Yue.InterfaceC2823
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final org.luckypray.dexkit.cache.CacheBridgeRuntime invoke2() {
            r10 = this;
            org.luckypray.dexkit.cache.CacheBridgeRuntime r9 = new org.luckypray.dexkit.cache.CacheBridgeRuntime
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r10.this$0
            java.lang.String r1 = org.luckypray.dexkit.DexKitCacheBridge.RecyclableBridge.access$getAppTag$p(r0)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r2 = r10.this$0
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = org.luckypray.dexkit.DexKitCacheBridge.access$getReaperScheduler$p()
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1 r4 = org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.AnonymousClass1.INSTANCE
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2 r5 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r10.this$0
            r5.<init>(r0)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3 r6 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r10.this$0
            r6.<init>(r0)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4 r7 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r10.this$0
            r7.<init>(r0)
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5 r8 = new org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5
            org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge r0 = r10.this$0
            r8.<init>(r0)
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }
}
