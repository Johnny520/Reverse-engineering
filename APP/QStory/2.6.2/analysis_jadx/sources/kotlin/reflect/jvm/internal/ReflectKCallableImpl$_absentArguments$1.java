package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.AbstractC5080;
import p052.InterfaceC6542;
import p253.AbstractC8189;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class ReflectKCallableImpl$_absentArguments$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public ReflectKCallableImpl$_absentArguments$1(Object obj) {
        super(0, obj, AbstractC5061.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1);
    }

    @Override // p052.InterfaceC6542
    public final Object[] invoke() {
        int i;
        InterfaceC5063 interfaceC5063 = (InterfaceC5063) this.receiver;
        interfaceC5063.getClass();
        List<InterfaceC5107> parameters = interfaceC5063.getParameters();
        int size = (interfaceC5063.isSuspend() ? 1 : 0) + parameters.size();
        if (parameters.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (InterfaceC5107 interfaceC5107 : parameters) {
                if (interfaceC5107.getKind() == KParameter$Kind.VALUE || interfaceC5107.getKind() == KParameter$Kind.CONTEXT) {
                    i++;
                    if (i < 0) {
                        AbstractC8189.m13663();
                        throw null;
                    }
                }
            }
        }
        int i2 = (i + 31) / 32;
        Object[] objArr = new Object[size + i2 + 1];
        for (InterfaceC5107 interfaceC51072 : parameters) {
            if (interfaceC51072.mo9957() && !AbstractC5066.m10069(interfaceC51072.getType())) {
                objArr[interfaceC51072.getIndex()] = AbstractC5066.m10057(AbstractC5080.m10090(interfaceC51072.getType()));
            } else if (interfaceC51072.mo9961()) {
                objArr[interfaceC51072.getIndex()] = AbstractC5061.m10045(interfaceC51072.getType());
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[size + i3] = 0;
        }
        return objArr;
    }
}
