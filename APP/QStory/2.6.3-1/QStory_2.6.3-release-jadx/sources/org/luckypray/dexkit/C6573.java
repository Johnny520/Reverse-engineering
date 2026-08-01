package org.luckypray.dexkit;

import com.alibaba.fastjson2.C3775;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7372;
import p386.C9790;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.luckypray.dexkit.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6573 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6016 f16073 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new InterfaceC7372() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2

        /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m152k = 3, m153mv = {1, 5, 1}, m155xi = 48)
        public /* synthetic */ class C07792 extends FunctionReferenceImpl implements InterfaceC7372 {
            public C07792(Object obj) {
                super(0, obj, C6573.class, "createBridge", "createBridge()Lorg/luckypray/dexkit/DexKitBridge;", 0);
            }

            @Override // p068.InterfaceC7372
            public final DexKitBridge invoke() {
                C6573 c6573 = (C6573) this.receiver;
                String str = c6573.f16075;
                if (str != null) {
                    return new DexKitBridge(str);
                }
                byte[][] bArr = c6573.f16076;
                if (bArr != null) {
                    return new DexKitBridge(bArr);
                }
                ClassLoader classLoader = c6573.f16074;
                if (classLoader == null) {
                    C6755.m11870("init fail");
                    return null;
                }
                try {
                    if (Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoader)) {
                        return new DexKitBridge(classLoader);
                    }
                    C6755.m11870("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                    return null;
                } catch (ClassNotFoundException unused) {
                    C6755.m11870("This method requires Android runtime");
                    return null;
                }
            }
        }

        {
            super(0);
        }

        @Override // p068.InterfaceC7372
        public final C9790 invoke() {
            C6573 c6573 = this.this$0;
            String str = c6573.f16077;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AbstractC6575.f16080;
            C07781 c07781 = new InterfaceC7372() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.1
                @Override // p068.InterfaceC7372
                public final Long invoke() {
                    return Long.valueOf(AbstractC6575.f16078);
                }
            };
            C07792 c07792 = new C07792(this.this$0);
            final C6573 c65732 = this.this$0;
            InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.3
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11674invoke() {
                    Iterator it = AbstractC6575.f16079.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C3775.m6954();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC6575.f16080;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m9304constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11674invoke();
                    return C6008.f15084;
                }
            };
            final C6573 c65733 = this.this$0;
            InterfaceC7372 interfaceC73722 = new InterfaceC7372() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.4
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11675invoke() {
                    Iterator it = AbstractC6575.f16079.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C3775.m6954();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC6575.f16080;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m9304constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11675invoke();
                    return C6008.f15084;
                }
            };
            final C6573 c65734 = this.this$0;
            return new C9790(str, c6573, scheduledThreadPoolExecutor, c07781, c07792, interfaceC7372, interfaceC73722, new InterfaceC7372() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.5
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11676invoke() {
                    Iterator it = AbstractC6575.f16079.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C3775.m6954();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC6575.f16080;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m9304constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11676invoke();
                    return C6008.f15084;
                }
            });
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ClassLoader f16074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16075;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final byte[][] f16076;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f16077;

    public C6573(String str, String str2, byte[][] bArr, ClassLoader classLoader) {
        this.f16077 = str;
        this.f16075 = str2;
        this.f16076 = bArr;
        this.f16074 = classLoader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM15134;
        C9790 c9790M11694 = m11694();
        synchronized (c9790M11694.f25519) {
            try {
                if (c9790M11694.f25515.get()) {
                    throw new IllegalStateException("RecyclableBridge is destroyed");
                }
                c9790M11694.f25517++;
                ScheduledFuture scheduledFuture = c9790M11694.f25514;
                zM15134 = false;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                c9790M11694.f25514 = null;
                if (c9790M11694.f25520 == 0) {
                    c9790M11694.f25518 = false;
                    zM15134 = c9790M11694.m15134();
                    c9790M11694.m15135();
                } else {
                    c9790M11694.f25518 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM15134) {
            c9790M11694.f25516.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9790 m11694() {
        return (C9790) this.f16073.getValue();
    }
}
