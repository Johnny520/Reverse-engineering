package p313v9;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2397y;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p213oa.C5692c;
import p213oa.C5695f;

/* JADX INFO: renamed from: v9.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8866f0 extends AbstractC8883u implements InterfaceC8872j, InterfaceC2397y {

    /* JADX INFO: renamed from: a */
    public final TypeVariable f29435a;

    public C8866f0(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.f29435a = typeVariable;
    }

    @Override // p081fa.InterfaceC2397y
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.f29435a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C8881s(type));
        }
        C8881s c8881s = (C8881s) AbstractC5081g0.m20539K0(arrayList);
        return AbstractC1061t.m3842c(c8881s != null ? c8881s.mo34021U() : null, Object.class) ? AbstractC5114x.m20800o() : arrayList;
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
        return (obj instanceof C8866f0) && AbstractC1061t.m3842c(this.f29435a, ((C8866f0) obj).f29435a);
    }

    @Override // p313v9.InterfaceC8872j, p081fa.InterfaceC2375d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listM34046b;
        AnnotatedElement annotatedElementMo34038z = mo34038z();
        return (annotatedElementMo34038z == null || (declaredAnnotations = annotatedElementMo34038z.getDeclaredAnnotations()) == null || (listM34046b = AbstractC8873k.m34046b(declaredAnnotations)) == null) ? AbstractC5114x.m20800o() : listM34046b;
    }

    @Override // p081fa.InterfaceC2392t
    public C5695f getName() {
        C5695f c5695fM23027j = C5695f.m23027j(this.f29435a.getName());
        c5695fM23027j.getClass();
        return c5695fM23027j;
    }

    public int hashCode() {
        return this.f29435a.hashCode();
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return false;
    }

    public String toString() {
        return C8866f0.class.getName() + ": " + this.f29435a;
    }

    @Override // p313v9.InterfaceC8872j
    /* JADX INFO: renamed from: z */
    public AnnotatedElement mo34038z() {
        TypeVariable typeVariable = this.f29435a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
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
