package p038ce;

import ae.C0070a;
import ae.C0074e;
import ae.C0075f;
import be.C0271b;
import be.C0286i0;
import be.C0308z;
import de.C0772a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.function.Consumer;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import p171lf.C2560b;
import p199nd.C2967d0;
import p199nd.C2987s;
import p199nd.C2988t;
import p233pd.C3406q;
import p246qd.AbstractC3506j;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p351xe.C5791l;

/* JADX INFO: renamed from: ce.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0551d implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4322r f1734b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0551d(C4322r c4322r, int i9) {
        this.f1733a = i9;
        this.f1734b = c4322r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C4320p c4320p;
        String name;
        switch (this.f1733a) {
            case 0:
                C0075f c0075f = (C0075f) obj;
                c0075f.f240i = true;
                c0075f.f235d.forEach(new C0074e(0));
                C0560m.m1573p(this.f1734b.f14402B, c0075f.f234c);
                break;
            case 1:
                C2988t c2988t = (C2988t) obj;
                C4322r c4322r = this.f1734b;
                if (c4322r.f14406F.isEmpty()) {
                    c4322r.f14406F = new ArrayList(5);
                }
                c2988t.f9758d = c4322r.f14406F.size();
                c4322r.f14406F.add(c2988t);
                break;
            case 2:
                C4305a c4305a = (C4305a) obj;
                if (c4305a.f9217g.mo6235a(EnumC2824a.f9155k)) {
                    List listMo6238d = c4305a.f9217g.mo6238d(C2825b.f9211z);
                    C4322r c4322r2 = this.f1734b;
                    Objects.requireNonNull(c4322r2);
                    listMo6238d.forEach(new C0551d(c4322r2, 1));
                }
                break;
            case 3:
                C3515s c3515s = (C3515s) obj;
                C3514r c3514r = c3515s.f11444i;
                ArrayList arrayList = c3515s.f11445j;
                C2829f c2829f = c3514r.f9217g;
                C2825b c2825b = C2825b.f9185L;
                C2967d0 c2967d0 = (C2967d0) c2829f.mo6237c(c2825b);
                C4322r c4322r3 = this.f1734b;
                if (!(c2967d0 == null ? false : C0772a.m1993j(c4322r3, c3515s, c2967d0.f9721g, c2967d0.f9722h))) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C2967d0 c2967d02 = (C2967d0) ((C3514r) it.next()).f9217g.mo6237c(c2825b);
                        if (c2967d02 == null ? false : C0772a.m1993j(c4322r3, c3515s, c2967d02.f9721g, c2967d02.f9722h)) {
                            break;
                        }
                    }
                    C2987s c2987s = (C2987s) c4322r3.f9217g.mo6237c(C2825b.f9198m);
                    if (c2987s != null) {
                        OptionalInt optionalIntMax = arrayList.stream().mapToInt(new C0070a(5)).max();
                        if (optionalIntMax.isPresent()) {
                            C3514r c3514r2 = c3515s.f11444i;
                            int i9 = (c3514r2 == null || (c4320p = c3514r2.f11420j) == null) ? -1 : c4320p.f14399n;
                            int asInt = optionalIntMax.getAsInt();
                            int i10 = c3515s.f11442g;
                            for (C2560b c2560b : c2987s.f9754g) {
                                if (c2560b.f8303a == i10) {
                                    int i11 = c2560b.f8308f;
                                    int i12 = c2560b.f8309g;
                                    if (!(i11 <= i9 && i9 <= i12)) {
                                        if (i11 <= asInt && asInt <= i12) {
                                        }
                                    }
                                    C0772a.m1993j(c4322r3, c3515s, C0271b.m1071G(c4322r3, c2560b), c2560b.f8304b);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                List<C3406q> list = ((C3515s) obj).f11446k;
                if (list == null) {
                    list = Collections.EMPTY_LIST;
                }
                for (C3406q c3406q : list) {
                    List list2 = c3406q.f14398m;
                    List list3 = c3406q.f14398m;
                    HashSet hashSet = new HashSet(list2.size() + 1);
                    C3514r c3514r3 = c3406q.f14397l;
                    if (c3514r3 != null && (name = c3514r3.getName()) != null) {
                        hashSet.add(name);
                    }
                    list3.forEach(new C0308z(hashSet, 3));
                    if (hashSet.size() == 1) {
                        String str = (String) hashSet.iterator().next();
                        c3406q.f14397l.mo7390p(str);
                        list3.forEach(new C0286i0(str, 1));
                    } else if (hashSet.size() > 1) {
                        this.f1734b.m6380I("Different variable names in phi insn: " + String.valueOf(hashSet) + ", use first");
                        String str2 = (String) hashSet.iterator().next();
                        c3406q.f14397l.mo7390p(str2);
                        list3.forEach(new C0286i0(str2, 1));
                    }
                }
                break;
            case 5:
                C3515s c3515s2 = (C3515s) obj;
                if (!((AbstractC3506j) c3515s2.f11447l.f10677h).mo7345w()) {
                    C4322r c4322r4 = this.f1734b;
                    c4322r4.m6383L("Type inference failed for: ".concat(c3515s2.m7399c(c4322r4)));
                }
                if (c3515s2.m7398b().f11412b == null) {
                    c3515s2.m7398b().f11412b = AbstractC3506j.f11404u;
                }
                break;
            case 6:
                C5791l.m10476h(this.f1734b, (C4320p) obj);
                break;
            default:
                C4320p c4320p2 = (C4320p) obj;
                C5791l.m10480l(this.f1734b, c4320p2);
                c4320p2.m6231w(EnumC2824a.f9166s);
                break;
        }
    }
}
