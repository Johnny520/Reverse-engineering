package android.view;

import Yue.AbstractC5673;
import Yue.C8107;
import Yue.InterfaceC5124;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "y", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class Transformations$switchMap$2$onChanged$1 extends AbstractC5673 implements InterfaceC5124<Object, C8107> {
    final /* synthetic */ MediatorLiveData<Object> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$2$onChanged$1(MediatorLiveData<Object> mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ C8107 invoke(Object obj) {
        invoke2(obj);
        return C8107.f3222;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Possible override for method Yue.ۥۣ۠ۡ۟.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        this.$result.setValue(obj);
    }
}
