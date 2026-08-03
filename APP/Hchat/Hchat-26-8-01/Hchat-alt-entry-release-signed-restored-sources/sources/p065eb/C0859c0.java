package p065eb;

import gg.AbstractC1416l;
import java.io.File;
import java.util.Set;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: eb.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0859c0 {

    /* JADX INFO: renamed from: a */
    public final String f2626a;

    /* JADX INFO: renamed from: b */
    public final String f2627b;

    /* JADX INFO: renamed from: c */
    public final File f2628c;

    /* JADX INFO: renamed from: d */
    public final File f2629d;

    /* JADX INFO: renamed from: e */
    public final String f2630e;

    /* JADX INFO: renamed from: f */
    public final String f2631f;

    /* JADX INFO: renamed from: g */
    public final String f2632g;

    /* JADX INFO: renamed from: h */
    public final String f2633h;

    /* JADX INFO: renamed from: i */
    public final Set f2634i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0859c0(String str, String str2, File file, File file2, String str3, String str4, String str5, String str6, Set set) {
        set.getClass();
        this.f2626a = str;
        this.f2627b = str2;
        this.f2628c = file;
        this.f2629d = file2;
        this.f2630e = str3;
        this.f2631f = str4;
        this.f2632g = str5;
        this.f2633h = str6;
        this.f2634i = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0859c0)) {
            return false;
        }
        C0859c0 c0859c0 = (C0859c0) obj;
        return this.f2626a.equals(c0859c0.f2626a) && this.f2627b.equals(c0859c0.f2627b) && this.f2628c.equals(c0859c0.f2628c) && this.f2629d.equals(c0859c0.f2629d) && this.f2630e.equals(c0859c0.f2630e) && this.f2631f.equals(c0859c0.f2631f) && this.f2632g.equals(c0859c0.f2632g) && AbstractC1416l.m3825a(this.f2633h, c0859c0.f2633h) && AbstractC1416l.m3825a(this.f2634i, c0859c0.f2634i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g((this.f2629d.hashCode() + ((this.f2628c.hashCode() + AbstractC0921a.m2244g(this.f2626a.hashCode() * 31, 31, this.f2627b)) * 31)) * 31, 31, this.f2630e), 31, this.f2631f), 31, this.f2632g);
        String str = this.f2633h;
        return this.f2634i.hashCode() + ((iM2244g + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPlugin(id=", this.f2626a, ", name=", this.f2627b, ", dir=");
        sbM1027p.append(this.f2628c);
        sbM1027p.append(", mainFile=");
        sbM1027p.append(this.f2629d);
        sbM1027p.append(", author=");
        AbstractC2091b.m5173t(sbM1027p, this.f2630e, ", version=", this.f2631f, ", updateTime=");
        AbstractC2091b.m5173t(sbM1027p, this.f2632g, ", displayName=", this.f2633h, ", processScope=");
        sbM1027p.append(this.f2634i);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
