package p043d3;

import java.util.Locale;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: d3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1868d {

    /* JADX INFO: renamed from: b */
    public static final a f5199b = new a(null);

    /* JADX INFO: renamed from: a */
    public final Locale f5200a;

    public C1868d(String str) {
        this(AbstractC1871g.m6635a().mo6622b(str));
    }

    /* JADX INFO: renamed from: a */
    public final Locale m6625a() {
        return this.f5200a;
    }

    /* JADX INFO: renamed from: b */
    public final String m6626b() {
        return AbstractC1872h.m6636a(this.f5200a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1868d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC1061t.m3842c(m6626b(), ((C1868d) obj).m6626b());
    }

    public int hashCode() {
        return m6626b().hashCode();
    }

    public String toString() {
        return m6626b();
    }

    /* JADX INFO: renamed from: d3.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1868d m6627a() {
            return AbstractC1871g.m6635a().mo6621a().m6630e(0);
        }

        public a() {
        }
    }

    public C1868d(Locale locale) {
        this.f5200a = locale;
    }
}
