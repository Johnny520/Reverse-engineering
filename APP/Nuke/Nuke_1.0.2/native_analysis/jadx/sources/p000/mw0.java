package p000;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mw0 {

    /* JADX INFO: renamed from: a */
    public static final Set f6903a = AbstractC0460mg.m3106u0(new String[]{"GET", "HEAD", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"});

    /* JADX INFO: renamed from: b */
    public static final Set f6904b = AbstractC0460mg.m3106u0(new String[]{"POST", "PUT", "PATCH"});

    /* JADX INFO: renamed from: c */
    public static final n82 f6905c;

    /* JADX INFO: renamed from: d */
    public static final Set f6906d;

    /* JADX INFO: renamed from: e */
    public static final Set f6907e;

    /* JADX INFO: renamed from: f */
    public static final Set f6908f;

    /* JADX INFO: renamed from: g */
    public static final Set f6909g;

    static {
        int i = o82.f7582a;
        ug3.m5493a(0L, 0L, 0L);
        f6905c = new n82(null, 0, new byte[0]);
        f6906d = AbstractC0460mg.m3106u0(new Integer[]{301, 302, 303, 307, 308});
        f6907e = AbstractC0460mg.m3106u0(new String[]{"method", "headers", "body", "timeoutMs", "redirect", "maxResponseBytes"});
        f6908f = AbstractC0460mg.m3106u0(new String[]{"method", "headers", "body", "timeoutMs", "redirect", "maxBytes", "overwrite", "createParents", "requireSuccess"});
        f6909g = AbstractC0460mg.m3106u0(new String[]{"host", "content-length", "transfer-encoding"});
    }

    /* JADX INFO: renamed from: a */
    public static final yw0 m3214a(String str) {
        yw0 yw0VarM6193b;
        if (str.length() > 16384) {
            c80.m672p("INVALID_ARGUMENT", "HTTP URL is too long.", 0, null, null, 28);
            return null;
        }
        try {
            xw0 xw0Var = new xw0();
            xw0Var.m6196e(null, str);
            yw0VarM6193b = xw0Var.m6193b();
        } catch (IllegalArgumentException unused) {
            yw0VarM6193b = null;
        }
        if (yw0VarM6193b == null) {
            c80.m672p("INVALID_ARGUMENT", "URL must be an absolute HTTP or HTTPS URL.", 0, null, null, 28);
            return null;
        }
        String str2 = yw0VarM6193b.f13641a;
        if (!t11.m5086l(str2, "http") && !t11.m5086l(str2, "https")) {
            c80.m672p("INVALID_ARGUMENT", "URL must use HTTP or HTTPS.", 0, null, null, 28);
            return null;
        }
        if (yw0VarM6193b.f13642b.length() <= 0 && yw0VarM6193b.f13643c.length() <= 0) {
            return yw0VarM6193b;
        }
        c80.m672p("INVALID_ARGUMENT", "URL user information is not allowed.", 0, null, null, 28);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m3215b(List list) {
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ow1 ow1Var = (ow1) it.next();
            arrayList.add(AbstractC0179eu.m1435P((String) ow1Var.f7862h, (String) ow1Var.f7863i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final int m3216c(String str) {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return bytes.length;
    }
}
