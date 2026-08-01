package io.ktor.server.response;

import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3889;
import io.ktor.http.content.C4815;
import io.ktor.server.application.InterfaceC4889;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p075.C7686;
import p079.InterfaceC7691;
import p252.C8926;
import p252.C8954;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.response.ApplicationResponseFunctionsKt", m556f = "ApplicationResponseFunctions.kt", m557l = {121, Opcodes.MUL_INT_LIT8}, m558m = "respondText")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ApplicationResponseFunctionsKt$respondText$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ApplicationResponseFunctionsKt$respondText$3(InterfaceC5189<? super ApplicationResponseFunctionsKt$respondText$3> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5919 interfaceC5919M9471;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            C8926 c8926 = (C8926) this.L$2;
            C8954 c8954 = (C8954) this.L$1;
            InterfaceC4889 interfaceC4889 = (InterfaceC4889) this.L$0;
            AbstractC6017.m10769(obj);
            C4815 c4815 = new C4815((String) obj, AbstractC3889.m7315(interfaceC4889, c8954), c8926);
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C4815.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(C4815.class);
            } catch (Throwable unused) {
                interfaceC5919M9471 = null;
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (interfaceC4889.mo9021(c4815, c7686, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
