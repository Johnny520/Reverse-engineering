package p071f1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p000a.AbstractC0000a;
import p020b5.C0184c;
import p023b8.C0205c;
import p068eh.AbstractC0921a;
import p073f4.C1064a;
import p089g1.C1275d;
import p096g8.C1361b;
import p121i4.AbstractC1967h;
import p121i4.AbstractC1978s;
import p121i4.C1958a0;
import p121i4.C1960b0;
import p121i4.C1962c0;
import p121i4.C1973n;
import p121i4.C1976q;
import p121i4.C1977r;
import p121i4.C1985z;
import p121i4.InterfaceC1970k;
import p136j8.C2104o;
import p163l4.C2474c;
import p192n4.C2893a;
import p227p4.C3309n;
import p295u4.C4253c;
import p295u4.C4261k;
import p295u4.C4265o;
import p295u4.C4267q;
import p311v4.AbstractC4446a;
import p311v4.C4447a0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4455e0;
import p311v4.C4460i;
import p311v4.C4462k;
import p311v4.C4464m;
import p311v4.C4465n;
import p311v4.C4466o;
import p311v4.C4467p;
import p311v4.C4468q;
import p311v4.C4473v;
import p311v4.C4475x;
import p311v4.C4476y;
import p311v4.C4477z;
import p326w4.C4681a;
import p326w4.C4683c;
import p343x6.AbstractC5700d;
import p379z7.C6112h;
import p379z7.C6119o;
import p379z7.C6121q;

/* JADX INFO: renamed from: f1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1005h implements InterfaceC1970k {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3180g;

    /* JADX INFO: renamed from: h */
    public int f3181h;

    /* JADX INFO: renamed from: i */
    public final Object f3182i;

    /* JADX INFO: renamed from: j */
    public Object f3183j;

    /* JADX INFO: renamed from: k */
    public Object f3184k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1005h(C1985z c1985z, int i9) {
        this.f3180g = 1;
        this.f3184k = c1985z;
        this.f3181h = i9;
        int i10 = c1985z.f6723d;
        this.f3183j = new BitSet(i10);
        this.f3182i = new BitSet(i10);
        c1985z.f6732m = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C4265o m2561n(C4265o c4265o) {
        return (c4265o == null || c4265o.f13966h.getType() != C4683c.f15645x) ? c4265o : c4265o.m8566p(C4683c.f15613E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public void m2562A(int i9) {
        ((Paint) this.f3182i).setStrokeCap(i9 == 2 ? Paint.Cap.SQUARE : i9 == 1 ? Paint.Cap.ROUND : i9 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public void m2563B(int i9) {
        ((Paint) this.f3182i).setStrokeJoin(i9 == 0 ? Paint.Join.MITER : i9 == 2 ? Paint.Join.BEVEL : i9 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public void m2564C(float f3) {
        ((Paint) this.f3182i).setStrokeWidth(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public void m2565D(int i9) {
        ((Paint) this.f3182i).setStyle(i9 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public void m2566E(C6119o c6119o) {
        C0205c c0205c = (C0205c) this.f3184k;
        if (c0205c == null || c6119o == null || c6119o.f24644i < 2) {
            return;
        }
        c6119o.sort(c0205c);
    }

    /* JADX DEBUG: Class process forced to load method for inline: g1.d.e(java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bc  */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2567a(int i9, int i10, C4683c c4683c) {
        C1958a0 c1958a0 = (C1958a0) this.f3182i;
        if (i9 == 0) {
            c1958a0.m4848b();
        } else if (i9 == 190) {
            C4683c c4683cM4887p = ((C1973n) ((C0184c) this.f3183j).f470b).m4887p(0);
            if (!c4683cM4887p.m9192p() && !c4683cM4887p.equals(C4683c.f15645x)) {
                ((C1962c0) this.f3184k).m4863g("type mismatch: expected array type but encountered " + c4683cM4887p.mo4901a());
                throw null;
            }
            c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15613E);
        } else if (i9 != 191 && i9 != 194 && i9 != 195) {
            switch (i9) {
                case 0:
                    break;
                case 46:
                    C4683c c4683cM4857b = C1962c0.m4857b(c4683c, ((C1973n) ((C0184c) this.f3183j).f470b).m4887p(1));
                    C4683c c4683cM9190k = C4683c.f15645x;
                    if (c4683cM4857b != c4683cM9190k) {
                        c4683cM9190k = c4683cM4857b.m9190k();
                    }
                    c1958a0.m4853g((C0184c) this.f3183j, c4683cM4857b, C4683c.f15641t);
                    c4683c = c4683cM9190k;
                    break;
                case 79:
                    C1973n c1973n = (C1973n) ((C0184c) this.f3183j).f470b;
                    int i11 = c4683c.m9193q() ? 2 : 3;
                    C4683c c4683cM4887p2 = c1973n.m4887p(i11);
                    int i12 = c1973n.f6693i;
                    if (i11 >= i12) {
                        throw new C1960b0("stack: underflow", null);
                    }
                    boolean z9 = ((boolean[]) c1973n.f6695k)[(i12 - i11) - 1];
                    C4683c c4683cM4857b2 = C1962c0.m4857b(c4683c, c4683cM4887p2);
                    if (z9 && c4683cM4857b2 != (c4683c = C4683c.f15645x)) {
                        c4683c = c4683cM4857b2.m9190k();
                    }
                    C0184c c0184c = (C0184c) this.f3183j;
                    C4683c c4683c2 = C4683c.f15641t;
                    c1958a0.m4850d(3, c0184c);
                    if (!AbstractC5700d.m10252I(c4683cM4857b2, c1958a0.f6635b[0])) {
                        C1275d.m3411e(c4683cM4857b2.mo4901a(), c1958a0.f6635b[0].getType().mo4901a());
                        return;
                    } else if (!AbstractC5700d.m10252I(c4683c2, c1958a0.f6635b[1])) {
                        C1275d.m3411e(c4683c2.mo4901a(), c1958a0.f6635b[1].getType().mo4901a());
                        return;
                    } else if (!AbstractC5700d.m10252I(c4683c, c1958a0.f6635b[2])) {
                        C1275d.m3411e(c4683c.mo4901a(), c1958a0.f6635b[2].getType().mo4901a());
                        return;
                    }
                    break;
                case 100:
                case 104:
                case 108:
                case 112:
                case 126:
                case 128:
                case 130:
                    c1958a0.m4853g((C0184c) this.f3183j, c4683c, c4683c);
                    break;
                case 116:
                    c1958a0.m4852f((C0184c) this.f3183j, c4683c);
                    break;
                case 120:
                case 122:
                case 124:
                    c1958a0.m4853g((C0184c) this.f3183j, c4683c, C4683c.f15641t);
                    break;
                case Opcodes.IRETURN /* 172 */:
                    C4683c c4683cM4887p3 = c4683c == C4683c.f15613E ? ((C1973n) ((C0184c) this.f3183j).f470b).m4887p(0) : c4683c;
                    c1958a0.m4852f((C0184c) this.f3183j, c4683c);
                    m2578l(c4683cM4887p3);
                    break;
                case Opcodes.RETURN /* 177 */:
                    c1958a0.m4848b();
                    m2578l(C4683c.f15644w);
                    break;
                default:
                    int i13 = 17;
                    switch (i9) {
                        case 87:
                            if (((C1973n) ((C0184c) this.f3183j).f470b).m4887p(0).m9194r()) {
                                throw C1962c0.m4856a();
                            }
                            c1958a0.m4850d(1, (C0184c) this.f3183j);
                            break;
                        case 88:
                        case 92:
                            C1973n c1973n2 = (C1973n) ((C0184c) this.f3183j).f470b;
                            if (c1973n2.m4887p(0).m9194r()) {
                                c1958a0.m4850d(1, (C0184c) this.f3183j);
                            } else {
                                if (!c1973n2.m4887p(1).m9193q()) {
                                    throw C1962c0.m4856a();
                                }
                                c1958a0.m4850d(2, (C0184c) this.f3183j);
                                i13 = 8481;
                            }
                            if (i9 == 92) {
                                c1958a0.f6638e = i13;
                            }
                            break;
                        case 89:
                            if (((C1973n) ((C0184c) this.f3183j).f470b).m4887p(0).m9194r()) {
                                throw C1962c0.m4856a();
                            }
                            c1958a0.m4850d(1, (C0184c) this.f3183j);
                            c1958a0.f6638e = 17;
                            break;
                        case 90:
                            C1973n c1973n3 = (C1973n) ((C0184c) this.f3183j).f470b;
                            if (!c1973n3.m4887p(0).m9193q() || !c1973n3.m4887p(1).m9193q()) {
                                throw C1962c0.m4856a();
                            }
                            c1958a0.m4850d(2, (C0184c) this.f3183j);
                            c1958a0.f6638e = 530;
                            break;
                            break;
                        case 91:
                            C1973n c1973n4 = (C1973n) ((C0184c) this.f3183j).f470b;
                            if (c1973n4.m4887p(0).m9194r()) {
                                throw C1962c0.m4856a();
                            }
                            if (c1973n4.m4887p(1).m9194r()) {
                                c1958a0.m4850d(2, (C0184c) this.f3183j);
                                c1958a0.f6638e = 530;
                            } else {
                                if (!c1973n4.m4887p(2).m9193q()) {
                                    throw C1962c0.m4856a();
                                }
                                c1958a0.m4850d(3, (C0184c) this.f3183j);
                                c1958a0.f6638e = 12819;
                            }
                            break;
                            break;
                        case 93:
                            C1973n c1973n5 = (C1973n) ((C0184c) this.f3183j).f470b;
                            if (!c1973n5.m4887p(0).m9194r()) {
                                if (c1973n5.m4887p(1).m9194r() || c1973n5.m4887p(2).m9194r()) {
                                    throw C1962c0.m4856a();
                                }
                                c1958a0.m4850d(3, (C0184c) this.f3183j);
                                c1958a0.f6638e = 205106;
                            } else {
                                if (c1973n5.m4887p(2).m9194r()) {
                                    throw C1962c0.m4856a();
                                }
                                c1958a0.m4850d(2, (C0184c) this.f3183j);
                                c1958a0.f6638e = 530;
                            }
                            break;
                        case 94:
                            C1973n c1973n6 = (C1973n) ((C0184c) this.f3183j).f470b;
                            if (!c1973n6.m4887p(0).m9194r()) {
                                if (!c1973n6.m4887p(1).m9193q()) {
                                    throw C1962c0.m4856a();
                                }
                                if (c1973n6.m4887p(2).m9194r()) {
                                    c1958a0.m4850d(3, (C0184c) this.f3183j);
                                    c1958a0.f6638e = 205106;
                                } else {
                                    if (!c1973n6.m4887p(3).m9193q()) {
                                        throw C1962c0.m4856a();
                                    }
                                    c1958a0.m4850d(4, (C0184c) this.f3183j);
                                    c1958a0.f6638e = 4399427;
                                }
                            } else if (c1973n6.m4887p(2).m9194r()) {
                                c1958a0.m4850d(2, (C0184c) this.f3183j);
                                c1958a0.f6638e = 530;
                            } else {
                                if (!c1973n6.m4887p(3).m9193q()) {
                                    throw C1962c0.m4856a();
                                }
                                c1958a0.m4850d(3, (C0184c) this.f3183j);
                                c1958a0.f6638e = 12819;
                            }
                            break;
                        case 95:
                            C1973n c1973n7 = (C1973n) ((C0184c) this.f3183j).f470b;
                            if (!c1973n7.m4887p(0).m9193q() || !c1973n7.m4887p(1).m9193q()) {
                                throw C1962c0.m4856a();
                            }
                            c1958a0.m4850d(2, (C0184c) this.f3183j);
                            c1958a0.f6638e = 18;
                            break;
                            break;
                        case 96:
                            break;
                        default:
                            switch (i9) {
                                case 133:
                                case 134:
                                case 135:
                                case 145:
                                case 146:
                                case 147:
                                    c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15641t);
                                    break;
                                case 136:
                                case 137:
                                case 138:
                                    c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15642u);
                                    break;
                                case 139:
                                case 140:
                                case 141:
                                    c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15640s);
                                    break;
                                case 142:
                                case 143:
                                case 144:
                                    c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15639r);
                                    break;
                                case 148:
                                    C0184c c0184c2 = (C0184c) this.f3183j;
                                    C4683c c4683c3 = C4683c.f15642u;
                                    c1958a0.m4853g(c0184c2, c4683c3, c4683c3);
                                    break;
                                case 149:
                                case 150:
                                    C0184c c0184c3 = (C0184c) this.f3183j;
                                    C4683c c4683c4 = C4683c.f15640s;
                                    c1958a0.m4853g(c0184c3, c4683c4, c4683c4);
                                    break;
                                case 151:
                                case 152:
                                    C0184c c0184c4 = (C0184c) this.f3183j;
                                    C4683c c4683c5 = C4683c.f15639r;
                                    c1958a0.m4853g(c0184c4, c4683c5, c4683c5);
                                    break;
                                default:
                                    mo2570d(i9, i10);
                                    throw null;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15613E);
        }
        c1958a0.f6637d = c4683c;
        c1958a0.m4854h(i10, i9, (C0184c) this.f3183j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2568b(int i9, int i10, int i11, AbstractC4446a abstractC4446a, int i12) {
        AbstractC4446a abstractC4446a2;
        C1962c0 c1962c0 = (C1962c0) this.f3184k;
        C2893a c2893a = (C2893a) c1962c0.f6668f;
        C1958a0 c1958a0 = (C1958a0) this.f3182i;
        if (i9 == 18 || i9 == 19) {
            if (((abstractC4446a instanceof C4475x) || (abstractC4446a instanceof C4447a0)) && !c2893a.m6293a(28)) {
                c1962c0.m4863g(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC4446a.mo8898j(), 28, 13));
                throw null;
            }
            c1958a0.m4848b();
            abstractC4446a2 = abstractC4446a;
        } else if (i9 != 189) {
            if (i9 == 197) {
                C4683c c4683c = C4683c.f15644w;
                ConcurrentHashMap concurrentHashMap = C4681a.f15568k;
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append('(');
                while (i < i12) {
                    sb2.append('I');
                    i++;
                }
                sb2.append(')');
                sb2.append(c4683c.f15648g);
                c1958a0.m4851e((C0184c) this.f3183j, C4681a.m9174d(sb2.toString()));
                abstractC4446a2 = abstractC4446a;
            } else if (i9 != 192 && i9 != 193) {
                switch (i9) {
                    case Opcodes.PUTSTATIC /* 179 */:
                        c1958a0.m4852f((C0184c) this.f3183j, ((C4464m) abstractC4446a).f14822h.m8917k());
                        abstractC4446a2 = abstractC4446a;
                        break;
                    case Opcodes.GETFIELD /* 180 */:
                        break;
                    case Opcodes.PUTFIELD /* 181 */:
                        c1958a0.m4853g((C0184c) this.f3183j, C4683c.f15613E, ((C4464m) abstractC4446a).f14822h.m8917k());
                        abstractC4446a2 = abstractC4446a;
                        break;
                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                    case Opcodes.INVOKESPECIAL /* 183 */:
                    case Opcodes.INVOKESTATIC /* 184 */:
                    case Opcodes.INVOKEINTERFACE /* 185 */:
                        boolean z9 = abstractC4446a instanceof C4467p;
                        AbstractC4446a abstractC4446a3 = abstractC4446a;
                        if (z9) {
                            C4476y c4476yM8911l = ((C4467p) abstractC4446a).m8911l();
                            abstractC4446a3 = c4476yM8911l;
                            if (i9 != 185) {
                                abstractC4446a3 = c4476yM8911l;
                                if (!c2893a.m6293a(24)) {
                                    c1962c0.m4863g(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", i9 == 184 ? "static" : "default", c4476yM8911l.f14821g.f14784g.mo4901a(), c4476yM8911l.f14822h.mo4901a(), 24, 13));
                                    throw null;
                                }
                            }
                        }
                        if ((abstractC4446a3 instanceof C4476y) && ((C4476y) abstractC4446a3).m8905k()) {
                            if (!c2893a.m6293a(26)) {
                                c1962c0.m4863g(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, 13));
                                throw null;
                            }
                            if (i9 != 182) {
                                c1962c0.m4863g("Unsupported signature polymorphic invocation (" + AbstractC1967h.m4867a(i9) + ")");
                                throw null;
                            }
                        }
                        i = i9 == 184 ? 1 : 0;
                        C4476y c4476y = (C4476y) abstractC4446a3;
                        C4681a c4681a = c4476y.f14786i;
                        if (i == 0) {
                            if (c4476y.f14787j == null) {
                                c4476y.f14787j = c4681a.m9177e(c4476y.f14821g.f14784g);
                            }
                            c4681a = c4476y.f14787j;
                        }
                        c1958a0.m4851e((C0184c) this.f3183j, c4681a);
                        abstractC4446a2 = abstractC4446a3;
                        break;
                    case Opcodes.INVOKEDYNAMIC /* 186 */:
                        if (!c2893a.m6293a(26)) {
                            c1962c0.m4863g(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i9), 26, 13));
                            throw null;
                        }
                        C4468q c4468q = (C4468q) abstractC4446a;
                        c1958a0.m4851e((C0184c) this.f3183j, c4468q.f14812i);
                        ArrayList arrayList = c4468q.f14815l;
                        C4460i c4460i = new C4460i(c4468q, arrayList.size());
                        arrayList.add(c4460i);
                        abstractC4446a2 = c4460i;
                        break;
                        break;
                    default:
                        c1958a0.m4848b();
                        abstractC4446a2 = abstractC4446a;
                        break;
                }
            } else {
                c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15613E);
                abstractC4446a2 = abstractC4446a;
            }
        } else {
            c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15641t);
            abstractC4446a2 = abstractC4446a;
        }
        c1958a0.f6638e = i12;
        if (abstractC4446a2 == null) {
            C0353j.m1305c("cst == null");
        } else {
            c1958a0.f6639f = abstractC4446a2;
            c1958a0.m4854h(i10, i9, (C0184c) this.f3183j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: c */
    public void mo2569c(int i9, int i10, C4453d0 c4453d0, ArrayList arrayList) {
        C1958a0 c1958a0 = (C1958a0) this.f3182i;
        c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15641t);
        c1958a0.f6642i = arrayList;
        if (c4453d0 == null) {
            C0353j.m1305c("cst == null");
        } else {
            c1958a0.f6639f = c4453d0;
            c1958a0.m4854h(i9, Opcodes.NEWARRAY, (C0184c) this.f3183j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: d */
    public void mo2570d(int i9, int i10) {
        throw new C1960b0("invalid opcode ".concat(AbstractC0000a.m44W0(i9)), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m2571e(int i9, int i10) {
        int[] iArr = (int[]) this.f3184k;
        boolean z9 = iArr == null;
        if (i9 != 0 || z9) {
            if (i9 < 0) {
                C0353j.m1309g("shouldn't happen");
                return;
            }
            if (z9 || i10 >= iArr.length) {
                int i11 = i10 + 1;
                C4267q c4267q = new C4267q(i11);
                int[] iArr2 = new int[i11];
                Arrays.fill(iArr2, -1);
                if (!z9) {
                    C4267q c4267q2 = (C4267q) this.f3183j;
                    int length = c4267q2.f13969h.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        C4265o c4265oM8572l = c4267q2.m8572l(i12);
                        if (c4265oM8572l != null) {
                            c4267q.m8573m(c4265oM8572l);
                        }
                    }
                    int[] iArr3 = (int[]) this.f3184k;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f3183j = c4267q;
                this.f3184k = iArr2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: f */
    public int mo2572f() {
        return this.f3181h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: g */
    public void mo2573g(int i9, int i10, C1973n c1973n, int i11) {
        C1958a0 c1958a0 = (C1958a0) this.f3182i;
        c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15641t);
        c1958a0.f6638e = i11;
        c1958a0.f6641h = c1973n;
        c1958a0.m4854h(i9, Opcodes.LOOKUPSWITCH, (C0184c) this.f3183j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: h */
    public void mo2574h(int i9, int i10, int i11, int i12) {
        C1958a0 c1958a0 = (C1958a0) this.f3182i;
        switch (i9) {
            case Opcodes.IFEQ /* 153 */:
            case Opcodes.IFNE /* 154 */:
            case Opcodes.IFLT /* 155 */:
            case Opcodes.IFGE /* 156 */:
            case Opcodes.IFGT /* 157 */:
            case Opcodes.IFLE /* 158 */:
                c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15641t);
                c1958a0.f6640g = i12;
                c1958a0.m4854h(i10, i9, (C0184c) this.f3183j);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGE /* 162 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ICMPLE /* 164 */:
                C0184c c0184c = (C0184c) this.f3183j;
                C4683c c4683c = C4683c.f15641t;
                c1958a0.m4853g(c0184c, c4683c, c4683c);
                c1958a0.f6640g = i12;
                c1958a0.m4854h(i10, i9, (C0184c) this.f3183j);
                return;
            case Opcodes.IF_ACMPEQ /* 165 */:
            case Opcodes.IF_ACMPNE /* 166 */:
                C0184c c0184c2 = (C0184c) this.f3183j;
                C4683c c4683c2 = C4683c.f15613E;
                c1958a0.m4853g(c0184c2, c4683c2, c4683c2);
                c1958a0.f6640g = i12;
                c1958a0.m4854h(i10, i9, (C0184c) this.f3183j);
                return;
            default:
                switch (i9) {
                    case Opcodes.IFNULL /* 198 */:
                    case Opcodes.IFNONNULL /* 199 */:
                        c1958a0.m4852f((C0184c) this.f3183j, C4683c.f15613E);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo2570d(i9, i10);
                        throw null;
                }
                c1958a0.f6640g = i12;
                c1958a0.m4854h(i10, i9, (C0184c) this.f3183j);
                return;
            case Opcodes.GOTO /* 167 */:
            case Opcodes.JSR /* 168 */:
                c1958a0.m4848b();
                c1958a0.f6640g = i12;
                c1958a0.m4854h(i10, i9, (C0184c) this.f3183j);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2575i(int i9, int i10, int i11, int i12, C4683c c4683c, int i13) {
        C4683c c4683cM9182m;
        C1958a0 c1958a0 = (C1958a0) this.f3182i;
        C1976q c1976qM4891o = ((C1977r) ((C1962c0) this.f3184k).f6666d).m4891o(i9 == 54 ? i11 + i10 : i10, i12);
        C4261k c4261k = null;
        if (c1976qM4891o != null) {
            c4683cM9182m = C4683c.m9182m(c1976qM4891o.f6702d.f14760g);
            if (c4683cM9182m.mo4907f() != c4683c.mo4907f()) {
                c4683cM9182m = c4683c;
                c1976qM4891o = null;
            }
        } else {
            c4683cM9182m = c4683c;
        }
        if (i9 == 21) {
            C0184c c0184c = (C0184c) this.f3183j;
            c1958a0.m4848b();
            c1958a0.f6635b[0] = ((AbstractC1978s) c0184c.f469a).mo4894n(i12);
            c1958a0.f6636c = 1;
            c1958a0.f6643j = i12;
            c1958a0.f6644k = c1976qM4891o != null;
            c1958a0.f6637d = c4683c;
        } else if (i9 == 54) {
            if (c1976qM4891o != null) {
                C4451c0 c4451c0 = c1976qM4891o.f6701c;
                C4451c0 c4451c02 = c1976qM4891o.f6703e;
                if (c4451c0 != null || c4451c02 != null) {
                    c4261k = new C4261k(c4451c0, c4451c02);
                }
            }
            c1958a0.m4852f((C0184c) this.f3183j, c4683c);
            c1958a0.f6637d = c4683c;
            c1958a0.f6645l = C4265o.m8557k(i12, c4683cM9182m, c4261k);
        } else if (i9 != 132) {
            if (i9 != 169) {
                mo2570d(i9, i10);
                throw null;
            }
            C0184c c0184c2 = (C0184c) this.f3183j;
            c1958a0.m4848b();
            c1958a0.f6635b[0] = ((AbstractC1978s) c0184c2.f469a).mo4894n(i12);
            c1958a0.f6636c = 1;
            c1958a0.f6643j = i12;
            c1958a0.f6644k = c1976qM4891o != null;
            c1958a0.f6637d = c4683c;
        } else {
            if (c1976qM4891o != null) {
                C4451c0 c4451c03 = c1976qM4891o.f6701c;
                C4451c0 c4451c04 = c1976qM4891o.f6703e;
                if (c4451c03 != null || c4451c04 != null) {
                    c4261k = new C4261k(c4451c03, c4451c04);
                }
            }
            C0184c c0184c3 = (C0184c) this.f3183j;
            c1958a0.m4848b();
            c1958a0.f6635b[0] = ((AbstractC1978s) c0184c3.f469a).mo4894n(i12);
            c1958a0.f6636c = 1;
            c1958a0.f6643j = i12;
            c1958a0.f6645l = C4265o.m8557k(i12, c4683cM9182m, c4261k);
            c1958a0.f6637d = c4683c;
            c1958a0.f6638e = i13;
            c1958a0.f6639f = C4466o.m8909o(i13);
        }
        c1958a0.m4854h(i10, i9, (C0184c) this.f3183j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m2576j(int i9, int i10, C4265o c4265o) {
        int i11 = c4265o.f13965g;
        ArrayList arrayList = (ArrayList) this.f3182i;
        arrayList.add(new C3309n(i9, i10, c4265o));
        C4267q c4267q = (C4267q) this.f3183j;
        if (i10 == 1) {
            c4267q.m8573m(c4265o);
            ((int[]) this.f3184k)[i11] = -1;
        } else {
            c4267q.m8574n(c4265o);
            ((int[]) this.f3184k)[i11] = arrayList.size() - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m2577k(int i9, int i10, C4265o c4265o) {
        ArrayList arrayList = (ArrayList) this.f3182i;
        if (i10 == 1) {
            C0353j.m1309g("shouldn't happen");
            return;
        }
        int i11 = ((int[]) this.f3184k)[c4265o.f13965g];
        if (i11 >= 0) {
            C3309n c3309n = (C3309n) arrayList.get(i11);
            int i12 = c3309n.f10668g;
            C4265o c4265o2 = c3309n.f10670i;
            if (i12 == i9 && c4265o2.equals(c4265o)) {
                if (i10 != c3309n.f10669h) {
                    c3309n = new C3309n(c3309n.f10668g, i10, c4265o2);
                }
                arrayList.set(i11, c3309n);
                ((C4267q) this.f3183j).m8574n(c4265o);
                return;
            }
        }
        int i13 = c4265o.f13965g;
        C4265o c4265oM2561n = m2561n(c4265o);
        m2571e(i9, i13);
        if (((int[]) this.f3184k)[i13] >= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f3182i;
        boolean z9 = true;
        int size = arrayList2.size() - 1;
        while (size >= 0) {
            C3309n c3309n2 = (C3309n) arrayList2.get(size);
            if (c3309n2 != null) {
                if (c3309n2.f10668g != i9) {
                    m2576j(i9, i10, c4265oM2561n);
                    return;
                } else if (c3309n2.f10670i.m8560i(c4265oM2561n)) {
                    break;
                }
            }
            size--;
        }
        ((C4267q) this.f3183j).m8574n(c4265oM2561n);
        C3309n c3309n3 = null;
        arrayList2.set(size, null);
        this.f3181h++;
        int i14 = c4265oM2561n.f13965g;
        while (true) {
            size--;
            if (size < 0) {
                z9 = false;
                break;
            }
            c3309n3 = (C3309n) arrayList2.get(size);
            if (c3309n3 != null && c3309n3.f10670i.f13965g == i14) {
                break;
            }
        }
        if (z9) {
            ((int[]) this.f3184k)[i14] = size;
            int i15 = c3309n3.f10668g;
            if (i15 == i9) {
                if (2 != c3309n3.f10669h) {
                    c3309n3 = new C3309n(i15, 2, c3309n3.f10670i);
                }
                arrayList2.set(size, c3309n3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public void m2578l(C4683c c4683c) {
        C4683c c4683c2 = ((C1958a0) this.f3182i).f6634a.f15570h;
        if (AbstractC5700d.m10252I(c4683c2, c4683c)) {
            return;
        }
        ((C1962c0) this.f3184k).m4863g("return type mismatch: prototype indicates " + c4683c2.mo4901a() + ", but encountered type " + c4683c.mo4901a());
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public Object m2579m(Object obj, Object obj2) {
        if (obj == obj2) {
            return obj;
        }
        if (obj == null) {
            return obj2;
        }
        if (obj2 == null) {
            return obj;
        }
        boolean z9 = false;
        boolean z10 = obj.getClass() == C6119o.class;
        boolean z11 = obj2.getClass() == C6119o.class;
        if (!z10 && !z11) {
            C6119o c6119o = new C6119o(new Object[]{obj, obj2});
            m2566E(c6119o);
            return c6119o;
        }
        if (z10 && !z11) {
            C6119o c6119o2 = (C6119o) obj;
            if (!c6119o2.m10867c(obj2)) {
                c6119o2.add(obj2);
                m2566E(c6119o2);
            }
            return c6119o2;
        }
        if (!z10) {
            C6119o c6119o3 = (C6119o) obj2;
            if (!c6119o3.m10867c(obj)) {
                c6119o3.add(obj);
                m2566E(c6119o3);
            }
            return c6119o3;
        }
        C6119o c6119o4 = (C6119o) obj;
        for (Object obj3 : (C6119o) obj2) {
            if (!c6119o4.m10867c(obj3)) {
                c6119o4.add(obj3);
                z9 = true;
            }
        }
        if (z9) {
            m2566E(c6119o4);
        }
        return c6119o4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public Iterator m2580o(String str) {
        synchronized (this.f3182i) {
            try {
                if (str == null) {
                    return C6112h.f24664g;
                }
                HashMap map = (HashMap) this.f3183j;
                if (map == null) {
                    return C6112h.f24664g;
                }
                Object obj = map.get(str);
                if (obj == null) {
                    return C6112h.f24664g;
                }
                if (obj.getClass() == C6119o.class) {
                    return ((C6119o) obj).iterator();
                }
                return C6121q.m10883a(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public int m2581p() {
        Paint.Cap strokeCap = ((Paint) this.f3182i).getStrokeCap();
        int i9 = strokeCap == null ? -1 : AbstractC1007i.f3188a[strokeCap.ordinal()];
        if (i9 == 1) {
            return 0;
        }
        if (i9 != 2) {
            return i9 != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public int m2582q() {
        Paint.Join strokeJoin = ((Paint) this.f3182i).getStrokeJoin();
        int i9 = strokeJoin == null ? -1 : AbstractC1007i.f3189b[strokeJoin.ordinal()];
        if (i9 == 1) {
            return 0;
        }
        if (i9 != 2) {
            return i9 != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fd  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4446a m2583r(int i9, BitSet bitSet) {
        AbstractC4446a c4473v;
        AbstractC4446a abstractC4446aM8909o;
        AbstractC4446a abstractC4446aM2583r;
        int i10;
        int i11;
        AbstractC4446a abstractC4446a;
        C1361b c1361b = (C1361b) this.f3182i;
        C4455e0 c4455e0 = (C4455e0) this.f3183j;
        c4455e0.getClass();
        AbstractC4446a[] abstractC4446aArr = c4455e0.f14788h;
        try {
            AbstractC4446a abstractC4446a2 = abstractC4446aArr[i9];
            if (abstractC4446a2 != null) {
                return abstractC4446a2;
            }
            int i12 = ((int[]) this.f3184k)[i9];
            try {
                int iM3657e = c1361b.m3657e(i12);
                switch (iM3657e) {
                    case 1:
                        C4451c0 c4451c0M2585t = m2585t(i12);
                        bitSet.set(i9);
                        abstractC4446aM8909o = c4451c0M2585t;
                        c4455e0.m10855j();
                        boolean z9 = abstractC4446aM8909o == null && abstractC4446aM8909o.mo8897i();
                        if (i9 >= 1) {
                            C2104o.m5294t("n < 1");
                            return null;
                        }
                        if (z9) {
                            if (i9 == abstractC4446aArr.length - 1) {
                                C2104o.m5294t("(n == size - 1) && cst.isCategory2()");
                                return null;
                            }
                            abstractC4446aArr[i9 + 1] = null;
                        }
                        if (abstractC4446aM8909o != null && abstractC4446aArr[i9] == null && (abstractC4446a = abstractC4446aArr[i9 - 1]) != null && abstractC4446a.mo8897i()) {
                            abstractC4446aArr[i11] = null;
                        }
                        abstractC4446aArr[i9] = abstractC4446aM8909o;
                        return abstractC4446aM8909o;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new C2474c("unknown tag byte: ".concat(AbstractC0000a.m44W0(iM3657e)), null);
                    case 3:
                        abstractC4446aM8909o = C4466o.m8909o(c1361b.m3654b(i12 + 1));
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 4:
                        abstractC4446aM8909o = new C4465n(c1361b.m3654b(i12 + 1));
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 5:
                        c4473v = new C4473v(c1361b.m3655c(i12 + 1));
                        abstractC4446aM8909o = c4473v;
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 6:
                        c4473v = new C4462k(c1361b.m3655c(i12 + 1));
                        abstractC4446aM8909o = c4473v;
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 7:
                        abstractC4446aM8909o = new C4453d0(C4683c.m9183n(((C4451c0) m2583r(c1361b.m3659g(i12 + 1), bitSet)).f14760g));
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 8:
                        abstractC4446aM8909o = m2583r(c1361b.m3659g(i12 + 1), bitSet);
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 9:
                        abstractC4446aM8909o = new C4464m((C4453d0) m2583r(c1361b.m3659g(i12 + 1), bitSet), (C4477z) m2583r(c1361b.m3659g(i12 + 3), bitSet));
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 10:
                        abstractC4446aM8909o = new C4476y((C4453d0) m2583r(c1361b.m3659g(i12 + 1), bitSet), (C4477z) m2583r(c1361b.m3659g(i12 + 3), bitSet));
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 11:
                        C4467p c4467p = new C4467p((C4453d0) m2583r(c1361b.m3659g(i12 + 1), bitSet), (C4477z) m2583r(c1361b.m3659g(i12 + 3), bitSet));
                        c4467p.f14809k = null;
                        abstractC4446aM8909o = c4467p;
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 12:
                        abstractC4446aM8909o = new C4477z((C4451c0) m2583r(c1361b.m3659g(i12 + 1), bitSet), (C4451c0) m2583r(c1361b.m3659g(i12 + 3), bitSet));
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 15:
                        int iM3657e2 = c1361b.m3657e(i12 + 1);
                        int iM3659g = c1361b.m3659g(i12 + 2);
                        switch (iM3657e2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                abstractC4446aM2583r = (C4464m) m2583r(iM3659g, bitSet);
                                break;
                            case 5:
                            case 8:
                                abstractC4446aM2583r = (C4476y) m2583r(iM3659g, bitSet);
                                break;
                            case 6:
                            case 7:
                                abstractC4446aM2583r = m2583r(iM3659g, bitSet);
                                if (!(abstractC4446aM2583r instanceof C4476y) && !(abstractC4446aM2583r instanceof C4467p)) {
                                    throw new C2474c("Unsupported ref constant type for MethodHandle " + abstractC4446aM2583r.getClass(), null);
                                }
                                break;
                            case 9:
                                abstractC4446aM2583r = (C4467p) m2583r(iM3659g, bitSet);
                                break;
                            default:
                                throw new C2474c("Unsupported MethodHandle kind: " + iM3657e2, null);
                        }
                        switch (iM3657e2) {
                            case 1:
                                i10 = 3;
                                break;
                            case 2:
                                i10 = 1;
                                break;
                            case 3:
                                i10 = 2;
                                break;
                            case 4:
                                i10 = 0;
                                break;
                            case 5:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 4;
                                break;
                            case 7:
                                i10 = 7;
                                break;
                            case 8:
                                i10 = 6;
                                break;
                            case 9:
                                i10 = 8;
                                break;
                            default:
                                C2104o.m5294t(AbstractC0921a.m2249l(iM3657e2, "invalid kind: "));
                                i10 = 0;
                                break;
                        }
                        abstractC4446aM8909o = C4475x.m8916l(i10, abstractC4446aM2583r);
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 16:
                        abstractC4446aM8909o = new C4447a0(C4681a.m9173b(((C4451c0) m2583r(c1361b.m3659g(i12 + 1), bitSet)).f14760g));
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                    case 18:
                        abstractC4446aM8909o = new C4468q(c1361b.m3659g(i12 + 1), (C4477z) m2583r(c1361b.m3659g(i12 + 3), bitSet));
                        c4455e0.m10855j();
                        if (abstractC4446aM8909o == null) {
                        }
                        if (i9 >= 1) {
                        }
                        break;
                }
            } catch (C2474c e6) {
                e6.m2687a("...while parsing cst " + AbstractC0000a.m46X0(i9) + " at offset " + AbstractC0000a.m48Y0(i12));
                throw e6;
            } catch (RuntimeException e7) {
                C2474c c2474c = new C2474c(null, e7);
                c2474c.m2687a("...while parsing cst " + AbstractC0000a.m46X0(i9) + " at offset " + AbstractC0000a.m48Y0(i12));
                throw c2474c;
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C1064a("invalid constant pool index ".concat(AbstractC0000a.m46X0(i9)), null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m2584s() {
        int i9;
        if (this.f3181h < 0) {
            int[] iArr = (int[]) this.f3184k;
            C1361b c1361b = (C1361b) this.f3182i;
            int iM3659g = 10;
            int i10 = 1;
            while (i10 < iArr.length) {
                iArr[i10] = iM3659g;
                int iM3657e = c1361b.m3657e(iM3659g);
                switch (iM3657e) {
                    case 1:
                        iM3659g = c1361b.m3659g(iM3659g + 1) + 3 + iM3659g;
                        break;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new C2474c("unknown tag byte: " + AbstractC0000a.m44W0(iM3657e), null);
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 18:
                        try {
                            iM3659g += 5;
                        } catch (C2474c e6) {
                            e6.m2687a("...while preparsing cst " + AbstractC0000a.m46X0(i10) + " at offset " + AbstractC0000a.m48Y0(iM3659g));
                            throw e6;
                        }
                        break;
                    case 5:
                    case 6:
                        iM3659g += 9;
                        i9 = 2;
                        continue;
                        i10 += i9;
                        break;
                    case 7:
                    case 8:
                    case 16:
                        iM3659g += 3;
                        break;
                    case 15:
                        iM3659g += 4;
                        break;
                }
                i9 = 1;
                i10 += i9;
            }
            this.f3181h = iM3659g;
            BitSet bitSet = new BitSet(iArr.length);
            for (int i11 = 1; i11 < iArr.length; i11++) {
                if (iArr[i11] != 0) {
                    C4455e0 c4455e0 = (C4455e0) this.f3183j;
                    c4455e0.getClass();
                    try {
                        if (c4455e0.f14788h[i11] == null) {
                            m2583r(i11, bitSet);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        throw new C1064a("invalid constant pool index ".concat(AbstractC0000a.m46X0(i11)), null);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public C4451c0 m2585t(int i9) {
        C1361b c1361b = (C1361b) this.f3182i;
        int iM3659g = c1361b.m3659g(i9 + 1);
        int i10 = i9 + 3;
        try {
            return new C4451c0(c1361b.m3666n(i10, iM3659g + i10));
        } catch (IllegalArgumentException e6) {
            throw new C2474c(null, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        int size;
        switch (this.f3180g) {
            case 6:
                StringBuilder sb2 = new StringBuilder("size = ");
                synchronized (this.f3182i) {
                    try {
                        HashMap map = (HashMap) this.f3183j;
                        if (map == null) {
                            size = 0;
                        } else {
                            size = map.size();
                        }
                    } finally {
                    }
                }
                sb2.append(size);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public void m2586u(float f3) {
        ((Paint) this.f3182i).setAlpha((int) Math.rint(f3 * 255.0f));
    }

    /* JADX DEBUG: Class process forced to load method for inline: f1.a.l(android.graphics.Paint, android.graphics.BlendMode):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public void m2587v(int i9) {
        if (this.f3181h == i9) {
            return;
        }
        this.f3181h = i9;
        Paint paint = (Paint) this.f3182i;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(AbstractC0996c0.m2522s(i9));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC0996c0.m2529z(i9)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public void m2588w(long j3) {
        ((Paint) this.f3182i).setColor(AbstractC0996c0.m2526w(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public void m2589x(C1017n c1017n) {
        this.f3184k = c1017n;
        ((Paint) this.f3182i).setColorFilter(c1017n != null ? c1017n.f3201a : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public void m2590y(int i9) {
        ((Paint) this.f3182i).setFilterBitmap(!(i9 == 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void m2591z(Shader shader) {
        this.f3183j = shader;
        ((Paint) this.f3182i).setShader(shader);
    }

    public C1005h(C4253c c4253c, int i9) {
        this.f3180g = 5;
        if (i9 >= 0) {
            this.f3182i = c4253c;
            this.f3181h = i9;
            this.f3183j = null;
            this.f3184k = null;
            return;
        }
        C2104o.m5294t("firstLabel < 0");
        throw null;
    }

    public C1005h(Paint paint) {
        this.f3180g = 0;
        this.f3182i = paint;
        this.f3181h = 3;
    }

    public C1005h(C1361b c1361b) {
        this.f3180g = 3;
        int iM3659g = c1361b.m3659g(8);
        this.f3182i = c1361b;
        this.f3183j = new C4455e0(iM3659g);
        this.f3184k = new int[iM3659g];
        this.f3181h = -1;
    }

    public C1005h() {
        this.f3180g = 6;
        this.f3182i = new Object();
    }

    public C1005h(C1962c0 c1962c0) {
        this.f3180g = 2;
        this.f3184k = c1962c0;
        this.f3182i = (C1958a0) c1962c0.f6663a;
        this.f3183j = null;
    }

    public C1005h(int i9) {
        this.f3180g = 4;
        this.f3182i = new ArrayList(i9);
        this.f3181h = 0;
        this.f3183j = null;
        this.f3184k = null;
    }
}
