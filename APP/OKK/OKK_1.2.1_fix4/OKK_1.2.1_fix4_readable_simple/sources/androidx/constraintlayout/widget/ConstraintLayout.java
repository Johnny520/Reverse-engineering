package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p000A.C0002c;
import p018J0.C0234d;
import p069m.C0985e;
import p071n.AbstractC1004i;
import p071n.C0999d;
import p071n.C1000e;
import p071n.C1002g;
import p071n.C1003h;
import p073o.AbstractC1024m;
import p073o.C1014c;
import p073o.C1016e;
import p073o.C1018g;
import p073o.C1019h;
import p073o.C1021j;
import p073o.C1023l;
import p075p.AbstractC1037c;
import p075p.AbstractC1038d;
import p075p.AbstractC1049o;
import p075p.AbstractC1052r;
import p075p.C1039e;
import p075p.C1040f;
import p075p.C1041g;
import p075p.C1042h;
import p075p.C1048n;
import p075p.C1050p;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1258a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1259b;

    /* JADX INFO: renamed from: c */
    public final C1000e f1260c;

    /* JADX INFO: renamed from: d */
    public int f1261d;

    /* JADX INFO: renamed from: e */
    public int f1262e;

    /* JADX INFO: renamed from: f */
    public int f1263f;

    /* JADX INFO: renamed from: g */
    public int f1264g;

    /* JADX INFO: renamed from: h */
    public boolean f1265h;

    /* JADX INFO: renamed from: i */
    public int f1266i;

    /* JADX INFO: renamed from: j */
    public C1048n f1267j;

    /* JADX INFO: renamed from: k */
    public C0002c f1268k;

    /* JADX INFO: renamed from: l */
    public int f1269l;

    /* JADX INFO: renamed from: m */
    public HashMap f1270m;

    /* JADX INFO: renamed from: n */
    public final SparseArray f1271n;

    /* JADX INFO: renamed from: o */
    public final C1040f f1272o;

    public ConstraintLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f1258a = new SparseArray();
        this.f1259b = new ArrayList(4);
        this.f1260c = new C1000e();
        this.f1261d = 0;
        this.f1262e = 0;
        this.f1263f = Integer.MAX_VALUE;
        this.f1264g = Integer.MAX_VALUE;
        this.f1265h = true;
        this.f1266i = 263;
        this.f1267j = null;
        this.f1268k = null;
        this.f1269l = -1;
        this.f1270m = new HashMap();
        this.f1271n = new SparseArray();
        this.f1272o = new C1040f(this);
        m1160c(r3, 0);
    }

    /* JADX INFO: renamed from: a */
    public static C1039e m1158a() {
        C1039e r02 = new C1039e(-2, -2);
        r02.f3903a = -1;
        r02.f3905b = -1;
        r02.f3907c = -1.0f;
        r02.f3909d = -1;
        r02.f3911e = -1;
        r02.f3913f = -1;
        r02.f3915g = -1;
        r02.f3917h = -1;
        r02.f3919i = -1;
        r02.f3921j = -1;
        r02.f3923k = -1;
        r02.f3925l = -1;
        r02.f3926m = -1;
        r02.f3927n = 0;
        r02.f3928o = 0.0f;
        r02.f3929p = -1;
        r02.f3930q = -1;
        r02.f3931r = -1;
        r02.f3932s = -1;
        r02.f3933t = -1;
        r02.f3934u = -1;
        r02.f3935v = -1;
        r02.f3936w = -1;
        r02.f3937x = -1;
        r02.f3938y = -1;
        r02.f3939z = 0.5f;
        r02.f3877A = 0.5f;
        r02.f3878B = null;
        r02.f3879C = 1;
        r02.f3880D = -1.0f;
        r02.f3881E = -1.0f;
        r02.f3882F = 0;
        r02.f3883G = 0;
        r02.f3884H = 0;
        r02.f3885I = 0;
        r02.f3886J = 0;
        r02.f3887K = 0;
        r02.f3888L = 0;
        r02.f3889M = 0;
        r02.f3890N = 1.0f;
        r02.f3891O = 1.0f;
        r02.f3892P = -1;
        r02.f3893Q = -1;
        r02.f3894R = -1;
        r02.f3895S = false;
        r02.f3896T = false;
        r02.f3897U = null;
        r02.f3898V = true;
        r02.f3899W = true;
        r02.f3900X = false;
        r02.f3901Y = false;
        r02.f3902Z = false;
        r02.f3904a0 = -1;
        r02.f3906b0 = -1;
        r02.f3908c0 = -1;
        r02.f3910d0 = -1;
        r02.f3912e0 = -1;
        r02.f3914f0 = -1;
        r02.f3916g0 = 0.5f;
        r02.f3924k0 = new C0999d();
        return r02;
    }

    private int getPaddingWidth() {
        int r02 = Math.max(0, getPaddingLeft());
        int r2 = Math.max(0, getPaddingRight()) + r02;
        int r03 = Math.max(0, getPaddingStart());
        int r1 = Math.max(0, getPaddingEnd()) + r03;
        if (r1 > 0) goto L5;
        return r2;
    L5:
        return r1;
    }

    /* JADX INFO: renamed from: b */
    public final C0999d m1159b(View r1) {
        if (r1 == this) goto L4;
        if (r1 != null) goto L8;
        return null;
    L8:
        return ((C1039e) r1.getLayoutParams()).f3924k0;
    L4:
        return this.f1260c;
    }

    /* JADX INFO: renamed from: c */
    public final void m1160c(AttributeSet r8, int r9) {
        C1000e r02 = this.f1260c;
        r02.f3604U = this;
        C1040f r1 = this.f1272o;
        r02.f3642g0 = r1;
        r02.f3641f0.f3741f = r1;
        this.f1258a.put(getId(), this);
        this.f1267j = null;
        boolean r2 = false;
        if (r8 == null) goto L37;
        TypedArray r82 = getContext().obtainStyledAttributes(r8, AbstractC1052r.f4051b, r9, 0);
        int r92 = r82.getIndexCount();
        int r3 = 0;
    L5:
        if (r3 >= r92) goto L36;
        int r4 = r82.getIndex(r3);
        if (r4 != 9) goto L10;
        this.f1261d = r82.getDimensionPixelOffset(r4, this.f1261d);
    L35:
        r3 = r3 + 1;
        goto L5
    L10:
        if (r4 != 10) goto L13;
        this.f1262e = r82.getDimensionPixelOffset(r4, this.f1262e);
        goto L35
    L13:
        if (r4 != 7) goto L16;
        this.f1263f = r82.getDimensionPixelOffset(r4, this.f1263f);
        goto L35
    L16:
        if (r4 != 8) goto L19;
        this.f1264g = r82.getDimensionPixelOffset(r4, this.f1264g);
        goto L35
    L19:
        if (r4 != 89) goto L22;
        this.f1266i = r82.getInt(r4, this.f1266i);
        goto L35
    L22:
        if (r4 != 38) goto L29;
        int r42 = r82.getResourceId(r4, 0);
        if (r42 == 0) goto L35;
        m1161d(r42);     // Catch: Resources.NotFoundException -> L27
    L27:
        this.f1268k = null;
        goto L35
    L29:
        if (r4 != 18) goto L35;
        int r43 = r82.getResourceId(r4, 0);
        C1048n r5 = new C1048n();     // Catch: Resources.NotFoundException -> L33
        this.f1267j = r5;     // Catch: Resources.NotFoundException -> L33
        r5.m2530e(getContext(), r43);     // Catch: Resources.NotFoundException -> L33
    L34:
        this.f1269l = r43;
    L33:
        this.f1267j = null;
        goto L34
    L36:
        r82.recycle();
    L37:
        int r83 = this.f1266i;
        r02.f3651p0 = r83;
        if ((r83 & 256) != 256) goto L40;
        r2 = true;
    L40:
        C0985e.f3485p = r2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof C1039e;
    }

    /* JADX INFO: renamed from: d */
    public final void m1161d(int r10) {
        Context r1 = getContext();
        C0002c r02 = new C0002c(10);
        r02.f7b = new SparseArray();
        r02.f8c = new SparseArray();
        XmlResourceParser r102 = r1.getResources().getXml(r10);
        int r2 = r102.getEventType();     // Catch: IOException -> L16 XmlPullParserException -> L18
        C1041g r3 = null;
    L5:
        if (r2 == 1) goto L49;
        if (r2 != 0) goto L8;
        r102.getName();     // Catch: IOException -> L16 XmlPullParserException -> L18
    L45:
        r2 = r102.next();     // Catch: IOException -> L16 XmlPullParserException -> L18
    L8:
        if (r2 != 2) goto L45;
        String r22 = r102.getName();     // Catch: IOException -> L16 XmlPullParserException -> L18
        switch(r22.hashCode()) {
            case -1349929691: goto L30;
            case 80204913: goto L27;
            case 1382829617: goto L24;
            case 1657696882: goto L21;
            case 1901439077: goto L14;
            default: goto L32;
        };     // Catch: IOException -> L16 XmlPullParserException -> L18
    L32:
        byte r23 = -1;
    L33:
        if (r23 == 0) goto L45;
        if (r23 == 1) goto L45;
        if (r23 == 2) goto L43;
        if (r23 == 3) goto L40;
        if (r23 != 4) goto L45;
        r02.m10k(r1, r102);     // Catch: IOException -> L16 XmlPullParserException -> L18
        goto L45
    L40:
        C1042h r24 = new C1042h(r1, r102);     // Catch: IOException -> L16 XmlPullParserException -> L18
        if (r3 == null) goto L45;
        r3.f3948b.add(r24);     // Catch: IOException -> L16 XmlPullParserException -> L18
        goto L45
    L43:
        r3 = new C1041g(r1, r102);     // Catch: IOException -> L16 XmlPullParserException -> L18
        ((SparseArray) r02.f7b).put(r3.f3947a, r3);     // Catch: IOException -> L16 XmlPullParserException -> L18
        goto L45
    L14:
        if (r22.equals("Variant") == false) goto L32;
        r23 = 3;
        goto L33
    L21:
        if (r22.equals("layoutDescription") == false) goto L32;
        r23 = 0;
        goto L33
    L24:
        if (r22.equals("StateSet") == false) goto L32;
        r23 = 1;
        goto L33
    L27:
        if (r22.equals("State") == false) goto L32;
        r23 = 2;
        goto L33
    L30:
        if (r22.equals("ConstraintSet") == false) goto L32;
        r23 = 4;
    L49:
        this.f1268k = r02;
        return;
    L16:
        e = move-exception;
        e.printStackTrace();
    L18:
        e = move-exception;
        e.printStackTrace();
        goto L49
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r19) {
        ArrayList r2 = this.f1259b;
        if (r2 == null) goto L9;
        int r3 = r2.size();
        if (r3 <= 0) goto L9;
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L9;
        ((AbstractC1037c) r2.get(r4)).getClass();
        r4 = r4 + 1;
    L9:
        super.dispatchDraw(r19);
        if (isInEditMode() == false) goto L24;
        int r22 = getChildCount();
        float r32 = getWidth();
        float r42 = getHeight();
        int r5 = 0;
    L12:
        if (r5 >= r22) goto L32;
        View r6 = getChildAt(r5);
        if (r6.getVisibility() == 8) goto L23;
        Object r62 = r6.getTag();
        if (r62 == null) goto L23;
        if ((r62 instanceof String) == false) goto L23;
        String[] r63 = ((String) r62).split(",");
        if (r63.length != 4) goto L23;
        int r7 = Integer.parseInt(r63[0]);
        int r8 = Integer.parseInt(r63[1]);
        int r9 = Integer.parseInt(r63[2]);
        int r72 = (int) ((r7 / 1080.0f) * r32);
        int r82 = (int) ((r8 / 1920.0f) * r42);
        Paint r15 = new Paint();
        r15.setColor(-65536);
        float r14 = r72;
        float r13 = r82;
        float r73 = r72 + ((int) ((r9 / 1080.0f) * r32));
        r19.drawLine(r14, r13, r73, r13, r15);
        float r64 = r82 + ((int) ((Integer.parseInt(r63[3]) / 1920.0f) * r42));
        r19.drawLine(r73, r13, r73, r64, r15);
        r19.drawLine(r73, r64, r14, r64, r15);
        r19.drawLine(r14, r64, r14, r13, r15);
        r15.setColor(-16711936);
        r19.drawLine(r14, r13, r73, r64, r15);
        r19.drawLine(r14, r64, r73, r13, r15);
    L23:
        r5 = r5 + 1;
        goto L12
    L32:
        return;
    }

    /* JADX INFO: renamed from: e */
    public final void m1162e(C1000e r26, int r27, int r28, int r29) {
        C1000e r1 = r26;
        int r3 = View.MeasureSpec.getMode(r28);
        int r4 = View.MeasureSpec.getSize(r28);
        int r5 = View.MeasureSpec.getMode(r29);
        int r6 = View.MeasureSpec.getSize(r29);
        int r7 = Math.max(0, getPaddingTop());
        int r9 = Math.max(0, getPaddingBottom());
        int r10 = r7 + r9;
        int r11 = getPaddingWidth();
        C1040f r12 = this.f1272o;
        r12.f3941b = r7;
        r12.f3942c = r9;
        r12.f3943d = r11;
        r12.f3944e = r10;
        r12.f3945f = r28;
        r12.f3946g = r29;
        int r92 = Math.max(0, getPaddingStart());
        int r13 = Math.max(0, getPaddingEnd());
        int r14 = 1;
        if (r92 > 0) goto L8;
        if (r13 > 0) goto L8;
        r92 = Math.max(0, getPaddingLeft());
    L12:
        int r42 = r4 - r11;
        int r62 = r6 - r10;
        int r102 = r12.f3944e;
        int r112 = r12.f3943d;
        int r122 = getChildCount();
        if (r3 == Integer.MIN_VALUE) goto L23;
        if (r3 == 0) goto L18;
        if (r3 == 1073741824) goto L17;
        int r17 = 0;
    L26:
        if (r5 == Integer.MIN_VALUE) goto L37;
        if (r5 == 0) goto L32;
        if (r5 == 1073741824) goto L31;
        int r132 = 0;
    L30:
        int r123 = 1;
    L40:
        int r15 = r26.m2407l();
        C1016e r8 = r1.f3641f0;
        int r63 = r17;
        if (r63 != r15) goto L46;
        if (r132 != r26.m2404i()) goto L46;
    L47:
        r1.f3597N = 0;
        r1.f3598O = 0;
        int r152 = this.f1263f - r112;
        int[] r82 = r1.f3633u;
        r82[0] = r152;
        r82[1] = this.f1264g - r102;
        r1.f3600Q = 0;
        r1.f3601R = 0;
        r1.m2418w(r14);
        r1.m2420y(r63);
        r1.m2419x(r123);
        r1.m2417v(r132);
        int r64 = this.f1261d - r112;
        if (r64 >= 0) goto L50;
        r1.f3600Q = 0;
    L51:
        int r65 = this.f1262e - r102;
        if (r65 >= 0) goto L54;
        r1.f3601R = 0;
    L55:
        r1.f3645j0 = r92;
        r1.f3646k0 = r7;
        C0234d r43 = r1.f3640e0;
        r43.getClass();
        C1040f r66 = r1.f3642g0;
        int r72 = r1.f3639d0.size();
        int r93 = r26.m2407l();
        int r103 = r26.m2404i();
        if ((r27 & 128) != 128) goto L58;
        boolean r113 = true;
    L59:
        if (r113 == false) goto L61;
    L64:
        boolean r2 = true;
    L66:
        if (r2 == false) goto L101;
        int r133 = 0;
    L68:
        if (r133 >= r72) goto L101;
        C0999d r142 = (C0999d) r1.f3639d0.get(r133);
        int[] r153 = r142.f3615c0;
        if (r153[0] != 3) goto L73;
        boolean r02 = true;
    L75:
        if (r153[1] != 3) goto L77;
        boolean r154 = true;
    L78:
        if (r02 == false) goto L83;
        if (r154 == false) goto L83;
        if (r142.f3595L <= 0.0f) goto L83;
        boolean r03 = true;
    L85:
        if (r142.m2412q() == false) goto L89;
        if (r03 == false) goto L89;
    L87:
        int r04 = 1073741824;
        r2 = false;
    L102:
        if (r3 != r04) goto L104;
        if (r5 != r04) goto L104;
    L105:
        boolean r05 = true;
    L108:
        if ((r05 & r2) == false) goto L224;
        int r06 = Math.min(r82[0], r42);
        int r83 = Math.min(r82[1], r62);
        if (r3 == 1073741824) goto L112;
    L114:
        if (r5 == 1073741824) goto L116;
    L118:
        if (r3 != 1073741824) goto L202;
        if (r5 != 1073741824) goto L202;
        boolean r84 = r8.f3737b;
        C1000e r134 = r8.f3736a;
        if (r84 == false) goto L123;
    L126:
        Iterator r85 = r134.f3639d0.iterator();
    L128:
        if (r85.hasNext() == false) goto L130;
        C0999d r143 = (C0999d) r85.next();
        r143.f3610a = false;
        r143.f3616d.m2466n();
        r143.f3617e.m2469m();
        goto L128
    L130:
        int r155 = 0;
        r134.f3610a = false;
        r134.f3616d.m2466n();
        r134.f3617e.m2469m();
        r8.f3738c = false;
    L131:
        r8.m2454b(r8.f3739d);
        r134.f3597N = r155;
        r134.f3598O = r155;
        int r86 = r134.m2403h(r155);
        int r144 = r134.m2403h(1);
        if (r8.f3737b == false) goto L134;
        r8.m2455c();
    L134:
        int r124 = r134.m2408m();
        int r156 = r134.m2409n();
        C1021j r22 = r134.f3616d;
        C1040f r19 = r66;
        r22.f3769h.mo2462d(r124);
        C1023l r67 = r134.f3617e;
        int r20 = r93;
        r67.f3769h.mo2462d(r156);
        r8.m2459g();
        ArrayList r94 = r8.f3740e;
        int r21 = r103;
        C1018g r104 = r22.f3766e;
        C0234d r222 = r43;
        C1018g r44 = r67.f3766e;
        int r23 = r72;
        if (r86 == 2) goto L140;
        if (r144 == 2) goto L140;
        int r24 = r5;
    L139:
        int r52 = 1;
    L156:
        int[] r73 = r134.f3615c0;
        int r16 = r73[0];
        if (r16 != r52) goto L159;
    L162:
        int r18 = r134.m2407l() + r124;
        r22.f3770i.mo2462d(r18);
        r104.mo2462d(r18 - r124);
        r8.m2459g();
        int r25 = r73[1];
        if (r25 != 1) goto L165;
    L166:
        int r110 = r134.m2404i() + r156;
        r67.f3770i.mo2462d(r110);
        r44.mo2462d(r110 - r156);
    L167:
        r8.m2459g();
        boolean r07 = true;
    L168:
        Iterator r111 = r94.iterator();
    L170:
        if (r111.hasNext() == false) goto L177;
        AbstractC1024m r210 = (AbstractC1024m) r111.next();
        if (r210.f3763b != r134) goto L176;
        if (r210.f3768g == false) goto L170;
    L176:
        r210.mo2447e();
        goto L170
    L177:
        Iterator r114 = r94.iterator();
    L179:
        if (r114.hasNext() == false) goto L200;
        AbstractC1024m r211 = (AbstractC1024m) r114.next();
        if (r07 == true) goto L186;
        if (r211.f3763b == r134) goto L179;
    L186:
        if (r211.f3769h.f3753j == false) goto L187;
        if (r211.f3770i.f3753j == true) goto L194;
        if ((r211 instanceof C1019h) == false) goto L187;
    L194:
        if (r211.f3766e.f3753j == true) goto L179;
        if ((r211 instanceof C1014c) == true) goto L179;
        if ((r211 instanceof C1019h) == true) goto L179;
    L187:
        boolean r08 = false;
    L201:
        r134.m2418w(r86);
        r134.m2419x(r144);
        r1 = r26;
        boolean r45 = r08;
        int r53 = r24;
        int r09 = 1073741824;
        int r212 = 2;
    L216:
        if (r45 == false) goto L225;
        if (r3 != r09) goto L219;
        boolean r32 = true;
    L220:
        if (r53 != r09) goto L222;
        boolean r010 = true;
    L223:
        r1.mo2421z(r32, r010);
        goto L225
    L222:
        r010 = false;
        goto L223
    L219:
        r32 = false;
    L225:
        if (r45 == true) goto L227;
    L228:
        if (r23 <= 0) goto L257;
        int r011 = r1.f3639d0.size();
        C1040f r213 = r1.f3642g0;
        int r157 = 0;
    L230:
        if (r157 >= r011) goto L249;
        C0999d r33 = (C0999d) r1.f3639d0.get(r157);
        if ((r33 instanceof C1003h) == false) goto L235;
    L233:
        C0234d r54 = r222;
    L248:
        r157 = r157 + 1;
        r222 = r54;
        goto L230
    L235:
        if (r33.f3616d.f3766e.f3753j == true) goto L237;
    L239:
        int r55 = r33.m2403h(0);
        int r68 = r33.m2403h(1);
        if (r55 == 3) goto L242;
    L247:
        r54 = r222;
        r54.m655r(r213, r33, false);
        goto L248
    L242:
        if (r33.f3622j == 1) goto L247;
        if (r68 != 3) goto L247;
        if (r33.f3623k == 1) goto L247;
        r54 = r222;
        goto L248
    L237:
        if (r33.f3617e.f3766e.f3753j == false) goto L239;
    L249:
        C0234d r56 = r222;
        ConstraintLayout r012 = r213.f3940a;
        int r214 = r012.getChildCount();
        int r158 = 0;
    L250:
        if (r158 >= r214) goto L252;
        r012.getChildAt(r158);
        r158 = r158 + 1;
        goto L250
    L252:
        ArrayList r013 = r012.f1259b;
        int r215 = r013.size();
        if (r215 <= 0) goto L258;
        int r159 = 0;
    L255:
        if (r159 >= r215) goto L258;
        ((AbstractC1037c) r013.get(r159)).getClass();
        r159 = r159 + 1;
    L258:
        int r014 = r1.f3651p0;
        ArrayList r216 = (ArrayList) r56.f474b;
        int r34 = r216.size();
        int r46 = r20;
        int r69 = r21;
        if (r23 <= 0) goto L261;
        r56.m659w(r1, r46, r69);
    L261:
        if (r34 <= 0) goto L357;
        int[] r74 = r1.f3615c0;
        if (r74[0] != 2) goto L266;
        boolean r87 = true;
    L268:
        if (r74[1] != 2) goto L270;
        boolean r75 = true;
    L271:
        int r95 = r26.m2407l();
        C1000e r105 = (C1000e) r56.f476d;
        int r96 = Math.max(r95, r105.f3600Q);
        int r106 = Math.max(r26.m2404i(), r105.f3601R);
        int r115 = 0;
        boolean r125 = false;
    L272:
        if (r115 >= r34) goto L294;
        C0999d r145 = (C0999d) r216.get(r115);
        if ((r145 instanceof C1002g) == true) goto L276;
        int r162 = r014;
        C1040f r116 = r19;
    L293:
        r115 = r115 + 1;
        r19 = r116;
        r014 = r162;
        goto L272
    L276:
        int r1510 = r145.m2407l();
        int r135 = r145.m2404i();
        r162 = r014;
        r116 = r19;
        boolean r015 = r125 | r56.m655r(r116, r145, true);
        int r126 = r145.m2407l();
        int r016 = r145.m2404i();
        if (r126 == r1510) goto L284;
        r145.m2420y(r126);
        if (r87 == true) goto L281;
    L283:
        boolean r1511 = true;
    L285:
        if (r016 == r135) goto L292;
        r145.m2417v(r016);
        if (r75 == true) goto L289;
    L291:
        r1511 = true;
        goto L292
    L289:
        if ((r145.m2409n() + r145.f3594K) <= r106) goto L291;
        r106 = Math.max(r106, r145.mo2402g(5).m2390c() + (r145.m2409n() + r145.f3594K));
    L292:
        r125 = ((C1002g) r145).f3693l0 | r1511;
        goto L293
    L281:
        if ((r145.m2408m() + r145.f3593J) <= r96) goto L283;
        r96 = Math.max(r96, r145.mo2402g(4).m2390c() + (r145.m2408m() + r145.f3593J));
        goto L283
    L284:
        r1511 = r015;
        goto L285
    L294:
        int r163 = r014;
        C1040f r117 = r19;
        int r017 = 2;
        int r1512 = 0;
    L295:
        if (r1512 >= r017) goto L345;
        int r118 = 0;
    L297:
        if (r118 >= r34) goto L341;
        C0999d r136 = (C0999d) r216.get(r118);
        if ((r136 instanceof AbstractC1004i) == false) goto L303;
        if ((r136 instanceof C1002g) == true) goto L303;
    L315:
        C1040f r217 = r117;
        ArrayList r192 = r216;
        int r202 = r34;
    L340:
        r118 = r118 + 1;
        r216 = r192;
        r34 = r202;
        r117 = r217;
    L303:
        if ((r136 instanceof C1003h) == true) goto L315;
        if (r136.f3605V == 8) goto L315;
        if (r136.f3616d.f3766e.f3753j == false) goto L314;
        if (r136.f3617e.f3766e.f3753j == true) goto L315;
    L314:
        if ((r136 instanceof C1002g) == true) goto L315;
        int r018 = r136.m2407l();
        int r146 = r136.m2404i();
        r192 = r216;
        int r218 = r136.f3599P;
        r202 = r34;
        r125 = r125 | r56.m655r(r117, r136, true);
        int r35 = r136.m2407l();
        r217 = r117;
        int r119 = r136.m2404i();
        if (r35 == r018) goto L326;
        r136.m2420y(r35);
        if (r87 == false) goto L324;
        if ((r136.m2408m() + r136.f3593J) <= r96) goto L324;
        r96 = Math.max(r96, r136.mo2402g(4).m2390c() + (r136.m2408m() + r136.f3593J));
    L324:
        r125 = true;
    L326:
        if (r119 == r146) goto L336;
        r136.m2417v(r119);
        if (r75 == false) goto L333;
        if ((r136.m2409n() + r136.f3594K) <= r106) goto L333;
        r106 = Math.max(r106, r136.mo2402g(5).m2390c() + (r136.m2409n() + r136.f3594K));
    L333:
        r125 = true;
    L336:
        if (r136.f3635w == false) goto L340;
        if (r218 == r136.f3599P) goto L340;
        r125 = true;
        goto L340
    L341:
        C1040f r219 = r117;
        ArrayList r193 = r216;
        int r203 = r34;
        if (r125 == false) goto L344;
        r56.m659w(r26, r46, r69);
        r125 = false;
    L344:
        r1512 = r1512 + 1;
        r117 = r219;
        r216 = r193;
        r34 = r203;
        r017 = 2;
        goto L295
    L345:
        C1000e r019 = r26;
        if (r125 == false) goto L356;
        r56.m659w(r019, r46, r69);
        if (r26.m2407l() >= r96) goto L350;
        r019.m2420y(r96);
        boolean r1513 = true;
    L352:
        if (r26.m2404i() >= r106) goto L354;
        r019.m2417v(r106);
        r1513 = true;
    L354:
        if (r1513 == false) goto L356;
        r56.m659w(r019, r46, r69);
        goto L356
    L350:
        r1513 = false;
    L356:
        int r120 = r163;
        r019.f3651p0 = r120;
        if ((r120 & 256) != 256) goto L361;
        boolean r88 = true;
    L362:
        C0985e.f3485p = r88;
        return;
    L361:
        r88 = false;
        goto L362
    L270:
        r75 = false;
        goto L271
    L266:
        r87 = false;
        goto L268
    L357:
        r163 = r014;
        r019 = r1;
        goto L356
    L257:
        r56 = r222;
        goto L258
    L227:
        if (r212 != 2) goto L228;
        return;
    L200:
        r08 = true;
        goto L201
    L165:
        if (r25 != 4) goto L167;
    L159:
        if (r16 == 4) goto L162;
        r07 = false;
    L140:
        if (r113 == false) goto L147;
        Iterator r76 = r94.iterator();
    L143:
        if (r76.hasNext() == false) goto L147;
        if (((AbstractC1024m) r76.next()).mo2450k() == true) goto L143;
        r113 = false;
    L147:
        if (r113 == true) goto L149;
    L151:
        r24 = r5;
    L152:
        if (r113 == false) goto L139;
        if (r144 != 2) goto L139;
        r52 = 1;
        r134.m2419x(1);
        r134.m2417v(r8.m2456d(r134, 1));
        r44.mo2462d(r134.m2404i());
        goto L156
    L149:
        if (r86 != 2) goto L151;
        r134.m2418w(1);
        r24 = r5;
        r134.m2420y(r8.m2456d(r134, 0));
        r104.mo2462d(r134.m2407l());
        goto L152
    L123:
        if (r8.f3738c == true) goto L126;
        r155 = 0;
    L202:
        r222 = r43;
        r19 = r66;
        r23 = r72;
        r20 = r93;
        r21 = r103;
        boolean r121 = r8.f3737b;
        C1000e r220 = r8.f3736a;
        if (r121 == false) goto L209;
        Iterator r127 = r220.f3639d0.iterator();
    L206:
        if (r127.hasNext() == false) goto L208;
        C0999d r47 = (C0999d) r127.next();
        r47.f3610a = false;
        C1021j r610 = r47.f3616d;
        r610.f3766e.f3753j = false;
        r610.f3768g = false;
        r610.m2466n();
        C1023l r48 = r47.f3617e;
        r48.f3766e.f3753j = false;
        r48.f3768g = false;
        r48.m2469m();
        goto L206
    L208:
        int r57 = 0;
        r220.f3610a = false;
        C1021j r128 = r220.f3616d;
        r128.f3766e.f3753j = false;
        r128.f3768g = false;
        r128.m2466n();
        C1023l r129 = r220.f3617e;
        r129.f3766e.f3753j = false;
        r129.f3768g = false;
        r129.m2469m();
        r8.m2455c();
    L210:
        r8.m2454b(r8.f3739d);
        r220.f3597N = r57;
        r220.f3598O = r57;
        r220.f3616d.f3769h.mo2462d(r57);
        r220.f3617e.f3769h.mo2462d(r57);
        r09 = 1073741824;
        r1 = r26;
        if (r3 != 1073741824) goto L213;
        r45 = r1.m2424D(r57, r113);
        r53 = r5;
        r212 = 1;
    L214:
        if (r53 != 1073741824) goto L216;
        r45 = r45 & r1.m2424D(1, r113);
        r212 = r212 + 1;
        goto L216
    L213:
        r53 = r5;
        r212 = 0;
        r45 = true;
        goto L214
    L209:
        r57 = 0;
        goto L210
    L116:
        if (r26.m2404i() == r83) goto L118;
        r1.m2417v(r83);
        r1.f3641f0.f3737b = true;
        goto L118
    L112:
        if (r26.m2407l() == r06) goto L114;
        r1.m2420y(r06);
        r1.f3641f0.f3737b = true;
        goto L114
    L224:
        r222 = r43;
        r19 = r66;
        r23 = r72;
        r20 = r93;
        r21 = r103;
        r212 = 0;
        r45 = false;
    L104:
        if (r113 == true) goto L105;
        r05 = false;
    L89:
        if (r142.m2413r() == false) goto L93;
        if (r03 == true) goto L87;
    L93:
        if ((r142 instanceof C1002g) == true) goto L87;
        if (r142.m2412q() == true) goto L87;
        if (r142.m2413r() == true) goto L87;
        r133 = r133 + 1;
    L83:
        r03 = false;
        goto L85
    L77:
        r154 = false;
        goto L78
    L73:
        r02 = false;
    L101:
        r04 = 1073741824;
        goto L102
    L61:
        if ((r27 & 64) == 64) goto L64;
        r2 = false;
        goto L66
    L58:
        r113 = false;
        goto L59
    L54:
        r1.f3601R = r65;
        goto L55
    L50:
        r1.f3600Q = r64;
    L46:
        r8.f3738c = true;
        goto L47
    L31:
        r132 = Math.min(this.f1264g - r102, r62);
        goto L30
    L32:
        if (r122 != 0) goto L36;
        int r1210 = Math.max(0, this.f1262e);
    L34:
        r132 = r1210;
    L35:
        r123 = 2;
        goto L40
    L36:
        r132 = 0;
        goto L35
    L37:
        if (r122 != 0) goto L39;
        r1210 = Math.max(0, this.f1262e);
        goto L34
    L39:
        r132 = r62;
        goto L35
    L17:
        r17 = Math.min(this.f1263f - r112, r42);
        r14 = 1;
        goto L26
    L18:
        if (r122 != 0) goto L22;
        int r147 = Math.max(0, this.f1261d);
    L20:
        r17 = r147;
    L21:
        r14 = 2;
        goto L26
    L22:
        r17 = 0;
        goto L21
    L23:
        if (r122 != 0) goto L25;
        r147 = Math.max(0, this.f1261d);
        goto L20
    L25:
        r17 = r42;
    L8:
        if ((getContext().getApplicationInfo().flags & 4194304) == 0) goto L12;
        if (1 != getLayoutDirection()) goto L12;
        r92 = r13;
        goto L12
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1265h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1158a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r12) {
        Context r1 = getContext();
        C1039e r02 = new C1039e(r1, r12);
        r02.f3903a = -1;
        r02.f3905b = -1;
        r02.f3907c = -1.0f;
        r02.f3909d = -1;
        r02.f3911e = -1;
        r02.f3913f = -1;
        r02.f3915g = -1;
        r02.f3917h = -1;
        r02.f3919i = -1;
        r02.f3921j = -1;
        r02.f3923k = -1;
        r02.f3925l = -1;
        r02.f3926m = -1;
        r02.f3927n = 0;
        r02.f3928o = 0.0f;
        r02.f3929p = -1;
        r02.f3930q = -1;
        r02.f3931r = -1;
        r02.f3932s = -1;
        r02.f3933t = -1;
        r02.f3934u = -1;
        r02.f3935v = -1;
        r02.f3936w = -1;
        r02.f3937x = -1;
        r02.f3938y = -1;
        r02.f3939z = 0.5f;
        r02.f3877A = 0.5f;
        r02.f3878B = null;
        r02.f3879C = 1;
        r02.f3880D = -1.0f;
        r02.f3881E = -1.0f;
        r02.f3882F = 0;
        r02.f3883G = 0;
        r02.f3884H = 0;
        r02.f3885I = 0;
        r02.f3886J = 0;
        r02.f3887K = 0;
        r02.f3888L = 0;
        r02.f3889M = 0;
        r02.f3890N = 1.0f;
        r02.f3891O = 1.0f;
        r02.f3892P = -1;
        r02.f3893Q = -1;
        r02.f3894R = -1;
        r02.f3895S = false;
        r02.f3896T = false;
        r02.f3897U = null;
        r02.f3898V = true;
        r02.f3899W = true;
        r02.f3900X = false;
        r02.f3901Y = false;
        r02.f3902Z = false;
        r02.f3904a0 = -1;
        r02.f3906b0 = -1;
        r02.f3908c0 = -1;
        r02.f3910d0 = -1;
        r02.f3912e0 = -1;
        r02.f3914f0 = -1;
        r02.f3916g0 = 0.5f;
        r02.f3924k0 = new C0999d();
        TypedArray r122 = r1.obtainStyledAttributes(r12, AbstractC1052r.f4051b);
        int r13 = r122.getIndexCount();
        int r3 = 0;
    L3:
        if (r3 >= r13) goto L135;
        int r6 = r122.getIndex(r3);
        int r7 = AbstractC1038d.f3876a.get(r6);
        switch(r7) {
            case 1: goto L133;
            case 2: goto L130;
            case 3: goto L129;
            case 4: goto L126;
            case 5: goto L125;
            case 6: goto L124;
            case 7: goto L123;
            case 8: goto L120;
            case 9: goto L117;
            case 10: goto L114;
            case 11: goto L111;
            case 12: goto L108;
            case 13: goto L105;
            case 14: goto L102;
            case 15: goto L99;
            case 16: goto L96;
            case 17: goto L93;
            case 18: goto L90;
            case 19: goto L87;
            case 20: goto L84;
            case 21: goto L83;
            case 22: goto L82;
            case 23: goto L81;
            case 24: goto L80;
            case 25: goto L79;
            case 26: goto L78;
            case 27: goto L77;
            case 28: goto L76;
            case 29: goto L75;
            case 30: goto L74;
            case 31: goto L73;
            case 32: goto L72;
            case 33: goto L144;
            case 34: goto L140;
            case 35: goto L61;
            case 36: goto L142;
            case 37: goto L138;
            case 38: goto L50;
            default: goto L6;
        };
    L6:
        switch(r7) {
            case 44: goto L15;
            case 45: goto L14;
            case 46: goto L13;
            case 47: goto L12;
            case 48: goto L11;
            case 49: goto L10;
            case 50: goto L9;
            case 51: goto L8;
            default: goto L134;
        };
    L8:
        r02.f3897U = r122.getString(r6);
        goto L134
    L9:
        r02.f3893Q = r122.getDimensionPixelOffset(r6, r02.f3893Q);
        goto L134
    L10:
        r02.f3892P = r122.getDimensionPixelOffset(r6, r02.f3892P);
        goto L134
    L11:
        r02.f3883G = r122.getInt(r6, 0);
        goto L134
    L12:
        r02.f3882F = r122.getInt(r6, 0);
        goto L134
    L13:
        r02.f3881E = r122.getFloat(r6, r02.f3881E);
        goto L134
    L14:
        r02.f3880D = r122.getFloat(r6, r02.f3880D);
        goto L134
    L15:
        String r62 = r122.getString(r6);
        r02.f3878B = r62;
        r02.f3879C = -1;
        if (r62 == null) goto L134;
        int r63 = r62.length();
        int r72 = r02.f3878B.indexOf(44);
        if (r72 > 0) goto L20;
    L28:
        int r73 = 0;
    L29:
        int r9 = r02.f3878B.indexOf(58);
        if (r9 >= 0) goto L32;
    L46:
        String r64 = r02.f3878B.substring(r73);
        if (r64.length() <= 0) goto L134;
        Float.parseFloat(r64);     // Catch: NumberFormatException -> L137
        goto L134
    L32:
        if (r9 >= (r63 - 1)) goto L46;
        String r65 = r02.f3878B.substring(r73, r9);
        String r74 = r02.f3878B.substring(r9 + 1);
        if (r65.length() <= 0) goto L134;
        if (r74.length() <= 0) goto L134;
        float r66 = Float.parseFloat(r65);     // Catch: NumberFormatException -> L137
        float r75 = Float.parseFloat(r74);     // Catch: NumberFormatException -> L137
        if (r66 <= 0.0f) goto L134;
        if (r75 <= 0.0f) goto L134;
        if (r02.f3879C != 1) goto L44;
        Math.abs(r75 / r66);     // Catch: NumberFormatException -> L137
        goto L134
    L44:
        Math.abs(r66 / r75);     // Catch: NumberFormatException -> L137
        goto L134
    L20:
        if (r72 >= (r63 - 1)) goto L28;
        String r92 = r02.f3878B.substring(0, r72);
        if (r92.equalsIgnoreCase("W") == false) goto L25;
        r02.f3879C = 0;
    L27:
        r73 = r72 + 1;
        goto L29
    L25:
        if (r92.equalsIgnoreCase("H") == false) goto L27;
        r02.f3879C = 1;
    L134:
        r3 = r3 + 1;
        goto L3
    L50:
        r02.f3891O = Math.max(0.0f, r122.getFloat(r6, r02.f3891O));
        r02.f3885I = 2;
        goto L134
    L61:
        r02.f3890N = Math.max(0.0f, r122.getFloat(r6, r02.f3890N));
        r02.f3884H = 2;
        goto L134
    L72:
        r02.f3885I = r122.getInt(r6, 0);
        goto L134
    L73:
        r02.f3884H = r122.getInt(r6, 0);
        goto L134
    L74:
        r02.f3877A = r122.getFloat(r6, r02.f3877A);
        goto L134
    L75:
        r02.f3939z = r122.getFloat(r6, r02.f3939z);
        goto L134
    L76:
        r02.f3896T = r122.getBoolean(r6, r02.f3896T);
        goto L134
    L77:
        r02.f3895S = r122.getBoolean(r6, r02.f3895S);
        goto L134
    L78:
        r02.f3938y = r122.getDimensionPixelSize(r6, r02.f3938y);
        goto L134
    L79:
        r02.f3937x = r122.getDimensionPixelSize(r6, r02.f3937x);
        goto L134
    L80:
        r02.f3936w = r122.getDimensionPixelSize(r6, r02.f3936w);
        goto L134
    L81:
        r02.f3935v = r122.getDimensionPixelSize(r6, r02.f3935v);
        goto L134
    L82:
        r02.f3934u = r122.getDimensionPixelSize(r6, r02.f3934u);
        goto L134
    L83:
        r02.f3933t = r122.getDimensionPixelSize(r6, r02.f3933t);
        goto L134
    L84:
        int r76 = r122.getResourceId(r6, r02.f3932s);
        r02.f3932s = r76;
        if (r76 != (-1)) goto L134;
        r02.f3932s = r122.getInt(r6, -1);
        goto L134
    L87:
        int r77 = r122.getResourceId(r6, r02.f3931r);
        r02.f3931r = r77;
        if (r77 != (-1)) goto L134;
        r02.f3931r = r122.getInt(r6, -1);
        goto L134
    L90:
        int r78 = r122.getResourceId(r6, r02.f3930q);
        r02.f3930q = r78;
        if (r78 != (-1)) goto L134;
        r02.f3930q = r122.getInt(r6, -1);
        goto L134
    L93:
        int r79 = r122.getResourceId(r6, r02.f3929p);
        r02.f3929p = r79;
        if (r79 != (-1)) goto L134;
        r02.f3929p = r122.getInt(r6, -1);
        goto L134
    L96:
        int r710 = r122.getResourceId(r6, r02.f3925l);
        r02.f3925l = r710;
        if (r710 != (-1)) goto L134;
        r02.f3925l = r122.getInt(r6, -1);
        goto L134
    L99:
        int r711 = r122.getResourceId(r6, r02.f3923k);
        r02.f3923k = r711;
        if (r711 != (-1)) goto L134;
        r02.f3923k = r122.getInt(r6, -1);
        goto L134
    L102:
        int r712 = r122.getResourceId(r6, r02.f3921j);
        r02.f3921j = r712;
        if (r712 != (-1)) goto L134;
        r02.f3921j = r122.getInt(r6, -1);
        goto L134
    L105:
        int r713 = r122.getResourceId(r6, r02.f3919i);
        r02.f3919i = r713;
        if (r713 != (-1)) goto L134;
        r02.f3919i = r122.getInt(r6, -1);
        goto L134
    L108:
        int r714 = r122.getResourceId(r6, r02.f3917h);
        r02.f3917h = r714;
        if (r714 != (-1)) goto L134;
        r02.f3917h = r122.getInt(r6, -1);
        goto L134
    L111:
        int r715 = r122.getResourceId(r6, r02.f3915g);
        r02.f3915g = r715;
        if (r715 != (-1)) goto L134;
        r02.f3915g = r122.getInt(r6, -1);
        goto L134
    L114:
        int r716 = r122.getResourceId(r6, r02.f3913f);
        r02.f3913f = r716;
        if (r716 != (-1)) goto L134;
        r02.f3913f = r122.getInt(r6, -1);
        goto L134
    L117:
        int r717 = r122.getResourceId(r6, r02.f3911e);
        r02.f3911e = r717;
        if (r717 != (-1)) goto L134;
        r02.f3911e = r122.getInt(r6, -1);
        goto L134
    L120:
        int r718 = r122.getResourceId(r6, r02.f3909d);
        r02.f3909d = r718;
        if (r718 != (-1)) goto L134;
        r02.f3909d = r122.getInt(r6, -1);
        goto L134
    L123:
        r02.f3907c = r122.getFloat(r6, r02.f3907c);
        goto L134
    L124:
        r02.f3905b = r122.getDimensionPixelOffset(r6, r02.f3905b);
        goto L134
    L125:
        r02.f3903a = r122.getDimensionPixelOffset(r6, r02.f3903a);
        goto L134
    L126:
        float r67 = r122.getFloat(r6, r02.f3928o) % 360.0f;
        r02.f3928o = r67;
        if (r67 >= 0.0f) goto L134;
        r02.f3928o = (360.0f - r67) % 360.0f;
        goto L134
    L129:
        r02.f3927n = r122.getDimensionPixelSize(r6, r02.f3927n);
        goto L134
    L130:
        int r719 = r122.getResourceId(r6, r02.f3926m);
        r02.f3926m = r719;
        if (r719 != (-1)) goto L134;
        r02.f3926m = r122.getInt(r6, -1);
        goto L134
    L133:
        r02.f3894R = r122.getInt(r6, r02.f3894R);
        goto L134
    L138:
        r02.f3889M = r122.getDimensionPixelSize(r6, r02.f3889M);     // Catch: Exception -> L53
    L54:
        if (r122.getInt(r6, r02.f3889M) != (-2)) goto L134;
        r02.f3889M = -2;
        goto L134
    L140:
        r02.f3888L = r122.getDimensionPixelSize(r6, r02.f3888L);     // Catch: Exception -> L64
    L65:
        if (r122.getInt(r6, r02.f3888L) != (-2)) goto L134;
        r02.f3888L = -2;
        goto L134
    L142:
        r02.f3887K = r122.getDimensionPixelSize(r6, r02.f3887K);     // Catch: Exception -> L58
    L59:
        if (r122.getInt(r6, r02.f3887K) != (-2)) goto L134;
        r02.f3887K = -2;
        goto L134
    L144:
        r02.f3886J = r122.getDimensionPixelSize(r6, r02.f3886J);     // Catch: Exception -> L69
    L70:
        if (r122.getInt(r6, r02.f3886J) != (-2)) goto L134;
        r02.f3886J = -2;
        goto L134
    L135:
        r122.recycle();
        r02.m2518a();
        return r02;
    }

    public int getMaxHeight() {
        return this.f1264g;
    }

    public int getMaxWidth() {
        return this.f1263f;
    }

    public int getMinHeight() {
        return this.f1262e;
    }

    public int getMinWidth() {
        return this.f1261d;
    }

    public int getOptimizationLevel() {
        return this.f1260c.f3651p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        int r52 = getChildCount();
        boolean r62 = isInEditMode();
        int r72 = 0;
        int r82 = 0;
    L3:
        if (r82 >= r52) goto L14;
        View r92 = getChildAt(r82);
        C1039e r02 = (C1039e) r92.getLayoutParams();
        C0999d r1 = r02.f3924k0;
        if (r92.getVisibility() == 8) goto L7;
    L12:
        int r03 = r1.m2408m();
        int r2 = r1.m2409n();
        r92.layout(r03, r2, r1.m2407l() + r03, r1.m2404i() + r2);
    L13:
        r82 = r82 + 1;
        goto L3
    L7:
        if (r02.f3901Y == true) goto L12;
        if (r02.f3902Z == true) goto L12;
        if (r62 == true) goto L12;
    L14:
        ArrayList r53 = this.f1259b;
        int r63 = r53.size();
        if (r63 <= 0) goto L18;
    L16:
        if (r72 >= r63) goto L23;
        ((AbstractC1037c) r53.get(r72)).getClass();
        r72 = r72 + 1;
        goto L16
    L23:
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r26, int r27) {
        ConstraintLayout r02 = this;
        int r4 = 0;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) goto L5;
    L7:
        boolean r3 = false;
    L8:
        C1000e r6 = r02.f1260c;
        r6.f3643h0 = r3;
        if (r02.f1265h == false) goto L303;
        r02.f1265h = false;
        int r32 = getChildCount();
        int r7 = 0;
    L11:
        if (r7 >= r32) goto L16;
        if (r02.getChildAt(r7).isLayoutRequested() == true) goto L14;
        r7 = r7 + 1;
        goto L11
    L14:
        boolean r33 = true;
    L17:
        if (r33 == false) goto L289;
        boolean r9 = isInEditMode();
        int r10 = getChildCount();
        int r11 = 0;
    L19:
        if (r11 >= r10) goto L25;
        C0999d r12 = r02.m1159b(r02.getChildAt(r11));
        if (r12 == null) goto L24;
        r12.mo2414s();
    L24:
        r11 = r11 + 1;
        goto L19
    L25:
        SparseArray r112 = r02.f1258a;
        if (r9 == false) goto L62;
        int r14 = 0;
    L28:
        if (r14 >= r10) goto L62;
        View r15 = r02.getChildAt(r14);
        String r72 = getResources().getResourceName(r15.getId());     // Catch: Resources.NotFoundException -> L311
        Integer r8 = Integer.valueOf(r15.getId());     // Catch: Resources.NotFoundException -> L311
        if ((r72 instanceof String) == true) goto L33;
    L40:
        int r5 = r72.indexOf(47);     // Catch: Resources.NotFoundException -> L311
        if (r5 == (-1)) goto L43;
        r72 = r72.substring(r5 + 1);     // Catch: Resources.NotFoundException -> L311
    L43:
        int r52 = r15.getId();     // Catch: Resources.NotFoundException -> L311
        if (r52 != 0) goto L46;
    L45:
        C0999d r53 = r6;
    L59:
        r53.f3606W = r72;     // Catch: Resources.NotFoundException -> L311
        goto L60
    L46:
        View r82 = (View) r112.get(r52);     // Catch: Resources.NotFoundException -> L311
        if (r82 != null) goto L54;
        r82 = r02.findViewById(r52);     // Catch: Resources.NotFoundException -> L311
        if (r82 == null) goto L54;
        if (r82 == r02) goto L54;
        if (r82.getParent() != r02) goto L54;
        r02.onViewAdded(r82);     // Catch: Resources.NotFoundException -> L311
    L54:
        if (r82 == r02) goto L45;
        if (r82 != null) goto L58;
        r53 = null;
        goto L59
    L58:
        r53 = ((C1039e) r82.getLayoutParams()).f3924k0;     // Catch: Resources.NotFoundException -> L311
        goto L59
    L33:
        if (r02.f1270m != null) goto L35;
        r02.f1270m = new HashMap();     // Catch: Resources.NotFoundException -> L311
    L35:
        int r54 = r72.indexOf("/");     // Catch: Resources.NotFoundException -> L311
        if (r54 == (-1)) goto L38;
        String r55 = r72.substring(r54 + 1);     // Catch: Resources.NotFoundException -> L311
    L39:
        r02.f1270m.put(r55, r8);     // Catch: Resources.NotFoundException -> L311
        goto L40
    L38:
        r55 = r72;
    L60:
        r14 = r14 + 1;
    L62:
        if (r02.f1269l == (-1)) goto L66;
        int r56 = 0;
    L64:
        if (r56 >= r10) goto L66;
        r02.getChildAt(r56).getId();
        r56 = r56 + 1;
    L66:
        C1048n r57 = r02.f1267j;
        if (r57 == null) goto L69;
        r57.m2528a(r02);
    L69:
        r6.f3639d0.clear();
        ArrayList r58 = r02.f1259b;
        int r73 = r58.size();
        if (r73 <= 0) goto L102;
        int r122 = 0;
    L72:
        if (r122 >= r73) goto L102;
        AbstractC1037c r142 = (AbstractC1037c) r58.get(r122);
        if (r142.isInEditMode() == false) goto L76;
        r142.setIds(r142.f3874e);
    L76:
        AbstractC1004i r152 = r142.f3873d;
        if (r152 != null) goto L79;
        ArrayList r18 = r58;
        int r17 = r73;
    L101:
        r122 = r122 + 1;
        r73 = r17;
        r58 = r18;
        r4 = 0;
        goto L72
    L79:
        r152.f3714e0 = r4;
        Arrays.fill(r152.f3713d0, null);
        int r13 = r4;
    L81:
        if (r13 >= r142.f3871b) goto L100;
        int r153 = r142.f3870a[r13];
        View r42 = (View) r02.f1258a.get(r153);
        if (r42 != null) goto L87;
        Integer r154 = Integer.valueOf(r153);
        HashMap r83 = r142.f3875f;
        String r155 = (String) r83.get(r154);
        View r172 = r42;
        int r43 = r142.m2516d(r02, r155);
        ArrayList r182 = r58;
        if (r43 == 0) goto L88;
        r142.f3870a[r13] = r43;
        r83.put(Integer.valueOf(r43), r155);
        View r44 = (View) r02.f1258a.get(r43);
    L89:
        if (r44 == null) goto L98;
        AbstractC1004i r59 = r142.f3873d;
        C0999d r45 = r02.m1159b(r44);
        r59.getClass();
        if (r45 == r59) goto L98;
        if (r45 == null) goto L98;
        int r84 = r59.f3714e0 + 1;
        C0999d[] r156 = r59.f3713d0;
        int r173 = r73;
        if (r84 <= r156.length) goto L97;
        r59.f3713d0 = (C0999d[]) Arrays.copyOf(r156, r156.length * 2);
    L97:
        C0999d[] r74 = r59.f3713d0;
        int r85 = r59.f3714e0;
        r74[r85] = r45;
        r59.f3714e0 = r85 + 1;
    L99:
        r13 = r13 + 1;
        r73 = r173;
        r58 = r182;
    L98:
        r173 = r73;
    L88:
        r44 = r172;
        goto L89
    L87:
        r172 = r42;
        r182 = r58;
        goto L88
    L100:
        r18 = r58;
        r17 = r73;
        r142.f3873d.mo2432B();
    L102:
        int r46 = 0;
    L103:
        if (r46 >= r10) goto L105;
        r02.getChildAt(r46);
        r46 = r46 + 1;
        goto L103
    L105:
        SparseArray r47 = r02.f1271n;
        r47.clear();
        r47.put(0, r6);
        r47.put(getId(), r6);
        int r510 = 0;
    L106:
        if (r510 >= r10) goto L108;
        View r75 = r02.getChildAt(r510);
        r47.put(r75.getId(), r02.m1159b(r75));
        r510 = r510 + 1;
        goto L106
    L108:
        int r511 = 0;
    L109:
        if (r511 >= r10) goto L289;
        View r76 = r02.getChildAt(r511);
        C0999d r86 = r02.m1159b(r76);
        if (r86 != null) goto L113;
    L112:
        C1000e r24 = r6;
        int r23 = r10;
    L288:
        r511 = r511 + 1;
        r02 = this;
        r10 = r23;
        r6 = r24;
        goto L109
    L113:
        C1039e r123 = (C1039e) r76.getLayoutParams();
        r6.f3639d0.add(r86);
        C0999d r132 = r86.f3592I;
        if (r132 == null) goto L117;
        ((C1000e) r132).f3639d0.remove(r86);
        r86.f3592I = null;
    L117:
        r86.f3592I = r6;
        r123.m2518a();
        r86.f3605V = r76.getVisibility();
        r86.f3604U = r76;
        if ((r76 instanceof AbstractC1037c) == false) goto L121;
        ((AbstractC1037c) r76).mo1156f(r86, r6.f3643h0);
    L121:
        if (r123.f3901Y == false) goto L134;
        C1003h r87 = (C1003h) r86;
        int r77 = r123.f3918h0;
        int r143 = r123.f3920i0;
        float r124 = r123.f3922j0;
        if (r124 == (-1.0f)) goto L128;
        if (r124 <= (-1.0f)) goto L112;
        r87.f3708d0 = r124;
        r87.f3709e0 = -1;
        r87.f3710f0 = -1;
        goto L112
    L128:
        if (r77 == (-1)) goto L131;
        if (r77 <= (-1)) goto L112;
        r87.f3708d0 = -1.0f;
        r87.f3709e0 = r77;
        r87.f3710f0 = -1;
        goto L112
    L131:
        if (r143 == (-1)) goto L112;
        if (r143 <= (-1)) goto L112;
        r87.f3708d0 = -1.0f;
        r87.f3709e0 = -1;
        r87.f3710f0 = r143;
        goto L112
    L134:
        int r78 = r123.f3904a0;
        int r144 = r123.f3906b0;
        int r157 = r123.f3908c0;
        int r133 = r123.f3910d0;
        r23 = r10;
        int r102 = r123.f3912e0;
        int r1 = r123.f3914f0;
        float r2 = r123.f3916g0;
        int r03 = r123.f3926m;
        r24 = r6;
        if (r03 == (-1)) goto L139;
        C0999d r22 = (C0999d) r47.get(r03);
        if (r22 == null) goto L191;
        float r04 = r123.f3928o;
        r86.m2410o(7, 7, r123.f3927n, 0, r22);
        r86.f3634v = r04;
    L191:
        if (r9 == false) goto L198;
        int r05 = r123.f3892P;
        if (r05 == (-1)) goto L195;
    L196:
        int r16 = r123.f3893Q;
        r86.f3597N = r05;
        r86.f3598O = r16;
        goto L198
    L195:
        if (r123.f3893Q != (-1)) goto L196;
    L198:
        if (r123.f3898V == false) goto L200;
        r86.m2418w(1);
        r86.m2420y(((ViewGroup.MarginLayoutParams) r123).width);
        if (((ViewGroup.MarginLayoutParams) r123).width != (-2)) goto L212;
        r86.m2418w(2);
    L212:
        if (r123.f3899W == true) goto L222;
        int r25 = -1;
        if (((ViewGroup.MarginLayoutParams) r123).height == (-1)) goto L216;
        r86.m2419x(3);
        r86.m2417v(0);
    L225:
        String r06 = r123.f3878B;
        if (r06 == null) goto L268;
        if (r06.length() == 0) goto L268;
        int r19 = r06.length();
        int r62 = r06.indexOf(44);
        if (r62 > 0) goto L233;
    L242:
        int r79 = r25;
        int r63 = 0;
    L243:
        int r103 = r06.indexOf(58);
        if (r103 >= 0) goto L246;
    L260:
        String r07 = r06.substring(r63);
        if (r07.length() <= 0) goto L264;
        float r08 = Float.parseFloat(r07);     // Catch: NumberFormatException -> L312
    L266:
        if (r08 <= 0.0f) goto L269;
        r86.f3595L = r08;
        r86.f3596M = r79;
    L269:
        float r09 = r123.f3880D;
        float[] r110 = r86.f3609Z;
        r110[0] = r09;
        r110[1] = r123.f3881E;
        r86.f3607X = r123.f3882F;
        r86.f3608Y = r123.f3883G;
        int r010 = r123.f3884H;
        int r111 = r123.f3886J;
        int r64 = r123.f3888L;
        float r710 = r123.f3890N;
        r86.f3622j = r010;
        r86.f3625m = r111;
        if (r64 != Integer.MAX_VALUE) goto L272;
        r64 = 0;
    L272:
        r86.f3626n = r64;
        r86.f3627o = r710;
        if (r710 > 0.0f) goto L275;
    L278:
        int r011 = r123.f3885I;
        int r711 = r123.f3887K;
        int r104 = r123.f3889M;
        float r125 = r123.f3891O;
        r86.f3623k = r011;
        r86.f3628p = r711;
        if (r104 != Integer.MAX_VALUE) goto L281;
        r104 = 0;
    L281:
        r86.f3629q = r104;
        r86.f3630r = r125;
        if (r125 <= 0.0f) goto L288;
        if (r125 >= 1.0f) goto L288;
        if (r011 != 0) goto L288;
        r86.f3623k = 2;
        goto L288
    L275:
        if (r710 >= 1.0f) goto L278;
        if (r010 != 0) goto L278;
        r86.f3622j = 2;
    L264:
        r08 = 0.0f;
        goto L266
    L246:
        if (r103 >= (r19 - 1)) goto L260;
        String r113 = r06.substring(r63, r103);
        String r012 = r06.substring(r103 + 1);
        if (r113.length() <= 0) goto L264;
        if (r012.length() <= 0) goto L264;
        float r114 = Float.parseFloat(r113);     // Catch: NumberFormatException -> L312
        float r013 = Float.parseFloat(r012);     // Catch: NumberFormatException -> L312
        if (r114 <= 0.0f) goto L264;
        if (r013 <= 0.0f) goto L264;
        if (r79 != 1) goto L258;
        r08 = Math.abs(r013 / r114);     // Catch: NumberFormatException -> L312
        goto L266
    L258:
        r08 = Math.abs(r114 / r013);     // Catch: NumberFormatException -> L312
        goto L266
    L233:
        if (r62 >= (r19 - 1)) goto L242;
        String r105 = r06.substring(0, r62);
        if (r105.equalsIgnoreCase("W") == false) goto L238;
        r79 = 0;
    L241:
        r63 = r62 + 1;
        goto L243
    L238:
        if (r105.equalsIgnoreCase("H") == false) goto L240;
        r79 = 1;
        goto L241
    L240:
        r79 = r25;
    L268:
        r86.f3595L = 0.0f;
        goto L269
    L216:
        if (r123.f3896T == false) goto L219;
        r86.m2419x(3);
    L220:
        r86.mo2402g(3).f3581e = ((ViewGroup.MarginLayoutParams) r123).topMargin;
        r86.mo2402g(5).f3581e = ((ViewGroup.MarginLayoutParams) r123).bottomMargin;
        goto L225
    L219:
        r86.m2419x(4);
        goto L220
    L222:
        r25 = -1;
        r86.m2419x(1);
        r86.m2417v(((ViewGroup.MarginLayoutParams) r123).height);
        if (((ViewGroup.MarginLayoutParams) r123).height != (-2)) goto L225;
        r86.m2419x(2);
        goto L225
    L200:
        if (((ViewGroup.MarginLayoutParams) r123).width == (-1)) goto L202;
        r86.m2418w(3);
        r86.m2420y(0);
        goto L212
    L202:
        if (r123.f3895S == false) goto L205;
        r86.m2418w(3);
    L206:
        r86.mo2402g(2).f3581e = ((ViewGroup.MarginLayoutParams) r123).leftMargin;
        r86.mo2402g(4).f3581e = ((ViewGroup.MarginLayoutParams) r123).rightMargin;
        goto L212
    L205:
        r86.m2418w(4);
        goto L206
    L139:
        int r014 = -1;
        if (r78 == (-1)) goto L145;
        C0999d r222 = (C0999d) r47.get(r78);
        if (r222 == null) goto L144;
        r86.m2410o(2, 2, ((ViewGroup.MarginLayoutParams) r123).leftMargin, r102, r222);
    L144:
        r014 = -1;
    L149:
        if (r157 == r014) goto L153;
        C0999d r223 = (C0999d) r47.get(r157);
        if (r223 == null) goto L157;
        r86.m2410o(4, 2, ((ViewGroup.MarginLayoutParams) r123).rightMargin, r1, r223);
    L157:
        int r015 = r123.f3917h;
        if (r015 == (-1)) goto L162;
        C0999d r224 = (C0999d) r47.get(r015);
        if (r224 == null) goto L167;
        r86.m2410o(3, 3, ((ViewGroup.MarginLayoutParams) r123).topMargin, r123.f3934u, r224);
    L167:
        int r016 = r123.f3921j;
        if (r016 == (-1)) goto L172;
        C0999d r225 = (C0999d) r47.get(r016);
        if (r225 == null) goto L177;
        r86.m2410o(5, 3, ((ViewGroup.MarginLayoutParams) r123).bottomMargin, r123.f3936w, r225);
    L177:
        int r017 = r123.f3925l;
        if (r017 == (-1)) goto L186;
        View r018 = (View) r112.get(r017);
        C0999d r115 = (C0999d) r47.get(r123.f3925l);
        if (r115 == null) goto L186;
        if (r018 == null) goto L186;
        if ((r018.getLayoutParams() instanceof C1039e) == false) goto L186;
        C1039e r019 = (C1039e) r018.getLayoutParams();
        r123.f3900X = true;
        r019.f3900X = true;
        r86.mo2402g(6).m2389b(r115.mo2402g(6), 0, -1, true);
        r86.f3635w = true;
        r019.f3924k0.f3635w = true;
        r86.mo2402g(3).m2395h();
        r86.mo2402g(5).m2395h();
    L186:
        if (r2 < 0.0f) goto L188;
        r86.f3602S = r2;
    L188:
        float r116 = r123.f3877A;
        if (r116 < 0.0f) goto L191;
        r86.f3603T = r116;
        goto L191
    L172:
        int r020 = r123.f3923k;
        if (r020 == (-1)) goto L177;
        C0999d r226 = (C0999d) r47.get(r020);
        if (r226 == null) goto L177;
        r86.m2410o(5, 5, ((ViewGroup.MarginLayoutParams) r123).bottomMargin, r123.f3936w, r226);
        goto L177
    L162:
        int r021 = r123.f3919i;
        if (r021 == (-1)) goto L167;
        C0999d r227 = (C0999d) r47.get(r021);
        if (r227 == null) goto L167;
        r86.m2410o(3, 5, ((ViewGroup.MarginLayoutParams) r123).topMargin, r123.f3934u, r227);
        goto L167
    L153:
        if (r133 == r014) goto L157;
        C0999d r228 = (C0999d) r47.get(r133);
        if (r228 == null) goto L157;
        r86.m2410o(4, 4, ((ViewGroup.MarginLayoutParams) r123).rightMargin, r1, r228);
        goto L157
    L145:
        if (r144 == (-1)) goto L149;
        C0999d r229 = (C0999d) r47.get(r144);
        if (r229 == null) goto L144;
        r86.m2410o(2, 4, ((ViewGroup.MarginLayoutParams) r123).leftMargin, r102, r229);
    L289:
        C1000e r022 = r6;
        if (r33 == false) goto L304;
        ArrayList r117 = (ArrayList) r022.f3640e0.f474b;
        r117.clear();
        int r28 = r022.f3639d0.size();
        int r512 = 0;
    L292:
        if (r512 >= r28) goto L301;
        C0999d r34 = (C0999d) r022.f3639d0.get(r512);
        int[] r48 = r34.f3615c0;
        int r712 = r48[0];
        if (r712 == 3) goto L299;
        if (r712 == 4) goto L299;
        int r49 = r48[1];
        if (r49 == 3) goto L299;
        if (r49 == 4) goto L299;
    L300:
        r512 = r512 + 1;
    L299:
        r117.add(r34);
        goto L300
    L301:
        r022.f3641f0.f3737b = true;
    L304:
        m1162e(r022, this.f1266i, r26, r27);
        int r29 = r022.m2407l();
        int r513 = r022.m2404i();
        boolean r65 = r022.f3652q0;
        boolean r023 = r022.f3653r0;
        C1040f r713 = this.f1272o;
        int r88 = r713.f3944e;
        int r210 = View.resolveSizeAndState(r29 + r713.f3943d, r26, 0);
        int r35 = View.resolveSizeAndState(r513 + r88, r27, 0) & 16777215;
        int r211 = Math.min(this.f1263f, r210 & 16777215);
        int r36 = Math.min(this.f1264g, r35);
        if (r65 == false) goto L307;
        r211 = r211 | 16777216;
    L307:
        if (r023 == false) goto L309;
        r36 = r36 | 16777216;
    L309:
        setMeasuredDimension(r211, r36);
        return;
    L16:
        r33 = false;
        goto L17
    L303:
        r022 = r6;
        goto L304
    L5:
        if (1 != getLayoutDirection()) goto L7;
        r3 = true;
        goto L8
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View r5) {
        super.onViewAdded(r5);
        C0999d r02 = m1159b(r5);
        if ((r5 instanceof C1050p) == false) goto L8;
        if ((r02 instanceof C1003h) == true) goto L8;
        C1039e r03 = (C1039e) r5.getLayoutParams();
        C1003h r1 = new C1003h();
        r03.f3924k0 = r1;
        r03.f3901Y = true;
        r1.m2436B(r03.f3894R);
    L8:
        if ((r5 instanceof AbstractC1037c) == false) goto L12;
        AbstractC1037c r04 = (AbstractC1037c) r5;
        r04.m2517g();
        ((C1039e) r5.getLayoutParams()).f3902Z = true;
        ArrayList r12 = this.f1259b;
        if (r12.contains(r04) == true) goto L12;
        r12.add(r04);
    L12:
        int r05 = r5.getId();
        this.f1258a.put(r05, r5);
        this.f1265h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View r3) {
        super.onViewRemoved(r3);
        int r02 = r3.getId();
        this.f1258a.remove(r02);
        C0999d r03 = m1159b(r3);
        this.f1260c.f3639d0.remove(r03);
        r03.f3592I = null;
        this.f1259b.remove(r3);
        this.f1265h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1265h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1048n r1) {
        this.f1267j = r1;
    }

    @Override // android.view.View
    public void setId(int r3) {
        int r02 = getId();
        SparseArray r1 = this.f1258a;
        r1.remove(r02);
        super.setId(r3);
        r1.put(getId(), this);
    }

    public void setMaxHeight(int r2) {
        if (r2 != this.f1264g) goto L5;
        return;
    L5:
        this.f1264g = r2;
        requestLayout();
    }

    public void setMaxWidth(int r2) {
        if (r2 != this.f1263f) goto L5;
        return;
    L5:
        this.f1263f = r2;
        requestLayout();
    }

    public void setMinHeight(int r2) {
        if (r2 != this.f1262e) goto L5;
        return;
    L5:
        this.f1262e = r2;
        requestLayout();
    }

    public void setMinWidth(int r2) {
        if (r2 != this.f1261d) goto L5;
        return;
    L5:
        this.f1261d = r2;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1049o r1) {
        C0002c r12 = this.f1268k;
        if (r12 == null) goto L6;
        r12.getClass();
        return;
    }

    public void setOptimizationLevel(int r2) {
        this.f1266i = r2;
        this.f1260c.f3651p0 = r2;
        if ((r2 & 256) != 256) goto L5;
        boolean r22 = true;
    L6:
        C0985e.f3485p = r22;
        return;
    L5:
        r22 = false;
        goto L6
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context r2, AttributeSet r3, int r4) {
        super(r2, r3, r4);
        this.f1258a = new SparseArray();
        this.f1259b = new ArrayList(4);
        this.f1260c = new C1000e();
        this.f1261d = 0;
        this.f1262e = 0;
        this.f1263f = Integer.MAX_VALUE;
        this.f1264g = Integer.MAX_VALUE;
        this.f1265h = true;
        this.f1266i = 263;
        this.f1267j = null;
        this.f1268k = null;
        this.f1269l = -1;
        this.f1270m = new HashMap();
        this.f1271n = new SparseArray();
        this.f1272o = new C1040f(this);
        m1160c(r3, r4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r7) {
        C1039e r02 = new C1039e(r7);
        r02.f3903a = -1;
        r02.f3905b = -1;
        r02.f3907c = -1.0f;
        r02.f3909d = -1;
        r02.f3911e = -1;
        r02.f3913f = -1;
        r02.f3915g = -1;
        r02.f3917h = -1;
        r02.f3919i = -1;
        r02.f3921j = -1;
        r02.f3923k = -1;
        r02.f3925l = -1;
        r02.f3926m = -1;
        r02.f3927n = 0;
        r02.f3928o = 0.0f;
        r02.f3929p = -1;
        r02.f3930q = -1;
        r02.f3931r = -1;
        r02.f3932s = -1;
        r02.f3933t = -1;
        r02.f3934u = -1;
        r02.f3935v = -1;
        r02.f3936w = -1;
        r02.f3937x = -1;
        r02.f3938y = -1;
        r02.f3939z = 0.5f;
        r02.f3877A = 0.5f;
        r02.f3878B = null;
        r02.f3879C = 1;
        r02.f3880D = -1.0f;
        r02.f3881E = -1.0f;
        r02.f3882F = 0;
        r02.f3883G = 0;
        r02.f3884H = 0;
        r02.f3885I = 0;
        r02.f3886J = 0;
        r02.f3887K = 0;
        r02.f3888L = 0;
        r02.f3889M = 0;
        r02.f3890N = 1.0f;
        r02.f3891O = 1.0f;
        r02.f3892P = -1;
        r02.f3893Q = -1;
        r02.f3894R = -1;
        r02.f3895S = false;
        r02.f3896T = false;
        r02.f3897U = null;
        r02.f3898V = true;
        r02.f3899W = true;
        r02.f3900X = false;
        r02.f3901Y = false;
        r02.f3902Z = false;
        r02.f3904a0 = -1;
        r02.f3906b0 = -1;
        r02.f3908c0 = -1;
        r02.f3910d0 = -1;
        r02.f3912e0 = -1;
        r02.f3914f0 = -1;
        r02.f3916g0 = 0.5f;
        r02.f3924k0 = new C0999d();
        return r02;
    }
}
