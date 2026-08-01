package p047;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.collections.AbstractC4346;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6507 extends AbstractC6493 {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6507(Field field, boolean z) {
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // p047.InterfaceC6488
    public Object call(Object[] objArr) {
        objArr.getClass();
        mo11955(objArr);
        return ((Field) this.f17803).get(this.f17801 != null ? AbstractC4346.m8849(objArr) : null);
    }
}
