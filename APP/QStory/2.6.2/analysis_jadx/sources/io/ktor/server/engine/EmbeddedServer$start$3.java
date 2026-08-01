package io.ktor.server.engine;

import io.ktor.server.cio.C4080;
import java.util.Locale;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p252.AbstractC8185;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.EmbeddedServer$start$3", f = "EmbeddedServerJvm.kt", l = {285}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class EmbeddedServer$start$3 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ C4101 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedServer$start$3(C4101 c4101, InterfaceC4356<? super EmbeddedServer$start$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4101;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new EmbeddedServer$start$3(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((EmbeddedServer$start$3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4080 c4080 = this.this$0.f12454;
            this.label = 1;
            obj = c4080.f12424.m10570(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C4101 c4101 = this.this$0;
        for (InterfaceC4104 interfaceC4104 : (Iterable) obj) {
            String strMo8510 = interfaceC4104.mo8510();
            String str = AbstractC8185.f22558;
            strMo8510.getClass();
            if (AbstractC5143.m10171(AbstractC8185.f22558, "windows", false) && strMo8510.equals("0.0.0.0")) {
                strMo8510 = "127.0.0.1";
            }
            InterfaceC9156 interfaceC9156 = c4101.f12451.f12433;
            StringBuilder sb = new StringBuilder("Responding at ");
            String lowerCase = interfaceC4104.getType().f12473.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            sb.append(lowerCase);
            sb.append("://");
            sb.append(strMo8510);
            sb.append(':');
            sb.append(interfaceC4104.mo8511());
            interfaceC9156.info(sb.toString());
        }
        return C5175.f14739;
    }
}
