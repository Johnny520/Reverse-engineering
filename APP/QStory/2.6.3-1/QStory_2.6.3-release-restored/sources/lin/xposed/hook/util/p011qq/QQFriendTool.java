package lin.xposed.hook.util.p011qq;

import androidx.activity.AbstractC0900;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONReader$Feature;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import p025.AbstractC7012;
import p026.AbstractC7017;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p053.AbstractC7199;
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
            Object objCallMethod = XposedHelpers.callMethod(Hook_cookie.getRuntime(), "getBusinessHandler", new Class[]{String.class}, new Object[]{(String) AbstractC7165.m12416(AbstractC7166.m12425("com.tencent.mobileqq.app.BusinessHandlerFactory"), String.class, "FRIENDLIST_HANDLER")});
            C7164 c7164M12413 = C7164.m12413(objCallMethod.getClass());
            c7164M12413.f17803.f3964 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
            String strM14531 = "delFriend";
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3962 = Void.TYPE;
            c7164M12413.m12415(objCallMethod, "ProfileCardMoreActivity", str, (byte) 2, 0);
        } catch (Exception e) {
            String strM145312 = "deleteFriend";
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
    }

    public static ArrayList<FriendInfo> getAllFriend() {
        ArrayList<FriendInfo> arrayList = new ArrayList<>();
        long gtk = QQEnvTool.getGTK(Hook_cookie.getPskey("qzone.qq.com"));
        StringBuilder sbM700 = AbstractC0900.m700("uin=o" + QQEnvTool.getCurrentUin());
        sbM700.append("; p_uin=o=");
        sbM700.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append("; skey=");
        sbM7002.append(Hook_cookie.getSkey());
        StringBuilder sbM7003 = AbstractC0900.m700(sbM7002.toString());
        sbM7003.append("; p_skey=");
        sbM7003.append(Hook_cookie.getPskey("qzone.qq.com"));
        for (QZoneFriend.Friend friend : ((QZoneFriend) InterfaceC3749.m6934(AbstractC7199.m12508("https://h5.qzone.qq.com/proxy/domain/mobile.qzone.qq.com/friend/mfriend_list?g_tk=" + gtk + "&res_uin=" + QQEnvTool.getCurrentUin() + "&res_type=normal&format=json&uin=" + QQEnvTool.getCurrentUin(), sbM7003.toString())).getObject("data", QZoneFriend.class, new JSONReader$Feature[0])).getList()) {
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
            long gtk = QQEnvTool.getGTK(Hook_cookie.getPskey("qzone.qq.com"));
            QZoneFriend qZoneFriend = (QZoneFriend) InterfaceC3749.m6934(AbstractC7199.m12508("https://h5.qzone.qq.com/proxy/domain/mobile.qzone.qq.com/friend/mfriend_list?g_tk=" + gtk + "&res_uin=" + QQEnvTool.getCurrentUin() + "&res_type=normal&format=json&uin=" + QQEnvTool.getCurrentUin(), ((("uin=o" + QQEnvTool.getCurrentUin()) + "; p_uin=o=" + QQEnvTool.getCurrentUin()) + "; skey=" + Hook_cookie.getSkey()) + "; p_skey=" + Hook_cookie.getPskey("qzone.qq.com"))).getObject("data", QZoneFriend.class, new JSONReader$Feature[0]);
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
            String strM14531 = "getAllFriendWithCategories";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return friendListResult;
        }
    }

    private static Object getQQNTFriendInfoService() {
        return AbstractC7012.m12146(945);
    }

    public static boolean isFriend(String str) {
        Object qQNTFriendInfoService = getQQNTFriendInfoService();
        C7164 c7164M12413 = C7164.m12413(qQNTFriendInfoService.getClass());
        String strM14531 = "isFriend";
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3963 = strM14531;
        c2080.f3962 = Boolean.TYPE;
        c2080.f3964 = new Class[]{String.class, String.class};
        return ((Boolean) c7164M12413.m12415(qQNTFriendInfoService, QQEnvTool.getCurrentUin(), str)).booleanValue();
    }

    public static void sendLike(String str, int i) {
        try {
            byte[] bArr = {12, 24, 0, 1, 6, 1, 49, 22, 1, 49};
            Object objCallMethod = XposedHelpers.callMethod(Hook_cookie.getRuntime(), "getBusinessHandler", new Class[]{String.class}, new Object[]{AbstractC7165.m12416(AbstractC7166.m12425("com.tencent.mobileqq.app.BusinessHandlerFactory"), String.class, "CARD_HANLDER")});
            C7164 c7164M12412 = C7164.m12412("com.tencent.mobileqq.app.CardHandler");
            Class cls = Void.TYPE;
            C2080 c2080 = c7164M12412.f17803;
            c2080.f3962 = cls;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            c2080.f3964 = new Class[]{cls2, cls2, byte[].class, cls3, cls3, cls3};
            c7164M12412.m12415(objCallMethod, Long.valueOf(Long.parseLong(Hook_cookie.getMyuin())), Long.valueOf(Long.parseLong(str)), bArr, Integer.valueOf(isFriend(str) ? 1 : 10), Integer.valueOf(i), 0);
        } catch (Exception e) {
            String strM14532 = "like";
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
        }
    }
}
