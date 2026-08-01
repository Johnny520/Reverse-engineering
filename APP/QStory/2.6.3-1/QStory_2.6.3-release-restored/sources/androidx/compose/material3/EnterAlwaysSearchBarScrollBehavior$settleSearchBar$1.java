package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior", m556f = "SearchBar.kt", m557l = {972, 986}, m558m = "settleSearchBar-OhffZ5M")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC2015 this$0;

    public EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1(AbstractC2015 abstractC2015, InterfaceC5189<? super EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
