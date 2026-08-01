package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3887;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p097.InterfaceC7856;
import p097.InterfaceC7857;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5270 extends AbstractC5273 implements InterfaceC7857, InterfaceC7856 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TypeVariable f13412;

    public C5270(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.f13412 = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5270) {
            return AbstractC5227.m9466(this.f13412, ((C5270) obj).f13412);
        }
        return false;
    }

    @Override // p097.InterfaceC7857
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f13412;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? EmptyList.INSTANCE : AbstractC3887.m7212(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f13412.hashCode();
    }

    public final String toString() {
        return C5270.class.getName() + ": " + this.f13412;
    }

    @Override // p097.InterfaceC7857
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C5262 mo9531(C5519 c5519) {
        Annotation[] declaredAnnotations;
        c5519.getClass();
        TypeVariable typeVariable = this.f13412;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC3887.m7218(declaredAnnotations, c5519);
    }
}
