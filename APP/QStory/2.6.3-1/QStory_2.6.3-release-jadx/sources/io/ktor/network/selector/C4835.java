package io.ktor.network.selector;

import androidx.core.view.C3075;
import androidx.window.area.AbstractC3400;
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
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.C6277;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6279;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4835 implements Closeable, InterfaceC6233, InterfaceC4838 {
    private volatile boolean closed;
    private volatile boolean inSelect;
    private volatile Selector selectorRef;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3075 f12599;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AtomicLong f12600;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4831 f12601;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5192 f12602;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f12603;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12604;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SelectorProvider f12605;

    public C4835(InterfaceC5192 interfaceC5192) {
        SelectorProvider selectorProviderProvider = SelectorProvider.provider();
        selectorProviderProvider.getClass();
        this.f12605 = selectorProviderProvider;
        this.f12600 = new AtomicLong();
        this.f12599 = new C3075((byte) 0, 16);
        this.f12601 = new C4831();
        this.f12602 = interfaceC5192.plus(new C6234("selector"));
        AbstractC6231.m11036(this, null, null, new ActorSelectorManager$1(this, null), 3);
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
    */
    public static final Object m8955(C4835 c4835, C4831 c4831, AbstractSelector abstractSelector, ContinuationImpl continuationImpl) throws IOException {
        ActorSelectorManager$process$1 actorSelectorManager$process$1;
        Selector selector;
        C4835 c48352;
        Selector selector2;
        C4835 c48353;
        c4835.getClass();
        if (continuationImpl instanceof ActorSelectorManager$process$1) {
            actorSelectorManager$process$1 = (ActorSelectorManager$process$1) continuationImpl;
            int i = actorSelectorManager$process$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$process$1.label = i - Integer.MIN_VALUE;
            } else {
                actorSelectorManager$process$1 = new ActorSelectorManager$process$1(c4835, continuationImpl);
            }
        }
        Object objM8961 = actorSelectorManager$process$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = actorSelectorManager$process$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM8961);
            c48353 = c4835;
            selector2 = abstractSelector;
        } else if (i2 == 1) {
            Selector selector3 = (Selector) actorSelectorManager$process$1.L$2;
            c4831 = (C4831) actorSelectorManager$process$1.L$1;
            C4835 c48354 = (C4835) actorSelectorManager$process$1.L$0;
            AbstractC6017.m10769(objM8961);
            selector = selector3;
            c48352 = c48354;
            if (((Number) objM8961).intValue() <= 0) {
                InterfaceC4840 interfaceC4840 = (InterfaceC4840) c4831.m8943();
                if (interfaceC4840 == null) {
                    actorSelectorManager$process$1.L$0 = c48352;
                    actorSelectorManager$process$1.L$1 = c4831;
                    actorSelectorManager$process$1.L$2 = selector;
                    actorSelectorManager$process$1.label = 2;
                    c48353 = c48352;
                    selector2 = selector;
                    if (AbstractC6231.m11031(actorSelectorManager$process$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                c48352.m8966(selector, interfaceC4840);
                c48353 = c48352;
                selector2 = selector;
            } else {
                Set<SelectionKey> setSelectedKeys = selector.selectedKeys();
                setSelectedKeys.getClass();
                Set<SelectionKey> setKeys = selector.keys();
                setKeys.getClass();
                c48352.m8964(setSelectedKeys, setKeys);
                c48353 = c48352;
                selector2 = selector;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Selector selector4 = (Selector) actorSelectorManager$process$1.L$2;
                c4831 = (C4831) actorSelectorManager$process$1.L$1;
                C4835 c48355 = (C4835) actorSelectorManager$process$1.L$0;
                AbstractC6017.m10769(objM8961);
                selector2 = selector4;
                c48353 = c48355;
                InterfaceC4840 interfaceC48402 = (InterfaceC4840) objM8961;
                if (interfaceC48402 != null) {
                    c48353.m8966(selector2, interfaceC48402);
                    c48353 = c48353;
                    selector2 = selector2;
                }
                return C6008.f15084;
            }
            Selector selector5 = (Selector) actorSelectorManager$process$1.L$2;
            c4831 = (C4831) actorSelectorManager$process$1.L$1;
            C4835 c48356 = (C4835) actorSelectorManager$process$1.L$0;
            AbstractC6017.m10769(objM8961);
            selector2 = selector5;
            c48353 = c48356;
        }
        while (!c48353.closed) {
            while (true) {
                InterfaceC4840 interfaceC48403 = (InterfaceC4840) c4831.m8943();
                if (interfaceC48403 == null) {
                    break;
                }
                c48353.m8966(selector2, interfaceC48403);
            }
            if (c48353.f12603 > 0) {
                actorSelectorManager$process$1.L$0 = c48353;
                actorSelectorManager$process$1.L$1 = c4831;
                actorSelectorManager$process$1.L$2 = selector2;
                actorSelectorManager$process$1.label = 1;
                objM8961 = c48353.m8961(selector2, actorSelectorManager$process$1);
                c48352 = c48353;
                selector = selector2;
                if (objM8961 != coroutineSingletons) {
                    if (((Number) objM8961).intValue() <= 0) {
                    }
                    while (!c48353.closed) {
                    }
                }
            } else if (c48353.f12604 > 0) {
                selector2.selectNow();
                if (c48353.f12603 > 0) {
                    Set<SelectionKey> setSelectedKeys2 = selector2.selectedKeys();
                    setSelectedKeys2.getClass();
                    Set<SelectionKey> setKeys2 = selector2.keys();
                    setKeys2.getClass();
                    c48353.m8964(setSelectedKeys2, setKeys2);
                } else {
                    c48353.f12604 = 0;
                }
            } else {
                actorSelectorManager$process$1.L$0 = c48353;
                actorSelectorManager$process$1.L$1 = c4831;
                actorSelectorManager$process$1.L$2 = selector2;
                actorSelectorManager$process$1.label = 3;
                objM8961 = (InterfaceC4840) c4831.m8943();
                if (objM8961 == null) {
                    objM8961 = c48353.m8965(c4831, actorSelectorManager$process$1);
                }
            }
            return coroutineSingletons;
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static void m8956(AbstractSelector abstractSelector, Throwable th) {
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
            InterfaceC4840 interfaceC4840 = objAttachment instanceof InterfaceC4840 ? (InterfaceC4840) objAttachment : null;
            if (interfaceC4840 != null) {
                m8957(interfaceC4840, th);
            }
            selectionKey.cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m8957(InterfaceC4840 interfaceC4840, Throwable th) {
        interfaceC4840.getClass();
        C4832 c4832Mo8976 = interfaceC4840.mo8976();
        SelectInterest.Companion.getClass();
        for (SelectInterest selectInterest : SelectInterest.AllInterests) {
            c4832Mo8976.getClass();
            selectInterest.getClass();
            InterfaceC6279 interfaceC6279 = (InterfaceC6279) C4832.f12596[selectInterest.ordinal()].getAndSet(c4832Mo8976, null);
            if (interfaceC6279 != null) {
                interfaceC6279.resumeWith(Result.m9304constructorimpl(new Result.Failure(th)));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
        this.f12601.m8945();
        C3075 c3075 = this.f12599;
        C6008 c6008 = C6008.f15084;
        InterfaceC5189 interfaceC5189 = (InterfaceC5189) ((AtomicReference) c3075.f6882).getAndSet(null);
        if (interfaceC5189 == null) {
            m8960();
        } else {
            interfaceC5189.resumeWith(Result.m9304constructorimpl(c6008));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m8960() {
        Selector selector;
        if (this.f12600.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8961(Selector selector, ContinuationImpl continuationImpl) throws IOException {
        ActorSelectorManager$select$1 actorSelectorManager$select$1;
        int iSelectNow;
        if (continuationImpl instanceof ActorSelectorManager$select$1) {
            actorSelectorManager$select$1 = (ActorSelectorManager$select$1) continuationImpl;
            int i = actorSelectorManager$select$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$select$1.label = i - Integer.MIN_VALUE;
            } else {
                actorSelectorManager$select$1 = new ActorSelectorManager$select$1(this, continuationImpl);
            }
        }
        Object obj = actorSelectorManager$select$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = actorSelectorManager$select$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            this.inSelect = true;
            actorSelectorManager$select$1.L$0 = this;
            actorSelectorManager$select$1.L$1 = selector;
            actorSelectorManager$select$1.label = 1;
            if (AbstractC6231.m11031(actorSelectorManager$select$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            selector = (Selector) actorSelectorManager$select$1.L$1;
            this = (C4835) actorSelectorManager$select$1.L$0;
            AbstractC6017.m10769(obj);
        }
        if (this.f12600.get() == 0) {
            iSelectNow = selector.select(500L);
            this.inSelect = false;
        } else {
            this.inSelect = false;
            this.f12600.set(0L);
            iSelectNow = selector.selectNow();
        }
        return new Integer(iSelectNow);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final Object m8962(InterfaceC4840 interfaceC4840, SelectInterest selectInterest, ContinuationImpl continuationImpl) throws IOException {
        int iMo8975 = interfaceC4840.mo8975();
        int flag = selectInterest.getFlag();
        if (interfaceC4840.isClosed()) {
            C6755.m11866("Selectable is already closed");
            return null;
        }
        if ((iMo8975 & flag) == 0) {
            throw new IllegalStateException(("Selectable is invalid state: " + iMo8975 + ", " + flag).toString());
        }
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(continuationImpl));
        c6276.m11102();
        c6276.m11100(C4839.f12613);
        C4832 c4832Mo8976 = interfaceC4840.mo8976();
        c4832Mo8976.getClass();
        AtomicReferenceFieldUpdater[] atomicReferenceFieldUpdaterArr = C4832.f12596;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4832.f12596[selectInterest.ordinal()];
        while (!atomicReferenceFieldUpdater.compareAndSet(c4832Mo8976, null, c6276)) {
            if (atomicReferenceFieldUpdater.get(c4832Mo8976) != null) {
                throw new IllegalStateException(("Handler for " + selectInterest.name() + " is already registered").toString());
            }
        }
        boolean z = c6276.m11098() instanceof C6277;
        C6008 c6008 = C6008.f15084;
        if (!z) {
            try {
                if (!this.f12601.m8946(interfaceC4840)) {
                    if (interfaceC4840.mo8974().isOpen()) {
                        throw new ClosedSelectorException();
                    }
                    throw new ClosedChannelException();
                }
                InterfaceC5189 interfaceC5189 = (InterfaceC5189) ((AtomicReference) this.f12599.f6882).getAndSet(null);
                if (interfaceC5189 != null) {
                    interfaceC5189.resumeWith(Result.m9304constructorimpl(c6008));
                }
                m8960();
            } catch (Throwable th) {
                m8957(interfaceC4840, th);
            }
        }
        Object objM11099 = c6276.m11099();
        return objM11099 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11099 : c6008;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12602;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m8963(InterfaceC4840 interfaceC4840) {
        SelectionKey selectionKeyKeyFor;
        m8957(interfaceC4840, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = interfaceC4840.mo8974().keyFor(selector)) == null) {
            return;
        }
        selectionKeyKeyFor.cancel();
        m8960();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m8964(Set set, Set set2) {
        int size = set.size();
        this.f12603 = set2.size() - size;
        this.f12604 = 0;
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
                InterfaceC4840 interfaceC4840 = objAttachment instanceof InterfaceC4840 ? (InterfaceC4840) objAttachment : null;
                if (interfaceC4840 == null) {
                    selectionKey.cancel();
                    this.f12604++;
                } else {
                    C4832 c4832Mo8976 = interfaceC4840.mo8976();
                    SelectInterest.Companion.getClass();
                    int[] iArr = SelectInterest.flags;
                    int length = iArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if ((iArr[i2] & i) != 0) {
                            c4832Mo8976.getClass();
                            InterfaceC6279 interfaceC6279 = (InterfaceC6279) C4832.f12596[i2].getAndSet(c4832Mo8976, null);
                            if (interfaceC6279 != null) {
                                interfaceC6279.resumeWith(Result.m9304constructorimpl(C6008.f15084));
                            }
                        }
                    }
                    int i3 = (~i) & iInterestOps;
                    if (i3 != iInterestOps) {
                        selectionKey.interestOps(i3);
                    }
                    if (i3 != 0) {
                        this.f12603++;
                    }
                }
            } catch (Throwable th) {
                selectionKey.cancel();
                this.f12604++;
                Object objAttachment2 = selectionKey.attachment();
                InterfaceC4840 interfaceC48402 = objAttachment2 instanceof InterfaceC4840 ? (InterfaceC4840) objAttachment2 : null;
                if (interfaceC48402 != null) {
                    m8957(interfaceC48402, th);
                    selectionKey.attach(null);
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8965(C4831 c4831, ContinuationImpl continuationImpl) {
        ActorSelectorManager$receiveOrNullSuspend$1 actorSelectorManager$receiveOrNullSuspend$1;
        Object obj;
        if (continuationImpl instanceof ActorSelectorManager$receiveOrNullSuspend$1) {
            actorSelectorManager$receiveOrNullSuspend$1 = (ActorSelectorManager$receiveOrNullSuspend$1) continuationImpl;
            int i = actorSelectorManager$receiveOrNullSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$receiveOrNullSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                actorSelectorManager$receiveOrNullSuspend$1 = new ActorSelectorManager$receiveOrNullSuspend$1(this, continuationImpl);
            }
        }
        Object obj2 = actorSelectorManager$receiveOrNullSuspend$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = actorSelectorManager$receiveOrNullSuspend$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4831 c48312 = (C4831) actorSelectorManager$receiveOrNullSuspend$1.L$1;
            C4835 c4835 = (C4835) actorSelectorManager$receiveOrNullSuspend$1.L$0;
            AbstractC6017.m10769(obj2);
            c4831 = c48312;
            this = c4835;
        }
        do {
            InterfaceC4840 interfaceC4840 = (InterfaceC4840) c4831.m8943();
            if (interfaceC4840 != null) {
                return interfaceC4840;
            }
            if (this.closed) {
                return null;
            }
            actorSelectorManager$receiveOrNullSuspend$1.L$0 = this;
            actorSelectorManager$receiveOrNullSuspend$1.L$1 = c4831;
            actorSelectorManager$receiveOrNullSuspend$1.label = 1;
            C3075 c3075 = this.f12599;
            if (c4831.m8944() && !this.closed) {
                AtomicReference atomicReference = (AtomicReference) c3075.f6882;
                while (!atomicReference.compareAndSet(null, actorSelectorManager$receiveOrNullSuspend$1)) {
                    if (atomicReference.get() != null) {
                        C6755.m11870("Continuation is already set");
                        return null;
                    }
                }
                if (!c4831.m8944() || this.closed) {
                    AtomicReference atomicReference2 = (AtomicReference) c3075.f6882;
                    while (!atomicReference2.compareAndSet(actorSelectorManager$receiveOrNullSuspend$1, null)) {
                        if (atomicReference2.get() != actorSelectorManager$receiveOrNullSuspend$1) {
                        }
                    }
                    obj = null;
                }
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            }
            obj = null;
            if (obj == null) {
                obj = C6008.f15084;
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        } while (obj != obj3);
        return obj3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m8966(Selector selector, InterfaceC4840 interfaceC4840) {
        selector.getClass();
        try {
            SelectableChannel selectableChannelMo8974 = interfaceC4840.mo8974();
            SelectionKey selectionKeyKeyFor = selectableChannelMo8974.keyFor(selector);
            int iMo8975 = interfaceC4840.mo8975();
            if (selectionKeyKeyFor == null) {
                if (iMo8975 != 0) {
                    selectableChannelMo8974.register(selector, iMo8975, interfaceC4840);
                }
            } else if (selectionKeyKeyFor.interestOps() != iMo8975) {
                selectionKeyKeyFor.interestOps(iMo8975);
            }
            if (iMo8975 != 0) {
                this.f12603++;
            }
        } catch (Throwable th) {
            SelectionKey selectionKeyKeyFor2 = interfaceC4840.mo8974().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            m8957(interfaceC4840, th);
        }
    }
}
