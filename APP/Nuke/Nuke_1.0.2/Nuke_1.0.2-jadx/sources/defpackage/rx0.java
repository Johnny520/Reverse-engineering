package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rx0 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final qx0 j;
    public boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rx0(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? ju.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        qx0 qx0Var = new qx0(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = qx0Var;
        arrayList.add(qx0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(rx0 rx0Var, ArrayList arrayList, ft2 ft2Var) {
        if (rx0Var.k) {
            kz0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((qx0) rx0Var.i.get(r0.size() - 1)).j.add(new w93("", arrayList, 0, ft2Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final sx0 b() {
        if (this.k) {
            kz0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                qx0 qx0Var = this.j;
                sx0 sx0Var = new sx0(this.a, this.b, this.c, this.d, this.e, new r93(qx0Var.a, qx0Var.b, qx0Var.c, qx0Var.d, qx0Var.e, qx0Var.f, qx0Var.g, qx0Var.h, qx0Var.i, qx0Var.j), this.f, this.g, this.h);
                this.k = true;
                return sx0Var;
            }
            if (this.k) {
                kz0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            qx0 qx0Var2 = (qx0) arrayList.remove(arrayList.size() - 1);
            ((qx0) arrayList.get(arrayList.size() - 1)).j.add(new r93(qx0Var2.a, qx0Var2.b, qx0Var2.c, qx0Var2.d, qx0Var2.e, qx0Var2.f, qx0Var2.g, qx0Var2.h, qx0Var2.i, qx0Var2.j));
        }
    }
}
