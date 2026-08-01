package p063;

import androidx.compose.p001ui.graphics.vector.C2397;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7332 extends AbstractC7333 implements InterfaceC7319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f18152;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f18153;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7332(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC5179.m9390(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f18153 = z;
        this.f18152 = obj;
    }

    @Override // p063.AbstractC7333, p063.InterfaceC7318
    public final Object call(Object[] objArr) {
        objArr.getClass();
        mo12557(objArr);
        C2397 c2397 = new C2397(2);
        c2397.m3401(this.f18152);
        c2397.m3399(objArr);
        ArrayList arrayList = c2397.f4945;
        return m12559(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
