package p281t6;

import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p281t6.AbstractC8160n;

/* JADX INFO: renamed from: t6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8138c extends AbstractC8160n {

    /* JADX INFO: renamed from: d */
    public static final a f27213d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final C8138c f27214e;

    /* JADX INFO: renamed from: f */
    public static final C8138c f27215f;

    /* JADX INFO: renamed from: g */
    public static final C8138c f27216g;

    /* JADX INFO: renamed from: h */
    public static final C8138c f27217h;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 2;
        f27214e = new C8138c("file", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f27215f = new C8138c("mixed", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f27216g = new C8138c("attachment", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f27217h = new C8138c("inline", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }

    public /* synthetic */ C8138c(String str, List list, int i10, AbstractC1043k abstractC1043k) {
        this(str, (i10 & 2) != 0 ? AbstractC5114x.m20800o() : list);
    }

    /* JADX INFO: renamed from: d */
    public final String m31593d() {
        return m31645a();
    }

    /* JADX INFO: renamed from: e */
    public final String m31594e() {
        return m31647c("name");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8138c)) {
            return false;
        }
        C8138c c8138c = (C8138c) obj;
        return AbstractC1061t.m3842c(m31593d(), c8138c.m31593d()) && AbstractC1061t.m3842c(m31646b(), c8138c.m31646b());
    }

    public int hashCode() {
        return (m31593d().hashCode() * 31) + m31646b().hashCode();
    }

    /* JADX INFO: renamed from: t6.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8138c m31595a(String str) {
            str.getClass();
            AbstractC8160n.a aVar = AbstractC8160n.f27291c;
            C8156l c8156l = (C8156l) AbstractC5081g0.m20587u0(AbstractC8168u.m31663e(str));
            return new C8138c(c8156l.m31636d(), c8156l.m31634b());
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8138c(String str, List list) {
        super(str, list);
        str.getClass();
        list.getClass();
    }
}
