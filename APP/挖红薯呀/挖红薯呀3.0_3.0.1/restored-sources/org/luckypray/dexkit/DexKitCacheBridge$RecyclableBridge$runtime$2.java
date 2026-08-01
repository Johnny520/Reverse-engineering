package org.luckypray.dexkit;

import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import p000.C0299hx;
import p000.InterfaceC0298hw;
import p000.c50;
import p000.na1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$runtime$2 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05791 extends c50 implements InterfaceC0298hw {
        public static final C05791 INSTANCE = new C05791();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C05791() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0298hw
        public final Long invoke() {
            return Long.valueOf(DexKitCacheBridge.getIdleTimeoutMillis());
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public /* synthetic */ class C05802 extends C0299hx implements InterfaceC0298hw {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C05802(Object obj) {
            super(0, 0, DexKitCacheBridge.RecyclableBridge.class, obj, "createBridge", "createBridge()Lorg/luckypray/dexkit/DexKitBridge;");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0298hw
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
    @Override // p000.InterfaceC0298hw
    public final CacheBridgeRuntime invoke() {
        return new CacheBridgeRuntime(this.this$0.appTag, this.this$0, DexKitCacheBridge.reaperScheduler, C05791.INSTANCE, new C05802(this.this$0), new C05813(this.this$0), new C05824(this.this$0), new C05835(this.this$0));
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$3 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05813 extends c50 implements InterfaceC0298hw {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05813(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Possible override for method hw.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m5656invoke() {
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

        @Override // p000.InterfaceC0298hw
        public /* bridge */ /* synthetic */ Object invoke() {
            m5656invoke();
            return na1.f4229a;
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$4 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05824 extends c50 implements InterfaceC0298hw {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05824(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Possible override for method hw.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m5657invoke() {
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

        @Override // p000.InterfaceC0298hw
        public /* bridge */ /* synthetic */ Object invoke() {
            m5657invoke();
            return na1.f4229a;
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$5 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05835 extends c50 implements InterfaceC0298hw {
        final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05835(DexKitCacheBridge.RecyclableBridge recyclableBridge) {
            super(0);
            this.this$0 = recyclableBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Possible override for method hw.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m5658invoke() {
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

        @Override // p000.InterfaceC0298hw
        public /* bridge */ /* synthetic */ Object invoke() {
            m5658invoke();
            return na1.f4229a;
        }
    }
}
