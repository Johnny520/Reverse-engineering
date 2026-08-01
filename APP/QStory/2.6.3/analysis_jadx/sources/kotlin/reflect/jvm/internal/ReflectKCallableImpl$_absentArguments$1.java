package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.AbstractC5081;
import p034.AbstractC6347;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class ReflectKCallableImpl$_absentArguments$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public ReflectKCallableImpl$_absentArguments$1(Object obj) {
        super(0, obj, AbstractC5062.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1);
    }

    @Override // p052.InterfaceC6543
    public final Object[] invoke() {
        int i;
        InterfaceC5064 interfaceC5064 = (InterfaceC5064) this.receiver;
        interfaceC5064.getClass();
        List<InterfaceC5108> parameters = interfaceC5064.getParameters();
        int size = (interfaceC5064.isSuspend() ? 1 : 0) + parameters.size();
        if (parameters.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (InterfaceC5108 interfaceC5108 : parameters) {
                if (interfaceC5108.getKind() == KParameter$Kind.VALUE || interfaceC5108.getKind() == KParameter$Kind.CONTEXT) {
                    i++;
                    if (i < 0) {
                        AbstractC6347.m11921();
                        throw null;
                    }
                }
            }
        }
        int i2 = (i + 31) / 32;
        Object[] objArr = new Object[size + i2 + 1];
        for (InterfaceC5108 interfaceC51082 : parameters) {
            if (interfaceC51082.mo9954() && !AbstractC5067.m10073(interfaceC51082.getType())) {
                objArr[interfaceC51082.getIndex()] = AbstractC5067.m10061(AbstractC5081.m10094(interfaceC51082.getType()));
            } else if (interfaceC51082.mo9958()) {
                objArr[interfaceC51082.getIndex()] = AbstractC5062.m10055(interfaceC51082.getType());
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[size + i3] = 0;
        }
        return objArr;
    }
}
