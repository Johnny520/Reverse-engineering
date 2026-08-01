package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C4690;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4446 extends AbstractC4428 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object[] f13071;

    public C4446(C4690 c4690, Object[] objArr) {
        super(c4690);
        this.f13071 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m8995() {
        Object[] objArr = this.f13071;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = AbstractC4430.f13051;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C4444(null, (Enum) obj) : obj instanceof Annotation ? new C4447(null, (Annotation) obj) : obj instanceof Object[] ? new C4446(null, (Object[]) obj) : obj instanceof Class ? new C4448(null, (Class) obj) : new C4442(null, obj));
        }
        return arrayList;
    }
}
