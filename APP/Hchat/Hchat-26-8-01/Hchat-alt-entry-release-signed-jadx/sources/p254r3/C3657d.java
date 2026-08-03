package p254r3;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p269s3.C3923a;
import p304uf.C4329c;
import tf.AbstractC4171r;
import tf.C4164k;
import tg.AbstractC4201s;
import tg.C4183b0;

/* JADX INFO: renamed from: r3.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3657d {

    /* JADX INFO: renamed from: a */
    public final C4183b0 f11858a;

    /* JADX INFO: renamed from: b */
    public final C4164k f11859b;

    /* JADX INFO: renamed from: c */
    public final C4164k f11860c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f11861d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f11862e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f11863f;

    /* JADX INFO: renamed from: g */
    public boolean f11864g;

    /* JADX INFO: renamed from: h */
    public boolean f11865h;

    /* JADX INFO: renamed from: i */
    public boolean f11866i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3657d() {
        AbstractC4201s.m8464b(C3658e.f11867a);
        this.f11858a = AbstractC4201s.m8464b(new C3655b());
        this.f11859b = new C4164k();
        this.f11860c = new C4164k();
        this.f11861d = new LinkedHashSet();
        this.f11862e = new LinkedHashSet();
        this.f11863f = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C3923a m7635b(C3657d c3657d) {
        Object obj;
        Object next;
        C4164k c4164k = c3657d.f11860c;
        Iterator it = c3657d.f11859b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C3923a c3923a = (C3923a) next;
            if (c3923a.f12881d || c3923a.f12882e) {
                break;
            }
        }
        C3923a c3923a2 = (C3923a) next;
        if (c3923a2 != null) {
            return c3923a2;
        }
        for (Object obj2 : c4164k) {
            C3923a c3923a3 = (C3923a) obj2;
            if (c3923a3.f12881d || c3923a3.f12882e) {
                obj = obj2;
                break;
            }
        }
        return (C3923a) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7636a() {
        boolean z9;
        boolean z10;
        C4164k<C3923a> c4164k = this.f11859b;
        if (c4164k == null || !c4164k.isEmpty()) {
            for (C3923a c3923a : c4164k) {
                if (c3923a.f12881d || c3923a.f12882e) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
        } else {
            z9 = false;
        }
        C4164k<C3923a> c4164k2 = this.f11860c;
        if (c4164k2 == null || !c4164k2.isEmpty()) {
            for (C3923a c3923a2 : c4164k2) {
                if (c3923a2.f12881d || c3923a2.f12882e) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        boolean z11 = z9 || z10;
        boolean z12 = this.f11865h != z9;
        boolean z13 = this.f11864g != z10;
        boolean z14 = this.f11866i != z11;
        if (z12) {
            Iterator it = this.f11863f.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                C0086a.m445d();
                return;
            }
        }
        if (z13) {
            Iterator it2 = this.f11862e.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                C0086a.m445d();
                return;
            }
        }
        if (z14) {
            Iterator it3 = this.f11861d.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                C0086a.m445d();
                return;
            }
        }
        this.f11865h = z9;
        this.f11864g = z10;
        this.f11866i = z11;
        m7637c(m7635b(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m7637c(C3923a c3923a) {
        C3655b c3655b;
        C3923a c3923aM7635b = m7635b(this);
        if (AbstractC1416l.m3825a(c3923aM7635b, c3923a)) {
            if (c3923aM7635b == null) {
                c3655b = new C3655b();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C3923a c3923a2 : this.f11859b) {
                    if (c3923a2.f12881d && !c3923a2.f12879b.isEmpty()) {
                        arrayList.addAll(c3923a2.f12879b);
                    }
                }
                for (C3923a c3923a3 : this.f11860c) {
                    if (c3923a3.f12881d && !c3923a3.f12879b.isEmpty()) {
                        arrayList.addAll(c3923a3.f12879b);
                    }
                }
                C3656c c3656c = c3923aM7635b.f12878a;
                List list = c3923aM7635b.f12880c;
                c3656c.getClass();
                C4329c c4329cM7E = AbstractC0000a.m7E();
                AbstractC4171r.m8432h1(c4329cM7E, arrayList);
                c4329cM7E.add(c3656c);
                AbstractC4171r.m8432h1(c4329cM7E, list);
                c3655b = new C3655b(arrayList.size(), AbstractC0000a.m90t(c4329cM7E));
            }
            C4183b0 c4183b0 = this.f11858a;
            if (AbstractC1416l.m3825a((C3655b) c4183b0.getValue(), c3655b)) {
                return;
            }
            c4183b0.m8446h(null, c3655b);
            Iterator it = this.f11863f.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                C0086a.m445d();
                return;
            }
            Iterator it2 = this.f11862e.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                C0086a.m445d();
                return;
            }
            Iterator it3 = this.f11861d.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                C0086a.m445d();
            }
        }
    }
}
