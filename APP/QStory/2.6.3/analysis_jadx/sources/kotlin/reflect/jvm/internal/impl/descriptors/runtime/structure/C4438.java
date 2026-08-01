package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3055;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p081.InterfaceC7027;
import p081.InterfaceC7028;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4438 extends AbstractC4441 implements InterfaceC7028, InterfaceC7027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TypeVariable f13067;

    public C4438(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.f13067 = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4438) {
            return AbstractC4395.m8907(this.f13067, ((C4438) obj).f13067);
        }
        return false;
    }

    @Override // p081.InterfaceC7028
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f13067;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? EmptyList.INSTANCE : AbstractC3055.m6652(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f13067.hashCode();
    }

    public final String toString() {
        return C4438.class.getName() + ": " + this.f13067;
    }

    @Override // p081.InterfaceC7028
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4430 mo8972(C4687 c4687) {
        Annotation[] declaredAnnotations;
        c4687.getClass();
        TypeVariable typeVariable = this.f13067;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC3055.m6658(declaredAnnotations, c4687);
    }
}
