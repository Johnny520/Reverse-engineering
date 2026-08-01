package io.ktor.server.response;

import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3057;
import io.ktor.http.content.C3983;
import io.ktor.server.application.InterfaceC4057;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p059.C6857;
import p063.InterfaceC6862;
import p236.C8097;
import p236.C8125;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.response.ApplicationResponseFunctionsKt", f = "ApplicationResponseFunctions.kt", l = {121, Opcodes.MUL_INT_LIT8}, m = "respondText")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ApplicationResponseFunctionsKt$respondText$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ApplicationResponseFunctionsKt$respondText$3(InterfaceC4357<? super ApplicationResponseFunctionsKt$respondText$3> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5087 interfaceC5087M8912;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            C8097 c8097 = (C8097) this.L$2;
            C8125 c8125 = (C8125) this.L$1;
            InterfaceC4057 interfaceC4057 = (InterfaceC4057) this.L$0;
            AbstractC5185.m10210(obj);
            C3983 c3983 = new C3983((String) obj, AbstractC3057.m6755(interfaceC4057, c8125), c8097);
            InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C3983.class);
            try {
                interfaceC5087M8912 = AbstractC4396.m8912(C3983.class);
            } catch (Throwable unused) {
                interfaceC5087M8912 = null;
            }
            C6857 c6857 = new C6857(interfaceC5093Mo8917, interfaceC5087M8912);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (interfaceC4057.mo8462(c3983, c6857, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
