package p121i4;

import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p020b5.C0184c;
import p068eh.AbstractC0921a;
import p089g1.C1275d;
import p104h4.C1607u;
import p136j8.C2104o;
import p163l4.InterfaceC2473b;
import p295u4.AbstractC4256f;
import p295u4.AbstractC4269s;
import p295u4.C4255e;
import p295u4.C4257g;
import p295u4.C4260j;
import p295u4.C4262l;
import p295u4.C4263m;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4268r;
import p295u4.C4270t;
import p295u4.C4271u;
import p295u4.C4272v;
import p311v4.AbstractC4446a;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4460i;
import p311v4.C4464m;
import p311v4.C4466o;
import p311v4.C4476y;
import p311v4.C4477z;
import p326w4.C4681a;
import p326w4.C4682b;
import p326w4.C4683c;
import p326w4.InterfaceC4684d;
import p343x6.AbstractC5700d;
import p376z4.C6093g;

/* JADX INFO: renamed from: i4.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1958a0 {

    /* JADX INFO: renamed from: E */
    public static final C4476y f6629E = new C4476y(new C4453d0(C4683c.m9183n("java/lang/reflect/Array")), new C4477z(new C4451c0("newInstance"), new C4451c0("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    /* JADX INFO: renamed from: A */
    public boolean f6630A;

    /* JADX INFO: renamed from: B */
    public C1981v f6631B;

    /* JADX INFO: renamed from: C */
    public C4268r f6632C;

    /* JADX INFO: renamed from: D */
    public C4270t f6633D;

    /* JADX INFO: renamed from: a */
    public final C4681a f6634a;

    /* JADX INFO: renamed from: b */
    public InterfaceC4684d[] f6635b;

    /* JADX INFO: renamed from: c */
    public int f6636c;

    /* JADX INFO: renamed from: d */
    public C4683c f6637d;

    /* JADX INFO: renamed from: e */
    public int f6638e;

    /* JADX INFO: renamed from: f */
    public AbstractC4446a f6639f;

    /* JADX INFO: renamed from: g */
    public int f6640g;

    /* JADX INFO: renamed from: h */
    public C1973n f6641h;

    /* JADX INFO: renamed from: i */
    public ArrayList f6642i;

    /* JADX INFO: renamed from: j */
    public int f6643j;

    /* JADX INFO: renamed from: k */
    public boolean f6644k;

    /* JADX INFO: renamed from: l */
    public C4265o f6645l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC4684d[] f6646m;

    /* JADX INFO: renamed from: n */
    public int f6647n;

    /* JADX INFO: renamed from: o */
    public final C1985z f6648o;

    /* JADX INFO: renamed from: p */
    public final C1972m f6649p;

    /* JADX INFO: renamed from: q */
    public final C1607u f6650q;

    /* JADX INFO: renamed from: r */
    public final C4255e f6651r;

    /* JADX INFO: renamed from: s */
    public final int f6652s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f6653t;

    /* JADX INFO: renamed from: u */
    public C4682b f6654u;

    /* JADX INFO: renamed from: v */
    public boolean f6655v;

    /* JADX INFO: renamed from: w */
    public boolean f6656w;

    /* JADX INFO: renamed from: x */
    public int f6657x;

    /* JADX INFO: renamed from: y */
    public int f6658y;

    /* JADX INFO: renamed from: z */
    public boolean f6659z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1958a0(C1985z c1985z, C1972m c1972m, C1607u c1607u) {
        C4681a c4681aMo4875a = c1972m.f6687a.mo4875a();
        if (c4681aMo4875a == null) {
            C0353j.m1305c("prototype == null");
            throw null;
        }
        this.f6634a = c4681aMo4875a;
        this.f6635b = new InterfaceC4684d[10];
        this.f6646m = new InterfaceC4684d[6];
        m4848b();
        if (c1607u == null) {
            C0353j.m1305c("methods == null");
            throw null;
        }
        this.f6648o = c1985z;
        this.f6649p = c1972m;
        this.f6650q = c1607u;
        this.f6651r = C4255e.f13936a;
        this.f6652s = c1972m.f6689c.f5257c;
        this.f6653t = new ArrayList(25);
        this.f6654u = null;
        this.f6655v = false;
        this.f6656w = false;
        this.f6657x = -1;
        this.f6658y = 0;
        this.f6630A = false;
        this.f6632C = null;
        this.f6633D = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC4684d m4847a(int i9) {
        if (i9 >= this.f6636c) {
            C2104o.m5294t("n >= argCount");
            return null;
        }
        try {
            return this.f6635b[i9];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C2104o.m5294t("n < 0");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4848b() {
        this.f6636c = 0;
        this.f6637d = null;
        this.f6638e = 0;
        this.f6639f = null;
        this.f6640g = 0;
        this.f6641h = null;
        this.f6642i = null;
        this.f6643j = -1;
        this.f6644k = false;
        this.f6645l = null;
        this.f6647n = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C4265o m4849c(boolean z9) {
        if (this.f6645l == null) {
            return null;
        }
        if (this.f6647n != 1) {
            throw new C1960b0(AbstractC0921a.m2255r(new StringBuilder("local target with "), this.f6647n == 0 ? "no" : "multiple", " results"), null);
        }
        InterfaceC4684d interfaceC4684d = this.f6646m[0];
        C4683c type = interfaceC4684d.getType();
        C4683c type2 = this.f6645l.f13966h.getType();
        if (type == type2) {
            C4265o c4265o = this.f6645l;
            return z9 ? c4265o.m8566p(interfaceC4684d) : c4265o;
        }
        if (AbstractC5700d.m10252I(type2, type)) {
            if (type2 == C4683c.f15613E) {
                this.f6645l = this.f6645l.m8566p(interfaceC4684d);
            }
            return this.f6645l;
        }
        throw new C1960b0("local variable type mismatch: attempt to set or access a value of type " + type.mo4901a() + " using a local variable of type " + type2.mo4901a() + ". This is symptomatic of .class transformation tools that ignore local variable information.", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4850d(int i9, C0184c c0184c) {
        C1973n c1973n = (C1973n) c0184c.f470b;
        m4848b();
        if (i9 > this.f6635b.length) {
            this.f6635b = new InterfaceC4684d[i9 + 10];
        }
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            InterfaceC4684d[] interfaceC4684dArr = this.f6635b;
            c1973n.m10855j();
            InterfaceC4684d interfaceC4684dM4886o = c1973n.m4886o(0);
            InterfaceC4684d[] interfaceC4684dArr2 = (InterfaceC4684d[]) c1973n.f6694j;
            int i11 = c1973n.f6693i;
            int i12 = i11 - 1;
            interfaceC4684dArr2[i12] = null;
            ((boolean[]) c1973n.f6695k)[i12] = false;
            c1973n.f6693i = i11 - interfaceC4684dM4886o.getType().m9188i();
            interfaceC4684dArr[i10] = interfaceC4684dM4886o;
        }
        this.f6636c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4851e(C0184c c0184c, C4681a c4681a) {
        C4682b c4682b = c4681a.f15571i;
        int length = c4682b.f24601h.length;
        m4850d(length, c0184c);
        for (int i9 = 0; i9 < length; i9++) {
            if (!AbstractC5700d.m10252I((C4683c) c4682b.m10840l(i9), this.f6635b[i9])) {
                throw new C1960b0("at stack depth " + ((length - 1) - i9) + ", expected type " + ((C4683c) c4682b.m10840l(i9)).mo4901a() + " but found " + this.f6635b[i9].getType().mo4901a(), null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4852f(C0184c c0184c, C4683c c4683c) {
        m4850d(1, c0184c);
        if (AbstractC5700d.m10252I(c4683c, this.f6635b[0])) {
            return;
        }
        C1275d.m3411e(c4683c.mo4901a(), this.f6635b[0].getType().mo4901a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4853g(C0184c c0184c, C4683c c4683c, C4683c c4683c2) {
        m4850d(2, c0184c);
        if (!AbstractC5700d.m10252I(c4683c, this.f6635b[0])) {
            C1275d.m3411e(c4683c.mo4901a(), this.f6635b[0].getType().mo4901a());
        } else {
            if (AbstractC5700d.m10252I(c4683c2, this.f6635b[1])) {
                return;
            }
            C1275d.m3411e(c4683c2.mo4901a(), this.f6635b[1].getType().mo4901a());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v25, resolved type: w4.d */
    /* JADX DEBUG: Multi-variable search result rejected for r5v16, resolved type: w4.d */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:437:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4854h(int i9, int i10, C0184c c0184c) {
        C4266p c4266p;
        boolean z9;
        int i11;
        InterfaceC2473b interfaceC2473b;
        String str;
        int i12;
        C4270t c4270t;
        int i13;
        int i14;
        C4265o c4265o;
        C4263m c4263m;
        boolean z10;
        C4266p c4266p2;
        C4266p c4266p3;
        C1973n c1973n;
        ArrayList arrayList;
        AbstractC4446a abstractC4446a;
        Object c4263m2;
        Object c4262l;
        C4270t c4270t2;
        Object c4272v;
        C4265o c4265o2;
        int i15;
        C4453d0 c4453d0;
        C4272v c4272v2;
        C1973n c1973n2 = (C1973n) c0184c.f470b;
        AbstractC1978s abstractC1978s = (AbstractC1978s) c0184c.f469a;
        int iM9188i = this.f6652s + c1973n2.f6693i;
        int i16 = this.f6636c;
        boolean z11 = true;
        if (i16 == 0) {
            c4266p = C4266p.f13968i;
        } else {
            int i17 = this.f6643j;
            if (i17 >= 0) {
                c4266p = new C4266p(1);
                c4266p.m10841m(0, C4265o.m8557k(i17, m4847a(0), null));
            } else {
                C4266p c4266p4 = new C4266p(i16);
                int iM8561j = iM9188i;
                for (int i18 = 0; i18 < i16; i18++) {
                    C4265o c4265oM8557k = C4265o.m8557k(iM8561j, m4847a(i18), null);
                    c4266p4.m10841m(i18, c4265oM8557k);
                    iM8561j += c4265oM8557k.m8561j();
                }
                if (i10 == 79) {
                    if (i16 != 3) {
                        C0353j.m1309g("shouldn't happen");
                        return;
                    }
                    C4265o c4265o3 = (C4265o) c4266p4.m10840l(0);
                    C4265o c4265o4 = (C4265o) c4266p4.m10840l(1);
                    c4266p4.m10841m(0, (C4265o) c4266p4.m10840l(2));
                    c4266p4.m10841m(1, c4265o3);
                    c4266p4.m10841m(2, c4265o4);
                } else if (i10 == 181) {
                    if (i16 != 2) {
                        C0353j.m1309g("shouldn't happen");
                        return;
                    } else {
                        C4265o c4265o5 = (C4265o) c4266p4.m10840l(0);
                        c4266p4.m10841m(0, (C4265o) c4266p4.m10840l(1));
                        c4266p4.m10841m(1, c4265o5);
                    }
                }
                c4266p = c4266p4;
            }
            c4266p.f24613g = false;
        }
        C4266p c4266pM8567p = c4266p;
        int length = c4266pM8567p.f24601h.length;
        InterfaceC4684d[] interfaceC4684dArr = this.f6646m;
        if (i10 != 0) {
            if (i10 == 20) {
                z9 = true;
                m4855i((InterfaceC4684d) this.f6639f);
            } else if (i10 == 21) {
                z9 = true;
                m4855i(m4847a(0));
            } else if (i10 != 171 && i10 != 172) {
                switch (i10) {
                    case 0:
                    case 79:
                        z9 = true;
                        break;
                    case 18:
                        break;
                    case 46:
                    case 100:
                    case 104:
                    case 108:
                    case 112:
                    case 116:
                    case 120:
                    case 122:
                    case 124:
                    case 126:
                    case 128:
                    case 130:
                        z9 = true;
                        m4855i(this.f6637d);
                        break;
                    case 54:
                        break;
                    default:
                        switch (i10) {
                            case 87:
                            case 88:
                                z9 = true;
                                break;
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                                z9 = true;
                                this.f6647n = 0;
                                for (int i19 = this.f6638e; i19 != 0; i19 >>= 4) {
                                    InterfaceC4684d interfaceC4684dM4847a = m4847a((i19 & 15) - 1);
                                    if (interfaceC4684dM4847a == null) {
                                        C0353j.m1305c("result == null");
                                        return;
                                    }
                                    int i20 = this.f6647n;
                                    interfaceC4684dArr[i20] = interfaceC4684dM4847a;
                                    this.f6647n = i20 + 1;
                                }
                                break;
                            default:
                                switch (i10) {
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                    case 140:
                                    case 141:
                                    case 142:
                                    case 143:
                                    case 144:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    case 151:
                                    case 152:
                                        break;
                                    case Opcodes.IFEQ /* 153 */:
                                    case Opcodes.IFNE /* 154 */:
                                    case Opcodes.IFLT /* 155 */:
                                    case Opcodes.IFGE /* 156 */:
                                    case Opcodes.IFGT /* 157 */:
                                    case Opcodes.IFLE /* 158 */:
                                    case Opcodes.IF_ICMPEQ /* 159 */:
                                    case Opcodes.IF_ICMPNE /* 160 */:
                                    case Opcodes.IF_ICMPLT /* 161 */:
                                    case Opcodes.IF_ICMPGE /* 162 */:
                                    case Opcodes.IF_ICMPGT /* 163 */:
                                    case Opcodes.IF_ICMPLE /* 164 */:
                                    case Opcodes.IF_ACMPEQ /* 165 */:
                                    case Opcodes.IF_ACMPNE /* 166 */:
                                    case Opcodes.GOTO /* 167 */:
                                    case Opcodes.RET /* 169 */:
                                        z9 = true;
                                        break;
                                    case Opcodes.JSR /* 168 */:
                                        z9 = true;
                                        m4855i(new C1981v(this.f6640g));
                                        break;
                                    default:
                                        switch (i10) {
                                            case Opcodes.RETURN /* 177 */:
                                            case Opcodes.PUTSTATIC /* 179 */:
                                            case Opcodes.PUTFIELD /* 181 */:
                                            case Opcodes.ATHROW /* 191 */:
                                            case Opcodes.MONITORENTER /* 194 */:
                                            case Opcodes.MONITOREXIT /* 195 */:
                                                z9 = true;
                                                break;
                                            case Opcodes.GETSTATIC /* 178 */:
                                            case Opcodes.GETFIELD /* 180 */:
                                            case Opcodes.INVOKEVIRTUAL /* 182 */:
                                            case Opcodes.INVOKESTATIC /* 184 */:
                                            case Opcodes.INVOKEINTERFACE /* 185 */:
                                                z9 = true;
                                                C4683c type = ((InterfaceC4684d) this.f6639f).getType();
                                                if (type == C4683c.f15644w) {
                                                    this.f6647n = 0;
                                                } else {
                                                    m4855i(type);
                                                }
                                                break;
                                            case Opcodes.INVOKESPECIAL /* 183 */:
                                                C4683c type2 = m4847a(0).getType();
                                                if (type2.f15650i >= 0) {
                                                    abstractC1978s.mo4896p(type2);
                                                    if (c1973n2.f6693i != 0) {
                                                        c1973n2.m10855j();
                                                        C4683c c4683cM9191l = type2.m9191l();
                                                        int i21 = 0;
                                                        while (i21 < c1973n2.f6693i) {
                                                            InterfaceC4684d[] interfaceC4684dArr2 = (InterfaceC4684d[]) c1973n2.f6694j;
                                                            boolean z12 = z11;
                                                            if (interfaceC4684dArr2[i21] == type2) {
                                                                interfaceC4684dArr2[i21] = c4683cM9191l;
                                                            }
                                                            i21++;
                                                            z11 = z12;
                                                        }
                                                    }
                                                }
                                                z9 = z11;
                                                C4683c type3 = ((InterfaceC4684d) this.f6639f).getType();
                                                if (type3 == C4683c.f15644w) {
                                                    this.f6647n = 0;
                                                } else {
                                                    m4855i(type3);
                                                }
                                                break;
                                            case Opcodes.INVOKEDYNAMIC /* 186 */:
                                                C4683c c4683c = ((C4460i) this.f6639f).f14792g.f14812i.f15570h;
                                                if (c4683c == C4683c.f15644w) {
                                                    this.f6647n = 0;
                                                } else {
                                                    m4855i(c4683c);
                                                }
                                                z9 = true;
                                                break;
                                            case Opcodes.NEW /* 187 */:
                                                m4855i(((C4453d0) this.f6639f).f14784g.m9186d(i9));
                                                z9 = true;
                                                break;
                                            case Opcodes.NEWARRAY /* 188 */:
                                            case Opcodes.CHECKCAST /* 192 */:
                                                m4855i(((C4453d0) this.f6639f).f14784g);
                                                z9 = true;
                                                break;
                                            case Opcodes.ANEWARRAY /* 189 */:
                                                m4855i(((C4453d0) this.f6639f).f14784g.m9187e());
                                                z9 = true;
                                                break;
                                            case Opcodes.ARRAYLENGTH /* 190 */:
                                                break;
                                            case Opcodes.INSTANCEOF /* 193 */:
                                                m4855i(C4683c.f15641t);
                                                z9 = true;
                                                break;
                                            default:
                                                switch (i10) {
                                                    case Opcodes.MULTIANEWARRAY /* 197 */:
                                                        break;
                                                    case Opcodes.IFNULL /* 198 */:
                                                    case Opcodes.IFNONNULL /* 199 */:
                                                        z9 = true;
                                                        break;
                                                    default:
                                                        C0353j.m1309g("shouldn't happen: ".concat(AbstractC0000a.m44W0(i10)));
                                                        return;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            case 96:
                                break;
                        }
                        break;
                }
            } else {
                z9 = true;
            }
            i11 = this.f6647n;
            if (i11 >= 0) {
                throw new C1960b0("results never set", null);
            }
            if (i11 != 0) {
                if (this.f6645l != null) {
                    abstractC1978s.mo4900t(m4849c(false));
                } else {
                    for (int i22 = 0; i22 < this.f6647n; i22++) {
                        if (this.f6644k) {
                            c1973n2.m10855j();
                            ((boolean[]) c1973n2.f6695k)[c1973n2.f6693i] = z9;
                        }
                        c1973n2.m4888q(interfaceC4684dArr[i22]);
                    }
                }
            }
            C1972m c1972m = this.f6649p;
            C4270t c4270tM4880f = c1972m.m4880f(i9);
            InterfaceC2473b interfaceC2473b2 = c1972m.f6687a;
            C4265o c4265oM4849c = m4849c(i10 == 54 ? z9 : false);
            int i23 = this.f6647n;
            if (i23 < 0) {
                throw new C1960b0("results never set", null);
            }
            ArrayList arrayList2 = this.f6653t;
            if (i23 == 0) {
                if (i10 == 87 || i10 == 88) {
                    return;
                } else {
                    c4265oM4849c = null;
                }
            } else if (c4265oM4849c == null) {
                if (i23 != z9) {
                    C1985z c1985z = this.f6648o;
                    int iM8561j2 = c1985z.f6722c + c1985z.f6720a.f6689c.f5256b;
                    if (c1985z.m4920i()) {
                        iM8561j2++;
                    }
                    C4265o[] c4265oArr = new C4265o[length];
                    for (int i24 = 0; i24 < length; i24++) {
                        C4265o c4265o6 = (C4265o) c4266pM8567p.m10840l(i24);
                        InterfaceC4684d interfaceC4684d = c4265o6.f13966h;
                        C4265o c4265oM8565o = c4265o6.m8565o(iM8561j2);
                        arrayList2.add(new C4263m(AbstractC4269s.m8582g(interfaceC4684d), c4270tM4880f, c4265oM8565o, c4265o6));
                        c4265oArr[i24] = c4265oM8565o;
                        iM8561j2 += c4265o6.m8561j();
                    }
                    for (int i25 = this.f6638e; i25 != 0; i25 >>= 4) {
                        C4265o c4265o7 = c4265oArr[(i25 & 15) - 1];
                        InterfaceC4684d interfaceC4684d2 = c4265o7.f13966h;
                        arrayList2.add(new C4263m(AbstractC4269s.m8582g(interfaceC4684d2), c4270tM4880f, c4265o7.m8565o(iM9188i), c4265o7));
                        iM9188i += interfaceC4684d2.getType().m9188i();
                    }
                    return;
                }
                if (i23 <= 0) {
                    C2104o.m5294t("n >= resultCount");
                    return;
                } else {
                    try {
                        c4265oM4849c = C4265o.m8557k(iM9188i, interfaceC4684dArr[0], null);
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        C2104o.m5294t("n < 0");
                        return;
                    }
                }
            }
            InterfaceC4684d interfaceC4684d3 = c4265oM4849c != null ? c4265oM4849c : C4683c.f15644w;
            AbstractC4446a abstractC4446aM8909o = this.f6639f;
            if (i10 == 197) {
                this.f6630A = true;
                this.f6658y = 6;
                int iM8561j3 = c4265oM4849c.m8561j() + c4265oM4849c.f13965g;
                int i26 = c4265oM4849c.f13965g;
                C4683c c4683c2 = C4683c.f15631W;
                C4265o c4265oM8557k2 = C4265o.m8557k(iM8561j3, c4683c2, null);
                C4268r c4268r = AbstractC4269s.f14076a;
                c4683c2.getClass();
                C4683c c4683cM9190k = c4683c2.m9190k();
                if (c4683cM9190k.m9194r()) {
                    AbstractC4269s.m8591p(c4683c2);
                    throw null;
                }
                if (length < 0) {
                    C2104o.m5294t("count < 0");
                    return;
                }
                C4682b c4682b = new C4682b(length);
                for (int i27 = 0; i27 < length; i27++) {
                    c4682b.m10841m(i27, c4683cM9190k);
                }
                c4270t = c4270tM4880f;
                i12 = 6;
                arrayList2.add(new C4272v(new C4268r(42, c4682b, AbstractC4256f.f13937a), c4270t, c4266pM8567p, this.f6654u, C4453d0.f14783z));
                arrayList2.add(new C4263m(AbstractC4269s.m8584i(C4683c.f15631W), c4270t, c4265oM8557k2, C4266p.f13968i));
                C4683c c4683cM9190k2 = ((C4453d0) abstractC4446aM8909o).f14784g;
                for (int i28 = 0; i28 < length; i28++) {
                    c4683cM9190k2 = c4683cM9190k2.m9190k();
                }
                C4265o c4265oM8557k3 = C4265o.m8557k(i26, C4683c.f15647z, null);
                int i29 = c4683cM9190k2.f15649h;
                switch (i29) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ConcurrentHashMap concurrentHashMap = C4453d0.f14766i;
                        switch (i29) {
                            case 0:
                                c4453d0 = C4453d0.f14776s;
                                break;
                            case 1:
                                c4453d0 = C4453d0.f14768k;
                                break;
                            case 2:
                                c4453d0 = C4453d0.f14769l;
                                break;
                            case 3:
                                c4453d0 = C4453d0.f14770m;
                                break;
                            case 4:
                                c4453d0 = C4453d0.f14771n;
                                break;
                            case 5:
                                c4453d0 = C4453d0.f14772o;
                                break;
                            case 6:
                                c4453d0 = C4453d0.f14774q;
                                break;
                            case 7:
                                c4453d0 = C4453d0.f14773p;
                                break;
                            case 8:
                                c4453d0 = C4453d0.f14775r;
                                break;
                            default:
                                C1275d.m3412f(c4683cM9190k2, "not primitive: ");
                                return;
                        }
                        c4272v2 = new C4272v(AbstractC4269s.f14167w2, c4270t, C4266p.f13968i, this.f6654u, new C4464m(c4453d0, C4477z.f14826i));
                        c4270t = c4270t;
                        break;
                    default:
                        c4272v2 = new C4272v(AbstractC4269s.f14140q, c4270t, C4266p.f13968i, this.f6654u, new C4453d0(c4683cM9190k2));
                        break;
                }
                arrayList2.add(c4272v2);
                C4268r c4268rM8585j = AbstractC4269s.m8585j(c4265oM8557k3.f13966h.getType());
                C4266p c4266p5 = C4266p.f13968i;
                arrayList2.add(new C4263m(c4268rM8585j, c4270t, c4265oM8557k3, c4266p5));
                C4265o c4265oM8557k4 = C4265o.m8557k(i26, C4683c.f15613E, null);
                C4476y c4476y = f6629E;
                interfaceC2473b = interfaceC2473b2;
                str = "shouldn't happen";
                arrayList2.add(new C4272v(new C4268r(49, c4476y.f14786i.m9176c(), C4682b.f15598p), c4270t, C4266p.m8568q(c4265oM8557k3, c4265oM8557k2), this.f6654u, c4476y));
                arrayList2.add(new C4263m(AbstractC4269s.m8584i(c4476y.f14786i.f15570h), c4270t, c4265oM8557k4, c4266p5));
                c4266pM8567p = C4266p.m8567p(c4265oM8557k4);
                i13 = Opcodes.CHECKCAST;
            } else {
                interfaceC2473b = interfaceC2473b2;
                str = "shouldn't happen";
                i12 = 6;
                c4270t = c4270tM4880f;
                if (i10 == 168) {
                    this.f6659z = true;
                    return;
                } else {
                    if (i10 == 169) {
                        try {
                            this.f6631B = (C1981v) m4847a(0);
                            return;
                        } catch (ClassCastException e6) {
                            C0086a.m457p("Argument to RET was not a ReturnAddress", e6);
                            return;
                        }
                    }
                    i13 = i10;
                }
            }
            if (i13 == 0) {
                i14 = 1;
            } else if (i13 == 20) {
                i14 = 5;
            } else if (i13 == 21) {
                i14 = 2;
            } else if (i13 == 171) {
                i14 = 13;
            } else if (i13 == 172) {
                i14 = 33;
            } else if (i13 == 198) {
                i14 = 7;
            } else if (i13 != 199) {
                switch (i13) {
                    case 0:
                        break;
                    case 18:
                        break;
                    case 46:
                        i14 = 38;
                        break;
                    case 54:
                        break;
                    case 79:
                        i14 = 39;
                        break;
                    case 96:
                        i14 = 14;
                        break;
                    case 100:
                        i14 = 15;
                        break;
                    case 104:
                        i14 = 16;
                        break;
                    case 108:
                        i14 = 17;
                        break;
                    case 112:
                        i14 = 18;
                        break;
                    case 116:
                        i14 = 19;
                        break;
                    case 120:
                        i14 = 23;
                        break;
                    case 122:
                        i14 = 24;
                        break;
                    case 124:
                        i14 = 25;
                        break;
                    case 126:
                        i14 = 20;
                        break;
                    case 128:
                        i14 = 21;
                        break;
                    case 130:
                        i14 = 22;
                        break;
                    default:
                        switch (i13) {
                            case 132:
                                break;
                            case 133:
                            case 134:
                            case 135:
                            case 136:
                            case 137:
                            case 138:
                            case 139:
                            case 140:
                            case 141:
                            case 142:
                            case 143:
                            case 144:
                                i14 = 29;
                                break;
                            case 145:
                                i14 = 30;
                                break;
                            case 146:
                                i14 = 31;
                                break;
                            case 147:
                                i14 = 32;
                                break;
                            case 148:
                            case 149:
                            case 151:
                                i14 = 27;
                                break;
                            case 150:
                            case 152:
                                i14 = 28;
                                break;
                            case Opcodes.IFEQ /* 153 */:
                            case Opcodes.IF_ICMPEQ /* 159 */:
                            case Opcodes.IF_ACMPEQ /* 165 */:
                                break;
                            case Opcodes.IFNE /* 154 */:
                            case Opcodes.IF_ICMPNE /* 160 */:
                            case Opcodes.IF_ACMPNE /* 166 */:
                                i14 = 8;
                                break;
                            case Opcodes.IFLT /* 155 */:
                            case Opcodes.IF_ICMPLT /* 161 */:
                                i14 = 9;
                                break;
                            case Opcodes.IFGE /* 156 */:
                            case Opcodes.IF_ICMPGE /* 162 */:
                                i14 = 10;
                                break;
                            case Opcodes.IFGT /* 157 */:
                            case Opcodes.IF_ICMPGT /* 163 */:
                                i14 = 12;
                                break;
                            case Opcodes.IFLE /* 158 */:
                            case Opcodes.IF_ICMPLE /* 164 */:
                                i14 = 11;
                                break;
                            case Opcodes.GOTO /* 167 */:
                                i14 = i12;
                                break;
                            default:
                                switch (i13) {
                                    case Opcodes.RETURN /* 177 */:
                                        break;
                                    case Opcodes.GETSTATIC /* 178 */:
                                        i14 = 46;
                                        break;
                                    case Opcodes.PUTSTATIC /* 179 */:
                                        i14 = 48;
                                        break;
                                    case Opcodes.GETFIELD /* 180 */:
                                        i14 = 45;
                                        break;
                                    case Opcodes.PUTFIELD /* 181 */:
                                        i14 = 47;
                                        break;
                                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                                        C4476y c4476y2 = (C4476y) abstractC4446aM8909o;
                                        if (c4476y2.f14821g.equals(interfaceC2473b.mo4876b())) {
                                            int i30 = 0;
                                            while (true) {
                                                C1607u c1607u = this.f6650q;
                                                if (i30 < c1607u.f24601h.length) {
                                                    InterfaceC2473b interfaceC2473b3 = (InterfaceC2473b) c1607u.m10840l(i30);
                                                    if ((interfaceC2473b3.mo4877c() & 2) == 0 || !c4476y2.f14822h.equals(interfaceC2473b3.mo4878d())) {
                                                        i30++;
                                                    }
                                                }
                                            }
                                            i14 = 52;
                                        }
                                        i14 = c4476y2.m8905k() ? 58 : 50;
                                        break;
                                    case Opcodes.INVOKESPECIAL /* 183 */:
                                        C4476y c4476y3 = (C4476y) abstractC4446aM8909o;
                                        if (!c4476y3.f14822h.f14827g.f14760g.equals("<init>") && !c4476y3.f14821g.equals(interfaceC2473b.mo4876b())) {
                                            i15 = 51;
                                            i14 = i15;
                                        }
                                        i14 = 52;
                                        break;
                                    case Opcodes.INVOKESTATIC /* 184 */:
                                        i14 = 49;
                                        break;
                                    case Opcodes.INVOKEINTERFACE /* 185 */:
                                        i15 = 53;
                                        i14 = i15;
                                        break;
                                    case Opcodes.INVOKEDYNAMIC /* 186 */:
                                        i14 = 59;
                                        break;
                                    case Opcodes.NEW /* 187 */:
                                        i15 = 40;
                                        i14 = i15;
                                        break;
                                    case Opcodes.NEWARRAY /* 188 */:
                                    case Opcodes.ANEWARRAY /* 189 */:
                                        i14 = 41;
                                        break;
                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                        i15 = 34;
                                        i14 = i15;
                                        break;
                                    case Opcodes.ATHROW /* 191 */:
                                        i15 = 35;
                                        i14 = i15;
                                        break;
                                    case Opcodes.CHECKCAST /* 192 */:
                                        i15 = 43;
                                        i14 = i15;
                                        break;
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        i15 = 44;
                                        i14 = i15;
                                        break;
                                    case Opcodes.MONITORENTER /* 194 */:
                                        i15 = 36;
                                        i14 = i15;
                                        break;
                                    case Opcodes.MONITOREXIT /* 195 */:
                                        i15 = 37;
                                        i14 = i15;
                                        break;
                                    default:
                                        C0353j.m1309g(str);
                                        return;
                                }
                                break;
                        }
                        break;
                }
            }
            C4268r c4268rM8590o = AbstractC4269s.m8590o(i14, interfaceC4684d3, c4266pM8567p, abstractC4446aM8909o);
            if (c4265oM4849c != null && c4268rM8590o.f13976f) {
                this.f6658y++;
                c4263m = new C4263m(AbstractC4269s.m8584i(c4268rM8590o.f13971a == 59 ? ((C4460i) abstractC4446aM8909o).f14792g.f14812i.f15570h : ((C4476y) abstractC4446aM8909o).f14786i.f15570h), c4270t, c4265oM4849c, C4266p.f13968i);
            } else {
                if (c4265oM4849c == null || !c4268rM8590o.m8575a()) {
                    c4265o = c4265oM4849c;
                    c4263m = null;
                    if (i14 != 41) {
                        abstractC4446aM8909o = C4453d0.m8902l(c4268rM8590o.f13972b);
                    } else if (abstractC4446aM8909o == null && length == 2) {
                        InterfaceC4684d interfaceC4684d4 = ((C4265o) c4266pM8567p.m10840l(0)).f13966h;
                        InterfaceC4684d interfaceC4684d5 = ((C4265o) c4266pM8567p.m10840l(1)).f13966h;
                        if (interfaceC4684d5.mo4906c() || interfaceC4684d4.mo4906c()) {
                            C4265o c4265o8 = (C4265o) c4266pM8567p.m10840l(0);
                            C4265o c4265o9 = (C4265o) c4266pM8567p.m10840l(1);
                            this.f6651r.getClass();
                            InterfaceC4684d interfaceC4684d6 = c4265o8.f13966h;
                            if (interfaceC4684d6.getType() == C4683c.f15641t) {
                                InterfaceC4684d interfaceC4684d7 = c4265o9.f13966h;
                                if (interfaceC4684d7 instanceof C4466o) {
                                    C4466o c4466o = (C4466o) interfaceC4684d7;
                                    int i31 = c4466o.f14817g;
                                    switch (c4268rM8590o.f13971a) {
                                        case 14:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 20:
                                        case 21:
                                        case 22:
                                            int iMo8913l = c4466o.mo8913l();
                                            if (((short) iMo8913l) == iMo8913l) {
                                            }
                                            break;
                                        case 15:
                                            int iMo8913l2 = C4466o.m8909o(-i31).mo8913l();
                                            if (((short) iMo8913l2) == iMo8913l2) {
                                            }
                                            break;
                                        case 23:
                                        case 24:
                                        case 25:
                                            if (((byte) i31) == i31) {
                                            }
                                            break;
                                    }
                                } else if ((interfaceC4684d6 instanceof C4466o) && c4268rM8590o.f13971a == 15) {
                                    int iMo8913l3 = ((C4466o) interfaceC4684d6).mo8913l();
                                    z10 = ((short) iMo8913l3) == iMo8913l3;
                                }
                                if (z10) {
                                }
                            } else if (z10) {
                                if (interfaceC4684d5.mo4906c()) {
                                    AbstractC4446a abstractC4446a2 = (AbstractC4446a) interfaceC4684d5;
                                    int length2 = c4266pM8567p.f24601h.length - 1;
                                    if (length2 == 0) {
                                        c4266p3 = C4266p.f13968i;
                                    } else {
                                        C4266p c4266p6 = new C4266p(length2);
                                        for (int i32 = 0; i32 < length2; i32++) {
                                            c4266p6.m10841m(i32, c4266pM8567p.m10840l(i32));
                                        }
                                        if (!c4266pM8567p.f24613g) {
                                            c4266p6.f24613g = false;
                                        }
                                        c4266p3 = c4266p6;
                                    }
                                    if (c4268rM8590o.f13971a == 15) {
                                        c4266pM8567p = c4266p3;
                                        abstractC4446aM8909o = C4466o.m8909o(-((C4466o) interfaceC4684d5).f14817g);
                                        i14 = 14;
                                    } else {
                                        c4266pM8567p = c4266p3;
                                        abstractC4446aM8909o = abstractC4446a2;
                                    }
                                } else {
                                    AbstractC4446a abstractC4446a3 = (AbstractC4446a) interfaceC4684d4;
                                    int length3 = c4266pM8567p.f24601h.length - 1;
                                    if (length3 == 0) {
                                        c4266p2 = C4266p.f13968i;
                                    } else {
                                        C4266p c4266p7 = new C4266p(length3);
                                        int i33 = 0;
                                        while (i33 < length3) {
                                            int i34 = i33 + 1;
                                            c4266p7.m10841m(i33, c4266pM8567p.m10840l(i34));
                                            i33 = i34;
                                        }
                                        if (!c4266pM8567p.f24613g) {
                                            c4266p7.f24613g = false;
                                        }
                                        c4266p2 = c4266p7;
                                    }
                                    abstractC4446aM8909o = abstractC4446a3;
                                    c4266pM8567p = c4266p2;
                                }
                                c4268rM8590o = AbstractC4269s.m8590o(i14, interfaceC4684d3, c4266pM8567p, abstractC4446aM8909o);
                            }
                        }
                    }
                    C4268r c4268r2 = c4268rM8590o;
                    C4266p c4266p8 = c4266pM8567p;
                    c1973n = this.f6641h;
                    arrayList = this.f6642i;
                    boolean zM8575a = c4268r2.m8575a();
                    this.f6630A |= zM8575a;
                    if (c1973n == null) {
                        if (c1973n.f6693i == 0) {
                            c4263m2 = new C4263m(AbstractC4269s.f14148s, c4270t, (C4265o) null, C4266p.f13968i);
                            this.f6657x = 0;
                            abstractC4446a = abstractC4446aM8909o;
                        } else {
                            C6093g c6093g = (C6093g) c1973n.f6694j;
                            c4262l = new C4271u(c4268r2, c4270t, c4265o, c4266p8, c6093g);
                            this.f6657x = c6093g.f24610i;
                            abstractC4446a = abstractC4446aM8909o;
                            c4263m2 = c4262l;
                        }
                    } else if (i14 == 33) {
                        if (c4266p8.f24601h.length != 0) {
                            C4265o c4265o10 = (C4265o) c4266p8.m10840l(0);
                            InterfaceC4684d interfaceC4684d8 = c4265o10.f13966h;
                            if (c4265o10.f13965g != 0) {
                                c4265o2 = null;
                                arrayList2.add(new C4263m(AbstractC4269s.m8582g(interfaceC4684d8), c4270t, C4265o.m8557k(0, interfaceC4684d8, null), c4265o10));
                            } else {
                                c4265o2 = null;
                            }
                            c4263m2 = new C4263m(AbstractC4269s.f14148s, c4270t, c4265o2, C4266p.f13968i);
                            this.f6657x = 0;
                            C4268r c4268r3 = this.f6632C;
                            if (c4268r3 == null) {
                                this.f6632C = c4268r2;
                                this.f6633D = c4270t;
                            } else {
                                if (c4268r3 != c4268r2) {
                                    StringBuilder sb2 = new StringBuilder("return op mismatch: ");
                                    sb2.append(c4268r2);
                                    C4268r c4268r4 = this.f6632C;
                                    sb2.append(", ");
                                    sb2.append(c4268r4);
                                    throw new C1960b0(sb2.toString(), null);
                                }
                                if (c4270t.f14183c > this.f6633D.f14183c) {
                                    this.f6633D = c4270t;
                                }
                            }
                            this.f6656w = true;
                            abstractC4446a = abstractC4446aM8909o;
                        }
                    } else if (abstractC4446aM8909o == null) {
                        abstractC4446a = abstractC4446aM8909o;
                        C4265o c4265o11 = c4265o;
                        if (zM8575a) {
                            Object c4271u = new C4271u(c4268r2, c4270t, c4266p8, this.f6654u);
                            this.f6655v = true;
                            if (i13 == 191) {
                                this.f6657x = -1;
                            } else {
                                this.f6657x = this.f6654u.f24601h.length;
                            }
                            c4263m2 = c4271u;
                        } else {
                            c4263m2 = new C4263m(c4268r2, c4270t, c4265o11, c4266p8);
                        }
                    } else if (zM8575a) {
                        int i35 = c4268r2.f13971a;
                        C4682b c4682b2 = this.f6654u;
                        if (i35 == 58) {
                            c4270t2 = c4270t;
                            c4272v = new C4260j(c4268r2, c4270t2, c4266p8, c4682b2, (C4476y) abstractC4446aM8909o);
                            abstractC4446a = abstractC4446aM8909o;
                        } else {
                            c4270t2 = c4270t;
                            abstractC4446a = abstractC4446aM8909o;
                            c4272v = new C4272v(c4268r2, c4270t2, c4266p8, c4682b2, abstractC4446a);
                        }
                        c4263m2 = c4272v;
                        this.f6655v = true;
                        this.f6657x = this.f6654u.f24601h.length;
                        c4270t = c4270t2;
                    } else {
                        abstractC4446a = abstractC4446aM8909o;
                        c4262l = new C4262l(c4268r2, c4270t, c4265o, c4266p8, abstractC4446a);
                        c4263m2 = c4262l;
                    }
                    arrayList2.add(c4263m2);
                    if (c4263m != null) {
                        arrayList2.add(c4263m);
                    }
                    if (arrayList == null) {
                        this.f6658y++;
                        arrayList2.add(new C4257g(AbstractC4269s.f14057T2, c4270t, C4266p.m8567p(c4263m.f13949i), arrayList, abstractC4446a));
                        return;
                    }
                    return;
                }
                this.f6658y++;
                c4263m = new C4263m(AbstractC4269s.m8585j(c4265oM4849c.f13966h), c4270t, c4265oM4849c, C4266p.f13968i);
            }
            c4265o = null;
            if (i14 != 41) {
            }
            C4268r c4268r22 = c4268rM8590o;
            C4266p c4266p82 = c4266pM8567p;
            c1973n = this.f6641h;
            arrayList = this.f6642i;
            boolean zM8575a2 = c4268r22.m8575a();
            this.f6630A |= zM8575a2;
            if (c1973n == null) {
            }
            arrayList2.add(c4263m2);
            if (c4263m != null) {
            }
            if (arrayList == null) {
            }
        } else {
            z9 = true;
        }
        this.f6647n = 0;
        i11 = this.f6647n;
        if (i11 >= 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4855i(InterfaceC4684d interfaceC4684d) {
        if (interfaceC4684d == null) {
            C0353j.m1305c("result == null");
        } else {
            this.f6646m[0] = interfaceC4684d;
            this.f6647n = 1;
        }
    }
}
