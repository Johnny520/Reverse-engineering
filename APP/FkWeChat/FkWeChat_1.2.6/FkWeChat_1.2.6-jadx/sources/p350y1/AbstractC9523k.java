package p350y1;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.List;
import p215oc.C5729x;
import p265s1.InterfaceC7144t2;
import p350y1.AbstractC9520h;

/* JADX INFO: renamed from: y1.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9523k {

    /* JADX INFO: renamed from: a */
    public static final float[] f32467a = new float[0];

    /* JADX INFO: renamed from: a */
    public static final void m37246a(InterfaceC7144t2 interfaceC7144t2, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d19) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d20 = -d12;
        double d21 = d20 * dCos;
        double d22 = d13 * dSin;
        double d23 = (d21 * dSin2) - (d22 * dCos2);
        double d24 = d20 * dSin;
        double d25 = d13 * dCos;
        double d26 = (dSin2 * d24) + (dCos2 * d25);
        double d27 = d18 / ((double) iCeil);
        double d28 = d26;
        double d29 = d23;
        int i10 = 0;
        double d30 = d14;
        double d31 = d15;
        double d32 = d17;
        while (i10 < iCeil) {
            double d33 = d32 + d27;
            double dSin3 = Math.sin(d33);
            double dCos3 = Math.cos(d33);
            int i11 = i10;
            double d34 = (d10 + ((d12 * dCos) * dCos3)) - (d22 * dSin3);
            double d35 = d19;
            double d36 = d11 + (d12 * dSin * dCos3) + (d25 * dSin3);
            double d37 = (d21 * dSin3) - (d22 * dCos3);
            double d38 = (dSin3 * d24) + (dCos3 * d25);
            double d39 = d33 - d32;
            int i12 = iCeil;
            double dTan = Math.tan(d39 / ((double) 2));
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d35 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            interfaceC7144t2.mo28181n((float) (d30 + (d29 * dSin4)), (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d34, (float) d36);
            dSin = dSin;
            d27 = d27;
            d30 = d34;
            d31 = d36;
            i10 = i11 + 1;
            d32 = d33;
            d28 = d38;
            iCeil = i12;
            d29 = d37;
            dCos = dCos;
            d19 = d35;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m37247b(InterfaceC7144t2 interfaceC7144t2, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / ((double) Opcodes.GETFIELD)) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d22 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d23 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            m37247b(interfaceC7144t2, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        m37246a(interfaceC7144t2, (d33 * dCos) - (d34 * dSin), (d33 * dSin) + (d34 * dCos), d14, d15, d10, d11, d19, dAtan2, dAtan22);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC7144t2 m37248c(List list, InterfaceC7144t2 interfaceC7144t2) {
        int i10;
        float f10;
        int i11;
        AbstractC9520h abstractC9520h;
        float f11;
        float f12;
        float fM37205c;
        float fM37202d;
        float fM37204f;
        float fM37232f;
        float f13;
        float f14;
        float fM37233c;
        float fM37235e;
        float fM37236f;
        List list2 = list;
        InterfaceC7144t2 interfaceC7144t22 = interfaceC7144t2;
        int iMo28179l = interfaceC7144t22.mo28179l();
        interfaceC7144t22.mo28183p();
        interfaceC7144t22.mo28177j(iMo28179l);
        AbstractC9520h abstractC9520h2 = list2.isEmpty() ? AbstractC9520h.b.f32414c : (AbstractC9520h) list2.get(0);
        int size = list2.size();
        float f15 = 0.0f;
        int i12 = 0;
        float fM37183c = 0.0f;
        float fM37184d = 0.0f;
        float fM37209c = 0.0f;
        float fM37210d = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i12 < size) {
            AbstractC9520h abstractC9520h3 = (AbstractC9520h) list2.get(i12);
            if (abstractC9520h3 instanceof AbstractC9520h.b) {
                interfaceC7144t22.close();
                i10 = size;
                f10 = f15;
                i11 = i12;
                abstractC9520h = abstractC9520h3;
                fM37183c = f16;
                fM37209c = fM37183c;
                fM37184d = f17;
            } else {
                if (abstractC9520h3 instanceof AbstractC9520h.n) {
                    AbstractC9520h.n nVar = (AbstractC9520h.n) abstractC9520h3;
                    fM37209c += nVar.m37227c();
                    fM37210d += nVar.m37228d();
                    interfaceC7144t22.mo28174f(nVar.m37227c(), nVar.m37228d());
                    i10 = size;
                    f10 = f15;
                    i11 = i12;
                    f16 = fM37209c;
                    f17 = fM37210d;
                } else {
                    if (abstractC9520h3 instanceof AbstractC9520h.f) {
                        AbstractC9520h.f fVar = (AbstractC9520h.f) abstractC9520h3;
                        float fM37199c = fVar.m37199c();
                        float fM37200d = fVar.m37200d();
                        interfaceC7144t22.mo28180m(fVar.m37199c(), fVar.m37200d());
                        fM37209c = fM37199c;
                        f16 = fM37209c;
                        fM37210d = fM37200d;
                        f17 = fM37210d;
                    } else {
                        if (abstractC9520h3 instanceof AbstractC9520h.m) {
                            AbstractC9520h.m mVar = (AbstractC9520h.m) abstractC9520h3;
                            interfaceC7144t22.mo28185r(mVar.m37225c(), mVar.m37226d());
                            fM37209c += mVar.m37225c();
                            fM37232f = mVar.m37226d();
                        } else {
                            if (abstractC9520h3 instanceof AbstractC9520h.e) {
                                AbstractC9520h.e eVar = (AbstractC9520h.e) abstractC9520h3;
                                interfaceC7144t22.mo28186s(eVar.m37197c(), eVar.m37198d());
                                fM37202d = eVar.m37197c();
                                fM37204f = eVar.m37198d();
                            } else if (abstractC9520h3 instanceof AbstractC9520h.l) {
                                AbstractC9520h.l lVar = (AbstractC9520h.l) abstractC9520h3;
                                interfaceC7144t22.mo28185r(lVar.m37224c(), f15);
                                fM37209c += lVar.m37224c();
                            } else if (abstractC9520h3 instanceof AbstractC9520h.d) {
                                AbstractC9520h.d dVar = (AbstractC9520h.d) abstractC9520h3;
                                interfaceC7144t22.mo28186s(dVar.m37196c(), fM37210d);
                                fM37209c = dVar.m37196c();
                            } else if (abstractC9520h3 instanceof AbstractC9520h.r) {
                                AbstractC9520h.r rVar = (AbstractC9520h.r) abstractC9520h3;
                                interfaceC7144t22.mo28185r(f15, rVar.m37239c());
                                fM37232f = rVar.m37239c();
                            } else if (abstractC9520h3 instanceof AbstractC9520h.s) {
                                AbstractC9520h.s sVar = (AbstractC9520h.s) abstractC9520h3;
                                interfaceC7144t22.mo28186s(fM37209c, sVar.m37240c());
                                fM37210d = sVar.m37240c();
                            } else {
                                if (abstractC9520h3 instanceof AbstractC9520h.k) {
                                    AbstractC9520h.k kVar = (AbstractC9520h.k) abstractC9520h3;
                                    interfaceC7144t22.mo28176h(kVar.m37218c(), kVar.m37221f(), kVar.m37219d(), kVar.m37222g(), kVar.m37220e(), kVar.m37223h());
                                    fM37233c = kVar.m37219d() + fM37209c;
                                    fM37235e = kVar.m37222g() + fM37210d;
                                    fM37209c += kVar.m37220e();
                                    fM37236f = kVar.m37223h();
                                } else {
                                    if (abstractC9520h3 instanceof AbstractC9520h.c) {
                                        AbstractC9520h.c cVar = (AbstractC9520h.c) abstractC9520h3;
                                        interfaceC7144t2.mo28181n(cVar.m37190c(), cVar.m37193f(), cVar.m37191d(), cVar.m37194g(), cVar.m37192e(), cVar.m37195h());
                                        float fM37191d = cVar.m37191d();
                                        float fM37194g = cVar.m37194g();
                                        float fM37192e = cVar.m37192e();
                                        float fM37195h = cVar.m37195h();
                                        fM37209c = fM37192e;
                                        fM37210d = fM37195h;
                                        i10 = size;
                                        f10 = f15;
                                        i11 = i12;
                                        abstractC9520h = abstractC9520h3;
                                        fM37183c = fM37191d;
                                        fM37184d = fM37194g;
                                    } else if (abstractC9520h3 instanceof AbstractC9520h.p) {
                                        if (abstractC9520h2.m37181a()) {
                                            float f18 = fM37209c - fM37183c;
                                            f14 = fM37210d - fM37184d;
                                            f13 = f18;
                                        } else {
                                            f13 = f15;
                                            f14 = f13;
                                        }
                                        AbstractC9520h.p pVar = (AbstractC9520h.p) abstractC9520h3;
                                        interfaceC7144t2.mo28176h(f13, f14, pVar.m37233c(), pVar.m37235e(), pVar.m37234d(), pVar.m37236f());
                                        fM37233c = pVar.m37233c() + fM37209c;
                                        fM37235e = pVar.m37235e() + fM37210d;
                                        fM37209c += pVar.m37234d();
                                        fM37236f = pVar.m37236f();
                                    } else {
                                        if (abstractC9520h3 instanceof AbstractC9520h.h) {
                                            if (abstractC9520h2.m37181a()) {
                                                float f19 = 2;
                                                fM37209c = (fM37209c * f19) - fM37183c;
                                                fM37210d = (f19 * fM37210d) - fM37184d;
                                            }
                                            AbstractC9520h.h hVar = (AbstractC9520h.h) abstractC9520h3;
                                            interfaceC7144t2.mo28181n(fM37209c, fM37210d, hVar.m37205c(), hVar.m37207e(), hVar.m37206d(), hVar.m37208f());
                                            fM37205c = hVar.m37205c();
                                            float fM37207e = hVar.m37207e();
                                            float fM37206d = hVar.m37206d();
                                            float fM37208f = hVar.m37208f();
                                            fM37209c = fM37206d;
                                            fM37210d = fM37208f;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            abstractC9520h = abstractC9520h3;
                                            fM37184d = fM37207e;
                                        } else if (abstractC9520h3 instanceof AbstractC9520h.o) {
                                            AbstractC9520h.o oVar = (AbstractC9520h.o) abstractC9520h3;
                                            interfaceC7144t2.mo28171b(oVar.m37229c(), oVar.m37231e(), oVar.m37230d(), oVar.m37232f());
                                            fM37183c = oVar.m37229c() + fM37209c;
                                            fM37184d = oVar.m37231e() + fM37210d;
                                            fM37209c += oVar.m37230d();
                                            fM37232f = oVar.m37232f();
                                        } else if (abstractC9520h3 instanceof AbstractC9520h.g) {
                                            AbstractC9520h.g gVar = (AbstractC9520h.g) abstractC9520h3;
                                            interfaceC7144t2.mo28178k(gVar.m37201c(), gVar.m37203e(), gVar.m37202d(), gVar.m37204f());
                                            fM37183c = gVar.m37201c();
                                            fM37184d = gVar.m37203e();
                                            fM37202d = gVar.m37202d();
                                            fM37204f = gVar.m37204f();
                                        } else if (abstractC9520h3 instanceof AbstractC9520h.q) {
                                            if (abstractC9520h2.m37182b()) {
                                                f11 = fM37209c - fM37183c;
                                                f12 = fM37210d - fM37184d;
                                            } else {
                                                f11 = f15;
                                                f12 = f11;
                                            }
                                            AbstractC9520h.q qVar = (AbstractC9520h.q) abstractC9520h3;
                                            interfaceC7144t2.mo28171b(f11, f12, qVar.m37237c(), qVar.m37238d());
                                            fM37205c = f11 + fM37209c;
                                            float f20 = f12 + fM37210d;
                                            fM37209c += qVar.m37237c();
                                            fM37210d += qVar.m37238d();
                                            fM37184d = f20;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            abstractC9520h = abstractC9520h3;
                                        } else if (abstractC9520h3 instanceof AbstractC9520h.i) {
                                            if (abstractC9520h2.m37182b()) {
                                                float f21 = 2;
                                                fM37209c = (fM37209c * f21) - fM37183c;
                                                fM37210d = (f21 * fM37210d) - fM37184d;
                                            }
                                            AbstractC9520h.i iVar = (AbstractC9520h.i) abstractC9520h3;
                                            interfaceC7144t2.mo28178k(fM37209c, fM37210d, iVar.m37209c(), iVar.m37210d());
                                            float f22 = fM37209c;
                                            fM37209c = iVar.m37209c();
                                            fM37183c = f22;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            fM37184d = fM37210d;
                                            abstractC9520h = abstractC9520h3;
                                            fM37210d = iVar.m37210d();
                                        } else if (abstractC9520h3 instanceof AbstractC9520h.j) {
                                            AbstractC9520h.j jVar = (AbstractC9520h.j) abstractC9520h3;
                                            float fM37211c = jVar.m37211c() + fM37209c;
                                            float fM37212d = jVar.m37212d() + fM37210d;
                                            f10 = f15;
                                            abstractC9520h = abstractC9520h3;
                                            i10 = size;
                                            i11 = i12;
                                            m37247b(interfaceC7144t2, fM37209c, fM37210d, fM37211c, fM37212d, jVar.m37213e(), jVar.m37215g(), jVar.m37214f(), jVar.m37216h(), jVar.m37217i());
                                            fM37183c = fM37211c;
                                            fM37209c = fM37183c;
                                            fM37184d = fM37212d;
                                        } else {
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            abstractC9520h = abstractC9520h3;
                                            if (!(abstractC9520h instanceof AbstractC9520h.a)) {
                                                C5729x.m23182a();
                                                return null;
                                            }
                                            AbstractC9520h.a aVar = (AbstractC9520h.a) abstractC9520h;
                                            m37247b(interfaceC7144t2, fM37209c, fM37210d, aVar.m37183c(), aVar.m37184d(), aVar.m37185e(), aVar.m37187g(), aVar.m37186f(), aVar.m37188h(), aVar.m37189i());
                                            fM37183c = aVar.m37183c();
                                            fM37209c = fM37183c;
                                            fM37184d = aVar.m37184d();
                                        }
                                        fM37183c = fM37205c;
                                    }
                                    i12 = i11 + 1;
                                    interfaceC7144t22 = interfaceC7144t2;
                                    abstractC9520h2 = abstractC9520h;
                                    size = i10;
                                    f15 = f10;
                                    list2 = list;
                                }
                                fM37210d += fM37236f;
                                fM37183c = fM37233c;
                                fM37184d = fM37235e;
                            }
                            fM37210d = fM37204f;
                            fM37209c = fM37202d;
                        }
                        fM37210d += fM37232f;
                    }
                    i10 = size;
                    f10 = f15;
                    i11 = i12;
                }
                abstractC9520h = abstractC9520h3;
                i12 = i11 + 1;
                interfaceC7144t22 = interfaceC7144t2;
                abstractC9520h2 = abstractC9520h;
                size = i10;
                f15 = f10;
                list2 = list;
            }
            fM37210d = fM37184d;
            i12 = i11 + 1;
            interfaceC7144t22 = interfaceC7144t2;
            abstractC9520h2 = abstractC9520h;
            size = i10;
            f15 = f10;
            list2 = list;
        }
        return interfaceC7144t2;
    }
}
