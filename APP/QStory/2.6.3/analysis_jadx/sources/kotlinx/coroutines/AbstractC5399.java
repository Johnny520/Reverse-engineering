package kotlinx.coroutines;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.C0753;
import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.AbstractC5185;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C4356;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4355;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.time.AbstractC5160;
import kotlin.time.C5157;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.C5349;
import kotlinx.coroutines.internal.C5351;
import kotlinx.coroutines.internal.C5360;
import p052.InterfaceC6554;
import p063.InterfaceC6863;
import p095.C7207;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4485 f15033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4485 f15034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4485 f15035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4485 f15036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4485 f15037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4485 f15038;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4485 f15039;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4485 f15040;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5393 f15041 = new C5393(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C5393 f15042 = new C5393(true);

    static {
        int i = 1;
        f15038 = new C4485("RESUME_TOKEN", i);
        f15037 = new C4485("REMOVED_TASK", i);
        f15036 = new C4485("CLOSED_EMPTY", i);
        f15035 = new C4485("COMPLETING_ALREADY", i);
        f15034 = new C4485("COMPLETING_WAITING_CHILDREN", i);
        f15033 = new C4485("COMPLETING_RETRY", i);
        f15040 = new C4485("TOO_LATE_TO_CANCEL", i);
        f15039 = new C4485("SEALED", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final Object m10470(InterfaceC4360 interfaceC4360, InterfaceC6554 interfaceC6554, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM10480;
        InterfaceC4360 context = interfaceC4357.getContext();
        InterfaceC4360 interfaceC4360Plus = !((Boolean) interfaceC4360.fold(Boolean.FALSE, new C0753(17))).booleanValue() ? context.plus(interfaceC4360) : m10503(context, interfaceC4360, false);
        m10502(interfaceC4360Plus);
        if (interfaceC4360Plus == context) {
            C5360 c5360 = new C5360(interfaceC4357, interfaceC4360Plus);
            objM10480 = AbstractC2567.m5069(c5360, true, c5360, interfaceC6554);
        } else {
            C4356 c4356 = C4356.f12936;
            if (AbstractC4395.m8907(interfaceC4360Plus.get(c4356), context.get(c4356))) {
                C5415 c5415 = new C5415(interfaceC4357, interfaceC4360Plus);
                InterfaceC4360 interfaceC43602 = c5415.f15073;
                Object objM10368 = AbstractC5353.m10368(interfaceC43602, null);
                try {
                    Object objM5069 = AbstractC2567.m5069(c5415, true, c5415, interfaceC6554);
                    AbstractC5353.m10371(interfaceC43602, objM10368);
                    objM10480 = objM5069;
                } catch (Throwable th) {
                    AbstractC5353.m10371(interfaceC43602, objM10368);
                    throw th;
                }
            } else {
                C5405 c5405 = new C5405(interfaceC4357, interfaceC4360Plus);
                AbstractC0455.m1145(interfaceC6554, c5405, c5405);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5405.f15047;
                while (true) {
                    int i = atomicIntegerFieldUpdater.get(c5405);
                    if (i != 0) {
                        if (i != 2) {
                            C5925.m11311("Already suspended");
                            return null;
                        }
                        objM10480 = m10480(c5405.m10581());
                        if (objM10480 instanceof C5430) {
                            throw ((C5430) objM10480).f15075;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(c5405, 0, 1)) {
                        objM10480 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10480;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C5415 m10471(InterfaceC4357 interfaceC4357, InterfaceC4360 interfaceC4360, Object obj) {
        C5415 c5415 = null;
        if ((interfaceC4357 instanceof InterfaceC6863) && interfaceC4360.get(C5411.f15051) != null) {
            InterfaceC6863 callerFrame = (InterfaceC6863) interfaceC4357;
            while (true) {
                if ((callerFrame instanceof C5405) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof C5415) {
                    c5415 = (C5415) callerFrame;
                    break;
                }
            }
            if (c5415 != null) {
                c5415.m10516(interfaceC4360, obj);
            }
        }
        return c5415;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10472(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = r7.getContext()
            m10502(r0)
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r7 = androidx.window.area.AbstractC2567.m5064(r7)
            boolean r1 = r7 instanceof kotlinx.coroutines.internal.C5349
            if (r1 == 0) goto L12
            kotlinx.coroutines.internal.飘花落叶言子楪世兰苏哲 r7 = (kotlinx.coroutines.internal.C5349) r7
            goto L13
        L12:
            r7 = 0
        L13:
            kotlin.飘花落叶言子楪兰苏哲世 r1 = kotlin.C5176.f14739
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L83
        L1a:
            kotlinx.coroutines.飘花落叶言子楪兰哲世苏 r2 = r7.f14917
            boolean r3 = kotlinx.coroutines.internal.AbstractC5353.m10375(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.f14918 = r1
            r7.f15031 = r4
            r2.mo10344(r0, r7)
            goto L81
        L2b:
            kotlinx.coroutines.飘花落叶言子哲苏楪世兰 r3 = new kotlinx.coroutines.飘花落叶言子哲苏楪世兰
            kotlinx.coroutines.飘花落叶言子苏世楪哲兰 r5 = kotlinx.coroutines.C5423.f15060
            r3.<init>(r5)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = r0.plus(r3)
            r7.f14918 = r1
            r7.f15031 = r4
            r2.mo10344(r0, r7)
            boolean r0 = r3.f15061
            if (r0 == 0) goto L81
            kotlinx.coroutines.飘花落叶言子世哲兰苏楪 r0 = kotlinx.coroutines.AbstractC5420.m10519()
            kotlin.collections.飘花落叶言子楪苏兰哲世 r2 = r0.f15026
            if (r2 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 == 0) goto L52
            goto L17
        L52:
            long r2 = r0.f15027
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L67
            r7.f14918 = r1
            r7.f15031 = r4
            r0.m10462(r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            goto L83
        L67:
            r0.m10460(r4)
            r7.run()     // Catch: java.lang.Throwable -> L77
        L6d:
            boolean r2 = r0.m10463()     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L6d
        L73:
            r0.m10461(r4)
            goto L17
        L77:
            r2 = move-exception
            r7.m10466(r2)     // Catch: java.lang.Throwable -> L7c
            goto L73
        L7c:
            r7 = move-exception
            r0.m10461(r4)
            throw r7
        L81:
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
        L83:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r0) goto L88
            return r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5399.m10472(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.飘花落叶言子哲世楪兰苏] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10473(long r7, p052.InterfaceC6554 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6554) r8
            kotlin.AbstractC5185.m10210(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L30
            return r10
        L30:
            r8 = move-exception
            goto L60
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L38:
            kotlin.AbstractC5185.m10210(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L42
            goto L66
        L42:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.L$0 = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r0.L$1 = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r0.J$0 = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r0.label = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            kotlinx.coroutines.飘花落叶言子哲世楪兰苏 r2 = new kotlinx.coroutines.飘花落叶言子哲世楪兰苏     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            r10.element = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            java.lang.Object r7 = m10483(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            if (r7 != r1) goto L5d
            return r1
        L5d:
            return r7
        L5e:
            r8 = move-exception
            r7 = r10
        L60:
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L67
        L66:
            return r3
        L67:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5399.m10473(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final void m10474(C5444 c5444, InterfaceC4357 interfaceC4357, boolean z) {
        Object objM10539 = c5444.m10539();
        Throwable thMo10464 = c5444.mo10464(objM10539);
        Object objM163 = thMo10464 != null ? AbstractC0053.m163(thMo10464) : Result.m8745constructorimpl(c5444.mo10467(objM10539));
        if (!z) {
            interfaceC4357.resumeWith(objM163);
            return;
        }
        interfaceC4357.getClass();
        C5349 c5349 = (C5349) interfaceC4357;
        ContinuationImpl continuationImpl = c5349.f14916;
        Object obj = c5349.f14919;
        InterfaceC4360 context = continuationImpl.getContext();
        Object objM10368 = AbstractC5353.m10368(context, obj);
        C5415 c5415M10471 = objM10368 != AbstractC5353.f14928 ? m10471(continuationImpl, context, objM10368) : null;
        try {
            continuationImpl.resumeWith(objM163);
            if (c5415M10471 == null || c5415M10471.m10517()) {
                AbstractC5353.m10371(context, objM10368);
            }
        } catch (Throwable th) {
            if (c5415M10471 == null || c5415M10471.m10517()) {
                AbstractC5353.m10371(context, objM10368);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Object m10475(Object obj) {
        return obj instanceof C5430 ? Result.m8745constructorimpl(AbstractC5185.m10211(((C5430) obj).f15075)) : Result.m8745constructorimpl(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final InterfaceC4360 m10476(InterfaceC5401 interfaceC5401, InterfaceC4360 interfaceC4360) {
        InterfaceC4360 interfaceC4360M10503 = m10503(interfaceC5401.mo2430(), interfaceC4360, true);
        C7207 c7207 = AbstractC5395.f15030;
        return (interfaceC4360M10503 == c7207 || interfaceC4360M10503.get(C4356.f12936) != null) ? interfaceC4360M10503 : interfaceC4360M10503.plus(c7207);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ C5417 m10477(InterfaceC5401 interfaceC5401, InterfaceC4360 interfaceC4360, CoroutineStart coroutineStart, InterfaceC6554 interfaceC6554, int i) {
        if ((i & 1) != 0) {
            interfaceC4360 = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m10478(interfaceC5401, interfaceC4360, coroutineStart, interfaceC6554);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5417 m10478(InterfaceC5401 interfaceC5401, InterfaceC4360 interfaceC4360, CoroutineStart coroutineStart, InterfaceC6554 interfaceC6554) {
        InterfaceC4360 interfaceC4360M10476 = m10476(interfaceC5401, interfaceC4360);
        C5417 c5462 = coroutineStart.isLazy() ? new C5462(interfaceC4360M10476, interfaceC6554) : new C5417(interfaceC4360M10476, true, true);
        coroutineStart.invoke(interfaceC6554, c5462, c5462);
        return c5462;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10479(java.util.ArrayList r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.AwaitKt$joinAll$3
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = (kotlinx.coroutines.AwaitKt$joinAll$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = new kotlinx.coroutines.AwaitKt$joinAll$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 != r4) goto L3b
            int r7 = r0.I$0
            java.lang.Object r2 = r0.L$4
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r2 = (kotlinx.coroutines.InterfaceC5452) r2
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r0.L$1
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = r0.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.AbstractC5185.m10210(r8)
            goto L4a
        L3b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r5
        L41:
            kotlin.AbstractC5185.m10210(r8)
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
            r7 = r3
        L4a:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r2.next()
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r8 = (kotlinx.coroutines.InterfaceC5452) r8
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r5
            r0.L$4 = r5
            r0.I$0 = r7
            r0.I$1 = r3
            r0.label = r4
            java.lang.Object r8 = r8.mo10564(r0)
            if (r8 != r1) goto L4a
            return r1
        L6d:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5399.m10479(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final Object m10480(Object obj) {
        InterfaceC5470 interfaceC5470;
        C5471 c5471 = obj instanceof C5471 ? (C5471) obj : null;
        return (c5471 == null || (interfaceC5470 = c5471.f15130) == null) ? obj : interfaceC5470;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final long m10481(long j) {
        C8623 c8623 = C5157.f14712;
        boolean z = j > 0;
        if (z) {
            return C5157.m10189(C5157.m10194(j, AbstractC5160.m10207(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        C4211.m8611();
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final String m10482(InterfaceC4357 interfaceC4357) {
        Object objM163;
        if (interfaceC4357 instanceof C5349) {
            return ((C5349) interfaceC4357).toString();
        }
        try {
            objM163 = Result.m8745constructorimpl(interfaceC4357 + '@' + m10501(interfaceC4357));
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        if (Result.m8748exceptionOrNullimpl(objM163) != null) {
            objM163 = interfaceC4357.getClass().getName() + '@' + m10501(interfaceC4357);
        }
        return (String) objM163;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final Object m10483(RunnableC5413 runnableC5413, InterfaceC6554 interfaceC6554) {
        m10497(runnableC5413, new C5397(m10500(runnableC5413.f14942.getContext()).mo10340(runnableC5413.f15052, runnableC5413, runnableC5413.f15073)));
        return AbstractC2567.m5069(runnableC5413, false, runnableC5413, interfaceC6554);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final Object m10485(InterfaceC4360 interfaceC4360, InterfaceC6554 interfaceC6554) throws Throwable {
        AbstractC5394 abstractC5394M10519;
        InterfaceC4360 interfaceC4360M10503;
        long jMo10440;
        InterfaceC4361 interfaceC4361 = C4356.f12936;
        if (((InterfaceC4355) interfaceC4360.get(interfaceC4361)) == null) {
            abstractC5394M10519 = AbstractC5420.m10519();
            interfaceC4360M10503 = m10503(EmptyCoroutineContext.INSTANCE, interfaceC4360.plus(abstractC5394M10519), true);
            C7207 c7207 = AbstractC5395.f15030;
            if (interfaceC4360M10503 != c7207 && interfaceC4360M10503.get(interfaceC4361) == null) {
                interfaceC4360M10503 = interfaceC4360M10503.plus(c7207);
            }
        } else {
            abstractC5394M10519 = (AbstractC5394) AbstractC5420.f15059.get();
            interfaceC4360M10503 = m10503(EmptyCoroutineContext.INSTANCE, interfaceC4360, true);
            C7207 c72072 = AbstractC5395.f15030;
            if (interfaceC4360M10503 != c72072 && interfaceC4360M10503.get(interfaceC4361) == null) {
                interfaceC4360M10503 = interfaceC4360M10503.plus(c72072);
            }
        }
        C5424 c5424 = new C5424(interfaceC4360M10503, Thread.currentThread(), abstractC5394M10519);
        CoroutineStart.DEFAULT.invoke(interfaceC6554, c5424, c5424);
        AbstractC5394 abstractC5394 = c5424.f15063;
        if (abstractC5394 != null) {
            int i = AbstractC5394.f15025;
            abstractC5394.m10460(false);
        }
        while (true) {
            if (abstractC5394 != null) {
                try {
                    jMo10440 = abstractC5394.mo10440();
                } catch (Throwable th) {
                    if (abstractC5394 != null) {
                        int i2 = AbstractC5394.f15025;
                        abstractC5394.m10461(false);
                    }
                    throw th;
                }
            } else {
                jMo10440 = Long.MAX_VALUE;
            }
            if (c5424.mo10558()) {
                break;
            }
            LockSupport.parkNanos(c5424, jMo10440);
            if (Thread.interrupted()) {
                c5424.m10572(new InterruptedException());
            }
        }
        if (abstractC5394 != null) {
            int i3 = AbstractC5394.f15025;
            abstractC5394.m10461(false);
        }
        Object objM10480 = m10480(c5424.m10581());
        C5430 c5430 = objM10480 instanceof C5430 ? (C5430) objM10480 : null;
        if (c5430 == null) {
            return objM10480;
        }
        throw c5430.f15075;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C5407 m10486(InterfaceC5401 interfaceC5401, InterfaceC4360 interfaceC4360, InterfaceC6554 interfaceC6554, int i) {
        if ((i & 1) != 0) {
            interfaceC4360 = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        InterfaceC4360 interfaceC4360M10476 = m10476(interfaceC5401, interfaceC4360);
        C5407 c5463 = coroutineStart.isLazy() ? new C5463(interfaceC4360M10476, interfaceC6554) : new C5407(interfaceC4360M10476, true, true);
        coroutineStart.invoke(interfaceC6554, c5463, c5463);
        return c5463;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5422 m10487() {
        return new C5422(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C5451 m10488() {
        return new C5451(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5351 m10489(InterfaceC4360 interfaceC4360) {
        if (interfaceC4360.get(C5453.f15105) == null) {
            interfaceC4360 = interfaceC4360.plus(m10488());
        }
        return new C5351(interfaceC4360);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C5438 m10490() {
        return new C5438(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final CancellationException m10491(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5444 m10492(InterfaceC4357 interfaceC4357) {
        if (!(interfaceC4357 instanceof C5349)) {
            return new C5444(1, interfaceC4357);
        }
        C5444 c5444M10349 = ((C5349) interfaceC4357).m10349();
        if (c5444M10349 != null) {
            if (!c5444M10349.m10532()) {
                c5444M10349 = null;
            }
            if (c5444M10349 != null) {
                return c5444M10349;
            }
        }
        return new C5444(2, interfaceC4357);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final InterfaceC5452 m10493(InterfaceC4360 interfaceC4360) {
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) interfaceC4360.get(C5453.f15105);
        if (interfaceC5452 != null) {
            return interfaceC5452;
        }
        C4211.m8592(interfaceC4360, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final boolean m10494(InterfaceC4360 interfaceC4360) {
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) interfaceC4360.get(C5453.f15105);
        if (interfaceC5452 != null) {
            return interfaceC5452.mo10562();
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m10495(InterfaceC5401 interfaceC5401) {
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) interfaceC5401.mo2430().get(C5453.f15105);
        if (interfaceC5452 != null) {
            return interfaceC5452.mo10562();
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m10496(InterfaceC4360 interfaceC4360, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            InterfaceC5404 interfaceC5404 = (InterfaceC5404) interfaceC4360.get(C5433.f15082);
            if (interfaceC5404 != null) {
                interfaceC5404.handleException(interfaceC4360, th);
            } else {
                AbstractC5353.m10364(interfaceC4360, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC5187.m10216(runtimeException, th);
                th = runtimeException;
            }
            AbstractC5353.m10364(interfaceC4360, th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static InterfaceC5398 m10497(InterfaceC5452 interfaceC5452, AbstractC5450 abstractC5450) {
        return interfaceC5452 instanceof C5460 ? ((C5460) interfaceC5452).m10579(true, abstractC5450) : interfaceC5452.mo10561(abstractC5450.mo10469(), true, new JobKt__JobKt$invokeOnCompletion$1(abstractC5450));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final long m10498(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Object m10499(long j, InterfaceC4357 interfaceC4357) {
        if (j > 0) {
            C5444 c5444 = new C5444(1, AbstractC2567.m5064(interfaceC4357));
            c5444.m10543();
            if (j < Long.MAX_VALUE) {
                m10500(c5444.f15095).mo10341(j, c5444);
            }
            Object objM10540 = c5444.m10540();
            if (objM10540 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM10540;
            }
        }
        return C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC5406 m10500(InterfaceC4360 interfaceC4360) {
        InterfaceC4354 interfaceC4354 = interfaceC4360.get(C4356.f12936);
        InterfaceC5406 interfaceC5406 = interfaceC4354 instanceof InterfaceC5406 ? (InterfaceC5406) interfaceC4354 : null;
        return interfaceC5406 == null ? AbstractC5409.f15048 : interfaceC5406;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String m10501(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m10502(InterfaceC4360 interfaceC4360) {
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) interfaceC4360.get(C5453.f15105);
        if (interfaceC5452 != null && !interfaceC5452.mo10562()) {
            throw interfaceC5452.mo10563();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC4360 m10503(InterfaceC4360 interfaceC4360, InterfaceC4360 interfaceC43602, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 17;
        boolean zBooleanValue = ((Boolean) interfaceC4360.fold(bool, new C0753(i))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC43602.fold(bool, new C0753(i))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC4360.plus(interfaceC43602);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = interfaceC43602;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC4360 interfaceC43603 = (InterfaceC4360) interfaceC4360.fold(emptyCoroutineContext, new C0753(18));
        if (zBooleanValue2) {
            ref$ObjectRef.element = ((InterfaceC4360) ref$ObjectRef.element).fold(emptyCoroutineContext, new C0753(19));
        }
        return interfaceC43603.plus((InterfaceC4360) ref$ObjectRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m10504(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L2a:
            kotlin.AbstractC5185.m10210(r5)
            goto L49
        L2e:
            kotlin.AbstractC5185.m10210(r5)
            r5 = 0
            r0.I$0 = r5
            r0.label = r4
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r5 = new kotlinx.coroutines.飘花落叶言子楪苏兰世哲
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r0 = androidx.window.area.AbstractC2567.m5064(r0)
            r5.<init>(r4, r0)
            r5.m10543()
            java.lang.Object r5 = r5.m10540()
            if (r5 != r1) goto L49
            return r1
        L49:
            io.ktor.util.C4211.m8602()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5399.m10504(kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m10505(List list, InterfaceC4357 interfaceC4357) {
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        InterfaceC5408[] interfaceC5408Arr = (InterfaceC5408[]) list.toArray(new InterfaceC5408[0]);
        C5425 c5425 = new C5425(interfaceC5408Arr);
        C5444 c5444 = new C5444(1, AbstractC2567.m5064(interfaceC4357));
        c5444.m10543();
        int length = interfaceC5408Arr.length;
        C5427[] c5427Arr = new C5427[length];
        for (int i = 0; i < length; i++) {
            C5415 c5415 = interfaceC5408Arr[i];
            c5415.start();
            C5427 c5427 = new C5427(c5425, c5444);
            c5427.f15071 = m10497(c5415, c5427);
            c5427Arr[i] = c5427;
        }
        C5426 c5426 = new C5426(c5427Arr);
        for (int i2 = 0; i2 < length; i2++) {
            c5427Arr[i2].m10522(c5426);
        }
        if (c5444.m10539() instanceof InterfaceC5454) {
            c5444.m10542(c5426);
        } else {
            c5426.m10520();
        }
        Object objM10540 = c5444.m10540();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10540;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m10506(InterfaceC5452 interfaceC5452, SuspendLambda suspendLambda) {
        interfaceC5452.mo10256(null);
        Object objMo10564 = interfaceC5452.mo10564(suspendLambda);
        return objMo10564 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo10564 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Object m10507(InterfaceC6554 interfaceC6554, InterfaceC4357 interfaceC4357) throws Throwable {
        C5360 c5360 = new C5360(interfaceC4357, interfaceC4357.getContext());
        Object objM5069 = AbstractC2567.m5069(c5360, true, c5360, interfaceC6554);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5069;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m10508(String str, Throwable th, InterfaceC5452 interfaceC5452) {
        interfaceC5452.mo10256(m10491(str, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m10509(InterfaceC5401 interfaceC5401, CancellationException cancellationException) {
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) interfaceC5401.mo2430().get(C5453.f15105);
        if (interfaceC5452 != null) {
            interfaceC5452.mo10256(cancellationException);
        } else {
            C4211.m8592(interfaceC5401, "Scope cannot be cancelled because it does not have a job: ");
        }
    }
}
