package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: sb */
/* JADX INFO: loaded from: classes.dex */
public final class C2497sb extends C2454rb {

    /* JADX INFO: renamed from: A0 */
    public int f8762A0;

    /* JADX INFO: renamed from: B0 */
    public C2178l7[] f8763B0;

    /* JADX INFO: renamed from: C0 */
    public C2178l7[] f8764C0;

    /* JADX INFO: renamed from: D0 */
    public int f8765D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f8766E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f8767F0;

    /* JADX INFO: renamed from: G0 */
    public WeakReference f8768G0;

    /* JADX INFO: renamed from: H0 */
    public WeakReference f8769H0;

    /* JADX INFO: renamed from: I0 */
    public WeakReference f8770I0;

    /* JADX INFO: renamed from: J0 */
    public WeakReference f8771J0;

    /* JADX INFO: renamed from: K0 */
    public final HashSet f8772K0;

    /* JADX INFO: renamed from: L0 */
    public final C0178E5 f8773L0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f8774q0;

    /* JADX INFO: renamed from: r0 */
    public final C2656w4 f8775r0;

    /* JADX INFO: renamed from: s0 */
    public final C2585ud f8776s0;

    /* JADX INFO: renamed from: t0 */
    public int f8777t0;

    /* JADX INFO: renamed from: u0 */
    public C1496hb f8778u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f8779v0;

    /* JADX INFO: renamed from: w0 */
    public final C2244mo f8780w0;

    /* JADX INFO: renamed from: x0 */
    public int f8781x0;

    /* JADX INFO: renamed from: y0 */
    public int f8782y0;

    /* JADX INFO: renamed from: z0 */
    public int f8783z0;

    public C2497sb() {
        this.f8774q0 = new ArrayList();
        this.f8775r0 = new C2656w4(this);
        C2585ud r0 = new C2585ud();
        r0.f8948b = true;
        r0.f8949c = true;
        r0.f8951e = new ArrayList();
        new ArrayList();
        r0.f8952f = null;
        r0.f8953g = new C0178E5();
        r0.f8954h = new ArrayList();
        r0.f8947a = this;
        r0.f8950d = this;
        this.f8776s0 = r0;
        this.f8778u0 = null;
        this.f8779v0 = false;
        this.f8780w0 = new C2244mo();
        this.f8783z0 = 0;
        this.f8762A0 = 0;
        this.f8763B0 = new C2178l7[4];
        this.f8764C0 = new C2178l7[4];
        this.f8765D0 = 257;
        this.f8766E0 = false;
        this.f8767F0 = false;
        this.f8768G0 = null;
        this.f8769H0 = null;
        this.f8770I0 = null;
        this.f8771J0 = null;
        this.f8772K0 = new HashSet();
        this.f8773L0 = new C0178E5();
    }

    /* JADX INFO: renamed from: V */
    public static void m4979V(C2454rb r9, C1496hb r10, C0178E5 r11) {
        if (r10 != null) goto L4;
        return;
    L4:
        int r0 = r9.f8619g0;
        int[] r1 = r9.f8641t;
        if (r0 != 8) goto L7;
    L87:
        r11.f524e = 0;
        r11.f525f = 0;
        return;
    L7:
        if ((r9 instanceof C2150kk) == true) goto L87;
        if ((r9 instanceof C2399q5) == true) goto L87;
        int[] r02 = r9.f8637p0;
        r11.f520a = r02[0];
        r11.f521b = r02[1];
        r11.f522c = r9.m4937q();
        r11.f523d = r9.m4933k();
        r11.f528i = false;
        r11.f529j = 0;
        if (r11.f520a != 3) goto L14;
        boolean r03 = true;
    L16:
        if (r11.f521b != 3) goto L18;
        boolean r4 = true;
    L20:
        if (r03 == true) goto L22;
    L24:
        boolean r6 = false;
    L25:
        if (r4 == true) goto L27;
    L29:
        boolean r5 = false;
    L31:
        if (r03 == true) goto L33;
    L43:
        if (r4 == false) goto L56;
        if (r9.m4940t(1) == false) goto L56;
        if (r9.f8640s != 0) goto L56;
        if (r5 == true) goto L56;
        r11.f521b = 2;
        if (r03 == true) goto L52;
    L54:
        r4 = false;
        goto L56
    L52:
        if (r9.f8639r != 0) goto L54;
        r11.f521b = 1;
    L56:
        if (r9.mo4334A() == false) goto L59;
        r11.f520a = 1;
        r03 = false;
    L59:
        if (r9.mo4335B() == false) goto L62;
        r11.f521b = 1;
        r4 = false;
    L62:
        if (r6 == true) goto L64;
    L72:
        if (r5 == true) goto L74;
    L85:
        r10.m2865b(r9, r11);
        r9.m4924O(r11.f524e);
        r9.m4921L(r11.f525f);
        r9.f8584E = r11.f527h;
        r9.m4918I(r11.f526g);
        r11.f529j = 0;
        return;
    L74:
        if (r1[1] != 4) goto L76;
        r11.f521b = 1;
        goto L85
    L76:
        if (r03 == true) goto L85;
        if (r11.f520a != 1) goto L80;
        int r04 = r11.f522c;
    L81:
        r11.f521b = 1;
        if (r9.f8603X != (-1)) goto L84;
        r11.f523d = (int) (r04 / r9.f8602W);
        goto L85
    L84:
        r11.f523d = (int) (r9.f8602W * r04);
        goto L85
    L80:
        r11.f521b = 2;
        r10.m2865b(r9, r11);
        r04 = r11.f524e;
        goto L81
    L64:
        if (r1[0] != 4) goto L66;
        r11.f520a = 1;
        goto L72
    L66:
        if (r4 == true) goto L72;
        if (r11.f521b != 1) goto L70;
        int r42 = r11.f523d;
    L71:
        r11.f520a = 1;
        r11.f522c = (int) (r9.f8602W * r42);
        goto L72
    L70:
        r11.f520a = 2;
        r10.m2865b(r9, r11);
        r42 = r11.f525f;
        goto L71
    L33:
        if (r9.m4940t(0) == false) goto L43;
        if (r9.f8639r != 0) goto L43;
        if (r6 == true) goto L43;
        r11.f520a = 2;
        if (r4 == true) goto L40;
    L42:
        r03 = false;
        goto L43
    L40:
        if (r9.f8640s != 0) goto L42;
        r11.f520a = 1;
        goto L42
    L27:
        if (r9.f8602W <= 0.0f) goto L29;
        r5 = true;
        goto L31
    L22:
        if (r9.f8602W <= 0.0f) goto L24;
        r6 = true;
        goto L25
    L18:
        r4 = false;
        goto L20
    L14:
        r03 = false;
        goto L16
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: C */
    public final void mo4914C() {
        this.f8780w0.m4580t();
        this.f8781x0 = 0;
        this.f8782y0 = 0;
        this.f8774q0.clear();
        super.mo4914C();
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: F */
    public final void mo4917F(C2656w4 r4) {
        super.mo4917F(r4);
        int r0 = this.f8774q0.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((C2454rb) this.f8774q0.get(r1)).mo4917F(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: P */
    public final void mo4925P(boolean r4, boolean r5) {
        super.mo4925P(r4, r5);
        int r0 = this.f8774q0.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((C2454rb) this.f8774q0.get(r1)).mo4925P(r4, r5);
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: R */
    public final void m4980R(C2454rb r6, int r7) {
        if (r7 != 0) goto L9;
        int r72 = this.f8783z0 + 1;
        C2178l7[] r1 = this.f8764C0;
        if (r72 < r1.length) goto L7;
        this.f8764C0 = (C2178l7[]) Arrays.copyOf(r1, r1.length * 2);
    L7:
        C2178l7[] r73 = this.f8764C0;
        int r12 = this.f8783z0;
        r73[r12] = new C2178l7(r6, 0, this.f8779v0);
        this.f8783z0 = r12 + 1;
        return;
    L9:
        if (r7 != 1) goto L15;
        int r74 = this.f8762A0 + 1;
        C2178l7[] r13 = this.f8763B0;
        if (r74 < r13.length) goto L13;
        this.f8763B0 = (C2178l7[]) Arrays.copyOf(r13, r13.length * 2);
    L13:
        C2178l7[] r75 = this.f8763B0;
        int r14 = this.f8762A0;
        r75[r14] = new C2178l7(r6, 1, this.f8779v0);
        this.f8762A0 = r14 + 1;
        return;
    }

    /* JADX INFO: renamed from: S */
    public final void m4981S(C2244mo r13) {
        boolean r0 = m4984W(64);
        mo813b(r13, r0);
        int r1 = this.f8774q0.size();
        int r3 = 0;
        boolean r4 = false;
    L4:
        if (r3 >= r1) goto L10;
        C2454rb r6 = (C2454rb) this.f8774q0.get(r3);
        boolean[] r7 = r6.f8598S;
        r7[0] = false;
        r7[1] = false;
        if ((r6 instanceof C2399q5) == false) goto L8;
        r4 = true;
    L8:
        r3 = r3 + 1;
        goto L4
    L10:
        if (r4 == false) goto L34;
        int r42 = 0;
    L12:
        if (r42 >= r1) goto L34;
        C2454rb r62 = (C2454rb) this.f8774q0.get(r42);
        if ((r62 instanceof C2399q5) == false) goto L33;
        C2399q5 r63 = (C2399q5) r62;
        int r72 = 0;
    L17:
        if (r72 >= r63.f8966r0) goto L33;
        C2454rb r8 = r63.f8965q0[r72];
        if (r63.f8408t0 == false) goto L21;
    L23:
        int r9 = r63.f8407s0;
        if (r9 == 0) goto L31;
        if (r9 == 1) goto L31;
        if (r9 != 2) goto L29;
    L30:
        r8.f8598S[1] = true;
    L32:
        r72 = r72 + 1;
        goto L17
    L29:
        if (r9 != 3) goto L32;
    L31:
        r8.f8598S[0] = true;
        goto L32
    L21:
        if (r8.mo4339c() == true) goto L23;
    L33:
        r42 = r42 + 1;
    L34:
        HashSet r43 = this.f8772K0;
        r43.clear();
        int r64 = 0;
    L35:
        if (r64 >= r1) goto L45;
        C2454rb r73 = (C2454rb) this.f8774q0.get(r64);
        r73.getClass();
        boolean r82 = r73 instanceof C0368Ih;
        if (r82 == false) goto L39;
    L40:
        if (r82 == false) goto L42;
        r43.add(r73);
    L43:
        r64 = r64 + 1;
        goto L35
    L42:
        r73.mo813b(r13, r0);
        goto L43
    L39:
        if ((r73 instanceof C2150kk) == false) goto L43;
    L45:
        if (r43.size() <= 0) goto L64;
        int r65 = r43.size();
        Iterator r74 = r43.iterator();
    L48:
        if (r74.hasNext() == false) goto L57;
        C0368Ih r83 = (C0368Ih) ((C2454rb) r74.next());
        int r92 = 0;
    L51:
        if (r92 >= r83.f8966r0) goto L48;
        if (r43.contains(r83.f8965q0[r92]) == true) goto L54;
        r92 = r92 + 1;
        goto L51
    L54:
        r83.mo813b(r13, r0);
        r43.remove(r83);
    L57:
        if (r65 != r43.size()) goto L45;
        Iterator r66 = r43.iterator();
    L60:
        if (r66.hasNext() == false) goto L62;
        ((C2454rb) r66.next()).mo813b(r13, r0);
        goto L60
    L62:
        r43.clear();
        goto L45
    L64:
        if (C2244mo.f7925q == false) goto L82;
        HashSet r93 = new HashSet();
        int r44 = 0;
    L66:
        if (r44 >= r1) goto L75;
        C2454rb r67 = (C2454rb) this.f8774q0.get(r44);
        r67.getClass();
        if ((r67 instanceof C0368Ih) == true) goto L73;
        if ((r67 instanceof C2150kk) == true) goto L73;
        r93.add(r67);
    L73:
        r44 = r44 + 1;
        goto L66
    L75:
        if (this.f8637p0[0] != 2) goto L77;
        int r10 = 0;
    L78:
        C2497sb r68 = this;
        C2244mo r84 = r13;
        r68.m4926a(this, r84, r93, r10, false);
        Iterator r132 = r93.iterator();
    L80:
        if (r132.hasNext() == false) goto L104;
        C2454rb r12 = (C2454rb) r132.next();
        AbstractC0714Qj.m1486h(this, r84, r12);
        r12.mo813b(r84, r0);
    L104:
        if (r68.f8783z0 <= 0) goto L107;
        AbstractC1406fG.m2681F(this, r84, null, 0);
    L107:
        if (r68.f8762A0 <= 0) goto L144;
        AbstractC1406fG.m2681F(this, r84, null, 1);
        return;
    L144:
        return;
    L77:
        r10 = 1;
        goto L78
    L82:
        r68 = this;
        r84 = r13;
        int r133 = 0;
    L83:
        if (r133 >= r1) goto L104;
        C2454rb r45 = (C2454rb) r68.f8774q0.get(r133);
        if ((r45 instanceof C2497sb) == false) goto L96;
        int[] r75 = r45.f8637p0;
        int r94 = r75[0];
        int r76 = r75[1];
        if (r94 != 2) goto L89;
        r45.m4922M(1);
    L89:
        if (r76 != 2) goto L91;
        r45.m4923N(1);
    L91:
        r45.mo813b(r84, r0);
        if (r94 != 2) goto L94;
        r45.m4922M(r94);
    L94:
        if (r76 != 2) goto L102;
        r45.m4923N(r76);
    L102:
        r133 = r133 + 1;
        goto L83
    L96:
        AbstractC0714Qj.m1486h(this, r84, r45);
        if ((r45 instanceof C0368Ih) == true) goto L102;
        if ((r45 instanceof C2150kk) == true) goto L102;
        r45.mo813b(r84, r0);
        goto L102
    }

    /* JADX INFO: renamed from: T */
    public final boolean m4982T(int r17, boolean r18) {
        C2585ud r2 = this.f8776s0;
        ArrayList r3 = r2.f8951e;
        C2497sb r4 = r2.f8947a;
        boolean r5 = false;
        int r6 = r4.m4932j(0);
        int[] r7 = r4.f8637p0;
        int r9 = r4.m4932j(1);
        int r10 = r4.m4938r();
        int r11 = r4.m4939s();
        if (r18 == false) goto L24;
        if (r6 == 2) goto L7;
        if (r9 != 2) goto L24;
    L7:
        Iterator r13 = r3.iterator();
    L9:
        if (r13.hasNext() == false) goto L15;
        AbstractC1449gF r14 = (AbstractC1449gF) r13.next();
        if (r14.f5062f != r17) goto L9;
        if (r14.mo1550k() == true) goto L9;
        boolean r132 = false;
    L16:
        if (r17 != 0) goto L20;
        if (r132 == false) goto L24;
        if (r6 != 2) goto L24;
        r4.m4922M(1);
        r4.m4924O(r2.m5090d(r4, 0));
        r4.f8612d.f5061e.mo1539d(r4.m4937q());
        goto L24
    L20:
        if (r132 == false) goto L24;
        if (r9 != 2) goto L24;
        r4.m4923N(1);
        r4.m4921L(r2.m5090d(r4, 1));
        r4.f8614e.f5061e.mo1539d(r4.m4933k());
        goto L24
    L15:
        r132 = r18;
    L24:
        if (r17 != 0) goto L30;
        int r72 = r7[0];
        if (r72 == 1) goto L28;
        if (r72 == 4) goto L28;
    L34:
        boolean r73 = false;
    L36:
        r2.m5093g();
        Iterator r22 = r3.iterator();
    L38:
        if (r22.hasNext() == false) goto L48;
        AbstractC1449gF r102 = (AbstractC1449gF) r22.next();
        if (r102.f5062f != r17) goto L38;
        if (r102.f5058b != r4) goto L47;
        if (r102.f5063g == false) goto L38;
    L47:
        r102.mo1548e();
        goto L38
    L48:
        Iterator r23 = r3.iterator();
    L50:
        if (r23.hasNext() == false) goto L69;
        AbstractC1449gF r32 = (AbstractC1449gF) r23.next();
        if (r32.f5062f != r17) goto L50;
        if (r73 == true) goto L59;
        if (r32.f5058b == r4) goto L50;
    L59:
        if (r32.f5064h.f9119j == false) goto L70;
        if (r32.f5065i.f9119j == false) goto L70;
        if ((r32 instanceof C2221m7) == true) goto L50;
        if (r32.f5061e.f9119j == true) goto L50;
    L70:
        r4.m4922M(r6);
        r4.m4923N(r9);
        return r5;
    L69:
        r5 = true;
    L28:
        int r74 = r4.m4937q() + r10;
        r4.f8612d.f5065i.mo1539d(r74);
        r4.f8612d.f5061e.mo1539d(r74 - r10);
    L29:
        r73 = true;
        goto L36
    L30:
        int r75 = r7[1];
        if (r75 == 1) goto L35;
        if (r75 != 4) goto L34;
    L35:
        int r76 = r4.m4933k() + r11;
        r4.f8614e.f5065i.mo1539d(r76);
        r4.f8614e.f5061e.mo1539d(r76 - r11);
        goto L29
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [rb, sb] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v126, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v94, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v66, types: [int] */
    /* JADX WARN: Type inference failed for: r6v80, types: [int] */
    /* JADX INFO: renamed from: U */
    public final void m4983U() {
        boolean[] r2 = AbstractC0714Qj.f2297d;
        this.f8604Y = 0;
        this.f8605Z = 0;
        this.f8766E0 = false;
        this.f8767F0 = false;
        int r4 = this.f8774q0.size();
        int r0 = Math.max(0, m4937q());
        int r5 = Math.max(0, m4933k());
        int[] r6 = this.f8637p0;
        int r8 = r6[1];
        int r9 = r6[0];
        int r10 = this.f8777t0;
        C1259cb r12 = this.f8589J;
        C1259cb r13 = this.f8588I;
        if (r10 == 0) goto L5;
    L149:
        boolean[] r18 = r2;
        ?? r21 = r6;
    L150:
        C2244mo r7 = this.f8780w0;
        if (r4 <= 2) goto L155;
        if (r9 == 2) goto L157;
        if (r8 != 2) goto L155;
    L157:
        if (AbstractC0714Qj.m1492n(this.f8765D0, 1024) == false) goto L155;
        C1496hb r102 = this.f8778u0;
        ArrayList r11 = this.f8774q0;
        int r14 = r11.size();
        int r15 = 0;
    L159:
        if (r15 >= r14) goto L167;
        C2454rb r22 = (C2454rb) r11.get(r15);
        ?? r3 = r21[0];
        ?? r62 = r21[1];
        int r23 = r15;
        int[] r152 = r22.f8637p0;
        C1259cb r25 = r13;
        if (AbstractC0148Dc.m290x(r3, r62, r152[0], r152[1]) == false) goto L393;
        if ((r22 instanceof C0368Ih) == true) goto L393;
        r15 = r23 + 1;
        r13 = r25;
    L393:
        int r24 = r0;
        boolean r02 = false;
    L395:
        if (m4984W(64) == false) goto L397;
    L400:
        boolean r63 = true;
    L401:
        r7.getClass();
        r7.f7933h = false;
        if (this.f8765D0 == 0) goto L405;
        if (r63 == false) goto L405;
        char r103 = 1;
        r7.f7933h = true;
    L406:
        ArrayList r64 = this.f8774q0;
        if (r21[0] != 2) goto L409;
    L412:
        boolean r104 = true;
    L413:
        this.f8783z0 = 0;
        this.f8762A0 = 0;
        int r112 = 0;
    L414:
        if (r112 >= r4) goto L419;
        C2454rb r132 = (C2454rb) this.f8774q0.get(r112);
        if ((r132 instanceof C2497sb) == false) goto L418;
        ((C2497sb) r132).m4983U();
    L418:
        r112 = r112 + 1;
        goto L414
    L419:
        boolean r113 = m4984W(64);
        ?? r133 = r02;
        int r03 = 0;
        boolean r142 = true;
    L420:
        if (r142 == false) goto L534;
        int r153 = r03 + 1;
        r7.m4580t();     // Catch: Exception -> L425
        this.f8783z0 = 0;     // Catch: Exception -> L425
        this.f8762A0 = 0;     // Catch: Exception -> L425
        m4930g(r7);     // Catch: Exception -> L425
        int r04 = 0;
    L423:
        if (r04 >= r4) goto L427;
        ((C2454rb) this.f8774q0.get(r04)).m4930g(r7);     // Catch: Exception -> L425
        r04 = r04 + 1;     // Catch: Exception -> L425
        goto L423
    L427:
        m4981S(r7);     // Catch: Exception -> L425
        WeakReference r05 = this.f8768G0;     // Catch: Exception -> L438
        if (r05 != null) goto L431;
    L440:
        boolean r232 = r104;
    L441:
        WeakReference r06 = this.f8770I0;     // Catch: Exception -> L435
        if (r06 != null) goto L444;
    L446:
        WeakReference r07 = this.f8769H0;     // Catch: Exception -> L435
        if (r07 != null) goto L449;
    L457:
        WeakReference r08 = this.f8771J0;     // Catch: Exception -> L435
        if (r08 == null) goto L474;
        if (r08.get() == null) goto L474;
        r7.m4567f(r7.m4572k(this.f8590K), r7.m4572k((C1259cb) this.f8771J0.get()), 0, 5);     // Catch: Exception -> L469
        this.f8771J0 = null;     // Catch: Exception -> L467
    L467:
        e = e;
    L437:
        boolean r143 = true;
    L476:
        e.printStackTrace();
        C1259cb r242 = r12;
        System.out.println("EXCEPTION : " + e);
        boolean r144 = r143;
    L477:
        if (r144 == false) goto L487;
        r18[2] = false;
        boolean r09 = m4984W(64);
        mo4336Q(r7, r09);
        int r105 = this.f8774q0.size();
        int r122 = 0;
        boolean r145 = false;
    L479:
        if (r122 >= r105) goto L486;
        C2454rb r32 = (C2454rb) this.f8774q0.get(r122);
        r32.mo4336Q(r7, r09);
        boolean r26 = r09;
        int r27 = r105;
        if (r32.f8620h == (-1)) goto L483;
    L484:
        r145 = true;
    L485:
        r122 = r122 + 1;
        r09 = r26;
        r105 = r27;
        r145 = r145;
        goto L479
    L483:
        if (r32.f8622i == (-1)) goto L485;
    L486:
        boolean r146 = r145;
    L492:
        if (r232 == false) goto L508;
        if (r153 >= 8) goto L508;
        if (r18[2] == false) goto L508;
        int r33 = 0;
        int r106 = 0;
        int r123 = 0;
    L497:
        if (r33 >= r4) goto L499;
        C2454rb r010 = (C2454rb) this.f8774q0.get(r33);
        int r272 = r33;
        r123 = Math.max(r123, r010.m4937q() + r010.f8604Y);
        r106 = Math.max(r106, r010.m4933k() + r010.f8605Z);
        r33 = r272 + 1;
        goto L497
    L499:
        int r011 = Math.max(this.f8609b0, r123);
        int r34 = Math.max(this.f8611c0, r106);
        r133 = r133;
        r146 = r146;
        if (r9 != 2) goto L504;
        r133 = r133;
        r146 = r146;
        if (m4937q() >= r011) goto L504;
        m4924O(r011);
        r21[0] = 2;
        r133 = 1;
        r146 = true;
    L504:
        if (r8 != 2) goto L508;
        if (m4933k() >= r34) goto L508;
        m4921L(r34);
        r21[1] = 2;
        r133 = 1;
        r146 = true;
    L508:
        int r012 = Math.max(this.f8609b0, m4937q());
        if (r012 <= m4937q()) goto L511;
        m4924O(r012);
        ?? r107 = 1;
        r21[0] = 1;
        boolean r147 = true;
        ?? r17 = 1;
    L512:
        int r013 = Math.max(this.f8611c0, m4933k());
        if (r013 <= m4933k()) goto L515;
        m4921L(r013);
        r21[r107] = r107;
        ?? r014 = r107;
        boolean r148 = r014 == true ? 1 : 0;
        ?? r015 = r014;
    L516:
        if (r015 != 0) goto L530;
        ?? r016 = r015;
        r016 = r015;
        boolean r149 = r148;
        r149 = r148;
        if (r21[0] != 2) goto L523;
        if (r24 <= 0) goto L523;
        r016 = r015;
        r149 = r148;
        if (m4937q() <= r24) goto L523;
        this.f8766E0 = r107;
        r21[0] = r107;
        m4924O(r24);
        ?? r017 = r107;
        r149 = r017 == true ? 1 : 0;
        r016 = r017;
    L523:
        ?? r018 = r016;
        r018 = r016;
        boolean r1410 = r149;
        r1410 = r149;
        if (r21[r107] != 2) goto L529;
        if (r5 <= 0) goto L529;
        r018 = r016;
        r1410 = r149;
        if (m4933k() <= r5) goto L529;
        this.f8767F0 = r107;
        r21[r107] = r107;
        m4921L(r5);
        int r019 = 8;
        ?? r134 = 1;
        boolean r1411 = true;
    L531:
        if (r153 <= r019) goto L533;
        r1411 = false;
    L533:
        r03 = r153;
        r104 = r232;
        r12 = r242;
        r133 = r134;
        r142 = r1411;
    L529:
        r134 = r018;
        r019 = 8;
        r1411 = r1410;
        goto L531
    L530:
        r018 = r015;
        r1410 = r148;
        goto L529
    L515:
        r015 = r17;
        r148 = r147;
        goto L516
    L511:
        r107 = 1;
        r17 = r133;
        r147 = r146;
        goto L512
    L487:
        mo4336Q(r7, r113);
        int r020 = 0;
    L488:
        if (r020 >= r4) goto L490;
        ((C2454rb) this.f8774q0.get(r020)).mo4336Q(r7, r113);
        r020 = r020 + 1;
        goto L488
    L490:
        r146 = false;
    L469:
        e = e;
    L471:
        e = e;
    L474:
        r7.m4576p();     // Catch: Exception -> L467
        r242 = r12;
        r144 = true;
        goto L477
    L449:
        if (r07.get() == null) goto L457;
        C1259cb r021 = (C1259cb) this.f8769H0.get();     // Catch: Exception -> L435
        C1259cb r35 = r25;
        r25 = r35;
        r7.m4567f(r7.m4572k(r021), r7.m4572k(r35), 0, 5);     // Catch: Exception -> L435
        this.f8769H0 = null;     // Catch: Exception -> L435
    L455:
        e = e;
        r25 = r35;
        goto L437
    L444:
        if (r06.get() == null) goto L446;
        r7.m4567f(r7.m4572k(this.f8591L), r7.m4572k((C1259cb) this.f8770I0.get()), 0, 5);     // Catch: Exception -> L435
        this.f8770I0 = null;     // Catch: Exception -> L435
    L435:
        e = e;
        goto L437
    L431:
        if (r05.get() == null) goto L440;
        C1259cb r022 = (C1259cb) this.f8768G0.get();     // Catch: Exception -> L438
        r232 = r104;
        r7.m4567f(r7.m4572k(r022), r7.m4572k(r12), 0, 5);     // Catch: Exception -> L435
        this.f8768G0 = null;     // Catch: Exception -> L435
    L438:
        e = e;
        r232 = r104;
    L425:
        e = e;
        r232 = r104;
        r143 = r142;
        goto L476
    L534:
        this.f8774q0 = r64;
        if (r133 == 0) goto L537;
        r21[0] = r9;
        r21[1] = r8;
    L537:
        mo4917F(r7.f7938m);
        return;
    L409:
        if (r21[r103] == 2) goto L412;
        r104 = false;
    L405:
        r103 = 1;
        goto L406
    L397:
        if (m4984W(128) == true) goto L400;
        r63 = false;
        goto L401
    L167:
        r25 = r13;
        int r28 = 0;
        ArrayList r36 = null;
        ArrayList r65 = null;
        ArrayList r135 = null;
        ArrayList r154 = null;
        ArrayList r233 = null;
        ArrayList r243 = null;
    L168:
        if (r28 >= r14) goto L242;
        int r273 = r28;
        C2454rb r29 = (C2454rb) r11.get(r28);
        ArrayList r262 = r36;
        ?? r37 = r21[0];
        ArrayList r282 = r65;
        ?? r66 = r21[1];
        ArrayList r292 = r135;
        int[] r136 = r29.f8637p0;
        ArrayList r31 = r154;
        if (AbstractC0148Dc.m290x(r37, r66, r136[0], r136[1]) == true) goto L172;
        m4979V(r29, r102, this.f8773L0);
    L172:
        boolean r38 = r29 instanceof C2150kk;
        if (r38 == false) goto L188;
        C2150kk r67 = (C2150kk) r29;
        if (r67.f7522u0 != 0) goto L180;
        if (r292 != null) goto L178;
        r135 = new ArrayList();
    L179:
        r135.add(r67);
    L181:
        boolean r30 = r38;
        if (r67.f7522u0 != 1) goto L187;
        if (r262 != null) goto L185;
        ArrayList r39 = new ArrayList();
    L186:
        r39.add(r67);
    L190:
        if ((r29 instanceof AbstractC2592uk) == true) goto L192;
        ArrayList r263 = r39;
        C1496hb r322 = r102;
        r65 = r282;
    L208:
        r154 = r31;
    L220:
        if (r29.f8588I.f4270f != null) goto L230;
        if (r29.f8590K.f4270f != null) goto L230;
        if (r30 == true) goto L230;
        if ((r29 instanceof C2399q5) == true) goto L230;
        if (r233 != null) goto L228;
        r233 = new ArrayList();
    L228:
        ArrayList r310 = r233;
        r310.add(r29);
        r233 = r310;
    L230:
        if (r29.f8589J.f4270f != null) goto L241;
        if (r29.f8591L.f4270f != null) goto L241;
        if (r29.f8592M.f4270f != null) goto L241;
        if (r30 == true) goto L241;
        if ((r29 instanceof C2399q5) == true) goto L241;
        if (r243 != null) goto L240;
        r243 = new ArrayList();
    L240:
        ArrayList r311 = r243;
        r311.add(r29);
        r243 = r311;
    L241:
        r28 = r273 + 1;
        r36 = r263;
        r102 = r322;
        goto L168
    L192:
        if ((r29 instanceof C2399q5) == false) goto L209;
        C2399q5 r68 = (C2399q5) r29;
        if (r68.m4836U() != 0) goto L200;
        if (r282 != null) goto L197;
        ArrayList r155 = new ArrayList();
    L198:
        r155.add(r68);
    L199:
        r263 = r39;
        r322 = r102;
        if (r68.m4836U() != 1) goto L207;
        if (r31 != null) goto L205;
        ArrayList r312 = new ArrayList();
    L206:
        r312.add(r68);
        r31 = r312;
        goto L207
    L205:
        r312 = r31;
    L207:
        r65 = r155;
        goto L208
    L197:
        r155 = r282;
        goto L198
    L200:
        r155 = r282;
        goto L199
    L209:
        r263 = r39;
        r322 = r102;
        AbstractC2592uk r313 = (AbstractC2592uk) r29;
        if (r282 != null) goto L212;
        r65 = new ArrayList();
    L213:
        r65.add(r313);
        if (r31 != null) goto L216;
        r154 = new ArrayList();
    L217:
        r154.add(r313);
        goto L220
    L216:
        r154 = r31;
        goto L217
    L212:
        r65 = r282;
        goto L213
    L185:
        r39 = r262;
        goto L186
    L187:
        r39 = r262;
        goto L190
    L178:
        r135 = r292;
        goto L179
    L180:
        r135 = r292;
        goto L181
    L188:
        r30 = r38;
        r39 = r262;
        r135 = r292;
        goto L190
    L242:
        ArrayList r264 = r36;
        ArrayList r283 = r65;
        ArrayList r293 = r135;
        ArrayList r314 = r154;
        ArrayList r210 = new ArrayList();
        if (r264 == null) goto L248;
        Iterator r315 = r264.iterator();
    L246:
        if (r315.hasNext() == false) goto L248;
        AbstractC0148Dc.m275i((C2150kk) r315.next(), 0, r210, null);
    L248:
        C1405fF r108 = null;
        int r156 = 0;
        if (r283 == null) goto L254;
        Iterator r316 = r283.iterator();
    L252:
        if (r316.hasNext() == false) goto L254;
        AbstractC2592uk r69 = (AbstractC2592uk) r316.next();
        C1405fF r137 = AbstractC0148Dc.m275i(r69, r156, r210, r108);
        r69.m5100R(r156, r137, r210);
        r137.m2677a(r210);
        r108 = null;
        r156 = 0;
    L254:
        HashSet r317 = mo4340i(2).f4265a;
        if (r317 == null) goto L260;
        Iterator r318 = r317.iterator();
    L258:
        if (r318.hasNext() == false) goto L260;
        AbstractC0148Dc.m275i(((C1259cb) r318.next()).f4268d, 0, r210, null);
    L260:
        HashSet r319 = mo4340i(4).f4265a;
        if (r319 == null) goto L266;
        Iterator r320 = r319.iterator();
    L264:
        if (r320.hasNext() == false) goto L266;
        AbstractC0148Dc.m275i(((C1259cb) r320.next()).f4268d, 0, r210, null);
    L266:
        HashSet r610 = mo4340i(7).f4265a;
        if (r610 == null) goto L272;
        Iterator r611 = r610.iterator();
    L270:
        if (r611.hasNext() == false) goto L272;
        AbstractC0148Dc.m275i(((C1259cb) r611.next()).f4268d, 0, r210, null);
    L272:
        C1405fF r138 = null;
        if (r233 == null) goto L278;
        Iterator r612 = r233.iterator();
    L276:
        if (r612.hasNext() == false) goto L278;
        AbstractC0148Dc.m275i((C2454rb) r612.next(), 0, r210, null);
    L278:
        if (r293 == null) goto L283;
        Iterator r613 = r293.iterator();
    L281:
        if (r613.hasNext() == false) goto L283;
        AbstractC0148Dc.m275i((C2150kk) r613.next(), 1, r210, null);
    L283:
        int r157 = 1;
        if (r314 == null) goto L289;
        Iterator r614 = r314.iterator();
    L287:
        if (r614.hasNext() == false) goto L289;
        AbstractC2592uk r109 = (AbstractC2592uk) r614.next();
        C1405fF r321 = AbstractC0148Dc.m275i(r109, r157, r210, r138);
        r109.m5100R(r157, r321, r210);
        r321.m2677a(r210);
        r138 = null;
        r157 = 1;
    L289:
        HashSet r323 = mo4340i(3).f4265a;
        if (r323 == null) goto L295;
        Iterator r324 = r323.iterator();
    L293:
        if (r324.hasNext() == false) goto L295;
        AbstractC0148Dc.m275i(((C1259cb) r324.next()).f4268d, 1, r210, null);
    L295:
        HashSet r325 = mo4340i(6).f4265a;
        if (r325 == null) goto L301;
        Iterator r326 = r325.iterator();
    L299:
        if (r326.hasNext() == false) goto L301;
        AbstractC0148Dc.m275i(((C1259cb) r326.next()).f4268d, 1, r210, null);
    L301:
        HashSet r327 = mo4340i(5).f4265a;
        if (r327 == null) goto L307;
        Iterator r328 = r327.iterator();
    L305:
        if (r328.hasNext() == false) goto L307;
        AbstractC0148Dc.m275i(((C1259cb) r328.next()).f4268d, 1, r210, null);
    L307:
        HashSet r329 = mo4340i(7).f4265a;
        if (r329 == null) goto L313;
        Iterator r330 = r329.iterator();
    L311:
        if (r330.hasNext() == false) goto L313;
        AbstractC0148Dc.m275i(((C1259cb) r330.next()).f4268d, 1, r210, null);
    L313:
        boolean r158 = true;
        if (r243 == null) goto L319;
        Iterator r331 = r243.iterator();
    L317:
        if (r331.hasNext() == false) goto L319;
        AbstractC0148Dc.m275i((C2454rb) r331.next(), 1, r210, null);
    L319:
        int r332 = 0;
    L320:
        if (r332 >= r14) goto L345;
        C2454rb r615 = (C2454rb) r11.get(r332);
        int[] r1010 = r615.f8637p0;
        boolean r172 = r158;
        if (r1010[0] == 3) goto L324;
    L342:
        int r244 = r332;
        ArrayList r234 = r11;
    L343:
        r332 = r244 + 1;
        r11 = r234;
        r158 = true;
        goto L320
    L324:
        if (r1010[r172 ? 1 : 0] != 3) goto L342;
        int r1011 = r615.f8633n0;
        int r139 = r210.size();
        int r159 = 0;
    L326:
        if (r159 >= r139) goto L331;
        r244 = r332;
        C1405fF r333 = (C1405fF) r210.get(r159);
        r234 = r11;
        if (r1011 == r333.f4979b) goto L332;
        r159 = r159 + 1;
        r11 = r234;
        r332 = r244;
    L332:
        int r616 = r615.f8635o0;
        int r1012 = r210.size();
        int r114 = 0;
    L333:
        if (r114 >= r1012) goto L338;
        C1405fF r1310 = (C1405fF) r210.get(r114);
        if (r616 == r1310.f4979b) goto L339;
        r114 = r114 + 1;
    L339:
        if (r333 == null) goto L343;
        if (r1310 == null) goto L343;
        r333.m2679c(0, r1310);
        r1310.f4980c = 2;
        r210.remove(r333);
        goto L343
    L338:
        r1310 = null;
        goto L339
    L331:
        r244 = r332;
        r234 = r11;
        r333 = null;
        goto L332
    L345:
        if (r210.size() <= 1) goto L393;
        int r334 = 0;
        if (r21[0] != 2) goto L361;
        Iterator r617 = r210.iterator();
        int r1013 = 0;
        C1405fF r115 = null;
    L351:
        if (r617.hasNext() == false) goto L359;
        C1405fF r1311 = (C1405fF) r617.next();
        if (r1311.f4980c == 1) goto L351;
        int r1412 = r1311.m2678b(r7, r334);
        if (r1412 <= r1013) goto L358;
        r115 = r1311;
        r1013 = r1412;
    L358:
        r334 = 0;
        goto L351
    L359:
        if (r115 == null) goto L361;
        m4922M(1);
        m4924O(r1013);
    L363:
        if (r21[1] != 2) goto L375;
        Iterator r211 = r210.iterator();
        int r335 = 0;
        C1405fF r618 = null;
    L366:
        if (r211.hasNext() == false) goto L373;
        C1405fF r1014 = (C1405fF) r211.next();
        if (r1014.f4980c == 0) goto L366;
        int r1312 = r1014.m2678b(r7, 1);
        if (r1312 <= r335) goto L366;
        r618 = r1014;
        r335 = r1312;
        goto L366
    L373:
        if (r618 == null) goto L375;
        m4923N(1);
        m4921L(r335);
    L376:
        if (r115 != null) goto L379;
        if (r618 == null) goto L393;
    L379:
        if (r9 != 2) goto L386;
        if (r0 >= m4937q()) goto L384;
        if (r0 <= 0) goto L384;
        m4924O(r0);
        this.f8766E0 = true;
    L384:
        r0 = m4937q();
    L386:
        if (r8 == 2) goto L388;
    L392:
        r24 = r0;
        r02 = true;
        goto L395
    L388:
        if (r5 >= m4933k()) goto L391;
        if (r5 <= 0) goto L391;
        m4921L(r5);
        this.f8767F0 = true;
    L391:
        r5 = m4933k();
    L375:
        r618 = null;
    L361:
        r115 = null;
    L155:
        r25 = r13;
        goto L393
    L5:
        if (AbstractC0714Qj.m1492n(this.f8765D0, 1) == false) goto L149;
        C1496hb r1015 = this.f8778u0;
        int r1510 = r6[0];
        int r116 = r6[1];
        m4916E();
        ArrayList r1413 = this.f8774q0;
        int r336 = r1413.size();
        int r72 = 0;
    L7:
        if (r72 >= r336) goto L9;
        ((C2454rb) r1413.get(r72)).m4916E();
        r72 = r72 + 1;
        goto L7
    L9:
        boolean r73 = this.f8779v0;
        r18 = r2;
        if (r1510 != 1) goto L12;
        m4919J(0, m4937q());
    L13:
        int r212 = 0;
        boolean r1511 = false;
        boolean r19 = false;
    L15:
        if (r212 >= r336) goto L39;
        int r222 = r212;
        C2454rb r213 = (C2454rb) r1413.get(r212);
        int[] r214 = r6;
        if ((r213 instanceof C2150kk) == false) goto L33;
        C2150kk r215 = (C2150kk) r213;
        boolean r235 = r1511;
        if (r215.f7522u0 != 1) goto L32;
        int r619 = r215.f7519r0;
        if (r619 == (-1)) goto L24;
        r215.m4337R(r619);
    L31:
        r235 = true;
        goto L32
    L24:
        if (r215.f7520s0 == (-1)) goto L29;
        if (mo4334A() == false) goto L29;
        r215.m4337R(m4937q() - r215.f7520s0);
    L29:
        if (mo4334A() == false) goto L31;
        r215.m4337R((int) ((r215.f7518q0 * m4937q()) + 0.5f));
    L32:
        r1511 = r235;
    L38:
        r212 = r222 + 1;
        r6 = r214;
        goto L15
    L33:
        r235 = r1511;
        if ((r213 instanceof C2399q5) == false) goto L32;
        if (((C2399q5) r213).m4836U() != 0) goto L32;
        r1511 = r235;
        r19 = true;
        goto L38
    L39:
        r21 = r6;
        if (r1511 == false) goto L51;
        int r216 = 0;
    L42:
        if (r216 >= r336) goto L51;
        C2454rb r620 = (C2454rb) r1413.get(r216);
        if ((r620 instanceof C2150kk) == false) goto L49;
        C2150kk r621 = (C2150kk) r620;
        int r223 = r216;
        if (r621.f7522u0 != 1) goto L50;
        AbstractC0828TB.m1648q(0, r1015, r621, r73);
    L50:
        r216 = r223 + 1;
        goto L42
    L49:
        r223 = r216;
    L51:
        AbstractC0828TB.m1648q(0, r1015, this, r73);
        if (r19 == false) goto L65;
        int r217 = 0;
    L54:
        if (r217 >= r336) goto L65;
        C2454rb r622 = (C2454rb) r1413.get(r217);
        if ((r622 instanceof C2399q5) == false) goto L63;
        C2399q5 r623 = (C2399q5) r622;
        if (r623.m4836U() != 0) goto L63;
        if (r623.m4835T() == false) goto L63;
        AbstractC0828TB.m1648q(1, r1015, r623, r73);
    L63:
        r217 = r217 + 1;
    L65:
        if (r116 != 1) goto L67;
        m4920K(0, m4933k());
    L68:
        int r218 = 0;
        boolean r624 = false;
        boolean r117 = false;
    L69:
        if (r218 >= r336) goto L92;
        C2454rb r1512 = (C2454rb) r1413.get(r218);
        int r192 = r218;
        if ((r1512 instanceof C2150kk) == false) goto L87;
        C2150kk r1513 = (C2150kk) r1512;
        if (r1513.f7522u0 != 0) goto L91;
        int r219 = r1513.f7519r0;
        if (r219 == (-1)) goto L78;
        r1513.m4337R(r219);
    L85:
        r624 = true;
        goto L91
    L78:
        if (r1513.f7520s0 == (-1)) goto L83;
        if (mo4335B() == false) goto L83;
        r1513.m4337R(m4933k() - r1513.f7520s0);
    L83:
        if (mo4335B() == false) goto L85;
        r1513.m4337R((int) ((r1513.f7518q0 * m4933k()) + 0.5f));
    L91:
        r218 = r192 + 1;
        goto L69
    L87:
        if ((r1512 instanceof C2399q5) == false) goto L91;
        if (((C2399q5) r1512).m4836U() != 1) goto L91;
        r117 = true;
        goto L91
    L92:
        if (r624 == false) goto L101;
        int r220 = 0;
    L94:
        if (r220 >= r336) goto L101;
        C2454rb r625 = (C2454rb) r1413.get(r220);
        if ((r625 instanceof C2150kk) == false) goto L100;
        C2150kk r626 = (C2150kk) r625;
        if (r626.f7522u0 != 0) goto L100;
        AbstractC0828TB.m1633K(1, r1015, r626);
    L100:
        r220 = r220 + 1;
    L101:
        AbstractC0828TB.m1633K(0, r1015, this);
        if (r117 == false) goto L113;
        int r221 = 0;
    L104:
        if (r221 >= r336) goto L113;
        C2454rb r627 = (C2454rb) r1413.get(r221);
        if ((r627 instanceof C2399q5) == false) goto L112;
        C2399q5 r628 = (C2399q5) r627;
        if (r628.m4836U() != 1) goto L112;
        if (r628.m4835T() == false) goto L112;
        AbstractC0828TB.m1633K(1, r1015, r628);
    L112:
        r221 = r221 + 1;
    L113:
        int r224 = 0;
    L114:
        if (r224 >= r336) goto L127;
        C2454rb r629 = (C2454rb) r1413.get(r224);
        if (r629.m4946z() == false) goto L126;
        if (AbstractC0828TB.m1638e(r629) == false) goto L126;
        m4979V(r629, r1015, AbstractC0828TB.f2609a);
        if ((r629 instanceof C2150kk) == true) goto L122;
        AbstractC0828TB.m1648q(0, r1015, r629, r73);
        AbstractC0828TB.m1633K(0, r1015, r629);
        goto L126
    L122:
        if (((C2150kk) r629).f7522u0 != 0) goto L124;
        AbstractC0828TB.m1633K(0, r1015, r629);
        goto L126
    L124:
        AbstractC0828TB.m1648q(0, r1015, r629, r73);
    L126:
        r224 = r224 + 1;
        goto L114
    L127:
        int r225 = 0;
    L128:
        if (r225 >= r4) goto L150;
        C2454rb r337 = (C2454rb) this.f8774q0.get(r225);
        if (r337.m4946z() == false) goto L148;
        if ((r337 instanceof C2150kk) == true) goto L148;
        if ((r337 instanceof C2399q5) == true) goto L148;
        if ((r337 instanceof C0368Ih) == true) goto L148;
        if (r337.f8585F == true) goto L148;
        int r630 = r337.m4932j(0);
        int r74 = r337.m4932j(1);
        if (r630 == 3) goto L142;
    L147:
        m4979V(r337, this.f8778u0, new C0178E5());
        goto L148
    L142:
        if (r337.f8639r == 1) goto L147;
        if (r74 != 3) goto L147;
        if (r337.f8640s == 1) goto L147;
    L148:
        r225 = r225 + 1;
        goto L128
    L67:
        r12.m2391l(0);
        this.f8605Z = 0;
        goto L68
    L12:
        r13.m2391l(0);
        this.f8604Y = 0;
        goto L13
    }

    /* JADX INFO: renamed from: W */
    public final boolean m4984W(int r2) {
        if ((this.f8765D0 & r2) != r2) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: n */
    public final void mo4936n(StringBuilder r4) {
        r4.append(this.f8624j + ":{\n");
        StringBuilder r0 = new StringBuilder("  actualWidth:");
        r0.append(this.f8600U);
        r4.append(r0.toString());
        r4.append("\n");
        r4.append("  actualHeight:" + this.f8601V);
        r4.append("\n");
        Iterator r02 = this.f8774q0.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((C2454rb) r02.next()).mo4936n(r4);
        r4.append(",\n");
        goto L4
    L6:
        r4.append("}");
    }
}
