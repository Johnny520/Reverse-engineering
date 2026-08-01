package p047;

import androidx.compose.ui.graphics.vector.C1562;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.AbstractC4346;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6487 extends AbstractC6493 implements InterfaceC6489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f17785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f17786;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6487(Constructor constructor, Object obj, int i) {
        this.f17786 = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f17785 = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : AbstractC4346.m8862(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f17785 = obj;
                break;
        }
    }

    @Override // p047.InterfaceC6488
    public final Object call(Object[] objArr) {
        int i = this.f17786;
        Object obj = this.f17785;
        Member member = this.f17803;
        objArr.getClass();
        switch (i) {
            case 0:
                mo11955(objArr);
                C1562 c1562 = new C1562(3);
                c1562.m2831(obj);
                c1562.m2829(objArr);
                c1562.m2831(null);
                ArrayList arrayList = c1562.f4599;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                mo11955(objArr);
                C1562 c15622 = new C1562(2);
                c15622.m2831(obj);
                c15622.m2829(objArr);
                ArrayList arrayList2 = c15622.f4599;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
