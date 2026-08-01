package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bumptech.glide.AbstractC3055;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4501;
import kotlin.reflect.jvm.internal.impl.descriptors.C4503;
import kotlin.reflect.jvm.internal.impl.descriptors.C4507;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4692;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p078.C6974;
import p078.C6975;
import p078.C6976;
import p081.InterfaceC7026;
import p081.InterfaceC7028;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4444 extends AbstractC4441 implements InterfaceC7028, InterfaceC7026 {
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4444) && AbstractC4395.m8907(mo8979(), ((AbstractC4444) obj).mo8979());
    }

    @Override // p081.InterfaceC7028
    public final Collection getAnnotations() {
        Member memberMo8979 = mo8979();
        memberMo8979.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo8979).getDeclaredAnnotations();
        return declaredAnnotations != null ? AbstractC3055.m6652(declaredAnnotations) : EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return mo8979().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo8979();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC4501 m8982() {
        int modifiers = mo8979().getModifiers();
        return Modifier.isPublic(modifiers) ? C4507.f13146 : Modifier.isPrivate(modifiers) ? C4503.f13142 : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C6974.f18665 : C6975.f18666 : C6976.f18667;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m8983(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4444.m8983(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4691 m8984() {
        String name = mo8979().getName();
        return name != null ? C4691.m9330(name) : AbstractC4692.f13711;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Member mo8979();

    @Override // p081.InterfaceC7028
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4430 mo8972(C4687 c4687) {
        c4687.getClass();
        Member memberMo8979 = mo8979();
        memberMo8979.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo8979).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return AbstractC3055.m6658(declaredAnnotations, c4687);
        }
        return null;
    }
}
