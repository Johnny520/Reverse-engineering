package lin.xposed.hook.util.qq;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: lin.xposed.hook.util.qq.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5557 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ CompletableFuture f15323;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15324;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15325;

    public /* synthetic */ C5557(CompletableFuture completableFuture, Object obj, int i) {
        this.f15325 = i;
        this.f15323 = completableFuture;
        this.f15324 = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ArrayList arrayList;
        int i = this.f15325;
        Class cls = Void.TYPE;
        Object obj2 = this.f15324;
        CompletableFuture completableFuture = this.f15323;
        switch (i) {
            case 0:
                return QQNTTroopTool.lambda$getProhibitList$0(completableFuture, obj2, obj, method, objArr);
            case 1:
                return QQNTTroopTool.lambda$getMemberInfo$1(completableFuture, obj2, obj, method, objArr);
            case 2:
                if (!AbstractC4394.m8917(method.getReturnType(), cls) || method.getParameterTypes().length != 2) {
                    return method.invoke(obj2, null);
                }
                if (AbstractC4394.m8917(method.getParameterTypes()[0], List.class)) {
                    objArr.getClass();
                    Object obj3 = objArr[0];
                    "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>";
                    obj3.getClass();
                    arrayList = (ArrayList) obj3;
                } else {
                    objArr.getClass();
                    Object obj4 = objArr[1];
                    "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>";
                    obj4.getClass();
                    arrayList = (ArrayList) obj4;
                }
                completableFuture.complete(arrayList);
                return null;
            default:
                if (AbstractC4394.m8917(method.getReturnType(), cls) && method.getParameterTypes().length == 1) {
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
