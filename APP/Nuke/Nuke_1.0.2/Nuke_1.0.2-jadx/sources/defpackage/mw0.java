package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mw0 {
    public static final Set a = mg.u0(new String[]{"GET", "HEAD", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"});
    public static final Set b = mg.u0(new String[]{"POST", "PUT", "PATCH"});
    public static final n82 c;
    public static final Set d;
    public static final Set e;
    public static final Set f;
    public static final Set g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = o82.a;
        ug3.a(0L, 0L, 0L);
        c = new n82(null, 0, new byte[0]);
        d = mg.u0(new Integer[]{301, 302, 303, 307, 308});
        e = mg.u0(new String[]{"method", "headers", "body", "timeoutMs", "redirect", "maxResponseBytes"});
        f = mg.u0(new String[]{"method", "headers", "body", "timeoutMs", "redirect", "maxBytes", "overwrite", "createParents", "requireSuccess"});
        g = mg.u0(new String[]{"host", "content-length", "transfer-encoding"});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yw0 a(String str) {
        yw0 yw0VarB;
        if (str.length() > 16384) {
            c80.p("INVALID_ARGUMENT", "HTTP URL is too long.", 0, null, null, 28);
            return null;
        }
        try {
            xw0 xw0Var = new xw0();
            xw0Var.e(null, str);
            yw0VarB = xw0Var.b();
        } catch (IllegalArgumentException unused) {
            yw0VarB = null;
        }
        if (yw0VarB == null) {
            c80.p("INVALID_ARGUMENT", "URL must be an absolute HTTP or HTTPS URL.", 0, null, null, 28);
            return null;
        }
        String str2 = yw0VarB.a;
        if (!t11.l(str2, "http") && !t11.l(str2, "https")) {
            c80.p("INVALID_ARGUMENT", "URL must use HTTP or HTTPS.", 0, null, null, 28);
            return null;
        }
        if (yw0VarB.b.length() <= 0 && yw0VarB.c.length() <= 0) {
            return yw0VarB;
        }
        c80.p("INVALID_ARGUMENT", "URL user information is not allowed.", 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(eu.B(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ow1 ow1Var = (ow1) it.next();
            arrayList.add(eu.P((String) ow1Var.h, (String) ow1Var.i));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(String str) {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return bytes.length;
    }
}
