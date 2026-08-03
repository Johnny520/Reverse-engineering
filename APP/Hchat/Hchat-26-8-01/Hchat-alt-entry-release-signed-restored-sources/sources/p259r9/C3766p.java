package p259r9;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p000a.AbstractC0000a;
import p071f1.C1024q0;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.C1061x;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1231l;
import p100h0.C1549s0;
import p116i.AbstractC1801x;
import p116i.C1755h0;
import p116i.C1758i0;
import p116i.C1787s;
import p119i2.AbstractC1938m;
import p119i2.C1922e;
import p119i2.C1925f0;
import p119i2.C1937l0;
import p119i2.C1939m0;
import p162l3.C2455i;
import p174m.EnumC2640p1;
import p177m2.AbstractC2772p;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p190n2.C2870e;
import p218og.AbstractC3149m;
import p218og.C3141e;
import p218og.C3144h;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p225p2.C3290b;
import p276sf.C3967n;
import p280t2.C4085a;
import p280t2.C4096l;
import p280t2.C4100p;
import p307v0.C4364d;
import p321w.AbstractC4604i;
import p321w.AbstractC4634s;
import p321w.C4609j1;
import p322w0.AbstractC4662m;
import p339x1.C5610h0;
import sh.C4005e2;

/* JADX INFO: renamed from: r9.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3766p implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12320g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b0.s.e(java.lang.Object):java.lang.Object, h0.d1.<init>(w.q1):void, l.b.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, ng.m.S(ng.j):ng.c, ng.m.Y(ng.j, dg.n):dg.j, r9.d0.m0():r9.z, sh.e2.<clinit>():void, th.c.<clinit>():void, u9.h.h(boolean):boolean, v0.d.<clinit>():void, v0.k.<clinit>():void, v8.b.invoke():java.lang.Object, v8.q.c(java.lang.String[]):java.lang.String, v8.q.j(h.Hchat.hooks.api.model.WeChatMessage, v8.h):v8.n, w.j1.<clinit>():void, w.n1.<init>(i2.g):void, w.n1.a(i0.h0, int):void, w.q0.<init>(w.x0, i0.r1, y1.g2):void, w.s.c(i2.g, y0.o, i2.n0, boolean, int, int, fg.l, fg.l, i0.h0, int):void, w0.m.<clinit>():void] */
    public /* synthetic */ C3766p(int i9) {
        this.f12320g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        C1937l0 c1937l0Mo4800a;
        C1925f0 c1925f0;
        switch (this.f12320g) {
            case 0:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                C3144h c3144h = ((C3145i) interfaceC3142f).f10203c;
                C3141e c3141eM6675a = c3144h.m6675a(1);
                if (c3141eM6675a != null) {
                    return c3141eM6675a.f10195a;
                }
                C3141e c3141eM6675a2 = c3144h.m6675a(2);
                String str = c3141eM6675a2 != null ? c3141eM6675a2.f10195a : null;
                return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
            case 1:
                InterfaceC1062y interfaceC1062y = (InterfaceC1062y) obj;
                interfaceC1062y.getClass();
                AbstractC1060w.m2680c(interfaceC1062y, 0);
                return C3967n.f12976a;
            case 2:
                InterfaceC1062y interfaceC1062y2 = (InterfaceC1062y) obj;
                interfaceC1062y2.getClass();
                AbstractC1060w.m2683f(interfaceC1062y2);
                return C3967n.f12976a;
            case 3:
                C1758i0 c1758i0 = (C1758i0) obj;
                c1758i0.getClass();
                c1758i0.m4408a(Float.valueOf(0.1f), 300);
                return C3967n.f12976a;
            case 4:
                C1758i0 c1758i02 = (C1758i0) obj;
                c1758i02.getClass();
                C1755h0 c1755h0M4408a = c1758i02.m4408a(Float.valueOf(0.85f), 200);
                C1787s c1787s = AbstractC1801x.f6010a;
                c1755h0M4408a.f5865b = c1787s;
                c1758i02.m4408a(Float.valueOf(0.803f), 300).f5865b = c1787s;
                return C3967n.f12976a;
            case 5:
                C1758i0 c1758i03 = (C1758i0) obj;
                c1758i03.getClass();
                c1758i03.m4408a(Float.valueOf(0.1f), 300);
                return C3967n.f12976a;
            case 6:
                InterfaceC1062y interfaceC1062y3 = (InterfaceC1062y) obj;
                interfaceC1062y3.getClass();
                AbstractC1060w.m2683f(interfaceC1062y3);
                return C3967n.f12976a;
            case 7:
                List list = (List) obj;
                list.getClass();
                return new C4005e2(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
            case 8:
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.getClass();
                c5610h0.m10064e();
                return C3967n.f12976a;
            case 9:
                Method method = (Method) obj;
                method.getClass();
                String genericString = method.toGenericString();
                genericString.getClass();
                return genericString;
            case 10:
                return new C4364d((Map) obj);
            case 11:
                return obj;
            case 12:
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return AbstractC3149m.m6703R0(str2).toString();
            case 13:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r0));
            case 14:
                String str3 = (String) obj;
                if (str3 == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return AbstractC3149m.m6703R0(str3).toString();
            case 15:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r0));
            case 16:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r0));
            case 17:
                int i9 = AbstractC4604i.f15186a;
                return C3967n.f12976a;
            case 18:
                return C3967n.f12976a;
            case 19:
                return C3967n.f12976a;
            case 20:
                C1549s0 c1549s0 = (C1549s0) obj;
                String str4 = c1549s0.f5171g.f6529h;
                long j3 = c1549s0.f5170f;
                int i10 = C1939m0.f6574c;
                int i11 = (int) (j3 & 4294967295L);
                if (i11 > 0) {
                    C2455i c2455iM9078u = AbstractC4634s.m9078u();
                    if (c2455iM9078u == null) {
                        iOffsetByCodePoints = i11 <= 0 ? -1 : Character.offsetByCodePoints(str4, i11, -1);
                    } else {
                        int iM5848b = c2455iM9078u.m5848b(str4, i11 - 1);
                        if (iM5848b >= 0) {
                            iOffsetByCodePoints = iM5848b;
                        } else if (i11 > 0) {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str4, i11, -1);
                        }
                    }
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new C2870e(((int) (c1549s0.f5170f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 21:
                C1549s0 c1549s02 = (C1549s0) obj;
                String str5 = c1549s02.f5171g.f6529h;
                long j4 = c1549s02.f5170f;
                int i12 = C1939m0.f6574c;
                int iM9074q = AbstractC4634s.m9074q((int) (j4 & 4294967295L), str5);
                if (iM9074q != -1) {
                    return new C2870e(0, iM9074q - ((int) (c1549s02.f5170f & 4294967295L)));
                }
                return null;
            case 22:
                C1549s0 c1549s03 = (C1549s0) obj;
                Integer numM4054e = c1549s03.m4054e();
                if (numM4054e == null) {
                    return null;
                }
                int iIntValue = numM4054e.intValue();
                long j5 = c1549s03.f5170f;
                int i13 = C1939m0.f6574c;
                return new C2870e(((int) (j5 & 4294967295L)) - iIntValue, 0);
            case 23:
                C1549s0 c1549s04 = (C1549s0) obj;
                Integer numM4053d = c1549s04.m4053d();
                if (numM4053d == null) {
                    return null;
                }
                int iIntValue2 = numM4053d.intValue();
                long j10 = c1549s04.f5170f;
                int i14 = C1939m0.f6574c;
                return new C2870e(0, iIntValue2 - ((int) (j10 & 4294967295L)));
            case 24:
                C1549s0 c1549s05 = (C1549s0) obj;
                Integer numM4052c = c1549s05.m4052c();
                if (numM4052c == null) {
                    return null;
                }
                int iIntValue3 = numM4052c.intValue();
                long j11 = c1549s05.f5170f;
                int i15 = C1939m0.f6574c;
                return new C2870e(((int) (j11 & 4294967295L)) - iIntValue3, 0);
            case 25:
                C1549s0 c1549s06 = (C1549s0) obj;
                Integer numM4051b = c1549s06.m4051b();
                if (numM4051b == null) {
                    return null;
                }
                int iIntValue4 = numM4051b.intValue();
                long j12 = c1549s06.f5170f;
                int i16 = C1939m0.f6574c;
                return new C2870e(0, iIntValue4 - ((int) (j12 & 4294967295L)));
            case 26:
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                obj2.getClass();
                EnumC2640p1 enumC2640p1 = ((Boolean) obj2).booleanValue() ? EnumC2640p1.f8622g : EnumC2640p1.f8623h;
                Object obj3 = list2.get(0);
                obj3.getClass();
                return new C4609j1(enumC2640p1, ((Float) obj3).floatValue());
            case 27:
                C1922e c1922e = (C1922e) obj;
                Object obj4 = c1922e.f6503a;
                if (!(obj4 instanceof AbstractC1938m) || (c1937l0Mo4800a = ((AbstractC1938m) obj4).mo4800a()) == null || (c1937l0Mo4800a.f6569a == null && c1937l0Mo4800a.f6570b == null && c1937l0Mo4800a.f6571c == null && c1937l0Mo4800a.f6572d == null)) {
                    return AbstractC0000a.m72k(c1922e);
                }
                Object obj5 = c1922e.f6503a;
                obj5.getClass();
                C1937l0 c1937l0Mo4800a2 = ((AbstractC1938m) obj5).mo4800a();
                if (c1937l0Mo4800a2 == null || (c1925f0 = c1937l0Mo4800a2.f6569a) == null) {
                    c1925f0 = new C1925f0(0L, 0L, (C2767k) null, (C2765i) null, (C2766j) null, (AbstractC2772p) null, (String) null, 0L, (C4085a) null, (C4100p) null, (C3290b) null, 0L, (C4096l) null, (C1024q0) null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
                return AbstractC0000a.m72k(c1922e, new C1922e(c1922e.f6504b, c1922e.f6505c, c1925f0));
            case 28:
                C1061x c1061x = AbstractC1058u.f3360A;
                C3967n c3967n = C3967n.f12976a;
                ((InterfaceC1062y) obj).mo2644a(c1061x, c3967n);
                return c3967n;
            default:
                synchronized (AbstractC4662m.f15512c) {
                    ?? r32 = AbstractC4662m.f15518i;
                    int size = r32.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        ((InterfaceC1231l) r32.get(i17)).invoke(obj);
                    }
                }
                return C3967n.f12976a;
        }
    }
}
