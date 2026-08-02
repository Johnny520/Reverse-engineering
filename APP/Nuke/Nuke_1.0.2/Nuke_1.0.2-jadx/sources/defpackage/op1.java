package defpackage;

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
    public final bi0 a;
    public final v31 b = se.o(new vi1(20));
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap.KeySetView d = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public op1(bi0 bi0Var) {
        this.a = bi0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(String str, boolean z) {
        str.getClass();
        String strC = c(str);
        if (strC != null) {
            Boolean bool = strC.equals("true") ? Boolean.TRUE : strC.equals("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(w41 w41Var, Object obj, String str) {
        String strC = c(str);
        return strC == null ? obj : this.b.a(w41Var, strC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c(String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str2 = (String) concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        ConcurrentHashMap.KeySetView keySetView = this.d;
        if (keySetView.contains(str)) {
            return null;
        }
        String string = this.a.getString(f(str), null);
        if (string == null) {
            concurrentHashMap.remove(str);
            keySetView.add(str);
            return null;
        }
        Base64.Encoder encoder = np1.a;
        str.getClass();
        if (!wv2.d0(string, "B1:", false)) {
            s.j("Unsupported config value format");
            return null;
        }
        byte[] bArrDecode = np1.b.decode(string.substring(3));
        if (bArrDecode.length < 12) {
            s.j("Invalid config value length");
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
        np1.c(str, j, bArrDecode, bArr, 0, 12);
        if (np1.a(str, j, bArr) != i2) {
            s.j("Config value checksum mismatch");
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        String str3 = new String(bArr, charset);
        keySetView.remove(str);
        concurrentHashMap.put(str, str3);
        return str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(w41 w41Var, Object obj, String str) {
        w41Var.getClass();
        e(str, this.b.b(w41Var, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(String str, String str2) {
        this.d.remove(str);
        this.c.put(str, str2);
        String strF = f(str);
        Base64.Encoder encoder = np1.a;
        str.getClass();
        str2.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str2.getBytes(charset);
        bytes.getClass();
        long jNextLong = ThreadLocalRandom.current().nextLong();
        byte[] bArr = new byte[bytes.length + 12];
        np1.e(bArr, 0, jNextLong);
        int iA = np1.a(str, jNextLong, bytes);
        for (int i = 0; i < 4; i++) {
            bArr[8 + i] = (byte) (iA >>> (24 - (i * 8)));
        }
        np1.c(str, jNextLong, bytes, bArr, 12, 0);
        this.a.putString(strF, "B1:" + np1.a.encodeToString(bArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f(String str) {
        ConcurrentHashMap concurrentHashMap = this.e;
        String str2 = (String) concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        Base64.Encoder encoder = np1.a;
        str.getClass();
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        byte[] bArr = new byte[16];
        np1.e(bArr, 0, np1.b(-3750763034362895579L, bytes));
        np1.e(bArr, 8, np1.b(7809847782465536322L, bytes));
        String str3 = "NK4" + np1.a.encodeToString(bArr);
        concurrentHashMap.put(str, str3);
        return str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(List list) {
        Object x92Var;
        Object x92Var2;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                x92Var = c(str);
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            Throwable thA = y92.a(x92Var);
            if (thA != null) {
                String string = ("Config warmup failed for " + str + ": " + fg1.Q(thA)).toString();
                try {
                    XposedBridge.log("[NukeConf]" + string);
                    x92Var2 = a83.a;
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
