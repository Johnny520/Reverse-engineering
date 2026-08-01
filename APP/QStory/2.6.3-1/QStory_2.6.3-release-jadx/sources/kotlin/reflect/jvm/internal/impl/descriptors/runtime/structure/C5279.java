package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C5523;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5279 extends AbstractC5261 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object[] f13420;

    public C5279(C5523 c5523, Object[] objArr) {
        super(c5523);
        this.f13420 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m9544() {
        Object[] objArr = this.f13420;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = AbstractC5263.f13400;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C5277(null, (Enum) obj) : obj instanceof Annotation ? new C5280(null, (Annotation) obj) : obj instanceof Object[] ? new C5279(null, (Object[]) obj) : obj instanceof Class ? new C5281(null, (Class) obj) : new C5275(null, obj));
        }
        return arrayList;
    }
}
