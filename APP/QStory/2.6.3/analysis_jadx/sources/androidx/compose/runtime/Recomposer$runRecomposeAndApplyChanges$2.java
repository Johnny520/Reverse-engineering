package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {615, 626}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;", "parentFrameClock", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Landroidx/compose/runtime/飘花落叶言子世兰楪苏哲;)V"}, k = 3, mv = {2, 1, 0})
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements InterfaceC6551 {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ C1383 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(C1383 c1383, InterfaceC4357<? super Recomposer$runRecomposeAndApplyChanges$2> interfaceC4357) {
        super(3, interfaceC4357);
        this.this$0 = c1383;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void invokeSuspend$clearRecompositionState(androidx.compose.runtime.C1383 r22, java.util.List<androidx.compose.runtime.C1363> r23, java.util.List<androidx.compose.runtime.AbstractC1305> r24, java.util.List<androidx.compose.runtime.C1363> r25, androidx.collection.C0235 r26, androidx.collection.C0235 r27, androidx.collection.C0235 r28, androidx.collection.C0235 r29) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(androidx.compose.runtime.飘花落叶言子苏兰哲世楪, java.util.List, java.util.List, java.util.List, androidx.collection.飘花落叶言子世兰楪哲苏, androidx.collection.飘花落叶言子世兰楪哲苏, androidx.collection.飘花落叶言子世兰楪哲苏, androidx.collection.飘花落叶言子世兰楪哲苏):void");
    }

    private static final void invokeSuspend$fillToInsert(List<AbstractC1305> list, C1383 c1383) {
        list.clear();
        synchronized (c1383.f3996) {
            try {
                ArrayList arrayList = c1383.f4013;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((AbstractC1305) arrayList.get(i));
                }
                c1383.f4013.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015f  */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.collection.飘花落叶言子世兰楪哲苏, androidx.collection.飘花落叶言子苏世楪哲兰] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.C5176 invokeSuspend$lambda$2(androidx.compose.runtime.C1383 r22, androidx.collection.C0235 r23, androidx.collection.C0235 r24, java.util.List r25, java.util.List r26, androidx.collection.C0235 r27, java.util.List r28, androidx.collection.C0235 r29, java.util.Set r30, long r31) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$lambda$2(androidx.compose.runtime.飘花落叶言子苏兰哲世楪, androidx.collection.飘花落叶言子世兰楪哲苏, androidx.collection.飘花落叶言子世兰楪哲苏, java.util.List, java.util.List, androidx.collection.飘花落叶言子世兰楪哲苏, java.util.List, androidx.collection.飘花落叶言子世兰楪哲苏, java.util.Set, long):kotlin.飘花落叶言子楪兰苏哲世");
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC1304 interfaceC1304, InterfaceC4357<? super C5176> interfaceC4357) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, interfaceC4357);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = interfaceC1304;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016c -> B:54:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0225 -> B:12:0x00b5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
