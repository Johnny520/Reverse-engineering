package p047;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.C5176;
import kotlin.collections.AbstractC4347;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6504 extends AbstractC6494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f17809;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f17810 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6504(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        cls.getClass();
        Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f17809 = z;
    }

    @Override // p047.InterfaceC6489
    public Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        mo11998(objArr);
        ((Field) this.f17799).set(this.f17797 != null ? AbstractC4347.m8825(objArr) : null, AbstractC4347.m8853(objArr));
        return C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object m12000(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.f17809 ? C5176.f14739 : ((Method) this.f17799).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // p047.AbstractC6494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo11998(Object[] objArr) {
        switch (this.f17810) {
            case 0:
                objArr.getClass();
                super.mo11998(objArr);
                if (this.f17809 && AbstractC4347.m8853(objArr) == null) {
                    C5925.m11310("null is not allowed as a value for this property.");
                    break;
                }
                break;
            default:
                super.mo11998(objArr);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6504(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f17809 = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC6504(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        this(method, z, genericParameterTypes);
    }
}
