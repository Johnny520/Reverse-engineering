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
        AbstractC3056.m6668(-3937726729746122151L);
        f24796 = new C8810();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ArrayList m14454() {
        ArrayList arrayList = new ArrayList();
        try {
            Object objM14455 = m14455();
            if (objM14455 != null) {
                C6316 c6316M11826 = C6316.m11826(objM14455.getClass());
                String strM6668 = AbstractC3056.m6668(-3937728220099773863L);
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3616 = List.class;
                c1245.f3618 = new Class[]{String.class};
                Object objM11828 = c6316M11826.m11828(objM14455, AbstractC3056.m6668(-3937728241574610343L));
                AbstractC3056.m6668(-3937728125610493351L);
                objM11828.getClass();
                for (Object obj : (List) objM11828) {
                    Object objM11831 = AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937586675157566887L), obj);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM11831.getClass();
                    Object objM118312 = AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937727773423175079L), obj);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM118312.getClass();
                    Object objM118313 = AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937727760538273191L), obj);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM118313.getClass();
                    String strM66682 = AbstractC3056.m6668(-3937727653164090791L);
                    Class cls = Integer.TYPE;
                    Object objM118314 = AbstractC6317.m11831(cls, strM66682, obj);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM118314.getClass();
                    int iIntValue = ((Number) objM118314).intValue();
                    Object objM118315 = AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937727704703698343L), obj);
                    AbstractC3056.m6668(-3937727850732586407L);
                    objM118315.getClass();
                    int iIntValue2 = ((Number) objM118315).intValue();
                    Integer num = (Integer) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937727687523829159L), obj);
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
            String strM66683 = AbstractC3056.m6668(-3937728220099773863L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66683, e.toString(), e, true);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m14455() {
        try {
            return QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937656597225145767L)));
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937728400488400295L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m14456(String str) {
        AbstractC3056.m6668(-3937636127411013031L);
        try {
            f24796.getClass();
            Object objM14455 = m14455();
            if (objM14455 != null) {
                C6316 c6316M11826 = C6316.m11826(objM14455.getClass());
                String strM6668 = AbstractC3056.m6668(-3937727532905006503L);
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3616 = String.class;
                c1245.f3618 = new Class[]{String.class, String.class};
                Object objM11828 = c6316M11826.m11828(objM14455, str, AbstractC3056.m6668(-3937727597329515943L));
                if (objM11828 instanceof String) {
                    return (String) objM11828;
                }
            }
            return null;
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937727562969777575L);
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
                String strM6668 = AbstractC3056.m6668(-3937727258027099559L);
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3616 = List.class;
                c1245.f3618 = new Class[]{String.class};
                Object objM11828 = c6316M11826.m11828(objM14455, AbstractC3056.m6668(-3937727236552263079L));
                List list = objM11828 instanceof List ? (List) objM11828 : null;
                if (list != null) {
                    for (Object obj : list) {
                        try {
                            try {
                                Object objM11831 = AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937727687523829159L), obj);
                                AbstractC3056.m6668(-3937727850732586407L);
                                objM11831.getClass();
                                int iIntValue = ((Number) objM11831).intValue();
                                Object objM118312 = AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937727163537819047L), obj);
                                AbstractC3056.m6668(-3937727850732586407L);
                                objM118312.getClass();
                                linkedHashMap.put(Integer.valueOf(iIntValue), (String) objM118312);
                            } catch (Exception unused) {
                                String strValueOf = String.valueOf(obj);
                                InterfaceC5149 interfaceC5149Find$default = Regex.find$default(new Regex(AbstractC3056.m6668(-3937727047573702055L)), strValueOf, 0, 2, null);
                                InterfaceC5149 interfaceC5149Find$default2 = Regex.find$default(new Regex(AbstractC3056.m6668(-3937727017508930983L)), strValueOf, 0, 2, null);
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
            String strM66682 = AbstractC3056.m6668(-3937726940199519655L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14458(String str) {
        AbstractC3056.m6668(-3937586675157566887L);
        str.getClass();
        try {
            Object appRuntime = QQEnvTool.getAppRuntime();
            Object objM11829 = AbstractC6317.m11829(AbstractC6318.m11838(AbstractC3056.m6668(-3937618144382944679L)), String.class, AbstractC3056.m6668(-3937655596497765799L));
            AbstractC3056.m6668(-3937727485660366247L);
            objM11829.getClass();
            Object objCallMethod = XposedHelpers.callMethod(appRuntime, AbstractC3056.m6668(-3937617848030201255L), new Object[]{(String) objM11829});
            C6316 c6316M11826 = C6316.m11826(objCallMethod.getClass());
            String strM6668 = AbstractC3056.m6668(-3937655506303452583L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{String.class, String.class, Byte.TYPE, Integer.TYPE};
            c1245.f3616 = Void.TYPE;
            c6316M11826.m11828(objCallMethod, AbstractC3056.m6668(-3937655446173910439L), str, (byte) 2, 0);
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937655411814172071L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }
}
