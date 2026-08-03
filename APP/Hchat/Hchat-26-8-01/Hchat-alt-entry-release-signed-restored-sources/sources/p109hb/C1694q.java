package p109hb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;
import p136j8.AbstractC2091b;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: hb.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1694q {

    /* JADX INFO: renamed from: a */
    public final String f5626a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5627b;

    /* JADX INFO: renamed from: c */
    public final List f5628c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1236q f5629d;

    /* JADX INFO: renamed from: e */
    public int f5630e = 0;

    /* JADX INFO: renamed from: f */
    public int f5631f = 0;

    /* JADX INFO: renamed from: g */
    public int f5632g = 0;

    /* JADX INFO: renamed from: h */
    public int f5633h = 0;

    /* JADX INFO: renamed from: i */
    public int f5634i = -1;

    /* JADX INFO: renamed from: j */
    public C1693p f5635j = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1694q(String str, ArrayList arrayList, List list, InterfaceC1236q interfaceC1236q) {
        this.f5626a = str;
        this.f5627b = arrayList;
        this.f5628c = list;
        this.f5629d = interfaceC1236q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694q)) {
            return false;
        }
        C1694q c1694q = (C1694q) obj;
        return this.f5626a.equals(c1694q.f5626a) && this.f5627b.equals(c1694q.f5627b) && this.f5628c.equals(c1694q.f5628c) && AbstractC1416l.m3825a(this.f5629d, c1694q.f5629d) && this.f5630e == c1694q.f5630e && this.f5631f == c1694q.f5631f && this.f5632g == c1694q.f5632g && this.f5633h == c1694q.f5633h && this.f5634i == c1694q.f5634i && AbstractC1416l.m3825a(this.f5635j, c1694q.f5635j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM5158e = AbstractC2091b.m5158e(this.f5628c, (this.f5627b.hashCode() + (this.f5626a.hashCode() * 31)) * 31, 31);
        InterfaceC1236q interfaceC1236q = this.f5629d;
        int iM2242e = AbstractC0921a.m2242e(this.f5634i, AbstractC0921a.m2242e(this.f5633h, AbstractC0921a.m2242e(this.f5632g, AbstractC0921a.m2242e(this.f5631f, AbstractC0921a.m2242e(this.f5630e, (iM5158e + (interfaceC1236q == null ? 0 : interfaceC1236q.hashCode())) * 31, 31), 31), 31), 31), 31);
        C1693p c1693p = this.f5635j;
        return iM2242e + (c1693p != null ? c1693p.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f5630e;
        int i10 = this.f5631f;
        int i11 = this.f5632g;
        int i12 = this.f5633h;
        int i13 = this.f5634i;
        C1693p c1693p = this.f5635j;
        StringBuilder sb2 = new StringBuilder("SendBatch(id=");
        sb2.append(this.f5626a);
        sb2.append(", snapshots=");
        sb2.append(this.f5627b);
        sb2.append(", targets=");
        sb2.append(this.f5628c);
        sb2.append(", onComplete=");
        sb2.append(this.f5629d);
        sb2.append(", index=");
        AbstractC4855en.m9272p(sb2, i9, ", targetIndex=", i10, ", success=");
        AbstractC4855en.m9272p(sb2, i11, ", total=", i12, ", preparedSnapshotIndex=");
        sb2.append(i13);
        sb2.append(", directPlan=");
        sb2.append(c1693p);
        sb2.append(")");
        return sb2.toString();
    }
}
