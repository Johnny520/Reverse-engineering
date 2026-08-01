package io.ktor.util.pipeline;

import java.util.List;
import kotlin.AbstractC6017;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p068.InterfaceC7380;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5029 extends AbstractC5026 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f13020;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f13021;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f13022;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5192 f13023;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5029(Object obj, List list, Object obj2, InterfaceC5192 interfaceC5192) {
        super(obj);
        obj.getClass();
        obj2.getClass();
        this.f13022 = list;
        this.f13023 = interfaceC5192;
        this.f13021 = obj2;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f13023;
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo9125(InterfaceC5189 interfaceC5189) {
        int i = this.f13020;
        if (i < 0) {
            return this.f13021;
        }
        if (i < this.f13022.size()) {
            return m9142(interfaceC5189);
        }
        this.f13020 = -1;
        return this.f13021;
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo9126() {
        return this.f13021;
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo9127() {
        this.f13020 = -1;
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9128(Object obj, InterfaceC5189 interfaceC5189) {
        this.f13020 = 0;
        mo9130(obj);
        return mo9125(interfaceC5189);
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo9129(Object obj, InterfaceC5189 interfaceC5189) {
        mo9130(obj);
        return mo9125(interfaceC5189);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9142(InterfaceC5189 interfaceC5189) {
        DebugPipelineContext$proceedLoop$1 debugPipelineContext$proceedLoop$1;
        InterfaceC7380 interfaceC7380;
        Object obj;
        if (interfaceC5189 instanceof DebugPipelineContext$proceedLoop$1) {
            debugPipelineContext$proceedLoop$1 = (DebugPipelineContext$proceedLoop$1) interfaceC5189;
            int i = debugPipelineContext$proceedLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                debugPipelineContext$proceedLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                debugPipelineContext$proceedLoop$1 = new DebugPipelineContext$proceedLoop$1(this, interfaceC5189);
            }
        }
        Object obj2 = debugPipelineContext$proceedLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = debugPipelineContext$proceedLoop$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (C5029) debugPipelineContext$proceedLoop$1.L$0;
        }
        AbstractC6017.m10769(obj2);
        do {
            int i3 = this.f13020;
            if (i3 != -1) {
                List list = this.f13022;
                if (i3 >= list.size()) {
                    this.f13020 = -1;
                } else {
                    interfaceC7380 = (InterfaceC7380) list.get(i3);
                    this.f13020 = i3 + 1;
                    obj = this.f13021;
                    debugPipelineContext$proceedLoop$1.L$0 = this;
                    debugPipelineContext$proceedLoop$1.label = 1;
                }
            }
            return this.f13021;
        } while (interfaceC7380.invoke(this, obj, debugPipelineContext$proceedLoop$1) != coroutineSingletons);
        return coroutineSingletons;
    }

    @Override // io.ktor.util.pipeline.AbstractC5026
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo9130(Object obj) {
        obj.getClass();
        this.f13021 = obj;
    }
}
