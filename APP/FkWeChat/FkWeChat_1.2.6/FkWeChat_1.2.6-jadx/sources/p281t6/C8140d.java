package p281t6;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p281t6.AbstractC8160n;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: t6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8140d extends AbstractC8160n {

    /* JADX INFO: renamed from: f */
    public static final b f27220f = new b(null);

    /* JADX INFO: renamed from: g */
    public static final C8140d f27221g = new C8140d("*", "*", null, 4, null);

    /* JADX INFO: renamed from: d */
    public final String f27222d;

    /* JADX INFO: renamed from: e */
    public final String f27223e;

    /* JADX INFO: renamed from: t6.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: g */
        public static final C8140d f27230g;

        /* JADX INFO: renamed from: n */
        public static final C8140d f27237n;

        /* JADX INFO: renamed from: u */
        public static final C8140d f27244u;

        /* JADX INFO: renamed from: a */
        public static final a f27224a = new a();

        /* JADX INFO: renamed from: b */
        public static final C8140d f27225b = new C8140d("application", "*", null, 4, null);

        /* JADX INFO: renamed from: c */
        public static final C8140d f27226c = new C8140d("application", "atom+xml", null, 4, null);

        /* JADX INFO: renamed from: d */
        public static final C8140d f27227d = new C8140d("application", "cbor", null, 4, null);

        /* JADX INFO: renamed from: e */
        public static final C8140d f27228e = new C8140d("application", "json", null, 4, null);

        /* JADX INFO: renamed from: f */
        public static final C8140d f27229f = new C8140d("application", "hal+json", null, 4, null);

        /* JADX INFO: renamed from: h */
        public static final C8140d f27231h = new C8140d("application", "octet-stream", null, 4, null);

        /* JADX INFO: renamed from: i */
        public static final C8140d f27232i = new C8140d("application", "rss+xml", null, 4, null);

        /* JADX INFO: renamed from: j */
        public static final C8140d f27233j = new C8140d("application", "soap+xml", null, 4, null);

        /* JADX INFO: renamed from: k */
        public static final C8140d f27234k = new C8140d("application", "xml", null, 4, null);

        /* JADX INFO: renamed from: l */
        public static final C8140d f27235l = new C8140d("application", "xml-dtd", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: m */
        public static final C8140d f27236m = new C8140d("application", "yaml", null, 4, null);

        /* JADX INFO: renamed from: o */
        public static final C8140d f27238o = new C8140d("application", "gzip", null, 4, null);

        /* JADX INFO: renamed from: p */
        public static final C8140d f27239p = new C8140d("application", "x-www-form-urlencoded", null, 4, null);

        /* JADX INFO: renamed from: q */
        public static final C8140d f27240q = new C8140d("application", "pdf", null, 4, null);

        /* JADX INFO: renamed from: r */
        public static final C8140d f27241r = new C8140d("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);

        /* JADX INFO: renamed from: s */
        public static final C8140d f27242s = new C8140d("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: t */
        public static final C8140d f27243t = new C8140d("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);

        /* JADX INFO: renamed from: v */
        public static final C8140d f27245v = new C8140d("application", "wasm", null, 4, null);

        /* JADX INFO: renamed from: w */
        public static final C8140d f27246w = new C8140d("application", "problem+json", null, 4, null);

        /* JADX INFO: renamed from: x */
        public static final C8140d f27247x = new C8140d("application", "problem+xml", null, 4, null);

        /* JADX WARN: Multi-variable type inference failed */
        static {
            AbstractC1043k abstractC1043k = null;
            f27230g = new C8140d("application", "javascript", null, 4, abstractC1043k);
            f27237n = new C8140d("application", "zip", null, 4, abstractC1043k);
            f27244u = new C8140d("application", "protobuf", null, 4, abstractC1043k);
        }

        /* JADX INFO: renamed from: a */
        public final C8140d m31603a() {
            return f27239p;
        }

        /* JADX INFO: renamed from: b */
        public final C8140d m31604b() {
            return f27228e;
        }
    }

    /* JADX INFO: renamed from: t6.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final c f27248a = new c();

        /* JADX INFO: renamed from: b */
        public static final C8140d f27249b = new C8140d("multipart", "*", null, 4, null);

        /* JADX INFO: renamed from: c */
        public static final C8140d f27250c = new C8140d("multipart", "mixed", null, 4, null);

        /* JADX INFO: renamed from: d */
        public static final C8140d f27251d = new C8140d("multipart", "alternative", null, 4, null);

        /* JADX INFO: renamed from: e */
        public static final C8140d f27252e = new C8140d("multipart", "related", null, 4, null);

        /* JADX INFO: renamed from: f */
        public static final C8140d f27253f = new C8140d("multipart", "form-data", null, 4, null);

        /* JADX INFO: renamed from: g */
        public static final C8140d f27254g = new C8140d("multipart", "signed", null, 4, null);

        /* JADX INFO: renamed from: h */
        public static final C8140d f27255h = new C8140d("multipart", "encrypted", null, 4, null);

        /* JADX INFO: renamed from: i */
        public static final C8140d f27256i = new C8140d("multipart", "byteranges", null, 4, null);

        /* JADX INFO: renamed from: a */
        public final boolean m31607a(CharSequence charSequence) {
            charSequence.getClass();
            return AbstractC8621f0.m33123Y0(charSequence, "multipart/", true);
        }

        /* JADX INFO: renamed from: b */
        public final C8140d m31608b() {
            return f27253f;
        }
    }

    /* JADX INFO: renamed from: t6.d$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final d f27257a = new d();

        /* JADX INFO: renamed from: b */
        public static final C8140d f27258b = new C8140d("text", "*", null, 4, null);

        /* JADX INFO: renamed from: c */
        public static final C8140d f27259c = new C8140d("text", "plain", null, 4, null);

        /* JADX INFO: renamed from: d */
        public static final C8140d f27260d = new C8140d("text", "css", null, 4, null);

        /* JADX INFO: renamed from: e */
        public static final C8140d f27261e = new C8140d("text", "csv", null, 4, null);

        /* JADX INFO: renamed from: f */
        public static final C8140d f27262f = new C8140d("text", "html", null, 4, null);

        /* JADX INFO: renamed from: g */
        public static final C8140d f27263g = new C8140d("text", "javascript", null, 4, null);

        /* JADX INFO: renamed from: h */
        public static final C8140d f27264h = new C8140d("text", "vcard", null, 4, null);

        /* JADX INFO: renamed from: i */
        public static final C8140d f27265i = new C8140d("text", "xml", null, 4, null);

        /* JADX INFO: renamed from: j */
        public static final C8140d f27266j = new C8140d("text", "event-stream", null, 4, null);

        /* JADX INFO: renamed from: a */
        public final C8140d m31609a() {
            return f27258b;
        }

        /* JADX INFO: renamed from: b */
        public final C8140d m31610b() {
            return f27266j;
        }

        /* JADX INFO: renamed from: c */
        public final C8140d m31611c() {
            return f27259c;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8140d(String str, String str2, List list) {
        this(str, str2, str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
    }

    /* JADX INFO: renamed from: e */
    public final String m31597e() {
        return this.f27223e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8140d)) {
            return false;
        }
        C8140d c8140d = (C8140d) obj;
        return AbstractC8611a0.m33061F(this.f27222d, c8140d.f27222d, true) && AbstractC8611a0.m33061F(this.f27223e, c8140d.f27223e, true) && AbstractC1061t.m3842c(m31646b(), c8140d.m31646b());
    }

    /* JADX INFO: renamed from: f */
    public final String m31598f() {
        return this.f27222d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m31599g(String str, String str2) {
        int size = m31646b().size();
        if (size != 0) {
            if (size != 1) {
                List<C8158m> listM31646b = m31646b();
                if (listM31646b != null && listM31646b.isEmpty()) {
                    return false;
                }
                for (C8158m c8158m : listM31646b) {
                    if (AbstractC8611a0.m33061F(c8158m.m31639c(), str, true) && AbstractC8611a0.m33061F(c8158m.m31640d(), str2, true)) {
                        return true;
                    }
                }
                return false;
            }
            C8158m c8158m2 = (C8158m) m31646b().get(0);
            if (AbstractC8611a0.m33061F(c8158m2.m31639c(), str, true) && AbstractC8611a0.m33061F(c8158m2.m31640d(), str2, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m31600h(C8140d c8140d) {
        boolean zM33061F;
        c8140d.getClass();
        if (!AbstractC1061t.m3842c(c8140d.f27222d, "*") && !AbstractC8611a0.m33061F(c8140d.f27222d, this.f27222d, true)) {
            return false;
        }
        if (!AbstractC1061t.m3842c(c8140d.f27223e, "*") && !AbstractC8611a0.m33061F(c8140d.f27223e, this.f27223e, true)) {
            return false;
        }
        for (C8158m c8158m : c8140d.m31646b()) {
            String strM31637a = c8158m.m31637a();
            String strM31638b = c8158m.m31638b();
            if (AbstractC1061t.m3842c(strM31637a, "*")) {
                if (!AbstractC1061t.m3842c(strM31638b, "*")) {
                    List listM31646b = m31646b();
                    if (listM31646b == null || !listM31646b.isEmpty()) {
                        Iterator it = listM31646b.iterator();
                        while (it.hasNext()) {
                            if (AbstractC8611a0.m33061F(((C8158m) it.next()).m31640d(), strM31638b, true)) {
                            }
                        }
                    }
                    zM33061F = false;
                }
                zM33061F = true;
                break;
            }
            String strM31647c = m31647c(strM31637a);
            if (!AbstractC1061t.m3842c(strM31638b, "*")) {
                zM33061F = AbstractC8611a0.m33061F(strM31647c, strM31638b, true);
            } else {
                if (strM31647c != null) {
                    zM33061F = true;
                    break;
                    break;
                }
                zM33061F = false;
            }
            if (!zM33061F) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f27222d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f27223e.toLowerCase(locale);
        lowerCase2.getClass();
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (m31646b().hashCode() * 31);
    }

    /* JADX INFO: renamed from: i */
    public final C8140d m31601i(String str, String str2) {
        str.getClass();
        str2.getClass();
        return m31599g(str, str2) ? this : new C8140d(this.f27222d, this.f27223e, m31645a(), AbstractC5081g0.m20534F0(m31646b(), new C8158m(str, str2)));
    }

    /* JADX INFO: renamed from: j */
    public final C8140d m31602j() {
        if (m31646b().isEmpty()) {
            return this;
        }
        return new C8140d(this.f27222d, this.f27223e, null, 4, null);
    }

    /* JADX INFO: renamed from: t6.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8140d m31605a() {
            return C8140d.f27221g;
        }

        /* JADX INFO: renamed from: b */
        public final C8140d m31606b(String str) throws C8134a {
            str.getClass();
            if (AbstractC8621f0.m33156p0(str)) {
                return m31605a();
            }
            AbstractC8160n.a aVar = AbstractC8160n.f27291c;
            C8156l c8156l = (C8156l) AbstractC5081g0.m20587u0(AbstractC8168u.m31663e(str));
            String strM31636d = c8156l.m31636d();
            List listM31634b = c8156l.m31634b();
            int iM33150m0 = AbstractC8621f0.m33150m0(strM31636d, '/', 0, false, 6, null);
            if (iM33150m0 == -1) {
                if (AbstractC1061t.m3842c(AbstractC8621f0.m33161r1(strM31636d).toString(), "*")) {
                    return C8140d.f27220f.m31605a();
                }
                throw new C8134a(str);
            }
            String string = AbstractC8621f0.m33161r1(strM31636d.substring(0, iM33150m0)).toString();
            if (string.length() == 0) {
                throw new C8134a(str);
            }
            String string2 = AbstractC8621f0.m33161r1(strM31636d.substring(iM33150m0 + 1)).toString();
            if (AbstractC8621f0.m33124Z(string, ' ', false, 2, null) || AbstractC8621f0.m33124Z(string2, ' ', false, 2, null)) {
                throw new C8134a(str);
            }
            if (string2.length() == 0 || AbstractC8621f0.m33124Z(string2, '/', false, 2, null)) {
                throw new C8134a(str);
            }
            return new C8140d(string, string2, listM31634b);
        }

        public b() {
        }
    }

    public /* synthetic */ C8140d(String str, String str2, List list, int i10, AbstractC1043k abstractC1043k) {
        this(str, str2, (i10 & 4) != 0 ? AbstractC5114x.m20800o() : list);
    }

    public C8140d(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f27222d = str;
        this.f27223e = str2;
    }
}
