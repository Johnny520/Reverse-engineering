package p000a;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000a.C0240N3;
import p000a.C0548e2;

/* JADX INFO: renamed from: a.U4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0366U4 {

    /* JADX INFO: renamed from: a */
    public C0258O3 f1368a;

    /* JADX INFO: renamed from: b */
    public boolean f1369b;

    /* JADX INFO: renamed from: c */
    public boolean f1370c;

    /* JADX INFO: renamed from: d */
    public C0258O3 f1371d;

    /* JADX INFO: renamed from: e */
    public ArrayList<AbstractC0639ih> f1372e;

    /* JADX INFO: renamed from: f */
    public C0548e2.b f1373f;

    /* JADX INFO: renamed from: g */
    public C0548e2.a f1374g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C0070Dd> f1375h;

    /* JADX INFO: renamed from: a */
    public final void m981a(C0384V4 c0384v4, int i, ArrayList arrayList, C0070Dd c0070Dd) {
        AbstractC0639ih abstractC0639ih = c0384v4.f1446d;
        if (abstractC0639ih.f2344c == null) {
            C0258O3 c0258o3 = this.f1368a;
            if (abstractC0639ih == c0258o3.f815d || abstractC0639ih == c0258o3.f817e) {
                return;
            }
            if (c0070Dd == null) {
                c0070Dd = new C0070Dd();
                c0070Dd.f239a = null;
                c0070Dd.f240b = new ArrayList<>();
                c0070Dd.f239a = abstractC0639ih;
                arrayList.add(c0070Dd);
            }
            abstractC0639ih.f2344c = c0070Dd;
            c0070Dd.f240b.add(abstractC0639ih);
            C0384V4 c0384v42 = abstractC0639ih.f2349h;
            for (InterfaceC0348T4 interfaceC0348T4 : c0384v42.f1453k) {
                if (interfaceC0348T4 instanceof C0384V4) {
                    m981a((C0384V4) interfaceC0348T4, i, arrayList, c0070Dd);
                }
            }
            C0384V4 c0384v43 = abstractC0639ih.f2350i;
            for (InterfaceC0348T4 interfaceC0348T42 : c0384v43.f1453k) {
                if (interfaceC0348T42 instanceof C0384V4) {
                    m981a((C0384V4) interfaceC0348T42, i, arrayList, c0070Dd);
                }
            }
            if (i == 1 && (abstractC0639ih instanceof C0752og)) {
                for (InterfaceC0348T4 interfaceC0348T43 : ((C0752og) abstractC0639ih).f2962k.f1453k) {
                    if (interfaceC0348T43 instanceof C0384V4) {
                        m981a((C0384V4) interfaceC0348T43, i, arrayList, c0070Dd);
                    }
                }
            }
            Iterator it = c0384v42.f1454l.iterator();
            while (it.hasNext()) {
                m981a((C0384V4) it.next(), i, arrayList, c0070Dd);
            }
            Iterator it2 = c0384v43.f1454l.iterator();
            while (it2.hasNext()) {
                m981a((C0384V4) it2.next(), i, arrayList, c0070Dd);
            }
            if (i == 1 && (abstractC0639ih instanceof C0752og)) {
                Iterator it3 = ((C0752og) abstractC0639ih).f2962k.f1454l.iterator();
                while (it3.hasNext()) {
                    m981a((C0384V4) it3.next(), i, arrayList, c0070Dd);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m982b(C0258O3 c0258o3) {
        C0240N3.a aVar;
        C0240N3.a aVar2;
        C0752og c0752og;
        float f;
        float f2;
        C0240N3.a aVar3;
        C0240N3.a aVar4;
        C0240N3.a aVar5;
        C0240N3.a aVar6;
        C0240N3.a aVar7;
        C0752og c0752og2;
        Iterator<C0240N3> it = c0258o3.f2295e0.iterator();
        while (it.hasNext()) {
            C0240N3 next = it.next();
            C0240N3.a[] aVarArr = next.f792J;
            C0240N3.a aVar8 = aVarArr[0];
            C0240N3.a aVar9 = aVarArr[1];
            if (next.f806X == 8) {
                next.f809a = true;
            } else {
                float f3 = next.f827o;
                C0240N3.a aVar10 = C0240N3.a.f841c;
                if (f3 < 1.0f && aVar8 == aVar10) {
                    next.f822j = 2;
                }
                float f4 = next.f830r;
                if (f4 < 1.0f && aVar9 == aVar10) {
                    next.f823k = 2;
                }
                float f5 = next.f796N;
                C0240N3.a aVar11 = C0240N3.a.f840b;
                C0240N3.a aVar12 = C0240N3.a.f839a;
                if (f5 > 0.0f) {
                    if (aVar8 == aVar10 && (aVar9 == aVar11 || aVar9 == aVar12)) {
                        next.f822j = 3;
                    } else if (aVar9 == aVar10 && (aVar8 == aVar11 || aVar8 == aVar12)) {
                        next.f823k = 3;
                    } else if (aVar8 == aVar10 && aVar9 == aVar10) {
                        if (next.f822j == 0) {
                            next.f822j = 3;
                        }
                        if (next.f823k == 0) {
                            next.f823k = 3;
                        }
                    }
                }
                C0222M3 c0222m3 = next.f783A;
                C0222M3 c0222m32 = next.f837y;
                if (aVar8 == aVar10 && next.f822j == 1 && (c0222m32.f747d == null || c0222m3.f747d == null)) {
                    aVar8 = aVar11;
                }
                C0222M3 c0222m33 = next.f784B;
                C0222M3 c0222m34 = next.f838z;
                if (aVar9 == aVar10 && next.f823k == 1 && (c0222m34.f747d == null || c0222m33.f747d == null)) {
                    aVar9 = aVar11;
                }
                C0191K8 c0191k8 = next.f815d;
                c0191k8.f2345d = aVar8;
                int i = next.f822j;
                c0191k8.f2342a = i;
                C0752og c0752og3 = next.f817e;
                c0752og3.f2345d = aVar9;
                Iterator<C0240N3> it2 = it;
                int i2 = next.f823k;
                c0752og3.f2342a = i2;
                C0240N3.a aVar13 = C0240N3.a.f842d;
                if ((aVar8 == aVar13 || aVar8 == aVar12 || aVar8 == aVar11) && (aVar9 == aVar13 || aVar9 == aVar12 || aVar9 == aVar11)) {
                    C0240N3.a aVar14 = aVar9;
                    int iM648l = next.m648l();
                    if (aVar8 == aVar13) {
                        iM648l = (c0258o3.m648l() - c0222m32.f748e) - c0222m3.f748e;
                        aVar8 = aVar12;
                    }
                    int iM645i = next.m645i();
                    if (aVar14 == aVar13) {
                        iM645i = (c0258o3.m645i() - c0222m34.f748e) - c0222m33.f748e;
                        aVar14 = aVar12;
                    }
                    m986f(next, aVar8, iM648l, aVar14, iM645i);
                    c0191k8.f2346e.mo1014d(next.m648l());
                    c0752og3.f2346e.mo1014d(next.m645i());
                    next.f809a = true;
                } else {
                    C0240N3.a[] aVarArr2 = c0258o3.f792J;
                    C0222M3[] c0222m3Arr = next.f789G;
                    if (aVar8 != aVar10 || (aVar9 != aVar11 && aVar9 != aVar12)) {
                        aVar = aVar8;
                        aVar2 = aVar11;
                        c0752og = c0752og3;
                        f = 0.5f;
                        f2 = f4;
                        aVar3 = aVar9;
                    } else if (i == 3) {
                        if (aVar9 == aVar11) {
                            c0752og2 = c0752og3;
                            m986f(next, aVar11, 0, aVar11, 0);
                        } else {
                            c0752og2 = c0752og3;
                        }
                        int iM645i2 = next.m645i();
                        m986f(next, aVar12, (int) ((iM645i2 * next.f796N) + 0.5f), aVar12, iM645i2);
                        c0191k8.f2346e.mo1014d(next.m648l());
                        c0752og2.f2346e.mo1014d(next.m645i());
                        next.f809a = true;
                    } else {
                        aVar = aVar8;
                        aVar2 = aVar11;
                        c0752og = c0752og3;
                        f = 0.5f;
                        if (i == 1) {
                            m986f(next, aVar2, 0, aVar9, 0);
                            c0191k8.f2346e.f2547m = next.m648l();
                        } else {
                            f2 = f4;
                            aVar3 = aVar9;
                            if (i == 2) {
                                C0240N3.a aVar15 = aVarArr2[0];
                                if (aVar15 == aVar12 || aVar15 == aVar13) {
                                    m986f(next, aVar12, (int) ((f3 * c0258o3.m648l()) + 0.5f), aVar3, next.m645i());
                                    c0191k8.f2346e.mo1014d(next.m648l());
                                    c0752og.f2346e.mo1014d(next.m645i());
                                    next.f809a = true;
                                }
                            } else if (c0222m3Arr[0].f747d == null || c0222m3Arr[1].f747d == null) {
                                m986f(next, aVar2, 0, aVar3, 0);
                                c0191k8.f2346e.mo1014d(next.m648l());
                                c0752og.f2346e.mo1014d(next.m645i());
                                next.f809a = true;
                            }
                        }
                    }
                    if (aVar3 != aVar10 || (aVar != aVar2 && aVar != aVar12)) {
                        C0240N3.a aVar16 = aVar;
                        aVar4 = aVar2;
                        aVar5 = aVar16;
                    } else if (i2 == 3) {
                        if (aVar == aVar2) {
                            m986f(next, aVar2, 0, aVar2, 0);
                        }
                        int iM648l2 = next.m648l();
                        float f6 = next.f796N;
                        if (next.f797O == -1) {
                            f6 = 1.0f / f6;
                        }
                        m986f(next, aVar12, iM648l2, aVar12, (int) ((iM648l2 * f6) + f));
                        c0191k8.f2346e.mo1014d(next.m648l());
                        c0752og.f2346e.mo1014d(next.m645i());
                        next.f809a = true;
                    } else if (i2 == 1) {
                        m986f(next, aVar, 0, aVar2, 0);
                        c0752og.f2346e.f2547m = next.m645i();
                    } else {
                        C0240N3.a aVar17 = aVar;
                        aVar4 = aVar2;
                        if (i2 == 2) {
                            C0240N3.a aVar18 = aVarArr2[1];
                            if (aVar18 == aVar12 || aVar18 == aVar13) {
                                m986f(next, aVar17, next.m648l(), aVar12, (int) ((f2 * c0258o3.m645i()) + f));
                                c0191k8.f2346e.mo1014d(next.m648l());
                                c0752og.f2346e.mo1014d(next.m645i());
                                next.f809a = true;
                            } else {
                                aVar5 = aVar17;
                            }
                        } else {
                            aVar5 = aVar17;
                            if (c0222m3Arr[2].f747d == null || c0222m3Arr[3].f747d == null) {
                                m986f(next, aVar4, 0, aVar3, 0);
                                c0191k8.f2346e.mo1014d(next.m648l());
                                c0752og.f2346e.mo1014d(next.m645i());
                                next.f809a = true;
                            }
                        }
                    }
                    if (aVar5 == aVar10 && aVar3 == aVar10) {
                        if (i == 1 || i2 == 1) {
                            m986f(next, aVar4, 0, aVar4, 0);
                            c0191k8.f2346e.f2547m = next.m648l();
                            c0752og.f2346e.f2547m = next.m645i();
                        } else if (i2 == 2 && i == 2 && (((aVar6 = aVarArr2[0]) == aVar12 || aVar6 == aVar12) && ((aVar7 = aVarArr2[1]) == aVar12 || aVar7 == aVar12))) {
                            m986f(next, aVar12, (int) ((f3 * c0258o3.m648l()) + f), aVar12, (int) ((f2 * c0258o3.m645i()) + f));
                            c0191k8.f2346e.mo1014d(next.m648l());
                            c0752og.f2346e.mo1014d(next.m645i());
                            next.f809a = true;
                        }
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m983c() {
        ArrayList<AbstractC0639ih> arrayList = this.f1372e;
        arrayList.clear();
        C0258O3 c0258o3 = this.f1371d;
        c0258o3.f815d.mo524f();
        C0752og c0752og = c0258o3.f817e;
        c0752og.mo524f();
        arrayList.add(c0258o3.f815d);
        arrayList.add(c0752og);
        HashSet hashSet = null;
        for (C0240N3 c0240n3 : c0258o3.f2295e0) {
            if (c0240n3 instanceof C0478a8) {
                C0497b8 c0497b8 = new C0497b8(c0240n3);
                c0240n3.f815d.mo524f();
                c0240n3.f817e.mo524f();
                c0497b8.f2347f = ((C0478a8) c0240n3).f1796i0;
                arrayList.add(c0497b8);
            } else {
                if (c0240n3.m653q()) {
                    if (c0240n3.f811b == null) {
                        c0240n3.f811b = new C0364U2(c0240n3, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0240n3.f811b);
                } else {
                    arrayList.add(c0240n3.f815d);
                }
                if (c0240n3.m654r()) {
                    if (c0240n3.f813c == null) {
                        c0240n3.f813c = new C0364U2(c0240n3, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0240n3.f813c);
                } else {
                    arrayList.add(c0240n3.f817e);
                }
                if (c0240n3 instanceof C0573f8) {
                    arrayList.add(new C0554e8(c0240n3));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC0639ih> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo524f();
        }
        for (AbstractC0639ih abstractC0639ih : arrayList) {
            if (abstractC0639ih.f2343b != c0258o3) {
                abstractC0639ih.mo522d();
            }
        }
        ArrayList<C0070Dd> arrayList2 = this.f1375h;
        arrayList2.clear();
        C0258O3 c0258o32 = this.f1368a;
        m985e(c0258o32.f815d, 0, arrayList2);
        m985e(c0258o32.f817e, 1, arrayList2);
        this.f1369b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m984d(C0258O3 c0258o3, int i) {
        ArrayList<C0070Dd> arrayList;
        int i2;
        int i3;
        long jMax;
        float f;
        C0258O3 c0258o32 = c0258o3;
        ArrayList<C0070Dd> arrayList2 = this.f1375h;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax2 = 0;
        while (i4 < size) {
            AbstractC0639ih abstractC0639ih = arrayList2.get(i4).f239a;
            if (!(abstractC0639ih instanceof C0364U2) ? !(i != 0 ? (abstractC0639ih instanceof C0752og) : (abstractC0639ih instanceof C0191K8)) : ((C0364U2) abstractC0639ih).f2347f != i) {
                C0384V4 c0384v4 = (i == 0 ? c0258o32.f815d : c0258o32.f817e).f2349h;
                C0384V4 c0384v42 = (i == 0 ? c0258o32.f815d : c0258o32.f817e).f2350i;
                boolean zContains = abstractC0639ih.f2349h.f1454l.contains(c0384v4);
                C0384V4 c0384v43 = abstractC0639ih.f2350i;
                boolean zContains2 = c0384v43.f1454l.contains(c0384v42);
                long jMo978j = abstractC0639ih.mo978j();
                C0384V4 c0384v44 = abstractC0639ih.f2349h;
                if (zContains && zContains2) {
                    long jM172b = C0070Dd.m172b(c0384v44, 0L);
                    ArrayList<C0070Dd> arrayList3 = arrayList2;
                    i2 = size;
                    long jM171a = C0070Dd.m171a(c0384v43, 0L);
                    long j = jM172b - jMo978j;
                    int i5 = c0384v43.f1448f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j >= (-i5)) {
                        j += (long) i5;
                    }
                    long j2 = (-jM171a) - jMo978j;
                    long j3 = c0384v44.f1448f;
                    long j4 = j2 - j3;
                    if (j4 >= j3) {
                        j4 -= j3;
                    }
                    C0240N3 c0240n3 = abstractC0639ih.f2343b;
                    if (i == 0) {
                        f = c0240n3.f803U;
                    } else if (i == 1) {
                        f = c0240n3.f804V;
                    } else {
                        c0240n3.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j / (1.0f - f)) + (j4 / f)) : 0L;
                    jMax = (((long) c0384v44.f1448f) + ((((long) ((f2 * f) + 0.5f)) + jMo978j) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c0384v43.f1448f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    jMax = zContains ? Math.max(C0070Dd.m172b(c0384v44, c0384v44.f1448f), ((long) c0384v44.f1448f) + jMo978j) : zContains2 ? Math.max(-C0070Dd.m171a(c0384v43, c0384v43.f1448f), ((long) (-c0384v43.f1448f)) + jMo978j) : (abstractC0639ih.mo978j() + ((long) c0384v44.f1448f)) - ((long) c0384v43.f1448f);
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i4 = i3 + 1;
            c0258o32 = c0258o3;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: e */
    public final void m985e(AbstractC0639ih abstractC0639ih, int i, ArrayList<C0070Dd> arrayList) {
        C0384V4 c0384v4;
        Iterator it = abstractC0639ih.f2349h.f1453k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0384v4 = abstractC0639ih.f2350i;
            if (!zHasNext) {
                break;
            }
            InterfaceC0348T4 interfaceC0348T4 = (InterfaceC0348T4) it.next();
            if (interfaceC0348T4 instanceof C0384V4) {
                m981a((C0384V4) interfaceC0348T4, i, arrayList, null);
            } else if (interfaceC0348T4 instanceof AbstractC0639ih) {
                m981a(((AbstractC0639ih) interfaceC0348T4).f2349h, i, arrayList, null);
            }
        }
        for (InterfaceC0348T4 interfaceC0348T42 : c0384v4.f1453k) {
            if (interfaceC0348T42 instanceof C0384V4) {
                m981a((C0384V4) interfaceC0348T42, i, arrayList, null);
            } else if (interfaceC0348T42 instanceof AbstractC0639ih) {
                m981a(((AbstractC0639ih) interfaceC0348T42).f2350i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC0348T4 interfaceC0348T43 : ((C0752og) abstractC0639ih).f2962k.f1453k) {
                if (interfaceC0348T43 instanceof C0384V4) {
                    m981a((C0384V4) interfaceC0348T43, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m986f(C0240N3 c0240n3, C0240N3.a aVar, int i, C0240N3.a aVar2, int i2) {
        C0548e2.a aVar3 = this.f1374g;
        aVar3.f2025a = aVar;
        aVar3.f2026b = aVar2;
        aVar3.f2027c = i;
        aVar3.f2028d = i2;
        ((ConstraintLayout.C1045b) this.f1373f).m2414a(c0240n3, aVar3);
        c0240n3.m661y(aVar3.f2029e);
        c0240n3.m658v(aVar3.f2030f);
        c0240n3.f835w = aVar3.f2032h;
        int i3 = aVar3.f2031g;
        c0240n3.f800R = i3;
        c0240n3.f835w = i3 > 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m987g() {
        C0529d2 c0529d2;
        C0366U4 c0366u4 = this;
        for (C0240N3 c0240n3 : c0366u4.f1368a.f2295e0) {
            if (!c0240n3.f809a) {
                C0240N3.a[] aVarArr = c0240n3.f792J;
                boolean z = false;
                C0240N3.a aVar = aVarArr[0];
                C0240N3.a aVar2 = aVarArr[1];
                int i = c0240n3.f822j;
                int i2 = c0240n3.f823k;
                C0240N3.a aVar3 = C0240N3.a.f840b;
                C0240N3.a aVar4 = C0240N3.a.f841c;
                boolean z2 = aVar == aVar3 || (aVar == aVar4 && i == 1);
                if (aVar2 == aVar3 || (aVar2 == aVar4 && i2 == 1)) {
                    z = true;
                }
                C0191K8 c0191k8 = c0240n3.f815d;
                C0684l5 c0684l5 = c0191k8.f2346e;
                boolean z3 = c0684l5.f1452j;
                C0752og c0752og = c0240n3.f817e;
                C0684l5 c0684l52 = c0752og.f2346e;
                boolean z4 = c0684l52.f1452j;
                boolean z5 = z2;
                C0240N3.a aVar5 = C0240N3.a.f839a;
                if (z3 && z4) {
                    c0366u4.m986f(c0240n3, aVar5, c0684l5.f1449g, aVar5, c0684l52.f1449g);
                    c0240n3.f809a = true;
                } else if (z3 && z) {
                    m986f(c0240n3, aVar5, c0684l5.f1449g, aVar3, c0684l52.f1449g);
                    if (aVar2 == aVar4) {
                        c0752og.f2346e.f2547m = c0240n3.m645i();
                    } else {
                        c0752og.f2346e.mo1014d(c0240n3.m645i());
                        c0240n3.f809a = true;
                    }
                } else if (z4 && z5) {
                    m986f(c0240n3, aVar3, c0684l5.f1449g, aVar5, c0684l52.f1449g);
                    if (aVar == aVar4) {
                        c0191k8.f2346e.f2547m = c0240n3.m648l();
                    } else {
                        c0191k8.f2346e.mo1014d(c0240n3.m648l());
                        c0240n3.f809a = true;
                    }
                }
                if (c0240n3.f809a && (c0529d2 = c0752og.f2963l) != null) {
                    c0529d2.mo1014d(c0240n3.f800R);
                }
                c0366u4 = this;
            }
        }
    }
}
