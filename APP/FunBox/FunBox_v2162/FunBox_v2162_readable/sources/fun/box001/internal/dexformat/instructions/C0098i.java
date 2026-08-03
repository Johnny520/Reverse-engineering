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
import java.io.IOException;
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

    /* JADX INFO: renamed from: d */
    private final int f367d;

    /* JADX INFO: renamed from: e */
    private final int f368e;

    /* JADX INFO: renamed from: f */
    private final C0193a f369f;

    /* JADX INFO: renamed from: g */
    private final boolean f370g;

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

    /* JADX INFO: renamed from: h */
    private int f371h = 0;

    /* JADX INFO: renamed from: i */
    private int f372i = 1;

    /* JADX INFO: renamed from: c */
    private final C0202d f366c = new C0202d();

    public C0098i(C0049z c0049z, C0043t c0043t, C0100k c0100k, int i2, int i3, boolean z, C0187q c0187q) {
        this.f364a = c0049z;
        this.f365b = c0043t;
        this.f369f = c0187q.m431j();
        this.f370g = z;
        this.f367d = i2;
        this.f368e = i3;
        this.f377n = new AbstractC0041r[i3];
    }

    /* JADX INFO: renamed from: a */
    private void m281a(int i2, String str) {
        if (this.f375l != null) {
            str = this.f375l + str;
        }
        InterfaceC0199a interfaceC0199a = this.f373j;
        if (interfaceC0199a != null) {
            if (!this.f376m) {
                i2 = 0;
            }
            ((C0202d) interfaceC0199a).m484b(i2, str);
        }
        PrintWriter printWriter = this.f374k;
        if (printWriter != null) {
            printWriter.println(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m282b(int i2, int i3) {
        if (i2 < -4 || i2 > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return (i3 * 15) + (i2 - (-4)) + 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private byte[] m283d() {
        int i2;
        int i3 = 0;
        C0049z c0049z = this.f364a;
        int iM504B = c0049z == null ? 0 : c0049z.m504B();
        ArrayList arrayList = new ArrayList(iM504B);
        for (int i4 = 0; i4 < iM504B; i4++) {
            arrayList.add(c0049z.m510m(i4));
        }
        Collections.sort(arrayList, new C0097h(0));
        C0193a c0193a = this.f369f;
        ArrayList arrayList2 = new ArrayList(c0193a.m457d().m504B());
        C0194b c0194bM457d = c0193a.m457d();
        int iM504B2 = c0194bM457d.m504B();
        int iM469f = 0;
        for (int i5 = 0; i5 < iM504B2; i5++) {
            iM469f += c0194bM457d.m515r(i5).m469f();
        }
        int i6 = this.f368e;
        boolean z = this.f370g;
        new BitSet(i6 - ((i6 - iM469f) - (!z ? 1 : 0)));
        C0043t c0043t = this.f365b;
        if (c0043t.m504B() > 0) {
            c0043t.m192F();
            throw null;
        }
        Collections.sort(arrayList2, new C0097h(1));
        Object[] objArr = (this.f373j == null && this.f374k == null) ? false : true;
        C0202d c0202d = this.f366c;
        int iM491j = c0202d.m491j();
        if (arrayList.size() > 0) {
            ((AbstractC0048y) arrayList.get(0)).m214b().getClass();
            this.f372i = -1;
        }
        c0202d.m500t(this.f372i);
        if (objArr != false) {
            m281a(c0202d.m491j() - iM491j, "line_start: " + this.f372i);
        }
        C0194b c0194bM457d2 = c0193a.m457d();
        int iM504B3 = c0194bM457d2.m504B();
        int iM469f2 = 0;
        for (int i7 = 0; i7 < iM504B3; i7++) {
            iM469f2 = c0194bM457d2.m515r(i7).m469f() + iM469f2;
        }
        int iM469f3 = (i6 - iM469f2) - (!z ? 1 : 0);
        C0194b c0194bM457d3 = c0193a.m457d();
        int iM504B4 = c0194bM457d3.m504B();
        if (!z) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                ((AbstractC0041r) it.next()).getClass();
                throw null;
            }
            iM469f3++;
        }
        int iM491j2 = c0202d.m491j();
        c0202d.m500t(iM504B4);
        if (objArr != false) {
            m281a(c0202d.m491j() - iM491j2, String.format("parameters_size: %04x", Integer.valueOf(iM504B4)));
        }
        int i8 = 0;
        while (i8 < iM504B4) {
            C0195c c0195cR = c0194bM457d3.m515r(i8);
            int iM491j3 = c0202d.m491j();
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                ((AbstractC0041r) it2.next()).getClass();
                throw null;
            }
            c0202d.m500t(i3);
            if (objArr != false) {
                m281a(c0202d.m491j() - iM491j3, "parameter <unnamed> v" + iM469f3);
            }
            iM469f3 += c0195cR.m469f();
            i8++;
            i3 = 0;
        }
        for (AbstractC0041r abstractC0041r : this.f377n) {
            if (abstractC0041r != null) {
                throw null;
            }
        }
        c0202d.m496p(7);
        if (this.f373j != null || this.f374k != null) {
            m281a(1, String.format("%04x: prologue end", Integer.valueOf(this.f371h)));
        }
        int size = arrayList.size();
        int iM504B5 = c0043t.m504B();
        int i9 = 0;
        while (true) {
            if (c0043t.m504B() > 0) {
                c0043t.m192F();
                if (this.f371h == 0) {
                    c0043t.m192F();
                    throw null;
                }
            }
            int size2 = arrayList.size();
            while (i9 < size2 && ((AbstractC0048y) arrayList.get(i9)).m213a() == this.f371h) {
                m286h((AbstractC0048y) arrayList.get(i9));
                i9++;
            }
            if (iM504B5 > 0) {
                c0043t.m192F();
                i2 = 0;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            int iM213a = i9 < size ? ((AbstractC0048y) arrayList.get(i9)).m213a() : Integer.MAX_VALUE;
            int iMin = Math.min(iM213a, i2);
            if (iMin == Integer.MAX_VALUE || (iMin == this.f367d && i2 == Integer.MAX_VALUE && iM213a == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == iM213a) {
                m286h((AbstractC0048y) arrayList.get(i9));
                i9++;
            } else {
                m285g(iMin - this.f371h);
            }
        }
        c0202d.m496p(0);
        if (this.f373j != null || this.f374k != null) {
            m281a(1, "end sequence");
        }
        return c0202d.m493m();
    }

    /* JADX INFO: renamed from: f */
    private void m284f(int i2) {
        C0202d c0202d = this.f366c;
        int iM491j = c0202d.m491j();
        c0202d.m496p(2);
        c0202d.m499s(i2);
        this.f372i += i2;
        if (this.f373j == null && this.f374k == null) {
            return;
        }
        m281a(c0202d.m491j() - iM491j, String.format("line = %d", Integer.valueOf(this.f372i)));
    }

    /* JADX INFO: renamed from: g */
    private void m285g(int i2) {
        C0202d c0202d = this.f366c;
        int iM491j = c0202d.m491j();
        c0202d.m496p(1);
        c0202d.m500t(i2);
        this.f371h += i2;
        if (this.f373j == null && this.f374k == null) {
            return;
        }
        m281a(c0202d.m491j() - iM491j, String.format("%04x: advance pc", Integer.valueOf(this.f371h)));
    }

    /* JADX INFO: renamed from: h */
    private void m286h(AbstractC0048y abstractC0048y) {
        int iM423a = abstractC0048y.m214b().m423a();
        int iM213a = abstractC0048y.m213a();
        int i2 = iM423a - this.f372i;
        int i3 = iM213a - this.f371h;
        if (i3 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        int i4 = 0;
        if (i2 < -4 || i2 > 10) {
            m284f(i2);
            i2 = 0;
        }
        int iM282b = m282b(i2, i3);
        if ((iM282b & (-256)) > 0) {
            m285g(i3);
            iM282b = m282b(i2, 0);
            if ((iM282b & (-256)) > 0) {
                m284f(i2);
                iM282b = m282b(0, 0);
                i3 = 0;
            } else {
                i3 = 0;
                i4 = i2;
            }
        } else {
            i4 = i2;
        }
        this.f366c.m496p(iM282b);
        this.f372i += i4;
        int i5 = this.f371h + i3;
        this.f371h = i5;
        if (this.f373j == null && this.f374k == null) {
            return;
        }
        m281a(1, String.format("%04x: line %d", Integer.valueOf(i5), Integer.valueOf(this.f372i)));
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m287c() {
        try {
            return m283d();
        } catch (IOException e2) {
            throw DexGenerationException.m22b("...while encoding debug info", e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m288e(String str, C0202d c0202d, boolean z) {
        this.f375l = str;
        this.f374k = null;
        this.f373j = c0202d;
        this.f376m = z;
        return m287c();
    }
}
