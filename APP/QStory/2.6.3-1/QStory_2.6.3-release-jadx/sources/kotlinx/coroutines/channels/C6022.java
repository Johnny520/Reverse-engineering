package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.C1171;
import androidx.window.area.AbstractC3400;
import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6244;
import kotlinx.coroutines.InterfaceC6279;
import kotlinx.coroutines.internal.AbstractC6184;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.AbstractC6190;
import kotlinx.coroutines.internal.AbstractC6193;
import kotlinx.coroutines.selects.C6201;
import kotlinx.coroutines.selects.InterfaceC6200;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p183.InterfaceC8536;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6022 implements InterfaceC6039 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f15111;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15112;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ long f15113;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15114;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15115;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15116;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15119;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15120;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15122;
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
    public final int f15125;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15123 = AtomicLongFieldUpdater.newUpdater(C6022.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15124 = AtomicLongFieldUpdater.newUpdater(C6022.class, "receivers$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15118 = AtomicLongFieldUpdater.newUpdater(C6022.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15117 = AtomicLongFieldUpdater.newUpdater(C6022.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15121 = AtomicReferenceFieldUpdater.newUpdater(C6022.class, Object.class, "sendSegment$volatile");

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f15111 = unsafe.objectFieldOffset(C6022.class.getDeclaredField("sendSegment$volatile"));
        f15122 = AtomicReferenceFieldUpdater.newUpdater(C6022.class, Object.class, "receiveSegment$volatile");
        f15112 = unsafe.objectFieldOffset(C6022.class.getDeclaredField("receiveSegment$volatile"));
        f15119 = AtomicReferenceFieldUpdater.newUpdater(C6022.class, Object.class, "bufferEndSegment$volatile");
        f15114 = unsafe.objectFieldOffset(C6022.class.getDeclaredField("bufferEndSegment$volatile"));
        f15120 = AtomicReferenceFieldUpdater.newUpdater(C6022.class, Object.class, "_closeCause$volatile");
        f15115 = unsafe.objectFieldOffset(C6022.class.getDeclaredField("_closeCause$volatile"));
        f15116 = AtomicReferenceFieldUpdater.newUpdater(C6022.class, Object.class, "closeHandler$volatile");
        f15113 = unsafe.objectFieldOffset(C6022.class.getDeclaredField("closeHandler$volatile"));
    }

    public C6022(int i) {
        this.f15125 = i;
        if (i < 0) {
            C6755.m11873(AbstractC0900.m722(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        C6033 c6033 = AbstractC6021.f15097;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f15118.get(this);
        C6033 c60332 = new C6033(0L, null, this, 3);
        this.sendSegment$volatile = c60332;
        this.receiveSegment$volatile = c60332;
        if (m10798()) {
            c60332 = AbstractC6021.f15097;
            c60332.getClass();
        }
        this.bufferEndSegment$volatile = c60332;
        this._closeCause$volatile = AbstractC6021.f15098;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m10778(C6022 c6022, Object obj, InterfaceC5189 interfaceC5189) {
        C6008 c6008;
        Object objM11099;
        CoroutineSingletons coroutineSingletons;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15121;
        atomicReferenceFieldUpdater.getClass();
        C6033 c6033 = (C6033) AbstractC9322.f23936.getObjectVolatile(c6022, f15111);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15123;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c6022);
            long j = andIncrement & 1152921504606846975L;
            boolean zM10794 = c6022.m10794(andIncrement, false);
            int i = AbstractC6021.f15096;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = c6033.f15289;
            c6008 = C6008.f15084;
            if (j4 != j3) {
                C6033 c6033M10813 = c6022.m10813(j3, c6033);
                if (c6033M10813 != null) {
                    c6033 = c6033M10813;
                } else if (zM10794) {
                    Object objM10796 = c6022.m10796(obj, interfaceC5189);
                    if (objM10796 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objM10796;
                    }
                }
            }
            int iM10782 = m10782(c6022, c6033, i2, obj, j, null, zM10794);
            if (iM10782 == 0) {
                c6033.m10916();
                return c6008;
            }
            if (iM10782 == 1) {
                break;
            }
            if (iM10782 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15124;
                if (iM10782 == 3) {
                    C6276 c6276M11051 = AbstractC6231.m11051(AbstractC3400.m5624(interfaceC5189));
                    try {
                        int iM107822 = m10782(c6022, c6033, i2, obj, j, c6276M11051, false);
                        if (iM107822 == 0) {
                            c6033.m10916();
                        } else if (iM107822 != 1) {
                            if (iM107822 != 2) {
                                if (iM107822 != 4) {
                                    String str = "unexpected";
                                    if (iM107822 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c6033.m10916();
                                    C6033 c60332 = (C6033) atomicReferenceFieldUpdater.get(c6022);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c6022);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean zM107942 = c6022.m10794(andIncrement2, false);
                                        int i3 = AbstractC6021.f15096;
                                        String str2 = str;
                                        long j6 = i3;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        if (c60332.f15289 != j7) {
                                            C6033 c6033M108132 = c6022.m10813(j7, c60332);
                                            if (c6033M108132 != null) {
                                                c60332 = c6033M108132;
                                            } else {
                                                if (zM107942) {
                                                    break;
                                                }
                                                str = str2;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                            }
                                        }
                                        int iM107823 = m10782(c6022, c60332, i4, obj, j5, c6276M11051, zM107942);
                                        if (iM107823 == 0) {
                                            c60332.m10916();
                                            break;
                                        }
                                        if (iM107823 == 1) {
                                            break;
                                        }
                                        if (iM107823 != 2) {
                                            if (iM107823 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (iM107823 != 4) {
                                                if (iM107823 == 5) {
                                                    c60332.m10916();
                                                }
                                                str = str2;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                            } else if (j5 < atomicLongFieldUpdater3.get(c6022)) {
                                                c60332.m10916();
                                            }
                                        } else if (zM107942) {
                                            c60332.m10946();
                                        } else {
                                            c6276M11051.mo10822(c60332, i4 + i3);
                                        }
                                    }
                                } else if (j < atomicLongFieldUpdater2.get(c6022)) {
                                    c6033.m10916();
                                }
                                m10783(c6022, obj, c6276M11051);
                            } else {
                                c6276M11051.mo10822(c6033, i2 + i);
                            }
                            objM11099 = c6276M11051.m11099();
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (objM11099 != coroutineSingletons) {
                                objM11099 = c6008;
                            }
                            if (objM11099 != coroutineSingletons) {
                                return objM11099;
                            }
                        }
                        c6276M11051.resumeWith(Result.m9304constructorimpl(c6008));
                        objM11099 = c6276M11051.m11099();
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (objM11099 != coroutineSingletons) {
                        }
                        if (objM11099 != coroutineSingletons) {
                            break;
                        }
                    } catch (Throwable th) {
                        c6276M11051.m11092();
                        throw th;
                    }
                } else if (iM10782 == 4) {
                    if (j < atomicLongFieldUpdater2.get(c6022)) {
                        c6033.m10916();
                    }
                    Object objM107962 = c6022.m10796(obj, interfaceC5189);
                    if (objM107962 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objM107962;
                    }
                } else if (iM10782 == 5) {
                    c6033.m10916();
                }
            } else if (zM10794) {
                c6033.m10946();
                Object objM107963 = c6022.m10796(obj, interfaceC5189);
                if (objM107963 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM107963;
                }
            }
        }
        return c6008;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m10779(C6022 c6022, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        if (continuationImpl instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuationImpl;
            int i = bufferedChannel$receiveCatching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(c6022, continuationImpl);
            }
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$12.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bufferedChannel$receiveCatching$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            return ((C6034) obj).f15136;
        }
        AbstractC6017.m10769(obj);
        f15122.getClass();
        if (c6022 == null) {
            C3775.m6954();
            return null;
        }
        C6033 c6033 = (C6033) AbstractC9322.f23936.getObjectVolatile(c6022, f15112);
        while (!c6022.m10793()) {
            long andIncrement = f15124.getAndIncrement(c6022);
            long j = AbstractC6021.f15096;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (c6033.f15289 != j2) {
                C6033 c6033M10810 = c6022.m10810(j2, c6033);
                if (c6033M10810 == null) {
                    continue;
                } else {
                    c6033 = c6033M10810;
                }
            }
            Object objM10788 = c6022.m10788(c6033, i3, andIncrement, null);
            if (objM10788 == AbstractC6021.f15100) {
                C6755.m11870("unexpected");
                return null;
            }
            if (objM10788 != AbstractC6021.f15103) {
                if (objM10788 != AbstractC6021.f15099) {
                    c6033.m10916();
                    return objM10788;
                }
                bufferedChannel$receiveCatching$12.L$0 = null;
                bufferedChannel$receiveCatching$12.L$1 = null;
                bufferedChannel$receiveCatching$12.L$2 = null;
                bufferedChannel$receiveCatching$12.L$3 = null;
                bufferedChannel$receiveCatching$12.L$4 = null;
                bufferedChannel$receiveCatching$12.I$0 = 0;
                bufferedChannel$receiveCatching$12.J$0 = andIncrement;
                bufferedChannel$receiveCatching$12.J$1 = j2;
                bufferedChannel$receiveCatching$12.I$1 = i3;
                bufferedChannel$receiveCatching$12.J$2 = andIncrement;
                bufferedChannel$receiveCatching$12.I$2 = i3;
                bufferedChannel$receiveCatching$12.I$3 = 0;
                bufferedChannel$receiveCatching$12.label = 1;
                Object objM10790 = c6022.m10790(c6033, i3, andIncrement, bufferedChannel$receiveCatching$12);
                return objM10790 == obj2 ? obj2 : objM10790;
            }
            if (andIncrement < c6022.m10807()) {
                c6033.m10916();
            }
        }
        return new C6041(c6022.m10811());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m10780(C6022 c6022) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15117;
        if ((atomicLongFieldUpdater.addAndGet(c6022, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c6022) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static Object m10781(C6022 c6022, InterfaceC5189 interfaceC5189) throws Throwable {
        C6033 c6033;
        Throwable th;
        C6033 c60332;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15122;
        atomicReferenceFieldUpdater.getClass();
        if (c6022 == null) {
            C3775.m6954();
            return null;
        }
        C6033 c60333 = (C6033) AbstractC9322.f23936.getObjectVolatile(c6022, f15112);
        while (!c6022.m10793()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15124;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c6022);
            long j = AbstractC6021.f15096;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c60333.f15289 != j2) {
                C6033 c6033M10810 = c6022.m10810(j2, c60333);
                if (c6033M10810 == null) {
                    continue;
                } else {
                    c6033 = c6033M10810;
                }
            } else {
                c6033 = c60333;
            }
            C6022 c60222 = c6022;
            Object objM10788 = c60222.m10788(c6033, i, andIncrement, null);
            C5317 c5317 = AbstractC6021.f15100;
            if (objM10788 == c5317) {
                C6755.m11870("unexpected");
                return null;
            }
            C5317 c53172 = AbstractC6021.f15103;
            if (objM10788 == c53172) {
                if (andIncrement < c60222.m10807()) {
                    c6033.m10916();
                }
                c6022 = c60222;
                c60333 = c6033;
            } else {
                if (objM10788 != AbstractC6021.f15099) {
                    c6033.m10916();
                    return objM10788;
                }
                C6276 c6276M11051 = AbstractC6231.m11051(AbstractC3400.m5624(interfaceC5189));
                try {
                    Object objM107882 = c60222.m10788(c6033, i, andIncrement, c6276M11051);
                    if (objM107882 == c5317) {
                        c6276M11051.mo10822(c6033, i);
                    } else {
                        if (objM107882 == c53172) {
                            if (andIncrement < c60222.m10807()) {
                                c6033.m10916();
                            }
                            C6033 c60334 = (C6033) atomicReferenceFieldUpdater.get(c60222);
                            while (true) {
                                if (c60222.m10793()) {
                                    c6276M11051.resumeWith(Result.m9304constructorimpl(new Result.Failure(c60222.m10812())));
                                    break;
                                }
                                C6276 c6276 = c6276M11051;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c60222);
                                    long j3 = AbstractC6021.f15096;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (c60334.f15289 != j4) {
                                        try {
                                            C6033 c6033M108102 = c60222.m10810(j4, c60334);
                                            if (c6033M108102 == null) {
                                                c6276M11051 = c6276;
                                            } else {
                                                c60332 = c6033M108102;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c6276M11051 = c6276;
                                            c6276M11051.m11092();
                                            throw th;
                                        }
                                    } else {
                                        c60332 = c60334;
                                    }
                                    C6022 c60223 = c60222;
                                    objM107882 = c60223.m10788(c60332, i2, andIncrement2, c6276);
                                    c60222 = c60223;
                                    C6033 c60335 = c60332;
                                    c6276M11051 = c6276;
                                    if (objM107882 == AbstractC6021.f15100) {
                                        c6276M11051.mo10822(c60335, i2);
                                        break;
                                    }
                                    if (objM107882 == AbstractC6021.f15103) {
                                        if (andIncrement2 < c60222.m10807()) {
                                            c60335.m10916();
                                        }
                                        c60334 = c60335;
                                    } else {
                                        if (objM107882 == AbstractC6021.f15099) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c60335.m10916();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c6276M11051 = c6276;
                                    th = th;
                                    c6276M11051.m11092();
                                    throw th;
                                }
                            }
                        } else {
                            c6033.m10916();
                        }
                        c6276M11051.mo10993(objM107882, null);
                    }
                    Object objM11099 = c6276M11051.m11099();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM11099;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thM10812 = c6022.m10812();
        int i3 = AbstractC6190.f15285;
        throw thM10812;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m10782(C6022 c6022, C6033 c6033, int i, Object obj, long j, Object obj2, boolean z) {
        c6033.m10825(i, obj);
        if (z) {
            return c6022.m10787(c6033, i, obj, j, obj2, z);
        }
        Object objM10827 = c6033.m10827(i);
        if (objM10827 == null) {
            if (c6022.m10804(j)) {
                if (c6033.m10829(null, i, AbstractC6021.f15094)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c6033.m10829(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objM10827 instanceof InterfaceC6244) {
            c6033.m10825(i, null);
            if (c6022.m10786(objM10827, obj)) {
                c6033.m10824(i, AbstractC6021.f15109);
                return 0;
            }
            C5317 c5317 = AbstractC6021.f15107;
            if (c6033.f15133.getAndSet((i * 2) + 1, c5317) == c5317) {
                return 5;
            }
            c6033.m10828(i, true);
            return 5;
        }
        return c6022.m10787(c6033, i, obj, j, obj2, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10783(C6022 c6022, Object obj, C6276 c6276) {
        c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(c6022.m10805())));
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    public final InterfaceC6044 iterator() {
        return new C6023(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        r15 = r8;
        r3 = (kotlinx.coroutines.channels.C6033) r3.m10914();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d1, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f15123.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f15125 + ',');
        sb.append("data=[");
        f15122.getClass();
        Unsafe unsafe = AbstractC9322.f23936;
        int i3 = 0;
        f15121.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, f15111);
        int i4 = 1;
        f15119.getClass();
        List listM12490 = AbstractC7176.m12490(unsafe.getObjectVolatile(this, f15112), objectVolatile, unsafe.getObjectVolatile(this, f15114));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM12490) {
            if (((C6033) obj) != AbstractC6021.f15097) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            C3466.m5896();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C6033) next).f15289;
            do {
                Object next2 = it.next();
                long j2 = ((C6033) next2).f15289;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C6033 c6033 = (C6033) next;
        long j3 = f15124.get(this);
        long jM10807 = m10807();
        loop2: while (true) {
            int i5 = AbstractC6021.f15096;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (c6033.f15289 * ((long) AbstractC6021.f15096)) + ((long) i6);
                if (j4 >= jM10807 && j4 >= j3) {
                    break loop2;
                }
                Object objM10827 = c6033.m10827(i6);
                Object obj2 = c6033.f15133.get(i6 * 2);
                if (objM10827 instanceof InterfaceC6279) {
                    string = (jM10807 > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jM10807) ? "cont" : "send" : "receive";
                } else if (objM10827 instanceof InterfaceC6200) {
                    string = (jM10807 > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jM10807) ? "select" : "onSend" : "onReceive";
                } else if (objM10827 instanceof C6027) {
                    string = "receiveCatching";
                } else if (objM10827 instanceof C6030) {
                    string = "EB(" + objM10827 + ')';
                } else if (AbstractC5227.m9466(objM10827, AbstractC6021.f15092) || AbstractC5227.m9466(objM10827, AbstractC6021.f15106)) {
                    string = "resuming_sender";
                } else if (objM10827 == null || objM10827.equals(AbstractC6021.f15093) || objM10827.equals(AbstractC6021.f15109) || objM10827.equals(AbstractC6021.f15105) || objM10827.equals(AbstractC6021.f15107) || objM10827.equals(AbstractC6021.f15110) || objM10827.equals(AbstractC6021.f15108)) {
                    i6++;
                    i4 = i;
                } else {
                    string = objM10827.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i6++;
                i4 = i;
            }
            i4 = i;
            i3 = 0;
        }
        if (AbstractC5976.m10727(sb) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m10784(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C6022 c6022 = this;
        if (c6022.m10798()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f15118;
            if (atomicLongFieldUpdater.get(c6022) > j) {
                break;
            } else {
                c6022 = this;
            }
        }
        int i = AbstractC6021.f15095;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15117;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c6022);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c6022)) && j2 == atomicLongFieldUpdater.get(c6022)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c6022);
                    if (atomicLongFieldUpdater2.compareAndSet(c6022, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c6022 = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c6022);
                    long j5 = atomicLongFieldUpdater2.get(c6022);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c6022)) {
                        break;
                    }
                    if (z) {
                        c6022 = this;
                    } else {
                        c6022 = this;
                        atomicLongFieldUpdater2.compareAndSet(c6022, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c6022);
                    if (atomicLongFieldUpdater2.compareAndSet(c6022, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c6022 = this;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean m10785(Object obj, C6033 c6033, int i) {
        TrySelectDetailedResult trySelectDetailedResult;
        boolean z = obj instanceof InterfaceC6279;
        C6008 c6008 = C6008.f15084;
        if (z) {
            return AbstractC6021.m10777((InterfaceC6279) obj, c6008, null);
        }
        if (!(obj instanceof InterfaceC6200)) {
            C5043.m9151(obj, "Unexpected waiter: ");
            return false;
        }
        int iM10975 = ((C6201) obj).m10975(this, c6008);
        if (iM10975 == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.SUCCESSFUL;
        } else if (iM10975 == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.REREGISTER;
        } else if (iM10975 == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.CANCELLED;
        } else {
            if (iM10975 != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iM10975).toString());
            }
            trySelectDetailedResult = TrySelectDetailedResult.ALREADY_SELECTED;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.REREGISTER) {
            c6033.m10825(i, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.SUCCESSFUL;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean m10786(Object obj, Object obj2) {
        if (obj instanceof InterfaceC6200) {
            return ((InterfaceC6200) obj).mo10971(this, obj2);
        }
        if (obj instanceof C6027) {
            return AbstractC6021.m10777(((C6027) obj).f15130, new C6034(obj2), null);
        }
        if (!(obj instanceof C6023)) {
            if (obj instanceof InterfaceC6279) {
                return AbstractC6021.m10777((InterfaceC6279) obj, obj2, null);
            }
            C5043.m9151(obj, "Unexpected receiver type: ");
            return false;
        }
        C6023 c6023 = (C6023) obj;
        C6276 c6276 = c6023.f15126;
        c6276.getClass();
        c6023.f15126 = null;
        c6023.f15128 = obj2;
        Boolean bool = Boolean.TRUE;
        c6023.f15127.getClass();
        return AbstractC6021.m10777(c6276, bool, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final int m10787(C6033 c6033, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM10827 = c6033.m10827(i);
            if (objM10827 == null) {
                if (!m10804(j) || z) {
                    if (z) {
                        if (c6033.m10829(null, i, AbstractC6021.f15110)) {
                            c6033.m10946();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c6033.m10829(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (c6033.m10829(null, i, AbstractC6021.f15094)) {
                    break;
                }
            } else {
                if (objM10827 != AbstractC6021.f15093) {
                    C5317 c5317 = AbstractC6021.f15107;
                    if (objM10827 == c5317) {
                        c6033.m10825(i, null);
                        return 5;
                    }
                    if (objM10827 == AbstractC6021.f15105) {
                        c6033.m10825(i, null);
                        return 5;
                    }
                    if (objM10827 == AbstractC6021.f15108) {
                        c6033.m10825(i, null);
                        m10800();
                        return 4;
                    }
                    c6033.m10825(i, null);
                    if (objM10827 instanceof C6030) {
                        objM10827 = ((C6030) objM10827).f15132;
                    }
                    if (m10786(objM10827, obj)) {
                        c6033.m10824(i, AbstractC6021.f15109);
                        return 0;
                    }
                    if (c6033.f15133.getAndSet((i * 2) + 1, c5317) != c5317) {
                        c6033.m10828(i, true);
                    }
                    return 5;
                }
                if (c6033.m10829(objM10827, i, AbstractC6021.f15094)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Object m10788(C6033 c6033, int i, long j, Object obj) {
        Object objM10827 = c6033.m10827(i);
        AtomicReferenceArray atomicReferenceArray = c6033.f15133;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15123;
        if (objM10827 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC6021.f15099;
                }
                if (c6033.m10829(objM10827, i, obj)) {
                    m10817();
                    return AbstractC6021.f15100;
                }
            }
        } else if (objM10827 == AbstractC6021.f15094 && c6033.m10829(objM10827, i, AbstractC6021.f15109)) {
            m10817();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c6033.m10825(i, null);
            return obj2;
        }
        while (true) {
            Object objM108272 = c6033.m10827(i);
            if (objM108272 == null || objM108272 == AbstractC6021.f15093) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c6033.m10829(objM108272, i, AbstractC6021.f15105)) {
                        m10817();
                        return AbstractC6021.f15103;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC6021.f15099;
                    }
                    if (c6033.m10829(objM108272, i, obj)) {
                        m10817();
                        return AbstractC6021.f15100;
                    }
                }
            } else if (objM108272 != AbstractC6021.f15094) {
                C5317 c5317 = AbstractC6021.f15110;
                if (objM108272 == c5317) {
                    return AbstractC6021.f15103;
                }
                if (objM108272 == AbstractC6021.f15105) {
                    return AbstractC6021.f15103;
                }
                if (objM108272 == AbstractC6021.f15108) {
                    m10817();
                    return AbstractC6021.f15103;
                }
                if (objM108272 != AbstractC6021.f15106 && c6033.m10829(objM108272, i, AbstractC6021.f15092)) {
                    boolean z = objM108272 instanceof C6030;
                    if (z) {
                        objM108272 = ((C6030) objM108272).f15132;
                    }
                    if (m10785(objM108272, c6033, i)) {
                        c6033.m10824(i, AbstractC6021.f15109);
                        m10817();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c6033.m10825(i, null);
                        return obj3;
                    }
                    c6033.m10824(i, c5317);
                    c6033.m10946();
                    if (z) {
                        m10817();
                    }
                    return AbstractC6021.f15103;
                }
            } else if (c6033.m10829(objM108272, i, AbstractC6021.f15109)) {
                m10817();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c6033.m10825(i, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m10789(InterfaceC6244 interfaceC6244, boolean z) {
        if (interfaceC6244 instanceof InterfaceC6279) {
            ((InterfaceC5189) interfaceC6244).resumeWith(Result.m9304constructorimpl(new Result.Failure(z ? m10812() : m10805())));
            return;
        }
        if (interfaceC6244 instanceof C6027) {
            ((C6027) interfaceC6244).f15130.resumeWith(Result.m9304constructorimpl(new C6034(new C6041(m10811()))));
            return;
        }
        if (!(interfaceC6244 instanceof C6023)) {
            if (interfaceC6244 instanceof InterfaceC6200) {
                ((InterfaceC6200) interfaceC6244).mo10971(this, AbstractC6021.f15108);
                return;
            } else {
                C5043.m9151(interfaceC6244, "Unexpected waiter: ");
                return;
            }
        }
        C6023 c6023 = (C6023) interfaceC6244;
        C6276 c6276 = c6023.f15126;
        c6276.getClass();
        c6023.f15126 = null;
        c6023.f15128 = AbstractC6021.f15108;
        Throwable thM10811 = c6023.f15127.m10811();
        if (thM10811 == null) {
            c6276.resumeWith(Result.m9304constructorimpl(Boolean.FALSE));
        } else {
            c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(thM10811)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10790(C6033 c6033, int i, long j, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        C6034 c6034;
        C6033 c60332;
        if (continuationImpl instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuationImpl;
            int i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i2 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
            }
        }
        Object objM11099 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i3 == 0) {
            AbstractC6017.m10769(objM11099);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = c6033;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$1 = 0;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            C6276 c6276M11051 = AbstractC6231.m11051(AbstractC3400.m5624(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                C6027 c6027 = new C6027(c6276M11051);
                Object objM10788 = m10788(c6033, i, j, c6027);
                if (objM10788 == AbstractC6021.f15100) {
                    c6027.mo10822(c6033, i);
                } else {
                    if (objM10788 == AbstractC6021.f15103) {
                        if (j < m10807()) {
                            c6033.m10916();
                        }
                        C6033 c60333 = (C6033) f15122.get(this);
                        while (true) {
                            if (m10793()) {
                                c6276M11051.resumeWith(Result.m9304constructorimpl(new C6034(new C6041(m10811()))));
                                break;
                            }
                            long andIncrement = f15124.getAndIncrement(this);
                            long j2 = AbstractC6021.f15096;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (c60333.f15289 != j3) {
                                C6033 c6033M10810 = m10810(j3, c60333);
                                if (c6033M10810 != null) {
                                    c60332 = c6033M10810;
                                }
                            } else {
                                c60332 = c60333;
                            }
                            Object objM107882 = m10788(c60332, i4, andIncrement, c6027);
                            C6033 c60334 = c60332;
                            if (objM107882 == AbstractC6021.f15100) {
                                c6027.mo10822(c60334, i4);
                                break;
                            }
                            if (objM107882 == AbstractC6021.f15103) {
                                if (andIncrement < m10807()) {
                                    c60334.m10916();
                                }
                                c60333 = c60334;
                            } else {
                                if (objM107882 == AbstractC6021.f15099) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c60334.m10916();
                                c6034 = new C6034(objM107882);
                            }
                        }
                    } else {
                        c6033.m10916();
                        c6034 = new C6034(objM10788);
                    }
                    c6276M11051.mo10993(c6034, null);
                }
                objM11099 = c6276M11051.m11099();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM11099 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                c6276M11051.m11092();
                throw th;
            }
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(objM11099);
        }
        return ((C6034) objM11099).f15136;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public void mo10791(InterfaceC6200 interfaceC6200, Object obj) {
        C6033 c6033;
        f15121.getClass();
        C6033 c60332 = (C6033) AbstractC9322.f23936.getObjectVolatile(this, f15111);
        while (true) {
            long andIncrement = f15123.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM10794 = this.m10794(andIncrement, false);
            int i = AbstractC6021.f15096;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c60332.f15289 != j3) {
                C6033 c6033M10813 = this.m10813(j3, c60332);
                if (c6033M10813 != null) {
                    c6033 = c6033M10813;
                } else if (zM10794) {
                    interfaceC6200.mo10970(AbstractC6021.f15108);
                    return;
                }
            } else {
                c6033 = c60332;
            }
            C6022 c6022 = this;
            InterfaceC6200 interfaceC62002 = interfaceC6200;
            Object obj2 = obj;
            int iM10782 = m10782(c6022, c6033, i2, obj2, j, interfaceC62002, zM10794);
            c60332 = c6033;
            C6008 c6008 = C6008.f15084;
            if (iM10782 == 0) {
                c60332.m10916();
                interfaceC62002.mo10970(c6008);
                return;
            }
            if (iM10782 == 1) {
                interfaceC62002.mo10970(c6008);
                return;
            }
            if (iM10782 == 2) {
                if (zM10794) {
                    c60332.m10946();
                    interfaceC62002.mo10970(AbstractC6021.f15108);
                    return;
                } else {
                    InterfaceC6244 interfaceC6244 = interfaceC62002 instanceof InterfaceC6244 ? (InterfaceC6244) interfaceC62002 : null;
                    if (interfaceC6244 != null) {
                        interfaceC6244.mo10822(c60332, i2 + i);
                        return;
                    }
                    return;
                }
            }
            if (iM10782 == 3) {
                C6755.m11870("unexpected");
                return;
            }
            if (iM10782 == 4) {
                if (j < f15124.get(c6022)) {
                    c60332.m10916();
                }
                interfaceC62002.mo10970(AbstractC6021.f15108);
                return;
            } else {
                if (iM10782 == 5) {
                    c60332.m10916();
                }
                this = c6022;
                obj = obj2;
                interfaceC6200 = interfaceC62002;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m10792(InterfaceC6200 interfaceC6200) {
        C6033 c6033;
        C6022 c6022;
        InterfaceC6200 interfaceC62002;
        int i;
        f15122.getClass();
        C6033 c60332 = (C6033) AbstractC9322.f23936.getObjectVolatile(this, f15112);
        while (!this.m10793()) {
            long andIncrement = f15124.getAndIncrement(this);
            long j = AbstractC6021.f15096;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c60332.f15289 != j2) {
                C6033 c6033M10810 = this.m10810(j2, c60332);
                if (c6033M10810 == null) {
                    continue;
                } else {
                    c6033 = c6033M10810;
                    interfaceC62002 = interfaceC6200;
                    i = i2;
                    c6022 = this;
                }
            } else {
                c6033 = c60332;
                c6022 = this;
                interfaceC62002 = interfaceC6200;
                i = i2;
            }
            Object objM10788 = c6022.m10788(c6033, i, andIncrement, interfaceC62002);
            c60332 = c6033;
            if (objM10788 == AbstractC6021.f15100) {
                InterfaceC6244 interfaceC6244 = interfaceC62002 instanceof InterfaceC6244 ? (InterfaceC6244) interfaceC62002 : null;
                if (interfaceC6244 != null) {
                    interfaceC6244.mo10822(c60332, i);
                    return;
                }
                return;
            }
            if (objM10788 != AbstractC6021.f15103) {
                if (objM10788 == AbstractC6021.f15099) {
                    C6755.m11870("unexpected");
                    return;
                } else {
                    c60332.m10916();
                    interfaceC62002.mo10970(objM10788);
                    return;
                }
            }
            if (andIncrement < c6022.m10807()) {
                c60332.m10916();
            }
            this = c6022;
            interfaceC6200 = interfaceC62002;
        }
        interfaceC6200.mo10970(AbstractC6021.f15108);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m10793() {
        return m10794(f15123.get(this), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        r10 = (kotlinx.coroutines.channels.C6033) r10.m10912();
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10794(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                m10816(j & 1152921504606846975L);
                if (!z || !m10808()) {
                }
            } else {
                if (i != 3) {
                    C6755.m11871(AbstractC7012.m12147(i, "unexpected close status: "));
                    return false;
                }
                C6033 c6033M10816 = m10816(j & 1152921504606846975L);
                Object objM10921 = null;
                loop0: do {
                    int i2 = AbstractC6021.f15096 - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (c6033M10816.f15289 * ((long) AbstractC6021.f15096)) + ((long) i2);
                        while (true) {
                            Object objM10827 = c6033M10816.m10827(i2);
                            if (objM10827 == AbstractC6021.f15109) {
                                break loop0;
                            }
                            C5317 c5317 = AbstractC6021.f15094;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f15124;
                            if (objM10827 != c5317) {
                                if (objM10827 != AbstractC6021.f15093 && objM10827 != null) {
                                    if (!(objM10827 instanceof InterfaceC6244) && !(objM10827 instanceof C6030)) {
                                        C5317 c53172 = AbstractC6021.f15106;
                                        if (objM10827 == c53172 || objM10827 == AbstractC6021.f15092) {
                                            break loop0;
                                        }
                                        if (objM10827 != c53172) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        InterfaceC6244 interfaceC6244 = objM10827 instanceof C6030 ? ((C6030) objM10827).f15132 : (InterfaceC6244) objM10827;
                                        if (c6033M10816.m10829(objM10827, i2, AbstractC6021.f15108)) {
                                            objM10921 = AbstractC6185.m10921(objM10921, interfaceC6244);
                                            c6033M10816.m10825(i2, null);
                                            c6033M10816.m10946();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c6033M10816.m10829(objM10827, i2, AbstractC6021.f15108)) {
                                        c6033M10816.m10946();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c6033M10816.m10829(objM10827, i2, AbstractC6021.f15108)) {
                                    c6033M10816.m10825(i2, null);
                                    c6033M10816.m10946();
                                    break;
                                }
                            }
                        }
                        i2--;
                    }
                } while (c6033M10816 != null);
                if (objM10921 != null) {
                    if (objM10921 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM10921;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m10789((InterfaceC6244) arrayList.get(size), false);
                        }
                    } else {
                        m10789((InterfaceC6244) objM10921, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo8991(InterfaceC7387 interfaceC7387) {
        Unsafe unsafe;
        while (true) {
            f15116.getClass();
            Unsafe unsafe2 = AbstractC9322.f23936;
            C6022 c6022 = this;
            if (unsafe2.compareAndSwapObject(c6022, f15113, (Object) null, interfaceC7387)) {
                return;
            }
            long j = f15113;
            if (unsafe2.getObjectVolatile(c6022, j) != null) {
                while (true) {
                    Object objectVolatile = AbstractC9322.f23936.getObjectVolatile(c6022, j);
                    C5317 c5317 = AbstractC6021.f15101;
                    if (objectVolatile != c5317) {
                        if (objectVolatile == AbstractC6021.f15102) {
                            C6755.m11870("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            C5043.m9151(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    C5317 c53172 = AbstractC6021.f15102;
                    do {
                        C6022 c60222 = c6022;
                        unsafe = AbstractC9322.f23936;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c60222, f15113, c5317, c53172);
                        c6022 = c60222;
                        if (zCompareAndSwapObject) {
                            interfaceC7387.invoke(c6022.m10811());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(c6022, j) == c5317);
                }
            } else {
                this = c6022;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m10795() {
        Object objectVolatile;
        C6022 c6022;
        loop0: while (true) {
            f15116.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15113;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            C5317 c5317 = objectVolatile == null ? AbstractC6021.f15101 : AbstractC6021.f15102;
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c6022 = this;
                if (unsafe2.compareAndSwapObject(c6022, f15113, objectVolatile, c5317)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(c6022, j) != objectVolatile) {
                    break;
                } else {
                    this = c6022;
                }
            }
            this = c6022;
        }
        if (objectVolatile == null) {
            return;
        }
        AbstractC5220.m9447(1, objectVolatile);
        ((InterfaceC7387) objectVolatile).invoke(c6022.m10811());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public Object mo8992(Object obj, InterfaceC5189 interfaceC5189) {
        return m10778(this, obj, interfaceC5189);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Object m10796(Object obj, InterfaceC5189 interfaceC5189) {
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        c6276.resumeWith(Result.m9304constructorimpl(new Result.Failure(m10805())));
        Object objM11099 = c6276.m11099();
        return objM11099 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11099 : C6008.f15084;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r5.m10948() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r5.m10919();
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10797(long j, C6033 c6033) {
        C6022 c6022;
        C6033 c60332;
        C6033 c60333;
        while (c6033.f15289 < j && (c60333 = (C6033) c6033.m10914()) != null) {
            c6033 = c60333;
        }
        while (true) {
            C6033 c60334 = c6033;
            while (c60334.mo10918() && (c60332 = (C6033) c60334.m10914()) != null) {
                c60334 = c60332;
            }
            while (true) {
                f15119.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j2 = f15114;
                AbstractC6193 abstractC6193 = (AbstractC6193) unsafe.getObjectVolatile(this, j2);
                if (abstractC6193.f15289 >= c60334.f15289) {
                    return;
                }
                if (!c60334.m10947()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    c6022 = this;
                    if (unsafe2.compareAndSwapObject(c6022, f15114, abstractC6193, c60334)) {
                        if (abstractC6193.m10948()) {
                            abstractC6193.m10919();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(c6022, j2) != abstractC6193) {
                        break;
                    } else {
                        this = c6022;
                    }
                }
                this = c6022;
            }
            c6033 = c60334;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean m10798() {
        long j = f15118.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean mo10799() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean m10800() {
        return m10794(f15123.get(this), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m10801(Throwable th, boolean z) {
        C6022 c6022;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15123;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                C6033 c6033 = AbstractC6021.f15097;
                c6022 = this;
                if (atomicLongFieldUpdater.compareAndSet(c6022, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = c6022;
            }
        } else {
            c6022 = this;
        }
        C5317 c5317 = AbstractC6021.f15098;
        while (true) {
            f15120.getClass();
            C6022 c60222 = c6022;
            Unsafe unsafe = AbstractC9322.f23936;
            long j5 = f15115;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c60222, j5, c5317, th2);
            c6022 = c60222;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(c6022, j5) != c5317) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(c6022);
            } while (!atomicLongFieldUpdater.compareAndSet(c6022, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(c6022);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c6022, j, j2));
        }
        c6022.m10800();
        if (z2) {
            c6022.m10795();
        }
        return z2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6033 m10802() {
        f15119.getClass();
        Unsafe unsafe = AbstractC9322.f23936;
        Object objectVolatile = unsafe.getObjectVolatile(this, f15114);
        f15121.getClass();
        C6033 c6033 = (C6033) unsafe.getObjectVolatile(this, f15111);
        if (c6033.f15289 > ((C6033) objectVolatile).f15289) {
            objectVolatile = c6033;
        }
        f15122.getClass();
        C6033 c60332 = (C6033) unsafe.getObjectVolatile(this, f15112);
        if (c60332.f15289 > ((C6033) objectVolatile).f15289) {
            objectVolatile = c60332;
        }
        AbstractC6184 abstractC6184 = (AbstractC6184) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC6184.f15270;
            Object objM10913 = abstractC6184.m10913();
            if (objM10913 == AbstractC6185.f15276) {
                break;
            }
            AbstractC6184 abstractC61842 = (AbstractC6184) objM10913;
            if (abstractC61842 != null) {
                abstractC6184 = abstractC61842;
            } else if (abstractC6184.m10917()) {
                break;
            }
        }
        return (C6033) abstractC6184;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo10803(ContinuationImpl continuationImpl) {
        return m10781(this, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10804(long j) {
        return j < f15118.get(this) || j < f15124.get(this) + ((long) this.f15125);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Throwable m10805() {
        Throwable thM10811 = m10811();
        return thM10811 == null ? new ClosedSendChannelException("Channel was closed") : thM10811;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo8994(Throwable th) {
        return m10801(th, false);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Object mo10806(ContinuationImpl continuationImpl) {
        return m10779(this, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[SYNTHETIC] */
    @Override // kotlinx.coroutines.channels.InterfaceC6032
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8995(Object obj) {
        int iM10782;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15123;
        boolean z = false;
        long j = 1152921504606846975L;
        boolean z2 = m10794(atomicLongFieldUpdater.get(this), false) ? false : !m10804(r1 & 1152921504606846975L);
        C6042 c6042 = C6034.f15135;
        if (z2) {
            return c6042;
        }
        InterfaceC8536 interfaceC8536 = AbstractC6021.f15110;
        f15121.getClass();
        C6033 c6033 = (C6033) AbstractC9322.f23936.getObjectVolatile(this, f15111);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean zM10794 = m10794(andIncrement, z);
            int i = AbstractC6021.f15096;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (c6033.f15289 == j4) {
                iM10782 = m10782(this, c6033, i2, obj, j2, interfaceC8536, zM10794);
                C6008 c6008 = C6008.f15084;
                if (iM10782 != 0) {
                    c6033.m10916();
                    return c6008;
                }
                if (iM10782 == 1) {
                    return c6008;
                }
                if (iM10782 == 2) {
                    if (zM10794) {
                        c6033.m10946();
                        return new C6041(m10805());
                    }
                    InterfaceC6244 interfaceC6244 = interfaceC8536 instanceof InterfaceC6244 ? (InterfaceC6244) interfaceC8536 : null;
                    if (interfaceC6244 != null) {
                        interfaceC6244.mo10822(c6033, i2 + i);
                    }
                    c6033.m10946();
                    return c6042;
                }
                if (iM10782 == 3) {
                    C6755.m11870("unexpected");
                    return null;
                }
                if (iM10782 == 4) {
                    if (j2 < f15124.get(this)) {
                        c6033.m10916();
                    }
                    return new C6041(m10805());
                }
                if (iM10782 == 5) {
                    c6033.m10916();
                }
                z = false;
            } else {
                C6033 c6033M10813 = m10813(j4, c6033);
                if (c6033M10813 != null) {
                    c6033 = c6033M10813;
                    iM10782 = m10782(this, c6033, i2, obj, j2, interfaceC8536, zM10794);
                    C6008 c60082 = C6008.f15084;
                    if (iM10782 != 0) {
                    }
                } else {
                    if (zM10794) {
                        return new C6041(m10805());
                    }
                    z = false;
                }
            }
            j = 1152921504606846975L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long m10807() {
        return f15123.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m10808() {
        while (true) {
            f15122.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15112;
            C6033 c6033M10810 = (C6033) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15124;
            long j2 = atomicLongFieldUpdater.get(this);
            if (m10807() <= j2) {
                return false;
            }
            long j3 = AbstractC6021.f15096;
            long j4 = j2 / j3;
            if (c6033M10810.f15289 == j4 || (c6033M10810 = m10810(j4, c6033M10810)) != null) {
                c6033M10810.m10916();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objM10827 = c6033M10810.m10827(i);
                    if (objM10827 == null || objM10827 == AbstractC6021.f15093) {
                        if (c6033M10810.m10829(objM10827, i, AbstractC6021.f15105)) {
                            m10817();
                            break;
                        }
                    } else {
                        if (objM10827 == AbstractC6021.f15094) {
                            return true;
                        }
                        if (objM10827 != AbstractC6021.f15110 && objM10827 != AbstractC6021.f15108 && objM10827 != AbstractC6021.f15109 && objM10827 != AbstractC6021.f15105) {
                            if (objM10827 == AbstractC6021.f15106) {
                                return true;
                            }
                            if (objM10827 != AbstractC6021.f15092 && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                f15124.compareAndSet(this, j2, j2 + 1);
            } else if (((C6033) unsafe.getObjectVolatile(this, j)).f15289 < j4) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1171 mo10809() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        bufferedChannel$onReceiveCatching$1.getClass();
        AbstractC5220.m9447(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        bufferedChannel$onReceiveCatching$2.getClass();
        AbstractC5220.m9447(3, bufferedChannel$onReceiveCatching$2);
        return new C1171(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, (Object) null, 15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r8.m10948() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r8.m10919();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6033 m10810(long j, C6033 c6033) {
        Object objM10925;
        C6033 c60332;
        long j2;
        Unsafe unsafe;
        C6033 c60333 = AbstractC6021.f15097;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM10925 = AbstractC6185.m10925(c6033, j, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC6185.m10922(objM10925)) {
                AbstractC6193 abstractC6193M10924 = AbstractC6185.m10924(objM10925);
                while (true) {
                    f15122.getClass();
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    long j3 = f15112;
                    AbstractC6193 abstractC6193 = (AbstractC6193) unsafe2.getObjectVolatile(this, j3);
                    if (abstractC6193.f15289 >= abstractC6193M10924.f15289) {
                        break loop0;
                    }
                    if (!abstractC6193M10924.m10947()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC9322.f23936;
                        if (unsafe.compareAndSwapObject(this, f15112, abstractC6193, abstractC6193M10924)) {
                            if (abstractC6193.m10948()) {
                                abstractC6193.m10919();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == abstractC6193);
                    if (abstractC6193M10924.m10948()) {
                        abstractC6193M10924.m10919();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC6185.m10922(objM10925)) {
            m10800();
            if (c6033.f15289 * ((long) AbstractC6021.f15096) < m10807()) {
                c6033.m10916();
                return null;
            }
        } else {
            C6033 c60334 = (C6033) AbstractC6185.m10924(objM10925);
            long j4 = c60334.f15289;
            if (m10798() || j > f15118.get(this) / ((long) AbstractC6021.f15096)) {
                c60332 = c60334;
                if (j4 > j) {
                    return c60332;
                }
                long j5 = j4 * ((long) AbstractC6021.f15096);
                do {
                    j2 = f15124.get(this);
                    if (j2 >= j5) {
                        break;
                    }
                } while (!f15124.compareAndSet(this, j2, j5));
                if (j4 * ((long) AbstractC6021.f15096) < m10807()) {
                    c60332.m10916();
                }
            } else {
                while (true) {
                    f15119.getClass();
                    Unsafe unsafe3 = AbstractC9322.f23936;
                    long j6 = f15114;
                    AbstractC6193 abstractC61932 = (AbstractC6193) unsafe3.getObjectVolatile(this, j6);
                    if (abstractC61932.f15289 >= j4 || !c60334.m10947()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = AbstractC9322.f23936;
                        c60332 = c60334;
                        if (unsafe4.compareAndSwapObject(this, f15114, abstractC61932, c60334)) {
                            if (abstractC61932.m10948()) {
                                abstractC61932.m10919();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j6) != abstractC61932) {
                                break;
                            }
                            c60334 = c60332;
                        }
                    }
                    c60334 = c60332;
                }
                if (j4 > j) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Throwable m10811() {
        f15120.getClass();
        return (Throwable) AbstractC9322.f23936.getObjectVolatile(this, f15115);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Throwable m10812() {
        Throwable thM10811 = m10811();
        return thM10811 == null ? new ClosedReceiveChannelException("Channel was closed") : thM10811;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C6033 m10813(long j, C6033 c6033) {
        Object objM10925;
        long j2;
        long j3;
        Unsafe unsafe;
        C6033 c60332 = AbstractC6021.f15097;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM10925 = AbstractC6185.m10925(c6033, j, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC6185.m10922(objM10925)) {
                AbstractC6193 abstractC6193M10924 = AbstractC6185.m10924(objM10925);
                while (true) {
                    f15121.getClass();
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    long j4 = f15111;
                    AbstractC6193 abstractC6193 = (AbstractC6193) unsafe2.getObjectVolatile(this, j4);
                    if (abstractC6193.f15289 >= abstractC6193M10924.f15289) {
                        break loop0;
                    }
                    if (!abstractC6193M10924.m10947()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC9322.f23936;
                        if (unsafe.compareAndSwapObject(this, f15111, abstractC6193, abstractC6193M10924)) {
                            if (abstractC6193.m10948()) {
                                abstractC6193.m10919();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == abstractC6193);
                    if (abstractC6193M10924.m10948()) {
                        abstractC6193M10924.m10919();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM10922 = AbstractC6185.m10922(objM10925);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15124;
        if (zM10922) {
            m10800();
            if (c6033.f15289 * ((long) AbstractC6021.f15096) < atomicLongFieldUpdater.get(this)) {
                c6033.m10916();
                return null;
            }
        } else {
            C6033 c60333 = (C6033) AbstractC6185.m10924(objM10925);
            long j5 = c60333.f15289;
            if (j5 <= j) {
                return c60333;
            }
            long j6 = j5 * ((long) AbstractC6021.f15096);
            do {
                j2 = f15123.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!f15123.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) AbstractC6021.f15096) < atomicLongFieldUpdater.get(this)) {
                c60333.m10916();
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object mo10814() {
        C6033 c6033;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15124;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f15123.get(this);
        if (m10794(j2, true)) {
            return new C6041(m10811());
        }
        long j3 = j2 & 1152921504606846975L;
        C6042 c6042 = C6034.f15135;
        if (j >= j3) {
            return c6042;
        }
        Object obj = AbstractC6021.f15107;
        f15122.getClass();
        C6033 c60332 = (C6033) AbstractC9322.f23936.getObjectVolatile(this, f15112);
        while (!this.m10793()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = AbstractC6021.f15096;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (c60332.f15289 != j5) {
                C6033 c6033M10810 = this.m10810(j5, c60332);
                if (c6033M10810 == null) {
                    continue;
                } else {
                    c6033 = c6033M10810;
                }
            } else {
                c6033 = c60332;
            }
            C6022 c6022 = this;
            Object objM10788 = c6022.m10788(c6033, i, andIncrement, obj);
            c60332 = c6033;
            if (objM10788 == AbstractC6021.f15100) {
                InterfaceC6244 interfaceC6244 = obj instanceof InterfaceC6244 ? (InterfaceC6244) obj : null;
                if (interfaceC6244 != null) {
                    interfaceC6244.mo10822(c60332, i);
                }
                c6022.m10784(andIncrement);
                c60332.m10946();
                return c6042;
            }
            if (objM10788 != AbstractC6021.f15103) {
                if (objM10788 != AbstractC6021.f15099) {
                    c60332.m10916();
                    return objM10788;
                }
                C6755.m11870("unexpected");
                return null;
            }
            if (andIncrement < c6022.m10807()) {
                c60332.m10916();
            }
            this = c6022;
        }
        return new C6041(this.m10811());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo10815(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m10801(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = (kotlinx.coroutines.channels.C6033) r1.m10912();
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6033 m10816(long j) {
        long j2;
        C6033 c6033M10802 = m10802();
        if (mo10799()) {
            C6033 c6033 = c6033M10802;
            loop0: do {
                int i = AbstractC6021.f15096 - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (c6033.f15289 * ((long) AbstractC6021.f15096)) + ((long) i);
                    if (j2 < f15124.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object objM10827 = c6033.m10827(i);
                        if (objM10827 != null && objM10827 != AbstractC6021.f15093) {
                            if (objM10827 == AbstractC6021.f15094) {
                                break loop0;
                            }
                        } else {
                            if (c6033.m10829(objM10827, i, AbstractC6021.f15108)) {
                                c6033.m10946();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (c6033 != null);
            j2 = -1;
            if (j2 != -1) {
                m10820(j2);
            }
        }
        Object objM10921 = null;
        loop3: for (C6033 c60332 = c6033M10802; c60332 != null; c60332 = (C6033) c60332.m10912()) {
            for (int i2 = AbstractC6021.f15096 - 1; -1 < i2; i2--) {
                if ((c60332.f15289 * ((long) AbstractC6021.f15096)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objM108272 = c60332.m10827(i2);
                    if (objM108272 != null && objM108272 != AbstractC6021.f15093) {
                        if (!(objM108272 instanceof C6030)) {
                            if (!(objM108272 instanceof InterfaceC6244)) {
                                break;
                            }
                            if (c60332.m10829(objM108272, i2, AbstractC6021.f15108)) {
                                objM10921 = AbstractC6185.m10921(objM10921, objM108272);
                                c60332.m10828(i2, true);
                                break;
                            }
                        } else {
                            if (c60332.m10829(objM108272, i2, AbstractC6021.f15108)) {
                                objM10921 = AbstractC6185.m10921(objM10921, ((C6030) objM108272).f15132);
                                c60332.m10828(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (c60332.m10829(objM108272, i2, AbstractC6021.f15108)) {
                            c60332.m10946();
                            break;
                        }
                    }
                }
            }
        }
        if (objM10921 != null) {
            if (!(objM10921 instanceof ArrayList)) {
                m10789((InterfaceC6244) objM10921, true);
                return c6033M10802;
            }
            ArrayList arrayList = (ArrayList) objM10921;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m10789((InterfaceC6244) arrayList.get(size), true);
            }
        }
        return c6033M10802;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        m10780(r1);
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
    */
    public final void m10817() {
        int i;
        boolean z;
        Object objM10827;
        if (m10798()) {
            return;
        }
        f15119.getClass();
        C6033 c6033 = (C6033) AbstractC9322.f23936.getObjectVolatile(this, f15114);
        loop0: while (true) {
            long andIncrement = f15118.getAndIncrement(this);
            long j = AbstractC6021.f15096;
            long j2 = andIncrement / j;
            if (this.m10807() <= andIncrement) {
                if (c6033.f15289 < j2 && c6033.m10914() != null) {
                    this.m10797(j2, c6033);
                }
                m10780(this);
                return;
            }
            C6022 c6022 = this;
            if (c6033.f15289 == j2) {
                i = (int) (andIncrement % j);
                Object objM108272 = c6033.m10827(i);
                z = objM108272 instanceof InterfaceC6244;
                AtomicLongFieldUpdater atomicLongFieldUpdater = f15124;
                if (z || andIncrement < atomicLongFieldUpdater.get(c6022) || !c6033.m10829(objM108272, i, AbstractC6021.f15106)) {
                    while (true) {
                        objM10827 = c6033.m10827(i);
                        if (objM10827 instanceof InterfaceC6244) {
                            if (objM10827 != AbstractC6021.f15110) {
                                if (objM10827 != null) {
                                    if (objM10827 == AbstractC6021.f15094 || objM10827 == AbstractC6021.f15105 || objM10827 == AbstractC6021.f15109 || objM10827 == AbstractC6021.f15107 || objM10827 == AbstractC6021.f15108) {
                                        break loop0;
                                    } else if (objM10827 != AbstractC6021.f15092) {
                                        C5043.m9151(objM10827, "Unexpected cell state: ");
                                        return;
                                    }
                                } else if (c6033.m10829(objM10827, i, AbstractC6021.f15093)) {
                                    break loop0;
                                }
                            } else {
                                break;
                            }
                        } else if (andIncrement < atomicLongFieldUpdater.get(c6022)) {
                            if (c6033.m10829(objM10827, i, new C6030((InterfaceC6244) objM10827))) {
                                break loop0;
                            }
                        } else if (c6033.m10829(objM10827, i, AbstractC6021.f15106)) {
                            if (c6022.m10785(objM10827, c6033, i)) {
                                c6033.m10824(i, AbstractC6021.f15094);
                                break;
                            } else {
                                c6033.m10824(i, AbstractC6021.f15110);
                                c6033.m10946();
                            }
                        }
                    }
                } else if (c6022.m10785(objM108272, c6033, i)) {
                    c6033.m10824(i, AbstractC6021.f15094);
                    break;
                } else {
                    c6033.m10824(i, AbstractC6021.f15110);
                    c6033.m10946();
                    m10780(c6022);
                }
            } else {
                C6033 c6033M10818 = c6022.m10818(j2, c6033, andIncrement);
                if (c6033M10818 == null) {
                    continue;
                } else {
                    c6033 = c6033M10818;
                    i = (int) (andIncrement % j);
                    Object objM1082722 = c6033.m10827(i);
                    z = objM1082722 instanceof InterfaceC6244;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15124;
                    if (z) {
                        while (true) {
                            objM10827 = c6033.m10827(i);
                            if (objM10827 instanceof InterfaceC6244) {
                            }
                        }
                    }
                }
            }
            this = c6022;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6033 m10818(long j, C6033 c6033, long j2) {
        Object objM10925;
        Unsafe unsafe;
        C6033 c60332 = AbstractC6021.f15097;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM10925 = AbstractC6185.m10925(c6033, j, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC6185.m10922(objM10925)) {
                AbstractC6193 abstractC6193M10924 = AbstractC6185.m10924(objM10925);
                while (true) {
                    f15119.getClass();
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    long j3 = f15114;
                    AbstractC6193 abstractC6193 = (AbstractC6193) unsafe2.getObjectVolatile(this, j3);
                    if (abstractC6193.f15289 >= abstractC6193M10924.f15289) {
                        break loop0;
                    }
                    if (!abstractC6193M10924.m10947()) {
                        break;
                    }
                    do {
                        unsafe = AbstractC9322.f23936;
                        if (unsafe.compareAndSwapObject(this, f15114, abstractC6193, abstractC6193M10924)) {
                            if (abstractC6193.m10948()) {
                                abstractC6193.m10919();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == abstractC6193);
                    if (abstractC6193M10924.m10948()) {
                        abstractC6193M10924.m10919();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC6185.m10922(objM10925)) {
            m10800();
            m10797(j, c6033);
            m10780(this);
            return null;
        }
        C6033 c60333 = (C6033) AbstractC6185.m10924(objM10925);
        long j4 = c60333.f15289;
        if (j4 <= j) {
            return c60333;
        }
        long j5 = j4 * ((long) AbstractC6021.f15096);
        if (!f15118.compareAndSet(this, j2 + 1, j5)) {
            m10780(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15117;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1171 mo10819() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        bufferedChannel$onReceive$1.getClass();
        AbstractC5220.m9447(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        bufferedChannel$onReceive$2.getClass();
        AbstractC5220.m9447(3, bufferedChannel$onReceive$2);
        return new C1171(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, (Object) null, 15);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10820(long j) {
        f15122.getClass();
        C6033 c6033 = (C6033) AbstractC9322.f23936.getObjectVolatile(this, f15112);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15124;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f15125) + j2, f15118.get(this))) {
                return;
            }
            C6022 c6022 = this;
            if (atomicLongFieldUpdater.compareAndSet(c6022, j2, 1 + j2)) {
                long j3 = AbstractC6021.f15096;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c6033.f15289 != j4) {
                    C6033 c6033M10810 = c6022.m10810(j4, c6033);
                    if (c6033M10810 != null) {
                        c6033 = c6033M10810;
                    }
                }
                C6033 c60332 = c6033;
                if (c6022.m10788(c60332, i, j2, null) != AbstractC6021.f15103 || j2 < c6022.m10807()) {
                    c60332.m10916();
                }
                this = c6022;
                c6033 = c60332;
            }
            this = c6022;
        }
    }
}
