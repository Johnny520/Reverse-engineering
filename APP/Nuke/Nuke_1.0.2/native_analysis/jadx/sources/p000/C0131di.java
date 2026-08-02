package p000;

import java.util.Set;

/* JADX INFO: renamed from: di */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0131di {
    public static final C0092ci Companion = new C0092ci();

    /* JADX INFO: renamed from: f */
    public static final j71[] f2056f;

    /* JADX INFO: renamed from: a */
    public final long f2057a;

    /* JADX INFO: renamed from: b */
    public final boolean f2058b;

    /* JADX INFO: renamed from: c */
    public final Set f2059c;

    /* JADX INFO: renamed from: d */
    public final Set f2060d;

    /* JADX INFO: renamed from: e */
    public final C0241gi f2061e;

    static {
        C0074c0 c0074c0 = new C0074c0(9);
        i91 i91Var = i91.f4497h;
        f2056f = new j71[]{null, null, AbstractC0570p7.m3746B(i91Var, c0074c0), AbstractC0570p7.m3746B(i91Var, new C0074c0(10)), null};
    }

    public /* synthetic */ C0131di(int i, long j, boolean z, Set set, Set set2, C0241gi c0241gi) {
        this.f2057a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.f2058b = false;
        } else {
            this.f2058b = z;
        }
        int i2 = i & 4;
        fe0 fe0Var = fe0.f2918h;
        if (i2 == 0) {
            this.f2059c = fe0Var;
        } else {
            this.f2059c = set;
        }
        if ((i & 8) == 0) {
            this.f2060d = fe0Var;
        } else {
            this.f2060d = set2;
        }
        if ((i & 16) == 0) {
            this.f2061e = new C0241gi();
        } else {
            this.f2061e = c0241gi;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0131di)) {
            return false;
        }
        C0131di c0131di = (C0131di) obj;
        return this.f2057a == c0131di.f2057a && this.f2058b == c0131di.f2058b && t11.m5086l(this.f2059c, c0131di.f2059c) && t11.m5086l(this.f2060d, c0131di.f2060d) && t11.m5086l(this.f2061e, c0131di.f2061e);
    }

    public final int hashCode() {
        return this.f2061e.hashCode() + ((this.f2060d.hashCode() + ((this.f2059c.hashCode() + hk1.m2205d(Long.hashCode(this.f2057a) * 31, 31, this.f2058b)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoReceiveTransferMoneyConf(waitTime=" + this.f2057a + ", useWhitelist=" + this.f2058b + ", whitelist=" + this.f2059c + ", blacklist=" + this.f2060d + ", autoReplyConf=" + this.f2061e + ")";
    }

    public C0131di(long j, boolean z, Set set, Set set2, C0241gi c0241gi) {
        set.getClass();
        set2.getClass();
        c0241gi.getClass();
        this.f2057a = j;
        this.f2058b = z;
        this.f2059c = set;
        this.f2060d = set2;
        this.f2061e = c0241gi;
    }

    public /* synthetic */ C0131di() {
        C0241gi c0241gi = new C0241gi();
        fe0 fe0Var = fe0.f2918h;
        this(0L, false, fe0Var, fe0Var, c0241gi);
    }
}
