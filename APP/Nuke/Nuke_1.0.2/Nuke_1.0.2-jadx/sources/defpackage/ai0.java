package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 {
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public final String a;
    public final String b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ai0(Context context, String str) {
        if (context == null) {
            s.j("context is null");
            throw null;
        }
        if (str.isEmpty()) {
            s.j("name is empty");
            throw null;
        }
        this.a = context.getFilesDir().getAbsolutePath() + "/fastkv/";
        this.b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final bi0 a() {
        bi0 bi0Var;
        String str = this.a + this.b;
        ConcurrentHashMap concurrentHashMap = c;
        bi0 bi0Var2 = (bi0) concurrentHashMap.get(str);
        if (bi0Var2 != null) {
            return bi0Var2;
        }
        synchronized (ai0.class) {
            try {
                bi0Var = (bi0) concurrentHashMap.get(str);
                if (bi0Var == null) {
                    bi0Var = new bi0(this.a, this.b, null, 0);
                    concurrentHashMap.put(str, bi0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bi0Var;
    }
}
