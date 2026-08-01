package p213oa;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: oa.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5693d {

    /* JADX INFO: renamed from: e */
    public static final a f17902e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C5695f f17903f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f17904g;

    /* JADX INFO: renamed from: a */
    public final String f17905a;

    /* JADX INFO: renamed from: b */
    public transient C5692c f17906b;

    /* JADX INFO: renamed from: c */
    public transient C5693d f17907c;

    /* JADX INFO: renamed from: d */
    public transient C5695f f17908d;

    static {
        C5695f c5695fM23029m = C5695f.m23029m("<root>");
        c5695fM23029m.getClass();
        f17903f = c5695fM23029m;
        Pattern patternCompile = Pattern.compile("\\.");
        patternCompile.getClass();
        f17904g = patternCompile;
    }

    public C5693d(String str, C5692c c5692c) {
        str.getClass();
        c5692c.getClass();
        this.f17905a = str;
        this.f17906b = c5692c;
    }

    /* JADX INFO: renamed from: i */
    public static final List m23004i(C5693d c5693d) {
        if (c5693d.m23009e()) {
            return new ArrayList();
        }
        List listM23004i = m23004i(c5693d.m23011g());
        listM23004i.add(c5693d.m23013j());
        return listM23004i;
    }

    /* JADX INFO: renamed from: a */
    public final String m23005a() {
        return this.f17905a;
    }

    /* JADX INFO: renamed from: b */
    public final C5693d m23006b(C5695f c5695f) {
        String strM23030c;
        c5695f.getClass();
        if (m23009e()) {
            strM23030c = c5695f.m23030c();
        } else {
            strM23030c = this.f17905a + '.' + c5695f.m23030c();
        }
        strM23030c.getClass();
        return new C5693d(strM23030c, this, c5695f);
    }

    /* JADX INFO: renamed from: c */
    public final void m23007c() {
        int iM23008d = m23008d(this.f17905a);
        String str = this.f17905a;
        if (iM23008d >= 0) {
            this.f17908d = C5695f.m23026i(str.substring(iM23008d + 1));
            this.f17907c = new C5693d(this.f17905a.substring(0, iM23008d));
        } else {
            this.f17908d = C5695f.m23026i(str);
            this.f17907c = C5692c.f17899d.m23002i();
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m23008d(String str) {
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z10) {
                return length;
            }
            if (cCharAt == '`') {
                z10 = !z10;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m23009e() {
        return this.f17905a.length() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5693d) && AbstractC1061t.m3842c(this.f17905a, ((C5693d) obj).f17905a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m23010f() {
        return this.f17906b != null || AbstractC8621f0.m33150m0(m23005a(), '<', 0, false, 6, null) < 0;
    }

    /* JADX INFO: renamed from: g */
    public final C5693d m23011g() {
        C5693d c5693d = this.f17907c;
        if (c5693d != null) {
            return c5693d;
        }
        if (m23009e()) {
            C10010p0.m38820a("root");
            return null;
        }
        m23007c();
        C5693d c5693d2 = this.f17907c;
        c5693d2.getClass();
        return c5693d2;
    }

    /* JADX INFO: renamed from: h */
    public final List m23012h() {
        return m23004i(this);
    }

    public int hashCode() {
        return this.f17905a.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public final C5695f m23013j() {
        C5695f c5695f = this.f17908d;
        if (c5695f != null) {
            return c5695f;
        }
        if (m23009e()) {
            C10010p0.m38820a("root");
            return null;
        }
        m23007c();
        C5695f c5695f2 = this.f17908d;
        c5695f2.getClass();
        return c5695f2;
    }

    /* JADX INFO: renamed from: k */
    public final C5695f m23014k() {
        return m23009e() ? f17903f : m23013j();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m23015l(C5695f c5695f) {
        c5695f.getClass();
        if (m23009e()) {
            return false;
        }
        int iM33150m0 = AbstractC8621f0.m33150m0(this.f17905a, '.', 0, false, 6, null);
        if (iM33150m0 == -1) {
            iM33150m0 = this.f17905a.length();
        }
        int i10 = iM33150m0;
        String strM23030c = c5695f.m23030c();
        strM23030c.getClass();
        return i10 == strM23030c.length() && AbstractC8611a0.m33064I(this.f17905a, 0, strM23030c, 0, i10, false, 16, null);
    }

    /* JADX INFO: renamed from: m */
    public final C5692c m23016m() {
        C5692c c5692c = this.f17906b;
        if (c5692c != null) {
            return c5692c;
        }
        C5692c c5692c2 = new C5692c(this);
        this.f17906b = c5692c2;
        return c5692c2;
    }

    public String toString() {
        if (!m23009e()) {
            return this.f17905a;
        }
        String strM23030c = f17903f.m23030c();
        strM23030c.getClass();
        return strM23030c;
    }

    /* JADX INFO: renamed from: oa.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5693d m23017a(C5695f c5695f) {
            c5695f.getClass();
            String strM23030c = c5695f.m23030c();
            strM23030c.getClass();
            return new C5693d(strM23030c, C5692c.f17899d.m23002i(), c5695f, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C5693d(String str, C5693d c5693d, C5695f c5695f, AbstractC1043k abstractC1043k) {
        this(str, c5693d, c5695f);
    }

    public C5693d(String str) {
        str.getClass();
        this.f17905a = str;
    }

    public C5693d(String str, C5693d c5693d, C5695f c5695f) {
        this.f17905a = str;
        this.f17907c = c5693d;
        this.f17908d = c5695f;
    }
}
