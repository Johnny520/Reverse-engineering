package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p081.InterfaceC7026;
import p081.InterfaceC7027;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4437 extends AbstractC4440 implements InterfaceC7027, InterfaceC7026 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TypeVariable f13063;

    public C4437(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.f13063 = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4437) {
            return AbstractC4394.m8917(this.f13063, ((C4437) obj).f13063);
        }
        return false;
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f13063;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? EmptyList.INSTANCE : AbstractC4921.m9895(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f13063.hashCode();
    }

    public final String toString() {
        return C4437.class.getName() + ": " + this.f13063;
    }

    @Override // p081.InterfaceC7027
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4429 mo8982(C4686 c4686) {
        Annotation[] declaredAnnotations;
        c4686.getClass();
        TypeVariable typeVariable = this.f13063;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC4921.m9900(declaredAnnotations, c4686);
    }
}
