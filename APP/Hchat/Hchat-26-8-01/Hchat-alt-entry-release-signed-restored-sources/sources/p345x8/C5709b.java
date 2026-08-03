package p345x8;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.List;
import java.util.Set;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: x8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5709b {

    /* JADX INFO: renamed from: a */
    public final String f23199a;

    /* JADX INFO: renamed from: b */
    public final String f23200b;

    /* JADX INFO: renamed from: c */
    public final boolean f23201c;

    /* JADX INFO: renamed from: d */
    public final String f23202d;

    /* JADX INFO: renamed from: e */
    public final String f23203e;

    /* JADX INFO: renamed from: f */
    public final int f23204f;

    /* JADX INFO: renamed from: g */
    public final int f23205g;

    /* JADX INFO: renamed from: h */
    public final Set f23206h;

    /* JADX INFO: renamed from: i */
    public final Set f23207i;

    /* JADX INFO: renamed from: j */
    public final Set f23208j;

    /* JADX INFO: renamed from: k */
    public final Set f23209k;

    /* JADX INFO: renamed from: l */
    public final int f23210l;

    /* JADX INFO: renamed from: m */
    public final int f23211m;

    /* JADX INFO: renamed from: n */
    public final String f23212n;

    /* JADX INFO: renamed from: o */
    public final String f23213o;

    /* JADX INFO: renamed from: p */
    public final int f23214p;

    /* JADX INFO: renamed from: q */
    public final long f23215q;

    /* JADX INFO: renamed from: r */
    public final boolean f23216r;

    /* JADX INFO: renamed from: s */
    public final List f23217s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5709b(String str, String str2, boolean z9, String str3, String str4, int i9, int i10, Set set, Set set2, Set set3, Set set4, int i11, int i12, String str5, String str6, int i13, long j3, boolean z10, List list) {
        str.getClass();
        set.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        list.getClass();
        this.f23199a = str;
        this.f23200b = str2;
        this.f23201c = z9;
        this.f23202d = str3;
        this.f23203e = str4;
        this.f23204f = i9;
        this.f23205g = i10;
        this.f23206h = set;
        this.f23207i = set2;
        this.f23208j = set3;
        this.f23209k = set4;
        this.f23210l = i11;
        this.f23211m = i12;
        this.f23212n = str5;
        this.f23213o = str6;
        this.f23214p = i13;
        this.f23215q = j3;
        this.f23216r = z10;
        this.f23217s = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C5709b m10314a(C5709b c5709b, String str, boolean z9, String str2, String str3, int i9, int i10, Set set, Set set2, Set set3, Set set4, int i11, int i12, String str4, String str5, int i13, long j3, boolean z10, List list, int i14) {
        String str6 = c5709b.f23199a;
        String str7 = (i14 & 2) != 0 ? c5709b.f23200b : str;
        boolean z11 = (i14 & 4) != 0 ? c5709b.f23201c : z9;
        String str8 = (i14 & 8) != 0 ? c5709b.f23202d : str2;
        String str9 = (i14 & 16) != 0 ? c5709b.f23203e : str3;
        int i15 = (i14 & 32) != 0 ? c5709b.f23204f : i9;
        int i16 = (i14 & 64) != 0 ? c5709b.f23205g : i10;
        Set set5 = (i14 & 128) != 0 ? c5709b.f23206h : set;
        Set set6 = (i14 & Opcodes.ACC_NATIVE) != 0 ? c5709b.f23207i : set2;
        Set set7 = (i14 & Opcodes.ACC_INTERFACE) != 0 ? c5709b.f23208j : set3;
        Set set8 = (i14 & 1024) != 0 ? c5709b.f23209k : set4;
        int i17 = (i14 & Opcodes.ACC_STRICT) != 0 ? c5709b.f23210l : i11;
        int i18 = (i14 & 4096) != 0 ? c5709b.f23211m : i12;
        String str10 = (i14 & 8192) != 0 ? c5709b.f23212n : str4;
        String str11 = (i14 & 16384) != 0 ? c5709b.f23213o : str5;
        int i19 = (i14 & 32768) != 0 ? c5709b.f23214p : i13;
        String str12 = str11;
        long j4 = (i14 & 65536) != 0 ? c5709b.f23215q : j3;
        boolean z12 = (i14 & Opcodes.ACC_DEPRECATED) != 0 ? c5709b.f23216r : z10;
        List list2 = (i14 & Opcodes.ASM4) != 0 ? c5709b.f23217s : list;
        c5709b.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        set5.getClass();
        set6.getClass();
        set7.getClass();
        set8.getClass();
        str10.getClass();
        str12.getClass();
        list2.getClass();
        return new C5709b(str6, str7, z11, str8, str9, i15, i16, set5, set6, set7, set8, i17, i18, str10, str12, i19, j4, z12, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5709b)) {
            return false;
        }
        C5709b c5709b = (C5709b) obj;
        return AbstractC1416l.m3825a(this.f23199a, c5709b.f23199a) && this.f23200b.equals(c5709b.f23200b) && this.f23201c == c5709b.f23201c && this.f23202d.equals(c5709b.f23202d) && this.f23203e.equals(c5709b.f23203e) && this.f23204f == c5709b.f23204f && this.f23205g == c5709b.f23205g && AbstractC1416l.m3825a(this.f23206h, c5709b.f23206h) && AbstractC1416l.m3825a(this.f23207i, c5709b.f23207i) && AbstractC1416l.m3825a(this.f23208j, c5709b.f23208j) && AbstractC1416l.m3825a(this.f23209k, c5709b.f23209k) && this.f23210l == c5709b.f23210l && this.f23211m == c5709b.f23211m && this.f23212n.equals(c5709b.f23212n) && this.f23213o.equals(c5709b.f23213o) && this.f23214p == c5709b.f23214p && this.f23215q == c5709b.f23215q && this.f23216r == c5709b.f23216r && AbstractC1416l.m3825a(this.f23217s, c5709b.f23217s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23217s.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2243f(AbstractC0921a.m2242e(this.f23214p, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f23211m, AbstractC0921a.m2242e(this.f23210l, (this.f23209k.hashCode() + ((this.f23208j.hashCode() + ((this.f23207i.hashCode() + ((this.f23206h.hashCode() + AbstractC0921a.m2242e(this.f23205g, AbstractC0921a.m2242e(this.f23204f, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f23199a.hashCode() * 31, 31, this.f23200b), 31, this.f23201c), 31, this.f23202d), 31, this.f23203e), 31), 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31, this.f23212n), 31, this.f23213o), 31), 31, this.f23215q), 31, this.f23216r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("AutoReplyRule(id=", this.f23199a, ", name=", this.f23200b, ", enabled=");
        sbM1027p.append(this.f23201c);
        sbM1027p.append(", keyword=");
        sbM1027p.append(this.f23202d);
        sbM1027p.append(", excludedKeywords=");
        sbM1027p.append(this.f23203e);
        sbM1027p.append(", matchType=");
        sbM1027p.append(this.f23204f);
        sbM1027p.append(", targetMode=");
        sbM1027p.append(this.f23205g);
        sbM1027p.append(", targetIds=");
        sbM1027p.append(this.f23206h);
        sbM1027p.append(", excludedIds=");
        sbM1027p.append(this.f23207i);
        sbM1027p.append(", includedGroupMembers=");
        sbM1027p.append(this.f23208j);
        sbM1027p.append(", excludedGroupMembers=");
        sbM1027p.append(this.f23209k);
        sbM1027p.append(", atTrigger=");
        sbM1027p.append(this.f23210l);
        sbM1027p.append(", patTrigger=");
        sbM1027p.append(this.f23211m);
        sbM1027p.append(", startTime=");
        sbM1027p.append(this.f23212n);
        sbM1027p.append(", endTime=");
        sbM1027p.append(this.f23213o);
        sbM1027p.append(", maxReplyCount=");
        sbM1027p.append(this.f23214p);
        sbM1027p.append(", cooldownSeconds=");
        sbM1027p.append(this.f23215q);
        sbM1027p.append(", replyAsQuote=");
        sbM1027p.append(this.f23216r);
        sbM1027p.append(", steps=");
        sbM1027p.append(this.f23217s);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
