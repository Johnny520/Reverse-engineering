package p047;

import androidx.compose.ui.graphics.vector.C1562;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.AbstractC4347;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6488 extends AbstractC6494 implements InterfaceC6490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f17781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f17782;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6488(Constructor constructor, Object obj, int i) {
        this.f17782 = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f17781 = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : AbstractC4347.m8831(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f17781 = obj;
                break;
        }
    }

    @Override // p047.InterfaceC6489
    public final Object call(Object[] objArr) {
        int i = this.f17782;
        Object obj = this.f17781;
        Member member = this.f17799;
        objArr.getClass();
        switch (i) {
            case 0:
                mo11998(objArr);
                C1562 c1562 = new C1562(3);
                c1562.m2841(obj);
                c1562.m2839(objArr);
                c1562.m2841(null);
                ArrayList arrayList = c1562.f4600;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                mo11998(objArr);
                C1562 c15622 = new C1562(2);
                c15622.m2841(obj);
                c15622.m2839(objArr);
                ArrayList arrayList2 = c15622.f4600;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
