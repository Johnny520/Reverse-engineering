package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.appcompat.app.C0076;
import com.bumptech.glide.AbstractC3057;
import io.ktor.http.content.C3985;
import io.ktor.server.routing.C4155;
import io.ktor.server.routing.C4163;
import java.io.Writer;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p059.C6857;
import p063.InterfaceC6862;
import p236.AbstractC8115;
import p236.C8113;
import p236.C8125;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1", f = "McpServerManager.kt", l = {240}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 3, 0})
final class McpServerManager$start$1$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C5871 $this_runCatching;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/Writer;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/io/Writer;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1$1", f = "McpServerManager.kt", l = {243}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5207 $clientChannel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5207 interfaceC5207, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$clientChannel = interfaceC5207;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$clientChannel, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(Writer writer, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(writer, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.io.IOException {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                java.io.Writer r0 = (java.io.Writer) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r6.label
                r3 = 1
                if (r2 == 0) goto L20
                if (r2 != r3) goto L15
                kotlin.AbstractC5185.m10210(r7)
                kotlinx.coroutines.channels.飘花落叶言子楪哲世苏兰 r7 = (kotlinx.coroutines.channels.C5202) r7
                java.lang.Object r7 = r7.f14791
                goto L30
            L15:
                r6 = 1261(0x4ed, float:1.767E-42)
                java.lang.String r6 = p287.AbstractC8405.m13972(r6)
                top.suzhelan.qstory.hook.item.C5925.m11311(r6)
                r6 = 0
                return r6
            L20:
                kotlin.AbstractC5185.m10210(r7)
            L23:
                kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r7 = r6.$clientChannel
                r6.L$0 = r0
                r6.label = r3
                java.lang.Object r7 = r7.mo10247(r6)
                if (r7 != r1) goto L30
                return r1
            L30:
                java.lang.Object r7 = kotlinx.coroutines.channels.C5202.m10272(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 != 0) goto L3b
                kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
                return r6
            L3b:
                java.lang.String r2 = "喵喵喵呜喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵喵喵呜~喵呜喵呜喵呜呜喵~喵呜喵喵喵喵喵呜"
                java.lang.String r2 = p287.AbstractC8405.m13973(r2)
                r0.append(r2)
                java.lang.String r2 = "喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"
                java.lang.String r2 = p287.AbstractC8405.m13973(r2)
                r0.append(r2)
                r2 = 10
                r0.append(r2)
                kotlin.text.飘花落叶言子楪苏世哲兰 r4 = new kotlin.text.飘花落叶言子楪苏世哲兰
                r4.<init>(r7)
            L57:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L73
                java.lang.Object r7 = r4.next()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r5 = "喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵呜喵呜呜呜呜呜~喵呜喵喵呜呜喵喵"
                java.lang.String r5 = p287.AbstractC8405.m13973(r5)
                r0.append(r5)
                r0.append(r7)
                r0.append(r2)
                goto L57
            L73:
                r0.append(r2)
                r0.flush()
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$start$1$1$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$start$1$1$1$1(C5871 c5871, InterfaceC4357<? super McpServerManager$start$1$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_runCatching = c5871;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        McpServerManager$start$1$1$1$1 mcpServerManager$start$1$1$1$1 = new McpServerManager$start$1$1$1$1(this.$this_runCatching, interfaceC4357);
        mcpServerManager$start$1$1$1$1.L$0 = obj;
        return mcpServerManager$start$1$1$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4155 c4155, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((McpServerManager$start$1$1$1$1) create(c4155, interfaceC4357)).invokeSuspend(C5176.f14739);
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
        InterfaceC5087 interfaceC5087M8912;
        ?? M10282 = (C4155) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                this.$this_runCatching.f16038.invoke(AbstractC8405.m13972(2303));
                C4163 c4163 = M10282.f12583;
                C0076 c0076 = c4163.mo8461().f12570;
                String[] strArr = AbstractC8115.f22413;
                c0076.m289("Cache-Control", AbstractC8405.m13972(2304), true);
                c4163.mo8461().f12570.m289("Connection", AbstractC8405.m13972(28), true);
                M10282 = AbstractC5205.m10282(-2, 6, null);
                this.$this_runCatching.f16036.add(M10282);
                C8125 c8125 = C8125.f22424;
                C8125 c8125M13582 = C8113.m13582(AbstractC8405.m13972(2305));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(M10282, null);
                this.L$0 = null;
                this.L$1 = M10282;
                this.label = 1;
                C3985 c3985 = new C3985(anonymousClass1, AbstractC3057.m6755(c4163, c8125M13582));
                InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C3985.class);
                try {
                    interfaceC5087M8912 = AbstractC4396.m8912(C3985.class);
                } catch (Throwable unused) {
                    interfaceC5087M8912 = null;
                }
                Object objMo8462 = c4163.mo8462(c3985, new C6857(interfaceC5093Mo8917, interfaceC5087M8912), this);
                if (objMo8462 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objMo8462 = c5176;
                }
                if (objMo8462 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311(AbstractC8405.m13972(1261));
                    return null;
                }
                M10282 = (InterfaceC5207) this.L$1;
                AbstractC5185.m10210(obj);
            }
            return c5176;
        } finally {
            this.$this_runCatching.f16036.remove(M10282);
            M10282.mo8435(null);
            this.$this_runCatching.f16038.invoke(AbstractC8405.m13972(2306));
        }
    }
}
