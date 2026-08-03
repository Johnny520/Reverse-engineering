package Yue;

import android.content.SharedPreferences;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nmmedit.protect.NativeUtil;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5166 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1319;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1320;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12187;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12188;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12189;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12190;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12191;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12192;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12193;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12194;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12195;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12196;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12197;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12198;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12199;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12200;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12201;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12202;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12203;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12204;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12205;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12206;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12207;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12208;

    static {
        NativeUtil.classesInit0(852);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static void m1941(String str, C6322 c6322, String str2) {
        Iterator<JsonElement> it;
        JsonObject jsonObjectM1992 = C5224.m1992(str);
        XposedBridge.log(str);
        Iterator<JsonElement> it2 = jsonObjectM1992.getAsJsonArray(yue_xin_awa(15)).iterator();
        while (it2.hasNext()) {
            JsonObject asJsonObject = it2.next().getAsJsonObject();
            String asString = asJsonObject.get(yue_xin_awa(16)).getAsString();
            if (asString.equals(str2)) {
                String asString2 = asJsonObject.get(yue_xin_awa(17)).getAsString();
                int asInt = asJsonObject.get(yue_xin_awa(18)).getAsInt();
                c6322.m19731(asString);
                c6322.m19730(asString2);
                c6322.m19737(asInt);
                return;
            }
            try {
                it = asJsonObject.getAsJsonArray(yue_xin_awa(19)).iterator();
            } catch (Throwable unused) {
            }
            while (it.hasNext()) {
                JsonObject asJsonObject2 = it.next().getAsJsonObject();
                String asString3 = asJsonObject2.get(yue_xin_awa(16)).getAsString();
                if (asString3.equals(str2)) {
                    String asString4 = asJsonObject2.get(yue_xin_awa(17)).getAsString();
                    int asInt2 = asJsonObject2.get(yue_xin_awa(18)).getAsInt();
                    c6322.m19731(asString3);
                    c6322.m19730(asString4);
                    c6322.m19737(asInt2);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static String m1942() {
        try {
            return ((SharedPreferences) XposedHelpers.callStaticMethod(C3270.m6707().loadClass(yue_xin_awa(20)), yue_xin_awa(21), new Object[]{C3270.m6706(), yue_xin_awa(22), 0})).getString(yue_xin_awa(23), yue_xin_awa(14));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native C6322 m15846(String str, String str2);
}
