package io.ktor.server.response;

import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3065;
import io.ktor.http.content.C3982;
import io.ktor.server.application.InterfaceC4056;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p059.C6856;
import p063.InterfaceC6861;
import p236.C8096;
import p236.C8124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.response.ApplicationResponseFunctionsKt", f = "ApplicationResponseFunctions.kt", l = {121, Opcodes.MUL_INT_LIT8}, m = "respondText")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ApplicationResponseFunctionsKt$respondText$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ApplicationResponseFunctionsKt$respondText$3(InterfaceC4356<? super ApplicationResponseFunctionsKt$respondText$3> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5086 interfaceC5086M8922;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            C8096 c8096 = (C8096) this.L$2;
            C8124 c8124 = (C8124) this.L$1;
            InterfaceC4056 interfaceC4056 = (InterfaceC4056) this.L$0;
            AbstractC5184.m10206(obj);
            C3982 c3982 = new C3982((String) obj, AbstractC3065.m6837(interfaceC4056, c8124), c8096);
            InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C3982.class);
            try {
                interfaceC5086M8922 = AbstractC4395.m8922(C3982.class);
            } catch (Throwable unused) {
                interfaceC5086M8922 = null;
            }
            C6856 c6856 = new C6856(interfaceC5092Mo8927, interfaceC5086M8922);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (interfaceC4056.mo8472(c3982, c6856, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
