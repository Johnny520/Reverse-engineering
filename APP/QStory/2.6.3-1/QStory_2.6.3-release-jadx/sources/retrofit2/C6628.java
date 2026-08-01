package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6628 extends AbstractC6607 {
    @Override // retrofit2.AbstractC6607
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6626 mo11727(Type type, Annotation[] annotationArr) {
        if (AbstractC6615.m11746(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            C6755.m11870("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        int i = 0;
        Type typeM11747 = AbstractC6615.m11747(0, (ParameterizedType) type);
        if (AbstractC6615.m11746(typeM11747) != C6585.class) {
            return new C6630(i, typeM11747);
        }
        if (typeM11747 instanceof ParameterizedType) {
            return new C6630(1, AbstractC6615.m11747(0, (ParameterizedType) typeM11747));
        }
        C6755.m11870("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
