package io.ktor.server.routing;

import com.materialkolor.dynamiccolor.C4639;
import io.ktor.server.application.C4888;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.request.C4962;
import io.ktor.server.response.C4967;
import io.ktor.util.C5041;
import io.ktor.util.C5043;
import io.ktor.util.debug.AbstractC5020;
import io.ktor.util.pipeline.AbstractC5026;
import java.util.ArrayList;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p050.AbstractC7176;
import p075.C7686;
import p252.InterfaceC8924;
import p256.C8964;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4977 extends C4986 implements InterfaceC5000 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C5041 f12910;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final ArrayList f12912;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C4890 f12913;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C4978 f12909 = new C4978();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final C8964 f12908 = new C8964();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final C8964 f12911 = new C8964();

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C4977.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C4977.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12910 = new C5041("Routing", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4977(C4890 c4890) {
        super(null, new C5003(c4890.f12687), c4890.f12685, c4890.f12686);
        c4890.getClass();
        this.f12913 = c4890;
        ArrayList arrayList = new ArrayList();
        this.f12912 = arrayList;
        arrayList.add(new C4639(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9092(AbstractC5026 abstractC5026, C4986 c4986, InterfaceC8924 interfaceC8924, ContinuationImpl continuationImpl) throws Throwable {
        RoutingRoot$executeResult$1 routingRoot$executeResult$1;
        C4995 c4995;
        C4977 c4977 = this;
        if (continuationImpl instanceof RoutingRoot$executeResult$1) {
            routingRoot$executeResult$1 = (RoutingRoot$executeResult$1) continuationImpl;
            int i = routingRoot$executeResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routingRoot$executeResult$1.label = i - Integer.MIN_VALUE;
            } else {
                routingRoot$executeResult$1 = new RoutingRoot$executeResult$1(c4977, continuationImpl);
            }
        }
        RoutingRoot$executeResult$1 routingRoot$executeResult$12 = routingRoot$executeResult$1;
        Object obj = routingRoot$executeResult$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routingRoot$executeResult$12.label;
        C8964 c8964 = f12911;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4995 c49952 = (C4995) routingRoot$executeResult$12.L$1;
            C4977 c49772 = (C4977) routingRoot$executeResult$12.L$0;
            try {
                AbstractC6017.m10769(obj);
                c4995 = c49952;
                c4977 = c49772;
                c4977.f12913.f12691.m14091(c8964, c4995);
                return C6008.f15084;
            } catch (Throwable th) {
                th = th;
                c4995 = c49952;
                c4977 = c49772;
                c4977.f12913.f12691.m14091(c8964, c4995);
                throw th;
            }
        }
        AbstractC6017.m10769(obj);
        C4888 c4888 = c4986.f12925;
        if (c4888 == null) {
            c4888 = new C4888(c4986.f12685, AbstractC4976.m9091(c4986).f12686);
            ArrayList arrayList = new ArrayList();
            for (C4986 c49862 = c4986; c49862 != null; c49862 = c49862.f12923) {
                arrayList.add(c49862);
            }
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                C4888 c48882 = (C4888) arrayList.get(size);
                c4888.m9136(c48882);
                c4888.f12683.m9136(c48882.f12683);
                c4888.f12684.m9136(c48882.f12684);
            }
            ArrayList arrayList2 = c4986.f12924;
            int iM12460 = AbstractC7176.m12460(arrayList2);
            if (iM12460 >= 0) {
                int i3 = 0;
                while (true) {
                    c4888.m9138(C4888.f12679, new RoutingNode$buildPipeline$1$1(arrayList2, i3, null));
                    if (i3 == iM12460) {
                        break;
                    }
                    i3++;
                }
            }
            c4986.f12925 = c4888;
        }
        C4888 c48883 = c4888;
        Object obj2 = abstractC5026.f13009;
        C4962 c4962Mo939 = ((InterfaceC4897) obj2).mo9018().mo939();
        C4962 c4962 = c48883.f12683;
        int i4 = c4962Mo939.f13013;
        boolean z = c4977.f12685;
        if (i4 != 0) {
            if (c4962.f13013 == 0) {
                c4962 = c4962Mo939;
            } else {
                C4962 c49622 = new C4962(z);
                c49622.m9136(c4962Mo939);
                c49622.m9136(c4962);
                c4962 = c49622;
            }
        }
        InterfaceC4897 interfaceC4897 = (InterfaceC4897) obj2;
        C4967 c4967Mo940 = interfaceC4897.mo9020().mo940();
        C4967 c4967 = c48883.f12684;
        if (c4967Mo940.f13013 != 0) {
            if (c4967.f13013 == 0) {
                c4967 = c4967Mo940;
            } else {
                C4967 c49672 = new C4967(z);
                c49672.m9136(c4967Mo940);
                c49672.m9136(c4967);
                c4967 = c49672;
            }
        }
        C4988 c4988 = new C4988(interfaceC4897, c4986, abstractC5026.mo2990(), c4962, c4967, interfaceC8924);
        c4995 = new C4995(c4988);
        c4977.f12913.f12691.m14091(f12908, c4995);
        try {
            RoutingRoot$executeResult$$inlined$execute$1 routingRoot$executeResult$$inlined$execute$1 = new RoutingRoot$executeResult$$inlined$execute$1(c48883, c4988, null);
            routingRoot$executeResult$12.L$0 = c4977;
            routingRoot$executeResult$12.L$1 = c4995;
            routingRoot$executeResult$12.label = 1;
            if (AbstractC5020.m9114(routingRoot$executeResult$$inlined$execute$1, routingRoot$executeResult$12) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c4977.f12913.f12691.m14091(c8964, c4995);
            return C6008.f15084;
        } catch (Throwable th2) {
            th = th2;
            c4977.f12913.f12691.m14091(c8964, c4995);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9093(AbstractC5026 abstractC5026, ContinuationImpl continuationImpl) {
        RoutingRoot$interceptor$1 routingRoot$interceptor$1;
        if (continuationImpl instanceof RoutingRoot$interceptor$1) {
            routingRoot$interceptor$1 = (RoutingRoot$interceptor$1) continuationImpl;
            int i = routingRoot$interceptor$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routingRoot$interceptor$1.label = i - Integer.MIN_VALUE;
            } else {
                routingRoot$interceptor$1 = new RoutingRoot$interceptor$1(this, continuationImpl);
            }
        }
        Object objM9088 = routingRoot$interceptor$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routingRoot$interceptor$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9088);
            C4974 c4974 = new C4974(this, (InterfaceC4897) abstractC5026.f13009, this.f12912);
            routingRoot$interceptor$1.L$0 = this;
            routingRoot$interceptor$1.L$1 = abstractC5026;
            routingRoot$interceptor$1.label = 1;
            objM9088 = c4974.m9088(routingRoot$interceptor$1);
            if (objM9088 != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(objM9088);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        abstractC5026 = (AbstractC5026) routingRoot$interceptor$1.L$1;
        this = (C4977) routingRoot$interceptor$1.L$0;
        AbstractC6017.m10769(objM9088);
        AbstractC4971 abstractC4971 = (AbstractC4971) objM9088;
        if (!(abstractC4971 instanceof C4972)) {
            if (abstractC4971 instanceof C4973) {
                ((InterfaceC4897) abstractC5026.f13009).getAttributes().m9145(AbstractC4976.f12907, ((C4973) abstractC4971).f12894);
                return c6008;
            }
            C5043.m9170();
            return null;
        }
        C4986 c4986 = abstractC4971.f12891;
        InterfaceC8924 interfaceC8924 = ((C4972) abstractC4971).f12893;
        routingRoot$interceptor$1.L$0 = null;
        routingRoot$interceptor$1.L$1 = null;
        routingRoot$interceptor$1.label = 2;
        return this.m9092(abstractC5026, c4986, interfaceC8924, routingRoot$interceptor$1) == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
