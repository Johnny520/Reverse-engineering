package p047;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.C5175;
import kotlin.collections.AbstractC4346;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6503 extends AbstractC6493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f17813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f17814 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6503(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        cls.getClass();
        Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f17813 = z;
    }

    @Override // p047.InterfaceC6488
    public Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        mo11955(objArr);
        ((Field) this.f17803).set(this.f17801 != null ? AbstractC4346.m8849(objArr) : null, AbstractC4346.m8855(objArr));
        return C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object m11957(Object obj, Object[] objArr) {
        objArr.getClass();
        return this.f17813 ? C5175.f14739 : ((Method) this.f17803).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // p047.AbstractC6493
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo11955(Object[] objArr) {
        switch (this.f17814) {
            case 0:
                objArr.getClass();
                super.mo11955(objArr);
                if (this.f17813 && AbstractC4346.m8855(objArr) == null) {
                    C5919.m11249("null is not allowed as a value for this property.");
                    break;
                }
                break;
            default:
                super.mo11955(objArr);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6503(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f17813 = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC6503(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        this(method, z, genericParameterTypes);
    }
}
