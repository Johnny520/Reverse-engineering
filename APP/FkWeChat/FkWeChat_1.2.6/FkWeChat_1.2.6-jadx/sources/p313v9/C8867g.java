package p313v9;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import p081fa.InterfaceC2369a;
import p213oa.C5691b;
import p213oa.C5695f;
import p313v9.AbstractC8869h;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: v9.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8867g extends AbstractC8883u implements InterfaceC2369a {

    /* JADX INFO: renamed from: a */
    public final Annotation f29436a;

    public C8867g(Annotation annotation) {
        annotation.getClass();
        this.f29436a = annotation;
    }

    /* JADX INFO: renamed from: U */
    public final Annotation m34039U() {
        return this.f29436a;
    }

    @Override // p081fa.InterfaceC2369a
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public C8879q mo8593C() {
        return new C8879q(AbstractC9886a.m38367b(AbstractC9886a.m38366a(this.f29436a)));
    }

    @Override // p081fa.InterfaceC2369a
    /* JADX INFO: renamed from: c */
    public Collection mo8594c() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = AbstractC9886a.m38367b(AbstractC9886a.m38366a(this.f29436a)).getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC8869h.a aVar = AbstractC8869h.f29441b;
            Object objInvoke = method.invoke(this.f29436a, null);
            objInvoke.getClass();
            arrayList.add(aVar.m34042a(objInvoke, C5695f.m23027j(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8867g) && this.f29436a == ((C8867g) obj).f29436a;
    }

    @Override // p081fa.InterfaceC2369a
    /* JADX INFO: renamed from: h */
    public C5691b mo8595h() {
        return AbstractC8865f.m34029e(AbstractC9886a.m38367b(AbstractC9886a.m38366a(this.f29436a)));
    }

    public int hashCode() {
        return System.identityHashCode(this.f29436a);
    }

    @Override // p081fa.InterfaceC2369a
    /* JADX INFO: renamed from: i */
    public boolean mo8596i() {
        return false;
    }

    public String toString() {
        return C8867g.class.getName() + ": " + this.f29436a;
    }

    @Override // p081fa.InterfaceC2369a
    /* JADX INFO: renamed from: y */
    public boolean mo8597y() {
        return false;
    }
}
