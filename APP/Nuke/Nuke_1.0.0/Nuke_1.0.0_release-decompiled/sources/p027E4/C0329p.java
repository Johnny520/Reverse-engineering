package p027E4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p000A.C0038T0;

/* JADX INFO: renamed from: E4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0329p extends AbstractC0319f {

    /* JADX INFO: renamed from: a */
    public final Executor f1049a;

    public C0329p(Executor executor) {
        this.f1049a = executor;
    }

    @Override // p027E4.AbstractC0319f
    /* JADX INFO: renamed from: a */
    public final InterfaceC0320g mo551a(Type type, Annotation[] annotationArr) {
        if (AbstractC0315b0.m537h(type) != InterfaceC0318e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C0038T0(2, AbstractC0315b0.m536g(0, (ParameterizedType) type), AbstractC0315b0.m541l(annotationArr, InterfaceC0308W.class) ? null : this.f1049a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
