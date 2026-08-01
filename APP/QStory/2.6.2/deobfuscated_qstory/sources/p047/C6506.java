package p047;

import androidx.compose.ui.graphics.vector.C1562;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6506 extends AbstractC6493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f17817;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6506(Constructor constructor, int i) {
        this.f17817 = i;
        Class<?> cls = null;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Class declaringClass2 = constructor.getDeclaringClass();
                Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
                if (declaringClass3 != null && !Modifier.isStatic(declaringClass2.getModifiers())) {
                    cls = declaringClass3;
                }
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass, cls, genericParameterTypes);
                break;
            default:
                Class declaringClass4 = constructor.getDeclaringClass();
                declaringClass4.getClass();
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                super(constructor, declaringClass4, null, (Type[]) (genericParameterTypes2.length <= 1 ? new Type[0] : AbstractC4346.m8862(genericParameterTypes2, 0, genericParameterTypes2.length - 1)));
                break;
        }
    }

    @Override // p047.InterfaceC6488
    public final Object call(Object[] objArr) {
        int i = this.f17817;
        Member member = this.f17803;
        objArr.getClass();
        switch (i) {
            case 0:
                mo11955(objArr);
                C1562 c1562 = new C1562(2);
                c1562.m2829(objArr);
                c1562.m2831(null);
                ArrayList arrayList = c1562.f4599;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                mo11955(objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
