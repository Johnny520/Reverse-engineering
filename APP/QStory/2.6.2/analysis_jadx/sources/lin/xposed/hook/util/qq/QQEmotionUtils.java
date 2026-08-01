package lin.xposed.hook.util.qq;

import android.text.TextUtils;
import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3056;
import java.util.HashMap;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQEmotionUtils {
    private static Object getIEmojiSpanService() {
        return AbstractC6136.m11554(-3937658701759120807L);
    }

    private static String parseLocalSmallFace(int i) {
        Class cls = Integer.TYPE;
        if (i == 13) {
            return String.valueOf(new char[]{20, 0});
        }
        try {
            Object iEmojiSpanService = getIEmojiSpanService();
            if (iEmojiSpanService != null) {
                C6316 c6316M11826 = C6316.m11826(iEmojiSpanService.getClass());
                String strM6668 = AbstractC3056.m6668(-3937658435471148455L);
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3618 = new Class[]{cls, cls};
                c1245.f3616 = String.class;
                String str = (String) c6316M11826.m11828(iEmojiSpanService, Integer.valueOf(i), 1);
                if (TextUtils.isEmpty(str)) {
                    throw new RuntimeException(AbstractC3056.m6668(-3937658246492587431L));
                }
                return str;
            }
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937658203542914471L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
        try {
            return String.valueOf(new char[]{20, (char) ((Integer) AbstractC6314.m11815(AbstractC6318.m11838(AbstractC3056.m6668(-3937658169183176103L)), cls, AbstractC3056.m6668(-3937657911485138343L), new Class[]{cls}).invoke(null, Integer.valueOf(i))).intValue()});
        } catch (Exception e2) {
            String strM66683 = AbstractC3056.m6668(-3937657911485138343L);
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66683, e2.toString(), e2, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    private static String parseMarketSmallFace(int i, int i2, int i3) {
        try {
            Object iEmojiSpanService = getIEmojiSpanService();
            if (iEmojiSpanService != null) {
                String strM6668 = AbstractC3056.m6668(-3937657821290825127L);
                Class cls = Integer.TYPE;
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                HashMap map = AbstractC6314.f17407;
                CharSequence charSequence = (CharSequence) AbstractC6314.m11815(iEmojiSpanService.getClass(), CharSequence.class, strM6668, new Class[]{cls, cls, cls}).invoke(iEmojiSpanService, objArr);
                if (TextUtils.isEmpty(charSequence)) {
                    throw new RuntimeException(AbstractC3056.m6668(-3937658246492587431L));
                }
                return String.valueOf(charSequence);
            }
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937657709621675431L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
        return String.valueOf(new char[]{20, (char) (i3 == 2 ? 511 : 255), (char) i2, (char) (i & Opcodes.CONST_METHOD_TYPE), 0});
    }

    private static String parseMarketSmallFaceElement(Object obj) {
        try {
            String strM6668 = AbstractC3056.m6668(-3937657838470694311L);
            Class cls = Integer.TYPE;
            int iIntValue = ((Integer) AbstractC6317.m11831(cls, strM6668, obj)).intValue();
            return parseMarketSmallFace((16711680 & iIntValue) >>> 16, iIntValue & (-16711681), ((Integer) AbstractC6317.m11831(cls, AbstractC3056.m6668(-3937657881420367271L), obj)).intValue());
        } catch (Exception unused) {
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }

    public static String smallFaceElementToStrCode(Object obj) {
        try {
            int iIntValue = ((Integer) AbstractC6314.m11816(obj, AbstractC3056.m6668(-3937657589362591143L))).intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                return parseLocalSmallFace(((Integer) AbstractC6317.m11831(Integer.TYPE, AbstractC3056.m6668(-3937657838470694311L), obj)).intValue());
            }
            return iIntValue == 4 ? parseMarketSmallFaceElement(obj) : AbstractC3056.m6668(-3937561979095614887L);
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937657606542460327L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return AbstractC3056.m6668(-3937561979095614887L);
        }
    }
}
