package p047;

import androidx.compose.ui.graphics.vector.C1562;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.AbstractC4347;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6503 extends AbstractC6504 implements InterfaceC6490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f17807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17808;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6503(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC4347.m8831(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f17808 = z;
        this.f17807 = obj;
    }

    @Override // p047.AbstractC6504, p047.InterfaceC6489
    public final Object call(Object[] objArr) {
        objArr.getClass();
        mo11998(objArr);
        C1562 c1562 = new C1562(2);
        c1562.m2841(this.f17807);
        c1562.m2839(objArr);
        ArrayList arrayList = c1562.f4600;
        return m12000(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
