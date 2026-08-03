package p070f0;

import android.widget.FrameLayout;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import ba.EnumC0221a;
import java.util.ArrayList;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p015b0.C0146l;
import p015b0.C0154t;
import p036c9.C0490u;
import p051db.C0765c;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p100h0.AbstractC1537m0;
import p100h0.C1511d1;
import p100h0.C1523h1;
import p100h0.C1528j0;
import p100h0.C1556w;
import p100h0.C1560y;
import p116i.C1772n;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1923e0;
import p119i2.C1939m0;
import p190n2.C2884s;
import p198nb.C2924a;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3250r;
import p222p.C3259u;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p267s1.AbstractC3898h0;
import p267s1.C3914t;
import p276sf.C3967n;
import p293u2.C4242l;
import p293u2.InterfaceC4233c;
import p317vb.InterfaceC4544a;
import p321w.C4597f1;
import p321w.EnumC4602h0;
import p322w0.C4661l;
import p332wb.AbstractC4955ho;
import p332wb.C4728ar;
import p332wb.C4936h5;
import p332wb.C5292s0;
import p340x2.AbstractC5674i;
import p356y0.AbstractC5839a;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p371yg.C6045a;
import p371yg.C6046b;
import p371yg.C6050f;
import sh.AbstractC4045s;
import sh.C4060x;

/* JADX INFO: renamed from: f0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0976h implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3078g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3079h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0976h(C6046b c6046b, C6045a c6045a) {
        this.f3078g = 14;
        this.f3079h = c6046b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0408  */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f3078g;
        int i10 = 14;
        C1823e c1823e = C1851l.f6155a;
        boolean z9 = true;
        C3967n c3967n = C3967n.f12976a;
        Object obj4 = this.f3079h;
        switch (i9) {
            case 0:
                C0977i c0977i = (C0977i) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    c0977i.f3080A.m861n(iIntValue);
                }
                if (!zBooleanValue) {
                    c0977i.f3080A.m861n(iIntValue2);
                }
                if (c0977i.f3087z) {
                    long j3 = c0977i.f3085x.f9317b;
                    int i11 = C1939m0.f6574c;
                    if (iIntValue != ((int) (j3 >> 32)) || iIntValue2 != ((int) (j3 & 4294967295L))) {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        EnumC4602h0 enumC4602h0 = EnumC4602h0.f15180g;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > c0977i.f3085x.f9316a.f6529h.length()) {
                            C1511d1 c1511d1 = c0977i.f3081B;
                            c1511d1.m4034t(false);
                            c1511d1.m4031q(enumC4602h0);
                            z9 = false;
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                C1511d1 c1511d12 = c0977i.f3081B;
                                c1511d12.m4034t(false);
                                c1511d12.m4031q(enumC4602h0);
                            } else {
                                c0977i.f3081B.m4022h(true);
                            }
                            c0977i.f3086y.f15347v.invoke(new C2884s(c0977i.f3085x.f9316a, AbstractC1923e0.m4784b(iIntValue, iIntValue2), (C1939m0) null));
                        }
                    }
                } else {
                    z9 = false;
                }
                break;
            case 1:
                C1511d1 c1511d13 = (C1511d1) obj4;
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                ((Integer) obj3).getClass();
                c1836h0.m4525a0(1980580247);
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h);
                Object objM4514P = c1836h0.m4514P();
                Object obj5 = objM4514P;
                if (objM4514P == c1823e) {
                    C1845j1 c1845j1M4639u = AbstractC1874r.m4639u(new C4242l(0L));
                    c1836h0.m4545k0(c1845j1M4639u);
                    obj5 = c1845j1M4639u;
                }
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj5;
                boolean zM4538h = c1836h0.m4538h(c1511d13);
                Object objM4514P2 = c1836h0.m4514P();
                Object obj6 = objM4514P2;
                if (zM4538h || objM4514P2 == c1823e) {
                    C0035c c0035c = new C0035c(c1511d13, 11, interfaceC1809a1);
                    c1836h0.m4545k0(c0035c);
                    obj6 = c0035c;
                }
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj6;
                boolean zM4534f = c1836h0.m4534f(interfaceC4233c);
                Object objM4514P3 = c1836h0.m4514P();
                Object obj7 = objM4514P3;
                if (zM4534f || objM4514P3 == c1823e) {
                    C1523h1 c1523h1 = new C1523h1(interfaceC4233c, interfaceC1809a1, 1);
                    c1836h0.m4545k0(c1523h1);
                    obj7 = c1523h1;
                }
                C1772n c1772n = AbstractC1537m0.f5124a;
                InterfaceC5853o interfaceC5853oM10541a = AbstractC5839a.m10541a(interfaceC5853o, new C1528j0(interfaceC1220a, (InterfaceC1231l) obj7));
                c1836h0.m4553p(false);
                break;
            case 2:
                ((C1560y) obj4).f5208h.mo4009a(((C3914t) obj2).f12836c, C1556w.f5191d);
                break;
            case 3:
                ((C2924a) obj4).invoke((Throwable) obj);
                break;
            case 4:
                C0490u c0490u = (C0490u) obj4;
                C1836h0 c1836h02 = (C1836h0) obj2;
                ((Integer) obj3).getClass();
                c1836h02.m4525a0(-102778667);
                Object objM4514P4 = c1836h02.m4514P();
                if (objM4514P4 == c1823e) {
                    objM4514P4 = AbstractC1874r.m4632n(c1836h02);
                    c1836h02.m4545k0(objM4514P4);
                }
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) objM4514P4;
                Object objM4514P5 = c1836h02.m4514P();
                if (objM4514P5 == c1823e) {
                    objM4514P5 = AbstractC1874r.m4639u(null);
                    c1836h02.m4545k0(objM4514P5);
                }
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P5;
                InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(c0490u, c1836h02);
                boolean zM4534f2 = c1836h02.m4534f(null);
                Object objM4514P6 = c1836h02.m4514P();
                if (zM4534f2 || objM4514P6 == c1823e) {
                    objM4514P6 = new C0146l(interfaceC1809a12, i10);
                    c1836h02.m4545k0(objM4514P6);
                }
                AbstractC1874r.m4621c(null, (InterfaceC1231l) objM4514P6, c1836h02);
                boolean zM4538h2 = c1836h02.m4538h(interfaceC3599t) | c1836h02.m4534f(null) | c1836h02.m4534f(interfaceC1809a1M4643y);
                Object objM4514P7 = c1836h02.m4514P();
                if (zM4538h2 || objM4514P7 == c1823e) {
                    objM4514P7 = new C4597f1(interfaceC3599t, interfaceC1809a12, interfaceC1809a1M4643y, false ? 1 : 0);
                    c1836h02.m4545k0(objM4514P7);
                }
                InterfaceC5853o interfaceC5853oM8090a = AbstractC3898h0.m8090a(C5850l.f23787a, null, (PointerInputEventHandler) objM4514P7);
                c1836h02.m4553p(false);
                break;
            case 5:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) obj4;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (!c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    c1836h03.m4519V();
                } else {
                    AbstractC4045s.m8246j(interfaceC4544a.mo4984b(), null, c1836h03, 0, 14);
                }
                break;
            case 6:
                C0765c c0765c = (C0765c) obj4;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (!c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c1836h04.m4519V();
                } else {
                    AbstractC4045s.m8246j(c0765c.f2305r == 1 ? "朋友圈内容" : "发送内容", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h04, 48, 12);
                }
                break;
            case 7:
                C4936h5 c4936h5 = (C4936h5) obj4;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (!c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    c1836h05.m4519V();
                } else {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(371513879, new C0154t(c4936h5, 28), c1836h05), c1836h05, 48, 1);
                }
                break;
            case 8:
                ArrayList arrayList = (ArrayList) obj4;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (!c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    c1836h06.m4519V();
                } else {
                    AbstractC4045s.m8246j(arrayList.isEmpty() ? "关键词" : AbstractC0921a.m2250m(arrayList.size(), "关键词 · ", " 个"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h06, 48, 12);
                }
                break;
            case 9:
                C5292s0 c5292s0 = (C5292s0) obj4;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (!c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    c1836h07.m4519V();
                } else {
                    AbstractC4045s.m8246j(c5292s0 == null ? "群聊" : "群成员", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h07, 48, 12);
                }
                break;
            case 10:
                C4060x c4060x = (C4060x) obj4;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= c1836h08.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (!c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    c1836h08.m4519V();
                } else {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    Object objM4514P8 = c1836h08.m4514P();
                    if (objM4514P8 == c1823e) {
                        objM4514P8 = new C4661l(25);
                        c1836h08.m4545k0(objM4514P8);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, null, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P8, c1836h08, 805306368, 506);
                }
                break;
            case 11:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) obj4;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((C3259u) obj).getClass();
                if (!c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    c1836h09.m4519V();
                } else {
                    interfaceC1235p.invoke(c1836h09, 0);
                }
                break;
            case 12:
                EnumC0221a enumC0221a = (EnumC0221a) obj4;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (!c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    c1836h010.m4519V();
                } else {
                    AbstractC4045s.m8246j(enumC0221a.f550g.concat("气泡"), AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h010, 48, 12);
                }
                break;
            case 13:
                FrameLayout frameLayout = (FrameLayout) obj4;
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((C3250r) obj).getClass();
                if (!c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    c1836h011.m4519V();
                } else {
                    boolean zM4538h3 = c1836h011.m4538h(frameLayout);
                    Object objM4514P9 = c1836h011.m4514P();
                    if (zM4538h3 || objM4514P9 == c1823e) {
                        objM4514P9 = new C4728ar(frameLayout, 1);
                        c1836h011.m4545k0(objM4514P9);
                    }
                    AbstractC5674i.m10235b((InterfaceC1231l) objM4514P9, AbstractC3222h1.f10289c, null, c1836h011, 48, 4);
                }
                break;
            case 14:
                C6046b c6046b = (C6046b) obj4;
                C6046b.f24500g.set(c6046b, null);
                c6046b.m10808f(null);
                break;
            default:
                ((C6050f) obj4).m10810b();
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C0976h(Object obj, int i9) {
        this.f3078g = i9;
        this.f3079h = obj;
    }
}
