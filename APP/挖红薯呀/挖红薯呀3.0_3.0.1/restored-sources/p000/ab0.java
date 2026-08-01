package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ab0 {

    /* JADX INFO: renamed from: a */
    public static final ab0 f88a = new ab0();

    /* JADX INFO: renamed from: b */
    private static final u60 f89b = new x51(new a00(21));

    /* JADX INFO: renamed from: c */
    private static final u60 f90c = new x51(new a00(22));

    /* JADX INFO: renamed from: d */
    private static final u60 f91d = new x51(new a00(23));

    /* JADX INFO: renamed from: e */
    public static final int f92e = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ab0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final String m39d() {
        return "livephotw";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final String m40e() {
        return "master_url";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final String m41f() {
        return "stream_desc";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final String m42g() {
        return (String) f91d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final String m43h() {
        return (String) f89b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final String m44i() {
        return (String) f90c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m45j(Object obj) {
        String str;
        obj.getClass();
        try {
            String string = obj.toString();
            du0 du0Var = new du0("\"" + m43h() + "\":\"(.+?)\"");
            du0 du0Var2 = new du0("\"" + m44i() + "\":\"(.+?)\"");
            List listM3372x = r01.m3372x(du0.m725a(du0Var, string));
            List listM3372x2 = r01.m3372x(du0.m725a(du0Var2, string));
            if (listM3372x.isEmpty()) {
                return null;
            }
            int size = listM3372x.size();
            int i = 0;
            while (i < size) {
                String strM3381R = r41.m3381R((String) ((nd0) ((od0) listM3372x.get(i)).m2878a()).get(1), "\\/", "/");
                if (k41.m1764V(i < listM3372x2.size() ? (String) ((nd0) ((od0) listM3372x2.get(i)).m2878a()).get(1) : "", m42g(), true)) {
                    return strM3381R;
                }
                i++;
            }
            od0 od0Var = (od0) AbstractC0960ye.m5241K(listM3372x);
            if (od0Var == null || (str = (String) ((nd0) od0Var.m2878a()).get(1)) == null) {
                return null;
            }
            return r41.m3381R(str, "\\/", "/");
        } catch (Exception unused) {
            return null;
        }
    }
}
