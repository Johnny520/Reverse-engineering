package p265s;

import gg.C1421q;
import gg.C1422r;
import gg.C1423s;
import gg.C1425u;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p116i.AbstractC1742d;
import p116i.C1760j;
import p116i.C1766l;
import p136j8.C2104o;
import p174m.C2595e3;
import p174m.C2621k2;
import p174m.InterfaceC2660u1;
import p201o.AbstractC3026b;
import p251r.C3641z;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: s.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3854r0 {

    /* JADX INFO: renamed from: a */
    public static final float f12620a = 2500;

    /* JADX INFO: renamed from: b */
    public static final float f12621b = 1500;

    /* JADX INFO: renamed from: c */
    public static final float f12622c = 50;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0184 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x019f */
    /* JADX DEBUG: Multi-variable search result rejected for r11v20, resolved type: m.k2 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v29, resolved type: m.k2 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v30, resolved type: m.k2 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v31, resolved type: m.k2 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v32, resolved type: m.k2 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v7, resolved type: m.k2 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v8, resolved type: m.k2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e2  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0170 -> B:18:0x0059). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8025a(C2621k2 c2621k2, int i9, int i10, InterfaceC4233c interfaceC4233c, AbstractC6038c abstractC6038c) {
        C3852q0 c3852q0;
        ?? M8027c;
        int i11;
        float fMo1601x0;
        float fMo1601x02;
        float fMo1601x03;
        C1421q c1421q;
        C1425u c1425u;
        C1423s c1423s;
        final int i12;
        final float f3;
        C1425u c1425u2;
        final C2621k2 c2621k22;
        float f10;
        float f11;
        int i13;
        C2621k2 c2621k23;
        C2621k2 c2621k24;
        C1766l c1766lM4374j;
        Float f12;
        boolean z9;
        C2595e3 c2595e3;
        int i14;
        C2621k2 c2621k25;
        final C1423s c1423s2;
        C3852q0 c3852q02;
        C2621k2 c2621k26;
        float fMax;
        final int i15;
        final C1425u c1425u3;
        final C1421q c1421q2;
        final float f13;
        int i16;
        C2621k2 c2621k27;
        int i17 = i9;
        if (abstractC6038c instanceof C3852q0) {
            c3852q0 = (C3852q0) abstractC6038c;
            int i18 = c3852q0.f12615r;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                c3852q0.f12615r = i18 - Integer.MIN_VALUE;
            } else {
                c3852q0 = new C3852q0(abstractC6038c);
            }
        }
        Object obj = c3852q0.f12614q;
        int i19 = c3852q0.f12615r;
        float f14 = 0.0f;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i19 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (i17 < 0.0f) {
                AbstractC3026b.m6428a("Index should be non-negative");
            }
            try {
                fMo1601x0 = interfaceC4233c.mo1601x0(f12620a);
                fMo1601x02 = interfaceC4233c.mo1601x0(f12621b);
                fMo1601x03 = interfaceC4233c.mo1601x0(f12622c);
                c1421q = new C1421q();
                c1421q.f4734g = true;
                c1425u = new C1425u();
                c1425u.f4738g = AbstractC1742d.m4366b(0.0f, 0.0f, 30);
                M8027c = m8027c(c2621k2, i9);
            } catch (C3837j e6) {
                e = e6;
                M8027c = c2621k2;
            }
            try {
            } catch (C3837j e7) {
                e = e7;
                i11 = i17;
                c2621k24 = M8027c;
            }
            if (M8027c != 0) {
                throw new C3837j(C2621k2.m6076b(c2621k2, i9), (C1766l) c1425u.f4738g);
            }
            int i20 = i17 > ((C3641z) c2621k2.f8532c).m7621h() ? 1 : 0;
            c1423s = new C1423s();
            c1423s.f4736g = 1;
            i12 = i10;
            f3 = fMo1601x02;
            c1425u2 = c1425u;
            c2621k22 = c2621k2;
            f10 = fMo1601x0;
            f11 = fMo1601x03;
            i13 = i20;
            c1423s2 = c1423s;
            if (c1421q.f4734g) {
            }
            return C3967n.f12976a;
        }
        if (i19 != 1) {
            if (i19 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = c3852q0.f12608k;
            C2621k2 c2621k28 = c3852q0.f12604g;
            AbstractC1089i.m2732I0(obj);
            c2621k25 = c2621k28;
            ((C3641z) c2621k25.f8532c).m7625n(i14, true);
            return C3967n.f12976a;
        }
        i13 = c3852q0.f12610m;
        float f15 = c3852q0.f12613p;
        float f16 = c3852q0.f12612o;
        f10 = c3852q0.f12611n;
        int i21 = c3852q0.f12609l;
        int i22 = c3852q0.f12608k;
        c1423s = c3852q0.f12607j;
        C1425u c1425u4 = c3852q0.f12606i;
        C1421q c1421q3 = c3852q0.f12605h;
        C2621k2 c2621k29 = c3852q0.f12604g;
        try {
            AbstractC1089i.m2732I0(obj);
            c2621k27 = c2621k29;
            c1421q = c1421q3;
            f11 = f15;
            i17 = i22;
            f3 = f16;
            c1425u2 = c1425u4;
        } catch (C3837j e10) {
            e = e10;
            c2621k24 = c2621k29;
            i11 = i22;
        }
        try {
            try {
                c1423s.f4736g++;
                i12 = i21;
                f14 = 0.0f;
                c2621k22 = c2621k27;
            } catch (C3837j e11) {
                e = e11;
                i11 = i17;
                c2621k23 = c2621k22;
                c2621k24 = c2621k23;
                c1766lM4374j = AbstractC1742d.m4374j(e.f12572h, 0.0f);
                float f17 = e.f12571g;
                C1422r c1422r = new C1422r();
                f12 = new Float(f17);
                z9 = !(((Number) c1766lM4374j.f5900g.f5913b.invoke(c1766lM4374j.f5902i)).floatValue() != 0.0f);
                c2595e3 = new C2595e3(f17, c1422r, c2621k24, 1);
                c3852q0.f12604g = c2621k24;
                c3852q0.f12605h = null;
                c3852q0.f12606i = null;
                c3852q0.f12607j = null;
                c3852q0.f12608k = i11;
                c3852q0.f12615r = 2;
                if (AbstractC1742d.m4372h(c1766lM4374j, f12, null, z9, c2595e3, c3852q0, 2) != enumC5799a) {
                }
                return enumC5799a;
            }
            c1423s2 = c1423s;
        } catch (C3837j e12) {
            e = e12;
            i11 = i17;
            c2621k23 = c2621k27;
            c2621k24 = c2621k23;
            c1766lM4374j = AbstractC1742d.m4374j(e.f12572h, 0.0f);
            float f172 = e.f12571g;
            C1422r c1422r2 = new C1422r();
            f12 = new Float(f172);
            z9 = !(((Number) c1766lM4374j.f5900g.f5913b.invoke(c1766lM4374j.f5902i)).floatValue() != 0.0f);
            c2595e3 = new C2595e3(f172, c1422r2, c2621k24, 1);
            c3852q0.f12604g = c2621k24;
            c3852q0.f12605h = null;
            c3852q0.f12606i = null;
            c3852q0.f12607j = null;
            c3852q0.f12608k = i11;
            c3852q0.f12615r = 2;
            if (AbstractC1742d.m4372h(c1766lM4374j, f12, null, z9, c2595e3, c3852q0, 2) != enumC5799a) {
            }
            return enumC5799a;
        }
        if (c1421q.f4734g) {
            try {
            } catch (C3837j e13) {
                e = e13;
                i11 = i17;
                c3852q02 = c3852q0;
                c2621k26 = c2621k22;
            }
            if (((C3641z) c2621k22.f8532c).m7623j().f11749n > 0) {
                try {
                    try {
                        try {
                            int iM6076b = C2621k2.m6076b(c2621k22, i17);
                            if (Math.abs(iM6076b) >= f10) {
                                fMax = i13 != 0 ? f10 : -f10;
                            } else {
                                fMax = Math.max(Math.abs(iM6076b), f11);
                                if (i13 == 0) {
                                    fMax = -fMax;
                                }
                            }
                            C1766l c1766lM4374j2 = AbstractC1742d.m4374j((C1766l) c1425u2.f4738g, f14);
                            c1425u2.f4738g = c1766lM4374j2;
                            final C1422r c1422r3 = new C1422r();
                            Float f18 = new Float(fMax);
                            C1766l c1766l = (C1766l) c1425u2.f4738g;
                            boolean z10 = !(((Number) c1766l.f5900g.f5913b.invoke(c1766l.f5902i)).floatValue() == f14);
                            final boolean z11 = i13 != 0;
                            InterfaceC1231l interfaceC1231l = new InterfaceC1231l() { // from class: s.p0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
                                /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
                                /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
                                /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
                                /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
                                /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r3
  0x002e: PHI (r3v20 float) = (r3v7 float), (r3v24 float) binds: [B:11:0x003e, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // p085fg.InterfaceC1231l
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj2) {
                                    float fFloatValue;
                                    float f19;
                                    float fMo6077a;
                                    C2621k2 c2621k210 = c2621k22;
                                    C3641z c3641z = (C3641z) c2621k210.f8532c;
                                    C1760j c1760j = (C1760j) obj2;
                                    int i23 = i15;
                                    boolean zM8027c = AbstractC3854r0.m8027c(c2621k210, i23);
                                    C1421q c1421q4 = c1421q2;
                                    boolean z12 = z11;
                                    if (!zM8027c) {
                                        float f20 = f13;
                                        if (f20 > 0.0f) {
                                            fFloatValue = ((Number) c1760j.f5880e.getValue()).floatValue();
                                            if (fFloatValue <= f20) {
                                                f20 = fFloatValue;
                                            }
                                            C1422r c1422r4 = c1422r3;
                                            f19 = f20 - c1422r4.f4735g;
                                            fMo6077a = ((InterfaceC2660u1) c2621k210.f8531b).mo6077a(f19);
                                            if (!AbstractC3854r0.m8027c(c2621k210, i23) && !AbstractC3854r0.m8026b(z12, c2621k210, i23)) {
                                                if (f19 != fMo6077a) {
                                                    c1422r4.f4735g += f19;
                                                    float f21 = f3;
                                                    if (z12) {
                                                        if (((Number) c1760j.f5880e.getValue()).floatValue() > f21) {
                                                            c1760j.m4409a();
                                                        }
                                                    } else if (((Number) c1760j.f5880e.getValue()).floatValue() < (-f21)) {
                                                        c1760j.m4409a();
                                                    }
                                                    int i24 = c1423s2.f4736g;
                                                    int i25 = i12;
                                                    if (z12) {
                                                        if (i24 >= 2 && i23 - c2621k210.m6078c() > i25) {
                                                            c3641z.m7625n(i23 - i25, true);
                                                        }
                                                    } else if (i24 >= 2 && c3641z.m7621h() - i23 > i25) {
                                                        c3641z.m7625n(i25 + i23, true);
                                                    }
                                                    if (!AbstractC3854r0.m8026b(z12, c2621k210, i23)) {
                                                        c3641z.m7625n(i23, true);
                                                        c1421q4.f4734g = false;
                                                        c1760j.m4409a();
                                                    } else if (AbstractC3854r0.m8027c(c2621k210, i23)) {
                                                        throw new C3837j(C2621k2.m6076b(c2621k210, i23), (C1766l) c1425u3.f4738g);
                                                    }
                                                } else {
                                                    c1760j.m4409a();
                                                    c1421q4.f4734g = false;
                                                }
                                            } else if (!AbstractC3854r0.m8026b(z12, c2621k210, i23)) {
                                            }
                                        } else {
                                            fFloatValue = ((Number) c1760j.f5880e.getValue()).floatValue();
                                            if (fFloatValue >= f20) {
                                            }
                                            C1422r c1422r42 = c1422r3;
                                            f19 = f20 - c1422r42.f4735g;
                                            fMo6077a = ((InterfaceC2660u1) c2621k210.f8531b).mo6077a(f19);
                                            if (!AbstractC3854r0.m8027c(c2621k210, i23)) {
                                                if (f19 != fMo6077a) {
                                                }
                                            }
                                        }
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c3852q0.f12604g = c2621k26;
                            c3852q0.f12605h = c1421q2;
                            c3852q0.f12606i = c1425u4;
                            c3852q0.f12607j = c1423s2;
                            c3852q0.f12608k = i11;
                            c3852q0.f12609l = i16;
                            c3852q0.f12611n = f10;
                            c3852q0.f12612o = f16;
                            c3852q0.f12613p = f11;
                            c3852q0.f12610m = i13;
                            c3852q0.f12615r = 1;
                            if (AbstractC1742d.m4372h(c1766lM4374j2, f18, null, z10, interfaceC1231l, c3852q02, 2) != enumC5799a) {
                                c1423s = c1423s2;
                                i17 = i11;
                                c1421q = c1421q2;
                                c3852q0 = c3852q02;
                                c2621k27 = c2621k26;
                                i21 = i16;
                                f3 = f16;
                                c1425u2 = c1425u4;
                                c1423s.f4736g++;
                                i12 = i21;
                                f14 = 0.0f;
                                c2621k22 = c2621k27;
                                c1423s2 = c1423s;
                                if (c1421q.f4734g) {
                                }
                            }
                        } catch (C3837j e14) {
                            e = e14;
                            c3852q0 = c3852q02;
                            c2621k24 = c2621k26;
                            c1766lM4374j = AbstractC1742d.m4374j(e.f12572h, 0.0f);
                            float f1722 = e.f12571g;
                            C1422r c1422r22 = new C1422r();
                            f12 = new Float(f1722);
                            z9 = !(((Number) c1766lM4374j.f5900g.f5913b.invoke(c1766lM4374j.f5902i)).floatValue() != 0.0f);
                            c2595e3 = new C2595e3(f1722, c1422r22, c2621k24, 1);
                            c3852q0.f12604g = c2621k24;
                            c3852q0.f12605h = null;
                            c3852q0.f12606i = null;
                            c3852q0.f12607j = null;
                            c3852q0.f12608k = i11;
                            c3852q0.f12615r = 2;
                            if (AbstractC1742d.m4372h(c1766lM4374j, f12, null, z9, c2595e3, c3852q0, 2) != enumC5799a) {
                            }
                            return enumC5799a;
                        }
                        c3852q02 = c3852q0;
                    } catch (C3837j e15) {
                        e = e15;
                        c2621k24 = c2621k22;
                        i11 = i15;
                    }
                    i15 = i17;
                    c1425u3 = c1425u2;
                    c1421q2 = c1421q;
                    f13 = fMax;
                } catch (C3837j e16) {
                    e = e16;
                    c2621k24 = c2621k26;
                }
                c2621k26 = c2621k22;
                i11 = i15;
                f16 = f3;
                i16 = i12;
                c1425u4 = c1425u3;
                return enumC5799a;
            }
        }
        return C3967n.f12976a;
        c1766lM4374j = AbstractC1742d.m4374j(e.f12572h, 0.0f);
        float f17222 = e.f12571g;
        C1422r c1422r222 = new C1422r();
        f12 = new Float(f17222);
        z9 = !(((Number) c1766lM4374j.f5900g.f5913b.invoke(c1766lM4374j.f5902i)).floatValue() != 0.0f);
        c2595e3 = new C2595e3(f17222, c1422r222, c2621k24, 1);
        c3852q0.f12604g = c2621k24;
        c3852q0.f12605h = null;
        c3852q0.f12606i = null;
        c3852q0.f12607j = null;
        c3852q0.f12608k = i11;
        c3852q0.f12615r = 2;
        if (AbstractC1742d.m4372h(c1766lM4374j, f12, null, z9, c2595e3, c3852q0, 2) != enumC5799a) {
            i14 = i11;
            c2621k25 = c2621k24;
            ((C3641z) c2621k25.f8532c).m7625n(i14, true);
            return C3967n.f12976a;
        }
        return enumC5799a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m8026b(boolean z9, C2621k2 c2621k2, int i9) {
        C3641z c3641z = (C3641z) c2621k2.f8532c;
        if (z9) {
            if (c3641z.m7621h() > i9) {
                return true;
            }
            return c3641z.m7621h() == i9 && c3641z.m7622i() > 0;
        }
        if (c3641z.m7621h() < i9) {
            return true;
        }
        return c3641z.m7621h() == i9 && c3641z.m7622i() < 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m8027c(C2621k2 c2621k2, int i9) {
        return i9 <= c2621k2.m6078c() && ((C3641z) c2621k2.f8532c).m7621h() <= i9;
    }
}
