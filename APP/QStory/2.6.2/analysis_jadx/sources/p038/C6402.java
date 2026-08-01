package p038;

import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4387;
import lin.xposed.hook.util.qq.QQMessageUtils;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p037.C6360;
import p075.C6960;
import p324.C8748;
import p324.CallableC8747;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6402 implements InterfaceC6294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Method f17559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Class f17560;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17561;

    public /* synthetic */ C6402(Class cls, Method method, int i) {
        this.f17561 = i;
        this.f17559 = method;
        this.f17560 = cls;
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        int i = this.f17561;
        Class cls = this.f17560;
        Method method = this.f17559;
        int i2 = 0;
        switch (i) {
            case 0:
                Object objInvoke = method.invoke(methodHookParam.thisObject, null);
                C6316 c6316M11826 = C6316.m11826(cls);
                c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                Object objM11828 = c6316M11826.m11828(objInvoke, new Object[0]);
                int iIntValue = ((Integer) AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937565801616508327L), objM11828)).intValue();
                ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), objM11828);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    C6316 c6316M118262 = C6316.m11826(obj.getClass());
                    c6316M118262.f17409.f3617 = AbstractC3056.m6668(-3937579635706168743L);
                    c6316M118262.f17409.f3616 = AbstractC6318.m11838(AbstractC3056.m6668(-3937575778825536935L));
                    Object objM118282 = c6316M118262.m11828(obj, new Object[0]);
                    if (objM118282 != null) {
                        arrayList3.add(((String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937575551192270247L), objM118282)).toUpperCase());
                        arrayList2.add(QQMessageUtils.getPicElementUrl(iIntValue, objM118282));
                    }
                }
                ((List) methodHookParam.getResult()).add(0, C6360.m11913(objInvoke, AbstractC3056.m6668(-3937575491062728103L), R.mipmap.ic_launcher_round, new CallableC6385(arrayList2, arrayList3, 1)));
                break;
            default:
                C6960 c6960 = C8748.f24653;
                Object objInvoke2 = method.invoke(methodHookParam.thisObject, null);
                C6316 c6316M118263 = C6316.m11826(cls);
                c6316M118263.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                Object objM11913 = C6360.m11913(objInvoke2, AbstractC3056.m6668(-3937575491062728103L), R.mipmap.ic_launcher_round, new CallableC8747(c6316M118263.m11828(objInvoke2, new Object[0]), i2));
                Object result = methodHookParam.getResult();
                AbstractC3056.m6668(-3937770933549532583L);
                result.getClass();
                List listM8901 = AbstractC4387.m8901(result);
                objM11913.getClass();
                listM8901.add(0, objM11913);
                break;
        }
    }
}
