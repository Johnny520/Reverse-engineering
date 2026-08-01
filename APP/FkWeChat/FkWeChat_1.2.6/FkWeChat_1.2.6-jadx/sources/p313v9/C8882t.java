package p313v9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import p081fa.InterfaceC2383k;
import p154k5.C3972g;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: v9.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8882t extends AbstractC8887y implements InterfaceC2383k {

    /* JADX INFO: renamed from: a */
    public final Constructor f29464a;

    public C8882t(Constructor constructor) {
        constructor.getClass();
        this.f29464a = constructor;
    }

    @Override // p313v9.AbstractC8887y
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Constructor mo34023V() {
        return this.f29464a;
    }

    @Override // p081fa.InterfaceC2398z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = mo34023V().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C8866f0(typeVariable));
        }
        return arrayList;
    }

    @Override // p081fa.InterfaceC2383k
    /* JADX INFO: renamed from: m */
    public List mo8630m() {
        Type[] genericParameterTypes = mo34023V().getGenericParameterTypes();
        genericParameterTypes.getClass();
        if (genericParameterTypes.length == 0) {
            return AbstractC5114x.m20800o();
        }
        Class declaringClass = mo34023V().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) AbstractC5102r.m20668t(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = mo34023V().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            C3972g.m15749a("Illegal generic signature: ", mo34023V());
            return null;
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            parameterAnnotations.getClass();
            parameterAnnotations = (Annotation[][]) AbstractC5102r.m20668t(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        parameterAnnotations.getClass();
        return m34070W(genericParameterTypes, parameterAnnotations, mo34023V().isVarArgs());
    }
}
