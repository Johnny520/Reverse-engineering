package p140jd;

import be.C0285i;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import md.AbstractC2828e;
import md.C2825b;
import md.InterfaceC2832i;
import me.C2833a;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p025bc.EnumC0251a;
import p081fc.C1203f;
import p199nd.AbstractC2963b0;
import p199nd.C2971f0;
import p199nd.C2983o;
import p351xe.AbstractC5798s;
import p351xe.C5797r;

/* JADX INFO: renamed from: jd.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2124c {

    /* JADX INFO: renamed from: a */
    public static final Pattern f7084a = Pattern.compile("\\R");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m5340a(C1203f c1203f, AbstractC2963b0 abstractC2963b0, InterfaceC2832i interfaceC2832i) {
        if (interfaceC2832i != null && abstractC2963b0.m6385N(EnumC0251a.f697h)) {
            boolean z9 = interfaceC2832i instanceof AbstractC2963b0;
            for (AbstractC2122a abstractC2122a : ((AbstractC2828e) interfaceC2832i).f9217g.mo6238d(C2825b.f9186a)) {
                if (z9) {
                    c1203f.m3269p();
                } else {
                    c1203f.mo3254d(' ');
                }
                abstractC2122a.getClass();
                m5346g(c1203f, HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0255e.m1014c(0));
                m5346g(c1203f, AbstractC0255e.m1013b(0), null);
                m5346g(c1203f, HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0255e.m1012a(0));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5341b(C1203f c1203f, AbstractC2963b0 abstractC2963b0) {
        C2983o c2983o = (C2983o) abstractC2963b0.f9217g.mo6237c(C2825b.f9189d);
        if (c2983o != null) {
            EnumC0251a enumC0251a = abstractC2963b0.mo8668n().f14435a.f722H;
            ((enumC0251a == EnumC0251a.f696g || enumC0251a == EnumC0251a.f697h) ? Collections.EMPTY_LIST : (List) c2983o.f9747g.entrySet().stream().filter(new C0285i(enumC0251a, 18)).flatMap(new C2833a(4)).sorted().collect(Collectors.toList())).forEach(new C2123b(c1203f, 0));
        }
        m5340a(c1203f, abstractC2963b0, abstractC2963b0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m5342c(C1203f c1203f, String str, Throwable th2) {
        c1203f.m3271r("/*  JADX ERROR: ");
        c1203f.mo3255e(str);
        if (th2 != null) {
            c1203f.m3268o();
            String str2 = AbstractC5798s.f23545a;
            c1203f.m3269p();
            PrintWriter printWriter = new PrintWriter((OutputStream) new C5797r(c1203f), true);
            try {
                AbstractC5798s.m10511e(th2);
                th2.printStackTrace(printWriter);
                printWriter.flush();
                printWriter.close();
                c1203f.m3267n();
            } catch (Throwable th3) {
                try {
                    printWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        c1203f.mo3255e("*/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m5343d(C1203f c1203f, AbstractC2963b0 abstractC2963b0) {
        if (abstractC2963b0.m6385N(EnumC0251a.f698i)) {
            List listMo6238d = abstractC2963b0.f9217g.mo6238d(C2825b.f9188c);
            if (listMo6238d.isEmpty()) {
                return;
            }
            listMo6238d.stream().distinct().sorted().forEach(new C2123b(c1203f, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m5344e(C1203f c1203f, String str) {
        c1203f.m3269p();
        String strConcat = "JADX INFO: ".concat(str);
        m5346g(c1203f, HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0255e.m1014c(3));
        m5346g(c1203f, AbstractC0255e.m1013b(3), strConcat);
        m5346g(c1203f, HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0255e.m1012a(3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m5345f(C1203f c1203f, AbstractC2963b0 abstractC2963b0, String str) {
        if (abstractC2963b0.m6385N(EnumC0251a.f700k)) {
            c1203f.m3269p();
            m5346g(c1203f, HttpUrl.FRAGMENT_ENCODE_SET, "/* ");
            c1203f.mo3255e("JADX ").mo3255e("INFO").mo3255e(": ");
            c1203f.mo3255e("renamed from: ").mo3255e(str);
            C2971f0 c2971f0 = (C2971f0) abstractC2963b0.f9217g.mo6237c(C2825b.f9187b);
            if (c2971f0 != null) {
                c1203f.mo3255e(", reason: ").mo3255e(c2971f0.f9728g);
            }
            m5346g(c1203f, HttpUrl.FRAGMENT_ENCODE_SET, " */");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m5346g(C1203f c1203f, String str, String str2) {
        String[] strArrSplit = f7084a.split(str2);
        int length = strArrSplit.length;
        if (length == 0) {
            return;
        }
        c1203f.mo3255e(strArrSplit[0]);
        for (int i9 = 1; i9 < length; i9++) {
            c1203f.m3271r(str);
            c1203f.mo3255e(strArrSplit[i9]);
        }
    }
}
