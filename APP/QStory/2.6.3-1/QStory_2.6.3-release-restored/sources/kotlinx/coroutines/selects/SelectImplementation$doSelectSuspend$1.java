package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.selects.SelectImplementation", m556f = "Select.kt", m557l = {450, 453}, m558m = "doSelectSuspend", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6201 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(C6201 c6201, InterfaceC5189<? super SelectImplementation$doSelectSuspend$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6201;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C6201 c6201 = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6201.f15309;
        return c6201.m10982(this);
    }
}
