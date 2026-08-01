package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.appcompat.app.C0923;
import com.bumptech.glide.AbstractC3889;
import io.ktor.http.content.C4817;
import io.ktor.server.routing.C4987;
import io.ktor.server.routing.C4995;
import java.io.IOException;
import java.io.Writer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.C5979;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7383;
import p075.C7686;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import p252.C8942;
import p252.C8954;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1", m556f = "McpServerManager.kt", m557l = {240}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class McpServerManager$start$1$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C6701 $this_runCatching;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Ljava/io/Writer;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/io/Writer;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1$1", m556f = "McpServerManager.kt", m557l = {243}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08021 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6039 $clientChannel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08021(InterfaceC6039 interfaceC6039, InterfaceC5189<? super C08021> interfaceC5189) {
            super(2, interfaceC5189);
            this.$clientChannel = interfaceC6039;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C08021 c08021 = new C08021(this.$clientChannel, interfaceC5189);
            c08021.L$0 = obj;
            return c08021;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(Writer writer, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08021) create(writer, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objMo10806;
            String str;
            Writer writer = (Writer) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6039 interfaceC6039 = this.$clientChannel;
                this.L$0 = writer;
                this.label = 1;
                objMo10806 = interfaceC6039.mo10806(this);
                if (objMo10806 == coroutineSingletons) {
                }
                str = (String) C6034.m10831(objMo10806);
                if (str == null) {
                }
            } else {
                if (i != 1) {
                    C6755.m11870(AbstractC9234.m14531(1261));
                    return null;
                }
                AbstractC6017.m10769(obj);
                objMo10806 = ((C6034) obj).f15136;
                str = (String) C6034.m10831(objMo10806);
                if (str == null) {
                    return C6008.f15084;
                }
                writer.append((CharSequence) AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵喵喵呜~喵呜喵呜喵呜呜喵~喵呜喵喵喵喵喵呜"));
                writer.append((CharSequence) AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
                writer.append('\n');
                C5979 c5979 = new C5979(str);
                while (c5979.hasNext()) {
                    String str2 = (String) c5979.next();
                    writer.append((CharSequence) AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵呜喵呜呜呜呜呜~喵呜喵喵呜呜喵喵"));
                    writer.append((CharSequence) str2);
                    writer.append('\n');
                }
                writer.append('\n');
                writer.flush();
                InterfaceC6039 interfaceC60392 = this.$clientChannel;
                this.L$0 = writer;
                this.label = 1;
                objMo10806 = interfaceC60392.mo10806(this);
                if (objMo10806 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = (String) C6034.m10831(objMo10806);
                if (str == null) {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$start$1$1$1$1(C6701 c6701, InterfaceC5189<? super McpServerManager$start$1$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_runCatching = c6701;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        McpServerManager$start$1$1$1$1 mcpServerManager$start$1$1$1$1 = new McpServerManager$start$1$1$1$1(this.$this_runCatching, interfaceC5189);
        mcpServerManager$start$1$1$1$1.L$0 = obj;
        return mcpServerManager$start$1$1$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C4987 c4987, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((McpServerManager$start$1$1$1$1) create(c4987, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.ktor.server.routing.飘花落叶言子楪兰世苏哲] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世] */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.飘花落叶言子楪世哲苏兰, top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1] */
    /* JADX WARN: Type inference failed for: r9v5, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5919 interfaceC5919M9471;
        ?? M10841 = (C4987) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                this.$this_runCatching.f16383.invoke(AbstractC9234.m14531(2303));
                C4995 c4995 = M10841.f12928;
                C0923 c0923 = c4995.mo9020().f12915;
                String[] strArr = AbstractC8944.f22758;
                c0923.m849("Cache-Control", AbstractC9234.m14531(2304), true);
                c4995.mo9020().f12915.m849("Connection", AbstractC9234.m14531(28), true);
                M10841 = AbstractC6037.m10841(-2, 6, null);
                this.$this_runCatching.f16381.add(M10841);
                C8954 c8954 = C8954.f22769;
                C8954 c8954M14141 = C8942.m14141(AbstractC9234.m14531(2305));
                C08021 c08021 = new C08021(M10841, null);
                this.L$0 = null;
                this.L$1 = M10841;
                this.label = 1;
                C4817 c4817 = new C4817(c08021, AbstractC3889.m7315(c4995, c8954M14141));
                InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C4817.class);
                try {
                    interfaceC5919M9471 = AbstractC5228.m9471(C4817.class);
                } catch (Throwable unused) {
                    interfaceC5919M9471 = null;
                }
                Object objMo9021 = c4995.mo9021(c4817, new C7686(interfaceC5925Mo9476, interfaceC5919M9471), this);
                if (objMo9021 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objMo9021 = c6008;
                }
                if (objMo9021 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870(AbstractC9234.m14531(1261));
                    return null;
                }
                M10841 = (InterfaceC6039) this.L$1;
                AbstractC6017.m10769(obj);
            }
            return c6008;
        } finally {
            this.$this_runCatching.f16381.remove(M10841);
            M10841.mo8994(null);
            this.$this_runCatching.f16383.invoke(AbstractC9234.m14531(2306));
        }
    }
}
