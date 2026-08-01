package p346;

import java.util.ArrayList;
import lin.xposed.hook.javaplugin.bean.GroupMemberInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.RunnableC6186;
import p287.AbstractC8405;
import p389.C9086;
import p389.C9092;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8837 {
    static {
        AbstractC8405.m13972(1222);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m14502(Object obj) {
        String str = (String) C9086.m14663(String.class, AbstractC8405.m13972(1223), obj);
        String str2 = AbstractC8405.m13972(1221) + str;
        if (AbstractC8838.m14506(str) && AbstractC8838.f24943.m14680(String.class, str2).contains(QQEnvTool.getCurrentUin())) {
            return true;
        }
        int i = C9092.f25480;
        C9092 c9092M14672 = C9092.m14672(obj.getClass());
        c9092M14672.f25481 = AbstractC8405.m13972(1224);
        c9092M14672.f25483 = Boolean.TYPE;
        return ((Boolean) c9092M14672.m14674(obj, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m14503(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = AbstractC8405.m13972(1221) + str;
        AbstractC8838.m14505(str);
        if (AbstractC8838.m14506(str2)) {
            return AbstractC8838.f24943.m14680(String.class, str2);
        }
        C9095 c9095 = AbstractC8838.f24943;
        c9095.getClass();
        if (c9095.f25489.contains(str2)) {
            new Thread(new RunnableC6186(str, 2));
            return c9095.m14680(String.class, str2);
        }
        for (GroupMemberInfo groupMemberInfo : C8836.m14495(str)) {
            if (groupMemberInfo.IsAdmin) {
                arrayList.add(groupMemberInfo.UserUin);
            }
        }
        AbstractC8838.m14504(str, arrayList);
        return arrayList;
    }
}
