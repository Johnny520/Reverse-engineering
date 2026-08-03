package p227p4;

import ac.C0058k;
import af.C0079b;
import af.C0084g;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0107l;
import bsh.C0353j;
import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
import gf.C1402a;
import gf.C1404c;
import gg.AbstractC1416l;
import gg.C1421q;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import md.C2825b;
import md.EnumC2824a;
import me.C2833a;
import mh.InterfaceC2844b;
import nc.C2958a;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p011ab.C0045e;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p069f.AbstractC0951o0;
import p069f.C0925b0;
import p069f.C0935g0;
import p069f.C0963u0;
import p071f1.AbstractC0996c0;
import p071f1.C1008i0;
import p084ff.C1219e;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p092g4.AbstractC1341a;
import p099h.C1492w;
import p113hf.C1710a;
import p116i.C1746e0;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p117i0.C1888v1;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p136j8.C2104o;
import p136j8.InterfaceC2101l;
import p141jf.C2131g;
import p141jf.C2132h;
import p174m.C2571a;
import p192n4.C2893a;
import p199nd.C2966d;
import p199nd.C2984p;
import p199nd.EnumC2964c;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p219oh.AbstractC3165h;
import p222p.AbstractC3199a;
import p233pd.C3390a;
import p233pd.C3392c;
import p233pd.C3393d;
import p233pd.C3394e;
import p233pd.C3395f;
import p233pd.C3396g;
import p233pd.C3397h;
import p233pd.C3398i;
import p233pd.C3399j;
import p233pd.C3403n;
import p233pd.C3404o;
import p233pd.C3405p;
import p233pd.C3407r;
import p233pd.C3408s;
import p233pd.EnumC3400k;
import p245qc.C3491a;
import p245qc.C3494d;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3498b;
import p246qd.C3501e;
import p246qd.C3503g;
import p246qd.C3504h;
import p246qd.C3510n;
import p246qd.C3514r;
import p255r4.C3672g0;
import p255r4.C3674h0;
import p255r4.C3689p;
import p265s.C3816b0;
import p276sf.C3958e;
import p276sf.C3967n;
import p281t3.AbstractC4106c;
import p282t4.C4114a;
import p282t4.C4117d;
import p294u3.InterfaceC4250c;
import p300ub.AbstractC4302b;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p304uf.C4330d;
import p307v0.C4362b;
import p307v0.InterfaceC4370j;
import p308v1.InterfaceC4407l1;
import p308v1.InterfaceC4412n0;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4472u;
import p311v4.C4447a0;
import p311v4.C4448b;
import p311v4.C4449b0;
import p311v4.C4450c;
import p311v4.C4451c0;
import p311v4.C4452d;
import p311v4.C4453d0;
import p311v4.C4456f;
import p311v4.C4458g;
import p311v4.C4461j;
import p311v4.C4462k;
import p311v4.C4463l;
import p311v4.C4464m;
import p311v4.C4465n;
import p311v4.C4466o;
import p311v4.C4469r;
import p311v4.C4473v;
import p311v4.C4475x;
import p311v4.C4476y;
import p315v8.C4523c;
import p315v8.C4528h;
import p315v8.C4537q;
import p325w3.C4680a;
import p332wb.AbstractC4855en;
import p332wb.C5134n7;
import p332wb.InterfaceC5059kv;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;
import p339x1.C5632o1;
import p339x1.EnumC5586b0;
import p339x1.InterfaceC5627n;
import p343x6.AbstractC5700d;
import p351xe.AbstractC5798s;
import p352xf.EnumC5799a;
import p356y0.AbstractC5852n;
import p357y1.AbstractC5883g0;
import p357y1.C5904l1;
import p357y1.InterfaceC5943v0;
import p376z4.C6090d;
import pa.C3377c;
import sc.InterfaceC3952a;
import sd.C3953a;
import tc.C4144a;
import tg.InterfaceC4186d;
import tg.InterfaceC4187e;
import ug.C4342g;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: p4.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3315t implements InterfaceC4407l1, InterfaceC4186d, InterfaceC4370j, InterfaceC2101l, InterfaceC5059kv, InterfaceC5943v0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10676g;

    /* JADX INFO: renamed from: h */
    public Object f10677h;

    /* JADX INFO: renamed from: i */
    public Object f10678i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3315t(int i9) {
        this.f10676g = i9;
        switch (i9) {
            case 6:
                break;
            case 18:
                this.f10677h = new C2046b(new C5602f0[16]);
                break;
            case 20:
                this.f10677h = new C2046b(new Reference[16]);
                this.f10678i = new ReferenceQueue();
                break;
            default:
                this.f10677h = AbstractC3506j.f11404u;
                this.f10678i = new LinkedHashSet();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static C4320p m6999E(C1402a c1402a, AbstractC3506j abstractC3506j) {
        C4320p c4320p = new C4320p(EnumC3400k.f10981k, 1);
        c4320p.m8688d0(AbstractC3508l.m7370U(c1402a, 0, abstractC3506j));
        c4320p.mo7178I(new C3514r(c1402a.f4667i[1], abstractC3506j));
        return c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m7000i(C3689p c3689p, C4114a c4114a) {
        C3674h0 c3674h0 = c3689p.f12005g;
        C3674h0 c3674h02 = c3689p.f12004f;
        c3674h0.m7660p(c4114a.f13613h);
        for (C4117d c4117d : Collections.unmodifiableCollection(c4114a.f13615j.values())) {
            c3674h02.m7662r(c4117d.f13619g);
            m7001j(c3689p, c4117d.f13620h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m7001j(C3689p c3689p, AbstractC4446a abstractC4446a) {
        if (abstractC4446a instanceof C4448b) {
            m7000i(c3689p, ((C4448b) abstractC4446a).f14758g);
            return;
        }
        if (!(abstractC4446a instanceof C4452d)) {
            c3689p.m7702b(abstractC4446a);
            return;
        }
        C4450c c4450c = ((C4452d) abstractC4446a).f14762g;
        int length = c4450c.f24601h.length;
        for (int i9 = 0; i9 < length; i9++) {
            m7001j(c3689p, (AbstractC4446a) c4450c.m10840l(i9));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C3390a m7002k(C1402a c1402a, int i9, AbstractC3506j abstractC3506j) {
        int i10 = C3390a.f10927p;
        C3503g c3503g = AbstractC3506j.f11385b;
        C3514r c3514rM7370U = AbstractC3508l.m7370U(c1402a, 0, (abstractC3506j == c3503g && AbstractC3199a.m6829b(i9)) ? AbstractC3506j.f11382G : abstractC3506j);
        if (abstractC3506j == c3503g && AbstractC3199a.m6829b(i9)) {
            abstractC3506j = AbstractC3506j.f11379D;
        }
        int i11 = c1402a.f4668j;
        if (i11 == 2) {
            return new C3390a(i9, c3514rM7370U, new C3514r(c1402a.f4667i[0], abstractC3506j), new C3514r(c1402a.f4667i[1], abstractC3506j));
        }
        if (i11 == 3) {
            return new C3390a(i9, c3514rM7370U, new C3514r(c1402a.f4667i[1], abstractC3506j), new C3514r(c1402a.f4667i[2], abstractC3506j));
        }
        C0086a.m452k("Unexpected registers count in ".concat(String.valueOf(c1402a)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C3390a m7003l(C1402a c1402a, int i9, AbstractC3506j abstractC3506j) {
        int i10 = C3390a.f10927p;
        C3503g c3503g = AbstractC3506j.f11385b;
        C3514r c3514rM7370U = AbstractC3508l.m7370U(c1402a, 0, (abstractC3506j == c3503g && AbstractC3199a.m6829b(i9)) ? AbstractC3506j.f11382G : abstractC3506j);
        if (abstractC3506j == c3503g && AbstractC3199a.m6829b(i9)) {
            abstractC3506j = AbstractC3506j.f11379D;
        }
        C3510n c3510nM7368S = AbstractC3508l.m7368S(c1402a.f4669k, abstractC3506j);
        int i11 = c1402a.f4668j;
        if (i11 == 1) {
            return new C3390a(i9, c3514rM7370U, new C3514r(c1402a.f4667i[0], abstractC3506j), c3510nM7368S);
        }
        if (i11 == 2) {
            return new C3390a(i9, c3514rM7370U, new C3514r(c1402a.f4667i[1], abstractC3506j), c3510nM7368S);
        }
        C0086a.m452k("Unexpected registers count in ".concat(String.valueOf(c1402a)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C4320p m7004m(C1402a c1402a, AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        C4320p c4320p = new C4320p(EnumC3400k.f10955G, 2);
        c4320p.m8688d0(AbstractC3508l.m7371Y(c1402a, 0, abstractC3506j2));
        c4320p.mo7178I(AbstractC3508l.m7371Y(c1402a, 1, new C3497a(abstractC3506j)));
        c4320p.mo7178I(new C3514r(c1402a.f4667i[2], AbstractC3506j.f11376A));
        return c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C4320p m7005n(C1402a c1402a, AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        C4320p c4320p = new C4320p(EnumC3400k.f10956H, 3);
        C3503g c3503g = AbstractC3506j.f11385b;
        c4320p.mo7178I(AbstractC3508l.m7371Y(c1402a, 1, new C3497a(abstractC3506j)));
        c4320p.mo7178I(new C3514r(c1402a.f4667i[2], AbstractC3506j.f11376A));
        c4320p.mo7178I(AbstractC3508l.m7371Y(c1402a, 0, abstractC3506j2));
        return c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C3399j m7006o(C1402a c1402a, AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        C3399j c3399j = new C3399j(EnumC3400k.f10985o, abstractC3506j2, 1);
        c3399j.m8688d0(AbstractC3508l.m7370U(c1402a, 0, abstractC3506j2));
        c3399j.mo7178I(new C3514r(c1402a.f4667i[1], abstractC3506j));
        return c3399j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C4320p m7007p(C1402a c1402a, EnumC3400k enumC3400k, AbstractC3506j abstractC3506j) {
        C4320p c4320p = new C4320p(enumC3400k, 2);
        c4320p.m8688d0(AbstractC3508l.m7370U(c1402a, 0, AbstractC3506j.f11385b));
        c4320p.mo7178I(new C3514r(c1402a.f4667i[1], abstractC3506j));
        c4320p.mo7178I(new C3514r(c1402a.f4667i[2], abstractC3506j));
        return c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m7008q(AbstractC4446a abstractC4446a) {
        if (m7009r(abstractC4446a) == 30) {
            return "null";
        }
        return abstractC4446a.mo8898j() + ' ' + abstractC4446a.mo4901a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static int m7009r(AbstractC4446a abstractC4446a) {
        if (abstractC4446a instanceof C4458g) {
            return 0;
        }
        if (abstractC4446a instanceof C4449b0) {
            return 2;
        }
        if (abstractC4446a instanceof C4461j) {
            return 3;
        }
        if (abstractC4446a instanceof C4466o) {
            return 4;
        }
        if (abstractC4446a instanceof C4473v) {
            return 6;
        }
        if (abstractC4446a instanceof C4465n) {
            return 16;
        }
        if (abstractC4446a instanceof C4462k) {
            return 17;
        }
        if (abstractC4446a instanceof C4447a0) {
            return 21;
        }
        if (abstractC4446a instanceof C4475x) {
            return 22;
        }
        if (abstractC4446a instanceof C4451c0) {
            return 23;
        }
        if (abstractC4446a instanceof C4453d0) {
            return 24;
        }
        if (abstractC4446a instanceof C4464m) {
            return 25;
        }
        if (abstractC4446a instanceof C4476y) {
            return 26;
        }
        if (abstractC4446a instanceof C4463l) {
            return 27;
        }
        if (abstractC4446a instanceof C4452d) {
            return 28;
        }
        if (abstractC4446a instanceof C4448b) {
            return 29;
        }
        if (abstractC4446a instanceof C4469r) {
            return 30;
        }
        if (abstractC4446a instanceof C4456f) {
            return 31;
        }
        C0353j.m1309g("Shouldn't happen");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0074 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x003c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x003c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x007d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: u */
    public static void m7010u(C5602f0 c5602f0) {
        if (c5602f0.f22788V > 0) {
            if (c5602f0.f22779M.f22879d == EnumC5586b0.f22712k && !c5602f0.m10044p() && !c5602f0.m10045q() && !c5602f0.f22789W && c5602f0.m10011H()) {
                AbstractC5852n abstractC5852n = c5602f0.f22778L.f22719f;
                if ((abstractC5852n.f23791j & Opcodes.ACC_NATIVE) != 0) {
                    while (abstractC5852n != null) {
                        if ((abstractC5852n.f23790i & Opcodes.ACC_NATIVE) != 0) {
                            ?? M10149e = abstractC5852n;
                            ?? c2046b = 0;
                            while (M10149e != 0) {
                                if (M10149e instanceof InterfaceC5627n) {
                                    InterfaceC5627n interfaceC5627n = (InterfaceC5627n) M10149e;
                                    interfaceC5627n.mo1318w(AbstractC5618k.m10164t(interfaceC5627n, Opcodes.ACC_NATIVE));
                                } else if ((M10149e.f23790i & Opcodes.ACC_NATIVE) != 0 && (M10149e instanceof AbstractC5615j)) {
                                    AbstractC5852n abstractC5852n2 = ((AbstractC5615j) M10149e).f22875v;
                                    int i9 = 0;
                                    M10149e = M10149e;
                                    c2046b = c2046b;
                                    while (abstractC5852n2 != null) {
                                        if ((abstractC5852n2.f23790i & Opcodes.ACC_NATIVE) != 0) {
                                            i9++;
                                            c2046b = c2046b;
                                            if (i9 == 1) {
                                                M10149e = abstractC5852n2;
                                            } else {
                                                if (c2046b == 0) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (M10149e != 0) {
                                                    c2046b.m5056b(M10149e);
                                                    M10149e = 0;
                                                }
                                                c2046b.m5056b(abstractC5852n2);
                                            }
                                        }
                                        abstractC5852n2 = abstractC5852n2.f23793l;
                                        M10149e = M10149e;
                                        c2046b = c2046b;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                M10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                        if ((abstractC5852n.f23791j & Opcodes.ACC_NATIVE) == 0) {
                            break;
                        } else {
                            abstractC5852n = abstractC5852n.f23793l;
                        }
                    }
                }
            }
            c5602f0.f22787U = false;
            C2046b c2046bM10053y = c5602f0.m10053y();
            Object[] objArr = c2046bM10053y.f6891g;
            int i10 = c2046bM10053y.f6893i;
            for (int i11 = 0; i11 < i10; i11++) {
                m7010u((C5602f0) objArr[i11]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static C3396g m7011v(C1402a c1402a, boolean z9) {
        AbstractC3506j abstractC3506jMo7340g = AbstractC3506j.m7362z(c1402a.m3807b()).mo7340g();
        abstractC3506jMo7340g.getClass();
        boolean z10 = abstractC3506jMo7340g instanceof C3503g;
        int i9 = c1402a.f4668j;
        AbstractC3508l[] abstractC3508lArr = new AbstractC3508l[i9];
        if (z9) {
            int i10 = c1402a.f4667i[0];
            for (int i11 = 0; i11 < i9; i11++) {
                abstractC3508lArr[i11] = AbstractC3508l.m7369T(i10, abstractC3506jMo7340g, z10);
                i10++;
            }
        } else {
            for (int i12 = 0; i12 < i9; i12++) {
                abstractC3508lArr[i12] = AbstractC3508l.m7369T(c1402a.f4667i[i12], abstractC3506jMo7340g, z10);
            }
        }
        C3396g c3396g = new C3396g(i9, abstractC3506jMo7340g);
        for (int i13 = 0; i13 < i9; i13++) {
            c3396g.mo7178I(abstractC3508lArr[i13]);
        }
        return c3396g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static C4320p m7012z(EnumC3400k enumC3400k, C3514r c3514r, AbstractC3508l abstractC3508l) {
        C4320p c4320p = new C4320p(enumC3400k, 1);
        c4320p.m8688d0(c3514r);
        c4320p.mo7178I(abstractC3508l);
        return c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public C3403n m7013A(C1402a c1402a, int i9, boolean z9) {
        C2132h c2132hM5050x = AbstractC2043a.m5050x(c1402a);
        if (c2132hM5050x != null) {
            return new C3403n(C3131d.m6659d((C4325u) this.f10678i, c2132hM5050x), c1402a, i9, z9);
        }
        C0086a.m452k("Failed to load method reference for insn: ".concat(String.valueOf(c1402a)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public C4320p m7014B(C1402a c1402a, boolean z9) {
        C4322r c4322r = (C4322r) this.f10677h;
        try {
            C3491a c3491aM5048v = AbstractC2043a.m5048v(c1402a);
            if (c3491aM5048v == null) {
                throw new C0084g("Failed to get call site for insn: ".concat(String.valueOf(c1402a)));
            }
            ArrayList<C2958a> arrayList = c3491aM5048v.f11351a;
            for (C2958a c2958a : arrayList) {
                int i9 = c2958a.f9704g;
                Object obj = c2958a.f9705h;
                int iM8279b = AbstractC4106c.m8279b(i9);
                if (iM8279b == 13) {
                    ((C2132h) obj).m5355a();
                } else if (iM8279b == 15) {
                    C3494d c3494d = (C3494d) obj;
                    switch (c3494d.f11356a) {
                        case 0:
                            break;
                        default:
                            ((C2132h) c3494d.f11358c).m5355a();
                            break;
                    }
                }
            }
            if (AbstractC1341a.m3570A(arrayList)) {
                return AbstractC1341a.m3591g(c4322r, c1402a, z9, arrayList);
            }
            if (AbstractC3165h.m6757I(arrayList)) {
                return AbstractC3165h.m6785l(c1402a, arrayList);
            }
            try {
                return AbstractC2043a.m5031f(c4322r, c1402a, z9, arrayList);
            } catch (Exception e6) {
                c4322r.m6382K("Failed to decode invoke-custom: \n" + AbstractC5798s.m10516j(arrayList, "\n") + ",\n exception: " + AbstractC5798s.m10513g(e6));
                C4320p c4320p = new C4320p(EnumC3400k.f10965Q, 0);
                c4320p.m6231w(EnumC2824a.f9159m);
                c4320p.m6232x(C2825b.f9188c, new C2984p("Failed to decode invoke-custom: " + String.valueOf(arrayList), e6));
                return c4320p;
            }
        } catch (Exception e7) {
            throw new C0084g(AbstractC4855en.m9263g("'invoke-custom' instruction processing error: ", e7.getMessage()), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public C3404o m7015C(C1402a c1402a, boolean z9) {
        C4325u c4325u = (C4325u) this.f10678i;
        C2132h c2132hM5050x = AbstractC2043a.m5050x(c1402a);
        if (c2132hM5050x == null) {
            C0086a.m452k("Failed to load method reference for insn: ".concat(String.valueOf(c1402a)));
            return null;
        }
        C3131d c3131dM6659d = C3131d.m6659d(c4325u, c2132hM5050x);
        C2131g c2131gM368s = c1402a.f4660b.m368s(c1402a.f4670l);
        return new C3404o(C3131d.m6657b(c4325u, c3131dM6659d.f10153j, c3131dM6659d.f10150g, AbstractC5798s.m10509c(c2131gM368s.f7112a, new C2833a(6)), AbstractC3506j.m7362z(c2131gM368s.f7113b)), c1402a, c2131gM368s, c3131dM6659d, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public C3408s m7016D(C1402a c1402a, boolean z9) {
        C4322r c4322r = (C4322r) this.f10677h;
        C3408s c3408s = new C3408s(AbstractC3508l.m7370U(c1402a, 0, AbstractC3506j.f11376A), c1402a.f4670l, z9);
        InterfaceC3952a interfaceC3952a = c1402a.f4672n;
        if (interfaceC3952a != null) {
            C3407r c3407r = new C3407r((C4144a) interfaceC3952a);
            int i9 = c1402a.f4670l;
            c3408s.f11015q = c3407r;
            c3408s.f11016r = i9;
        }
        c4322r.m6231w(EnumC2824a.f9158l0);
        C2966d c2966d = (C2966d) c4322r.f9217g.mo6237c(C2825b.f9206u);
        if (c2966d == null) {
            c2966d = new C2966d();
            c4322r.m6233y(c2966d);
        }
        c2966d.f9720g.add(EnumC2964c.f9716g);
        return c3408s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public void m7017F(Bundle bundle) {
        C3377c c3377c = (C3377c) this.f10677h;
        InterfaceC4250c interfaceC4250c = (InterfaceC4250c) c3377c.f10907c;
        if (!c3377c.f10905a) {
            if (interfaceC4250c.mo550f().f300c != EnumC0107l.f290h) {
                C2104o.m5276A("Restarter must be created only during owner's initialization stage");
                return;
            } else if (c3377c.f10905a) {
                C2104o.m5276A("SavedStateRegistry was already attached.");
                return;
            } else {
                ((C1746e0) c3377c.f10908d).invoke();
                interfaceC4250c.mo550f().m552a(new C4680a());
                c3377c.f10905a = true;
            }
        }
        if (interfaceC4250c.mo550f().f300c.compareTo(EnumC0107l.f292j) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + interfaceC4250c.mo550f().f300c).toString());
        }
        if (c3377c.f10906b) {
            C2104o.m5276A("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM260x = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM260x = AbstractC0018a.m260x("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c3377c.f10911g = bundleM260x;
        c3377c.f10906b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public void m7018G(Bundle bundle) {
        C3377c c3377c = (C3377c) this.f10677h;
        Bundle bundleM10287n = AbstractC5700d.m10287n((C3958e[]) Arrays.copyOf(new C3958e[0], 0));
        Bundle bundle2 = (Bundle) c3377c.f10911g;
        if (bundle2 != null) {
            bundleM10287n.putAll(bundle2);
        }
        synchronized (((C4330d) c3377c.f10909e)) {
            for (Map.Entry entry : ((LinkedHashMap) c3377c.f10910f).entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleM10618a = ((C5904l1) entry.getValue()).m10618a();
                str.getClass();
                bundleM10287n.putBundle(str, bundleM10618a);
            }
        }
        if (bundleM10287n.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM10287n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public void m7019H(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f10677h;
        Object parent = view.getParent();
        if (parent instanceof View) {
            m7019H((View) parent, fArr);
            C1008i0.m2596d(fArr2);
            C1008i0.m2598f(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC5883g0.m10603s(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C1008i0.m2596d(fArr2);
            C1008i0.m2598f(fArr2, left, top);
            AbstractC5883g0.m10603s(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f10678i;
            view.getLocationInWindow(iArr);
            C1008i0.m2596d(fArr2);
            C1008i0.m2598f(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC5883g0.m10603s(fArr, fArr2);
            float f3 = iArr[0];
            float f10 = iArr[1];
            C1008i0.m2596d(fArr2);
            C1008i0.m2598f(fArr2, f3, f10);
            AbstractC5883g0.m10603s(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC0996c0.m2520q(matrix, fArr2);
        AbstractC5883g0.m10603s(fArr, fArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public void m7020I(C4114a c4114a, boolean z9) {
        C6090d c6090d = (C6090d) this.f10678i;
        boolean z10 = z9 && c6090d.m10829d();
        C3689p c3689p = (C3689p) this.f10677h;
        C3674h0 c3674h0 = c3689p.f12004f;
        C3674h0 c3674h02 = c3689p.f12005g;
        C4453d0 c4453d0 = c4114a.f13613h;
        int iM7657m = c3674h02.m7657m(c4453d0);
        if (z10) {
            c6090d.m10828c("  type_idx: " + AbstractC0000a.m48Y0(iM7657m) + " // " + c4453d0.f14784g.mo4901a());
        }
        c6090d.m10838n(c3674h02.m7657m(c4114a.f13613h));
        Collection<C4117d> collectionUnmodifiableCollection = Collections.unmodifiableCollection(c4114a.f13615j.values());
        int size = collectionUnmodifiableCollection.size();
        if (z10) {
            c6090d.m10828c("  size: ".concat(AbstractC0000a.m48Y0(size)));
        }
        c6090d.m10838n(size);
        int i9 = 0;
        for (C4117d c4117d : collectionUnmodifiableCollection) {
            C4451c0 c4451c0 = c4117d.f13619g;
            int iM7656l = c3674h0.m7656l(c4451c0);
            AbstractC4446a abstractC4446a = c4117d.f13620h;
            if (z10) {
                c6090d.m10827b(0, "  elements[" + i9 + "]:");
                i9++;
                c6090d.m10828c("    name_idx: " + AbstractC0000a.m48Y0(iM7656l) + " // " + c4451c0.mo4901a());
            }
            c6090d.m10838n(iM7656l);
            if (z10) {
                c6090d.m10828c("    value: ".concat(m7008q(abstractC4446a)));
            }
            m7022K(abstractC4446a);
        }
        if (z10) {
            c6090d.m10830e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public void m7021J(C4452d c4452d, boolean z9) {
        C6090d c6090d = (C6090d) this.f10678i;
        boolean z10 = z9 && c6090d.m10829d();
        C4450c c4450c = c4452d.f14762g;
        int length = c4450c.f24601h.length;
        if (z10) {
            c6090d.m10828c("  size: ".concat(AbstractC0000a.m48Y0(length)));
        }
        c6090d.m10838n(length);
        for (int i9 = 0; i9 < length; i9++) {
            AbstractC4446a abstractC4446a = (AbstractC4446a) c4450c.m10840l(i9);
            if (z10) {
                c6090d.m10828c("  [" + Integer.toHexString(i9) + "] " + m7008q(abstractC4446a));
            }
            m7022K(abstractC4446a);
        }
        if (z10) {
            c6090d.m10830e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public void m7022K(AbstractC4446a abstractC4446a) {
        C3689p c3689p = (C3689p) this.f10677h;
        C6090d c6090d = (C6090d) this.f10678i;
        int iM7009r = m7009r(abstractC4446a);
        if (iM7009r != 0 && iM7009r != 6 && iM7009r != 2) {
            if (iM7009r == 3) {
                AbstractC1341a.m3584O(c6090d, iM7009r, ((AbstractC4472u) abstractC4446a).mo8914m());
                return;
            }
            if (iM7009r != 4) {
                if (iM7009r == 16) {
                    AbstractC1341a.m3583N(c6090d, iM7009r, ((long) ((C4465n) abstractC4446a).f14817g) << 32);
                    return;
                }
                if (iM7009r == 17) {
                    AbstractC1341a.m3583N(c6090d, iM7009r, ((C4462k) abstractC4446a).f14818g);
                    return;
                }
                switch (iM7009r) {
                    case 21:
                        AbstractC1341a.m3584O(c6090d, iM7009r, c3689p.f12006h.m7658n(((C4447a0) abstractC4446a).f14757g));
                        break;
                    case 22:
                        AbstractC1341a.m3584O(c6090d, iM7009r, ((C3672g0) ((TreeMap) c3689p.f12012n.f11932g).get((C4475x) abstractC4446a)).m7709e());
                        break;
                    case 23:
                        AbstractC1341a.m3584O(c6090d, iM7009r, c3689p.f12004f.m7656l((C4451c0) abstractC4446a));
                        break;
                    case 24:
                        AbstractC1341a.m3584O(c6090d, iM7009r, c3689p.f12005g.m7657m((C4453d0) abstractC4446a));
                        break;
                    case 25:
                        AbstractC1341a.m3584O(c6090d, iM7009r, c3689p.f12007i.m7707l((C4464m) abstractC4446a));
                        break;
                    case 26:
                        AbstractC1341a.m3584O(c6090d, iM7009r, c3689p.f12008j.m7671l((C4476y) abstractC4446a));
                        break;
                    case 27:
                        AbstractC1341a.m3584O(c6090d, iM7009r, c3689p.f12007i.m7707l(((C4463l) abstractC4446a).m8908k()));
                        break;
                    case 28:
                        c6090d.m10834j(iM7009r);
                        m7021J((C4452d) abstractC4446a, false);
                        break;
                    case 29:
                        c6090d.m10834j(iM7009r);
                        m7020I(((C4448b) abstractC4446a).f14758g, false);
                        break;
                    case 30:
                        c6090d.m10834j(iM7009r);
                        break;
                    case 31:
                        c6090d.m10834j((((C4456f) abstractC4446a).f14817g << 5) | iM7009r);
                        break;
                    default:
                        C0353j.m1309g("Shouldn't happen");
                        break;
                }
                return;
            }
        }
        long jMo8914m = ((AbstractC4472u) abstractC4446a).mo8914m();
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo8914m >> 63) ^ jMo8914m)) >> 3;
        c6090d.m10834j(((iNumberOfLeadingZeros - 1) << 5) | iM7009r);
        while (iNumberOfLeadingZeros > 0) {
            c6090d.m10834j((byte) jMo8914m);
            jMo8914m >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p332wb.InterfaceC5059kv
    /* JADX INFO: renamed from: a */
    public boolean mo7023a() {
        return !((AtomicBoolean) this.f10678i).get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4186d
    /* JADX INFO: renamed from: b */
    public Object mo6025b(InterfaceC4187e interfaceC4187e, InterfaceC5557c interfaceC5557c) {
        Object objMo6025b = ((C4342g) this.f10677h).mo6025b(new C1492w(new C1421q(), interfaceC4187e, (C1888v1) this.f10678i, 1), interfaceC5557c);
        return objMo6025b == EnumC5799a.f23547g ? objMo6025b : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2101l
    /* JADX INFO: renamed from: c */
    public void mo597c(String str) {
        C4537q c4537q = (C4537q) this.f10677h;
        C4528h c4528h = (C4528h) this.f10678i;
        c4537q.m8956b(c4528h, null, new C0045e(c4528h, str, c4537q, 14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p332wb.InterfaceC5059kv
    public void close() {
        ((C5134n7) this.f10677h).invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4370j
    /* JADX INFO: renamed from: d */
    public Object mo4774d(C4362b c4362b, Object obj) {
        return ((InterfaceC1235p) this.f10677h).invoke(c4362b, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p307v0.InterfaceC4370j
    /* JADX INFO: renamed from: e */
    public Object mo4775e(Object obj) {
        return ((InterfaceC1231l) this.f10678i).invoke(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4407l1
    /* JADX INFO: renamed from: f */
    public void mo7024f(C0963u0 c0963u0) {
        C0925b0 c0925b0 = (C0925b0) this.f10678i;
        c0925b0.m2267a();
        C0935g0 c0935g0 = (C0935g0) c0963u0.f3034h;
        Object[] objArr = c0935g0.f2938b;
        long[] jArr = c0935g0.f2939c;
        int i9 = c0935g0.f2941e;
        while (i9 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i9] >> 31) & 2147483647L);
            Object obj = objArr[i9];
            Object objM8005b = ((C3816b0) this.f10677h).m8005b(obj);
            int iM2270d = c0925b0.m2270d(objM8005b);
            int i11 = iM2270d >= 0 ? c0925b0.f2896c[iM2270d] : 0;
            if (i11 == 7) {
                c0963u0.remove(obj);
            } else {
                c0925b0.m2273g(i11 + 1, objM8005b);
            }
            i9 = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4407l1
    /* JADX INFO: renamed from: g */
    public boolean mo7025g(Object obj, Object obj2) {
        C3816b0 c3816b0 = (C3816b0) this.f10677h;
        return AbstractC1416l.m3825a(c3816b0.m8005b(obj), c3816b0.m8005b(obj2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.InterfaceC5943v0
    /* JADX INFO: renamed from: h */
    public void mo7026h(View view, float[] fArr) {
        C1008i0.m2596d(fArr);
        m7019H(view, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2101l
    public void onSuccess(File file) {
        C4537q c4537q = (C4537q) this.f10677h;
        C4528h c4528h = (C4528h) this.f10678i;
        c4537q.m8956b(c4528h, new C4523c(c4537q, c4528h, file), new C4523c(c4528h, file, c4537q));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public C4320p m7027s(C1402a c1402a) throws C0079b {
        C4325u c4325u = (C4325u) this.f10678i;
        C4322r c4322r = (C4322r) this.f10677h;
        C1404c c1404c = c1402a.f4662d;
        C0058k c0058k = c1402a.f4660b;
        int iM8279b = AbstractC4106c.m8279b(c1404c == null ? 1 : c1404c.f4708b);
        EnumC3400k enumC3400k = EnumC3400k.f10977g;
        EnumC3400k enumC3400k2 = EnumC3400k.f10982l;
        EnumC3400k enumC3400k3 = EnumC3400k.f10991u;
        EnumC2824a enumC2824a = EnumC2824a.f9156k0;
        EnumC3400k enumC3400k4 = EnumC3400k.f10986p;
        EnumC3400k enumC3400k5 = EnumC3400k.f10983m;
        EnumC3400k enumC3400k6 = EnumC3400k.f10990t;
        switch (iM8279b) {
            case 1:
                return new C4320p(EnumC3400k.f10965Q, 0);
            case 2:
                return m7002k(c1402a, 1, AbstractC3506j.f11391h);
            case 3:
                return m7002k(c1402a, 1, AbstractC3506j.f11390g);
            case 4:
                return m7002k(c1402a, 1, AbstractC3506j.f11385b);
            case 5:
                return m7003l(c1402a, 1, AbstractC3506j.f11385b);
            case 6:
                return m7002k(c1402a, 1, AbstractC3506j.f11392i);
            case 7:
                return m7002k(c1402a, 6, AbstractC3506j.f11385b);
            case 8:
                return m7003l(c1402a, 6, AbstractC3506j.f11385b);
            case 9:
                return m7002k(c1402a, 6, AbstractC3506j.f11392i);
            case 10:
                return m7004m(c1402a, AbstractC3506j.f11381F, AbstractC3506j.f11377B);
            case 11:
                C3503g c3503g = AbstractC3506j.f11386c;
                return m7004m(c1402a, c3503g, c3503g);
            case 12:
                return m7004m(c1402a, AbstractC3506j.f11387d, AbstractC3506j.f11376A);
            case 13:
                C3504h c3504h = AbstractC3506j.f11383H;
                return m7004m(c1402a, c3504h, c3504h);
            case 14:
                C3503g c3503g2 = AbstractC3506j.f11389f;
                return m7004m(c1402a, c3503g2, c3503g2);
            case 15:
                C3504h c3504h2 = AbstractC3506j.f11405v;
                return m7004m(c1402a, c3504h2, c3504h2);
            case 16:
                C3503g c3503g3 = AbstractC3506j.f11388e;
                return m7004m(c1402a, c3503g3, c3503g3);
            case 17:
                C3504h c3504h3 = AbstractC3506j.f11380E;
                return m7004m(c1402a, c3504h3, c3504h3);
            case 18:
                return m7005n(c1402a, AbstractC3506j.f11381F, AbstractC3506j.f11377B);
            case 19:
                C3503g c3503g4 = AbstractC3506j.f11386c;
                return m7005n(c1402a, c3503g4, c3503g4);
            case 20:
                C3503g c3503g5 = AbstractC3506j.f11387d;
                return m7005n(c1402a, c3503g5, c3503g5);
            case 21:
                C3504h c3504h4 = AbstractC3506j.f11383H;
                return m7005n(c1402a, c3504h4, c3504h4);
            case 22:
                C3503g c3503g6 = AbstractC3506j.f11389f;
                return m7005n(c1402a, c3503g6, c3503g6);
            case 23:
                C3504h c3504h5 = AbstractC3506j.f11405v;
                return m7005n(c1402a, c3504h5, c3504h5);
            case 24:
                C3503g c3503g7 = AbstractC3506j.f11388e;
                return m7005n(c1402a, c3503g7, c3503g7);
            case 25:
                C3504h c3504h6 = AbstractC3506j.f11380E;
                return m7005n(c1402a, c3504h6, c3504h6);
            case 26:
            case 28:
            case 51:
            case 102:
            case 151:
            case 152:
            default:
                throw new C0079b(AbstractC0921a.m2251n("Unknown instruction: '", String.valueOf(c1402a), "'"));
            case 27:
                C4320p c4320p = new C4320p(EnumC3400k.f10951C, 1);
                C3503g c3503g8 = AbstractC3506j.f11385b;
                InterfaceC2844b interfaceC2844b = AbstractC3508l.f11418k;
                c4320p.m8688d0(new C3514r(c1402a.f4667i[0], c3503g8));
                c4320p.mo7178I(new C3514r(c1402a.f4667i[1], new C3497a(AbstractC3506j.f11404u)));
                return c4320p;
            case 29:
                AbstractC3506j abstractC3506jM7362z = AbstractC3506j.m7362z(c1402a.m3807b());
                C3399j c3399j = new C3399j(EnumC3400k.f10949A, abstractC3506jM7362z, 1);
                InterfaceC2844b interfaceC2844b2 = AbstractC3508l.f11418k;
                c3399j.m8688d0(new C3514r(c1402a.f4667i[0], abstractC3506jM7362z));
                c3399j.mo7178I(new C3514r(c1402a.f4667i[c1402a.f4668j != 2 ? (char) 0 : (char) 1], AbstractC3506j.f11405v));
                return c3399j;
            case 30:
                return m7007p(c1402a, enumC3400k3, AbstractC3506j.f11391h);
            case 31:
                return m7007p(c1402a, enumC3400k3, AbstractC3506j.f11390g);
            case 32:
                return m7007p(c1402a, enumC3400k6, AbstractC3506j.f11391h);
            case 33:
                return m7007p(c1402a, enumC3400k6, AbstractC3506j.f11390g);
            case 34:
                return m7007p(c1402a, enumC3400k6, AbstractC3506j.f11392i);
            case 35:
                C3504h c3504h7 = AbstractC3506j.f11408y;
                InterfaceC2844b interfaceC2844b3 = AbstractC3508l.f11418k;
                C3510n c3510nM7368S = AbstractC3508l.m7368S(c1402a.f4669k, c3504h7);
                return m7012z(enumC3400k, new C3514r(c1402a.f4667i[0], c3510nM7368S.f11419i), c3510nM7368S);
            case 36:
                AbstractC3506j abstractC3506jM7362z2 = AbstractC3506j.m7362z(c1402a.m3807b());
                C3392c c3392c = new C3392c(abstractC3506jM7362z2);
                C3498b c3498b = new C3498b(AbstractC5798s.m10508b("java.lang.Class"), Collections.singletonList(abstractC3506jM7362z2));
                InterfaceC2844b interfaceC2844b4 = AbstractC3508l.f11418k;
                c3392c.m8688d0(new C3514r(c1402a.f4667i[0], c3498b));
                return c3392c;
            case 37:
                C3393d c3393d = new C3393d(c0058k.m371v(c1402a.f4671m));
                C3501e c3501e = AbstractC3506j.f11396m;
                InterfaceC2844b interfaceC2844b5 = AbstractC3508l.f11418k;
                c3393d.m8688d0(new C3514r(c1402a.f4667i[0], c3501e));
                return c3393d;
            case 38:
                C3504h c3504h8 = AbstractC3506j.f11380E;
                InterfaceC2844b interfaceC2844b6 = AbstractC3508l.f11418k;
                C3510n c3510nM7368S2 = AbstractC3508l.m7368S(c1402a.f4669k, c3504h8);
                return m7012z(enumC3400k, new C3514r(c1402a.f4667i[0], c3510nM7368S2.f11419i), c3510nM7368S2);
            case 39:
                return m7002k(c1402a, 4, AbstractC3506j.f11391h);
            case 40:
                return m7002k(c1402a, 4, AbstractC3506j.f11390g);
            case 41:
                return m7002k(c1402a, 4, AbstractC3506j.f11385b);
            case 42:
                return m7003l(c1402a, 4, AbstractC3506j.f11385b);
            case 43:
                return m7002k(c1402a, 4, AbstractC3506j.f11392i);
            case 44:
                return m7006o(c1402a, AbstractC3506j.f11391h, AbstractC3506j.f11390g);
            case ParserConstants.PROTECTED /* 45 */:
                return m7006o(c1402a, AbstractC3506j.f11391h, AbstractC3506j.f11385b);
            case 46:
                return m7006o(c1402a, AbstractC3506j.f11391h, AbstractC3506j.f11392i);
            case 47:
                return m7006o(c1402a, AbstractC3506j.f11390g, AbstractC3506j.f11391h);
            case 48:
                return m7006o(c1402a, AbstractC3506j.f11390g, AbstractC3506j.f11385b);
            case 49:
                return m7006o(c1402a, AbstractC3506j.f11390g, AbstractC3506j.f11392i);
            case 50:
                return new C3397h(c1402a.f4670l);
            case 52:
            case 53:
                return new C3398i(c1402a, 1);
            case 54:
            case 55:
                return new C3398i(c1402a, 6);
            case 56:
            case 57:
                return new C3398i(c1402a, 5);
            case 58:
            case ParserConstants.VOLATILE /* 59 */:
                return new C3398i(c1402a, 4);
            case ParserConstants.WHEN /* 60 */:
            case ParserConstants.WHILE /* 61 */:
                return new C3398i(c1402a, 3);
            case ParserConstants.INTEGER_LITERAL /* 62 */:
            case ParserConstants.DECIMAL_LITERAL /* 63 */:
                return new C3398i(c1402a, 2);
            case 64:
                C3399j c3399j2 = new C3399j(EnumC3400k.f10950B, AbstractC3506j.m7362z(c1402a.m3807b()), 1);
                C3503g c3503g9 = AbstractC3506j.f11386c;
                InterfaceC2844b interfaceC2844b7 = AbstractC3508l.f11418k;
                c3399j2.m8688d0(new C3514r(c1402a.f4667i[0], c3503g9));
                c3399j2.mo7178I(new C3514r(c1402a.f4667i[1], AbstractC3506j.f11405v));
                return c3399j2;
            case 65:
                return m7006o(c1402a, AbstractC3506j.f11385b, AbstractC3506j.f11387d);
            case 66:
                return m7006o(c1402a, AbstractC3506j.f11385b, AbstractC3506j.f11389f);
            case 67:
                return m7006o(c1402a, AbstractC3506j.f11385b, AbstractC3506j.f11391h);
            case 68:
                return m7006o(c1402a, AbstractC3506j.f11385b, AbstractC3506j.f11390g);
            case 69:
                return m7006o(c1402a, AbstractC3506j.f11385b, AbstractC3506j.f11392i);
            case 70:
                return m7006o(c1402a, AbstractC3506j.f11385b, AbstractC3506j.f11388e);
            case 71:
                return m7013A(c1402a, 2, false);
            case 72:
                return m7013A(c1402a, 2, true);
            case 73:
                return m7013A(c1402a, 4, false);
            case 74:
                return m7013A(c1402a, 4, true);
            case 75:
                return m7013A(c1402a, 1, false);
            case ParserConstants.LPAREN /* 76 */:
                return m7013A(c1402a, 1, true);
            case ParserConstants.RPAREN /* 77 */:
                return m7013A(c1402a, 5, false);
            case ParserConstants.LBRACE /* 78 */:
                return m7013A(c1402a, 5, true);
            case 79:
                return m7013A(c1402a, 3, false);
            case 80:
                return m7013A(c1402a, 3, true);
            case 81:
                C2132h c2132hM5050x = AbstractC2043a.m5050x(c1402a);
                if (c2132hM5050x != null) {
                    C3131d c3131dM6659d = C3131d.m6659d(c4325u, c2132hM5050x);
                    return new C3403n(c3131dM6659d, c1402a, (c3131dM6659d.m6663f() || Objects.equals(c3131dM6659d.f10153j, c4322r.f14411l.f14373m)) ? 2 : 5, false);
                }
                C0086a.m452k("Failed to load method reference for insn: ".concat(String.valueOf(c1402a)));
                return null;
            case 82:
                c0058k.m351a((c1402a.f4671m * 8) + ((C1219e) c0058k.f178j).f4087d.f7101e);
                C3130c c3130cM1199h = c4325u.f14439e.m1199h(new C3130c(C3128a.m6636d(c4325u, c0058k.m373y(c0058k.m346L())), c0058k.m371v(((ByteBuffer) c0058k.f177i).getInt()), AbstractC3506j.m7362z(c0058k.m373y(c0058k.m346L()))));
                C3399j c3399j3 = new C3399j(EnumC3400k.f10959K, c3130cM1199h, 1);
                C4311g c4311gM8717h = c4325u.m8717h(c3130cM1199h);
                AbstractC3506j abstractC3506j = c4311gM8717h != null ? c4311gM8717h.f14392n : c3130cM1199h.f10148i;
                InterfaceC2844b interfaceC2844b8 = AbstractC3508l.f11418k;
                c3399j3.m8688d0(new C3514r(c1402a.f4667i[0], abstractC3506j));
                c3399j3.mo7178I(new C3514r(c1402a.f4667i[1], c3130cM1199h.f10146g.f10138g));
                return c3399j3;
            case 83:
                c0058k.m351a((c1402a.f4671m * 8) + ((C1219e) c0058k.f178j).f4087d.f7101e);
                C3130c c3130cM1199h2 = c4325u.f14439e.m1199h(new C3130c(C3128a.m6636d(c4325u, c0058k.m373y(c0058k.m346L())), c0058k.m371v(((ByteBuffer) c0058k.f177i).getInt()), AbstractC3506j.m7362z(c0058k.m373y(c0058k.m346L()))));
                C3399j c3399j4 = new C3399j(EnumC3400k.f10960L, c3130cM1199h2, 2);
                C4311g c4311gM8717h2 = c4325u.m8717h(c3130cM1199h2);
                AbstractC3506j abstractC3506j2 = c4311gM8717h2 != null ? c4311gM8717h2.f14392n : c3130cM1199h2.f10148i;
                InterfaceC2844b interfaceC2844b9 = AbstractC3508l.f11418k;
                c3399j4.mo7178I(new C3514r(c1402a.f4667i[0], abstractC3506j2));
                c3399j4.mo7178I(new C3514r(c1402a.f4667i[1], c3130cM1199h2.f10146g.f10138g));
                return c3399j4;
            case 84:
                c0058k.m351a((c1402a.f4671m * 8) + ((C1219e) c0058k.f178j).f4087d.f7101e);
                C3130c c3130cM1199h3 = c4325u.f14439e.m1199h(new C3130c(C3128a.m6636d(c4325u, c0058k.m373y(c0058k.m346L())), c0058k.m371v(((ByteBuffer) c0058k.f177i).getInt()), AbstractC3506j.m7362z(c0058k.m373y(c0058k.m346L()))));
                C3399j c3399j5 = new C3399j(EnumC3400k.f10961M, c3130cM1199h3, 0);
                C4311g c4311gM8717h3 = c4325u.m8717h(c3130cM1199h3);
                AbstractC3506j abstractC3506j3 = c4311gM8717h3 != null ? c4311gM8717h3.f14392n : c3130cM1199h3.f10148i;
                InterfaceC2844b interfaceC2844b10 = AbstractC3508l.f11418k;
                c3399j5.m8688d0(new C3514r(c1402a.f4667i[0], abstractC3506j3));
                return c3399j5;
            case 85:
                c0058k.m351a((c1402a.f4671m * 8) + ((C1219e) c0058k.f178j).f4087d.f7101e);
                C3130c c3130cM1199h4 = c4325u.f14439e.m1199h(new C3130c(C3128a.m6636d(c4325u, c0058k.m373y(c0058k.m346L())), c0058k.m371v(((ByteBuffer) c0058k.f177i).getInt()), AbstractC3506j.m7362z(c0058k.m373y(c0058k.m346L()))));
                C3399j c3399j6 = new C3399j(EnumC3400k.f10962N, c3130cM1199h4, 1);
                C4311g c4311gM8717h4 = c4325u.m8717h(c3130cM1199h4);
                AbstractC3506j abstractC3506j4 = c4311gM8717h4 != null ? c4311gM8717h4.f14392n : c3130cM1199h4.f10148i;
                InterfaceC2844b interfaceC2844b11 = AbstractC3508l.f11418k;
                c3399j6.mo7178I(new C3514r(c1402a.f4667i[0], abstractC3506j4));
                return c3399j6;
            case 86:
                return m7006o(c1402a, AbstractC3506j.f11392i, AbstractC3506j.f11391h);
            case 87:
                return m7006o(c1402a, AbstractC3506j.f11392i, AbstractC3506j.f11390g);
            case 88:
                return m7006o(c1402a, AbstractC3506j.f11392i, AbstractC3506j.f11385b);
            case 89:
                C3504h c3504h9 = AbstractC3506j.f11405v;
                InterfaceC2844b interfaceC2844b12 = AbstractC3508l.f11418k;
                return m7012z(EnumC3400k.f10995y, null, new C3514r(c1402a.f4667i[0], c3504h9));
            case 90:
                C3504h c3504h10 = AbstractC3506j.f11405v;
                InterfaceC2844b interfaceC2844b13 = AbstractC3508l.f11418k;
                return m7012z(EnumC3400k.f10996z, null, new C3514r(c1402a.f4667i[0], c3504h10));
            case 91:
                C3504h c3504h11 = AbstractC3506j.f11408y;
                InterfaceC2844b interfaceC2844b14 = AbstractC3508l.f11418k;
                return m7012z(enumC3400k5, new C3514r(c1402a.f4667i[0], c3504h11), new C3514r(c1402a.f4667i[1], c3504h11));
            case 92:
                int i9 = c1402a.f4668j;
                C4320p c4320p2 = new C4320p(EnumC3400k.f10984n, i9);
                for (int i10 = 0; i10 < i9; i10++) {
                    C3504h c3504h12 = AbstractC3506j.f11404u;
                    InterfaceC2844b interfaceC2844b15 = AbstractC3508l.f11418k;
                    c4320p2.mo7178I(new C3514r(c1402a.f4667i[i10], c3504h12));
                }
                return c4320p2;
            case 93:
                C3504h c3504h13 = AbstractC3506j.f11406w;
                InterfaceC2844b interfaceC2844b16 = AbstractC3508l.f11418k;
                C3514r c3514r = new C3514r(c1402a.f4667i[0], c3504h13);
                C4320p c4320p3 = new C4320p(EnumC3400k.f10989s, 0);
                c4320p3.m8688d0(c3514r);
                return c4320p3;
            case 94:
                C3504h c3504h14 = AbstractC3506j.f11405v;
                InterfaceC2844b interfaceC2844b17 = AbstractC3508l.f11418k;
                return m7012z(enumC3400k5, new C3514r(c1402a.f4667i[0], c3504h14), new C3514r(c1402a.f4667i[1], c3504h14));
            case 95:
                C3504h c3504h15 = AbstractC3506j.f11404u;
                InterfaceC2844b interfaceC2844b18 = AbstractC3508l.f11418k;
                C3514r c3514r2 = new C3514r(c1402a.f4667i[0], c3504h15);
                C4320p c4320p4 = new C4320p(EnumC3400k.f10964P, 0);
                c4320p4.m8688d0(c3514r2);
                return c4320p4;
            case 96:
                C3504h c3504h16 = AbstractC3506j.f11380E;
                InterfaceC2844b interfaceC2844b19 = AbstractC3508l.f11418k;
                return m7012z(enumC3400k5, new C3514r(c1402a.f4667i[0], c3504h16), new C3514r(c1402a.f4667i[1], c3504h16));
            case 97:
                return m7002k(c1402a, 3, AbstractC3506j.f11391h);
            case 98:
                return m7002k(c1402a, 3, AbstractC3506j.f11390g);
            case 99:
                return m7002k(c1402a, 3, AbstractC3506j.f11385b);
            case 100:
                return m7003l(c1402a, 3, AbstractC3506j.f11385b);
            case 101:
                return m7002k(c1402a, 3, AbstractC3506j.f11392i);
            case 103:
                return m6999E(c1402a, AbstractC3506j.f11391h);
            case 104:
                return m6999E(c1402a, AbstractC3506j.f11390g);
            case 105:
                return m6999E(c1402a, AbstractC3506j.f11385b);
            case 106:
                return m6999E(c1402a, AbstractC3506j.f11392i);
            case 107:
                AbstractC3506j abstractC3506jM7362z3 = AbstractC3506j.m7362z(c1402a.m3807b());
                C3399j c3399j7 = new C3399j(EnumC3400k.f10958J, abstractC3506jM7362z3, 0);
                InterfaceC2844b interfaceC2844b20 = AbstractC3508l.f11418k;
                c3399j7.m8688d0(new C3514r(c1402a.f4667i[0], abstractC3506jM7362z3));
                return c3399j7;
            case 108:
                C3503g c3503g10 = AbstractC3506j.f11385b;
                C4320p c4320p5 = new C4320p(enumC3400k2, 1);
                c4320p5.m8688d0(AbstractC3508l.m7370U(c1402a, 0, c3503g10));
                c4320p5.mo7178I(new C3514r(c1402a.f4667i[1], c3503g10));
                return c4320p5;
            case 109:
                C3503g c3503g11 = AbstractC3506j.f11392i;
                C4320p c4320p6 = new C4320p(enumC3400k2, 1);
                c4320p6.m8688d0(AbstractC3508l.m7370U(c1402a, 0, c3503g11));
                c4320p6.mo7178I(new C3514r(c1402a.f4667i[1], c3503g11));
                return c4320p6;
            case 110:
                return m7002k(c1402a, 7, AbstractC3506j.f11385b);
            case 111:
                return m7003l(c1402a, 7, AbstractC3506j.f11385b);
            case 112:
                return m7002k(c1402a, 7, AbstractC3506j.f11392i);
            case 113:
                return m7002k(c1402a, 5, AbstractC3506j.f11391h);
            case 114:
                return m7002k(c1402a, 5, AbstractC3506j.f11390g);
            case 115:
                return m7002k(c1402a, 5, AbstractC3506j.f11385b);
            case 116:
                return m7003l(c1402a, 5, AbstractC3506j.f11385b);
            case 117:
                return m7002k(c1402a, 5, AbstractC3506j.f11392i);
            case 118:
                AbstractC3506j abstractC3506j5 = c4322r.f14419t;
                InterfaceC2844b interfaceC2844b21 = AbstractC3508l.f11418k;
                return m7012z(enumC3400k4, null, new C3514r(c1402a.f4667i[0], abstractC3506j5));
            case 119:
                return new C4320p(enumC3400k4, 0);
            case 120:
                C3503g c3503g12 = AbstractC3506j.f11385b;
                InterfaceC2844b interfaceC2844b22 = AbstractC3508l.f11418k;
                return new C3390a(2, new C3514r(c1402a.f4667i[0], c3503g12), AbstractC3508l.m7368S(c1402a.f4669k, c3503g12), new C3514r(c1402a.f4667i[1], c3503g12));
            case 121:
                return m7002k(c1402a, 9, AbstractC3506j.f11385b);
            case 122:
                return m7003l(c1402a, 9, AbstractC3506j.f11385b);
            case 123:
                return m7002k(c1402a, 9, AbstractC3506j.f11392i);
            case 124:
                return m7002k(c1402a, 10, AbstractC3506j.f11385b);
            case 125:
                return m7003l(c1402a, 10, AbstractC3506j.f11385b);
            case 126:
                return m7002k(c1402a, 10, AbstractC3506j.f11392i);
            case 127:
                return m7002k(c1402a, 2, AbstractC3506j.f11391h);
            case 128:
                return m7002k(c1402a, 2, AbstractC3506j.f11390g);
            case 129:
                return m7002k(c1402a, 2, AbstractC3506j.f11385b);
            case 130:
                return m7002k(c1402a, 2, AbstractC3506j.f11392i);
            case 131:
                C3501e c3501e2 = AbstractC3506j.f11398o;
                InterfaceC2844b interfaceC2844b23 = AbstractC3508l.f11418k;
                return m7012z(EnumC3400k.f10988r, null, new C3514r(c1402a.f4667i[0], c3501e2));
            case 132:
                return m7002k(c1402a, 11, AbstractC3506j.f11385b);
            case 133:
                return m7003l(c1402a, 11, AbstractC3506j.f11385b);
            case 134:
                return m7002k(c1402a, 11, AbstractC3506j.f11392i);
            case 135:
                return m7002k(c1402a, 8, AbstractC3506j.f11385b);
            case 136:
                return m7003l(c1402a, 8, AbstractC3506j.f11385b);
            case 137:
                return m7002k(c1402a, 8, AbstractC3506j.f11392i);
            case 138:
                AbstractC3506j abstractC3506jM7362z4 = AbstractC3506j.m7362z(c1402a.m3807b());
                int i11 = (int) c1402a.f4669k;
                if (i11 != 0) {
                    abstractC3506jM7362z4.getClass();
                    if (!(abstractC3506jM7362z4 instanceof C3497a)) {
                        if (i11 == 1) {
                            abstractC3506jM7362z4 = new C3497a(abstractC3506jM7362z4);
                        } else {
                            int i12 = 0;
                            while (i12 < i11) {
                                i12++;
                                abstractC3506jM7362z4 = new C3497a(abstractC3506jM7362z4);
                            }
                        }
                    }
                }
                int i13 = c1402a.f4668j;
                C3405p c3405p = new C3405p(i13 - 1, abstractC3506jM7362z4);
                InterfaceC2844b interfaceC2844b24 = AbstractC3508l.f11418k;
                c3405p.m8688d0(new C3514r(c1402a.f4667i[0], abstractC3506jM7362z4));
                for (int i14 = 1; i14 < i13; i14++) {
                    c3405p.mo7178I(AbstractC3508l.m7369T(c1402a.f4667i[i14], AbstractC3506j.f11385b, true));
                }
                C2966d c2966d = (C2966d) c4322r.f9217g.mo6237c(C2825b.f9206u);
                if (c2966d == null) {
                    c2966d = new C2966d();
                    c4322r.m6233y(c2966d);
                }
                c2966d.f9720g.add(EnumC2964c.f9717h);
                return c3405p;
            case 139:
                return m7011v(c1402a, false);
            case 140:
                return m7011v(c1402a, true);
            case 141:
                C3497a c3497a = AbstractC3506j.f11407x;
                InterfaceC2844b interfaceC2844b25 = AbstractC3508l.f11418k;
                return new C3395f(c1402a.f4670l, new C3514r(c1402a.f4667i[0], c3497a));
            case 142:
                InterfaceC3952a interfaceC3952a = c1402a.f4672n;
                Objects.requireNonNull(interfaceC3952a);
                C1710a c1710a = (C1710a) interfaceC3952a;
                return new C3394e(c1710a.f5701a, c1710a.f5702b, c1710a.f5703c);
            case 143:
                return m7016D(c1402a, true);
            case 144:
            case 146:
                return new C3407r((C4144a) c1402a.f4672n);
            case 145:
                return m7016D(c1402a, false);
            case 147:
                return m7015C(c1402a, false);
            case 148:
                return m7015C(c1402a, true);
            case 149:
                return m7014B(c1402a, false);
            case 150:
                return m7014B(c1402a, true);
            case Opcodes.IFEQ /* 153 */:
                c4322r.m6231w(enumC2824a);
                C3953a c3953a = new C3953a(c1402a.f4670l);
                C3504h c3504h17 = AbstractC3506j.f11384I;
                InterfaceC2844b interfaceC2844b26 = AbstractC3508l.f11418k;
                c3953a.m8688d0(new C3514r(c1402a.f4667i[0], c3504h17));
                return c3953a;
            case Opcodes.IFNE /* 154 */:
                c4322r.m6231w(enumC2824a);
                C3504h c3504h18 = AbstractC3506j.f11384I;
                InterfaceC2844b interfaceC2844b27 = AbstractC3508l.f11418k;
                return m7012z(EnumC3400k.f10975a0, null, new C3514r(c1402a.f4667i[0], c3504h18));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:11:0x0034 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: x1.f0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m7028t() {
        Object[] objArr;
        C2046b c2046b = (C2046b) this.f10677h;
        Arrays.sort(c2046b.f6891g, 0, c2046b.f6893i, C5632o1.f22938h);
        int i9 = c2046b.f6893i;
        C5602f0[] c5602f0Arr = (C5602f0[]) this.f10678i;
        if (c5602f0Arr != null) {
            int length = c5602f0Arr.length;
            objArr = c5602f0Arr;
            if (length < i9) {
                objArr = new C5602f0[Math.max(16, i9)];
            }
        }
        this.f10678i = null;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = c2046b.f6891g[i10];
        }
        c2046b.m5061g();
        while (true) {
            i9--;
            if (-1 >= i9) {
                this.f10678i = objArr;
                return;
            }
            C5602f0 c5602f0 = objArr[i9];
            c5602f0.getClass();
            if (c5602f0.f22787U) {
                m7010u(c5602f0);
            }
            objArr[i9] = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f10676g) {
            case 2:
                return AbstractC0255e.m1022k("DebugInfo{lines=", String.valueOf((Map) this.f10677h), ", localVars=", String.valueOf((List) this.f10678i), "}");
            case 3:
                return AbstractC0255e.m1022k("TypeInfo{type=", String.valueOf((AbstractC3506j) this.f10677h), ", bounds=", String.valueOf((LinkedHashSet) this.f10678i), "}");
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public boolean m7029w(String str) {
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f10678i;
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(str, false);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public InterfaceC4412n0 m7030x() {
        return (InterfaceC4412n0) ((C1845j1) this.f10678i).getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public String m7031y(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f10678i;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(str, str2);
                if (string != null) {
                    return string;
                }
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    public C3315t(Context context) {
        this.f10676g = 11;
        this.f10677h = context;
        this.f10678i = AbstractC4302b.m8640c(context, "Hchat_transfer_config");
    }

    public /* synthetic */ C3315t(Object obj, int i9, Object obj2) {
        this.f10676g = i9;
        this.f10677h = obj;
        this.f10678i = obj2;
    }

    public C3315t(C3377c c3377c) {
        this.f10676g = 10;
        this.f10677h = c3377c;
        this.f10678i = new C2571a(c3377c, 20);
    }

    public C3315t(C5602f0 c5602f0, InterfaceC4412n0 interfaceC4412n0) {
        this.f10676g = 16;
        this.f10677h = c5602f0;
        this.f10678i = AbstractC1874r.m4639u(interfaceC4412n0);
    }

    public C3315t(C4322r c4322r) {
        this.f10676g = 1;
        this.f10677h = c4322r;
        this.f10678i = c4322r.f14411l.f14371k;
    }

    public C3315t(C2893a c2893a, int i9, int i10, int i11, int i12) {
        this.f10676g = 0;
        this.f10677h = new C3316u(c2893a, i9, i11, i12);
        this.f10678i = new ArrayList(i10);
    }

    public C3315t(C3689p c3689p, C6090d c6090d) {
        this.f10676g = 4;
        if (c3689p != null) {
            this.f10677h = c3689p;
            this.f10678i = c6090d;
        } else {
            C0353j.m1305c("file == null");
            throw null;
        }
    }

    public C3315t(C3816b0 c3816b0) {
        this.f10676g = 5;
        this.f10677h = c3816b0;
        C0925b0 c0925b0 = AbstractC0951o0.f2997a;
        this.f10678i = new C0925b0();
    }

    public C3315t(float[] fArr) {
        this.f10676g = 19;
        this.f10677h = fArr;
        this.f10678i = new int[2];
    }
}
