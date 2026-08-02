package p000;

import java.util.List;
import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: zq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0971zq {
    public static final C0932yq Companion = new C0932yq();

    /* JADX INFO: renamed from: o */
    public static final j71[] f14021o;

    /* JADX INFO: renamed from: a */
    public final String f14022a;

    /* JADX INFO: renamed from: b */
    public final String f14023b;

    /* JADX INFO: renamed from: c */
    public final boolean f14024c;

    /* JADX INFO: renamed from: d */
    public final EnumC0250gr f14025d;

    /* JADX INFO: renamed from: e */
    public final List f14026e;

    /* JADX INFO: renamed from: f */
    public final boolean f14027f;

    /* JADX INFO: renamed from: g */
    public final EnumC0176er f14028g;

    /* JADX INFO: renamed from: h */
    public final Set f14029h;

    /* JADX INFO: renamed from: i */
    public final EnumC0323ir f14030i;

    /* JADX INFO: renamed from: j */
    public final String f14031j;

    /* JADX INFO: renamed from: k */
    public final int f14032k;

    /* JADX INFO: renamed from: l */
    public final long f14033l;

    /* JADX INFO: renamed from: m */
    public final long f14034m;

    /* JADX INFO: renamed from: n */
    public final boolean f14035n;

    static {
        C0074c0 c0074c0 = new C0074c0(13);
        i91 i91Var = i91.f4497h;
        f14021o = new j71[]{null, null, null, AbstractC0570p7.m3746B(i91Var, c0074c0), AbstractC0570p7.m3746B(i91Var, new C0074c0(14)), null, AbstractC0570p7.m3746B(i91Var, new C0074c0(15)), AbstractC0570p7.m3746B(i91Var, new C0074c0(16)), AbstractC0570p7.m3746B(i91Var, new C0074c0(17)), null, null, null, null, null};
    }

    public /* synthetic */ C0971zq(int i, String str, String str2, boolean z, EnumC0250gr enumC0250gr, List list, boolean z2, EnumC0176er enumC0176er, Set set, EnumC0323ir enumC0323ir, String str3, int i2, long j, long j2, boolean z3) {
        this.f14022a = (i & 1) == 0 ? AbstractC0933yr.m6317f() : str;
        if ((i & 2) == 0) {
            this.f14023b = "";
        } else {
            this.f14023b = str2;
        }
        if ((i & 4) == 0) {
            this.f14024c = true;
        } else {
            this.f14024c = z;
        }
        if ((i & 8) == 0) {
            this.f14025d = EnumC0250gr.f3670i;
        } else {
            this.f14025d = enumC0250gr;
        }
        if ((i & 16) == 0) {
            this.f14026e = be0.f819h;
        } else {
            this.f14026e = list;
        }
        if ((i & 32) == 0) {
            this.f14027f = true;
        } else {
            this.f14027f = z2;
        }
        if ((i & 64) == 0) {
            this.f14028g = EnumC0176er.f2563i;
        } else {
            this.f14028g = enumC0176er;
        }
        if ((i & 128) == 0) {
            this.f14029h = fe0.f2918h;
        } else {
            this.f14029h = set;
        }
        if ((i & 256) == 0) {
            this.f14030i = EnumC0323ir.f4751i;
        } else {
            this.f14030i = enumC0323ir;
        }
        if ((i & AIChatConfig.DefaultMaxTokens) == 0) {
            this.f14031j = "";
        } else {
            this.f14031j = str3;
        }
        if ((i & 1024) == 0) {
            this.f14032k = 1000;
        } else {
            this.f14032k = i2;
        }
        if ((i & 2048) == 0) {
            this.f14033l = 0L;
        } else {
            this.f14033l = j;
        }
        this.f14034m = (i & 4096) != 0 ? j2 : 0L;
        if ((i & 8192) == 0) {
            this.f14035n = true;
        } else {
            this.f14035n = z3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0971zq m6480a(C0971zq c0971zq, String str, boolean z, EnumC0250gr enumC0250gr, List list, boolean z2, EnumC0176er enumC0176er, Set set, EnumC0323ir enumC0323ir, String str2, int i, long j, long j2, boolean z3, int i2) {
        String str3 = c0971zq.f14022a;
        String str4 = (i2 & 2) != 0 ? c0971zq.f14023b : str;
        EnumC0250gr enumC0250gr2 = (i2 & 8) != 0 ? c0971zq.f14025d : enumC0250gr;
        List list2 = (i2 & 16) != 0 ? c0971zq.f14026e : list;
        boolean z4 = (i2 & 32) != 0 ? c0971zq.f14027f : z2;
        EnumC0176er enumC0176er2 = (i2 & 64) != 0 ? c0971zq.f14028g : enumC0176er;
        Set set2 = (i2 & 128) != 0 ? c0971zq.f14029h : set;
        EnumC0323ir enumC0323ir2 = (i2 & 256) != 0 ? c0971zq.f14030i : enumC0323ir;
        String str5 = (i2 & AIChatConfig.DefaultMaxTokens) != 0 ? c0971zq.f14031j : str2;
        int i3 = (i2 & 1024) != 0 ? c0971zq.f14032k : i;
        long j3 = (i2 & 2048) != 0 ? c0971zq.f14033l : j;
        long j4 = (i2 & 4096) != 0 ? c0971zq.f14034m : j2;
        boolean z5 = (i2 & 8192) != 0 ? c0971zq.f14035n : z3;
        c0971zq.getClass();
        str3.getClass();
        str4.getClass();
        enumC0250gr2.getClass();
        list2.getClass();
        enumC0176er2.getClass();
        set2.getClass();
        enumC0323ir2.getClass();
        str5.getClass();
        return new C0971zq(str3, str4, z, enumC0250gr2, list2, z4, enumC0176er2, set2, enumC0323ir2, str5, i3, j3, j4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0971zq)) {
            return false;
        }
        C0971zq c0971zq = (C0971zq) obj;
        return t11.m5086l(this.f14022a, c0971zq.f14022a) && t11.m5086l(this.f14023b, c0971zq.f14023b) && this.f14024c == c0971zq.f14024c && this.f14025d == c0971zq.f14025d && t11.m5086l(this.f14026e, c0971zq.f14026e) && this.f14027f == c0971zq.f14027f && this.f14028g == c0971zq.f14028g && t11.m5086l(this.f14029h, c0971zq.f14029h) && this.f14030i == c0971zq.f14030i && t11.m5086l(this.f14031j, c0971zq.f14031j) && this.f14032k == c0971zq.f14032k && this.f14033l == c0971zq.f14033l && this.f14034m == c0971zq.f14034m && this.f14035n == c0971zq.f14035n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14035n) + hk1.m2204c(hk1.m2204c(vi0.m5685d(this.f14032k, hk1.m2207f(this.f14031j, (this.f14030i.hashCode() + ((this.f14029h.hashCode() + ((this.f14028g.hashCode() + hk1.m2205d((this.f14026e.hashCode() + ((this.f14025d.hashCode() + hk1.m2205d(hk1.m2207f(this.f14023b, this.f14022a.hashCode() * 31, 31), 31, this.f14024c)) * 31)) * 31, 31, this.f14027f)) * 31)) * 31)) * 31, 31), 31), 31, this.f14033l), 31, this.f14034m);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("AutoReplyTask(id=", this.f14022a, ", name=", this.f14023b, ", isEnabled=");
        sbM5696o.append(this.f14024c);
        sbM5696o.append(", matchMode=");
        sbM5696o.append(this.f14025d);
        sbM5696o.append(", keywords=");
        sbM5696o.append(this.f14026e);
        sbM5696o.append(", ignoreCase=");
        sbM5696o.append(this.f14027f);
        sbM5696o.append(", listMode=");
        sbM5696o.append(this.f14028g);
        sbM5696o.append(", targetIds=");
        sbM5696o.append(this.f14029h);
        sbM5696o.append(", replyType=");
        sbM5696o.append(this.f14030i);
        sbM5696o.append(", replyContent=");
        sbM5696o.append(this.f14031j);
        sbM5696o.append(", voiceDurationMs=");
        sbM5696o.append(this.f14032k);
        sbM5696o.append(", delayMs=");
        sbM5696o.append(this.f14033l);
        sbM5696o.append(", cooldownMs=");
        sbM5696o.append(this.f14034m);
        sbM5696o.append(", stopAfterMatch=");
        sbM5696o.append(this.f14035n);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }

    public C0971zq(String str, String str2, boolean z, EnumC0250gr enumC0250gr, List list, boolean z2, EnumC0176er enumC0176er, Set set, EnumC0323ir enumC0323ir, String str3, int i, long j, long j2, boolean z3) {
        str2.getClass();
        enumC0250gr.getClass();
        list.getClass();
        enumC0176er.getClass();
        set.getClass();
        enumC0323ir.getClass();
        this.f14022a = str;
        this.f14023b = str2;
        this.f14024c = z;
        this.f14025d = enumC0250gr;
        this.f14026e = list;
        this.f14027f = z2;
        this.f14028g = enumC0176er;
        this.f14029h = set;
        this.f14030i = enumC0323ir;
        this.f14031j = str3;
        this.f14032k = i;
        this.f14033l = j;
        this.f14034m = j2;
        this.f14035n = z3;
    }
}
