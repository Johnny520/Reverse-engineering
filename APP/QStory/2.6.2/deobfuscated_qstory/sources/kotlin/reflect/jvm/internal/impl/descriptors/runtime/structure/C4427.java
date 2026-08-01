package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p081.InterfaceC7027;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4427 extends AbstractC4440 implements InterfaceC7027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Annotation[] f13044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4436 f13045;

    public C4427(AbstractC4436 abstractC4436, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.f13045 = abstractC4436;
        this.f13044 = annotationArr;
        this.f13043 = str;
        this.f13042 = z;
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        return AbstractC4921.m9895(this.f13044);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4427.class.getName());
        sb.append(": ");
        sb.append(this.f13042 ? "vararg " : "");
        String str = this.f13043;
        sb.append(str != null ? C4690.m9341(str) : null);
        sb.append(": ");
        sb.append(this.f13045);
        return sb.toString();
    }

    @Override // p081.InterfaceC7027
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4429 mo8982(C4686 c4686) {
        c4686.getClass();
        return AbstractC4921.m9900(this.f13044, c4686);
    }
}
