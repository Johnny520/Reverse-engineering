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
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏世楪子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9637 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9637 f25139;

    static {
        AbstractC9234.m14531(1602);
        f25139 = new C9637();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ArrayList m15036() {
        ArrayList arrayList = new ArrayList();
        try {
            Object objM15037 = m15037();
            if (objM15037 != null) {
                C7164 c7164M12413 = C7164.m12413(objM15037.getClass());
                String strM14531 = AbstractC9234.m14531(1585);
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3962 = List.class;
                c2080.f3964 = new Class[]{String.class};
                Object objM12415 = c7164M12413.m12415(objM15037, AbstractC9234.m14531(1586));
                AbstractC9234.m14531(1587);
                objM12415.getClass();
                for (Object obj : (List) objM12415) {
                    Object objM12418 = AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), obj);
                    AbstractC9234.m14531(1588);
                    objM12418.getClass();
                    Object objM124182 = AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵呜呜"), obj);
                    AbstractC9234.m14531(1588);
                    objM124182.getClass();
                    Object objM124183 = AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜"), obj);
                    AbstractC9234.m14531(1588);
                    objM124183.getClass();
                    String strM14532 = AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜喵~喵喵喵呜呜呜呜呜");
                    Class cls = Integer.TYPE;
                    Object objM124184 = AbstractC7165.m12418(cls, strM14532, obj);
                    AbstractC9234.m14531(1588);
                    objM124184.getClass();
                    int iIntValue = ((Number) objM124184).intValue();
                    Object objM124185 = AbstractC7165.m12418(cls, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵"), obj);
                    AbstractC9234.m14531(1588);
                    objM124185.getClass();
                    int iIntValue2 = ((Number) objM124185).intValue();
                    Integer num = (Integer) AbstractC7165.m12418(cls, AbstractC9234.m14531(1589), obj);
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
            String strM145312 = AbstractC9234.m14531(1585);
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m15037() {
        try {
            return QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(945)));
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(1584);
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m15038(String str) {
        AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
        try {
            f25139.getClass();
            Object objM15037 = m15037();
            if (objM15037 != null) {
                C7164 c7164M12413 = C7164.m12413(objM15037.getClass());
                String strM14531 = AbstractC9234.m14531(1591);
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3962 = String.class;
                c2080.f3964 = new Class[]{String.class, String.class};
                Object objM12415 = c7164M12413.m12415(objM15037, str, AbstractC9234.m14531(1590));
                if (objM12415 instanceof String) {
                    return (String) objM12415;
                }
            }
            return null;
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(1592);
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
                String strM14531 = AbstractC9234.m14531(1595);
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3962 = List.class;
                c2080.f3964 = new Class[]{String.class};
                Object objM12415 = c7164M12413.m12415(objM15037, AbstractC9234.m14531(1596));
                List list = objM12415 instanceof List ? (List) objM12415 : null;
                if (list != null) {
                    for (Object obj : list) {
                        try {
                            try {
                                Object objM12418 = AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(1589), obj);
                                AbstractC9234.m14531(1588);
                                objM12418.getClass();
                                int iIntValue = ((Number) objM12418).intValue();
                                Object objM124182 = AbstractC7165.m12418(String.class, AbstractC9234.m14531(1597), obj);
                                AbstractC9234.m14531(1588);
                                objM124182.getClass();
                                linkedHashMap.put(Integer.valueOf(iIntValue), (String) objM124182);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            String strValueOf = String.valueOf(obj);
                            InterfaceC5982 interfaceC5982Find$default = Regex.find$default(new Regex(AbstractC9234.m14531(1598)), strValueOf, 0, 2, null);
                            InterfaceC5982 interfaceC5982Find$default2 = Regex.find$default(new Regex(AbstractC9234.m14531(1599)), strValueOf, 0, 2, null);
                            if (interfaceC5982Find$default != null && interfaceC5982Find$default2 != null) {
                                linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) ((C5160) ((C5980) interfaceC5982Find$default).m10740()).get(1))), ((C5160) ((C5980) interfaceC5982Find$default2).m10740()).get(1));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(1600);
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m15040(String str) {
        AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
        str.getClass();
        try {
            Object appRuntime = QQEnvTool.getAppRuntime();
            Object objM12416 = AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(600)), String.class, AbstractC9234.m14531(952));
            AbstractC9234.m14531(1593);
            objM12416.getClass();
            Object objCallMethod = XposedHelpers.callMethod(appRuntime, AbstractC9234.m14531(602), new Object[]{(String) objM12416});
            C7164 c7164M12413 = C7164.m12413(objCallMethod.getClass());
            String strM14531 = AbstractC9234.m14531(953);
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
            c2080.f3962 = Void.TYPE;
            c7164M12413.m12415(objCallMethod, AbstractC9234.m14531(954), str, (byte) 2, 0);
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(955);
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
    }
}
