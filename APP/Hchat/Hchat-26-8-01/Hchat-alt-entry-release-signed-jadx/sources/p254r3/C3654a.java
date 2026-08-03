package p254r3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import p012ah.C0086a;
import p136j8.C2104o;
import p269s3.C3923a;
import tf.AbstractC4166m;
import tf.AbstractC4171r;
import tf.C4164k;

/* JADX INFO: renamed from: r3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3654a {

    /* JADX INFO: renamed from: a */
    public boolean f11850a;

    /* JADX INFO: renamed from: b */
    public final C3657d f11851b = new C3657d();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f11852c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f11853d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f11854e = new LinkedHashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7634a() {
        if (this.f11850a) {
            C2104o.m5276A("This NavigationEventDispatcher has already been disposed and cannot be used.");
            return;
        }
        this.f11850a = true;
        C4164k c4164k = new C4164k();
        c4164k.addLast(this);
        while (!c4164k.isEmpty()) {
            C3654a c3654a = (C3654a) c4164k.removeFirst();
            c3654a.f11850a = true;
            LinkedHashSet linkedHashSet = c3654a.f11853d;
            LinkedHashSet linkedHashSet2 = c3654a.f11854e;
            LinkedHashSet linkedHashSet3 = c3654a.f11852c;
            AbstractC4171r.m8432h1(c4164k, linkedHashSet3);
            Iterator it = AbstractC4166m.m8407P1(linkedHashSet2).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    C0086a.m445d();
                    return;
                } else {
                    this.f11851b.getClass();
                    throw null;
                }
            }
            linkedHashSet2.clear();
            Iterator it2 = AbstractC4166m.m8407P1(linkedHashSet).iterator();
            while (it2.hasNext()) {
                ((C3923a) it2.next()).m8120a();
            }
            linkedHashSet.clear();
            linkedHashSet3.clear();
        }
    }
}
