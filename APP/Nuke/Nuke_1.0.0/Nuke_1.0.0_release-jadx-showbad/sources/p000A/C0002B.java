package p000A;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import me.dartcv.nuke.BuildConfig;
import nuke.p209ui.HomeActivity;
import p007B0.C0209w;
import p018D.C0255d;
import p027E4.C0330q;
import p029F0.C0363A;
import p045H4.AbstractC0653e;
import p045H4.C0650b;
import p056K2.C0882h;
import p056K2.C0891q;
import p058L.C0920W;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1050h;
import p090R3.C1228a;
import p095T.AbstractC1385s;
import p095T.AbstractC1387t;
import p095T.C1308D0;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.C1400z0;
import p095T.EnumC1392v0;
import p095T.InterfaceC1363h;
import p095T.InterfaceC1373m;
import p105V.C1486h;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.C1674s;
import p136b0.C1849k;
import p139c.AbstractC1883f;
import p149d3.AbstractC1976d;
import p152e0.C1995b;
import p152e0.InterfaceC1999f;
import p158f0.AbstractC2091w;
import p158f0.C2088t;
import p160f3.AbstractC2162v;
import p160f3.C2122Z;
import p160f3.C2135g;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2141j;
import p172h3.C2243c;
import p179i4.AbstractC2352g;
import p184j3.C2397p;
import p186k.AbstractC2416M;
import p186k.C2409F;
import p190k3.C2469q;
import p204n0.C2683b;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2762u;
import p227r.C3013s0;
import p227r.C3015t0;
import p245u0.C3309f;
import p259w3.AbstractC3393a;
import p259w3.C3394b;

/* JADX INFO: renamed from: A.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0002B implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f11d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f12e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0002B(int i5, Object obj) {
        this.f11d = i5;
        this.f12e = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: nuke.ui.HomeActivity.f(nuke.ui.HomeActivity, T.m, int):K2.q */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v18, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo0g(Object obj, Object obj2) {
        boolean zM4656g;
        char c5;
        char c6;
        long jM4934d;
        InterfaceC1999f interfaceC1999f;
        Object objM2019Z;
        char c7 = 7;
        Object objM2689y = null;
        int i5 = 0;
        switch (this.f11d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0070k0.m80g((C0920W) this.f12e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((InterfaceC0092v0) this.f12e).mo132e(((C2683b) obj2).f8556a);
                return C0891q.f2780a;
            case 2:
                C0255d c0255d = (C0255d) this.f12e;
                ((Integer) obj2).getClass();
                C1383r c1383r = (C1383r) ((InterfaceC1373m) obj);
                c1383r.m2568W(666084174);
                String str = c0255d.f842b;
                c1383r.m2597p(false);
                return str;
            case 3:
                TextClassification textClassification = (TextClassification) this.f12e;
                ((Integer) obj2).intValue();
                C1383r c1383r2 = (C1383r) ((InterfaceC1373m) obj);
                c1383r2.m2568W(950061013);
                String strValueOf = String.valueOf(textClassification.getLabel());
                c1383r2.m2597p(false);
                return strValueOf;
            case 4:
                RemoteAction remoteAction = (RemoteAction) this.f12e;
                ((Integer) obj2).intValue();
                C1383r c1383r3 = (C1383r) ((InterfaceC1373m) obj);
                c1383r3.m2568W(-1376593684);
                String string = remoteAction.getTitle().toString();
                c1383r3.m2597p(false);
                return string;
            case 5:
                C1674s c1674s = (C1674s) this.f12e;
                ((C0209w) obj).m320a();
                c1674s.f5708d = ((C2683b) obj2).f8556a;
                return C0891q.f2780a;
            case 6:
                return HomeActivity.m4774f((HomeActivity) this.f12e, (InterfaceC1373m) obj, ((Integer) obj2).intValue());
            case 7:
                C0363A c0363a = (C0363A) this.f12e;
                C2684c c2684cM4955z = AbstractC2767z.m4955z((RectF) obj);
                C2684c c2684cM4955z2 = AbstractC2767z.m4955z((RectF) obj2);
                switch (c0363a.f1136d) {
                    case 7:
                        zM4656g = c2684cM4955z.m4656g(c2684cM4955z2);
                        break;
                    default:
                        zM4656g = c2684cM4955z2.m4650a(c2684cM4955z.m4651b());
                        break;
                }
                return Boolean.valueOf(zM4656g);
            case 8:
                C1849k c1849k = (C1849k) this.f12e;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC1363h) {
                    InterfaceC1363h interfaceC1363h = (InterfaceC1363h) obj2;
                    C2409F c2409f = c1849k.f6265h;
                    if (c2409f == null) {
                        C2409F c2409f2 = AbstractC2416M.f7817a;
                        c2409f = new C2409F();
                        c1849k.f6265h = c2409f;
                    }
                    c2409f.m4288j(interfaceC1363h);
                    c1849k.f6263f.m2753b(interfaceC1363h);
                }
                if (obj2 instanceof C1308D0) {
                    c1849k.m3321e((C1308D0) obj2);
                }
                if (obj2 instanceof C1388t0) {
                    ((C1388t0) obj2).m2643d();
                }
                return C0891q.f2780a;
            case 9:
                C1400z0 c1400z0 = (C1400z0) this.f12e;
                Set set = (Set) obj;
                synchronized (c1400z0.f4997c) {
                    try {
                        if (((EnumC1392v0) c1400z0.f5015u.getValue()).compareTo(EnumC1392v0.f4938h) >= 0) {
                            C2409F c2409f3 = c1400z0.f5002h;
                            if (set instanceof C1486h) {
                                C2409F c2409f4 = ((C1486h) set).f5195d;
                                Object[] objArr = c2409f4.f7794b;
                                long[] jArr = c2409f4.f7793a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j5 = jArr[i6];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                                            for (int i8 = i5; i8 < i7; i8++) {
                                                if ((j5 & 255) < 128) {
                                                    Object obj3 = objArr[(i6 << 3) + i8];
                                                    if (!(obj3 instanceof AbstractC2091w) || ((AbstractC2091w) obj3).m3869e(1)) {
                                                        c2409f3.m4279a(obj3);
                                                    }
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i7 == 8) {
                                                if (i6 != length) {
                                                    i6++;
                                                    i5 = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof AbstractC2091w) || ((AbstractC2091w) obj4).m3869e(1)) {
                                        c2409f3.m4279a(obj4);
                                    }
                                }
                            }
                            objM2689y = c1400z0.m2689y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (objM2689y != null) {
                    ((C2135g) objM2689y).mo278i(C0891q.f2780a);
                }
                return C0891q.f2780a;
            case 10:
                C2243c c2243c = (C2243c) this.f12e;
                Set set2 = (Set) obj;
                if (set2 instanceof C1486h) {
                    C2409F c2409f5 = ((C1486h) set2).f5195d;
                    Object[] objArr2 = c2409f5.f7794b;
                    long[] jArr2 = c2409f5.f7793a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j6 = jArr2[i9];
                            if ((((~j6) << c7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j6 & 255) < 128) {
                                        Object obj5 = objArr2[(i9 << 3) + i11];
                                        c6 = c7;
                                        if (!(obj5 instanceof AbstractC2091w) || ((AbstractC2091w) obj5).m3869e(4)) {
                                        }
                                    } else {
                                        c6 = c7;
                                    }
                                    j6 >>= 8;
                                    i11++;
                                    c7 = c6;
                                }
                                c5 = c7;
                                if (i10 == 8) {
                                }
                            } else {
                                c5 = c7;
                            }
                            if (i9 != length2) {
                                i9++;
                                c7 = c5;
                            }
                        }
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof AbstractC2091w) || ((AbstractC2091w) obj6).m3869e(4)) {
                                c2243c.mo4090o(set2);
                            }
                        }
                    }
                }
                return C0891q.f2780a;
            case 11:
                ((InterfaceC1601c) this.f12e).mo1h(obj);
                return C0891q.f2780a;
            case 12:
                C2762u c2762u = (C2762u) this.f12e;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r4 = (C1383r) interfaceC1373m;
                if (c1383r4.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1543P.m2802I(c2762u, null, false, 34, null, c1383r4, 3072, 22);
                } else {
                    c1383r4.m2563R();
                }
                return C0891q.f2780a;
            case 13:
                C1228a c1228a = (C1228a) this.f12e;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C1383r c1383r5 = (C1383r) interfaceC1373m2;
                if (c1383r5.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C3309f c3309f = c1228a.f4096b;
                    if (c1228a.f4099e) {
                        c1383r5.m2568W(497423464);
                        c1383r5.m2597p(false);
                        jM4934d = AbstractC2767z.m4934d(4292617766L);
                    } else {
                        c1383r5.m2568W(497424733);
                        jM4934d = ((C0650b) c1383r5.m2590j(AbstractC0653e.f2072a)).f2066g;
                        c1383r5.m2597p(false);
                    }
                    AbstractC1543P.m2838w(c3309f, null, jM4934d, c1383r5, 0, 2);
                } else {
                    c1383r5.m2563R();
                }
                return C0891q.f2780a;
            case 14:
                char[] cArr = (char[]) this.f12e;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                AbstractC1665j.m2985e(charSequence, "$this$DelimitedRangesSequence");
                int iM3636d0 = AbstractC1976d.m3636d0(charSequence, cArr, iIntValue3, false);
                if (iM3636d0 < 0) {
                    return null;
                }
                return new C0882h(Integer.valueOf(iM3636d0), 1);
            case 15:
                C1995b c1995b = (C1995b) obj;
                List list = (List) ((InterfaceC1603e) this.f12e).mo0g(c1995b, obj2);
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Object obj7 = list.get(i12);
                    if (obj7 != null && (interfaceC1999f = c1995b.f6707e) != null && !interfaceC1999f.mo1275a(obj7)) {
                        throw new IllegalArgumentException(("item at index " + i12 + " can't be saved: " + obj7).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 16:
                C2088t c2088t = (C2088t) this.f12e;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = c2088t.f6997b;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        objM2019Z = set4;
                    } else if (obj8 instanceof Set) {
                        objM2019Z = AbstractC0972l.m1987K(new Set[]{obj8, set4});
                    } else {
                        if (!(obj8 instanceof List)) {
                            AbstractC1387t.m2639b("Unexpected notification");
                            throw new C0330q();
                        }
                        objM2019Z = AbstractC0973m.m2019Z((Collection) obj8, AbstractC2352g.m4211y(set4));
                    }
                    while (!atomicReference.compareAndSet(obj8, objM2019Z)) {
                        if (atomicReference.get() != obj8) {
                        }
                        break;
                    }
                    if (c2088t.m3866b()) {
                        c2088t.f6996a.mo1h(new C0099z(21, c2088t));
                    }
                    return C0891q.f2780a;
                }
                break;
            case 17:
                C2397p c2397p = (C2397p) this.f12e;
                int iIntValue4 = ((Integer) obj).intValue();
                InterfaceC1049g interfaceC1049g = (InterfaceC1049g) obj2;
                InterfaceC1050h key = interfaceC1049g.getKey();
                InterfaceC1049g interfaceC1049gMo1166C = c2397p.f7756h.mo1166C(key);
                if (key != C2155q.f7102e) {
                    iIntValue4 = interfaceC1049g != interfaceC1049gMo1166C ? Integer.MIN_VALUE : iIntValue4 + 1;
                } else {
                    InterfaceC2115S interfaceC2115S = (InterfaceC2115S) interfaceC1049gMo1166C;
                    InterfaceC2115S parent = (InterfaceC2115S) interfaceC1049g;
                    while (parent != null) {
                        if (parent != interfaceC2115S && (parent instanceof C2469q)) {
                            InterfaceC2141j interfaceC2141j = (InterfaceC2141j) C2122Z.f7063e.get((C2469q) parent);
                            parent = interfaceC2141j != null ? interfaceC2141j.getParent() : null;
                        } else {
                            objM2689y = parent;
                            if (objM2689y == interfaceC2115S) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objM2689y + ", expected child of " + interfaceC2115S + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (interfaceC2115S != null) {
                            }
                        }
                    }
                    if (objM2689y == interfaceC2115S) {
                    }
                }
                return Integer.valueOf(iIntValue4);
            case 18:
                C3015t0 c3015t0 = (C3015t0) this.f12e;
                AbstractC2162v.m3994p(c3015t0.m4023x0(), null, new C3013s0(c3015t0, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            default:
                C3394b c3394b = (C3394b) this.f12e;
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                C1383r c1383r6 = (C1383r) interfaceC1373m3;
                if (c1383r6.m2560O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC1385s.m2611a(AbstractC1883f.f6405a.mo2399a(c3394b), AbstractC3393a.f10614b, c1383r6, 56);
                } else {
                    c1383r6.m2563R();
                }
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0002B(C0920W c0920w, int i5) {
        this.f11d = 0;
        this.f12e = c0920w;
    }
}
