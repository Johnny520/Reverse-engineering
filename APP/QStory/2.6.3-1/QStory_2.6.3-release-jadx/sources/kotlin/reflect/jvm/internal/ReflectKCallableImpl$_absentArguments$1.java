package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.AbstractC5913;
import p050.AbstractC7176;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class ReflectKCallableImpl$_absentArguments$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public ReflectKCallableImpl$_absentArguments$1(Object obj) {
        super(0, obj, AbstractC5894.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1);
    }

    @Override // p068.InterfaceC7372
    public final Object[] invoke() {
        int i;
        InterfaceC5896 interfaceC5896 = (InterfaceC5896) this.receiver;
        interfaceC5896.getClass();
        List<InterfaceC5940> parameters = interfaceC5896.getParameters();
        int size = (interfaceC5896.isSuspend() ? 1 : 0) + parameters.size();
        if (parameters.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (InterfaceC5940 interfaceC5940 : parameters) {
                if (interfaceC5940.getKind() == KParameter$Kind.VALUE || interfaceC5940.getKind() == KParameter$Kind.CONTEXT) {
                    i++;
                    if (i < 0) {
                        AbstractC7176.m12480();
                        throw null;
                    }
                }
            }
        }
        int i2 = (i + 31) / 32;
        Object[] objArr = new Object[size + i2 + 1];
        for (InterfaceC5940 interfaceC59402 : parameters) {
            if (interfaceC59402.mo10513() && !AbstractC5899.m10632(interfaceC59402.getType())) {
                objArr[interfaceC59402.getIndex()] = AbstractC5899.m10620(AbstractC5913.m10653(interfaceC59402.getType()));
            } else if (interfaceC59402.mo10517()) {
                objArr[interfaceC59402.getIndex()] = AbstractC5894.m10614(interfaceC59402.getType());
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[size + i3] = 0;
        }
        return objArr;
    }
}
