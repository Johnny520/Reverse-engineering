package io.ktor.util.pipeline;

import java.util.List;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4196 extends AbstractC4193 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f12671;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f12672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f12673;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4359 f12674;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4196(Object obj, List list, Object obj2, InterfaceC4359 interfaceC4359) {
        super(obj);
        obj.getClass();
        obj2.getClass();
        this.f12673 = list;
        this.f12674 = interfaceC4359;
        this.f12672 = obj2;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12674;
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo8576(InterfaceC4356 interfaceC4356) {
        int i = this.f12671;
        if (i < 0) {
            return this.f12672;
        }
        if (i < this.f12673.size()) {
            return m8593(interfaceC4356);
        }
        this.f12671 = -1;
        return this.f12672;
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo8577() {
        return this.f12672;
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo8578() {
        this.f12671 = -1;
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8579(Object obj, InterfaceC4356 interfaceC4356) {
        this.f12671 = 0;
        mo8581(obj);
        return mo8576(interfaceC4356);
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo8580(Object obj, InterfaceC4356 interfaceC4356) {
        mo8581(obj);
        return mo8576(interfaceC4356);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8593(kotlin.coroutines.InterfaceC4356 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = (io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 r0 = new io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L28
            java.lang.Object r6 = r0.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世苏哲兰 r6 = (io.ktor.util.pipeline.C4196) r6
            goto L2f
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            r6 = 0
            return r6
        L2f:
            kotlin.AbstractC5184.m10206(r7)
        L32:
            int r7 = r6.f12671
            r2 = -1
            if (r7 != r2) goto L38
            goto L42
        L38:
            java.util.List r4 = r6.f12673
            int r5 = r4.size()
            if (r7 < r5) goto L45
            r6.f12671 = r2
        L42:
            java.lang.Object r6 = r6.f12672
            return r6
        L45:
            java.lang.Object r2 = r4.get(r7)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r2 = (p052.InterfaceC6550) r2
            int r7 = r7 + 1
            r6.f12671 = r7
            java.lang.Object r7 = r6.f12672
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r2.invoke(r6, r7, r0)
            if (r7 != r1) goto L32
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.C4196.m8593(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    @Override // io.ktor.util.pipeline.AbstractC4193
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo8581(Object obj) {
        obj.getClass();
        this.f12672 = obj;
    }
}
