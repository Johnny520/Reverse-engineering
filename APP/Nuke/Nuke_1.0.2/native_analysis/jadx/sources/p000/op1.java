package p000;

import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class op1 {

    /* JADX INFO: renamed from: a */
    public final bi0 f7761a;

    /* JADX INFO: renamed from: b */
    public final v31 f7762b = AbstractC0691se.m4844o(new vi1(20));

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f7763c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap.KeySetView f7764d = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f7765e = new ConcurrentHashMap();

    public op1(bi0 bi0Var) {
        this.f7761a = bi0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3604a(String str, boolean z) {
        str.getClass();
        String strM3606c = m3606c(str);
        if (strM3606c != null) {
            Boolean bool = strM3606c.equals("true") ? Boolean.TRUE : strM3606c.equals("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3605b(w41 w41Var, Object obj, String str) {
        String strM3606c = m3606c(str);
        return strM3606c == null ? obj : this.f7762b.m5453a(w41Var, strM3606c);
    }

    /* JADX INFO: renamed from: c */
    public final String m3606c(String str) {
        ConcurrentHashMap concurrentHashMap = this.f7763c;
        String str2 = (String) concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        ConcurrentHashMap.KeySetView keySetView = this.f7764d;
        if (keySetView.contains(str)) {
            return null;
        }
        String string = this.f7761a.getString(m3609f(str), null);
        if (string == null) {
            concurrentHashMap.remove(str);
            keySetView.add(str);
            return null;
        }
        Base64.Encoder encoder = np1.f7278a;
        str.getClass();
        if (!wv2.m6012d0(string, "B1:", false)) {
            C0676s.m4651j("Unsupported config value format");
            return null;
        }
        byte[] bArrDecode = np1.f7279b.decode(string.substring(3));
        if (bArrDecode.length < 12) {
            C0676s.m4651j("Invalid config value length");
            return null;
        }
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j = (j << 8) | (((long) bArrDecode[i]) & 255);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (bArrDecode[8 + i3] & 255);
        }
        byte[] bArr = new byte[bArrDecode.length - 12];
        np1.m3349c(str, j, bArrDecode, bArr, 0, 12);
        if (np1.m3347a(str, j, bArr) != i2) {
            C0676s.m4651j("Config value checksum mismatch");
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        String str3 = new String(bArr, charset);
        keySetView.remove(str);
        concurrentHashMap.put(str, str3);
        return str3;
    }

    /* JADX INFO: renamed from: d */
    public final void m3607d(w41 w41Var, Object obj, String str) {
        w41Var.getClass();
        m3608e(str, this.f7762b.m5454b(w41Var, obj));
    }

    /* JADX INFO: renamed from: e */
    public final void m3608e(String str, String str2) {
        this.f7764d.remove(str);
        this.f7763c.put(str, str2);
        String strM3609f = m3609f(str);
        Base64.Encoder encoder = np1.f7278a;
        str.getClass();
        str2.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str2.getBytes(charset);
        bytes.getClass();
        long jNextLong = ThreadLocalRandom.current().nextLong();
        byte[] bArr = new byte[bytes.length + 12];
        np1.m3351e(bArr, 0, jNextLong);
        int iM3347a = np1.m3347a(str, jNextLong, bytes);
        for (int i = 0; i < 4; i++) {
            bArr[8 + i] = (byte) (iM3347a >>> (24 - (i * 8)));
        }
        np1.m3349c(str, jNextLong, bytes, bArr, 12, 0);
        this.f7761a.putString(strM3609f, "B1:" + np1.f7278a.encodeToString(bArr));
    }

    /* JADX INFO: renamed from: f */
    public final String m3609f(String str) {
        ConcurrentHashMap concurrentHashMap = this.f7765e;
        String str2 = (String) concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        Base64.Encoder encoder = np1.f7278a;
        str.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        byte[] bArr = new byte[16];
        np1.m3351e(bArr, 0, np1.m3348b(-3750763034362895579L, bytes));
        np1.m3351e(bArr, 8, np1.m3348b(7809847782465536322L, bytes));
        String str3 = "NK4" + np1.f7278a.encodeToString(bArr);
        concurrentHashMap.put(str, str3);
        return str3;
    }

    /* JADX INFO: renamed from: g */
    public final void m3610g(List list) {
        Object x92Var;
        Object x92Var2;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                x92Var = m3606c(str);
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            Throwable thM6237a = y92.m6237a(x92Var);
            if (thM6237a != null) {
                String string = ("Config warmup failed for " + str + ": " + fg1.m1624Q(thM6237a)).toString();
                try {
                    XposedBridge.log("[NukeConf]" + string);
                    x92Var2 = a83.f116a;
                } catch (Throwable th2) {
                    x92Var2 = new x92(th2);
                }
                if (x92Var2 instanceof x92) {
                    Log.println(6, "NukeConf", string);
                }
            }
        }
    }
}
