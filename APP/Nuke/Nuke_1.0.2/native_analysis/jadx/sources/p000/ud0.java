package p000;

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

    /* JADX INFO: renamed from: e */
    public static final long[] f11237e = new long[0];

    /* JADX INFO: renamed from: a */
    public long f11238a;

    /* JADX INFO: renamed from: b */
    public final Object f11239b;

    /* JADX INFO: renamed from: c */
    public final Object f11240c;

    /* JADX INFO: renamed from: d */
    public final Serializable f11241d;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, long[]] */
    public ud0(yo2 yo2Var, ml0 ml0Var) {
        yo2Var.getClass();
        this.f11239b = yo2Var;
        this.f11240c = ml0Var;
        int iMo252d = yo2Var.mo252d();
        if (iMo252d <= 64) {
            this.f11238a = iMo252d != 64 ? (-1) << iMo252d : 0L;
            this.f11241d = f11237e;
            return;
        }
        this.f11238a = 0L;
        int i = (iMo252d - 1) >>> 6;
        ?? r3 = new long[i];
        if ((iMo252d & 63) != 0) {
            r3[i - 1] = (-1) << iMo252d;
        }
        this.f11241d = r3;
    }

    /* JADX INFO: renamed from: a */
    public int m5484a(t52 t52Var, long j) {
        TimeZone timeZone = wg3.f12507a;
        ArrayList arrayList = t52Var.f10576p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + t52Var.f10563c.f3944a.f8739i + " was leaked. Did you forget to close a response body?";
                zz1 zz1Var = zz1.f14161a;
                zz1.f14161a.mo6223h(str, ((q52) reference).f8743a);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    t52Var.f10577q = j - this.f11238a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public ud0(iy2 iy2Var) {
        iy2Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.f11238a = 300000000000L;
        this.f11239b = iy2Var.m2421d();
        this.f11240c = new u52(this, hk1.m2211j(new StringBuilder(), wg3.f12508b, " ConnectionPool connection closer"));
        this.f11241d = new ConcurrentLinkedQueue();
    }

    public ud0(long j, C0043b5 c0043b5, File file, File file2) {
        this.f11239b = c0043b5;
        this.f11240c = file;
        this.f11238a = j;
        this.f11241d = file2;
    }
}
