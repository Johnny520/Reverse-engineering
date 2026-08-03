package p015b0;

import android.app.Activity;
import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import bi.C0315c;
import ca.C0517e0;
import ca.C0518f;
import ca.C0519f0;
import ca.C0520g;
import ci.C0571a;
import gg.AbstractC1428x;
import gg.C1424t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p010aa.C0033a;
import p020b5.C0190i;
import p036c9.C0446i;
import p057e1.C0807b;
import p057e1.C0808c;
import p069f.AbstractC0959s0;
import p069f.C0943k0;
import p069f.C0945l0;
import p071f1.AbstractC0996c0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p089g1.C1275d;
import p100h0.C1511d1;
import p116i.C1752g0;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1874r;
import p117i0.C1830f2;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1848k0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.C1897y1;
import p117i0.C1899z0;
import p117i0.EnumC1885u1;
import p117i0.InterfaceC1835h;
import p131j0.C2046b;
import p131j0.C2048d;
import p144k.C2209s1;
import p174m.C2604g2;
import p174m.C2609h2;
import p218og.AbstractC3149m;
import p218og.C3143g;
import p222p.AbstractC3210d1;
import p222p.AbstractC3226j;
import p222p.C3205c;
import p222p.C3213e1;
import p222p.C3216f1;
import p230p8.C3349c0;
import p230p8.C3351d0;
import p230p8.C3360l;
import p230p8.C3370v;
import p249qg.AbstractC3603v;
import p249qg.C3564g;
import p249qg.C3593q;
import p249qg.C3610y0;
import p249qg.InterfaceC3561f;
import p249qg.InterfaceC3573j;
import p249qg.InterfaceC3596r0;
import p261rb.C3788d;
import p261rb.EnumC3789e;
import p266s0.C3878h;
import p267s1.C3914t;
import p276sf.C3958e;
import p276sf.C3967n;
import p293u2.C4240j;
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p307v0.C4361a;
import p317vb.InterfaceC4544a;
import p321w.AbstractC4634s;
import p321w.C4621n1;
import p321w.InterfaceC4647y0;
import p322w0.AbstractC4671v;
import p322w0.C4668s;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.C4770c3;
import p332wb.C4936h5;
import p332wb.C5294s2;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5844f;
import p356y0.C5845g;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p372z.C6056d;
import sg.InterfaceC3984p;
import tf.AbstractC4166m;
import ug.C4346k;
import vg.C4567p;
import wf.InterfaceC5559e;
import wf.InterfaceC5560f;

/* JADX INFO: renamed from: b0.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0154t implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f410g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f411h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0154t(int i9, int i10, Object obj) {
        this.f410g = i10;
        this.f411h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05c5  */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [int] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25, types: [sg.p] */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object[], java.util.Set[]] */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3561f interfaceC3561fM4670y;
        int i9;
        int i10;
        InterfaceC3596r0 interfaceC3596r0;
        InterfaceC3596r0 interfaceC3596r02;
        ?? r14;
        boolean zM2051g;
        Collection collectionM8397F1;
        int i11 = 7;
        InterfaceC3596r0 interfaceC3596r03 = null;
        switch (this.f410g) {
            case 0:
                C6056d c6056d = (C6056d) this.f411h;
                C1836h0 c1836h0 = (C1836h0) obj;
                ((Integer) obj2).getClass();
                c1836h0.m4525a0(666084174);
                String str = c6056d.f24521b;
                c1836h0.m4553p(false);
                return str;
            case 1:
                TextClassification textClassification = (TextClassification) this.f411h;
                C1836h0 c1836h02 = (C1836h0) obj;
                ((Integer) obj2).getClass();
                c1836h02.m4525a0(950061013);
                String strValueOf = String.valueOf(textClassification.getLabel());
                c1836h02.m4553p(false);
                return strValueOf;
            case 2:
                RemoteAction remoteAction = (RemoteAction) this.f411h;
                C1836h0 c1836h03 = (C1836h0) obj;
                ((Integer) obj2).intValue();
                c1836h03.m4525a0(-1376593684);
                String string = remoteAction.getTitle().toString();
                c1836h03.m4553p(false);
                return string;
            case 3:
                C0518f c0518f = (C0518f) this.f411h;
                Activity activity = (Activity) obj;
                C3370v c3370v = (C3370v) obj2;
                activity.getClass();
                c3370v.getClass();
                C0517e0 c0517e0 = c0518f.f1595e;
                if (c0517e0 != null) {
                    C5491y2.m9799Q1(activity, "转发[H]", HttpUrl.FRAGMENT_ENCODE_SET, AbstractC0000a.m101y0(new C3958e("转发到朋友圈", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("转发给好友", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("分享", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("群发助手", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("转发至标签", HttpUrl.FRAGMENT_ENCODE_SET)), new C0520g(c0517e0, activity, c3370v, 0), new C0315c(i11), EnumC5092lv.f18824j);
                }
                return C3967n.f12976a;
            case 4:
                C0519f0 c0519f0 = (C0519f0) this.f411h;
                Activity activity2 = (Activity) obj;
                C3360l c3360l = (C3360l) obj2;
                activity2.getClass();
                c3360l.getClass();
                c0519f0.f1599c.invoke(activity2, c3360l.f10845b);
                return C3967n.f12976a;
            case 5:
                ((Integer) obj2).getClass();
                ((C0571a) this.f411h).m1578a((C1836h0) obj, AbstractC1874r.m4617C(7));
                return C3967n.f12976a;
            case 6:
                C1424t c1424t = (C1424t) this.f411h;
                ((C3914t) obj).m8118a();
                c1424t.f4737g = ((C0807b) obj2).f2414a;
                return C3967n.f12976a;
            case 7:
                ((Integer) obj2).getClass();
                ((C1752g0) this.f411h).m4401a((C1836h0) obj, AbstractC1874r.m4617C(1));
                return C3967n.f12976a;
            case 8:
                C0190i c0190i = (C0190i) this.f411h;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC1835h) {
                    InterfaceC1835h interfaceC1835h = (InterfaceC1835h) obj2;
                    C0945l0 c0945l0 = (C0945l0) c0190i.f483i;
                    if (c0945l0 == null) {
                        C0945l0 c0945l02 = AbstractC0959s0.f3019a;
                        c0945l0 = new C0945l0();
                        c0190i.f483i = c0945l0;
                    }
                    c0945l0.m2338k(interfaceC1835h);
                    ((C2046b) c0190i.f481g).m5056b(interfaceC1835h);
                }
                if (obj2 instanceof C1848k0) {
                    c0190i.m845g((C1848k0) obj2);
                }
                if (obj2 instanceof C1876r1) {
                    ((C1876r1) obj2).m4647c();
                }
                return C3967n.f12976a;
            case 9:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    throw null;
                }
                c1836h04.m4519V();
                return C3967n.f12976a;
            case 10:
                C1899z0 c1899z0 = (C1899z0) this.f411h;
                Set set = (Set) obj;
                synchronized (c1899z0.f3204g) {
                    try {
                        C0943k0 c0943k0 = c1899z0.f6328h;
                        C0446i c0446i = new C0446i(set, 20, c1899z0);
                        AbstractC1428x.m3838c(1, c0446i);
                        Object[] objArr = c0943k0.f2969b;
                        long[] jArr = c0943k0.f2968a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j3 = jArr[i12];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j3 & 255) < 128) {
                                            c0446i.invoke(objArr[(i12 << 3) + i14]);
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i13 == 8) {
                                        if (i12 != length) {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        }
                        C0945l0 c0945l03 = c1899z0.f6330j;
                        Object[] objArr2 = c0945l03.f2976b;
                        long[] jArr2 = c0945l03.f2975a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i15 = 0;
                            while (true) {
                                long j4 = jArr2[i15];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        if ((j4 & 255) < 128) {
                                            ((InterfaceC3984p) objArr2[(i15 << 3) + i17]).mo8208p(C3967n.f12976a);
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i16 == 8) {
                                        if (i15 != length2) {
                                            i15++;
                                        }
                                    }
                                }
                            }
                        }
                        c1899z0.f6330j.m2329b();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C3967n.f12976a;
            case 11:
                C1897y1 c1897y1 = (C1897y1) this.f411h;
                Set set2 = (Set) obj;
                synchronized (c1897y1.f6305c) {
                    try {
                        if (((EnumC1885u1) c1897y1.f6323u.getValue()).compareTo(EnumC1885u1.f6260k) >= 0) {
                            C0945l0 c0945l04 = c1897y1.f6310h;
                            if (set2 instanceof C2048d) {
                                C0945l0 c0945l05 = ((C2048d) set2).f6894g;
                                Object[] objArr3 = c0945l05.f2976b;
                                long[] jArr3 = c0945l05.f2975a;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i18 = 0;
                                    while (true) {
                                        long j5 = jArr3[i18];
                                        if ((((~j5) << i11) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                            for (?? r142 = z; r142 < i19; r142++) {
                                                if ((j5 & 255) < 128) {
                                                    i10 = i11;
                                                    Object obj3 = objArr3[(i18 << 3) + r142];
                                                    if (!(obj3 instanceof AbstractC4671v) || ((AbstractC4671v) obj3).m9164e(1)) {
                                                        c0945l04.m2328a(obj3);
                                                    }
                                                } else {
                                                    i10 = i11;
                                                }
                                                j5 >>= 8;
                                                i11 = i10;
                                            }
                                            i9 = i11;
                                            if (i19 == 8) {
                                            }
                                        } else {
                                            i9 = i11;
                                        }
                                        if (i18 != length3) {
                                            i18++;
                                            i11 = i9;
                                            z = false;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set2) {
                                    if (!(obj4 instanceof AbstractC4671v) || ((AbstractC4671v) obj4).m9164e(1)) {
                                        c0945l04.m2328a(obj4);
                                    }
                                }
                            }
                            interfaceC3561fM4670y = c1897y1.m4670y();
                        } else {
                            interfaceC3561fM4670y = null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (interfaceC3561fM4670y != null) {
                    ((C3564g) interfaceC3561fM4670y).resumeWith(C3967n.f12976a);
                }
                return C3967n.f12976a;
            case 12:
                C1830f2 c1830f2 = (C1830f2) this.f411h;
                Set set3 = (Set) obj;
                synchronized (c1830f2.f3204g) {
                    try {
                        C0945l0 c0945l06 = c1830f2.f6066j;
                        if (c0945l06 == null) {
                            if (AbstractC4166m.m8417o1(set3, c1830f2.f6064h)) {
                                r14 = c1830f2.f6068l;
                            }
                            interfaceC3596r0 = null;
                        } else {
                            Object[] objArr4 = c0945l06.f2976b;
                            long[] jArr4 = c0945l06.f2975a;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i20 = 0;
                                while (true) {
                                    long j10 = jArr4[i20];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i20 - length4)) >>> 31);
                                        int i22 = 0;
                                        while (i22 < i21) {
                                            if ((j10 & 255) < 128) {
                                                interfaceC3596r02 = interfaceC3596r03;
                                                if (set3.contains(objArr4[(i20 << 3) + i22])) {
                                                    r14 = c1830f2.f6068l;
                                                }
                                            } else {
                                                interfaceC3596r02 = interfaceC3596r03;
                                            }
                                            j10 >>= 8;
                                            i22++;
                                            interfaceC3596r03 = interfaceC3596r02;
                                        }
                                        interfaceC3596r0 = interfaceC3596r03;
                                        if (i21 == 8) {
                                        }
                                    } else {
                                        interfaceC3596r0 = interfaceC3596r03;
                                    }
                                    if (i20 != length4) {
                                        i20++;
                                        interfaceC3596r03 = interfaceC3596r0;
                                    }
                                }
                            } else {
                                interfaceC3596r0 = null;
                            }
                        }
                        r14 = interfaceC3596r0;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (r14 != 0) {
                    r14.mo8208p(C3967n.f12976a);
                }
                return C3967n.f12976a;
            case 13:
                ((InterfaceC1231l) this.f411h).invoke(obj);
                return C3967n.f12976a;
            case 14:
                C1275d c1275d = (C1275d) this.f411h;
                C0808c c0808cM2528y = AbstractC0996c0.m2528y((RectF) obj);
                C0808c c0808cM2528y2 = AbstractC0996c0.m2528y((RectF) obj2);
                switch (c1275d.f4235g) {
                    case 16:
                        zM2051g = c0808cM2528y.m2051g(c0808cM2528y2);
                        break;
                    default:
                        zM2051g = c0808cM2528y2.m2045a(c0808cM2528y.m2046b());
                        break;
                }
                return Boolean.valueOf(zM2051g);
            case 15:
                C2609h2 c2609h2 = (C2609h2) this.f411h;
                AbstractC3603v.m7563q(c2609h2.m10550Y0(), null, new C2604g2(c2609h2, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 16:
                char[] cArr = (char[]) this.f411h;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iM6720s0 = AbstractC3149m.m6720s0(charSequence, cArr, iIntValue2, false);
                if (iM6720s0 < 0) {
                    return null;
                }
                return new C3958e(Integer.valueOf(iM6720s0), 1);
            case 17:
                return new C4240j(((C5845g) this.f411h).mo10544a(0L, ((C4242l) obj).f13918a, (EnumC4243m) obj2));
            case 18:
                C3349c0 c3349c0 = (C3349c0) this.f411h;
                C3349c0 c3349c02 = (C3349c0) obj2;
                ((String) obj).getClass();
                c3349c02.getClass();
                if (c3349c02 == c3349c0) {
                    int i23 = c3349c02.f10774b - 1;
                    c3349c02.f10774b = i23;
                    if (i23 <= 0) {
                        return null;
                    }
                }
                return c3349c02;
            case 19:
                C3351d0 c3351d0 = (C3351d0) this.f411h;
                String strM9264h = (String) obj;
                Throwable th5 = (Throwable) obj2;
                strM9264h.getClass();
                if (th5 != null) {
                    strM9264h = AbstractC4855en.m9264h(strM9264h, ": ", th5.getMessage());
                }
                c3351d0.m7079l(strM9264h);
                return C3967n.f12976a;
            case 20:
                InterfaceC1236q interfaceC1236q = (InterfaceC1236q) this.f411h;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C3205c c3205c = AbstractC3226j.f10299b;
                    C5844f c5844f = C5840b.f23771q;
                    C5850l c5850l = C5850l.f23787a;
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(c3205c, c5844f, c1836h05, 54);
                    int iHashCode = Long.hashCode(c1836h05.f6095T);
                    C3878h c3878hM4546l = c1836h05.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h05, c5850l);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h05.m4531d0();
                    if (c1836h05.f6094S) {
                        c1836h05.m4544k(c5660y);
                    } else {
                        c1836h05.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h05, c3213e1M6892a);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h05, c3878hM4546l);
                    AbstractC1874r.m4638t(c1836h05, Integer.valueOf(iHashCode), C5601f.f22762f);
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h05);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h05, interfaceC5853oM10543c);
                    interfaceC1236q.mo734b(C3216f1.f10272a, c1836h05, 6);
                    c1836h05.m4553p(true);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 21:
                C4346k c4346k = (C4346k) this.f411h;
                int iIntValue4 = ((Integer) obj).intValue();
                InterfaceC5559e interfaceC5559e = (InterfaceC5559e) obj2;
                InterfaceC5560f key = interfaceC5559e.getKey();
                InterfaceC5559e interfaceC5559eMo2062s = c4346k.f14521h.mo2062s(key);
                if (key != C3593q.f11607h) {
                    iIntValue4 = interfaceC5559e != interfaceC5559eMo2062s ? Integer.MIN_VALUE : iIntValue4 + 1;
                } else {
                    InterfaceC3596r0 interfaceC3596r04 = (InterfaceC3596r0) interfaceC5559eMo2062s;
                    InterfaceC3596r0 parent = (InterfaceC3596r0) interfaceC5559e;
                    while (parent != null) {
                        if (parent != interfaceC3596r04 && (parent instanceof C4567p)) {
                            InterfaceC3573j interfaceC3573j = (InterfaceC3573j) C3610y0.f11642h.get((C4567p) parent);
                            parent = interfaceC3573j != null ? interfaceC3573j.getParent() : null;
                        } else {
                            interfaceC3596r03 = parent;
                            if (interfaceC3596r03 == interfaceC3596r04) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC3596r03 + ", expected child of " + interfaceC3596r04 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (interfaceC3596r04 != null) {
                            }
                        }
                    }
                    if (interfaceC3596r03 == interfaceC3596r04) {
                    }
                }
                return Integer.valueOf(iIntValue4);
            case 22:
                ((Integer) obj2).getClass();
                AbstractC4634s.m9067j((C1511d1) this.f411h, (C1836h0) obj, AbstractC1874r.m4617C(1));
                return C3967n.f12976a;
            case 23:
                ((InterfaceC4647y0) this.f411h).mo4013e(((C0807b) obj2).f2414a);
                return C3967n.f12976a;
            case 24:
                ((Integer) obj2).getClass();
                ((C4621n1) this.f411h).m9045a((C1836h0) obj, AbstractC1874r.m4617C(1));
                return C3967n.f12976a;
            case 25:
                C4668s c4668s = (C4668s) this.f411h;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = c4668s.f15537b;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        collectionM8397F1 = collection;
                    } else if (obj5 instanceof Set) {
                        collectionM8397F1 = AbstractC0000a.m101y0(new Set[]{obj5, collection});
                    } else {
                        if (!(obj5 instanceof List)) {
                            AbstractC1855m.m4574b("Unexpected notification");
                            C3193a.m6814c();
                            return null;
                        }
                        collectionM8397F1 = AbstractC4166m.m8397F1((Collection) obj5, AbstractC0000a.m99x0(collection));
                    }
                    while (!atomicReference.compareAndSet(obj5, collectionM8397F1)) {
                        if (atomicReference.get() != obj5) {
                        }
                        break;
                    }
                    if (c4668s.m9161b()) {
                        c4668s.f15536a.invoke(new C4361a(c4668s, i11));
                    }
                    return C3967n.f12976a;
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f411h).m9882b((C1836h0) obj, AbstractC1874r.m4617C(7));
                return C3967n.f12976a;
            case 27:
                C1845j1 c1845j1 = (C1845j1) this.f411h;
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) obj;
                interfaceC4544a.getClass();
                c1845j1.setValue(new C5294s2(interfaceC4544a, (C4770c3) obj2, true));
                return C3967n.f12976a;
            case 28:
                C4936h5 c4936h5 = (C4936h5) this.f411h;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c1836h06.m4525a0(542554095);
                    ArrayList arrayList = c4936h5.f17527b;
                    int i24 = 0;
                    for (Object obj6 : AbstractC4166m.m8403L1(30, arrayList)) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C0033a c0033a = (C0033a) obj6;
                        String str2 = c0033a.f106d;
                        if (AbstractC3149m.m6721t0(str2)) {
                            str2 = c0033a.f105c;
                        }
                        String strM9600l6 = AbstractC4955ho.m9600l6(c0033a);
                        Object objM4514P = c1836h06.m4514P();
                        if (objM4514P == C1851l.f6155a) {
                            objM4514P = new C2209s1(25);
                            c1836h06.m4545k0(objM4514P);
                        }
                        AbstractC4955ho.m9704x3(str2, strM9600l6, (InterfaceC1220a) objM4514P, c1836h06, 384);
                        if (i24 < Math.min(arrayList.size(), 30) - 1) {
                            c1836h06.m4525a0(-729884227);
                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        } else {
                            c1836h06.m4525a0(-1151561101);
                        }
                        c1836h06.m4553p(false);
                        i24 = i25;
                    }
                    c1836h06.m4553p(false);
                    if (arrayList.size() > 30) {
                        c1836h06.m4525a0(-360243171);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9657s0("还有 " + (arrayList.size() - 30) + " 个名单项未展开显示", c1836h06, 0);
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(-360106709);
                        c1836h06.m4553p(false);
                    }
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            default:
                C3143g c3143g = (C3143g) this.f411h;
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!c1836h07.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c1836h07.m4519V();
                } else if (c3143g.isEmpty()) {
                    c1836h07.m4525a0(-646122448);
                    AbstractC4955ho.m9296B1("暂无异常结果", "正常好友不会逐项显示", null, c1836h07, 54, 4);
                    c1836h07.m4553p(false);
                } else {
                    c1836h07.m4525a0(-646021946);
                    int i26 = 0;
                    for (Object obj7 : AbstractC4166m.m8403L1(50, c3143g)) {
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C3788d c3788d = (C3788d) obj7;
                        if (i26 > 0) {
                            c1836h07.m4525a0(-916007779);
                            AbstractC4955ho.m9312D1(0.0f, c1836h07, 0, 1);
                        } else {
                            c1836h07.m4525a0(1668543379);
                        }
                        c1836h07.m4553p(false);
                        EnumC3789e enumC3789e = c3788d.f12420c;
                        String str3 = c3788d.f12421d;
                        String strM9264h2 = enumC3789e == EnumC3789e.f12423h ? "好友关系异常" : "检测失败";
                        if (!AbstractC3149m.m6721t0(str3)) {
                            strM9264h2 = AbstractC4855en.m9264h(strM9264h2, " · ", str3);
                        }
                        AbstractC4955ho.m9688v4(c3788d.f12419b, strM9264h2, c1836h07, 0);
                        i26 = i27;
                    }
                    c1836h07.m4553p(false);
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C0154t(Object obj, int i9) {
        this.f410g = i9;
        this.f411h = obj;
    }
}
