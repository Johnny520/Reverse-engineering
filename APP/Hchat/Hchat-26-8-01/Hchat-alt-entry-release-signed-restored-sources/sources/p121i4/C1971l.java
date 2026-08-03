package p121i4;

import bsh.C0353j;
import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.HashMap;
import p000a.AbstractC0000a;
import p096g8.C1361b;
import p136j8.C2104o;
import p295u4.C4252b;
import p295u4.InterfaceC4251a;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4472u;
import p311v4.C4453d0;
import p311v4.C4455e0;
import p311v4.C4462k;
import p311v4.C4465n;
import p311v4.C4466o;
import p311v4.C4468q;
import p311v4.C4469r;
import p311v4.C4473v;
import p326w4.C4683c;
import p376z4.C6093g;

/* JADX INFO: renamed from: i4.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1971l implements InterfaceC4251a {

    /* JADX INFO: renamed from: g */
    public final Object f6685g;

    /* JADX INFO: renamed from: h */
    public final Object f6686h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C1968i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1971l(C1361b c1361b, C4455e0 c4455e0) {
        if (c4455e0 == null) {
            C0353j.m1305c("pool == null");
            throw null;
        }
        this.f6685g = c1361b;
        this.f6686h = c4455e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int m4870a(int i9, InterfaceC1970k interfaceC1970k) {
        int iM3657e;
        int i10 = i9;
        C4455e0 c4455e0 = (C4455e0) this.f6686h;
        C1361b c1361b = (C1361b) this.f6685g;
        byte[] bArr = c1361b.f4511b;
        try {
            iM3657e = c1361b.m3657e(i10);
            int i11 = AbstractC1967h.f6679a[iM3657e];
        } catch (C1960b0 e6) {
            e = e6;
        } catch (RuntimeException e7) {
            e = e7;
        }
        try {
            switch (iM3657e) {
                case 0:
                    interfaceC1970k.mo2567a(iM3657e, i10, C4683c.f15644w);
                    return 1;
                case 1:
                    interfaceC1970k.mo2568b(18, i9, 1, C4469r.f14816g, 0);
                    return 1;
                case 2:
                    interfaceC1970k.mo2568b(18, i9, 1, C4466o.f14802i, -1);
                    return 1;
                case 3:
                    interfaceC1970k.mo2568b(18, i9, 1, C4466o.f14803j, 0);
                    return 1;
                case 4:
                    interfaceC1970k.mo2568b(18, i9, 1, C4466o.f14804k, 1);
                    return 1;
                case 5:
                    interfaceC1970k.mo2568b(18, i9, 1, C4466o.f14805l, 2);
                    return 1;
                case 6:
                    interfaceC1970k.mo2568b(18, i9, 1, C4466o.f14806m, 3);
                    return 1;
                case 7:
                    interfaceC1970k.mo2568b(18, i9, 1, C4466o.f14807n, 4);
                    return 1;
                case 8:
                    interfaceC1970k.mo2568b(18, i9, 1, C4466o.f14808o, 5);
                    return 1;
                case 9:
                    interfaceC1970k.mo2568b(18, i9, 1, C4473v.f14819h, 0);
                    return 1;
                case 10:
                    interfaceC1970k.mo2568b(18, i9, 1, C4473v.f14820i, 0);
                    return 1;
                case 11:
                    interfaceC1970k.mo2568b(18, i9, 1, C4465n.f14798h, 0);
                    return 1;
                case 12:
                    interfaceC1970k.mo2568b(18, i9, 1, C4465n.f14799i, 0);
                    return 1;
                case 13:
                    interfaceC1970k.mo2568b(18, i9, 1, C4465n.f14800j, 0);
                    return 1;
                case 14:
                    interfaceC1970k.mo2568b(18, i9, 1, C4462k.f14795h, 0);
                    return 1;
                case 15:
                    interfaceC1970k.mo2568b(18, i9, 1, C4462k.f14796i, 0);
                    return 1;
                case 16:
                    int i12 = i9 + 1;
                    c1361b.m3653a(i12, i9 + 2);
                    byte b10 = bArr[i12];
                    interfaceC1970k.mo2568b(18, i9, 2, C4466o.m8909o(b10), b10);
                    return 2;
                case 17:
                    int iM3656d = c1361b.m3656d(i9 + 1);
                    interfaceC1970k.mo2568b(18, i9, 3, C4466o.m8909o(iM3656d), iM3656d);
                    return 3;
                case 18:
                    AbstractC4446a abstractC4446aM8906l = c4455e0.m8906l(c1361b.m3657e(i9 + 1));
                    interfaceC1970k.mo2568b(18, i9, 2, abstractC4446aM8906l, abstractC4446aM8906l instanceof C4466o ? ((C4466o) abstractC4446aM8906l).m8910n() : 0);
                    return 2;
                case 19:
                    AbstractC4446a abstractC4446aM8906l2 = c4455e0.m8906l(c1361b.m3659g(i9 + 1));
                    interfaceC1970k.mo2568b(18, i9, 3, abstractC4446aM8906l2, abstractC4446aM8906l2 instanceof C4466o ? ((C4466o) abstractC4446aM8906l2).m8910n() : 0);
                    return 3;
                case 20:
                    interfaceC1970k.mo2568b(20, i9, 3, c4455e0.m8906l(c1361b.m3659g(i9 + 1)), 0);
                    return 3;
                case 21:
                    interfaceC1970k.mo2575i(21, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15641t, 0);
                    return 2;
                case 22:
                    interfaceC1970k.mo2575i(21, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15642u, 0);
                    return 2;
                case 23:
                    interfaceC1970k.mo2575i(21, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15640s, 0);
                    return 2;
                case 24:
                    interfaceC1970k.mo2575i(21, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15639r, 0);
                    return 2;
                case 25:
                    interfaceC1970k.mo2575i(21, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15613E, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    interfaceC1970k.mo2575i(21, i9, 1, iM3657e - 26, C4683c.f15641t, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case 33:
                    interfaceC1970k.mo2575i(21, i9, 1, iM3657e - 30, C4683c.f15642u, 0);
                    return 1;
                case 34:
                case 35:
                case 36:
                case 37:
                    interfaceC1970k.mo2575i(21, i9, 1, iM3657e - 34, C4683c.f15640s, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    interfaceC1970k.mo2575i(21, i9, 1, iM3657e - 38, C4683c.f15639r, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case ParserConstants.PROTECTED /* 45 */:
                    interfaceC1970k.mo2575i(21, i10, 1, iM3657e - 42, C4683c.f15613E, 0);
                    return 1;
                case 46:
                    interfaceC1970k.mo2567a(46, i10, C4683c.f15641t);
                    return 1;
                case 47:
                    interfaceC1970k.mo2567a(46, i10, C4683c.f15642u);
                    return 1;
                case 48:
                    interfaceC1970k.mo2567a(46, i10, C4683c.f15640s);
                    return 1;
                case 49:
                    interfaceC1970k.mo2567a(46, i10, C4683c.f15639r);
                    return 1;
                case 50:
                    interfaceC1970k.mo2567a(46, i10, C4683c.f15613E);
                    return 1;
                case 51:
                    interfaceC1970k.mo2567a(46, i10, C4683c.f15637p);
                    return 1;
                case 52:
                    interfaceC1970k.mo2567a(46, i10, C4683c.f15638q);
                    return 1;
                case 53:
                    interfaceC1970k.mo2567a(46, i10, C4683c.f15643v);
                    return 1;
                case 54:
                    interfaceC1970k.mo2575i(54, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15641t, 0);
                    return 2;
                case 55:
                    interfaceC1970k.mo2575i(54, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15642u, 0);
                    return 2;
                case 56:
                    interfaceC1970k.mo2575i(54, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15640s, 0);
                    return 2;
                case 57:
                    interfaceC1970k.mo2575i(54, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15639r, 0);
                    return 2;
                case 58:
                    interfaceC1970k.mo2575i(54, i9, 2, c1361b.m3657e(i9 + 1), C4683c.f15613E, 0);
                    return 2;
                case ParserConstants.VOLATILE /* 59 */:
                case ParserConstants.WHEN /* 60 */:
                case ParserConstants.WHILE /* 61 */:
                case ParserConstants.INTEGER_LITERAL /* 62 */:
                    interfaceC1970k.mo2575i(54, i9, 1, iM3657e - 59, C4683c.f15641t, 0);
                    return 1;
                case ParserConstants.DECIMAL_LITERAL /* 63 */:
                case 64:
                case 65:
                case 66:
                    interfaceC1970k.mo2575i(54, i9, 1, iM3657e - 63, C4683c.f15642u, 0);
                    return 1;
                case 67:
                case 68:
                case 69:
                case 70:
                    interfaceC1970k.mo2575i(54, i9, 1, iM3657e - 67, C4683c.f15640s, 0);
                    return 1;
                case 71:
                case 72:
                case 73:
                case 74:
                    interfaceC1970k.mo2575i(54, i9, 1, iM3657e - 71, C4683c.f15639r, 0);
                    return 1;
                case 75:
                case ParserConstants.LPAREN /* 76 */:
                case ParserConstants.RPAREN /* 77 */:
                case ParserConstants.LBRACE /* 78 */:
                    interfaceC1970k.mo2575i(54, i10, 1, iM3657e - 75, C4683c.f15613E, 0);
                    return 1;
                case 79:
                    interfaceC1970k.mo2567a(79, i10, C4683c.f15641t);
                    return 1;
                case 80:
                    interfaceC1970k.mo2567a(79, i10, C4683c.f15642u);
                    return 1;
                case 81:
                    interfaceC1970k.mo2567a(79, i10, C4683c.f15640s);
                    return 1;
                case 82:
                    interfaceC1970k.mo2567a(79, i10, C4683c.f15639r);
                    return 1;
                case 83:
                    interfaceC1970k.mo2567a(79, i10, C4683c.f15613E);
                    return 1;
                case 84:
                    interfaceC1970k.mo2567a(79, i10, C4683c.f15637p);
                    return 1;
                case 85:
                    interfaceC1970k.mo2567a(79, i10, C4683c.f15638q);
                    return 1;
                case 86:
                    interfaceC1970k.mo2567a(79, i10, C4683c.f15643v);
                    return 1;
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                    interfaceC1970k.mo2567a(iM3657e, i10, C4683c.f15644w);
                    return 1;
                case 96:
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
                    interfaceC1970k.mo2567a(iM3657e, i10, C4683c.f15641t);
                    return 1;
                case 97:
                case 101:
                case 105:
                case 109:
                case 113:
                case 117:
                case 121:
                case 123:
                case 125:
                case 127:
                case 129:
                case 131:
                    interfaceC1970k.mo2567a(iM3657e - 1, i10, C4683c.f15642u);
                    return 1;
                case 98:
                case 102:
                case 106:
                case 110:
                case 114:
                case 118:
                    interfaceC1970k.mo2567a(iM3657e - 2, i10, C4683c.f15640s);
                    return 1;
                case 99:
                case 103:
                case 107:
                case 111:
                case 115:
                case 119:
                    interfaceC1970k.mo2567a(iM3657e - 3, i10, C4683c.f15639r);
                    return 1;
                case 132:
                    int iM3657e2 = c1361b.m3657e(i10 + 1);
                    int i13 = i10 + 2;
                    c1361b.m3653a(i13, i10 + 3);
                    interfaceC1970k.mo2575i(iM3657e, i10, 3, iM3657e2, C4683c.f15641t, bArr[i13]);
                    return 3;
                case 133:
                case 140:
                case 143:
                    interfaceC1970k.mo2567a(iM3657e, i10, C4683c.f15642u);
                    return 1;
                case 134:
                case 137:
                case 144:
                    interfaceC1970k.mo2567a(iM3657e, i10, C4683c.f15640s);
                    return 1;
                case 135:
                case 138:
                case 141:
                    interfaceC1970k.mo2567a(iM3657e, i10, C4683c.f15639r);
                    return 1;
                case 136:
                case 139:
                case 142:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case Opcodes.ARRAYLENGTH /* 190 */:
                    interfaceC1970k.mo2567a(iM3657e, i10, C4683c.f15641t);
                    return 1;
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
                case Opcodes.JSR /* 168 */:
                case Opcodes.IFNULL /* 198 */:
                case Opcodes.IFNONNULL /* 199 */:
                    interfaceC1970k.mo2574h(iM3657e, i10, 3, c1361b.m3656d(i10 + 1) + i10);
                    return 3;
                case Opcodes.RET /* 169 */:
                    interfaceC1970k.mo2575i(iM3657e, i10, 2, c1361b.m3657e(i10 + 1), C4683c.f15646y, 0);
                    return 2;
                case Opcodes.TABLESWITCH /* 170 */:
                    return m4873e(i9, interfaceC1970k);
                case Opcodes.LOOKUPSWITCH /* 171 */:
                    return m4871b(i9, interfaceC1970k);
                case Opcodes.IRETURN /* 172 */:
                    interfaceC1970k.mo2567a(Opcodes.IRETURN, i10, C4683c.f15641t);
                    return 1;
                case Opcodes.LRETURN /* 173 */:
                    interfaceC1970k.mo2567a(Opcodes.IRETURN, i10, C4683c.f15642u);
                    return 1;
                case Opcodes.FRETURN /* 174 */:
                    interfaceC1970k.mo2567a(Opcodes.IRETURN, i10, C4683c.f15640s);
                    return 1;
                case Opcodes.DRETURN /* 175 */:
                    interfaceC1970k.mo2567a(Opcodes.IRETURN, i10, C4683c.f15639r);
                    return 1;
                case Opcodes.ARETURN /* 176 */:
                    interfaceC1970k.mo2567a(Opcodes.IRETURN, i10, C4683c.f15613E);
                    return 1;
                case Opcodes.RETURN /* 177 */:
                case Opcodes.ATHROW /* 191 */:
                case Opcodes.MONITORENTER /* 194 */:
                case Opcodes.MONITOREXIT /* 195 */:
                    interfaceC1970k.mo2567a(iM3657e, i10, C4683c.f15644w);
                    return 1;
                case Opcodes.GETSTATIC /* 178 */:
                case Opcodes.PUTSTATIC /* 179 */:
                case Opcodes.GETFIELD /* 180 */:
                case Opcodes.PUTFIELD /* 181 */:
                case Opcodes.INVOKEVIRTUAL /* 182 */:
                case Opcodes.INVOKESPECIAL /* 183 */:
                case Opcodes.INVOKESTATIC /* 184 */:
                case Opcodes.NEW /* 187 */:
                case Opcodes.ANEWARRAY /* 189 */:
                case Opcodes.CHECKCAST /* 192 */:
                case Opcodes.INSTANCEOF /* 193 */:
                    interfaceC1970k.mo2568b(iM3657e, i9, 3, c4455e0.m8906l(c1361b.m3659g(i9 + 1)), 0);
                    return 3;
                case Opcodes.INVOKEINTERFACE /* 185 */:
                    interfaceC1970k.mo2568b(iM3657e, i9, 5, c4455e0.m8906l(c1361b.m3659g(i9 + 1)), c1361b.m3657e(i9 + 3) | (c1361b.m3657e(i9 + 4) << 8));
                    return 5;
                case Opcodes.INVOKEDYNAMIC /* 186 */:
                    interfaceC1970k.mo2568b(iM3657e, i9, 5, (C4468q) c4455e0.m8906l(c1361b.m3659g(i9 + 1)), 0);
                    return 5;
                case Opcodes.NEWARRAY /* 188 */:
                    return m4872c(i9, interfaceC1970k);
                case 196:
                    return m4874f(i9, interfaceC1970k);
                case Opcodes.MULTIANEWARRAY /* 197 */:
                    interfaceC1970k.mo2568b(iM3657e, i10, 4, c4455e0.m8906l(c1361b.m3659g(i10 + 1)), c1361b.m3657e(i10 + 3));
                    return 4;
                case 200:
                case 201:
                    interfaceC1970k.mo2574h(iM3657e == 200 ? Opcodes.GOTO : Opcodes.JSR, i10, 5, c1361b.m3654b(i10 + 1) + i10);
                    return 5;
                default:
                    interfaceC1970k.mo2570d(iM3657e, i10);
                    return 1;
            }
        } catch (C1960b0 e10) {
            e = e10;
            i10 = i9;
            e.m2687a("...at bytecode offset ".concat(AbstractC0000a.m48Y0(i10)));
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            i10 = i9;
            C1960b0 c1960b0 = new C1960b0(null, e);
            c1960b0.m2687a("...at bytecode offset ".concat(AbstractC0000a.m48Y0(i10)));
            throw c1960b0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m4871b(int i9, InterfaceC1970k interfaceC1970k) {
        C1361b c1361b = (C1361b) this.f6685g;
        int i10 = (i9 + 4) & (-4);
        int iM3657e = 0;
        for (int i11 = i9 + 1; i11 < i10; i11++) {
            iM3657e = (iM3657e << 8) | c1361b.m3657e(i11);
        }
        int iM3654b = c1361b.m3654b(i10) + i9;
        int iM3654b2 = c1361b.m3654b(i10 + 4);
        int i12 = i10 + 8;
        C1973n c1973n = new C1973n(iM3654b2, 1);
        for (int i13 = 0; i13 < iM3654b2; i13++) {
            int iM3654b3 = c1361b.m3654b(i12);
            int iM3654b4 = c1361b.m3654b(i12 + 4) + i9;
            i12 += 8;
            c1973n.m10855j();
            if (iM3654b4 < 0) {
                C2104o.m5294t("target < 0");
                return 0;
            }
            ((C6093g) c1973n.f6694j).m10844l(iM3654b3);
            ((C6093g) c1973n.f6695k).m10844l(iM3654b4);
        }
        c1973n.m4890s(iM3654b);
        c1973n.m4889r();
        c1973n.mo4882i();
        int i14 = i12 - i9;
        interfaceC1970k.mo2573g(i9, i14, c1973n, iM3657e);
        return i14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m4872c(int i9, InterfaceC1970k interfaceC1970k) {
        C4453d0 c4453d0;
        int i10;
        C1361b c1361b = (C1361b) this.f6685g;
        int iM3657e = c1361b.m3657e(i9 + 1);
        switch (iM3657e) {
            case 4:
                c4453d0 = C4453d0.f14777t;
                break;
            case 5:
                c4453d0 = C4453d0.f14779v;
                break;
            case 6:
                c4453d0 = C4453d0.f14781x;
                break;
            case 7:
                c4453d0 = C4453d0.f14780w;
                break;
            case 8:
                c4453d0 = C4453d0.f14778u;
                break;
            case 9:
                c4453d0 = C4453d0.f14763A;
                break;
            case 10:
                c4453d0 = C4453d0.f14783z;
                break;
            case 11:
                c4453d0 = C4453d0.f14782y;
                break;
            default:
                throw new C1960b0("bad newarray code ".concat(AbstractC0000a.m44W0(iM3657e)), null);
        }
        int iMo2572f = interfaceC1970k.mo2572f();
        C1969j c1969j = new C1969j();
        int i11 = 0;
        if (iMo2572f >= 0) {
            m4870a(iMo2572f, c1969j);
            i10 = ((c1969j.f6682h instanceof C4466o) && c1969j.f6683i + iMo2572f == i9) ? c1969j.f6684j : 0;
        }
        int i12 = i9 + 2;
        ArrayList arrayList = new ArrayList();
        if (i10 != 0) {
            while (true) {
                int i13 = i12 + 1;
                if (c1361b.m3657e(i12) == 89) {
                    m4870a(i13, c1969j);
                    int i14 = c1969j.f6683i;
                    if (i14 != 0 && (c1969j.f6682h instanceof C4466o) && c1969j.f6684j == i11) {
                        int i15 = i13 + i14;
                        m4870a(i15, c1969j);
                        int i16 = c1969j.f6683i;
                        if (i16 != 0) {
                            AbstractC4446a abstractC4446a = c1969j.f6682h;
                            if (abstractC4446a instanceof AbstractC4472u) {
                                int i17 = i15 + i16;
                                arrayList.add(abstractC4446a);
                                int i18 = i17 + 1;
                                int iM3657e2 = c1361b.m3657e(i17);
                                switch (iM3657e) {
                                    case 4:
                                    case 8:
                                        if (iM3657e2 == 84) {
                                            i11++;
                                            i12 = i18;
                                        }
                                        break;
                                    case 5:
                                        if (iM3657e2 == 85) {
                                            i11++;
                                            i12 = i18;
                                        }
                                        break;
                                    case 6:
                                        if (iM3657e2 == 81) {
                                            i11++;
                                            i12 = i18;
                                        }
                                        break;
                                    case 7:
                                        if (iM3657e2 == 82) {
                                            i11++;
                                            i12 = i18;
                                        }
                                        break;
                                    case 9:
                                        if (iM3657e2 == 86) {
                                            i11++;
                                            i12 = i18;
                                        }
                                        break;
                                    case 10:
                                        if (iM3657e2 == 79) {
                                            i11++;
                                            i12 = i18;
                                        }
                                        break;
                                    case 11:
                                        if (iM3657e2 == 80) {
                                            i11++;
                                            i12 = i18;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i11 < 2 || i11 != i10) {
            interfaceC1970k.mo2569c(i9, 2, c4453d0, null);
            return 2;
        }
        int i19 = i12 - i9;
        interfaceC1970k.mo2569c(i9, i19, c4453d0, arrayList);
        return i19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4251a
    /* JADX INFO: renamed from: d */
    public void mo599d(C4252b c4252b) {
        if (((C1985z) this.f6686h).m4919h(c4252b)) {
            ((C6093g) this.f6685g).m10844l(c4252b.f13930a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public int m4873e(int i9, InterfaceC1970k interfaceC1970k) {
        C1361b c1361b = (C1361b) this.f6685g;
        int i10 = (i9 + 4) & (-4);
        int iM3657e = 0;
        for (int i11 = i9 + 1; i11 < i10; i11++) {
            iM3657e = (iM3657e << 8) | c1361b.m3657e(i11);
        }
        int iM3654b = c1361b.m3654b(i10) + i9;
        int iM3654b2 = c1361b.m3654b(i10 + 4);
        int iM3654b3 = c1361b.m3654b(i10 + 8);
        int i12 = (iM3654b3 - iM3654b2) + 1;
        int i13 = i10 + 12;
        if (iM3654b2 > iM3654b3) {
            throw new C1960b0("low / high inversion", null);
        }
        C1973n c1973n = new C1973n(i12, 1);
        for (int i14 = 0; i14 < i12; i14++) {
            int iM3654b4 = c1361b.m3654b(i13) + i9;
            i13 += 4;
            int i15 = iM3654b2 + i14;
            c1973n.m10855j();
            if (iM3654b4 < 0) {
                C2104o.m5294t("target < 0");
                return 0;
            }
            ((C6093g) c1973n.f6694j).m10844l(i15);
            ((C6093g) c1973n.f6695k).m10844l(iM3654b4);
        }
        c1973n.m4890s(iM3654b);
        c1973n.m4889r();
        c1973n.mo4882i();
        int i16 = i13 - i9;
        interfaceC1970k.mo2573g(i9, i16, c1973n, iM3657e);
        return i16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public int m4874f(int i9, InterfaceC1970k interfaceC1970k) {
        C1361b c1361b = (C1361b) this.f6685g;
        int iM3657e = c1361b.m3657e(i9 + 1);
        int iM3659g = c1361b.m3659g(i9 + 2);
        if (iM3657e == 132) {
            interfaceC1970k.mo2575i(iM3657e, i9, 6, iM3659g, C4683c.f15641t, c1361b.m3656d(i9 + 4));
            return 6;
        }
        if (iM3657e == 169) {
            interfaceC1970k.mo2575i(iM3657e, i9, 4, iM3659g, C4683c.f15646y, 0);
            return 4;
        }
        switch (iM3657e) {
            case 21:
                interfaceC1970k.mo2575i(21, i9, 4, iM3659g, C4683c.f15641t, 0);
                return 4;
            case 22:
                interfaceC1970k.mo2575i(21, i9, 4, iM3659g, C4683c.f15642u, 0);
                return 4;
            case 23:
                interfaceC1970k.mo2575i(21, i9, 4, iM3659g, C4683c.f15640s, 0);
                return 4;
            case 24:
                interfaceC1970k.mo2575i(21, i9, 4, iM3659g, C4683c.f15639r, 0);
                return 4;
            case 25:
                interfaceC1970k.mo2575i(21, i9, 4, iM3659g, C4683c.f15613E, 0);
                return 4;
            default:
                switch (iM3657e) {
                    case 54:
                        interfaceC1970k.mo2575i(54, i9, 4, iM3659g, C4683c.f15641t, 0);
                        return 4;
                    case 55:
                        interfaceC1970k.mo2575i(54, i9, 4, iM3659g, C4683c.f15642u, 0);
                        return 4;
                    case 56:
                        interfaceC1970k.mo2575i(54, i9, 4, iM3659g, C4683c.f15640s, 0);
                        return 4;
                    case 57:
                        interfaceC1970k.mo2575i(54, i9, 4, iM3659g, C4683c.f15639r, 0);
                        return 4;
                    case 58:
                        interfaceC1970k.mo2575i(54, i9, 4, iM3659g, C4683c.f15613E, 0);
                        return 4;
                    default:
                        interfaceC1970k.mo2570d(196, i9);
                        return 1;
                }
        }
    }

    public C1971l(C1985z c1985z) {
        this.f6686h = c1985z;
        this.f6685g = new HashMap();
    }

    public C1971l(C1985z c1985z, C6093g c6093g) {
        this.f6685g = c6093g;
        this.f6686h = c1985z;
    }
}
