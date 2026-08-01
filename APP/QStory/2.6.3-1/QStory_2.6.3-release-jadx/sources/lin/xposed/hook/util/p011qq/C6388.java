package lin.xposed.hook.util.p011qq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lin.xposed.hook.util.p011qq.QQSessionUtils;

/* JADX INFO: renamed from: lin.xposed.hook.util.qq.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6388 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15667;

    public /* synthetic */ C6388(int i) {
        this.f15667 = i;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f15667) {
            case 0:
                return QQNTTroopTool.lambda$setGroupMemberTitle$2(obj, method, objArr);
            case 1:
                return QQSessionUtils.QQNT.lambda$prepareTroopMemberStrangerTempChat$0(obj, method, objArr);
            default:
                return null;
        }
    }
}
