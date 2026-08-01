package p061e5;

import ae.C0306e;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.BitSet;
import p094g5.C2526i;
import p094g5.InterfaceC2527j;
import p254r5.AbstractC6487a;
import p254r5.C6488a0;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6498f0;
import p254r5.C6506k;
import p254r5.C6508m;
import p254r5.C6509n;
import p254r5.C6510o;
import p254r5.C6511p;
import p254r5.C6512q;
import p254r5.C6517v;
import p254r5.C6519x;
import p254r5.C6520y;
import p254r5.C6521z;
import p269s5.C7188c;
import p309v5.AbstractC8826h;
import p309v5.C8822d;

/* JADX INFO: renamed from: e5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2028a {

    /* JADX INFO: renamed from: a */
    public final C8822d f5624a;

    /* JADX INFO: renamed from: b */
    public final C6498f0 f5625b;

    /* JADX INFO: renamed from: c */
    public final int[] f5626c;

    /* JADX INFO: renamed from: d */
    public int f5627d;

    public C2028a(C8822d c8822d) {
        int iM33858n = c8822d.m33858n(8);
        this.f5624a = c8822d;
        this.f5625b = new C6498f0(iM33858n);
        this.f5626c = new int[iM33858n];
        this.f5627d = -1;
    }

    /* JADX INFO: renamed from: c */
    public static int m7295c(int i10) {
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 0;
            case 5:
                return 5;
            case 6:
                return 4;
            case 7:
                return 7;
            case 8:
                return 6;
            case 9:
                return 8;
            default:
                C0306e.m922a("invalid kind: ", i10);
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7296a() {
        int i10;
        int iM33858n = 10;
        int i11 = 1;
        while (true) {
            int[] iArr = this.f5626c;
            if (i11 >= iArr.length) {
                this.f5627d = iM33858n;
                return;
            }
            iArr[i11] = iM33858n;
            int iM33856l = this.f5624a.m33856l(iM33858n);
            switch (iM33856l) {
                case 1:
                    iM33858n += this.f5624a.m33858n(iM33858n + 1) + 3;
                    i10 = 1;
                    i11 += i10;
                    break;
                case 2:
                case Opcodes.FCONST_2 /* 13 */:
                case Opcodes.DCONST_0 /* 14 */:
                case Opcodes.SIPUSH /* 17 */:
                default:
                    throw new C2526i("unknown tag byte: " + AbstractC8826h.m33897f(iM33856l));
                case 3:
                case 4:
                case 9:
                case 10:
                case Opcodes.FCONST_0 /* 11 */:
                case Opcodes.FCONST_1 /* 12 */:
                case Opcodes.LDC /* 18 */:
                    try {
                        iM33858n += 5;
                        i10 = 1;
                        i11 += i10;
                    } catch (C2526i e10) {
                        e10.m3685a("...while preparsing cst " + AbstractC8826h.m33898g(i11) + " at offset " + AbstractC8826h.m33901j(iM33858n));
                        throw e10;
                    }
                    break;
                case 5:
                case 6:
                    iM33858n += 9;
                    i10 = 2;
                    i11 += i10;
                    break;
                case 7:
                case 8:
                case 16:
                    iM33858n += 3;
                    i10 = 1;
                    i11 += i10;
                    break;
                case 15:
                    iM33858n += 4;
                    i10 = 1;
                    i11 += i10;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m7297b() {
        m7301g();
        return this.f5627d;
    }

    /* JADX INFO: renamed from: d */
    public C6498f0 m7298d() {
        m7301g();
        return this.f5625b;
    }

    /* JADX INFO: renamed from: e */
    public final void m7299e() {
        m7296a();
        BitSet bitSet = new BitSet(this.f5626c.length);
        int i10 = 1;
        while (true) {
            int[] iArr = this.f5626c;
            if (i10 >= iArr.length) {
                return;
            }
            if (iArr[i10] != 0 && this.f5625b.mo25732j(i10) == null) {
                m7300f(i10, bitSet);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC6487a m7300f(int i10, BitSet bitSet) {
        AbstractC6487a abstractC6487aM7302h;
        AbstractC6487a abstractC6487aM25781v;
        AbstractC6487a c6508m;
        AbstractC6487a abstractC6487aM7300f;
        AbstractC6487a abstractC6487aMo25732j = this.f5625b.mo25732j(i10);
        if (abstractC6487aMo25732j != null) {
            return abstractC6487aMo25732j;
        }
        int i11 = this.f5626c[i10];
        try {
            int iM33856l = this.f5624a.m33856l(i11);
            switch (iM33856l) {
                case 1:
                    abstractC6487aM7302h = m7302h(i11);
                    bitSet.set(i10);
                    abstractC6487aM25781v = abstractC6487aM7302h;
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 2:
                case Opcodes.FCONST_2 /* 13 */:
                case Opcodes.DCONST_0 /* 14 */:
                case Opcodes.SIPUSH /* 17 */:
                default:
                    throw new C2526i("unknown tag byte: " + AbstractC8826h.m33897f(iM33856l));
                case 3:
                    abstractC6487aM25781v = C6510o.m25781v(this.f5624a.m33853i(i11 + 1));
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 4:
                    abstractC6487aM25781v = C6509n.m25780u(this.f5624a.m33853i(i11 + 1));
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 5:
                    abstractC6487aM25781v = C6517v.m25800v(this.f5624a.m33854j(i11 + 1));
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 6:
                    abstractC6487aM25781v = C6506k.m25777u(this.f5624a.m33854j(i11 + 1));
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 7:
                    abstractC6487aM7302h = new C6496e0(C7188c.m28405w(((C6492c0) m7300f(this.f5624a.m33858n(i11 + 1), bitSet)).m25741n()));
                    abstractC6487aM25781v = abstractC6487aM7302h;
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 8:
                    abstractC6487aM25781v = m7300f(this.f5624a.m33858n(i11 + 1), bitSet);
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 9:
                    c6508m = new C6508m((C6496e0) m7300f(this.f5624a.m33858n(i11 + 1), bitSet), (C6521z) m7300f(this.f5624a.m33858n(i11 + 3), bitSet));
                    abstractC6487aM25781v = c6508m;
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 10:
                    c6508m = new C6520y((C6496e0) m7300f(this.f5624a.m33858n(i11 + 1), bitSet), (C6521z) m7300f(this.f5624a.m33858n(i11 + 3), bitSet));
                    abstractC6487aM25781v = c6508m;
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case Opcodes.FCONST_0 /* 11 */:
                    c6508m = new C6511p((C6496e0) m7300f(this.f5624a.m33858n(i11 + 1), bitSet), (C6521z) m7300f(this.f5624a.m33858n(i11 + 3), bitSet));
                    abstractC6487aM25781v = c6508m;
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case Opcodes.FCONST_1 /* 12 */:
                    c6508m = new C6521z((C6492c0) m7300f(this.f5624a.m33858n(i11 + 1), bitSet), (C6492c0) m7300f(this.f5624a.m33858n(i11 + 3), bitSet));
                    abstractC6487aM25781v = c6508m;
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 15:
                    int iM33856l2 = this.f5624a.m33856l(i11 + 1);
                    int iM33858n = this.f5624a.m33858n(i11 + 2);
                    switch (iM33856l2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            abstractC6487aM7300f = (C6508m) m7300f(iM33858n, bitSet);
                            break;
                        case 5:
                        case 8:
                            abstractC6487aM7300f = (C6520y) m7300f(iM33858n, bitSet);
                            break;
                        case 6:
                        case 7:
                            abstractC6487aM7300f = m7300f(iM33858n, bitSet);
                            if (!(abstractC6487aM7300f instanceof C6520y) && !(abstractC6487aM7300f instanceof C6511p)) {
                                throw new C2526i("Unsupported ref constant type for MethodHandle " + abstractC6487aM7300f.getClass());
                            }
                            break;
                        case 9:
                            abstractC6487aM7300f = (C6511p) m7300f(iM33858n, bitSet);
                            break;
                        default:
                            throw new C2526i("Unsupported MethodHandle kind: " + iM33856l2);
                    }
                    abstractC6487aM25781v = C6519x.m25807w(m7295c(iM33856l2), abstractC6487aM7300f);
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case 16:
                    abstractC6487aM25781v = C6488a0.m25730n((C6492c0) m7300f(this.f5624a.m33858n(i11 + 1), bitSet));
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
                case Opcodes.LDC /* 18 */:
                    abstractC6487aM25781v = C6512q.m25784x(this.f5624a.m33858n(i11 + 1), (C6521z) m7300f(this.f5624a.m33858n(i11 + 3), bitSet));
                    this.f5625b.m25766w(i10, abstractC6487aM25781v);
                    return abstractC6487aM25781v;
            }
        } catch (C2526i e10) {
            e10.m3685a("...while parsing cst " + AbstractC8826h.m33898g(i10) + " at offset " + AbstractC8826h.m33901j(i11));
            throw e10;
        } catch (RuntimeException e11) {
            C2526i c2526i = new C2526i(e11);
            c2526i.m3685a("...while parsing cst " + AbstractC8826h.m33898g(i10) + " at offset " + AbstractC8826h.m33901j(i11));
            throw c2526i;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7301g() {
        if (this.f5627d < 0) {
            m7299e();
        }
    }

    /* JADX INFO: renamed from: h */
    public final C6492c0 m7302h(int i10) {
        int iM33858n = this.f5624a.m33858n(i10 + 1);
        int i11 = i10 + 3;
        try {
            return new C6492c0(this.f5624a.m33862r(i11, iM33858n + i11));
        } catch (IllegalArgumentException e10) {
            throw new C2526i(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7303i(InterfaceC2527j interfaceC2527j) {
    }
}
