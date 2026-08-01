package p338;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C4327;
import kotlin.text.C5147;
import kotlin.text.InterfaceC5149;
import kotlin.text.Regex;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6157;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏世楪子兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8810 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8810 f24796;

    static {
        "FriendUtils";
        f24796 = new C8810();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ArrayList m14454() {
        ArrayList arrayList = new ArrayList();
        try {
            Object objM14455 = m14455();
            if (objM14455 != null) {
                C6316 c6316M11826 = C6316.m11826(objM14455.getClass());
                String strM6668 = "getAllFriend";
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3616 = List.class;
                c1245.f3618 = new Class[]{String.class};
                Object objM11828 = c6316M11826.m11828(objM14455, "FriendsManager_getAllFriends");
                "null cannot be cast to non-null type kotlin.collections.List<*>";
                objM11828.getClass();
                for (Object obj : (List) objM11828) {
                    Object objM11831 = AbstractC6317.m11831(String.class, "uin", obj);
                    "getField(...)";
                    objM11831.getClass();
                    Object objM118312 = AbstractC6317.m11831(String.class, "nick", obj);
                    "getField(...)";
                    objM118312.getClass();
                    Object objM118313 = AbstractC6317.m11831(String.class, "remark", obj);
                    "getField(...)";
                    objM118313.getClass();
                    String strM66682 = "age";
                    Class cls = Integer.TYPE;
                    Object objM118314 = AbstractC6317.m11831(cls, strM66682, obj);
                    "getField(...)";
                    objM118314.getClass();
                    int iIntValue = ((Number) objM118314).intValue();
                    Object objM118315 = AbstractC6317.m11831(cls, "sex", obj);
                    "getField(...)";
                    objM118315.getClass();
                    int iIntValue2 = ((Number) objM118315).intValue();
                    Integer num = (Integer) AbstractC6317.m11831(cls, "categoryId", obj);
                    NewFriendInfo newFriendInfo = new NewFriendInfo();
                    newFriendInfo.uin = (String) objM11831;
                    newFriendInfo.nickname = (String) objM118312;
                    newFriendInfo.remark = (String) objM118313;
                    newFriendInfo.age = iIntValue;
                    newFriendInfo.sex = iIntValue2;
                    num.getClass();
                    newFriendInfo.categoryId = num.intValue();
                    arrayList.add(newFriendInfo);
                }
            }
            return arrayList;
        } catch (Exception e) {
            String strM66683 = "getAllFriend";
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66683, e.toString(), e, true);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m14455() {
        try {
            return QQEnvTool.getQRouteApi(AbstractC6318.m11838("com.tencent.qqnt.ntrelation.friendsinfo.api.IFriendsInfoService"));
        } catch (Exception e) {
            String strM6668 = "getFriendsInfoService";
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m14456(String str) {
        "uid";
        try {
            f24796.getClass();
            Object objM14455 = m14455();
            if (objM14455 != null) {
                C6316 c6316M11826 = C6316.m11826(objM14455.getClass());
                String strM6668 = "getNickWithUid";
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3616 = String.class;
                c1245.f3618 = new Class[]{String.class, String.class};
                Object objM11828 = c6316M11826.m11828(objM14455, str, "AIOUtils");
                if (objM11828 instanceof String) {
                    return (String) objM11828;
                }
            }
            return null;
        } catch (Exception e) {
            String strM66682 = "getFriendNick";
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static LinkedHashMap m14457() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Object objM14455 = m14455();
            if (objM14455 != null) {
                C6316 c6316M11826 = C6316.m11826(objM14455.getClass());
                String strM6668 = "getFriendsCategoryBaseInfo";
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3616 = List.class;
                c1245.f3618 = new Class[]{String.class};
                Object objM11828 = c6316M11826.m11828(objM14455, "FriendsManager");
                List list = objM11828 instanceof List ? (List) objM11828 : null;
                if (list != null) {
                    for (Object obj : list) {
                        try {
                            try {
                                Object objM11831 = AbstractC6317.m11831(Integer.TYPE, "categoryId", obj);
                                "getField(...)";
                                objM11831.getClass();
                                int iIntValue = ((Number) objM11831).intValue();
                                Object objM118312 = AbstractC6317.m11831(String.class, "categoryName", obj);
                                "getField(...)";
                                objM118312.getClass();
                                linkedHashMap.put(Integer.valueOf(iIntValue), (String) objM118312);
                            } catch (Exception unused) {
                                String strValueOf = String.valueOf(obj);
                                InterfaceC5149 interfaceC5149Find$default = Regex.find$default(new Regex("categoryId=(\\d+)"), strValueOf, 0, 2, null);
                                InterfaceC5149 interfaceC5149Find$default2 = Regex.find$default(new Regex("categoryName=([^,)]+)"), strValueOf, 0, 2, null);
                                if (interfaceC5149Find$default != null && interfaceC5149Find$default2 != null) {
                                    linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) ((C4327) ((C5147) interfaceC5149Find$default).m10177()).get(1))), ((C4327) ((C5147) interfaceC5149Find$default2).m10177()).get(1));
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } catch (Exception e) {
            String strM66682 = "getFriendCategories";
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14458(String str) {
        "uin";
        str.getClass();
        try {
            Object appRuntime = QQEnvTool.getAppRuntime();
            Object objM11829 = AbstractC6317.m11829(AbstractC6318.m11838("com.tencent.mobileqq.app.BusinessHandlerFactory"), String.class, "FRIENDLIST_HANDLER");
            "getStaticField(...)";
            objM11829.getClass();
            Object objCallMethod = XposedHelpers.callMethod(appRuntime, "getBusinessHandler", new Object[]{(String) objM11829});
            C6316 c6316M11826 = C6316.m11826(objCallMethod.getClass());
            String strM6668 = "delFriend";
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
            c1245.f3616 = Void.TYPE;
            c6316M11826.m11828(objCallMethod, "ProfileCardMoreActivity", str, (byte) 2, 0);
        } catch (Exception e) {
            String strM66682 = "deleteFriend";
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }
}
