package lin.xposed.hook.util.qq;

import android.text.TextUtils;
import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import java.util.HashMap;
import p009.AbstractC6183;
import p010.AbstractC6188;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQEmotionUtils {
    private static Object getIEmojiSpanService() {
        return AbstractC6183.m11587(925);
    }

    private static String parseLocalSmallFace(int i) {
        Class cls = Integer.TYPE;
        if (i == 13) {
            return String.valueOf(new char[]{20, 0});
        }
        try {
            Object iEmojiSpanService = getIEmojiSpanService();
            if (iEmojiSpanService != null) {
                C6335 c6335M11854 = C6335.m11854(iEmojiSpanService.getClass());
                String strM13972 = AbstractC8405.m13972(926);
                C1245 c1245 = c6335M11854.f17458;
                c1245.f3618 = strM13972;
                c1245.f3619 = new Class[]{cls, cls};
                c1245.f3617 = String.class;
                String str = (String) c6335M11854.m11856(iEmojiSpanService, Integer.valueOf(i), 1);
                if (TextUtils.isEmpty(str)) {
                    throw new RuntimeException(AbstractC8405.m13972(927));
                }
                return str;
            }
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(928);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
        try {
            return String.valueOf(new char[]{20, (char) ((Integer) AbstractC6333.m11843(AbstractC6337.m11866(AbstractC8405.m13972(929)), cls, AbstractC8405.m13972(930), new Class[]{cls}).invoke(null, Integer.valueOf(i))).intValue()});
        } catch (Exception e2) {
            String strM139723 = AbstractC8405.m13972(930);
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139723, e2.toString(), e2, true);
            return "";
        }
    }

    private static String parseMarketSmallFace(int i, int i2, int i3) {
        try {
            Object iEmojiSpanService = getIEmojiSpanService();
            if (iEmojiSpanService != null) {
                String strM13972 = AbstractC8405.m13972(933);
                Class cls = Integer.TYPE;
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                HashMap map = AbstractC6333.f17456;
                CharSequence charSequence = (CharSequence) AbstractC6333.m11843(iEmojiSpanService.getClass(), CharSequence.class, strM13972, new Class[]{cls, cls, cls}).invoke(iEmojiSpanService, objArr);
                if (TextUtils.isEmpty(charSequence)) {
                    throw new RuntimeException(AbstractC8405.m13972(927));
                }
                return String.valueOf(charSequence);
            }
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(934);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
        return String.valueOf(new char[]{20, (char) (i3 == 2 ? 511 : 255), (char) i2, (char) (i & Opcodes.CONST_METHOD_TYPE), 0});
    }

    private static String parseMarketSmallFaceElement(Object obj) {
        try {
            String strM13972 = AbstractC8405.m13972(931);
            Class cls = Integer.TYPE;
            int iIntValue = ((Integer) AbstractC6336.m11859(cls, strM13972, obj)).intValue();
            return parseMarketSmallFace((16711680 & iIntValue) >>> 16, iIntValue & (-16711681), ((Integer) AbstractC6336.m11859(cls, AbstractC8405.m13972(932), obj)).intValue());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String smallFaceElementToStrCode(Object obj) {
        try {
            int iIntValue = ((Integer) AbstractC6333.m11844(obj, AbstractC8405.m13972(935))).intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                return parseLocalSmallFace(((Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(931), obj)).intValue());
            }
            return iIntValue == 4 ? parseMarketSmallFaceElement(obj) : "";
        } catch (Exception e) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜呜呜");
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
            return "";
        }
    }
}
