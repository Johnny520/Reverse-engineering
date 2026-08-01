package io.ktor.client.engine.cio;

import io.ktor.client.plugins.sse.C4738;
import io.ktor.http.cio.AbstractC4805;
import io.ktor.http.cio.C4795;
import io.ktor.http.cio.C4803;
import io.ktor.http.cio.C4806;
import io.ktor.http.cio.internals.C4786;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5083;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import io.ktor.websocket.C5097;
import java.io.EOFException;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.InterfaceC6233;
import p050.AbstractC7176;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8927;
import p252.C8928;
import p252.C8946;
import p257.AbstractC8967;
import p257.C8966;
import p257.C8968;
import p257.C8971;
import p259.C8976;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2", m556f = "utils.kt", m557l = {173}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;"}, m152k = 3, m153mv = {2, 0, 0})
final class UtilsKt$readResponse$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5192 $callContext;
    final /* synthetic */ InterfaceC5084 $input;
    final /* synthetic */ InterfaceC5079 $output;
    final /* synthetic */ C8968 $request;
    final /* synthetic */ C8976 $requestTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$readResponse$2(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, InterfaceC5192 interfaceC5192, C8976 c8976, C8968 c8968, InterfaceC5189<? super UtilsKt$readResponse$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$input = interfaceC5084;
        this.$output = interfaceC5079;
        this.$callContext = interfaceC5192;
        this.$requestTime = c8976;
        this.$request = c8968;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new UtilsKt$readResponse$2(this.$input, this.$output, this.$callContext, this.$requestTime, this.$request, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C8966> interfaceC5189) {
        return ((UtilsKt$readResponse$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8926;
        C8927 c8927;
        InterfaceC5084 interfaceC5084;
        C8926 c8926;
        Object obj2;
        String string;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5084 interfaceC50842 = this.$input;
            this.label = 1;
            objM8926 = AbstractC4805.m8926(interfaceC50842, this);
            if (objM8926 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            objM8926 = obj;
        }
        C4795 c4795 = (C4795) objM8926;
        if (c4795 == null) {
            throw new EOFException("Failed to parse HTTP response: the server prematurely closed the connection");
        }
        C4806 c4806 = c4795.f12562;
        InterfaceC5084 interfaceC50843 = this.$input;
        InterfaceC5079 interfaceC5079 = this.$output;
        InterfaceC5192 interfaceC5192 = this.$callContext;
        C8976 c8976 = this.$requestTime;
        C8968 c8968 = this.$request;
        try {
            C8926 c89262 = new C8926(c4795.f12541, c4795.f12540.toString());
            String[] strArr = AbstractC8944.f22758;
            C4786 c4786M8939 = c4806.m8939("Content-Length");
            long j = (c4786M8939 == null || (string = c4786M8939.toString()) == null) ? -1L : Long.parseLong(string);
            C4786 c4786M89392 = c4806.m8939("Transfer-Encoding");
            String string2 = c4786M89392 != null ? c4786M89392.toString() : null;
            C4803 c4803 = C4803.f12556;
            C4803 c4803M14253 = AbstractC9019.m14253(c4806.m8939("Connection"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = c4806.f12566;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i2;
                String string3 = c4806.m8938(i3).toString();
                C4806 c48062 = c4806;
                String string4 = c4806.m8935(i3).toString();
                int i5 = i3;
                List list = (List) linkedHashMap.get(string3);
                if ((list != null ? Boolean.valueOf(list.add(string4)) : null) == null) {
                    linkedHashMap.put(string3, AbstractC7176.m12475(string4));
                }
                i3 = i5 + 1;
                i2 = i4;
                c4806 = c48062;
            }
            C8946 c8946 = new C8946(linkedHashMap);
            C8927 c8927M12600 = AbstractC7390.m12600(c4795.f12542);
            if (c89262.equals(C8926.f22697)) {
                interfaceC50843.getClass();
                interfaceC5079.getClass();
                interfaceC5192.getClass();
                C8966 c8966 = new C8966(c89262, c8976, c8946, c8927M12600, new C5097(interfaceC50843, interfaceC5079, 2147483647L, true, interfaceC5192), interfaceC5192);
                c4795.close();
                return c8966;
            }
            C8946 c89462 = c8946;
            if (AbstractC5227.m9466(c8968.f22798, C8928.f22717) || AbstractC7176.m12490(C8926.f22701, C8926.f22700).contains(c89262)) {
                c8927 = c8927M12600;
                InterfaceC5084.f13114.getClass();
                interfaceC5084 = C5083.f13112;
            } else {
                if (!(c89262.f22704 / 100 == 1)) {
                    c8927 = c8927M12600;
                    interfaceC5084 = AbstractC5078.m9254(AbstractC6231.m11048(interfaceC5192.plus(new C6234("Response"))), null, new UtilsKt$readResponse$2$1$body$httpBodyParser$1(c8927, j, string2, c4803M14253, interfaceC50843, null), 1).f13073;
                }
            }
            InterfaceC5084 interfaceC50844 = interfaceC5084;
            if (((C8971) c8968.f22794.m9146(AbstractC8967.f22793)) != null) {
                c8926 = c89262;
                C4738 c4738M14155 = C8971.m14155(c8968, c8926, c89462, interfaceC50844, c8968.f22796, interfaceC5192);
                c89462 = c89462;
                interfaceC5192 = interfaceC5192;
                if (c4738M14155 != null) {
                    obj2 = c4738M14155;
                }
                C8966 c89662 = new C8966(c8926, c8976, c89462, c8927, obj2, interfaceC5192);
                c4795.close();
                return c89662;
            }
            c8926 = c89262;
            obj2 = interfaceC50844;
            C8966 c896622 = new C8966(c8926, c8976, c89462, c8927, obj2, interfaceC5192);
            c4795.close();
            return c896622;
        } finally {
        }
    }
}
