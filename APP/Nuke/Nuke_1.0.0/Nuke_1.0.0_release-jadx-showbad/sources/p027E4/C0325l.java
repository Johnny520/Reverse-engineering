package p027E4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: E4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0325l extends AbstractC0319f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0319f
    /* JADX INFO: renamed from: a */
    public final InterfaceC0320g mo551a(Type type, Annotation[] annotationArr) {
        if (AbstractC0315b0.m537h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM536g = AbstractC0315b0.m536g(0, (ParameterizedType) type);
        if (AbstractC0315b0.m537h(typeM536g) != C0306U.class) {
            return new C0323j(0, typeM536g);
        }
        if (!(typeM536g instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new C0323j(1, AbstractC0315b0.m536g(0, (ParameterizedType) typeM536g));
    }
}
