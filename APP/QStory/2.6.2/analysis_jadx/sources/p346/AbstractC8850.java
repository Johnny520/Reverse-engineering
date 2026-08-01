package p346;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import lin.xposed.hook.javaplugin.bean.GroupMemberInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p010.RunnableC6155;
import p391.C9114;
import p392.C9117;
import p392.C9125;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8850 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f24956 = 0;

    static {
        AbstractC3056.m6668(-3937678608932537767L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m14487(Object obj) {
        String str = (String) C9117.m14649(String.class, AbstractC3056.m6668(-3937678540213061031L), obj);
        String strM11557 = AbstractC6136.m11557(-3937678772141295015L, new StringBuilder(), str);
        if (AbstractC8851.m14491(str) && AbstractC8851.f24959.m14643(String.class, strM11557).contains(QQEnvTool.getCurrentUin())) {
            return true;
        }
        int i = C9125.f25503;
        C9125 c9125M14680 = C9125.m14680(obj.getClass());
        c9125M14680.f25504 = AbstractC3056.m6668(-3937678578867766695L);
        c9125M14680.f25506 = Boolean.TYPE;
        return ((Boolean) c9125M14680.m14682(obj, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m14488(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = AbstractC3056.m6668(-3937678772141295015L) + str;
        AbstractC8851.m14490(str);
        if (AbstractC8851.m14491(str2)) {
            return AbstractC8851.f24959.m14643(String.class, str2);
        }
        C9114 c9114 = AbstractC8851.f24959;
        c9114.getClass();
        if (c9114.f25485.contains(str2)) {
            new Thread(new RunnableC6155(str, 1));
            return c9114.m14643(String.class, str2);
        }
        for (GroupMemberInfo groupMemberInfo : C8849.m14480(str)) {
            if (groupMemberInfo.IsAdmin) {
                arrayList.add(groupMemberInfo.UserUin);
            }
        }
        AbstractC8851.m14489(str, arrayList);
        return arrayList;
    }
}
