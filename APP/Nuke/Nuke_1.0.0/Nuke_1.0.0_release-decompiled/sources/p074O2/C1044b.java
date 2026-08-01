package p074O2;

import java.util.ArrayList;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p027E4.C0330q;
import p092S0.AbstractC1250C;
import p092S0.AbstractC1251D;
import p092S0.C1249B;
import p092S0.C1252E;
import p092S0.C1254G;
import p092S0.C1259L;
import p092S0.C1261N;
import p092S0.C1262O;
import p092S0.C1267e;
import p092S0.C1269g;
import p092S0.C1273k;
import p092S0.C1274l;
import p092S0.C1282t;
import p092S0.EnumC1271i;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p125Z0.C1780a;
import p125Z0.C1781b;
import p147d1.C1951a;
import p147d1.C1954d;
import p147d1.C1955e;
import p147d1.C1956f;
import p147d1.C1957g;
import p147d1.C1958h;
import p147d1.C1959i;
import p147d1.C1961k;
import p147d1.C1962l;
import p147d1.C1963m;
import p147d1.C1966p;
import p147d1.C1967q;
import p152e0.C1995b;
import p153e1.C2019o;
import p153e1.C2020p;
import p179i4.AbstractC2352g;
import p204n0.C2683b;
import p211o0.C2737L;
import p211o0.C2762u;

/* JADX INFO: renamed from: O2.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1044b implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3282d;

    public /* synthetic */ C1044b(int i5) {
        this.f3282d = i5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C1045c c1045c;
        EnumC1271i enumC1271i;
        Object objM2311a;
        switch (this.f3282d) {
            case 0:
                String str = (String) obj;
                InterfaceC1049g interfaceC1049g = (InterfaceC1049g) obj2;
                AbstractC1665j.m2985e(str, "acc");
                AbstractC1665j.m2985e(interfaceC1049g, "element");
                if (str.length() == 0) {
                    return interfaceC1049g.toString();
                }
                return str + ", " + interfaceC1049g;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1051i interfaceC1051i = (InterfaceC1051i) obj;
                InterfaceC1049g interfaceC1049g2 = (InterfaceC1049g) obj2;
                AbstractC1665j.m2985e(interfaceC1051i, "acc");
                AbstractC1665j.m2985e(interfaceC1049g2, "element");
                InterfaceC1051i interfaceC1051iMo1167j = interfaceC1051i.mo1167j(interfaceC1049g2.getKey());
                C1052j c1052j = C1052j.f3286d;
                if (interfaceC1051iMo1167j == c1052j) {
                    return interfaceC1049g2;
                }
                C1047e c1047e = C1047e.f3285d;
                InterfaceC1048f interfaceC1048f = (InterfaceC1048f) interfaceC1051iMo1167j.mo1166C(c1047e);
                if (interfaceC1048f == null) {
                    c1045c = new C1045c(interfaceC1049g2, interfaceC1051iMo1167j);
                } else {
                    InterfaceC1051i interfaceC1051iMo1167j2 = interfaceC1051iMo1167j.mo1167j(c1047e);
                    if (interfaceC1051iMo1167j2 == c1052j) {
                        return new C1045c(interfaceC1048f, interfaceC1049g2);
                    }
                    c1045c = new C1045c(interfaceC1048f, new C1045c(interfaceC1049g2, interfaceC1051iMo1167j2));
                }
                return c1045c;
            case 2:
                C1269g c1269g = (C1269g) obj2;
                return AbstractC2352g.m4195h(c1269g.f4563e, AbstractC1250C.m2311a(c1269g.f4562d, AbstractC1250C.f4463a, (C1995b) obj));
            case 3:
                return Integer.valueOf(((C1962l) obj2).f6643a);
            case 4:
                C1966p c1966p = (C1966p) obj2;
                return AbstractC2352g.m4195h(Float.valueOf(c1966p.f6647a), Float.valueOf(c1966p.f6648b));
            case 5:
                C1995b c1995b = (C1995b) obj;
                C1967q c1967q = (C1967q) obj2;
                C2019o c2019o = new C2019o(c1967q.f6650a);
                C1249B c1249b = AbstractC1250C.f4484v;
                return AbstractC2352g.m4195h(AbstractC1250C.m2311a(c2019o, c1249b, c1995b), AbstractC1250C.m2311a(new C2019o(c1967q.f6651b), c1249b, c1995b));
            case 6:
                return Integer.valueOf(((C1587l) obj2).f5507d);
            case 7:
                C1274l c1274l = (C1274l) obj2;
                return AbstractC2352g.m4195h(c1274l.f4578a, AbstractC1250C.m2311a(c1274l.f4579b, AbstractC1250C.f4471i, (C1995b) obj));
            case 8:
                return Float.valueOf(((C1951a) obj2).f6619a);
            case 9:
                C1995b c1995b2 = (C1995b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(AbstractC1250C.m2311a((C1267e) list.get(i5), AbstractC1250C.f4464b, c1995b2));
                }
                return arrayList;
            case 10:
                C1259L c1259l = (C1259L) obj2;
                return AbstractC2352g.m4195h(Integer.valueOf((int) (c1259l.f4538a >> 32)), Integer.valueOf((int) (c1259l.f4538a & 4294967295L)));
            case 11:
                C1995b c1995b3 = (C1995b) obj;
                C2737L c2737l = (C2737L) obj2;
                return AbstractC2352g.m4195h(AbstractC1250C.m2311a(new C2762u(c2737l.f8704a), AbstractC1250C.f4478p, c1995b3), AbstractC1250C.m2311a(new C2683b(c2737l.f8705b), AbstractC1250C.f4486x, c1995b3), Float.valueOf(c2737l.f8706c));
            case 12:
                return Integer.valueOf(((C1961k) obj2).f6639a);
            case 13:
                return Integer.valueOf(((C1963m) obj2).f6644a);
            case 14:
                return Integer.valueOf(((C1954d) obj2).f6623a);
            case 15:
                return Integer.valueOf(((C1585j) obj2).f5499a);
            case 16:
                return Integer.valueOf(((C1586k) obj2).f5500a);
            case 17:
                C2019o c2019o2 = (C2019o) obj2;
                return c2019o2 != null ? C2019o.m3708a(c2019o2.f6748a, C2019o.f6747c) : false ? Boolean.FALSE : AbstractC2352g.m4195h(Float.valueOf(C2019o.m3710c(c2019o2.f6748a)), AbstractC1250C.m2311a(new C2020p(C2019o.m3709b(c2019o2.f6748a)), AbstractC1250C.f4485w, (C1995b) obj));
            case 18:
                C1273k c1273k = (C1273k) obj2;
                return AbstractC2352g.m4195h(c1273k.f4576a, AbstractC1250C.m2311a(c1273k.f4577b, AbstractC1250C.f4471i, (C1995b) obj));
            case 19:
                long j5 = ((C2020p) obj2).f6749a;
                if (C2020p.m3712a(j5, 8589934592L)) {
                    return 0;
                }
                if (C2020p.m3712a(j5, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 20:
                C2683b c2683b = (C2683b) obj2;
                return c2683b != null ? C2683b.m4644b(c2683b.f8556a, 9205357640488583168L) : false ? Boolean.FALSE : AbstractC2352g.m4195h(Float.valueOf(Float.intBitsToFloat((int) (c2683b.f8556a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (c2683b.f8556a & 4294967295L))));
            case 21:
                C1995b c1995b4 = (C1995b) obj;
                C1267e c1267e = (C1267e) obj2;
                Object obj3 = c1267e.f4557a;
                if (obj3 instanceof C1282t) {
                    enumC1271i = EnumC1271i.f4567d;
                } else if (obj3 instanceof C1252E) {
                    enumC1271i = EnumC1271i.f4568e;
                } else if (obj3 instanceof C1262O) {
                    enumC1271i = EnumC1271i.f4569f;
                } else if (obj3 instanceof C1261N) {
                    enumC1271i = EnumC1271i.f4570g;
                } else if (obj3 instanceof C1274l) {
                    enumC1271i = EnumC1271i.f4571h;
                } else if (obj3 instanceof C1273k) {
                    enumC1271i = EnumC1271i.f4572i;
                } else {
                    if (!(obj3 instanceof C1254G)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC1271i = EnumC1271i.f4573j;
                }
                switch (enumC1271i.ordinal()) {
                    case 0:
                        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objM2311a = AbstractC1250C.m2311a((C1282t) obj3, AbstractC1250C.f4469g, c1995b4);
                        break;
                    case BuildConfig.VERSION_CODE /* 1 */:
                        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objM2311a = AbstractC1250C.m2311a((C1252E) obj3, AbstractC1250C.f4470h, c1995b4);
                        break;
                    case 2:
                        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objM2311a = AbstractC1250C.m2311a((C1262O) obj3, AbstractC1250C.f4465c, c1995b4);
                        break;
                    case 3:
                        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objM2311a = AbstractC1250C.m2311a((C1261N) obj3, AbstractC1250C.f4466d, c1995b4);
                        break;
                    case 4:
                        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objM2311a = AbstractC1250C.m2311a((C1274l) obj3, AbstractC1250C.f4467e, c1995b4);
                        break;
                    case 5:
                        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objM2311a = AbstractC1250C.m2311a((C1273k) obj3, AbstractC1250C.f4468f, c1995b4);
                        break;
                    case 6:
                        AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objM2311a = ((C1254G) obj3).f4513a;
                        break;
                    default:
                        throw new C0330q();
                }
                return AbstractC2352g.m4195h(enumC1271i, objM2311a, Integer.valueOf(c1267e.f4558b), Integer.valueOf(c1267e.f4559c), c1267e.f4560d);
            case 22:
                C1995b c1995b5 = (C1995b) obj;
                List list2 = ((C1781b) obj2).f6090d;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(AbstractC1250C.m2311a((C1780a) list2.get(i6), AbstractC1250C.f4488z, c1995b5));
                }
                return arrayList2;
            case 23:
                return ((C1780a) obj2).f6088a.toLanguageTag();
            case 24:
                C1995b c1995b6 = (C1995b) obj;
                C1959i c1959i = (C1959i) obj2;
                return AbstractC2352g.m4195h(AbstractC1250C.m2311a(new C1956f(c1959i.f6633a), AbstractC1250C.f4460B, c1995b6), AbstractC1250C.m2311a(new C1958h(c1959i.f6634b), AbstractC1250C.f4461C, c1995b6), AbstractC1250C.m2311a(new C1957g(c1959i.f6635c), AbstractC1250C.f4462D, c1995b6));
            case 25:
                return Float.valueOf(((C1956f) obj2).f6629a);
            case 26:
                return Integer.valueOf(((C1958h) obj2).f6631a);
            case 27:
                return Integer.valueOf(((C1957g) obj2).f6630a);
            case 28:
                return ((C1262O) obj2).f4544a;
            default:
                C1995b c1995b7 = (C1995b) obj;
                C1282t c1282t = (C1282t) obj2;
                Object objM2311a2 = AbstractC1250C.m2311a(new C1961k(c1282t.f4605a), AbstractC1250C.f4479q, c1995b7);
                Object objM2311a3 = AbstractC1250C.m2311a(new C1963m(c1282t.f4606b), AbstractC1250C.f4480r, c1995b7);
                Object objM2311a4 = AbstractC1250C.m2311a(new C2019o(c1282t.f4607c), AbstractC1250C.f4484v, c1995b7);
                C1967q c1967q2 = c1282t.f4608d;
                C1967q c1967q3 = C1967q.f6649c;
                Object objM2311a5 = AbstractC1250C.m2311a(c1967q2, AbstractC1250C.f4474l, c1995b7);
                Object objM2311a6 = AbstractC1250C.m2311a(c1282t.f4609e, AbstractC1251D.f4489a, c1995b7);
                C1959i c1959i2 = c1282t.f4610f;
                C1959i c1959i3 = C1959i.f6632d;
                return AbstractC2352g.m4195h(objM2311a2, objM2311a3, objM2311a4, objM2311a5, objM2311a6, AbstractC1250C.m2311a(c1959i2, AbstractC1250C.f4459A, c1995b7), AbstractC1250C.m2311a(new C1955e(c1282t.f4611g), AbstractC1251D.f4491c, c1995b7), AbstractC1250C.m2311a(new C1954d(c1282t.f4612h), AbstractC1250C.f4481s, c1995b7), AbstractC1250C.m2311a(c1282t.f4613i, AbstractC1251D.f4492d, c1995b7));
        }
    }
}
