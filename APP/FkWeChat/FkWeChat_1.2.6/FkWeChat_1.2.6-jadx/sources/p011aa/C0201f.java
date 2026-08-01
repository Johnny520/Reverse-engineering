package p011aa;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import ga.AbstractC2622r1;
import gb.AbstractC2706r0;
import java.util.List;
import p010a9.InterfaceC0173a;
import p172l8.C4711r;
import p185m8.AbstractC5114x;
import p186m9.AbstractC5128i;
import p213oa.C5695f;
import p229p9.AbstractC6043u;
import p229p9.C6010j;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5985a1;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6055y0;
import p243q9.InterfaceC6333h;
import p273s9.C7222k0;
import p273s9.C7224l0;
import p273s9.C7226m0;
import sa.AbstractC7258h;

/* JADX INFO: renamed from: aa.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0201f extends C7222k0 implements InterfaceC0196a {

    /* JADX INFO: renamed from: S */
    public final boolean f531S;

    /* JADX INFO: renamed from: T */
    public final C4711r f532T;

    /* JADX INFO: renamed from: U */
    public AbstractC2706r0 f533U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0201f(InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, boolean z10, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1, InterfaceC6055y0 interfaceC6055y0, InterfaceC5986b.a aVar, boolean z11, C4711r c4711r) {
        super(interfaceC6019m, interfaceC6055y0, interfaceC6333h, enumC5996e0, abstractC6043u, z10, c5695f, aVar, interfaceC6003g1, false, false, false, false, false, false);
        if (interfaceC6019m == null) {
            m433N(0);
        }
        if (interfaceC6333h == null) {
            m433N(1);
        }
        if (enumC5996e0 == null) {
            m433N(2);
        }
        if (abstractC6043u == null) {
            m433N(3);
        }
        if (c5695f == null) {
            m433N(4);
        }
        if (interfaceC6003g1 == null) {
            m433N(5);
        }
        if (aVar == null) {
            m433N(6);
        }
        this.f533U = null;
        this.f531S = z11;
        this.f532T = c4711r;
    }

    /* JADX INFO: renamed from: N */
    private static /* synthetic */ void m433N(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case Opcodes.FCONST_0 /* 11 */:
                objArr[0] = "name";
                break;
            case 5:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.LDC /* 18 */:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case Opcodes.FCONST_2 /* 13 */:
                objArr[0] = "newOwner";
                break;
            case Opcodes.DCONST_0 /* 14 */:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case Opcodes.SIPUSH /* 17 */:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case Opcodes.ILOAD /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case Opcodes.LLOAD /* 22 */:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
                objArr[2] = "create";
                break;
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case Opcodes.ILOAD /* 21 */:
                break;
            case Opcodes.LLOAD /* 22 */:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static C0201f m434l1(InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, boolean z10, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1, boolean z11) {
        if (interfaceC6019m == null) {
            m433N(7);
        }
        if (interfaceC6333h == null) {
            m433N(8);
        }
        if (enumC5996e0 == null) {
            m433N(9);
        }
        if (abstractC6043u == null) {
            m433N(10);
        }
        if (c5695f == null) {
            m433N(11);
        }
        if (interfaceC6003g1 == null) {
            m433N(12);
        }
        return new C0201f(interfaceC6019m, interfaceC6333h, enumC5996e0, abstractC6043u, z10, c5695f, interfaceC6003g1, null, InterfaceC5986b.a.DECLARATION, z11, null);
    }

    @Override // p273s9.C7222k0, p229p9.InterfaceC6042t1
    /* JADX INFO: renamed from: E */
    public boolean mo435E() {
        AbstractC2706r0 type = getType();
        if (this.f531S && C6010j.m24016a(type)) {
            return !AbstractC2622r1.m9317i(type) || AbstractC5128i.m20889w0(type);
        }
        return false;
    }

    @Override // p273s9.AbstractC7246w0, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: L */
    public boolean mo418L() {
        return false;
    }

    @Override // p273s9.C7222k0, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: Q */
    public Object mo436Q(InterfaceC5983a.a aVar) {
        C4711r c4711r = this.f532T;
        if (c4711r == null || !((InterfaceC5983a.a) c4711r.m18795e()).equals(aVar)) {
            return null;
        }
        return this.f532T.m18796f();
    }

    @Override // p273s9.C7222k0
    /* JADX INFO: renamed from: V0 */
    public C7222k0 mo437V0(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC6055y0 interfaceC6055y0, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1) {
        if (interfaceC6019m == null) {
            m433N(13);
        }
        if (enumC5996e0 == null) {
            m433N(14);
        }
        if (abstractC6043u == null) {
            m433N(15);
        }
        if (aVar == null) {
            m433N(16);
        }
        if (c5695f == null) {
            m433N(17);
        }
        if (interfaceC6003g1 == null) {
            m433N(18);
        }
        return new C0201f(interfaceC6019m, getAnnotations(), enumC5996e0, abstractC6043u, mo12681n0(), c5695f, interfaceC6003g1, interfaceC6055y0, aVar, this.f531S, this.f532T);
    }

    @Override // p011aa.InterfaceC0196a
    /* JADX INFO: renamed from: f0 */
    public InterfaceC0196a mo413f0(AbstractC2706r0 abstractC2706r0, List list, AbstractC2706r0 abstractC2706r02, C4711r c4711r) {
        C7224l0 c7224l0;
        C7226m0 c7226m0;
        if (list == null) {
            m433N(19);
        }
        if (abstractC2706r02 == null) {
            m433N(20);
        }
        InterfaceC6055y0 interfaceC6055y0Mo12664a = mo12664a() == this ? null : mo12664a();
        C0201f c0201f = new C0201f(mo7443b(), getAnnotations(), mo5592p(), mo5587g(), mo12681n0(), getName(), getSource(), interfaceC6055y0Mo12664a, mo12678j(), this.f531S, c4711r);
        C7224l0 c7224l0M28522X0 = mo12676h();
        if (c7224l0M28522X0 != null) {
            C7224l0 c7224l02 = new C7224l0(c0201f, c7224l0M28522X0.getAnnotations(), c7224l0M28522X0.mo5592p(), c7224l0M28522X0.mo5587g(), c7224l0M28522X0.mo24110Z(), c7224l0M28522X0.mo7416C(), c7224l0M28522X0.mo7422k(), mo12678j(), interfaceC6055y0Mo12664a == null ? null : interfaceC6055y0Mo12664a.mo12676h(), c7224l0M28522X0.getSource());
            c7224l02.m28509S0(c7224l0M28522X0.mo24120j0());
            c7224l02.m28556V0(abstractC2706r02);
            c7224l0 = c7224l02;
        } else {
            c7224l0 = null;
        }
        InterfaceC5985a1 interfaceC5985a1Mo12677i = mo12677i();
        if (interfaceC5985a1Mo12677i != null) {
            c7226m0 = new C7226m0(c0201f, interfaceC5985a1Mo12677i.getAnnotations(), interfaceC5985a1Mo12677i.mo5592p(), interfaceC5985a1Mo12677i.mo5587g(), interfaceC5985a1Mo12677i.mo24110Z(), interfaceC5985a1Mo12677i.mo7416C(), interfaceC5985a1Mo12677i.mo7422k(), mo12678j(), interfaceC6055y0Mo12664a == null ? null : interfaceC6055y0Mo12664a.mo12677i(), interfaceC5985a1Mo12677i.getSource());
            c7226m0.m28509S0(c7226m0.mo24120j0());
            c7226m0.m28562W0((InterfaceC6039s1) interfaceC5985a1Mo12677i.mo12680m().get(0));
        } else {
            c7226m0 = null;
        }
        c0201f.m28525b1(c7224l0, c7226m0, mo12684u0(), mo12683r0());
        c0201f.m28528g1(m28526c1());
        InterfaceC0173a interfaceC0173a = this.f24110x;
        if (interfaceC0173a != null) {
            c0201f.m28685Q0(this.f24109w, interfaceC0173a);
        }
        c0201f.mo12635B0(mo12674e());
        c0201f.m28529h1(abstractC2706r02, getTypeParameters(), mo12679k0(), abstractC2706r0 != null ? AbstractC7258h.m28725i(this, abstractC2706r0, InterfaceC6333h.f19873o.m25003b()) : null, AbstractC5114x.m20800o());
        return c0201f;
    }

    @Override // p273s9.C7222k0
    /* JADX INFO: renamed from: f1 */
    public void mo438f1(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m433N(22);
        }
        this.f533U = abstractC2706r0;
    }
}
