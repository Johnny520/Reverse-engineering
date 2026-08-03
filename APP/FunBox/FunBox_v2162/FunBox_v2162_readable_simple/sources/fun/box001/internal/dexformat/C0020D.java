package fun.box001.internal.dexformat;

import fun.box001.internal.collections.C0016a;
import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.annotations.C0117b;
import fun.box001.internal.dexformat.output.C0205g;
import fun.box001.internal.dexformat.writer.AbstractC0156g;
import fun.box001.internal.dexformat.writer.C0150a;
import fun.box001.internal.dexformat.writer.C0152c;
import fun.box001.internal.dexformat.writer.C0157h;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;

/* JADX INFO: renamed from: e.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0020D {

    /* JADX INFO: renamed from: a */
    private final C0117b f73a;

    /* JADX INFO: renamed from: b */
    private final int f74b;

    /* JADX INFO: renamed from: c */
    private final C0024a f75c;

    /* JADX INFO: renamed from: d */
    private final C0046w f76d;

    /* JADX INFO: renamed from: e */
    private final C0019C f77e;

    /* JADX INFO: renamed from: f */
    private final int f78f;

    /* JADX INFO: renamed from: g */
    private int[] f79g;

    /* JADX INFO: renamed from: h */
    private final int f80h;

    /* JADX INFO: renamed from: i */
    private final boolean f81i;

    private C0020D(C0117b r11, int r12, C0016a r13) {
        this.f73a = r11;
        this.f74b = 1;
        this.f75c = new C0024a(r11);
        this.f80h = r12;
        this.f79g = null;
        int r2 = 0;
        boolean[] r1 = {true};
        int r0 = r11.m341a().m358J();
        C0152c r3 = r11.m341a();
        C0018B r4 = new C0018B(r1, r0, r12);
        int r02 = r3.m504B();
        int r5 = 0;
    L3:
        if (r5 >= r02) goto L8;
        C0157h r6 = r3.m511n(r5).m349b();
        int r7 = r6.m504B();
        int r8 = 0;
    L5:
        if (r8 >= r7) goto L7;
        r6.m512o(r8).mo363b(r4);
        r8 = r8 + 1;
        goto L5
    L7:
        r5 = r5 + 1;
        goto L3
    L8:
        boolean r03 = r1[0];
        this.f81i = r03;
        C0152c r112 = r11.m341a();
        int r62 = r112.m504B() * 3;
        int r52 = r112.m357I() + r62;
        int r113 = r112.m358J();
        if (r03 == true) goto L12;
        r2 = r12;
    L12:
        int r72 = r113 + r2;
        this.f78f = r72;
        C0046w r114 = new C0046w(r13, r52, r62, r72, r12);
        this.f76d = r114;
        this.f77e = new C0019C(this, r114);
    }

    /* JADX INFO: renamed from: a */
    static /* bridge */ /* synthetic */ C0024a m75a(C0020D r0) {
        return r0.f75c;
    }

    /* JADX INFO: renamed from: b */
    static /* bridge */ /* synthetic */ C0117b m76b(C0020D r0) {
        return r0.f73a;
    }

    /* JADX INFO: renamed from: c */
    static /* bridge */ /* synthetic */ int m77c(C0020D r0) {
        return r0.f80h;
    }

    /* JADX INFO: renamed from: d */
    static /* bridge */ /* synthetic */ boolean m78d(C0020D r0) {
        return r0.f81i;
    }

    /* JADX INFO: renamed from: e */
    static /* bridge */ /* synthetic */ int m79e(C0020D r0) {
        return r0.f78f;
    }

    /* JADX INFO: renamed from: f */
    static C0164o m80f(AbstractC0156g r1) {
        return m82h(r1, r1.m368j());
    }

    /* JADX INFO: renamed from: g */
    static /* bridge */ /* synthetic */ C0164o m81g(AbstractC0156g r0, C0162m r1) {
        return m82h(r0, r1);
    }

    /* JADX INFO: renamed from: h */
    private static C0164o m82h(AbstractC0156g r3, C0162m r4) {
        C0164o r0 = r3.m369k();
        if (r3.m366h().m416f() == true) goto L5;
    L9:
        if (r4 != null) goto L12;
        return r0;
    L12:
        return r0.m401M(r4);
    L5:
        if (r0.m504B() != 2) goto L9;
        if (r4.m384i() != r0.m513p(1).m384i()) goto L9;
        r0 = C0164o.m397I(r0.m513p(1), r0.m513p(0));
        goto L9
    }

    /* JADX INFO: renamed from: i */
    public static C0032i m83i(C0117b r17, int r18, C0016a r19) {
        C0020D r1 = new C0020D(r17, r18, r19);
        C0152c r2 = r17.m341a();
        int r3 = r2.m504B();
        int r4 = (r2.m531F() + 31) >> 5;
        int[] r5 = new int[r4];
        int[] r6 = new int[r4];
        int r8 = 0;
    L4:
        if (r8 >= r3) goto L6;
        int r10 = r2.m511n(r8).m350c();
        int r11 = r10 >> 5;
        r5[r11] = (1 << (r10 & 31)) | r5[r11];
        r8 = r8 + 1;
        goto L4
    L6:
        int[] r82 = new int[r3];
        int r102 = r17.m342b();
        int r112 = 0;
    L8:
        if (r102 == (-1)) goto L62;
    L9:
        C0205g r13 = r17.m345e(r102);
        int r14 = r13.m529o();
        int r15 = 0;
    L10:
        if (r15 >= r14) goto L21;
        int r7 = r13.m526l(r15);
        if (RuntimeDexGenerator.m2g(r6, r7) == true) goto L21;
        if (RuntimeDexGenerator.m2g(r5, r7) == false) goto L20;
        if (r2.m359K(r7).m352e() != r102) goto L20;
        int r103 = r7 >> 5;
        r6[r103] = (1 << (r7 & 31)) | r6[r103];
        r102 = r7;
    L20:
        r15 = r15 + 1;
    L21:
        int r72 = -1;
    L22:
        if (r102 == r72) goto L50;
        int r73 = r102 >> 5;
        int r132 = r5[r73];
        int r12 = ~(1 << (r102 & 31));
        r5[r73] = r132 & r12;
        r6[r73] = r12 & r6[r73];
        r82[r112] = r102;
        r112 = r112 + 1;
        C0150a r74 = r2.m359K(r102);
        int r104 = r74.m352e();
        C0205g r122 = r74.m354g();
        int r133 = r122.m529o();
        if (r133 == 0) goto L32;
        if (r133 == 1) goto L29;
        int r134 = -1;
        if (r104 == (-1)) goto L30;
        int r123 = r104;
        int r105 = 0;
    L31:
        C0150a r124 = r2.m359K(r123);
    L33:
        if (r124 == null) goto L51;
        int r125 = r124.m350c();
        int r142 = r74.m352e();
        if (RuntimeDexGenerator.m2g(r5, r125) == true) goto L37;
        if (r142 == r125) goto L43;
        if (r142 < 0) goto L43;
        if (RuntimeDexGenerator.m2g(r5, r142) == false) goto L43;
        r72 = r134;
        r102 = r142;
    L43:
        C0205g r75 = r74.m354g();
        int r126 = r75.m529o();
        int r143 = r105;
    L44:
        if (r143 >= r126) goto L49;
        int r152 = r75.m526l(r143);
        if (RuntimeDexGenerator.m2g(r5, r152) == true) goto L47;
        r143 = r143 + 1;
        goto L44
    L47:
        r72 = r134;
        r102 = r152;
        goto L22
    L49:
        r72 = r134;
        r102 = r72;
        goto L22
    L37:
        r102 = r125;
        r72 = r134;
    L51:
        int r76 = r105;
    L52:
        if (r76 >= r4) goto L61;
        int r127 = r5[r76];
        if (r127 == 0) goto L60;
        int r128 = Integer.numberOfTrailingZeros(r127 & (-1));
        if (r128 != 32) goto L58;
        r128 = r134;
    L58:
        if (r128 < 0) goto L60;
        r102 = (r76 << 5) + r128;
    L60:
        r76 = r76 + 1;
        goto L52
    L61:
        r102 = r134;
    L30:
        r105 = 0;
        r123 = r122.m526l(0);
        goto L31
    L29:
        r134 = -1;
        goto L30
    L32:
        r105 = 0;
        r134 = -1;
        r124 = null;
        goto L33
    L50:
        r134 = r72;
        r105 = 0;
        goto L51
    L62:
        int r106 = 0;
        if (r112 != r3) goto L87;
        r1.f79g = r82;
        C0152c r22 = r17.m341a();
        int[] r32 = r1.f79g;
        int r42 = r32.length;
        int r52 = 0;
    L65:
        C0046w r62 = r1.f76d;
        C0024a r77 = r1.f75c;
        if (r52 >= r42) goto L85;
        int r83 = r52 + 1;
        if (r83 != r32.length) goto L70;
        int r9 = -1;
    L71:
        C0150a r53 = r22.m359K(r32[r52]);
        r62.m195a(r77.m99f(r53));
        C0029f r113 = r77.m97d(r53);
        C0019C r129 = r1.f77e;
        r129.m74g(r53, r113);
        C0157h r114 = r53.m349b();
        int r144 = r114.m504B();
        int r153 = r106;
    L72:
        if (r153 >= r144) goto L74;
        r114.m512o(r153).mo363b(r129);
        r153 = r153 + 1;
        goto L72
    L74:
        r62.m195a(r77.m96c(r53));
        int r107 = r53.m352e();
        AbstractC0156g r115 = r53.m351d();
        if (r107 < 0) goto L83;
        if (r107 == r9) goto L83;
        if (r115.m366h().m412b() == 4) goto L80;
    L82:
        r62.m195a(new C0022F(AbstractC0036m.f137I, r115.m367i(), C0164o.f512c, r77.m98e(r107)));
        goto L83
    L80:
        if (r53.m353f() != r9) goto L82;
        r62.m198d(r77.m98e(r107));
    L83:
        r52 = r83;
        r106 = 0;
        goto L65
    L70:
        r9 = r32[r83];
        goto L71
    L85:
        return new C0032i(r1.f74b, r62.m197c(), new C0024a(r17, r1.f79g, r77));
    L87:
        throw new RuntimeException("shouldn't happen");
    }
}
