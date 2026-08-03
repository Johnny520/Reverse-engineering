package p246qd;

import ae.C0070a;
import af.C0084g;
import be.C0285i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import md.C2825b;
import md.EnumC2824a;
import me.C2833a;
import mh.AbstractC2846d;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p199nd.C2967d0;
import p222p.AbstractC3199a;
import p227p4.C3315t;
import p233pd.C3406q;
import p233pd.EnumC3400k;
import p302ud.C4320p;
import p302ud.C4322r;
import p332wb.AbstractC4855en;
import p351xe.C5796q;

/* JADX INFO: renamed from: qd.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3515s implements Comparable {

    /* JADX INFO: renamed from: n */
    public static final Comparator f11441n;

    /* JADX INFO: renamed from: g */
    public final int f11442g;

    /* JADX INFO: renamed from: h */
    public final int f11443h;

    /* JADX INFO: renamed from: i */
    public C3514r f11444i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f11445j = new ArrayList(2);

    /* JADX INFO: renamed from: k */
    public ArrayList f11446k = null;

    /* JADX INFO: renamed from: l */
    public final C3315t f11447l = new C3315t(3);

    /* JADX INFO: renamed from: m */
    public C3507k f11448m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C3515s.class);
        f11441n = Comparator.comparingInt(new C0070a(12)).thenComparingInt(new C0070a(13));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3515s(int i9, int i10, C3514r c3514r) {
        this.f11442g = i9;
        this.f11443h = i10;
        this.f11444i = c3514r;
        c3514r.f11440m = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7397a(C3406q c3406q) {
        if (this.f11446k == null) {
            this.f11446k = new ArrayList(1);
        }
        this.f11446k.add(c3406q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C3507k m7398b() {
        C3507k c3507k = this.f11448m;
        if (c3507k != null) {
            return c3507k;
        }
        C0086a.m452k("Code variable not set in ".concat(String.valueOf(this)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0052 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashSet] */
    /* JADX INFO: renamed from: c */
    public final String m7399c(C4322r c4322r) {
        HashSet hashSet = new HashSet();
        ?? hashSet2 = Collections.EMPTY_SET;
        ArrayList arrayList = this.f11445j;
        ArrayList<C3514r> arrayList2 = new ArrayList(arrayList.size() + 1);
        arrayList2.add(this.f11444i);
        arrayList2.addAll(arrayList);
        if (c4322r.f9217g.mo6236b(C2825b.f9198m)) {
            hashSet2 = new HashSet();
            for (C3514r c3514r : arrayList2) {
                C2967d0 c2967d0 = (C2967d0) c3514r.f9217g.mo6237c(C2825b.f9185L);
                if (c2967d0 != null) {
                    hashSet2.add(c2967d0.f9722h);
                    hashSet.add(c2967d0.f9721g);
                }
            }
        }
        for (C3514r c3514r2 : arrayList2) {
            AbstractC3506j abstractC3506j = c3514r2.f11419i;
            if (abstractC3506j.mo7345w()) {
                hashSet.add(abstractC3506j);
            }
            AbstractC3506j abstractC3506jMo7375I = c3514r2.mo7375I();
            if (abstractC3506jMo7375I.mo7345w()) {
                hashSet.add(abstractC3506jMo7375I);
            }
        }
        StringBuilder sb2 = new StringBuilder("r");
        sb2.append(this.f11442g);
        sb2.append('v');
        sb2.append(this.f11443h);
        if (!hashSet2.isEmpty()) {
            String str = (String) hashSet2.stream().sorted().collect(Collectors.joining(", ", "[", "]"));
            sb2.append(", names: ");
            sb2.append(str);
        }
        if (!hashSet.isEmpty()) {
            String str2 = (String) hashSet.stream().map(new C2833a(7)).sorted().collect(Collectors.joining(", ", "[", "]"));
            sb2.append(", types: ");
            sb2.append(str2);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f11441n.compare(this, (C3515s) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC3506j m7400d() {
        if (m7404i()) {
            return this.f11444i.f11419i;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m7401e() {
        C3507k c3507k = this.f11448m;
        if (c3507k == null) {
            return null;
        }
        return c3507k.f11411a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3515s)) {
            return false;
        }
        C3515s c3515s = (C3515s) obj;
        return this.f11442g == c3515s.f11442g && this.f11443h == c3515s.f11443h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C3406q m7402f() {
        ArrayList arrayList = this.f11446k;
        if (arrayList == null || arrayList.size() != 1) {
            return null;
        }
        return (C3406q) this.f11446k.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final List m7403g() {
        C4320p c4320p = this.f11444i.f11420j;
        if (c4320p == null || c4320p.f14396k != EnumC3400k.f10972X) {
            ArrayList arrayList = this.f11446k;
            return arrayList == null ? Collections.EMPTY_LIST : arrayList;
        }
        C3406q c3406q = (C3406q) c4320p;
        if (this.f11446k == null) {
            return Collections.singletonList(c3406q);
        }
        ArrayList arrayList2 = new ArrayList(this.f11446k.size() + 1);
        arrayList2.add(c3406q);
        arrayList2.addAll(this.f11446k);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f11442g * 31) + this.f11443h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m7404i() {
        C3514r c3514r = this.f11444i;
        return c3514r.f9217g.mo6235a(EnumC2824a.f9128N);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m7405j() {
        ArrayList arrayList = this.f11446k;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7406k(C3514r c3514r) {
        this.f11445j.removeIf(new C0285i(c3514r, 24));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m7407l(C3406q c3406q) {
        ArrayList arrayList = this.f11446k;
        if (arrayList != null) {
            arrayList.removeIf(new C0285i(c3406q, 23));
            if (this.f11446k.isEmpty()) {
                this.f11446k = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m7408m(C3507k c3507k) {
        this.f11448m = c3507k;
        if (c3507k.f11413c.isEmpty()) {
            c3507k.f11413c = new ArrayList(3);
        }
        if (!c3507k.f11413c.contains(this)) {
            c3507k.f11413c.add(this);
        }
        AbstractC3506j abstractC3506jM7400d = m7400d();
        if (abstractC3506jM7400d != null) {
            c3507k.f11412b = abstractC3506jM7400d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m7409n(AbstractC3506j abstractC3506j) {
        AbstractC3506j abstractC3506jM7400d = m7400d();
        if (abstractC3506jM7400d == null || abstractC3506jM7400d.equals(abstractC3506j)) {
            this.f11447l.f10677h = abstractC3506j;
            C3507k c3507k = this.f11448m;
            if (c3507k != null) {
                c3507k.f11412b = abstractC3506j;
                return;
            }
            return;
        }
        String strValueOf = String.valueOf(abstractC3506jM7400d);
        String strValueOf2 = String.valueOf(abstractC3506j);
        String strValueOf3 = String.valueOf(this);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("Can't change immutable type ", strValueOf, " to ", strValueOf2, " for ");
        sbM1027p.append(strValueOf3);
        throw new C0084g(sbM1027p.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final String m7410o() {
        return AbstractC3199a.m6837j(this.f11442g, "r", "v", this.f11443h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m7411p() {
        this.f11446k = null;
        Iterator it = this.f11445j.iterator();
        while (it.hasNext()) {
            C4320p c4320p = ((C3514r) it.next()).f11420j;
            if (c4320p != null && c4320p.f14396k == EnumC3400k.f10972X) {
                m7397a((C3406q) c4320p);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m7412q(C3514r c3514r) {
        C3515s c3515s = c3514r.f11440m;
        if (c3515s != null) {
            c3515s.m7406k(c3514r);
        }
        c3514r.f11440m = this;
        this.f11445j.add(c3514r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM7410o = m7410o();
        String strM7401e = m7401e();
        C5796q c5796q = C5796q.f23542b;
        return AbstractC4855en.m9265i(strM7410o, (strM7401e == null || strM7401e.isEmpty()) ? HttpUrl.FRAGMENT_ENCODE_SET : AbstractC0921a.m2251n(" '", m7401e(), "' "), " ", String.valueOf((AbstractC3506j) this.f11447l.f10677h));
    }
}
