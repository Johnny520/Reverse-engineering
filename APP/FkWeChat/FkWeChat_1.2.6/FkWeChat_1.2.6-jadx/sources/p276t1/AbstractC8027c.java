package p276t1;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p376zd.C9987e;

/* JADX INFO: renamed from: t1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8027c {

    /* JADX INFO: renamed from: d */
    public static final a f26755d = new a(null);

    /* JADX INFO: renamed from: a */
    public final String f26756a;

    /* JADX INFO: renamed from: b */
    public final long f26757b;

    /* JADX INFO: renamed from: c */
    public final int f26758c;

    public AbstractC8027c(String str, long j10, int i10) {
        this.f26756a = str;
        this.f26757b = j10;
        this.f26758c = i10;
        if (str.length() == 0) {
            C9987e.m38645a("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i10 < -1 || i10 > 63) {
            C9987e.m38645a("The id must be between -1 and 63");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m30848a() {
        return AbstractC8025b.m30842f(this.f26757b);
    }

    /* JADX INFO: renamed from: b */
    public final int m30849b() {
        return this.f26758c;
    }

    /* JADX INFO: renamed from: c */
    public abstract float mo30850c(int i10);

    /* JADX INFO: renamed from: d */
    public abstract float mo30851d(int i10);

    /* JADX INFO: renamed from: e */
    public final long m30852e() {
        return this.f26757b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC8027c abstractC8027c = (AbstractC8027c) obj;
        if (this.f26758c == abstractC8027c.f26758c && AbstractC1061t.m3842c(this.f26756a, abstractC8027c.f26756a)) {
            return AbstractC8025b.m30841e(this.f26757b, abstractC8027c.f26757b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m30853f() {
        return this.f26756a;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo30854g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract long mo30855h(float f10, float f11, float f12);

    public int hashCode() {
        return (((this.f26756a.hashCode() * 31) + AbstractC8025b.m30843g(this.f26757b)) * 31) + this.f26758c;
    }

    /* JADX INFO: renamed from: i */
    public abstract float mo30856i(float f10, float f11, float f12);

    /* JADX INFO: renamed from: j */
    public abstract long mo30857j(float f10, float f11, float f12, float f13, AbstractC8027c abstractC8027c);

    public String toString() {
        return this.f26756a + " (id=" + this.f26758c + ", model=" + ((Object) AbstractC8025b.m30844h(this.f26757b)) + ')';
    }

    /* JADX INFO: renamed from: t1.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC8027c(String str, long j10, int i10, AbstractC1043k abstractC1043k) {
        this(str, j10, i10);
    }
}
