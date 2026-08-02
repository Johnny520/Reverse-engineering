package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 {
    public static final i51 e = new i51(9);
    public final Object a;
    public final lv1 b;
    public final String c;
    public volatile byte[] d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mv1(String str, Object obj, lv1 lv1Var) {
        if (TextUtils.isEmpty(str)) {
            s.j("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = obj;
        this.b = lv1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static mv1 a(String str, Object obj) {
        return new mv1(str, obj, e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof mv1) {
            return this.c.equals(((mv1) obj).c);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return hk1.j(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
