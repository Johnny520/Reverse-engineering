package p047;

import androidx.compose.ui.graphics.vector.C1562;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6507 extends AbstractC6494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f17813;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6507(Constructor constructor, int i) {
        this.f17813 = i;
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
                super(constructor, declaringClass4, null, (Type[]) (genericParameterTypes2.length <= 1 ? new Type[0] : AbstractC4347.m8831(genericParameterTypes2, 0, genericParameterTypes2.length - 1)));
                break;
        }
    }

    @Override // p047.InterfaceC6489
    public final Object call(Object[] objArr) {
        int i = this.f17813;
        Member member = this.f17799;
        objArr.getClass();
        switch (i) {
            case 0:
                mo11998(objArr);
                C1562 c1562 = new C1562(2);
                c1562.m2839(objArr);
                c1562.m2841(null);
                ArrayList arrayList = c1562.f4600;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                mo11998(objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
