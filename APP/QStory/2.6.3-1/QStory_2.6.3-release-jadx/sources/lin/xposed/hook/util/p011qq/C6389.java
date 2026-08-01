package lin.xposed.hook.util.p011qq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.AbstractC5227;
import p303.AbstractC9234;

/* JADX INFO: renamed from: lin.xposed.hook.util.qq.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6389 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CompletableFuture f15668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15670;

    public /* synthetic */ C6389(CompletableFuture completableFuture, Object obj, int i) {
        this.f15670 = i;
        this.f15668 = completableFuture;
        this.f15669 = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ArrayList arrayList;
        int i = this.f15670;
        Class cls = Void.TYPE;
        Object obj2 = this.f15669;
        CompletableFuture completableFuture = this.f15668;
        switch (i) {
            case 0:
                return QQNTTroopTool.lambda$getProhibitList$0(completableFuture, obj2, obj, method, objArr);
            case 1:
                return QQNTTroopTool.lambda$getMemberInfo$1(completableFuture, obj2, obj, method, objArr);
            case 2:
                if (!AbstractC5227.m9466(method.getReturnType(), cls) || method.getParameterTypes().length != 2) {
                    return method.invoke(obj2, null);
                }
                if (AbstractC5227.m9466(method.getParameterTypes()[0], List.class)) {
                    objArr.getClass();
                    Object obj3 = objArr[0];
                    AbstractC9234.m14531(1540);
                    obj3.getClass();
                    arrayList = (ArrayList) obj3;
                } else {
                    objArr.getClass();
                    Object obj4 = objArr[1];
                    AbstractC9234.m14531(1540);
                    obj4.getClass();
                    arrayList = (ArrayList) obj4;
                }
                completableFuture.complete(arrayList);
                return null;
            default:
                if (AbstractC5227.m9466(method.getReturnType(), cls) && method.getParameterTypes().length == 1) {
                    objArr.getClass();
                    completableFuture.complete(objArr[0]);
                    return null;
                }
                if (objArr == null) {
                    objArr = new Object[0];
                }
                return method.invoke(obj2, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
