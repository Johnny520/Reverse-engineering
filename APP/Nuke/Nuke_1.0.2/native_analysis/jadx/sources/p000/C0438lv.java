package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: lv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0438lv extends AbstractC0893xo {
    @Override // p000.AbstractC0893xo
    /* JADX INFO: renamed from: a */
    public final InterfaceC0930yo mo439a(Type type, Annotation[] annotationArr) {
        if (xe1.m6086D(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            C0676s.m4653l("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeM6085C = xe1.m6085C(0, (ParameterizedType) type);
        if (xe1.m6086D(typeM6085C) != q92.class) {
            return new C0364jv(0, typeM6085C);
        }
        if (typeM6085C instanceof ParameterizedType) {
            return new C0364jv(1, xe1.m6085C(0, (ParameterizedType) typeM6085C));
        }
        C0676s.m4653l("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
