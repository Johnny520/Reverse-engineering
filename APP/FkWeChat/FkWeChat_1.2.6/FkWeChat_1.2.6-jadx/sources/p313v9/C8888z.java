package p313v9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import p081fa.InterfaceC2371b;
import p081fa.InterfaceC2390r;
import p313v9.AbstractC8864e0;

/* JADX INFO: renamed from: v9.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8888z extends AbstractC8887y implements InterfaceC2390r {

    /* JADX INFO: renamed from: a */
    public final Method f29468a;

    public C8888z(Method method) {
        method.getClass();
        this.f29468a = method;
    }

    @Override // p081fa.InterfaceC2390r
    /* JADX INFO: renamed from: O */
    public boolean mo8639O() {
        return mo8642u() != null;
    }

    @Override // p313v9.AbstractC8887y
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Method mo34023V() {
        return this.f29468a;
    }

    @Override // p081fa.InterfaceC2390r
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public AbstractC8864e0 mo8640f() {
        AbstractC8864e0.a aVar = AbstractC8864e0.f29430a;
        Type genericReturnType = mo34023V().getGenericReturnType();
        genericReturnType.getClass();
        return aVar.m34024a(genericReturnType);
    }

    @Override // p081fa.InterfaceC2398z
    public List getTypeParameters() {
        TypeVariable<Method>[] typeParameters = mo34023V().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C8866f0(typeVariable));
        }
        return arrayList;
    }

    @Override // p081fa.InterfaceC2390r
    /* JADX INFO: renamed from: m */
    public List mo8641m() {
        Type[] genericParameterTypes = mo34023V().getGenericParameterTypes();
        genericParameterTypes.getClass();
        Annotation[][] parameterAnnotations = mo34023V().getParameterAnnotations();
        parameterAnnotations.getClass();
        return m34070W(genericParameterTypes, parameterAnnotations, mo34023V().isVarArgs());
    }

    @Override // p081fa.InterfaceC2390r
    /* JADX INFO: renamed from: u */
    public InterfaceC2371b mo8642u() {
        Object defaultValue = mo34023V().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC8869h.f29441b.m34042a(defaultValue, null);
        }
        return null;
    }
}
