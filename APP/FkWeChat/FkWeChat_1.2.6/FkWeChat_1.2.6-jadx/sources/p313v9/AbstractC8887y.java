package p313v9;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2389q;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p213oa.C5692c;
import p213oa.C5695f;
import p213oa.C5697h;
import p229p9.AbstractC6051w1;
import p229p9.C6048v1;
import p284t9.C8206a;
import p284t9.C8207b;
import p284t9.C8208c;

/* JADX INFO: renamed from: v9.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8887y extends AbstractC8883u implements InterfaceC8872j, InterfaceC8856a0, InterfaceC2389q {
    @Override // p081fa.InterfaceC2391s
    /* JADX INFO: renamed from: T */
    public boolean mo8643T() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // p081fa.InterfaceC2389q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public C8879q mo8638S() {
        Class<?> declaringClass = mo34023V().getDeclaringClass();
        declaringClass.getClass();
        return new C8879q(declaringClass);
    }

    /* JADX INFO: renamed from: V */
    public abstract Member mo34023V();

    /* JADX INFO: renamed from: W */
    public final List m34070W(Type[] typeArr, Annotation[][] annotationArr, boolean z10) throws IllegalAccessException, InvocationTargetException {
        String str;
        typeArr.getClass();
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(typeArr.length);
        List listM34018b = C8859c.f29420a.m34018b(mo34023V());
        int size = listM34018b != null ? listM34018b.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i10 = 0;
        while (i10 < length) {
            AbstractC8864e0 abstractC8864e0M34024a = AbstractC8864e0.f29430a.m34024a(typeArr[i10]);
            if (listM34018b != null) {
                str = (String) AbstractC5081g0.m20579m0(listM34018b, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + abstractC8864e0M34024a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new C8868g0(abstractC8864e0M34024a, annotationArr[i10], str, z10 && i10 == AbstractC5106t.m20732f0(typeArr)));
            i10++;
        }
        return arrayList;
    }

    @Override // p313v9.InterfaceC8872j, p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: b */
    public C8867g mo8603b(C5692c c5692c) {
        Annotation[] declaredAnnotations;
        c5692c.getClass();
        AnnotatedElement annotatedElementMo34038z = mo34038z();
        if (annotatedElementMo34038z == null || (declaredAnnotations = annotatedElementMo34038z.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC8873k.m34045a(declaredAnnotations, c5692c);
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC8887y) && AbstractC1061t.m3842c(mo34023V(), ((AbstractC8887y) obj).mo34023V());
    }

    @Override // p081fa.InterfaceC2391s
    /* JADX INFO: renamed from: g */
    public AbstractC6051w1 mo8644g() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? C6048v1.h.f19010c : Modifier.isPrivate(modifiers) ? C6048v1.e.f19007c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C8208c.f27519c : C8207b.f27518c : C8206a.f27517c;
    }

    @Override // p313v9.InterfaceC8872j, p081fa.InterfaceC2375d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listM34046b;
        AnnotatedElement annotatedElementMo34038z = mo34038z();
        return (annotatedElementMo34038z == null || (declaredAnnotations = annotatedElementMo34038z.getDeclaredAnnotations()) == null || (listM34046b = AbstractC8873k.m34046b(declaredAnnotations)) == null) ? AbstractC5114x.m20800o() : listM34046b;
    }

    @Override // p313v9.InterfaceC8856a0
    public int getModifiers() {
        return mo34023V().getModifiers();
    }

    @Override // p081fa.InterfaceC2392t
    public C5695f getName() {
        C5695f c5695fM23027j;
        String name = mo34023V().getName();
        return (name == null || (c5695fM23027j = C5695f.m23027j(name)) == null) ? C5697h.f17916b : c5695fM23027j;
    }

    public int hashCode() {
        return mo34023V().hashCode();
    }

    @Override // p081fa.InterfaceC2391s
    /* JADX INFO: renamed from: j */
    public boolean mo8645j() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return false;
    }

    @Override // p081fa.InterfaceC2391s
    /* JADX INFO: renamed from: r */
    public boolean mo8646r() {
        return Modifier.isFinal(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + mo34023V();
    }

    @Override // p313v9.InterfaceC8872j
    /* JADX INFO: renamed from: z */
    public AnnotatedElement mo34038z() {
        Member memberMo34023V = mo34023V();
        memberMo34023V.getClass();
        return (AnnotatedElement) memberMo34023V;
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC2369a mo8603b(C5692c c5692c) {
        return mo8603b(c5692c);
    }

    @Override // p081fa.InterfaceC2375d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }
}
