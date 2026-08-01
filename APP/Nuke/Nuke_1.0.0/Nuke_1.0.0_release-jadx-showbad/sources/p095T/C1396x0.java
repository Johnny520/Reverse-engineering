package p095T;

import android.os.Trace;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p000A.C0059f;
import p000A.C0094w0;
import p014C1.C0240b;
import p037G2.C0496h;
import p056K2.C0891q;
import p061L2.AbstractC0972l;
import p099T3.C1427f;
import p105V.C1483e;
import p108V3.EnumC1546T;
import p108V3.EnumC1549b;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.C2068A;
import p158f0.C2070b;
import p158f0.C2094z;
import p186k.C2409F;
import p211o0.C2762u;
import p255w.C3375f;

/* JADX INFO: renamed from: T.x0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1396x0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4945d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4946e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f4947f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f4948g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4949h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4950i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f4951j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f4952k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4953l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f4954m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1396x0(C1400z0 c1400z0, C2409F c2409f, C2409F c2409f2, List list, List list2, C2409F c2409f3, List list3, C2409F c2409f4, Set set) {
        this.f4946e = c1400z0;
        this.f4947f = c2409f;
        this.f4948g = c2409f2;
        this.f4951j = list;
        this.f4952k = list2;
        this.f4949h = c2409f3;
        this.f4953l = list3;
        this.f4950i = c2409f4;
        this.f4954m = set;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0298 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1h(Object obj) {
        boolean zM2690z;
        AbstractC2074f c2068a;
        int i5;
        long j5;
        boolean z5;
        switch (this.f4945d) {
            case 0:
                C1400z0 c1400z0 = (C1400z0) this.f4946e;
                C2409F c2409f = (C2409F) this.f4947f;
                C2409F c2409f2 = (C2409F) this.f4948g;
                List list = (List) this.f4951j;
                List list2 = (List) this.f4952k;
                c2409f2 = (C2409F) this.f4949h;
                list = (List) this.f4953l;
                c2409f2 = (C2409F) this.f4950i;
                Set set = (Set) this.f4954m;
                long jLongValue = ((Long) obj).longValue();
                synchronized (c1400z0.f4997c) {
                    zM2690z = c1400z0.m2690z();
                }
                if (zM2690z) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((C0240b) c1400z0.f4995a.f2253f).m431h(new C0059f(jLongValue, 6));
                        synchronized (AbstractC2082n.f6972c) {
                            C2409F c2409f3 = AbstractC2082n.f6979j.f6933h;
                            if (c2409f3 != null) {
                                z5 = c2409f3.m4286h();
                            }
                        }
                        if (z5) {
                            AbstractC2082n.m3825a();
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    c1400z0.m2686K();
                    synchronized (c1400z0.f4997c) {
                        try {
                            C1483e c1483e = c1400z0.f5003i;
                            Object[] objArr = c1483e.f5181d;
                            int i6 = c1483e.f5183f;
                            for (int i7 = 0; i7 < i6; i7++) {
                                list.add((C1397y) objArr[i7]);
                            }
                            c1400z0.f5003i.m2758g();
                        } finally {
                        }
                    }
                    c2409f.m4280b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
                            if (abstractC2074fM3834j instanceof C2070b) {
                                c2068a = new C2094z((C2070b) abstractC2074fM3834j, null, null, true, false);
                                i5 = 0;
                            } else {
                                i5 = 0;
                                c2068a = new C2068A(abstractC2074fM3834j, null, true, false);
                            }
                            try {
                                AbstractC2074f abstractC2074fM3813j = c2068a.m3813j();
                                try {
                                    if (list.isEmpty()) {
                                        if (c2409f2.m4286h()) {
                                        }
                                        if (c2409f2.m4286h()) {
                                        }
                                        AbstractC2074f.m3811q(abstractC2074fM3813j);
                                        c2068a.mo3787c();
                                        synchronized (c1400z0.f4997c) {
                                        }
                                    } else {
                                        try {
                                            int size = list.size();
                                            for (int i8 = i5; i8 < size; i8++) {
                                                c2409f2.m4279a((C1397y) list.get(i8));
                                            }
                                            int size2 = list.size();
                                            for (int i9 = i5; i9 < size2; i9++) {
                                                ((C1397y) list.get(i9)).m2650d();
                                            }
                                            if (c2409f2.m4286h()) {
                                                j5 = 128;
                                            } else {
                                                try {
                                                    c2409f2.m4289k(c2409f2);
                                                    Object[] objArr2 = c2409f2.f7794b;
                                                    j5 = 128;
                                                    long[] jArr = c2409f2.f7793a;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i10 = 0;
                                                        while (true) {
                                                            long j6 = jArr[i10];
                                                            Object[] objArr3 = objArr2;
                                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                                                for (int i12 = 0; i12 < i11; i12++) {
                                                                    if ((j6 & 255) < 128) {
                                                                        ((C1397y) objArr3[(i10 << 3) + i12]).m2652f();
                                                                    }
                                                                    j6 >>= 8;
                                                                }
                                                                if (i11 == 8) {
                                                                    int i13 = i10;
                                                                    if (i13 != length) {
                                                                        i10 = i13 + 1;
                                                                        objArr2 = objArr3;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    try {
                                                        c1400z0.m2685J(th, null);
                                                        C1398y0.m2673r(c1400z0, list, list2, list, c2409f2, c2409f2, c2409f, c2409f2);
                                                        AbstractC2074f.m3811q(abstractC2074fM3813j);
                                                        return C0891q.f2780a;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (c2409f2.m4286h()) {
                                                try {
                                                    Object[] objArr4 = c2409f2.f7794b;
                                                    long[] jArr2 = c2409f2.f7793a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i14 = 0;
                                                        while (true) {
                                                            long j7 = jArr2[i14];
                                                            Object[] objArr5 = objArr4;
                                                            long[] jArr3 = jArr2;
                                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                                for (int i16 = 0; i16 < i15; i16++) {
                                                                    if ((j7 & 255) < j5) {
                                                                        ((C1397y) objArr5[(i14 << 3) + i16]).m2653g();
                                                                    }
                                                                    j7 >>= 8;
                                                                }
                                                                if (i15 == 8) {
                                                                }
                                                            }
                                                            if (i14 != length2) {
                                                                i14++;
                                                                objArr4 = objArr5;
                                                                jArr2 = jArr3;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    try {
                                                        c1400z0.m2685J(th2, null);
                                                        C1398y0.m2673r(c1400z0, list, list2, list, c2409f2, c2409f2, c2409f, c2409f2);
                                                        c2409f2.m4280b();
                                                        AbstractC2074f.m3811q(abstractC2074fM3813j);
                                                        return C0891q.f2780a;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            AbstractC2074f.m3811q(abstractC2074fM3813j);
                                            c2068a.mo3787c();
                                            synchronized (c1400z0.f4997c) {
                                                c1400z0.m2689y();
                                            }
                                            AbstractC2082n.m3834j().mo3795m();
                                            c2409f2.m4280b();
                                            c2409f.m4280b();
                                            c1400z0.f5011q = null;
                                        } catch (Throwable th3) {
                                            try {
                                                c1400z0.m2685J(th3, null);
                                                C1398y0.m2673r(c1400z0, list, list2, list, c2409f2, c2409f2, c2409f, c2409f2);
                                                list.clear();
                                                AbstractC2074f.m3811q(abstractC2074fM3813j);
                                                return C0891q.f2780a;
                                            } finally {
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    AbstractC2074f.m3811q(abstractC2074fM3813j);
                                    throw th4;
                                }
                            } finally {
                                c2068a.mo3787c();
                            }
                        } else {
                            try {
                                int size3 = list.size();
                                for (int i17 = 0; i17 < size3; i17++) {
                                    C1397y c1397y = (C1397y) list.get(i17);
                                    C1397y c1397yM2684I = c1400z0.m2684I(c1397y, c2409f);
                                    if (c1397yM2684I != null) {
                                        list.add(c1397yM2684I);
                                    }
                                    c2409f2.m4279a(c1397y);
                                }
                                list.clear();
                                if (c2409f.m4286h() || c1400z0.f5003i.f5183f != 0) {
                                    synchronized (c1400z0.f4997c) {
                                        try {
                                            List listM2680D = c1400z0.m2680D();
                                            int size4 = listM2680D.size();
                                            for (int i18 = 0; i18 < size4; i18++) {
                                                C1397y c1397y2 = (C1397y) listM2680D.get(i18);
                                                if (!c2409f2.m4281c(c1397y2) && c1397y2.m2669w(set)) {
                                                    list.add(c1397y2);
                                                }
                                            }
                                            C1483e c1483e2 = c1400z0.f5003i;
                                            int i19 = c1483e2.f5183f;
                                            int i20 = 0;
                                            for (int i21 = 0; i21 < i19; i21++) {
                                                C1397y c1397y3 = (C1397y) c1483e2.f5181d[i21];
                                                if (!c2409f2.m4281c(c1397y3) && !list.contains(c1397y3)) {
                                                    list.add(c1397y3);
                                                    i20++;
                                                } else if (i20 > 0) {
                                                    Object[] objArr6 = c1483e2.f5181d;
                                                    objArr6[i21 - i20] = objArr6[i21];
                                                }
                                            }
                                            int i22 = i19 - i20;
                                            AbstractC0972l.m1998V(c1483e2.f5181d, i22, i19);
                                            c1483e2.f5183f = i22;
                                        } finally {
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        C1398y0.m2674t(list2, c1400z0);
                                        while (!list2.isEmpty()) {
                                            List listM2683H = c1400z0.m2683H(list2, c2409f);
                                            c2409f2.getClass();
                                            Iterator it = listM2683H.iterator();
                                            while (it.hasNext()) {
                                                c2409f2.m4288j(it.next());
                                            }
                                            C1398y0.m2674t(list2, c1400z0);
                                        }
                                    } catch (Throwable th5) {
                                        c1400z0.m2685J(th5, null);
                                        C1398y0.m2673r(c1400z0, list, list2, list, c2409f2, c2409f2, c2409f, c2409f2);
                                    }
                                    break;
                                }
                            } catch (Throwable th6) {
                                try {
                                    c1400z0.m2685J(th6, null);
                                    C1398y0.m2673r(c1400z0, list, list2, list, c2409f2, c2409f2, c2409f, c2409f2);
                                } finally {
                                }
                            }
                        }
                        return C0891q.f2780a;
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            default:
                EnumC1549b enumC1549b = (EnumC1549b) this.f4946e;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f4947f;
                C1427f c1427f = (C1427f) this.f4948g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4949h;
                EnumC1546T enumC1546T = (EnumC1546T) this.f4950i;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f4951j;
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f4952k;
                String str = (String) this.f4953l;
                C2762u c2762u = (C2762u) this.f4954m;
                C3375f c3375f = (C3375f) obj;
                AbstractC1665j.m2985e(c3375f, "$this$LazyColumn");
                C3375f.m5608a(c3375f, "theme_mode", new C1843e(582059899, true, new C0094w0(enumC1549b, interfaceC1601c, c1427f, linkedHashMap, 2)), 2);
                C3375f.m5608a(c3375f, "language_mode", new C1843e(-1831763484, true, new C0094w0(enumC1546T, interfaceC1601c, c1427f, linkedHashMap2, 3)), 2);
                C3375f.m5608a(c3375f, "theme_color", new C1843e(460892483, true, new C0496h(interfaceC1347Y, str, c2762u)), 2);
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1396x0(EnumC1549b enumC1549b, InterfaceC1601c interfaceC1601c, C1427f c1427f, LinkedHashMap linkedHashMap, EnumC1546T enumC1546T, LinkedHashMap linkedHashMap2, InterfaceC1347Y interfaceC1347Y, String str, C2762u c2762u) {
        this.f4946e = enumC1549b;
        this.f4947f = interfaceC1601c;
        this.f4948g = c1427f;
        this.f4949h = linkedHashMap;
        this.f4950i = enumC1546T;
        this.f4951j = linkedHashMap2;
        this.f4952k = interfaceC1347Y;
        this.f4953l = str;
        this.f4954m = c2762u;
    }
}
