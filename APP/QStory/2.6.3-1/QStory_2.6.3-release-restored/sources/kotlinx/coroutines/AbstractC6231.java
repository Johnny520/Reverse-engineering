package kotlinx.coroutines;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.C1594;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.Result;
import kotlin.collections.C5183;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C5188;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5187;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.time.AbstractC5992;
import kotlin.time.C5989;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.C6181;
import kotlinx.coroutines.internal.C6183;
import kotlinx.coroutines.internal.C6192;
import p068.InterfaceC7383;
import p079.InterfaceC7692;
import p111.C8036;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6231 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5317 f15378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5317 f15379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5317 f15380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5317 f15381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5317 f15382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5317 f15383;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5317 f15384;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5317 f15385;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C6225 f15386 = new C6225(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C6225 f15387 = new C6225(true);

    static {
        int i = 1;
        f15383 = new C5317("RESUME_TOKEN", i);
        f15382 = new C5317("REMOVED_TASK", i);
        f15381 = new C5317("CLOSED_EMPTY", i);
        f15380 = new C5317("COMPLETING_ALREADY", i);
        f15379 = new C5317("COMPLETING_WAITING_CHILDREN", i);
        f15378 = new C5317("COMPLETING_RETRY", i);
        f15385 = new C5317("TOO_LATE_TO_CANCEL", i);
        f15384 = new C5317("SEALED", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final Object m11029(InterfaceC5192 interfaceC5192, InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11039;
        InterfaceC5192 context = interfaceC5189.getContext();
        InterfaceC5192 interfaceC5192Plus = !((Boolean) interfaceC5192.fold(Boolean.FALSE, new C1594(17))).booleanValue() ? context.plus(interfaceC5192) : m11062(context, interfaceC5192, false);
        m11061(interfaceC5192Plus);
        if (interfaceC5192Plus == context) {
            C6192 c6192 = new C6192(interfaceC5189, interfaceC5192Plus);
            objM11039 = AbstractC3400.m5629(c6192, true, c6192, interfaceC7383);
        } else {
            C5188 c5188 = C5188.f13281;
            if (AbstractC5227.m9466(interfaceC5192Plus.get(c5188), context.get(c5188))) {
                C6247 c6247 = new C6247(interfaceC5189, interfaceC5192Plus);
                InterfaceC5192 interfaceC51922 = c6247.f15418;
                Object objM10927 = AbstractC6185.m10927(interfaceC51922, null);
                try {
                    Object objM5629 = AbstractC3400.m5629(c6247, true, c6247, interfaceC7383);
                    AbstractC6185.m10930(interfaceC51922, objM10927);
                    objM11039 = objM5629;
                } catch (Throwable th) {
                    AbstractC6185.m10930(interfaceC51922, objM10927);
                    throw th;
                }
            } else {
                C6237 c6237 = new C6237(interfaceC5189, interfaceC5192Plus);
                AbstractC1298.m1705(interfaceC7383, c6237, c6237);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6237.f15392;
                while (true) {
                    int i = atomicIntegerFieldUpdater.get(c6237);
                    if (i != 0) {
                        if (i != 2) {
                            C6755.m11870("Already suspended");
                            return null;
                        }
                        objM11039 = m11039(c6237.m11140());
                        if (objM11039 instanceof C6262) {
                            throw ((C6262) objM11039).f15420;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(c6237, 0, 1)) {
                        objM11039 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11039;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C6247 m11030(InterfaceC5189 interfaceC5189, InterfaceC5192 interfaceC5192, Object obj) {
        C6247 c6247 = null;
        if ((interfaceC5189 instanceof InterfaceC7692) && interfaceC5192.get(C6243.f15396) != null) {
            InterfaceC7692 callerFrame = (InterfaceC7692) interfaceC5189;
            while (true) {
                if ((callerFrame instanceof C6237) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof C6247) {
                    c6247 = (C6247) callerFrame;
                    break;
                }
            }
            if (c6247 != null) {
                c6247.m11075(interfaceC5192, obj);
            }
        }
        return c6247;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m11031(ContinuationImpl continuationImpl) {
        Object obj;
        InterfaceC5192 context = continuationImpl.getContext();
        m11061(context);
        InterfaceC5189 interfaceC5189M5624 = AbstractC3400.m5624(continuationImpl);
        C6181 c6181 = interfaceC5189M5624 instanceof C6181 ? (C6181) interfaceC5189M5624 : null;
        C6008 c6008 = C6008.f15084;
        if (c6181 == null) {
            obj = c6008;
        } else {
            AbstractC6264 abstractC6264 = c6181.f15262;
            if (AbstractC6185.m10934(abstractC6264, context)) {
                c6181.f15263 = c6008;
                c6181.f15376 = 1;
                abstractC6264.mo10903(context, c6181);
            } else {
                C6255 c6255 = new C6255(C6255.f15405);
                InterfaceC5192 interfaceC5192Plus = context.plus(c6255);
                c6181.f15263 = c6008;
                c6181.f15376 = 1;
                abstractC6264.mo10903(interfaceC5192Plus, c6181);
                if (c6255.f15406) {
                    AbstractC6226 abstractC6226M11078 = AbstractC6252.m11078();
                    C5183 c5183 = abstractC6226M11078.f15371;
                    if (!(c5183 != null ? c5183.isEmpty() : true)) {
                        if (abstractC6226M11078.f15372 >= 4294967296L) {
                            c6181.f15263 = c6008;
                            c6181.f15376 = 1;
                            abstractC6226M11078.m11021(c6181);
                            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                        } else {
                            abstractC6226M11078.m11019(true);
                            try {
                                c6181.run();
                                do {
                                } while (abstractC6226M11078.m11022());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = c6008;
                        }
                    }
                }
            }
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : c6008;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.飘花落叶言子哲世楪兰苏] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m11032(long j, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Ref$ObjectRef ref$ObjectRef;
        if (continuationImpl instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuationImpl;
            int i = timeoutKt$withTimeoutOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuationImpl);
            }
        }
        Object obj = timeoutKt$withTimeoutOrNull$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timeoutKt$withTimeoutOrNull$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (j > 0) {
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                try {
                    timeoutKt$withTimeoutOrNull$1.L$0 = interfaceC7383;
                    timeoutKt$withTimeoutOrNull$1.L$1 = ref$ObjectRef2;
                    timeoutKt$withTimeoutOrNull$1.J$0 = j;
                    timeoutKt$withTimeoutOrNull$1.label = 1;
                    ?? runnableC6245 = new RunnableC6245(j, timeoutKt$withTimeoutOrNull$1);
                    ref$ObjectRef2.element = runnableC6245;
                    Object objM11042 = m11042(runnableC6245, interfaceC7383);
                    return objM11042 == coroutineSingletons ? coroutineSingletons : objM11042;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    ref$ObjectRef = ref$ObjectRef2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef = (Ref$ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
        try {
            AbstractC6017.m10769(obj);
            return obj;
        } catch (TimeoutCancellationException e2) {
            e = e2;
        }
        if (e.coroutine != ref$ObjectRef.element) {
            throw e;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final void m11033(C6276 c6276, InterfaceC5189 interfaceC5189, boolean z) {
        Object objM11098 = c6276.m11098();
        Throwable thMo11023 = c6276.mo11023(objM11098);
        Object objM723 = thMo11023 != null ? AbstractC0900.m723(thMo11023) : Result.m9304constructorimpl(c6276.mo11026(objM11098));
        if (!z) {
            interfaceC5189.resumeWith(objM723);
            return;
        }
        interfaceC5189.getClass();
        C6181 c6181 = (C6181) interfaceC5189;
        ContinuationImpl continuationImpl = c6181.f15261;
        Object obj = c6181.f15264;
        InterfaceC5192 context = continuationImpl.getContext();
        Object objM10927 = AbstractC6185.m10927(context, obj);
        C6247 c6247M11030 = objM10927 != AbstractC6185.f15273 ? m11030(continuationImpl, context, objM10927) : null;
        try {
            continuationImpl.resumeWith(objM723);
            if (c6247M11030 == null || c6247M11030.m11076()) {
                AbstractC6185.m10930(context, objM10927);
            }
        } catch (Throwable th) {
            if (c6247M11030 == null || c6247M11030.m11076()) {
                AbstractC6185.m10930(context, objM10927);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Object m11034(Object obj) {
        return obj instanceof C6262 ? Result.m9304constructorimpl(AbstractC6017.m10770(((C6262) obj).f15420)) : Result.m9304constructorimpl(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5192 m11035(InterfaceC6233 interfaceC6233, InterfaceC5192 interfaceC5192) {
        InterfaceC5192 interfaceC5192M11062 = m11062(interfaceC6233.mo2990(), interfaceC5192, true);
        C8036 c8036 = AbstractC6227.f15375;
        return (interfaceC5192M11062 == c8036 || interfaceC5192M11062.get(C5188.f13281) != null) ? interfaceC5192M11062 : interfaceC5192M11062.plus(c8036);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ C6249 m11036(InterfaceC6233 interfaceC6233, InterfaceC5192 interfaceC5192, CoroutineStart coroutineStart, InterfaceC7383 interfaceC7383, int i) {
        if ((i & 1) != 0) {
            interfaceC5192 = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m11037(interfaceC6233, interfaceC5192, coroutineStart, interfaceC7383);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C6249 m11037(InterfaceC6233 interfaceC6233, InterfaceC5192 interfaceC5192, CoroutineStart coroutineStart, InterfaceC7383 interfaceC7383) {
        InterfaceC5192 interfaceC5192M11035 = m11035(interfaceC6233, interfaceC5192);
        C6249 c6294 = coroutineStart.isLazy() ? new C6294(interfaceC5192M11035, interfaceC7383) : new C6249(interfaceC5192M11035, true, true);
        coroutineStart.invoke(interfaceC7383, c6294, c6294);
        return c6294;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m11038(ArrayList arrayList, ContinuationImpl continuationImpl) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        Iterator it;
        int i;
        if (continuationImpl instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuationImpl;
            int i2 = awaitKt$joinAll$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$3.label = i2 - Integer.MIN_VALUE;
            } else {
                awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuationImpl);
            }
        }
        Object obj = awaitKt$joinAll$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = awaitKt$joinAll$3.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            it = arrayList.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = awaitKt$joinAll$3.I$0;
            it = (Iterator) awaitKt$joinAll$3.L$2;
            AbstractC6017.m10769(obj);
        }
        while (it.hasNext()) {
            InterfaceC6284 interfaceC6284 = (InterfaceC6284) it.next();
            awaitKt$joinAll$3.L$0 = null;
            awaitKt$joinAll$3.L$1 = null;
            awaitKt$joinAll$3.L$2 = it;
            awaitKt$joinAll$3.L$3 = null;
            awaitKt$joinAll$3.L$4 = null;
            awaitKt$joinAll$3.I$0 = i;
            awaitKt$joinAll$3.I$1 = 0;
            awaitKt$joinAll$3.label = 1;
            if (interfaceC6284.mo11123(awaitKt$joinAll$3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final Object m11039(Object obj) {
        InterfaceC6302 interfaceC6302;
        C6303 c6303 = obj instanceof C6303 ? (C6303) obj : null;
        return (c6303 == null || (interfaceC6302 = c6303.f15475) == null) ? obj : interfaceC6302;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final long m11040(long j) {
        C9452 c9452 = C5989.f15057;
        boolean z = j > 0;
        if (z) {
            return C5989.m10748(C5989.m10753(j, AbstractC5992.m10766(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        C5043.m9170();
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final String m11041(InterfaceC5189 interfaceC5189) {
        Object objM723;
        if (interfaceC5189 instanceof C6181) {
            return ((C6181) interfaceC5189).toString();
        }
        try {
            objM723 = Result.m9304constructorimpl(interfaceC5189 + '@' + m11060(interfaceC5189));
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        if (Result.m9307exceptionOrNullimpl(objM723) != null) {
            objM723 = interfaceC5189.getClass().getName() + '@' + m11060(interfaceC5189);
        }
        return (String) objM723;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final Object m11042(RunnableC6245 runnableC6245, InterfaceC7383 interfaceC7383) {
        m11056(runnableC6245, new C6229(m11059(runnableC6245.f15287.getContext()).mo10899(runnableC6245.f15397, runnableC6245, runnableC6245.f15418)));
        return AbstractC3400.m5629(runnableC6245, false, runnableC6245, interfaceC7383);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final Object m11044(InterfaceC5192 interfaceC5192, InterfaceC7383 interfaceC7383) throws Throwable {
        AbstractC6226 abstractC6226M11078;
        InterfaceC5192 interfaceC5192M11062;
        long jMo10999;
        InterfaceC5193 interfaceC5193 = C5188.f13281;
        if (((InterfaceC5187) interfaceC5192.get(interfaceC5193)) == null) {
            abstractC6226M11078 = AbstractC6252.m11078();
            interfaceC5192M11062 = m11062(EmptyCoroutineContext.INSTANCE, interfaceC5192.plus(abstractC6226M11078), true);
            C8036 c8036 = AbstractC6227.f15375;
            if (interfaceC5192M11062 != c8036 && interfaceC5192M11062.get(interfaceC5193) == null) {
                interfaceC5192M11062 = interfaceC5192M11062.plus(c8036);
            }
        } else {
            abstractC6226M11078 = (AbstractC6226) AbstractC6252.f15404.get();
            interfaceC5192M11062 = m11062(EmptyCoroutineContext.INSTANCE, interfaceC5192, true);
            C8036 c80362 = AbstractC6227.f15375;
            if (interfaceC5192M11062 != c80362 && interfaceC5192M11062.get(interfaceC5193) == null) {
                interfaceC5192M11062 = interfaceC5192M11062.plus(c80362);
            }
        }
        C6256 c6256 = new C6256(interfaceC5192M11062, Thread.currentThread(), abstractC6226M11078);
        CoroutineStart.DEFAULT.invoke(interfaceC7383, c6256, c6256);
        AbstractC6226 abstractC6226 = c6256.f15408;
        if (abstractC6226 != null) {
            int i = AbstractC6226.f15370;
            abstractC6226.m11019(false);
        }
        while (true) {
            if (abstractC6226 != null) {
                try {
                    jMo10999 = abstractC6226.mo10999();
                } catch (Throwable th) {
                    if (abstractC6226 != null) {
                        int i2 = AbstractC6226.f15370;
                        abstractC6226.m11020(false);
                    }
                    throw th;
                }
            } else {
                jMo10999 = Long.MAX_VALUE;
            }
            if (c6256.mo11117()) {
                break;
            }
            LockSupport.parkNanos(c6256, jMo10999);
            if (Thread.interrupted()) {
                c6256.m11131(new InterruptedException());
            }
        }
        if (abstractC6226 != null) {
            int i3 = AbstractC6226.f15370;
            abstractC6226.m11020(false);
        }
        Object objM11039 = m11039(c6256.m11140());
        C6262 c6262 = objM11039 instanceof C6262 ? (C6262) objM11039 : null;
        if (c6262 == null) {
            return objM11039;
        }
        throw c6262.f15420;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C6239 m11045(InterfaceC6233 interfaceC6233, InterfaceC5192 interfaceC5192, InterfaceC7383 interfaceC7383, int i) {
        if ((i & 1) != 0) {
            interfaceC5192 = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        InterfaceC5192 interfaceC5192M11035 = m11035(interfaceC6233, interfaceC5192);
        C6239 c6295 = coroutineStart.isLazy() ? new C6295(interfaceC5192M11035, interfaceC7383) : new C6239(interfaceC5192M11035, true, true);
        coroutineStart.invoke(interfaceC7383, c6295, c6295);
        return c6295;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C6254 m11046() {
        return new C6254(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C6283 m11047() {
        return new C6283(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6183 m11048(InterfaceC5192 interfaceC5192) {
        if (interfaceC5192.get(C6285.f15450) == null) {
            interfaceC5192 = interfaceC5192.plus(m11047());
        }
        return new C6183(interfaceC5192);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C6270 m11049() {
        return new C6270(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final CancellationException m11050(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C6276 m11051(InterfaceC5189 interfaceC5189) {
        if (!(interfaceC5189 instanceof C6181)) {
            return new C6276(1, interfaceC5189);
        }
        C6276 c6276M10908 = ((C6181) interfaceC5189).m10908();
        if (c6276M10908 != null) {
            if (!c6276M10908.m11091()) {
                c6276M10908 = null;
            }
            if (c6276M10908 != null) {
                return c6276M10908;
            }
        }
        return new C6276(2, interfaceC5189);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final InterfaceC6284 m11052(InterfaceC5192 interfaceC5192) {
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) interfaceC5192.get(C6285.f15450);
        if (interfaceC6284 != null) {
            return interfaceC6284;
        }
        C5043.m9151(interfaceC5192, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final boolean m11053(InterfaceC5192 interfaceC5192) {
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) interfaceC5192.get(C6285.f15450);
        if (interfaceC6284 != null) {
            return interfaceC6284.mo11121();
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m11054(InterfaceC6233 interfaceC6233) {
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) interfaceC6233.mo2990().get(C6285.f15450);
        if (interfaceC6284 != null) {
            return interfaceC6284.mo11121();
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m11055(InterfaceC5192 interfaceC5192, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            InterfaceC6236 interfaceC6236 = (InterfaceC6236) interfaceC5192.get(C6265.f15427);
            if (interfaceC6236 != null) {
                interfaceC6236.handleException(interfaceC5192, th);
            } else {
                AbstractC6185.m10923(interfaceC5192, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC6019.m10775(runtimeException, th);
                th = runtimeException;
            }
            AbstractC6185.m10923(interfaceC5192, th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static InterfaceC6230 m11056(InterfaceC6284 interfaceC6284, AbstractC6282 abstractC6282) {
        return interfaceC6284 instanceof C6292 ? ((C6292) interfaceC6284).m11138(true, abstractC6282) : interfaceC6284.mo11120(abstractC6282.mo11028(), true, new JobKt__JobKt$invokeOnCompletion$1(abstractC6282));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final long m11057(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Object m11058(long j, InterfaceC5189 interfaceC5189) {
        if (j > 0) {
            C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
            c6276.m11102();
            if (j < Long.MAX_VALUE) {
                m11059(c6276.f15440).mo10900(j, c6276);
            }
            Object objM11099 = c6276.m11099();
            if (objM11099 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM11099;
            }
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC6238 m11059(InterfaceC5192 interfaceC5192) {
        InterfaceC5186 interfaceC5186 = interfaceC5192.get(C5188.f13281);
        InterfaceC6238 interfaceC6238 = interfaceC5186 instanceof InterfaceC6238 ? (InterfaceC6238) interfaceC5186 : null;
        return interfaceC6238 == null ? AbstractC6241.f15393 : interfaceC6238;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String m11060(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m11061(InterfaceC5192 interfaceC5192) {
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) interfaceC5192.get(C6285.f15450);
        if (interfaceC6284 != null && !interfaceC6284.mo11121()) {
            throw interfaceC6284.mo11122();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC5192 m11062(InterfaceC5192 interfaceC5192, InterfaceC5192 interfaceC51922, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 17;
        boolean zBooleanValue = ((Boolean) interfaceC5192.fold(bool, new C1594(i))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC51922.fold(bool, new C1594(i))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC5192.plus(interfaceC51922);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = interfaceC51922;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC5192 interfaceC51923 = (InterfaceC5192) interfaceC5192.fold(emptyCoroutineContext, new C1594(18));
        if (zBooleanValue2) {
            ref$ObjectRef.element = ((InterfaceC5192) ref$ObjectRef.element).fold(emptyCoroutineContext, new C1594(19));
        }
        return interfaceC51923.plus((InterfaceC5192) ref$ObjectRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons m11063(ContinuationImpl continuationImpl) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        if (continuationImpl instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuationImpl;
            int i = delayKt$awaitCancellation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label = i - Integer.MIN_VALUE;
            } else {
                delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuationImpl);
            }
        }
        Object obj = delayKt$awaitCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = delayKt$awaitCancellation$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            delayKt$awaitCancellation$1.I$0 = 0;
            delayKt$awaitCancellation$1.label = 1;
            C6276 c6276 = new C6276(1, AbstractC3400.m5624(delayKt$awaitCancellation$1));
            c6276.m11102();
            if (c6276.m11099() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m11064(List list, InterfaceC5189 interfaceC5189) {
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        InterfaceC6240[] interfaceC6240Arr = (InterfaceC6240[]) list.toArray(new InterfaceC6240[0]);
        C6257 c6257 = new C6257(interfaceC6240Arr);
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        int length = interfaceC6240Arr.length;
        C6259[] c6259Arr = new C6259[length];
        for (int i = 0; i < length; i++) {
            C6247 c6247 = interfaceC6240Arr[i];
            c6247.start();
            C6259 c6259 = new C6259(c6257, c6276);
            c6259.f15416 = m11056(c6247, c6259);
            c6259Arr[i] = c6259;
        }
        C6258 c6258 = new C6258(c6259Arr);
        for (int i2 = 0; i2 < length; i2++) {
            c6259Arr[i2].m11081(c6258);
        }
        if (c6276.m11098() instanceof InterfaceC6286) {
            c6276.m11101(c6258);
        } else {
            c6258.m11079();
        }
        Object objM11099 = c6276.m11099();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11099;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m11065(InterfaceC6284 interfaceC6284, SuspendLambda suspendLambda) {
        interfaceC6284.mo10815(null);
        Object objMo11123 = interfaceC6284.mo11123(suspendLambda);
        return objMo11123 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo11123 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Object m11066(InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) throws Throwable {
        C6192 c6192 = new C6192(interfaceC5189, interfaceC5189.getContext());
        Object objM5629 = AbstractC3400.m5629(c6192, true, c6192, interfaceC7383);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5629;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m11067(String str, Throwable th, InterfaceC6284 interfaceC6284) {
        interfaceC6284.mo10815(m11050(str, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m11068(InterfaceC6233 interfaceC6233, CancellationException cancellationException) {
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) interfaceC6233.mo2990().get(C6285.f15450);
        if (interfaceC6284 != null) {
            interfaceC6284.mo10815(cancellationException);
        } else {
            C5043.m9151(interfaceC6233, "Scope cannot be cancelled because it does not have a job: ");
        }
    }
}
