package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.appcompat.app.C0076;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import io.ktor.http.content.C3984;
import io.ktor.server.routing.C4154;
import io.ktor.server.routing.C4162;
import java.io.Writer;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6553;
import p059.C6856;
import p063.InterfaceC6861;
import p236.AbstractC8114;
import p236.C8112;
import p236.C8124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1", f = "McpServerManager.kt", l = {240}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 3, 0})
final class McpServerManager$start$1$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C5866 $this_runCatching;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/Writer;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/io/Writer;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1$1", f = "McpServerManager.kt", l = {243}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5206 $clientChannel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5206 interfaceC5206, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$clientChannel = interfaceC5206;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$clientChannel, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(Writer writer, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(writer, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:12:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.io.IOException {
            /*
                r7 = this;
                java.lang.Object r0 = r7.L$0
                java.io.Writer r0 = (java.io.Writer) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r7.label
                r3 = 1
                if (r2 == 0) goto L23
                if (r2 != r3) goto L15
                kotlin.AbstractC5184.m10206(r8)
                kotlinx.coroutines.channels.飘花落叶言子楪哲世苏兰 r8 = (kotlinx.coroutines.channels.C5201) r8
                java.lang.Object r8 = r8.f14791
                goto L33
            L15:
                r7 = -3937693499584152999(0xc95a809ffaebfa59, double:-2.3640967447586732E45)
                java.lang.String r7 = com.bumptech.glide.AbstractC3056.m6668(r7)
                top.suzhelan.qstory.hook.item.C5919.m11250(r7)
                r7 = 0
                return r7
            L23:
                kotlin.AbstractC5184.m10206(r8)
            L26:
                kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r8 = r7.$clientChannel
                r7.L$0 = r0
                r7.label = r3
                java.lang.Object r8 = r8.mo10242(r7)
                if (r8 != r1) goto L33
                return r1
            L33:
                java.lang.Object r8 = kotlinx.coroutines.channels.C5201.m10268(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L3e
                kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
                return r7
            L3e:
                r4 = -3937807951872656807(0xc95a1887faebfa59, double:-2.3278253667038365E45)
                java.lang.String r2 = com.bumptech.glide.AbstractC3056.m6668(r4)
                r0.append(r2)
                r4 = -3937627103684724135(0xc95abd02faebfa59, double:-2.3851384451995964E45)
                java.lang.String r2 = com.bumptech.glide.AbstractC3056.m6668(r4)
                r0.append(r2)
                r2 = 10
                r0.append(r2)
                kotlin.text.飘花落叶言子楪苏世哲兰 r4 = new kotlin.text.飘花落叶言子楪苏世哲兰
                r4.<init>(r8)
            L60:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L7f
                java.lang.Object r8 = r4.next()
                java.lang.String r8 = (java.lang.String) r8
                r5 = -3937807848793441703(0xc95a189ffaebfa59, double:-2.327858033811061E45)
                java.lang.String r5 = com.bumptech.glide.AbstractC3056.m6668(r5)
                r0.append(r5)
                r0.append(r8)
                r0.append(r2)
                goto L60
            L7f:
                r0.append(r2)
                r0.flush()
                goto L26
            */
            throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$start$1$1$1$1(C5866 c5866, InterfaceC4356<? super McpServerManager$start$1$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_runCatching = c5866;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        McpServerManager$start$1$1$1$1 mcpServerManager$start$1$1$1$1 = new McpServerManager$start$1$1$1$1(this.$this_runCatching, interfaceC4356);
        mcpServerManager$start$1$1$1$1.L$0 = obj;
        return mcpServerManager$start$1$1$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4154 c4154, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((McpServerManager$start$1$1$1$1) create(c4154, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.ktor.server.routing.飘花落叶言子楪兰世苏哲] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世] */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲, kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.飘花落叶言子楪世哲苏兰, top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1] */
    /* JADX WARN: Type inference failed for: r10v1, types: [top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1] */
    /* JADX WARN: Type inference failed for: r10v5, types: [飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.CopyOnWriteArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5086 interfaceC5086M8922;
        ?? M10278 = (C4154) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                this.$this_runCatching.f16031.invoke(AbstractC3056.m6668(-3937807913217951143L));
                C4162 c4162 = M10278.f12579;
                C0076 c0076 = c4162.mo8471().f12566;
                String[] strArr = AbstractC8114.f22415;
                c0076.m288("Cache-Control", AbstractC3056.m6668(-3937807844498474407L), true);
                c4162.mo8471().f12566.m288("Connection", AbstractC3056.m6668(-3937559238906480039L), true);
                M10278 = AbstractC5204.m10278(-2, 6, null);
                this.$this_runCatching.f16029.add(M10278);
                C8124 c8124 = C8124.f22426;
                C8124 c8124M13553 = C8112.m13553(AbstractC3056.m6668(-3937807711354488231L));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(M10278, null);
                this.L$0 = null;
                this.L$1 = M10278;
                this.label = 1;
                C3984 c3984 = new C3984(anonymousClass1, AbstractC3065.m6837(c4162, c8124M13553));
                InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C3984.class);
                try {
                    interfaceC5086M8922 = AbstractC4395.m8922(C3984.class);
                } catch (Throwable unused) {
                    interfaceC5086M8922 = null;
                }
                Object objMo8472 = c4162.mo8472(c3984, new C6856(interfaceC5092Mo8927, interfaceC5086M8922), this);
                if (objMo8472 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objMo8472 = c5175;
                }
                if (objMo8472 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250(AbstractC3056.m6668(-3937693499584152999L));
                    return null;
                }
                M10278 = (InterfaceC5206) this.L$1;
                AbstractC5184.m10206(obj);
            }
            return c5175;
        } finally {
            this.$this_runCatching.f16029.remove(M10278);
            M10278.mo8446(null);
            this.$this_runCatching.f16031.invoke(AbstractC3056.m6668(-3937807651224946087L));
        }
    }
}
