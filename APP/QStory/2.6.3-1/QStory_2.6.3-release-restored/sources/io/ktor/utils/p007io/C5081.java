package io.ktor.utils.p007io;

import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.C3775;
import io.ktor.util.C5043;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.C6276;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5081 implements InterfaceC5084, InterfaceC5079 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13102;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13103 = AtomicReferenceFieldUpdater.newUpdater(C5081.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ long f13104;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ long f13105;
    private volatile int flushBufferSize;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f13110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6309 f13109 = new C6309();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f13108 = new Object();
    volatile /* synthetic */ Object suspensionSlot = C5066.f13083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6309 f13107 = new C6309();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6309 f13106 = new C6309();
    volatile /* synthetic */ Object _closedCause = null;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f13105 = unsafe.objectFieldOffset(C5081.class.getDeclaredField("suspensionSlot"));
        f13102 = AtomicReferenceFieldUpdater.newUpdater(C5081.class, Object.class, "_closedCause");
        f13104 = unsafe.objectFieldOffset(C5081.class.getDeclaredField("_closedCause"));
    }

    public C5081(boolean z) {
        this.f13110 = z;
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m9257() {
        m9264();
        C5069 c5069 = AbstractC5073.f13090;
        while (true) {
            f13102.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f13104;
            C5081 c5081 = this;
            if (unsafe.compareAndSwapObject(c5081, j, (Object) null, c5069)) {
                c5081.m9260(null);
                return;
            } else if (unsafe.getObjectVolatile(c5081, j) != null) {
                return;
            } else {
                this = c5081;
            }
        }
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo9200() {
        if (mo9203() == null) {
            return m9262() && this.flushBufferSize == 0 && this.f13107.mo11163();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0145, code lost:
    
        if (r9.f13107.f15487 >= 1048576) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
    
        r9.m9258();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        if (r9.f13107.f15487 < r10) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0153, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0158, code lost:
    
        return java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[EDGE_INSN: B:33:0x00a7->B:34:0x00aa BREAK  A[LOOP:1: B:28:0x008f->B:35:0x00b0], PHI: r11
  0x00aa: PHI (r11v6 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) = 
  (r11v1 io.ktor.utils.io.飘花落叶言子楪苏世兰哲)
  (r11v1 io.ktor.utils.io.飘花落叶言子楪苏世兰哲)
  (r11v1 io.ktor.utils.io.飘花落叶言子楪苏世兰哲)
  (r11v9 io.ktor.utils.io.飘花落叶言子楪苏世兰哲)
 binds: [B:44:0x00d8, B:53:0x00fe, B:50:0x00f4, B:33:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132 A[LOOP:0: B:21:0x005a->B:65:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131 A[SYNTHETIC] */
    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9201(int i, ContinuationImpl continuationImpl) throws Throwable {
        ByteChannel$awaitContent$1 byteChannel$awaitContent$1;
        C5081 c5081;
        int i2;
        C5081 c50812;
        long j;
        C5081 c50813;
        ByteChannel$awaitContent$1 byteChannel$awaitContent$12;
        C6276 c6276;
        int i3;
        Object objM11099;
        C5066 c5066 = C5066.f13083;
        if (continuationImpl instanceof ByteChannel$awaitContent$1) {
            byteChannel$awaitContent$1 = (ByteChannel$awaitContent$1) continuationImpl;
            int i4 = byteChannel$awaitContent$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                byteChannel$awaitContent$1.label = i4 - Integer.MIN_VALUE;
            } else {
                byteChannel$awaitContent$1 = new ByteChannel$awaitContent$1(this, continuationImpl);
            }
        }
        Object obj = byteChannel$awaitContent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = byteChannel$awaitContent$1.label;
        boolean z = true;
        if (i5 == 0) {
            AbstractC6017.m10769(obj);
            Throwable thMo9203 = mo9203();
            if (thMo9203 != null) {
                throw thMo9203;
            }
            if (this.f13107.f15487 >= i) {
                return Boolean.TRUE;
            }
            c5081 = this;
            i2 = i;
            c50812 = c5081;
        } else {
            if (i5 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = byteChannel$awaitContent$1.I$0;
            C5081 c50814 = (C5081) byteChannel$awaitContent$1.L$1;
            C5081 c50815 = (C5081) byteChannel$awaitContent$1.L$0;
            AbstractC6017.m10769(obj);
            c50812 = c50814;
            c5081 = c50815;
        }
        while (true) {
            long j2 = i2;
            if (((long) c5081.flushBufferSize) + c5081.f13107.f15487 >= j2 || c5081._closedCause != null) {
                break;
            }
            byteChannel$awaitContent$1.L$0 = c5081;
            byteChannel$awaitContent$1.L$1 = c50812;
            byteChannel$awaitContent$1.I$0 = i2;
            byteChannel$awaitContent$1.label = 1;
            C6276 c62762 = new C6276(1, AbstractC3400.m5624(byteChannel$awaitContent$1));
            c62762.m11102();
            C5065 c5065 = new C5065(c62762);
            InterfaceC5082 interfaceC5082 = (InterfaceC5082) c50812.suspensionSlot;
            boolean z2 = interfaceC5082 instanceof C5068;
            if (z2) {
                j = j2;
                c50813 = c50812;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13103;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    long j3 = j2;
                    Unsafe unsafe = AbstractC9322.f23936;
                    j = j3;
                    long j4 = f13105;
                    c50813 = c50812;
                    if (unsafe.compareAndSwapObject(c50813, j4, interfaceC5082, c5065)) {
                        break;
                    }
                    if (unsafe.getObjectVolatile(c50813, j4) != interfaceC5082) {
                        c5065.mo9208();
                        break;
                    }
                    c50812 = c50813;
                    j2 = j;
                }
            }
            if (interfaceC5082 instanceof C5065) {
                InterfaceC5064 interfaceC5064 = (InterfaceC5064) interfaceC5082;
                interfaceC5064.mo9209(new ConcurrentIOException("read", interfaceC5064.mo9207()));
            } else if (interfaceC5082 instanceof InterfaceC5064) {
                ((InterfaceC5064) interfaceC5082).mo9208();
            } else if (z2) {
                c5065.mo9209(((C5068) interfaceC5082).f13087);
                byteChannel$awaitContent$12 = byteChannel$awaitContent$1;
                c6276 = c62762;
                c50812 = c50813;
                i3 = i2;
                objM11099 = c6276.m11099();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM11099 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                i2 = i3;
                byteChannel$awaitContent$1 = byteChannel$awaitContent$12;
            } else if (!AbstractC5227.m9466(interfaceC5082, c5066)) {
                C5043.m9170();
                return null;
            }
            if (((long) c5081.flushBufferSize) + c5081.f13107.f15487 >= j || c5081._closedCause != null) {
                InterfaceC5082 interfaceC50822 = (InterfaceC5082) c50813.suspensionSlot;
                if (interfaceC50822 instanceof C5065) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13103;
                    while (true) {
                        atomicReferenceFieldUpdater2.getClass();
                        int i6 = i2;
                        Unsafe unsafe2 = AbstractC9322.f23936;
                        byteChannel$awaitContent$12 = byteChannel$awaitContent$1;
                        c6276 = c62762;
                        long j5 = f13105;
                        C5081 c50816 = c50813;
                        i3 = i6;
                        c50812 = c50816;
                        if (unsafe2.compareAndSwapObject(c50812, j5, interfaceC50822, c5066)) {
                            ((InterfaceC5064) interfaceC50822).mo9208();
                            break;
                        }
                        if (unsafe2.getObjectVolatile(c50812, j5) != interfaceC50822) {
                            break;
                        }
                        i2 = i3;
                        byteChannel$awaitContent$1 = byteChannel$awaitContent$12;
                        c62762 = c6276;
                        c50813 = c50812;
                    }
                } else {
                    byteChannel$awaitContent$12 = byteChannel$awaitContent$1;
                    c6276 = c62762;
                    c50812 = c50813;
                    i3 = i2;
                }
            }
            objM11099 = c6276.m11099();
            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objM11099 != coroutineSingletons) {
            }
        }
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC6313 mo9202() throws Throwable {
        Throwable thMo9203 = mo9203();
        if (thMo9203 != null) {
            throw thMo9203;
        }
        C6309 c6309 = this.f13107;
        if (c6309.mo11163()) {
            m9258();
        }
        return c6309;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo9203() {
        C5069 c5069 = (C5069) this._closedCause;
        if (c5069 != null) {
            return c5069.m9211();
        }
        return null;
    }

    @Override // io.ktor.utils.p007io.InterfaceC5084
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9204(Throwable th) {
        C5081 c5081;
        if (this._closedCause != null) {
            return;
        }
        C5069 c5069 = new C5069(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13102;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f13104;
            c5081 = this;
            if (unsafe.compareAndSwapObject(c5081, j, (Object) null, c5069) || unsafe.getObjectVolatile(c5081, j) != null) {
                break;
            } else {
                this = c5081;
            }
        }
        c5081.m9260(c5069.m9211());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m9258() {
        synchronized (this.f13108) {
            this.f13109.mo11159(this.f13107);
            this.flushBufferSize = 0;
        }
        InterfaceC5082 interfaceC5082 = (InterfaceC5082) this.suspensionSlot;
        if (!(interfaceC5082 instanceof C5063)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13103;
        C5066 c5066 = C5066.f13083;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f13105;
            C5081 c5081 = this;
            if (unsafe.compareAndSwapObject(c5081, j, interfaceC5082, c5066)) {
                ((InterfaceC5064) interfaceC5082).mo9208();
                return;
            } else if (unsafe.getObjectVolatile(c5081, j) != interfaceC5082) {
                return;
            } else {
                this = c5081;
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:51:0x0101, B:61:0x012f], limit reached: 71 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x013b -> B:66:0x013c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9259(InterfaceC5189 interfaceC5189) throws Throwable {
        ByteChannel$flush$1 byteChannel$flush$1;
        C5081 c5081;
        C5081 c50812;
        ByteChannel$flush$1 byteChannel$flush$12;
        C5081 c50813;
        boolean z;
        InterfaceC5082 interfaceC5082;
        C5063 c5063;
        C6276 c6276;
        ByteChannel$flush$1 byteChannel$flush$13;
        Object objM11099;
        C5066 c5066 = C5066.f13083;
        C6008 c6008 = C6008.f15084;
        if (interfaceC5189 instanceof ByteChannel$flush$1) {
            byteChannel$flush$1 = (ByteChannel$flush$1) interfaceC5189;
            int i = byteChannel$flush$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteChannel$flush$1.label = i - Integer.MIN_VALUE;
            } else {
                byteChannel$flush$1 = new ByteChannel$flush$1(this, interfaceC5189);
            }
        }
        Object obj = byteChannel$flush$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteChannel$flush$1.label;
        Object obj2 = null;
        int i3 = 1048576;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Throwable thMo9203 = mo9203();
            if (thMo9203 != null) {
                throw thMo9203;
            }
            m9264();
            if (this.flushBufferSize >= 1048576) {
                c5081 = this;
                c50812 = c5081;
                byteChannel$flush$12 = byteChannel$flush$1;
                if (c50812.flushBufferSize >= i3) {
                }
            }
            return c6008;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C5081 c50814 = (C5081) byteChannel$flush$1.L$1;
        C5081 c50815 = (C5081) byteChannel$flush$1.L$0;
        AbstractC6017.m10769(obj);
        c5081 = c50814;
        byteChannel$flush$12 = byteChannel$flush$1;
        c50812 = c50815;
        Object obj3 = null;
        int i4 = 1048576;
        obj2 = obj3;
        i3 = i4;
        if (c50812.flushBufferSize >= i3 && c50812._closedCause == null) {
            byteChannel$flush$12.L$0 = c50812;
            byteChannel$flush$12.L$1 = c5081;
            byteChannel$flush$12.label = 1;
            C6276 c62762 = new C6276(1, AbstractC3400.m5624(byteChannel$flush$12));
            c62762.m11102();
            C5063 c50632 = new C5063(c62762);
            InterfaceC5082 interfaceC50822 = (InterfaceC5082) c5081.suspensionSlot;
            boolean z2 = interfaceC50822 instanceof C5068;
            if (z2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13103;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    boolean z3 = z2;
                    Unsafe unsafe = AbstractC9322.f23936;
                    long j = f13105;
                    c50813 = c5081;
                    z = z3;
                    C5063 c50633 = c50632;
                    InterfaceC5082 interfaceC50823 = interfaceC50822;
                    boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c50813, j, interfaceC50823, c50633);
                    obj3 = obj2;
                    c5063 = c50633;
                    interfaceC5082 = interfaceC50823;
                    if (zCompareAndSwapObject) {
                        break;
                    }
                    if (unsafe.getObjectVolatile(c50813, j) != interfaceC5082) {
                        c5063.mo9208();
                        break;
                    }
                    obj2 = obj3;
                    c50632 = c5063;
                    interfaceC50822 = interfaceC5082;
                    z2 = z;
                    c5081 = c50813;
                }
                byteChannel$flush$13 = byteChannel$flush$12;
                c6276 = c62762;
                c5081 = c50813;
                i4 = 1048576;
                objM11099 = c6276.m11099();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM11099 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                byteChannel$flush$12 = byteChannel$flush$13;
                obj2 = obj3;
                i3 = i4;
                if (c50812.flushBufferSize >= i3) {
                    byteChannel$flush$12.L$0 = c50812;
                    byteChannel$flush$12.L$1 = c5081;
                    byteChannel$flush$12.label = 1;
                    C6276 c627622 = new C6276(1, AbstractC3400.m5624(byteChannel$flush$12));
                    c627622.m11102();
                    C5063 c506322 = new C5063(c627622);
                    InterfaceC5082 interfaceC508222 = (InterfaceC5082) c5081.suspensionSlot;
                    boolean z22 = interfaceC508222 instanceof C5068;
                    if (z22) {
                        c50813 = c5081;
                        obj3 = obj2;
                        z = z22;
                        interfaceC5082 = interfaceC508222;
                        c5063 = c506322;
                    }
                }
            }
            if (interfaceC5082 instanceof C5063) {
                InterfaceC5064 interfaceC5064 = (InterfaceC5064) interfaceC5082;
                interfaceC5064.mo9209(new ConcurrentIOException("write", interfaceC5064.mo9207()));
            } else if (interfaceC5082 instanceof InterfaceC5064) {
                ((InterfaceC5064) interfaceC5082).mo9208();
            } else if (z) {
                c5063.mo9209(((C5068) interfaceC5082).f13087);
                byteChannel$flush$13 = byteChannel$flush$12;
                c6276 = c627622;
                c5081 = c50813;
                i4 = 1048576;
                objM11099 = c6276.m11099();
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM11099 != coroutineSingletons) {
                }
            } else if (!AbstractC5227.m9466(interfaceC5082, c5066)) {
                C5043.m9170();
                return obj3;
            }
            i4 = 1048576;
            if (c50812.flushBufferSize < 1048576 || c50812._closedCause != null) {
                InterfaceC5082 interfaceC50824 = (InterfaceC5082) c50813.suspensionSlot;
                if (interfaceC50824 instanceof C5063) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13103;
                    while (true) {
                        atomicReferenceFieldUpdater2.getClass();
                        ByteChannel$flush$1 byteChannel$flush$14 = byteChannel$flush$12;
                        Unsafe unsafe2 = AbstractC9322.f23936;
                        C6276 c62763 = c627622;
                        long j2 = f13105;
                        c6276 = c62763;
                        byteChannel$flush$13 = byteChannel$flush$14;
                        c5081 = c50813;
                        if (unsafe2.compareAndSwapObject(c5081, j2, interfaceC50824, c5066)) {
                            ((InterfaceC5064) interfaceC50824).mo9208();
                            break;
                        }
                        if (unsafe2.getObjectVolatile(c5081, j2) != interfaceC50824) {
                            break;
                        }
                        c50813 = c5081;
                        byteChannel$flush$12 = byteChannel$flush$13;
                        c627622 = c6276;
                    }
                }
                objM11099 = c6276.m11099();
                CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM11099 != coroutineSingletons) {
                }
            }
            byteChannel$flush$13 = byteChannel$flush$12;
            c6276 = c627622;
            c5081 = c50813;
            objM11099 = c6276.m11099();
            CoroutineSingletons coroutineSingletons2222 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objM11099 != coroutineSingletons) {
            }
        }
        return c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m9260(Throwable th) {
        C5068 c5068;
        if (th != null) {
            c5068 = new C5068(th);
        } else {
            InterfaceC5082.f13111.getClass();
            c5068 = C5067.f13085;
        }
        f13103.getClass();
        InterfaceC5082 interfaceC5082 = (InterfaceC5082) AbstractC9322.f23936.getAndSetObject(this, f13105, c5068);
        if (interfaceC5082 instanceof InterfaceC5064) {
            ((InterfaceC5064) interfaceC5082).mo9209(th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6309 m9261() throws Throwable {
        Throwable thMo9203 = mo9203();
        if (thMo9203 != null) {
            throw thMo9203;
        }
        if (!m9262()) {
            return this.f13106;
        }
        C6755.m11866("Channel is closed for write");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m9262() {
        return this._closedCause != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9263(InterfaceC5189 interfaceC5189) {
        ByteChannel$flushAndClose$1 byteChannel$flushAndClose$1;
        Unsafe unsafe;
        long j;
        if (interfaceC5189 instanceof ByteChannel$flushAndClose$1) {
            byteChannel$flushAndClose$1 = (ByteChannel$flushAndClose$1) interfaceC5189;
            int i = byteChannel$flushAndClose$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                byteChannel$flushAndClose$1.label = i - Integer.MIN_VALUE;
            } else {
                byteChannel$flushAndClose$1 = new ByteChannel$flushAndClose$1(this, interfaceC5189);
            }
        }
        Object obj = byteChannel$flushAndClose$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = byteChannel$flushAndClose$1.label;
        C6008 c6008 = C6008.f15084;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                byteChannel$flushAndClose$1.L$0 = this;
                byteChannel$flushAndClose$1.label = 1;
                if (m9259(byteChannel$flushAndClose$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (C5081) byteChannel$flushAndClose$1.L$0;
                AbstractC6017.m10769(obj);
            }
            Result.m9304constructorimpl(c6008);
        } catch (Throwable th) {
            Result.m9304constructorimpl(new Result.Failure(th));
        }
        C5081 c5081 = this;
        C5069 c5069 = AbstractC5073.f13090;
        do {
            f13102.getClass();
            if (c5081 == null) {
                C3775.m6954();
                return null;
            }
            unsafe = AbstractC9322.f23936;
            j = f13104;
            if (unsafe.compareAndSwapObject(c5081, j, (Object) null, c5069)) {
                c5081.m9260(null);
                return c6008;
            }
            if (c5081 == null) {
                C3775.m6954();
                return null;
            }
        } while (unsafe.getObjectVolatile(c5081, j) == null);
        return c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m9264() {
        if (this.f13106.mo11163()) {
            return;
        }
        synchronized (this.f13108) {
            C6309 c6309 = this.f13106;
            int i = (int) c6309.f15487;
            this.f13109.m11172(c6309);
            this.flushBufferSize += i;
        }
        InterfaceC5082 interfaceC5082 = (InterfaceC5082) this.suspensionSlot;
        if (!(interfaceC5082 instanceof C5065)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13103;
        C5066 c5066 = C5066.f13083;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f13105;
            C5081 c5081 = this;
            if (unsafe.compareAndSwapObject(c5081, j, interfaceC5082, c5066)) {
                ((InterfaceC5064) interfaceC5082).mo9208();
                return;
            } else if (unsafe.getObjectVolatile(c5081, j) != interfaceC5082) {
                return;
            } else {
                this = c5081;
            }
        }
    }
}
