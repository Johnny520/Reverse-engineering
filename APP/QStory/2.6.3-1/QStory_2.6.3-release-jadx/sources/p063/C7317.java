package p063;

import androidx.compose.p001ui.graphics.vector.C2397;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7317 extends AbstractC7323 implements InterfaceC7319 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f18126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f18127;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7317(Constructor constructor, Object obj, int i) {
        this.f18127 = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f18126 = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : AbstractC5179.m9390(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f18126 = obj;
                break;
        }
    }

    @Override // p063.InterfaceC7318
    public final Object call(Object[] objArr) {
        int i = this.f18127;
        Object obj = this.f18126;
        Member member = this.f18144;
        objArr.getClass();
        switch (i) {
            case 0:
                mo12557(objArr);
                C2397 c2397 = new C2397(3);
                c2397.m3401(obj);
                c2397.m3399(objArr);
                c2397.m3401(null);
                ArrayList arrayList = c2397.f4945;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                mo12557(objArr);
                C2397 c23972 = new C2397(2);
                c23972.m3401(obj);
                c23972.m3399(objArr);
                ArrayList arrayList2 = c23972.f4945;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
