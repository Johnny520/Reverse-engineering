package lin.xposed.hook.util.p011qq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;
import p054.C7204;

/* JADX INFO: renamed from: lin.xposed.hook.util.qq.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6390 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CompletableFuture f15671;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15672;

    public /* synthetic */ C6390(CompletableFuture completableFuture, int i) {
        this.f15672 = i;
        this.f15671 = completableFuture;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i = this.f15672;
        CompletableFuture completableFuture = this.f15671;
        switch (i) {
            case 0:
                return Hook_cookie.lambda$getPskey$0(completableFuture, obj, method, objArr);
            default:
                int i2 = C7204.f17874;
                String str = (String) objArr[0];
                if (str == null || str.isEmpty() || !C7204.m12519(str)) {
                    return null;
                }
                completableFuture.complete(str);
                return null;
        }
    }
}
