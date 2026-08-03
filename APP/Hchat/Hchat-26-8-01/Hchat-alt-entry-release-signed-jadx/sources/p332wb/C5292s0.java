package p332wb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import tf.C4173t;

/* JADX INFO: renamed from: wb.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5292s0 {

    /* JADX INFO: renamed from: a */
    public final String f20550a;

    /* JADX INFO: renamed from: b */
    public final String f20551b;

    /* JADX INFO: renamed from: c */
    public final boolean f20552c;

    /* JADX INFO: renamed from: d */
    public final String f20553d;

    /* JADX INFO: renamed from: e */
    public final String f20554e;

    /* JADX INFO: renamed from: f */
    public final List f20555f;

    /* JADX INFO: renamed from: g */
    public final boolean f20556g;

    /* JADX INFO: renamed from: h */
    public final String f20557h;

    /* JADX INFO: renamed from: i */
    public final List f20558i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5292s0(String str, String str2, boolean z9, String str3, String str4, List list, boolean z10, List list2, int i9) {
        int i10 = i9 & 32;
        C4173t c4173t = C4173t.f13710g;
        this(str, str2, z9, str3, str4, i10 != 0 ? c4173t : list, (i9 & 64) != 0 ? false : z10, HttpUrl.FRAGMENT_ENCODE_SET, (i9 & Opcodes.ACC_NATIVE) != 0 ? c4173t : list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5292s0)) {
            return false;
        }
        C5292s0 c5292s0 = (C5292s0) obj;
        return AbstractC1416l.m3825a(this.f20550a, c5292s0.f20550a) && AbstractC1416l.m3825a(this.f20551b, c5292s0.f20551b) && this.f20552c == c5292s0.f20552c && AbstractC1416l.m3825a(this.f20553d, c5292s0.f20553d) && AbstractC1416l.m3825a(this.f20554e, c5292s0.f20554e) && AbstractC1416l.m3825a(this.f20555f, c5292s0.f20555f) && this.f20556g == c5292s0.f20556g && AbstractC1416l.m3825a(this.f20557h, c5292s0.f20557h) && AbstractC1416l.m3825a(this.f20558i, c5292s0.f20558i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f20558i.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC2091b.m5158e(this.f20555f, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2244g(this.f20550a.hashCode() * 31, 31, this.f20551b), 31, this.f20552c), 31, this.f20553d), 31, this.f20554e), 31), 31, this.f20556g), 31, this.f20557h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ContactOption(id=", this.f20550a, ", label=", this.f20551b, ", group=");
        sbM1027p.append(this.f20552c);
        sbM1027p.append(", avatarUrl=");
        sbM1027p.append(this.f20553d);
        sbM1027p.append(", avatarBackupUrl=");
        sbM1027p.append(this.f20554e);
        sbM1027p.append(", labels=");
        sbM1027p.append(this.f20555f);
        sbM1027p.append(", official=");
        sbM1027p.append(this.f20556g);
        sbM1027p.append(", extraSummary=");
        sbM1027p.append(this.f20557h);
        sbM1027p.append(", searchAliases=");
        sbM1027p.append(this.f20558i);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    public C5292s0(String str, String str2, boolean z9, String str3, String str4, List list, boolean z10, String str5, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        this.f20550a = str;
        this.f20551b = str2;
        this.f20552c = z9;
        this.f20553d = str3;
        this.f20554e = str4;
        this.f20555f = list;
        this.f20556g = z10;
        this.f20557h = str5;
        this.f20558i = list2;
    }
}
