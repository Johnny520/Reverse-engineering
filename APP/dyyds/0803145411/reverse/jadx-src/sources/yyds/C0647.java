package yyds;

import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛳᛷᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0647 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0647 f3124;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Map f3125;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final WeakHashMap f3126;

    static {
        AbstractC2328.m4341(-749922337588078L);
        AbstractC2328.m4341(-749952402359150L);
        AbstractC2328.m4341(-749969582228334L);
        f3124 = new C0647();
        f3125 = AbstractC2366.m4385(new Pair(AbstractC2328.m4341(-750008236933998L), AbstractC2328.m4341(-750021121835886L)), new Pair(AbstractC2328.m4341(-750064071508846L), AbstractC2328.m4341(-750076956410734L)), new Pair(AbstractC2328.m4341(-750098431247214L), AbstractC2328.m4341(-750111316149102L)), new Pair(AbstractC2328.m4341(-750132790985582L), AbstractC2328.m4341(-750145675887470L)));
        f3126 = new WeakHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca A[PHI: r9
  0x00ca: PHI (r9v6 long) = (r9v5 long), (r9v8 long) binds: [B:32:0x00e3, B:23:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Long m1572(long j, String str) {
        Object c2658;
        long j2;
        AbstractC2328.m4341(-749217962951534L);
        C1509.f7142.getClass();
        String str2 = (String) C1509.f7259.m1579(C1509.f7179[191]);
        if (AbstractC0473.m1313(str2)) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                c2658 = null;
            } else {
                String strOptString = jSONObjectOptJSONObject.optString(AbstractC2328.m4341(-749235142820718L), AbstractC2328.m4341(-749256617657198L));
                AbstractC2328.m4341(-749286682428270L);
                AbstractC2328.m4341(-749625984844654L);
                if (!strOptString.equals(AbstractC2328.m4341(-749647459681134L)) && !strOptString.equals(AbstractC2328.m4341(-749664639550318L))) {
                    strOptString = AbstractC2328.m4341(-749703294255982L);
                }
                String strOptString2 = jSONObjectOptJSONObject.optString(AbstractC2328.m4341(-749351106937710L), AbstractC2328.m4341(-749376876741486L));
                AbstractC2328.m4341(-749385466676078L);
                Long lM1692 = AbstractC0733.m1692(strOptString2);
                long j3 = 0;
                long jLongValue = lM1692 != null ? lM1692.longValue() : 0L;
                AbstractC2328.m4341(-520394990322542L);
                if (strOptString.equals(AbstractC2328.m4341(-749449891185518L))) {
                    j2 = j + jLongValue;
                    if (j2 >= 0) {
                        j3 = j2;
                    }
                    c2658 = Long.valueOf(j3);
                } else {
                    if (strOptString.equals(AbstractC2328.m4341(-749467071054702L))) {
                        if (jLongValue < 0) {
                            jLongValue = 0;
                        }
                        j2 = j - jLongValue;
                        if (j2 < 0) {
                        }
                    } else if (jLongValue >= 0) {
                        j3 = jLongValue;
                    }
                    c2658 = Long.valueOf(j3);
                }
            }
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-749505725760366L), thM4249);
        }
        return (Long) (c2658 instanceof C2658 ? null : c2658);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m1573(LinkedHashMap linkedHashMap) {
        long jLongValue;
        Long lM1572;
        String string;
        String string2;
        AbstractC2328.m4341(-749780603667310L);
        for (Map.Entry entry : f3125.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            TextView textView = (TextView) linkedHashMap.get(str);
            if (textView != null) {
                f3124.getClass();
                AbstractC2328.m4341(-749814963405678L);
                CharSequence text = textView.getText();
                Long lValueOf = null;
                Long lM1692 = (text == null || (string = text.toString()) == null || (string2 = AbstractC0473.m1314(string).toString()) == null) ? null : AbstractC0733.m1692(string2);
                WeakHashMap weakHashMap = f3126;
                C2597 c2597 = (C2597) weakHashMap.get(textView);
                if (c2597 != null && AbstractC1544.m3188(lM1692, c2597.f12792)) {
                    lValueOf = Long.valueOf(c2597.f12791);
                } else if (lM1692 != null) {
                    weakHashMap.put(textView, new C2597(lM1692.longValue(), null));
                    lValueOf = lM1692;
                } else if (c2597 != null) {
                    lValueOf = Long.valueOf(c2597.f12791);
                }
                if (lValueOf != null && (lM1572 = m1572((jLongValue = lValueOf.longValue()), str2)) != null) {
                    long jLongValue2 = lM1572.longValue();
                    textView.setText(String.valueOf(jLongValue2));
                    weakHashMap.put(textView, new C2597(jLongValue, Long.valueOf(jLongValue2)));
                }
            }
        }
    }
}
