package lin.xposed.hook.util.qq;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p036.AbstractC6353;
import top.suzhelan.qstory.entity.QZoneFriend;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQFriendTool {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class FriendListResult {
        public ArrayList<NewFriendInfo> friends = new ArrayList<>();
        public Map<Integer, String> categories = new HashMap();
    }

    public static void deleteFriend(String str) {
        try {
            Object objCallMethod = XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC3056.m6668(-3937617848030201255L), new Class[]{String.class}, new Object[]{(String) AbstractC6317.m11829(AbstractC6318.m11838(AbstractC3056.m6668(-3937618144382944679L)), String.class, AbstractC3056.m6668(-3937655596497765799L))});
            C6316 c6316M11826 = C6316.m11826(objCallMethod.getClass());
            c6316M11826.f17409.f3618 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
            String strM6668 = AbstractC3056.m6668(-3937655506303452583L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3616 = Void.TYPE;
            c6316M11826.m11828(objCallMethod, AbstractC3056.m6668(-3937655446173910439L), str, (byte) 2, 0);
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937655411814172071L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }

    public static ArrayList<FriendInfo> getAllFriend() {
        ArrayList<FriendInfo> arrayList = new ArrayList<>();
        long gtk = QQEnvTool.getGTK(Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)));
        StringBuilder sbM149 = AbstractC0053.m149(AbstractC3056.m6668(-3937656275102598567L) + QQEnvTool.getCurrentUin());
        sbM149.append(AbstractC3056.m6668(-3937656266512663975L));
        sbM149.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append(AbstractC3056.m6668(-3937656210678089127L));
        sbM1492.append(Hook_cookie.getSkey());
        StringBuilder sbM1493 = AbstractC0053.m149(sbM1492.toString());
        sbM1493.append(AbstractC3056.m6668(-3937656245037827495L));
        sbM1493.append(Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)));
        for (QZoneFriend.Friend friend : ((QZoneFriend) InterfaceC2915.m6316(AbstractC6353.m11901(AbstractC3056.m6668(-3937656116188808615L) + gtk + AbstractC3056.m6668(-3937655785476326823L) + QQEnvTool.getCurrentUin() + AbstractC3056.m6668(-3937655725346784679L) + QQEnvTool.getCurrentUin(), sbM1493.toString())).getObject(AbstractC3056.m6668(-3937589565670557095L), QZoneFriend.class, new JSONReader$Feature[0])).getList()) {
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
            long gtk = QQEnvTool.getGTK(Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)));
            QZoneFriend qZoneFriend = (QZoneFriend) InterfaceC2915.m6316(AbstractC6353.m11901(AbstractC3056.m6668(-3937656116188808615L) + gtk + AbstractC3056.m6668(-3937655785476326823L) + QQEnvTool.getCurrentUin() + AbstractC3056.m6668(-3937655725346784679L) + QQEnvTool.getCurrentUin(), (((AbstractC3056.m6668(-3937656275102598567L) + QQEnvTool.getCurrentUin()) + AbstractC3056.m6668(-3937656266512663975L) + QQEnvTool.getCurrentUin()) + AbstractC3056.m6668(-3937656210678089127L) + Hook_cookie.getSkey()) + AbstractC3056.m6668(-3937656245037827495L) + Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)))).getObject(AbstractC3056.m6668(-3937589565670557095L), QZoneFriend.class, new JSONReader$Feature[0]);
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
            String strM6668 = AbstractC3056.m6668(-3937655295850055079L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return friendListResult;
        }
    }

    private static Object getQQNTFriendInfoService() {
        return AbstractC6136.m11554(-3937656597225145767L);
    }

    public static boolean isFriend(String str) {
        Object qQNTFriendInfoService = getQQNTFriendInfoService();
        C6316 c6316M11826 = C6316.m11826(qQNTFriendInfoService.getClass());
        String strM6668 = AbstractC3056.m6668(-3937616529475241383L);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3617 = strM6668;
        c1245.f3616 = Boolean.TYPE;
        c1245.f3618 = new Class[]{String.class, String.class};
        return ((Boolean) c6316M11826.m11828(qQNTFriendInfoService, QQEnvTool.getCurrentUin(), str)).booleanValue();
    }

    public static void sendLike(String str, int i) {
        try {
            byte[] bArr = {12, 24, 0, 1, 6, 1, 49, 22, 1, 49};
            Object objCallMethod = XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC3056.m6668(-3937617848030201255L), new Class[]{String.class}, new Object[]{AbstractC6317.m11829(AbstractC6318.m11838(AbstractC3056.m6668(-3937618144382944679L)), String.class, AbstractC3056.m6668(-3937656910757758375L))});
            C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937656863513118119L));
            Class cls = Void.TYPE;
            C1245 c1245 = c6316M11825.f17409;
            c1245.f3616 = cls;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            c1245.f3618 = new Class[]{cls2, cls2, byte[].class, cls3, cls3, cls3};
            c6316M11825.m11828(objCallMethod, Long.valueOf(Long.parseLong(Hook_cookie.getMyuin())), Long.valueOf(Long.parseLong(str)), bArr, Integer.valueOf(isFriend(str) ? 1 : 10), Integer.valueOf(i), 0);
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937656713189262759L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }
}
