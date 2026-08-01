package lin.xposed.hook.util.qq;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONReader$Feature;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import p009.AbstractC6183;
import p010.AbstractC6188;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p037.AbstractC6370;
import p287.AbstractC8405;
import top.suzhelan.qstory.entity.QZoneFriend;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQFriendTool {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class FriendListResult {
        public ArrayList<NewFriendInfo> friends = new ArrayList<>();
        public Map<Integer, String> categories = new HashMap();
    }

    public static void deleteFriend(String str) {
        try {
            Object objCallMethod = XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(602), new Class[]{String.class}, new Object[]{(String) AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(600)), String.class, AbstractC8405.m13972(952))});
            C6335 c6335M11854 = C6335.m11854(objCallMethod.getClass());
            c6335M11854.f17458.f3619 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
            String strM13972 = AbstractC8405.m13972(953);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3617 = Void.TYPE;
            c6335M11854.m11856(objCallMethod, AbstractC8405.m13972(954), str, (byte) 2, 0);
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(955);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
    }

    public static ArrayList<FriendInfo> getAllFriend() {
        ArrayList<FriendInfo> arrayList = new ArrayList<>();
        long gtk = QQEnvTool.getGTK(Hook_cookie.getPskey(AbstractC8405.m13972(946)));
        StringBuilder sbM140 = AbstractC0053.m140(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM140.append(AbstractC8405.m13972(947));
        sbM140.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM1402 = AbstractC0053.m140(sbM140.toString());
        sbM1402.append(AbstractC8405.m13973("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM1402.append(Hook_cookie.getSkey());
        StringBuilder sbM1403 = AbstractC0053.m140(sbM1402.toString());
        sbM1403.append(AbstractC8405.m13972(948));
        sbM1403.append(Hook_cookie.getPskey(AbstractC8405.m13972(946)));
        for (QZoneFriend.Friend friend : ((QZoneFriend) InterfaceC2916.m6374(AbstractC6370.m11949(AbstractC8405.m13972(949) + gtk + AbstractC8405.m13972(950) + QQEnvTool.getCurrentUin() + AbstractC8405.m13972(951) + QQEnvTool.getCurrentUin(), sbM1403.toString())).getObject(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), QZoneFriend.class, new JSONReader$Feature[0])).getList()) {
            FriendInfo friendInfo = new FriendInfo();
            friendInfo.uin = friend.getUin().toString();
            friendInfo.name = friend.getNick();
            friendInfo.remark = friend.getRemark();
            boolean z = true;
            if (friend.getIsvip().intValue() != 1) {
                z = false;
            }
            friendInfo.isVip = z;
            friendInfo.vipLevel = friend.getViplevel().intValue();
            arrayList.add(friendInfo);
        }
        return arrayList;
    }

    public static FriendListResult getAllFriendWithCategories() {
        FriendListResult friendListResult = new FriendListResult();
        try {
            long gtk = QQEnvTool.getGTK(Hook_cookie.getPskey(AbstractC8405.m13972(946)));
            QZoneFriend qZoneFriend = (QZoneFriend) InterfaceC2916.m6374(AbstractC6370.m11949(AbstractC8405.m13972(949) + gtk + AbstractC8405.m13972(950) + QQEnvTool.getCurrentUin() + AbstractC8405.m13972(951) + QQEnvTool.getCurrentUin(), (((AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin()) + AbstractC8405.m13972(947) + QQEnvTool.getCurrentUin()) + AbstractC8405.m13973("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵") + Hook_cookie.getSkey()) + AbstractC8405.m13972(948) + Hook_cookie.getPskey(AbstractC8405.m13972(946)))).getObject(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), QZoneFriend.class, new JSONReader$Feature[0]);
            if (qZoneFriend.getGpnames() != null) {
                for (QZoneFriend.GpnamesDTO gpnamesDTO : qZoneFriend.getGpnames()) {
                    friendListResult.categories.put(gpnamesDTO.getGpid(), gpnamesDTO.getGpname());
                }
            }
            for (QZoneFriend.Friend friend : qZoneFriend.getList()) {
                NewFriendInfo newFriendInfo = new NewFriendInfo();
                newFriendInfo.uin = friend.getUin().toString();
                newFriendInfo.nickname = friend.getNick();
                newFriendInfo.remark = friend.getRemark();
                newFriendInfo.categoryId = friend.getGroupid() != null ? friend.getGroupid().intValue() : 0;
                friendListResult.friends.add(newFriendInfo);
            }
            return friendListResult;
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(956);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
            return friendListResult;
        }
    }

    private static Object getQQNTFriendInfoService() {
        return AbstractC6183.m11587(945);
    }

    public static boolean isFriend(String str) {
        Object qQNTFriendInfoService = getQQNTFriendInfoService();
        C6335 c6335M11854 = C6335.m11854(qQNTFriendInfoService.getClass());
        String strM13972 = AbstractC8405.m13972(622);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3618 = strM13972;
        c1245.f3617 = Boolean.TYPE;
        c1245.f3619 = new Class[]{String.class, String.class};
        return ((Boolean) c6335M11854.m11856(qQNTFriendInfoService, QQEnvTool.getCurrentUin(), str)).booleanValue();
    }

    public static void sendLike(String str, int i) {
        try {
            byte[] bArr = {12, 24, 0, 1, 6, 1, 49, 22, 1, 49};
            Object objCallMethod = XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(602), new Class[]{String.class}, new Object[]{AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(600)), String.class, AbstractC8405.m13972(943))});
            C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(944));
            Class cls = Void.TYPE;
            C1245 c1245 = c6335M11853.f17458;
            c1245.f3617 = cls;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            c1245.f3619 = new Class[]{cls2, cls2, byte[].class, cls3, cls3, cls3};
            c6335M11853.m11856(objCallMethod, Long.valueOf(Long.parseLong(Hook_cookie.getMyuin())), Long.valueOf(Long.parseLong(str)), bArr, Integer.valueOf(isFriend(str) ? 1 : 10), Integer.valueOf(i), 0);
        } catch (Exception e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜");
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
        }
    }
}
