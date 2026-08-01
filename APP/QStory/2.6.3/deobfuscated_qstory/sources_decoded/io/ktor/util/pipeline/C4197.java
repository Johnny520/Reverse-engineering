package io.ktor.util.pipeline;

import java.util.List;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4197 extends AbstractC4194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f12675;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f12676;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f12677;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4360 f12678;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4197(Object obj, List list, Object obj2, InterfaceC4360 interfaceC4360) {
        super(obj);
        obj.getClass();
        obj2.getClass();
        this.f12677 = list;
        this.f12678 = interfaceC4360;
        this.f12676 = obj2;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12678;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo8566(InterfaceC4357 interfaceC4357) {
        int i = this.f12675;
        if (i < 0) {
            return this.f12676;
        }
        if (i < this.f12677.size()) {
            return m8583(interfaceC4357);
        }
        this.f12675 = -1;
        return this.f12676;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo8567() {
        return this.f12676;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo8568() {
        this.f12675 = -1;
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8569(Object obj, InterfaceC4357 interfaceC4357) {
        this.f12675 = 0;
        mo8571(obj);
        return mo8566(interfaceC4357);
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo8570(Object obj, InterfaceC4357 interfaceC4357) {
        mo8571(obj);
        return mo8566(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8583(kotlin.coroutines.InterfaceC4357 r7) {
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
            io.ktor.util.pipeline.飘花落叶言子楪世苏哲兰 r6 = (io.ktor.util.pipeline.C4197) r6
            goto L2f
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L2f:
            kotlin.AbstractC5185.m10210(r7)
        L32:
            int r7 = r6.f12675
            r2 = -1
            if (r7 != r2) goto L38
            goto L42
        L38:
            java.util.List r4 = r6.f12677
            int r5 = r4.size()
            if (r7 < r5) goto L45
            r6.f12675 = r2
        L42:
            java.lang.Object r6 = r6.f12676
            return r6
        L45:
            java.lang.Object r2 = r4.get(r7)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r2 = (p052.InterfaceC6551) r2
            int r7 = r7 + 1
            r6.f12675 = r7
            java.lang.Object r7 = r6.f12676
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r2.invoke(r6, r7, r0)
            if (r7 != r1) goto L32
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.C4197.m8583(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    @Override // io.ktor.util.pipeline.AbstractC4194
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo8571(Object obj) {
        obj.getClass();
        this.f12676 = obj;
    }
}
