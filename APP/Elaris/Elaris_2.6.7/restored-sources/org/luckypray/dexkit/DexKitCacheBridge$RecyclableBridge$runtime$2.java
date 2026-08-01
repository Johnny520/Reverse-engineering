package org.luckypray.dexkit;

import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import p000.AbstractC0184d9;
import p000.AbstractC0245h6;
import p000.C0022b5;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$runtime$2 extends AbstractC0184d9 implements InterfaceC0279j5 {
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1 */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class C03861 extends AbstractC0184d9 implements InterfaceC0279j5 {
        public static final C03861 INSTANCE = new C03861();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C03861() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0279j5
        public final Long invoke() {
            return Long.valueOf(DexKitCacheBridge.getIdleTimeoutMillis());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2 */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public /* synthetic */ class C03872 extends AbstractC0245h6 implements InterfaceC0279j5 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C03872(Object obj) {
            super(0, obj, DexKitCacheBridge.RecyclableBridge.class, "createBridge", "createBridge()Lorg/luckypray/dexkit/DexKitBridge;");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0279j5
        public final DexKitBridge invoke() {
            return ((DexKitCacheBridge.RecyclableBridge) this.receiver).createBridge();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$runtime$2(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
        super(0);
        this.this$0 = recyclableBridge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0279j5
    public final CacheBridgeRuntime invoke() {
        return new CacheBridgeRuntime(this.this$0.appTag, this.this$0, DexKitCacheBridge.reaperScheduler, C03861.INSTANCE, new C03872(this.this$0), new C03883(this.this$0), new C03894(this.this$0), new C03905(this.this$0));
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3 */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class C03883 extends AbstractC0184d9 implements InterfaceC0279j5 {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03883(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Possible override for method j5.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1225invoke() {
            DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            for (DexKitCacheBridge.CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                try {
                    cacheBridgeListener.getClass();
                    cacheBridgeListener.onBridgeCreated(recyclableBridge.appTag);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // p000.InterfaceC0279j5
        public /* bridge */ /* synthetic */ Object invoke() {
            m1225invoke();
            return C0022b5.f60d;
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4 */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class C03894 extends AbstractC0184d9 implements InterfaceC0279j5 {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03894(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Possible override for method j5.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1226invoke() {
            DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            for (DexKitCacheBridge.CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                try {
                    cacheBridgeListener.getClass();
                    cacheBridgeListener.onBridgeReleased(recyclableBridge.appTag);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // p000.InterfaceC0279j5
        public /* bridge */ /* synthetic */ Object invoke() {
            m1226invoke();
            return C0022b5.f60d;
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5 */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class C03905 extends AbstractC0184d9 implements InterfaceC0279j5 {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03905(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Possible override for method j5.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1227invoke() {
            DexKitCacheBridge dexKitCacheBridge = DexKitCacheBridge.INSTANCE;
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            for (DexKitCacheBridge.CacheBridgeListener cacheBridgeListener : DexKitCacheBridge.listeners) {
                DexKitCacheBridge dexKitCacheBridge2 = DexKitCacheBridge.INSTANCE;
                try {
                    cacheBridgeListener.getClass();
                    cacheBridgeListener.onBridgeDestroyed(recyclableBridge.appTag);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // p000.InterfaceC0279j5
        public /* bridge */ /* synthetic */ Object invoke() {
            m1227invoke();
            return C0022b5.f60d;
        }
    }
}
