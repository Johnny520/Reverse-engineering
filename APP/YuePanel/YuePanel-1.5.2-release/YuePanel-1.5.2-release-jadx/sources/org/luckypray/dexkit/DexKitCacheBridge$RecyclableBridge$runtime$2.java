package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.C5153;
import Yue.C5499;
import Yue.C7148;
import Yue.C7149;
import Yue.C8107;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import kotlin.Metadata;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class DexKitCacheBridge$RecyclableBridge$runtime$2 extends AbstractC5673 implements InterfaceC5122<CacheBridgeRuntime> {
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1 */
    @InterfaceC6211(m2698d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m2699d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29291 extends AbstractC5673 implements InterfaceC5122<Long> {
        public static final C29291 INSTANCE = new C29291();

        public C29291() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final Long invoke() {
            return Long.valueOf(DexKitCacheBridge.getIdleTimeoutMillis());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2 */
    @InterfaceC6211(m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public /* synthetic */ class C29302 extends C5153 implements InterfaceC5122<DexKitBridge> {
        public C29302(Object obj) {
            super(0, obj, DexKitCacheBridge.RecyclableBridge.class, "createBridge", "createBridge()Lorg/luckypray/dexkit/DexKitBridge;", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final DexKitBridge invoke() {
            return ((DexKitCacheBridge.RecyclableBridge) this.receiver).createBridge();
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LYue/ۥۣۢ۠ۤ;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n1849#3:1821\n1850#3:1825\n1#4:1823\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$3\n*L\n235#1:1820\n235#1:1822\n235#1:1824\n235#1:1826\n235#1:1821\n235#1:1825\n235#1:1823\n*E\n"})
    public static final class C29313 extends AbstractC5673 implements InterfaceC5122<C8107> {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29313(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            for (DexKitCacheBridge.CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                try {
                    C7148.C1189 c1189 = C7148.f21560;
                    C5499.m17102(cacheBridgeListener, "listener");
                    cacheBridgeListener.onBridgeCreated(recyclableBridge.appTag);
                    C7148.m3438(C8107.f3222);
                } catch (Throwable th) {
                    C7148.C1189 c11892 = C7148.f21560;
                    C7148.m3438(C7149.m3441(th));
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LYue/ۥۣۢ۠ۤ;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n1849#3:1821\n1850#3:1825\n1#4:1823\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$4\n*L\n236#1:1820\n236#1:1822\n236#1:1824\n236#1:1826\n236#1:1821\n236#1:1825\n236#1:1823\n*E\n"})
    public static final class C29324 extends AbstractC5673 implements InterfaceC5122<C8107> {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29324(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            for (DexKitCacheBridge.CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                try {
                    C7148.C1189 c1189 = C7148.f21560;
                    C5499.m17102(cacheBridgeListener, "listener");
                    cacheBridgeListener.onBridgeReleased(recyclableBridge.appTag);
                    C7148.m3438(C8107.f3222);
                } catch (Throwable th) {
                    C7148.C1189 c11892 = C7148.f21560;
                    C7148.m3438(C7149.m3441(th));
                }
            }
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LYue/ۥۣۢ۠ۤ;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$5\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1819:1\n145#2:1820\n146#2:1822\n147#2:1824\n148#2:1826\n1849#3:1821\n1850#3:1825\n1#4:1823\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$runtime$2$5\n*L\n237#1:1820\n237#1:1822\n237#1:1824\n237#1:1826\n237#1:1821\n237#1:1825\n237#1:1823\n*E\n"})
    public static final class C29335 extends AbstractC5673 implements InterfaceC5122<C8107> {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29335(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5122
        public /* bridge */ /* synthetic */ C8107 invoke() {
            invoke2();
            return C8107.f3222;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method Yue.ۥۣ۠۠ۨ.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            for (DexKitCacheBridge.CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                try {
                    C7148.C1189 c1189 = C7148.f21560;
                    C5499.m17102(cacheBridgeListener, "listener");
                    cacheBridgeListener.onBridgeDestroyed(recyclableBridge.appTag);
                    C7148.m3438(C8107.f3222);
                } catch (Throwable th) {
                    C7148.C1189 c11892 = C7148.f21560;
                    C7148.m3438(C7149.m3441(th));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$runtime$2(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
        super(0);
        this.this$0 = recyclableBridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // Yue.InterfaceC5122
    @InterfaceC6399
    public final CacheBridgeRuntime invoke() {
        return new CacheBridgeRuntime(this.this$0.appTag, this.this$0, DexKitCacheBridge.reaperScheduler, C29291.INSTANCE, new C29302(this.this$0), new C29313(this.this$0), new C29324(this.this$0), new C29335(this.this$0));
    }
}
