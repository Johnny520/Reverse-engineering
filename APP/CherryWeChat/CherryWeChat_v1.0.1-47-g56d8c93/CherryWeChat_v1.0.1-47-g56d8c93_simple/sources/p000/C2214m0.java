package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2214m0 {

    /* JADX INFO: renamed from: a */
    public static final C2214m0 f7706a = null;

    static {
        AbstractC0295Gu.m625r(-409598146115637L);
        AbstractC0295Gu.m625r(-409666865592373L);
        AbstractC0295Gu.m625r(-409705520298037L);
        f7706a = new C2214m0();
    }

    /* JADX INFO: renamed from: a */
    public static SecretKeySpec m4454a(String r3) {
        MessageDigest r0 = MessageDigest.getInstance(AbstractC0295Gu.m625r(-410564513757237L));
        byte[] r32 = r3.getBytes(AbstractC2659w7.f9201a);
        AbstractC0295Gu.m625r(-410598873495605L);
        byte[] r33 = Arrays.copyOf(r0.digest(r32), 16);
        AbstractC0295Gu.m625r(-410659003037749L);
        return new SecretKeySpec(r33, AbstractC0295Gu.m625r(-410160786831413L));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4455b(Context r2, String r3) {
        AbstractC0295Gu.m625r(-409031210432565L);
        AbstractC0295Gu.m625r(-409065570170933L);
        return r2.getSharedPreferences(AbstractC0295Gu.m625r(-409104224876597L), 0).contains(AbstractC0295Gu.m625r(-409172944353333L).concat(r3));
    }

    /* JADX INFO: renamed from: c */
    public static C2171l0 m4456c(Context r5, String r6) {
        AbstractC0295Gu.m625r(-410753492318261L);
        AbstractC0295Gu.m625r(-410787852056629L);
        String r52 = r5.getSharedPreferences(AbstractC0295Gu.m625r(-410826506762293L), 0).getString(AbstractC0295Gu.m625r(-410895226239029L).concat(r6), null);     // Catch: Exception -> L8
        if (r52 != null) goto L6;
        return null;
    L6:
        SecretKeySpec r62 = m4454a(r6);     // Catch: Exception -> L8
        Cipher r0 = Cipher.getInstance(AbstractC0295Gu.m625r(-410341175457845L));     // Catch: Exception -> L8
        r0.init(2, r62);     // Catch: Exception -> L8
        JSONObject r53 = new JSONObject(new String(r0.doFinal(Base64.decode(r52, 0)), AbstractC2659w7.f9201a));     // Catch: Exception -> L8
        String r02 = r53.getString(AbstractC0295Gu.m625r(-410933880944693L));     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-409323268208693L);     // Catch: Exception -> L8
        String r1 = r53.getString(AbstractC0295Gu.m625r(-409387692718133L));     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-409413462521909L);     // Catch: Exception -> L8
        String r54 = r53.getString(AbstractC0295Gu.m625r(-409477887031349L));     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-409516541737013L);     // Catch: Exception -> L8
        return new C2171l0(r02, r1, r54);
    L8:
        e = move-exception;
        e.printStackTrace();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m4457d(Activity r6, C2171l0 r7) {
        AbstractC0295Gu.m625r(-410358355327029L);
        AbstractC0295Gu.m625r(-410392715065397L);
        String r0 = r7.f7562a;
        SharedPreferences r62 = r6.getSharedPreferences(AbstractC0295Gu.m625r(-410994010486837L), 0);     // Catch: Exception -> L5
        SecretKeySpec r1 = m4454a(r0);     // Catch: Exception -> L5
        JSONObject r3 = new JSONObject();     // Catch: Exception -> L5
        r3.put(AbstractC0295Gu.m625r(-411062729963573L), r0);     // Catch: Exception -> L5
        r3.put(AbstractC0295Gu.m625r(-411101384669237L), r7.f7563b);     // Catch: Exception -> L5
        r3.put(AbstractC0295Gu.m625r(-411127154473013L), r7.f7564c);     // Catch: Exception -> L5
        r3.put(AbstractC0295Gu.m625r(-411165809178677L), System.currentTimeMillis());     // Catch: Exception -> L5
        String r72 = r3.toString();     // Catch: Exception -> L5
        AbstractC0295Gu.m625r(-411204463884341L);     // Catch: Exception -> L5
        Cipher r32 = Cipher.getInstance(AbstractC0295Gu.m625r(-410177966700597L));     // Catch: Exception -> L5
        r32.init(1, r1);     // Catch: Exception -> L5
        byte[] r73 = r72.getBytes(AbstractC2659w7.f9201a);     // Catch: Exception -> L5
        AbstractC0295Gu.m625r(-410195146569781L);     // Catch: Exception -> L5
        String r74 = Base64.encodeToString(r32.doFinal(r73), 0);     // Catch: Exception -> L5
        AbstractC0295Gu.m625r(-410255276111925L);     // Catch: Exception -> L5
        r62.edit().putString(AbstractC0295Gu.m625r(-410714837612597L).concat(r0), r74).apply();     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }
}
