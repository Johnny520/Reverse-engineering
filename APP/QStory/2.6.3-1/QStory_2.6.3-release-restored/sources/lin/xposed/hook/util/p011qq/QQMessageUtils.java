package lin.xposed.hook.util.p011qq;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p054.C7214;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQMessageUtils {
    public static final String TAG = "QQMessageUtils";

    public static List<String> getMsgRecordMd5List(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C7164 c7164M12413 = C7164.m12413(obj2.getClass());
            c7164M12413.f17803.f3963 = "getPicElement";
            c7164M12413.f17803.f3962 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.PicElement");
            Object objM12415 = c7164M12413.m12415(obj2, new Object[0]);
            if (objM12415 != null) {
                arrayList2.add(getPicElementMd5(objM12415));
            }
        }
        return arrayList2;
    }

    public static Map<String, String> getMsgRecordMd5UrlMap(Object obj) {
        String picElementMd5;
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj);
        int iIntValue = ((Integer) AbstractC7165.m12418(Integer.TYPE, "chatType", obj)).intValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            C7164 c7164M12413 = C7164.m12413(obj2.getClass());
            c7164M12413.f17803.f3963 = "getPicElement";
            c7164M12413.f17803.f3962 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.PicElement");
            Object objM12415 = c7164M12413.m12415(obj2, new Object[0]);
            if (objM12415 != null && (picElementMd5 = getPicElementMd5(objM12415)) != null && !picElementMd5.isEmpty()) {
                linkedHashMap.put(picElementMd5, getPicElementUrl(iIntValue, objM12415));
            }
        }
        return linkedHashMap;
    }

    public static String getMsgRecordPicUrl(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj);
        int iIntValue = ((Integer) AbstractC7165.m12418(Integer.TYPE, "chatType", obj)).intValue();
        String picElementUrl = "";
        for (Object obj2 : arrayList) {
            C7164 c7164M12413 = C7164.m12413(obj2.getClass());
            c7164M12413.f17803.f3963 = "getPicElement";
            c7164M12413.f17803.f3962 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.PicElement");
            Object objM12415 = c7164M12413.m12415(obj2, new Object[0]);
            if (objM12415 != null) {
                picElementUrl = getPicElementUrl(iIntValue, objM12415);
            }
        }
        return picElementUrl;
    }

    public static List<String> getMsgRecordPicUrlList(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj);
        int iIntValue = ((Integer) AbstractC7165.m12418(Integer.TYPE, "chatType", obj)).intValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C7164 c7164M12413 = C7164.m12413(obj2.getClass());
            c7164M12413.f17803.f3963 = "getPicElement";
            c7164M12413.f17803.f3962 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.PicElement");
            Object objM12415 = c7164M12413.m12415(obj2, new Object[0]);
            if (objM12415 != null) {
                arrayList2.add(getPicElementUrl(iIntValue, objM12415));
            }
        }
        return arrayList2;
    }

    public static String getPicElementMd5(Object obj) {
        return (String) AbstractC7165.m12418(String.class, "md5HexStr", obj);
    }

    public static String getPicElementUrl(int i, Object obj) {
        String str = (String) AbstractC7165.m12418(String.class, "originImageUrl", obj);
        String str2 = (String) AbstractC7165.m12418(String.class, "fileUuid", obj);
        String str3 = (String) AbstractC7165.m12418(String.class, "md5HexStr", obj);
        String strM14531 = "https://gchat.qpic.cn";
        if (str != null && !str.isEmpty()) {
            if (!str.startsWith("/download")) {
                return strM14531.concat(str);
            }
            String str4 = C7214.f17893;
            if (str.contains("appid=1406")) {
                str4 = C7214.f17894;
            }
            return strM14531 + str + str4;
        }
        if (str2.length() < 64) {
            return "https://gchat.qpic.cn/gchatpic_new/0/0-0-" + str3.toUpperCase() + "/0?term=2&is_origin=1";
        }
        String strM14532 = i == 1 ? "1406" : i == 2 ? "1407" : "";
        String str5 = C7214.f17893;
        if (strM14532.equals("1406")) {
            str5 = C7214.f17894;
        }
        return "https://gchat.qpic.cn/download?appid=" + strM14532 + "&fileid=" + str2 + "&spec=0" + str5;
    }
}
