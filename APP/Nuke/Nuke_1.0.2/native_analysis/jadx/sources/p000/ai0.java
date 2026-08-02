package p000;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f209c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final String f210a;

    /* JADX INFO: renamed from: b */
    public final String f211b;

    public ai0(Context context, String str) {
        if (context == null) {
            C0676s.m4651j("context is null");
            throw null;
        }
        if (str.isEmpty()) {
            C0676s.m4651j("name is empty");
            throw null;
        }
        this.f210a = context.getFilesDir().getAbsolutePath() + "/fastkv/";
        this.f211b = str;
    }

    /* JADX INFO: renamed from: a */
    public final bi0 m172a() {
        bi0 bi0Var;
        String str = this.f210a + this.f211b;
        ConcurrentHashMap concurrentHashMap = f209c;
        bi0 bi0Var2 = (bi0) concurrentHashMap.get(str);
        if (bi0Var2 != null) {
            return bi0Var2;
        }
        synchronized (ai0.class) {
            try {
                bi0Var = (bi0) concurrentHashMap.get(str);
                if (bi0Var == null) {
                    bi0Var = new bi0(this.f210a, this.f211b, null, 0);
                    concurrentHashMap.put(str, bi0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bi0Var;
    }
}
