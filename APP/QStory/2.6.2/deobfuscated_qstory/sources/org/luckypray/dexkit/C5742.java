package org.luckypray.dexkit;

import com.alibaba.fastjson2.C2941;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;
import p367.C8952;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.luckypray.dexkit.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5742 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5183 f15728 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new InterfaceC6542() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2

        /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements InterfaceC6542 {
            public AnonymousClass2(Object obj) {
                super(0, obj, C5742.class, "createBridge", "createBridge()Lorg/luckypray/dexkit/DexKitBridge;", 0);
            }

            @Override // p052.InterfaceC6542
            public final DexKitBridge invoke() {
                C5742 c5742 = (C5742) this.receiver;
                String str = c5742.f15730;
                if (str != null) {
                    return new DexKitBridge(str);
                }
                byte[][] bArr = c5742.f15731;
                if (bArr != null) {
                    return new DexKitBridge(bArr);
                }
                ClassLoader classLoader = c5742.f15729;
                if (classLoader == null) {
                    C5919.m11250("init fail");
                    return null;
                }
                try {
                    if (Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoader)) {
                        return new DexKitBridge(classLoader);
                    }
                    C5919.m11250("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                    return null;
                } catch (ClassNotFoundException unused) {
                    C5919.m11250("This method requires Android runtime");
                    return null;
                }
            }
        }

        {
            super(0);
        }

        @Override // p052.InterfaceC6542
        public final C8952 invoke() {
            C5742 c5742 = this.this$0;
            String str = c5742.f15732;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AbstractC5744.f15735;
            AnonymousClass1 anonymousClass1 = new InterfaceC6542() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.1
                @Override // p052.InterfaceC6542
                public final Long invoke() {
                    return Long.valueOf(AbstractC5744.f15733);
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            final C5742 c57422 = this.this$0;
            InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.3
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11058invoke() {
                    Iterator it = AbstractC5744.f15734.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C2941.m6336();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC5744.f15735;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m8755constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p052.InterfaceC6542
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11058invoke();
                    return C5175.f14739;
                }
            };
            final C5742 c57423 = this.this$0;
            InterfaceC6542 interfaceC65422 = new InterfaceC6542() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.4
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11059invoke() {
                    Iterator it = AbstractC5744.f15734.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C2941.m6336();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC5744.f15735;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m8755constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p052.InterfaceC6542
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11059invoke();
                    return C5175.f14739;
                }
            };
            final C5742 c57424 = this.this$0;
            return new C8952(str, c5742, scheduledThreadPoolExecutor, anonymousClass1, anonymousClass2, interfaceC6542, interfaceC65422, new InterfaceC6542() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.5
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11060invoke() {
                    Iterator it = AbstractC5744.f15734.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C2941.m6336();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC5744.f15735;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m8755constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p052.InterfaceC6542
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11060invoke();
                    return C5175.f14739;
                }
            });
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ClassLoader f15729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f15730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final byte[][] f15731;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f15732;

    public C5742(String str, String str2, byte[][] bArr, ClassLoader classLoader) {
        this.f15732 = str;
        this.f15730 = str2;
        this.f15731 = bArr;
        this.f15729 = classLoader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM14543;
        C8952 c8952M11078 = m11078();
        synchronized (c8952M11078.f25173) {
            try {
                if (c8952M11078.f25169.get()) {
                    throw new IllegalStateException("RecyclableBridge is destroyed");
                }
                c8952M11078.f25171++;
                ScheduledFuture scheduledFuture = c8952M11078.f25168;
                zM14543 = false;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                c8952M11078.f25168 = null;
                if (c8952M11078.f25174 == 0) {
                    c8952M11078.f25172 = false;
                    zM14543 = c8952M11078.m14543();
                    c8952M11078.m14544();
                } else {
                    c8952M11078.f25172 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM14543) {
            c8952M11078.f25170.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8952 m11078() {
        return (C8952) this.f15728.getValue();
    }
}
