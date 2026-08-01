package p063;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7337 extends AbstractC7323 {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC7337(Field field, boolean z) {
        Type genericType = field.getGenericType();
        genericType.getClass();
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // p063.InterfaceC7318
    public Object call(Object[] objArr) {
        objArr.getClass();
        mo12557(objArr);
        return ((Field) this.f18144).get(this.f18142 != null ? AbstractC5179.m9384(objArr) : null);
    }
}
