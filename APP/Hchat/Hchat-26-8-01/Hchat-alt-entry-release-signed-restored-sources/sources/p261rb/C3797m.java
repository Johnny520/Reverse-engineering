package p261rb;

import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: rb.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3797m {

    /* JADX INFO: renamed from: a */
    public final boolean f12466a;

    /* JADX INFO: renamed from: b */
    public final boolean f12467b;

    /* JADX INFO: renamed from: c */
    public final String f12468c;

    /* JADX INFO: renamed from: d */
    public final String f12469d;

    /* JADX INFO: renamed from: e */
    public final int f12470e;

    /* JADX INFO: renamed from: f */
    public final int f12471f;

    /* JADX INFO: renamed from: g */
    public final List f12472g;

    /* JADX INFO: renamed from: h */
    public final List f12473h;

    /* JADX INFO: renamed from: i */
    public final boolean f12474i;

    /* JADX INFO: renamed from: j */
    public final int f12475j;

    /* JADX INFO: renamed from: k */
    public final int f12476k;

    /* JADX INFO: renamed from: l */
    public final int f12477l;

    /* JADX INFO: renamed from: m */
    public final int f12478m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3797m(boolean z9, boolean z10, String str, String str2, int i9, int i10, List list, List list2, boolean z11, int i11, int i12, int i13, int i14) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.f12466a = z9;
        this.f12467b = z10;
        this.f12468c = str;
        this.f12469d = str2;
        this.f12470e = i9;
        this.f12471f = i10;
        this.f12472g = list;
        this.f12473h = list2;
        this.f12474i = z11;
        this.f12475j = i11;
        this.f12476k = i12;
        this.f12477l = i13;
        this.f12478m = i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m7990a() {
        List list = this.f12472g;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (Boolean.valueOf(((C3788d) it.next()).f12420c == EnumC3789e.f12423h).booleanValue() && (i9 = i9 + 1) < 0) {
                AbstractC0000a.m30P0();
                throw null;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m7991b() {
        List list = this.f12472g;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (Boolean.valueOf(((C3788d) it.next()).f12420c == EnumC3789e.f12424i).booleanValue() && (i9 = i9 + 1) < 0) {
                AbstractC0000a.m30P0();
                throw null;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3797m)) {
            return false;
        }
        C3797m c3797m = (C3797m) obj;
        return this.f12466a == c3797m.f12466a && this.f12467b == c3797m.f12467b && AbstractC1416l.m3825a(this.f12468c, c3797m.f12468c) && AbstractC1416l.m3825a(this.f12469d, c3797m.f12469d) && this.f12470e == c3797m.f12470e && this.f12471f == c3797m.f12471f && AbstractC1416l.m3825a(this.f12472g, c3797m.f12472g) && AbstractC1416l.m3825a(this.f12473h, c3797m.f12473h) && this.f12474i == c3797m.f12474i && this.f12475j == c3797m.f12475j && this.f12476k == c3797m.f12476k && this.f12477l == c3797m.f12477l && this.f12478m == c3797m.f12478m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f12478m) + AbstractC0921a.m2242e(this.f12477l, AbstractC0921a.m2242e(this.f12476k, AbstractC0921a.m2242e(this.f12475j, AbstractC0921a.m2245h(AbstractC2091b.m5158e(this.f12473h, AbstractC2091b.m5158e(this.f12472g, AbstractC0921a.m2242e(this.f12471f, AbstractC0921a.m2242e(this.f12470e, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(Boolean.hashCode(this.f12466a) * 31, 31, this.f12467b), 31, this.f12468c), 31, this.f12469d), 31), 31), 31), 31), 31, this.f12474i), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ZombieCheckSnapshot(ready=");
        sb2.append(this.f12466a);
        sb2.append(", running=");
        sb2.append(this.f12467b);
        sb2.append(", status=");
        AbstractC2091b.m5173t(sb2, this.f12468c, ", currentName=", this.f12469d, ", totalCount=");
        AbstractC4855en.m9272p(sb2, this.f12470e, ", pendingCount=", this.f12471f, ", results=");
        sb2.append(this.f12472g);
        sb2.append(", logs=");
        sb2.append(this.f12473h);
        sb2.append(", deleting=");
        sb2.append(this.f12474i);
        sb2.append(", deleteTotalCount=");
        sb2.append(this.f12475j);
        sb2.append(", deleteCompletedCount=");
        AbstractC4855en.m9272p(sb2, this.f12476k, ", deleteSuccessCount=", this.f12477l, ", deleteFailureCount=");
        return AbstractC2091b.m5163j(sb2, this.f12478m, ")");
    }
}
