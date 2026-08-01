package p355;

import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C5160;
import kotlin.text.C5980;
import kotlin.text.InterfaceC5982;
import kotlin.text.Regex;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7017;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏世楪子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9637 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9637 f25139;

    static {
        "FriendUtils";
        f25139 = new C9637();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ArrayList m15036() {
        ArrayList arrayList = new ArrayList();
        try {
            Object objM15037 = m15037();
            if (objM15037 != null) {
                C7164 c7164M12413 = C7164.m12413(objM15037.getClass());
                String strM14531 = "getAllFriend";
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3962 = List.class;
                c2080.f3964 = new Class[]{String.class};
                Object objM12415 = c7164M12413.m12415(objM15037, "FriendsManager_getAllFriends");
                "null cannot be cast to non-null type kotlin.collections.List<*>";
                objM12415.getClass();
                for (Object obj : (List) objM12415) {
                    Object objM12418 = AbstractC7165.m12418(String.class, "uin", obj);
                    "getField(...)";
                    objM12418.getClass();
                    Object objM124182 = AbstractC7165.m12418(String.class, "nick", obj);
                    "getField(...)";
                    objM124182.getClass();
                    Object objM124183 = AbstractC7165.m12418(String.class, "remark", obj);
                    "getField(...)";
                    objM124183.getClass();
                    String strM14532 = "age";
                    Class cls = Integer.TYPE;
                    Object objM124184 = AbstractC7165.m12418(cls, strM14532, obj);
                    "getField(...)";
                    objM124184.getClass();
                    int iIntValue = ((Number) objM124184).intValue();
                    Object objM124185 = AbstractC7165.m12418(cls, "sex", obj);
                    "getField(...)";
                    objM124185.getClass();
                    int iIntValue2 = ((Number) objM124185).intValue();
                    Integer num = (Integer) AbstractC7165.m12418(cls, "categoryId", obj);
                    NewFriendInfo newFriendInfo = new NewFriendInfo();
                    newFriendInfo.uin = (String) objM12418;
                    newFriendInfo.nickname = (String) objM124182;
                    newFriendInfo.remark = (String) objM124183;
                    newFriendInfo.age = iIntValue;
                    newFriendInfo.sex = iIntValue2;
                    num.getClass();
                    newFriendInfo.categoryId = num.intValue();
                    arrayList.add(newFriendInfo);
                }
            }
            return arrayList;
        } catch (Exception e) {
            String strM145312 = "getAllFriend";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m15037() {
        try {
            return QQEnvTool.getQRouteApi(AbstractC7166.m12425("com.tencent.qqnt.ntrelation.friendsinfo.api.IFriendsInfoService"));
        } catch (Exception e) {
            String strM14531 = "getFriendsInfoService";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m15038(String str) {
        "uid";
        try {
            f25139.getClass();
            Object objM15037 = m15037();
            if (objM15037 != null) {
                C7164 c7164M12413 = C7164.m12413(objM15037.getClass());
                String strM14531 = "getNickWithUid";
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3962 = String.class;
                c2080.f3964 = new Class[]{String.class, String.class};
                Object objM12415 = c7164M12413.m12415(objM15037, str, "AIOUtils");
                if (objM12415 instanceof String) {
                    return (String) objM12415;
                }
            }
            return null;
        } catch (Exception e) {
            String strM145312 = "getFriendNick";
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static LinkedHashMap m15039() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Object objM15037 = m15037();
            if (objM15037 != null) {
                C7164 c7164M12413 = C7164.m12413(objM15037.getClass());
                String strM14531 = "getFriendsCategoryBaseInfo";
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3962 = List.class;
                c2080.f3964 = new Class[]{String.class};
                Object objM12415 = c7164M12413.m12415(objM15037, "FriendsManager");
                List list = objM12415 instanceof List ? (List) objM12415 : null;
                if (list != null) {
                    for (Object obj : list) {
                        try {
                            try {
                                Object objM12418 = AbstractC7165.m12418(Integer.TYPE, "categoryId", obj);
                                "getField(...)";
                                objM12418.getClass();
                                int iIntValue = ((Number) objM12418).intValue();
                                Object objM124182 = AbstractC7165.m12418(String.class, "categoryName", obj);
                                "getField(...)";
                                objM124182.getClass();
                                linkedHashMap.put(Integer.valueOf(iIntValue), (String) objM124182);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            String strValueOf = String.valueOf(obj);
                            InterfaceC5982 interfaceC5982Find$default = Regex.find$default(new Regex("categoryId=(\\d+)"), strValueOf, 0, 2, null);
                            InterfaceC5982 interfaceC5982Find$default2 = Regex.find$default(new Regex("categoryName=([^,)]+)"), strValueOf, 0, 2, null);
                            if (interfaceC5982Find$default != null && interfaceC5982Find$default2 != null) {
                                linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) ((C5160) ((C5980) interfaceC5982Find$default).m10740()).get(1))), ((C5160) ((C5980) interfaceC5982Find$default2).m10740()).get(1));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            String strM145312 = "getFriendCategories";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m15040(String str) {
        "uin";
        str.getClass();
        try {
            Object appRuntime = QQEnvTool.getAppRuntime();
            Object objM12416 = AbstractC7165.m12416(AbstractC7166.m12425("com.tencent.mobileqq.app.BusinessHandlerFactory"), String.class, "FRIENDLIST_HANDLER");
            "getStaticField(...)";
            objM12416.getClass();
            Object objCallMethod = XposedHelpers.callMethod(appRuntime, "getBusinessHandler", new Object[]{(String) objM12416});
            C7164 c7164M12413 = C7164.m12413(objCallMethod.getClass());
            String strM14531 = "delFriend";
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
            c2080.f3962 = Void.TYPE;
            c7164M12413.m12415(objCallMethod, "ProfileCardMoreActivity", str, (byte) 2, 0);
        } catch (Exception e) {
            String strM145312 = "deleteFriend";
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
    }
}
