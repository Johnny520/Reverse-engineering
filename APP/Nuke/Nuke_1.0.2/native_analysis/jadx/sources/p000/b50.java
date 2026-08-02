package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b50 extends AbstractC0893xo {

    /* JADX INFO: renamed from: a */
    public final Executor f565a;

    public b50(Executor executor) {
        this.f565a = executor;
    }

    @Override // p000.AbstractC0893xo
    /* JADX INFO: renamed from: a */
    public final InterfaceC0930yo mo439a(Type type, Annotation[] annotationArr) {
        if (xe1.m6086D(type) != InterfaceC0854wo.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new sz0(7, xe1.m6085C(0, (ParameterizedType) type), xe1.m6092J(annotationArr, mr2.class) ? null : this.f565a);
        }
        C0676s.m4651j("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
