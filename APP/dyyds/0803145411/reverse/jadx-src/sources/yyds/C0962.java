package yyds;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛴᲁᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0962 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0962 f4444;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0051 f4445;

    static {
        AbstractC2328.m4341(-771693526811502L);
        AbstractC2328.m4341(-771792311059310L);
        AbstractC2328.m4341(-771826670797678L);
        AbstractC2328.m4341(-771852440601454L);
        AbstractC2328.m4341(-771873915437934L);
        AbstractC2328.m4341(-771895390274414L);
        f4444 = new C0962();
        f4445 = new C0051(AbstractC2328.m4341(-771903980209006L));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m2099(String str, String str2, String str3, String str4) throws JSONException {
        AbstractC2328.m4341(-770332022178670L);
        if (str != null) {
            if (AbstractC0473.m1313(str)) {
                str = null;
            }
            if (str != null && str2 != null) {
                if (AbstractC0473.m1313(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    String strM2100 = m2100(str3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AbstractC2328.m4341(-770353497015150L), 1);
                    jSONObject.put(AbstractC2328.m4341(-770362086949742L), AbstractC2328.m4341(-770392151720814L));
                    jSONObject.put(AbstractC2328.m4341(-770413626557294L), strM2100);
                    jSONObject.put(AbstractC2328.m4341(-770435101393774L), str);
                    jSONObject.put(AbstractC2328.m4341(-770469461132142L), str2);
                    if (str4 != null) {
                        if (AbstractC0473.m1313(str4)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            jSONObject.put(AbstractC2328.m4341(-770486641001326L), str4);
                        }
                    }
                    String string = jSONObject.toString();
                    AbstractC2328.m4341(-770503820870510L);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC2328.m4341(-770563950412654L);
                    byte[] bytes = string.getBytes(charset);
                    AbstractC2328.m4341(-770589720216430L);
                    String strEncodeToString = Base64.encodeToString(bytes, 10);
                    StringBuilder sb = new StringBuilder(strM2100.equals(AbstractC2328.m4341(-771126591128430L)) ? AbstractC2328.m4341(-771152360932206L) : strM2100.equals(AbstractC2328.m4341(-771255440147310L)) ? AbstractC2328.m4341(-771276914983790L) : AbstractC2328.m4341(-771379994198894L));
                    sb.append('\n');
                    sb.append(strM2100.equals(AbstractC2328.m4341(-770937612567406L)) ? AbstractC2328.m4341(-770963382371182L) : strM2100.equals(AbstractC2328.m4341(-771010627011438L)) ? AbstractC2328.m4341(-771032101847918L) : AbstractC2328.m4341(-771079346488174L));
                    sb.append(strEncodeToString);
                    sb.append((char) 12305);
                    return sb.toString();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m2100(String str) {
        return AbstractC1544.m3188(str, AbstractC2328.m4341(-771483073413998L)) ? AbstractC2328.m4341(-771508843217774L) : AbstractC1544.m3188(str, AbstractC2328.m4341(-771534613021550L)) ? AbstractC2328.m4341(-771556087858030L) : AbstractC2328.m4341(-771577562694510L);
    }
}
