package io.ktor.utils.p007io;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.window.area.AbstractC3400;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.AbstractC5220;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.p010io.InterfaceC6313;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p074.AbstractC7684;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5078 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5077 f13099 = new C5077();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m9246(InterfaceC5079 interfaceC5079, InterfaceC6313 interfaceC6313, ContinuationImpl continuationImpl) {
        C5081 c5081 = (C5081) interfaceC5079;
        c5081.m9261().m11172(interfaceC6313);
        Object objM9245 = AbstractC5076.m9245(c5081, continuationImpl);
        return objM9245 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9245 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m9247(InterfaceC5079 interfaceC5079, int i, ContinuationImpl continuationImpl) {
        C5081 c5081 = (C5081) interfaceC5079;
        c5081.m9261().m11174(i);
        Object objM9245 = AbstractC5076.m9245(c5081, continuationImpl);
        return objM9245 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9245 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Object m9248(InterfaceC5079 interfaceC5079, byte[] bArr, int i, int i2, ContinuationImpl continuationImpl) {
        C5081 c5081 = (C5081) interfaceC5079;
        c5081.m9261().write(bArr, i, i2);
        Object objM9245 = AbstractC5076.m9245(c5081, continuationImpl);
        return objM9245 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9245 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m9249(InterfaceC5079 interfaceC5079, byte b, ContinuationImpl continuationImpl) {
        C5081 c5081 = (C5081) interfaceC5079;
        c5081.m9261().m11173(b);
        Object objM9245 = AbstractC5076.m9245(c5081, continuationImpl);
        return objM9245 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9245 : C6008.f15084;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m9250(final InterfaceC7387 interfaceC7387) throws Throwable {
        InterfaceC5189<C6008> interfaceC5189Create;
        final C5077 c5077 = f13099;
        try {
            c5077.getClass();
            if (interfaceC7387 instanceof BaseContinuationImpl) {
                interfaceC5189Create = ((BaseContinuationImpl) interfaceC7387).create(c5077);
            } else {
                final EmptyCoroutineContext emptyCoroutineContext = c5077.f13098;
                interfaceC5189Create = emptyCoroutineContext == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(c5077, interfaceC7387) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                    final /* synthetic */ InterfaceC7387 $this_createCoroutineUnintercepted$inlined;
                    private int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c5077);
                        this.$this_createCoroutineUnintercepted$inlined = interfaceC7387;
                        c5077.getClass();
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public Object invokeSuspend(Object result) {
                        int i = this.label;
                        if (i != 0) {
                            if (i != 1) {
                                C6755.m11870("This coroutine had already completed");
                                return null;
                            }
                            this.label = 2;
                            AbstractC6017.m10769(result);
                            return result;
                        }
                        this.label = 1;
                        AbstractC6017.m10769(result);
                        this.$this_createCoroutineUnintercepted$inlined.getClass();
                        InterfaceC7387 interfaceC73872 = this.$this_createCoroutineUnintercepted$inlined;
                        AbstractC5220.m9447(1, interfaceC73872);
                        return interfaceC73872.invoke(this);
                    }
                } : new ContinuationImpl(c5077, emptyCoroutineContext, interfaceC7387) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
                    final /* synthetic */ InterfaceC7387 $this_createCoroutineUnintercepted$inlined;
                    private int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(c5077, emptyCoroutineContext);
                        this.$this_createCoroutineUnintercepted$inlined = interfaceC7387;
                        c5077.getClass();
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public Object invokeSuspend(Object result) {
                        int i = this.label;
                        if (i != 0) {
                            if (i != 1) {
                                C6755.m11870("This coroutine had already completed");
                                return null;
                            }
                            this.label = 2;
                            AbstractC6017.m10769(result);
                            return result;
                        }
                        this.label = 1;
                        AbstractC6017.m10769(result);
                        this.$this_createCoroutineUnintercepted$inlined.getClass();
                        InterfaceC7387 interfaceC73872 = this.$this_createCoroutineUnintercepted$inlined;
                        AbstractC5220.m9447(1, interfaceC73872);
                        return interfaceC73872.invoke(this);
                    }
                };
            }
            AbstractC6185.m10929(Result.m9304constructorimpl(C6008.f15084), AbstractC3400.m5624(interfaceC5189Create));
        } catch (Throwable th) {
            AbstractC1298.m1735(th, c5077);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m9251(InterfaceC5079 interfaceC5079, Throwable th) {
        interfaceC5079.getClass();
        if (th == null) {
            m9250(new ByteWriteChannelOperationsKt$close$1(interfaceC5079));
        } else {
            ((C5081) interfaceC5079).mo9204(th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m9252(InterfaceC5079 interfaceC5079, String str, ContinuationImpl continuationImpl) {
        C5081 c5081 = (C5081) interfaceC5079;
        AbstractC7684.m12645(c5081.m9261(), str, 0, 14);
        Object objM9245 = AbstractC5076.m9245(c5081, continuationImpl);
        return objM9245 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9245 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Object m9253(InterfaceC5079 interfaceC5079, short s, ContinuationImpl continuationImpl) {
        C5081 c5081 = (C5081) interfaceC5079;
        c5081.m9261().m11170(s);
        Object objM9245 = AbstractC5076.m9245(c5081, continuationImpl);
        return objM9245 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9245 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ C5059 m9254(InterfaceC6233 interfaceC6233, InterfaceC5192 interfaceC5192, InterfaceC7383 interfaceC7383, int i) {
        if ((i & 1) != 0) {
            interfaceC5192 = EmptyCoroutineContext.INSTANCE;
        }
        return m9256(interfaceC6233, interfaceC5192, interfaceC7383);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5059 m9255(InterfaceC6233 interfaceC6233, InterfaceC5192 interfaceC5192, C5081 c5081, InterfaceC7383 interfaceC7383) {
        interfaceC6233.getClass();
        interfaceC5192.getClass();
        C6249 c6249M11036 = AbstractC6231.m11036(interfaceC6233, interfaceC5192, null, new ByteWriteChannelOperationsKt$writer$job$1(interfaceC7383, c5081, null), 2);
        c6249M11036.mo11118(new C5085(c5081, 2));
        return new C5059(c5081, c6249M11036);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C5059 m9256(InterfaceC6233 interfaceC6233, InterfaceC5192 interfaceC5192, InterfaceC7383 interfaceC7383) {
        interfaceC6233.getClass();
        interfaceC5192.getClass();
        return m9255(interfaceC6233, interfaceC5192, new C5081(false), interfaceC7383);
    }
}
