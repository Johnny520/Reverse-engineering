package p321w;

import ac.AbstractC0063p;
import android.content.Context;
import android.os.Build;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import be.AbstractC0283h;
import bsh.org.objectweb.asm.Opcodes;
import ca.C0512c;
import ca.RunnableC0537x;
import gg.AbstractC1416l;
import gg.C1414j;
import gg.C1425u;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import okio.C3193a;
import p012ah.C0086a;
import p014b.C0126e;
import p015b0.AbstractC0149o;
import p015b0.C0144j;
import p015b0.C0145k;
import p015b0.C0146l;
import p015b0.C0151q;
import p015b0.C0153s;
import p015b0.C0154t;
import p020b5.C0184c;
import p020b5.C0192k;
import p027c0.AbstractC0366k;
import p027c0.C0362g;
import p028c1.AbstractC0378h;
import p036c9.C0451j0;
import p036c9.C0454k;
import p036c9.C0455k0;
import p036c9.C0490u;
import p041d1.AbstractC0656d;
import p041d1.C0676v;
import p041d1.EnumC0680z;
import p041d1.InterfaceC0666l;
import p056e0.AbstractC0802b;
import p057e1.C0808c;
import p063e9.C0830a;
import p068eh.AbstractC0921a;
import p070f0.AbstractC0985q;
import p070f0.AbstractC0988t;
import p070f0.C0970b;
import p070f0.C0971c;
import p070f0.C0973e;
import p070f0.C0976h;
import p070f0.C0987s;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1027s;
import p071f1.C1024q0;
import p071f1.C1030t0;
import p071f1.C1034w;
import p072f2.AbstractC1052o;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p088g0.C1262f;
import p088g0.C1267k;
import p100h0.AbstractC1535l1;
import p100h0.AbstractC1539n0;
import p100h0.AbstractC1546r;
import p100h0.C1511d1;
import p100h0.C1515f;
import p100h0.C1529j1;
import p100h0.C1532k1;
import p100h0.C1542p;
import p100h0.C1551t0;
import p100h0.C1553u0;
import p100h0.C1555v0;
import p100h0.C1557w0;
import p100h0.C1561y0;
import p100h0.EnumC1550t;
import p100h0.InterfaceC1533l;
import p109hb.C1701x;
import p116i.C1795u1;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.C1872q0;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1928h;
import p119i2.C1918c;
import p119i2.C1920d;
import p119i2.C1922e;
import p119i2.C1925f0;
import p119i2.C1926g;
import p119i2.C1929h0;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1941n0;
import p136j8.C2104o;
import p144k.AbstractC2161c1;
import p144k.AbstractC2192n;
import p144k.C2209s1;
import p150k5.C2263n;
import p158l.C2411b;
import p162l3.C2455i;
import p162l3.C2462p;
import p162l3.C2468v;
import p174m.C2571a;
import p174m.C2576b;
import p174m.EnumC2640p1;
import p177m2.AbstractC2772p;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p177m2.InterfaceC2760d;
import p189n1.InterfaceC2862a;
import p190n2.C2875j;
import p190n2.C2884s;
import p190n2.C2885t;
import p190n2.C2890y;
import p190n2.C2891z;
import p190n2.InterfaceC2879n;
import p201o.AbstractC3026b;
import p219oh.AbstractC3165h;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p225p2.C3290b;
import p227p4.C3315t;
import p230p8.C3364p;
import p236q1.AbstractC3424d;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p259r9.C3766p;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p267s1.AbstractC3898h0;
import p267s1.AbstractC3913s;
import p267s1.C3883a;
import p267s1.InterfaceC3911q;
import p276sf.C3958e;
import p276sf.C3967n;
import p277t.AbstractC4072d;
import p277t.C4071c;
import p280t2.C4085a;
import p280t2.C4096l;
import p280t2.C4100p;
import p280t2.EnumC4094j;
import p290u.C4226c;
import p293u2.C4236f;
import p293u2.C4241k;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p307v0.AbstractC4371k;
import p307v0.C4361a;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4428t;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5848j;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.AbstractC5891i0;
import p357y1.C5944v1;
import p357y1.InterfaceC5885g2;
import p357y1.InterfaceC5917o2;
import p357y1.InterfaceC5955y0;
import sh.C4056v1;
import tf.C4173t;
import tf.C4174u;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: w.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4634s {

    /* JADX INFO: renamed from: a */
    public static final C3874d f15367a = new C3874d(759698998, new C2411b(3), false);

    /* JADX INFO: renamed from: b */
    public static final C3874d f15368b = new C3874d(486633673, new C2411b(4), false);

    /* JADX INFO: renamed from: c */
    public static final C2571a f15369c = new C2571a(new C4620n0(0), 23);

    /* JADX INFO: renamed from: d */
    public static final C4620n0 f15370d = new C4620n0(1);

    /* JADX INFO: renamed from: e */
    public static final C3883a f15371e = new C3883a(1022);

    /* JADX INFO: renamed from: f */
    public static final C0192k f15372f = new C0192k(0, 0, 5);

    /* JADX INFO: renamed from: g */
    public static final int f15373g = 9;

    /* JADX INFO: renamed from: h */
    public static final int f15374h = 10;

    /* JADX INFO: renamed from: i */
    public static final int f15375i = 12;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final void m9055A(int i9, int i10) {
        if (i9 <= 0 || i10 <= 0) {
            AbstractC3026b.m6428a("both minLines " + i9 + " and maxLines " + i10 + " must be greater than zero");
        }
        if (i9 <= i10) {
            return;
        }
        AbstractC3026b.m6428a("minLines " + i9 + " must be less than or equal to maxLines " + i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final void m9056B(int i9, int i10, int i11) {
        boolean z9 = false;
        if (i9 >= 0 && i9 <= i10) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        StringBuilder sbM2256s = AbstractC0921a.m2256s(i11, i9, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbM2256s.append(i10);
        sbM2256s.append(']');
        AbstractC3026b.m6430c(sbM2256s.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final void m9057C(int i9, int i10, int i11) {
        boolean z9 = false;
        if (i9 >= 0 && i9 <= i10) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        StringBuilder sbM2256s = AbstractC0921a.m2256s(i11, i9, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbM2256s.append(i10);
        sbM2256s.append(']');
        AbstractC3026b.m6430c(sbM2256s.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9058a(C1926g c1926g, InterfaceC5853o interfaceC5853o, C1941n0 c1941n0, InterfaceC1231l interfaceC1231l, int i9, Map map, C1836h0 c1836h0, int i10) {
        int i11;
        Map map2;
        boolean z9;
        InterfaceC2760d interfaceC2760d;
        int i12;
        boolean z10;
        Object objM4514P;
        InterfaceC1809a1 interfaceC1809a1;
        boolean zM4534f;
        Object objM4514P2;
        c1836h0.m4527b0(-1343466571);
        int i13 = (i10 & 6) == 0 ? (c1836h0.m4534f(c1926g) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i13 |= c1836h0.m4534f(interfaceC5853o) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= c1836h0.m4534f(c1941n0) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= c1836h0.m4530d(1) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= c1836h0.m4536g(true) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= c1836h0.m4530d(Integer.MAX_VALUE) ? 1048576 : 524288;
        }
        int i14 = i13 | 918552576;
        if (c1836h0.m4516S(i14 & 1, (306783379 & i14) != 306783378)) {
            m9055A(1, Integer.MAX_VALUE);
            if (c1836h0.m4542j(AbstractC1539n0.f5130a) != null) {
                C0086a.m445d();
                return;
            }
            c1836h0.m4525a0(1588759409);
            c1836h0.m4553p(false);
            C3958e c3958e = AbstractC4589d.f15127a;
            int length = c1926g.f6529h.length();
            List list = c1926g.f6528g;
            if (list != null) {
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    C1922e c1922e = (C1922e) list.get(i15);
                    if ((c1922e.f6503a instanceof C1929h0) && "androidx.compose.foundation.text.inlineContent".equals(c1922e.f6506d) && AbstractC1928h.m4798b(0, length, c1922e.f6504b, c1922e.f6505c)) {
                        z9 = true;
                        break;
                    }
                }
                z9 = false;
                boolean zM2741N = AbstractC1089i.m2741N(c1926g);
                interfaceC2760d = (InterfaceC2760d) c1836h0.m4542j(AbstractC5888h1.f23929k);
                if (!z9 || zM2741N) {
                    i12 = 1;
                    c1836h0.m4525a0(1590022070);
                    z10 = (i14 & 14) == 4;
                    objM4514P = c1836h0.m4514P();
                    Object obj = C1851l.f6155a;
                    if (!z10 || objM4514P == obj) {
                        objM4514P = AbstractC1874r.m4639u(c1926g);
                        c1836h0.m4545k0(objM4514P);
                    }
                    interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
                    C1926g c1926g2 = (C1926g) interfaceC1809a1.getValue();
                    zM4534f = c1836h0.m4534f(interfaceC1809a1);
                    objM4514P2 = c1836h0.m4514P();
                    if (!zM4534f || objM4514P2 == obj) {
                        objM4514P2 = new C0146l(interfaceC1809a1, 12);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    int i16 = i14 << 6;
                    m9065h(interfaceC5853o, c1926g2, interfaceC1231l, z9, c1941n0, interfaceC2760d, (InterfaceC1231l) objM4514P2, c1836h0, ((i14 >> 3) & 910) | ((i14 >> 12) & 57344) | ((i14 << 9) & 458752) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), ((i14 >> 21) & 896) | 24576);
                    c1836h0.m4553p(false);
                } else {
                    c1836h0.m4525a0(1589006262);
                    AbstractC4619n.m9041a(c1926g, c1941n0, interfaceC2760d, null, c1836h0);
                    InterfaceC5853o interfaceC5853oM9083z = m9083z(interfaceC5853o, c1926g, c1941n0, interfaceC1231l, 1, true, Integer.MAX_VALUE, 1, interfaceC2760d, null, null, null);
                    i12 = 1;
                    C4586c c4586c = C4586c.f15114c;
                    int iHashCode = Long.hashCode(c1836h0.f6095T);
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM9083z);
                    C3878h c3878hM4546l = c1836h0.m4546l();
                    InterfaceC5605g.f22815f.getClass();
                    InterfaceC1220a interfaceC1220a = C5601f.f22758b;
                    c1836h0.m4531d0();
                    if (c1836h0.f6094S) {
                        c1836h0.m4544k(interfaceC1220a);
                    } else {
                        c1836h0.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c4586c);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                    c1836h0.m4553p(true);
                    c1836h0.m4553p(false);
                }
                map2 = C4174u.f13711g;
                i11 = i12;
            } else {
                z9 = false;
                boolean zM2741N2 = AbstractC1089i.m2741N(c1926g);
                interfaceC2760d = (InterfaceC2760d) c1836h0.m4542j(AbstractC5888h1.f23929k);
                if (z9) {
                    i12 = 1;
                    c1836h0.m4525a0(1590022070);
                    if ((i14 & 14) == 4) {
                    }
                    objM4514P = c1836h0.m4514P();
                    Object obj2 = C1851l.f6155a;
                    if (!z10) {
                        objM4514P = AbstractC1874r.m4639u(c1926g);
                        c1836h0.m4545k0(objM4514P);
                        interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
                        C1926g c1926g22 = (C1926g) interfaceC1809a1.getValue();
                        zM4534f = c1836h0.m4534f(interfaceC1809a1);
                        objM4514P2 = c1836h0.m4514P();
                        if (!zM4534f) {
                            objM4514P2 = new C0146l(interfaceC1809a1, 12);
                            c1836h0.m4545k0(objM4514P2);
                            int i162 = i14 << 6;
                            m9065h(interfaceC5853o, c1926g22, interfaceC1231l, z9, c1941n0, interfaceC2760d, (InterfaceC1231l) objM4514P2, c1836h0, ((i14 >> 3) & 910) | ((i14 >> 12) & 57344) | ((i14 << 9) & 458752) | (3670016 & i162) | (29360128 & i162) | (234881024 & i162) | (i162 & 1879048192), ((i14 >> 21) & 896) | 24576);
                            c1836h0.m4553p(false);
                            map2 = C4174u.f13711g;
                            i11 = i12;
                        }
                    }
                }
            }
        } else {
            c1836h0.m4519V();
            i11 = i9;
            map2 = map;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0451j0(c1926g, interfaceC5853o, c1941n0, interfaceC1231l, i11, map2, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9059b(final String str, final InterfaceC5853o interfaceC5853o, final C1941n0 c1941n0, InterfaceC1231l interfaceC1231l, int i9, boolean z9, final int i10, int i11, C1836h0 c1836h0, final int i12, final int i13) {
        int i14;
        final InterfaceC1231l interfaceC1231l2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final int i21;
        final int i22;
        final boolean z10;
        C1876r1 c1876r1M4557t;
        int i23;
        int i24;
        boolean z11;
        boolean z12;
        InterfaceC1231l interfaceC1231l3;
        InterfaceC5853o interfaceC5853oMo10549d;
        c1836h0.m4527b0(-1040751001);
        if ((i12 & 6) == 0) {
            i14 = (c1836h0.m4534f(str) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c1836h0.m4534f(interfaceC5853o) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c1836h0.m4534f(c1941n0) ? Opcodes.ACC_NATIVE : 128;
        }
        int i25 = i13 & 8;
        if (i25 != 0) {
            i14 |= 3072;
        } else {
            if ((i12 & 3072) == 0) {
                interfaceC1231l2 = interfaceC1231l;
                i14 |= c1836h0.m4538h(interfaceC1231l2) ? Opcodes.ACC_STRICT : 1024;
            }
            i15 = i13 & 16;
            if (i15 == 0) {
                i14 |= 24576;
            } else {
                if ((i12 & 24576) == 0) {
                    i16 = i9;
                    i14 |= c1836h0.m4530d(i16) ? 16384 : 8192;
                }
                i17 = i13 & 32;
                if (i17 != 0) {
                    i14 |= 196608;
                } else {
                    if ((196608 & i12) == 0) {
                        i14 |= c1836h0.m4536g(z9) ? Opcodes.ACC_DEPRECATED : 65536;
                    }
                    if ((1572864 & i12) == 0) {
                        i14 |= c1836h0.m4530d(i10) ? 1048576 : 524288;
                    }
                    i18 = i13 & 128;
                    if (i18 != 0) {
                        if ((12582912 & i12) == 0) {
                            i19 = i11;
                            i14 |= c1836h0.m4530d(i19) ? 8388608 : 4194304;
                        }
                        i20 = i14 | 100663296;
                        int i26 = i14;
                        if ((i13 & Opcodes.ACC_INTERFACE) != 0) {
                            i20 = i26 | 905969664;
                        } else if ((i12 & 805306368) == 0) {
                            i20 |= (i12 & 1073741824) == 0 ? c1836h0.m4534f(null) : c1836h0.m4538h(null) ? 536870912 : 268435456;
                        }
                        if (c1836h0.m4516S(i20 & 1, (i20 & 306783379) != 306783378)) {
                            InterfaceC1231l interfaceC1231l4 = i25 != 0 ? null : interfaceC1231l2;
                            int i27 = i15 != 0 ? 1 : i16;
                            boolean z13 = i17 != 0 ? true : z9;
                            if (i18 != 0) {
                                i19 = 1;
                            }
                            m9055A(i19, i10);
                            if (c1836h0.m4542j(AbstractC1539n0.f5130a) != null) {
                                C0086a.m445d();
                                return;
                            }
                            c1836h0.m4525a0(356914239);
                            c1836h0.m4553p(false);
                            InterfaceC2760d interfaceC2760d = (InterfaceC2760d) c1836h0.m4542j(AbstractC5888h1.f23929k);
                            Executor executor = (Executor) c1836h0.m4542j(AbstractC4619n.f15296a);
                            if (executor == null || !AbstractC4619n.m9042b(str.length())) {
                                c1836h0.m4525a0(1255914055);
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(1254298614);
                                try {
                                    executor.execute(new RunnableC0537x(c1941n0, (EnumC4243m) c1836h0.m4542j(AbstractC5888h1.f23932n), str, (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h), interfaceC2760d, 13));
                                } catch (RejectedExecutionException unused) {
                                }
                                c1836h0.m4553p(false);
                            }
                            if (interfaceC1231l4 == null) {
                                c1836h0.m4525a0(357875859);
                                c1836h0.m4553p(false);
                                i23 = i19;
                                i24 = i27;
                                z11 = z13;
                                interfaceC5853oMo10549d = interfaceC5853o.mo10549d(new C1267k(str, c1941n0, interfaceC2760d, i24, z11, i10, i23));
                                z12 = true;
                                interfaceC1231l3 = interfaceC1231l4;
                            } else {
                                i23 = i19;
                                i24 = i27;
                                z11 = z13;
                                c1836h0.m4525a0(357232113);
                                z12 = true;
                                interfaceC1231l3 = interfaceC1231l4;
                                InterfaceC5853o interfaceC5853oM9083z = m9083z(interfaceC5853o, new C1926g(str), c1941n0, interfaceC1231l3, i24, z11, i10, i23, (InterfaceC2760d) c1836h0.m4542j(AbstractC5888h1.f23929k), null, null, null);
                                c1836h0.m4553p(false);
                                interfaceC5853oMo10549d = interfaceC5853oM9083z;
                            }
                            C4586c c4586c = C4586c.f15114c;
                            int iHashCode = Long.hashCode(c1836h0.f6095T);
                            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oMo10549d);
                            C3878h c3878hM4546l = c1836h0.m4546l();
                            InterfaceC5605g.f22815f.getClass();
                            C5660y c5660y = C5601f.f22758b;
                            c1836h0.m4531d0();
                            if (c1836h0.f6094S) {
                                c1836h0.m4544k(c5660y);
                            } else {
                                c1836h0.m4551n0();
                            }
                            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c4586c);
                            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                            c1836h0.m4553p(z12);
                            z10 = z11;
                            i22 = i23;
                            i21 = i24;
                            interfaceC1231l2 = interfaceC1231l3;
                        } else {
                            c1836h0.m4519V();
                            i21 = i16;
                            i22 = i19;
                            z10 = z9;
                        }
                        c1876r1M4557t = c1836h0.m4557t();
                        if (c1876r1M4557t != null) {
                            c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: w.j
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1235p
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    AbstractC4634s.m9059b(str, interfaceC5853o, c1941n0, interfaceC1231l2, i21, z10, i10, i22, (C1836h0) obj, AbstractC1874r.m4617C(i12 | 1), i13);
                                    return C3967n.f12976a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i14 |= 12582912;
                    i19 = i11;
                    i20 = i14 | 100663296;
                    int i262 = i14;
                    if ((i13 & Opcodes.ACC_INTERFACE) != 0) {
                    }
                    if (c1836h0.m4516S(i20 & 1, (i20 & 306783379) != 306783378)) {
                    }
                    c1876r1M4557t = c1836h0.m4557t();
                    if (c1876r1M4557t != null) {
                    }
                }
                if ((1572864 & i12) == 0) {
                }
                i18 = i13 & 128;
                if (i18 != 0) {
                }
                i19 = i11;
                i20 = i14 | 100663296;
                int i2622 = i14;
                if ((i13 & Opcodes.ACC_INTERFACE) != 0) {
                }
                if (c1836h0.m4516S(i20 & 1, (i20 & 306783379) != 306783378)) {
                }
                c1876r1M4557t = c1836h0.m4557t();
                if (c1876r1M4557t != null) {
                }
            }
            i16 = i9;
            i17 = i13 & 32;
            if (i17 != 0) {
            }
            if ((1572864 & i12) == 0) {
            }
            i18 = i13 & 128;
            if (i18 != 0) {
            }
            i19 = i11;
            i20 = i14 | 100663296;
            int i26222 = i14;
            if ((i13 & Opcodes.ACC_INTERFACE) != 0) {
            }
            if (c1836h0.m4516S(i20 & 1, (i20 & 306783379) != 306783378)) {
            }
            c1876r1M4557t = c1836h0.m4557t();
            if (c1876r1M4557t != null) {
            }
        }
        interfaceC1231l2 = interfaceC1231l;
        i15 = i13 & 16;
        if (i15 == 0) {
        }
        i16 = i9;
        i17 = i13 & 32;
        if (i17 != 0) {
        }
        if ((1572864 & i12) == 0) {
        }
        i18 = i13 & 128;
        if (i18 != 0) {
        }
        i19 = i11;
        i20 = i14 | 100663296;
        int i262222 = i14;
        if ((i13 & Opcodes.ACC_INTERFACE) != 0) {
        }
        if (c1836h0.m4516S(i20 & 1, (i20 & 306783379) != 306783378)) {
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m9060c(final C1926g c1926g, final InterfaceC5853o interfaceC5853o, final C1941n0 c1941n0, boolean z9, int i9, int i10, InterfaceC1231l interfaceC1231l, final InterfaceC1231l interfaceC1231l2, C1836h0 c1836h0, final int i11) {
        int i12;
        final boolean z10;
        final int i13;
        final int i14;
        final InterfaceC1231l interfaceC1231l3;
        c1836h0.m4527b0(-246609449);
        if ((i11 & 6) == 0) {
            i12 = (c1836h0.m4534f(c1926g) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c1836h0.m4534f(interfaceC5853o) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c1836h0.m4534f(c1941n0) ? Opcodes.ACC_NATIVE : 128;
        }
        int i15 = i12 | 1797120;
        if ((12582912 & i11) == 0) {
            i15 |= c1836h0.m4538h(interfaceC1231l2) ? 8388608 : 4194304;
        }
        if (c1836h0.m4516S(i15 & 1, (4793491 & i15) != 4793490)) {
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                objM4514P = new C3766p(18);
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) objM4514P;
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = AbstractC1874r.m4639u(null);
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P2;
            boolean z11 = (29360128 & i15) == 8388608;
            Object objM4514P3 = c1836h0.m4514P();
            if (z11 || objM4514P3 == c1823e) {
                objM4514P3 = new C4628q(interfaceC1809a1, 0, interfaceC1231l2);
                c1836h0.m4545k0(objM4514P3);
            }
            InterfaceC5853o interfaceC5853oMo10549d = interfaceC5853o.mo10549d(AbstractC3898h0.m8090a(C5850l.f23787a, interfaceC1231l2, (PointerInputEventHandler) objM4514P3));
            boolean z12 = (i15 & 3670016) == 1048576;
            Object objM4514P4 = c1836h0.m4514P();
            if (z12 || objM4514P4 == c1823e) {
                objM4514P4 = new C4622o(interfaceC1809a1, interfaceC1231l4, 0);
                c1836h0.m4545k0(objM4514P4);
            }
            m9058a(c1926g, interfaceC5853oMo10549d, c1941n0, (InterfaceC1231l) objM4514P4, 0, null, c1836h0, (58254 & i15) | (458752 & (i15 << 6)) | ((i15 << 3) & 3670016));
            i14 = Integer.MAX_VALUE;
            z10 = true;
            i13 = 1;
            interfaceC1231l3 = interfaceC1231l4;
        } else {
            c1836h0.m4519V();
            z10 = z9;
            i13 = i9;
            i14 = i10;
            interfaceC1231l3 = interfaceC1231l;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: w.p
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4634s.m9060c(c1926g, interfaceC5853o, c1941n0, z10, i13, i14, interfaceC1231l3, interfaceC1231l2, (C1836h0) obj, AbstractC1874r.m4617C(i11 | 1));
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m9061d(C1511d1 c1511d1, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        InterfaceC5853o interfaceC5853oM1322d;
        c1836h0.m4527b0(1533506138);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4538h(c1511d1) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? 32 : 16;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            c1836h0.m4525a0(-885604480);
            if (c1511d1.m4025k()) {
                InterfaceC5557c interfaceC5557c = null;
                int i11 = 0;
                interfaceC5853oM1322d = AbstractC0366k.m1322d(AbstractC0366k.m1321c(new C1553u0(c1511d1, interfaceC5557c, 0)), c1511d1.f5052x, new C1555v0(c1511d1, null), new C1557w0(c1511d1, interfaceC5557c, i11), new C1551t0(c1511d1, i11));
            } else {
                interfaceC5853oM1322d = C5850l.f23787a;
            }
            AbstractC0149o.m728b(interfaceC5853oM1322d, c3874d, c1836h0, i10 & 112);
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4631r(c1511d1, c3874d, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m9062e(C1511d1 c1511d1, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(2080741862);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4538h(c1511d1) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? 32 : 16;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            m9061d(c1511d1, c3874d, c1836h0, i10 & 126);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4631r(c1511d1, c3874d, i9, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r15v24, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0446 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05cf A[PHI: r10 r24 r26
  0x05cf: PHI (r10v16 n2.j) = (r10v10 n2.j), (r10v17 n2.j) binds: [B:282:0x05cd, B:279:0x05be] A[DONT_GENERATE, DONT_INLINE]
  0x05cf: PHI (r24v6 boolean) = (r24v1 boolean), (r24v8 boolean) binds: [B:282:0x05cd, B:279:0x05be] A[DONT_GENERATE, DONT_INLINE]
  0x05cf: PHI (r26v13 int) = (r26v2 int), (r26v14 int) binds: [B:282:0x05cd, B:279:0x05be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0683 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0801 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0949  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9063f(final C2884s c2884s, final InterfaceC1231l interfaceC1231l, final InterfaceC5853o interfaceC5853o, final C1941n0 c1941n0, final C2104o c2104o, final InterfaceC1231l interfaceC1231l2, final AbstractC1027s abstractC1027s, final boolean z9, final int i9, final int i10, final C2875j c2875j, final C4623o0 c4623o0, final boolean z10, final InterfaceC1236q interfaceC1236q, C1836h0 c1836h0, final int i11, final int i12) {
        int i13;
        int i14;
        C0676v c0676v;
        int i15;
        Object c4629q0;
        boolean z11;
        C4609j1 c4609j1;
        C1823e c1823e;
        C1941n0 c1941n02;
        C2891z c2891z;
        C0192k c0192k;
        C1926g c1926g;
        InterfaceC4233c interfaceC4233c;
        InterfaceC2760d interfaceC2760d;
        C1926g c1926g2;
        InterfaceC4233c interfaceC4233c2;
        C1939m0 c1939m0;
        String str;
        C1926g c1926g3;
        InterfaceC0666l interfaceC0666l;
        boolean z12;
        boolean z13;
        boolean z14;
        C2884s c2884sM6290a;
        Object objM4514P;
        C4630q1 c4630q1;
        Object objM4514P2;
        Object objM4514P3;
        Object objM4514P4;
        C1542p c1542p;
        boolean z15;
        int i16;
        C2875j c2875j2;
        boolean z16;
        int i17;
        boolean zM4538h;
        final C0192k c0192k2;
        Object obj;
        final C2885t c2885t;
        int i18;
        final C2875j c2875j3;
        InterfaceC0666l interfaceC0666l2;
        final C4629q0 c4629q02;
        int i19;
        InterfaceC5917o2 interfaceC5917o2;
        C1836h0 c1836h02;
        C4630q1 c4630q12;
        C0676v c0676v2;
        C4071c c4071c;
        boolean z17;
        InterfaceC3599t interfaceC3599t;
        C2884s c2884s2;
        C1511d1 c1511d1;
        C4629q0 c4629q03;
        boolean z18;
        boolean z19;
        Object c0970b;
        C0676v c0676v3;
        InterfaceC3599t interfaceC3599t2;
        InterfaceC5853o interfaceC5853o2;
        final InterfaceC5853o interfaceC5853oM10541a;
        C4629q0 c4629q04;
        InterfaceC1809a1 interfaceC1809a1;
        C2885t c2885t2;
        C0192k c0192k3;
        boolean zM4538h2;
        Object objM4514P5;
        C2885t c2885t3;
        final C1511d1 c1511d12;
        InterfaceC5917o2 interfaceC5917o22;
        final C4629q0 c4629q05;
        C0192k c0192k4;
        C0973e c0973e;
        InterfaceC5853o interfaceC5853oM10541a2;
        boolean zM4538h3;
        Object objM4514P6;
        boolean zM4538h4;
        Object objM4514P7;
        C2875j c2875j4;
        boolean z20;
        boolean zM4536g;
        Object objM4514P8;
        Object c1030t0;
        long j3;
        boolean zM4538h5;
        Object objM4514P9;
        int i20;
        C1836h0 c1836h03 = c1836h0;
        c1836h03.m4527b0(31062401);
        if ((i11 & 6) == 0) {
            i13 = (c1836h03.m4534f(c2884s) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c1836h03.m4538h(interfaceC1231l) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c1836h03.m4534f(interfaceC5853o) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c1836h03.m4534f(c1941n0) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c1836h03.m4534f(c2104o) ? 16384 : 8192;
        }
        int i21 = i11 & 196608;
        int i22 = Opcodes.ACC_DEPRECATED;
        if (i21 == 0) {
            i13 |= c1836h03.m4538h(interfaceC1231l2) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c1836h03.m4534f(null) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c1836h03.m4534f(abstractC1027s) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c1836h03.m4536g(z9) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= c1836h03.m4530d(i9) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c1836h03.m4530d(i10) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c1836h03.m4534f(c2875j) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c1836h03.m4534f(c4623o0) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= c1836h03.m4536g(z10) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= c1836h03.m4536g(false) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            if (!c1836h03.m4538h(interfaceC1236q)) {
                i22 = 65536;
            }
            i14 |= i22;
        }
        int i23 = i14 | 1572864;
        if (c1836h03.m4516S(i13 & 1, ((i13 & 306783379) == 306783378 && (599187 & i23) == 599186) ? false : true)) {
            c1836h03.m4521X();
            if ((i11 & 1) != 0 && !c1836h03.m4500B()) {
                c1836h03.m4519V();
            }
            c1836h03.m4554q();
            Object objM4514P10 = c1836h03.m4514P();
            C1823e c1823e2 = C1851l.f6155a;
            if (objM4514P10 == c1823e2) {
                objM4514P10 = new C0676v();
                c1836h03.m4545k0(objM4514P10);
            }
            C0676v c0676v4 = (C0676v) objM4514P10;
            Object objM4514P11 = c1836h03.m4514P();
            if (objM4514P11 == c1823e2) {
                C0987s c0987s = AbstractC0988t.f3122a;
                objM4514P11 = new C0971c();
                c1836h03.m4545k0(objM4514P11);
            }
            C0971c c0971c = (C0971c) objM4514P11;
            Object objM4514P12 = c1836h03.m4514P();
            if (objM4514P12 == c1823e2) {
                objM4514P12 = new C2885t(c0971c);
                c1836h03.m4545k0(objM4514P12);
            }
            C2885t c2885t4 = (C2885t) objM4514P12;
            InterfaceC4233c interfaceC4233c3 = (InterfaceC4233c) c1836h03.m4542j(AbstractC5888h1.f23926h);
            InterfaceC2760d interfaceC2760d2 = (InterfaceC2760d) c1836h03.m4542j(AbstractC5888h1.f23929k);
            long j4 = ((C1532k1) c1836h03.m4542j(AbstractC1535l1.f5116a)).f5112b;
            int i24 = i13;
            InterfaceC0666l interfaceC0666l3 = (InterfaceC0666l) c1836h03.m4542j(AbstractC5888h1.f23927i);
            InterfaceC5917o2 interfaceC5917o23 = (InterfaceC5917o2) c1836h03.m4542j(AbstractC5888h1.f23939u);
            InterfaceC5885g2 interfaceC5885g2 = (InterfaceC5885g2) c1836h03.m4542j(AbstractC5888h1.f23935q);
            EnumC2640p1 enumC2640p1 = EnumC2640p1.f8622g;
            EnumC2640p1 enumC2640p12 = (i9 == 1 && !z9 && c2875j.f9293a) ? EnumC2640p1.f8623h : enumC2640p1;
            c1836h03.m4525a0(-213744626);
            Object[] objArr = {enumC2640p12};
            C3315t c3315t = C4609j1.f15205g;
            boolean zM4530d = c1836h03.m4530d(enumC2640p12.ordinal());
            Object objM4514P13 = c1836h03.m4514P();
            if (zM4530d || objM4514P13 == c1823e2) {
                c0676v = c0676v4;
                objM4514P13 = new C4361a(enumC2640p12, 5);
                c1836h03.m4545k0(objM4514P13);
            } else {
                c0676v = c0676v4;
            }
            C4609j1 c4609j12 = (C4609j1) AbstractC4371k.m8807e(objArr, c3315t, (InterfaceC1220a) objM4514P13, c1836h03, 0);
            c1836h03.m4553p(false);
            if (((EnumC2640p1) c4609j12.f15211f.getValue()) != enumC2640p12) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(enumC2640p12 == enumC2640p1 ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i25 = i24 & 14;
            boolean z21 = (i25 == 4) | ((i24 & 57344) == 16384);
            Object objM4514P14 = c1836h03.m4514P();
            if (z21 || objM4514P14 == c1823e2) {
                C2891z c2891zM9073p = m9073p(c2104o, c2884s.f9316a);
                C0192k c0192k5 = c2891zM9073p.f9346b;
                C1939m0 c1939m02 = c2884s.f9318c;
                if (c1939m02 != null) {
                    i15 = i25;
                    long j5 = c1939m02.f6575a;
                    int i26 = C1939m0.f6574c;
                    int i27 = (int) (j5 >> 32);
                    c0192k5.m859l(i27);
                    int i28 = (int) (j5 & 4294967295L);
                    c0192k5.m859l(i28);
                    int iMin = Math.min(i27, i28);
                    int iMax = Math.max(i27, i28);
                    C1920d c1920d = new C1920d(c2891zM9073p.f9345a);
                    c1920d.f6472i.add(new C1918c(new C1925f0(0L, 0L, (C2767k) null, (C2765i) null, (C2766j) null, (AbstractC2772p) null, (String) null, 0L, (C4085a) null, (C4100p) null, (C3290b) null, 0L, C4096l.f13559c, (C1024q0) null, 61439), iMin, iMax, 8));
                    objM4514P14 = new C2891z(c1920d.m4780e(), c0192k5);
                } else {
                    i15 = i25;
                    objM4514P14 = c2891zM9073p;
                }
                c1836h03.m4545k0(objM4514P14);
            } else {
                i15 = i25;
            }
            C2891z c2891z2 = (C2891z) objM4514P14;
            C1926g c1926g4 = c2891z2.f9345a;
            C0192k c0192k6 = c2891z2.f9346b;
            C1876r1 c1876r1M4499A = c1836h03.m4499A();
            if (c1876r1M4499A == null) {
                C2104o.m5276A("no recompose scope found");
                return;
            }
            c1876r1M4499A.f6239b |= 1;
            boolean zM4534f = c1836h03.m4534f(interfaceC5885g2);
            Object objM4514P15 = c1836h03.m4514P();
            if (zM4534f || objM4514P15 == c1823e2) {
                z11 = z9;
                c4609j1 = c4609j12;
                c1823e = c1823e2;
                c1941n02 = c1941n0;
                c2891z = c2891z2;
                c0192k = c0192k6;
                c1926g = c1926g4;
                interfaceC4233c = interfaceC4233c3;
                interfaceC2760d = interfaceC2760d2;
                c4629q0 = new C4629q0(new C4645x0(c1926g4, c1941n02, z11, interfaceC4233c3, interfaceC2760d2, 0), c1876r1M4499A, interfaceC5885g2);
                c1836h03.m4545k0(c4629q0);
            } else {
                z11 = z9;
                c2891z = c2891z2;
                c1926g = c1926g4;
                c0192k = c0192k6;
                c4609j1 = c4609j12;
                c1823e = c1823e2;
                c4629q0 = objM4514P15;
                interfaceC4233c = interfaceC4233c3;
                interfaceC2760d = interfaceC2760d2;
                c1941n02 = c1941n0;
            }
            C4629q0 c4629q06 = (C4629q0) c4629q0;
            C1926g c1926g5 = c2884s.f9316a;
            long j10 = c2884s.f9317b;
            c4629q06.f15346u = interfaceC1231l;
            c4629q06.f15351z = j4;
            C0184c c0184c = c4629q06.f15343r;
            c0184c.f470b = c4623o0;
            c0184c.f471c = interfaceC0666l3;
            c4629q06.f15335j = c1926g5;
            C4645x0 c4645x0 = c4629q06.f15326a;
            if (AbstractC1416l.m3825a(c4645x0.f15436a, c1926g) && AbstractC1416l.m3825a(c4645x0.f15437b, c1941n02) && c4645x0.f15440e == z11) {
                c1926g2 = c1926g;
                if (c4645x0.f15441f == 1 && c4645x0.f15438c == Integer.MAX_VALUE && c4645x0.f15439d == 1 && AbstractC1416l.m3825a(c4645x0.f15442g, interfaceC4233c) && AbstractC1416l.m3825a(c4645x0.f15444i, C4173t.f13710g) && c4645x0.f15443h == interfaceC2760d) {
                    interfaceC4233c2 = interfaceC4233c;
                }
                if (c4629q06.f15326a != c4645x0) {
                    c4629q06.f15341p = true;
                }
                c4629q06.f15326a = c4645x0;
                C0126e c0126e = c4629q06.f15329d;
                C2890y c2890y = c4629q06.f15330e;
                c0126e.getClass();
                c1939m0 = c2884s.f9318c;
                boolean zM3825a = AbstractC1416l.m3825a(c1939m0, ((C2263n) c0126e.f333i).m5506c());
                str = ((C2884s) c0126e.f332h).f9316a.f6529h;
                c1926g3 = c2884s.f9316a;
                if (AbstractC1416l.m3825a(str, c1926g3.f6529h)) {
                    c0126e.f333i = new C2263n(c1926g3, j10);
                    interfaceC0666l = interfaceC0666l3;
                    z12 = true;
                } else {
                    interfaceC0666l = interfaceC0666l3;
                    if (C1939m0.m4812b(((C2884s) c0126e.f332h).f9317b, j10)) {
                        z12 = false;
                    } else {
                        ((C2263n) c0126e.f333i).m5511h(C1939m0.m4816f(j10), C1939m0.m4815e(j10));
                        z12 = false;
                        z13 = true;
                        if (c1939m0 == null) {
                            C2263n c2263n = (C2263n) c0126e.f333i;
                            c2263n.f7508j = -1;
                            c2263n.f7509k = -1;
                            z14 = z12;
                        } else {
                            z14 = z12;
                            long j11 = c1939m0.f6575a;
                            if (!C1939m0.m4813c(j11)) {
                                ((C2263n) c0126e.f333i).m5510g(C1939m0.m4816f(j11), C1939m0.m4815e(j11));
                            }
                        }
                        if (z14 || !(z13 || zM3825a)) {
                            C2263n c2263n2 = (C2263n) c0126e.f333i;
                            c2263n2.f7508j = -1;
                            c2263n2.f7509k = -1;
                            c2884sM6290a = C2884s.m6290a(c2884s, null, 0L, 3);
                        } else {
                            c2884sM6290a = c2884s;
                        }
                        C2884s c2884s3 = (C2884s) c0126e.f332h;
                        c0126e.f332h = c2884sM6290a;
                        if (c2890y != null) {
                            c2890y.m6292a(c2884s3, c2884sM6290a);
                        }
                        objM4514P = c1836h03.m4514P();
                        if (objM4514P == c1823e) {
                            objM4514P = new C4630q1();
                            c1836h03.m4545k0(objM4514P);
                        }
                        c4630q1 = (C4630q1) objM4514P;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (c4630q1.f15356e) {
                            c4630q1.f15355d = Long.valueOf(jCurrentTimeMillis);
                            c4630q1.m9054a(c2884s);
                            objM4514P2 = c1836h03.m4514P();
                            if (objM4514P2 == c1823e) {
                                objM4514P2 = AbstractC1874r.m4632n(c1836h03);
                                c1836h03.m4545k0(objM4514P2);
                            }
                            final InterfaceC3599t interfaceC3599t3 = (InterfaceC3599t) objM4514P2;
                            objM4514P3 = c1836h03.m4514P();
                            if (objM4514P3 == c1823e) {
                                objM4514P3 = new C4071c();
                                c1836h03.m4545k0(objM4514P3);
                            }
                            final C4071c c4071c2 = (C4071c) objM4514P3;
                            objM4514P4 = c1836h03.m4514P();
                            if (objM4514P4 == c1823e) {
                                objM4514P4 = new C1511d1(c4630q1);
                                c1836h03.m4545k0(objM4514P4);
                            }
                            final C1511d1 c1511d13 = (C1511d1) objM4514P4;
                            C0192k c0192k7 = c0192k;
                            c1511d13.f5030b = c0192k7;
                            c1511d13.f5031c = c4629q06.f15347v;
                            c1511d13.f5032d = c4629q06;
                            c1511d13.f5033e.setValue(c2884s);
                            c1511d13.f5050v = new C1939m0(j10);
                            c1511d13.f5035g = (InterfaceC5955y0) c1836h03.m4542j(AbstractC5888h1.f23924f);
                            c1511d13.f5036h = interfaceC3599t3;
                            c1511d13.f5038j = (InterfaceC2862a) c1836h03.m4542j(AbstractC5888h1.f23930l);
                            C0676v c0676v5 = c0676v;
                            c1511d13.f5039k = c0676v5;
                            c1511d13.f5040l.setValue(true);
                            c1511d13.f5041m.setValue(Boolean.valueOf(z10));
                            c1836h03.m4525a0(1966756105);
                            C3290b c3290b = c1941n02.f6580a.f6523k;
                            C1858m2 c1858m2 = AbstractC1546r.f5155a;
                            c1836h03.m4525a0(430530635);
                            if (Build.VERSION.SDK_INT >= 28) {
                                c1836h03.m4553p(false);
                                z15 = false;
                                c1542p = null;
                            } else {
                                Context context = (Context) c1836h03.m4542j(AbstractC5891i0.f23946b);
                                InterfaceC5561g interfaceC5561g = (InterfaceC5561g) c1836h03.m4542j(AbstractC1546r.f5155a);
                                boolean zM4534f2 = c1836h03.m4534f(interfaceC5561g) | c1836h03.m4534f(context) | c1836h03.m4534f(c3290b);
                                Object objM4514P16 = c1836h03.m4514P();
                                if (zM4534f2 || objM4514P16 == c1823e) {
                                    AbstractC1546r.f5156b.getClass();
                                    objM4514P16 = new C1542p(interfaceC5561g, context, EnumC1550t.f5174g, c3290b);
                                    c1836h03.m4545k0(objM4514P16);
                                }
                                c1542p = (C1542p) objM4514P16;
                                z15 = false;
                                c1836h03.m4553p(false);
                            }
                            c1511d13.f5037i = c1542p;
                            c1836h03.m4553p(z15);
                            c4629q06.m9049b();
                            int i29 = i23 & 7168;
                            int i30 = i15;
                            boolean zM4538h6 = (i30 != 4) | c1836h03.m4538h(c4629q06) | (i29 != 2048) | ((i23 & 57344) != 16384) | c1836h03.m4538h(c2885t4);
                            i16 = (i23 & 112) ^ 48;
                            if (i16 <= 32) {
                                c2875j2 = c2875j;
                                if (c1836h03.m4534f(c2875j2)) {
                                    z16 = zM4538h6;
                                    i17 = i16;
                                }
                                zM4538h = z16 | z | c1836h03.m4538h(c0192k7) | c1836h03.m4538h(interfaceC3599t3) | c1836h03.m4538h(c4071c2) | c1836h03.m4538h(c1511d13);
                                Object objM4514P17 = c1836h03.m4514P();
                                if (zM4538h || objM4514P17 == c1823e) {
                                    c0192k2 = c0192k7;
                                    c2885t = c2885t4;
                                    i18 = i30;
                                    c2875j3 = c2875j2;
                                    interfaceC0666l2 = interfaceC0666l;
                                    c4629q02 = c4629q06;
                                    i19 = i17;
                                    interfaceC5917o2 = interfaceC5917o23;
                                    c1836h02 = c1836h03;
                                    c4630q12 = c4630q1;
                                    c0676v2 = c0676v5;
                                    obj = new InterfaceC1231l() { // from class: w.z
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1231l
                                        public final Object invoke(Object obj2) {
                                            C4618m1 c4618m1M9051d;
                                            EnumC0680z enumC0680z = (EnumC0680z) obj2;
                                            C4629q0 c4629q07 = c4629q02;
                                            if (c4629q07.m9049b() != enumC0680z.m1860a()) {
                                                c4629q07.f15331f.setValue(Boolean.valueOf(enumC0680z.m1860a()));
                                                boolean zM9049b = c4629q07.m9049b();
                                                C2884s c2884s4 = c2884s;
                                                C0192k c0192k8 = c0192k2;
                                                if (zM9049b && z10) {
                                                    AbstractC4634s.m9082y(c2885t, c4629q07, c2884s4, c2875j3, c0192k8);
                                                } else {
                                                    AbstractC4634s.m9072o(c4629q07);
                                                }
                                                if (enumC0680z.m1860a() && (c4618m1M9051d = c4629q07.m9051d()) != null) {
                                                    AbstractC3603v.m7563q(interfaceC3599t3, null, new C0970b(c4071c2, c2884s4, c4629q07, c4618m1M9051d, c0192k8, null, 6), 3);
                                                }
                                                if (!enumC0680z.m1860a()) {
                                                    c1511d13.m4021g(null);
                                                }
                                            }
                                            return C3967n.f12976a;
                                        }
                                    };
                                    c4071c = c4071c2;
                                    z17 = z10;
                                    interfaceC3599t = interfaceC3599t3;
                                    c2884s2 = c2884s;
                                    c1511d1 = c1511d13;
                                    c1836h02.m4545k0(obj);
                                } else {
                                    c0192k2 = c0192k7;
                                    obj = objM4514P17;
                                    c2885t = c2885t4;
                                    i18 = i30;
                                    c4071c = c4071c2;
                                    c2875j3 = c2875j2;
                                    interfaceC0666l2 = interfaceC0666l;
                                    c4629q02 = c4629q06;
                                    i19 = i17;
                                    interfaceC5917o2 = interfaceC5917o23;
                                    z17 = z10;
                                    c1836h02 = c1836h03;
                                    c4630q12 = c4630q1;
                                    c0676v2 = c0676v5;
                                    c1511d1 = c1511d13;
                                    interfaceC3599t = interfaceC3599t3;
                                    c2884s2 = c2884s;
                                }
                                C5850l c5850l = C5850l.f23787a;
                                InterfaceC5853o interfaceC5853oM5435l = AbstractC2192n.m5435l(AbstractC0656d.m1827s(AbstractC0656d.m1818j(c5850l, c0676v2), (InterfaceC1231l) obj), z17);
                                InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(Boolean.valueOf(z17), c1836h02);
                                boolean zM4534f3 = c1836h02.m4534f(interfaceC1809a1M4643y) | c1836h02.m4538h(c4629q02) | c1836h02.m4538h(c2885t) | c1836h02.m4538h(c1511d1);
                                if (i19 > 32 || !c1836h02.m4534f(c2875j3)) {
                                    c4629q03 = c4629q02;
                                    if ((i23 & 48) != 32) {
                                        z18 = false;
                                    }
                                    z19 = zM4534f3 | z18;
                                    Object objM4514P18 = c1836h02.m4514P();
                                    if (z19 || objM4514P18 == c1823e) {
                                        c0676v3 = c0676v2;
                                        interfaceC3599t2 = interfaceC3599t;
                                        interfaceC5853o2 = interfaceC5853oM5435l;
                                        interfaceC5853oM10541a = c5850l;
                                        c4629q04 = c4629q03;
                                        c0970b = new C0970b(c4629q04, interfaceC1809a1M4643y, c2885t, c1511d1, c2875j3, null, 5);
                                        interfaceC1809a1 = interfaceC1809a1M4643y;
                                        c2885t2 = c2885t;
                                        c1836h02.m4545k0(c0970b);
                                    } else {
                                        c0970b = objM4514P18;
                                        interfaceC3599t2 = interfaceC3599t;
                                        c2885t2 = c2885t;
                                        c0676v3 = c0676v2;
                                        interfaceC5853o2 = interfaceC5853oM5435l;
                                        c4629q04 = c4629q03;
                                        interfaceC5853oM10541a = c5850l;
                                        interfaceC1809a1 = interfaceC1809a1M4643y;
                                    }
                                    AbstractC1874r.m4624f((InterfaceC1235p) c0970b, c1836h02, C3967n.f12976a);
                                    int i31 = 4;
                                    InterfaceC5853o interfaceC5853oM8090a = AbstractC3898h0.m8090a(interfaceC5853oM10541a, 8675309, new C0362g(new C4642w(c4629q04, i31), 3));
                                    c0192k3 = c0192k2;
                                    C0676v c0676v6 = c0676v3;
                                    InterfaceC5853o interfaceC5853oM8091b = AbstractC3898h0.m8091b(!z10 ? AbstractC5839a.m10541a(interfaceC5853oM8090a, new C0976h(new C0490u(c4629q04, c0676v6, z17, c1511d1, c0192k3, 3), i31)) : interfaceC5853oM8090a, c1511d1.f5054z, c1511d1.f5053y, new C0362g(c1511d1, 6));
                                    InterfaceC3911q.f12829a.getClass();
                                    InterfaceC5853o interfaceC5853oM8114g = AbstractC3913s.m8114g(interfaceC5853oM8091b, AbstractC3913s.f12831b);
                                    final InterfaceC5853o interfaceC5853oM1339d = AbstractC0378h.m1339d(interfaceC5853oM10541a, new C0153s(c4629q04, c2884s2, c0192k3, 21));
                                    boolean zM4538h7 = c1836h02.m4538h(c4629q04) | (i29 != 2048) | c1836h02.m4534f(interfaceC5917o2) | c1836h02.m4538h(c1511d1);
                                    int i32 = i18;
                                    zM4538h2 = zM4538h7 | (i32 != 4) | c1836h02.m4538h(c0192k3);
                                    objM4514P5 = c1836h02.m4514P();
                                    if (!zM4538h2 || objM4514P5 == c1823e) {
                                        C1701x c1701x = new C1701x(c4629q04, z10, interfaceC5917o2, c1511d1, c2884s2, c0192k3);
                                        c1836h02.m4545k0(c1701x);
                                        objM4514P5 = c1701x;
                                    }
                                    final InterfaceC5853o interfaceC5853oM8889m = AbstractC4434w.m8889m(interfaceC5853oM10541a, (InterfaceC1231l) objM4514P5);
                                    C4629q0 c4629q07 = c4629q04;
                                    c2885t3 = c2885t2;
                                    c1511d12 = c1511d1;
                                    interfaceC5917o22 = interfaceC5917o2;
                                    C0973e c0973e2 = new C0973e(c2891z, c2884s, c4629q07, z10, c0192k3, c1511d12, c2875j, c0676v6);
                                    c4629q05 = c4629q07;
                                    if (!z10 && ((Boolean) ((C5944v1) interfaceC5917o22).f24166c.getValue()).booleanValue() && C1939m0.m4813c(((C1939m0) c4629q05.f15324A.getValue()).f6575a) && C1939m0.m4813c(((C1939m0) c4629q05.f15325B.getValue()).f6575a)) {
                                        c0192k4 = c0192k3;
                                        c0973e = c0973e2;
                                        interfaceC5853oM10541a2 = interfaceC5853oM10541a;
                                    } else {
                                        c0973e = c0973e2;
                                        C0455k0 c0455k0 = new C0455k0(abstractC1027s, c4629q05, c2884s, c0192k3, 3);
                                        c4629q05 = c4629q05;
                                        c0192k4 = c0192k3;
                                        interfaceC5853oM10541a2 = AbstractC5839a.m10541a(interfaceC5853oM10541a, c0455k0);
                                    }
                                    zM4538h3 = c1836h02.m4538h(c1511d12);
                                    objM4514P6 = c1836h02.m4514P();
                                    if (!zM4538h3 || objM4514P6 == c1823e) {
                                        objM4514P6 = new C1551t0(c1511d12, 1);
                                        c1836h02.m4545k0(objM4514P6);
                                    }
                                    AbstractC1874r.m4621c(c1511d12, (InterfaceC1231l) objM4514P6, c1836h02);
                                    zM4538h4 = c1836h02.m4538h(c4629q05) | c1836h02.m4538h(c2885t3) | (i32 != 4) | ((i19 <= 32 && c1836h02.m4534f(c2875j)) || (i23 & 48) == 32);
                                    objM4514P7 = c1836h02.m4514P();
                                    if (zM4538h4 || objM4514P7 == c1823e) {
                                        C0454k c0454k = new C0454k(c4629q05, c2885t3, c2884s, c2875j, 12);
                                        c2875j4 = c2875j;
                                        c1836h02.m4545k0(c0454k);
                                        objM4514P7 = c0454k;
                                    } else {
                                        c2875j4 = c2875j;
                                    }
                                    AbstractC1874r.m4621c(c2875j4, (InterfaceC1231l) objM4514P7, c1836h02);
                                    final C4642w c4642w = c4629q05.f15347v;
                                    final boolean z22 = i9 != 1;
                                    final int i33 = c2875j4.f9297e;
                                    C0973e c0973e3 = c0973e;
                                    final C4630q1 c4630q13 = c4630q12;
                                    final C0192k c0192k8 = c0192k4;
                                    final boolean z23 = true;
                                    InterfaceC5853o interfaceC5853oM10541a3 = AbstractC5839a.m10541a(interfaceC5853oM10541a, new InterfaceC1236q() { // from class: w.c1
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1236q
                                        /* JADX INFO: renamed from: b */
                                        public final Object mo734b(Object obj2, Object obj3, Object obj4) {
                                            C1836h0 c1836h04 = (C1836h0) obj3;
                                            ((Integer) obj4).getClass();
                                            c1836h04.m4525a0(851809892);
                                            Object objM4514P19 = c1836h04.m4514P();
                                            C1823e c1823e3 = C1851l.f6155a;
                                            if (objM4514P19 == c1823e3) {
                                                objM4514P19 = new C1529j1();
                                                c1836h04.m4545k0(objM4514P19);
                                            }
                                            C1529j1 c1529j1 = (C1529j1) objM4514P19;
                                            Object objM4514P20 = c1836h04.m4514P();
                                            if (objM4514P20 == c1823e3) {
                                                objM4514P20 = new C4596f0();
                                                c1836h04.m4545k0(objM4514P20);
                                            }
                                            C4585b1 c4585b1 = new C4585b1(c4629q05, c1511d12, c2884s, z23, z22, c1529j1, c0192k8, c4630q13, (C4596f0) objM4514P20, c4642w, i33);
                                            boolean zM4538h8 = c1836h04.m4538h(c4585b1);
                                            Object objM4514P21 = c1836h04.m4514P();
                                            if (zM4538h8 || objM4514P21 == c1823e3) {
                                                C3364p c3364p = new C3364p(1, c4585b1, C4585b1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 14);
                                                c1836h04.m4545k0(c3364p);
                                                objM4514P21 = c3364p;
                                            }
                                            InterfaceC5853o interfaceC5853oM7200d = AbstractC3424d.m7200d((InterfaceC1231l) ((C1414j) objM4514P21));
                                            c1836h04.m4553p(false);
                                            return interfaceC5853oM7200d;
                                        }
                                    });
                                    int i34 = c2875j4.f9296d;
                                    z20 = (i34 == 7 || i34 == 8) ? false : true;
                                    boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                                    zM4536g = c1836h02.m4536g(z20) | c1836h02.m4538h(c0971c);
                                    objM4514P8 = c1836h02.m4514P();
                                    if (!zM4536g || objM4514P8 == c1823e) {
                                        objM4514P8 = new C4226c(z20, c0971c);
                                        c1836h02.m4545k0(objM4514P8);
                                    }
                                    InterfaceC5853o interfaceC5853oM2033a = AbstractC0802b.m2033a(zBooleanValue, z20, (InterfaceC1220a) objM4514P8);
                                    c1030t0 = (AbstractC1027s) c1836h02.m4542j(AbstractC4595f.f15145a);
                                    j3 = ((C1034w) c1836h02.m4542j(AbstractC4595f.f15146b)).f3265a;
                                    if (!C1034w.m2635c(j3, AbstractC0996c0.m2507c(1308617531))) {
                                        c1030t0 = new C1030t0(j3);
                                    }
                                    zM4538h5 = c1836h02.m4538h(c4629q05) | c1836h02.m4534f(c1030t0);
                                    objM4514P9 = c1836h02.m4514P();
                                    if (!zM4538h5 || objM4514P9 == c1823e) {
                                        objM4514P9 = new C2576b(c4629q05, 22, c1030t0);
                                        c1836h02.m4545k0(objM4514P9);
                                    }
                                    final C4609j1 c4609j13 = c4609j1;
                                    InterfaceC5853o interfaceC5853oMo10549d = AbstractC3424d.m7201e(AbstractC3424d.m7201e(AbstractC0985q.m2443m(interfaceC5853o.mo10549d(AbstractC0378h.m1341f(interfaceC5853oM10541a, (InterfaceC1231l) objM4514P9)), c0971c, c4629q05, c1511d12).mo10549d(interfaceC5853oM2033a).mo10549d(interfaceC5853o2), new C1872q0(interfaceC0666l2, 3, c4629q05)), new C1872q0(c4629q05, 2, c1511d12)).mo10549d(interfaceC5853oM10541a3).mo10549d(new C5848j(new C1515f(c4609j13, z10, 1))).mo10549d(interfaceC5853oM8114g).mo10549d(c0973e3);
                                    i20 = 0;
                                    InterfaceC5853o interfaceC5853oM1319a = AbstractC0366k.m1319a(AbstractC4434w.m8889m(interfaceC5853oMo10549d, new C4642w(c4629q05, i20)), new C0151q(c1511d12, 6, interfaceC3599t2));
                                    if (z10 && c4629q05.m9049b() && ((Boolean) c4629q05.f15342q.getValue()).booleanValue() && ((Boolean) ((C5944v1) interfaceC5917o22).f24166c.getValue()).booleanValue()) {
                                        i20 = 1;
                                    }
                                    if (i20 != 0) {
                                        interfaceC5853oM10541a = !AbstractC2161c1.m5388a() ? interfaceC5853oM10541a : AbstractC5839a.m10541a(interfaceC5853oM10541a, new C0976h(c1511d12, 1));
                                    }
                                    final boolean z24 = i20;
                                    final InterfaceC4233c interfaceC4233c4 = interfaceC4233c2;
                                    final C4071c c4071c3 = c4071c;
                                    final InterfaceC5853o interfaceC5853o3 = interfaceC5853oM10541a2;
                                    final C4629q0 c4629q08 = c4629q05;
                                    InterfaceC1235p interfaceC1235p = new InterfaceC1235p() { // from class: w.x
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // p085fg.InterfaceC1235p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            C1836h0 c1836h04 = (C1836h0) obj2;
                                            int iIntValue = ((Integer) obj3).intValue();
                                            if (c1836h04.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                final C4629q0 c4629q09 = c4629q08;
                                                final C1941n0 c1941n03 = c1941n0;
                                                final int i35 = i10;
                                                final int i36 = i9;
                                                final C4609j1 c4609j14 = c4609j13;
                                                final C2884s c2884s4 = c2884s;
                                                final C2104o c2104o2 = c2104o;
                                                final InterfaceC5853o interfaceC5853o4 = interfaceC5853o3;
                                                final InterfaceC5853o interfaceC5853o5 = interfaceC5853oM1339d;
                                                final InterfaceC5853o interfaceC5853o6 = interfaceC5853oM8889m;
                                                final InterfaceC5853o interfaceC5853o7 = interfaceC5853oM10541a;
                                                final C4071c c4071c4 = c4071c3;
                                                final C1511d1 c1511d14 = c1511d12;
                                                final boolean z25 = z24;
                                                final InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
                                                final C0192k c0192k9 = c0192k8;
                                                final InterfaceC4233c interfaceC4233c5 = interfaceC4233c4;
                                                interfaceC1236q.mo734b(AbstractC3879i.m8071e(-44346382, new InterfaceC1235p() { // from class: w.t
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                    @Override // p085fg.InterfaceC1235p
                                                    public final Object invoke(Object obj4, Object obj5) {
                                                        InterfaceC5853o c4633r1;
                                                        C1836h0 c1836h05 = (C1836h0) obj4;
                                                        int iIntValue2 = ((Integer) obj5).intValue();
                                                        if (c1836h05.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                            C4629q0 c4629q010 = c4629q09;
                                                            InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(C5850l.f23787a, ((C4236f) c4629q010.f15332g.getValue()).f13909g, 0.0f, 2);
                                                            int i37 = i35;
                                                            int i38 = i36;
                                                            AbstractC4634s.m9055A(i37, i38);
                                                            C1941n0 c1941n04 = c1941n03;
                                                            if (i37 != 1 || i38 != Integer.MAX_VALUE) {
                                                                interfaceC5853oM6904g = interfaceC5853oM6904g.mo10549d(new C4605i0(c1941n04, i37, i38));
                                                            }
                                                            boolean zM4538h8 = c1836h05.m4538h(c4629q010);
                                                            Object objM4514P19 = c1836h05.m4514P();
                                                            if (zM4538h8 || objM4514P19 == C1851l.f6155a) {
                                                                objM4514P19 = new C4361a(c4629q010, 4);
                                                                c1836h05.m4545k0(objM4514P19);
                                                            }
                                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P19;
                                                            C4609j1 c4609j15 = c4609j14;
                                                            EnumC2640p1 enumC2640p13 = (EnumC2640p1) c4609j15.f15211f.getValue();
                                                            C2884s c2884s5 = c2884s4;
                                                            long j12 = c2884s5.f9317b;
                                                            int i39 = C1939m0.f6574c;
                                                            int iM4816f = (int) (j12 >> 32);
                                                            long j13 = c4609j15.f15210e;
                                                            if (iM4816f == ((int) (j13 >> 32)) && (iM4816f = (int) (j12 & 4294967295L)) == ((int) (j13 & 4294967295L))) {
                                                                iM4816f = C1939m0.m4816f(j12);
                                                            }
                                                            c4609j15.f15210e = c2884s5.f9317b;
                                                            C2891z c2891zM9073p2 = AbstractC4634s.m9073p(c2104o2, c2884s5.f9316a);
                                                            int iOrdinal = enumC2640p13.ordinal();
                                                            if (iOrdinal == 0) {
                                                                c4633r1 = new C4633r1(c4609j15, iM4816f, c2891zM9073p2, interfaceC1220a);
                                                            } else {
                                                                if (iOrdinal != 1) {
                                                                    C3193a.m6822k();
                                                                    return null;
                                                                }
                                                                c4633r1 = new C4614l0(c4609j15, iM4816f, c2891zM9073p2, interfaceC1220a);
                                                            }
                                                            AbstractC0283h.m1151c(AbstractC4072d.m8261a(AbstractC0378h.m1338c(interfaceC5853oM6904g).mo10549d(c4633r1).mo10549d(interfaceC5853o4).mo10549d(interfaceC5853o5).mo10549d(new C4612k1(c1941n04)).mo10549d(interfaceC5853o6).mo10549d(interfaceC5853o7), c4071c4), AbstractC3879i.m8071e(1412697320, new C4638u(c1511d14, c4629q010, z25, interfaceC1231l3, c2884s5, c0192k9, interfaceC4233c5, i38), c1836h05), c1836h05, 48);
                                                        } else {
                                                            c1836h05.m4519V();
                                                        }
                                                        return C3967n.f12976a;
                                                    }
                                                }, c1836h04), c1836h04, 6);
                                            } else {
                                                c1836h04.m4519V();
                                            }
                                            return C3967n.f12976a;
                                        }
                                    };
                                    c1836h03 = c1836h0;
                                    m9064g(interfaceC5853oM1319a, c1511d12, AbstractC3879i.m8071e(-814563849, interfaceC1235p, c1836h03), c1836h03, 384);
                                } else {
                                    c4629q03 = c4629q02;
                                }
                                z18 = true;
                                z19 = zM4534f3 | z18;
                                Object objM4514P182 = c1836h02.m4514P();
                                if (z19) {
                                    c0676v3 = c0676v2;
                                    interfaceC3599t2 = interfaceC3599t;
                                    interfaceC5853o2 = interfaceC5853oM5435l;
                                    interfaceC5853oM10541a = c5850l;
                                    c4629q04 = c4629q03;
                                    c0970b = new C0970b(c4629q04, interfaceC1809a1M4643y, c2885t, c1511d1, c2875j3, null, 5);
                                    interfaceC1809a1 = interfaceC1809a1M4643y;
                                    c2885t2 = c2885t;
                                    c1836h02.m4545k0(c0970b);
                                    AbstractC1874r.m4624f((InterfaceC1235p) c0970b, c1836h02, C3967n.f12976a);
                                    int i312 = 4;
                                    InterfaceC5853o interfaceC5853oM8090a2 = AbstractC3898h0.m8090a(interfaceC5853oM10541a, 8675309, new C0362g(new C4642w(c4629q04, i312), 3));
                                    c0192k3 = c0192k2;
                                    C0676v c0676v62 = c0676v3;
                                    InterfaceC5853o interfaceC5853oM8091b2 = AbstractC3898h0.m8091b(!z10 ? AbstractC5839a.m10541a(interfaceC5853oM8090a2, new C0976h(new C0490u(c4629q04, c0676v62, z17, c1511d1, c0192k3, 3), i312)) : interfaceC5853oM8090a2, c1511d1.f5054z, c1511d1.f5053y, new C0362g(c1511d1, 6));
                                    InterfaceC3911q.f12829a.getClass();
                                    InterfaceC5853o interfaceC5853oM8114g2 = AbstractC3913s.m8114g(interfaceC5853oM8091b2, AbstractC3913s.f12831b);
                                    final InterfaceC5853o interfaceC5853oM1339d2 = AbstractC0378h.m1339d(interfaceC5853oM10541a, new C0153s(c4629q04, c2884s2, c0192k3, 21));
                                    boolean zM4538h72 = c1836h02.m4538h(c4629q04) | (i29 != 2048) | c1836h02.m4534f(interfaceC5917o2) | c1836h02.m4538h(c1511d1);
                                    int i322 = i18;
                                    zM4538h2 = zM4538h72 | (i322 != 4) | c1836h02.m4538h(c0192k3);
                                    objM4514P5 = c1836h02.m4514P();
                                    if (!zM4538h2) {
                                        C1701x c1701x2 = new C1701x(c4629q04, z10, interfaceC5917o2, c1511d1, c2884s2, c0192k3);
                                        c1836h02.m4545k0(c1701x2);
                                        objM4514P5 = c1701x2;
                                        final InterfaceC5853o interfaceC5853oM8889m2 = AbstractC4434w.m8889m(interfaceC5853oM10541a, (InterfaceC1231l) objM4514P5);
                                        C4629q0 c4629q072 = c4629q04;
                                        c2885t3 = c2885t2;
                                        c1511d12 = c1511d1;
                                        interfaceC5917o22 = interfaceC5917o2;
                                        C0973e c0973e22 = new C0973e(c2891z, c2884s, c4629q072, z10, c0192k3, c1511d12, c2875j, c0676v62);
                                        c4629q05 = c4629q072;
                                        if (z10) {
                                            if (!z10 && ((Boolean) ((C5944v1) interfaceC5917o22).f24166c.getValue()).booleanValue() && C1939m0.m4813c(((C1939m0) c4629q05.f15324A.getValue()).f6575a) && C1939m0.m4813c(((C1939m0) c4629q05.f15325B.getValue()).f6575a)) {
                                            }
                                            zM4538h3 = c1836h02.m4538h(c1511d12);
                                            objM4514P6 = c1836h02.m4514P();
                                            if (!zM4538h3) {
                                                objM4514P6 = new C1551t0(c1511d12, 1);
                                                c1836h02.m4545k0(objM4514P6);
                                                AbstractC1874r.m4621c(c1511d12, (InterfaceC1231l) objM4514P6, c1836h02);
                                                if (i19 <= 32) {
                                                    zM4538h4 = c1836h02.m4538h(c4629q05) | c1836h02.m4538h(c2885t3) | (i322 != 4) | ((i19 <= 32 && c1836h02.m4534f(c2875j)) || (i23 & 48) == 32);
                                                    objM4514P7 = c1836h02.m4514P();
                                                    if (zM4538h4) {
                                                        C0454k c0454k2 = new C0454k(c4629q05, c2885t3, c2884s, c2875j, 12);
                                                        c2875j4 = c2875j;
                                                        c1836h02.m4545k0(c0454k2);
                                                        objM4514P7 = c0454k2;
                                                        AbstractC1874r.m4621c(c2875j4, (InterfaceC1231l) objM4514P7, c1836h02);
                                                        final InterfaceC1231l c4642w2 = c4629q05.f15347v;
                                                        if (i9 != 1) {
                                                        }
                                                        final int i332 = c2875j4.f9297e;
                                                        C0973e c0973e32 = c0973e;
                                                        final C4630q1 c4630q132 = c4630q12;
                                                        final C0192k c0192k82 = c0192k4;
                                                        final boolean z232 = true;
                                                        InterfaceC5853o interfaceC5853oM10541a32 = AbstractC5839a.m10541a(interfaceC5853oM10541a, new InterfaceC1236q() { // from class: w.c1
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            @Override // p085fg.InterfaceC1236q
                                                            /* JADX INFO: renamed from: b */
                                                            public final Object mo734b(Object obj2, Object obj3, Object obj4) {
                                                                C1836h0 c1836h04 = (C1836h0) obj3;
                                                                ((Integer) obj4).getClass();
                                                                c1836h04.m4525a0(851809892);
                                                                Object objM4514P19 = c1836h04.m4514P();
                                                                C1823e c1823e3 = C1851l.f6155a;
                                                                if (objM4514P19 == c1823e3) {
                                                                    objM4514P19 = new C1529j1();
                                                                    c1836h04.m4545k0(objM4514P19);
                                                                }
                                                                C1529j1 c1529j1 = (C1529j1) objM4514P19;
                                                                Object objM4514P20 = c1836h04.m4514P();
                                                                if (objM4514P20 == c1823e3) {
                                                                    objM4514P20 = new C4596f0();
                                                                    c1836h04.m4545k0(objM4514P20);
                                                                }
                                                                C4585b1 c4585b1 = new C4585b1(c4629q05, c1511d12, c2884s, z232, z22, c1529j1, c0192k82, c4630q132, (C4596f0) objM4514P20, c4642w2, i332);
                                                                boolean zM4538h8 = c1836h04.m4538h(c4585b1);
                                                                Object objM4514P21 = c1836h04.m4514P();
                                                                if (zM4538h8 || objM4514P21 == c1823e3) {
                                                                    C3364p c3364p = new C3364p(1, c4585b1, C4585b1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 14);
                                                                    c1836h04.m4545k0(c3364p);
                                                                    objM4514P21 = c3364p;
                                                                }
                                                                InterfaceC5853o interfaceC5853oM7200d = AbstractC3424d.m7200d((InterfaceC1231l) ((C1414j) objM4514P21));
                                                                c1836h04.m4553p(false);
                                                                return interfaceC5853oM7200d;
                                                            }
                                                        });
                                                        int i342 = c2875j4.f9296d;
                                                        if (i342 == 7) {
                                                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                                                            zM4536g = c1836h02.m4536g(z20) | c1836h02.m4538h(c0971c);
                                                            objM4514P8 = c1836h02.m4514P();
                                                            if (!zM4536g) {
                                                                objM4514P8 = new C4226c(z20, c0971c);
                                                                c1836h02.m4545k0(objM4514P8);
                                                                InterfaceC5853o interfaceC5853oM2033a2 = AbstractC0802b.m2033a(zBooleanValue2, z20, (InterfaceC1220a) objM4514P8);
                                                                c1030t0 = (AbstractC1027s) c1836h02.m4542j(AbstractC4595f.f15145a);
                                                                j3 = ((C1034w) c1836h02.m4542j(AbstractC4595f.f15146b)).f3265a;
                                                                if (!C1034w.m2635c(j3, AbstractC0996c0.m2507c(1308617531))) {
                                                                }
                                                                zM4538h5 = c1836h02.m4538h(c4629q05) | c1836h02.m4534f(c1030t0);
                                                                objM4514P9 = c1836h02.m4514P();
                                                                if (!zM4538h5) {
                                                                    objM4514P9 = new C2576b(c4629q05, 22, c1030t0);
                                                                    c1836h02.m4545k0(objM4514P9);
                                                                    final C4609j1 c4609j132 = c4609j1;
                                                                    InterfaceC5853o interfaceC5853oMo10549d2 = AbstractC3424d.m7201e(AbstractC3424d.m7201e(AbstractC0985q.m2443m(interfaceC5853o.mo10549d(AbstractC0378h.m1341f(interfaceC5853oM10541a, (InterfaceC1231l) objM4514P9)), c0971c, c4629q05, c1511d12).mo10549d(interfaceC5853oM2033a2).mo10549d(interfaceC5853o2), new C1872q0(interfaceC0666l2, 3, c4629q05)), new C1872q0(c4629q05, 2, c1511d12)).mo10549d(interfaceC5853oM10541a32).mo10549d(new C5848j(new C1515f(c4609j132, z10, 1))).mo10549d(interfaceC5853oM8114g2).mo10549d(c0973e32);
                                                                    i20 = 0;
                                                                    InterfaceC5853o interfaceC5853oM1319a2 = AbstractC0366k.m1319a(AbstractC4434w.m8889m(interfaceC5853oMo10549d2, new C4642w(c4629q05, i20)), new C0151q(c1511d12, 6, interfaceC3599t2));
                                                                    if (z10) {
                                                                        i20 = 1;
                                                                    }
                                                                    if (i20 != 0) {
                                                                    }
                                                                    final boolean z242 = i20;
                                                                    final InterfaceC4233c interfaceC4233c42 = interfaceC4233c2;
                                                                    final C4071c c4071c32 = c4071c;
                                                                    final InterfaceC5853o interfaceC5853o32 = interfaceC5853oM10541a2;
                                                                    final C4629q0 c4629q082 = c4629q05;
                                                                    InterfaceC1235p interfaceC1235p2 = new InterfaceC1235p() { // from class: w.x
                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                        @Override // p085fg.InterfaceC1235p
                                                                        public final Object invoke(Object obj2, Object obj3) {
                                                                            C1836h0 c1836h04 = (C1836h0) obj2;
                                                                            int iIntValue = ((Integer) obj3).intValue();
                                                                            if (c1836h04.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                final C4629q0 c4629q09 = c4629q082;
                                                                                final C1941n0 c1941n03 = c1941n0;
                                                                                final int i35 = i10;
                                                                                final int i36 = i9;
                                                                                final C4609j1 c4609j14 = c4609j132;
                                                                                final C2884s c2884s4 = c2884s;
                                                                                final C2104o c2104o2 = c2104o;
                                                                                final InterfaceC5853o interfaceC5853o4 = interfaceC5853o32;
                                                                                final InterfaceC5853o interfaceC5853o5 = interfaceC5853oM1339d2;
                                                                                final InterfaceC5853o interfaceC5853o6 = interfaceC5853oM8889m2;
                                                                                final InterfaceC5853o interfaceC5853o7 = interfaceC5853oM10541a;
                                                                                final C4071c c4071c4 = c4071c32;
                                                                                final C1511d1 c1511d14 = c1511d12;
                                                                                final boolean z25 = z242;
                                                                                final InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
                                                                                final C0192k c0192k9 = c0192k82;
                                                                                final InterfaceC4233c interfaceC4233c5 = interfaceC4233c42;
                                                                                interfaceC1236q.mo734b(AbstractC3879i.m8071e(-44346382, new InterfaceC1235p() { // from class: w.t
                                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                    @Override // p085fg.InterfaceC1235p
                                                                                    public final Object invoke(Object obj4, Object obj5) {
                                                                                        InterfaceC5853o c4633r1;
                                                                                        C1836h0 c1836h05 = (C1836h0) obj4;
                                                                                        int iIntValue2 = ((Integer) obj5).intValue();
                                                                                        if (c1836h05.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                            C4629q0 c4629q010 = c4629q09;
                                                                                            InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(C5850l.f23787a, ((C4236f) c4629q010.f15332g.getValue()).f13909g, 0.0f, 2);
                                                                                            int i37 = i35;
                                                                                            int i38 = i36;
                                                                                            AbstractC4634s.m9055A(i37, i38);
                                                                                            C1941n0 c1941n04 = c1941n03;
                                                                                            if (i37 != 1 || i38 != Integer.MAX_VALUE) {
                                                                                                interfaceC5853oM6904g = interfaceC5853oM6904g.mo10549d(new C4605i0(c1941n04, i37, i38));
                                                                                            }
                                                                                            boolean zM4538h8 = c1836h05.m4538h(c4629q010);
                                                                                            Object objM4514P19 = c1836h05.m4514P();
                                                                                            if (zM4538h8 || objM4514P19 == C1851l.f6155a) {
                                                                                                objM4514P19 = new C4361a(c4629q010, 4);
                                                                                                c1836h05.m4545k0(objM4514P19);
                                                                                            }
                                                                                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P19;
                                                                                            C4609j1 c4609j15 = c4609j14;
                                                                                            EnumC2640p1 enumC2640p13 = (EnumC2640p1) c4609j15.f15211f.getValue();
                                                                                            C2884s c2884s5 = c2884s4;
                                                                                            long j12 = c2884s5.f9317b;
                                                                                            int i39 = C1939m0.f6574c;
                                                                                            int iM4816f = (int) (j12 >> 32);
                                                                                            long j13 = c4609j15.f15210e;
                                                                                            if (iM4816f == ((int) (j13 >> 32)) && (iM4816f = (int) (j12 & 4294967295L)) == ((int) (j13 & 4294967295L))) {
                                                                                                iM4816f = C1939m0.m4816f(j12);
                                                                                            }
                                                                                            c4609j15.f15210e = c2884s5.f9317b;
                                                                                            C2891z c2891zM9073p2 = AbstractC4634s.m9073p(c2104o2, c2884s5.f9316a);
                                                                                            int iOrdinal = enumC2640p13.ordinal();
                                                                                            if (iOrdinal == 0) {
                                                                                                c4633r1 = new C4633r1(c4609j15, iM4816f, c2891zM9073p2, interfaceC1220a);
                                                                                            } else {
                                                                                                if (iOrdinal != 1) {
                                                                                                    C3193a.m6822k();
                                                                                                    return null;
                                                                                                }
                                                                                                c4633r1 = new C4614l0(c4609j15, iM4816f, c2891zM9073p2, interfaceC1220a);
                                                                                            }
                                                                                            AbstractC0283h.m1151c(AbstractC4072d.m8261a(AbstractC0378h.m1338c(interfaceC5853oM6904g).mo10549d(c4633r1).mo10549d(interfaceC5853o4).mo10549d(interfaceC5853o5).mo10549d(new C4612k1(c1941n04)).mo10549d(interfaceC5853o6).mo10549d(interfaceC5853o7), c4071c4), AbstractC3879i.m8071e(1412697320, new C4638u(c1511d14, c4629q010, z25, interfaceC1231l3, c2884s5, c0192k9, interfaceC4233c5, i38), c1836h05), c1836h05, 48);
                                                                                        } else {
                                                                                            c1836h05.m4519V();
                                                                                        }
                                                                                        return C3967n.f12976a;
                                                                                    }
                                                                                }, c1836h04), c1836h04, 6);
                                                                            } else {
                                                                                c1836h04.m4519V();
                                                                            }
                                                                            return C3967n.f12976a;
                                                                        }
                                                                    };
                                                                    c1836h03 = c1836h0;
                                                                    m9064g(interfaceC5853oM1319a2, c1511d12, AbstractC3879i.m8071e(-814563849, interfaceC1235p2, c1836h03), c1836h03, 384);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zM4538h4 = c1836h02.m4538h(c4629q05) | c1836h02.m4538h(c2885t3) | (i322 != 4) | ((i19 <= 32 && c1836h02.m4534f(c2875j)) || (i23 & 48) == 32);
                                                    objM4514P7 = c1836h02.m4514P();
                                                    if (zM4538h4) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c2875j2 = c2875j;
                            }
                            z16 = zM4538h6;
                            i17 = i16;
                            boolean z25 = (i23 & 48) != 32;
                            zM4538h = z16 | z25 | c1836h03.m4538h(c0192k7) | c1836h03.m4538h(interfaceC3599t3) | c1836h03.m4538h(c4071c2) | c1836h03.m4538h(c1511d13);
                            Object objM4514P172 = c1836h03.m4514P();
                            if (zM4538h) {
                                c0192k2 = c0192k7;
                                c2885t = c2885t4;
                                i18 = i30;
                                c2875j3 = c2875j2;
                                interfaceC0666l2 = interfaceC0666l;
                                c4629q02 = c4629q06;
                                i19 = i17;
                                interfaceC5917o2 = interfaceC5917o23;
                                c1836h02 = c1836h03;
                                c4630q12 = c4630q1;
                                c0676v2 = c0676v5;
                                obj = new InterfaceC1231l() { // from class: w.z
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1231l
                                    public final Object invoke(Object obj2) {
                                        C4618m1 c4618m1M9051d;
                                        EnumC0680z enumC0680z = (EnumC0680z) obj2;
                                        C4629q0 c4629q073 = c4629q02;
                                        if (c4629q073.m9049b() != enumC0680z.m1860a()) {
                                            c4629q073.f15331f.setValue(Boolean.valueOf(enumC0680z.m1860a()));
                                            boolean zM9049b = c4629q073.m9049b();
                                            C2884s c2884s4 = c2884s;
                                            C0192k c0192k83 = c0192k2;
                                            if (zM9049b && z10) {
                                                AbstractC4634s.m9082y(c2885t, c4629q073, c2884s4, c2875j3, c0192k83);
                                            } else {
                                                AbstractC4634s.m9072o(c4629q073);
                                            }
                                            if (enumC0680z.m1860a() && (c4618m1M9051d = c4629q073.m9051d()) != null) {
                                                AbstractC3603v.m7563q(interfaceC3599t3, null, new C0970b(c4071c2, c2884s4, c4629q073, c4618m1M9051d, c0192k83, null, 6), 3);
                                            }
                                            if (!enumC0680z.m1860a()) {
                                                c1511d13.m4021g(null);
                                            }
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                c4071c = c4071c2;
                                z17 = z10;
                                interfaceC3599t = interfaceC3599t3;
                                c2884s2 = c2884s;
                                c1511d1 = c1511d13;
                                c1836h02.m4545k0(obj);
                                C5850l c5850l2 = C5850l.f23787a;
                                InterfaceC5853o interfaceC5853oM5435l2 = AbstractC2192n.m5435l(AbstractC0656d.m1827s(AbstractC0656d.m1818j(c5850l2, c0676v2), (InterfaceC1231l) obj), z17);
                                InterfaceC1809a1 interfaceC1809a1M4643y2 = AbstractC1874r.m4643y(Boolean.valueOf(z17), c1836h02);
                                boolean zM4534f32 = c1836h02.m4534f(interfaceC1809a1M4643y2) | c1836h02.m4538h(c4629q02) | c1836h02.m4538h(c2885t) | c1836h02.m4538h(c1511d1);
                                if (i19 > 32) {
                                    c4629q03 = c4629q02;
                                    if ((i23 & 48) != 32) {
                                        z18 = true;
                                    }
                                    z19 = zM4534f32 | z18;
                                    Object objM4514P1822 = c1836h02.m4514P();
                                    if (z19) {
                                    }
                                }
                            }
                        } else {
                            Long l10 = c4630q1.f15355d;
                            if (jCurrentTimeMillis > (l10 != null ? l10.longValue() : 0L) + ((long) 5000)) {
                            }
                            objM4514P2 = c1836h03.m4514P();
                            if (objM4514P2 == c1823e) {
                            }
                            final InterfaceC3599t interfaceC3599t32 = (InterfaceC3599t) objM4514P2;
                            objM4514P3 = c1836h03.m4514P();
                            if (objM4514P3 == c1823e) {
                            }
                            final C4071c c4071c22 = (C4071c) objM4514P3;
                            objM4514P4 = c1836h03.m4514P();
                            if (objM4514P4 == c1823e) {
                            }
                            final C1511d1 c1511d132 = (C1511d1) objM4514P4;
                            C0192k c0192k72 = c0192k;
                            c1511d132.f5030b = c0192k72;
                            c1511d132.f5031c = c4629q06.f15347v;
                            c1511d132.f5032d = c4629q06;
                            c1511d132.f5033e.setValue(c2884s);
                            c1511d132.f5050v = new C1939m0(j10);
                            c1511d132.f5035g = (InterfaceC5955y0) c1836h03.m4542j(AbstractC5888h1.f23924f);
                            c1511d132.f5036h = interfaceC3599t32;
                            c1511d132.f5038j = (InterfaceC2862a) c1836h03.m4542j(AbstractC5888h1.f23930l);
                            C0676v c0676v52 = c0676v;
                            c1511d132.f5039k = c0676v52;
                            c1511d132.f5040l.setValue(true);
                            c1511d132.f5041m.setValue(Boolean.valueOf(z10));
                            c1836h03.m4525a0(1966756105);
                            C3290b c3290b2 = c1941n02.f6580a.f6523k;
                            C1858m2 c1858m22 = AbstractC1546r.f5155a;
                            c1836h03.m4525a0(430530635);
                            if (Build.VERSION.SDK_INT >= 28) {
                            }
                            c1511d132.f5037i = c1542p;
                            c1836h03.m4553p(z15);
                            c4629q06.m9049b();
                            int i292 = i23 & 7168;
                            int i302 = i15;
                            boolean zM4538h62 = (i302 != 4) | c1836h03.m4538h(c4629q06) | (i292 != 2048) | ((i23 & 57344) != 16384) | c1836h03.m4538h(c2885t4);
                            i16 = (i23 & 112) ^ 48;
                            if (i16 <= 32) {
                            }
                            z16 = zM4538h62;
                            i17 = i16;
                            if ((i23 & 48) != 32) {
                            }
                            zM4538h = z16 | z25 | c1836h03.m4538h(c0192k72) | c1836h03.m4538h(interfaceC3599t32) | c1836h03.m4538h(c4071c22) | c1836h03.m4538h(c1511d132);
                            Object objM4514P1722 = c1836h03.m4514P();
                            if (zM4538h) {
                            }
                        }
                    }
                }
                z13 = false;
                if (c1939m0 == null) {
                }
                if (z14) {
                    C2263n c2263n22 = (C2263n) c0126e.f333i;
                    c2263n22.f7508j = -1;
                    c2263n22.f7509k = -1;
                    c2884sM6290a = C2884s.m6290a(c2884s, null, 0L, 3);
                    C2884s c2884s32 = (C2884s) c0126e.f332h;
                    c0126e.f332h = c2884sM6290a;
                    if (c2890y != null) {
                    }
                    objM4514P = c1836h03.m4514P();
                    if (objM4514P == c1823e) {
                    }
                    c4630q1 = (C4630q1) objM4514P;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (c4630q1.f15356e) {
                    }
                }
            } else {
                c1926g2 = c1926g;
            }
            InterfaceC2760d interfaceC2760d3 = interfaceC2760d;
            C1926g c1926g6 = c1926g2;
            interfaceC4233c2 = interfaceC4233c;
            c4645x0 = new C4645x0(c1926g6, c1941n02, z11, interfaceC4233c2, interfaceC2760d3, 0);
            if (c4629q06.f15326a != c4645x0) {
            }
            c4629q06.f15326a = c4645x0;
            C0126e c0126e2 = c4629q06.f15329d;
            C2890y c2890y2 = c4629q06.f15330e;
            c0126e2.getClass();
            c1939m0 = c2884s.f9318c;
            boolean zM3825a2 = AbstractC1416l.m3825a(c1939m0, ((C2263n) c0126e2.f333i).m5506c());
            str = ((C2884s) c0126e2.f332h).f9316a.f6529h;
            c1926g3 = c2884s.f9316a;
            if (AbstractC1416l.m3825a(str, c1926g3.f6529h)) {
            }
            z13 = false;
            if (c1939m0 == null) {
            }
            if (z14) {
            }
        } else {
            c1836h03.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h03.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: w.y
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM4617C = AbstractC1874r.m4617C(i11 | 1);
                    int iM4617C2 = AbstractC1874r.m4617C(i12);
                    AbstractC4634s.m9063f(c2884s, interfaceC1231l, interfaceC5853o, c1941n0, c2104o, interfaceC1231l2, abstractC1027s, z9, i9, i10, c2875j, c4623o0, z10, interfaceC1236q, (C1836h0) obj2, iM4617C, iM4617C2);
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m9064g(InterfaceC5853o interfaceC5853o, C1511d1 c1511d1, C3874d c3874d, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(2036174316);
        int i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9 | (c1836h0.m4538h(c1511d1) ? 32 : 16);
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, true);
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853o);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0M6930d);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            m9062e(c1511d1, c3874d, c1836h0, (i10 >> 3) & 126);
            c1836h0.m4553p(true);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0145k(interfaceC5853o, c1511d1, c3874d, i9, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [i0.a1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v0, types: [i0.h0] */
    /* JADX INFO: renamed from: h */
    public static final void m9065h(InterfaceC5853o interfaceC5853o, C1926g c1926g, InterfaceC1231l interfaceC1231l, boolean z9, C1941n0 c1941n0, InterfaceC2760d interfaceC2760d, InterfaceC1231l interfaceC1231l2, C1836h0 c1836h0, int i9, int i10) {
        InterfaceC5853o interfaceC5853o2;
        int i11;
        int i12;
        InterfaceC1231l interfaceC1231l3;
        C4621n1 c4621n1;
        InterfaceC1220a interfaceC1220a;
        C3958e c3958e;
        InterfaceC1231l interfaceC1231l4;
        ?? r12;
        Object c4624o1;
        C1926g c1926g2 = c1926g;
        c1836h0.m4527b0(-2118572703);
        if ((i9 & 6) == 0) {
            interfaceC5853o2 = interfaceC5853o;
            i11 = (c1836h0.m4534f(interfaceC5853o2) ? 4 : 2) | i9;
        } else {
            interfaceC5853o2 = interfaceC5853o;
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1836h0.m4534f(c1926g2) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= c1836h0.m4536g(z9) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= c1836h0.m4538h(C4174u.f13711g) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i11 |= c1836h0.m4534f(c1941n0) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i9) == 0) {
            i11 |= c1836h0.m4530d(1) ? 1048576 : 524288;
        }
        if ((12582912 & i9) == 0) {
            i11 |= c1836h0.m4536g(true) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((100663296 & i9) == 0) {
            i13 |= c1836h0.m4530d(Integer.MAX_VALUE) ? 67108864 : 33554432;
        }
        if ((805306368 & i9) == 0) {
            i13 |= c1836h0.m4530d(1) ? 536870912 : 268435456;
        }
        int i14 = i13;
        if ((i10 & 6) == 0) {
            i12 = i10 | (c1836h0.m4538h(interfaceC2760d) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c1836h0.m4538h(null) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c1836h0.m4538h(null) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i10 & 3072) == 0) {
            interfaceC1231l3 = interfaceC1231l2;
            i12 |= c1836h0.m4538h(interfaceC1231l3) ? 2048 : 1024;
        } else {
            interfaceC1231l3 = interfaceC1231l2;
        }
        if ((i10 & 24576) == 0) {
            i12 |= (32768 & i10) == 0 ? c1836h0.m4534f(null) : c1836h0.m4538h(null) ? 16384 : 8192;
        }
        if (c1836h0.m4516S(i14 & 1, ((i14 & 306783379) == 306783378 && (i12 & 9363) == 9362) ? false : true)) {
            boolean zM2741N = AbstractC1089i.m2741N(c1926g2);
            Object obj = C1851l.f6155a;
            if (zM2741N) {
                c1836h0.m4525a0(145641571);
                boolean z10 = (i14 & 112) == 32;
                Object objM4514P = c1836h0.m4514P();
                if (z10 || objM4514P == obj) {
                    objM4514P = new C4621n1(c1926g2);
                    c1836h0.m4545k0(objM4514P);
                }
                c1836h0.m4553p(false);
                c4621n1 = (C4621n1) objM4514P;
            } else {
                c1836h0.m4525a0(145707228);
                c1836h0.m4553p(false);
                c4621n1 = null;
            }
            if (AbstractC1089i.m2741N(c1926g2)) {
                c1836h0.m4525a0(145905443);
                boolean zM4534f = ((i14 & 112) == 32) | c1836h0.m4534f(c4621n1);
                Object objM4514P2 = c1836h0.m4514P();
                if (zM4534f || objM4514P2 == obj) {
                    objM4514P2 = new C4056v1(c4621n1, 3, c1926g2);
                    c1836h0.m4545k0(objM4514P2);
                }
                interfaceC1220a = (InterfaceC1220a) objM4514P2;
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(146002721);
                boolean z11 = (i14 & 112) == 32;
                Object objM4514P3 = c1836h0.m4514P();
                if (z11 || objM4514P3 == obj) {
                    objM4514P3 = new C4361a(c1926g2, 3);
                    c1836h0.m4545k0(objM4514P3);
                }
                interfaceC1220a = (InterfaceC1220a) objM4514P3;
                c1836h0.m4553p(false);
            }
            if (z9) {
                c3958e = AbstractC4589d.f15127a;
                interfaceC1231l4 = null;
            } else {
                c3958e = new C3958e(null, null);
                interfaceC1231l4 = null;
            }
            List list = (List) c3958e.f12961g;
            List list2 = (List) c3958e.f12962h;
            if (z9) {
                c1836h0.m4525a0(146318828);
                Object objM4514P4 = c1836h0.m4514P();
                if (objM4514P4 == obj) {
                    objM4514P4 = AbstractC1874r.m4639u(interfaceC1231l4);
                    c1836h0.m4545k0(objM4514P4);
                }
                c1836h0.m4553p(false);
                r12 = (InterfaceC1809a1) objM4514P4;
            } else {
                c1836h0.m4525a0(146406588);
                c1836h0.m4553p(false);
                r12 = interfaceC1231l4;
            }
            if (z9) {
                c1836h0.m4525a0(146499837);
                boolean zM4534f2 = c1836h0.m4534f(r12);
                Object objM4514P5 = c1836h0.m4514P();
                if (zM4534f2 || objM4514P5 == obj) {
                    objM4514P5 = new C0146l(r12, 13);
                    c1836h0.m4545k0(objM4514P5);
                }
                c1836h0.m4553p(false);
                interfaceC1231l4 = (InterfaceC1231l) objM4514P5;
            } else {
                c1836h0.m4525a0(146571260);
                c1836h0.m4553p(false);
            }
            int i15 = (i14 >> 3) & 14;
            AbstractC4619n.m9041a(c1926g2, c1941n0, interfaceC2760d, list, c1836h0);
            C1926g c1926g3 = (C1926g) interfaceC1220a.invoke();
            boolean zM4538h = c1836h0.m4538h(c4621n1) | ((i14 & 896) == 256);
            Object objM4514P6 = c1836h0.m4514P();
            if (zM4538h || objM4514P6 == obj) {
                objM4514P6 = new C4610k(c4621n1, interfaceC1231l, 0);
                c1836h0.m4545k0(objM4514P6);
            }
            C4621n1 c4621n12 = c4621n1;
            InterfaceC5853o interfaceC5853oM9083z = m9083z(interfaceC5853o2, c1926g3, c1941n0, (InterfaceC1231l) objM4514P6, 1, true, Integer.MAX_VALUE, 1, interfaceC2760d, list, interfaceC1231l4, interfaceC1231l3);
            if (z9) {
                c1836h0.m4525a0(147927697);
                boolean zM4538h2 = c1836h0.m4538h(c4621n12);
                Object objM4514P7 = c1836h0.m4514P();
                if (zM4538h2 || objM4514P7 == obj) {
                    objM4514P7 = new C4613l(c4621n12, 1);
                    c1836h0.m4545k0(objM4514P7);
                }
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P7;
                boolean zM4534f3 = c1836h0.m4534f(r12);
                Object objM4514P8 = c1836h0.m4514P();
                if (zM4534f3 || objM4514P8 == obj) {
                    objM4514P8 = new C0144j(r12, 14);
                    c1836h0.m4545k0(objM4514P8);
                }
                c4624o1 = new C4624o1(interfaceC1220a2, 0, (InterfaceC1220a) objM4514P8);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(147750935);
                boolean zM4538h3 = c1836h0.m4538h(c4621n12);
                Object objM4514P9 = c1836h0.m4514P();
                if (zM4538h3 || objM4514P9 == obj) {
                    objM4514P9 = new C4613l(c4621n12, 0);
                    c1836h0.m4545k0(objM4514P9);
                }
                c4624o1 = new C4635s0((InterfaceC1220a) objM4514P9);
                c1836h0.m4553p(false);
            }
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM9083z);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, c4624o1);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            if (c4621n12 == null) {
                c1836h0.m4525a0(-433557001);
            } else {
                c1836h0.m4525a0(-291080374);
                c4621n12.m9045a(c1836h0, 0);
            }
            c1836h0.m4553p(false);
            if (list2 == null) {
                c1836h0.m4525a0(-433506223);
                c1836h0.m4553p(false);
                c1926g2 = c1926g;
            } else {
                c1836h0.m4525a0(-433506222);
                c1926g2 = c1926g;
                AbstractC4589d.m9030a(c1926g2, list2, c1836h0, i15);
                c1836h0.m4553p(false);
            }
            c1836h0.m4553p(true);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4616m(interfaceC5853o, c1926g2, interfaceC1231l, z9, c1941n0, interfaceC2760d, interfaceC1231l2, i9, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final void m9066i(C1511d1 c1511d1, boolean z9, C1836h0 c1836h0, int i9) {
        C4618m1 c4618m1M9051d;
        c1836h0.m4527b0(626339208);
        int i10 = (c1836h0.m4538h(c1511d1) ? 4 : 2) | i9 | (c1836h0.m4536g(z9) ? 32 : 16);
        if (!c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            c1836h0.m4519V();
        } else if (z9) {
            c1836h0.m4525a0(1530097388);
            C4629q0 c4629q0 = c1511d1.f5032d;
            C1935k0 c1935k0 = null;
            if (c4629q0 != null && (c4618m1M9051d = c4629q0.m9051d()) != null) {
                C1935k0 c1935k02 = c4618m1M9051d.f15293a;
                C4629q0 c4629q02 = c1511d1.f5032d;
                if (!(c4629q02 != null ? c4629q02.f15341p : true)) {
                    c1935k0 = c1935k02;
                }
            }
            if (c1935k0 == null) {
                c1836h0.m4525a0(1530097387);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(1530097388);
                if (C1939m0.m4813c(c1511d1.m4028n().f9317b)) {
                    c1836h0.m4525a0(2110860558);
                    c1836h0.m4553p(false);
                } else {
                    c1836h0.m4525a0(2109807302);
                    C0192k c0192k = c1511d1.f5030b;
                    int i11 = (int) (c1511d1.m4028n().f9317b >> 32);
                    c0192k.m859l(i11);
                    C0192k c0192k2 = c1511d1.f5030b;
                    int i12 = (int) (c1511d1.m4028n().f9317b & 4294967295L);
                    c0192k2.m859l(i12);
                    EnumC4094j enumC4094jM4801a = c1935k0.m4801a(i11);
                    EnumC4094j enumC4094jM4801a2 = c1935k0.m4801a(Math.max(i12 - 1, 0));
                    C4629q0 c4629q03 = c1511d1.f5032d;
                    if (c4629q03 == null || !((Boolean) c4629q03.f15338m.getValue()).booleanValue()) {
                        c1836h0.m4525a0(2110490542);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(2110225306);
                        AbstractC1089i.m2756a(true, enumC4094jM4801a, c1511d1, c1836h0, ((i10 << 6) & 896) | 6);
                        c1836h0.m4553p(false);
                    }
                    C4629q0 c4629q04 = c1511d1.f5032d;
                    if (c4629q04 == null || !((Boolean) c4629q04.f15339n.getValue()).booleanValue()) {
                        c1836h0.m4525a0(2110838734);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(2110574459);
                        AbstractC1089i.m2756a(false, enumC4094jM4801a2, c1511d1, c1836h0, ((i10 << 6) & 896) | 6);
                        c1836h0.m4553p(false);
                    }
                    c1836h0.m4553p(false);
                }
                C4629q0 c4629q05 = c1511d1.f5032d;
                if (c4629q05 != null) {
                    C1845j1 c1845j1 = c4629q05.f15337l;
                    if (!AbstractC1416l.m3825a(c1511d1.f5048t.f9316a.f6529h, c1511d1.m4028n().f9316a.f6529h)) {
                        c1845j1.setValue(Boolean.FALSE);
                    }
                    if (c4629q05.m9049b()) {
                        if (((Boolean) c1845j1.getValue()).booleanValue()) {
                            c1511d1.m4032r();
                        } else {
                            c1511d1.m4029o();
                        }
                    }
                }
                c1836h0.m4553p(false);
            }
            c1836h0.m4553p(false);
        } else {
            c1836h0.m4525a0(1989076778);
            c1836h0.m4553p(false);
            c1511d1.m4029o();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4640v(c1511d1, z9, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m9067j(C1511d1 c1511d1, C1836h0 c1836h0, int i9) {
        C1926g c1926gM4027m;
        c1836h0.m4527b0(-1436003720);
        int i10 = (c1836h0.m4538h(c1511d1) ? 4 : 2) | i9;
        int i11 = 1;
        if (c1836h0.m4516S(i10 & 1, (i10 & 3) != 2)) {
            C4629q0 c4629q0 = c1511d1.f5032d;
            if (c4629q0 == null || !((Boolean) c4629q0.f15340o.getValue()).booleanValue() || (c1926gM4027m = c1511d1.m4027m()) == null || c1926gM4027m.f6529h.length() <= 0) {
                c1836h0.m4525a0(-2111042550);
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(-2112351432);
                boolean zM4534f = c1836h0.m4534f(c1511d1);
                Object objM4514P = c1836h0.m4514P();
                C1823e c1823e = C1851l.f6155a;
                if (zM4534f || objM4514P == c1823e) {
                    objM4514P = new C1561y0(c1511d1);
                    c1836h0.m4545k0(objM4514P);
                }
                InterfaceC4647y0 interfaceC4647y0 = (InterfaceC4647y0) objM4514P;
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h);
                C0192k c0192k = c1511d1.f5030b;
                long j3 = c1511d1.m4028n().f9317b;
                int i12 = C1939m0.f6574c;
                int i13 = (int) (j3 >> 32);
                c0192k.m859l(i13);
                C4629q0 c4629q02 = c1511d1.f5032d;
                C4618m1 c4618m1M9051d = c4629q02 != null ? c4629q02.m9051d() : null;
                c4618m1M9051d.getClass();
                C1935k0 c1935k0 = c4618m1M9051d.f15293a;
                C0808c c0808cM4803c = c1935k0.m4803c(AbstractC3754e0.m7909r(i13, 0, c1935k0.f6561a.f6549a.f6529h.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c0808cM4803c.f2419d)) & 4294967295L) | (((long) Float.floatToRawIntBits((interfaceC4233c.mo1601x0(AbstractC4649z0.f15472a) / 2) + c0808cM4803c.f2416a)) << 32);
                boolean zM4532e = c1836h0.m4532e(jFloatToRawIntBits);
                Object objM4514P2 = c1836h0.m4514P();
                if (zM4532e || objM4514P2 == c1823e) {
                    objM4514P2 = new C4587c0(jFloatToRawIntBits);
                    c1836h0.m4545k0(objM4514P2);
                }
                InterfaceC1533l interfaceC1533l = (InterfaceC1533l) objM4514P2;
                boolean zM4538h = c1836h0.m4538h(interfaceC4647y0) | c1836h0.m4538h(c1511d1);
                Object objM4514P3 = c1836h0.m4514P();
                if (zM4538h || objM4514P3 == c1823e) {
                    objM4514P3 = new C4628q(interfaceC4647y0, i11, c1511d1);
                    c1836h0.m4545k0(objM4514P3);
                }
                InterfaceC5853o interfaceC5853oM8090a = AbstractC3898h0.m8090a(C5850l.f23787a, interfaceC4647y0, (PointerInputEventHandler) objM4514P3);
                boolean zM4532e2 = c1836h0.m4532e(jFloatToRawIntBits);
                Object objM4514P4 = c1836h0.m4514P();
                if (zM4532e2 || objM4514P4 == c1823e) {
                    objM4514P4 = new C0512c(jFloatToRawIntBits, 16);
                    c1836h0.m4545k0(objM4514P4);
                }
                AbstractC4583b.m9027a(interfaceC1533l, AbstractC1052o.m2648a(interfaceC5853oM8090a, (InterfaceC1231l) objM4514P4), 0L, c1836h0, 0);
                c1836h0.m4553p(false);
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0154t(i9, 22, c1511d1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final C0808c m9068k(AbstractC4374a1 abstractC4374a1, int i9, C2891z c2891z, C1935k0 c1935k0, boolean z9, int i10) {
        C0808c c0808cM4803c;
        if (c1935k0 != null) {
            c2891z.f9346b.m859l(i9);
            c0808cM4803c = c1935k0.m4803c(i9);
        } else {
            c0808cM4803c = C0808c.f2415e;
        }
        float f3 = c0808cM4803c.f2416a;
        int iMo1590G0 = abstractC4374a1.mo1590G0(AbstractC4649z0.f15472a);
        return new C0808c(z9 ? (i10 - f3) - iMo1590G0 : f3, c0808cM4803c.f2417b, z9 ? i10 - f3 : iMo1590G0 + f3, c0808cM4803c.f2419d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final boolean m9069l(int i9, KeyEvent keyEvent) {
        return ((int) (AbstractC3424d.m7198b(keyEvent) >> 32)) == i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final ArrayList m9070m(List list, InterfaceC1220a interfaceC1220a) {
        C1795u1 c1795u1;
        if (!((Boolean) interfaceC1220a.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) list.get(i9);
            Object objMo8824X = interfaceC4409m0.mo8824X();
            objMo8824X.getClass();
            C0830a c0830a = ((C4627p1) objMo8824X).f15320a;
            C4621n1 c4621n1 = (C4621n1) c0830a.f2507i;
            C1922e c1922e = (C1922e) c0830a.f2506h;
            C1935k0 c1935k0 = (C1935k0) c4621n1.f15299a.getValue();
            if (c1935k0 == null) {
                c1795u1 = new C1795u1(0, 0, new C2209s1(19));
            } else {
                C1922e c1922eM9044c = C4621n1.m9044c(c1922e, c1935k0);
                if (c1922eM9044c == null) {
                    c1795u1 = new C1795u1(0, 0, new C2209s1(20));
                } else {
                    C4241k c4241kM6765Q = AbstractC3165h.m6765Q(c1935k0.m4809i(c1922eM9044c.f6504b, c1922eM9044c.f6505c).m2603e());
                    c1795u1 = new C1795u1(c4241kM6765Q.f13916c - c4241kM6765Q.f13914a, c4241kM6765Q.m8532a(), new C4361a(c4241kM6765Q, 6));
                }
            }
            int i10 = c1795u1.f5998g;
            int i11 = c1795u1.f5999h;
            arrayList.add(new C3958e(interfaceC4409m0.mo8831Q(AbstractC1089i.m2793u(i10, i10, i11, i11)), (InterfaceC1220a) c1795u1.f6000i));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final int m9071n(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final void m9072o(C4629q0 c4629q0) {
        C2890y c2890y = c4629q0.f15330e;
        if (c2890y != null) {
            c4629q0.f15347v.invoke(C2884s.m6290a((C2884s) c4629q0.f15329d.f332h, null, 0L, 3));
            C2885t c2885t = c2890y.f9343a;
            AtomicReference atomicReference = c2885t.f9320b;
            while (true) {
                if (atomicReference.compareAndSet(c2890y, null)) {
                    c2885t.f9319a.mo2397d();
                    break;
                } else if (atomicReference.get() != c2890y) {
                    break;
                }
            }
        }
        c4629q0.f15330e = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final C2891z m9073p(C2104o c2104o, C1926g c1926g) {
        c2104o.getClass();
        int length = c1926g.f6529h.length();
        String str = c1926g.f6529h;
        int length2 = str.length();
        int iMin = Math.min(length, 100);
        for (int i9 = 0; i9 < iMin; i9++) {
            m9056B(i9, length2, i9);
        }
        m9056B(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i10 = 0; i10 < iMin2; i10++) {
            m9057C(i10, length, i10);
        }
        m9057C(length2, length, length2);
        return new C2891z(c1926g, new C0192k(str.length(), str.length(), 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [b5.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m9074q(int i9, String str) {
        ?? r5;
        ?? r52;
        int spanEnd;
        C2455i c2455iM9078u = m9078u();
        Integer num = null;
        if (c2455iM9078u != null) {
            if (!(c2455iM9078u.m5849c() == 1)) {
                C2104o.m5276A("Not initialized yet");
                return 0;
            }
            AbstractC0063p.m418k(str, "charSequence cannot be null");
            ?? r42 = c2455iM9078u.f8066e.f8056b;
            r42.getClass();
            if (i9 < 0 || i9 >= str.length()) {
                r52 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                C2468v[] c2468vArr = (C2468v[]) spanned.getSpans(i9, i9 + 1, C2468v.class);
                if (c2468vArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(c2468vArr[0]);
                    r52 = str;
                } else {
                    ?? r53 = str;
                    spanEnd = ((C2462p) r42.m790G(r53, Math.max(0, i9 - 16), Math.min(str.length(), i9 + 16), Integer.MAX_VALUE, true, new C2462p(i9))).f8077i;
                    r52 = r53;
                }
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r52;
            if (spanEnd != -1) {
                num = numValueOf;
                r5 = r52;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final int m9075r(CharSequence charSequence, int i9) {
        int length = charSequence.length();
        while (i9 < length) {
            if (charSequence.charAt(i9) == '\n') {
                return i9;
            }
            i9++;
        }
        return charSequence.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final int m9076s(CharSequence charSequence, int i9) {
        while (i9 > 0) {
            if (charSequence.charAt(i9 - 1) == '\n') {
                return i9;
            }
            i9--;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final int m9077t(int i9, String str) {
        C2455i c2455iM9078u = m9078u();
        Integer num = null;
        if (c2455iM9078u != null) {
            Integer numValueOf = Integer.valueOf(c2455iM9078u.m5848b(str, Math.max(0, i9 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final C2455i m9078u() {
        if (!C2455i.m5847d()) {
            return null;
        }
        C2455i c2455iM5846a = C2455i.m5846a();
        if (c2455iM5846a.m5849c() == 1) {
            return c2455iM5846a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final int m9079v(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final void m9080w(C4629q0 c4629q0, C2884s c2884s, C0192k c0192k) {
        AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
        InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
        AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
        try {
            C4618m1 c4618m1M9051d = c4629q0.m9051d();
            if (c4618m1M9051d == null) {
                return;
            }
            C2890y c2890y = c4629q0.f15330e;
            if (c2890y == null) {
                return;
            }
            InterfaceC4428t interfaceC4428tM9050c = c4629q0.m9050c();
            if (interfaceC4428tM9050c == null) {
                return;
            }
            m9081x(c2884s, c4629q0.f15326a, c4618m1M9051d.f15293a, interfaceC4428tM9050c, c2890y, c4629q0.m9049b(), c0192k);
        } finally {
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: w.a1.b(i2.n0, u2.c, m2.d):long */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m9081x(C2884s c2884s, C4645x0 c4645x0, C1935k0 c1935k0, InterfaceC4428t interfaceC4428t, C2890y c2890y, boolean z9, C0192k c0192k) {
        if (z9) {
            int iM4815e = C1939m0.m4815e(c2884s.f9317b);
            c0192k.m859l(iM4815e);
            String str = AbstractC4582a1.f15098a;
            C0808c c0808cM4802b = iM4815e < c1935k0.f6561a.f6549a.f6529h.length() ? c1935k0.m4802b(iM4815e) : iM4815e != 0 ? c1935k0.m4802b(iM4815e - 1) : new C0808c(0.0f, 0.0f, 1.0f, (int) (AbstractC4582a1.m9025a(c4645x0.f15437b, c4645x0.f15442g, c4645x0.f15443h, AbstractC4582a1.f15098a, 1) & 4294967295L));
            float f3 = c0808cM4802b.f2417b;
            float f10 = c0808cM4802b.f2416a;
            long jMo8868m0 = interfaceC4428t.mo8868m0((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
            C0808c c0808cM408a = AbstractC0063p.m408a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo8868m0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo8868m0 >> 32)))) << 32), (((long) Float.floatToRawIntBits(c0808cM4802b.f2418c - f10)) << 32) | (((long) Float.floatToRawIntBits(c0808cM4802b.f2419d - f3)) & 4294967295L));
            if (AbstractC1416l.m3825a((C2890y) c2890y.f9343a.f9320b.get(), c2890y)) {
                c2890y.f9344b.mo2401h(c0808cM408a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final void m9082y(C2885t c2885t, C4629q0 c4629q0, C2884s c2884s, C2875j c2875j, C0192k c0192k) {
        C0126e c0126e = c4629q0.f15329d;
        C4642w c4642w = c4629q0.f15347v;
        C4642w c4642w2 = c4629q0.f15348w;
        C1425u c1425u = new C1425u();
        C0153s c0153s = new C0153s(c0126e, c4642w, c1425u, 23);
        InterfaceC2879n interfaceC2879n = c2885t.f9319a;
        interfaceC2879n.mo2394a(c2884s, c2875j, c0153s, c4642w2);
        C2890y c2890y = new C2890y(c2885t, interfaceC2879n);
        c2885t.f9320b.set(c2890y);
        c1425u.f4738g = c2890y;
        c4629q0.f15330e = c2890y;
        m9080w(c4629q0, c2884s, c0192k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC5853o m9083z(InterfaceC5853o interfaceC5853o, C1926g c1926g, C1941n0 c1941n0, InterfaceC1231l interfaceC1231l, int i9, boolean z9, int i10, int i11, InterfaceC2760d interfaceC2760d, List list, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3) {
        return interfaceC5853o.mo10549d(C5850l.f23787a).mo10549d(new C1262f(c1926g, c1941n0, interfaceC2760d, interfaceC1231l, i9, z9, i10, i11, list, interfaceC1231l2, interfaceC1231l3));
    }
}
