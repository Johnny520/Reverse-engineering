package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p034S.AbstractC0324d;
import p037U.AbstractC0343C;
import p037U.AbstractC0358S;
import p037U.C0344D;
import p037U.C0349I;
import p037U.C0352L;
import p037U.C0381q;
import p037U.C0382r;
import p037U.C0383s;
import p037U.C0384t;
import p037U.C0385u;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0343C {

    /* JADX INFO: renamed from: k */
    public int f1525k;

    /* JADX INFO: renamed from: l */
    public C0383s f1526l;

    /* JADX INFO: renamed from: m */
    public C0385u f1527m;

    /* JADX INFO: renamed from: n */
    public final boolean f1528n;

    /* JADX INFO: renamed from: o */
    public boolean f1529o;

    /* JADX INFO: renamed from: p */
    public boolean f1530p;

    /* JADX INFO: renamed from: q */
    public final boolean f1531q;

    /* JADX INFO: renamed from: r */
    public C0384t f1532r;

    /* JADX INFO: renamed from: s */
    public final C0381q f1533s;

    /* JADX INFO: renamed from: t */
    public final C0382r f1534t;

    /* JADX INFO: renamed from: u */
    public final int[] f1535u;

    public LinearLayoutManager() {
        this.f1525k = 1;
        this.f1528n = false;
        this.f1529o = false;
        this.f1530p = false;
        this.f1531q = true;
        this.f1532r = null;
        this.f1533s = new C0381q(0);
        this.f1534t = new C0382r();
        this.f1535u = new int[2];
        m1295v0(1);
        mo797b(null);
        if (this.f1528n == false) goto L7;
        this.f1528n = false;
        m793Y();
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: H */
    public final boolean mo777H() {
        return true;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: K */
    public final void mo779K(RecyclerView r1) {
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: L */
    public View mo780L(View r4, int r5, C0349I r6, C0352L r7) {
        m1294u0();
        if (m813r() != 0) goto L5;
        return null;
    L5:
        int r42 = m1281g0(r5);
        if (r42 != Integer.MIN_VALUE) goto L8;
        return null;
    L8:
        m1282h0();
        m1296x0(r42, (int) (this.f1527m.m974l() * 0.33333334f), false, r7);
        C0383s r1 = this.f1526l;
        r1.f864g = Integer.MIN_VALUE;
        r1.f858a = false;
        m1283i0(r6, r1, r7, true);
        if (r42 != (-1)) goto L15;
        if (this.f1529o == false) goto L13;
        View r52 = m1287m0(m813r() - 1, -1);
    L18:
        if (r42 != (-1)) goto L20;
        View r43 = m1290p0();
    L22:
        if (r43.hasFocusable() == false) goto L26;
        if (r52 != null) goto L25;
        return null;
    L25:
        return r43;
    L26:
        return r52;
    L20:
        r43 = m1289o0();
        goto L22
    L13:
        r52 = m1287m0(0, m813r());
        goto L18
    L15:
        if (this.f1529o == false) goto L17;
        r52 = m1287m0(0, m813r());
        goto L18
    L17:
        r52 = m1287m0(m813r() - 1, -1);
        goto L18
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: M */
    public final void mo781M(AccessibilityEvent r3) {
        super.mo781M(r3);
        if (m813r() <= 0) goto L10;
        View r02 = m1288n0(0, m813r(), false);
        if (r02 != null) goto L7;
        int r03 = -1;
    L8:
        r3.setFromIndex(r03);
        r3.setToIndex(m1286l0());
        return;
    L7:
        r03 = AbstractC0343C.m765D(r02);
        goto L8
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: P */
    public final void mo784P(Parcelable r2) {
        if ((r2 instanceof C0384t) == false) goto L6;
        this.f1532r = (C0384t) r2;
        m793Y();
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: Q */
    public final Parcelable mo785Q() {
        C0384t r02 = this.f1532r;
        if (r02 == null) goto L6;
        C0384t r1 = new C0384t();
        r1.f869a = r02.f869a;
        r1.f870b = r02.f870b;
        r1.f871c = r02.f871c;
        return r1;
    L6:
        C0384t r03 = new C0384t();
        if (m813r() <= 0) goto L12;
        m1282h0();
        boolean r12 = false ^ this.f1529o;
        r03.f871c = r12;
        if (r12 == false) goto L11;
        View r13 = m1289o0();
        r03.f870b = this.f1527m.m969g() - this.f1527m.m964b(r13);
        r03.f869a = AbstractC0343C.m765D(r13);
    L13:
        return r03;
    L11:
        View r14 = m1290p0();
        r03.f869a = AbstractC0343C.m765D(r14);
        r03.f870b = this.f1527m.m967e(r14) - this.f1527m.m973k();
        goto L13
    L12:
        r03.f869a = -1;
        goto L13
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: b */
    public final void mo797b(String r2) {
        if (this.f1532r != null) goto L6;
        super.mo797b(r2);
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: c */
    public final boolean mo799c() {
        if (this.f1525k != 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public void m1277c0(C0352L r4, int[] r5) {
        if (r4.f693a == (-1)) goto L5;
        int r42 = this.f1527m.m974l();
    L7:
        if (this.f1526l.f863f != (-1)) goto L9;
        int r02 = 0;
    L10:
        r5[0] = r42;
        r5[1] = r02;
        return;
    L9:
        r02 = r42;
        r42 = 0;
        goto L10
    L5:
        r42 = 0;
        goto L7
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: d */
    public final boolean mo800d() {
        if (this.f1525k == 1) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m1278d0(C0352L r7) {
        if (m813r() != 0) goto L6;
        return 0;
    L6:
        m1282h0();
        C0385u r1 = this.f1527m;
        boolean r02 = !this.f1531q;
        return AbstractC0358S.m892j(r7, r1, m1285k0(r02), m1284j0(r02), this, this.f1531q);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m1279e0(C0352L r8) {
        if (m813r() != 0) goto L6;
        return 0;
    L6:
        m1282h0();
        C0385u r1 = this.f1527m;
        boolean r02 = !this.f1531q;
        return AbstractC0358S.m894k(r8, r1, m1285k0(r02), m1284j0(r02), this, this.f1531q, this.f1529o);
    }

    /* JADX INFO: renamed from: f0 */
    public final int m1280f0(C0352L r7) {
        if (m813r() != 0) goto L6;
        return 0;
    L6:
        m1282h0();
        C0385u r1 = this.f1527m;
        boolean r02 = !this.f1531q;
        return AbstractC0358S.m895l(r7, r1, m1285k0(r02), m1284j0(r02), this, this.f1531q);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: g */
    public final int mo802g(C0352L r1) {
        return m1278d0(r1);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m1281g0(int r5) {
        if (r5 == 1) goto L43;
        if (r5 == 2) goto L36;
        if (r5 == 17) goto L31;
        if (r5 == 33) goto L26;
        if (r5 == 66) goto L21;
        if (r5 == 130) goto L16;
        return Integer.MIN_VALUE;
    L16:
        if (this.f1525k != 1) goto L19;
        return 1;
    L19:
        return Integer.MIN_VALUE;
    L21:
        if (this.f1525k != 0) goto L24;
        return 1;
    L24:
        return Integer.MIN_VALUE;
    L26:
        if (this.f1525k != 1) goto L29;
        return -1;
    L29:
        return Integer.MIN_VALUE;
    L31:
        if (this.f1525k != 0) goto L34;
        return -1;
    L34:
        return Integer.MIN_VALUE;
    L36:
        if (this.f1525k != 1) goto L39;
        return 1;
    L39:
        if (m1291q0() == false) goto L41;
        return -1;
    L41:
        return 1;
    L43:
        if (this.f1525k != 1) goto L46;
        return -1;
    L46:
        if (m1291q0() == false) goto L48;
        return 1;
    L48:
        return -1;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: h */
    public int mo803h(C0352L r1) {
        return m1279e0(r1);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1282h0() {
        if (this.f1526l != null) goto L6;
        C0383s r02 = new C0383s();
        r02.f858a = true;
        r02.f865h = 0;
        r02.f866i = 0;
        r02.f867j = null;
        this.f1526l = r02;
        return;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: i */
    public int mo804i(C0352L r1) {
        return m1280f0(r1);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m1283i0(C0349I r8, C0383s r9, C0352L r10, boolean r11) {
        int r02 = r9.f860c;
        int r1 = r9.f864g;
        if (r1 == Integer.MIN_VALUE) goto L7;
        if (r02 >= 0) goto L6;
        r9.f864g = r1 + r02;
    L6:
        m1292s0(r8, r9);
    L7:
        int r12 = r9.f860c + r9.f865h;
    L9:
        if (r9.f868k == true) goto L11;
        if (r12 > 0) goto L11;
    L35:
        return r02 - r9.f860c;
    L11:
        int r3 = r9.f861d;
        if (r3 < 0) goto L35;
        if (r3 >= r10.m832a()) goto L35;
        C0382r r32 = this.f1534t;
        r32.f854a = 0;
        r32.f855b = false;
        r32.f856c = false;
        r32.f857d = false;
        mo1273r0(r8, r10, r9, r32);
        if (r32.f855b == true) goto L35;
        int r4 = r9.f859b;
        int r5 = r32.f854a;
        r9.f859b = (r9.f863f * r5) + r4;
        if (r32.f856c == true) goto L21;
    L24:
        r9.f860c -= r5;
        r12 = r12 - r5;
    L25:
        int r42 = r9.f864g;
        if (r42 == Integer.MIN_VALUE) goto L31;
        int r43 = r42 + r5;
        r9.f864g = r43;
        int r52 = r9.f860c;
        if (r52 >= 0) goto L30;
        r9.f864g = r43 + r52;
    L30:
        m1292s0(r8, r9);
    L31:
        if (r11 == false) goto L9;
        if (r32.f857d == false) goto L9;
    L21:
        if (r9.f867j != null) goto L24;
        if (r10.f698f == true) goto L25;
        goto L24
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: j */
    public final int mo805j(C0352L r1) {
        return m1278d0(r1);
    }

    /* JADX INFO: renamed from: j0 */
    public final View m1284j0(boolean r3) {
        if (this.f1529o == false) goto L7;
        return m1288n0(0, m813r(), r3);
    L7:
        return m1288n0(m813r() - 1, -1, r3);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: k */
    public int mo806k(C0352L r1) {
        return m1279e0(r1);
    }

    /* JADX INFO: renamed from: k0 */
    public final View m1285k0(boolean r3) {
        if (this.f1529o == false) goto L7;
        return m1288n0(m813r() - 1, -1, r3);
    L7:
        return m1288n0(0, m813r(), r3);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: l */
    public int mo807l(C0352L r1) {
        return m1280f0(r1);
    }

    /* JADX INFO: renamed from: l0 */
    public final int m1286l0() {
        View r02 = m1288n0(m813r() - 1, -1, false);
        if (r02 != null) goto L6;
        return -1;
    L6:
        return AbstractC0343C.m765D(r02);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: m */
    public final View mo808m(int r3) {
        int r02 = m813r();
        if (r02 != 0) goto L6;
        return null;
    L6:
        int r1 = r3 - AbstractC0343C.m765D(m812q(0));
        if (r1 < 0) goto L13;
        if (r1 >= r02) goto L13;
        View r03 = m812q(r1);
        if (AbstractC0343C.m765D(r03) != r3) goto L13;
        return r03;
    L13:
        return super.mo808m(r3);
    }

    /* JADX INFO: renamed from: m0 */
    public final View m1287m0(int r4, int r5) {
        m1282h0();
        if (r5 > r4) goto L7;
        if (r5 < r4) goto L7;
        return m812q(r4);
    L7:
        if (this.f1527m.m967e(m812q(r4)) >= this.f1527m.m973k()) goto L9;
        int r02 = 16644;
        int r1 = 16388;
    L11:
        if (this.f1525k != 0) goto L14;
        return this.f669c.m1b(r4, r5, r02, r1);
    L14:
        return this.f670d.m1b(r4, r5, r02, r1);
    L9:
        r02 = 4161;
        r1 = 4097;
        goto L11
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: n */
    public C0344D mo809n() {
        return new C0344D(-2, -2);
    }

    /* JADX INFO: renamed from: n0 */
    public final View m1288n0(int r3, int r4, boolean r5) {
        m1282h0();
        if (r5 == false) goto L5;
        int r52 = 24579;
    L7:
        if (this.f1525k != 0) goto L10;
        return this.f669c.m1b(r3, r4, r52, 320);
    L10:
        return this.f670d.m1b(r3, r4, r52, 320);
    L5:
        r52 = 320;
        goto L7
    }

    /* JADX INFO: renamed from: o0 */
    public final View m1289o0() {
        if (this.f1529o == false) goto L5;
        int r02 = 0;
    L7:
        return m812q(r02);
    L5:
        r02 = m813r() - 1;
        goto L7
    }

    /* JADX INFO: renamed from: p0 */
    public final View m1290p0() {
        if (this.f1529o == false) goto L5;
        int r02 = m813r() - 1;
    L7:
        return m812q(r02);
    L5:
        r02 = 0;
        goto L7
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m1291q0() {
        if (m817y() == 1) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo1273r0(C0349I r12, C0352L r13, C0383s r14, C0382r r15) {
        View r122 = r14.m962b(r12);
        if (r122 != null) goto L6;
        r15.f855b = true;
        return;
    L6:
        C0344D r02 = (C0344D) r122.getLayoutParams();
        if (r14.f867j != null) goto L15;
        boolean r1 = this.f1529o;
        if (r14.f863f != (-1)) goto L11;
        boolean r4 = true;
    L12:
        if (r1 != r4) goto L14;
        m795a(r122, -1, false);
    L22:
        C0344D r16 = (C0344D) r122.getLayoutParams();
        Rect r2 = this.f668b.m1329v(r122);
        int r42 = r2.left + r2.right;
        int r5 = r2.top + r2.bottom;
        int r22 = AbstractC0343C.m769s(mo799c(), this.f675i, this.f673g, (((m773B() + m772A()) + ((ViewGroup.MarginLayoutParams) r16).leftMargin) + ((ViewGroup.MarginLayoutParams) r16).rightMargin) + r42, ((ViewGroup.MarginLayoutParams) r16).width);
        int r43 = AbstractC0343C.m769s(mo800d(), this.f676j, this.f674h, (((m818z() + m774C()) + ((ViewGroup.MarginLayoutParams) r16).topMargin) + ((ViewGroup.MarginLayoutParams) r16).bottomMargin) + r5, ((ViewGroup.MarginLayoutParams) r16).height);
        if (m796a0(r122, r22, r43, r16) == false) goto L25;
        r122.measure(r22, r43);
    L25:
        r15.f854a = this.f1527m.m965c(r122);
        if (this.f1525k == 1) goto L28;
        int r132 = m774C();
        int r17 = this.f1527m.m966d(r122) + r132;
        if (r14.f863f != (-1)) goto L38;
        int r142 = r14.f859b;
        int r152 = r142 - r15.f854a;
        int r153 = r132;
        int r133 = r142;
        int r143 = r17;
        int r18 = r152;
    L39:
        C0344D r23 = (C0344D) r122.getLayoutParams();
        Rect r3 = r23.f677a;
        r122.layout((r18 + r3.left) + ((ViewGroup.MarginLayoutParams) r23).leftMargin, (r153 + r3.top) + ((ViewGroup.MarginLayoutParams) r23).topMargin, (r133 - r3.right) - ((ViewGroup.MarginLayoutParams) r23).rightMargin, (r143 - r3.bottom) - ((ViewGroup.MarginLayoutParams) r23).bottomMargin);
        r02.getClass();
        throw null;
    L38:
        int r144 = r14.f859b;
        int r154 = r15.f854a + r144;
        r153 = r132;
        r133 = r154;
        r18 = r144;
        r143 = r17;
        goto L39
    L28:
        if (m1291q0() == false) goto L30;
        r133 = this.f675i - m773B();
        r18 = r133 - this.f1527m.m966d(r122);
    L32:
        if (r14.f863f != (-1)) goto L34;
        r143 = r14.f859b;
        r153 = r143 - r15.f854a;
        goto L39
    L34:
        int r145 = r14.f859b;
        int r155 = r15.f854a + r145;
        r153 = r145;
        r143 = r155;
        goto L39
    L30:
        r18 = m772A();
        r133 = this.f1527m.m966d(r122) + r18;
        goto L32
    L14:
        m795a(r122, 0, false);
        goto L22
    L11:
        r4 = false;
        goto L12
    L15:
        boolean r19 = this.f1529o;
        if (r14.f863f != (-1)) goto L18;
        boolean r44 = true;
    L19:
        if (r19 != r44) goto L21;
        m795a(r122, -1, true);
        goto L22
    L21:
        m795a(r122, 0, true);
        goto L22
    L18:
        r44 = false;
        goto L19
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1292s0(C0349I r6, C0383s r7) {
        if (r7.f858a == true) goto L5;
        return;
    L5:
        if (r7.f868k == true) goto L71;
        int r02 = r7.f864g;
        int r1 = r7.f866i;
        if (r7.f863f != (-1)) goto L32;
        int r72 = m813r();
        if (r02 < 0) goto L72;
        int r2 = (this.f1527m.m968f() - r02) + r1;
        if (this.f1529o == false) goto L23;
        int r03 = 0;
    L15:
        if (r03 >= r72) goto L74;
        View r12 = m812q(r03);
        if (this.f1527m.m967e(r12) < r2) goto L22;
        if (this.f1527m.m976n(r12) < r2) goto L22;
        r03 = r03 + 1;
    L22:
        m1293t0(r6, 0, r03);
        return;
    L74:
        return;
    L23:
        int r73 = r72 - 1;
        int r04 = r73;
    L24:
        if (r04 < 0) goto L75;
        View r13 = m812q(r04);
        if (this.f1527m.m967e(r13) < r2) goto L31;
        if (this.f1527m.m976n(r13) < r2) goto L31;
        r04 = r04 - 1;
    L31:
        m1293t0(r6, r73, r04);
        return;
    L75:
        return;
    L72:
        return;
    L32:
        if (r02 < 0) goto L73;
        int r05 = r02 - r1;
        int r74 = m813r();
        if (this.f1529o == false) goto L45;
        int r75 = r74 - 1;
        int r14 = r75;
    L37:
        if (r14 < 0) goto L76;
        View r22 = m812q(r14);
        if (this.f1527m.m964b(r22) > r05) goto L44;
        if (this.f1527m.m975m(r22) > r05) goto L44;
        r14 = r14 - 1;
    L44:
        m1293t0(r6, r75, r14);
        return;
    L76:
        return;
    L45:
        int r15 = 0;
    L46:
        if (r15 >= r74) goto L77;
        View r23 = m812q(r15);
        if (this.f1527m.m964b(r23) > r05) goto L53;
        if (this.f1527m.m975m(r23) > r05) goto L53;
        r15 = r15 + 1;
    L53:
        m1293t0(r6, 0, r15);
        return;
    L77:
        return;
    L73:
        return;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1293t0(C0349I r2, int r3, int r4) {
        if (r3 != r4) goto L4;
        return;
    L4:
        if (r4 <= r3) goto L8;
        int r42 = r4 - 1;
    L6:
        if (r42 < r3) goto L10;
        View r02 = m812q(r42);
        m791W(r42);
        r2.m826f(r02);
        r42 = r42 - 1;
        goto L6
    L10:
        return;
    L8:
        if (r3 <= r4) goto L13;
        View r03 = m812q(r3);
        m791W(r3);
        r2.m826f(r03);
        r3 = r3 - 1;
        goto L8
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1294u0() {
        if (this.f1525k != 1) goto L5;
    L8:
        this.f1529o = this.f1528n;
        return;
    L5:
        if (m1291q0() == false) goto L8;
        this.f1529o = !this.f1528n;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m1295v0(int r3) {
        if (r3 != 0) goto L4;
    L8:
        mo797b(null);
        if (r3 == this.f1525k) goto L11;
    L12:
        this.f1527m = C0385u.m963a(this, r3);
        this.f1533s.getClass();
        this.f1525k = r3;
        m793Y();
        return;
    L11:
        if (this.f1527m == null) goto L12;
        return;
    L4:
        if (r3 == 1) goto L8;
        throw new IllegalArgumentException(AbstractC0324d.m720c("invalid orientation:", r3));
    }

    /* JADX INFO: renamed from: w0 */
    public void mo1274w0(boolean r2) {
        mo797b(null);
        if (this.f1530p != r2) goto L5;
        return;
    L5:
        this.f1530p = r2;
        m793Y();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m1296x0(int r5, int r6, boolean r7, C0352L r8) {
        C0383s r02 = this.f1526l;
        boolean r2 = false;
        int r3 = 1;
        if (this.f1527m.m971i() == 0) goto L5;
    L7:
        boolean r1 = false;
    L8:
        r02.f868k = r1;
        this.f1526l.f863f = r5;
        int[] r03 = this.f1535u;
        r03[0] = 0;
        r03[1] = 0;
        m1277c0(r8, r03);
        int r82 = Math.max(0, r03[0]);
        int r04 = Math.max(0, r03[1]);
        if (r5 != 1) goto L11;
        r2 = true;
    L11:
        C0383s r52 = this.f1526l;
        if (r2 == false) goto L14;
        int r12 = r04;
    L15:
        r52.f865h = r12;
        if (r2 == true) goto L19;
        r82 = r04;
    L19:
        r52.f866i = r82;
        if (r2 == false) goto L25;
        r52.f865h = this.f1527m.m970h() + r12;
        View r53 = m1289o0();
        C0383s r05 = this.f1526l;
        if (this.f1529o == false) goto L24;
        r3 = -1;
    L24:
        r05.f862e = r3;
        int r83 = AbstractC0343C.m765D(r53);
        C0383s r13 = this.f1526l;
        r05.f861d = r83 + r13.f862e;
        r13.f859b = this.f1527m.m964b(r53);
        int r54 = this.f1527m.m964b(r53) - this.f1527m.m969g();
    L30:
        C0383s r84 = this.f1526l;
        r84.f860c = r6;
        if (r7 == false) goto L33;
        r84.f860c = r6 - r54;
    L33:
        r84.f864g = r54;
        return;
    L25:
        View r55 = m1290p0();
        C0383s r06 = this.f1526l;
        r06.f865h = this.f1527m.m973k() + r06.f865h;
        C0383s r07 = this.f1526l;
        if (this.f1529o == true) goto L29;
        r3 = -1;
    L29:
        r07.f862e = r3;
        int r85 = AbstractC0343C.m765D(r55);
        C0383s r14 = this.f1526l;
        r07.f861d = r85 + r14.f862e;
        r14.f859b = this.f1527m.m967e(r55);
        r54 = (-this.f1527m.m967e(r55)) + this.f1527m.m973k();
        goto L30
    L14:
        r12 = r82;
        goto L15
    L5:
        if (this.f1527m.m968f() != 0) goto L7;
        r1 = true;
        goto L8
    }

    public LinearLayoutManager(Context r4, AttributeSet r5, int r6, int r7) {
        this.f1525k = 1;
        this.f1528n = false;
        this.f1529o = false;
        this.f1530p = false;
        this.f1531q = true;
        this.f1532r = null;
        this.f1533s = new C0381q(0);
        this.f1534t = new C0382r();
        this.f1535u = new int[2];
        C0381q r42 = AbstractC0343C.m766E(r4, r5, r6, r7);
        m1295v0(r42.f850b);
        boolean r52 = r42.f852d;
        mo797b(null);
        if (r52 == this.f1528n) goto L6;
        this.f1528n = r52;
        m793Y();
    L6:
        mo1274w0(r42.f853e);
    }
}
