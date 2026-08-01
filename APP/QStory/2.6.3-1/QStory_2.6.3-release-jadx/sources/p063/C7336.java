package p063;

import androidx.compose.p001ui.graphics.vector.C2397;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7336 extends AbstractC7323 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f18158;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7336(Constructor constructor, int i) {
        this.f18158 = i;
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
                super(constructor, declaringClass4, null, (Type[]) (genericParameterTypes2.length <= 1 ? new Type[0] : AbstractC5179.m9390(genericParameterTypes2, 0, genericParameterTypes2.length - 1)));
                break;
        }
    }

    @Override // p063.InterfaceC7318
    public final Object call(Object[] objArr) {
        int i = this.f18158;
        Member member = this.f18144;
        objArr.getClass();
        switch (i) {
            case 0:
                mo12557(objArr);
                C2397 c2397 = new C2397(2);
                c2397.m3399(objArr);
                c2397.m3401(null);
                ArrayList arrayList = c2397.f4945;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                mo12557(objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
