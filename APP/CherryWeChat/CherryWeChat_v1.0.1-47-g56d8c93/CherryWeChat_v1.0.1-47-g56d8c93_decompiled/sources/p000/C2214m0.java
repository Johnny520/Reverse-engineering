package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2214m0 {

    /* JADX INFO: renamed from: a */
    public static final C2214m0 f7706a;

    static {
        AbstractC0295Gu.m625r(-409598146115637L);
        AbstractC0295Gu.m625r(-409666865592373L);
        AbstractC0295Gu.m625r(-409705520298037L);
        f7706a = new C2214m0();
    }

    /* JADX INFO: renamed from: a */
    public static SecretKeySpec m4454a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(AbstractC0295Gu.m625r(-410564513757237L));
        byte[] bytes = str.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-410598873495605L);
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(bytes), 16);
        AbstractC0295Gu.m625r(-410659003037749L);
        return new SecretKeySpec(bArrCopyOf, AbstractC0295Gu.m625r(-410160786831413L));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4455b(Context context, String str) {
        AbstractC0295Gu.m625r(-409031210432565L);
        AbstractC0295Gu.m625r(-409065570170933L);
        return context.getSharedPreferences(AbstractC0295Gu.m625r(-409104224876597L), 0).contains(AbstractC0295Gu.m625r(-409172944353333L).concat(str));
    }

    /* JADX INFO: renamed from: c */
    public static C2171l0 m4456c(Context context, String str) {
        AbstractC0295Gu.m625r(-410753492318261L);
        AbstractC0295Gu.m625r(-410787852056629L);
        try {
            String string = context.getSharedPreferences(AbstractC0295Gu.m625r(-410826506762293L), 0).getString(AbstractC0295Gu.m625r(-410895226239029L).concat(str), null);
            if (string == null) {
                return null;
            }
            SecretKeySpec secretKeySpecM4454a = m4454a(str);
            Cipher cipher = Cipher.getInstance(AbstractC0295Gu.m625r(-410341175457845L));
            cipher.init(2, secretKeySpecM4454a);
            JSONObject jSONObject = new JSONObject(new String(cipher.doFinal(Base64.decode(string, 0)), AbstractC2659w7.f9201a));
            String string2 = jSONObject.getString(AbstractC0295Gu.m625r(-410933880944693L));
            AbstractC0295Gu.m625r(-409323268208693L);
            String string3 = jSONObject.getString(AbstractC0295Gu.m625r(-409387692718133L));
            AbstractC0295Gu.m625r(-409413462521909L);
            String string4 = jSONObject.getString(AbstractC0295Gu.m625r(-409477887031349L));
            AbstractC0295Gu.m625r(-409516541737013L);
            return new C2171l0(string2, string3, string4);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4457d(Activity activity, C2171l0 c2171l0) {
        AbstractC0295Gu.m625r(-410358355327029L);
        AbstractC0295Gu.m625r(-410392715065397L);
        String str = c2171l0.f7562a;
        try {
            SharedPreferences sharedPreferences = activity.getSharedPreferences(AbstractC0295Gu.m625r(-410994010486837L), 0);
            SecretKeySpec secretKeySpecM4454a = m4454a(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC0295Gu.m625r(-411062729963573L), str);
            jSONObject.put(AbstractC0295Gu.m625r(-411101384669237L), c2171l0.f7563b);
            jSONObject.put(AbstractC0295Gu.m625r(-411127154473013L), c2171l0.f7564c);
            jSONObject.put(AbstractC0295Gu.m625r(-411165809178677L), System.currentTimeMillis());
            String string = jSONObject.toString();
            AbstractC0295Gu.m625r(-411204463884341L);
            Cipher cipher = Cipher.getInstance(AbstractC0295Gu.m625r(-410177966700597L));
            cipher.init(1, secretKeySpecM4454a);
            byte[] bytes = string.getBytes(AbstractC2659w7.f9201a);
            AbstractC0295Gu.m625r(-410195146569781L);
            String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
            AbstractC0295Gu.m625r(-410255276111925L);
            sharedPreferences.edit().putString(AbstractC0295Gu.m625r(-410714837612597L).concat(str), strEncodeToString).apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
