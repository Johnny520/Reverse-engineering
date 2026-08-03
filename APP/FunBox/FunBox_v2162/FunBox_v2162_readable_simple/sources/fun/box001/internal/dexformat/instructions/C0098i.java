package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.AbstractC0041r;
import fun.box001.internal.dexformat.AbstractC0048y;
import fun.box001.internal.dexformat.C0043t;
import fun.box001.internal.dexformat.C0049z;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.output.InterfaceC0199a;
import fun.box001.internal.dexformat.writer.code.C0187q;
import fun.box001.internal.dexformat.writer.data.C0193a;
import fun.box001.internal.dexformat.writer.data.C0194b;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.error.DexGenerationException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: g.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0098i {

    /* JADX INFO: renamed from: a */
    private final C0049z f364a;

    /* JADX INFO: renamed from: b */
    private final C0043t f365b;

    /* JADX INFO: renamed from: c */
    private final C0202d f366c;

    /* JADX INFO: renamed from: d */
    private final int f367d;

    /* JADX INFO: renamed from: e */
    private final int f368e;

    /* JADX INFO: renamed from: f */
    private final C0193a f369f;

    /* JADX INFO: renamed from: g */
    private final boolean f370g;

    /* JADX INFO: renamed from: h */
    private int f371h;

    /* JADX INFO: renamed from: i */
    private int f372i;

    /* JADX INFO: renamed from: j */
    private InterfaceC0199a f373j;

    /* JADX INFO: renamed from: k */
    private PrintWriter f374k;

    /* JADX INFO: renamed from: l */
    private String f375l;

    /* JADX INFO: renamed from: m */
    private boolean f376m;

    /* JADX INFO: renamed from: n */
    private final AbstractC0041r[] f377n;

    public C0098i(C0049z r1, C0043t r2, C0100k r3, int r4, int r5, boolean r6, C0187q r7) {
        this.f371h = 0;
        this.f372i = 1;
        this.f364a = r1;
        this.f365b = r2;
        this.f369f = r7.m431j();
        this.f370g = r6;
        this.f367d = r4;
        this.f368e = r5;
        this.f366c = new C0202d();
        this.f377n = new AbstractC0041r[r5];
    }

    /* JADX INFO: renamed from: a */
    private void m281a(int r3, String r4) {
        if (this.f375l == null) goto L5;
        r4 = this.f375l + r4;
    L5:
        InterfaceC0199a r0 = this.f373j;
        if (r0 != null) goto L8;
    L12:
        PrintWriter r32 = this.f374k;
        if (r32 == null) goto L16;
        r32.println(r4);
        return;
    L16:
        return;
    L8:
        if (this.f376m == true) goto L11;
        r3 = 0;
    L11:
        ((C0202d) r0).m484b(r3, r4);
        goto L12
    }

    /* JADX INFO: renamed from: b */
    private static int m282b(int r2, int r3) {
        if (r2 < (-4)) goto L9;
        if (r2 > 10) goto L9;
        int r32 = r3 * 15;
        return (r32 + (r2 - (-4))) + 10;
    L9:
        throw new RuntimeException("Parameter out of range");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private byte[] m283d() {
        int r1 = 0;
        C0049z r2 = this.f364a;
        if (r2 != null) goto L5;
        int r3 = 0;
    L6:
        ArrayList r4 = new ArrayList(r3);
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L9;
        r4.add(r2.m510m(r5));
        r5 = r5 + 1;
        goto L7
    L9:
        Collections.sort(r4, new C0097h(0));
        C0193a r32 = this.f369f;
        ArrayList r22 = new ArrayList(r32.m457d().m504B());
        C0194b r52 = r32.m457d();
        int r6 = r52.m504B();
        int r7 = 0;
        int r8 = 0;
    L10:
        if (r7 >= r6) goto L12;
        r8 = r8 + r52.m515r(r7).m469f();
        r7 = r7 + 1;
        goto L10
    L12:
        int r53 = this.f368e;
        boolean r72 = this.f370g;
        new BitSet(r53 - ((r53 - r8) - (!r72 ? 1 : 0)));
        C0043t r62 = this.f365b;
        if (r62.m504B() > 0) goto L100;
        Collections.sort(r22, new C0097h(1));
        if (this.f373j == null) goto L17;
    L20:
        Object[] r82 = true;
    L21:
        C0202d r11 = this.f366c;
        int r12 = r11.m491j();
        if (r4.size() <= 0) goto L24;
        ((AbstractC0048y) r4.get(0)).m214b().getClass();
        this.f372i = -1;
    L24:
        r11.m500t(this.f372i);
        if (r82 == false) goto L27;
        m281a(r11.m491j() - r12, "line_start: " + this.f372i);
    L27:
        C0194b r122 = r32.m457d();
        int r13 = r122.m504B();
        int r14 = 0;
        int r15 = 0;
    L28:
        if (r14 >= r13) goto L30;
        r15 = r122.m515r(r14).m469f() + r15;
        r14 = r14 + 1;
        goto L28
    L30:
        int r54 = (r53 - r15) - (!r72 ? 1 : 0);
        C0194b r33 = r32.m457d();
        int r123 = r33.m504B();
        if (r72 == true) goto L37;
        Iterator r73 = r22.iterator();
        if (r73.hasNext() == true) goto L35;
        r54 = r54 + 1;
        goto L37
    L35:
        ((AbstractC0041r) r73.next()).getClass();
        throw null;
    L37:
        int r74 = r11.m491j();
        r11.m500t(r123);
        if (r82 == false) goto L40;
        m281a(r11.m491j() - r74, String.format("parameters_size: %04x", new Object[]{Integer.valueOf(r123)}));
    L40:
        int r75 = 0;
    L41:
        if (r75 >= r123) goto L50;
        C0195c r132 = r33.m515r(r75);
        int r142 = r11.m491j();
        Iterator r152 = r22.iterator();
        if (r152.hasNext() == true) goto L48;
        r11.m500t(r1);
        if (r82 == false) goto L47;
        m281a(r11.m491j() - r142, "parameter <unnamed> v" + r54);
    L47:
        r54 = r54 + r132.m469f();
        r75 = r75 + 1;
        r1 = 0;
        goto L41
    L48:
        ((AbstractC0041r) r152.next()).getClass();
        throw null;
    L50:
        AbstractC0041r[] r16 = this.f377n;
        int r23 = r16.length;
        int r34 = 0;
    L51:
        if (r34 >= r23) goto L56;
        if (r16[r34] != null) goto L55;
        r34 = r34 + 1;
        goto L51
    L55:
        throw null;
    L56:
        r11.m496p(7);
        if (this.f373j == null) goto L59;
    L60:
        m281a(1, String.format("%04x: prologue end", new Object[]{Integer.valueOf(this.f371h)}));
    L61:
        int r17 = r4.size();
        int r24 = r62.m504B();
        int r35 = 0;
    L63:
        if (r62.m504B() <= 0) goto L69;
        r62.m192F();
        if (this.f371h != 0) goto L69;
        r62.m192F();
        throw null;
    L69:
        int r55 = r4.size();
    L70:
        if (r35 >= r55) goto L75;
        if (((AbstractC0048y) r4.get(r35)).m213a() != this.f371h) goto L75;
        m286h((AbstractC0048y) r4.get(r35));
        r35 = r35 + 1;
    L75:
        if (r24 <= 0) goto L77;
        r62.m192F();
        int r76 = 0;
    L78:
        if (r35 >= r17) goto L80;
        int r83 = ((AbstractC0048y) r4.get(r35)).m213a();
    L81:
        int r124 = Math.min(r83, r76);
        if (r124 == Integer.MAX_VALUE) goto L89;
        if (r124 != this.f367d) goto L97;
        if (r76 != Integer.MAX_VALUE) goto L97;
        if (r83 == Integer.MAX_VALUE) goto L89;
    L97:
        if (r124 == r83) goto L98;
        m285g(r124 - this.f371h);
        goto L63
    L98:
        m286h((AbstractC0048y) r4.get(r35));
        r35 = r35 + 1;
    L89:
        r11.m496p(0);
        if (this.f373j == null) goto L92;
    L93:
        m281a(1, "end sequence");
    L95:
        return r11.m493m();
    L92:
        if (this.f374k == null) goto L95;
    L80:
        r83 = Integer.MAX_VALUE;
        goto L81
    L77:
        r76 = Integer.MAX_VALUE;
        goto L78
    L59:
        if (this.f374k == null) goto L61;
    L17:
        if (this.f374k != null) goto L20;
        r82 = false;
        goto L21
    L100:
        r62.m192F();
        throw null;
    L5:
        r3 = r2.m504B();
        goto L6
    }

    /* JADX INFO: renamed from: f */
    private void m284f(int r4) {
        C0202d r0 = this.f366c;
        int r1 = r0.m491j();
        r0.m496p(2);
        r0.m499s(r4);
        this.f372i += r4;
        if (this.f373j == null) goto L5;
    L6:
        m281a(r0.m491j() - r1, String.format("line = %d", new Object[]{Integer.valueOf(this.f372i)}));
        return;
    L5:
        if (this.f374k != null) goto L6;
    }

    /* JADX INFO: renamed from: g */
    private void m285g(int r4) {
        C0202d r0 = this.f366c;
        int r1 = r0.m491j();
        r0.m496p(1);
        r0.m500t(r4);
        this.f371h += r4;
        if (this.f373j == null) goto L5;
    L6:
        m281a(r0.m491j() - r1, String.format("%04x: advance pc", new Object[]{Integer.valueOf(this.f371h)}));
        return;
    L5:
        if (this.f374k != null) goto L6;
    }

    /* JADX INFO: renamed from: h */
    private void m286h(AbstractC0048y r5) {
        int r0 = r5.m214b().m423a();
        int r52 = r5.m213a();
        int r02 = r0 - this.f372i;
        int r53 = r52 - this.f371h;
        if (r53 < 0) goto L23;
        int r2 = 0;
        if (r02 >= (-4)) goto L7;
    L8:
        m284f(r02);
        r02 = 0;
    L9:
        int r1 = m282b(r02, r53);
        if ((r1 & (-256)) <= 0) goto L15;
        m285g(r53);
        r1 = m282b(r02, 0);
        if ((r1 & (-256)) <= 0) goto L14;
        m284f(r02);
        r1 = m282b(0, 0);
        r53 = 0;
    L16:
        this.f366c.m496p(r1);
        this.f372i += r2;
        int r03 = this.f371h + r53;
        this.f371h = r03;
        if (this.f373j == null) goto L19;
    L20:
        m281a(1, String.format("%04x: line %d", new Object[]{Integer.valueOf(r03), Integer.valueOf(this.f372i)}));
        return;
    L19:
        if (this.f374k != null) goto L20;
        return;
    L14:
        r53 = 0;
    L15:
        r2 = r02;
        goto L16
    L7:
        if (r02 <= 10) goto L9;
    L23:
        throw new RuntimeException("Position entries must be in ascending address order");
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m287c() {
        return m283d();
    L4:
        e = move-exception;
        throw DexGenerationException.m22b("...while encoding debug info", e);
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m288e(String r1, C0202d r2, boolean r3) {
        this.f375l = r1;
        this.f374k = null;
        this.f373j = r2;
        this.f376m = r3;
        return m287c();
    }
}
