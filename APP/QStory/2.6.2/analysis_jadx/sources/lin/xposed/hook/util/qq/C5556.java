package lin.xposed.hook.util.qq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lin.xposed.hook.util.qq.QQSessionUtils;

/* JADX INFO: renamed from: lin.xposed.hook.util.qq.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5556 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15322;

    public /* synthetic */ C5556(int i) {
        this.f15322 = i;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f15322) {
            case 0:
                return QQNTTroopTool.lambda$setGroupMemberTitle$2(obj, method, objArr);
            case 1:
                return QQSessionUtils.QQNT.lambda$prepareTroopMemberStrangerTempChat$0(obj, method, objArr);
            default:
                return null;
        }
    }
}
