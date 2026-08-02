package p000;

import java.util.Set;

/* JADX INFO: renamed from: ch */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0091ch {
    public static final C0055bh Companion = new C0055bh();

    /* JADX INFO: renamed from: g */
    public static final j71[] f1533g;

    /* JADX INFO: renamed from: a */
    public final long f1534a;

    /* JADX INFO: renamed from: b */
    public final int f1535b;

    /* JADX INFO: renamed from: c */
    public final boolean f1536c;

    /* JADX INFO: renamed from: d */
    public final Set f1537d;

    /* JADX INFO: renamed from: e */
    public final Set f1538e;

    /* JADX INFO: renamed from: f */
    public final C0203fh f1539f;

    static {
        C0074c0 c0074c0 = new C0074c0(6);
        i91 i91Var = i91.f4497h;
        f1533g = new j71[]{null, null, null, AbstractC0570p7.m3746B(i91Var, c0074c0), AbstractC0570p7.m3746B(i91Var, new C0074c0(7)), null};
    }

    public /* synthetic */ C0091ch(int i, long j, int i2, boolean z, Set set, Set set2, C0203fh c0203fh) {
        this.f1534a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.f1535b = 1;
        } else {
            this.f1535b = i2;
        }
        if ((i & 4) == 0) {
            this.f1536c = false;
        } else {
            this.f1536c = z;
        }
        int i3 = i & 8;
        fe0 fe0Var = fe0.f2918h;
        if (i3 == 0) {
            this.f1537d = fe0Var;
        } else {
            this.f1537d = set;
        }
        if ((i & 16) == 0) {
            this.f1538e = fe0Var;
        } else {
            this.f1538e = set2;
        }
        if ((i & 32) == 0) {
            this.f1539f = new C0203fh();
        } else {
            this.f1539f = c0203fh;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0091ch)) {
            return false;
        }
        C0091ch c0091ch = (C0091ch) obj;
        return this.f1534a == c0091ch.f1534a && this.f1535b == c0091ch.f1535b && this.f1536c == c0091ch.f1536c && t11.m5086l(this.f1537d, c0091ch.f1537d) && t11.m5086l(this.f1538e, c0091ch.f1538e) && t11.m5086l(this.f1539f, c0091ch.f1539f);
    }

    public final int hashCode() {
        return this.f1539f.hashCode() + ((this.f1538e.hashCode() + ((this.f1537d.hashCode() + hk1.m2205d(vi0.m5685d(this.f1535b, Long.hashCode(this.f1534a) * 31, 31), 31, this.f1536c)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoReceiveRedPacketConf(waitTime=" + this.f1534a + ", receiveMode=" + this.f1535b + ", useWhitelist=" + this.f1536c + ", whitelist=" + this.f1537d + ", blacklist=" + this.f1538e + ", autoReplyConf=" + this.f1539f + ")";
    }

    public C0091ch(long j, int i, boolean z, Set set, Set set2, C0203fh c0203fh) {
        set.getClass();
        set2.getClass();
        c0203fh.getClass();
        this.f1534a = j;
        this.f1535b = i;
        this.f1536c = z;
        this.f1537d = set;
        this.f1538e = set2;
        this.f1539f = c0203fh;
    }

    public /* synthetic */ C0091ch() {
        C0203fh c0203fh = new C0203fh();
        fe0 fe0Var = fe0.f2918h;
        this(0L, 1, false, fe0Var, fe0Var, c0203fh);
    }
}
