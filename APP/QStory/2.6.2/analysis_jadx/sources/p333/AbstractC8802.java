package p333;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQNTTroopTool;
import p007.AbstractC6136;
import p075.C6960;
import p348.InterfaceC8864;
import p349.C8865;

/* JADX INFO: renamed from: 飘花落叶言苏世子哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8802 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList f24775 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ArrayList f24774 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m14451(String str, String str2, String str3) {
        AbstractC6136.m11546(-3937706981486495143L, -3937586675157566887L, str);
        str2.getClass();
        AbstractC3056.m6668(-3937707007256298919L);
        if (f24774.contains(str) && m14452(str2)) {
            QQNTTroopTool.kickMember(str, str2, true);
            InterfaceC8864 interfaceC8864M14510 = C8865.m14510();
            String groupName = QQNTTroopTool.getGroupName(str);
            AbstractC3056.m6668(-3937688122285098407L);
            groupName.getClass();
            String currentUin = QQEnvTool.getCurrentUin();
            AbstractC3056.m6668(-3937693259065984423L);
            currentUin.getClass();
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            AbstractC3056.m6668(-3937693203231409575L);
            currentAccountNickName.getClass();
            String memberName = QQNTTroopTool.getMemberName(str, str2);
            AbstractC3056.m6668(-3937706899882116519L);
            memberName.getClass();
            interfaceC8864M14510.m14505(str, groupName, currentUin, currentAccountNickName, str2, memberName, str3).mo11106(new C6960(24));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m14452(String str) {
        AbstractC3056.m6668(-3937586675157566887L);
        str.getClass();
        if (str.equals(AbstractC3056.m6668(-3937561652678100391L))) {
            return false;
        }
        return f24775.contains(str);
    }
}
