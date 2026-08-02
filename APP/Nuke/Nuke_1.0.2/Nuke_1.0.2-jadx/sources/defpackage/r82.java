package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r82 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final yw0 b;
    public String c;
    public xw0 d;
    public final cj e = new cj(4);
    public final ye0 f;
    public vf1 g;
    public final boolean h;
    public final b5 i;
    public final sz0 j;
    public o82 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r82(String str, yw0 yw0Var, String str2, js0 js0Var, vf1 vf1Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = yw0Var;
        this.c = str2;
        this.g = vf1Var;
        this.h = z;
        if (js0Var != null) {
            this.f = js0Var.c();
        } else {
            this.f = new ye0(1);
        }
        if (z2) {
            this.j = new sz0(18);
            return;
        }
        if (z3) {
            b5 b5Var = new b5(21);
            this.i = b5Var;
            vf1 vf1Var2 = uj1.g;
            vf1Var2.getClass();
            if (vf1Var2.b.equals("multipart")) {
                b5Var.j = vf1Var2;
            } else {
                c80.z("multipart != ", vf1Var2);
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str, String str2, boolean z) {
        sz0 sz0Var = this.j;
        if (z) {
            sz0Var.getClass();
            str.getClass();
            ((ArrayList) sz0Var.i).add(ci0.x(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) sz0Var.j).add(ci0.x(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        sz0Var.getClass();
        str.getClass();
        ((ArrayList) sz0Var.i).add(ci0.x(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) sz0Var.j).add(ci0.x(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                o72 o72Var = vf1.d;
                this.g = te.C(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(vi0.i("Malformed content type: ", str2), e);
            }
        }
        ye0 ye0Var = this.f;
        if (!z) {
            ye0Var.a(str, str2);
            return;
        }
        ye0Var.getClass();
        str.getClass();
        str2.getClass();
        n93.c(str);
        n93.a(ye0Var, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(js0 js0Var, o82 o82Var) {
        b5 b5Var = this.i;
        b5Var.getClass();
        o82Var.getClass();
        if (js0Var.a("Content-Type") != null) {
            s.j("Unexpected header: Content-Type");
        } else if (js0Var.a("Content-Length") != null) {
            s.j("Unexpected header: Content-Length");
        } else {
            ((ArrayList) b5Var.k).add(new tj1(js0Var, o82Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str, String str2, boolean z) {
        xw0 xw0Var;
        String str3 = this.c;
        if (str3 != null) {
            yw0 yw0Var = this.b;
            yw0Var.getClass();
            try {
                xw0Var = new xw0();
                xw0Var.e(yw0Var, str3);
            } catch (IllegalArgumentException unused) {
                xw0Var = null;
            }
            this.d = xw0Var;
            if (xw0Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(yw0Var);
                String str4 = this.c;
                sb.append(", Relative: ");
                sb.append(str4);
                throw new IllegalArgumentException(sb.toString());
            }
            this.c = null;
        }
        xw0 xw0Var2 = this.d;
        if (!z) {
            xw0Var2.a(str, str2);
            return;
        }
        xw0Var2.getClass();
        str.getClass();
        if (xw0Var2.g == null) {
            xw0Var2.g = new ArrayList();
        }
        ArrayList arrayList = xw0Var2.g;
        arrayList.getClass();
        arrayList.add(ci0.w(str, 0, 0, " \"'<>#&=", 83));
        ArrayList arrayList2 = xw0Var2.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? ci0.w(str2, 0, 0, " \"'<>#&=", 83) : null);
    }
}
