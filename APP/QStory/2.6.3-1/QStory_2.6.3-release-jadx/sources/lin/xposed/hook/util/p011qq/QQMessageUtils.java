package lin.xposed.hook.util.p011qq;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p054.C7214;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQMessageUtils {
    public static final String TAG = AbstractC9234.m14531(964);

    public static List<String> getMsgRecordMd5List(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), obj);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C7164 c7164M12413 = C7164.m12413(obj2.getClass());
            c7164M12413.f17803.f3963 = AbstractC9234.m14531(140);
            c7164M12413.f17803.f3962 = AbstractC7166.m12425(AbstractC9234.m14531(178));
            Object objM12415 = c7164M12413.m12415(obj2, new Object[0]);
            if (objM12415 != null) {
                arrayList2.add(getPicElementMd5(objM12415));
            }
        }
        return arrayList2;
    }

    public static Map<String, String> getMsgRecordMd5UrlMap(Object obj) {
        String picElementMd5;
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), obj);
        int iIntValue = ((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), obj)).intValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            C7164 c7164M12413 = C7164.m12413(obj2.getClass());
            c7164M12413.f17803.f3963 = AbstractC9234.m14531(140);
            c7164M12413.f17803.f3962 = AbstractC7166.m12425(AbstractC9234.m14531(178));
            Object objM12415 = c7164M12413.m12415(obj2, new Object[0]);
            if (objM12415 != null && (picElementMd5 = getPicElementMd5(objM12415)) != null && !picElementMd5.isEmpty()) {
                linkedHashMap.put(picElementMd5, getPicElementUrl(iIntValue, objM12415));
            }
        }
        return linkedHashMap;
    }

    public static String getMsgRecordPicUrl(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), obj);
        int iIntValue = ((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), obj)).intValue();
        String picElementUrl = "";
        for (Object obj2 : arrayList) {
            C7164 c7164M12413 = C7164.m12413(obj2.getClass());
            c7164M12413.f17803.f3963 = AbstractC9234.m14531(140);
            c7164M12413.f17803.f3962 = AbstractC7166.m12425(AbstractC9234.m14531(178));
            Object objM12415 = c7164M12413.m12415(obj2, new Object[0]);
            if (objM12415 != null) {
                picElementUrl = getPicElementUrl(iIntValue, objM12415);
            }
        }
        return picElementUrl;
    }

    public static List<String> getMsgRecordPicUrlList(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, AbstractC9234.m14531(152), obj);
        int iIntValue = ((Integer) AbstractC7165.m12418(Integer.TYPE, AbstractC9234.m14531(125), obj)).intValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C7164 c7164M12413 = C7164.m12413(obj2.getClass());
            c7164M12413.f17803.f3963 = AbstractC9234.m14531(140);
            c7164M12413.f17803.f3962 = AbstractC7166.m12425(AbstractC9234.m14531(178));
            Object objM12415 = c7164M12413.m12415(obj2, new Object[0]);
            if (objM12415 != null) {
                arrayList2.add(getPicElementUrl(iIntValue, objM12415));
            }
        }
        return arrayList2;
    }

    public static String getPicElementMd5(Object obj) {
        return (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(179), obj);
    }

    public static String getPicElementUrl(int i, Object obj) {
        String str = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(957), obj);
        String str2 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(719), obj);
        String str3 = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(179), obj);
        String strM14531 = AbstractC9234.m14531(958);
        if (str != null && !str.isEmpty()) {
            if (!str.startsWith(AbstractC9234.m14531(959))) {
                return strM14531.concat(str);
            }
            String str4 = C7214.f17893;
            if (str.contains(AbstractC9234.m14531(960))) {
                str4 = C7214.f17894;
            }
            return strM14531 + str + str4;
        }
        if (str2.length() < 64) {
            return AbstractC9234.m14531(512) + str3.toUpperCase() + AbstractC9234.m14531(963);
        }
        String strM14532 = i == 1 ? AbstractC9234.m14532("喵呜喵喵喵喵呜喵~喵呜喵喵喵喵喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜呜喵") : i == 2 ? AbstractC9234.m14532("喵呜喵喵喵喵呜喵~喵呜喵喵喵喵喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜呜呜") : "";
        String str5 = C7214.f17893;
        if (strM14532.equals(AbstractC9234.m14532("喵呜喵喵喵喵呜喵~喵呜喵喵喵喵喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜呜喵"))) {
            str5 = C7214.f17894;
        }
        return AbstractC9234.m14531(961) + strM14532 + AbstractC9234.m14531(962) + str2 + AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵呜呜喵~喵呜喵呜喵喵喵呜~喵呜喵呜喵喵喵呜") + str5;
    }
}
