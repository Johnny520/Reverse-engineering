package p247qe;

import androidx.lifecycle.C0100e0;
import be.C0285i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import me.C2833a;
import mh.AbstractC2846d;
import p038ce.C0561n;
import p227p4.C3315t;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3501e;
import p246qd.C3514r;
import p246qd.C3515s;
import p246qd.EnumC3513q;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: qe.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3535r {

    /* JADX INFO: renamed from: a */
    public final C4322r f11498a;

    /* JADX INFO: renamed from: b */
    public final C0100e0 f11499b;

    /* JADX INFO: renamed from: c */
    public final C3528k f11500c;

    /* JADX INFO: renamed from: d */
    public final C3541x f11501d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C3535r.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3535r(C4322r c4322r) {
        this.f11498a = c4322r;
        this.f11499b = new C0100e0(c4322r);
        C3541x c3541x = c4322r.f14411l.f14371k.f14441g;
        this.f11501d = c3541x;
        this.f11500c = c3541x.f11519c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m7442a(Set set, LinkedHashSet linkedHashSet, AbstractC3506j abstractC3506j) {
        if (!abstractC3506j.mo7345w()) {
            return false;
        }
        C3541x c3541x = this.f11501d;
        c3541x.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC3521d interfaceC3521d = (InterfaceC3521d) it.next();
            AbstractC3506j type = interfaceC3521d.getType();
            if (type != null && !c3541x.m7455f(abstractC3506j, interfaceC3521d, type)) {
                return false;
            }
        }
        linkedHashSet.add(abstractC3506j);
        return linkedHashSet.size() > 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m7443b(Set set, LinkedHashSet linkedHashSet, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext() && !m7442a(set, linkedHashSet, (AbstractC3506j) it.next())) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractC3516a m7444c(C3514r c3514r) {
        C4320p c4320p = c3514r.f11420j;
        if (c4320p == null || c3514r.mo7382P()) {
            return null;
        }
        int iOrdinal = c4320p.f14396k.ordinal();
        if (iOrdinal != 6) {
            if (iOrdinal != 43) {
                return null;
            }
            return new C3534q(c4320p, c3514r);
        }
        AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
        abstractC3508lMo7179S.getClass();
        if (abstractC3508lMo7179S instanceof C3514r) {
            return new C3533p(this, c4320p, c3514r);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m7445d() {
        C4322r c4322r = this.f11498a;
        int size = c4322r.f14404D.size();
        List list = c4322r.f14404D;
        if (size > 5000) {
            c4322r.m6383L("Multi-variable search skipped. Vars limit reached: " + list.size() + " (expected less than 5000)");
            return false;
        }
        final int i9 = 0;
        list.forEach(new Consumer(this) { // from class: qe.o

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3535r f11496b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11496b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                List listSingletonList;
                List list2;
                switch (i9) {
                    case 0:
                        C3515s c3515s = (C3515s) obj;
                        C3535r c3535r = this.f11496b;
                        C4322r c4322r2 = c3535r.f11498a;
                        C3536s c3536sM547c = c3535r.f11499b.m547c(c3515s);
                        AbstractC3506j abstractC3506jM7400d = c3515s.m7400d();
                        C3315t c3315t = c3515s.f11447l;
                        if (abstractC3506jM7400d != null) {
                            c3536sM547c.f11504c = abstractC3506jM7400d;
                            c3536sM547c.f11503b = true;
                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                        } else {
                            AbstractC3506j abstractC3506j = (AbstractC3506j) c3315t.f10677h;
                            if (abstractC3506j.mo7345w()) {
                                c3536sM547c.f11504c = abstractC3506j;
                                c3536sM547c.f11503b = true;
                                c3536sM547c.f11505d = Collections.EMPTY_LIST;
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                LinkedHashSet<InterfaceC3521d> linkedHashSet3 = (LinkedHashSet) c3315t.f10678i;
                                for (InterfaceC3521d interfaceC3521d : linkedHashSet3) {
                                    if (interfaceC3521d.mo7424b() == 1) {
                                        linkedHashSet.add(interfaceC3521d.getType());
                                    } else {
                                        linkedHashSet2.add(interfaceC3521d.getType());
                                    }
                                }
                                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                c3535r.m7443b(linkedHashSet3, linkedHashSet4, linkedHashSet);
                                c3535r.m7443b(linkedHashSet3, linkedHashSet4, linkedHashSet2);
                                Iterator it = linkedHashSet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        for (AbstractC3506j abstractC3506j2 : linkedHashSet2) {
                                            if (!abstractC3506j2.mo7345w()) {
                                                ArrayList arrayList = new ArrayList();
                                                for (EnumC3513q enumC3513q : abstractC3506j2.mo7342n()) {
                                                    arrayList.add(AbstractC3506j.m7357d(enumC3513q));
                                                }
                                                listSingletonList = arrayList;
                                            } else if (abstractC3506j2.mo7351v()) {
                                                C3501e c3501e = AbstractC3506j.f11394k;
                                                if (abstractC3506j2.equals(c3501e)) {
                                                    listSingletonList = Collections.singletonList(c3501e);
                                                } else {
                                                    List list3 = (List) c4322r2.f14411l.f14371k.f14453s.f2836d.get(abstractC3506j2.mo7350l());
                                                    if (list3 == null) {
                                                        list3 = Collections.EMPTY_LIST;
                                                    }
                                                    listSingletonList = (List) list3.stream().map(new C2833a(14)).collect(Collectors.toList());
                                                }
                                            } else {
                                                listSingletonList = Collections.EMPTY_LIST;
                                            }
                                            c3535r.m7443b(linkedHashSet3, linkedHashSet4, listSingletonList);
                                        }
                                        Iterator it2 = c3515s.f11445j.iterator();
                                        while (it2.hasNext()) {
                                            C4320p c4320p = ((C3514r) it2.next()).f11420j;
                                            if (c4320p != null && c4320p.f14396k == EnumC3400k.f10956H) {
                                                AbstractC3506j abstractC3506jMo7375I = c4320p.mo7179S(2).mo7375I();
                                                if (abstractC3506jMo7375I.mo7345w()) {
                                                    c3535r.m7442a(linkedHashSet3, linkedHashSet4, new C3497a(abstractC3506jMo7375I));
                                                }
                                            }
                                        }
                                        int size2 = linkedHashSet4.size();
                                        if (size2 == 0) {
                                            c3536sM547c.f11503b = true;
                                            c3536sM547c.f11504c = AbstractC3506j.f11404u;
                                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                                        } else if (size2 == 1) {
                                            c3536sM547c.f11503b = true;
                                            c3536sM547c.f11504c = (AbstractC3506j) linkedHashSet4.iterator().next();
                                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                                        } else {
                                            c3536sM547c.f11503b = false;
                                            c3536sM547c.f11504c = AbstractC3506j.f11404u;
                                            ArrayList arrayList2 = new ArrayList(linkedHashSet4);
                                            arrayList2.sort(c3535r.f11500c.f11480c);
                                            c3536sM547c.f11505d = Collections.unmodifiableList(arrayList2);
                                        }
                                    } else {
                                        AbstractC3506j abstractC3506j3 = (AbstractC3506j) it.next();
                                        if (abstractC3506j3.mo7345w()) {
                                            list2 = abstractC3506j3.mo7351v() ? (List) c4322r2.f14411l.f14371k.f14453s.m2215d(abstractC3506j3.mo7350l()).stream().map(new C2833a(14)).collect(Collectors.toList()) : Collections.EMPTY_LIST;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (EnumC3513q enumC3513q2 : abstractC3506j3.mo7342n()) {
                                                arrayList3.add(AbstractC3506j.m7357d(enumC3513q2));
                                            }
                                            list2 = arrayList3;
                                        }
                                        c3535r.m7443b(linkedHashSet3, linkedHashSet4, list2);
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        C3515s c3515s2 = (C3515s) obj;
                        C3535r c3535r2 = this.f11496b;
                        C3536s c3536sM547c2 = c3535r2.f11499b.m547c(c3515s2);
                        if (c3536sM547c2.f11503b) {
                            c3536sM547c2.f11507f = Collections.EMPTY_LIST;
                        } else {
                            c3536sM547c2.f11507f = new ArrayList();
                            AbstractC3516a abstractC3516aM7444c = c3535r2.m7444c(c3515s2.f11444i);
                            if (abstractC3516aM7444c != null) {
                                c3536sM547c2.f11507f.add(abstractC3516aM7444c);
                            }
                            Iterator it3 = c3515s2.f11445j.iterator();
                            while (it3.hasNext()) {
                                AbstractC3516a abstractC3516aM7444c2 = c3535r2.m7444c((C3514r) it3.next());
                                if (abstractC3516aM7444c2 != null) {
                                    c3536sM547c2.f11507f.add(abstractC3516aM7444c2);
                                }
                            }
                        }
                        break;
                    default:
                        C3536s c3536s = (C3536s) obj;
                        Stream streamFlatMap = c3536s.f11507f.stream().flatMap(new C2833a(11));
                        C3535r c3535r3 = this.f11496b;
                        if (streamFlatMap.allMatch(new C0285i(c3535r3, 25))) {
                            if (!c3536s.f11503b) {
                                c3536s.f11506e = 0;
                                c3536s.f11504c = (AbstractC3506j) c3536s.f11505d.get(0);
                            }
                            while (!c3535r3.m7446e(c3536s)) {
                                if (c3536s.m7447a()) {
                                    break;
                                }
                            }
                            c3536s.f11503b = true;
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        c4322r.f14404D.forEach(new Consumer(this) { // from class: qe.o

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3535r f11496b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11496b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                List listSingletonList;
                List list2;
                switch (i10) {
                    case 0:
                        C3515s c3515s = (C3515s) obj;
                        C3535r c3535r = this.f11496b;
                        C4322r c4322r2 = c3535r.f11498a;
                        C3536s c3536sM547c = c3535r.f11499b.m547c(c3515s);
                        AbstractC3506j abstractC3506jM7400d = c3515s.m7400d();
                        C3315t c3315t = c3515s.f11447l;
                        if (abstractC3506jM7400d != null) {
                            c3536sM547c.f11504c = abstractC3506jM7400d;
                            c3536sM547c.f11503b = true;
                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                        } else {
                            AbstractC3506j abstractC3506j = (AbstractC3506j) c3315t.f10677h;
                            if (abstractC3506j.mo7345w()) {
                                c3536sM547c.f11504c = abstractC3506j;
                                c3536sM547c.f11503b = true;
                                c3536sM547c.f11505d = Collections.EMPTY_LIST;
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                LinkedHashSet<InterfaceC3521d> linkedHashSet3 = (LinkedHashSet) c3315t.f10678i;
                                for (InterfaceC3521d interfaceC3521d : linkedHashSet3) {
                                    if (interfaceC3521d.mo7424b() == 1) {
                                        linkedHashSet.add(interfaceC3521d.getType());
                                    } else {
                                        linkedHashSet2.add(interfaceC3521d.getType());
                                    }
                                }
                                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                c3535r.m7443b(linkedHashSet3, linkedHashSet4, linkedHashSet);
                                c3535r.m7443b(linkedHashSet3, linkedHashSet4, linkedHashSet2);
                                Iterator it = linkedHashSet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        for (AbstractC3506j abstractC3506j2 : linkedHashSet2) {
                                            if (!abstractC3506j2.mo7345w()) {
                                                ArrayList arrayList = new ArrayList();
                                                for (EnumC3513q enumC3513q : abstractC3506j2.mo7342n()) {
                                                    arrayList.add(AbstractC3506j.m7357d(enumC3513q));
                                                }
                                                listSingletonList = arrayList;
                                            } else if (abstractC3506j2.mo7351v()) {
                                                C3501e c3501e = AbstractC3506j.f11394k;
                                                if (abstractC3506j2.equals(c3501e)) {
                                                    listSingletonList = Collections.singletonList(c3501e);
                                                } else {
                                                    List list3 = (List) c4322r2.f14411l.f14371k.f14453s.f2836d.get(abstractC3506j2.mo7350l());
                                                    if (list3 == null) {
                                                        list3 = Collections.EMPTY_LIST;
                                                    }
                                                    listSingletonList = (List) list3.stream().map(new C2833a(14)).collect(Collectors.toList());
                                                }
                                            } else {
                                                listSingletonList = Collections.EMPTY_LIST;
                                            }
                                            c3535r.m7443b(linkedHashSet3, linkedHashSet4, listSingletonList);
                                        }
                                        Iterator it2 = c3515s.f11445j.iterator();
                                        while (it2.hasNext()) {
                                            C4320p c4320p = ((C3514r) it2.next()).f11420j;
                                            if (c4320p != null && c4320p.f14396k == EnumC3400k.f10956H) {
                                                AbstractC3506j abstractC3506jMo7375I = c4320p.mo7179S(2).mo7375I();
                                                if (abstractC3506jMo7375I.mo7345w()) {
                                                    c3535r.m7442a(linkedHashSet3, linkedHashSet4, new C3497a(abstractC3506jMo7375I));
                                                }
                                            }
                                        }
                                        int size2 = linkedHashSet4.size();
                                        if (size2 == 0) {
                                            c3536sM547c.f11503b = true;
                                            c3536sM547c.f11504c = AbstractC3506j.f11404u;
                                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                                        } else if (size2 == 1) {
                                            c3536sM547c.f11503b = true;
                                            c3536sM547c.f11504c = (AbstractC3506j) linkedHashSet4.iterator().next();
                                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                                        } else {
                                            c3536sM547c.f11503b = false;
                                            c3536sM547c.f11504c = AbstractC3506j.f11404u;
                                            ArrayList arrayList2 = new ArrayList(linkedHashSet4);
                                            arrayList2.sort(c3535r.f11500c.f11480c);
                                            c3536sM547c.f11505d = Collections.unmodifiableList(arrayList2);
                                        }
                                    } else {
                                        AbstractC3506j abstractC3506j3 = (AbstractC3506j) it.next();
                                        if (abstractC3506j3.mo7345w()) {
                                            list2 = abstractC3506j3.mo7351v() ? (List) c4322r2.f14411l.f14371k.f14453s.m2215d(abstractC3506j3.mo7350l()).stream().map(new C2833a(14)).collect(Collectors.toList()) : Collections.EMPTY_LIST;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (EnumC3513q enumC3513q2 : abstractC3506j3.mo7342n()) {
                                                arrayList3.add(AbstractC3506j.m7357d(enumC3513q2));
                                            }
                                            list2 = arrayList3;
                                        }
                                        c3535r.m7443b(linkedHashSet3, linkedHashSet4, list2);
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        C3515s c3515s2 = (C3515s) obj;
                        C3535r c3535r2 = this.f11496b;
                        C3536s c3536sM547c2 = c3535r2.f11499b.m547c(c3515s2);
                        if (c3536sM547c2.f11503b) {
                            c3536sM547c2.f11507f = Collections.EMPTY_LIST;
                        } else {
                            c3536sM547c2.f11507f = new ArrayList();
                            AbstractC3516a abstractC3516aM7444c = c3535r2.m7444c(c3515s2.f11444i);
                            if (abstractC3516aM7444c != null) {
                                c3536sM547c2.f11507f.add(abstractC3516aM7444c);
                            }
                            Iterator it3 = c3515s2.f11445j.iterator();
                            while (it3.hasNext()) {
                                AbstractC3516a abstractC3516aM7444c2 = c3535r2.m7444c((C3514r) it3.next());
                                if (abstractC3516aM7444c2 != null) {
                                    c3536sM547c2.f11507f.add(abstractC3516aM7444c2);
                                }
                            }
                        }
                        break;
                    default:
                        C3536s c3536s = (C3536s) obj;
                        Stream streamFlatMap = c3536s.f11507f.stream().flatMap(new C2833a(11));
                        C3535r c3535r3 = this.f11496b;
                        if (streamFlatMap.allMatch(new C0285i(c3535r3, 25))) {
                            if (!c3536s.f11503b) {
                                c3536s.f11506e = 0;
                                c3536s.f11504c = (AbstractC3506j) c3536s.f11505d.get(0);
                            }
                            while (!c3535r3.m7446e(c3536s)) {
                                if (c3536s.m7447a()) {
                                    break;
                                }
                            }
                            c3536s.f11503b = true;
                            break;
                        }
                        break;
                }
            }
        });
        C0100e0 c0100e0 = this.f11499b;
        LinkedHashMap linkedHashMap = c0100e0.f284a;
        LinkedHashMap linkedHashMap2 = c0100e0.f284a;
        final int i11 = 2;
        ((List) linkedHashMap.values().stream().filter(new C0561n(23)).collect(Collectors.toList())).forEach(new Consumer(this) { // from class: qe.o

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3535r f11496b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11496b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                List listSingletonList;
                List list2;
                switch (i11) {
                    case 0:
                        C3515s c3515s = (C3515s) obj;
                        C3535r c3535r = this.f11496b;
                        C4322r c4322r2 = c3535r.f11498a;
                        C3536s c3536sM547c = c3535r.f11499b.m547c(c3515s);
                        AbstractC3506j abstractC3506jM7400d = c3515s.m7400d();
                        C3315t c3315t = c3515s.f11447l;
                        if (abstractC3506jM7400d != null) {
                            c3536sM547c.f11504c = abstractC3506jM7400d;
                            c3536sM547c.f11503b = true;
                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                        } else {
                            AbstractC3506j abstractC3506j = (AbstractC3506j) c3315t.f10677h;
                            if (abstractC3506j.mo7345w()) {
                                c3536sM547c.f11504c = abstractC3506j;
                                c3536sM547c.f11503b = true;
                                c3536sM547c.f11505d = Collections.EMPTY_LIST;
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                LinkedHashSet<AbstractC3506j> linkedHashSet2 = new LinkedHashSet();
                                LinkedHashSet<InterfaceC3521d> linkedHashSet3 = (LinkedHashSet) c3315t.f10678i;
                                for (InterfaceC3521d interfaceC3521d : linkedHashSet3) {
                                    if (interfaceC3521d.mo7424b() == 1) {
                                        linkedHashSet.add(interfaceC3521d.getType());
                                    } else {
                                        linkedHashSet2.add(interfaceC3521d.getType());
                                    }
                                }
                                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                c3535r.m7443b(linkedHashSet3, linkedHashSet4, linkedHashSet);
                                c3535r.m7443b(linkedHashSet3, linkedHashSet4, linkedHashSet2);
                                Iterator it = linkedHashSet.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        for (AbstractC3506j abstractC3506j2 : linkedHashSet2) {
                                            if (!abstractC3506j2.mo7345w()) {
                                                ArrayList arrayList = new ArrayList();
                                                for (EnumC3513q enumC3513q : abstractC3506j2.mo7342n()) {
                                                    arrayList.add(AbstractC3506j.m7357d(enumC3513q));
                                                }
                                                listSingletonList = arrayList;
                                            } else if (abstractC3506j2.mo7351v()) {
                                                C3501e c3501e = AbstractC3506j.f11394k;
                                                if (abstractC3506j2.equals(c3501e)) {
                                                    listSingletonList = Collections.singletonList(c3501e);
                                                } else {
                                                    List list3 = (List) c4322r2.f14411l.f14371k.f14453s.f2836d.get(abstractC3506j2.mo7350l());
                                                    if (list3 == null) {
                                                        list3 = Collections.EMPTY_LIST;
                                                    }
                                                    listSingletonList = (List) list3.stream().map(new C2833a(14)).collect(Collectors.toList());
                                                }
                                            } else {
                                                listSingletonList = Collections.EMPTY_LIST;
                                            }
                                            c3535r.m7443b(linkedHashSet3, linkedHashSet4, listSingletonList);
                                        }
                                        Iterator it2 = c3515s.f11445j.iterator();
                                        while (it2.hasNext()) {
                                            C4320p c4320p = ((C3514r) it2.next()).f11420j;
                                            if (c4320p != null && c4320p.f14396k == EnumC3400k.f10956H) {
                                                AbstractC3506j abstractC3506jMo7375I = c4320p.mo7179S(2).mo7375I();
                                                if (abstractC3506jMo7375I.mo7345w()) {
                                                    c3535r.m7442a(linkedHashSet3, linkedHashSet4, new C3497a(abstractC3506jMo7375I));
                                                }
                                            }
                                        }
                                        int size2 = linkedHashSet4.size();
                                        if (size2 == 0) {
                                            c3536sM547c.f11503b = true;
                                            c3536sM547c.f11504c = AbstractC3506j.f11404u;
                                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                                        } else if (size2 == 1) {
                                            c3536sM547c.f11503b = true;
                                            c3536sM547c.f11504c = (AbstractC3506j) linkedHashSet4.iterator().next();
                                            c3536sM547c.f11505d = Collections.EMPTY_LIST;
                                        } else {
                                            c3536sM547c.f11503b = false;
                                            c3536sM547c.f11504c = AbstractC3506j.f11404u;
                                            ArrayList arrayList2 = new ArrayList(linkedHashSet4);
                                            arrayList2.sort(c3535r.f11500c.f11480c);
                                            c3536sM547c.f11505d = Collections.unmodifiableList(arrayList2);
                                        }
                                    } else {
                                        AbstractC3506j abstractC3506j3 = (AbstractC3506j) it.next();
                                        if (abstractC3506j3.mo7345w()) {
                                            list2 = abstractC3506j3.mo7351v() ? (List) c4322r2.f14411l.f14371k.f14453s.m2215d(abstractC3506j3.mo7350l()).stream().map(new C2833a(14)).collect(Collectors.toList()) : Collections.EMPTY_LIST;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (EnumC3513q enumC3513q2 : abstractC3506j3.mo7342n()) {
                                                arrayList3.add(AbstractC3506j.m7357d(enumC3513q2));
                                            }
                                            list2 = arrayList3;
                                        }
                                        c3535r.m7443b(linkedHashSet3, linkedHashSet4, list2);
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        C3515s c3515s2 = (C3515s) obj;
                        C3535r c3535r2 = this.f11496b;
                        C3536s c3536sM547c2 = c3535r2.f11499b.m547c(c3515s2);
                        if (c3536sM547c2.f11503b) {
                            c3536sM547c2.f11507f = Collections.EMPTY_LIST;
                        } else {
                            c3536sM547c2.f11507f = new ArrayList();
                            AbstractC3516a abstractC3516aM7444c = c3535r2.m7444c(c3515s2.f11444i);
                            if (abstractC3516aM7444c != null) {
                                c3536sM547c2.f11507f.add(abstractC3516aM7444c);
                            }
                            Iterator it3 = c3515s2.f11445j.iterator();
                            while (it3.hasNext()) {
                                AbstractC3516a abstractC3516aM7444c2 = c3535r2.m7444c((C3514r) it3.next());
                                if (abstractC3516aM7444c2 != null) {
                                    c3536sM547c2.f11507f.add(abstractC3516aM7444c2);
                                }
                            }
                        }
                        break;
                    default:
                        C3536s c3536s = (C3536s) obj;
                        Stream streamFlatMap = c3536s.f11507f.stream().flatMap(new C2833a(11));
                        C3535r c3535r3 = this.f11496b;
                        if (streamFlatMap.allMatch(new C0285i(c3535r3, 25))) {
                            if (!c3536s.f11503b) {
                                c3536s.f11506e = 0;
                                c3536s.f11504c = (AbstractC3506j) c3536s.f11505d.get(0);
                            }
                            while (!c3535r3.m7446e(c3536s)) {
                                if (c3536s.m7447a()) {
                                    break;
                                }
                            }
                            c3536s.f11503b = true;
                            break;
                        }
                        break;
                }
            }
        });
        List<C3536s> list2 = (List) linkedHashMap2.values().stream().filter(new C0561n(23)).collect(Collectors.toList());
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (C3536s c3536s : list2) {
                if (!c3536s.f11503b) {
                    c3536s.f11506e = 0;
                    c3536s.f11504c = (AbstractC3506j) c3536s.f11505d.get(0);
                }
            }
            int i12 = 0;
            loop1: do {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!m7446e((C3536s) it.next())) {
                        if (!((C3536s) list2.get(0)).m7447a()) {
                            i12++;
                        } else {
                            if (1 >= size2) {
                                break;
                            }
                            C3536s c3536s2 = (C3536s) list2.get(1);
                            int i13 = 1;
                            while (c3536s2.m7447a()) {
                                i13++;
                                if (i13 >= size2) {
                                    break loop1;
                                }
                                c3536s2 = (C3536s) list2.get(i13);
                            }
                            i12++;
                        }
                    }
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((C3536s) it2.next()).f11503b = true;
                }
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (!m7446e((C3536s) it3.next())) {
                        return false;
                    }
                }
            } while (i12 <= 1000000);
            return false;
        }
        List<C3536s> list3 = (List) linkedHashMap2.values().stream().filter(new C0561n(24)).collect(Collectors.toList());
        ArrayList<C3536s> arrayList = new ArrayList();
        for (C3536s c3536s3 : list3) {
            C3515s c3515s = c3536s3.f11502a;
            AbstractC3506j abstractC3506j = c3536s3.f11504c;
            if (abstractC3506j.mo7345w() && !abstractC3506j.equals((AbstractC3506j) c3515s.f11447l.f10677h)) {
                c3515s.m7409n(abstractC3506j);
                arrayList.add(c3536s3);
            }
        }
        boolean z9 = true;
        for (C3536s c3536s4 : arrayList) {
            C3515s c3515s2 = c3536s4.f11502a;
            AbstractC3506j abstractC3506j2 = c3536s4.f11504c;
            C3541x c3541x = this.f11501d;
            c3541x.getClass();
            if (c3541x.m7453c(c4322r, c3515s2, abstractC3506j2, C3517a0.f11453d) == 1) {
                c4322r.m6380I("Multi-variable search result rejected for ".concat(String.valueOf(c3536s4)));
                z9 = false;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m7446e(C3536s c3536s) {
        if (c3536s.f11503b) {
            return true;
        }
        Iterator it = c3536s.f11507f.iterator();
        while (it.hasNext()) {
            if (!((AbstractC3516a) it.next()).mo7413a(this.f11499b)) {
                return false;
            }
        }
        return true;
    }
}
