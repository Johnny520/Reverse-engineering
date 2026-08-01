package io.ktor.network.selector;

import androidx.core.view.C2242;
import com.bumptech.glide.AbstractC3054;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5446;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4002 implements Closeable, InterfaceC5400, InterfaceC4005 {
    private volatile boolean closed;
    private volatile boolean inSelect;
    private volatile Selector selectorRef;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2242 f12250;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AtomicLong f12251;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3998 f12252;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC4359 f12253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f12254;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SelectorProvider f12256;

    public C4002(InterfaceC4359 interfaceC4359) {
        SelectorProvider selectorProviderProvider = SelectorProvider.provider();
        selectorProviderProvider.getClass();
        this.f12256 = selectorProviderProvider;
        this.f12251 = new AtomicLong();
        this.f12250 = new C2242((byte) 0, 16);
        this.f12252 = new C3998();
        this.f12253 = interfaceC4359.plus(new C5401("selector"));
        AbstractC5398.m10473(this, null, null, new ActorSelectorManager$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
    
        if (r10 != r1) goto L48;
     */
    /* JADX WARN: Path cross not found for [B:45:0x00f6, B:46:0x00fa], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[LOOP:1: B:21:0x0074->B:52:0x0107, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0098 -> B:19:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b2 -> B:19:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c2 -> B:19:0x0070). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8406(io.ktor.network.selector.C4002 r7, io.ktor.network.selector.C3998 r8, java.nio.channels.spi.AbstractSelector r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.C4002.m8406(io.ktor.network.selector.飘花落叶言子楪世苏哲兰, io.ktor.network.selector.飘花落叶言子楪世兰苏哲, java.nio.channels.spi.AbstractSelector, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m8407(InterfaceC4007 interfaceC4007, Throwable th) {
        interfaceC4007.getClass();
        C3999 c3999Mo8427 = interfaceC4007.mo8427();
        SelectInterest.Companion.getClass();
        for (SelectInterest selectInterest : SelectInterest.AllInterests) {
            c3999Mo8427.getClass();
            selectInterest.getClass();
            InterfaceC5446 interfaceC5446 = (InterfaceC5446) C3999.f12247[selectInterest.ordinal()].getAndSet(c3999Mo8427, null);
            if (interfaceC5446 != null) {
                interfaceC5446.resumeWith(Result.m8755constructorimpl(new Result.Failure(th)));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static void m8408(AbstractSelector abstractSelector, Throwable th) {
        abstractSelector.getClass();
        if (th == null) {
            th = new CancellationException() { // from class: io.ktor.network.selector.SelectorManagerSupport$ClosedSelectorCancellationException
            };
        }
        Set<SelectionKey> setKeys = abstractSelector.keys();
        setKeys.getClass();
        for (SelectionKey selectionKey : setKeys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object objAttachment = selectionKey.attachment();
            InterfaceC4007 interfaceC4007 = objAttachment instanceof InterfaceC4007 ? (InterfaceC4007) objAttachment : null;
            if (interfaceC4007 != null) {
                m8407(interfaceC4007, th);
            }
            selectionKey.cancel();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
        this.f12252.m8396();
        C2242 c2242 = this.f12250;
        C5175 c5175 = C5175.f14739;
        InterfaceC4356 interfaceC4356 = (InterfaceC4356) ((AtomicReference) c2242.f6536).getAndSet(null);
        if (interfaceC4356 == null) {
            m8412();
        } else {
            interfaceC4356.resumeWith(Result.m8755constructorimpl(c5175));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8411(java.nio.channels.Selector r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.network.selector.ActorSelectorManager$select$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.network.selector.ActorSelectorManager$select$1 r0 = (io.ktor.network.selector.ActorSelectorManager$select$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.selector.ActorSelectorManager$select$1 r0 = new io.ktor.network.selector.ActorSelectorManager$select$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.L$1
            r5 = r4
            java.nio.channels.Selector r5 = (java.nio.channels.Selector) r5
            java.lang.Object r4 = r0.L$0
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r4 = (io.ktor.network.selector.C4002) r4
            kotlin.AbstractC5184.m10206(r6)
            goto L49
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L37:
            kotlin.AbstractC5184.m10206(r6)
            r4.inSelect = r3
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5398.m10468(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.util.concurrent.atomic.AtomicLong r6 = r4.f12251
            long r0 = r6.get()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r6 != 0) goto L5f
            r1 = 500(0x1f4, double:2.47E-321)
            int r5 = r5.select(r1)
            r4.inSelect = r0
            goto L6a
        L5f:
            r4.inSelect = r0
            java.util.concurrent.atomic.AtomicLong r4 = r4.f12251
            r4.set(r2)
            int r5 = r5.selectNow()
        L6a:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.C4002.m8411(java.nio.channels.Selector, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m8412() {
        Selector selector;
        if (this.f12251.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final Object m8413(InterfaceC4007 interfaceC4007, SelectInterest selectInterest, ContinuationImpl continuationImpl) throws IOException {
        int iMo8424 = interfaceC4007.mo8424();
        int flag = selectInterest.getFlag();
        if (interfaceC4007.isClosed()) {
            C5919.m11246("Selectable is already closed");
            return null;
        }
        if ((iMo8424 & flag) == 0) {
            throw new IllegalStateException(("Selectable is invalid state: " + iMo8424 + ", " + flag).toString());
        }
        C5443 c5443 = new C5443(1, AbstractC3054.m6602(continuationImpl));
        c5443.m10539();
        c5443.m10537(C4006.f12264);
        C3999 c3999Mo8427 = interfaceC4007.mo8427();
        c3999Mo8427.getClass();
        AtomicReferenceFieldUpdater[] atomicReferenceFieldUpdaterArr = C3999.f12247;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3999.f12247[selectInterest.ordinal()];
        while (!atomicReferenceFieldUpdater.compareAndSet(c3999Mo8427, null, c5443)) {
            if (atomicReferenceFieldUpdater.get(c3999Mo8427) != null) {
                throw new IllegalStateException(("Handler for " + selectInterest.name() + " is already registered").toString());
            }
        }
        boolean z = c5443.m10535() instanceof C5444;
        C5175 c5175 = C5175.f14739;
        if (!z) {
            try {
                if (!this.f12252.m8397(interfaceC4007)) {
                    if (interfaceC4007.mo8426().isOpen()) {
                        throw new ClosedSelectorException();
                    }
                    throw new ClosedChannelException();
                }
                InterfaceC4356 interfaceC4356 = (InterfaceC4356) ((AtomicReference) this.f12250.f6536).getAndSet(null);
                if (interfaceC4356 != null) {
                    interfaceC4356.resumeWith(Result.m8755constructorimpl(c5175));
                }
                m8412();
            } catch (Throwable th) {
                m8407(interfaceC4007, th);
            }
        }
        Object objM10536 = c5443.m10536();
        return objM10536 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10536 : c5175;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12253;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m8414(InterfaceC4007 interfaceC4007) {
        SelectionKey selectionKeyKeyFor;
        m8407(interfaceC4007, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = interfaceC4007.mo8426().keyFor(selector)) == null) {
            return;
        }
        selectionKeyKeyFor.cancel();
        m8412();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m8415(Set set, Set set2) {
        int size = set.size();
        this.f12254 = set2.size() - size;
        this.f12255 = 0;
        if (size <= 0) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SelectionKey selectionKey = (SelectionKey) it.next();
            selectionKey.getClass();
            try {
                int i = selectionKey.readyOps();
                int iInterestOps = selectionKey.interestOps();
                Object objAttachment = selectionKey.attachment();
                InterfaceC4007 interfaceC4007 = objAttachment instanceof InterfaceC4007 ? (InterfaceC4007) objAttachment : null;
                if (interfaceC4007 == null) {
                    selectionKey.cancel();
                    this.f12255++;
                } else {
                    C3999 c3999Mo8427 = interfaceC4007.mo8427();
                    SelectInterest.Companion.getClass();
                    int[] iArr = SelectInterest.flags;
                    int length = iArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if ((iArr[i2] & i) != 0) {
                            c3999Mo8427.getClass();
                            InterfaceC5446 interfaceC5446 = (InterfaceC5446) C3999.f12247[i2].getAndSet(c3999Mo8427, null);
                            if (interfaceC5446 != null) {
                                interfaceC5446.resumeWith(Result.m8755constructorimpl(C5175.f14739));
                            }
                        }
                    }
                    int i3 = (~i) & iInterestOps;
                    if (i3 != iInterestOps) {
                        selectionKey.interestOps(i3);
                    }
                    if (i3 != 0) {
                        this.f12254++;
                    }
                }
            } catch (Throwable th) {
                selectionKey.cancel();
                this.f12255++;
                Object objAttachment2 = selectionKey.attachment();
                InterfaceC4007 interfaceC40072 = objAttachment2 instanceof InterfaceC4007 ? (InterfaceC4007) objAttachment2 : null;
                if (interfaceC40072 != null) {
                    m8407(interfaceC40072, th);
                    selectionKey.attach(null);
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8416(io.ktor.network.selector.C3998 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1 r0 = (io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1 r0 = new io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.L$1
            io.ktor.network.selector.飘花落叶言子楪世兰苏哲 r7 = (io.ktor.network.selector.C3998) r7
            java.lang.Object r8 = r0.L$0
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r8 = (io.ktor.network.selector.C4002) r8
            kotlin.AbstractC5184.m10206(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L3c
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r4
        L39:
            kotlin.AbstractC5184.m10206(r9)
        L3c:
            java.lang.Object r9 = r8.m8394()
            io.ktor.network.selector.飘花落叶言子楪苏哲世兰 r9 = (io.ktor.network.selector.InterfaceC4007) r9
            if (r9 == 0) goto L45
            return r9
        L45:
            boolean r9 = r7.closed
            if (r9 == 0) goto L4a
            return r4
        L4a:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            androidx.core.view.飘花落叶言子楪世兰哲苏 r9 = r7.f12250
            boolean r2 = r8.m8395()
            if (r2 == 0) goto L7c
            boolean r2 = r7.closed
            if (r2 != 0) goto L7c
            java.lang.Object r2 = r9.f6536
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
        L60:
            boolean r5 = r2.compareAndSet(r4, r0)
            if (r5 == 0) goto L87
            boolean r2 = r8.m8395()
            if (r2 == 0) goto L71
            boolean r2 = r7.closed
            if (r2 != 0) goto L71
            goto L84
        L71:
            java.lang.Object r9 = r9.f6536
            r5 = r9
            java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5
        L76:
            boolean r9 = r5.compareAndSet(r0, r4)
            if (r9 == 0) goto L7e
        L7c:
            r9 = r4
            goto L94
        L7e:
            java.lang.Object r9 = r5.get()
            if (r9 == r0) goto L76
        L84:
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            goto L94
        L87:
            java.lang.Object r5 = r2.get()
            if (r5 != 0) goto L8e
            goto L60
        L8e:
            java.lang.String r7 = "Continuation is already set"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r4
        L94:
            if (r9 != 0) goto L98
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5175.f14739
        L98:
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r9 != r1) goto L3c
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.C4002.m8416(io.ktor.network.selector.飘花落叶言子楪世兰苏哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m8417(Selector selector, InterfaceC4007 interfaceC4007) {
        selector.getClass();
        try {
            SelectableChannel selectableChannelMo8426 = interfaceC4007.mo8426();
            SelectionKey selectionKeyKeyFor = selectableChannelMo8426.keyFor(selector);
            int iMo8424 = interfaceC4007.mo8424();
            if (selectionKeyKeyFor == null) {
                if (iMo8424 != 0) {
                    selectableChannelMo8426.register(selector, iMo8424, interfaceC4007);
                }
            } else if (selectionKeyKeyFor.interestOps() != iMo8424) {
                selectionKeyKeyFor.interestOps(iMo8424);
            }
            if (iMo8424 != 0) {
                this.f12254++;
            }
        } catch (Throwable th) {
            SelectionKey selectionKeyKeyFor2 = interfaceC4007.mo8426().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            m8407(interfaceC4007, th);
        }
    }
}
