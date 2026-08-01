package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: renamed from: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", m556f = "AppBar.kt", m557l = {3434, 3436}, m558m = "onPostFling-RZ2iAVY")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class C0143x78ae0263 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC2020 this$0;

    public C0143x78ae0263(AbstractC2020 abstractC2020, InterfaceC5189<? super C0143x78ae0263> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
