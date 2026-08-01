package p213oa;

import java.util.List;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p376zd.C10010p0;

/* JADX INFO: renamed from: oa.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5692c {

    /* JADX INFO: renamed from: c */
    public static final a f17898c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final C5692c f17899d = new C5692c(_UrlKt.FRAGMENT_ENCODE_SET);

    /* JADX INFO: renamed from: a */
    public final C5693d f17900a;

    /* JADX INFO: renamed from: b */
    public transient C5692c f17901b;

    public C5692c(String str) {
        str.getClass();
        this.f17900a = new C5693d(str, this);
    }

    /* JADX INFO: renamed from: a */
    public final String m22994a() {
        return this.f17900a.m23005a();
    }

    /* JADX INFO: renamed from: b */
    public final C5692c m22995b(C5695f c5695f) {
        c5695f.getClass();
        return new C5692c(this.f17900a.m23006b(c5695f), this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22996c() {
        return this.f17900a.m23009e();
    }

    /* JADX INFO: renamed from: d */
    public final C5692c m22997d() {
        C5692c c5692c = this.f17901b;
        if (c5692c != null) {
            return c5692c;
        }
        if (m22996c()) {
            C10010p0.m38820a("root");
            return null;
        }
        C5692c c5692c2 = new C5692c(this.f17900a.m23011g());
        this.f17901b = c5692c2;
        return c5692c2;
    }

    /* JADX INFO: renamed from: e */
    public final List m22998e() {
        return this.f17900a.m23012h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5692c) && AbstractC1061t.m3842c(this.f17900a, ((C5692c) obj).f17900a);
    }

    /* JADX INFO: renamed from: f */
    public final C5695f m22999f() {
        return this.f17900a.m23013j();
    }

    /* JADX INFO: renamed from: g */
    public final C5695f m23000g() {
        return this.f17900a.m23014k();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m23001h(C5695f c5695f) {
        c5695f.getClass();
        return this.f17900a.m23015l(c5695f);
    }

    public int hashCode() {
        return this.f17900a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final C5693d m23002i() {
        return this.f17900a;
    }

    public String toString() {
        return this.f17900a.toString();
    }

    /* JADX INFO: renamed from: oa.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5692c m23003a(C5695f c5695f) {
            c5695f.getClass();
            return new C5692c(C5693d.f17902e.m23017a(c5695f));
        }

        public a() {
        }
    }

    public C5692c(C5693d c5693d) {
        c5693d.getClass();
        this.f17900a = c5693d;
    }

    public C5692c(C5693d c5693d, C5692c c5692c) {
        this.f17900a = c5693d;
        this.f17901b = c5692c;
    }
}
