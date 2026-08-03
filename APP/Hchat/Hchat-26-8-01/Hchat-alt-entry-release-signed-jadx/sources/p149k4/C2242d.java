package p149k4;

import ac.C0058k;
import bsh.C0353j;
import java.io.IOException;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p014b.C0126e;
import p096g8.C1361b;
import p104h4.AbstractC1605s;
import p104h4.C1587a;
import p104h4.C1588b;
import p104h4.C1589c;
import p104h4.C1590d;
import p104h4.C1591e;
import p104h4.C1592f;
import p104h4.C1593g;
import p104h4.C1594h;
import p104h4.C1595i;
import p104h4.C1596j;
import p104h4.C1597k;
import p104h4.C1598l;
import p104h4.C1599m;
import p104h4.C1600n;
import p104h4.C1601o;
import p104h4.C1602p;
import p104h4.C1603q;
import p104h4.C1606t;
import p104h4.C1607u;
import p104h4.C1608v;
import p121i4.C1959b;
import p121i4.C1961c;
import p121i4.C1965f;
import p121i4.C1966g;
import p121i4.C1971l;
import p121i4.C1974o;
import p121i4.C1975p;
import p121i4.C1976q;
import p121i4.C1977r;
import p136j8.C2104o;
import p163l4.C2474c;
import p222p.AbstractC3199a;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4457f0;
import p311v4.C4447a0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4455e0;
import p311v4.C4462k;
import p311v4.C4465n;
import p311v4.C4466o;
import p311v4.C4473v;
import p311v4.C4475x;
import p311v4.C4477z;
import p326w4.C4682b;
import p326w4.InterfaceC4685e;
import p376z4.C6087a;
import p376z4.C6088b;

/* JADX INFO: renamed from: k4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2242d {

    /* JADX INFO: renamed from: a */
    public static final C2242d f7434a = new C2242d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C1977r m5484c(C1361b c1361b, C4455e0 c4455e0, int i9, boolean z9) {
        C4451c0 c4451c0;
        C4451c0 c4451c02;
        int i10 = i9 * 10;
        if (c1361b.f4512c != i10) {
            m5488g(i10 + 2);
            throw null;
        }
        C6087a c6087a = new C6087a(new C6088b(c1361b));
        C1977r c1977r = new C1977r(i9);
        for (int i11 = 0; i11 < i9; i11++) {
            try {
                int unsignedShort = c6087a.readUnsignedShort();
                int unsignedShort2 = c6087a.readUnsignedShort();
                int unsignedShort3 = c6087a.readUnsignedShort();
                int unsignedShort4 = c6087a.readUnsignedShort();
                int unsignedShort5 = c6087a.readUnsignedShort();
                C4451c0 c4451c03 = (C4451c0) c4455e0.m8906l(unsignedShort3);
                C4451c0 c4451c04 = (C4451c0) c4455e0.m8906l(unsignedShort4);
                if (z9) {
                    c4451c02 = null;
                    c4451c0 = c4451c04;
                } else {
                    c4451c0 = null;
                    c4451c02 = c4451c04;
                }
                c1977r.m10841m(i11, new C1976q(unsignedShort, unsignedShort2, c4451c03, c4451c02, c4451c0, unsignedShort5));
            } catch (IOException e6) {
                C0086a.m457p("shouldn't happen", e6);
                return null;
            }
        }
        c1977r.f24613g = false;
        return c1977r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C1597k m5485d(C2240b c2240b, int i9, int i10) {
        if (i10 >= 2) {
            return new C1597k("RuntimeInvisibleAnnotations", new C0126e(c2240b, i9, i10).m647y(2), i10);
        }
        m5489h();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1599m m5486e(C2240b c2240b, int i9, int i10) {
        if (i10 >= 2) {
            return new C1599m("RuntimeVisibleAnnotations", new C0126e(c2240b, i9, i10).m647y(1), i10);
        }
        m5489h();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1601o m5487f(C2240b c2240b, int i9, int i10) {
        if (i10 != 2) {
            m5488g(2);
            throw null;
        }
        C1361b c1361b = c2240b.f7416b;
        c2240b.m5480d();
        return new C1601o((C4451c0) c2240b.f7418d.m8906l(c1361b.m3659g(i9)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m5488g(int i9) {
        throw new C2474c("bad attribute length; expected length ".concat(AbstractC0000a.m48Y0(i9)), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m5489h() {
        throw new C2474c("severely truncated attribute", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC1605s m5490a(C2240b c2240b, int i9, int i10) {
        C2474c c2474c;
        if (c2240b == null) {
            C0353j.m1305c("cf == null");
            return null;
        }
        if (i9 < 0 || i9 >= 4) {
            C2104o.m5294t("bad context");
            return null;
        }
        C4451c0 c4451c0 = null;
        try {
            C1361b c1361b = c2240b.f7416b;
            c2240b.m5480d();
            C4455e0 c4455e0 = c2240b.f7418d;
            int iM3659g = c1361b.m3659g(i10);
            int iM3654b = c1361b.m3654b(i10 + 2);
            C4451c0 c4451c02 = (C4451c0) c4455e0.m8906l(iM3659g);
            try {
                return m5491b(c2240b, i9, c4451c02.f14760g, i10 + 6, iM3654b);
            } catch (C2474c e6) {
                c2474c = e6;
                c4451c0 = c4451c02;
                StringBuilder sb2 = new StringBuilder("...while parsing ");
                sb2.append(c4451c0 != null ? c4451c0.mo4901a().concat(" ") : HttpUrl.FRAGMENT_ENCODE_SET);
                sb2.append("attribute at offset ");
                sb2.append(AbstractC0000a.m48Y0(i10));
                c2474c.m2687a(sb2.toString());
                throw c2474c;
            }
        } catch (C2474c e7) {
            c2474c = e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r18v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [h4.u, z4.e, z4.j] */
    /* JADX INFO: renamed from: b */
    public final AbstractC1605s m5491b(C2240b c2240b, int i9, String str, int i10, int i11) {
        InterfaceC4685e c0058k;
        boolean z9 = false;
        AbstractC4446a abstractC4446a = null;
        if (i9 == 0) {
            int i12 = 4;
            if (str == "BootstrapMethods") {
                if (i11 < 2) {
                    m5489h();
                    throw null;
                }
                C1361b c1361b = c2240b.f7416b;
                int iM3659g = c1361b.m3659g(i10);
                int i13 = i10 + 2;
                int i14 = i11 - 2;
                c2240b.m5480d();
                C4455e0 c4455e0 = c2240b.f7418d;
                c2240b.m5480d();
                C4453d0 c4453d0 = c2240b.f7420f;
                C1961c c1961c = new C1961c(iM3659g);
                int i15 = 0;
                while (i15 < iM3659g) {
                    int i16 = i12;
                    if (i14 < i16) {
                        throw new C2474c("truncated attribute", null);
                    }
                    int iM3659g2 = c1361b.m3659g(i13);
                    int iM3659g3 = c1361b.m3659g(i13 + 2);
                    i13 += i16;
                    i14 -= 4;
                    if (i14 < iM3659g3 * 2) {
                        throw new C2474c("truncated attribute", null);
                    }
                    ?? c1607u = new C1607u(iM3659g3);
                    for (?? r14 = z9; r14 < iM3659g3; r14++) {
                        AbstractC4446a abstractC4446aM8906l = c4455e0.m8906l(c1361b.m3659g(i13));
                        if (!(abstractC4446aM8906l instanceof C4451c0) && !(abstractC4446aM8906l instanceof C4453d0) && !(abstractC4446aM8906l instanceof C4466o) && !(abstractC4446aM8906l instanceof C4473v) && !(abstractC4446aM8906l instanceof C4465n) && !(abstractC4446aM8906l instanceof C4462k) && !(abstractC4446aM8906l instanceof C4475x) && !(abstractC4446aM8906l instanceof C4447a0)) {
                            C2104o.m5294t(AbstractC3199a.m6838k(abstractC4446aM8906l.getClass(), "bad type for bootstrap argument: "));
                            return null;
                        }
                        c1607u.m10841m(r14, abstractC4446aM8906l);
                        i13 += 2;
                        i14 -= 2;
                        z9 = false;
                    }
                    c1607u.f24613g = z9;
                    c1961c.m10841m(i15, new C1959b(c4453d0, (C4475x) c4455e0.m8906l(iM3659g2), c1607u));
                    i15++;
                    z9 = false;
                    i12 = 4;
                }
                c1961c.f24613g = z9;
                if (i14 == 0) {
                    return new C1588b(c1961c);
                }
                m5488g(i14);
                throw null;
            }
            if (str == "Deprecated") {
                if (i11 == 0) {
                    return new C1591e("Deprecated", 0);
                }
                m5488g(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i11 != 4) {
                    m5488g(4);
                    throw null;
                }
                C1361b c1361b2 = c2240b.f7416b;
                c2240b.m5480d();
                C4455e0 c4455e02 = c2240b.f7418d;
                C4453d0 c4453d02 = (C4453d0) c4455e02.m8906l(c1361b2.m3659g(i10));
                int iM3659g4 = c1361b2.m3659g(i10 + 2);
                return new C1592f(c4453d02, (C4477z) (iM3659g4 == 0 ? null : c4455e02.m8906l(iM3659g4)));
            }
            if (str == "InnerClasses") {
                if (i11 < 2) {
                    m5489h();
                    throw null;
                }
                C1361b c1361b3 = c2240b.f7416b;
                c2240b.m5480d();
                C4455e0 c4455e03 = c2240b.f7418d;
                int iM3659g5 = c1361b3.m3659g(i10);
                int i17 = i10 + 2;
                int i18 = iM3659g5 * 8;
                if (i11 - 2 != i18) {
                    m5488g(i18 + 2);
                    throw null;
                }
                C1607u c1607u2 = new C1607u(iM3659g5);
                for (int i19 = 0; i19 < iM3659g5; i19++) {
                    int iM3659g6 = c1361b3.m3659g(i17);
                    int iM3659g7 = c1361b3.m3659g(i17 + 2);
                    int iM3659g8 = c1361b3.m3659g(i17 + 4);
                    c1607u2.m10841m(i19, new C1606t((C4453d0) c4455e03.m8906l(iM3659g6), (C4453d0) (iM3659g7 == 0 ? null : c4455e03.m8906l(iM3659g7)), (C4451c0) (iM3659g8 == 0 ? null : c4455e03.m8906l(iM3659g8)), c1361b3.m3659g(i17 + 6)));
                    i17 += 8;
                }
                c1607u2.f24613g = false;
                return new C1594h(c1607u2);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m5485d(c2240b, i10, i11);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m5486e(c2240b, i10, i11);
            }
            if (str == "Synthetic") {
                if (i11 == 0) {
                    return new C1591e("Synthetic", 1);
                }
                m5488g(0);
                throw null;
            }
            if (str == "Signature") {
                return m5487f(c2240b, i10, i11);
            }
            if (str == "SourceDebugExtension") {
                return new C1602p(new C4451c0(c2240b.f7416b.m3666n(i10, i10 + i11)));
            }
            if (str == "SourceFile") {
                if (i11 != 2) {
                    m5488g(2);
                    throw null;
                }
                C1361b c1361b4 = c2240b.f7416b;
                c2240b.m5480d();
                return new C1603q((C4451c0) c2240b.f7418d.m8906l(c1361b4.m3659g(i10)));
            }
        } else if (i9 == 1) {
            if (str == "ConstantValue") {
                if (i11 != 2) {
                    m5488g(2);
                    throw null;
                }
                C1361b c1361b5 = c2240b.f7416b;
                c2240b.m5480d();
                return new C1590d((AbstractC4457f0) c2240b.f7418d.m8906l(c1361b5.m3659g(i10)));
            }
            if (str == "Deprecated") {
                if (i11 == 0) {
                    return new C1591e("Deprecated", 0);
                }
                m5488g(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m5485d(c2240b, i10, i11);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m5486e(c2240b, i10, i11);
            }
            if (str == "Signature") {
                return m5487f(c2240b, i10, i11);
            }
            if (str == "Synthetic") {
                if (i11 == 0) {
                    return new C1591e("Synthetic", 1);
                }
                m5488g(0);
                throw null;
            }
        } else if (i9 == 2) {
            if (str == "AnnotationDefault") {
                if (i11 < 2) {
                    m5489h();
                    throw null;
                }
                C0126e c0126e = new C0126e(c2240b, i10, i11);
                try {
                    AbstractC4446a abstractC4446aM622B = c0126e.m622B();
                    if (((C6087a) c0126e.f333i).available() == 0) {
                        return new C1587a(i11, abstractC4446aM622B);
                    }
                    throw new C2474c("extra data in attribute", null);
                } catch (IOException e6) {
                    C0086a.m457p("shouldn't happen", e6);
                    return null;
                }
            }
            if (str == "Code") {
                if (i11 < 12) {
                    m5489h();
                    throw null;
                }
                C1361b c1361b6 = c2240b.f7416b;
                c2240b.m5480d();
                C4455e0 c4455e04 = c2240b.f7418d;
                int iM3659g9 = c1361b6.m3659g(i10);
                int iM3659g10 = c1361b6.m3659g(i10 + 2);
                int iM3654b = c1361b6.m3654b(i10 + 4);
                int i20 = i10 + 8;
                int i21 = i11 - 8;
                if (i21 < iM3654b + 4) {
                    throw new C2474c("truncated attribute", null);
                }
                int i22 = i20 + iM3654b;
                int i23 = i21 - iM3654b;
                C1971l c1971l = new C1971l(c1361b6.m3666n(i20, i22), c4455e04);
                int iM3659g11 = c1361b6.m3659g(i22);
                C1966g c1966g = iM3659g11 == 0 ? C1966g.f6678i : new C1966g(iM3659g11);
                int i24 = i22 + 2;
                int i25 = i23 - 2;
                if (i25 < (iM3659g11 * 8) + 2) {
                    throw new C2474c("truncated attribute", null);
                }
                int i26 = 0;
                while (i26 < iM3659g11) {
                    int iM3659g12 = c1361b6.m3659g(i24);
                    int iM3659g13 = c1361b6.m3659g(i24 + 2);
                    int iM3659g14 = c1361b6.m3659g(i24 + 4);
                    AbstractC4446a abstractC4446a2 = abstractC4446a;
                    int iM3659g15 = c1361b6.m3659g(i24 + 6);
                    AbstractC4446a abstractC4446aM8906l2 = iM3659g15 == 0 ? abstractC4446a2 : c4455e04.m8906l(iM3659g15);
                    c1966g.getClass();
                    c1966g.m10841m(i26, new C1965f(iM3659g12, iM3659g13, iM3659g14, (C4453d0) abstractC4446aM8906l2));
                    i24 += 8;
                    i25 -= 8;
                    i26++;
                    abstractC4446a = abstractC4446a2;
                }
                ?? r18 = abstractC4446a;
                c1966g.f24613g = false;
                C2239a c2239a = new C2239a(c2240b, 3, i24, this);
                c2239a.m5474a();
                C1607u c1607u3 = (C1607u) c2239a.f7414f;
                c1607u3.f24613g = false;
                c2239a.m5474a();
                int i27 = c2239a.f7411c - i24;
                if (i27 == i25) {
                    return new C1589c(iM3659g9, iM3659g10, c1971l, c1966g, c1607u3);
                }
                m5488g((i24 - i10) + i27);
                throw r18;
            }
            if (str == "Deprecated") {
                if (i11 == 0) {
                    return new C1591e("Deprecated", 0);
                }
                m5488g(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i11 < 2) {
                    m5489h();
                    throw null;
                }
                int iM3659g16 = c2240b.f7416b.m3659g(i10);
                int i28 = i10 + 2;
                int i29 = iM3659g16 * 2;
                if (i11 - 2 != i29) {
                    m5488g(i29 + 2);
                    throw null;
                }
                if (iM3659g16 == 0) {
                    c0058k = C4682b.f15591i;
                } else {
                    C4455e0 c4455e05 = c2240b.f7418d;
                    if (c4455e05 == null) {
                        C2104o.m5276A("pool not yet initialized");
                        return null;
                    }
                    c0058k = new C0058k(c2240b.f7416b, i28, iM3659g16, c4455e05);
                }
                return new C1593g(c0058k);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m5485d(c2240b, i10, i11);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m5486e(c2240b, i10, i11);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i11 >= 2) {
                    return new C1598l("RuntimeInvisibleParameterAnnotations", new C0126e(c2240b, i10, i11).m621A(2), i11);
                }
                m5489h();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i11 >= 2) {
                    return new C1600n("RuntimeVisibleParameterAnnotations", new C0126e(c2240b, i10, i11).m621A(1), i11);
                }
                m5489h();
                throw null;
            }
            if (str == "Signature") {
                return m5487f(c2240b, i10, i11);
            }
            if (str == "Synthetic") {
                if (i11 == 0) {
                    return new C1591e("Synthetic", 1);
                }
                m5488g(0);
                throw null;
            }
        } else if (i9 == 3) {
            if (str == "LineNumberTable") {
                if (i11 < 2) {
                    m5489h();
                    throw null;
                }
                C1361b c1361b7 = c2240b.f7416b;
                int iM3659g17 = c1361b7.m3659g(i10);
                int i30 = i10 + 2;
                int i31 = iM3659g17 * 4;
                if (i11 - 2 != i31) {
                    m5488g(i31 + 2);
                    throw null;
                }
                C1975p c1975p = new C1975p(iM3659g17);
                for (int i32 = 0; i32 < iM3659g17; i32++) {
                    c1975p.m10841m(i32, new C1974o(c1361b7.m3659g(i30), c1361b7.m3659g(i30 + 2)));
                    i30 += 4;
                }
                c1975p.f24613g = false;
                return new C1595i(c1975p);
            }
            if (str == "LocalVariableTable") {
                if (i11 < 2) {
                    m5489h();
                    throw null;
                }
                C1361b c1361b8 = c2240b.f7416b;
                int iM3659g18 = c1361b8.m3659g(i10);
                C1361b c1361bM3666n = c1361b8.m3666n(i10 + 2, i10 + i11);
                c2240b.m5480d();
                return new C1596j("LocalVariableTable", m5484c(c1361bM3666n, c2240b.f7418d, iM3659g18, false));
            }
            if (str == "LocalVariableTypeTable") {
                if (i11 < 2) {
                    m5489h();
                    throw null;
                }
                C1361b c1361b9 = c2240b.f7416b;
                int iM3659g19 = c1361b9.m3659g(i10);
                C1361b c1361bM3666n2 = c1361b9.m3666n(i10 + 2, i10 + i11);
                c2240b.m5480d();
                return new C1596j("LocalVariableTypeTable", m5484c(c1361bM3666n2, c2240b.f7418d, iM3659g19, true));
            }
        }
        C1361b c1361b10 = c2240b.f7416b;
        c2240b.m5480d();
        return new C1608v(str, c1361b10, i10, i11);
    }
}
