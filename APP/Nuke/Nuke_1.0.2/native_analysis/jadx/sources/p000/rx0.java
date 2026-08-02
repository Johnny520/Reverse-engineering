package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rx0 {

    /* JADX INFO: renamed from: a */
    public final String f9788a;

    /* JADX INFO: renamed from: b */
    public final float f9789b;

    /* JADX INFO: renamed from: c */
    public final float f9790c;

    /* JADX INFO: renamed from: d */
    public final float f9791d;

    /* JADX INFO: renamed from: e */
    public final float f9792e;

    /* JADX INFO: renamed from: f */
    public final long f9793f;

    /* JADX INFO: renamed from: g */
    public final int f9794g;

    /* JADX INFO: renamed from: h */
    public final boolean f9795h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f9796i;

    /* JADX INFO: renamed from: j */
    public final qx0 f9797j;

    /* JADX INFO: renamed from: k */
    public boolean f9798k;

    public rx0(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? C0363ju.f5217g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.f9788a = str;
        this.f9789b = f;
        this.f9790c = f2;
        this.f9791d = f3;
        this.f9792e = f4;
        this.f9793f = j2;
        this.f9794g = i3;
        this.f9795h = z;
        ArrayList arrayList = new ArrayList();
        this.f9796i = arrayList;
        qx0 qx0Var = new qx0(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f9797j = qx0Var;
        arrayList.add(qx0Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m4624a(rx0 rx0Var, ArrayList arrayList, ft2 ft2Var) {
        if (rx0Var.f9798k) {
            kz0.m2764b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((qx0) rx0Var.f9796i.get(r0.size() - 1)).f9282j.add(new w93("", arrayList, 0, ft2Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: b */
    public final sx0 m4625b() {
        if (this.f9798k) {
            kz0.m2764b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f9796i;
            if (arrayList.size() <= 1) {
                qx0 qx0Var = this.f9797j;
                sx0 sx0Var = new sx0(this.f9788a, this.f9789b, this.f9790c, this.f9791d, this.f9792e, new r93(qx0Var.f9273a, qx0Var.f9274b, qx0Var.f9275c, qx0Var.f9276d, qx0Var.f9277e, qx0Var.f9278f, qx0Var.f9279g, qx0Var.f9280h, qx0Var.f9281i, qx0Var.f9282j), this.f9793f, this.f9794g, this.f9795h);
                this.f9798k = true;
                return sx0Var;
            }
            if (this.f9798k) {
                kz0.m2764b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            qx0 qx0Var2 = (qx0) arrayList.remove(arrayList.size() - 1);
            ((qx0) arrayList.get(arrayList.size() - 1)).f9282j.add(new r93(qx0Var2.f9273a, qx0Var2.f9274b, qx0Var2.f9275c, qx0Var2.f9276d, qx0Var2.f9277e, qx0Var2.f9278f, qx0Var2.f9279g, qx0Var2.f9280h, qx0Var2.f9281i, qx0Var2.f9282j));
        }
    }
}
