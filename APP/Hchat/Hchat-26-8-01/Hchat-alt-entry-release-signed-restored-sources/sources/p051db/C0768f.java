package p051db;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.text.Spannable;
import bi.AbstractC0316d;
import bi.C0314b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Settings;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p015b0.C0151q;
import p020b5.C0184c;
import p028c1.AbstractC0378h;
import p036c9.C0467n0;
import p036c9.C0482r0;
import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p071f1.C1016m0;
import p080fb.C1107c;
import p080fb.C1165q1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.InterfaceC1444b0;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p119i2.C1925f0;
import p127ib.C2034b;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p158l.C2413d;
import p158l.C2414e;
import p161l2.C2437b;
import p177m2.AbstractC2772p;
import p177m2.C2761e;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p177m2.C2774r;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3241o;
import p222p.AbstractC3253s;
import p222p.C3213e1;
import p222p.C3248q0;
import p222p.C3256t;
import p222p.C3259u;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p234q.AbstractC3418a;
import p237q2.C3429c;
import p237q2.C3430d;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p261rb.RunnableC3791g;
import p266s0.AbstractC3879i;
import p266s0.C3878h;
import p276sf.C3967n;
import p306v.AbstractC4360e;
import p308v1.InterfaceC4412n0;
import p315v8.C4521a;
import p332wb.AbstractC4955ho;
import p332wb.C4770c3;
import p332wb.C4917gj;
import p332wb.C4919gl;
import p332wb.C5015jk;
import p332wb.C5099m5;
import p332wb.C5124mu;
import p332wb.C5274rf;
import p332wb.C5278rj;
import p332wb.C5292s0;
import p332wb.C5330t5;
import p332wb.C5458x1;
import p332wb.C5475xi;
import p332wb.C5491y2;
import p332wb.EnumC5325t0;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p346x9.C5739f;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p365y9.C6008d;
import p365y9.C6009e;
import sh.AbstractC4045s;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: db.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0768f implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2316g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2317h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2318i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0768f(Object obj, int i9, Object obj2) {
        this.f2316g = i9;
        this.f2317h = obj;
        this.f2318i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f2316g) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f2317h;
                CountDownLatch countDownLatch = (CountDownLatch) this.f2318i;
                int iIntValue = ((Integer) obj).intValue();
                ((Integer) obj2).getClass();
                ((Boolean) obj3).getClass();
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                atomicInteger.set(iIntValue);
                countDownLatch.countDown();
                break;
            case 1:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f2317h;
                C2413d c2413d = (C2413d) this.f2318i;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c1836h0.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objM4514P = c1836h0.m4514P();
                    if (objM4514P == C1851l.f6155a) {
                        objM4514P = new C2414e();
                        c1836h0.m4545k0(objM4514P);
                    }
                    C2414e c2414e = (C2414e) objM4514P;
                    c2414e.f7893a.clear();
                    interfaceC1231l.invoke(c2414e);
                    c2414e.m5752a(c2413d, c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                Spannable spannable = (Spannable) this.f2317h;
                C3429c c3429c = (C3429c) this.f2318i;
                C1925f0 c1925f0 = (C1925f0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC2772p abstractC2772p = c1925f0.f6518f;
                C2767k c2767k = c1925f0.f6515c;
                if (c2767k == null) {
                    c2767k = C2767k.f8999i;
                }
                C2765i c2765i = c1925f0.f6516d;
                int i9 = c2765i != null ? c2765i.f8996a : 0;
                C2766j c2766j = c1925f0.f6517e;
                int i10 = c2766j != null ? c2766j.f8997a : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                C3430d c3430d = (C3430d) c3429c.f11098h;
                C2774r c2774rM6153b = ((C2761e) c3430d.f11103e).m6153b(abstractC2772p, c2767k, i9, i10);
                if (c2774rM6153b instanceof C2774r) {
                    Object obj4 = c2774rM6153b.f9013g;
                    obj4.getClass();
                    typeface = (Typeface) obj4;
                } else {
                    C0184c c0184c = new C0184c(c2774rM6153b, c3430d.f11108j);
                    c3430d.f11108j = c0184c;
                    Object obj5 = c0184c.f471c;
                    obj5.getClass();
                    typeface = (Typeface) obj5;
                }
                spannable.setSpan(new C2437b(typeface, 1), iIntValue3, iIntValue4, 33);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.f2317h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f2318i;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9321E2(arrayList.isEmpty() ? ((EnumC5325t0) interfaceC1809a1.getValue()).f20738h : ((EnumC5325t0) interfaceC1809a1.getValue()).f20738h + " · " + arrayList.size() + " 项", c1836h02, 0);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C0768f c0768f = (C0768f) this.f2317h;
                C0482r0 c0482r0 = (C0482r0) this.f2318i;
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                str.getClass();
                str2.getClass();
                str3.getClass();
                c0768f.mo734b(str, str2, str3);
                c0482r0.invoke();
                break;
            case 5:
                String str4 = (String) this.f2317h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f2318i;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1679414863, new C0151q(str4, 26, interfaceC1809a12), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                Set set = (Set) this.f2317h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f2318i;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h04.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4955ho.m9321E2(set.isEmpty() ? ((EnumC5325t0) interfaceC1809a13.getValue()).f20738h : ((EnumC5325t0) interfaceC1809a13.getValue()).f20738h + " · " + set.size() + " 项", c1836h04, 0);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                C5124mu c5124mu = (C5124mu) this.f2317h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f2318i;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h05.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-842561188, new C0151q(c5124mu, 21, interfaceC1809a14), c1836h05), c1836h05, 48, 1);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                String str5 = (String) this.f2317h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f2318i;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(412186318, new C5274rf(str5, interfaceC1220a, 0), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f2317h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f2318i;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h07.m4516S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1262995047, new C0151q(sharedPreferences, 25, interfaceC1220a2), c1836h07), c1836h07, 48, 1);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                List list = (List) this.f2317h;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f2318i;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h08.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1384324179, new C0151q(list, 24, interfaceC1220a3), c1836h08), c1836h08, 48, 1);
                } else {
                    c1836h08.m4519V();
                }
                return C3967n.f12976a;
            case 11:
                C4521a c4521a = (C4521a) this.f2317h;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f2318i;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h09.m4516S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(179601649, new C0151q(c4521a, 22, interfaceC1231l2), c1836h09), c1836h09, 48, 1);
                } else {
                    c1836h09.m4519V();
                }
                return C3967n.f12976a;
            case 12:
                ArrayList arrayList2 = (ArrayList) this.f2317h;
                List list2 = (List) this.f2318i;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h010.m4516S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC4045s.m8246j(AbstractC0921a.m2248k(arrayList2.size(), list2.size(), "聊天 · ", "/", " 项"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h010, 48, 12);
                } else {
                    c1836h010.m4519V();
                }
                return C3967n.f12976a;
            case 13:
                C5739f c5739f = (C5739f) this.f2317h;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f2318i;
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h011.m4516S(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1568466278, new C0151q(c5739f, 23, interfaceC1231l3), c1836h011), c1836h011, 48, 1);
                } else {
                    c1836h011.m4519V();
                }
                return C3967n.f12976a;
            case 14:
                C5099m5 c5099m5 = (C5099m5) this.f2317h;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f2318i;
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h012.m4516S(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    C5292s0 c5292s0 = c5099m5.f18836a;
                    boolean zContains = ((Set) interfaceC1809a15.getValue()).contains(c5292s0.f20550a);
                    boolean zM4534f = c1836h012.m4534f(interfaceC1809a15) | c1836h012.m4538h(c5292s0);
                    Object objM4514P2 = c1836h012.m4514P();
                    if (zM4534f || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C5458x1(c5292s0, interfaceC1809a15, 4);
                        c1836h012.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9448U1(c5099m5, zContains, (InterfaceC1220a) objM4514P2, c1836h012, 0);
                } else {
                    c1836h012.m4519V();
                }
                return C3967n.f12976a;
            case 15:
                C4060x c4060x = (C4060x) this.f2317h;
                C3641z c3641z = (C3641z) this.f2318i;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= c1836h013.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h013.m4516S(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    Object objM4514P3 = c1836h013.m4514P();
                    if (objM4514P3 == C1851l.f6155a) {
                        objM4514P3 = new C5015jk(3);
                        c1836h013.m4545k0(objM4514P3);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P3, c1836h013, 805306368, 504);
                } else {
                    c1836h013.m4519V();
                }
                return C3967n.f12976a;
            case 16:
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f2317h;
                C5330t5 c5330t5 = (C5330t5) this.f2318i;
                C1836h0 c1836h014 = (C1836h0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((C3259u) obj).getClass();
                if (c1836h014.m4516S(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    Object objM4514P4 = c1836h014.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P4 == c1823e) {
                        objM4514P4 = AbstractC1874r.m4639u(Boolean.FALSE);
                        c1836h014.m4545k0(objM4514P4);
                    }
                    InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) objM4514P4;
                    long jM9381L6 = AbstractC4955ho.m9381L6(((Boolean) interfaceC1809a16.getValue()).booleanValue(), c1836h014);
                    C5850l c5850l = C5850l.f23787a;
                    float f3 = 12;
                    InterfaceC5853o interfaceC5853oM1337b = AbstractC0378h.m1337b(AbstractC3222h1.m6901d(c5850l, 1.0f), AbstractC4360e.m8800a(f3));
                    C1016m0 c1016m0 = AbstractC0996c0.f3162b;
                    InterfaceC5853o interfaceC5853oM5430g = AbstractC2192n.m5430g(interfaceC5853oM1337b, jM9381L6, c1016m0);
                    Object objM4514P5 = c1836h014.m4514P();
                    if (objM4514P5 == c1823e) {
                        objM4514P5 = new C4917gj(interfaceC1809a16, 9);
                        c1836h014.m4545k0(objM4514P5);
                    }
                    InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(AbstractC4955ho.m9397N6(interfaceC5853oM5430g, interfaceC1220a4, (InterfaceC1231l) objM4514P5), 16, 14);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.f10298a, C5840b.f23771q, c1836h014, 48);
                    int iHashCode = Long.hashCode(c1836h014.f6095T);
                    C3878h c3878hM4546l = c1836h014.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h014, interfaceC5853oM6883m);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h014.m4531d0();
                    if (c1836h014.f6094S) {
                        c1836h014.m4544k(c5660y);
                    } else {
                        c1836h014.m4551n0();
                    }
                    C5597e c5597e = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e, c1836h014, c3213e1M6892a);
                    C5597e c5597e2 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e2, c1836h014, c3878hM4546l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C5597e c5597e3 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e3, c1836h014, numValueOf);
                    C5593d c5593d = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d, c1836h014);
                    C5597e c5597e4 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e4, c1836h014, interfaceC5853oM10543c);
                    InterfaceC5853o interfaceC5853oM1337b2 = AbstractC0378h.m1337b(AbstractC3222h1.m6907j(c5850l, 42), AbstractC4360e.m8800a(f3));
                    C1858m2 c1858m2 = AbstractC0316d.f944a;
                    InterfaceC5853o interfaceC5853oM5430g2 = AbstractC2192n.m5430g(interfaceC5853oM1337b2, ((C0314b) c1836h014.m4542j(c1858m2)).m1241k(), c1016m0);
                    InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23765k, false);
                    int iHashCode2 = Long.hashCode(c1836h014.f6095T);
                    C3878h c3878hM4546l2 = c1836h014.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h014, interfaceC5853oM5430g2);
                    c1836h014.m4531d0();
                    if (c1836h014.f6094S) {
                        c1836h014.m4544k(c5660y);
                    } else {
                        c1836h014.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h014, interfaceC4412n0M6930d);
                    AbstractC1874r.m4615A(c5597e2, c1836h014, c3878hM4546l2);
                    AbstractC2091b.m5169p(iHashCode2, c1836h014, c5597e3, c1836h014, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h014, interfaceC5853oM10543c2);
                    String strM6701P0 = AbstractC3149m.m6701P0(1, c5330t5.f20752b);
                    if (strM6701P0.length() == 0) {
                        strM6701P0 = "签";
                    }
                    AbstractC4045s.m8250n(strM6701P0, null, ((C0314b) c1836h014.m4542j(c1858m2)).m1236f(), 0L, C2767k.f9002l, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h014, 1572864, 0, 262074);
                    c1836h014.m4553p(true);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(new C3248q0(1.0f, true), f3, 0.0f, 0.0f, 0.0f, 14);
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h014, 0);
                    int iHashCode3 = Long.hashCode(c1836h014.f6095T);
                    C3878h c3878hM4546l3 = c1836h014.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h014, interfaceC5853oM6886p);
                    c1836h014.m4531d0();
                    if (c1836h014.f6094S) {
                        c1836h014.m4544k(c5660y);
                    } else {
                        c1836h014.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h014, c3256tM6935a);
                    AbstractC1874r.m4615A(c5597e2, c1836h014, c3878hM4546l3);
                    AbstractC2091b.m5169p(iHashCode3, c1836h014, c5597e3, c1836h014, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h014, interfaceC5853oM10543c3);
                    AbstractC4045s.m8250n(c5330t5.f20752b, null, ((C0314b) c1836h014.m4542j(c1858m2)).m1237g(), 0L, C2767k.f9000j, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h014, 1572864, 0, 262074);
                    AbstractC4045s.m8250n(AbstractC3199a.m6836i(c5330t5.f20753c.size(), " 人"), null, ((C0314b) c1836h014.m4542j(c1858m2)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h014, 24576, 0, 262122);
                    c1836h014.m4553p(true);
                    AbstractC4045s.m8250n("›", null, ((C0314b) c1836h014.m4542j(c1858m2)).m1238h(), AbstractC5700d.m10248D(22), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h014, 24582, 0, 262122);
                    c1836h014.m4553p(true);
                } else {
                    c1836h014.m4519V();
                }
                return C3967n.f12976a;
            case 17:
                C4770c3 c4770c3 = (C4770c3) this.f2317h;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f2318i;
                C1836h0 c1836h015 = (C1836h0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h015.m4516S(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC4955ho.m9343H0(c4770c3.f16186b, "暂无功能", interfaceC1231l4, c1836h015, 48);
                } else {
                    c1836h015.m4519V();
                }
                return C3967n.f12976a;
            case 18:
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f2317h;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f2318i;
                C1836h0 c1836h016 = (C1836h0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h016.m4516S(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    Object objM4514P6 = c1836h016.m4514P();
                    if (objM4514P6 == C1851l.f6155a) {
                        objM4514P6 = new C4919gl(interfaceC1809a17, 22);
                        c1836h016.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9382M("上传本地插件", (InterfaceC1220a) objM4514P6, "返回", interfaceC1220a5, null, null, c1836h016, 438, 48);
                } else {
                    c1836h016.m4519V();
                }
                return C3967n.f12976a;
            case 19:
                Context context = (Context) this.f2317h;
                String str6 = (String) this.f2318i;
                C1836h0 c1836h017 = (C1836h0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((InterfaceC1444b0) obj).getClass();
                if (c1836h017.m4516S(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    C5491y2.f22061i.m9861D1(context, str6, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 25, 0.0f, 0.0f, 6, 6), ((C0314b) c1836h017.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(12), c1836h017, 1597824);
                } else {
                    c1836h017.m4519V();
                }
                return C3967n.f12976a;
            case 20:
                C1107c c1107c = (C1107c) this.f2317h;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f2318i;
                C1836h0 c1836h018 = (C1836h0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((InterfaceC1444b0) obj).getClass();
                if (c1836h018.m4516S(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    InterfaceC5853o interfaceC5853oM6886p2 = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 24, 0.0f, 0.0f, 6, 6);
                    C3256t c3256tM6935a2 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h018, 0);
                    int iHashCode4 = Long.hashCode(c1836h018.f6095T);
                    C3878h c3878hM4546l4 = c1836h018.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c4 = AbstractC5839a.m10543c(c1836h018, interfaceC5853oM6886p2);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h018.m4531d0();
                    if (c1836h018.f6094S) {
                        c1836h018.m4544k(c5660y2);
                    } else {
                        c1836h018.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h018, c3256tM6935a2);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h018, c3878hM4546l4);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h018, Integer.valueOf(iHashCode4));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h018);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h018, interfaceC5853oM10543c4);
                    c1836h018.m4525a0(-1200520984);
                    for (C1165q1 c1165q1 : c1107c.f3593j) {
                        C5491y2 c5491y2 = C5491y2.f22066n;
                        boolean zM4534f2 = c1836h018.m4534f(interfaceC1809a18) | c1836h018.m4538h(c1165q1);
                        Object objM4514P7 = c1836h018.m4514P();
                        if (zM4534f2 || objM4514P7 == C1851l.f6155a) {
                            objM4514P7 = new C5475xi(c1165q1, 18, interfaceC1809a18);
                            c1836h018.m4545k0(objM4514P7);
                        }
                        c5491y2.m9910p0(c1165q1, (InterfaceC1220a) objM4514P7, c1836h018, 384);
                    }
                    c1836h018.m4553p(false);
                    c1836h018.m4553p(true);
                } else {
                    c1836h018.m4519V();
                }
                return C3967n.f12976a;
            case 21:
                C0035c c0035c = (C0035c) this.f2317h;
                C0467n0 c0467n0 = (C0467n0) this.f2318i;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) obj;
                C1836h0 c1836h019 = (C1836h0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                interfaceC1220a6.getClass();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= c1836h019.m4538h(interfaceC1220a6) ? 4 : 2;
                }
                if (c1836h019.m4516S(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    AbstractC3165h.m6777d(null, "发送收藏语音", 0L, 0L, 0L, false, interfaceC1220a6, 0L, 0L, false, AbstractC3879i.m8071e(402342677, new C5278rj(interfaceC1220a6, (Object) c0035c, (InterfaceC1220a) c0467n0, 24), c1836h019), c1836h019, ((iIntValue22 << 24) & 234881024) | 390, 3072);
                } else {
                    c1836h019.m4519V();
                }
                return C3967n.f12976a;
            default:
                C6009e c6009e = (C6009e) this.f2317h;
                C6008d c6008d = (C6008d) this.f2318i;
                String str7 = (String) obj;
                String str8 = (String) obj2;
                String str9 = (String) obj3;
                str7.getClass();
                str8.getClass();
                str9.getClass();
                C2034b c2034b = c6009e.f24391b;
                String strM4987a = C2034b.m4987a(c6008d.f24388a, c6008d.f24389b);
                if (strM4987a.length() != 0) {
                    c2034b.f6870a.edit().putString("custom_title_".concat(strM4987a), AbstractC0018a.m247k(str7)).putString("custom_color_".concat(strM4987a), AbstractC0018a.m246j(str8)).putString("custom_text_color_".concat(strM4987a), AbstractC0018a.m246j(str9)).apply();
                }
                C3086j c3086jTasks = WeChatApis.tasks();
                if (c3086jTasks != null) {
                    c3086jTasks.m6554e(new RunnableC3791g(c6009e, 22, c6008d));
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }
}
