package p273s9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2649c0;
import gb.AbstractC2655d2;
import gb.AbstractC2706r0;
import gb.C2663f2;
import gb.EnumC2691m2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0173a;
import p012ab.C0206c;
import p012ab.C0207d;
import p012ab.InterfaceC0209f;
import p213oa.C5695f;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5985a1;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6025o;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6049w;
import p229p9.InterfaceC6053x0;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6056z;
import p229p9.InterfaceC6057z0;
import p243q9.InterfaceC6333h;
import p244qb.C6380k;
import p254r5.C6494d0;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: s9.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7222k0 extends AbstractC7248x0 implements InterfaceC6055y0 {

    /* JADX INFO: renamed from: A */
    public Collection f23960A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC6055y0 f23961B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC5986b.a f23962C;

    /* JADX INFO: renamed from: D */
    public final boolean f23963D;

    /* JADX INFO: renamed from: E */
    public final boolean f23964E;

    /* JADX INFO: renamed from: F */
    public final boolean f23965F;

    /* JADX INFO: renamed from: G */
    public final boolean f23966G;

    /* JADX INFO: renamed from: H */
    public final boolean f23967H;

    /* JADX INFO: renamed from: I */
    public final boolean f23968I;

    /* JADX INFO: renamed from: J */
    public List f23969J;

    /* JADX INFO: renamed from: K */
    public InterfaceC5988b1 f23970K;

    /* JADX INFO: renamed from: L */
    public InterfaceC5988b1 f23971L;

    /* JADX INFO: renamed from: M */
    public List f23972M;

    /* JADX INFO: renamed from: N */
    public C7224l0 f23973N;

    /* JADX INFO: renamed from: O */
    public InterfaceC5985a1 f23974O;

    /* JADX INFO: renamed from: P */
    public boolean f23975P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC6049w f23976Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC6049w f23977R;

    /* JADX INFO: renamed from: y */
    public final EnumC5996e0 f23978y;

    /* JADX INFO: renamed from: z */
    public AbstractC6043u f23979z;

    /* JADX INFO: renamed from: s9.k0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC6019m f23980a;

        /* JADX INFO: renamed from: b */
        public EnumC5996e0 f23981b;

        /* JADX INFO: renamed from: c */
        public AbstractC6043u f23982c;

        /* JADX INFO: renamed from: f */
        public InterfaceC5986b.a f23985f;

        /* JADX INFO: renamed from: i */
        public InterfaceC5988b1 f23988i;

        /* JADX INFO: renamed from: k */
        public C5695f f23990k;

        /* JADX INFO: renamed from: l */
        public AbstractC2706r0 f23991l;

        /* JADX INFO: renamed from: d */
        public InterfaceC6055y0 f23983d = null;

        /* JADX INFO: renamed from: e */
        public boolean f23984e = false;

        /* JADX INFO: renamed from: g */
        public AbstractC2655d2 f23986g = AbstractC2655d2.f6976b;

        /* JADX INFO: renamed from: h */
        public boolean f23987h = true;

        /* JADX INFO: renamed from: j */
        public List f23989j = null;

        public a() {
            this.f23980a = C7222k0.this.mo7443b();
            this.f23981b = C7222k0.this.mo5592p();
            this.f23982c = C7222k0.this.mo5587g();
            this.f23985f = C7222k0.this.mo12678j();
            this.f23988i = C7222k0.this.f23970K;
            this.f23990k = C7222k0.this.getName();
            this.f23991l = C7222k0.this.getType();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m28531a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case Opcodes.FCONST_0 /* 11 */:
                case Opcodes.FCONST_2 /* 13 */:
                case Opcodes.DCONST_0 /* 14 */:
                case 16:
                case Opcodes.SIPUSH /* 17 */:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case Opcodes.LDC /* 18 */:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case Opcodes.FCONST_0 /* 11 */:
                case Opcodes.FCONST_2 /* 13 */:
                case Opcodes.DCONST_0 /* 14 */:
                case 16:
                case Opcodes.SIPUSH /* 17 */:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case Opcodes.LDC /* 18 */:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: n */
        public InterfaceC6055y0 m28544n() {
            return C7222k0.this.m28521W0(this);
        }

        /* JADX INFO: renamed from: o */
        public InterfaceC6057z0 m28545o() {
            InterfaceC6055y0 interfaceC6055y0 = this.f23983d;
            if (interfaceC6055y0 == null) {
                return null;
            }
            return interfaceC6055y0.mo12676h();
        }

        /* JADX INFO: renamed from: p */
        public InterfaceC5985a1 m28546p() {
            InterfaceC6055y0 interfaceC6055y0 = this.f23983d;
            if (interfaceC6055y0 == null) {
                return null;
            }
            return interfaceC6055y0.mo12677i();
        }

        /* JADX INFO: renamed from: q */
        public a m28547q(boolean z10) {
            this.f23987h = z10;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public a m28548r(InterfaceC5986b.a aVar) {
            if (aVar == null) {
                m28531a(10);
            }
            this.f23985f = aVar;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public a m28549s(EnumC5996e0 enumC5996e0) {
            if (enumC5996e0 == null) {
                m28531a(6);
            }
            this.f23981b = enumC5996e0;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public a m28550t(InterfaceC5986b interfaceC5986b) {
            this.f23983d = (InterfaceC6055y0) interfaceC5986b;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public a m28551u(InterfaceC6019m interfaceC6019m) {
            if (interfaceC6019m == null) {
                m28531a(0);
            }
            this.f23980a = interfaceC6019m;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public a m28552v(AbstractC2655d2 abstractC2655d2) {
            if (abstractC2655d2 == null) {
                m28531a(15);
            }
            this.f23986g = abstractC2655d2;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public a m28553w(AbstractC6043u abstractC6043u) {
            if (abstractC6043u == null) {
                m28531a(8);
            }
            this.f23982c = abstractC6043u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7222k0(InterfaceC6019m interfaceC6019m, InterfaceC6055y0 interfaceC6055y0, InterfaceC6333h interfaceC6333h, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, boolean z10, C5695f c5695f, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(interfaceC6019m, interfaceC6333h, c5695f, null, z10, interfaceC6003g1);
        if (interfaceC6019m == null) {
            m28513N(0);
        }
        if (interfaceC6333h == null) {
            m28513N(1);
        }
        if (enumC5996e0 == null) {
            m28513N(2);
        }
        if (abstractC6043u == null) {
            m28513N(3);
        }
        if (c5695f == null) {
            m28513N(4);
        }
        if (aVar == null) {
            m28513N(5);
        }
        if (interfaceC6003g1 == null) {
            m28513N(6);
        }
        this.f23960A = null;
        this.f23969J = Collections.EMPTY_LIST;
        this.f23978y = enumC5996e0;
        this.f23979z = abstractC6043u;
        this.f23961B = interfaceC6055y0 == null ? this : interfaceC6055y0;
        this.f23962C = aVar;
        this.f23963D = z11;
        this.f23964E = z12;
        this.f23965F = z13;
        this.f23966G = z14;
        this.f23967H = z15;
        this.f23968I = z16;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m28513N(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p273s9.C7222k0.m28513N(int):void");
    }

    /* JADX INFO: renamed from: U0 */
    public static C7222k0 m28515U0(InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, boolean z10, C5695f c5695f, InterfaceC5986b.a aVar, InterfaceC6003g1 interfaceC6003g1, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (interfaceC6019m == null) {
            m28513N(7);
        }
        if (interfaceC6333h == null) {
            m28513N(8);
        }
        if (enumC5996e0 == null) {
            m28513N(9);
        }
        if (abstractC6043u == null) {
            m28513N(10);
        }
        if (c5695f == null) {
            m28513N(11);
        }
        if (aVar == null) {
            m28513N(12);
        }
        if (interfaceC6003g1 == null) {
            m28513N(13);
        }
        return new C7222k0(interfaceC6019m, null, interfaceC6333h, enumC5996e0, abstractC6043u, z10, c5695f, aVar, interfaceC6003g1, z11, z12, z13, z14, z15, z16);
    }

    /* JADX INFO: renamed from: Z0 */
    public static InterfaceC6056z m28516Z0(C2663f2 c2663f2, InterfaceC6053x0 interfaceC6053x0) {
        if (c2663f2 == null) {
            m28513N(30);
        }
        if (interfaceC6053x0 == null) {
            m28513N(31);
        }
        if (interfaceC6053x0.mo24120j0() != null) {
            return interfaceC6053x0.mo24120j0().mo7503c(c2663f2);
        }
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public static AbstractC6043u m28517e1(AbstractC6043u abstractC6043u, InterfaceC5986b.a aVar) {
        return (aVar == InterfaceC5986b.a.FAKE_OVERRIDE && AbstractC6040t.m24078g(abstractC6043u.mo24055f())) ? AbstractC6040t.f18989h : abstractC6043u;
    }

    /* JADX INFO: renamed from: j1 */
    public static InterfaceC5988b1 m28518j1(C2663f2 c2663f2, InterfaceC6055y0 interfaceC6055y0, InterfaceC5988b1 interfaceC5988b1) {
        AbstractC2706r0 abstractC2706r0M9393p = c2663f2.m9393p(interfaceC5988b1.getType(), EnumC2691m2.f7043v);
        if (abstractC2706r0M9393p == null) {
            return null;
        }
        return new C7228n0(interfaceC6055y0, new C0206c(interfaceC6055y0, abstractC2706r0M9393p, ((InterfaceC0209f) interfaceC5988b1.getValue()).mo443a(), interfaceC5988b1.getValue()), interfaceC5988b1.getAnnotations());
    }

    /* JADX INFO: renamed from: k1 */
    public static InterfaceC5988b1 m28519k1(C2663f2 c2663f2, InterfaceC6055y0 interfaceC6055y0, InterfaceC5988b1 interfaceC5988b1) {
        AbstractC2706r0 abstractC2706r0M9393p = c2663f2.m9393p(interfaceC5988b1.getType(), EnumC2691m2.f7043v);
        if (abstractC2706r0M9393p == null) {
            return null;
        }
        return new C7228n0(interfaceC6055y0, new C0207d(interfaceC6055y0, abstractC2706r0M9393p, interfaceC5988b1.getValue()), interfaceC5988b1.getAnnotations());
    }

    @Override // p229p9.InterfaceC6055y0
    /* JADX INFO: renamed from: B */
    public List mo12671B() {
        ArrayList arrayList = new ArrayList(2);
        C7224l0 c7224l0 = this.f23973N;
        if (c7224l0 != null) {
            arrayList.add(c7224l0);
        }
        InterfaceC5985a1 interfaceC5985a1 = this.f23974O;
        if (interfaceC5985a1 != null) {
            arrayList.add(interfaceC5985a1);
        }
        return arrayList;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: B0 */
    public void mo12635B0(Collection collection) {
        if (collection == null) {
            m28513N(40);
        }
        this.f23960A = collection;
    }

    /* JADX INFO: renamed from: C */
    public boolean mo7416C() {
        return this.f23967H;
    }

    /* JADX INFO: renamed from: E */
    public boolean mo435E() {
        return this.f23964E;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: I0 */
    public boolean mo5573I0() {
        return this.f23966G;
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return interfaceC6025o.mo13746m(this, obj);
    }

    /* JADX INFO: renamed from: Q */
    public Object mo436Q(InterfaceC5983a.a aVar) {
        return null;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: R */
    public boolean mo5576R() {
        return this.f23965F;
    }

    @Override // p229p9.InterfaceC6045u1
    /* JADX INFO: renamed from: T */
    public boolean mo12672T() {
        return this.f23968I;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6055y0 mo12636M(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC5986b.a aVar, boolean z10) {
        InterfaceC6055y0 interfaceC6055y0M28544n = m28527d1().m28551u(interfaceC6019m).m28550t(null).m28549s(enumC5996e0).m28553w(abstractC6043u).m28548r(aVar).m28547q(z10).m28544n();
        if (interfaceC6055y0M28544n == null) {
            m28513N(42);
        }
        return interfaceC6055y0M28544n;
    }

    /* JADX INFO: renamed from: V0 */
    public C7222k0 mo437V0(InterfaceC6019m interfaceC6019m, EnumC5996e0 enumC5996e0, AbstractC6043u abstractC6043u, InterfaceC6055y0 interfaceC6055y0, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6003g1 interfaceC6003g1) {
        if (interfaceC6019m == null) {
            m28513N(32);
        }
        if (enumC5996e0 == null) {
            m28513N(33);
        }
        if (abstractC6043u == null) {
            m28513N(34);
        }
        if (aVar == null) {
            m28513N(35);
        }
        if (c5695f == null) {
            m28513N(36);
        }
        if (interfaceC6003g1 == null) {
            m28513N(37);
        }
        return new C7222k0(interfaceC6019m, interfaceC6055y0, getAnnotations(), enumC5996e0, abstractC6043u, mo12681n0(), c5695f, aVar, interfaceC6003g1, mo12686w0(), mo435E(), mo5576R(), mo5573I0(), mo7416C(), mo12672T());
    }

    /* JADX INFO: renamed from: W0 */
    public InterfaceC6055y0 m28521W0(a aVar) {
        InterfaceC5988b1 interfaceC5988b1;
        InterfaceC0173a interfaceC0173a;
        if (aVar == null) {
            m28513N(29);
        }
        C7222k0 c7222k0Mo437V0 = mo437V0(aVar.f23980a, aVar.f23981b, aVar.f23982c, aVar.f23983d, aVar.f23985f, aVar.f23990k, m28523Y0(aVar.f23984e, aVar.f23983d));
        List typeParameters = aVar.f23989j == null ? getTypeParameters() : aVar.f23989j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C2663f2 c2663f2M9348b = AbstractC2649c0.m9348b(typeParameters, aVar.f23986g, c7222k0Mo437V0, arrayList);
        AbstractC2706r0 abstractC2706r0 = aVar.f23991l;
        AbstractC2706r0 abstractC2706r0M9393p = c2663f2M9348b.m9393p(abstractC2706r0, EnumC2691m2.f7044w);
        if (abstractC2706r0M9393p == null) {
            return null;
        }
        AbstractC2706r0 abstractC2706r0M9393p2 = c2663f2M9348b.m9393p(abstractC2706r0, EnumC2691m2.f7043v);
        if (abstractC2706r0M9393p2 != null) {
            c7222k0Mo437V0.mo438f1(abstractC2706r0M9393p2);
        }
        InterfaceC5988b1 interfaceC5988b12 = aVar.f23988i;
        if (interfaceC5988b12 != null) {
            InterfaceC5988b1 interfaceC5988b1Mo7503c = interfaceC5988b12.mo7503c(c2663f2M9348b);
            if (interfaceC5988b1Mo7503c == null) {
                return null;
            }
            interfaceC5988b1 = interfaceC5988b1Mo7503c;
        } else {
            interfaceC5988b1 = null;
        }
        InterfaceC5988b1 interfaceC5988b13 = this.f23971L;
        InterfaceC5988b1 interfaceC5988b1M28519k1 = interfaceC5988b13 != null ? m28519k1(c2663f2M9348b, c7222k0Mo437V0, interfaceC5988b13) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f23969J.iterator();
        while (it.hasNext()) {
            InterfaceC5988b1 interfaceC5988b1M28518j1 = m28518j1(c2663f2M9348b, c7222k0Mo437V0, (InterfaceC5988b1) it.next());
            if (interfaceC5988b1M28518j1 != null) {
                arrayList2.add(interfaceC5988b1M28518j1);
            }
        }
        c7222k0Mo437V0.m28529h1(abstractC2706r0M9393p, arrayList, interfaceC5988b1, interfaceC5988b1M28519k1, arrayList2);
        C7224l0 c7224l0 = this.f23973N == null ? null : new C7224l0(c7222k0Mo437V0, this.f23973N.getAnnotations(), aVar.f23981b, m28517e1(this.f23973N.mo5587g(), aVar.f23985f), this.f23973N.mo24110Z(), this.f23973N.mo7416C(), this.f23973N.mo7422k(), aVar.f23985f, aVar.m28545o(), InterfaceC6003g1.f18958a);
        if (c7224l0 != null) {
            AbstractC2706r0 abstractC2706r0Mo12675f = this.f23973N.mo12675f();
            c7224l0.m28509S0(m28516Z0(c2663f2M9348b, this.f23973N));
            c7224l0.m28556V0(abstractC2706r0Mo12675f != null ? c2663f2M9348b.m9393p(abstractC2706r0Mo12675f, EnumC2691m2.f7044w) : null);
        }
        C7226m0 c7226m0 = this.f23974O == null ? null : new C7226m0(c7222k0Mo437V0, this.f23974O.getAnnotations(), aVar.f23981b, m28517e1(this.f23974O.mo5587g(), aVar.f23985f), this.f23974O.mo24110Z(), this.f23974O.mo7416C(), this.f23974O.mo7422k(), aVar.f23985f, aVar.m28546p(), InterfaceC6003g1.f18958a);
        if (c7226m0 != null) {
            List listM28594V0 = AbstractC7237s.m28594V0(c7226m0, this.f23974O.mo12680m(), c2663f2M9348b, false, false, null);
            if (listM28594V0 == null) {
                c7222k0Mo437V0.m28528g1(true);
                listM28594V0 = Collections.singletonList(C7226m0.m28560U0(c7226m0, AbstractC9211e.m35858m(aVar.f23980a).m20901I(), ((InterfaceC6039s1) this.f23974O.mo12680m().get(0)).getAnnotations()));
            }
            if (listM28594V0.size() != 1) {
                throw new IllegalStateException();
            }
            c7226m0.m28509S0(m28516Z0(c2663f2M9348b, this.f23974O));
            c7226m0.m28562W0((InterfaceC6039s1) listM28594V0.get(0));
        }
        InterfaceC6049w interfaceC6049w = this.f23976Q;
        C7235r c7235r = interfaceC6049w == null ? null : new C7235r(interfaceC6049w.getAnnotations(), c7222k0Mo437V0);
        InterfaceC6049w interfaceC6049w2 = this.f23977R;
        c7222k0Mo437V0.m28525b1(c7224l0, c7226m0, c7235r, interfaceC6049w2 == null ? null : new C7235r(interfaceC6049w2.getAnnotations(), c7222k0Mo437V0));
        if (aVar.f23987h) {
            C6380k c6380kM25378c = C6380k.m25378c();
            Iterator it2 = mo12674e().iterator();
            while (it2.hasNext()) {
                c6380kM25378c.add(((InterfaceC6055y0) it2.next()).mo7503c(c2663f2M9348b));
            }
            c7222k0Mo437V0.mo12635B0(c6380kM25378c);
        }
        if (mo435E() && (interfaceC0173a = this.f24110x) != null) {
            c7222k0Mo437V0.m28685Q0(this.f24109w, interfaceC0173a);
        }
        return c7222k0Mo437V0;
    }

    @Override // p229p9.InterfaceC6055y0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C7224l0 mo12676h() {
        return this.f23973N;
    }

    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC6003g1 m28523Y0(boolean z10, InterfaceC6055y0 interfaceC6055y0) {
        InterfaceC6003g1 source;
        if (z10) {
            if (interfaceC6055y0 == null) {
                interfaceC6055y0 = mo12664a();
            }
            source = interfaceC6055y0.getSource();
        } else {
            source = InterfaceC6003g1.f18958a;
        }
        if (source == null) {
            m28513N(28);
        }
        return source;
    }

    @Override // p273s9.AbstractC7227n, p273s9.AbstractC7225m, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: a */
    public InterfaceC6055y0 mo12664a() {
        InterfaceC6055y0 interfaceC6055y0 = this.f23961B;
        InterfaceC6055y0 interfaceC6055y0Mo12664a = interfaceC6055y0 == this ? this : interfaceC6055y0.mo12664a();
        if (interfaceC6055y0Mo12664a == null) {
            m28513N(38);
        }
        return interfaceC6055y0Mo12664a;
    }

    /* JADX INFO: renamed from: a1 */
    public void m28524a1(C7224l0 c7224l0, InterfaceC5985a1 interfaceC5985a1) {
        m28525b1(c7224l0, interfaceC5985a1, null, null);
    }

    /* JADX INFO: renamed from: b1 */
    public void m28525b1(C7224l0 c7224l0, InterfaceC5985a1 interfaceC5985a1, InterfaceC6049w interfaceC6049w, InterfaceC6049w interfaceC6049w2) {
        this.f23973N = c7224l0;
        this.f23974O = interfaceC5985a1;
        this.f23976Q = interfaceC6049w;
        this.f23977R = interfaceC6049w2;
    }

    @Override // p229p9.InterfaceC6009i1
    /* JADX INFO: renamed from: c */
    public InterfaceC6055y0 mo7503c(C2663f2 c2663f2) {
        if (c2663f2 == null) {
            m28513N(27);
        }
        return c2663f2.m9390k() ? this : m28527d1().m28552v(c2663f2.m9389j()).m28550t(mo12664a()).m28544n();
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m28526c1() {
        return this.f23975P;
    }

    /* JADX INFO: renamed from: d1 */
    public a m28527d1() {
        return new a();
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: e */
    public Collection mo12674e() {
        Collection collection = this.f23960A;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            m28513N(41);
        }
        return collection;
    }

    @Override // p273s9.AbstractC7246w0, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: f */
    public AbstractC2706r0 mo12675f() {
        AbstractC2706r0 type = getType();
        if (type == null) {
            m28513N(23);
        }
        return type;
    }

    /* JADX INFO: renamed from: f1 */
    public void mo438f1(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m28513N(14);
        }
    }

    @Override // p229p9.InterfaceC6031q
    /* JADX INFO: renamed from: g */
    public AbstractC6043u mo5587g() {
        AbstractC6043u abstractC6043u = this.f23979z;
        if (abstractC6043u == null) {
            m28513N(25);
        }
        return abstractC6043u;
    }

    /* JADX INFO: renamed from: g1 */
    public void m28528g1(boolean z10) {
        this.f23975P = z10;
    }

    @Override // p273s9.AbstractC7246w0, p229p9.InterfaceC5983a
    public List getTypeParameters() {
        List list = this.f23972M;
        if (list != null) {
            return list;
        }
        C6494d0.m25749a("typeParameters == null for ", this);
        return null;
    }

    /* JADX INFO: renamed from: h1 */
    public void m28529h1(AbstractC2706r0 abstractC2706r0, List list, InterfaceC5988b1 interfaceC5988b1, InterfaceC5988b1 interfaceC5988b12, List list2) {
        if (abstractC2706r0 == null) {
            m28513N(17);
        }
        if (list == null) {
            m28513N(18);
        }
        if (list2 == null) {
            m28513N(19);
        }
        m28674L0(abstractC2706r0);
        this.f23972M = new ArrayList(list);
        this.f23971L = interfaceC5988b12;
        this.f23970K = interfaceC5988b1;
        this.f23969J = list2;
    }

    @Override // p229p9.InterfaceC6055y0
    /* JADX INFO: renamed from: i */
    public InterfaceC5985a1 mo12677i() {
        return this.f23974O;
    }

    /* JADX INFO: renamed from: i1 */
    public void m28530i1(AbstractC6043u abstractC6043u) {
        if (abstractC6043u == null) {
            m28513N(20);
        }
        this.f23979z = abstractC6043u;
    }

    @Override // p229p9.InterfaceC5986b
    /* JADX INFO: renamed from: j */
    public InterfaceC5986b.a mo12678j() {
        InterfaceC5986b.a aVar = this.f23962C;
        if (aVar == null) {
            m28513N(39);
        }
        return aVar;
    }

    @Override // p273s9.AbstractC7246w0, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: k0 */
    public InterfaceC5988b1 mo12679k0() {
        return this.f23970K;
    }

    @Override // p229p9.InterfaceC5993d0
    /* JADX INFO: renamed from: p */
    public EnumC5996e0 mo5592p() {
        EnumC5996e0 enumC5996e0 = this.f23978y;
        if (enumC5996e0 == null) {
            m28513N(24);
        }
        return enumC5996e0;
    }

    @Override // p273s9.AbstractC7246w0, p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: q0 */
    public InterfaceC5988b1 mo12682q0() {
        return this.f23971L;
    }

    @Override // p229p9.InterfaceC6055y0
    /* JADX INFO: renamed from: r0 */
    public InterfaceC6049w mo12683r0() {
        return this.f23977R;
    }

    @Override // p229p9.InterfaceC6055y0
    /* JADX INFO: renamed from: u0 */
    public InterfaceC6049w mo12684u0() {
        return this.f23976Q;
    }

    @Override // p229p9.InterfaceC5983a
    /* JADX INFO: renamed from: v0 */
    public List mo12685v0() {
        List list = this.f23969J;
        if (list == null) {
            m28513N(22);
        }
        return list;
    }

    @Override // p229p9.InterfaceC6042t1
    /* JADX INFO: renamed from: w0 */
    public boolean mo12686w0() {
        return this.f23963D;
    }
}
