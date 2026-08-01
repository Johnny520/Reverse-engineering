package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3055;
import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p081.InterfaceC7028;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4428 extends AbstractC4441 implements InterfaceC7028 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Annotation[] f13048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4437 f13049;

    public C4428(AbstractC4437 abstractC4437, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.f13049 = abstractC4437;
        this.f13048 = annotationArr;
        this.f13047 = str;
        this.f13046 = z;
    }

    @Override // p081.InterfaceC7028
    public final Collection getAnnotations() {
        return AbstractC3055.m6652(this.f13048);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4428.class.getName());
        sb.append(": ");
        sb.append(this.f13046 ? "vararg " : "");
        String str = this.f13047;
        sb.append(str != null ? C4691.m9331(str) : null);
        sb.append(": ");
        sb.append(this.f13049);
        return sb.toString();
    }

    @Override // p081.InterfaceC7028
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4430 mo8972(C4687 c4687) {
        c4687.getClass();
        return AbstractC3055.m6658(this.f13048, c4687);
    }
}
