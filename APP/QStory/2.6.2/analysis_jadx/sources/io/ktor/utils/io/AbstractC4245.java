package io.ktor.utils.io;

import com.bumptech.glide.AbstractC3054;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.AbstractC4387;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.io.InterfaceC5480;
import p033.AbstractC6325;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p058.AbstractC6854;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4244 f12750 = new C4244();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m8697(InterfaceC4246 interfaceC4246, InterfaceC5480 interfaceC5480, ContinuationImpl continuationImpl) {
        C4248 c4248 = (C4248) interfaceC4246;
        c4248.m8712().m10609(interfaceC5480);
        Object objM8696 = AbstractC4243.m8696(c4248, continuationImpl);
        return objM8696 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8696 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m8698(InterfaceC4246 interfaceC4246, int i, ContinuationImpl continuationImpl) {
        C4248 c4248 = (C4248) interfaceC4246;
        c4248.m8712().m10611(i);
        Object objM8696 = AbstractC4243.m8696(c4248, continuationImpl);
        return objM8696 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8696 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m8699(InterfaceC4246 interfaceC4246, byte[] bArr, int i, int i2, ContinuationImpl continuationImpl) {
        C4248 c4248 = (C4248) interfaceC4246;
        c4248.m8712().write(bArr, i, i2);
        Object objM8696 = AbstractC4243.m8696(c4248, continuationImpl);
        return objM8696 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8696 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m8700(InterfaceC4246 interfaceC4246, byte b, ContinuationImpl continuationImpl) {
        C4248 c4248 = (C4248) interfaceC4246;
        c4248.m8712().m10610(b);
        Object objM8696 = AbstractC4243.m8696(c4248, continuationImpl);
        return objM8696 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8696 : C5175.f14739;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m8701(final InterfaceC6557 interfaceC6557) throws Throwable {
        InterfaceC4356<C5175> interfaceC4356Create;
        final C4244 c4244 = f12750;
        try {
            c4244.getClass();
            if (interfaceC6557 instanceof BaseContinuationImpl) {
                interfaceC4356Create = ((BaseContinuationImpl) interfaceC6557).create(c4244);
            } else {
                final EmptyCoroutineContext emptyCoroutineContext = c4244.f12749;
                interfaceC4356Create = emptyCoroutineContext == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(c4244, interfaceC6557) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                    final /* synthetic */ InterfaceC6557 $this_createCoroutineUnintercepted$inlined;
                    private int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c4244);
                        this.$this_createCoroutineUnintercepted$inlined = interfaceC6557;
                        c4244.getClass();
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public Object invokeSuspend(Object result) {
                        int i = this.label;
                        if (i != 0) {
                            if (i != 1) {
                                C5919.m11250("This coroutine had already completed");
                                return null;
                            }
                            this.label = 2;
                            AbstractC5184.m10206(result);
                            return result;
                        }
                        this.label = 1;
                        AbstractC5184.m10206(result);
                        this.$this_createCoroutineUnintercepted$inlined.getClass();
                        InterfaceC6557 interfaceC65572 = this.$this_createCoroutineUnintercepted$inlined;
                        AbstractC4387.m8898(1, interfaceC65572);
                        return interfaceC65572.invoke(this);
                    }
                } : new ContinuationImpl(c4244, emptyCoroutineContext, interfaceC6557) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
                    final /* synthetic */ InterfaceC6557 $this_createCoroutineUnintercepted$inlined;
                    private int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c4244, emptyCoroutineContext);
                        this.$this_createCoroutineUnintercepted$inlined = interfaceC6557;
                        c4244.getClass();
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public Object invokeSuspend(Object result) {
                        int i = this.label;
                        if (i != 0) {
                            if (i != 1) {
                                C5919.m11250("This coroutine had already completed");
                                return null;
                            }
                            this.label = 2;
                            AbstractC5184.m10206(result);
                            return result;
                        }
                        this.label = 1;
                        AbstractC5184.m10206(result);
                        this.$this_createCoroutineUnintercepted$inlined.getClass();
                        InterfaceC6557 interfaceC65572 = this.$this_createCoroutineUnintercepted$inlined;
                        AbstractC4387.m8898(1, interfaceC65572);
                        return interfaceC65572.invoke(this);
                    }
                };
            }
            AbstractC5352.m10366(Result.m8755constructorimpl(C5175.f14739), AbstractC3054.m6602(interfaceC4356Create));
        } catch (Throwable th) {
            AbstractC6325.m11871(th, c4244);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8702(InterfaceC4246 interfaceC4246, Throwable th) {
        interfaceC4246.getClass();
        if (th == null) {
            m8701(new ByteWriteChannelOperationsKt$close$1(interfaceC4246));
        } else {
            ((C4248) interfaceC4246).mo8655(th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m8703(InterfaceC4246 interfaceC4246, String str, ContinuationImpl continuationImpl) {
        C4248 c4248 = (C4248) interfaceC4246;
        AbstractC6854.m12058(c4248.m8712(), str, 0, 14);
        Object objM8696 = AbstractC4243.m8696(c4248, continuationImpl);
        return objM8696 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8696 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m8704(InterfaceC4246 interfaceC4246, short s, ContinuationImpl continuationImpl) {
        C4248 c4248 = (C4248) interfaceC4246;
        c4248.m8712().m10607(s);
        Object objM8696 = AbstractC4243.m8696(c4248, continuationImpl);
        return objM8696 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8696 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ C4226 m8705(InterfaceC5400 interfaceC5400, InterfaceC4359 interfaceC4359, InterfaceC6553 interfaceC6553, int i) {
        if ((i & 1) != 0) {
            interfaceC4359 = EmptyCoroutineContext.INSTANCE;
        }
        return m8707(interfaceC5400, interfaceC4359, interfaceC6553);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4226 m8706(InterfaceC5400 interfaceC5400, InterfaceC4359 interfaceC4359, C4248 c4248, InterfaceC6553 interfaceC6553) {
        interfaceC5400.getClass();
        interfaceC4359.getClass();
        C5416 c5416M10473 = AbstractC5398.m10473(interfaceC5400, interfaceC4359, null, new ByteWriteChannelOperationsKt$writer$job$1(interfaceC6553, c4248, null), 2);
        c5416M10473.mo10554(new C4252(c4248, 2));
        return new C4226(c4248, c5416M10473);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4226 m8707(InterfaceC5400 interfaceC5400, InterfaceC4359 interfaceC4359, InterfaceC6553 interfaceC6553) {
        interfaceC5400.getClass();
        interfaceC4359.getClass();
        return m8706(interfaceC5400, interfaceC4359, new C4248(false), interfaceC6553);
    }
}
