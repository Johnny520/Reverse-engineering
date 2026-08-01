package lin.xposed.hook.util.qq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;
import p037.C6358;

/* JADX INFO: renamed from: lin.xposed.hook.util.qq.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5558 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CompletableFuture f15326;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15327;

    public /* synthetic */ C5558(CompletableFuture completableFuture, int i) {
        this.f15327 = i;
        this.f15326 = completableFuture;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i = this.f15327;
        CompletableFuture completableFuture = this.f15326;
        switch (i) {
            case 0:
                return Hook_cookie.lambda$getPskey$0(completableFuture, obj, method, objArr);
            default:
                int i2 = C6358.f17483;
                String str = (String) objArr[0];
                if (str == null || str.isEmpty() || !C6358.m11912(str)) {
                    return null;
                }
                completableFuture.complete(str);
                return null;
        }
    }
}
