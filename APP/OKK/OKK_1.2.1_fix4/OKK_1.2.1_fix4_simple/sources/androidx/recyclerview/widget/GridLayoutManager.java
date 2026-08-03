package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import p006D.C0095d;
import p008E.C0156j;
import p034S.AbstractC0324d;
import p037U.AbstractC0343C;
import p037U.C0344D;
import p037U.C0349I;
import p037U.C0352L;
import p037U.C0379o;
import p037U.C0382r;
import p037U.C0383s;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: A */
    public final Rect f1519A;

    /* JADX INFO: renamed from: v */
    public int f1520v;

    /* JADX INFO: renamed from: w */
    public int[] f1521w;

    /* JADX INFO: renamed from: x */
    public final SparseIntArray f1522x;

    /* JADX INFO: renamed from: y */
    public final SparseIntArray f1523y;

    /* JADX INFO: renamed from: z */
    public final C0095d f1524z;

    public GridLayoutManager(Context r3, AttributeSet r4, int r5, int r6) {
        super(r3, r4, r5, r6);
        this.f1520v = -1;
        this.f1522x = new SparseIntArray();
        this.f1523y = new SparseIntArray();
        this.f1524z = new C0095d(11);
        this.f1519A = new Rect();
        m1271E0(AbstractC0343C.m766E(r3, r4, r5, r6).f851c);
    }

    /* JADX INFO: renamed from: A0 */
    public final int m1267A0(C0349I r2, C0352L r3, int r4) {
        boolean r32 = r3.f698f;
        C0095d r02 = this.f1524z;
        if (r32 == true) goto L6;
        int r22 = this.f1520v;
        r02.getClass();
        return C0095d.m337x(r4, r22);
    L6:
        int r23 = r2.m822b(r4);
        if (r23 != (-1)) goto L10;
        return 0;
    L10:
        int r33 = this.f1520v;
        r02.getClass();
        return C0095d.m337x(r23, r33);
    }

    /* JADX INFO: renamed from: B0 */
    public final int m1268B0(C0349I r3, C0352L r4, int r5) {
        boolean r42 = r4.f698f;
        C0095d r02 = this.f1524z;
        if (r42 == true) goto L6;
        int r32 = this.f1520v;
        r02.getClass();
        return r5 % r32;
    L6:
        int r43 = this.f1523y.get(r5, -1);
        if (r43 == (-1)) goto L9;
        return r43;
    L9:
        int r33 = r3.m822b(r5);
        if (r33 != (-1)) goto L13;
        return 0;
    L13:
        int r44 = this.f1520v;
        r02.getClass();
        return r33 % r44;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m1269C0(C0349I r4, C0352L r5, int r6) {
        boolean r52 = r5.f698f;
        C0095d r02 = this.f1524z;
        if (r52 == true) goto L6;
        r02.getClass();
        return 1;
    L6:
        int r53 = this.f1522x.get(r6, -1);
        if (r53 == (-1)) goto L10;
        return r53;
    L10:
        if (r4.m822b(r6) != (-1)) goto L12;
        return 1;
    L12:
        r02.getClass();
        return 1;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m1270D0(View r9, int r10, boolean r11) {
        C0379o r02 = (C0379o) r9.getLayoutParams();
        Rect r1 = r02.f677a;
        int r2 = ((r1.top + r1.bottom) + ((ViewGroup.MarginLayoutParams) r02).topMargin) + ((ViewGroup.MarginLayoutParams) r02).bottomMargin;
        int r3 = ((r1.left + r1.right) + ((ViewGroup.MarginLayoutParams) r02).leftMargin) + ((ViewGroup.MarginLayoutParams) r02).rightMargin;
        int r12 = m1276z0(r02.f838d, r02.f839e);
        if (this.f1525k != 1) goto L5;
        int r102 = AbstractC0343C.m769s(false, r12, r10, r3, ((ViewGroup.MarginLayoutParams) r02).width);
        int r03 = AbstractC0343C.m769s(true, this.f1527m.m974l(), this.f674h, r2, ((ViewGroup.MarginLayoutParams) r02).height);
    L6:
        C0344D r13 = (C0344D) r9.getLayoutParams();
        if (r11 == false) goto L9;
        boolean r112 = m798b0(r9, r102, r03, r13);
    L10:
        if (r112 == false) goto L13;
        r9.measure(r102, r03);
        return;
    L13:
        return;
    L9:
        r112 = m796a0(r9, r102, r03, r13);
        goto L10
    L5:
        int r103 = AbstractC0343C.m769s(false, r12, r10, r2, ((ViewGroup.MarginLayoutParams) r02).height);
        int r04 = AbstractC0343C.m769s(true, this.f1527m.m974l(), this.f673g, r3, ((ViewGroup.MarginLayoutParams) r02).width);
        r03 = r103;
        r102 = r04;
        goto L6
    }

    /* JADX INFO: renamed from: E0 */
    public final void m1271E0(int r3) {
        if (r3 != this.f1520v) goto L6;
        return;
    L6:
        if (r3 < 1) goto L10;
        this.f1520v = r3;
        this.f1524z.m358y();
        m793Y();
        return;
    L10:
        throw new IllegalArgumentException(AbstractC0324d.m720c("Span count should be at least 1. Provided ", r3));
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: F */
    public final int mo775F(C0349I r3, C0352L r4) {
        if (this.f1525k != 0) goto L7;
        return this.f1520v;
    L7:
        if (r4.m832a() >= 1) goto L11;
        return 0;
    L11:
        return m1267A0(r3, r4, r4.m832a() - 1) + 1;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m1272F0() {
        if (this.f1525k != 1) goto L6;
        int r02 = this.f675i - m773B();
        int r1 = m772A();
    L7:
        m1275y0(r02 - r1);
        return;
    L6:
        r02 = this.f676j - m818z();
        r1 = m774C();
        goto L7
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: L */
    public final View mo780L(View r23, int r24, C0349I r25, C0352L r26) {
        C0349I r1 = r25;
        C0352L r2 = r26;
        RecyclerView r3 = this.f668b;
        View r4 = null;
        if (r3 == null) goto L5;
        View r32 = r3.m1325q(r23);
        if (r32 == null) goto L5;
        if (this.f667a.m654q(r32) == true) goto L5;
    L12:
        if (r32 != null) goto L14;
        return null;
    L14:
        C0379o r6 = (C0379o) r32.getLayoutParams();
        int r7 = r6.f838d;
        int r62 = r6.f839e + r7;
        if (super.mo780L(r23, r24, r25, r26) != null) goto L18;
        return null;
    L18:
        if (m1281g0(r24) != 1) goto L20;
        boolean r5 = true;
    L22:
        if (r5 == this.f1529o) goto L24;
        int r52 = m813r() - 1;
        int r10 = -1;
        int r12 = -1;
    L26:
        if (this.f1525k == 1) goto L28;
    L30:
        boolean r13 = false;
    L31:
        int r14 = m1267A0(r1, r2, r52);
        int r8 = -1;
        int r15 = -1;
        int r16 = r12;
        int r9 = 0;
        int r122 = 0;
        int r11 = r52;
        View r53 = null;
    L32:
        if (r11 == r10) goto L35;
        int r17 = r10;
        int r102 = m1267A0(r1, r2, r11);
        View r18 = m812q(r11);
        if (r18 == r32) goto L35;
        if (r18.hasFocusable() == false) goto L43;
        if (r102 == r14) goto L43;
        if (r4 != null) goto L35;
        View r182 = r32;
        View r21 = r53;
    L42:
        int r19 = r9;
    L86:
        r53 = r21;
    L87:
        r11 = r11 + r16;
        r1 = r25;
        r2 = r26;
        r10 = r17;
        r32 = r182;
        r9 = r19;
    L43:
        C0379o r103 = (C0379o) r18.getLayoutParams();
        int r22 = r103.f838d;
        r182 = r32;
        int r33 = r103.f839e + r22;
        if (r18.hasFocusable() == false) goto L49;
        if (r22 != r7) goto L49;
        if (r33 != r62) goto L49;
        return r18;
    L49:
        if (r18.hasFocusable() == false) goto L52;
        if (r4 != null) goto L52;
    L54:
        r21 = r53;
    L55:
        r19 = r9;
    L83:
        if (r18.hasFocusable() == false) goto L85;
        int r42 = r103.f838d;
        r19 = Math.min(r33, r62) - Math.max(r22, r7);
        r15 = r42;
        r53 = r21;
        r4 = r18;
        goto L87
    L85:
        int r54 = r103.f838d;
        r122 = Math.min(r33, r62) - Math.max(r22, r7);
        r8 = r54;
        r53 = r18;
    L52:
        if (r18.hasFocusable() == true) goto L56;
        if (r53 == null) goto L54;
    L56:
        r21 = r53;
        int r55 = Math.min(r33, r62) - Math.max(r22, r7);
        if (r18.hasFocusable() == false) goto L66;
        if (r55 > r9) goto L55;
        if (r55 != r9) goto L42;
        if (r22 <= r15) goto L63;
        boolean r56 = true;
    L64:
        if (r13 != r56) goto L42;
    L63:
        r56 = false;
        goto L64
    L66:
        if (r4 != null) goto L42;
        r19 = r9;
        if (this.f669c.m4e(r18) == true) goto L70;
    L72:
        boolean r92 = true;
        boolean r20 = false;
    L74:
        if ((!r20) == false) goto L86;
        if (r55 > r122) goto L83;
        if (r55 != r122) goto L86;
        if (r22 <= r8) goto L80;
        boolean r57 = r92;
    L81:
        if (r13 != r57) goto L86;
    L80:
        r57 = false;
        goto L81
    L70:
        if (this.f670d.m4e(r18) == false) goto L72;
        r92 = true;
        r20 = true;
    L35:
        View r212 = r53;
        if (r4 == null) goto L91;
        return r4;
    L91:
        return r212;
    L28:
        if (m1291q0() == false) goto L30;
        r13 = true;
        goto L31
    L24:
        r10 = m813r();
        r12 = 1;
        r52 = 0;
        goto L26
    L20:
        r5 = false;
    L5:
        r32 = null;
        goto L12
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: N */
    public final void mo782N(C0349I r1, C0352L r2, View r3, C0156j r4) {
        ViewGroup.LayoutParams r12 = r3.getLayoutParams();
        if ((r12 instanceof C0379o) == true) goto L6;
        m783O(r3, r4);
        return;
    L6:
        ((C0379o) r12).getClass();
        throw null;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: e */
    public final boolean mo801e(C0344D r1) {
        return r1 instanceof C0379o;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: h */
    public final int mo803h(C0352L r1) {
        return m1279e0(r1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: i */
    public final int mo804i(C0352L r1) {
        return m1280f0(r1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: k */
    public final int mo806k(C0352L r1) {
        return m1279e0(r1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: l */
    public final int mo807l(C0352L r1) {
        return m1280f0(r1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: n */
    public final C0344D mo809n() {
        if (this.f1525k != 0) goto L7;
        return new C0379o(-2, -1);
    L7:
        return new C0379o(-1, -2);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: o */
    public final C0344D mo810o(Context r2, AttributeSet r3) {
        C0379o r02 = new C0379o(r2, r3);
        r02.f838d = -1;
        r02.f839e = 0;
        return r02;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: p */
    public final C0344D mo811p(ViewGroup.LayoutParams r4) {
        if ((r4 instanceof ViewGroup.MarginLayoutParams) == false) goto L6;
        C0379o r02 = new C0379o((ViewGroup.MarginLayoutParams) r4);
        r02.f838d = -1;
        r02.f839e = 0;
        return r02;
    L6:
        C0379o r03 = new C0379o(r4);
        r03.f838d = -1;
        r03.f839e = 0;
        return r03;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: r0 */
    public final void mo1273r0(C0349I r6, C0352L r7, C0383s r8, C0382r r9) {
        boolean r2 = false;
        if (this.f1527m.m972j() == 1073741824) goto L5;
        boolean r02 = true;
    L7:
        if (m813r() <= 0) goto L9;
        int r3 = this.f1521w[this.f1520v];
    L9:
        if (r02 == false) goto L12;
        m1272F0();
    L12:
        if (r8.f862e != 1) goto L14;
        r2 = true;
    L14:
        int r03 = this.f1520v;
        if (r2 == true) goto L18;
        r03 = m1268B0(r6, r7, r8.f861d) + m1269C0(r6, r7, r8.f861d);
    L18:
        if (this.f1520v <= 0) goto L36;
        int r22 = r8.f861d;
        if (r22 < 0) goto L36;
        if (r22 >= r7.m832a()) goto L36;
        if (r03 <= 0) goto L36;
        int r23 = r8.f861d;
        int r72 = m1269C0(r6, r7, r23);
        if (r72 > this.f1520v) goto L35;
        if ((r03 - r72) < 0) goto L36;
        if (r8.m962b(r6) == null) goto L36;
        throw null;
    L35:
        throw new IllegalArgumentException("Item at position " + r23 + " requires " + r72 + " spans but GridLayoutManager has only " + this.f1520v + " spans.");
    L36:
        r9.f855b = true;
        return;
    L5:
        r02 = false;
        goto L7
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: t */
    public final int mo814t(C0349I r3, C0352L r4) {
        if (this.f1525k != 1) goto L7;
        return this.f1520v;
    L7:
        if (r4.m832a() >= 1) goto L11;
        return 0;
    L11:
        return m1267A0(r3, r4, r4.m832a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: w0 */
    public final void mo1274w0(boolean r2) {
        if (r2 == true) goto L6;
        super.mo1274w0(false);
        return;
    L6:
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m1275y0(int r8) {
        int[] r02 = this.f1521w;
        int r1 = this.f1520v;
        int r2 = 1;
        if (r02 != null) goto L5;
    L8:
        r02 = new int[r1 + 1];
    L9:
        int r3 = 0;
        r02[0] = 0;
        int r4 = r8 / r1;
        int r82 = r8 % r1;
        int r5 = 0;
    L10:
        if (r2 > r1) goto L18;
        r3 = r3 + r82;
        if (r3 > 0) goto L14;
    L16:
        int r6 = r4;
    L17:
        r5 = r5 + r6;
        r02[r2] = r5;
        r2 = r2 + 1;
        goto L10
    L14:
        if ((r1 - r3) >= r82) goto L16;
        r6 = r4 + 1;
        r3 = r3 - r1;
        goto L17
    L18:
        this.f1521w = r02;
        return;
    L5:
        if (r02.length != (r1 + 1)) goto L8;
        if (r02[r02.length - 1] == r8) goto L9;
        goto L8
    }

    /* JADX INFO: renamed from: z0 */
    public final int m1276z0(int r4, int r5) {
        if (this.f1525k == 1) goto L5;
    L8:
        int[] r02 = this.f1521w;
        return r02[r5 + r4] - r02[r4];
    L5:
        if (m1291q0() == false) goto L8;
        int[] r03 = this.f1521w;
        int r1 = this.f1520v;
        return r03[r1 - r4] - r03[(r1 - r4) - r5];
    }
}
