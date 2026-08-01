package bsh;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson2.AbstractC2905;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3065;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQMsgService;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p320.C8685;
import p326.C8743;
import p326.C8745;
import p338.C8805;
import p389.AbstractC9090;
import p389.C9086;
import p389.C9088;
import p389.C9092;
import top.suzhelan.qstory.hook.item.C5929;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2661 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7968;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7969;

    public /* synthetic */ C2661(Object obj, int i) {
        this.f7969 = i;
        this.f7968 = obj;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v5 int, still in use, count: 1, list:
  (r11v5 int) from 0x0444: INVOKE (r0v13 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏兰哲), (r11v5 int), (r2v11 java.lang.String), (r1v11 java.util.ArrayList) VIRTUAL call: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世苏兰哲.飘花落叶言子楪世苏哲兰(int, java.lang.String, java.util.ArrayList):void A[MD:(int, java.lang.String, java.util.ArrayList):void (m), REMOVE] (LINE:1093)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:271)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.markCodeForRemoval(SwitchOverStringVisitor.java:160)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:124)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:71)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        int i = this.f7969;
        Class cls = Integer.TYPE;
        Object obj3 = this.f7968;
        switch (i) {
            case 0:
                AbstractC2651 abstractC2651 = (AbstractC2651) obj3;
                abstractC2651.getClass();
                if (method.getDeclaringClass() == Object.class) {
                    String name = method.getName();
                    name.getClass();
                    switch (name) {
                        case "toString":
                            return "BshLambdaProxy[" + abstractC2651 + "]";
                        case "equals":
                            return Boolean.valueOf(objArr != null && objArr.length == 1 && obj == objArr[0]);
                        case "hashCode":
                            return Integer.valueOf(System.identityHashCode(obj));
                    }
                }
                return abstractC2651.invoke(objArr != null ? objArr : AbstractC2667.f8002, method.getExceptionTypes(), method.getReturnType());
            case 1:
                return QQMsgService.lambda$getMsgsByMsgId$1((QQMsgService.IMsgOperateCallback) obj3, obj, method, objArr);
            case 2:
                C8685 c8685 = (C8685) obj3;
                if (AbstractC4395.m8907(method.getName(), AbstractC8405.m13972(978)) && objArr != null && objArr.length >= 1 && (obj2 = objArr[0]) != null) {
                    String str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵呜呜"), obj2);
                    if (str == null) {
                        str = "";
                    }
                    ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜"), obj2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    c8685.m14408(r11, str, arrayList);
                }
                return null;
            case 3:
                C8745 c8745 = (C8745) obj3;
                AbstractC8405.m13972(1293);
                method.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr.getClass();
                Object obj4 = objArr[2];
                AbstractC8405.m13972(2631);
                obj4.getClass();
                byte[] byteArray = ((Bundle) obj4).getByteArray(AbstractC8405.m13972(449));
                byteArray.getClass();
                Object objM14667 = C9088.m14667(AbstractC9090.m14669(AbstractC8405.m13972(450)), new Object[0]);
                AbstractC8405.m13972(2627);
                objM14667.getClass();
                int i2 = C9092.f25480;
                C9092 c9092M14672 = C9092.m14672(objM14667.getClass());
                c9092M14672.f25481 = AbstractC8405.m13972(451);
                c9092M14672.m14675(byte[].class);
                Object objM14676 = c9092M14672.m14676(objM14667, byteArray);
                AbstractC8405.m13972(2628);
                objM14676.getClass();
                int i3 = C9086.f25468;
                C9086 c9086M14662 = C9086.m14662(objM14676.getClass());
                c9086M14662.f25470 = AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵呜呜");
                Object objM14665 = c9086M14662.m14665(objM14676);
                C9092 c9092M14671 = C9092.m14671(objM14665);
                c9092M14671.f25481 = AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵");
                c9092M14671.f25483 = String.class;
                String str2 = (String) c9092M14671.m14676(objM14665, new Object[0]);
                C9086 c9086M146622 = C9086.m14662(objM14676.getClass());
                c9086M146622.f25470 = AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵喵");
                Object objM146652 = c9086M146622.m14665(objM14676);
                C9092 c9092M146712 = C9092.m14671(objM146652);
                c9092M146712.f25483 = null;
                c9092M146712.f25481 = AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵");
                String str3 = (String) c9092M146712.m14676(objM146652, new Object[0]);
                C9086 c9086M146623 = C9086.m14662(objM14676.getClass());
                c9086M146623.f25470 = AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜喵~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵喵喵");
                Object objM146653 = c9086M146623.m14665(objM14676);
                C9092 c9092M146713 = C9092.m14671(objM146653);
                c9092M146713.f25481 = AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵");
                Object objM146762 = c9092M146713.m14676(objM146653, new Object[0]);
                objM146762.getClass();
                String str4 = (String) AbstractC3065.m6837(objM146762, AbstractC8405.m13972(452), new Object[0]);
                str2.getClass();
                str3.getClass();
                Object obj5 = c8745.f24655;
                if (obj5 == null) {
                    AbstractC4395.m8908(AbstractC8405.m13972(2629));
                    throw null;
                }
                Object obj6 = c8745.f24656;
                if (obj6 == null) {
                    AbstractC4395.m8908(AbstractC8405.m13972(433));
                    throw null;
                }
                Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(407));
                Class clsM146692 = AbstractC9090.m14669(AbstractC8405.m13972(408));
                Class clsM146693 = AbstractC9090.m14669(AbstractC8405.m13972(409));
                Class clsM146694 = AbstractC9090.m14669(AbstractC8405.m13972(410));
                C9092 c9092M146722 = C9092.m14672(obj6.getClass());
                c9092M146722.f25481 = AbstractC8405.m13972(411);
                c9092M146722.f25483 = clsM146693;
                Object objM146763 = c9092M146722.m14676(obj6, new Object[0]);
                Object obj7 = c8745.f24658;
                C9092 c9092M146714 = C9092.m14671(obj7);
                c9092M146714.f25481 = AbstractC8405.m13972(412);
                c9092M146714.f25483 = clsM146694;
                Class cls2 = Boolean.TYPE;
                c9092M146714.m14675(cls2, cls2, clsM14669, clsM146693, clsM146692, String.class);
                Boolean bool = Boolean.TRUE;
                Object objM146764 = c9092M146714.m14676(obj7, bool, bool, obj5, objM146763, null, str4);
                C9092 c9092M146715 = C9092.m14671(objM146764);
                c9092M146715.f25481 = AbstractC8405.m13972(413);
                c9092M146715.f25483 = String.class;
                String str5 = (String) c9092M146715.m14676(objM146764, new Object[0]);
                if (JSONObject.parseObject(str5).getIntValue(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵喵"), -1) == 0 && !TextUtils.isEmpty(str5)) {
                    c8745.f24652.complete(str5);
                }
                return null;
            case 4:
                C8743 c8743 = (C8743) obj3;
                AbstractC8405.m13972(1293);
                method.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜");
                objArr.getClass();
                Object obj8 = objArr[2];
                AbstractC8405.m13972(2631);
                obj8.getClass();
                byte[] byteArray2 = ((Bundle) obj8).getByteArray(AbstractC8405.m13972(449));
                byteArray2.getClass();
                Object objM146672 = C9088.m14667(AbstractC9090.m14669(AbstractC8405.m13972(450)), new Object[0]);
                AbstractC8405.m13972(2627);
                objM146672.getClass();
                int i4 = C9092.f25480;
                C9092 c9092M146723 = C9092.m14672(objM146672.getClass());
                c9092M146723.f25481 = AbstractC8405.m13972(451);
                c9092M146723.m14675(byte[].class);
                Object objM146765 = c9092M146723.m14676(objM146672, byteArray2);
                AbstractC8405.m13972(2628);
                objM146765.getClass();
                int i5 = C9086.f25468;
                C9086 c9086M146624 = C9086.m14662(objM146765.getClass());
                c9086M146624.f25470 = AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵呜呜");
                Object objM146654 = c9086M146624.m14665(objM146765);
                C9092 c9092M146716 = C9092.m14671(objM146654);
                c9092M146716.f25481 = AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵");
                c9092M146716.f25483 = String.class;
                c9092M146716.m14676(objM146654, new Object[0]);
                C9086 c9086M146625 = C9086.m14662(objM146765.getClass());
                c9086M146625.f25470 = AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵喵");
                Object objM146655 = c9086M146625.m14665(objM146765);
                C9092 c9092M146717 = C9092.m14671(objM146655);
                c9092M146717.f25483 = null;
                c9092M146717.f25481 = AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵");
                c9092M146717.m14676(objM146655, new Object[0]);
                C9086 c9086M146626 = C9086.m14662(objM146765.getClass());
                c9086M146626.f25470 = AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜喵~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                Object objM146656 = c9086M146626.m14665(objM146765);
                C9092 c9092M146718 = C9092.m14671(objM146656);
                c9092M146718.f25483 = String.class;
                c9092M146718.f25481 = AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵");
                String str6 = (String) c9092M146718.m14676(objM146656, new Object[0]);
                str6.getClass();
                String currentUin = QQEnvTool.getCurrentUin();
                Object objM14666 = C9088.m14666(new Object[]{AbstractC6358.f17507}, new Class[]{Context.class}, AbstractC9090.m14669(AbstractC8405.m13972(396)));
                AbstractC8405.m13972(2627);
                objM14666.getClass();
                C9092 c9092M146724 = C9092.m14672(objM14666.getClass());
                c9092M146724.m14675(String.class, String.class, cls, String.class);
                c9092M146724.f25483 = AbstractC9090.m14669(AbstractC8405.m13972(1104));
                c9092M146724.f25481 = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵");
                String str7 = (String) C9086.m14663(String.class, AbstractC8405.m13972(400), c9092M146724.m14676(objM14666, currentUin, AbstractC8405.m13972(418), Integer.valueOf(c8743.f24637), str6));
                str7.getClass();
                c8743.f24643.complete(str7);
                return null;
            default:
                ((Boolean) objArr[1]).getClass();
                Object objM11845 = AbstractC6333.m11845(AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(450)), new Object[0]), AbstractC8405.m13972(451), new Class[]{byte[].class}, ((Bundle) objArr[2]).getByteArray(AbstractC8405.m13972(449)));
                String str8 = (String) AbstractC6333.m11846(String.class, AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), AbstractC6336.m11860(objM11845.getClass(), AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜喵~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜")).get(objM11845));
                C5929 c5929 = ((C8805) obj3).f24778;
                String currentUin2 = QQEnvTool.getCurrentUin();
                Object objM6285 = AbstractC2905.m6285(new Object[]{AbstractC6358.f17507}, new Class[]{Context.class}, AbstractC6337.m11866(AbstractC8405.m13972(396)));
                C6335 c6335M11854 = C6335.m11854(objM6285.getClass());
                c6335M11854.f17458.f3619 = new Class[]{String.class, String.class, cls, String.class};
                c6335M11854.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(1104));
                c6335M11854.f17458.f3618 = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵");
                c5929.m11317((String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(400), c6335M11854.m11856(objM6285, currentUin2, AbstractC8405.m13972(418), Integer.valueOf(C8805.f24777), str8)));
                return null;
        }
    }
}
