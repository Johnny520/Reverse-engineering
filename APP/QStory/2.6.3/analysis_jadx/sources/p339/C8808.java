package p339;

import androidx.compose.runtime.internal.C1245;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C4328;
import kotlin.text.C5148;
import kotlin.text.InterfaceC5150;
import kotlin.text.Regex;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6188;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏世楪子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8808 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8808 f24794;

    static {
        AbstractC8405.m13972(1602);
        f24794 = new C8808();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ArrayList m14477() {
        ArrayList arrayList = new ArrayList();
        try {
            Object objM14478 = m14478();
            if (objM14478 != null) {
                C6335 c6335M11854 = C6335.m11854(objM14478.getClass());
                String strM13972 = AbstractC8405.m13972(1585);
                C1245 c1245 = c6335M11854.f17458;
                c1245.f3618 = strM13972;
                c1245.f3617 = List.class;
                c1245.f3619 = new Class[]{String.class};
                Object objM11856 = c6335M11854.m11856(objM14478, AbstractC8405.m13972(1586));
                AbstractC8405.m13972(1587);
                objM11856.getClass();
                for (Object obj : (List) objM11856) {
                    Object objM11859 = AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), obj);
                    AbstractC8405.m13972(1588);
                    objM11859.getClass();
                    Object objM118592 = AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵呜呜"), obj);
                    AbstractC8405.m13972(1588);
                    objM118592.getClass();
                    Object objM118593 = AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜"), obj);
                    AbstractC8405.m13972(1588);
                    objM118593.getClass();
                    String strM13973 = AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜喵~喵喵喵呜呜呜呜呜");
                    Class cls = Integer.TYPE;
                    Object objM118594 = AbstractC6336.m11859(cls, strM13973, obj);
                    AbstractC8405.m13972(1588);
                    objM118594.getClass();
                    int iIntValue = ((Number) objM118594).intValue();
                    Object objM118595 = AbstractC6336.m11859(cls, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵"), obj);
                    AbstractC8405.m13972(1588);
                    objM118595.getClass();
                    int iIntValue2 = ((Number) objM118595).intValue();
                    Integer num = (Integer) AbstractC6336.m11859(cls, AbstractC8405.m13972(1589), obj);
                    NewFriendInfo newFriendInfo = new NewFriendInfo();
                    newFriendInfo.uin = (String) objM11859;
                    newFriendInfo.nickname = (String) objM118592;
                    newFriendInfo.remark = (String) objM118593;
                    newFriendInfo.age = iIntValue;
                    newFriendInfo.sex = iIntValue2;
                    num.getClass();
                    newFriendInfo.categoryId = num.intValue();
                    arrayList.add(newFriendInfo);
                }
            }
            return arrayList;
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(1585);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m14478() {
        try {
            return QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(945)));
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(1584);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m14479(String str) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
        try {
            f24794.getClass();
            Object objM14478 = m14478();
            if (objM14478 != null) {
                C6335 c6335M11854 = C6335.m11854(objM14478.getClass());
                String strM13972 = AbstractC8405.m13972(1591);
                C1245 c1245 = c6335M11854.f17458;
                c1245.f3618 = strM13972;
                c1245.f3617 = String.class;
                c1245.f3619 = new Class[]{String.class, String.class};
                Object objM11856 = c6335M11854.m11856(objM14478, str, AbstractC8405.m13972(1590));
                if (objM11856 instanceof String) {
                    return (String) objM11856;
                }
            }
            return null;
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(1592);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static LinkedHashMap m14480() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Object objM14478 = m14478();
            if (objM14478 != null) {
                C6335 c6335M11854 = C6335.m11854(objM14478.getClass());
                String strM13972 = AbstractC8405.m13972(1595);
                C1245 c1245 = c6335M11854.f17458;
                c1245.f3618 = strM13972;
                c1245.f3617 = List.class;
                c1245.f3619 = new Class[]{String.class};
                Object objM11856 = c6335M11854.m11856(objM14478, AbstractC8405.m13972(1596));
                List list = objM11856 instanceof List ? (List) objM11856 : null;
                if (list != null) {
                    for (Object obj : list) {
                        try {
                            try {
                                Object objM11859 = AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(1589), obj);
                                AbstractC8405.m13972(1588);
                                objM11859.getClass();
                                int iIntValue = ((Number) objM11859).intValue();
                                Object objM118592 = AbstractC6336.m11859(String.class, AbstractC8405.m13972(1597), obj);
                                AbstractC8405.m13972(1588);
                                objM118592.getClass();
                                linkedHashMap.put(Integer.valueOf(iIntValue), (String) objM118592);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            String strValueOf = String.valueOf(obj);
                            InterfaceC5150 interfaceC5150Find$default = Regex.find$default(new Regex(AbstractC8405.m13972(1598)), strValueOf, 0, 2, null);
                            InterfaceC5150 interfaceC5150Find$default2 = Regex.find$default(new Regex(AbstractC8405.m13972(1599)), strValueOf, 0, 2, null);
                            if (interfaceC5150Find$default != null && interfaceC5150Find$default2 != null) {
                                linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) ((C4328) ((C5148) interfaceC5150Find$default).m10181()).get(1))), ((C4328) ((C5148) interfaceC5150Find$default2).m10181()).get(1));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(1600);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14481(String str) {
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
        str.getClass();
        try {
            Object appRuntime = QQEnvTool.getAppRuntime();
            Object objM11857 = AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(600)), String.class, AbstractC8405.m13972(952));
            AbstractC8405.m13972(1593);
            objM11857.getClass();
            Object objCallMethod = XposedHelpers.callMethod(appRuntime, AbstractC8405.m13972(602), new Object[]{(String) objM11857});
            C6335 c6335M11854 = C6335.m11854(objCallMethod.getClass());
            String strM13972 = AbstractC8405.m13972(953);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3619 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
            c1245.f3617 = Void.TYPE;
            c6335M11854.m11856(objCallMethod, AbstractC8405.m13972(954), str, (byte) 2, 0);
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(955);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
    }
}
