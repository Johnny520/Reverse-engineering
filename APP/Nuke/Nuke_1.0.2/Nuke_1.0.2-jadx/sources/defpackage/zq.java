package defpackage;

import java.util.List;
import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zq {
    public static final yq Companion = new yq();
    public static final j71[] o;
    public final String a;
    public final String b;
    public final boolean c;
    public final gr d;
    public final List e;
    public final boolean f;
    public final er g;
    public final Set h;
    public final ir i;
    public final String j;
    public final int k;
    public final long l;
    public final long m;
    public final boolean n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c0 c0Var = new c0(13);
        i91 i91Var = i91.h;
        o = new j71[]{null, null, null, p7.B(i91Var, c0Var), p7.B(i91Var, new c0(14)), null, p7.B(i91Var, new c0(15)), p7.B(i91Var, new c0(16)), p7.B(i91Var, new c0(17)), null, null, null, null, null};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zq(int i, String str, String str2, boolean z, gr grVar, List list, boolean z2, er erVar, Set set, ir irVar, String str3, int i2, long j, long j2, boolean z3) {
        this.a = (i & 1) == 0 ? yr.f() : str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = gr.i;
        } else {
            this.d = grVar;
        }
        if ((i & 16) == 0) {
            this.e = be0.h;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z2;
        }
        if ((i & 64) == 0) {
            this.g = er.i;
        } else {
            this.g = erVar;
        }
        if ((i & 128) == 0) {
            this.h = fe0.h;
        } else {
            this.h = set;
        }
        if ((i & 256) == 0) {
            this.i = ir.i;
        } else {
            this.i = irVar;
        }
        if ((i & AIChatConfig.DefaultMaxTokens) == 0) {
            this.j = "";
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = 1000;
        } else {
            this.k = i2;
        }
        if ((i & 2048) == 0) {
            this.l = 0L;
        } else {
            this.l = j;
        }
        this.m = (i & 4096) != 0 ? j2 : 0L;
        if ((i & 8192) == 0) {
            this.n = true;
        } else {
            this.n = z3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zq a(zq zqVar, String str, boolean z, gr grVar, List list, boolean z2, er erVar, Set set, ir irVar, String str2, int i, long j, long j2, boolean z3, int i2) {
        String str3 = zqVar.a;
        String str4 = (i2 & 2) != 0 ? zqVar.b : str;
        gr grVar2 = (i2 & 8) != 0 ? zqVar.d : grVar;
        List list2 = (i2 & 16) != 0 ? zqVar.e : list;
        boolean z4 = (i2 & 32) != 0 ? zqVar.f : z2;
        er erVar2 = (i2 & 64) != 0 ? zqVar.g : erVar;
        Set set2 = (i2 & 128) != 0 ? zqVar.h : set;
        ir irVar2 = (i2 & 256) != 0 ? zqVar.i : irVar;
        String str5 = (i2 & AIChatConfig.DefaultMaxTokens) != 0 ? zqVar.j : str2;
        int i3 = (i2 & 1024) != 0 ? zqVar.k : i;
        long j3 = (i2 & 2048) != 0 ? zqVar.l : j;
        long j4 = (i2 & 4096) != 0 ? zqVar.m : j2;
        boolean z5 = (i2 & 8192) != 0 ? zqVar.n : z3;
        zqVar.getClass();
        str3.getClass();
        str4.getClass();
        grVar2.getClass();
        list2.getClass();
        erVar2.getClass();
        set2.getClass();
        irVar2.getClass();
        str5.getClass();
        return new zq(str3, str4, z, grVar2, list2, z4, erVar2, set2, irVar2, str5, i3, j3, j4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq)) {
            return false;
        }
        zq zqVar = (zq) obj;
        return t11.l(this.a, zqVar.a) && t11.l(this.b, zqVar.b) && this.c == zqVar.c && this.d == zqVar.d && t11.l(this.e, zqVar.e) && this.f == zqVar.f && this.g == zqVar.g && t11.l(this.h, zqVar.h) && this.i == zqVar.i && t11.l(this.j, zqVar.j) && this.k == zqVar.k && this.l == zqVar.l && this.m == zqVar.m && this.n == zqVar.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.n) + hk1.c(hk1.c(vi0.d(this.k, hk1.f(this.j, (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + hk1.d((this.e.hashCode() + ((this.d.hashCode() + hk1.d(hk1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31)) * 31, 31, this.f)) * 31)) * 31)) * 31, 31), 31), 31, this.l), 31, this.m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("AutoReplyTask(id=", this.a, ", name=", this.b, ", isEnabled=");
        sbO.append(this.c);
        sbO.append(", matchMode=");
        sbO.append(this.d);
        sbO.append(", keywords=");
        sbO.append(this.e);
        sbO.append(", ignoreCase=");
        sbO.append(this.f);
        sbO.append(", listMode=");
        sbO.append(this.g);
        sbO.append(", targetIds=");
        sbO.append(this.h);
        sbO.append(", replyType=");
        sbO.append(this.i);
        sbO.append(", replyContent=");
        sbO.append(this.j);
        sbO.append(", voiceDurationMs=");
        sbO.append(this.k);
        sbO.append(", delayMs=");
        sbO.append(this.l);
        sbO.append(", cooldownMs=");
        sbO.append(this.m);
        sbO.append(", stopAfterMatch=");
        sbO.append(this.n);
        sbO.append(")");
        return sbO.toString();
    }

    public zq(String str, String str2, boolean z, gr grVar, List list, boolean z2, er erVar, Set set, ir irVar, String str3, int i, long j, long j2, boolean z3) {
        str2.getClass();
        grVar.getClass();
        list.getClass();
        erVar.getClass();
        set.getClass();
        irVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = grVar;
        this.e = list;
        this.f = z2;
        this.g = erVar;
        this.h = set;
        this.i = irVar;
        this.j = str3;
        this.k = i;
        this.l = j;
        this.m = j2;
        this.n = z3;
    }
}
