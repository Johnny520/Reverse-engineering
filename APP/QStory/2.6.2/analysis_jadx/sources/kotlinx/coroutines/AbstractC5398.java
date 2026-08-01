package kotlinx.coroutines;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.C0753;
import com.bumptech.glide.AbstractC3054;
import io.ktor.util.C4210;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.AbstractC5184;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C4355;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlin.time.AbstractC5159;
import kotlin.time.C5156;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.C5348;
import kotlinx.coroutines.internal.C5350;
import kotlinx.coroutines.internal.C5359;
import p033.AbstractC6325;
import p052.InterfaceC6553;
import p053.AbstractC6560;
import p063.InterfaceC6862;
import p095.C7206;
import p305.C8631;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4484 f15033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4484 f15034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4484 f15035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4484 f15036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4484 f15037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4484 f15038;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4484 f15039;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4484 f15040;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5392 f15041 = new C5392(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C5392 f15042 = new C5392(true);

    static {
        int i = 1;
        f15038 = new C4484("RESUME_TOKEN", i);
        f15037 = new C4484("REMOVED_TASK", i);
        f15036 = new C4484("CLOSED_EMPTY", i);
        f15035 = new C4484("COMPLETING_ALREADY", i);
        f15034 = new C4484("COMPLETING_WAITING_CHILDREN", i);
        f15033 = new C4484("COMPLETING_RETRY", i);
        f15040 = new C4484("TOO_LATE_TO_CANCEL", i);
        f15039 = new C4484("SEALED", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final Object m10466(InterfaceC4359 interfaceC4359, InterfaceC6553 interfaceC6553, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objM10476;
        InterfaceC4359 context = interfaceC4356.getContext();
        InterfaceC4359 interfaceC4359Plus = !((Boolean) interfaceC4359.fold(Boolean.FALSE, new C0753(17))).booleanValue() ? context.plus(interfaceC4359) : m10499(context, interfaceC4359, false);
        m10498(interfaceC4359Plus);
        if (interfaceC4359Plus == context) {
            C5359 c5359 = new C5359(interfaceC4356, interfaceC4359Plus);
            objM10476 = AbstractC6560.m11999(c5359, true, c5359, interfaceC6553);
        } else {
            C4355 c4355 = C4355.f12932;
            if (AbstractC4394.m8917(interfaceC4359Plus.get(c4355), context.get(c4355))) {
                C5414 c5414 = new C5414(interfaceC4356, interfaceC4359Plus);
                InterfaceC4359 interfaceC43592 = c5414.f15073;
                Object objM10364 = AbstractC5352.m10364(interfaceC43592, null);
                try {
                    Object objM11999 = AbstractC6560.m11999(c5414, true, c5414, interfaceC6553);
                    AbstractC5352.m10367(interfaceC43592, objM10364);
                    objM10476 = objM11999;
                } catch (Throwable th) {
                    AbstractC5352.m10367(interfaceC43592, objM10364);
                    throw th;
                }
            } else {
                C5404 c5404 = new C5404(interfaceC4356, interfaceC4359Plus);
                AbstractC6325.m11850(interfaceC6553, c5404, c5404);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5404.f15047;
                while (true) {
                    int i = atomicIntegerFieldUpdater.get(c5404);
                    if (i != 0) {
                        if (i != 2) {
                            C5919.m11250("Already suspended");
                            return null;
                        }
                        objM10476 = m10476(c5404.m10578());
                        if (objM10476 instanceof C5429) {
                            throw ((C5429) objM10476).f15075;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(c5404, 0, 1)) {
                        objM10476 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10476;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C5414 m10467(InterfaceC4356 interfaceC4356, InterfaceC4359 interfaceC4359, Object obj) {
        C5414 c5414 = null;
        if ((interfaceC4356 instanceof InterfaceC6862) && interfaceC4359.get(C5410.f15051) != null) {
            InterfaceC6862 callerFrame = (InterfaceC6862) interfaceC4356;
            while (true) {
                if ((callerFrame instanceof C5404) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof C5414) {
                    c5414 = (C5414) callerFrame;
                    break;
                }
            }
            if (c5414 != null) {
                c5414.m10512(interfaceC4359, obj);
            }
        }
        return c5414;
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
    public static final java.lang.Object m10468(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = r7.getContext()
            m10498(r0)
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r7 = com.bumptech.glide.AbstractC3054.m6602(r7)
            boolean r1 = r7 instanceof kotlinx.coroutines.internal.C5348
            if (r1 == 0) goto L12
            kotlinx.coroutines.internal.飘花落叶言子楪世兰苏哲 r7 = (kotlinx.coroutines.internal.C5348) r7
            goto L13
        L12:
            r7 = 0
        L13:
            kotlin.飘花落叶言子楪兰苏哲世 r1 = kotlin.C5175.f14739
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L83
        L1a:
            kotlinx.coroutines.飘花落叶言子楪兰哲世苏 r2 = r7.f14917
            boolean r3 = kotlinx.coroutines.internal.AbstractC5352.m10371(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.f14918 = r1
            r7.f15031 = r4
            r2.mo10340(r0, r7)
            goto L81
        L2b:
            kotlinx.coroutines.飘花落叶言子哲苏楪世兰 r3 = new kotlinx.coroutines.飘花落叶言子哲苏楪世兰
            kotlinx.coroutines.飘花落叶言子苏世楪哲兰 r5 = kotlinx.coroutines.C5422.f15060
            r3.<init>(r5)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r0 = r0.plus(r3)
            r7.f14918 = r1
            r7.f15031 = r4
            r2.mo10340(r0, r7)
            boolean r0 = r3.f15061
            if (r0 == 0) goto L81
            kotlinx.coroutines.飘花落叶言子世哲兰苏楪 r0 = kotlinx.coroutines.AbstractC5419.m10515()
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
            r0.m10457(r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            goto L83
        L67:
            r0.m10456(r4)
            r7.run()     // Catch: java.lang.Throwable -> L77
        L6d:
            boolean r2 = r0.m10459()     // Catch: java.lang.Throwable -> L77
            if (r2 != 0) goto L6d
        L73:
            r0.m10458(r4)
            goto L17
        L77:
            r2 = move-exception
            r7.m10462(r2)     // Catch: java.lang.Throwable -> L7c
            goto L73
        L7c:
            r7 = move-exception
            r0.m10458(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5398.m10468(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.飘花落叶言子哲世楪兰苏] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10469(long r7, p052.InterfaceC6553 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
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
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = (p052.InterfaceC6553) r8
            kotlin.AbstractC5184.m10206(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L30
            return r10
        L30:
            r8 = move-exception
            goto L60
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r3
        L38:
            kotlin.AbstractC5184.m10206(r10)
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
            java.lang.Object r7 = m10479(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5398.m10469(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final void m10470(C5443 c5443, InterfaceC4356 interfaceC4356, boolean z) {
        Object objM10535 = c5443.m10535();
        Throwable thMo10460 = c5443.mo10460(objM10535);
        Object objM162 = thMo10460 != null ? AbstractC0053.m162(thMo10460) : Result.m8755constructorimpl(c5443.mo10463(objM10535));
        if (!z) {
            interfaceC4356.resumeWith(objM162);
            return;
        }
        interfaceC4356.getClass();
        C5348 c5348 = (C5348) interfaceC4356;
        ContinuationImpl continuationImpl = c5348.f14916;
        Object obj = c5348.f14919;
        InterfaceC4359 context = continuationImpl.getContext();
        Object objM10364 = AbstractC5352.m10364(context, obj);
        C5414 c5414M10467 = objM10364 != AbstractC5352.f14928 ? m10467(continuationImpl, context, objM10364) : null;
        try {
            continuationImpl.resumeWith(objM162);
            if (c5414M10467 == null || c5414M10467.m10513()) {
                AbstractC5352.m10367(context, objM10364);
            }
        } catch (Throwable th) {
            if (c5414M10467 == null || c5414M10467.m10513()) {
                AbstractC5352.m10367(context, objM10364);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Object m10471(Object obj) {
        return obj instanceof C5429 ? Result.m8755constructorimpl(AbstractC5184.m10207(((C5429) obj).f15075)) : Result.m8755constructorimpl(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final InterfaceC4359 m10472(InterfaceC5400 interfaceC5400, InterfaceC4359 interfaceC4359) {
        InterfaceC4359 interfaceC4359M10499 = m10499(interfaceC5400.mo2420(), interfaceC4359, true);
        C7206 c7206 = AbstractC5394.f15030;
        return (interfaceC4359M10499 == c7206 || interfaceC4359M10499.get(C4355.f12932) != null) ? interfaceC4359M10499 : interfaceC4359M10499.plus(c7206);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ C5416 m10473(InterfaceC5400 interfaceC5400, InterfaceC4359 interfaceC4359, CoroutineStart coroutineStart, InterfaceC6553 interfaceC6553, int i) {
        if ((i & 1) != 0) {
            interfaceC4359 = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m10474(interfaceC5400, interfaceC4359, coroutineStart, interfaceC6553);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5416 m10474(InterfaceC5400 interfaceC5400, InterfaceC4359 interfaceC4359, CoroutineStart coroutineStart, InterfaceC6553 interfaceC6553) {
        InterfaceC4359 interfaceC4359M10472 = m10472(interfaceC5400, interfaceC4359);
        C5416 c5461 = coroutineStart.isLazy() ? new C5461(interfaceC4359M10472, interfaceC6553) : new C5416(interfaceC4359M10472, true, true);
        coroutineStart.invoke(interfaceC6553, c5461, c5461);
        return c5461;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10475(java.util.ArrayList r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
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
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r2 = (kotlinx.coroutines.InterfaceC5451) r2
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r0.L$1
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = r0.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.AbstractC5184.m10206(r8)
            goto L4a
        L3b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r5
        L41:
            kotlin.AbstractC5184.m10206(r8)
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
            r7 = r3
        L4a:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r2.next()
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r8 = (kotlinx.coroutines.InterfaceC5451) r8
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r5
            r0.L$4 = r5
            r0.I$0 = r7
            r0.I$1 = r3
            r0.label = r4
            java.lang.Object r8 = r8.mo10558(r0)
            if (r8 != r1) goto L4a
            return r1
        L6d:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5398.m10475(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final Object m10476(Object obj) {
        InterfaceC5469 interfaceC5469;
        C5470 c5470 = obj instanceof C5470 ? (C5470) obj : null;
        return (c5470 == null || (interfaceC5469 = c5470.f15130) == null) ? obj : interfaceC5469;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final long m10477(long j) {
        C8631 c8631 = C5156.f14712;
        boolean z = j > 0;
        if (z) {
            return C5156.m10185(C5156.m10190(j, AbstractC5159.m10203(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        C4210.m8621();
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final String m10478(InterfaceC4356 interfaceC4356) {
        Object objM162;
        if (interfaceC4356 instanceof C5348) {
            return ((C5348) interfaceC4356).toString();
        }
        try {
            objM162 = Result.m8755constructorimpl(interfaceC4356 + '@' + m10497(interfaceC4356));
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (Result.m8758exceptionOrNullimpl(objM162) != null) {
            objM162 = interfaceC4356.getClass().getName() + '@' + m10497(interfaceC4356);
        }
        return (String) objM162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final Object m10479(RunnableC5412 runnableC5412, InterfaceC6553 interfaceC6553) {
        m10493(runnableC5412, new C5396(m10496(runnableC5412.f14942.getContext()).mo10336(runnableC5412.f15052, runnableC5412, runnableC5412.f15073)));
        return AbstractC6560.m11999(runnableC5412, false, runnableC5412, interfaceC6553);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final Object m10481(InterfaceC4359 interfaceC4359, InterfaceC6553 interfaceC6553) throws Throwable {
        AbstractC5393 abstractC5393M10515;
        InterfaceC4359 interfaceC4359M10499;
        long jMo10436;
        InterfaceC4360 interfaceC4360 = C4355.f12932;
        if (((InterfaceC4354) interfaceC4359.get(interfaceC4360)) == null) {
            abstractC5393M10515 = AbstractC5419.m10515();
            interfaceC4359M10499 = m10499(EmptyCoroutineContext.INSTANCE, interfaceC4359.plus(abstractC5393M10515), true);
            C7206 c7206 = AbstractC5394.f15030;
            if (interfaceC4359M10499 != c7206 && interfaceC4359M10499.get(interfaceC4360) == null) {
                interfaceC4359M10499 = interfaceC4359M10499.plus(c7206);
            }
        } else {
            abstractC5393M10515 = (AbstractC5393) AbstractC5419.f15059.get();
            interfaceC4359M10499 = m10499(EmptyCoroutineContext.INSTANCE, interfaceC4359, true);
            C7206 c72062 = AbstractC5394.f15030;
            if (interfaceC4359M10499 != c72062 && interfaceC4359M10499.get(interfaceC4360) == null) {
                interfaceC4359M10499 = interfaceC4359M10499.plus(c72062);
            }
        }
        C5423 c5423 = new C5423(interfaceC4359M10499, Thread.currentThread(), abstractC5393M10515);
        CoroutineStart.DEFAULT.invoke(interfaceC6553, c5423, c5423);
        AbstractC5393 abstractC5393 = c5423.f15063;
        if (abstractC5393 != null) {
            int i = AbstractC5393.f15025;
            abstractC5393.m10456(false);
        }
        while (true) {
            if (abstractC5393 != null) {
                try {
                    jMo10436 = abstractC5393.mo10436();
                } catch (Throwable th) {
                    if (abstractC5393 != null) {
                        int i2 = AbstractC5393.f15025;
                        abstractC5393.m10458(false);
                    }
                    throw th;
                }
            } else {
                jMo10436 = Long.MAX_VALUE;
            }
            if (c5423.mo10560()) {
                break;
            }
            LockSupport.parkNanos(c5423, jMo10436);
            if (Thread.interrupted()) {
                c5423.m10569(new InterruptedException());
            }
        }
        if (abstractC5393 != null) {
            int i3 = AbstractC5393.f15025;
            abstractC5393.m10458(false);
        }
        Object objM10476 = m10476(c5423.m10578());
        C5429 c5429 = objM10476 instanceof C5429 ? (C5429) objM10476 : null;
        if (c5429 == null) {
            return objM10476;
        }
        throw c5429.f15075;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C5406 m10482(InterfaceC5400 interfaceC5400, InterfaceC4359 interfaceC4359, InterfaceC6553 interfaceC6553, int i) {
        if ((i & 1) != 0) {
            interfaceC4359 = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        InterfaceC4359 interfaceC4359M10472 = m10472(interfaceC5400, interfaceC4359);
        C5406 c5462 = coroutineStart.isLazy() ? new C5462(interfaceC4359M10472, interfaceC6553) : new C5406(interfaceC4359M10472, true, true);
        coroutineStart.invoke(interfaceC6553, c5462, c5462);
        return c5462;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5421 m10483() {
        return new C5421(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C5450 m10484() {
        return new C5450(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5350 m10485(InterfaceC4359 interfaceC4359) {
        if (interfaceC4359.get(C5452.f15105) == null) {
            interfaceC4359 = interfaceC4359.plus(m10484());
        }
        return new C5350(interfaceC4359);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C5437 m10486() {
        return new C5437(null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final CancellationException m10487(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5443 m10488(InterfaceC4356 interfaceC4356) {
        if (!(interfaceC4356 instanceof C5348)) {
            return new C5443(1, interfaceC4356);
        }
        C5443 c5443M10345 = ((C5348) interfaceC4356).m10345();
        if (c5443M10345 != null) {
            if (!c5443M10345.m10528()) {
                c5443M10345 = null;
            }
            if (c5443M10345 != null) {
                return c5443M10345;
            }
        }
        return new C5443(2, interfaceC4356);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final InterfaceC5451 m10489(InterfaceC4359 interfaceC4359) {
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) interfaceC4359.get(C5452.f15105);
        if (interfaceC5451 != null) {
            return interfaceC5451;
        }
        C4210.m8602(interfaceC4359, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final boolean m10490(InterfaceC4359 interfaceC4359) {
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) interfaceC4359.get(C5452.f15105);
        if (interfaceC5451 != null) {
            return interfaceC5451.mo10557();
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m10491(InterfaceC5400 interfaceC5400) {
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) interfaceC5400.mo2420().get(C5452.f15105);
        if (interfaceC5451 != null) {
            return interfaceC5451.mo10557();
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m10492(InterfaceC4359 interfaceC4359, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            InterfaceC5403 interfaceC5403 = (InterfaceC5403) interfaceC4359.get(C5432.f15082);
            if (interfaceC5403 != null) {
                interfaceC5403.handleException(interfaceC4359, th);
            } else {
                AbstractC5352.m10360(interfaceC4359, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC5186.m10212(runtimeException, th);
                th = runtimeException;
            }
            AbstractC5352.m10360(interfaceC4359, th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static InterfaceC5397 m10493(InterfaceC5451 interfaceC5451, AbstractC5449 abstractC5449) {
        return interfaceC5451 instanceof C5459 ? ((C5459) interfaceC5451).m10576(true, abstractC5449) : interfaceC5451.mo10556(abstractC5449.mo10465(), true, new JobKt__JobKt$invokeOnCompletion$1(abstractC5449));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final long m10494(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Object m10495(long j, InterfaceC4356 interfaceC4356) {
        if (j > 0) {
            C5443 c5443 = new C5443(1, AbstractC3054.m6602(interfaceC4356));
            c5443.m10539();
            if (j < Long.MAX_VALUE) {
                m10496(c5443.f15095).mo10337(j, c5443);
            }
            Object objM10536 = c5443.m10536();
            if (objM10536 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM10536;
            }
        }
        return C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC5405 m10496(InterfaceC4359 interfaceC4359) {
        InterfaceC4353 interfaceC4353 = interfaceC4359.get(C4355.f12932);
        InterfaceC5405 interfaceC5405 = interfaceC4353 instanceof InterfaceC5405 ? (InterfaceC5405) interfaceC4353 : null;
        return interfaceC5405 == null ? AbstractC5408.f15048 : interfaceC5405;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String m10497(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m10498(InterfaceC4359 interfaceC4359) {
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) interfaceC4359.get(C5452.f15105);
        if (interfaceC5451 != null && !interfaceC5451.mo10557()) {
            throw interfaceC5451.mo10559();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC4359 m10499(InterfaceC4359 interfaceC4359, InterfaceC4359 interfaceC43592, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 17;
        boolean zBooleanValue = ((Boolean) interfaceC4359.fold(bool, new C0753(i))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC43592.fold(bool, new C0753(i))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC4359.plus(interfaceC43592);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = interfaceC43592;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC4359 interfaceC43593 = (InterfaceC4359) interfaceC4359.fold(emptyCoroutineContext, new C0753(18));
        if (zBooleanValue2) {
            ref$ObjectRef.element = ((InterfaceC4359) ref$ObjectRef.element).fold(emptyCoroutineContext, new C0753(19));
        }
        return interfaceC43593.plus((InterfaceC4359) ref$ObjectRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m10500(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
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
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2a:
            kotlin.AbstractC5184.m10206(r5)
            goto L49
        L2e:
            kotlin.AbstractC5184.m10206(r5)
            r5 = 0
            r0.I$0 = r5
            r0.label = r4
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r5 = new kotlinx.coroutines.飘花落叶言子楪苏兰世哲
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r0 = com.bumptech.glide.AbstractC3054.m6602(r0)
            r5.<init>(r4, r0)
            r5.m10539()
            java.lang.Object r5 = r5.m10536()
            if (r5 != r1) goto L49
            return r1
        L49:
            io.ktor.util.C4210.m8612()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5398.m10500(kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m10501(List list, InterfaceC4356 interfaceC4356) {
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        InterfaceC5407[] interfaceC5407Arr = (InterfaceC5407[]) list.toArray(new InterfaceC5407[0]);
        C5424 c5424 = new C5424(interfaceC5407Arr);
        C5443 c5443 = new C5443(1, AbstractC3054.m6602(interfaceC4356));
        c5443.m10539();
        int length = interfaceC5407Arr.length;
        C5426[] c5426Arr = new C5426[length];
        for (int i = 0; i < length; i++) {
            C5414 c5414 = interfaceC5407Arr[i];
            c5414.start();
            C5426 c5426 = new C5426(c5424, c5443);
            c5426.f15071 = m10493(c5414, c5426);
            c5426Arr[i] = c5426;
        }
        C5425 c5425 = new C5425(c5426Arr);
        for (int i2 = 0; i2 < length; i2++) {
            c5426Arr[i2].m10518(c5425);
        }
        if (c5443.m10535() instanceof InterfaceC5453) {
            c5443.m10538(c5425);
        } else {
            c5425.m10516();
        }
        Object objM10536 = c5443.m10536();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10536;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m10502(InterfaceC5451 interfaceC5451, SuspendLambda suspendLambda) {
        interfaceC5451.mo10252(null);
        Object objMo10558 = interfaceC5451.mo10558(suspendLambda);
        return objMo10558 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo10558 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Object m10503(InterfaceC6553 interfaceC6553, InterfaceC4356 interfaceC4356) throws Throwable {
        C5359 c5359 = new C5359(interfaceC4356, interfaceC4356.getContext());
        Object objM11999 = AbstractC6560.m11999(c5359, true, c5359, interfaceC6553);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11999;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m10504(String str, Throwable th, InterfaceC5451 interfaceC5451) {
        interfaceC5451.mo10252(m10487(str, th));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m10505(InterfaceC5400 interfaceC5400, CancellationException cancellationException) {
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) interfaceC5400.mo2420().get(C5452.f15105);
        if (interfaceC5451 != null) {
            interfaceC5451.mo10252(cancellationException);
        } else {
            C4210.m8602(interfaceC5400, "Scope cannot be cancelled because it does not have a job: ");
        }
    }
}
