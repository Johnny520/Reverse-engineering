package io.ktor.server.engine;

import io.ktor.server.cio.C4913;
import java.util.Locale;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p268.AbstractC9015;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.EmbeddedServer$start$3", m556f = "EmbeddedServerJvm.kt", m557l = {285}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class EmbeddedServer$start$3 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C4934 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedServer$start$3(C4934 c4934, InterfaceC5189<? super EmbeddedServer$start$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c4934;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new EmbeddedServer$start$3(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((EmbeddedServer$start$3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C4913 c4913 = this.this$0.f12803;
            this.label = 1;
            obj = c4913.f12773.m11132(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C4934 c4934 = this.this$0;
        for (InterfaceC4937 interfaceC4937 : (Iterable) obj) {
            String strMo9059 = interfaceC4937.mo9059();
            String str = AbstractC9015.f22902;
            strMo9059.getClass();
            if (AbstractC5976.m10735(AbstractC9015.f22902, "windows", false) && strMo9059.equals("0.0.0.0")) {
                strMo9059 = "127.0.0.1";
            }
            InterfaceC9970 interfaceC9970 = c4934.f12800.f12782;
            StringBuilder sb = new StringBuilder("Responding at ");
            String lowerCase = interfaceC4937.getType().f12822.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            sb.append(lowerCase);
            sb.append("://");
            sb.append(strMo9059);
            sb.append(':');
            sb.append(interfaceC4937.mo9060());
            interfaceC9970.info(sb.toString());
        }
        return C6008.f15084;
    }
}
