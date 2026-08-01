package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", m125f = "Emitters.kt", m126i = {}, m127l = {42}, m128m = "emit", m129n = {}, m130s = {})
public final class FlowKt__EmittersKt$transform$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.FlowKt__EmittersKt.C09221.AnonymousClass1<T> this$0;

    public FlowKt__EmittersKt$transform$1$1$emit$1(kotlinx.coroutines.flow.FlowKt__EmittersKt.C09221.AnonymousClass1<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            r3.result = r4
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r3.label = r0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1<T> r0 = r3.this$0
            r1 = 0
            r2 = r3
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.emit(r1, r2)
            return r0
    }
}
