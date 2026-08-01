package io.ktor.utils.io;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.window.area.AbstractC2567;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.AbstractC4388;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.io.InterfaceC5481;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p058.AbstractC6855;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4245 f12754 = new C4245();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m8687(InterfaceC4247 interfaceC4247, InterfaceC5481 interfaceC5481, ContinuationImpl continuationImpl) {
        C4249 c4249 = (C4249) interfaceC4247;
        c4249.m8702().m10613(interfaceC5481);
        Object objM8686 = AbstractC4244.m8686(c4249, continuationImpl);
        return objM8686 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8686 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m8688(InterfaceC4247 interfaceC4247, int i, ContinuationImpl continuationImpl) {
        C4249 c4249 = (C4249) interfaceC4247;
        c4249.m8702().m10615(i);
        Object objM8686 = AbstractC4244.m8686(c4249, continuationImpl);
        return objM8686 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8686 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m8689(InterfaceC4247 interfaceC4247, byte[] bArr, int i, int i2, ContinuationImpl continuationImpl) {
        C4249 c4249 = (C4249) interfaceC4247;
        c4249.m8702().write(bArr, i, i2);
        Object objM8686 = AbstractC4244.m8686(c4249, continuationImpl);
        return objM8686 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8686 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m8690(InterfaceC4247 interfaceC4247, byte b, ContinuationImpl continuationImpl) {
        C4249 c4249 = (C4249) interfaceC4247;
        c4249.m8702().m10614(b);
        Object objM8686 = AbstractC4244.m8686(c4249, continuationImpl);
        return objM8686 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8686 : C5176.f14739;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m8691(final InterfaceC6558 interfaceC6558) throws Throwable {
        InterfaceC4357<C5176> interfaceC4357Create;
        final C4245 c4245 = f12754;
        try {
            c4245.getClass();
            if (interfaceC6558 instanceof BaseContinuationImpl) {
                interfaceC4357Create = ((BaseContinuationImpl) interfaceC6558).create(c4245);
            } else {
                final EmptyCoroutineContext emptyCoroutineContext = c4245.f12753;
                interfaceC4357Create = emptyCoroutineContext == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(c4245, interfaceC6558) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                    final /* synthetic */ InterfaceC6558 $this_createCoroutineUnintercepted$inlined;
                    private int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c4245);
                        this.$this_createCoroutineUnintercepted$inlined = interfaceC6558;
                        c4245.getClass();
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public Object invokeSuspend(Object result) {
                        int i = this.label;
                        if (i != 0) {
                            if (i != 1) {
                                C5925.m11311("This coroutine had already completed");
                                return null;
                            }
                            this.label = 2;
                            AbstractC5185.m10210(result);
                            return result;
                        }
                        this.label = 1;
                        AbstractC5185.m10210(result);
                        this.$this_createCoroutineUnintercepted$inlined.getClass();
                        InterfaceC6558 interfaceC65582 = this.$this_createCoroutineUnintercepted$inlined;
                        AbstractC4388.m8888(1, interfaceC65582);
                        return interfaceC65582.invoke(this);
                    }
                } : new ContinuationImpl(c4245, emptyCoroutineContext, interfaceC6558) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
                    final /* synthetic */ InterfaceC6558 $this_createCoroutineUnintercepted$inlined;
                    private int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c4245, emptyCoroutineContext);
                        this.$this_createCoroutineUnintercepted$inlined = interfaceC6558;
                        c4245.getClass();
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public Object invokeSuspend(Object result) {
                        int i = this.label;
                        if (i != 0) {
                            if (i != 1) {
                                C5925.m11311("This coroutine had already completed");
                                return null;
                            }
                            this.label = 2;
                            AbstractC5185.m10210(result);
                            return result;
                        }
                        this.label = 1;
                        AbstractC5185.m10210(result);
                        this.$this_createCoroutineUnintercepted$inlined.getClass();
                        InterfaceC6558 interfaceC65582 = this.$this_createCoroutineUnintercepted$inlined;
                        AbstractC4388.m8888(1, interfaceC65582);
                        return interfaceC65582.invoke(this);
                    }
                };
            }
            AbstractC5353.m10370(Result.m8745constructorimpl(C5176.f14739), AbstractC2567.m5064(interfaceC4357Create));
        } catch (Throwable th) {
            AbstractC0455.m1175(th, c4245);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8692(InterfaceC4247 interfaceC4247, Throwable th) {
        interfaceC4247.getClass();
        if (th == null) {
            m8691(new ByteWriteChannelOperationsKt$close$1(interfaceC4247));
        } else {
            ((C4249) interfaceC4247).mo8645(th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m8693(InterfaceC4247 interfaceC4247, String str, ContinuationImpl continuationImpl) {
        C4249 c4249 = (C4249) interfaceC4247;
        AbstractC6855.m12086(c4249.m8702(), str, 0, 14);
        Object objM8686 = AbstractC4244.m8686(c4249, continuationImpl);
        return objM8686 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8686 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m8694(InterfaceC4247 interfaceC4247, short s, ContinuationImpl continuationImpl) {
        C4249 c4249 = (C4249) interfaceC4247;
        c4249.m8702().m10611(s);
        Object objM8686 = AbstractC4244.m8686(c4249, continuationImpl);
        return objM8686 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8686 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ C4227 m8695(InterfaceC5401 interfaceC5401, InterfaceC4360 interfaceC4360, InterfaceC6554 interfaceC6554, int i) {
        if ((i & 1) != 0) {
            interfaceC4360 = EmptyCoroutineContext.INSTANCE;
        }
        return m8697(interfaceC5401, interfaceC4360, interfaceC6554);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4227 m8696(InterfaceC5401 interfaceC5401, InterfaceC4360 interfaceC4360, C4249 c4249, InterfaceC6554 interfaceC6554) {
        interfaceC5401.getClass();
        interfaceC4360.getClass();
        C5417 c5417M10477 = AbstractC5399.m10477(interfaceC5401, interfaceC4360, null, new ByteWriteChannelOperationsKt$writer$job$1(interfaceC6554, c4249, null), 2);
        c5417M10477.mo10559(new C4253(c4249, 2));
        return new C4227(c4249, c5417M10477);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4227 m8697(InterfaceC5401 interfaceC5401, InterfaceC4360 interfaceC4360, InterfaceC6554 interfaceC6554) {
        interfaceC5401.getClass();
        interfaceC4360.getClass();
        return m8696(interfaceC5401, interfaceC4360, new C4249(false), interfaceC6554);
    }
}
