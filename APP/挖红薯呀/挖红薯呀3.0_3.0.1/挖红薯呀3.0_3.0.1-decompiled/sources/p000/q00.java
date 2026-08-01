package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q00 {

    /* JADX INFO: renamed from: a */
    public final String f5009a;

    /* JADX INFO: renamed from: b */
    public final float f5010b;

    /* JADX INFO: renamed from: c */
    public final float f5011c;

    /* JADX INFO: renamed from: d */
    public final float f5012d;

    /* JADX INFO: renamed from: e */
    public final float f5013e;

    /* JADX INFO: renamed from: f */
    public final long f5014f;

    /* JADX INFO: renamed from: g */
    public final int f5015g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f5016h;

    /* JADX INFO: renamed from: i */
    public final p00 f5017i;

    /* JADX INFO: renamed from: j */
    public boolean f5018j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q00(String str) {
        long j = C0207ff.f1707g;
        this.f5009a = str;
        this.f5010b = 24.0f;
        this.f5011c = 24.0f;
        this.f5012d = 24.0f;
        this.f5013e = 24.0f;
        this.f5014f = j;
        this.f5015g = 5;
        ArrayList arrayList = new ArrayList();
        this.f5016h = arrayList;
        int i = ib1.f2505a;
        ArrayList arrayList2 = new ArrayList();
        p00 p00Var = new p00();
        p00Var.f4689a = C0294hs.f2354d;
        p00Var.f4690b = arrayList2;
        this.f5017i = p00Var;
        arrayList.add(p00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m3181a(q00 q00Var, ArrayList arrayList, g31 g31Var) {
        if (q00Var.f5018j) {
            w10.m4824b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((p00) q00Var.f5016h.get(r1.size() - 1)).f4690b.add(new lb1(arrayList, g31Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final r00 m3182b() {
        if (this.f5018j) {
            w10.m4824b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f5016h;
            if (arrayList.size() <= 1) {
                p00 p00Var = this.f5017i;
                p00Var.getClass();
                r00 r00Var = new r00(this.f5009a, this.f5010b, this.f5011c, this.f5012d, this.f5013e, new hb1(p00Var.f4689a, p00Var.f4690b), this.f5014f, this.f5015g);
                this.f5018j = true;
                return r00Var;
            }
            if (this.f5018j) {
                w10.m4824b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            p00 p00Var2 = (p00) arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = ((p00) arrayList.get(arrayList.size() - 1)).f4690b;
            p00Var2.getClass();
            arrayList2.add(new hb1(p00Var2.f4689a, p00Var2.f4690b));
        }
    }
}
