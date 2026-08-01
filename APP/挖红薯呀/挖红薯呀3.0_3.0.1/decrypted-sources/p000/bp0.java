package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bp0 {

    /* JADX INFO: renamed from: a */
    public static final long f557a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f558b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        v71[] v71VarArr = u71.f6157b;
        f557a = u71.f6158c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final ap0 m360a(ap0 ap0Var, int i, int i2, long j, z61 z61Var, er0 er0Var, la0 la0Var, int i3, int i4, k71 k71Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        z61 z61Var2 = z61Var;
        er0 er0Var2 = er0Var;
        la0 la0Var2 = la0Var;
        int i7 = i3;
        int i8 = i4;
        k71 k71Var2 = k71Var;
        if (i5 == 0 || i5 == ap0Var.f224a) {
            v71[] v71VarArr = u71.f6157b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (u71.m4286a(j3, ap0Var.f226c)) {
                }
            }
            if ((z61Var2 == null || z61Var2.equals(ap0Var.f227d)) && ((i6 == 0 || i6 == ap0Var.f225b) && ((er0Var2 == null || er0Var2.equals(ap0Var.f228e)) && ((la0Var2 == null || la0Var2.equals(ap0Var.f229f)) && ((i7 == 0 || i7 == ap0Var.f230g) && ((i8 == 0 || i8 == ap0Var.f231h) && (k71Var2 == null || k71Var2.equals(ap0Var.f232i)))))))) {
                return ap0Var;
            }
        } else {
            j2 = 0;
        }
        v71[] v71VarArr2 = u71.f6157b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = ap0Var.f226c;
        }
        if (z61Var2 == null) {
            z61Var2 = ap0Var.f227d;
        }
        if (i5 == 0) {
            i5 = ap0Var.f224a;
        }
        if (i6 == 0) {
            i6 = ap0Var.f225b;
        }
        er0 er0Var3 = ap0Var.f228e;
        if (er0Var3 != null && er0Var2 == null) {
            er0Var2 = er0Var3;
        }
        if (la0Var2 == null) {
            la0Var2 = ap0Var.f229f;
        }
        if (i7 == 0) {
            i7 = ap0Var.f230g;
        }
        if (i8 == 0) {
            i8 = ap0Var.f231h;
        }
        if (k71Var2 == null) {
            k71Var2 = ap0Var.f232i;
        }
        return new ap0(i5, i6, j3, z61Var2, er0Var2, la0Var2, i7, i8, k71Var2);
    }
}
