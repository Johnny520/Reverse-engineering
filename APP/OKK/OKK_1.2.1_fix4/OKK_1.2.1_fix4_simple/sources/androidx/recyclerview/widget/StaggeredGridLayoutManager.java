package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p000A.C0002c;
import p001A0.RunnableC0019E;
import p008E.C0155i;
import p008E.C0156j;
import p037U.AbstractC0343C;
import p037U.AbstractC0355O;
import p037U.AbstractC0358S;
import p037U.C0344D;
import p037U.C0349I;
import p037U.C0352L;
import p037U.C0359T;
import p037U.C0361V;
import p037U.C0362W;
import p037U.C0380p;
import p037U.C0381q;
import p037U.C0385u;
import p089x0.C1121e;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0343C {

    /* JADX INFO: renamed from: k */
    public final int f1598k;

    /* JADX INFO: renamed from: l */
    public final C0362W[] f1599l;

    /* JADX INFO: renamed from: m */
    public final C0385u f1600m;

    /* JADX INFO: renamed from: n */
    public final C0385u f1601n;

    /* JADX INFO: renamed from: o */
    public final int f1602o;

    /* JADX INFO: renamed from: p */
    public final C0380p f1603p;

    /* JADX INFO: renamed from: q */
    public final boolean f1604q;

    /* JADX INFO: renamed from: r */
    public boolean f1605r;

    /* JADX INFO: renamed from: s */
    public final BitSet f1606s;

    /* JADX INFO: renamed from: t */
    public final C0002c f1607t;

    /* JADX INFO: renamed from: u */
    public final int f1608u;

    /* JADX INFO: renamed from: v */
    public boolean f1609v;

    /* JADX INFO: renamed from: w */
    public C0361V f1610w;

    /* JADX INFO: renamed from: x */
    public final Rect f1611x;

    /* JADX INFO: renamed from: y */
    public final boolean f1612y;

    /* JADX INFO: renamed from: z */
    public final RunnableC0019E f1613z;

    public StaggeredGridLayoutManager(Context r7, AttributeSet r8, int r9, int r10) {
        this.f1598k = -1;
        this.f1604q = false;
        this.f1605r = false;
        C0002c r2 = new C0002c(3);
        this.f1607t = r2;
        this.f1608u = 2;
        this.f1611x = new Rect();
        new C1121e(this);
        this.f1612y = true;
        this.f1613z = new RunnableC0019E(5, this);
        C0381q r72 = AbstractC0343C.m766E(r7, r8, r9, r10);
        int r82 = r72.f850b;
        if (r82 == 0) goto L8;
        if (r82 == 1) goto L8;
        throw new IllegalArgumentException("invalid orientation.");
    L8:
        mo797b(null);
        if (r82 == this.f1602o) goto L12;
        this.f1602o = r82;
        C0385u r83 = this.f1600m;
        this.f1600m = this.f1601n;
        this.f1601n = r83;
        m793Y();
    L12:
        int r84 = r72.f851c;
        mo797b(null);
        if (r84 == this.f1598k) goto L22;
        int[] r102 = (int[]) r2.f7b;
        if (r102 == null) goto L17;
        Arrays.fill(r102, -1);
    L17:
        r2.f8c = null;
        m793Y();
        this.f1598k = r84;
        this.f1606s = new BitSet(this.f1598k);
        this.f1599l = new C0362W[this.f1598k];
        int r85 = 0;
    L19:
        if (r85 >= this.f1598k) goto L21;
        this.f1599l[r85] = new C0362W(this, r85);
        r85 = r85 + 1;
        goto L19
    L21:
        m793Y();
    L22:
        boolean r73 = r72.f852d;
        mo797b(null);
        C0361V r86 = this.f1610w;
        if (r86 != null) goto L25;
    L27:
        this.f1604q = r73;
        m793Y();
        C0380p r74 = new C0380p();
        r74.f840a = true;
        r74.f845f = 0;
        r74.f846g = 0;
        this.f1603p = r74;
        this.f1600m = C0385u.m963a(this, this.f1602o);
        this.f1601n = C0385u.m963a(this, 1 - this.f1602o);
        return;
    L25:
        if (r86.f758h == r73) goto L27;
        r86.f758h = r73;
        goto L27
    }

    /* JADX INFO: renamed from: y0 */
    public static int m1334y0(int r2, int r3, int r4) {
        if (r3 != 0) goto L5;
        if (r4 != 0) goto L5;
        return r2;
    L5:
        int r02 = View.MeasureSpec.getMode(r2);
        if (r02 == Integer.MIN_VALUE) goto L12;
        if (r02 == 1073741824) goto L12;
        return r2;
    L12:
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(r2) - r3) - r4), r02);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: F */
    public final int mo775F(C0349I r2, C0352L r3) {
        if (this.f1602o != 0) goto L7;
        return this.f1598k;
    L7:
        return super.mo775F(r2, r3);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: H */
    public final boolean mo777H() {
        if (this.f1608u == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: K */
    public final void mo779K(RecyclerView r3) {
        RecyclerView r02 = this.f668b;
        if (r02 == null) goto L5;
        r02.removeCallbacks(this.f1613z);
    L5:
        int r03 = 0;
    L7:
        if (r03 >= this.f1598k) goto L9;
        this.f1599l[r03].m928b();
        r03 = r03 + 1;
        goto L7
    L9:
        r3.requestLayout();
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: L */
    public final View mo780L(View r9, int r10, C0349I r11, C0352L r12) {
        if (m813r() != 0) goto L5;
        return null;
    L5:
        RecyclerView r02 = this.f668b;
        if (r02 != null) goto L8;
    L7:
        View r92 = null;
    L14:
        if (r92 != null) goto L16;
        return null;
    L16:
        m1353u0();
        if (r10 == 1) goto L48;
        if (r10 == 2) goto L42;
        if (r10 == 17) goto L39;
        if (r10 == 33) goto L36;
        if (r10 == 66) goto L33;
        if (r10 == 130) goto L30;
    L28:
        int r102 = Integer.MIN_VALUE;
    L53:
        if (r102 != Integer.MIN_VALUE) goto L55;
        return null;
    L55:
        C0359T r3 = (C0359T) r92.getLayoutParams();
        r3.getClass();
        C0362W r32 = r3.f746d;
        if (r102 != 1) goto L58;
        int r4 = m1343k0();
    L59:
        m1355w0(r4, r12);
        m1354v0(r102);
        C0380p r5 = this.f1603p;
        r5.f842c = r5.f843d + r4;
        r5.f841b = (int) (this.f1600m.m974l() * 0.33333334f);
        r5.f847h = true;
        int r6 = 0;
        r5.f840a = false;
        m1339g0(r11, r5, r12);
        this.f1609v = this.f1605r;
        View r112 = r32.m933g(r4, r102);
        if (r112 == null) goto L64;
        if (r112 == r92) goto L64;
        return r112;
    L64:
        if (m1349q0(r102) == false) goto L72;
        int r113 = this.f1598k - 1;
    L66:
        if (r113 < 0) goto L80;
        View r122 = this.f1599l[r113].m933g(r4, r102);
        if (r122 == null) goto L71;
        if (r122 == r92) goto L71;
        return r122;
    L71:
        r113 = r113 - 1;
    L80:
        boolean r114 = !this.f1604q;
        if (r102 != (-1)) goto L83;
        boolean r123 = true;
    L84:
        if (r114 != r123) goto L86;
        boolean r115 = true;
    L87:
        if (r115 == false) goto L89;
        int r124 = r32.m929c();
    L90:
        View r125 = mo808m(r124);
        if (r125 == null) goto L95;
        if (r125 == r92) goto L95;
        return r125;
    L95:
        if (m1349q0(r102) == false) goto L110;
        int r103 = this.f1598k - 1;
    L97:
        if (r103 < 0) goto L119;
        if (r103 == r32.f765e) goto L108;
        if (r115 == false) goto L103;
        int r126 = this.f1599l[r103].m929c();
    L104:
        View r127 = mo808m(r126);
        if (r127 == null) goto L108;
        if (r127 == r92) goto L108;
        return r127;
    L103:
        r126 = this.f1599l[r103].m930d();
    L108:
        r103 = r103 - 1;
    L119:
        return null;
    L110:
        if (r6 >= this.f1598k) goto L119;
        if (r115 == false) goto L113;
        int r104 = this.f1599l[r6].m929c();
    L114:
        View r105 = mo808m(r104);
        if (r105 == null) goto L118;
        if (r105 == r92) goto L118;
        return r105;
    L118:
        r6 = r6 + 1;
        goto L110
    L113:
        r104 = this.f1599l[r6].m930d();
        goto L114
    L89:
        r124 = r32.m930d();
        goto L90
    L86:
        r115 = false;
        goto L87
    L83:
        r123 = false;
        goto L84
    L72:
        int r116 = 0;
    L74:
        if (r116 >= this.f1598k) goto L80;
        View r128 = this.f1599l[r116].m933g(r4, r102);
        if (r128 == null) goto L79;
        if (r128 == r92) goto L79;
        return r128;
    L79:
        r116 = r116 + 1;
        goto L74
    L58:
        r4 = m1342j0();
        goto L59
    L30:
        if (this.f1602o != 1) goto L28;
    L43:
        r102 = 1;
        goto L53
    L33:
        if (this.f1602o != 0) goto L28;
    L36:
        if (this.f1602o != 1) goto L28;
    L46:
        r102 = -1;
        goto L53
    L39:
        if (this.f1602o != 0) goto L28;
    L42:
        if (this.f1602o == 1) goto L43;
        if (m1347o0() == false) goto L43;
    L48:
        if (this.f1602o == 1) goto L46;
        if (m1347o0() == false) goto L46;
    L8:
        r92 = r02.m1325q(r9);
        if (r92 == null) goto L7;
        if (this.f667a.m654q(r92) == false) goto L14;
        goto L14
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: M */
    public final void mo781M(AccessibilityEvent r3) {
        super.mo781M(r3);
        if (m813r() <= 0) goto L13;
        View r1 = m1341i0(false);
        View r02 = m1340h0(false);
        if (r1 == null) goto L14;
        if (r02 == null) goto L16;
        int r12 = AbstractC0343C.m765D(r1);
        int r03 = AbstractC0343C.m765D(r02);
        if (r12 >= r03) goto L11;
        r3.setFromIndex(r12);
        r3.setToIndex(r03);
        return;
    L11:
        r3.setFromIndex(r03);
        r3.setToIndex(r12);
        return;
    L16:
        return;
    L14:
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: N */
    public final void mo782N(C0349I r3, C0352L r4, View r5, C0156j r6) {
        ViewGroup.LayoutParams r32 = r5.getLayoutParams();
        if ((r32 instanceof C0359T) == true) goto L6;
        m783O(r5, r6);
        return;
    L6:
        C0359T r33 = (C0359T) r32;
        if (this.f1602o != 0) goto L13;
        C0362W r34 = r33.f746d;
        if (r34 != null) goto L11;
        int r35 = -1;
    L12:
        r6.m511h(C0155i.m503a(false, r35, 1, -1, -1));
        return;
    L11:
        r35 = r34.f765e;
        goto L12
    L13:
        C0362W r36 = r33.f746d;
        if (r36 != null) goto L16;
        int r37 = -1;
    L17:
        r6.m511h(C0155i.m503a(false, -1, -1, r37, 1));
        return;
    L16:
        r37 = r36.f765e;
        goto L17
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: P */
    public final void mo784P(Parcelable r2) {
        if ((r2 instanceof C0361V) == false) goto L6;
        this.f1610w = (C0361V) r2;
        m793Y();
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: Q */
    public final Parcelable mo785Q() {
        C0361V r02 = this.f1610w;
        if (r02 == null) goto L6;
        C0361V r1 = new C0361V();
        r1.f753c = r02.f753c;
        r1.f751a = r02.f751a;
        r1.f752b = r02.f752b;
        r1.f754d = r02.f754d;
        r1.f755e = r02.f755e;
        r1.f756f = r02.f756f;
        r1.f758h = r02.f758h;
        r1.f759i = r02.f759i;
        r1.f760j = r02.f760j;
        r1.f757g = r02.f757g;
        return r1;
    L6:
        C0361V r03 = new C0361V();
        r03.f758h = this.f1604q;
        r03.f759i = this.f1609v;
        r03.f760j = false;
        C0002c r12 = this.f1607t;
        int r2 = 0;
        if (r12 == null) goto L11;
        int[] r3 = (int[]) r12.f7b;
        if (r3 == null) goto L11;
        r03.f756f = r3;
        r03.f755e = r3.length;
        r03.f757g = (List) r12.f8c;
    L12:
        int r32 = -1;
        if (m813r() > 0) goto L15;
        r03.f751a = -1;
        r03.f752b = -1;
        r03.f753c = 0;
    L39:
        return r03;
    L15:
        if (this.f1609v == false) goto L17;
        int r13 = m1343k0();
    L18:
        r03.f751a = r13;
        if (this.f1605r == false) goto L21;
        View r14 = m1340h0(true);
    L22:
        if (r14 == null) goto L25;
        r32 = AbstractC0343C.m765D(r14);
    L25:
        r03.f752b = r32;
        int r15 = this.f1598k;
        r03.f753c = r15;
        r03.f754d = new int[r15];
    L27:
        if (r2 >= this.f1598k) goto L39;
        if (this.f1609v == false) goto L34;
        int r16 = this.f1599l[r2].m932f(Integer.MIN_VALUE);
        if (r16 == Integer.MIN_VALUE) goto L37;
        int r33 = this.f1600m.m969g();
    L33:
        r16 = r16 - r33;
    L37:
        r03.f754d[r2] = r16;
        r2 = r2 + 1;
        goto L27
    L34:
        r16 = this.f1599l[r2].m934h(Integer.MIN_VALUE);
        if (r16 == Integer.MIN_VALUE) goto L37;
        r33 = this.f1600m.m973k();
        goto L33
    L21:
        r14 = m1341i0(true);
        goto L22
    L17:
        r13 = m1342j0();
    L11:
        r03.f755e = 0;
        goto L12
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: R */
    public final void mo786R(int r1) {
        if (r1 != 0) goto L5;
        m1335c0();
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: b */
    public final void mo797b(String r2) {
        if (this.f1610w != null) goto L6;
        super.mo797b(r2);
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: c */
    public final boolean mo799c() {
        if (this.f1602o != 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m1335c0() {
        if (m813r() != 0) goto L5;
    L22:
        return false;
    L5:
        if (this.f1608u == 0) goto L22;
        if (this.f671e == false) goto L22;
        if (this.f1605r == false) goto L12;
        int r02 = m1343k0();
        m1342j0();
    L13:
        C0002c r2 = this.f1607t;
        if (r02 != 0) goto L22;
        if (m1346n0() == null) goto L22;
        int[] r03 = (int[]) r2.f7b;
        if (r03 == null) goto L20;
        Arrays.fill(r03, -1);
    L20:
        r2.f8c = null;
        m793Y();
        return true;
    L12:
        r02 = m1342j0();
        m1343k0();
        goto L13
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: d */
    public final boolean mo800d() {
        if (this.f1602o == 1) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m1336d0(C0352L r7) {
        if (m813r() != 0) goto L6;
        return 0;
    L6:
        C0385u r1 = this.f1600m;
        boolean r02 = this.f1612y;
        return AbstractC0358S.m892j(r7, r1, m1341i0(!r02), m1340h0(!r02), this, this.f1612y);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: e */
    public final boolean mo801e(C0344D r1) {
        return r1 instanceof C0359T;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m1337e0(C0352L r8) {
        if (m813r() != 0) goto L6;
        return 0;
    L6:
        C0385u r1 = this.f1600m;
        boolean r02 = this.f1612y;
        return AbstractC0358S.m894k(r8, r1, m1341i0(!r02), m1340h0(!r02), this, this.f1612y, this.f1605r);
    }

    /* JADX INFO: renamed from: f0 */
    public final int m1338f0(C0352L r7) {
        if (m813r() != 0) goto L6;
        return 0;
    L6:
        C0385u r1 = this.f1600m;
        boolean r02 = this.f1612y;
        return AbstractC0358S.m895l(r7, r1, m1341i0(!r02), m1340h0(!r02), this, this.f1612y);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: g */
    public final int mo802g(C0352L r1) {
        return m1336d0(r1);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m1339g0(C0349I r8, C0380p r9, C0352L r10) {
        boolean r3 = true;
        this.f1606s.set(0, this.f1598k, true);
        C0380p r02 = this.f1603p;
        int r4 = Integer.MIN_VALUE;
        if (r02.f848i == false) goto L8;
        if (r9.f844e != 1) goto L11;
        r4 = Integer.MAX_VALUE;
    L11:
        int r1 = r9.f844e;
        int r5 = 0;
    L13:
        if (r5 >= this.f1598k) goto L20;
        if (this.f1599l[r5].f761a.isEmpty() == true) goto L18;
        m1356x0(this.f1599l[r5], r1, r4);
    L18:
        r5 = r5 + 1;
        goto L13
    L20:
        if (this.f1605r == false) goto L22;
        this.f1600m.m969g();
    L23:
        int r12 = r9.f842c;
        if (r12 >= 0) goto L26;
    L28:
        r3 = false;
    L30:
        if (r3 == true) goto L32;
    L38:
        m1350r0(r8, r02);
        if (r02.f844e != (-1)) goto L41;
        int r102 = this.f1600m.m973k() - m1345m0(this.f1600m.m973k());
    L42:
        if (r102 > 0) goto L44;
        return 0;
    L44:
        return Math.min(r9.f841b, r102);
    L41:
        r102 = m1344l0(this.f1600m.m969g()) - this.f1600m.m969g();
        goto L42
    L32:
        if (r02.f848i == false) goto L34;
    L36:
        AbstractC0355O r82 = r8.m829i(r9.f842c, Long.MAX_VALUE);
        r9.f842c += r9.f843d;
        r82.getClass();
        throw null;
    L34:
        if (this.f1606s.isEmpty() == false) goto L36;
    L26:
        if (r12 >= r10.m832a()) goto L28;
    L22:
        this.f1600m.m973k();
        goto L23
    L8:
        if (r9.f844e != 1) goto L10;
        r4 = r9.f841b + r9.f846g;
        goto L11
    L10:
        r4 = r9.f845f - r9.f841b;
        goto L11
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: h */
    public final int mo803h(C0352L r1) {
        return m1337e0(r1);
    }

    /* JADX INFO: renamed from: h0 */
    public final View m1340h0(boolean r8) {
        int r02 = this.f1600m.m973k();
        int r1 = this.f1600m.m969g();
        int r2 = m813r() - 1;
        View r3 = null;
    L3:
        if (r2 < 0) goto L15;
        View r4 = m812q(r2);
        int r5 = this.f1600m.m967e(r4);
        int r6 = this.f1600m.m964b(r4);
        if (r6 <= r02) goto L14;
        if (r5 >= r1) goto L14;
        if (r6 <= r1) goto L13;
        if (r8 == false) goto L13;
        if (r3 != null) goto L14;
        r3 = r4;
    L13:
        return r4;
    L14:
        r2 = r2 - 1;
        goto L3
    L15:
        return r3;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: i */
    public final int mo804i(C0352L r1) {
        return m1338f0(r1);
    }

    /* JADX INFO: renamed from: i0 */
    public final View m1341i0(boolean r9) {
        int r02 = this.f1600m.m973k();
        int r1 = this.f1600m.m969g();
        int r2 = m813r();
        View r3 = null;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L15;
        View r5 = m812q(r4);
        int r6 = this.f1600m.m967e(r5);
        if (this.f1600m.m964b(r5) <= r02) goto L14;
        if (r6 >= r1) goto L14;
        if (r6 >= r02) goto L13;
        if (r9 == false) goto L13;
        if (r3 != null) goto L14;
        r3 = r5;
    L13:
        return r5;
    L14:
        r4 = r4 + 1;
        goto L3
    L15:
        return r3;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: j */
    public final int mo805j(C0352L r1) {
        return m1336d0(r1);
    }

    /* JADX INFO: renamed from: j0 */
    public final int m1342j0() {
        if (m813r() != 0) goto L6;
        return 0;
    L6:
        return AbstractC0343C.m765D(m812q(0));
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: k */
    public final int mo806k(C0352L r1) {
        return m1337e0(r1);
    }

    /* JADX INFO: renamed from: k0 */
    public final int m1343k0() {
        int r02 = m813r();
        if (r02 != 0) goto L6;
        return 0;
    L6:
        return AbstractC0343C.m765D(m812q(r02 - 1));
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: l */
    public final int mo807l(C0352L r1) {
        return m1338f0(r1);
    }

    /* JADX INFO: renamed from: l0 */
    public final int m1344l0(int r4) {
        int r02 = this.f1599l[0].m932f(r4);
        int r1 = 1;
    L4:
        if (r1 >= this.f1598k) goto L9;
        int r2 = this.f1599l[r1].m932f(r4);
        if (r2 <= r02) goto L8;
        r02 = r2;
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r02;
    }

    /* JADX INFO: renamed from: m0 */
    public final int m1345m0(int r4) {
        int r02 = this.f1599l[0].m934h(r4);
        int r1 = 1;
    L4:
        if (r1 >= this.f1598k) goto L9;
        int r2 = this.f1599l[r1].m934h(r4);
        if (r2 >= r02) goto L8;
        r02 = r2;
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r02;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: n */
    public final C0344D mo809n() {
        if (this.f1602o != 0) goto L7;
        return new C0359T(-2, -1);
    L7:
        return new C0359T(-1, -2);
    }

    /* JADX INFO: renamed from: n0 */
    public final View m1346n0() {
        int r02 = m813r();
        int r1 = r02 - 1;
        BitSet r2 = new BitSet(this.f1598k);
        r2.set(0, this.f1598k, true);
        int r6 = -1;
        if (this.f1602o == 1) goto L5;
    L7:
        byte r3 = -1;
    L9:
        if (this.f1605r == false) goto L11;
        r02 = -1;
    L12:
        if (r1 >= r02) goto L14;
        r6 = 1;
    L14:
        if (r1 == r02) goto L57;
        View r7 = m812q(r1);
        C0359T r8 = (C0359T) r7.getLayoutParams();
        if (r2.get(r8.f746d.f765e) == false) goto L35;
        C0362W r9 = r8.f746d;
        if (this.f1605r == false) goto L26;
        int r10 = r9.f763c;
        if (r10 != Integer.MIN_VALUE) goto L24;
        r9.m927a();
        r10 = r9.f763c;
    L24:
        if (r10 < this.f1600m.m969g()) goto L25;
    L34:
        r2.clear(r8.f746d.f765e);
        goto L35
    L25:
        ArrayList r03 = r9.f761a;
        ((C0359T) ((View) r03.get(r03.size() - 1)).getLayoutParams()).getClass();
    L33:
        return r7;
    L26:
        int r102 = r9.f762b;
        if (r102 != Integer.MIN_VALUE) goto L31;
        View r103 = (View) r9.f761a.get(0);
        C0359T r11 = (C0359T) r103.getLayoutParams();
        r9.f762b = r9.f766f.f1600m.m967e(r103);
        r11.getClass();
        r102 = r9.f762b;
    L31:
        if (r102 <= this.f1600m.m973k()) goto L34;
        ((C0359T) ((View) r9.f761a.get(0)).getLayoutParams()).getClass();
    L35:
        r1 = r1 + r6;
        if (r1 == r02) goto L14;
        View r92 = m812q(r1);
        if (this.f1605r == true) goto L39;
        int r104 = this.f1600m.m967e(r7);
        int r112 = this.f1600m.m967e(r92);
        if (r104 > r112) goto L46;
        if (r104 != r112) goto L14;
    L49:
        if ((r8.f746d.f765e - ((C0359T) r92.getLayoutParams()).f746d.f765e) >= 0) goto L51;
        boolean r82 = true;
    L52:
        if (r3 >= 0) goto L54;
        boolean r93 = true;
    L55:
        if (r82 == r93) goto L14;
        return r7;
    L54:
        r93 = false;
        goto L55
    L51:
        r82 = false;
        goto L52
    L46:
        return r7;
    L39:
        int r105 = this.f1600m.m964b(r7);
        int r113 = this.f1600m.m964b(r92);
        if (r105 < r113) goto L41;
        if (r105 != r113) goto L14;
    L41:
        return r7;
    L57:
        return null;
    L11:
        r1 = 0;
        goto L12
    L5:
        if (m1347o0() == false) goto L7;
        r3 = 1;
        goto L9
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: o */
    public final C0344D mo810o(Context r2, AttributeSet r3) {
        return new C0359T(r2, r3);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m1347o0() {
        if (m817y() == 1) goto L7;
        return false;
    L7:
        return true;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: p */
    public final C0344D mo811p(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L7;
        return new C0359T((ViewGroup.MarginLayoutParams) r2);
    L7:
        return new C0359T(r2);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1348p0(View r6, int r7, int r8) {
        RecyclerView r02 = this.f668b;
        Rect r1 = this.f1611x;
        if (r02 != null) goto L5;
        r1.set(0, 0, 0, 0);
    L6:
        C0359T r03 = (C0359T) r6.getLayoutParams();
        int r72 = m1334y0(r7, ((ViewGroup.MarginLayoutParams) r03).leftMargin + r1.left, ((ViewGroup.MarginLayoutParams) r03).rightMargin + r1.right);
        int r82 = m1334y0(r8, ((ViewGroup.MarginLayoutParams) r03).topMargin + r1.top, ((ViewGroup.MarginLayoutParams) r03).bottomMargin + r1.bottom);
        if (m796a0(r6, r72, r82, r03) == false) goto L10;
        r6.measure(r72, r82);
        return;
    L10:
        return;
    L5:
        r1.set(r02.m1329v(r6));
        goto L6
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m1349q0(int r5) {
        if (this.f1602o != 0) goto L11;
        if (r5 != (-1)) goto L6;
        boolean r52 = true;
    L8:
        if (r52 != this.f1605r) goto L10;
        return false;
    L10:
        return true;
    L6:
        r52 = false;
        goto L8
    L11:
        if (r5 != (-1)) goto L13;
        boolean r53 = true;
    L15:
        if (r53 != this.f1605r) goto L17;
        boolean r54 = true;
    L19:
        if (r54 == m1347o0()) goto L21;
        return false;
    L21:
        return true;
    L17:
        r54 = false;
        goto L19
    L13:
        r53 = false;
        goto L15
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1350r0(C0349I r5, C0380p r6) {
        if (r6.f840a == true) goto L5;
        return;
    L5:
        if (r6.f848i == false) goto L8;
        return;
    L8:
        if (r6.f841b == 0) goto L10;
        int r3 = 1;
        if (r6.f844e != (-1)) goto L27;
        int r02 = r6.f845f;
        int r1 = this.f1599l[0].m934h(r02);
    L17:
        if (r3 >= this.f1598k) goto L22;
        int r2 = this.f1599l[r3].m934h(r02);
        if (r2 <= r1) goto L21;
        r1 = r2;
    L21:
        r3 = r3 + 1;
        goto L17
    L22:
        int r03 = r02 - r1;
        if (r03 >= 0) goto L25;
        int r62 = r6.f846g;
    L26:
        m1351s0(r5, r62);
        return;
    L25:
        r62 = r6.f846g - Math.min(r03, r6.f841b);
        goto L26
    L27:
        int r04 = r6.f846g;
        int r12 = this.f1599l[0].m932f(r04);
    L29:
        if (r3 >= this.f1598k) goto L34;
        int r22 = this.f1599l[r3].m932f(r04);
        if (r22 >= r12) goto L33;
        r12 = r22;
    L33:
        r3 = r3 + 1;
        goto L29
    L34:
        int r13 = r12 - r6.f846g;
        if (r13 >= 0) goto L37;
        int r63 = r6.f845f;
    L38:
        m1352t0(r5, r63);
        return;
    L37:
        int r05 = r6.f845f;
        r63 = Math.min(r13, r6.f841b) + r05;
        goto L38
    L10:
        if (r6.f844e != (-1)) goto L12;
        m1351s0(r5, r6.f846g);
        return;
    L12:
        m1352t0(r5, r6.f845f);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1351s0(C0349I r3, int r4) {
        int r32 = m813r() - 1;
        if (r32 < 0) goto L13;
        View r33 = m812q(r32);
        if (this.f1600m.m967e(r33) >= r4) goto L7;
        return;
    L7:
        if (this.f1600m.m976n(r33) < r4) goto L15;
        C0359T r34 = (C0359T) r33.getLayoutParams();
        r34.getClass();
        if (r34.f746d.f761a.size() != 1) goto L11;
        return;
    L11:
        C0359T r35 = (C0359T) ((View) r34.f746d.f761a.remove(r3.size() - 1)).getLayoutParams();
        r35.f746d = null;
        r35.getClass();
        throw null;
    L15:
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: t */
    public final int mo814t(C0349I r3, C0352L r4) {
        if (this.f1602o != 1) goto L7;
        return this.f1598k;
    L7:
        return super.mo814t(r3, r4);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1352t0(C0349I r3, int r4) {
        if (m813r() <= 0) goto L16;
        View r02 = m812q(0);
        if (this.f1600m.m964b(r02) <= r4) goto L7;
        return;
    L7:
        if (this.f1600m.m975m(r02) > r4) goto L18;
        C0359T r42 = (C0359T) r02.getLayoutParams();
        r42.getClass();
        if (r42.f746d.f761a.size() != 1) goto L11;
        return;
    L11:
        C0362W r43 = r42.f746d;
        ArrayList r03 = r43.f761a;
        C0359T r32 = (C0359T) ((View) r03.remove(0)).getLayoutParams();
        r32.f746d = null;
        if (r03.size() != 0) goto L14;
        r43.f763c = Integer.MIN_VALUE;
    L14:
        r32.getClass();
        throw null;
    L18:
        return;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1353u0() {
        if (this.f1602o != 1) goto L5;
    L8:
        this.f1605r = this.f1604q;
        return;
    L5:
        if (m1347o0() == false) goto L8;
        this.f1605r = !this.f1604q;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m1354v0(int r5) {
        C0380p r02 = this.f1603p;
        r02.f844e = r5;
        boolean r1 = this.f1605r;
        int r2 = 1;
        if (r5 != (-1)) goto L5;
        boolean r52 = true;
    L6:
        if (r1 == r52) goto L9;
        r2 = -1;
    L9:
        r02.f843d = r2;
        return;
    L5:
        r52 = false;
        goto L6
    }

    /* JADX INFO: renamed from: w0 */
    public final void m1355w0(int r3, C0352L r4) {
        C0380p r42 = this.f1603p;
        boolean r02 = false;
        r42.f841b = 0;
        r42.f842c = r3;
        RecyclerView r1 = this.f668b;
        if (r1 != null) goto L5;
    L7:
        r42.f846g = this.f1600m.m968f() + 0;
        r42.f845f = -0;
    L8:
        r42.f847h = false;
        r42.f840a = true;
        if (this.f1600m.m971i() == 0) goto L11;
    L13:
        r42.f848i = r02;
        return;
    L11:
        if (this.f1600m.m968f() != 0) goto L13;
        r02 = true;
        goto L13
    L5:
        if (r1.f1572f == false) goto L7;
        r42.f845f = this.f1600m.m973k() - 0;
        r42.f846g = this.f1600m.m969g() + 0;
        goto L8
    }

    /* JADX INFO: renamed from: x0 */
    public final void m1356x0(C0362W r6, int r7, int r8) {
        int r02 = r6.f764d;
        int r4 = r6.f765e;
        if (r7 != (-1)) goto L11;
        int r72 = r6.f762b;
        if (r72 != Integer.MIN_VALUE) goto L9;
        View r73 = (View) r6.f761a.get(0);
        C0359T r1 = (C0359T) r73.getLayoutParams();
        r6.f762b = r6.f766f.f1600m.m967e(r73);
        r1.getClass();
        r72 = r6.f762b;
    L9:
        if ((r72 + r02) > r8) goto L19;
        this.f1606s.set(r4, false);
        return;
    L19:
        return;
    L11:
        int r74 = r6.f763c;
        if (r74 != Integer.MIN_VALUE) goto L16;
        r6.m927a();
        r74 = r6.f763c;
    L16:
        if ((r74 - r02) < r8) goto L21;
        this.f1606s.set(r4, false);
        return;
    }
}
