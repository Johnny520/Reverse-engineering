package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3887;
import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p097.InterfaceC7857;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5260 extends AbstractC5273 implements InterfaceC7857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f13391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Annotation[] f13393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5269 f13394;

    public C5260(AbstractC5269 abstractC5269, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.f13394 = abstractC5269;
        this.f13393 = annotationArr;
        this.f13392 = str;
        this.f13391 = z;
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        return AbstractC3887.m7212(this.f13393);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C5260.class.getName());
        sb.append(": ");
        sb.append(this.f13391 ? "vararg " : "");
        String str = this.f13392;
        sb.append(str != null ? C5523.m9890(str) : null);
        sb.append(": ");
        sb.append(this.f13394);
        return sb.toString();
    }

    @Override // p097.InterfaceC7857
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5262 mo9531(C5519 c5519) {
        c5519.getClass();
        return AbstractC3887.m7218(this.f13393, c5519);
    }
}
