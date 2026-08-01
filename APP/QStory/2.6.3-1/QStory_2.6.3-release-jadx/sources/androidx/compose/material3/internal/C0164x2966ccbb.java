package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: renamed from: androidx.compose.material3.internal.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.DragGestureDetectorCopyKt", m556f = "DragGestureDetectorCopy.kt", m557l = {145, 186}, m558m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class C0164x2966ccbb extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public C0164x2966ccbb(InterfaceC5189<? super C0164x2966ccbb> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC1961.m2576(null, this);
    }
}
