package p036c9;

import ci.AbstractC0592k0;
import java.util.ArrayList;
import java.util.List;
import okio.C3193a;
import p000a.AbstractC0000a;
import p057e1.C0807b;
import p071f1.C1024q0;
import p071f1.C1034w;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p119i2.AbstractC1921d0;
import p119i2.C1919c0;
import p119i2.C1922e;
import p119i2.C1925f0;
import p119i2.C1926g;
import p119i2.C1929h0;
import p119i2.C1934k;
import p119i2.C1936l;
import p119i2.C1939m0;
import p119i2.C1943o0;
import p119i2.C1945p0;
import p119i2.C1950u;
import p119i2.EnumC1930i;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p225p2.C3289a;
import p225p2.C3290b;
import p276sf.C3967n;
import p280t2.C4085a;
import p280t2.C4088d;
import p280t2.C4090f;
import p280t2.C4091g;
import p280t2.C4092h;
import p280t2.C4093i;
import p280t2.C4095k;
import p280t2.C4096l;
import p280t2.C4097m;
import p280t2.C4100p;
import p280t2.C4101q;
import p293u2.C4245o;
import p293u2.C4246p;
import p307v0.C4362b;

/* JADX INFO: renamed from: c9.n1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0468n1 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1385g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ci.k0.a(i0.h0, int):void] */
    public /* synthetic */ C0468n1(int i9) {
        this.f1385g = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        EnumC1930i enumC1930i;
        Object objM4781a;
        switch (this.f1385g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                AbstractC1184v0.m3204n("[Hchat:ConversationGroup] ".concat(str), (Throwable) obj2);
                return C3967n.f12976a;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0592k0.m1603a((C1836h0) obj, AbstractC1874r.m4617C(1));
                return C3967n.f12976a;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                AbstractC1184v0.m3204n("[Hchat:FakeLocation] ".concat(str2), (Throwable) obj2);
                return C3967n.f12976a;
            case 3:
                C1926g c1926g = (C1926g) obj2;
                return AbstractC0000a.m72k(c1926g.f6529h, AbstractC1921d0.m4781a(c1926g.f6528g, AbstractC1921d0.f6477a, (C4362b) obj));
            case 4:
                return Integer.valueOf(((C4096l) obj2).f13561a);
            case 5:
                C4100p c4100p = (C4100p) obj2;
                return AbstractC0000a.m72k(Float.valueOf(c4100p.f13565a), Float.valueOf(c4100p.f13566b));
            case 6:
                C4362b c4362b = (C4362b) obj;
                C4101q c4101q = (C4101q) obj2;
                C4245o c4245o = new C4245o(c4101q.f13568a);
                C1919c0 c1919c0 = AbstractC1921d0.f6498v;
                return AbstractC0000a.m72k(AbstractC1921d0.m4781a(c4245o, c1919c0, c4362b), AbstractC1921d0.m4781a(new C4245o(c4101q.f13569b), c1919c0, c4362b));
            case 7:
                return Integer.valueOf(((C2767k) obj2).f9003g);
            case 8:
                C1936l c1936l = (C1936l) obj2;
                return AbstractC0000a.m72k(c1936l.f6567a, AbstractC1921d0.m4781a(c1936l.f6568b, AbstractC1921d0.f6485i, (C4362b) obj));
            case 9:
                return Float.valueOf(((C4085a) obj2).f13537a);
            case 10:
                C4362b c4362b2 = (C4362b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList.add(AbstractC1921d0.m4781a((C1922e) list.get(i9), AbstractC1921d0.f6478b, c4362b2));
                }
                return arrayList;
            case 11:
                C1939m0 c1939m0 = (C1939m0) obj2;
                return AbstractC0000a.m72k(Integer.valueOf((int) (c1939m0.f6575a >> 32)), Integer.valueOf((int) (c1939m0.f6575a & 4294967295L)));
            case 12:
                C4362b c4362b3 = (C4362b) obj;
                C1024q0 c1024q0 = (C1024q0) obj2;
                return AbstractC0000a.m72k(AbstractC1921d0.m4781a(new C1034w(c1024q0.f3234a), AbstractC1921d0.f6492p, c4362b3), AbstractC1921d0.m4781a(new C0807b(c1024q0.f3235b), AbstractC1921d0.f6500x, c4362b3), Float.valueOf(c1024q0.f3236c));
            case 13:
                return Integer.valueOf(((C4095k) obj2).f13557a);
            case 14:
                return Integer.valueOf(((C4097m) obj2).f13562a);
            case 15:
                return Integer.valueOf(((C4088d) obj2).f13541a);
            case 16:
                return Integer.valueOf(((C2765i) obj2).f8996a);
            case 17:
                return Integer.valueOf(((C2766j) obj2).f8997a);
            case 18:
                C4245o c4245o2 = (C4245o) obj2;
                return c4245o2 == null ? false : C4245o.m8538a(c4245o2.f13925a, C4245o.f13924c) ? Boolean.FALSE : AbstractC0000a.m72k(Float.valueOf(C4245o.m8540c(c4245o2.f13925a)), AbstractC1921d0.m4781a(new C4246p(C4245o.m8539b(c4245o2.f13925a)), AbstractC1921d0.f6499w, (C4362b) obj));
            case 19:
                C1934k c1934k = (C1934k) obj2;
                return AbstractC0000a.m72k(c1934k.f6559a, AbstractC1921d0.m4781a(c1934k.f6560b, AbstractC1921d0.f6485i, (C4362b) obj));
            case 20:
                long j3 = ((C4246p) obj2).f13926a;
                if (C4246p.m8542a(j3, 8589934592L)) {
                    return 0;
                }
                if (C4246p.m8542a(j3, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 21:
                C0807b c0807b = (C0807b) obj2;
                return c0807b == null ? false : C0807b.m2039b(c0807b.f2414a, 9205357640488583168L) ? Boolean.FALSE : AbstractC0000a.m72k(Float.valueOf(Float.intBitsToFloat((int) (c0807b.f2414a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (c0807b.f2414a & 4294967295L))));
            case 22:
                C4362b c4362b4 = (C4362b) obj;
                C1922e c1922e = (C1922e) obj2;
                Object obj3 = c1922e.f6503a;
                if (obj3 instanceof C1950u) {
                    enumC1930i = EnumC1930i.f6538g;
                } else if (obj3 instanceof C1925f0) {
                    enumC1930i = EnumC1930i.f6539h;
                } else if (obj3 instanceof C1945p0) {
                    enumC1930i = EnumC1930i.f6540i;
                } else if (obj3 instanceof C1943o0) {
                    enumC1930i = EnumC1930i.f6541j;
                } else if (obj3 instanceof C1936l) {
                    enumC1930i = EnumC1930i.f6542k;
                } else if (obj3 instanceof C1934k) {
                    enumC1930i = EnumC1930i.f6543l;
                } else {
                    if (!(obj3 instanceof C1929h0)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC1930i = EnumC1930i.f6544m;
                }
                switch (enumC1930i.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objM4781a = AbstractC1921d0.m4781a((C1950u) obj3, AbstractC1921d0.f6483g, c4362b4);
                        break;
                    case 1:
                        obj3.getClass();
                        objM4781a = AbstractC1921d0.m4781a((C1925f0) obj3, AbstractC1921d0.f6484h, c4362b4);
                        break;
                    case 2:
                        obj3.getClass();
                        objM4781a = AbstractC1921d0.m4781a((C1945p0) obj3, AbstractC1921d0.f6479c, c4362b4);
                        break;
                    case 3:
                        obj3.getClass();
                        objM4781a = AbstractC1921d0.m4781a((C1943o0) obj3, AbstractC1921d0.f6480d, c4362b4);
                        break;
                    case 4:
                        obj3.getClass();
                        objM4781a = AbstractC1921d0.m4781a((C1936l) obj3, AbstractC1921d0.f6481e, c4362b4);
                        break;
                    case 5:
                        obj3.getClass();
                        objM4781a = AbstractC1921d0.m4781a((C1934k) obj3, AbstractC1921d0.f6482f, c4362b4);
                        break;
                    case 6:
                        obj3.getClass();
                        objM4781a = ((C1929h0) obj3).f6537a;
                        break;
                    default:
                        C3193a.m6822k();
                        return null;
                }
                return AbstractC0000a.m72k(enumC1930i, objM4781a, Integer.valueOf(c1922e.f6504b), Integer.valueOf(c1922e.f6505c), c1922e.f6506d);
            case 23:
                C4362b c4362b5 = (C4362b) obj;
                ?? r72 = ((C3290b) obj2).f10461g;
                ArrayList arrayList2 = new ArrayList(r72.size());
                int size2 = r72.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    arrayList2.add(AbstractC1921d0.m4781a((C3289a) r72.get(i10), AbstractC1921d0.f6502z, c4362b5));
                }
                return arrayList2;
            case 24:
                return ((C3289a) obj2).f10459a.toLanguageTag();
            case 25:
                C4362b c4362b6 = (C4362b) obj;
                C4093i c4093i = (C4093i) obj2;
                return AbstractC0000a.m72k(AbstractC1921d0.m4781a(new C4090f(c4093i.f13551a), AbstractC1921d0.f6474B, c4362b6), AbstractC1921d0.m4781a(new C4092h(c4093i.f13552b), AbstractC1921d0.f6475C, c4362b6), AbstractC1921d0.m4781a(new C4091g(c4093i.f13553c), AbstractC1921d0.f6476D, c4362b6));
            case 26:
                return Float.valueOf(((C4090f) obj2).f13547a);
            case 27:
                return Integer.valueOf(((C4092h) obj2).f13549a);
            case 28:
                return Integer.valueOf(((C4091g) obj2).f13548a);
            default:
                return ((C1945p0) obj2).f6594a;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c9.f.invoke():java.lang.Object, h.Hchat.ModuleEntry.installAppBrandProcessHook(android.content.Context, java.lang.ClassLoader, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam, boolean):void, i2.d0.<clinit>():void] */
    public /* synthetic */ C0468n1(byte b10, int i9) {
        this.f1385g = i9;
    }
}
