package p362;

import java.util.ArrayList;
import lin.xposed.hook.javaplugin.bean.GroupMemberInfo;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.RunnableC7015;
import p405.C9915;
import p405.C9921;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9666 {
    static {
        "TroopAdminUtils";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m15061(Object obj) {
        String str = (String) C9915.m15222(String.class, "troopuin", obj);
        String str2 = "AdminCache_" + str;
        if (AbstractC9667.m15065(str) && AbstractC9667.f25288.m15239(String.class, str2).contains(QQEnvTool.getCurrentUin())) {
            return true;
        }
        int i = C9921.f25825;
        C9921 c9921M15231 = C9921.m15231(obj.getClass());
        c9921M15231.f25826 = "isOwnerOrAdmin";
        c9921M15231.f25828 = Boolean.TYPE;
        return ((Boolean) c9921M15231.m15233(obj, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m15062(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = "AdminCache_" + str;
        AbstractC9667.m15064(str);
        if (AbstractC9667.m15065(str2)) {
            return AbstractC9667.f25288.m15239(String.class, str2);
        }
        C9924 c9924 = AbstractC9667.f25288;
        c9924.getClass();
        if (c9924.f25834.contains(str2)) {
            new Thread(new RunnableC7015(str, 2));
            return c9924.m15239(String.class, str2);
        }
        for (GroupMemberInfo groupMemberInfo : C9665.m15054(str)) {
            if (groupMemberInfo.IsAdmin) {
                arrayList.add(groupMemberInfo.UserUin);
            }
        }
        AbstractC9667.m15063(str, arrayList);
        return arrayList;
    }
}
