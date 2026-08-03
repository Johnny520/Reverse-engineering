package p302ud;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import md.AbstractC2828e;
import md.C2825b;
import md.EnumC2824a;
import p000a.AbstractC0000a;
import p199nd.C2988t;
import p351xe.AbstractC5792m;
import p351xe.C5786g;

/* JADX INFO: renamed from: ud.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4305a extends AbstractC2828e implements InterfaceC4312h, Comparable {

    /* JADX INFO: renamed from: i */
    public final int f14348i;

    /* JADX INFO: renamed from: j */
    public int f14349j;

    /* JADX INFO: renamed from: k */
    public final int f14350k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f14351l = new ArrayList(2);

    /* JADX INFO: renamed from: m */
    public List f14352m = new ArrayList(1);

    /* JADX INFO: renamed from: n */
    public List f14353n = new ArrayList(1);

    /* JADX INFO: renamed from: o */
    public List f14354o;

    /* JADX INFO: renamed from: p */
    public BitSet f14355p;

    /* JADX INFO: renamed from: q */
    public BitSet f14356q;

    /* JADX INFO: renamed from: r */
    public BitSet f14357r;

    /* JADX INFO: renamed from: s */
    public C4305a f14358s;

    /* JADX INFO: renamed from: t */
    public C4305a f14359t;

    /* JADX INFO: renamed from: u */
    public List f14360u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4305a(int i9, int i10, int i11) {
        C5786g c5786g = C5786g.f23528g;
        this.f14355p = c5786g;
        this.f14356q = c5786g;
        this.f14360u = new ArrayList(3);
        this.f14348i = i9;
        this.f14349j = i10;
        this.f14350k = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final void m8642H() {
        List<C4305a> list = this.f14353n;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C4305a c4305a : list) {
                if (AbstractC0000a.m85q0(c4305a)) {
                    arrayList.add(c4305a);
                }
            }
            if (this.f9217g.mo6235a(EnumC2824a.f9157l)) {
                Iterator it = this.f9217g.mo6238d(C2825b.f9211z).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2988t) it.next()).f9755a);
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.removeAll(arrayList);
                list = arrayList2;
            }
        }
        this.f14354o = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14348i, ((C4305a) obj).f14348i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4305a) && this.f14348i == ((C4305a) obj).f14348i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4312h
    /* JADX INFO: renamed from: g */
    public final List mo8643g() {
        return this.f14351l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14348i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: k */
    public final String mo8644k() {
        return Integer.toString(this.f14348i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "B:" + this.f14348i + ":" + AbstractC5792m.m10487d(this.f14350k);
    }
}
