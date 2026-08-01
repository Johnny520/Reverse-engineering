package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.C0325;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.AbstractC3054;
import io.ktor.util.C4210;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.InterfaceC5411;
import kotlinx.coroutines.InterfaceC5446;
import kotlinx.coroutines.internal.AbstractC5351;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.AbstractC5357;
import kotlinx.coroutines.internal.AbstractC5360;
import kotlinx.coroutines.selects.C5368;
import kotlinx.coroutines.selects.InterfaceC5367;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import p052.InterfaceC6557;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5189 implements InterfaceC5206 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f14766;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14767;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ long f14768;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ long f14769;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14770;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14771;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14774;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14775;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14777;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f14780;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14778 = AtomicLongFieldUpdater.newUpdater(C5189.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14779 = AtomicLongFieldUpdater.newUpdater(C5189.class, "receivers$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14773 = AtomicLongFieldUpdater.newUpdater(C5189.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14772 = AtomicLongFieldUpdater.newUpdater(C5189.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14776 = AtomicReferenceFieldUpdater.newUpdater(C5189.class, Object.class, "sendSegment$volatile");

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f14766 = unsafe.objectFieldOffset(C5189.class.getDeclaredField("sendSegment$volatile"));
        f14777 = AtomicReferenceFieldUpdater.newUpdater(C5189.class, Object.class, "receiveSegment$volatile");
        f14767 = unsafe.objectFieldOffset(C5189.class.getDeclaredField("receiveSegment$volatile"));
        f14774 = AtomicReferenceFieldUpdater.newUpdater(C5189.class, Object.class, "bufferEndSegment$volatile");
        f14769 = unsafe.objectFieldOffset(C5189.class.getDeclaredField("bufferEndSegment$volatile"));
        f14775 = AtomicReferenceFieldUpdater.newUpdater(C5189.class, Object.class, "_closeCause$volatile");
        f14770 = unsafe.objectFieldOffset(C5189.class.getDeclaredField("_closeCause$volatile"));
        f14771 = AtomicReferenceFieldUpdater.newUpdater(C5189.class, Object.class, "closeHandler$volatile");
        f14768 = unsafe.objectFieldOffset(C5189.class.getDeclaredField("closeHandler$volatile"));
    }

    public C5189(int i) {
        this.f14780 = i;
        if (i < 0) {
            C5919.m11253(AbstractC0053.m161(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        C5200 c5200 = AbstractC5188.f14752;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f14773.get(this);
        C5200 c52002 = new C5200(0L, null, this, 3);
        this.sendSegment$volatile = c52002;
        this.receiveSegment$volatile = c52002;
        if (m10235()) {
            c52002 = AbstractC5188.f14752;
            c52002.getClass();
        }
        this.bufferEndSegment$volatile = c52002;
        this._closeCause$volatile = AbstractC5188.f14753;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m10215(kotlinx.coroutines.channels.C5189 r22, java.lang.Object r23, kotlin.coroutines.InterfaceC4356 r24) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.m10215(kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, java.lang.Object, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m10216(kotlinx.coroutines.channels.C5189 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.m10216(kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m10217(C5189 c5189) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14772;
        if ((atomicLongFieldUpdater.addAndGet(c5189, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c5189) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static Object m10218(C5189 c5189, InterfaceC4356 interfaceC4356) throws Throwable {
        C5200 c5200;
        Throwable th;
        C5200 c52002;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14777;
        atomicReferenceFieldUpdater.getClass();
        if (c5189 == null) {
            C2941.m6336();
            return null;
        }
        C5200 c52003 = (C5200) AbstractC8501.f23600.getObjectVolatile(c5189, f14767);
        while (!c5189.m10230()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c5189);
            long j = AbstractC5188.f14751;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c52003.f14944 != j2) {
                C5200 c5200M10248 = c5189.m10248(j2, c52003);
                if (c5200M10248 == null) {
                    continue;
                } else {
                    c5200 = c5200M10248;
                }
            } else {
                c5200 = c52003;
            }
            C5189 c51892 = c5189;
            Object objM10225 = c51892.m10225(c5200, i, andIncrement, null);
            C4484 c4484 = AbstractC5188.f14755;
            if (objM10225 == c4484) {
                C5919.m11250("unexpected");
                return null;
            }
            C4484 c44842 = AbstractC5188.f14758;
            if (objM10225 == c44842) {
                if (andIncrement < c51892.m10244()) {
                    c5200.m10353();
                }
                c5189 = c51892;
                c52003 = c5200;
            } else {
                if (objM10225 != AbstractC5188.f14754) {
                    c5200.m10353();
                    return objM10225;
                }
                C5443 c5443M10488 = AbstractC5398.m10488(AbstractC3054.m6602(interfaceC4356));
                try {
                    Object objM102252 = c51892.m10225(c5200, i, andIncrement, c5443M10488);
                    if (objM102252 == c4484) {
                        c5443M10488.mo10259(c5200, i);
                    } else {
                        if (objM102252 == c44842) {
                            if (andIncrement < c51892.m10244()) {
                                c5200.m10353();
                            }
                            C5200 c52004 = (C5200) atomicReferenceFieldUpdater.get(c51892);
                            while (true) {
                                if (c51892.m10230()) {
                                    c5443M10488.resumeWith(Result.m8755constructorimpl(new Result.Failure(c51892.m10243())));
                                    break;
                                }
                                C5443 c5443 = c5443M10488;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c51892);
                                    long j3 = AbstractC5188.f14751;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (c52004.f14944 != j4) {
                                        try {
                                            C5200 c5200M102482 = c51892.m10248(j4, c52004);
                                            if (c5200M102482 == null) {
                                                c5443M10488 = c5443;
                                            } else {
                                                c52002 = c5200M102482;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c5443M10488 = c5443;
                                            c5443M10488.m10529();
                                            throw th;
                                        }
                                    } else {
                                        c52002 = c52004;
                                    }
                                    C5189 c51893 = c51892;
                                    objM102252 = c51893.m10225(c52002, i2, andIncrement2, c5443);
                                    c51892 = c51893;
                                    C5200 c52005 = c52002;
                                    c5443M10488 = c5443;
                                    if (objM102252 == AbstractC5188.f14755) {
                                        c5443M10488.mo10259(c52005, i2);
                                        break;
                                    }
                                    if (objM102252 == AbstractC5188.f14758) {
                                        if (andIncrement2 < c51892.m10244()) {
                                            c52005.m10353();
                                        }
                                        c52004 = c52005;
                                    } else {
                                        if (objM102252 == AbstractC5188.f14754) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c52005.m10353();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c5443M10488 = c5443;
                                    th = th;
                                    c5443M10488.m10529();
                                    throw th;
                                }
                            }
                        } else {
                            c5200.m10353();
                        }
                        c5443M10488.mo10430(objM102252, null);
                    }
                    Object objM10536 = c5443M10488.m10536();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM10536;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thM10243 = c5189.m10243();
        int i3 = AbstractC5357.f14940;
        throw thM10243;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m10219(C5189 c5189, C5200 c5200, int i, Object obj, long j, Object obj2, boolean z) {
        c5200.m10262(i, obj);
        if (z) {
            return c5189.m10224(c5200, i, obj, j, obj2, z);
        }
        Object objM10264 = c5200.m10264(i);
        if (objM10264 == null) {
            if (c5189.m10241(j)) {
                if (c5200.m10266(null, i, AbstractC5188.f14749)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c5200.m10266(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objM10264 instanceof InterfaceC5411) {
            c5200.m10262(i, null);
            if (c5189.m10223(objM10264, obj)) {
                c5200.m10261(i, AbstractC5188.f14764);
                return 0;
            }
            C4484 c4484 = AbstractC5188.f14762;
            if (c5200.f14788.getAndSet((i * 2) + 1, c4484) == c4484) {
                return 5;
            }
            c5200.m10265(i, true);
            return 5;
        }
        return c5189.m10224(c5200, i, obj, j, obj2, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10220(C5189 c5189, Object obj, C5443 c5443) {
        c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(c5189.m10246())));
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    public final InterfaceC5211 iterator() {
        return new C5190(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        r15 = r8;
        r3 = (kotlinx.coroutines.channels.C5200) r3.m10351();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d1, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.toString():java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m10221(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C5189 c5189 = this;
        if (c5189.m10235()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f14773;
            if (atomicLongFieldUpdater.get(c5189) > j) {
                break;
            } else {
                c5189 = this;
            }
        }
        int i = AbstractC5188.f14750;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14772;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c5189);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c5189)) && j2 == atomicLongFieldUpdater.get(c5189)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c5189);
                    if (atomicLongFieldUpdater2.compareAndSet(c5189, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c5189 = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c5189);
                    long j5 = atomicLongFieldUpdater2.get(c5189);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c5189)) {
                        break;
                    }
                    if (z) {
                        c5189 = this;
                    } else {
                        c5189 = this;
                        atomicLongFieldUpdater2.compareAndSet(c5189, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c5189);
                    if (atomicLongFieldUpdater2.compareAndSet(c5189, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c5189 = this;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean m10222(Object obj, C5200 c5200, int i) {
        TrySelectDetailedResult trySelectDetailedResult;
        boolean z = obj instanceof InterfaceC5446;
        C5175 c5175 = C5175.f14739;
        if (z) {
            return AbstractC5188.m10214((InterfaceC5446) obj, c5175, null);
        }
        if (!(obj instanceof InterfaceC5367)) {
            C4210.m8602(obj, "Unexpected waiter: ");
            return false;
        }
        int iM10412 = ((C5368) obj).m10412(this, c5175);
        if (iM10412 == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.SUCCESSFUL;
        } else if (iM10412 == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.REREGISTER;
        } else if (iM10412 == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.CANCELLED;
        } else {
            if (iM10412 != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iM10412).toString());
            }
            trySelectDetailedResult = TrySelectDetailedResult.ALREADY_SELECTED;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.REREGISTER) {
            c5200.m10262(i, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.SUCCESSFUL;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean m10223(Object obj, Object obj2) {
        if (obj instanceof InterfaceC5367) {
            return ((InterfaceC5367) obj).mo10408(this, obj2);
        }
        if (obj instanceof C5194) {
            return AbstractC5188.m10214(((C5194) obj).f14785, new C5201(obj2), null);
        }
        if (!(obj instanceof C5190)) {
            if (obj instanceof InterfaceC5446) {
                return AbstractC5188.m10214((InterfaceC5446) obj, obj2, null);
            }
            C4210.m8602(obj, "Unexpected receiver type: ");
            return false;
        }
        C5190 c5190 = (C5190) obj;
        C5443 c5443 = c5190.f14781;
        c5443.getClass();
        c5190.f14781 = null;
        c5190.f14783 = obj2;
        Boolean bool = Boolean.TRUE;
        c5190.f14782.getClass();
        return AbstractC5188.m10214(c5443, bool, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int m10224(C5200 c5200, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM10264 = c5200.m10264(i);
            if (objM10264 == null) {
                if (!m10241(j) || z) {
                    if (z) {
                        if (c5200.m10266(null, i, AbstractC5188.f14765)) {
                            c5200.m10383();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c5200.m10266(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (c5200.m10266(null, i, AbstractC5188.f14749)) {
                    break;
                }
            } else {
                if (objM10264 != AbstractC5188.f14748) {
                    C4484 c4484 = AbstractC5188.f14762;
                    if (objM10264 == c4484) {
                        c5200.m10262(i, null);
                        return 5;
                    }
                    if (objM10264 == AbstractC5188.f14760) {
                        c5200.m10262(i, null);
                        return 5;
                    }
                    if (objM10264 == AbstractC5188.f14763) {
                        c5200.m10262(i, null);
                        m10237();
                        return 4;
                    }
                    c5200.m10262(i, null);
                    if (objM10264 instanceof C5197) {
                        objM10264 = ((C5197) objM10264).f14787;
                    }
                    if (m10223(objM10264, obj)) {
                        c5200.m10261(i, AbstractC5188.f14764);
                        return 0;
                    }
                    if (c5200.f14788.getAndSet((i * 2) + 1, c4484) != c4484) {
                        c5200.m10265(i, true);
                    }
                    return 5;
                }
                if (c5200.m10266(objM10264, i, AbstractC5188.f14749)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Object m10225(C5200 c5200, int i, long j, Object obj) {
        Object objM10264 = c5200.m10264(i);
        AtomicReferenceArray atomicReferenceArray = c5200.f14788;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14778;
        if (objM10264 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC5188.f14754;
                }
                if (c5200.m10266(objM10264, i, obj)) {
                    m10254();
                    return AbstractC5188.f14755;
                }
            }
        } else if (objM10264 == AbstractC5188.f14749 && c5200.m10266(objM10264, i, AbstractC5188.f14764)) {
            m10254();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c5200.m10262(i, null);
            return obj2;
        }
        while (true) {
            Object objM102642 = c5200.m10264(i);
            if (objM102642 == null || objM102642 == AbstractC5188.f14748) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c5200.m10266(objM102642, i, AbstractC5188.f14760)) {
                        m10254();
                        return AbstractC5188.f14758;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC5188.f14754;
                    }
                    if (c5200.m10266(objM102642, i, obj)) {
                        m10254();
                        return AbstractC5188.f14755;
                    }
                }
            } else if (objM102642 != AbstractC5188.f14749) {
                C4484 c4484 = AbstractC5188.f14765;
                if (objM102642 == c4484) {
                    return AbstractC5188.f14758;
                }
                if (objM102642 == AbstractC5188.f14760) {
                    return AbstractC5188.f14758;
                }
                if (objM102642 == AbstractC5188.f14763) {
                    m10254();
                    return AbstractC5188.f14758;
                }
                if (objM102642 != AbstractC5188.f14761 && c5200.m10266(objM102642, i, AbstractC5188.f14747)) {
                    boolean z = objM102642 instanceof C5197;
                    if (z) {
                        objM102642 = ((C5197) objM102642).f14787;
                    }
                    if (m10222(objM102642, c5200, i)) {
                        c5200.m10261(i, AbstractC5188.f14764);
                        m10254();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c5200.m10262(i, null);
                        return obj3;
                    }
                    c5200.m10261(i, c4484);
                    c5200.m10383();
                    if (z) {
                        m10254();
                    }
                    return AbstractC5188.f14758;
                }
            } else if (c5200.m10266(objM102642, i, AbstractC5188.f14764)) {
                m10254();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c5200.m10262(i, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m10226(InterfaceC5411 interfaceC5411, boolean z) {
        if (interfaceC5411 instanceof InterfaceC5446) {
            ((InterfaceC4356) interfaceC5411).resumeWith(Result.m8755constructorimpl(new Result.Failure(z ? m10243() : m10246())));
            return;
        }
        if (interfaceC5411 instanceof C5194) {
            ((C5194) interfaceC5411).f14785.resumeWith(Result.m8755constructorimpl(new C5201(new C5208(m10249()))));
            return;
        }
        if (!(interfaceC5411 instanceof C5190)) {
            if (interfaceC5411 instanceof InterfaceC5367) {
                ((InterfaceC5367) interfaceC5411).mo10408(this, AbstractC5188.f14763);
                return;
            } else {
                C4210.m8602(interfaceC5411, "Unexpected waiter: ");
                return;
            }
        }
        C5190 c5190 = (C5190) interfaceC5411;
        C5443 c5443 = c5190.f14781;
        c5443.getClass();
        c5190.f14781 = null;
        c5190.f14783 = AbstractC5188.f14763;
        Throwable thM10249 = c5190.f14782.m10249();
        if (thM10249 == null) {
            c5443.resumeWith(Result.m8755constructorimpl(Boolean.FALSE));
        } else {
            c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(thM10249)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10227(kotlinx.coroutines.channels.C5200 r11, int r12, long r13, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.m10227(kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏, int, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public void mo10228(InterfaceC5367 interfaceC5367, Object obj) {
        C5200 c5200;
        f14776.getClass();
        C5200 c52002 = (C5200) AbstractC8501.f23600.getObjectVolatile(this, f14766);
        while (true) {
            long andIncrement = f14778.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM10231 = this.m10231(andIncrement, false);
            int i = AbstractC5188.f14751;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c52002.f14944 != j3) {
                C5200 c5200M10250 = this.m10250(j3, c52002);
                if (c5200M10250 != null) {
                    c5200 = c5200M10250;
                } else if (zM10231) {
                    interfaceC5367.mo10407(AbstractC5188.f14763);
                    return;
                }
            } else {
                c5200 = c52002;
            }
            C5189 c5189 = this;
            InterfaceC5367 interfaceC53672 = interfaceC5367;
            Object obj2 = obj;
            int iM10219 = m10219(c5189, c5200, i2, obj2, j, interfaceC53672, zM10231);
            c52002 = c5200;
            C5175 c5175 = C5175.f14739;
            if (iM10219 == 0) {
                c52002.m10353();
                interfaceC53672.mo10407(c5175);
                return;
            }
            if (iM10219 == 1) {
                interfaceC53672.mo10407(c5175);
                return;
            }
            if (iM10219 == 2) {
                if (zM10231) {
                    c52002.m10383();
                    interfaceC53672.mo10407(AbstractC5188.f14763);
                    return;
                } else {
                    InterfaceC5411 interfaceC5411 = interfaceC53672 instanceof InterfaceC5411 ? (InterfaceC5411) interfaceC53672 : null;
                    if (interfaceC5411 != null) {
                        interfaceC5411.mo10259(c52002, i2 + i);
                        return;
                    }
                    return;
                }
            }
            if (iM10219 == 3) {
                C5919.m11250("unexpected");
                return;
            }
            if (iM10219 == 4) {
                if (j < f14779.get(c5189)) {
                    c52002.m10353();
                }
                interfaceC53672.mo10407(AbstractC5188.f14763);
                return;
            } else {
                if (iM10219 == 5) {
                    c52002.m10353();
                }
                this = c5189;
                obj = obj2;
                interfaceC5367 = interfaceC53672;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m10229(InterfaceC5367 interfaceC5367) {
        C5200 c5200;
        C5189 c5189;
        InterfaceC5367 interfaceC53672;
        int i;
        f14777.getClass();
        C5200 c52002 = (C5200) AbstractC8501.f23600.getObjectVolatile(this, f14767);
        while (!this.m10230()) {
            long andIncrement = f14779.getAndIncrement(this);
            long j = AbstractC5188.f14751;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c52002.f14944 != j2) {
                C5200 c5200M10248 = this.m10248(j2, c52002);
                if (c5200M10248 == null) {
                    continue;
                } else {
                    c5200 = c5200M10248;
                    interfaceC53672 = interfaceC5367;
                    i = i2;
                    c5189 = this;
                }
            } else {
                c5200 = c52002;
                c5189 = this;
                interfaceC53672 = interfaceC5367;
                i = i2;
            }
            Object objM10225 = c5189.m10225(c5200, i, andIncrement, interfaceC53672);
            c52002 = c5200;
            if (objM10225 == AbstractC5188.f14755) {
                InterfaceC5411 interfaceC5411 = interfaceC53672 instanceof InterfaceC5411 ? (InterfaceC5411) interfaceC53672 : null;
                if (interfaceC5411 != null) {
                    interfaceC5411.mo10259(c52002, i);
                    return;
                }
                return;
            }
            if (objM10225 != AbstractC5188.f14758) {
                if (objM10225 == AbstractC5188.f14754) {
                    C5919.m11250("unexpected");
                    return;
                } else {
                    c52002.m10353();
                    interfaceC53672.mo10407(objM10225);
                    return;
                }
            }
            if (andIncrement < c5189.m10244()) {
                c52002.m10353();
            }
            this = c5189;
            interfaceC5367 = interfaceC53672;
        }
        interfaceC5367.mo10407(AbstractC5188.f14763);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m10230() {
        return m10231(f14778.get(this), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        r10 = (kotlinx.coroutines.channels.C5200) r10.m10349();
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10231(long r10, boolean r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.m10231(long, boolean):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m10232() {
        Object objectVolatile;
        C5189 c5189;
        loop0: while (true) {
            f14771.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14768;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            C4484 c4484 = objectVolatile == null ? AbstractC5188.f14756 : AbstractC5188.f14757;
            while (true) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c5189 = this;
                if (unsafe2.compareAndSwapObject(c5189, f14768, objectVolatile, c4484)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(c5189, j) != objectVolatile) {
                    break;
                } else {
                    this = c5189;
                }
            }
            this = c5189;
        }
        if (objectVolatile == null) {
            return;
        }
        AbstractC4387.m8898(1, objectVolatile);
        ((InterfaceC6557) objectVolatile).invoke(c5189.m10249());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo8442(InterfaceC6557 interfaceC6557) {
        Unsafe unsafe;
        while (true) {
            f14771.getClass();
            Unsafe unsafe2 = AbstractC8501.f23600;
            C5189 c5189 = this;
            if (unsafe2.compareAndSwapObject(c5189, f14768, (Object) null, interfaceC6557)) {
                return;
            }
            long j = f14768;
            if (unsafe2.getObjectVolatile(c5189, j) != null) {
                while (true) {
                    Object objectVolatile = AbstractC8501.f23600.getObjectVolatile(c5189, j);
                    C4484 c4484 = AbstractC5188.f14756;
                    if (objectVolatile != c4484) {
                        if (objectVolatile == AbstractC5188.f14757) {
                            C5919.m11250("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            C4210.m8602(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    C4484 c44842 = AbstractC5188.f14757;
                    do {
                        C5189 c51892 = c5189;
                        unsafe = AbstractC8501.f23600;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c51892, f14768, c4484, c44842);
                        c5189 = c51892;
                        if (zCompareAndSwapObject) {
                            interfaceC6557.invoke(c5189.m10249());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(c5189, j) == c4484);
                }
            } else {
                this = c5189;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public Object mo8443(Object obj, InterfaceC4356 interfaceC4356) {
        return m10215(this, obj, interfaceC4356);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Object m10233(Object obj, InterfaceC4356 interfaceC4356) {
        C5443 c5443 = new C5443(1, AbstractC3054.m6602(interfaceC4356));
        c5443.m10539();
        c5443.resumeWith(Result.m8755constructorimpl(new Result.Failure(m10246())));
        Object objM10536 = c5443.m10536();
        return objM10536 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10536 : C5175.f14739;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r5.m10385() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r5.m10356();
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10234(long r7, kotlinx.coroutines.channels.C5200 r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.f14944
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.飘花落叶言子楪世苏兰哲 r0 = r9.m10351()
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r0 = (kotlinx.coroutines.channels.C5200) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.mo10355()
            if (r7 == 0) goto L23
            kotlinx.coroutines.internal.飘花落叶言子楪世苏兰哲 r7 = r5.m10351()
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r7 = (kotlinx.coroutines.channels.C5200) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.channels.C5189.f14774
            r7.getClass()
            sun.misc.Unsafe r7 = p291.AbstractC8501.f23600
            long r8 = kotlinx.coroutines.channels.C5189.f14769
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            kotlinx.coroutines.internal.飘花落叶言子楪哲苏兰世 r4 = (kotlinx.coroutines.internal.AbstractC5360) r4
            long r0 = r4.f14944
            long r2 = r5.f14944
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3c
            goto L58
        L3c:
            boolean r7 = r5.m10384()
            if (r7 != 0) goto L44
            r9 = r5
            goto L11
        L44:
            sun.misc.Unsafe r0 = p291.AbstractC8501.f23600
            long r2 = kotlinx.coroutines.channels.C5189.f14769
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L59
            boolean r6 = r4.m10385()
            if (r6 == 0) goto L58
            r4.m10356()
        L58:
            return
        L59:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L6a
            boolean r6 = r5.m10385()
            if (r6 == 0) goto L68
            r5.m10356()
        L68:
            r6 = r1
            goto L23
        L6a:
            r6 = r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.m10234(long, kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m10235() {
        long j = f14773.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean mo10236() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean m10237() {
        return m10231(f14778.get(this), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m10238(Throwable th, boolean z) {
        C5189 c5189;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14778;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                C5200 c5200 = AbstractC5188.f14752;
                c5189 = this;
                if (atomicLongFieldUpdater.compareAndSet(c5189, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = c5189;
            }
        } else {
            c5189 = this;
        }
        C4484 c4484 = AbstractC5188.f14753;
        while (true) {
            f14775.getClass();
            C5189 c51892 = c5189;
            Unsafe unsafe = AbstractC8501.f23600;
            long j5 = f14770;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c51892, j5, c4484, th2);
            c5189 = c51892;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(c5189, j5) != c4484) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(c5189);
            } while (!atomicLongFieldUpdater.compareAndSet(c5189, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(c5189);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c5189, j, j2));
        }
        c5189.m10237();
        if (z2) {
            c5189.m10232();
        }
        return z2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5200 m10239() {
        f14774.getClass();
        Unsafe unsafe = AbstractC8501.f23600;
        Object objectVolatile = unsafe.getObjectVolatile(this, f14769);
        f14776.getClass();
        C5200 c5200 = (C5200) unsafe.getObjectVolatile(this, f14766);
        if (c5200.f14944 > ((C5200) objectVolatile).f14944) {
            objectVolatile = c5200;
        }
        f14777.getClass();
        C5200 c52002 = (C5200) unsafe.getObjectVolatile(this, f14767);
        if (c52002.f14944 > ((C5200) objectVolatile).f14944) {
            objectVolatile = c52002;
        }
        AbstractC5351 abstractC5351 = (AbstractC5351) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC5351.f14925;
            Object objM10350 = abstractC5351.m10350();
            if (objM10350 == AbstractC5352.f14931) {
                break;
            }
            AbstractC5351 abstractC53512 = (AbstractC5351) objM10350;
            if (abstractC53512 != null) {
                abstractC5351 = abstractC53512;
            } else if (abstractC5351.m10354()) {
                break;
            }
        }
        return (C5200) abstractC5351;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo10240(ContinuationImpl continuationImpl) {
        return m10218(this, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10241(long j) {
        return j < f14773.get(this) || j < f14779.get(this) + ((long) this.f14780);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object mo10242(ContinuationImpl continuationImpl) {
        return m10216(this, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Throwable m10243() {
        Throwable thM10249 = m10249();
        return thM10249 == null ? new ClosedReceiveChannelException("Channel was closed") : thM10249;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long m10244() {
        return f14778.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean m10245() {
        while (true) {
            f14777.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14767;
            C5200 c5200M10248 = (C5200) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
            long j2 = atomicLongFieldUpdater.get(this);
            if (m10244() <= j2) {
                return false;
            }
            long j3 = AbstractC5188.f14751;
            long j4 = j2 / j3;
            if (c5200M10248.f14944 == j4 || (c5200M10248 = m10248(j4, c5200M10248)) != null) {
                c5200M10248.m10353();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objM10264 = c5200M10248.m10264(i);
                    if (objM10264 == null || objM10264 == AbstractC5188.f14748) {
                        if (c5200M10248.m10266(objM10264, i, AbstractC5188.f14760)) {
                            m10254();
                            break;
                        }
                    } else {
                        if (objM10264 == AbstractC5188.f14749) {
                            return true;
                        }
                        if (objM10264 != AbstractC5188.f14765 && objM10264 != AbstractC5188.f14763 && objM10264 != AbstractC5188.f14764 && objM10264 != AbstractC5188.f14760) {
                            if (objM10264 == AbstractC5188.f14761) {
                                return true;
                            }
                            if (objM10264 != AbstractC5188.f14747 && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                f14779.compareAndSet(this, j2, j2 + 1);
            } else if (((C5200) unsafe.getObjectVolatile(this, j)).f14944 < j4) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Throwable m10246() {
        Throwable thM10249 = m10249();
        return thM10249 == null ? new ClosedSendChannelException("Channel was closed") : thM10249;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[SYNTHETIC] */
    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8445(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.channels.C5189.f14778
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.m10231(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.m10241(r1)
            r1 = r1 ^ r10
        L1b:
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰哲世 r13 = kotlinx.coroutines.channels.C5201.f14790
            if (r1 == 0) goto L20
            return r13
        L20:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r6 = kotlinx.coroutines.channels.AbstractC5188.f14765
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.C5189.f14776
            r1.getClass()
            sun.misc.Unsafe r1 = p291.AbstractC8501.f23600
            long r2 = kotlinx.coroutines.channels.C5189.f14766
            java.lang.Object r1 = r1.getObjectVolatile(r15, r2)
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r1 = (kotlinx.coroutines.channels.C5200) r1
        L31:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.m10231(r2, r9)
            int r14 = kotlinx.coroutines.channels.AbstractC5188.f14751
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f14944
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L64
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r3 = r15.m10250(r11, r1)
            if (r3 != 0) goto L63
            if (r7 == 0) goto L5b
            java.lang.Throwable r0 = r15.m10246()
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲 r1 = new kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲
            r1.<init>(r0)
            return r1
        L5b:
            r9 = 0
            r10 = 1
        L5d:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L31
        L63:
            r1 = r3
        L64:
            r0 = r15
            r3 = r16
            int r9 = m10219(r0, r1, r2, r3, r4, r6, r7)
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5175.f14739
            if (r9 == 0) goto Lc3
            r10 = 1
            if (r9 == r10) goto Lc2
            r3 = 2
            r11 = 0
            if (r9 == r3) goto La2
            r2 = 3
            if (r9 == r2) goto L9c
            r2 = 4
            if (r9 == r2) goto L85
            r2 = 5
            if (r9 == r2) goto L80
            goto L83
        L80:
            r1.m10353()
        L83:
            r9 = 0
            goto L5d
        L85:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.C5189.f14779
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L92
            r1.m10353()
        L92:
            java.lang.Throwable r0 = r15.m10246()
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲 r1 = new kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲
            r1.<init>(r0)
            return r1
        L9c:
            java.lang.String r0 = "unexpected"
            top.suzhelan.qstory.hook.item.C5919.m11250(r0)
            return r11
        La2:
            if (r7 == 0) goto Lb1
            r1.m10383()
            java.lang.Throwable r0 = r15.m10246()
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲 r1 = new kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲
            r1.<init>(r0)
            return r1
        Lb1:
            boolean r0 = r6 instanceof kotlinx.coroutines.InterfaceC5411
            if (r0 == 0) goto Lb8
            r11 = r6
            kotlinx.coroutines.飘花落叶言子哲世兰苏楪 r11 = (kotlinx.coroutines.InterfaceC5411) r11
        Lb8:
            if (r11 == 0) goto Lbe
            int r2 = r2 + r14
            r11.mo10259(r1, r2)
        Lbe:
            r1.m10383()
            return r13
        Lc2:
            return r3
        Lc3:
            r1.m10353()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.mo8445(java.lang.Object):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0325 mo10247() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        bufferedChannel$onReceiveCatching$1.getClass();
        AbstractC4387.m8898(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        bufferedChannel$onReceiveCatching$2.getClass();
        AbstractC4387.m8898(3, bufferedChannel$onReceiveCatching$2);
        return new C0325(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, (Object) null, 15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r8.m10385() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r8.m10356();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.channels.C5200 m10248(long r16, kotlinx.coroutines.channels.C5200 r18) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.m10248(long, kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏):kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Throwable m10249() {
        f14775.getClass();
        return (Throwable) AbstractC8501.f23600.getObjectVolatile(this, f14770);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo8446(Throwable th) {
        return m10238(th, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5200 m10250(long j, C5200 c5200) {
        Object objM10362;
        long j2;
        long j3;
        Unsafe unsafe;
        C5200 c52002 = AbstractC5188.f14752;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM10362 = AbstractC5352.m10362(c5200, j, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC5352.m10359(objM10362)) {
                AbstractC5360 abstractC5360M10361 = AbstractC5352.m10361(objM10362);
                while (true) {
                    f14776.getClass();
                    Unsafe unsafe2 = AbstractC8501.f23600;
                    long j4 = f14766;
                    AbstractC5360 abstractC5360 = (AbstractC5360) unsafe2.getObjectVolatile(this, j4);
                    if (abstractC5360.f14944 >= abstractC5360M10361.f14944) {
                        break loop0;
                    }
                    if (!abstractC5360M10361.m10384()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC8501.f23600;
                        if (unsafe.compareAndSwapObject(this, f14766, abstractC5360, abstractC5360M10361)) {
                            if (abstractC5360.m10385()) {
                                abstractC5360.m10356();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == abstractC5360);
                    if (abstractC5360M10361.m10385()) {
                        abstractC5360M10361.m10356();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM10359 = AbstractC5352.m10359(objM10362);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
        if (zM10359) {
            m10237();
            if (c5200.f14944 * ((long) AbstractC5188.f14751) < atomicLongFieldUpdater.get(this)) {
                c5200.m10353();
                return null;
            }
        } else {
            C5200 c52003 = (C5200) AbstractC5352.m10361(objM10362);
            long j5 = c52003.f14944;
            if (j5 <= j) {
                return c52003;
            }
            long j6 = j5 * ((long) AbstractC5188.f14751);
            do {
                j2 = f14778.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!f14778.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) AbstractC5188.f14751) < atomicLongFieldUpdater.get(this)) {
                c52003.m10353();
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo10251() {
        C5200 c5200;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f14778.get(this);
        if (m10231(j2, true)) {
            return new C5208(m10249());
        }
        long j3 = j2 & 1152921504606846975L;
        C5209 c5209 = C5201.f14790;
        if (j >= j3) {
            return c5209;
        }
        Object obj = AbstractC5188.f14762;
        f14777.getClass();
        C5200 c52002 = (C5200) AbstractC8501.f23600.getObjectVolatile(this, f14767);
        while (!this.m10230()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = AbstractC5188.f14751;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c52002.f14944 != j5) {
                C5200 c5200M10248 = this.m10248(j5, c52002);
                if (c5200M10248 == null) {
                    continue;
                } else {
                    c5200 = c5200M10248;
                }
            } else {
                c5200 = c52002;
            }
            C5189 c5189 = this;
            Object objM10225 = c5189.m10225(c5200, i, andIncrement, obj);
            c52002 = c5200;
            if (objM10225 == AbstractC5188.f14755) {
                InterfaceC5411 interfaceC5411 = obj instanceof InterfaceC5411 ? (InterfaceC5411) obj : null;
                if (interfaceC5411 != null) {
                    interfaceC5411.mo10259(c52002, i);
                }
                c5189.m10221(andIncrement);
                c52002.m10383();
                return c5209;
            }
            if (objM10225 != AbstractC5188.f14758) {
                if (objM10225 != AbstractC5188.f14754) {
                    c52002.m10353();
                    return objM10225;
                }
                C5919.m11250("unexpected");
                return null;
            }
            if (andIncrement < c5189.m10244()) {
                c52002.m10353();
            }
            this = c5189;
        }
        return new C5208(this.m10249());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo10252(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m10238(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = (kotlinx.coroutines.channels.C5200) r1.m10349();
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.channels.C5200 m10253(long r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.m10253(long):kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        m10217(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10254() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5189.m10254():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5200 m10255(long j, C5200 c5200, long j2) {
        Object objM10362;
        Unsafe unsafe;
        C5200 c52002 = AbstractC5188.f14752;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM10362 = AbstractC5352.m10362(c5200, j, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC5352.m10359(objM10362)) {
                AbstractC5360 abstractC5360M10361 = AbstractC5352.m10361(objM10362);
                while (true) {
                    f14774.getClass();
                    Unsafe unsafe2 = AbstractC8501.f23600;
                    long j3 = f14769;
                    AbstractC5360 abstractC5360 = (AbstractC5360) unsafe2.getObjectVolatile(this, j3);
                    if (abstractC5360.f14944 >= abstractC5360M10361.f14944) {
                        break loop0;
                    }
                    if (!abstractC5360M10361.m10384()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC8501.f23600;
                        if (unsafe.compareAndSwapObject(this, f14769, abstractC5360, abstractC5360M10361)) {
                            if (abstractC5360.m10385()) {
                                abstractC5360.m10356();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == abstractC5360);
                    if (abstractC5360M10361.m10385()) {
                        abstractC5360M10361.m10356();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC5352.m10359(objM10362)) {
            m10237();
            m10234(j, c5200);
            m10217(this);
            return null;
        }
        C5200 c52003 = (C5200) AbstractC5352.m10361(objM10362);
        long j4 = c52003.f14944;
        if (j4 <= j) {
            return c52003;
        }
        long j5 = j4 * ((long) AbstractC5188.f14751);
        if (!f14773.compareAndSet(this, j2 + 1, j5)) {
            m10217(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14772;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0325 mo10256() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        bufferedChannel$onReceive$1.getClass();
        AbstractC4387.m8898(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        bufferedChannel$onReceive$2.getClass();
        AbstractC4387.m8898(3, bufferedChannel$onReceive$2);
        return new C0325(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, (Object) null, 15);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10257(long j) {
        f14777.getClass();
        C5200 c5200 = (C5200) AbstractC8501.f23600.getObjectVolatile(this, f14767);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f14780) + j2, f14773.get(this))) {
                return;
            }
            C5189 c5189 = this;
            if (atomicLongFieldUpdater.compareAndSet(c5189, j2, 1 + j2)) {
                long j3 = AbstractC5188.f14751;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c5200.f14944 != j4) {
                    C5200 c5200M10248 = c5189.m10248(j4, c5200);
                    if (c5200M10248 != null) {
                        c5200 = c5200M10248;
                    }
                }
                C5200 c52002 = c5200;
                if (c5189.m10225(c52002, i, j2, null) != AbstractC5188.f14758 || j2 < c5189.m10244()) {
                    c52002.m10353();
                }
                this = c5189;
                c5200 = c52002;
            }
            this = c5189;
        }
    }
}
