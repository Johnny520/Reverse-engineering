package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", m125f = "Combine.kt", m126i = {}, m127l = {93}, m128m = "emit", m129n = {}, m130s = {})
final class CombineKt$zipImpl$1$1$second$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1.C10061<T> this$0;

    CombineKt$zipImpl$1$1$second$1$1$emit$1(kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1.C10061<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1> r2) {
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
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1<T> r0 = r3.this$0
            r1 = 0
            r2 = r3
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.emit(r1, r2)
            return r0
    }
}
