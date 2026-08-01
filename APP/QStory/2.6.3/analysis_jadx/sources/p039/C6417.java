package p039;

import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4388;
import lin.xposed.hook.util.qq.QQMessageUtils;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p038.C6377;
import p075.C6958;
import p287.AbstractC8405;
import p321.C8698;
import p321.CallableC8697;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6417 implements InterfaceC6312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Method f17598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Class f17599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17600;

    public /* synthetic */ C6417(Class cls, Method method, int i) {
        this.f17600 = i;
        this.f17598 = method;
        this.f17599 = cls;
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        int i = this.f17600;
        Class cls = this.f17599;
        Method method = this.f17598;
        int i2 = 0;
        switch (i) {
            case 0:
                Object objInvoke = method.invoke(methodHookParam.thisObject, null);
                C6335 c6335M11854 = C6335.m11854(cls);
                c6335M11854.f17458.f3618 = AbstractC8405.m13972(164);
                Object objM11856 = c6335M11854.m11856(objInvoke, new Object[0]);
                int iIntValue = ((Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(125), objM11856)).intValue();
                ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), objM11856);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    C6335 c6335M118542 = C6335.m11854(obj.getClass());
                    c6335M118542.f17458.f3618 = AbstractC8405.m13972(140);
                    c6335M118542.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178));
                    Object objM118562 = c6335M118542.m11856(obj, new Object[0]);
                    if (objM118562 != null) {
                        arrayList3.add(((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(179), objM118562)).toUpperCase());
                        arrayList2.add(QQMessageUtils.getPicElementUrl(iIntValue, objM118562));
                    }
                }
                ((List) methodHookParam.getResult()).add(0, C6377.m11961(objInvoke, AbstractC8405.m13972(180), R.mipmap.ic_launcher_round, new CallableC6420(arrayList2, arrayList3, 1)));
                break;
            default:
                C6958 c6958 = C8698.f24520;
                Object objInvoke2 = method.invoke(methodHookParam.thisObject, null);
                C6335 c6335M118543 = C6335.m11854(cls);
                c6335M118543.f17458.f3618 = AbstractC8405.m13972(164);
                Object objM11961 = C6377.m11961(objInvoke2, AbstractC8405.m13972(180), R.mipmap.ic_launcher_round, new CallableC8697(c6335M118543.m11856(objInvoke2, new Object[0]), i2));
                Object result = methodHookParam.getResult();
                AbstractC8405.m13972(2016);
                result.getClass();
                List listM8891 = AbstractC4388.m8891(result);
                objM11961.getClass();
                listM8891.add(0, objM11961);
                break;
        }
    }
}
