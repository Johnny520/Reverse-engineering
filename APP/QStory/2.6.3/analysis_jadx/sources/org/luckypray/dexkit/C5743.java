package org.luckypray.dexkit;

import com.alibaba.fastjson2.C2942;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6543;
import p370.C8961;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: org.luckypray.dexkit.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5743 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5184 f15728 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new InterfaceC6543() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2

        /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements InterfaceC6543 {
            public AnonymousClass2(Object obj) {
                super(0, obj, C5743.class, "createBridge", "createBridge()Lorg/luckypray/dexkit/DexKitBridge;", 0);
            }

            @Override // p052.InterfaceC6543
            public final DexKitBridge invoke() {
                C5743 c5743 = (C5743) this.receiver;
                String str = c5743.f15730;
                if (str != null) {
                    return new DexKitBridge(str);
                }
                byte[][] bArr = c5743.f15731;
                if (bArr != null) {
                    return new DexKitBridge(bArr);
                }
                ClassLoader classLoader = c5743.f15729;
                if (classLoader == null) {
                    C5925.m11311("init fail");
                    return null;
                }
                try {
                    if (Class.forName("dalvik.system.BaseDexClassLoader").isInstance(classLoader)) {
                        return new DexKitBridge(classLoader);
                    }
                    C5925.m11311("classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)");
                    return null;
                } catch (ClassNotFoundException unused) {
                    C5925.m11311("This method requires Android runtime");
                    return null;
                }
            }
        }

        {
            super(0);
        }

        @Override // p052.InterfaceC6543
        public final C8961 invoke() {
            C5743 c5743 = this.this$0;
            String str = c5743.f15732;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AbstractC5745.f15735;
            AnonymousClass1 anonymousClass1 = new InterfaceC6543() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.1
                @Override // p052.InterfaceC6543
                public final Long invoke() {
                    return Long.valueOf(AbstractC5745.f15733);
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            final C5743 c57432 = this.this$0;
            InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.3
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11115invoke() {
                    Iterator it = AbstractC5745.f15734.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C2942.m6394();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC5745.f15735;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m8745constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p052.InterfaceC6543
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11115invoke();
                    return C5176.f14739;
                }
            };
            final C5743 c57433 = this.this$0;
            InterfaceC6543 interfaceC65432 = new InterfaceC6543() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.4
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11116invoke() {
                    Iterator it = AbstractC5745.f15734.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C2942.m6394();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC5745.f15735;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m8745constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p052.InterfaceC6543
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11116invoke();
                    return C5176.f14739;
                }
            };
            final C5743 c57434 = this.this$0;
            return new C8961(str, c5743, scheduledThreadPoolExecutor, anonymousClass1, anonymousClass2, interfaceC6543, interfaceC65432, new InterfaceC6543() { // from class: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$runtime$2.5
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m11117invoke() {
                    Iterator it = AbstractC5745.f15734.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C2942.m6394();
                            return;
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = AbstractC5745.f15735;
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Result.m8745constructorimpl(new Result.Failure(th));
                        }
                    }
                }

                @Override // p052.InterfaceC6543
                public /* bridge */ /* synthetic */ Object invoke() {
                    m11117invoke();
                    return C5176.f14739;
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

    public C5743(String str, String str2, byte[][] bArr, ClassLoader classLoader) {
        this.f15732 = str;
        this.f15730 = str2;
        this.f15731 = bArr;
        this.f15729 = classLoader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM14575;
        C8961 c8961M11135 = m11135();
        synchronized (c8961M11135.f25174) {
            try {
                if (c8961M11135.f25170.get()) {
                    throw new IllegalStateException("RecyclableBridge is destroyed");
                }
                c8961M11135.f25172++;
                ScheduledFuture scheduledFuture = c8961M11135.f25169;
                zM14575 = false;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                c8961M11135.f25169 = null;
                if (c8961M11135.f25175 == 0) {
                    c8961M11135.f25173 = false;
                    zM14575 = c8961M11135.m14575();
                    c8961M11135.m14576();
                } else {
                    c8961M11135.f25173 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM14575) {
            c8961M11135.f25171.invoke();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8961 m11135() {
        return (C8961) this.f15728.getValue();
    }
}
