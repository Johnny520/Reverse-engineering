package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5797 extends AbstractC5776 {
    @Override // retrofit2.AbstractC5776
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5795 mo11111(Type type, Annotation[] annotationArr) {
        if (AbstractC5784.m11130(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            C5919.m11250("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        int i = 0;
        Type typeM11131 = AbstractC5784.m11131(0, (ParameterizedType) type);
        if (AbstractC5784.m11130(typeM11131) != C5754.class) {
            return new C5799(i, typeM11131);
        }
        if (typeM11131 instanceof ParameterizedType) {
            return new C5799(1, AbstractC5784.m11131(0, (ParameterizedType) typeM11131));
        }
        C5919.m11250("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
