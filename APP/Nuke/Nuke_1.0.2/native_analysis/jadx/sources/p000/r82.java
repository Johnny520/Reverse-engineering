package p000;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r82 {

    /* JADX INFO: renamed from: l */
    public static final char[] f9428l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m */
    public static final Pattern f9429m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final String f9430a;

    /* JADX INFO: renamed from: b */
    public final yw0 f9431b;

    /* JADX INFO: renamed from: c */
    public String f9432c;

    /* JADX INFO: renamed from: d */
    public xw0 f9433d;

    /* JADX INFO: renamed from: e */
    public final C0093cj f9434e = new C0093cj(4);

    /* JADX INFO: renamed from: f */
    public final ye0 f9435f;

    /* JADX INFO: renamed from: g */
    public vf1 f9436g;

    /* JADX INFO: renamed from: h */
    public final boolean f9437h;

    /* JADX INFO: renamed from: i */
    public final C0043b5 f9438i;

    /* JADX INFO: renamed from: j */
    public final sz0 f9439j;

    /* JADX INFO: renamed from: k */
    public o82 f9440k;

    public r82(String str, yw0 yw0Var, String str2, js0 js0Var, vf1 vf1Var, boolean z, boolean z2, boolean z3) {
        this.f9430a = str;
        this.f9431b = yw0Var;
        this.f9432c = str2;
        this.f9436g = vf1Var;
        this.f9437h = z;
        if (js0Var != null) {
            this.f9435f = js0Var.m2559c();
        } else {
            this.f9435f = new ye0(1);
        }
        if (z2) {
            this.f9439j = new sz0(18);
            return;
        }
        if (z3) {
            C0043b5 c0043b5 = new C0043b5(21);
            this.f9438i = c0043b5;
            vf1 vf1Var2 = uj1.f11326g;
            vf1Var2.getClass();
            if (vf1Var2.f11929b.equals("multipart")) {
                c0043b5.f563j = vf1Var2;
            } else {
                c80.m682z("multipart != ", vf1Var2);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4404a(String str, String str2, boolean z) {
        sz0 sz0Var = this.f9439j;
        if (z) {
            sz0Var.getClass();
            str.getClass();
            ((ArrayList) sz0Var.f10436i).add(ci0.m823x(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) sz0Var.f10437j).add(ci0.m823x(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        sz0Var.getClass();
        str.getClass();
        ((ArrayList) sz0Var.f10436i).add(ci0.m823x(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) sz0Var.f10437j).add(ci0.m823x(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    /* JADX INFO: renamed from: b */
    public final void m4405b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                o72 o72Var = vf1.f11926d;
                this.f9436g = AbstractC0731te.m5175C(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(vi0.m5690i("Malformed content type: ", str2), e);
            }
        }
        ye0 ye0Var = this.f9435f;
        if (!z) {
            ye0Var.m6249a(str, str2);
            return;
        }
        ye0Var.getClass();
        str.getClass();
        str2.getClass();
        n93.m3262c(str);
        n93.m3260a(ye0Var, str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m4406c(js0 js0Var, o82 o82Var) {
        C0043b5 c0043b5 = this.f9438i;
        c0043b5.getClass();
        o82Var.getClass();
        if (js0Var.m2557a("Content-Type") != null) {
            C0676s.m4651j("Unexpected header: Content-Type");
        } else if (js0Var.m2557a("Content-Length") != null) {
            C0676s.m4651j("Unexpected header: Content-Length");
        } else {
            ((ArrayList) c0043b5.f564k).add(new tj1(js0Var, o82Var));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4407d(String str, String str2, boolean z) {
        xw0 xw0Var;
        String str3 = this.f9432c;
        if (str3 != null) {
            yw0 yw0Var = this.f9431b;
            yw0Var.getClass();
            try {
                xw0Var = new xw0();
                xw0Var.m6196e(yw0Var, str3);
            } catch (IllegalArgumentException unused) {
                xw0Var = null;
            }
            this.f9433d = xw0Var;
            if (xw0Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(yw0Var);
                String str4 = this.f9432c;
                sb.append(", Relative: ");
                sb.append(str4);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f9432c = null;
        }
        xw0 xw0Var2 = this.f9433d;
        if (!z) {
            xw0Var2.m6192a(str, str2);
            return;
        }
        xw0Var2.getClass();
        str.getClass();
        if (xw0Var2.f13206g == null) {
            xw0Var2.f13206g = new ArrayList();
        }
        ArrayList arrayList = xw0Var2.f13206g;
        arrayList.getClass();
        arrayList.add(ci0.m822w(str, 0, 0, " \"'<>#&=", 83));
        ArrayList arrayList2 = xw0Var2.f13206g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? ci0.m822w(str2, 0, 0, " \"'<>#&=", 83) : null);
    }
}
