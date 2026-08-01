package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tz {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public sz g;
    public final /* synthetic */ RecyclerView h;

    public tz(RecyclerView r2) {
        this.h = r2;
        ArrayList r22 = new ArrayList();
        this.a = r22;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(r22);
        this.e = 2;
        this.f = 2;
    }

    public final void a(b00 r5, boolean r6) {
        RecyclerView.j(r5);
        View r0 = r5.a;
        RecyclerView r1 = this.h;
        d00 r2 = r1.j0;
        if (r2 == null) goto L9;
        c00 r22 = r2.e;
        if (r22 == null) goto L7;
        x r23 = (x) r22.e.remove(r0);
    L8:
        ja0.l(r0, r23);
        goto L9
    L7:
        r23 = null;
    L9:
        if (r6 == true) goto L11;
    L13:
        r5.r = null;
        sz r62 = c();
        r62.getClass();
        int r02 = r5.f;
        ArrayList r12 = r62.a(r02).a;
        if (((rz) r62.a.get(r02)).b > r12.size()) goto L16;
        return;
    L16:
        r5.m();
        r12.add(r5);
        return;
    L11:
        if (r1.c0 == null) goto L13;
        r1.f.J(r5);
        goto L13
    }

    public final int b(int r5) {
        RecyclerView r0 = this.h;
        if (r5 < 0) goto L12;
        if (r5 >= r0.c0.b()) goto L12;
        if (r0.c0.g == true) goto L10;
        return r5;
    L10:
        return r0.d.e(r5, 0);
    L12:
        throw new IndexOutOfBoundsException("invalid position " + r5 + ". State item count is " + r0.c0.b() + r0.y());
    }

    public final sz c() {
        if (this.g != null) goto L6;
        sz r0 = new sz();
        r0.a = new SparseArray();
        r0.b = 0;
        this.g = r0;
    L6:
        return this.g;
    }

    public final void d() {
        ArrayList r0 = this.c;
        int r1 = r0.size() - 1;
    L3:
        if (r1 < 0) goto L5;
        e(r1);
        r1 = r1 - 1;
        goto L3
    L5:
        r0.clear();
        int[] r02 = RecyclerView.s0;
        bn r03 = this.h.b0;
        int[] r12 = r03.c;
        if (r12 == null) goto L8;
        Arrays.fill(r12, -1);
    L8:
        r03.d = 0;
    }

    public final void e(int r4) {
        ArrayList r0 = this.c;
        a((b00) r0.get(r4), true);
        r0.remove(r4);
    }

    public final void f(View r4) {
        b00 r0 = RecyclerView.I(r4);
        boolean r1 = r0.j();
        RecyclerView r2 = this.h;
        if (r1 == false) goto L6;
        r2.removeDetachedView(r4, false);
    L6:
        if (r0.i() == false) goto L9;
        r0.n.j(r0);
    L11:
        g(r0);
        if (r2.H != null) goto L14;
        return;
    L14:
        if (r0.g() == true) goto L18;
        r2.H.d(r0);
        return;
    L18:
        return;
    L9:
        if (r0.p() == false) goto L11;
        r0.j &= -33;
        goto L11
    }

    public final void g(b00 r12) {
        RecyclerView r0 = this.h;
        bn r1 = r0.b0;
        boolean r2 = r12.i();
        View r3 = r12.a;
        boolean r4 = false;
        boolean r5 = true;
        if (r2 == false) goto L5;
    L66:
        StringBuilder r22 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        r22.append(r12.i());
        r22.append(" isAttached:");
        if (r3.getParent() == null) goto L69;
        r4 = true;
    L69:
        r22.append(r4);
        r22.append(r0.y());
        throw new IllegalArgumentException(r22.toString());
    L5:
        if (r3.getParent() != null) goto L66;
        if (r12.j() == true) goto L65;
        if (r12.o() == true) goto L63;
        if ((r12.j & 16) != 0) goto L16;
        WeakHashMap r23 = ja0.a;
        if (s90.i(r3) == false) goto L16;
        boolean r24 = true;
    L18:
        if (r12.g() == true) goto L20;
        r5 = false;
    L56:
        r0.f.J(r12);
        if (r4 == true) goto L77;
        if (r5 == true) goto L78;
        if (r24 == false) goto L79;
        r12.r = null;
        return;
    L79:
        return;
    L78:
        return;
    L77:
        return;
    L20:
        if (this.f > 0) goto L22;
    L50:
        boolean r13 = false;
    L51:
        if (r13 == true) goto L54;
        a(r12, true);
    L53:
        r4 = r13;
        goto L56
    L54:
        r5 = false;
        goto L53
    L22:
        if ((r12.j & 526) != 0) goto L50;
        ArrayList r32 = this.c;
        int r6 = r32.size();
        if (r6 < this.f) goto L28;
        if (r6 <= 0) goto L28;
        e(0);
        r6 = r6 - 1;
    L28:
        int[] r7 = RecyclerView.s0;
        if (r6 <= 0) goto L49;
        int r72 = r12.c;
        if (r1.c == null) goto L38;
        int r8 = r1.d * 2;
        int r9 = 0;
    L33:
        if (r9 >= r8) goto L38;
        if (r1.c[r9] == r72) goto L49;
        r9 = r9 + 2;
    L38:
        int r62 = r6 - 1;
    L39:
        if (r62 < 0) goto L48;
        int r73 = ((b00) r32.get(r62)).c;
        if (r1.c == null) goto L48;
        int r82 = r1.d * 2;
        int r92 = 0;
    L43:
        if (r92 >= r82) goto L48;
        if (r1.c[r92] == r73) goto L46;
        r92 = r92 + 2;
        goto L43
    L46:
        r62 = r62 - 1;
    L48:
        r6 = r62 + 1;
    L49:
        r32.add(r6, r12);
        r13 = true;
    L16:
        r24 = false;
        goto L18
    L63:
        throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + r0.y());
    L65:
        throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + r12 + r0.y());
    }

    public final void h(View r4) {
        b00 r42 = RecyclerView.I(r4);
        int r0 = r42.j & 12;
        RecyclerView r1 = this.h;
        if (r0 != 0) goto L22;
        if (r42.k() == false) goto L22;
        jz r02 = r1.H;
        if (r02 == null) goto L22;
        uf r03 = (uf) r02;
        if (r42.c().isEmpty() == false) goto L22;
        if (r03.g == false) goto L22;
        if (r42.f() == true) goto L22;
        if (this.b != null) goto L19;
        this.b = new ArrayList();
    L19:
        r42.n = this;
        r42.o = true;
        this.b.add(r42);
        return;
    L22:
        if (r42.f() == true) goto L24;
    L30:
        r42.n = this;
        r42.o = false;
        this.a.add(r42);
        return;
    L24:
        if (r42.h() == true) goto L30;
        if (r1.k.b == true) goto L30;
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + r1.y());
    }

    public final b00 i(int r28, long r29) {
        RecyclerView r2 = this.h;
        yz r3 = r2.c0;
        if (r28 < 0) goto L310;
        if (r28 >= r3.b()) goto L310;
        if (r3.g == false) goto L39;
        ArrayList r4 = this.b;
        if (r4 == null) goto L35;
        int r42 = r4.size();
        if (r42 == 0) goto L35;
        int r9 = 0;
    L14:
        if (r9 >= r42) goto L22;
        b00 r10 = (b00) this.b.get(r9);
        if (r10.p() == true) goto L20;
        if (r10.b() != r28) goto L20;
        r10.a(32);
    L36:
        if (r10 == null) goto L38;
        boolean r43 = true;
    L40:
        ArrayList r92 = this.a;
        ArrayList r11 = this.c;
        if (r10 != null) goto L127;
        int r102 = r92.size();
        int r12 = 0;
    L43:
        if (r12 >= r102) goto L56;
        b00 r13 = (b00) r92.get(r12);
        if (r13.p() == true) goto L55;
        if (r13.b() != r28) goto L55;
        if (r13.f() == true) goto L55;
        if (r3.g == true) goto L54;
        if (r13.h() == true) goto L55;
    L54:
        r13.a(32);
        r10 = r13;
        boolean r16 = true;
    L98:
        if (r10 == null) goto L129;
        if (r10.h() == false) goto L102;
        boolean r7 = r3.g;
    L116:
        if (r7 == true) goto L124;
        r10.a(4);
        if (r10.i() == false) goto L121;
        r2.removeDetachedView(r10.a, false);
        r10.n.j(r10);
    L123:
        g(r10);
        r10 = null;
        goto L129
    L121:
        if (r10.p() == false) goto L123;
        r10.j &= -33;
        goto L123
    L124:
        r43 = r16;
        goto L129
    L102:
        int r72 = r10.c;
        if (r72 < 0) goto L126;
        if (r72 >= r2.k.a()) goto L126;
        if (r3.g == true) goto L111;
        r2.k.getClass();
        if (r10.f == 0) goto L111;
    L110:
        r7 = false;
    L111:
        fz r73 = r2.k;
        if (r73.b == true) goto L114;
    L115:
        r7 = r16;
        goto L116
    L114:
        if (r10.e != r73.b(r10.c)) goto L110;
    L126:
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + r10 + r2.y());
    L129:
        if (r10 != null) goto L216;
        int r74 = r2.d.e(r28, 0);
        if (r74 < 0) goto L215;
        long r21 = 3;
        if (r74 >= r2.k.a()) goto L215;
        r2.k.getClass();
        fz r122 = r2.k;
        if (r122.b == false) goto L166;
        long r123 = r122.b(r74);
        int r103 = r92.size() - 1;
    L137:
        if (r103 < 0) goto L152;
        long r24 = 4;
        b00 r14 = (b00) r92.get(r103);
        int r23 = r74;
        long r6 = r14.e;
        View r15 = r14.a;
        if (r6 != r123) goto L151;
        if (r14.p() == true) goto L151;
        if (r14.f == 0) goto L144;
        r92.remove(r103);
        r2.removeDetachedView(r15, false);
        b00 r62 = RecyclerView.I(r15);
        r62.n = null;
        r62.o = false;
        r62.j &= -33;
        g(r62);
        goto L151
    L144:
        r14.a(32);
        if (r14.h() == true) goto L147;
    L149:
        r10 = r14;
    L164:
        if (r10 == null) goto L167;
        r10.c = r23;
        r43 = r16;
    L167:
        if (r10 != null) goto L182;
        rz r5 = (rz) c().a.get(0);
        if (r5 == null) goto L178;
        ArrayList r52 = r5.a;
        if (r52.isEmpty() == true) goto L178;
        int r63 = r52.size() - 1;
    L173:
        if (r63 < 0) goto L178;
        if (((b00) r52.get(r63)).d() == false) goto L176;
        r63 = r63 - 1;
        goto L173
    L176:
        b00 r26 = (b00) r52.remove(r63);
    L179:
        if (r26 == null) goto L181;
        r26.m();
        int[] r53 = RecyclerView.s0;
    L181:
        r10 = r26;
    L178:
        r26 = null;
    L182:
        if (r10 != null) goto L213;
        long r54 = r2.getNanoTime();
        if (r29 == Long.MAX_VALUE) goto L195;
        long r93 = this.g.a(0).c;
        if (r93 != 0) goto L188;
    L191:
        boolean r75 = r16;
    L192:
        if (r75 == true) goto L195;
        return null;
    L188:
        if ((r93 + r54) < r29) goto L191;
        r75 = false;
    L195:
        x r152 = null;
        fz r76 = r2.k;
        r76.getClass();
        int r104 = n70.a;     // Catch: Throwable -> L207
        m70.a("RV CreateView");     // Catch: Throwable -> L207
        r10 = r76.d(r2);     // Catch: Throwable -> L207
        View r77 = r10.a;     // Catch: Throwable -> L207
        if (r77.getParent() != null) goto L210;
        r10.f = 0;     // Catch: Throwable -> L207
        m70.b();
        int[] r94 = RecyclerView.s0;
        RecyclerView r78 = RecyclerView.D(r77);
        if (r78 == null) goto L202;
        r10.b = new WeakReference(r78);
    L202:
        long r112 = r2.getNanoTime() - r54;
        rz r55 = this.g.a(0);
        long r64 = r55.c;
        if (r64 == 0) goto L206;
        r112 = (r112 / r24) + ((r64 / r24) * 3);
    L206:
        r55.c = r112;
    L217:
        View r56 = r10.a;
        if (r43 == false) goto L230;
        if (r3.g == true) goto L230;
        int r65 = r10.j;
        if ((r65 & 8192) == 0) goto L224;
        boolean r79 = r16;
    L225:
        if (r79 == false) goto L230;
        r10.j = r65 & (-8193);
        if (r3.j == false) goto L230;
        jz.b(r10);
        jz r66 = r2.H;
        r10.c();
        r66.getClass();
        lw r67 = new lw();
        r67.a(r10);
        r2.T(r10, r67);
        goto L230
    L224:
        r79 = false;
    L230:
        if (r3.g == false) goto L235;
        if (r10.e() == false) goto L235;
        r10.g = r28;
    L244:
        boolean r0 = false;
        boolean r710 = r16;
    L295:
        ViewGroup.LayoutParams r32 = r56.getLayoutParams();
        if (r32 != null) goto L299;
        oz r22 = (oz) r2.generateDefaultLayoutParams();
        r56.setLayoutParams(r22);
    L302:
        r22.a = r10;
        if (r43 == false) goto L306;
        if (r0 == false) goto L306;
    L307:
        r22.d = r710;
        return r10;
    L306:
        r710 = false;
        goto L307
    L299:
        if (r2.checkLayoutParams(r32) == true) goto L301;
        r22 = (oz) r2.generateLayoutParams(r32);
        r56.setLayoutParams(r22);
        goto L302
    L301:
        r22 = (oz) r32;
    L235:
        if (r10.e() == true) goto L237;
    L245:
        int r68 = r2.d.e(r28, 0);
        r10.r = r2;
        int r711 = r10.f;
        long r113 = r2.getNanoTime();
        if (r29 == Long.MAX_VALUE) goto L251;
        long r132 = this.g.a(r711).d;
        if (r132 == 0) goto L251;
        if ((r132 + r113) >= r29) goto L244;
    L251:
        fz r712 = r2.k;
        r712.getClass();
        r10.c = r68;
        if (r712.b == false) goto L254;
        r10.e = r712.b(r68);
    L254:
        r10.j = (r10.j & (-520)) | 1;
        int r95 = n70.a;
        m70.a("RV OnBindView");
        r10.c();
        r712.c(r10, r68);
        ArrayList r69 = r10.k;
        if (r69 == null) goto L257;
        r69.clear();
    L257:
        r10.j &= -1025;
        ViewGroup.LayoutParams r610 = r56.getLayoutParams();
        if ((r610 instanceof oz) == false) goto L260;
        ((oz) r610).c = r16;
    L260:
        m70.b();
        long r611 = r2.getNanoTime() - r113;
        rz r96 = this.g.a(r10.f);
        long r114 = r96.d;
        if (r114 == 0) goto L264;
        r611 = (r611 / r24) + ((r114 / r24) * r21);
    L264:
        r96.d = r611;
        AccessibilityManager r612 = r2.x;
        if (r612 != null) goto L267;
    L269:
        boolean r713 = false;
    L270:
        if (r713 == false) goto L290;
        WeakHashMap r613 = ja0.a;
        r710 = true;
        if (s90.c(r56) != 0) goto L274;
        s90.s(r56, 1);
    L274:
        d00 r614 = r2.j0;
        if (r614 == null) goto L292;
        c00 r615 = r614.e;
        if (r615 == null) goto L289;
        View.AccessibilityDelegate r97 = ja0.c(r56);
        if (r97 != null) goto L283;
    L286:
        if (r152 == null) goto L289;
        if (r152 == r615) goto L289;
        r615.e.put(r56, r152);
        goto L289
    L283:
        if ((r97 instanceof v) == false) goto L285;
        r152 = ((v) r97).a;
        goto L286
    L285:
        r152 = new x(r97);
    L289:
        ja0.l(r56, r615);
    L292:
        if (r3.g == false) goto L294;
        r10.g = r28;
    L294:
        r0 = r710;
        goto L295
    L290:
        r710 = true;
        goto L292
    L267:
        if (r612.isEnabled() == false) goto L269;
        r713 = true;
        goto L270
    L237:
        if ((r10.j & 2) == 0) goto L239;
        boolean r616 = r16;
    L240:
        if (r616 == true) goto L245;
        if (r10.f() == false) goto L244;
    L239:
        r616 = false;
        goto L240
    L210:
        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");     // Catch: Throwable -> L207
    L207:
        th = move-exception;
        int r25 = n70.a;
        m70.b();
        throw th;
    L213:
        r152 = null;
        goto L217
    L147:
        if (r3.g == true) goto L149;
        r14.j = (r14.j & (-15)) | 2;
    L151:
        r103 = r103 - 1;
        r74 = r23;
        goto L137
    L152:
        r23 = r74;
        r24 = 4;
        int r57 = r11.size() - 1;
    L153:
        if (r57 < 0) goto L162;
        b00 r617 = (b00) r11.get(r57);
        if (r617.e != r123) goto L163;
        if (r617.d() == true) goto L163;
        if (r617.f != 0) goto L161;
        r11.remove(r57);
        r10 = r617;
        goto L164
    L161:
        e(r57);
    L163:
        r57 = r57 - 1;
    L162:
        r10 = null;
        goto L164
    L166:
        r24 = 4;
    L215:
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + r28 + "(offset:" + r74 + ").state:" + r3.b() + r2.y());
    L216:
        r152 = null;
        r21 = 3;
        r24 = 4;
    L55:
        r12 = r12 + 1;
        goto L43
    L56:
        ArrayList r105 = (ArrayList) r2.e.d;
        int r124 = r105.size();
        int r133 = 0;
    L57:
        if (r133 >= r124) goto L66;
        View r142 = (View) r105.get(r133);
        b00 r153 = RecyclerView.I(r142);
        r16 = true;
        if (r153.b() != r28) goto L65;
        if (r153.f() == true) goto L65;
        if (r153.h() == true) goto L65;
    L67:
        if (r142 == null) goto L87;
        b00 r714 = RecyclerView.I(r142);
        r5 r106 = r2.e;
        fa r125 = (fa) r106.c;
        int r134 = ((ez) r106.b).a.indexOfChild(r142);
        if (r134 < 0) goto L86;
        if (r125.d(r134) == false) goto L84;
        r125.a(r134);
        r106.B(r142);
        r5 r107 = r2.e;
        fa r126 = (fa) r107.c;
        int r108 = ((ez) r107.b).a.indexOfChild(r142);
        if (r108 != (-1)) goto L76;
    L74:
        int r109 = -1;
    L79:
        if (r109 == (-1)) goto L82;
        r2.e.d(r109);
        h(r142);
        r714.a(8224);
        r10 = r714;
        goto L98
    L82:
        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + r714 + r2.y());
    L76:
        if (r126.d(r108) == true) goto L74;
        r109 = r108 - r126.b(r108);
        goto L79
    L84:
        throw new RuntimeException("trying to unhide a view that was not hidden" + r142);
    L86:
        throw new IllegalArgumentException("view is not a child, cannot hide " + r142);
    L87:
        int r715 = r11.size();
        int r1010 = 0;
    L88:
        if (r1010 >= r715) goto L97;
        b00 r127 = (b00) r11.get(r1010);
        if (r127.f() == true) goto L96;
        if (r127.b() != r28) goto L96;
        if (r127.d() == true) goto L96;
        r11.remove(r1010);
        r10 = r127;
    L96:
        r1010 = r1010 + 1;
        goto L88
    L97:
        r10 = null;
    L65:
        r133 = r133 + 1;
        goto L57
    L66:
        r16 = true;
        r142 = null;
        goto L67
    L127:
        r16 = true;
        goto L129
    L38:
        r43 = false;
    L20:
        r9 = r9 + 1;
        goto L14
    L22:
        if (r2.k.b == false) goto L35;
        int r98 = r2.d.e(r28, 0);
        if (r98 <= 0) goto L35;
        if (r98 >= r2.k.a()) goto L35;
        long r99 = r2.k.b(r98);
        int r115 = 0;
    L28:
        if (r115 >= r42) goto L35;
        b00 r128 = (b00) this.b.get(r115);
        if (r128.p() == true) goto L34;
        if (r128.e != r99) goto L34;
        r128.a(32);
        r10 = r128;
    L34:
        r115 = r115 + 1;
    L35:
        r10 = null;
        goto L36
    L39:
        r43 = false;
        r10 = null;
    L310:
        throw new IndexOutOfBoundsException("Invalid item position " + r28 + "(" + r28 + "). Item count:" + r3.b() + r2.y());
    }

    public final void j(b00 r2) {
        if (r2.o == false) goto L5;
        this.b.remove(r2);
    L6:
        r2.n = null;
        r2.o = false;
        r2.j &= -33;
        return;
    L5:
        this.a.remove(r2);
        goto L6
    }

    public final void k() {
        nz r0 = this.h.l;
        if (r0 == null) goto L5;
        int r02 = r0.j;
    L6:
        this.f = this.e + r02;
        ArrayList r03 = this.c;
        int r1 = r03.size() - 1;
    L7:
        if (r1 < 0) goto L11;
        if (r03.size() <= this.f) goto L14;
        e(r1);
        r1 = r1 - 1;
        goto L7
    L14:
        return;
    L11:
        return;
    L5:
        r02 = 0;
        goto L6
    }
}
