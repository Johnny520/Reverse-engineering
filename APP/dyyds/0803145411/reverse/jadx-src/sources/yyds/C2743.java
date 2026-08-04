package yyds;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᲈᲀᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2743 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static boolean f13453;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static boolean f13454;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2743 f13455;

    static {
        AbstractC2328.m4341(-981558513795950L);
        f13455 = new C2743();
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static void m4867(Context context) {
        Pair pairM4868;
        AbstractC2328.m4341(-980330153149294L);
        try {
            Object systemService = context.getSystemService(AbstractC2328.m4341(-980364512887662L));
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null || (pairM4868 = m4868(context, clipboardManager)) == null) {
                return;
            }
            AbstractC0027.m3913().putString(AbstractC2328.m4341(-980407462560622L), (String) pairM4868.component2());
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-980544901514094L), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m4868(Context context, ClipboardManager clipboardManager) {
        ClipData.Item itemAt;
        CharSequence charSequenceCoerceToText;
        C0644 c0644M377;
        String str;
        Object c2658;
        C0482 c0482;
        JSONObject jSONObject;
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0 && (itemAt = primaryClip.getItemAt(0)) != null && (charSequenceCoerceToText = itemAt.coerceToText(context)) != null) {
            C0962.f4444.getClass();
            String string = charSequenceCoerceToText.toString();
            if (string != null && (c0644M377 = C0051.m377(C0962.f4445, string)) != null && (str = (String) AbstractC1595.m3276(1, c0644M377.m1559())) != null) {
                if (AbstractC0473.m1313(str)) {
                    str = null;
                }
                if (str == null) {
                    c0482 = null;
                    if (c0482 != null) {
                        return new Pair(c0482, primaryClip.getDescription().getTimestamp() + ':' + c0482.f2398);
                    }
                } else {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 8);
                        AbstractC2328.m4341(-770684209496942L);
                        Charset charset = StandardCharsets.UTF_8;
                        AbstractC2328.m4341(-770735749104494L);
                        jSONObject = new JSONObject(new String(bArrDecode, charset));
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                    if (AbstractC1544.m3188(jSONObject.optString(AbstractC2328.m4341(-770761518908270L)), AbstractC2328.m4341(-770791583679342L))) {
                        String strOptString = jSONObject.optString(AbstractC2328.m4341(-770813058515822L), AbstractC2328.m4341(-770834533352302L));
                        if (AbstractC1544.m3188(strOptString, AbstractC2328.m4341(-771611922432878L)) || AbstractC1544.m3188(strOptString, AbstractC2328.m4341(-771646282171246L)) || AbstractC1544.m3188(strOptString, AbstractC2328.m4341(-771672051975022L))) {
                            String strM2100 = C0962.m2100(strOptString);
                            String strOptString2 = jSONObject.optString(AbstractC2328.m4341(-770868893090670L));
                            String str2 = !AbstractC0473.m1313(strOptString2) ? strOptString2 : null;
                            if (str2 != null) {
                                String strOptString3 = jSONObject.optString(AbstractC2328.m4341(-770903252829038L));
                                String str3 = !AbstractC0473.m1313(strOptString3) ? strOptString3 : null;
                                if (str3 != null) {
                                    String strOptString4 = jSONObject.optString(AbstractC2328.m4341(-770920432698222L));
                                    c2658 = new C0482(str2, str3, ((Matcher) c0644M377.f3099).group(), strM2100, !AbstractC0473.m1313(strOptString4) ? strOptString4 : null);
                                }
                                if (c2658 instanceof C2658) {
                                    c2658 = null;
                                }
                                c0482 = (C0482) c2658;
                                if (c0482 != null) {
                                }
                            }
                        }
                    }
                    c0482 = null;
                    if (c0482 != null) {
                    }
                }
            }
        }
        return null;
    }

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() {
        Class clsM2792 = AbstractC1371.m2792(AbstractC2328.m4341(-980072455111534L), m678(), 2);
        if (clsM2792 != null) {
            int i = AbstractC2293.f11258;
            C2014 c2014M1327 = AbstractC0476.m1327(clsM2792);
            C0903 c0903 = (C0903) c2014M1327.f10074;
            c0903.f4118 = 2;
            C1189 c1189M3892 = c2014M1327.m3892();
            c0903.f4118 = 2;
            c1189M3892.f12003 = AbstractC2328.m4341(-980257138705262L);
            C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
            C0673 c0673 = new C0673(1);
            C2743 c2743 = f13455;
            c2743.m681(c0536, c0673);
            C1189 c1189M38922 = c2014M1327.m3892();
            c0903.f4118 = 2;
            c1189M38922.f12003 = AbstractC2328.m4341(-980295793410926L);
            c2743.m681((C0536) AbstractC1595.m3281(c1189M38922.mo736()), new C0673(2));
        }
    }
}
