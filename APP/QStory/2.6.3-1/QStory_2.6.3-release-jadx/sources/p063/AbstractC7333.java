package p063;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.C6008;
import kotlin.collections.AbstractC5179;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7333 extends AbstractC7323 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f18154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f18155 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC7333(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        cls.getClass();
        Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f18154 = z;
    }

    @Override // p063.InterfaceC7318
    public Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        mo12557(objArr);
        ((Field) this.f18144).set(this.f18142 != null ? AbstractC5179.m9384(objArr) : null, AbstractC5179.m9412(objArr));
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object m12559(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.f18154 ? C6008.f15084 : ((Method) this.f18144).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // p063.AbstractC7323
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo12557(Object[] objArr) {
        switch (this.f18155) {
            case 0:
                objArr.getClass();
                super.mo12557(objArr);
                if (this.f18154 && AbstractC5179.m9412(objArr) == null) {
                    C6755.m11869("null is not allowed as a value for this property.");
                    break;
                }
                break;
            default:
                super.mo12557(objArr);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC7333(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f18154 = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC7333(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        this(method, z, genericParameterTypes);
    }
}
