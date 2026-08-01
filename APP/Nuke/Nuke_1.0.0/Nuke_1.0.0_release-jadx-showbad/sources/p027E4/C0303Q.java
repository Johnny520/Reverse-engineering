package p027E4;

import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p000A.C0038T0;
import p000A.C0072l0;
import p014C1.C0240b;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p118X3.AbstractC1682D;
import p118X3.C1706p;
import p118X3.C1707q;
import p118X3.C1708r;
import p118X3.C1709s;
import p118X3.C1711u;
import p118X3.C1712v;
import p118X3.C1713w;
import p202m4.AbstractC2617a;

/* JADX INFO: renamed from: E4.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0303Q {

    /* JADX INFO: renamed from: l */
    public static final char[] f966l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m */
    public static final Pattern f967m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final String f968a;

    /* JADX INFO: renamed from: b */
    public final C1709s f969b;

    /* JADX INFO: renamed from: c */
    public String f970c;

    /* JADX INFO: renamed from: d */
    public C1708r f971d;

    /* JADX INFO: renamed from: e */
    public final C0240b f972e = new C0240b(4);

    /* JADX INFO: renamed from: f */
    public final C1706p f973f;

    /* JADX INFO: renamed from: g */
    public C1711u f974g;

    /* JADX INFO: renamed from: h */
    public final boolean f975h;

    /* JADX INFO: renamed from: i */
    public final C0072l0 f976i;

    /* JADX INFO: renamed from: j */
    public final C0038T0 f977j;

    /* JADX INFO: renamed from: k */
    public AbstractC1682D f978k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0303Q(String str, C1709s c1709s, String str2, C1707q c1707q, C1711u c1711u, boolean z5, boolean z6, boolean z7) {
        this.f968a = str;
        this.f969b = c1709s;
        this.f970c = str2;
        this.f974g = c1711u;
        this.f975h = z5;
        if (c1707q != null) {
            this.f973f = c1707q.m3040c();
        } else {
            this.f973f = new C1706p(0);
        }
        if (z6) {
            this.f977j = new C0038T0(22);
            return;
        }
        if (z7) {
            C0072l0 c0072l0 = new C0072l0(9);
            this.f976i = c0072l0;
            C1711u c1711u2 = C1713w.f5885g;
            AbstractC1665j.m2985e(c1711u2, "type");
            if (c1711u2.f5880b.equals("multipart")) {
                c0072l0.f308f = c1711u2;
            } else {
                throw new IllegalArgumentException(("multipart != " + c1711u2).toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m522a(String str, String str2, boolean z5) {
        C0038T0 c0038t0 = this.f977j;
        if (z5) {
            c0038t0.getClass();
            AbstractC1665j.m2985e(str, "name");
            ((ArrayList) c0038t0.f169e).add(AbstractC2617a.m4568b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) c0038t0.f170f).add(AbstractC2617a.m4568b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        c0038t0.getClass();
        AbstractC1665j.m2985e(str, "name");
        ((ArrayList) c0038t0.f169e).add(AbstractC2617a.m4568b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) c0038t0.f170f).add(AbstractC2617a.m4568b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m523b(String str, String str2, boolean z5) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                C1675t c1675t = C1711u.f5877d;
                this.f974g = AbstractC0797o.m1390o(str2);
                return;
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e5);
            }
        }
        C1706p c1706p = this.f973f;
        if (!z5) {
            c1706p.m3022a(str, str2);
            return;
        }
        c1706p.getClass();
        AbstractC1665j.m2985e(str, "name");
        AbstractC1665j.m2985e(str2, "value");
        AbstractC1923e.m3446E(str);
        c1706p.m3023b(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m524c(C1707q c1707q, AbstractC1682D abstractC1682D) {
        C0072l0 c0072l0 = this.f976i;
        c0072l0.getClass();
        AbstractC1665j.m2985e(abstractC1682D, "body");
        if (c1707q.m3038a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c1707q.m3038a("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) c0072l0.f309g).add(new C1712v(c1707q, abstractC1682D));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m525d(String str, String str2, boolean z5) {
        String str3 = this.f970c;
        if (str3 != null) {
            C1709s c1709s = this.f969b;
            C1708r c1708rM3051f = c1709s.m3051f(str3);
            this.f971d = c1708rM3051f;
            if (c1708rM3051f == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c1709s + ", Relative: " + this.f970c);
            }
            this.f970c = null;
        }
        if (z5) {
            C1708r c1708r = this.f971d;
            c1708r.getClass();
            AbstractC1665j.m2985e(str, "encodedName");
            if (c1708r.f5866g == null) {
                c1708r.f5866g = new ArrayList();
            }
            ArrayList arrayList = c1708r.f5866g;
            AbstractC1665j.m2982b(arrayList);
            arrayList.add(AbstractC2617a.m4567a(str, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = c1708r.f5866g;
            AbstractC1665j.m2982b(arrayList2);
            arrayList2.add(str2 != null ? AbstractC2617a.m4567a(str2, 0, 0, " \"'<>#&=", 83) : null);
            return;
        }
        C1708r c1708r2 = this.f971d;
        c1708r2.getClass();
        AbstractC1665j.m2985e(str, "name");
        if (c1708r2.f5866g == null) {
            c1708r2.f5866g = new ArrayList();
        }
        ArrayList arrayList3 = c1708r2.f5866g;
        AbstractC1665j.m2982b(arrayList3);
        arrayList3.add(AbstractC2617a.m4567a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = c1708r2.f5866g;
        AbstractC1665j.m2982b(arrayList4);
        arrayList4.add(str2 != null ? AbstractC2617a.m4567a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }
}
