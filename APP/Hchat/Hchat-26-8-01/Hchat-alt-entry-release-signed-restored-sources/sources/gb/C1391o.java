package gb;

import bsh.org.objectweb.asm.Opcodes;
import java.util.List;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: gb.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1391o {

    /* JADX INFO: renamed from: a */
    public final String f4617a;

    /* JADX INFO: renamed from: b */
    public final String f4618b;

    /* JADX INFO: renamed from: c */
    public final String f4619c;

    /* JADX INFO: renamed from: d */
    public final String f4620d;

    /* JADX INFO: renamed from: e */
    public final String f4621e;

    /* JADX INFO: renamed from: f */
    public final String f4622f;

    /* JADX INFO: renamed from: g */
    public final String f4623g;

    /* JADX INFO: renamed from: h */
    public final long f4624h;

    /* JADX INFO: renamed from: i */
    public final long f4625i;

    /* JADX INFO: renamed from: j */
    public final long f4626j;

    /* JADX INFO: renamed from: k */
    public final String f4627k;

    /* JADX INFO: renamed from: l */
    public final List f4628l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1391o(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j3, long j4, long j5, String str8, List list) {
        this.f4617a = str;
        this.f4618b = str2;
        this.f4619c = str3;
        this.f4620d = str4;
        this.f4621e = str5;
        this.f4622f = str6;
        this.f4623g = str7;
        this.f4624h = j3;
        this.f4625i = j4;
        this.f4626j = j5;
        this.f4627k = str8;
        this.f4628l = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1391o m3788a(C1391o c1391o, long j3, long j4, long j5, int i9) {
        String str = c1391o.f4617a;
        String str2 = c1391o.f4618b;
        String str3 = c1391o.f4619c;
        String str4 = c1391o.f4620d;
        String str5 = c1391o.f4621e;
        String str6 = c1391o.f4622f;
        String str7 = c1391o.f4623g;
        long j10 = (i9 & 128) != 0 ? c1391o.f4624h : j3;
        long j11 = (i9 & Opcodes.ACC_NATIVE) != 0 ? c1391o.f4625i : j4;
        long j12 = (i9 & Opcodes.ACC_INTERFACE) != 0 ? c1391o.f4626j : j5;
        String str8 = c1391o.f4627k;
        List list = c1391o.f4628l;
        c1391o.getClass();
        return new C1391o(str, str2, str3, str4, str5, str6, str7, j10, j11, j12, str8, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1391o)) {
            return false;
        }
        C1391o c1391o = (C1391o) obj;
        return this.f4617a.equals(c1391o.f4617a) && this.f4618b.equals(c1391o.f4618b) && this.f4619c.equals(c1391o.f4619c) && this.f4620d.equals(c1391o.f4620d) && this.f4621e.equals(c1391o.f4621e) && this.f4622f.equals(c1391o.f4622f) && this.f4623g.equals(c1391o.f4623g) && this.f4624h == c1391o.f4624h && this.f4625i == c1391o.f4625i && this.f4626j == c1391o.f4626j && this.f4627k.equals(c1391o.f4627k) && this.f4628l.equals(c1391o.f4628l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4628l.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f4617a.hashCode() * 31, 31, this.f4618b), 31, this.f4619c), 31, this.f4620d), 31, this.f4621e), 31, this.f4622f), 31, this.f4623g), 31, this.f4624h), 31, this.f4625i), 31, this.f4626j), 31, this.f4627k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PluginMarketPlugin(remotePluginId=", this.f4617a, ", sourcePluginId=", this.f4618b, ", name=");
        AbstractC2091b.m5173t(sbM1027p, this.f4619c, ", author=", this.f4620d, ", version=");
        AbstractC2091b.m5173t(sbM1027p, this.f4621e, ", versionId=", this.f4622f, ", updateTime=");
        sbM1027p.append(this.f4623g);
        sbM1027p.append(", downloadCount=");
        sbM1027p.append(this.f4624h);
        AbstractC2091b.m5172s(sbM1027p, ", likeCount=", this.f4625i, ", commentCount=");
        sbM1027p.append(this.f4626j);
        sbM1027p.append(", description=");
        sbM1027p.append(this.f4627k);
        sbM1027p.append(", files=");
        sbM1027p.append(this.f4628l);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
