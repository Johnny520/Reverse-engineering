package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C4691;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4447 extends AbstractC4429 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object[] f13075;

    public C4447(C4691 c4691, Object[] objArr) {
        super(c4691);
        this.f13075 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m8985() {
        Object[] objArr = this.f13075;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = AbstractC4431.f13055;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C4445(null, (Enum) obj) : obj instanceof Annotation ? new C4448(null, (Annotation) obj) : obj instanceof Object[] ? new C4447(null, (Object[]) obj) : obj instanceof Class ? new C4449(null, (Class) obj) : new C4443(null, obj));
        }
        return arrayList;
    }
}
