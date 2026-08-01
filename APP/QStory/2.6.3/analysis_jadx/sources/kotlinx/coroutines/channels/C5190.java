package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.C0325;
import androidx.window.area.AbstractC2567;
import com.alibaba.fastjson2.C2942;
import io.ktor.util.C4211;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5176;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.InterfaceC5412;
import kotlinx.coroutines.InterfaceC5447;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.AbstractC5358;
import kotlinx.coroutines.internal.AbstractC5361;
import kotlinx.coroutines.selects.C5369;
import kotlinx.coroutines.selects.InterfaceC5368;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import p052.InterfaceC6558;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5190 implements InterfaceC5207 {

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
    public static final /* synthetic */ AtomicLongFieldUpdater f14778 = AtomicLongFieldUpdater.newUpdater(C5190.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14779 = AtomicLongFieldUpdater.newUpdater(C5190.class, "receivers$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14773 = AtomicLongFieldUpdater.newUpdater(C5190.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14772 = AtomicLongFieldUpdater.newUpdater(C5190.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14776 = AtomicReferenceFieldUpdater.newUpdater(C5190.class, Object.class, "sendSegment$volatile");

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f14766 = unsafe.objectFieldOffset(C5190.class.getDeclaredField("sendSegment$volatile"));
        f14777 = AtomicReferenceFieldUpdater.newUpdater(C5190.class, Object.class, "receiveSegment$volatile");
        f14767 = unsafe.objectFieldOffset(C5190.class.getDeclaredField("receiveSegment$volatile"));
        f14774 = AtomicReferenceFieldUpdater.newUpdater(C5190.class, Object.class, "bufferEndSegment$volatile");
        f14769 = unsafe.objectFieldOffset(C5190.class.getDeclaredField("bufferEndSegment$volatile"));
        f14775 = AtomicReferenceFieldUpdater.newUpdater(C5190.class, Object.class, "_closeCause$volatile");
        f14770 = unsafe.objectFieldOffset(C5190.class.getDeclaredField("_closeCause$volatile"));
        f14771 = AtomicReferenceFieldUpdater.newUpdater(C5190.class, Object.class, "closeHandler$volatile");
        f14768 = unsafe.objectFieldOffset(C5190.class.getDeclaredField("closeHandler$volatile"));
    }

    public C5190(int i) {
        this.f14780 = i;
        if (i < 0) {
            C5925.m11314(AbstractC0053.m162(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        C5201 c5201 = AbstractC5189.f14752;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f14773.get(this);
        C5201 c52012 = new C5201(0L, null, this, 3);
        this.sendSegment$volatile = c52012;
        this.receiveSegment$volatile = c52012;
        if (m10239()) {
            c52012 = AbstractC5189.f14752;
            c52012.getClass();
        }
        this.bufferEndSegment$volatile = c52012;
        this._closeCause$volatile = AbstractC5189.f14753;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m10219(kotlinx.coroutines.channels.C5190 r22, java.lang.Object r23, kotlin.coroutines.InterfaceC4357 r24) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.m10219(kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, java.lang.Object, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m10220(kotlinx.coroutines.channels.C5190 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.m10220(kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m10221(C5190 c5190) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14772;
        if ((atomicLongFieldUpdater.addAndGet(c5190, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c5190) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static Object m10222(C5190 c5190, InterfaceC4357 interfaceC4357) throws Throwable {
        C5201 c5201;
        Throwable th;
        C5201 c52012;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14777;
        atomicReferenceFieldUpdater.getClass();
        if (c5190 == null) {
            C2942.m6394();
            return null;
        }
        C5201 c52013 = (C5201) AbstractC8493.f23591.getObjectVolatile(c5190, f14767);
        while (!c5190.m10234()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c5190);
            long j = AbstractC5189.f14751;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c52013.f14944 != j2) {
                C5201 c5201M10251 = c5190.m10251(j2, c52013);
                if (c5201M10251 == null) {
                    continue;
                } else {
                    c5201 = c5201M10251;
                }
            } else {
                c5201 = c52013;
            }
            C5190 c51902 = c5190;
            Object objM10229 = c51902.m10229(c5201, i, andIncrement, null);
            C4485 c4485 = AbstractC5189.f14755;
            if (objM10229 == c4485) {
                C5925.m11311("unexpected");
                return null;
            }
            C4485 c44852 = AbstractC5189.f14758;
            if (objM10229 == c44852) {
                if (andIncrement < c51902.m10248()) {
                    c5201.m10357();
                }
                c5190 = c51902;
                c52013 = c5201;
            } else {
                if (objM10229 != AbstractC5189.f14754) {
                    c5201.m10357();
                    return objM10229;
                }
                C5444 c5444M10492 = AbstractC5399.m10492(AbstractC2567.m5064(interfaceC4357));
                try {
                    Object objM102292 = c51902.m10229(c5201, i, andIncrement, c5444M10492);
                    if (objM102292 == c4485) {
                        c5444M10492.mo10263(c5201, i);
                    } else {
                        if (objM102292 == c44852) {
                            if (andIncrement < c51902.m10248()) {
                                c5201.m10357();
                            }
                            C5201 c52014 = (C5201) atomicReferenceFieldUpdater.get(c51902);
                            while (true) {
                                if (c51902.m10234()) {
                                    c5444M10492.resumeWith(Result.m8745constructorimpl(new Result.Failure(c51902.m10253())));
                                    break;
                                }
                                C5444 c5444 = c5444M10492;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c51902);
                                    long j3 = AbstractC5189.f14751;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (c52014.f14944 != j4) {
                                        try {
                                            C5201 c5201M102512 = c51902.m10251(j4, c52014);
                                            if (c5201M102512 == null) {
                                                c5444M10492 = c5444;
                                            } else {
                                                c52012 = c5201M102512;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c5444M10492 = c5444;
                                            c5444M10492.m10533();
                                            throw th;
                                        }
                                    } else {
                                        c52012 = c52014;
                                    }
                                    C5190 c51903 = c51902;
                                    objM102292 = c51903.m10229(c52012, i2, andIncrement2, c5444);
                                    c51902 = c51903;
                                    C5201 c52015 = c52012;
                                    c5444M10492 = c5444;
                                    if (objM102292 == AbstractC5189.f14755) {
                                        c5444M10492.mo10263(c52015, i2);
                                        break;
                                    }
                                    if (objM102292 == AbstractC5189.f14758) {
                                        if (andIncrement2 < c51902.m10248()) {
                                            c52015.m10357();
                                        }
                                        c52014 = c52015;
                                    } else {
                                        if (objM102292 == AbstractC5189.f14754) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c52015.m10357();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c5444M10492 = c5444;
                                    th = th;
                                    c5444M10492.m10533();
                                    throw th;
                                }
                            }
                        } else {
                            c5201.m10357();
                        }
                        c5444M10492.mo10434(objM102292, null);
                    }
                    Object objM10540 = c5444M10492.m10540();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM10540;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thM10253 = c5190.m10253();
        int i3 = AbstractC5358.f14940;
        throw thM10253;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m10223(C5190 c5190, C5201 c5201, int i, Object obj, long j, Object obj2, boolean z) {
        c5201.m10266(i, obj);
        if (z) {
            return c5190.m10228(c5201, i, obj, j, obj2, z);
        }
        Object objM10268 = c5201.m10268(i);
        if (objM10268 == null) {
            if (c5190.m10245(j)) {
                if (c5201.m10270(null, i, AbstractC5189.f14749)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c5201.m10270(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objM10268 instanceof InterfaceC5412) {
            c5201.m10266(i, null);
            if (c5190.m10227(objM10268, obj)) {
                c5201.m10265(i, AbstractC5189.f14764);
                return 0;
            }
            C4485 c4485 = AbstractC5189.f14762;
            if (c5201.f14788.getAndSet((i * 2) + 1, c4485) == c4485) {
                return 5;
            }
            c5201.m10269(i, true);
            return 5;
        }
        return c5190.m10228(c5201, i, obj, j, obj2, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10224(C5190 c5190, Object obj, C5444 c5444) {
        c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(c5190.m10246())));
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    public final InterfaceC5212 iterator() {
        return new C5191(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        r15 = r8;
        r3 = (kotlinx.coroutines.channels.C5201) r3.m10355();
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.toString():java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m10225(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C5190 c5190 = this;
        if (c5190.m10239()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f14773;
            if (atomicLongFieldUpdater.get(c5190) > j) {
                break;
            } else {
                c5190 = this;
            }
        }
        int i = AbstractC5189.f14750;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f14772;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c5190);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c5190)) && j2 == atomicLongFieldUpdater.get(c5190)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c5190);
                    if (atomicLongFieldUpdater2.compareAndSet(c5190, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c5190 = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c5190);
                    long j5 = atomicLongFieldUpdater2.get(c5190);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c5190)) {
                        break;
                    }
                    if (z) {
                        c5190 = this;
                    } else {
                        c5190 = this;
                        atomicLongFieldUpdater2.compareAndSet(c5190, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c5190);
                    if (atomicLongFieldUpdater2.compareAndSet(c5190, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c5190 = this;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean m10226(Object obj, C5201 c5201, int i) {
        TrySelectDetailedResult trySelectDetailedResult;
        boolean z = obj instanceof InterfaceC5447;
        C5176 c5176 = C5176.f14739;
        if (z) {
            return AbstractC5189.m10218((InterfaceC5447) obj, c5176, null);
        }
        if (!(obj instanceof InterfaceC5368)) {
            C4211.m8592(obj, "Unexpected waiter: ");
            return false;
        }
        int iM10416 = ((C5369) obj).m10416(this, c5176);
        if (iM10416 == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.SUCCESSFUL;
        } else if (iM10416 == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.REREGISTER;
        } else if (iM10416 == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.CANCELLED;
        } else {
            if (iM10416 != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iM10416).toString());
            }
            trySelectDetailedResult = TrySelectDetailedResult.ALREADY_SELECTED;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.REREGISTER) {
            c5201.m10266(i, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.SUCCESSFUL;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean m10227(Object obj, Object obj2) {
        if (obj instanceof InterfaceC5368) {
            return ((InterfaceC5368) obj).mo10412(this, obj2);
        }
        if (obj instanceof C5195) {
            return AbstractC5189.m10218(((C5195) obj).f14785, new C5202(obj2), null);
        }
        if (!(obj instanceof C5191)) {
            if (obj instanceof InterfaceC5447) {
                return AbstractC5189.m10218((InterfaceC5447) obj, obj2, null);
            }
            C4211.m8592(obj, "Unexpected receiver type: ");
            return false;
        }
        C5191 c5191 = (C5191) obj;
        C5444 c5444 = c5191.f14781;
        c5444.getClass();
        c5191.f14781 = null;
        c5191.f14783 = obj2;
        Boolean bool = Boolean.TRUE;
        c5191.f14782.getClass();
        return AbstractC5189.m10218(c5444, bool, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int m10228(C5201 c5201, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM10268 = c5201.m10268(i);
            if (objM10268 == null) {
                if (!m10245(j) || z) {
                    if (z) {
                        if (c5201.m10270(null, i, AbstractC5189.f14765)) {
                            c5201.m10387();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c5201.m10270(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (c5201.m10270(null, i, AbstractC5189.f14749)) {
                    break;
                }
            } else {
                if (objM10268 != AbstractC5189.f14748) {
                    C4485 c4485 = AbstractC5189.f14762;
                    if (objM10268 == c4485) {
                        c5201.m10266(i, null);
                        return 5;
                    }
                    if (objM10268 == AbstractC5189.f14760) {
                        c5201.m10266(i, null);
                        return 5;
                    }
                    if (objM10268 == AbstractC5189.f14763) {
                        c5201.m10266(i, null);
                        m10241();
                        return 4;
                    }
                    c5201.m10266(i, null);
                    if (objM10268 instanceof C5198) {
                        objM10268 = ((C5198) objM10268).f14787;
                    }
                    if (m10227(objM10268, obj)) {
                        c5201.m10265(i, AbstractC5189.f14764);
                        return 0;
                    }
                    if (c5201.f14788.getAndSet((i * 2) + 1, c4485) != c4485) {
                        c5201.m10269(i, true);
                    }
                    return 5;
                }
                if (c5201.m10270(objM10268, i, AbstractC5189.f14749)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Object m10229(C5201 c5201, int i, long j, Object obj) {
        Object objM10268 = c5201.m10268(i);
        AtomicReferenceArray atomicReferenceArray = c5201.f14788;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14778;
        if (objM10268 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC5189.f14754;
                }
                if (c5201.m10270(objM10268, i, obj)) {
                    m10258();
                    return AbstractC5189.f14755;
                }
            }
        } else if (objM10268 == AbstractC5189.f14749 && c5201.m10270(objM10268, i, AbstractC5189.f14764)) {
            m10258();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c5201.m10266(i, null);
            return obj2;
        }
        while (true) {
            Object objM102682 = c5201.m10268(i);
            if (objM102682 == null || objM102682 == AbstractC5189.f14748) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c5201.m10270(objM102682, i, AbstractC5189.f14760)) {
                        m10258();
                        return AbstractC5189.f14758;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC5189.f14754;
                    }
                    if (c5201.m10270(objM102682, i, obj)) {
                        m10258();
                        return AbstractC5189.f14755;
                    }
                }
            } else if (objM102682 != AbstractC5189.f14749) {
                C4485 c4485 = AbstractC5189.f14765;
                if (objM102682 == c4485) {
                    return AbstractC5189.f14758;
                }
                if (objM102682 == AbstractC5189.f14760) {
                    return AbstractC5189.f14758;
                }
                if (objM102682 == AbstractC5189.f14763) {
                    m10258();
                    return AbstractC5189.f14758;
                }
                if (objM102682 != AbstractC5189.f14761 && c5201.m10270(objM102682, i, AbstractC5189.f14747)) {
                    boolean z = objM102682 instanceof C5198;
                    if (z) {
                        objM102682 = ((C5198) objM102682).f14787;
                    }
                    if (m10226(objM102682, c5201, i)) {
                        c5201.m10265(i, AbstractC5189.f14764);
                        m10258();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c5201.m10266(i, null);
                        return obj3;
                    }
                    c5201.m10265(i, c4485);
                    c5201.m10387();
                    if (z) {
                        m10258();
                    }
                    return AbstractC5189.f14758;
                }
            } else if (c5201.m10270(objM102682, i, AbstractC5189.f14764)) {
                m10258();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c5201.m10266(i, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m10230(InterfaceC5412 interfaceC5412, boolean z) {
        if (interfaceC5412 instanceof InterfaceC5447) {
            ((InterfaceC4357) interfaceC5412).resumeWith(Result.m8745constructorimpl(new Result.Failure(z ? m10253() : m10246())));
            return;
        }
        if (interfaceC5412 instanceof C5195) {
            ((C5195) interfaceC5412).f14785.resumeWith(Result.m8745constructorimpl(new C5202(new C5209(m10252()))));
            return;
        }
        if (!(interfaceC5412 instanceof C5191)) {
            if (interfaceC5412 instanceof InterfaceC5368) {
                ((InterfaceC5368) interfaceC5412).mo10412(this, AbstractC5189.f14763);
                return;
            } else {
                C4211.m8592(interfaceC5412, "Unexpected waiter: ");
                return;
            }
        }
        C5191 c5191 = (C5191) interfaceC5412;
        C5444 c5444 = c5191.f14781;
        c5444.getClass();
        c5191.f14781 = null;
        c5191.f14783 = AbstractC5189.f14763;
        Throwable thM10252 = c5191.f14782.m10252();
        if (thM10252 == null) {
            c5444.resumeWith(Result.m8745constructorimpl(Boolean.FALSE));
        } else {
            c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(thM10252)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10231(kotlinx.coroutines.channels.C5201 r11, int r12, long r13, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.m10231(kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏, int, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public void mo10232(InterfaceC5368 interfaceC5368, Object obj) {
        C5201 c5201;
        f14776.getClass();
        C5201 c52012 = (C5201) AbstractC8493.f23591.getObjectVolatile(this, f14766);
        while (true) {
            long andIncrement = f14778.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM10235 = this.m10235(andIncrement, false);
            int i = AbstractC5189.f14751;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c52012.f14944 != j3) {
                C5201 c5201M10254 = this.m10254(j3, c52012);
                if (c5201M10254 != null) {
                    c5201 = c5201M10254;
                } else if (zM10235) {
                    interfaceC5368.mo10411(AbstractC5189.f14763);
                    return;
                }
            } else {
                c5201 = c52012;
            }
            C5190 c5190 = this;
            InterfaceC5368 interfaceC53682 = interfaceC5368;
            Object obj2 = obj;
            int iM10223 = m10223(c5190, c5201, i2, obj2, j, interfaceC53682, zM10235);
            c52012 = c5201;
            C5176 c5176 = C5176.f14739;
            if (iM10223 == 0) {
                c52012.m10357();
                interfaceC53682.mo10411(c5176);
                return;
            }
            if (iM10223 == 1) {
                interfaceC53682.mo10411(c5176);
                return;
            }
            if (iM10223 == 2) {
                if (zM10235) {
                    c52012.m10387();
                    interfaceC53682.mo10411(AbstractC5189.f14763);
                    return;
                } else {
                    InterfaceC5412 interfaceC5412 = interfaceC53682 instanceof InterfaceC5412 ? (InterfaceC5412) interfaceC53682 : null;
                    if (interfaceC5412 != null) {
                        interfaceC5412.mo10263(c52012, i2 + i);
                        return;
                    }
                    return;
                }
            }
            if (iM10223 == 3) {
                C5925.m11311("unexpected");
                return;
            }
            if (iM10223 == 4) {
                if (j < f14779.get(c5190)) {
                    c52012.m10357();
                }
                interfaceC53682.mo10411(AbstractC5189.f14763);
                return;
            } else {
                if (iM10223 == 5) {
                    c52012.m10357();
                }
                this = c5190;
                obj = obj2;
                interfaceC5368 = interfaceC53682;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m10233(InterfaceC5368 interfaceC5368) {
        C5201 c5201;
        C5190 c5190;
        InterfaceC5368 interfaceC53682;
        int i;
        f14777.getClass();
        C5201 c52012 = (C5201) AbstractC8493.f23591.getObjectVolatile(this, f14767);
        while (!this.m10234()) {
            long andIncrement = f14779.getAndIncrement(this);
            long j = AbstractC5189.f14751;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c52012.f14944 != j2) {
                C5201 c5201M10251 = this.m10251(j2, c52012);
                if (c5201M10251 == null) {
                    continue;
                } else {
                    c5201 = c5201M10251;
                    interfaceC53682 = interfaceC5368;
                    i = i2;
                    c5190 = this;
                }
            } else {
                c5201 = c52012;
                c5190 = this;
                interfaceC53682 = interfaceC5368;
                i = i2;
            }
            Object objM10229 = c5190.m10229(c5201, i, andIncrement, interfaceC53682);
            c52012 = c5201;
            if (objM10229 == AbstractC5189.f14755) {
                InterfaceC5412 interfaceC5412 = interfaceC53682 instanceof InterfaceC5412 ? (InterfaceC5412) interfaceC53682 : null;
                if (interfaceC5412 != null) {
                    interfaceC5412.mo10263(c52012, i);
                    return;
                }
                return;
            }
            if (objM10229 != AbstractC5189.f14758) {
                if (objM10229 == AbstractC5189.f14754) {
                    C5925.m11311("unexpected");
                    return;
                } else {
                    c52012.m10357();
                    interfaceC53682.mo10411(objM10229);
                    return;
                }
            }
            if (andIncrement < c5190.m10248()) {
                c52012.m10357();
            }
            this = c5190;
            interfaceC5368 = interfaceC53682;
        }
        interfaceC5368.mo10411(AbstractC5189.f14763);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m10234() {
        return m10235(f14778.get(this), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        r10 = (kotlinx.coroutines.channels.C5201) r10.m10353();
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10235(long r10, boolean r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.m10235(long, boolean):boolean");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8432(InterfaceC6558 interfaceC6558) {
        Unsafe unsafe;
        while (true) {
            f14771.getClass();
            Unsafe unsafe2 = AbstractC8493.f23591;
            C5190 c5190 = this;
            if (unsafe2.compareAndSwapObject(c5190, f14768, (Object) null, interfaceC6558)) {
                return;
            }
            long j = f14768;
            if (unsafe2.getObjectVolatile(c5190, j) != null) {
                while (true) {
                    Object objectVolatile = AbstractC8493.f23591.getObjectVolatile(c5190, j);
                    C4485 c4485 = AbstractC5189.f14756;
                    if (objectVolatile != c4485) {
                        if (objectVolatile == AbstractC5189.f14757) {
                            C5925.m11311("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            C4211.m8592(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    C4485 c44852 = AbstractC5189.f14757;
                    do {
                        C5190 c51902 = c5190;
                        unsafe = AbstractC8493.f23591;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c51902, f14768, c4485, c44852);
                        c5190 = c51902;
                        if (zCompareAndSwapObject) {
                            interfaceC6558.invoke(c5190.m10252());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(c5190, j) == c4485);
                }
            } else {
                this = c5190;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m10236() {
        Object objectVolatile;
        C5190 c5190;
        loop0: while (true) {
            f14771.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14768;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            C4485 c4485 = objectVolatile == null ? AbstractC5189.f14756 : AbstractC5189.f14757;
            while (true) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c5190 = this;
                if (unsafe2.compareAndSwapObject(c5190, f14768, objectVolatile, c4485)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(c5190, j) != objectVolatile) {
                    break;
                } else {
                    this = c5190;
                }
            }
            this = c5190;
        }
        if (objectVolatile == null) {
            return;
        }
        AbstractC4388.m8888(1, objectVolatile);
        ((InterfaceC6558) objectVolatile).invoke(c5190.m10252());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public Object mo8433(Object obj, InterfaceC4357 interfaceC4357) {
        return m10219(this, obj, interfaceC4357);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Object m10237(Object obj, InterfaceC4357 interfaceC4357) {
        C5444 c5444 = new C5444(1, AbstractC2567.m5064(interfaceC4357));
        c5444.m10543();
        c5444.resumeWith(Result.m8745constructorimpl(new Result.Failure(m10246())));
        Object objM10540 = c5444.m10540();
        return objM10540 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10540 : C5176.f14739;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r5.m10389() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r5.m10360();
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10238(long r7, kotlinx.coroutines.channels.C5201 r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.f14944
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.飘花落叶言子楪世苏兰哲 r0 = r9.m10355()
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r0 = (kotlinx.coroutines.channels.C5201) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.mo10359()
            if (r7 == 0) goto L23
            kotlinx.coroutines.internal.飘花落叶言子楪世苏兰哲 r7 = r5.m10355()
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r7 = (kotlinx.coroutines.channels.C5201) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.channels.C5190.f14774
            r7.getClass()
            sun.misc.Unsafe r7 = p291.AbstractC8493.f23591
            long r8 = kotlinx.coroutines.channels.C5190.f14769
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            kotlinx.coroutines.internal.飘花落叶言子楪哲苏兰世 r4 = (kotlinx.coroutines.internal.AbstractC5361) r4
            long r0 = r4.f14944
            long r2 = r5.f14944
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3c
            goto L58
        L3c:
            boolean r7 = r5.m10388()
            if (r7 != 0) goto L44
            r9 = r5
            goto L11
        L44:
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r2 = kotlinx.coroutines.channels.C5190.f14769
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L59
            boolean r6 = r4.m10389()
            if (r6 == 0) goto L58
            r4.m10360()
        L58:
            return
        L59:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L6a
            boolean r6 = r5.m10389()
            if (r6 == 0) goto L68
            r5.m10360()
        L68:
            r6 = r1
            goto L23
        L6a:
            r6 = r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.m10238(long, kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m10239() {
        long j = f14773.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean mo10240() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean m10241() {
        return m10235(f14778.get(this), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m10242(Throwable th, boolean z) {
        C5190 c5190;
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
                C5201 c5201 = AbstractC5189.f14752;
                c5190 = this;
                if (atomicLongFieldUpdater.compareAndSet(c5190, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = c5190;
            }
        } else {
            c5190 = this;
        }
        C4485 c4485 = AbstractC5189.f14753;
        while (true) {
            f14775.getClass();
            C5190 c51902 = c5190;
            Unsafe unsafe = AbstractC8493.f23591;
            long j5 = f14770;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c51902, j5, c4485, th2);
            c5190 = c51902;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(c5190, j5) != c4485) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(c5190);
            } while (!atomicLongFieldUpdater.compareAndSet(c5190, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(c5190);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c5190, j, j2));
        }
        c5190.m10241();
        if (z2) {
            c5190.m10236();
        }
        return z2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5201 m10243() {
        f14774.getClass();
        Unsafe unsafe = AbstractC8493.f23591;
        Object objectVolatile = unsafe.getObjectVolatile(this, f14769);
        f14776.getClass();
        C5201 c5201 = (C5201) unsafe.getObjectVolatile(this, f14766);
        if (c5201.f14944 > ((C5201) objectVolatile).f14944) {
            objectVolatile = c5201;
        }
        f14777.getClass();
        C5201 c52012 = (C5201) unsafe.getObjectVolatile(this, f14767);
        if (c52012.f14944 > ((C5201) objectVolatile).f14944) {
            objectVolatile = c52012;
        }
        AbstractC5352 abstractC5352 = (AbstractC5352) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC5352.f14925;
            Object objM10354 = abstractC5352.m10354();
            if (objM10354 == AbstractC5353.f14931) {
                break;
            }
            AbstractC5352 abstractC53522 = (AbstractC5352) objM10354;
            if (abstractC53522 != null) {
                abstractC5352 = abstractC53522;
            } else if (abstractC5352.m10358()) {
                break;
            }
        }
        return (C5201) abstractC5352;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo10244(ContinuationImpl continuationImpl) {
        return m10222(this, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10245(long j) {
        return j < f14773.get(this) || j < f14779.get(this) + ((long) this.f14780);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Throwable m10246() {
        Throwable thM10252 = m10252();
        return thM10252 == null ? new ClosedSendChannelException("Channel was closed") : thM10252;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo8435(Throwable th) {
        return m10242(th, false);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Object mo10247(ContinuationImpl continuationImpl) {
        return m10220(this, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[SYNTHETIC] */
    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8436(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.channels.C5190.f14778
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.m10235(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.m10245(r1)
            r1 = r1 ^ r10
        L1b:
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰哲世 r13 = kotlinx.coroutines.channels.C5202.f14790
            if (r1 == 0) goto L20
            return r13
        L20:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r6 = kotlinx.coroutines.channels.AbstractC5189.f14765
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.C5190.f14776
            r1.getClass()
            sun.misc.Unsafe r1 = p291.AbstractC8493.f23591
            long r2 = kotlinx.coroutines.channels.C5190.f14766
            java.lang.Object r1 = r1.getObjectVolatile(r15, r2)
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r1 = (kotlinx.coroutines.channels.C5201) r1
        L31:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.m10235(r2, r9)
            int r14 = kotlinx.coroutines.channels.AbstractC5189.f14751
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f14944
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L64
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r3 = r15.m10254(r11, r1)
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
            int r9 = m10223(r0, r1, r2, r3, r4, r6, r7)
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
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
            r1.m10357()
        L83:
            r9 = 0
            goto L5d
        L85:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.C5190.f14779
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L92
            r1.m10357()
        L92:
            java.lang.Throwable r0 = r15.m10246()
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲 r1 = new kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲
            r1.<init>(r0)
            return r1
        L9c:
            java.lang.String r0 = "unexpected"
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
            return r11
        La2:
            if (r7 == 0) goto Lb1
            r1.m10387()
            java.lang.Throwable r0 = r15.m10246()
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲 r1 = new kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲
            r1.<init>(r0)
            return r1
        Lb1:
            boolean r0 = r6 instanceof kotlinx.coroutines.InterfaceC5412
            if (r0 == 0) goto Lb8
            r11 = r6
            kotlinx.coroutines.飘花落叶言子哲世兰苏楪 r11 = (kotlinx.coroutines.InterfaceC5412) r11
        Lb8:
            if (r11 == 0) goto Lbe
            int r2 = r2 + r14
            r11.mo10263(r1, r2)
        Lbe:
            r1.m10387()
            return r13
        Lc2:
            return r3
        Lc3:
            r1.m10357()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.mo8436(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long m10248() {
        return f14778.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m10249() {
        while (true) {
            f14777.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14767;
            C5201 c5201M10251 = (C5201) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
            long j2 = atomicLongFieldUpdater.get(this);
            if (m10248() <= j2) {
                return false;
            }
            long j3 = AbstractC5189.f14751;
            long j4 = j2 / j3;
            if (c5201M10251.f14944 == j4 || (c5201M10251 = m10251(j4, c5201M10251)) != null) {
                c5201M10251.m10357();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objM10268 = c5201M10251.m10268(i);
                    if (objM10268 == null || objM10268 == AbstractC5189.f14748) {
                        if (c5201M10251.m10270(objM10268, i, AbstractC5189.f14760)) {
                            m10258();
                            break;
                        }
                    } else {
                        if (objM10268 == AbstractC5189.f14749) {
                            return true;
                        }
                        if (objM10268 != AbstractC5189.f14765 && objM10268 != AbstractC5189.f14763 && objM10268 != AbstractC5189.f14764 && objM10268 != AbstractC5189.f14760) {
                            if (objM10268 == AbstractC5189.f14761) {
                                return true;
                            }
                            if (objM10268 != AbstractC5189.f14747 && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                f14779.compareAndSet(this, j2, j2 + 1);
            } else if (((C5201) unsafe.getObjectVolatile(this, j)).f14944 < j4) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0325 mo10250() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        bufferedChannel$onReceiveCatching$1.getClass();
        AbstractC4388.m8888(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        bufferedChannel$onReceiveCatching$2.getClass();
        AbstractC4388.m8888(3, bufferedChannel$onReceiveCatching$2);
        return new C0325(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, (Object) null, 15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r8.m10389() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r8.m10360();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.channels.C5201 m10251(long r16, kotlinx.coroutines.channels.C5201 r18) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.m10251(long, kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏):kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Throwable m10252() {
        f14775.getClass();
        return (Throwable) AbstractC8493.f23591.getObjectVolatile(this, f14770);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Throwable m10253() {
        Throwable thM10252 = m10252();
        return thM10252 == null ? new ClosedReceiveChannelException("Channel was closed") : thM10252;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5201 m10254(long j, C5201 c5201) {
        Object objM10366;
        long j2;
        long j3;
        Unsafe unsafe;
        C5201 c52012 = AbstractC5189.f14752;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM10366 = AbstractC5353.m10366(c5201, j, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC5353.m10363(objM10366)) {
                AbstractC5361 abstractC5361M10365 = AbstractC5353.m10365(objM10366);
                while (true) {
                    f14776.getClass();
                    Unsafe unsafe2 = AbstractC8493.f23591;
                    long j4 = f14766;
                    AbstractC5361 abstractC5361 = (AbstractC5361) unsafe2.getObjectVolatile(this, j4);
                    if (abstractC5361.f14944 >= abstractC5361M10365.f14944) {
                        break loop0;
                    }
                    if (!abstractC5361M10365.m10388()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC8493.f23591;
                        if (unsafe.compareAndSwapObject(this, f14766, abstractC5361, abstractC5361M10365)) {
                            if (abstractC5361.m10389()) {
                                abstractC5361.m10360();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == abstractC5361);
                    if (abstractC5361M10365.m10389()) {
                        abstractC5361M10365.m10360();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM10363 = AbstractC5353.m10363(objM10366);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
        if (zM10363) {
            m10241();
            if (c5201.f14944 * ((long) AbstractC5189.f14751) < atomicLongFieldUpdater.get(this)) {
                c5201.m10357();
                return null;
            }
        } else {
            C5201 c52013 = (C5201) AbstractC5353.m10365(objM10366);
            long j5 = c52013.f14944;
            if (j5 <= j) {
                return c52013;
            }
            long j6 = j5 * ((long) AbstractC5189.f14751);
            do {
                j2 = f14778.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!f14778.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) AbstractC5189.f14751) < atomicLongFieldUpdater.get(this)) {
                c52013.m10357();
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo10255() {
        C5201 c5201;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f14778.get(this);
        if (m10235(j2, true)) {
            return new C5209(m10252());
        }
        long j3 = j2 & 1152921504606846975L;
        C5210 c5210 = C5202.f14790;
        if (j >= j3) {
            return c5210;
        }
        Object obj = AbstractC5189.f14762;
        f14777.getClass();
        C5201 c52012 = (C5201) AbstractC8493.f23591.getObjectVolatile(this, f14767);
        while (!this.m10234()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = AbstractC5189.f14751;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c52012.f14944 != j5) {
                C5201 c5201M10251 = this.m10251(j5, c52012);
                if (c5201M10251 == null) {
                    continue;
                } else {
                    c5201 = c5201M10251;
                }
            } else {
                c5201 = c52012;
            }
            C5190 c5190 = this;
            Object objM10229 = c5190.m10229(c5201, i, andIncrement, obj);
            c52012 = c5201;
            if (objM10229 == AbstractC5189.f14755) {
                InterfaceC5412 interfaceC5412 = obj instanceof InterfaceC5412 ? (InterfaceC5412) obj : null;
                if (interfaceC5412 != null) {
                    interfaceC5412.mo10263(c52012, i);
                }
                c5190.m10225(andIncrement);
                c52012.m10387();
                return c5210;
            }
            if (objM10229 != AbstractC5189.f14758) {
                if (objM10229 != AbstractC5189.f14754) {
                    c52012.m10357();
                    return objM10229;
                }
                C5925.m11311("unexpected");
                return null;
            }
            if (andIncrement < c5190.m10248()) {
                c52012.m10357();
            }
            this = c5190;
        }
        return new C5209(this.m10252());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo10256(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m10242(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = (kotlinx.coroutines.channels.C5201) r1.m10353();
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.channels.C5201 m10257(long r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.m10257(long):kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        m10221(r1);
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
    public final void m10258() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5190.m10258():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5201 m10259(long j, C5201 c5201, long j2) {
        Object objM10366;
        Unsafe unsafe;
        C5201 c52012 = AbstractC5189.f14752;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM10366 = AbstractC5353.m10366(c5201, j, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC5353.m10363(objM10366)) {
                AbstractC5361 abstractC5361M10365 = AbstractC5353.m10365(objM10366);
                while (true) {
                    f14774.getClass();
                    Unsafe unsafe2 = AbstractC8493.f23591;
                    long j3 = f14769;
                    AbstractC5361 abstractC5361 = (AbstractC5361) unsafe2.getObjectVolatile(this, j3);
                    if (abstractC5361.f14944 >= abstractC5361M10365.f14944) {
                        break loop0;
                    }
                    if (!abstractC5361M10365.m10388()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC8493.f23591;
                        if (unsafe.compareAndSwapObject(this, f14769, abstractC5361, abstractC5361M10365)) {
                            if (abstractC5361.m10389()) {
                                abstractC5361.m10360();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == abstractC5361);
                    if (abstractC5361M10365.m10389()) {
                        abstractC5361M10365.m10360();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC5353.m10363(objM10366)) {
            m10241();
            m10238(j, c5201);
            m10221(this);
            return null;
        }
        C5201 c52013 = (C5201) AbstractC5353.m10365(objM10366);
        long j4 = c52013.f14944;
        if (j4 <= j) {
            return c52013;
        }
        long j5 = j4 * ((long) AbstractC5189.f14751);
        if (!f14773.compareAndSet(this, j2 + 1, j5)) {
            m10221(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14772;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0325 mo10260() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        bufferedChannel$onReceive$1.getClass();
        AbstractC4388.m8888(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        bufferedChannel$onReceive$2.getClass();
        AbstractC4388.m8888(3, bufferedChannel$onReceive$2);
        return new C0325(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, (Object) null, 15);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10261(long j) {
        f14777.getClass();
        C5201 c5201 = (C5201) AbstractC8493.f23591.getObjectVolatile(this, f14767);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14779;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f14780) + j2, f14773.get(this))) {
                return;
            }
            C5190 c5190 = this;
            if (atomicLongFieldUpdater.compareAndSet(c5190, j2, 1 + j2)) {
                long j3 = AbstractC5189.f14751;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c5201.f14944 != j4) {
                    C5201 c5201M10251 = c5190.m10251(j4, c5201);
                    if (c5201M10251 != null) {
                        c5201 = c5201M10251;
                    }
                }
                C5201 c52012 = c5201;
                if (c5190.m10229(c52012, i, j2, null) != AbstractC5189.f14758 || j2 < c5190.m10248()) {
                    c52012.m10357();
                }
                this = c5190;
                c5201 = c52012;
            }
            this = c5190;
        }
    }
}
