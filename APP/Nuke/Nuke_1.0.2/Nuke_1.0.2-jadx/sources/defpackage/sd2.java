package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sd2 extends RuntimeException {
    public final String h;
    public final String i;
    public final boolean j;
    public final Map k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public sd2(String str, String str2, boolean z, Map map, Throwable th, int i) {
        z = (i & 4) != 0 ? false : z;
        map = (i & 8) != 0 ? ce0.h : map;
        th = (i & 16) != 0 ? null : th;
        str.getClass();
        str2.getClass();
        super(str2, th);
        this.h = str;
        this.i = str2;
        this.j = z;
        this.k = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.i;
    }
}
