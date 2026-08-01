package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4500;
import kotlin.reflect.jvm.internal.impl.descriptors.C4502;
import kotlin.reflect.jvm.internal.impl.descriptors.C4506;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4691;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p078.C6973;
import p078.C6974;
import p078.C6975;
import p081.InterfaceC7025;
import p081.InterfaceC7027;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4443 extends AbstractC4440 implements InterfaceC7027, InterfaceC7025 {
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4443) && AbstractC4394.m8917(mo8989(), ((AbstractC4443) obj).mo8989());
    }

    @Override // p081.InterfaceC7027
    public final Collection getAnnotations() {
        Member memberMo8989 = mo8989();
        memberMo8989.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo8989).getDeclaredAnnotations();
        return declaredAnnotations != null ? AbstractC4921.m9895(declaredAnnotations) : EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return mo8989().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo8989();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC4500 m8992() {
        int modifiers = mo8989().getModifiers();
        return Modifier.isPublic(modifiers) ? C4506.f13142 : Modifier.isPrivate(modifiers) ? C4502.f13138 : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C6973.f18670 : C6974.f18671 : C6975.f18672;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m8993(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4443.m8993(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4690 m8994() {
        String name = mo8989().getName();
        return name != null ? C4690.m9340(name) : AbstractC4691.f13707;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Member mo8989();

    @Override // p081.InterfaceC7027
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4429 mo8982(C4686 c4686) {
        c4686.getClass();
        Member memberMo8989 = mo8989();
        memberMo8989.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo8989).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return AbstractC4921.m9900(declaredAnnotations, c4686);
        }
        return null;
    }
}
