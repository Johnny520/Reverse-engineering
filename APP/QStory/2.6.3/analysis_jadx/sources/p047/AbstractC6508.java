package p047;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.collections.AbstractC4347;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6508 extends AbstractC6494 {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6508(Field field, boolean z) {
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // p047.InterfaceC6489
    public Object call(Object[] objArr) {
        objArr.getClass();
        mo11998(objArr);
        return ((Field) this.f17799).get(this.f17797 != null ? AbstractC4347.m8825(objArr) : null);
    }
}
