package me;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import md.EnumC2824a;
import p071f1.AbstractC1018n0;
import p092g4.AbstractC1341a;
import p246qd.C3514r;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4318n;
import p383zd.C6137b;
import p383zd.C6138c;

/* JADX INFO: renamed from: me.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2834b extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public final ArrayList f9225h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f9226i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2834b() {
        super(3);
        this.f9225h = new ArrayList();
        this.f9226i = new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: l */
    public final void mo2623l(C4322r c4322r, InterfaceC4312h interfaceC4312h, InterfaceC4318n interfaceC4318n) {
        C2837e c2837e = new C2837e(interfaceC4318n, interfaceC4312h);
        if (interfaceC4318n instanceof C6138c) {
            AbstractC1341a abstractC1341a = ((C6138c) interfaceC4318n).f24729r;
            if (abstractC1341a instanceof C6137b) {
                C6137b c6137b = (C6137b) abstractC1341a;
                m6244p(c6137b.f24722a, c2837e);
                m6244p(c6137b.f24723b, c2837e);
            }
        }
        int size = interfaceC4312h.mo8643g().size();
        for (int i9 = 0; i9 < size; i9++) {
            m6244p((C4320p) interfaceC4312h.mo8643g().get(i9), c2837e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m6244p(C4320p c4320p, C2837e c2837e) {
        if (c4320p == null) {
            return;
        }
        C3514r c3514r = c4320p.f14397l;
        LinkedHashMap linkedHashMap = this.f9226i;
        EnumC2824a enumC2824a = EnumC2824a.f9166s;
        if (c3514r != null && !c3514r.f9217g.mo6235a(enumC2824a)) {
            ((C2838f) linkedHashMap.computeIfAbsent(c3514r.f11440m, new C2833a(0))).f9231b.add(c2837e);
        }
        ArrayList<C3514r> arrayList = this.f9225h;
        arrayList.clear();
        c4320p.mo8340U(arrayList);
        for (C3514r c3514r2 : arrayList) {
            if (!c3514r2.f9217g.mo6235a(enumC2824a)) {
                ((C2838f) linkedHashMap.computeIfAbsent(c3514r2.f11440m, new C2833a(0))).f9232c.add(c2837e);
            }
        }
    }
}
