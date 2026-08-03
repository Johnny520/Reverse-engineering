package androidx.recyclerview.widget;

import java.util.ArrayList;
import p000.C1017Xm;
import p000.C1067Yt;
import p000.C1347e1;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1152a {

    /* JADX INFO: renamed from: a */
    public final C1067Yt f4011a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4012b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4013c;

    /* JADX INFO: renamed from: d */
    public final C1157f f4014d;

    /* JADX INFO: renamed from: e */
    public final C1017Xm f4015e;

    /* JADX INFO: renamed from: f */
    public int f4016f;

    public C1152a(C1157f r3) {
        this.f4011a = new C1067Yt(30);
        this.f4012b = new ArrayList();
        this.f4013c = new ArrayList();
        this.f4016f = 0;
        this.f4014d = r3;
        this.f4015e = new C1017Xm(10, this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2216a(int r9) {
        ArrayList r0 = this.f4013c;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L17;
        C1347e1 r4 = (C1347e1) r0.get(r3);
        int r5 = r4.f4841a;
        if (r5 == 8) goto L7;
        if (r5 != 1) goto L16;
        int r52 = r4.f4842b;
        int r42 = r4.f4844d + r52;
    L11:
        if (r52 >= r42) goto L16;
        if (m2221f(r52, r3 + 1) == r9) goto L14;
        r52 = r52 + 1;
    L14:
        return true;
    L16:
        r3 = r3 + 1;
        goto L3
    L7:
        if (m2221f(r4.f4844d, r3 + 1) != r9) goto L16;
    L17:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m2217b() {
        ArrayList r0 = this.f4013c;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        this.f4014d.m2244a((C1347e1) r0.get(r3));
        r3 = r3 + 1;
        goto L3
    L5:
        m2226k(r0);
        this.f4016f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2218c() {
        m2217b();
        ArrayList r0 = this.f4012b;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L18;
        C1347e1 r4 = (C1347e1) r0.get(r3);
        int r5 = r4.f4841a;
        C1157f r7 = this.f4014d;
        if (r5 != 1) goto L7;
        r7.m2244a(r4);
        int r52 = r4.f4842b;
        int r42 = r4.f4844d;
        RecyclerView r72 = r7.f4032a;
        r72.offsetPositionRecordsForInsert(r52, r42);
        r72.mItemsAddedOrRemoved = true;
    L17:
        r3 = r3 + 1;
        goto L3
    L7:
        if (r5 != 2) goto L9;
        r7.m2244a(r4);
        int r53 = r4.f4842b;
        int r43 = r4.f4844d;
        RecyclerView r73 = r7.f4032a;
        r73.offsetPositionRecordsForRemove(r53, r43, true);
        r73.mItemsAddedOrRemoved = true;
        r73.mState.f78c += r43;
        goto L17
    L9:
        if (r5 != 4) goto L11;
        r7.m2244a(r4);
        int r54 = r4.f4842b;
        int r8 = r4.f4844d;
        Object r44 = r4.f4843c;
        RecyclerView r74 = r7.f4032a;
        r74.viewRangeUpdate(r54, r8, r44);
        r74.mItemsChanged = true;
        goto L17
    L11:
        if (r5 != 8) goto L17;
        r7.m2244a(r4);
        int r55 = r4.f4842b;
        int r45 = r4.f4844d;
        RecyclerView r75 = r7.f4032a;
        r75.offsetPositionRecordsForMove(r55, r45);
        r75.mItemsAddedOrRemoved = true;
        goto L17
    L18:
        m2226k(r0);
        this.f4016f = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m2219d(C1347e1 r14) {
        int r0 = r14.f4841a;
        if (r0 == 1) goto L35;
        if (r0 == 8) goto L35;
        int r02 = m2227l(r14.f4842b, r0);
        int r2 = r14.f4842b;
        int r3 = r14.f4841a;
        if (r3 == 2) goto L12;
        if (r3 != 4) goto L11;
        int r32 = 1;
    L13:
        int r6 = 1;
        int r7 = 1;
    L14:
        int r8 = r14.f4844d;
        C1067Yt r9 = this.f4011a;
        if (r6 >= r8) goto L30;
        int r82 = m2227l((r32 * r6) + r14.f4842b, r14.f4841a);
        int r11 = r14.f4841a;
        if (r11 == 2) goto L23;
        if (r11 == 4) goto L21;
    L25:
        C1347e1 r03 = m2223h(r14.f4843c, r11, r02, r7);
        m2220e(r03, r2);
        r03.f4843c = null;
        r9.mo1934a(r03);
        if (r14.f4841a != 4) goto L28;
        r2 = r2 + r7;
    L28:
        r7 = 1;
        r02 = r82;
    L29:
        r6 = r6 + 1;
        goto L14
    L21:
        if (r82 != (r02 + 1)) goto L25;
    L24:
        r7 = r7 + 1;
        goto L29
    L23:
        if (r82 != r02) goto L25;
    L30:
        Object r1 = r14.f4843c;
        r14.f4843c = null;
        r9.mo1934a(r14);
        if (r7 <= 0) goto L39;
        C1347e1 r142 = m2223h(r1, r14.f4841a, r02, r7);
        m2220e(r142, r2);
        r142.f4843c = null;
        r9.mo1934a(r142);
        return;
    L39:
        return;
    L11:
        throw new IllegalArgumentException("op should be remove or update." + r14);
    L12:
        r32 = 0;
    L35:
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* JADX INFO: renamed from: e */
    public final void m2220e(C1347e1 r5, int r6) {
        C1157f r0 = this.f4014d;
        r0.m2244a(r5);
        RecyclerView r02 = r0.f4032a;
        int r1 = r5.f4841a;
        if (r1 != 2) goto L5;
        int r52 = r5.f4844d;
        r02.offsetPositionRecordsForRemove(r6, r52, true);
        r02.mItemsAddedOrRemoved = true;
        r02.mState.f78c += r52;
        return;
    L5:
        if (r1 != 4) goto L9;
        r02.viewRangeUpdate(r6, r5.f4844d, r5.f4843c);
        r02.mItemsChanged = true;
        return;
    L9:
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }

    /* JADX INFO: renamed from: f */
    public final int m2221f(int r7, int r8) {
        ArrayList r0 = this.f4013c;
        int r1 = r0.size();
    L3:
        if (r8 >= r1) goto L27;
        C1347e1 r2 = (C1347e1) r0.get(r8);
        int r3 = r2.f4841a;
        if (r3 != 8) goto L14;
        int r32 = r2.f4842b;
        if (r32 != r7) goto L9;
        r7 = r2.f4844d;
    L26:
        r8 = r8 + 1;
        goto L3
    L9:
        if (r32 >= r7) goto L12;
        r7 = r7 - 1;
    L12:
        if (r2.f4844d > r7) goto L26;
        r7 = r7 + 1;
        goto L26
    L14:
        int r4 = r2.f4842b;
        if (r4 > r7) goto L26;
        if (r3 != 2) goto L24;
        int r22 = r2.f4844d;
        if (r7 < (r4 + r22)) goto L20;
        r7 = r7 - r22;
        goto L26
    L20:
        return -1;
    L24:
        if (r3 != 1) goto L26;
        r7 = r7 + r2.f4844d;
        goto L26
    L27:
        return r7;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2222g() {
        if (this.f4012b.size() <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final C1347e1 m2223h(Object r2, int r3, int r4, int r5) {
        C1347e1 r0 = (C1347e1) this.f4011a.mo1935c();
        if (r0 != null) goto L6;
        C1347e1 r02 = new C1347e1();
        r02.f4841a = r3;
        r02.f4842b = r4;
        r02.f4844d = r5;
        r02.f4843c = r2;
        return r02;
    L6:
        r0.f4841a = r3;
        r0.f4842b = r4;
        r0.f4844d = r5;
        r0.f4843c = r2;
        return r0;
    }

    /* JADX INFO: renamed from: i */
    public final void m2224i(C1347e1 r5) {
        this.f4013c.add(r5);
        int r0 = r5.f4841a;
        C1157f r1 = this.f4014d;
        if (r0 != 1) goto L5;
        int r02 = r5.f4842b;
        int r52 = r5.f4844d;
        RecyclerView r12 = r1.f4032a;
        r12.offsetPositionRecordsForInsert(r02, r52);
        r12.mItemsAddedOrRemoved = true;
        return;
    L5:
        if (r0 != 2) goto L7;
        int r03 = r5.f4842b;
        int r53 = r5.f4844d;
        RecyclerView r13 = r1.f4032a;
        r13.offsetPositionRecordsForRemove(r03, r53, false);
        r13.mItemsAddedOrRemoved = true;
        return;
    L7:
        if (r0 != 4) goto L9;
        int r04 = r5.f4842b;
        int r3 = r5.f4844d;
        Object r54 = r5.f4843c;
        RecyclerView r14 = r1.f4032a;
        r14.viewRangeUpdate(r04, r3, r54);
        r14.mItemsChanged = true;
        return;
    L9:
        if (r0 != 8) goto L13;
        int r05 = r5.f4842b;
        int r55 = r5.f4844d;
        RecyclerView r15 = r1.f4032a;
        r15.offsetPositionRecordsForMove(r05, r55);
        r15.mItemsAddedOrRemoved = true;
        return;
    L13:
        throw new IllegalArgumentException("Unknown update op type for " + r5);
    }

    /* JADX INFO: renamed from: j */
    public final void m2225j() {
        C1017Xm r1 = this.f4015e;
        r1.getClass();
    L3:
        ArrayList r2 = this.f4012b;
        int r3 = r2.size() - 1;
        boolean r6 = false;
    L4:
        int r7 = 8;
        byte r8 = -1;
        if (r3 < 0) goto L12;
        if (((C1347e1) r2.get(r3)).f4841a != 8) goto L10;
        if (r6 == false) goto L11;
    L13:
        int r9 = 2;
        int r10 = 4;
        if (r3 == (-1)) goto L121;
        int r72 = r3 + 1;
        C1152a r11 = (C1152a) r1.f3226b;
        C1067Yt r12 = r11.f4011a;
        C1347e1 r13 = (C1347e1) r2.get(r3);
        C1347e1 r14 = (C1347e1) r2.get(r72);
        int r15 = r14.f4841a;
        if (r15 != 1) goto L17;
        int r4 = r13.f4844d;
        int r5 = r14.f4842b;
        if (r4 >= r5) goto L111;
        int r16 = -1;
    L112:
        int r62 = r13.f4842b;
        if (r62 >= r5) goto L115;
        r16 = r16 + 1;
    L115:
        if (r5 > r62) goto L117;
        r13.f4842b = r62 + r14.f4844d;
    L117:
        int r52 = r14.f4842b;
        if (r52 > r4) goto L120;
        r13.f4844d = r4 + r14.f4844d;
    L120:
        r14.f4842b = r52 + r16;
        r2.set(r3, r14);
        r2.set(r72, r13);
        goto L3
    L111:
        r16 = 0;
        goto L112
    L17:
        if (r15 != 2) goto L18;
        int r82 = r13.f4842b;
        int r102 = r13.f4844d;
        if (r82 >= r102) goto L52;
        if (r14.f4842b == r82) goto L47;
    L50:
        boolean r53 = false;
    L49:
        boolean r83 = false;
    L57:
        int r152 = r14.f4842b;
        if (r102 < r152) goto L59;
        int r63 = r14.f4844d;
        if (r102 >= (r152 + r63)) goto L65;
        r14.f4844d = r63 - 1;
        r13.f4841a = 2;
        r13.f4844d = 1;
        if (r14.f4844d != 0) goto L3;
        r2.remove(r72);
        r14.f4843c = null;
        r12.mo1934a(r14);
    L65:
        int r42 = r13.f4842b;
        int r64 = r14.f4842b;
        if (r42 > r64) goto L69;
        r14.f4842b = r64 + 1;
    L68:
        Object r103 = null;
        C1347e1 r43 = null;
    L73:
        if (r53 == true) goto L74;
        if (r83 == false) goto L89;
        if (r43 == null) goto L83;
        int r54 = r13.f4842b;
        if (r54 <= r43.f4842b) goto L80;
        r13.f4842b = r54 - r43.f4844d;
    L80:
        int r55 = r13.f4844d;
        if (r55 <= r43.f4842b) goto L83;
        r13.f4844d = r55 - r43.f4844d;
    L83:
        int r56 = r13.f4842b;
        if (r56 <= r14.f4842b) goto L86;
        r13.f4842b = r56 - r14.f4844d;
    L86:
        int r57 = r13.f4844d;
        if (r57 <= r14.f4842b) goto L102;
        r13.f4844d = r57 - r14.f4844d;
    L102:
        r2.set(r3, r14);
        if (r13.f4842b == r13.f4844d) goto L105;
        r2.set(r72, r13);
    L106:
        if (r43 == null) goto L3;
        r2.add(r3, r43);
        goto L3
    L105:
        r2.remove(r72);
        goto L106
    L89:
        if (r43 == null) goto L96;
        int r58 = r13.f4842b;
        if (r58 < r43.f4842b) goto L93;
        r13.f4842b = r58 - r43.f4844d;
    L93:
        int r59 = r13.f4844d;
        if (r59 < r43.f4842b) goto L96;
        r13.f4844d = r59 - r43.f4844d;
    L96:
        int r510 = r13.f4842b;
        if (r510 < r14.f4842b) goto L99;
        r13.f4842b = r510 - r14.f4844d;
    L99:
        int r511 = r13.f4844d;
        if (r511 < r14.f4842b) goto L102;
        r13.f4844d = r511 - r14.f4844d;
        goto L102
    L74:
        r2.set(r3, r14);
        r2.remove(r72);
        r13.f4843c = r103;
        r12.mo1934a(r13);
        goto L3
    L69:
        int r65 = r64 + r14.f4844d;
        if (r42 >= r65) goto L68;
        r103 = null;
        C1347e1 r17 = r11.m2223h(null, 2, r42 + 1, r65 - r42);
        r14.f4844d = r13.f4842b - r14.f4842b;
        r43 = r17;
        goto L73
    L59:
        r14.f4842b = r152 - 1;
        goto L65
    L47:
        if (r14.f4844d != (r102 - r82)) goto L50;
        r53 = true;
        goto L49
    L52:
        if (r14.f4842b == (r102 + 1)) goto L54;
    L56:
        r83 = true;
        r53 = false;
        goto L57
    L54:
        if (r14.f4844d != (r82 - r102)) goto L56;
        r53 = true;
        r83 = true;
        goto L57
    L18:
        if (r15 != 4) goto L3;
        int r512 = r13.f4844d;
        int r84 = r14.f4842b;
        if (r512 >= r84) goto L23;
        r14.f4842b = r84 - 1;
    L26:
        C1347e1 r44 = null;
    L27:
        int r513 = r13.f4842b;
        int r85 = r14.f4842b;
        if (r513 > r85) goto L30;
        r14.f4842b = r85 + 1;
    L33:
        C1347e1 r514 = null;
    L34:
        r2.set(r72, r13);
        if (r14.f4844d <= 0) goto L37;
        r2.set(r3, r14);
    L38:
        if (r44 == null) goto L40;
        r2.add(r3, r44);
    L40:
        if (r514 == null) goto L3;
        r2.add(r3, r514);
        goto L3
    L37:
        r2.remove(r3);
        r14.f4843c = null;
        r12.mo1934a(r14);
        goto L38
    L30:
        int r86 = r85 + r14.f4844d;
        if (r513 >= r86) goto L33;
        int r87 = r86 - r513;
        r514 = r11.m2223h(r14.f4843c, 4, r513 + 1, r87);
        r14.f4844d -= r87;
        goto L34
    L23:
        int r92 = r14.f4844d;
        if (r512 >= (r84 + r92)) goto L26;
        r14.f4844d = r92 - 1;
        r44 = r11.m2223h(r14.f4843c, 4, r13.f4842b, 1);
        goto L27
    L121:
        int r18 = r2.size();
        int r32 = 0;
    L122:
        if (r32 >= r18) goto L193;
        C1347e1 r515 = (C1347e1) r2.get(r32);
        int r66 = r515.f4841a;
        if (r66 == 1) goto L191;
        C1067Yt r112 = this.f4011a;
        C1157f r122 = this.f4014d;
        if (r66 == r9) goto L159;
        if (r66 == r10) goto L131;
        if (r66 == r7) goto L130;
    L129:
        int r142 = r9;
    L192:
        r32 = r32 + 1;
        r9 = r142;
        r7 = 8;
        r8 = -1;
        r10 = 4;
        goto L122
    L130:
        m2224i(r515);
        goto L129
    L131:
        int r67 = r515.f4842b;
        int r132 = r515.f4844d + r67;
        int r143 = r67;
        byte r73 = r8;
        int r153 = 0;
    L132:
        if (r67 >= r132) goto L152;
        RecyclerView r88 = r122.f4032a;
        AbstractC1166o r93 = r88.findViewHolderForPosition(r67, true);
        if (r93 != null) goto L136;
    L135:
        r93 = null;
    L139:
        if (r93 != null) goto L147;
        if (m2216a(r67) == true) goto L147;
        if (r73 != 1) goto L146;
        m2224i(m2223h(r515.f4843c, 4, r143, r153));
        r143 = r67;
        r153 = 0;
    L146:
        r73 = 0;
    L150:
        r153 = r153 + 1;
        r67 = r67 + 1;
    L147:
        if (r73 != 0) goto L149;
        m2219d(m2223h(r515.f4843c, 4, r143, r153));
        r143 = r67;
        r153 = 0;
    L149:
        r73 = 1;
        goto L150
    L136:
        C1153b r89 = r88.mChildHelper;
        if (r89.f4019c.contains(r93.itemView) == false) goto L139;
        int r810 = RecyclerView.HORIZONTAL;
        goto L135
    L152:
        if (r153 == r515.f4844d) goto L155;
        Object r68 = r515.f4843c;
        r515.f4843c = null;
        r112.mo1934a(r515);
        r515 = m2223h(r68, 4, r143, r153);
    L155:
        if (r73 != 0) goto L157;
        m2219d(r515);
    L158:
        r142 = 2;
        goto L192
    L157:
        m2224i(r515);
        goto L158
    L159:
        int r69 = r515.f4842b;
        int r74 = r515.f4844d + r69;
        int r94 = r69;
        int r104 = 0;
        byte r133 = -1;
    L160:
        if (r94 >= r74) goto L185;
        RecyclerView r144 = r122.f4032a;
        AbstractC1166o r154 = r144.findViewHolderForPosition(r94, true);
        if (r154 != null) goto L164;
    L163:
        r154 = null;
    L167:
        if (r154 != null) goto L176;
        if (m2216a(r94) == true) goto L176;
        if (r133 != 1) goto L174;
        m2224i(m2223h(null, 2, r69, r104));
        boolean r134 = true;
    L175:
        byte r811 = 0;
    L180:
        if (r134 == false) goto L182;
        r94 = r94 - r104;
        r74 = r74 - r104;
        r104 = 1;
    L183:
        r94 = r94 + 1;
        r133 = r811;
        goto L160
    L182:
        r104 = r104 + 1;
        goto L183
    L174:
        r134 = false;
    L176:
        if (r133 != 0) goto L178;
        m2219d(m2223h(null, 2, r69, r104));
        r134 = true;
    L179:
        r811 = 1;
        goto L180
    L178:
        r134 = false;
        goto L179
    L164:
        C1153b r145 = r144.mChildHelper;
        if (r145.f4019c.contains(r154.itemView) == false) goto L167;
        int r812 = RecyclerView.HORIZONTAL;
        goto L163
    L185:
        if (r104 == r515.f4844d) goto L187;
        r515.f4843c = null;
        r112.mo1934a(r515);
        r142 = 2;
        r515 = m2223h(null, 2, r69, r104);
    L188:
        if (r133 != 0) goto L190;
        m2219d(r515);
        goto L192
    L190:
        m2224i(r515);
        goto L192
    L187:
        r142 = 2;
        goto L188
    L191:
        r142 = r9;
        m2224i(r515);
        goto L192
    L193:
        r2.clear();
        return;
    L11:
        r3 = r3 - 1;
        goto L4
    L10:
        r6 = true;
        goto L11
    L12:
        r3 = -1;
        goto L13
    }

    /* JADX INFO: renamed from: k */
    public final void m2226k(ArrayList r5) {
        int r0 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        C1347e1 r2 = (C1347e1) r5.get(r1);
        r2.f4843c = null;
        this.f4011a.mo1934a(r2);
        r1 = r1 + 1;
        goto L3
    L5:
        r5.clear();
    }

    /* JADX INFO: renamed from: l */
    public final int m2227l(int r10, int r11) {
        ArrayList r0 = this.f4013c;
        int r1 = r0.size() - 1;
    L4:
        if (r1 < 0) goto L40;
        C1347e1 r4 = (C1347e1) r0.get(r1);
        int r5 = r4.f4841a;
        if (r5 != 8) goto L29;
        int r3 = r4.f4842b;
        int r52 = r4.f4844d;
        if (r3 >= r52) goto L10;
        int r7 = r3;
        int r8 = r52;
    L11:
        if (r10 < r7) goto L24;
        if (r10 > r8) goto L24;
        if (r7 != r3) goto L19;
        if (r11 != 1) goto L16;
        r4.f4844d = r52 + 1;
    L18:
        r10 = r10 + 1;
    L39:
        r1 = r1 - 1;
        goto L4
    L16:
        if (r11 != 2) goto L18;
        r4.f4844d = r52 - 1;
        goto L18
    L19:
        if (r11 != 1) goto L21;
        r4.f4842b = r3 + 1;
    L23:
        r10 = r10 - 1;
        goto L39
    L21:
        if (r11 != 2) goto L23;
        r4.f4842b = r3 - 1;
    L24:
        if (r10 >= r3) goto L39;
        if (r11 != 1) goto L27;
        r4.f4842b = r3 + 1;
        r4.f4844d = r52 + 1;
        goto L39
    L27:
        if (r11 != 2) goto L39;
        r4.f4842b = r3 - 1;
        r4.f4844d = r52 - 1;
        goto L39
    L10:
        r8 = r3;
        r7 = r52;
        goto L11
    L29:
        int r32 = r4.f4842b;
        if (r32 > r10) goto L35;
        if (r5 != 1) goto L33;
        r10 = r10 - r4.f4844d;
        goto L39
    L33:
        if (r5 != 2) goto L39;
        r10 = r10 + r4.f4844d;
        goto L39
    L35:
        if (r11 != 1) goto L37;
        r4.f4842b = r32 + 1;
        goto L39
    L37:
        if (r11 != 2) goto L39;
        r4.f4842b = r32 - 1;
        goto L39
    L40:
        int r112 = r0.size() - 1;
    L41:
        if (r112 < 0) goto L52;
        C1347e1 r12 = (C1347e1) r0.get(r112);
        int r2 = r12.f4841a;
        C1067Yt r42 = this.f4011a;
        if (r2 != 8) goto L49;
        int r22 = r12.f4844d;
        if (r22 == r12.f4842b) goto L47;
        if (r22 < 0) goto L47;
    L51:
        r112 = r112 - 1;
    L47:
        r0.remove(r112);
        r12.f4843c = null;
        r42.mo1934a(r12);
        goto L51
    L49:
        if (r12.f4844d > 0) goto L51;
        r0.remove(r112);
        r12.f4843c = null;
        r42.mo1934a(r12);
        goto L51
    L52:
        return r10;
    }
}
