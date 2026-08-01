package io.ktor.server.cio;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.network.sockets.AbstractC4855;
import io.ktor.network.sockets.C4857;
import io.ktor.network.sockets.C4861;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.InterfaceC4887;
import io.ktor.server.cio.backend.AbstractC4908;
import io.ktor.server.engine.C4938;
import io.ktor.server.engine.C4939;
import io.ktor.server.engine.InterfaceC4937;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5177;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6271;
import kotlinx.coroutines.InterfaceC6273;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.CIOApplicationEngine$initServerJob$1", m556f = "CIOApplicationEngine.kt", m557l = {Opcodes.ADD_DOUBLE_2ADDR, Opcodes.OR_INT_LIT16, Opcodes.OR_INT_LIT8}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CIOApplicationEngine$initServerJob$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6273 $cioConnectors;
    final /* synthetic */ InterfaceC4887 $environment;
    final /* synthetic */ InterfaceC6273 $startupJob;
    final /* synthetic */ InterfaceC6271 $stopRequest;
    final /* synthetic */ AbstractC6264 $userDispatcher;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C4913 this$0;

    /* JADX INFO: renamed from: io.ktor.server.cio.CIOApplicationEngine$initServerJob$1$5 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.server.cio.CIOApplicationEngine$initServerJob$1$5", m556f = "CIOApplicationEngine.kt", m557l = {}, m558m = "invokeSuspend")
    public static final class C03665 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC4887 $environment;
        int label;
        final /* synthetic */ C4913 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03665(C4913 c4913, InterfaceC4887 interfaceC4887, InterfaceC5189<? super C03665> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c4913;
            this.$environment = interfaceC4887;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C03665(this.this$0, this.$environment, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03665) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.this$0.f12775.m14091(AbstractC4892.f12700, this.$environment);
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$initServerJob$1(C4913 c4913, InterfaceC6273 interfaceC6273, InterfaceC6271 interfaceC6271, InterfaceC6273 interfaceC62732, AbstractC6264 abstractC6264, InterfaceC4887 interfaceC4887, InterfaceC5189<? super CIOApplicationEngine$initServerJob$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c4913;
        this.$cioConnectors = interfaceC6273;
        this.$stopRequest = interfaceC6271;
        this.$startupJob = interfaceC62732;
        this.$userDispatcher = abstractC6264;
        this.$environment = interfaceC4887;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CIOApplicationEngine$initServerJob$1 cIOApplicationEngine$initServerJob$1 = new CIOApplicationEngine$initServerJob$1(this.this$0, this.$cioConnectors, this.$stopRequest, this.$startupJob, this.$userDispatcher, this.$environment, interfaceC5189);
        cIOApplicationEngine$initServerJob$1.L$0 = obj;
        return cIOApplicationEngine$initServerJob$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CIOApplicationEngine$initServerJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01f1: INVOKE (r2 I:java.util.Iterator) = (r12 I:java.lang.Iterable) INTERFACE call: java.lang.Iterable.iterator():java.util.Iterator A[MD:():java.util.Iterator<T> (c)] (LINE:498), block:B:66:0x01f1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x003d, B:41:0x013c, B:35:0x0109, B:37:0x010f, B:42:0x0146, B:43:0x0157, B:45:0x015d, B:47:0x0177, B:50:0x017d, B:51:0x018f, B:52:0x0196, B:53:0x0197, B:18:0x005e, B:19:0x0068, B:21:0x006e, B:24:0x0081, B:25:0x0088, B:26:0x0089, B:27:0x009c, B:29:0x00a2, B:30:0x00d1, B:31:0x00e0, B:33:0x00e6, B:34:0x00f6), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:13:0x003d, B:41:0x013c, B:35:0x0109, B:37:0x010f, B:42:0x0146, B:43:0x0157, B:45:0x015d, B:47:0x0177, B:50:0x017d, B:51:0x018f, B:52:0x0196, B:53:0x0197, B:18:0x005e, B:19:0x0068, B:21:0x006e, B:24:0x0081, B:25:0x0088, B:26:0x0089, B:27:0x009c, B:29:0x00a2, B:30:0x00d1, B:31:0x00e0, B:33:0x00e6, B:34:0x00f6), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8 A[LOOP:0: B:59:0x01c2->B:61:0x01c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013b -> B:41:0x013c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? it;
        ArrayList arrayList;
        Collection arrayList2;
        Iterator it2;
        ArrayList<C4916> arrayList3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
                arrayList = new ArrayList(this.this$0.f12737.f12743.size());
                Iterator it3 = this.this$0.f12737.f12743.iterator();
                while (it3.hasNext()) {
                    if (AbstractC5227.m9466(((InterfaceC4937) it3.next()).getType(), C4939.f12820)) {
                        throw new UnsupportedOperationException("CIO Engine does not currently support HTTPS. Please consider using a different engine if you require HTTPS");
                    }
                }
                C4913 c4913 = this.this$0;
                ArrayList<InterfaceC4937> arrayList4 = c4913.f12737.f12743;
                ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(arrayList4, 10));
                for (InterfaceC4937 interfaceC4937 : arrayList4) {
                    arrayList5.add(new Pair(interfaceC4937, AbstractC4908.m9036(interfaceC6233, new C4918(interfaceC4937.mo9059(), interfaceC4937.mo9060(), c4913.f12737.f12742), new CIOApplicationEngine$startConnector$1(c4913, null))));
                }
                ArrayList arrayList6 = new ArrayList(AbstractC5177.m9381(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add((C4916) ((Pair) it4.next()).getSecond());
                }
                arrayList.addAll(arrayList6);
                arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList5, 10));
                it2 = arrayList5.iterator();
                if (it2.hasNext()) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        AbstractC6017.m10769(obj);
                        return c6008;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList3 = (ArrayList) this.L$0;
                AbstractC6017.m10769(obj);
                for (C4916 c4916 : arrayList3) {
                    c4916.f12751.mo10815(null);
                    c4916.f12752.mo10815(null);
                }
                AbstractC6264 abstractC6264 = this.$userDispatcher;
                C03665 c03665 = new C03665(this.this$0, this.$environment, null);
                this.L$0 = null;
                this.label = 3;
                return AbstractC6231.m11029(abstractC6264, c03665, this) != coroutineSingletons ? coroutineSingletons : c6008;
            }
            arrayList2 = (Collection) this.L$4;
            InterfaceC4937 interfaceC49372 = (InterfaceC4937) this.L$3;
            it2 = (Iterator) this.L$2;
            Collection collection = (Collection) this.L$1;
            arrayList = (ArrayList) this.L$0;
            AbstractC6017.m10769(obj);
            Object objM11132 = obj;
            arrayList2.add(new Pair(interfaceC49372, objM11132));
            arrayList2 = collection;
            if (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                interfaceC49372 = (InterfaceC4937) pair.component1();
                C6270 c6270 = ((C4916) pair.component2()).f12750;
                this.L$0 = arrayList;
                this.L$1 = arrayList2;
                this.L$2 = it2;
                this.L$3 = interfaceC49372;
                this.L$4 = arrayList2;
                this.label = 1;
                objM11132 = c6270.m11132(this);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM11132 != coroutineSingletons) {
                    collection = arrayList2;
                    arrayList2.add(new Pair(interfaceC49372, objM11132));
                    arrayList2 = collection;
                    if (it2.hasNext()) {
                        List<Pair> list = (List) arrayList2;
                        ArrayList arrayList7 = new ArrayList(AbstractC5177.m9381(list, 10));
                        for (Pair pair2 : list) {
                            InterfaceC4937 interfaceC49373 = (InterfaceC4937) pair2.component1();
                            AbstractC4855 localAddress = ((C4857) pair2.component2()).getLocalAddress();
                            C4861 c4861 = localAddress instanceof C4861 ? (C4861) localAddress : null;
                            if (c4861 == null) {
                                throw new IllegalStateException("Expected inet socket address");
                            }
                            int port = c4861.f12641.getPort();
                            interfaceC49373.getClass();
                            arrayList7.add(new C4938(interfaceC49373, port));
                        }
                        ((C6270) this.$cioConnectors).m11147(arrayList7);
                        ((C6270) this.$startupJob).m11147(c6008);
                        InterfaceC5192 interfaceC5192 = this.$stopRequest;
                        this.L$0 = arrayList;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 2;
                        if (((C6292) interfaceC5192).mo11123(this) != coroutineSingletons) {
                            arrayList3 = arrayList;
                            while (r2.hasNext()) {
                            }
                            AbstractC6264 abstractC62642 = this.$userDispatcher;
                            C03665 c036652 = new C03665(this.this$0, this.$environment, null);
                            this.L$0 = null;
                            this.label = 3;
                            if (AbstractC6231.m11029(abstractC62642, c036652, this) != coroutineSingletons) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Iterator it5 = it.iterator();
            while (it5.hasNext()) {
                ((C4916) it5.next()).f12752.mo10815(null);
            }
            ((C6283) this.$stopRequest).m11113(th);
            ((C6270) this.$startupJob).m11088(th);
            throw th;
        }
    }
}
