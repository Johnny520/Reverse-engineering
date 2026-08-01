package lin.xposed.hook.util.p011qq;

import android.text.TextUtils;
import androidx.compose.runtime.internal.C2080;
import com.android.p002dx.p005io.Opcodes;
import java.util.HashMap;
import p025.AbstractC7012;
import p026.AbstractC7017;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQEmotionUtils {
    private static Object getIEmojiSpanService() {
        return AbstractC7012.m12146(925);
    }

    private static String parseLocalSmallFace(int i) {
        Class cls = Integer.TYPE;
        if (i == 13) {
            return String.valueOf(new char[]{20, 0});
        }
        try {
            Object iEmojiSpanService = getIEmojiSpanService();
            if (iEmojiSpanService != null) {
                C7164 c7164M12413 = C7164.m12413(iEmojiSpanService.getClass());
                String strM14531 = "convertEmoServerIdToEmoCode";
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3964 = new Class[]{cls, cls};
                c2080.f3962 = String.class;
                String str = (String) c7164M12413.m12415(iEmojiSpanService, Integer.valueOf(i), 1);
                if (TextUtils.isEmpty(str)) {
                    throw new RuntimeException("Code is NULL!");
                }
                return str;
            }
        } catch (Exception e) {
            String strM145312 = "convertEmoServerIdToEmo";
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
        try {
            return String.valueOf(new char[]{20, (char) ((Integer) AbstractC7162.m12402(AbstractC7166.m12425("com.tencent.mobileqq.emoticon.QQSysFaceUtil"), cls, "convertToLocal", new Class[]{cls}).invoke(null, Integer.valueOf(i))).intValue()});
        } catch (Exception e2) {
            String strM145313 = "convertToLocal";
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145313, e2.toString(), e2, true);
            return "";
        }
    }

    private static String parseMarketSmallFace(int i, int i2, int i3) {
        try {
            Object iEmojiSpanService = getIEmojiSpanService();
            if (iEmojiSpanService != null) {
                String strM14531 = "parseSmallEmo";
                Class cls = Integer.TYPE;
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                HashMap map = AbstractC7162.f17801;
                CharSequence charSequence = (CharSequence) AbstractC7162.m12402(iEmojiSpanService.getClass(), CharSequence.class, strM14531, new Class[]{cls, cls, cls}).invoke(iEmojiSpanService, objArr);
                if (TextUtils.isEmpty(charSequence)) {
                    throw new RuntimeException("Code is NULL!");
                }
                return String.valueOf(charSequence);
            }
        } catch (Exception e) {
            String strM145312 = "parseMarketSmallFaceElement";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
        return String.valueOf(new char[]{20, (char) (i3 == 2 ? 511 : 255), (char) i2, (char) (i & Opcodes.CONST_METHOD_TYPE), 0});
    }

    private static String parseMarketSmallFaceElement(Object obj) {
        try {
            String strM14531 = "faceIndex";
            Class cls = Integer.TYPE;
            int iIntValue = ((Integer) AbstractC7165.m12418(cls, strM14531, obj)).intValue();
            return parseMarketSmallFace((16711680 & iIntValue) >>> 16, iIntValue & (-16711681), ((Integer) AbstractC7165.m12418(cls, "imageType", obj)).intValue());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String smallFaceElementToStrCode(Object obj) {
        try {
            int iIntValue = ((Integer) AbstractC7162.m12403(obj, "getFaceType")).intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                return parseLocalSmallFace(((Integer) AbstractC7165.m12418(Integer.TYPE, "faceIndex", obj)).intValue());
            }
            return iIntValue == 4 ? parseMarketSmallFaceElement(obj) : "";
        } catch (Exception e) {
            String strM14532 = "emotion";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
            return "";
        }
    }
}
