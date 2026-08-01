package p047;

import androidx.compose.ui.graphics.vector.C1562;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.AbstractC4346;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6502 extends AbstractC6503 implements InterfaceC6489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f17811;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17812;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6502(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC4346.m8862(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f17812 = z;
        this.f17811 = obj;
    }

    @Override // p047.AbstractC6503, p047.InterfaceC6488
    public final Object call(Object[] objArr) {
        objArr.getClass();
        mo11955(objArr);
        C1562 c1562 = new C1562(2);
        c1562.m2831(this.f17811);
        c1562.m2829(objArr);
        ArrayList arrayList = c1562.f4599;
        return m11957(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
