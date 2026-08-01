package p045d5;

import bsh.C1259t2;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.p218ws.WebSocketProtocol;
import p254r5.AbstractC6487a;
import p254r5.C6496e0;
import p254r5.C6506k;
import p254r5.C6509n;
import p254r5.C6510o;
import p254r5.C6512q;
import p254r5.C6513r;
import p254r5.C6517v;
import p254r5.InterfaceC6489b;
import p269s5.C7188c;
import p309v5.AbstractC8821c;
import p309v5.AbstractC8826h;
import p309v5.C8822d;

/* JADX INFO: renamed from: d5.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1888j {

    /* JADX INFO: renamed from: c */
    public static final c f5249c = new a();

    /* JADX INFO: renamed from: a */
    public final C8822d f5250a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6489b f5251b;

    /* JADX INFO: renamed from: d5.j$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo6695a(int i10, int i11, int i12, C1904z c1904z, int i13);

        /* JADX INFO: renamed from: b */
        void mo6696b(int i10, int i11, int i12, int i13, C7188c c7188c, int i14);

        /* JADX INFO: renamed from: c */
        void mo6697c(int i10, int i11, int i12, AbstractC6487a abstractC6487a, int i13);

        /* JADX INFO: renamed from: d */
        int mo6698d();

        /* JADX INFO: renamed from: e */
        void mo6699e(int i10, int i11, int i12, C7188c c7188c);

        /* JADX INFO: renamed from: f */
        void mo6700f(int i10, int i11, int i12, int i13);

        /* JADX INFO: renamed from: g */
        void mo6701g(int i10);

        /* JADX INFO: renamed from: h */
        void mo6702h(int i10, int i11, C6496e0 c6496e0, ArrayList arrayList);

        /* JADX INFO: renamed from: i */
        void mo6703i(int i10, int i11, int i12);
    }

    public C1888j(C8822d c8822d, InterfaceC6489b interfaceC6489b) {
        if (c8822d == null) {
            C1259t2.m5095a("bytes == null");
            throw null;
        }
        if (interfaceC6489b == null) {
            C1259t2.m5095a("pool == null");
            throw null;
        }
        this.f5250a = c8822d;
        this.f5251b = interfaceC6489b;
    }

    /* JADX INFO: renamed from: a */
    public int m6738a() {
        return this.f5250a.m33861q() + 4;
    }

    /* JADX INFO: renamed from: b */
    public void m6739b(c cVar) {
        int iM33861q = this.f5250a.m33861q();
        int iM6741d = 0;
        while (iM6741d < iM33861q) {
            iM6741d += m6741d(iM6741d, cVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public C8822d m6740c() {
        return this.f5250a;
    }

    /* JADX INFO: renamed from: d */
    public int m6741d(int i10, c cVar) {
        int i11;
        RuntimeException runtimeException;
        C1902x c1902x;
        int iM33856l;
        if (cVar == null) {
            cVar = f5249c;
        }
        c cVar2 = cVar;
        try {
            iM33856l = this.f5250a.m33856l(i10);
            AbstractC1887i.m6736a(iM33856l);
            i11 = Opcodes.IRETURN;
        } catch (C1902x e10) {
            e = e10;
            i11 = i10;
        } catch (RuntimeException e11) {
            e = e11;
            i11 = i10;
        }
        try {
            try {
                switch (iM33856l) {
                    case 0:
                        cVar2.mo6699e(iM33856l, i10, 1, C7188c.f23828G);
                        return 1;
                    case 1:
                        cVar2.mo6697c(18, i10, 1, C6513r.f20434q, 0);
                        return 1;
                    case 2:
                        cVar2.mo6697c(18, i10, 1, C6510o.f20420s, -1);
                        return 1;
                    case 3:
                        cVar2.mo6697c(18, i10, 1, C6510o.f20421t, 0);
                        return 1;
                    case 4:
                        cVar2.mo6697c(18, i10, 1, C6510o.f20422u, 1);
                        return 1;
                    case 5:
                        cVar2.mo6697c(18, i10, 1, C6510o.f20423v, 2);
                        return 1;
                    case 6:
                        cVar2.mo6697c(18, i10, 1, C6510o.f20424w, 3);
                        return 1;
                    case 7:
                        cVar2.mo6697c(18, i10, 1, C6510o.f20425x, 4);
                        return 1;
                    case 8:
                        cVar2.mo6697c(18, i10, 1, C6510o.f20426y, 5);
                        return 1;
                    case 9:
                        cVar2.mo6697c(18, i10, 1, C6517v.f20437r, 0);
                        return 1;
                    case 10:
                        cVar2.mo6697c(18, i10, 1, C6517v.f20438s, 0);
                        return 1;
                    case Opcodes.FCONST_0 /* 11 */:
                        cVar2.mo6697c(18, i10, 1, C6509n.f20416r, 0);
                        return 1;
                    case Opcodes.FCONST_1 /* 12 */:
                        cVar2.mo6697c(18, i10, 1, C6509n.f20417s, 0);
                        return 1;
                    case Opcodes.FCONST_2 /* 13 */:
                        cVar2.mo6697c(18, i10, 1, C6509n.f20418t, 0);
                        return 1;
                    case Opcodes.DCONST_0 /* 14 */:
                        cVar2.mo6697c(18, i10, 1, C6506k.f20413r, 0);
                        return 1;
                    case 15:
                        cVar2.mo6697c(18, i10, 1, C6506k.f20414s, 0);
                        return 1;
                    case 16:
                        int iM33850f = this.f5250a.m33850f(i10 + 1);
                        cVar2.mo6697c(18, i10, 2, C6510o.m25781v(iM33850f), iM33850f);
                        return 2;
                    case Opcodes.SIPUSH /* 17 */:
                        int iM33855k = this.f5250a.m33855k(i10 + 1);
                        cVar2.mo6697c(18, i10, 3, C6510o.m25781v(iM33855k), iM33855k);
                        return 3;
                    case Opcodes.LDC /* 18 */:
                        AbstractC6487a abstractC6487a = this.f5251b.get(this.f5250a.m33856l(i10 + 1));
                        cVar2.mo6697c(18, i10, 2, abstractC6487a, abstractC6487a instanceof C6510o ? ((C6510o) abstractC6487a).m25782u() : 0);
                        return 2;
                    case 19:
                        AbstractC6487a abstractC6487a2 = this.f5251b.get(this.f5250a.m33858n(i10 + 1));
                        cVar2.mo6697c(18, i10, 3, abstractC6487a2, abstractC6487a2 instanceof C6510o ? ((C6510o) abstractC6487a2).m25782u() : 0);
                        return 3;
                    case 20:
                        cVar2.mo6697c(20, i10, 3, this.f5251b.get(this.f5250a.m33858n(i10 + 1)), 0);
                        return 3;
                    case Opcodes.ILOAD /* 21 */:
                        cVar2.mo6696b(21, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23825D, 0);
                        return 2;
                    case Opcodes.LLOAD /* 22 */:
                        cVar2.mo6696b(21, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23826E, 0);
                        return 2;
                    case Opcodes.FLOAD /* 23 */:
                        cVar2.mo6696b(21, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23824C, 0);
                        return 2;
                    case Opcodes.DLOAD /* 24 */:
                        cVar2.mo6696b(21, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23823B, 0);
                        return 2;
                    case Opcodes.ALOAD /* 25 */:
                        cVar2.mo6696b(21, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23837P, 0);
                        return 2;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        cVar2.mo6696b(21, i10, 1, iM33856l - 26, C7188c.f23825D, 0);
                        return 1;
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                        cVar2.mo6696b(21, i10, 1, iM33856l - 30, C7188c.f23826E, 0);
                        return 1;
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        cVar2.mo6696b(21, i10, 1, iM33856l - 34, C7188c.f23824C, 0);
                        return 1;
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        cVar2.mo6696b(21, i10, 1, iM33856l - 38, C7188c.f23823B, 0);
                        return 1;
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                        cVar2.mo6696b(21, i10, 1, iM33856l - 42, C7188c.f23837P, 0);
                        return 1;
                    case Opcodes.IALOAD /* 46 */:
                        cVar2.mo6699e(46, i10, 1, C7188c.f23825D);
                        return 1;
                    case 47:
                        cVar2.mo6699e(46, i10, 1, C7188c.f23826E);
                        return 1;
                    case 48:
                        cVar2.mo6699e(46, i10, 1, C7188c.f23824C);
                        return 1;
                    case 49:
                        cVar2.mo6699e(46, i10, 1, C7188c.f23823B);
                        return 1;
                    case Opcodes.AALOAD /* 50 */:
                        cVar2.mo6699e(46, i10, 1, C7188c.f23837P);
                        return 1;
                    case Opcodes.BALOAD /* 51 */:
                        cVar2.mo6699e(46, i10, 1, C7188c.f23861z);
                        return 1;
                    case 52:
                        cVar2.mo6699e(46, i10, 1, C7188c.f23822A);
                        return 1;
                    case Opcodes.SALOAD /* 53 */:
                        cVar2.mo6699e(46, i10, 1, C7188c.f23827F);
                        return 1;
                    case Opcodes.ISTORE /* 54 */:
                        cVar2.mo6696b(54, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23825D, 0);
                        return 2;
                    case Opcodes.LSTORE /* 55 */:
                        cVar2.mo6696b(54, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23826E, 0);
                        return 2;
                    case Opcodes.FSTORE /* 56 */:
                        cVar2.mo6696b(54, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23824C, 0);
                        return 2;
                    case Opcodes.DSTORE /* 57 */:
                        cVar2.mo6696b(54, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23823B, 0);
                        return 2;
                    case Opcodes.ASTORE /* 58 */:
                        cVar2.mo6696b(54, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23837P, 0);
                        return 2;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                        cVar2.mo6696b(54, i10, 1, iM33856l - 59, C7188c.f23825D, 0);
                        return 1;
                    case 63:
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    case 65:
                    case 66:
                        cVar2.mo6696b(54, i10, 1, iM33856l - 63, C7188c.f23826E, 0);
                        return 1;
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                        cVar2.mo6696b(54, i10, 1, iM33856l - 67, C7188c.f23824C, 0);
                        return 1;
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        cVar2.mo6696b(54, i10, 1, iM33856l - 71, C7188c.f23823B, 0);
                        return 1;
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                        cVar2.mo6696b(54, i10, 1, iM33856l - 75, C7188c.f23837P, 0);
                        return 1;
                    case Opcodes.IASTORE /* 79 */:
                        cVar2.mo6699e(79, i10, 1, C7188c.f23825D);
                        return 1;
                    case 80:
                        cVar2.mo6699e(79, i10, 1, C7188c.f23826E);
                        return 1;
                    case 81:
                        cVar2.mo6699e(79, i10, 1, C7188c.f23824C);
                        return 1;
                    case 82:
                        cVar2.mo6699e(79, i10, 1, C7188c.f23823B);
                        return 1;
                    case Opcodes.AASTORE /* 83 */:
                        cVar2.mo6699e(79, i10, 1, C7188c.f23837P);
                        return 1;
                    case Opcodes.BASTORE /* 84 */:
                        cVar2.mo6699e(79, i10, 1, C7188c.f23861z);
                        return 1;
                    case Opcodes.CASTORE /* 85 */:
                        cVar2.mo6699e(79, i10, 1, C7188c.f23822A);
                        return 1;
                    case 86:
                        cVar2.mo6699e(79, i10, 1, C7188c.f23827F);
                        return 1;
                    case Opcodes.POP /* 87 */:
                    case Opcodes.POP2 /* 88 */:
                    case Opcodes.DUP /* 89 */:
                    case 90:
                    case 91:
                    case Opcodes.DUP2 /* 92 */:
                    case 93:
                    case 94:
                    case Opcodes.SWAP /* 95 */:
                        cVar2.mo6699e(iM33856l, i10, 1, C7188c.f23828G);
                        return 1;
                    case Opcodes.IADD /* 96 */:
                    case 100:
                    case Opcodes.IMUL /* 104 */:
                    case Opcodes.IDIV /* 108 */:
                    case Opcodes.IREM /* 112 */:
                    case Opcodes.INEG /* 116 */:
                    case Opcodes.ISHL /* 120 */:
                    case Opcodes.ISHR /* 122 */:
                    case Opcodes.IUSHR /* 124 */:
                    case 126:
                    case 128:
                    case Opcodes.IXOR /* 130 */:
                        cVar2.mo6699e(iM33856l, i10, 1, C7188c.f23825D);
                        return 1;
                    case Opcodes.LADD /* 97 */:
                    case 101:
                    case Opcodes.LMUL /* 105 */:
                    case Opcodes.LDIV /* 109 */:
                    case Opcodes.LREM /* 113 */:
                    case Opcodes.LNEG /* 117 */:
                    case Opcodes.LSHL /* 121 */:
                    case Opcodes.LSHR /* 123 */:
                    case Opcodes.LUSHR /* 125 */:
                    case 127:
                    case Opcodes.LOR /* 129 */:
                    case Opcodes.LXOR /* 131 */:
                        cVar2.mo6699e(iM33856l - 1, i10, 1, C7188c.f23826E);
                        return 1;
                    case 98:
                    case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                    case 106:
                    case 110:
                    case 114:
                    case Opcodes.FNEG /* 118 */:
                        cVar2.mo6699e(iM33856l - 2, i10, 1, C7188c.f23824C);
                        return 1;
                    case 99:
                    case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                    case 107:
                    case 111:
                    case 115:
                    case Opcodes.DNEG /* 119 */:
                        cVar2.mo6699e(iM33856l - 3, i10, 1, C7188c.f23823B);
                        return 1;
                    case Opcodes.IINC /* 132 */:
                        cVar2.mo6696b(iM33856l, i10, 3, this.f5250a.m33856l(i10 + 1), C7188c.f23825D, this.f5250a.m33850f(i10 + 2));
                        return 3;
                    case Opcodes.I2L /* 133 */:
                    case Opcodes.F2L /* 140 */:
                    case Opcodes.D2L /* 143 */:
                        cVar2.mo6699e(iM33856l, i10, 1, C7188c.f23826E);
                        return 1;
                    case Opcodes.I2F /* 134 */:
                    case 137:
                    case 144:
                        cVar2.mo6699e(iM33856l, i10, 1, C7188c.f23824C);
                        return 1;
                    case Opcodes.I2D /* 135 */:
                    case 138:
                    case 141:
                        cVar2.mo6699e(iM33856l, i10, 1, C7188c.f23823B);
                        return 1;
                    case Opcodes.L2I /* 136 */:
                    case Opcodes.F2I /* 139 */:
                    case Opcodes.D2I /* 142 */:
                    case Opcodes.I2B /* 145 */:
                    case Opcodes.I2C /* 146 */:
                    case Opcodes.I2S /* 147 */:
                    case Opcodes.LCMP /* 148 */:
                    case Opcodes.FCMPL /* 149 */:
                    case Opcodes.FCMPG /* 150 */:
                    case Opcodes.DCMPL /* 151 */:
                    case Opcodes.DCMPG /* 152 */:
                    case Opcodes.ARRAYLENGTH /* 190 */:
                        cVar2.mo6699e(iM33856l, i10, 1, C7188c.f23825D);
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
                        cVar2.mo6700f(iM33856l, i10, 3, this.f5250a.m33855k(i10 + 1) + i10);
                        return 3;
                    case Opcodes.RET /* 169 */:
                        cVar2.mo6696b(iM33856l, i10, 2, this.f5250a.m33856l(i10 + 1), C7188c.f23830I, 0);
                        return 2;
                    case Opcodes.TABLESWITCH /* 170 */:
                        return m6744g(i10, cVar2);
                    case Opcodes.LOOKUPSWITCH /* 171 */:
                        return m6742e(i10, cVar2);
                    case Opcodes.IRETURN /* 172 */:
                        cVar2.mo6699e(Opcodes.IRETURN, i10, 1, C7188c.f23825D);
                        return 1;
                    case Opcodes.LRETURN /* 173 */:
                        cVar2.mo6699e(Opcodes.IRETURN, i10, 1, C7188c.f23826E);
                        return 1;
                    case Opcodes.FRETURN /* 174 */:
                        cVar2.mo6699e(Opcodes.IRETURN, i10, 1, C7188c.f23824C);
                        return 1;
                    case Opcodes.DRETURN /* 175 */:
                        cVar2.mo6699e(Opcodes.IRETURN, i10, 1, C7188c.f23823B);
                        return 1;
                    case Opcodes.ARETURN /* 176 */:
                        cVar2.mo6699e(Opcodes.IRETURN, i10, 1, C7188c.f23837P);
                        return 1;
                    case Opcodes.RETURN /* 177 */:
                    case Opcodes.ATHROW /* 191 */:
                    case Opcodes.MONITORENTER /* 194 */:
                    case Opcodes.MONITOREXIT /* 195 */:
                        cVar2.mo6699e(iM33856l, i10, 1, C7188c.f23828G);
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
                        i11 = i10;
                        try {
                            cVar2.mo6697c(iM33856l, i11, 3, this.f5251b.get(this.f5250a.m33858n(i11 + 1)), 0);
                            return 3;
                        } catch (C1902x e12) {
                            e = e12;
                            c1902x = e;
                            c1902x.m3685a("...at bytecode offset " + AbstractC8826h.m33901j(i11));
                            throw c1902x;
                        } catch (RuntimeException e13) {
                            e = e13;
                            runtimeException = e;
                            C1902x c1902x2 = new C1902x(runtimeException);
                            c1902x2.m3685a("...at bytecode offset " + AbstractC8826h.m33901j(i11));
                            throw c1902x2;
                        }
                    case Opcodes.INVOKEINTERFACE /* 185 */:
                        cVar2.mo6697c(iM33856l, i10, 5, this.f5251b.get(this.f5250a.m33858n(i10 + 1)), this.f5250a.m33856l(i10 + 3) | (this.f5250a.m33856l(i10 + 4) << 8));
                        return 5;
                    case 186:
                        cVar2.mo6697c(iM33856l, i10, 5, (C6512q) this.f5251b.get(this.f5250a.m33858n(i10 + 1)), 0);
                        return 5;
                    case Opcodes.NEWARRAY /* 188 */:
                        return m6743f(i10, cVar2);
                    case 196:
                        return m6745h(i10, cVar2);
                    case 197:
                        cVar2.mo6697c(iM33856l, i10, 4, this.f5251b.get(this.f5250a.m33858n(i10 + 1)), this.f5250a.m33856l(i10 + 3));
                        return 4;
                    case 200:
                    case 201:
                        cVar2.mo6700f(iM33856l == 200 ? Opcodes.GOTO : Opcodes.JSR, i10, 5, this.f5250a.m33853i(i10 + 1) + i10);
                        return 5;
                    default:
                        cVar2.mo6703i(iM33856l, i10, 1);
                        return 1;
                }
            } catch (C1902x e14) {
                e = e14;
            } catch (RuntimeException e15) {
                e = e15;
            }
        } catch (C1902x e16) {
            c1902x = e16;
            i11 = i10;
            c1902x.m3685a("...at bytecode offset " + AbstractC8826h.m33901j(i11));
            throw c1902x;
        } catch (RuntimeException e17) {
            runtimeException = e17;
            i11 = i10;
            C1902x c1902x22 = new C1902x(runtimeException);
            c1902x22.m3685a("...at bytecode offset " + AbstractC8826h.m33901j(i11));
            throw c1902x22;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m6742e(int i10, c cVar) {
        C8822d c8822d;
        int i11 = (i10 + 4) & (-4);
        int i12 = i10 + 1;
        int iM33856l = 0;
        while (true) {
            c8822d = this.f5250a;
            if (i12 >= i11) {
                break;
            }
            iM33856l = (iM33856l << 8) | c8822d.m33856l(i12);
            i12++;
        }
        int iM33853i = c8822d.m33853i(i11) + i10;
        int iM33853i2 = this.f5250a.m33853i(i11 + 4);
        int i13 = i11 + 8;
        C1904z c1904z = new C1904z(iM33853i2);
        for (int i14 = 0; i14 < iM33853i2; i14++) {
            int iM33853i3 = this.f5250a.m33853i(i13);
            int iM33853i4 = this.f5250a.m33853i(i13 + 4) + i10;
            i13 += 8;
            c1904z.m6945w(iM33853i3, iM33853i4);
        }
        c1904z.m6944D(iM33853i);
        c1904z.m6943C();
        c1904z.mo6829t();
        int i15 = i13 - i10;
        cVar.mo6695a(Opcodes.LOOKUPSWITCH, i10, i15, c1904z, iM33856l);
        return i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m6743f(int r12, p045d5.C1888j.c r13) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p045d5.C1888j.m6743f(int, d5.j$c):int");
    }

    /* JADX INFO: renamed from: g */
    public final int m6744g(int i10, c cVar) {
        C8822d c8822d;
        int i11 = (i10 + 4) & (-4);
        int i12 = i10 + 1;
        int iM33856l = 0;
        while (true) {
            c8822d = this.f5250a;
            if (i12 >= i11) {
                break;
            }
            iM33856l = (iM33856l << 8) | c8822d.m33856l(i12);
            i12++;
        }
        int iM33853i = c8822d.m33853i(i11) + i10;
        int iM33853i2 = this.f5250a.m33853i(i11 + 4);
        int iM33853i3 = this.f5250a.m33853i(i11 + 8);
        int i13 = (iM33853i3 - iM33853i2) + 1;
        int i14 = i11 + 12;
        if (iM33853i2 > iM33853i3) {
            throw new C1902x("low / high inversion");
        }
        C1904z c1904z = new C1904z(i13);
        for (int i15 = 0; i15 < i13; i15++) {
            int iM33853i4 = this.f5250a.m33853i(i14) + i10;
            i14 += 4;
            c1904z.m6945w(iM33853i2 + i15, iM33853i4);
        }
        c1904z.m6944D(iM33853i);
        c1904z.m6943C();
        c1904z.mo6829t();
        int i16 = i14 - i10;
        cVar.mo6695a(Opcodes.LOOKUPSWITCH, i10, i16, c1904z, iM33856l);
        return i16;
    }

    /* JADX INFO: renamed from: h */
    public final int m6745h(int i10, c cVar) {
        int iM33856l = this.f5250a.m33856l(i10 + 1);
        int iM33858n = this.f5250a.m33858n(i10 + 2);
        if (iM33856l == 132) {
            cVar.mo6696b(iM33856l, i10, 6, iM33858n, C7188c.f23825D, this.f5250a.m33855k(i10 + 4));
            return 6;
        }
        if (iM33856l == 169) {
            cVar.mo6696b(iM33856l, i10, 4, iM33858n, C7188c.f23830I, 0);
            return 4;
        }
        switch (iM33856l) {
            case Opcodes.ILOAD /* 21 */:
                cVar.mo6696b(21, i10, 4, iM33858n, C7188c.f23825D, 0);
                return 4;
            case Opcodes.LLOAD /* 22 */:
                cVar.mo6696b(21, i10, 4, iM33858n, C7188c.f23826E, 0);
                return 4;
            case Opcodes.FLOAD /* 23 */:
                cVar.mo6696b(21, i10, 4, iM33858n, C7188c.f23824C, 0);
                return 4;
            case Opcodes.DLOAD /* 24 */:
                cVar.mo6696b(21, i10, 4, iM33858n, C7188c.f23823B, 0);
                return 4;
            case Opcodes.ALOAD /* 25 */:
                cVar.mo6696b(21, i10, 4, iM33858n, C7188c.f23837P, 0);
                return 4;
            default:
                switch (iM33856l) {
                    case Opcodes.ISTORE /* 54 */:
                        cVar.mo6696b(54, i10, 4, iM33858n, C7188c.f23825D, 0);
                        return 4;
                    case Opcodes.LSTORE /* 55 */:
                        cVar.mo6696b(54, i10, 4, iM33858n, C7188c.f23826E, 0);
                        return 4;
                    case Opcodes.FSTORE /* 56 */:
                        cVar.mo6696b(54, i10, 4, iM33858n, C7188c.f23824C, 0);
                        return 4;
                    case Opcodes.DSTORE /* 57 */:
                        cVar.mo6696b(54, i10, 4, iM33858n, C7188c.f23823B, 0);
                        return 4;
                    case Opcodes.ASTORE /* 58 */:
                        cVar.mo6696b(54, i10, 4, iM33858n, C7188c.f23837P, 0);
                        return 4;
                    default:
                        cVar.mo6703i(196, i10, 1);
                        return 1;
                }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m6746i(int[] iArr, c cVar) {
        if (cVar == null) {
            C1259t2.m5095a("visitor == null");
            return;
        }
        while (true) {
            int iM33837e = AbstractC8821c.m33837e(iArr, 0);
            if (iM33837e < 0) {
                return;
            }
            AbstractC8821c.m33835c(iArr, iM33837e);
            m6741d(iM33837e, cVar);
            cVar.mo6701g(iM33837e);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m6747j() {
        return this.f5250a.m33861q();
    }

    /* JADX INFO: renamed from: d5.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b extends a {

        /* JADX INFO: renamed from: b */
        public AbstractC6487a f5253b;

        /* JADX INFO: renamed from: c */
        public int f5254c;

        /* JADX INFO: renamed from: d */
        public int f5255d;

        public b() {
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: a */
        public void mo6695a(int i10, int i11, int i12, C1904z c1904z, int i13) {
            m6748j();
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: b */
        public void mo6696b(int i10, int i11, int i12, int i13, C7188c c7188c, int i14) {
            m6748j();
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: c */
        public void mo6697c(int i10, int i11, int i12, AbstractC6487a abstractC6487a, int i13) {
            this.f5253b = abstractC6487a;
            this.f5254c = i12;
            this.f5255d = i13;
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: d */
        public int mo6698d() {
            return -1;
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: e */
        public void mo6699e(int i10, int i11, int i12, C7188c c7188c) {
            m6748j();
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: f */
        public void mo6700f(int i10, int i11, int i12, int i13) {
            m6748j();
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: h */
        public void mo6702h(int i10, int i11, C6496e0 c6496e0, ArrayList arrayList) {
            m6748j();
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: i */
        public void mo6703i(int i10, int i11, int i12) {
            m6748j();
        }

        /* JADX INFO: renamed from: j */
        public final void m6748j() {
            this.f5254c = 0;
        }

        @Override // p045d5.C1888j.a, p045d5.C1888j.c
        /* JADX INFO: renamed from: g */
        public void mo6701g(int i10) {
        }
    }

    /* JADX INFO: renamed from: d5.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements c {

        /* JADX INFO: renamed from: a */
        public int f5252a = -1;

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: d */
        public int mo6698d() {
            return this.f5252a;
        }

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: g */
        public void mo6701g(int i10) {
            this.f5252a = i10;
        }

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: i */
        public void mo6703i(int i10, int i11, int i12) {
        }

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: e */
        public void mo6699e(int i10, int i11, int i12, C7188c c7188c) {
        }

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: f */
        public void mo6700f(int i10, int i11, int i12, int i13) {
        }

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: h */
        public void mo6702h(int i10, int i11, C6496e0 c6496e0, ArrayList arrayList) {
        }

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: a */
        public void mo6695a(int i10, int i11, int i12, C1904z c1904z, int i13) {
        }

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: c */
        public void mo6697c(int i10, int i11, int i12, AbstractC6487a abstractC6487a, int i13) {
        }

        @Override // p045d5.C1888j.c
        /* JADX INFO: renamed from: b */
        public void mo6696b(int i10, int i11, int i12, int i13, C7188c c7188c, int i14) {
        }
    }
}
