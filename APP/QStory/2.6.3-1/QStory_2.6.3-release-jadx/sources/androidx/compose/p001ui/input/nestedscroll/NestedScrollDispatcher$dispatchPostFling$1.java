package androidx.compose.p001ui.input.nestedscroll;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m556f = "NestedScrollModifier.kt", m557l = {Opcodes.OR_INT_LIT8, Opcodes.SHL_INT_LIT8}, m558m = "dispatchPostFling-RZ2iAVY", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2454 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(C2454 c2454, InterfaceC5189<? super NestedScrollDispatcher$dispatchPostFling$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c2454;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3555(0L, 0L, this);
    }
}
