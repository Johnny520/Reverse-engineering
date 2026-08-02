package defpackage;

import java.io.File;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ud0 {
    public static final long[] e = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, long[]] */
    public ud0(yo2 yo2Var, ml0 ml0Var) {
        yo2Var.getClass();
        this.b = yo2Var;
        this.c = ml0Var;
        int iD = yo2Var.d();
        if (iD <= 64) {
            this.a = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (iD - 1) >>> 6;
        ?? r3 = new long[i];
        if ((iD & 63) != 0) {
            r3[i - 1] = (-1) << iD;
        }
        this.d = r3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a(t52 t52Var, long j) {
        TimeZone timeZone = wg3.a;
        ArrayList arrayList = t52Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + t52Var.c.a.i + " was leaked. Did you forget to close a response body?";
                zz1 zz1Var = zz1.a;
                zz1.a.h(str, ((q52) reference).a);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    t52Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public ud0(iy2 iy2Var) {
        iy2Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = iy2Var.d();
        this.c = new u52(this, hk1.j(new StringBuilder(), wg3.b, " ConnectionPool connection closer"));
        this.d = new ConcurrentLinkedQueue();
    }

    public ud0(long j, b5 b5Var, File file, File file2) {
        this.b = b5Var;
        this.c = file;
        this.a = j;
        this.d = file2;
    }
}
