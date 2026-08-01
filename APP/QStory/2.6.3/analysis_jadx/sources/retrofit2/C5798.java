package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5798 extends AbstractC5777 {
    @Override // retrofit2.AbstractC5777
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5796 mo11168(Type type, Annotation[] annotationArr) {
        if (AbstractC5785.m11187(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            C5925.m11311("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        int i = 0;
        Type typeM11188 = AbstractC5785.m11188(0, (ParameterizedType) type);
        if (AbstractC5785.m11187(typeM11188) != C5755.class) {
            return new C5800(i, typeM11188);
        }
        if (typeM11188 instanceof ParameterizedType) {
            return new C5800(1, AbstractC5785.m11188(0, (ParameterizedType) typeM11188));
        }
        C5925.m11311("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
