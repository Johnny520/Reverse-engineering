package p109hb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;

/* JADX INFO: renamed from: hb.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1683i {

    /* JADX INFO: renamed from: a */
    public final String f5576a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5577b;

    /* JADX INFO: renamed from: c */
    public final int f5578c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1236q f5579d;

    /* JADX INFO: renamed from: e */
    public int f5580e = 0;

    /* JADX INFO: renamed from: f */
    public int f5581f = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1683i(String str, ArrayList arrayList, int i9, InterfaceC1236q interfaceC1236q) {
        this.f5576a = str;
        this.f5577b = arrayList;
        this.f5578c = i9;
        this.f5579d = interfaceC1236q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683i)) {
            return false;
        }
        C1683i c1683i = (C1683i) obj;
        return this.f5576a.equals(c1683i.f5576a) && this.f5577b.equals(c1683i.f5577b) && this.f5578c == c1683i.f5578c && AbstractC1416l.m3825a(this.f5579d, c1683i.f5579d) && this.f5580e == c1683i.f5580e && this.f5581f == c1683i.f5581f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2242e = AbstractC0921a.m2242e(this.f5578c, (this.f5577b.hashCode() + (this.f5576a.hashCode() * 31)) * 31, 31);
        InterfaceC1236q interfaceC1236q = this.f5579d;
        return Integer.hashCode(this.f5581f) + AbstractC0921a.m2242e(this.f5580e, (iM2242e + (interfaceC1236q == null ? 0 : interfaceC1236q.hashCode())) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SendBatch(id=" + this.f5576a + ", jobs=" + this.f5577b + ", total=" + this.f5578c + ", onComplete=" + this.f5579d + ", index=" + this.f5580e + ", success=" + this.f5581f + ")";
    }
}
