package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ar;
import defpackage.au;
import defpackage.d4;
import defpackage.ec;
import defpackage.fc;
import defpackage.fo;
import defpackage.gc;
import defpackage.go;
import defpackage.hc;
import defpackage.ho;
import defpackage.ic;
import defpackage.ig;
import defpackage.jg;
import defpackage.m90;
import defpackage.oc;
import defpackage.oo;
import defpackage.pc;
import defpackage.po;
import defpackage.qb0;
import defpackage.qc;
import defpackage.r5;
import defpackage.rc;
import defpackage.rk;
import defpackage.ry;
import defpackage.sg;
import defpackage.v8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public final SparseArray a;
    public final ArrayList b;
    public final qc c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public oc j;
    public d4 k;
    public int l;
    public HashMap m;
    public final SparseArray n;
    public final hc o;

    public ConstraintLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new qc();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 263;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new hc(this);
        c(r3, 0);
    }

    public static gc a() {
        gc r0 = new gc(-2, -2);
        r0.a = -1;
        r0.b = -1;
        r0.c = -1.0f;
        r0.d = -1;
        r0.e = -1;
        r0.f = -1;
        r0.g = -1;
        r0.h = -1;
        r0.i = -1;
        r0.j = -1;
        r0.k = -1;
        r0.l = -1;
        r0.m = -1;
        r0.n = 0;
        r0.o = 0.0f;
        r0.p = -1;
        r0.q = -1;
        r0.r = -1;
        r0.s = -1;
        r0.t = -1;
        r0.u = -1;
        r0.v = -1;
        r0.w = -1;
        r0.x = -1;
        r0.y = -1;
        r0.z = 0.5f;
        r0.A = 0.5f;
        r0.B = null;
        r0.C = 1;
        r0.D = -1.0f;
        r0.E = -1.0f;
        r0.F = 0;
        r0.G = 0;
        r0.H = 0;
        r0.I = 0;
        r0.J = 0;
        r0.K = 0;
        r0.L = 0;
        r0.M = 0;
        r0.N = 1.0f;
        r0.O = 1.0f;
        r0.P = -1;
        r0.Q = -1;
        r0.R = -1;
        r0.S = false;
        r0.T = false;
        r0.U = null;
        r0.V = true;
        r0.W = true;
        r0.X = false;
        r0.Y = false;
        r0.Z = false;
        r0.a0 = -1;
        r0.b0 = -1;
        r0.c0 = -1;
        r0.d0 = -1;
        r0.e0 = -1;
        r0.f0 = -1;
        r0.g0 = 0.5f;
        r0.k0 = new pc();
        return r0;
    }

    private int getPaddingWidth() {
        int r0 = Math.max(0, getPaddingLeft());
        int r2 = Math.max(0, getPaddingRight()) + r0;
        int r02 = Math.max(0, getPaddingStart());
        int r1 = Math.max(0, getPaddingEnd()) + r02;
        if (r1 <= 0) goto L5;
        return r1;
    L5:
        return r2;
    }

    public final pc b(View r1) {
        if (r1 == this) goto L4;
        if (r1 != null) goto L9;
        return null;
    L9:
        return ((gc) r1.getLayoutParams()).k0;
    L4:
        return this.c;
    }

    public final void c(AttributeSet r8, int r9) {
        qc r0 = this.c;
        r0.U = this;
        hc r1 = this.o;
        r0.g0 = r1;
        r0.f0.f = r1;
        this.a.put(getId(), this);
        this.j = null;
        boolean r2 = false;
        if (r8 == null) goto L37;
        TypedArray r82 = getContext().obtainStyledAttributes(r8, ry.b, r9, 0);
        int r92 = r82.getIndexCount();
        int r3 = 0;
    L5:
        if (r3 >= r92) goto L36;
        int r4 = r82.getIndex(r3);
        if (r4 != 9) goto L10;
        this.d = r82.getDimensionPixelOffset(r4, this.d);
    L35:
        r3 = r3 + 1;
        goto L5
    L10:
        if (r4 != 10) goto L13;
        this.e = r82.getDimensionPixelOffset(r4, this.e);
        goto L35
    L13:
        if (r4 != 7) goto L16;
        this.f = r82.getDimensionPixelOffset(r4, this.f);
        goto L35
    L16:
        if (r4 != 8) goto L19;
        this.g = r82.getDimensionPixelOffset(r4, this.g);
        goto L35
    L19:
        if (r4 != 89) goto L22;
        this.i = r82.getInt(r4, this.i);
        goto L35
    L22:
        if (r4 != 38) goto L29;
        int r42 = r82.getResourceId(r4, 0);
        if (r42 == 0) goto L35;
        d(r42);     // Catch: Resources.NotFoundException -> L27
    L27:
        this.k = null;
        goto L35
    L29:
        if (r4 != 18) goto L35;
        int r43 = r82.getResourceId(r4, 0);
        oc r5 = new oc();     // Catch: Resources.NotFoundException -> L33
        this.j = r5;     // Catch: Resources.NotFoundException -> L33
        r5.e(getContext(), r43);     // Catch: Resources.NotFoundException -> L33
    L34:
        this.l = r43;
    L33:
        this.j = null;
        goto L34
    L36:
        r82.recycle();
    L37:
        int r83 = this.i;
        r0.p0 = r83;
        if ((r83 & 256) != 256) goto L40;
        r2 = true;
    L40:
        ar.p = r2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r1) {
        return r1 instanceof gc;
    }

    public final void d(int r8) {
        Context r1 = getContext();
        d4 r0 = new d4(7, false);
        r0.b = new SparseArray();
        r0.c = new SparseArray();
        XmlResourceParser r82 = r1.getResources().getXml(r8);
        int r2 = r82.getEventType();     // Catch: IOException -> L18 XmlPullParserException -> L20
        au r3 = null;
    L5:
        if (r2 == 1) goto L40;
        if (r2 != 0) goto L8;
        r82.getName();     // Catch: IOException -> L18 XmlPullParserException -> L20
    L36:
        r2 = r82.next();     // Catch: IOException -> L18 XmlPullParserException -> L20
    L8:
        if (r2 != 2) goto L36;
        String r22 = r82.getName();     // Catch: IOException -> L18 XmlPullParserException -> L20
        switch(r22.hashCode()) {
            case -1349929691: goto L32;
            case 80204913: goto L29;
            case 1382829617: goto L26;
            case 1657696882: goto L23;
            case 1901439077: goto L14;
            default: goto L34;
        };     // Catch: IOException -> L18 XmlPullParserException -> L20
    L34:
        Log.v("ConstraintLayoutStates", "unknown tag " + r22);     // Catch: IOException -> L18 XmlPullParserException -> L20
        goto L36
    L14:
        if (r22.equals("Variant") == false) goto L34;
        ic r23 = new ic(r1, r82);     // Catch: IOException -> L18 XmlPullParserException -> L20
        if (r3 == null) goto L36;
        ((ArrayList) r3.a).add(r23);     // Catch: IOException -> L18 XmlPullParserException -> L20
        goto L36
    L23:
        if (r22.equals("layoutDescription") == false) goto L34;
    L26:
        if (r22.equals("StateSet") == false) goto L34;
    L29:
        if (r22.equals("State") == false) goto L34;
        r3 = new au(r1, r82);     // Catch: IOException -> L18 XmlPullParserException -> L20
        ((SparseArray) r0.b).put(r3.b, r3);     // Catch: IOException -> L18 XmlPullParserException -> L20
        goto L36
    L32:
        if (r22.equals("ConstraintSet") == false) goto L34;
        r0.G(r1, r82);     // Catch: IOException -> L18 XmlPullParserException -> L20
    L40:
        this.k = r0;
        return;
    L18:
        e = move-exception;
        e.printStackTrace();
    L20:
        e = move-exception;
        e.printStackTrace();
        goto L40
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r18) {
        ArrayList r2 = this.b;
        if (r2 == null) goto L9;
        int r3 = r2.size();
        if (r3 <= 0) goto L9;
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L9;
        ((ec) r2.get(r4)).getClass();
        r4 = r4 + 1;
    L9:
        super.dispatchDraw(r18);
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
        float r11 = r72;
        float r12 = r82;
        float r13 = r72 + ((int) ((r9 / 1080.0f) * r32));
        r18.drawLine(r11, r12, r13, r12, r15);
        float r14 = r82 + ((int) ((Integer.parseInt(r63[3]) / 1920.0f) * r42));
        r18.drawLine(r13, r12, r13, r14, r15);
        r18.drawLine(r13, r14, r11, r14, r15);
        r18.drawLine(r11, r14, r11, r12, r15);
        r15.setColor(-16711936);
        r18.drawLine(r11, r12, r13, r14, r15);
        r18.drawLine(r11, r14, r13, r12, r15);
    L23:
        r5 = r5 + 1;
        goto L12
    L32:
        return;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r13) {
        Context r1 = getContext();
        gc r0 = new gc(r1, r13);
        r0.a = -1;
        r0.b = -1;
        r0.c = -1.0f;
        r0.d = -1;
        r0.e = -1;
        r0.f = -1;
        r0.g = -1;
        r0.h = -1;
        r0.i = -1;
        r0.j = -1;
        r0.k = -1;
        r0.l = -1;
        r0.m = -1;
        r0.n = 0;
        r0.o = 0.0f;
        r0.p = -1;
        r0.q = -1;
        r0.r = -1;
        r0.s = -1;
        r0.t = -1;
        r0.u = -1;
        r0.v = -1;
        r0.w = -1;
        r0.x = -1;
        r0.y = -1;
        r0.z = 0.5f;
        r0.A = 0.5f;
        r0.B = null;
        r0.C = 1;
        r0.D = -1.0f;
        r0.E = -1.0f;
        r0.F = 0;
        r0.G = 0;
        r0.H = 0;
        r0.I = 0;
        r0.J = 0;
        r0.K = 0;
        r0.L = 0;
        r0.M = 0;
        r0.N = 1.0f;
        r0.O = 1.0f;
        r0.P = -1;
        r0.Q = -1;
        r0.R = -1;
        r0.S = false;
        r0.T = false;
        r0.U = null;
        r0.V = true;
        r0.W = true;
        r0.X = false;
        r0.Y = false;
        r0.Z = false;
        r0.a0 = -1;
        r0.b0 = -1;
        r0.c0 = -1;
        r0.d0 = -1;
        r0.e0 = -1;
        r0.f0 = -1;
        r0.g0 = 0.5f;
        r0.k0 = new pc();
        TypedArray r132 = r1.obtainStyledAttributes(r13, ry.b);
        int r12 = r132.getIndexCount();
        int r3 = 0;
    L3:
        if (r3 >= r12) goto L139;
        int r6 = r132.getIndex(r3);
        int r7 = fc.a.get(r6);
        switch(r7) {
            case 1: goto L137;
            case 2: goto L134;
            case 3: goto L133;
            case 4: goto L130;
            case 5: goto L129;
            case 6: goto L128;
            case 7: goto L127;
            case 8: goto L124;
            case 9: goto L121;
            case 10: goto L118;
            case 11: goto L115;
            case 12: goto L112;
            case 13: goto L109;
            case 14: goto L106;
            case 15: goto L103;
            case 16: goto L100;
            case 17: goto L97;
            case 18: goto L94;
            case 19: goto L91;
            case 20: goto L88;
            case 21: goto L87;
            case 22: goto L86;
            case 23: goto L85;
            case 24: goto L84;
            case 25: goto L83;
            case 26: goto L82;
            case 27: goto L81;
            case 28: goto L80;
            case 29: goto L79;
            case 30: goto L78;
            case 31: goto L75;
            case 32: goto L72;
            case 33: goto L146;
            case 34: goto L142;
            case 35: goto L61;
            case 36: goto L144;
            case 37: goto L148;
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
            default: goto L138;
        };
    L8:
        r0.U = r132.getString(r6);
        goto L138
    L9:
        r0.Q = r132.getDimensionPixelOffset(r6, r0.Q);
        goto L138
    L10:
        r0.P = r132.getDimensionPixelOffset(r6, r0.P);
        goto L138
    L11:
        r0.G = r132.getInt(r6, 0);
        goto L138
    L12:
        r0.F = r132.getInt(r6, 0);
        goto L138
    L13:
        r0.E = r132.getFloat(r6, r0.E);
        goto L138
    L14:
        r0.D = r132.getFloat(r6, r0.D);
        goto L138
    L15:
        String r62 = r132.getString(r6);
        r0.B = r62;
        r0.C = -1;
        if (r62 == null) goto L138;
        int r63 = r62.length();
        int r72 = r0.B.indexOf(44);
        if (r72 > 0) goto L20;
    L28:
        int r73 = 0;
    L29:
        int r9 = r0.B.indexOf(58);
        if (r9 >= 0) goto L32;
    L46:
        String r64 = r0.B.substring(r73);
        if (r64.length() <= 0) goto L138;
        Float.parseFloat(r64);     // Catch: NumberFormatException -> L141
        goto L138
    L32:
        if (r9 >= (r63 - 1)) goto L46;
        String r65 = r0.B.substring(r73, r9);
        String r74 = r0.B.substring(r9 + 1);
        if (r65.length() <= 0) goto L138;
        if (r74.length() <= 0) goto L138;
        float r66 = Float.parseFloat(r65);     // Catch: NumberFormatException -> L141
        float r75 = Float.parseFloat(r74);     // Catch: NumberFormatException -> L141
        if (r66 <= 0.0f) goto L138;
        if (r75 <= 0.0f) goto L138;
        if (r0.C != 1) goto L44;
        Math.abs(r75 / r66);     // Catch: NumberFormatException -> L141
        goto L138
    L44:
        Math.abs(r66 / r75);     // Catch: NumberFormatException -> L141
        goto L138
    L20:
        if (r72 >= (r63 - 1)) goto L28;
        String r92 = r0.B.substring(0, r72);
        if (r92.equalsIgnoreCase("W") == false) goto L25;
        r0.C = 0;
    L27:
        r73 = r72 + 1;
        goto L29
    L25:
        if (r92.equalsIgnoreCase("H") == false) goto L27;
        r0.C = 1;
    L138:
        r3 = r3 + 1;
        goto L3
    L50:
        r0.O = Math.max(0.0f, r132.getFloat(r6, r0.O));
        r0.I = 2;
        goto L138
    L61:
        r0.N = Math.max(0.0f, r132.getFloat(r6, r0.N));
        r0.H = 2;
        goto L138
    L72:
        int r67 = r132.getInt(r6, 0);
        r0.I = r67;
        if (r67 != 1) goto L138;
        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
        goto L138
    L75:
        int r68 = r132.getInt(r6, 0);
        r0.H = r68;
        if (r68 != 1) goto L138;
        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
        goto L138
    L78:
        r0.A = r132.getFloat(r6, r0.A);
        goto L138
    L79:
        r0.z = r132.getFloat(r6, r0.z);
        goto L138
    L80:
        r0.T = r132.getBoolean(r6, r0.T);
        goto L138
    L81:
        r0.S = r132.getBoolean(r6, r0.S);
        goto L138
    L82:
        r0.y = r132.getDimensionPixelSize(r6, r0.y);
        goto L138
    L83:
        r0.x = r132.getDimensionPixelSize(r6, r0.x);
        goto L138
    L84:
        r0.w = r132.getDimensionPixelSize(r6, r0.w);
        goto L138
    L85:
        r0.v = r132.getDimensionPixelSize(r6, r0.v);
        goto L138
    L86:
        r0.u = r132.getDimensionPixelSize(r6, r0.u);
        goto L138
    L87:
        r0.t = r132.getDimensionPixelSize(r6, r0.t);
        goto L138
    L88:
        int r76 = r132.getResourceId(r6, r0.s);
        r0.s = r76;
        if (r76 != (-1)) goto L138;
        r0.s = r132.getInt(r6, -1);
        goto L138
    L91:
        int r77 = r132.getResourceId(r6, r0.r);
        r0.r = r77;
        if (r77 != (-1)) goto L138;
        r0.r = r132.getInt(r6, -1);
        goto L138
    L94:
        int r78 = r132.getResourceId(r6, r0.q);
        r0.q = r78;
        if (r78 != (-1)) goto L138;
        r0.q = r132.getInt(r6, -1);
        goto L138
    L97:
        int r79 = r132.getResourceId(r6, r0.p);
        r0.p = r79;
        if (r79 != (-1)) goto L138;
        r0.p = r132.getInt(r6, -1);
        goto L138
    L100:
        int r710 = r132.getResourceId(r6, r0.l);
        r0.l = r710;
        if (r710 != (-1)) goto L138;
        r0.l = r132.getInt(r6, -1);
        goto L138
    L103:
        int r711 = r132.getResourceId(r6, r0.k);
        r0.k = r711;
        if (r711 != (-1)) goto L138;
        r0.k = r132.getInt(r6, -1);
        goto L138
    L106:
        int r712 = r132.getResourceId(r6, r0.j);
        r0.j = r712;
        if (r712 != (-1)) goto L138;
        r0.j = r132.getInt(r6, -1);
        goto L138
    L109:
        int r713 = r132.getResourceId(r6, r0.i);
        r0.i = r713;
        if (r713 != (-1)) goto L138;
        r0.i = r132.getInt(r6, -1);
        goto L138
    L112:
        int r714 = r132.getResourceId(r6, r0.h);
        r0.h = r714;
        if (r714 != (-1)) goto L138;
        r0.h = r132.getInt(r6, -1);
        goto L138
    L115:
        int r715 = r132.getResourceId(r6, r0.g);
        r0.g = r715;
        if (r715 != (-1)) goto L138;
        r0.g = r132.getInt(r6, -1);
        goto L138
    L118:
        int r716 = r132.getResourceId(r6, r0.f);
        r0.f = r716;
        if (r716 != (-1)) goto L138;
        r0.f = r132.getInt(r6, -1);
        goto L138
    L121:
        int r717 = r132.getResourceId(r6, r0.e);
        r0.e = r717;
        if (r717 != (-1)) goto L138;
        r0.e = r132.getInt(r6, -1);
        goto L138
    L124:
        int r718 = r132.getResourceId(r6, r0.d);
        r0.d = r718;
        if (r718 != (-1)) goto L138;
        r0.d = r132.getInt(r6, -1);
        goto L138
    L127:
        r0.c = r132.getFloat(r6, r0.c);
        goto L138
    L128:
        r0.b = r132.getDimensionPixelOffset(r6, r0.b);
        goto L138
    L129:
        r0.a = r132.getDimensionPixelOffset(r6, r0.a);
        goto L138
    L130:
        float r69 = r132.getFloat(r6, r0.o) % 360.0f;
        r0.o = r69;
        if (r69 >= 0.0f) goto L138;
        r0.o = (360.0f - r69) % 360.0f;
        goto L138
    L133:
        r0.n = r132.getDimensionPixelSize(r6, r0.n);
        goto L138
    L134:
        int r719 = r132.getResourceId(r6, r0.m);
        r0.m = r719;
        if (r719 != (-1)) goto L138;
        r0.m = r132.getInt(r6, -1);
        goto L138
    L137:
        r0.R = r132.getInt(r6, r0.R);
        goto L138
    L142:
        r0.L = r132.getDimensionPixelSize(r6, r0.L);     // Catch: Exception -> L64
    L65:
        if (r132.getInt(r6, r0.L) != (-2)) goto L138;
        r0.L = -2;
        goto L138
    L144:
        r0.K = r132.getDimensionPixelSize(r6, r0.K);     // Catch: Exception -> L58
    L59:
        if (r132.getInt(r6, r0.K) != (-2)) goto L138;
        r0.K = -2;
        goto L138
    L146:
        r0.J = r132.getDimensionPixelSize(r6, r0.J);     // Catch: Exception -> L69
    L70:
        if (r132.getInt(r6, r0.J) != (-2)) goto L138;
        r0.J = -2;
        goto L138
    L148:
        r0.M = r132.getDimensionPixelSize(r6, r0.M);     // Catch: Exception -> L53
    L54:
        if (r132.getInt(r6, r0.M) != (-2)) goto L138;
        r0.M = -2;
        goto L138
    L139:
        r132.recycle();
        r0.a();
        return r0;
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.p0;
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
        gc r0 = (gc) r92.getLayoutParams();
        pc r1 = r0.k0;
        if (r92.getVisibility() == 8) goto L7;
    L12:
        int r02 = r1.m();
        int r2 = r1.n();
        r92.layout(r02, r2, r1.l() + r02, r1.i() + r2);
    L13:
        r82 = r82 + 1;
        goto L3
    L7:
        if (r0.Y == true) goto L12;
        if (r0.Z == true) goto L12;
        if (r62 == true) goto L12;
    L14:
        ArrayList r53 = this.b;
        int r63 = r53.size();
        if (r63 <= 0) goto L18;
    L16:
        if (r72 >= r63) goto L23;
        ((ec) r53.get(r72)).getClass();
        r72 = r72 + 1;
        goto L16
    L23:
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r42, int r43) {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) goto L5;
    L7:
        boolean r3 = false;
    L8:
        qc r7 = this.c;
        r7.h0 = r3;
        r5 r32 = r7.e0;
        ig r8 = r7.f0;
        if (this.h == false) goto L312;
        this.h = false;
        int r9 = getChildCount();
        int r18 = 4194304;
        int r4 = 0;
    L11:
        if (r4 >= r9) goto L16;
        if (getChildAt(r4).isLayoutRequested() == true) goto L14;
        r4 = r4 + 1;
        goto L11
    L14:
        boolean r44 = true;
    L17:
        if (r44 == false) goto L299;
        boolean r92 = isInEditMode();
        boolean r19 = true;
        int r5 = getChildCount();
        int r10 = 0;
    L19:
        if (r10 >= r5) goto L25;
        pc r11 = b(getChildAt(r10));
        if (r11 == null) goto L24;
        r11.s();
    L24:
        r10 = r10 + 1;
        goto L19
    L25:
        SparseArray r112 = this.a;
        if (r92 == false) goto L63;
        int r12 = 0;
    L28:
        if (r12 >= r5) goto L63;
        View r21 = getChildAt(r12);
        String r14 = getResources().getResourceName(r21.getId());     // Catch: Resources.NotFoundException -> L682
        Integer r15 = Integer.valueOf(r21.getId());     // Catch: Resources.NotFoundException -> L682
        if (r14 != null) goto L33;
    L40:
        int r6 = r14.indexOf(47);     // Catch: Resources.NotFoundException -> L682
        if (r6 == (-1)) goto L43;
        r14 = r14.substring(r6 + 1);     // Catch: Resources.NotFoundException -> L682
    L43:
        int r62 = r21.getId();     // Catch: Resources.NotFoundException -> L682
        if (r62 != 0) goto L46;
    L45:
        pc r63 = r7;
    L59:
        r63.W = r14;     // Catch: Resources.NotFoundException -> L682
        goto L60
    L46:
        View r102 = (View) r112.get(r62);     // Catch: Resources.NotFoundException -> L682
        if (r102 != null) goto L54;
        r102 = findViewById(r62);     // Catch: Resources.NotFoundException -> L682
        if (r102 == null) goto L54;
        if (r102 == this) goto L54;
        if (r102.getParent() != this) goto L54;
        onViewAdded(r102);     // Catch: Resources.NotFoundException -> L682
    L54:
        if (r102 == this) goto L45;
        if (r102 != null) goto L58;
        r63 = null;
        goto L59
    L58:
        r63 = ((gc) r102.getLayoutParams()).k0;     // Catch: Resources.NotFoundException -> L682
        goto L59
    L33:
        if (this.m != null) goto L35;
        this.m = new HashMap();     // Catch: Resources.NotFoundException -> L682
    L35:
        int r103 = r14.indexOf("/");     // Catch: Resources.NotFoundException -> L682
        if (r103 == (-1)) goto L38;
        String r104 = r14.substring(r103 + 1);     // Catch: Resources.NotFoundException -> L682
    L39:
        this.m.put(r104, r15);     // Catch: Resources.NotFoundException -> L682
        goto L40
    L38:
        r104 = r14;
    L60:
        r12 = r12 + 1;
    L63:
        if (this.l == (-1)) goto L67;
        int r64 = 0;
    L65:
        if (r64 >= r5) goto L67;
        getChildAt(r64).getId();
        r64 = r64 + 1;
    L67:
        oc r65 = this.j;
        if (r65 == null) goto L70;
        r65.a(this);
    L70:
        r7.d0.clear();
        ArrayList r66 = this.b;
        int r105 = r66.size();
        if (r105 <= 0) goto L103;
        int r122 = 0;
    L73:
        if (r122 >= r105) goto L103;
        ec r142 = (ec) r66.get(r122);
        HashMap r152 = r142.f;
        if (r142.isInEditMode() == false) goto L77;
        r142.setIds(r142.e);
    L77:
        oo r13 = r142.d;
        if (r13 != null) goto L80;
        boolean r26 = r44;
        ArrayList r29 = r66;
        boolean r30 = r92;
    L102:
        r122 = r122 + 1;
        r44 = r26;
        r66 = r29;
        r92 = r30;
        goto L73
    L80:
        r26 = r44;
        r13.e0 = 0;
        Arrays.fill(r13.d0, null);
        int r45 = 0;
    L82:
        if (r45 >= r142.b) goto L101;
        int r132 = r142.a[r45];
        View r27 = (View) r112.get(r132);
        if (r27 != null) goto L89;
        String r133 = (String) r152.get(Integer.valueOf(r132));
        int r28 = r45;
        int r46 = r142.d(this, r133);
        ArrayList r292 = r66;
        if (r46 == 0) goto L88;
        r142.a[r28] = r46;
        r152.put(Integer.valueOf(r46), r133);
        r27 = (View) r112.get(r46);
    L88:
        View r47 = r27;
        if (r47 == null) goto L99;
        oo r67 = r142.d;
        pc r48 = b(r47);
        r67.getClass();
        if (r48 == r67) goto L99;
        if (r48 == null) goto L99;
        int r134 = r67.e0 + 1;
        pc[] r49 = r67.d0;
        boolean r302 = r92;
        if (r134 <= r49.length) goto L98;
        r67.d0 = (pc[]) Arrays.copyOf(r49, r49.length * 2);
    L98:
        pc[] r410 = r67.d0;
        int r93 = r67.e0;
        r410[r93] = r48;
        r67.e0 = r93 + 1;
    L100:
        r45 = r28 + 1;
        r66 = r292;
        r92 = r302;
    L99:
        r302 = r92;
        goto L100
    L89:
        r28 = r45;
        r292 = r66;
        goto L88
    L101:
        r29 = r66;
        r30 = r92;
        r142.d.B();
    L103:
        boolean r262 = r44;
        boolean r303 = r92;
        int r411 = 0;
    L104:
        if (r411 >= r5) goto L106;
        getChildAt(r411);
        r411 = r411 + 1;
        goto L104
    L106:
        SparseArray r412 = this.n;
        r412.clear();
        r412.put(0, r7);
        r412.put(getId(), r7);
        int r68 = 0;
    L107:
        if (r68 >= r5) goto L109;
        View r94 = getChildAt(r68);
        r412.put(r94.getId(), b(r94));
        r68 = r68 + 1;
        goto L107
    L109:
        int r69 = 0;
    L110:
        if (r69 >= r5) goto L300;
        View r95 = getChildAt(r69);
        pc r106 = b(r95);
        if (r106 != null) goto L114;
        SparseArray r16 = r412;
        int r272 = r5;
        int r39 = r69;
        SparseArray r135 = r112;
    L297:
        r69 = r39 + 1;
        r112 = r135;
        r412 = r16;
        r5 = r272;
        r19 = true;
        goto L110
    L114:
        gc r123 = (gc) r95.getLayoutParams();
        r7.d0.add(r106);
        pc r136 = r106.I;
        if (r136 == null) goto L117;
        ((qc) r136).d0.remove(r106);
        Object r137 = null;
        r106.I = null;
    L118:
        r106.I = r7;
        r123.a();
        r106.V = r95.getVisibility();
        r106.U = r95;
        if ((r95 instanceof ec) == false) goto L122;
        ((ec) r95).f(r106, r7.h0);
    L122:
        if (r123.Y == false) goto L135;
        go r107 = (go) r106;
        int r96 = r123.h0;
        int r143 = r123.i0;
        float r124 = r123.j0;
        if (r124 == (-1.0f)) goto L129;
        if (r124 <= (-1.0f)) goto L127;
        r107.d0 = r124;
        r107.e0 = -1;
        r107.f0 = -1;
    L127:
        r16 = r412;
        r272 = r5;
        r39 = r69;
        r135 = r112;
        goto L297
    L129:
        if (r96 == (-1)) goto L132;
        if (r96 <= (-1)) goto L127;
        r107.d0 = -1.0f;
        r107.e0 = r96;
        r107.f0 = -1;
        goto L127
    L132:
        if (r143 == (-1)) goto L127;
        if (r143 <= (-1)) goto L127;
        r107.d0 = -1.0f;
        r107.e0 = -1;
        r107.f0 = r143;
        goto L127
    L135:
        int r97 = r123.a0;
        int r144 = r123.b0;
        int r153 = r123.c0;
        int r138 = r123.d0;
        r272 = r5;
        int r52 = r123.e0;
        int r139 = r123.f0;
        SparseArray r293 = r112;
        float r113 = r123.g0;
        int r53 = r123.m;
        r39 = r69;
        int r610 = -1;
        if (r53 == (-1)) goto L141;
        pc r36 = (pc) r412.get(r53);
        if (r36 == null) goto L140;
        float r54 = r123.o;
        r106.o(7, 7, r123.n, 0, r36);
        r106.v = r54;
    L140:
        r16 = r412;
        gc r98 = r123;
        r135 = r293;
        int r114 = 3;
        r610 = -1;
        float r20 = 0.0f;
    L202:
        if (r303 == false) goto L209;
        int r413 = r98.P;
        if (r413 == r610) goto L206;
    L207:
        int r55 = r98.Q;
        r106.N = r413;
        r106.O = r55;
        goto L209
    L206:
        if (r98.Q != r610) goto L207;
    L209:
        if (r98.V == false) goto L211;
        int r414 = 3;
        int r125 = 4;
        r106.w(1);
        r106.y(((ViewGroup.MarginLayoutParams) r98).width);
        if (((ViewGroup.MarginLayoutParams) r98).width != (-2)) goto L223;
        r106.w(2);
    L223:
        if (r98.W == false) goto L225;
        r106.x(1);
        r106.v(((ViewGroup.MarginLayoutParams) r98).height);
        if (((ViewGroup.MarginLayoutParams) r98).height != (-2)) goto L235;
        r106.x(2);
    L235:
        String r56 = r98.B;
        if (r56 == null) goto L278;
        if (r56.length() == 0) goto L278;
        int r115 = r56.length();
        int r145 = r56.indexOf(44);
        if (r145 > 0) goto L243;
    L252:
        int r611 = -1;
        int r146 = 0;
    L253:
        int r154 = r56.indexOf(58);
        if (r154 >= 0) goto L256;
    L270:
        String r57 = r56.substring(r146);
        if (r57.length() <= 0) goto L274;
        float r58 = Float.parseFloat(r57);     // Catch: NumberFormatException -> L683
    L276:
        if (r58 <= r20) goto L279;
        r106.L = r58;
        r106.M = r611;
    L279:
        float r59 = r98.D;
        float[] r612 = r106.Z;
        r612[0] = r59;
        r612[1] = r98.E;
        r106.X = r98.F;
        r106.Y = r98.G;
        int r510 = r98.H;
        int r613 = r98.J;
        int r116 = r98.L;
        float r147 = r98.N;
        r106.j = r510;
        r106.m = r613;
        if (r116 != Integer.MAX_VALUE) goto L282;
        r116 = 0;
    L282:
        r106.n = r116;
        r106.o = r147;
        if (r147 > 0.0f) goto L285;
    L288:
        int r511 = r98.I;
        int r117 = r98.K;
        int r148 = r98.M;
        float r99 = r98.O;
        r106.k = r511;
        r106.p = r117;
        if (r148 != Integer.MAX_VALUE) goto L291;
        r148 = 0;
    L291:
        r106.q = r148;
        r106.r = r99;
        if (r99 <= 0.0f) goto L297;
        if (r99 >= 1.0f) goto L297;
        if (r511 != 0) goto L297;
        r106.k = 2;
        goto L297
    L285:
        if (r147 >= 1.0f) goto L288;
        if (r510 != 0) goto L288;
        r106.j = 2;
    L274:
        r58 = r20;
        goto L276
    L256:
        if (r154 >= (r115 - 1)) goto L270;
        String r118 = r56.substring(r146, r154);
        String r512 = r56.substring(r154 + 1);
        if (r118.length() <= 0) goto L274;
        if (r512.length() <= 0) goto L274;
        float r119 = Float.parseFloat(r118);     // Catch: NumberFormatException -> L683
        float r513 = Float.parseFloat(r512);     // Catch: NumberFormatException -> L683
        if (r119 <= r20) goto L274;
        if (r513 <= r20) goto L274;
        if (r611 != 1) goto L268;
        r58 = Math.abs(r513 / r119);     // Catch: NumberFormatException -> L683
        goto L276
    L268:
        r58 = Math.abs(r119 / r513);     // Catch: NumberFormatException -> L683
        goto L276
    L243:
        if (r145 >= (r115 - 1)) goto L252;
        String r614 = r56.substring(0, r145);
        if (r614.equalsIgnoreCase("W") == false) goto L248;
        r611 = 0;
    L251:
        r146 = r145 + 1;
        goto L253
    L248:
        if (r614.equalsIgnoreCase("H") == false) goto L250;
        r611 = 1;
        goto L251
    L250:
        r611 = -1;
    L278:
        r106.L = r20;
        goto L279
    L225:
        if (((ViewGroup.MarginLayoutParams) r98).height == r610) goto L227;
        r106.x(r414);
        r106.v(0);
        goto L235
    L227:
        if (r98.T == false) goto L229;
        r106.x(r414);
    L230:
        r106.g(r114).e = ((ViewGroup.MarginLayoutParams) r98).topMargin;
        r106.g(5).e = ((ViewGroup.MarginLayoutParams) r98).bottomMargin;
        goto L235
    L229:
        r106.x(r125);
        goto L230
    L211:
        if (((ViewGroup.MarginLayoutParams) r98).width == r610) goto L213;
        r414 = 3;
        r125 = 4;
        r106.w(3);
        r106.y(0);
        goto L223
    L213:
        if (r98.S == false) goto L216;
        r414 = 3;
        r106.w(3);
        r125 = 4;
    L217:
        r106.g(2).e = ((ViewGroup.MarginLayoutParams) r98).leftMargin;
        r106.g(4).e = ((ViewGroup.MarginLayoutParams) r98).rightMargin;
        goto L223
    L216:
        r414 = 3;
        r125 = 4;
        r106.w(4);
        goto L217
    L141:
        if (r97 == (-1)) goto L147;
        pc r362 = (pc) r412.get(r97);
        if (r362 == null) goto L145;
        int r322 = 2;
        r106.o(2, 2, ((ViewGroup.MarginLayoutParams) r123).leftMargin, r52, r362);
    L146:
        pc r31 = r106;
        r98 = r123;
        int r22 = r139;
        int r108 = r153;
        int r514 = r138;
        int r1310 = 4;
    L152:
        if (r108 == (-1)) goto L158;
        pc r17 = (pc) r412.get(r108);
        if (r17 == null) goto L156;
        pc r126 = r31;
        r126.o(r1310, r322, ((ViewGroup.MarginLayoutParams) r98).rightMargin, r22, r17);
        r106 = r126;
    L163:
        int r127 = r98.h;
        if (r127 == (-1)) goto L170;
        pc r363 = (pc) r412.get(r127);
        if (r363 == null) goto L168;
        int r323 = 3;
        r106.o(3, 3, ((ViewGroup.MarginLayoutParams) r98).topMargin, r98.u, r363);
    L169:
        float r515 = r113;
        SparseArray r40 = r293;
        int r1110 = 5;
        r20 = 0.0f;
    L175:
        int r128 = r98.j;
        if (r128 == (-1)) goto L180;
        pc r155 = (pc) r412.get(r128);
        if (r155 == null) goto L185;
        r106.o(r1110, r323, ((ViewGroup.MarginLayoutParams) r98).bottomMargin, r98.w, r155);
    L185:
        int r129 = r98.l;
        if (r129 == (-1)) goto L195;
        r135 = r40;
        View r1210 = (View) r135.get(r129);
        pc r149 = (pc) r412.get(r98.l);
        if (r149 == null) goto L193;
        if (r1210 == null) goto L193;
        if ((r1210.getLayoutParams() instanceof gc) == false) goto L193;
        gc r1211 = (gc) r1210.getLayoutParams();
        boolean r156 = r19;
        r98.X = r156;
        r1211.X = r156;
        r16 = r412;
        r106.g(6).b(r149.g(6), 0, -1, r156);
        r106.w = r156;
        r1211.k0.w = r156;
        r114 = 3;
        r106.g(3).h();
        r106.g(5).h();
    L197:
        if (r515 < r20) goto L199;
        r106.S = r515;
    L199:
        float r415 = r98.A;
        if (r415 < r20) goto L202;
        r106.T = r415;
    L193:
        r16 = r412;
    L194:
        r114 = 3;
        goto L197
    L195:
        r16 = r412;
        r135 = r40;
        goto L194
    L180:
        int r1212 = r98.k;
        if (r1212 == (-1)) goto L185;
        pc r157 = (pc) r412.get(r1212);
        if (r157 == null) goto L185;
        r106.o(r1110, r1110, ((ViewGroup.MarginLayoutParams) r98).bottomMargin, r98.w, r157);
        goto L185
    L168:
        r323 = 3;
        goto L169
    L170:
        r323 = 3;
        int r1213 = r98.i;
        if (r1213 == (-1)) goto L169;
        pc r158 = (pc) r412.get(r1213);
        if (r158 == null) goto L169;
        r515 = r113;
        r40 = r293;
        r20 = 0.0f;
        r106.o(3, 5, ((ViewGroup.MarginLayoutParams) r98).topMargin, r98.u, r158);
        r1110 = 5;
        goto L175
    L156:
        r106 = r31;
        goto L163
    L158:
        int r162 = r22;
        r106 = r31;
        if (r514 == (-1)) goto L163;
        pc r172 = (pc) r412.get(r514);
        if (r172 == null) goto L163;
        r106.o(r1310, r1310, ((ViewGroup.MarginLayoutParams) r98).rightMargin, r162, r172);
        goto L163
    L145:
        r322 = 2;
        goto L146
    L147:
        r322 = 2;
        if (r144 == (-1)) goto L146;
        pc r516 = (pc) r412.get(r144);
        if (r516 == null) goto L146;
        r108 = r153;
        r98 = r123;
        r22 = r139;
        r514 = r138;
        r106.o(2, 4, ((ViewGroup.MarginLayoutParams) r123).leftMargin, r52, r516);
        r31 = r106;
        r1310 = 4;
        goto L152
    L117:
        r137 = null;
    L300:
        if (r262 == false) goto L313;
        ArrayList r517 = (ArrayList) r32.b;
        r517.clear();
        int r615 = r7.d0.size();
        int r910 = 0;
    L302:
        if (r910 >= r615) goto L311;
        pc r109 = (pc) r7.d0.get(r910);
        int[] r1111 = r109.c0;
        int r1311 = r1111[0];
        if (r1311 == 3) goto L309;
        if (r1311 == 4) goto L309;
        int r1112 = r1111[1];
        if (r1112 == 3) goto L309;
        if (r1112 == 4) goto L309;
    L310:
        r910 = r910 + 1;
    L309:
        r517.add(r109);
        goto L310
    L311:
        r8.b = true;
    L313:
        int r518 = this.i;
        int r616 = View.MeasureSpec.getMode(r42);
        int r911 = View.MeasureSpec.getSize(r42);
        int r1010 = View.MeasureSpec.getMode(r43);
        int r1113 = View.MeasureSpec.getSize(r43);
        int r1312 = Math.max(0, getPaddingTop());
        int r159 = Math.max(0, getPaddingBottom());
        int r1214 = r1312 + r159;
        int r416 = getPaddingWidth();
        hc r1410 = this.o;
        r1410.b = r1312;
        r1410.c = r159;
        r1410.d = r416;
        r1410.e = r1214;
        r1410.f = r42;
        r1410.g = r43;
        int r1510 = Math.max(0, getPaddingStart());
        int r912 = Math.max(0, getPaddingEnd());
        if (r1510 > 0) goto L319;
        if (r912 > 0) goto L319;
        r1510 = Math.max(0, getPaddingLeft());
    L323:
        int r913 = r911 - r416;
        int r1114 = r1113 - r1214;
        int r417 = r1410.e;
        int r1215 = r1410.d;
        int r163 = getChildCount();
        if (r616 == Integer.MIN_VALUE) goto L335;
        if (r616 != 0) goto L327;
        if (r163 != 0) goto L334;
        int r263 = r1215;
        int r418 = Math.max(0, this.d);
    L333:
        int r2 = Integer.MIN_VALUE;
        int r1216 = 2;
    L339:
        if (r1010 == r2) goto L351;
        if (r1010 != 0) goto L342;
        if (r163 != 0) goto L348;
        hc r164 = r1410;
        int r23 = Math.max(0, this.e);
    L347:
        int r1 = 2;
    L354:
        int r1411 = r7.l();
        int[] r1115 = r7.u;
        if (r418 != r1411) goto L361;
        if (r23 != r7.i()) goto L361;
        char r192 = 1;
    L362:
        r7.N = 0;
        r7.O = 0;
        r1115[0] = this.f - r263;
        r1115[r192] = this.g - r417;
        r7.Q = 0;
        r7.R = 0;
        r7.w(r1216);
        r7.y(r418);
        r7.x(r1);
        r7.v(r23);
        int r110 = this.d - r263;
        if (r110 >= 0) goto L365;
        r7.Q = 0;
    L366:
        int r111 = this.e - r417;
        if (r111 >= 0) goto L369;
        r7.R = 0;
    L370:
        r7.j0 = r1510;
        r7.k0 = r1312;
        qc r120 = (qc) r32.d;
        ArrayList r24 = (ArrayList) r32.b;
        hc r419 = r7.g0;
        int r1217 = r7.d0.size();
        int r1313 = r7.l();
        int r1412 = r7.i();
        if ((r518 & 128) != 128) goto L373;
        boolean r519 = true;
    L374:
        if (r519 == true) goto L379;
        int[] r264 = r1115;
        if ((r518 & 64) == 64) goto L380;
        boolean r1116 = false;
    L381:
        if (r1116 == false) goto L417;
        int r1511 = 0;
    L383:
        if (r1511 >= r1217) goto L417;
        boolean r173 = r1116;
        pc r1117 = (pc) r7.d0.get(r1511);
        int r273 = r1217;
        int[] r1218 = r1117.c0;
        int r294 = r1511;
        if (r1218[0] != 3) goto L388;
        boolean r304 = true;
    L390:
        if (r1218[1] != 3) goto L392;
        boolean r1219 = true;
    L393:
        if (r304 == false) goto L399;
        if (r1219 == false) goto L399;
        if (r1117.L <= 0.0f) goto L399;
        boolean r1220 = true;
    L401:
        if (r1117.q() == false) goto L405;
        if (r1220 == false) goto L405;
    L403:
        int r1118 = 1073741824;
        boolean r174 = false;
    L418:
        if (r616 != r1118) goto L420;
        if (r1010 != r1118) goto L420;
    L421:
        boolean r1119 = true;
    L424:
        if ((r174 & r1119) == false) goto L537;
        int r914 = Math.min(r264[0], r913);
        int r1120 = Math.min(r264[1], r1114);
        int r1221 = 1073741824;
        if (r616 == 1073741824) goto L428;
    L431:
        if (r1010 == r1221) goto L433;
    L435:
        if (r616 != r1221) goto L516;
        if (r1010 != r1221) goto L516;
        ArrayList r915 = r8.e;
        qc r1121 = r8.a;
        if (r8.b == false) goto L440;
    L443:
        ArrayList r1222 = r1121.d0;
        int r1512 = r1222.size();
        int r0 = 0;
    L444:
        if (r0 >= r1512) goto L446;
        Object r175 = r1222.get(r0);
        int r02 = r0 + 1;
        pc r03 = (pc) r175;
        r03.a = false;
        r03.d.n();
        r03.e.m();
        r1222 = r1222;
        r0 = r02;
        goto L444
    L446:
        int r1223 = 0;
        r1121.a = false;
        r1121.d.n();
        r1121.e.m();
        r8.c = false;
    L447:
        r8.b(r8.d);
        r1121.N = r1223;
        int[] r04 = r1121.c0;
        m90 r1513 = r1121.e;
        po r05 = r1121.d;
        r1121.O = r1223;
        hc r202 = r419;
        int r420 = r1121.h(r1223);
        ArrayList r242 = r24;
        int r25 = r1121.h(1);
        if (r8.b == false) goto L450;
        r8.c();
    L450:
        int r1224 = r1121.m();
        qc r265 = r120;
        int r121 = r1121.n();
        int r282 = r1313;
        jg r1314 = r05.h;
        int r295 = r1412;
        sg r1413 = r05.e;
        r1314.d(r1224);
        jg r1315 = r1513.h;
        sg r1225 = r1513.e;
        r1315.d(r121);
        r8.g();
        if (r420 == 2) goto L457;
        if (r25 == 2) goto L457;
        int r312 = r121;
    L455:
        int r130 = 1;
    L472:
        int r520 = r04[0];
        if (r520 != r130) goto L475;
    L478:
        int r131 = r1121.l() + r1224;
        r05.i.d(r131);
        r1413.d(r131 - r1224);
        r8.g();
        int r06 = r04[1];
        if (r06 != 1) goto L481;
    L482:
        int r07 = r1121.i() + r312;
        r1513.i.d(r07);
        r1225.d(r07 - r312);
    L483:
        r8.g();
        boolean r08 = true;
    L484:
        int r140 = r915.size();
        int r521 = 0;
    L485:
        if (r521 >= r140) goto L492;
        Object r82 = r915.get(r521);
        r521 = r521 + 1;
        qb0 r83 = (qb0) r82;
        if (r83.b != r1121) goto L491;
        if (r83.g == false) goto L485;
    L491:
        r83.e();
        goto L485
    L492:
        int r141 = r915.size();
        int r522 = 0;
    L493:
        if (r522 >= r141) goto L514;
        Object r84 = r915.get(r522);
        r522 = r522 + 1;
        qb0 r85 = (qb0) r84;
        if (r08 == true) goto L500;
        if (r85.b == r1121) goto L493;
    L500:
        if (r85.h.j == false) goto L501;
        if (r85.i.j == true) goto L508;
        if ((r85 instanceof ho) == false) goto L501;
    L508:
        if (r85.e.j == true) goto L493;
        if ((r85 instanceof v8) == true) goto L493;
        if ((r85 instanceof ho) == true) goto L493;
    L501:
        boolean r09 = false;
    L515:
        r1121.w(r420);
        r1121.x(r25);
        boolean r150 = r09;
        int r010 = 2;
        int r1226 = 1073741824;
    L529:
        if (r150 == false) goto L538;
        if (r616 != r1226) goto L532;
        boolean r210 = true;
    L533:
        if (r1010 != r1226) goto L535;
        boolean r421 = true;
    L536:
        r7.z(r210, r421);
        goto L538
    L535:
        r421 = false;
        goto L536
    L532:
        r210 = false;
    L538:
        if (r150 == true) goto L540;
    L541:
        if (r273 <= 0) goto L570;
        int r011 = r7.d0.size();
        hc r151 = r7.g0;
        int r211 = 0;
    L543:
        if (r211 >= r011) goto L562;
        pc r422 = (pc) r7.d0.get(r211);
        if ((r422 instanceof go) == false) goto L548;
    L561:
        r211 = r211 + 1;
        goto L543
    L548:
        if (r422.d.e.j == true) goto L550;
    L552:
        int r523 = r422.h(0);
        int r617 = r422.h(1);
        if (r523 == 3) goto L555;
    L560:
        r32.x(r151, r422, false);
        goto L561
    L555:
        if (r422.j == 1) goto L560;
        if (r617 != 3) goto L560;
        if (r422.k == 1) goto L560;
    L550:
        if (r422.e.e.j == false) goto L552;
    L562:
        ConstraintLayout r012 = r151.a;
        int r160 = r012.getChildCount();
        ArrayList r212 = r012.b;
        int r423 = 0;
    L563:
        if (r423 >= r160) goto L565;
        r012.getChildAt(r423);
        r423 = r423 + 1;
        goto L563
    L565:
        int r013 = r212.size();
        if (r013 <= 0) goto L570;
        int r161 = 0;
    L568:
        if (r161 >= r013) goto L570;
        ((ec) r212.get(r161)).getClass();
        r161 = r161 + 1;
    L570:
        int r014 = r7.p0;
        int r165 = r242.size();
        int r213 = r282;
        int r424 = r295;
        if (r273 <= 0) goto L573;
        r32.A(r7, r213, r424);
    L573:
        if (r165 <= 0) goto L670;
        int[] r524 = r7.c0;
        if (r524[0] != 2) goto L578;
        boolean r618 = true;
    L580:
        if (r524[1] != 2) goto L582;
        boolean r525 = true;
    L583:
        qc r916 = r265;
        int r86 = Math.max(r7.l(), r916.Q);
        int r1011 = r86;
        int r1122 = Math.max(r7.i(), r916.R);
        int r87 = 0;
        boolean r917 = false;
    L584:
        if (r87 >= r165) goto L606;
        ArrayList r1227 = r242;
        pc r1316 = (pc) r1227.get(r87);
        if ((r1316 instanceof rk) == true) goto L588;
        boolean r176 = r525;
        boolean r182 = r618;
        hc r526 = r202;
    L605:
        r87 = r87 + 1;
        r202 = r526;
        r242 = r1227;
        r525 = r176;
        r618 = r182;
        goto L584
    L588:
        int r1414 = r1316.l();
        int r1514 = r1316.i();
        r176 = r525;
        r182 = r618;
        r526 = r202;
        boolean r619 = r917 | r32.x(r526, r1316, true);
        int r918 = r1316.l();
        boolean r203 = r619;
        int r620 = r1316.i();
        if (r918 == r1414) goto L596;
        r1316.y(r918);
        if (r182 == true) goto L593;
    L595:
        r203 = true;
        goto L596
    L593:
        if ((r1316.m() + r1316.J) <= r1011) goto L595;
        r1011 = Math.max(r1011, r1316.g(4).c() + (r1316.m() + r1316.J));
    L596:
        if (r620 == r1514) goto L603;
        r1316.v(r620);
        if (r176 == true) goto L600;
    L602:
        boolean r1515 = true;
    L604:
        r917 = ((rk) r1316).l0 | r1515;
        goto L605
    L600:
        if ((r1316.n() + r1316.K) <= r1122) goto L602;
        r1122 = Math.max(r1122, r1316.g(5).c() + (r1316.n() + r1316.K));
        goto L602
    L603:
        r1515 = r203;
        goto L604
    L606:
        boolean r177 = r525;
        boolean r183 = r618;
        hc r527 = r202;
        ArrayList r1228 = r242;
        int r621 = 0;
    L608:
        if (r621 >= 2) goto L659;
        int r88 = 0;
    L610:
        if (r88 >= r165) goto L655;
        pc r1317 = (pc) r1228.get(r88);
        if ((r1317 instanceof oo) == false) goto L616;
        if ((r1317 instanceof rk) == true) goto L616;
    L628:
        int r204 = r165;
        hc r232 = r527;
        int r222 = r621;
    L654:
        r88 = r88 + 1;
        r165 = r204;
        r621 = r222;
        r527 = r232;
    L616:
        if ((r1317 instanceof go) == true) goto L628;
        if (r1317.V == 8) goto L628;
        if (r1317.d.e.j == false) goto L627;
        if (r1317.e.e.j == true) goto L628;
    L627:
        if ((r1317 instanceof rk) == true) goto L628;
        int r1415 = r1317.l();
        int r1516 = r1317.i();
        r204 = r165;
        int r166 = r1317.P;
        r222 = r621;
        boolean r919 = r917 | r32.x(r527, r1317, true);
        int r622 = r1317.l();
        r232 = r527;
        int r528 = r1317.i();
        if (r622 == r1415) goto L639;
        r1317.y(r622);
        if (r183 == false) goto L637;
        if ((r1317.m() + r1317.J) <= r1011) goto L637;
        r1011 = Math.max(r1011, r1317.g(4).c() + (r1317.m() + r1317.J));
    L637:
        r919 = true;
    L639:
        if (r528 == r1516) goto L647;
        r1317.v(r528);
        if (r177 == false) goto L646;
        if ((r1317.n() + r1317.K) <= r1122) goto L646;
        r1122 = Math.max(r1122, r1317.g(5).c() + (r1317.n() + r1317.K));
    L646:
        boolean r1517 = true;
    L649:
        if (r1317.w == true) goto L651;
    L653:
        r917 = r1517;
        goto L654
    L651:
        if (r166 == r1317.P) goto L653;
        r917 = true;
        goto L654
    L647:
        r1517 = r919;
        goto L649
    L655:
        int r205 = r165;
        hc r233 = r527;
        int r223 = r621;
        if (r917 == false) goto L658;
        r32.A(r7, r213, r424);
        r917 = false;
    L658:
        r621 = r223 + 1;
        r165 = r205;
        r527 = r233;
        goto L608
    L659:
        if (r917 == false) goto L670;
        r32.A(r7, r213, r424);
        if (r7.l() >= r1011) goto L663;
        r7.y(r1011);
        boolean r167 = true;
    L665:
        if (r7.i() >= r1122) goto L667;
        r7.v(r1122);
        boolean r1518 = true;
    L668:
        if (r1518 == false) goto L670;
        r32.A(r7, r213, r424);
        goto L670
    L667:
        r1518 = r167;
        goto L668
    L663:
        r167 = false;
        goto L665
    L582:
        r525 = false;
        goto L583
    L578:
        r618 = false;
    L670:
        r7.p0 = r014;
        if ((r014 & 256) != 256) goto L673;
        boolean r529 = true;
    L674:
        ar.p = r529;
    L675:
        int r015 = r7.l();
        int r168 = r7.i();
        boolean r214 = r7.q0;
        boolean r33 = r7.r0;
        hc r425 = r164;
        int r530 = r425.e;
        int r016 = View.resolveSizeAndState(r015 + r425.d, r42, 0);
        int r169 = View.resolveSizeAndState(r168 + r530, r43, 0) & 16777215;
        int r017 = Math.min(this.f, r016 & 16777215);
        int r170 = Math.min(this.g, r169);
        if (r214 == false) goto L678;
        r017 = r017 | 16777216;
    L678:
        if (r33 == false) goto L680;
        r170 = r170 | 16777216;
    L680:
        setMeasuredDimension(r017, r170);
        return;
    L673:
        r529 = false;
        goto L674
    L540:
        if (r010 == 2) goto L675;
    L514:
        r09 = true;
        goto L515
    L481:
        if (r06 != 4) goto L483;
    L475:
        if (r520 == 4) goto L478;
        r08 = false;
    L457:
        if (r519 == false) goto L463;
        int r1318 = r915.size();
        r312 = r121;
        int r171 = 0;
    L459:
        if (r171 >= r1318) goto L464;
        Object r324 = r915.get(r171);
        r171 = r171 + 1;
        if (((qb0) r324).k() == true) goto L459;
        r519 = false;
    L464:
        if (r519 == true) goto L466;
    L468:
        if (r519 == false) goto L455;
        if (r25 != 2) goto L455;
        r130 = 1;
        r1121.x(1);
        r1121.v(r8.d(r1121, 1));
        r1225.d(r1121.i());
        goto L472
    L466:
        if (r420 != 2) goto L468;
        r1121.w(1);
        r1121.y(r8.d(r1121, 0));
        r1413.d(r1121.l());
        goto L468
    L463:
        r312 = r121;
        goto L464
    L440:
        if (r8.c == true) goto L443;
        r1223 = 0;
    L516:
        r265 = r120;
        r242 = r24;
        r202 = r419;
        r282 = r1313;
        r295 = r1412;
        qc r018 = r8.a;
        if (r8.b == false) goto L522;
        ArrayList r178 = r018.d0;
        int r215 = r178.size();
        int r426 = 0;
    L519:
        if (r426 >= r215) goto L521;
        Object r920 = r178.get(r426);
        r426 = r426 + 1;
        pc r921 = (pc) r920;
        r921.a = false;
        po r1123 = r921.d;
        r1123.e.j = false;
        r1123.g = false;
        r1123.n();
        m90 r922 = r921.e;
        r922.e.j = false;
        r922.g = false;
        r922.m();
        goto L519
    L521:
        int r1416 = 0;
        r018.a = false;
        po r179 = r018.d;
        r179.e.j = false;
        r179.g = false;
        r179.n();
        m90 r180 = r018.e;
        r180.e.j = false;
        r180.g = false;
        r180.m();
        r8.c();
    L523:
        r8.b(r8.d);
        r018.N = r1416;
        r018.O = r1416;
        r018.d.h.d(r1416);
        r018.e.h.d(r1416);
        r1226 = 1073741824;
        if (r616 != 1073741824) goto L526;
        r150 = r7.D(r1416, r519);
        r010 = 1;
    L527:
        if (r1010 != 1073741824) goto L529;
        r150 = r150 & r7.D(1, r519);
        r010 = r010 + 1;
        goto L529
    L526:
        r010 = 0;
        r150 = true;
        goto L527
    L522:
        r1416 = 0;
        goto L523
    L433:
        if (r7.i() == r1120) goto L435;
        r7.v(r1120);
        r8.b = true;
        goto L435
    L428:
        if (r7.l() == r914) goto L430;
        r7.y(r914);
        r8.b = true;
    L430:
        r1221 = 1073741824;
        goto L431
    L537:
        r265 = r120;
        r242 = r24;
        r202 = r419;
        r282 = r1313;
        r295 = r1412;
        r010 = 0;
        r150 = false;
    L420:
        if (r519 == true) goto L421;
        r1119 = false;
    L405:
        if (r1117.r() == false) goto L409;
        if (r1220 == true) goto L403;
    L409:
        if ((r1117 instanceof rk) == true) goto L403;
        if (r1117.q() == true) goto L403;
        if (r1117.r() == true) goto L403;
        r1511 = r294 + 1;
        r1116 = r173;
        r1217 = r273;
    L399:
        r1220 = false;
        goto L401
    L392:
        r1219 = false;
        goto L393
    L388:
        r304 = false;
    L417:
        r174 = r1116;
        r273 = r1217;
        r1118 = 1073741824;
    L380:
        r1116 = true;
        goto L381
    L379:
        r264 = r1115;
        goto L380
    L373:
        r519 = false;
        goto L374
    L369:
        r7.R = r111;
        goto L370
    L365:
        r7.Q = r110;
    L361:
        r8.c = true;
        r192 = 1;
        goto L362
    L348:
        r23 = 0;
    L349:
        r164 = r1410;
        goto L347
    L342:
        if (r1010 == 1073741824) goto L344;
        r164 = r1410;
        r1 = 1;
        r23 = 0;
        goto L354
    L344:
        r23 = Math.min(this.g - r417, r1114);
        r164 = r1410;
        r1 = 1;
        goto L354
    L351:
        if (r163 != 0) goto L353;
        r23 = Math.max(0, this.e);
        goto L349
    L353:
        r23 = r1114;
        goto L349
    L334:
        r263 = r1215;
        r418 = 0;
        goto L333
    L327:
        if (r616 == 1073741824) goto L330;
        r263 = r1215;
        r2 = Integer.MIN_VALUE;
        r418 = 0;
    L329:
        r1216 = 1;
        goto L339
    L330:
        r418 = Math.min(this.f - r1215, r913);
        r263 = r1215;
        r2 = Integer.MIN_VALUE;
        goto L329
    L335:
        r263 = r1215;
        if (r163 != 0) goto L338;
        r418 = Math.max(0, this.d);
        goto L333
    L338:
        r418 = r913;
    L319:
        if ((getContext().getApplicationInfo().flags & r18) == 0) goto L323;
        if (1 != getLayoutDirection()) goto L323;
        r1510 = r912;
        goto L323
    L299:
        r262 = r44;
        goto L300
    L16:
        r44 = false;
        goto L17
    L312:
        r18 = 4194304;
        goto L313
    L5:
        if (1 != getLayoutDirection()) goto L7;
        r3 = true;
        goto L8
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View r5) {
        super.onViewAdded(r5);
        pc r0 = b(r5);
        if ((r5 instanceof fo) == false) goto L8;
        if ((r0 instanceof go) == true) goto L8;
        gc r02 = (gc) r5.getLayoutParams();
        go r1 = new go();
        r02.k0 = r1;
        r02.Y = true;
        r1.B(r02.R);
    L8:
        if ((r5 instanceof ec) == false) goto L12;
        ec r03 = (ec) r5;
        r03.g();
        ((gc) r5.getLayoutParams()).Z = true;
        ArrayList r12 = this.b;
        if (r12.contains(r03) == true) goto L12;
        r12.add(r03);
    L12:
        this.a.put(r5.getId(), r5);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View r3) {
        super.onViewRemoved(r3);
        this.a.remove(r3.getId());
        pc r0 = b(r3);
        this.c.d0.remove(r0);
        r0.I = null;
        this.b.remove(r3);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(oc r1) {
        this.j = r1;
    }

    @Override // android.view.View
    public void setId(int r3) {
        int r0 = getId();
        SparseArray r1 = this.a;
        r1.remove(r0);
        super.setId(r3);
        r1.put(getId(), this);
    }

    public void setMaxHeight(int r2) {
        if (r2 != this.g) goto L5;
        return;
    L5:
        this.g = r2;
        requestLayout();
    }

    public void setMaxWidth(int r2) {
        if (r2 != this.f) goto L5;
        return;
    L5:
        this.f = r2;
        requestLayout();
    }

    public void setMinHeight(int r2) {
        if (r2 != this.e) goto L5;
        return;
    L5:
        this.e = r2;
        requestLayout();
    }

    public void setMinWidth(int r2) {
        if (r2 != this.d) goto L5;
        return;
    L5:
        this.d = r2;
        requestLayout();
    }

    public void setOnConstraintsChanged(rc r1) {
        d4 r12 = this.k;
        if (r12 == null) goto L6;
        r12.getClass();
        return;
    }

    public void setOptimizationLevel(int r2) {
        this.i = r2;
        this.c.p0 = r2;
        if ((r2 & 256) != 256) goto L5;
        boolean r22 = true;
    L6:
        ar.p = r22;
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
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new qc();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 263;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new hc(this);
        c(r3, r4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r7) {
        gc r0 = new gc(r7);
        r0.a = -1;
        r0.b = -1;
        r0.c = -1.0f;
        r0.d = -1;
        r0.e = -1;
        r0.f = -1;
        r0.g = -1;
        r0.h = -1;
        r0.i = -1;
        r0.j = -1;
        r0.k = -1;
        r0.l = -1;
        r0.m = -1;
        r0.n = 0;
        r0.o = 0.0f;
        r0.p = -1;
        r0.q = -1;
        r0.r = -1;
        r0.s = -1;
        r0.t = -1;
        r0.u = -1;
        r0.v = -1;
        r0.w = -1;
        r0.x = -1;
        r0.y = -1;
        r0.z = 0.5f;
        r0.A = 0.5f;
        r0.B = null;
        r0.C = 1;
        r0.D = -1.0f;
        r0.E = -1.0f;
        r0.F = 0;
        r0.G = 0;
        r0.H = 0;
        r0.I = 0;
        r0.J = 0;
        r0.K = 0;
        r0.L = 0;
        r0.M = 0;
        r0.N = 1.0f;
        r0.O = 1.0f;
        r0.P = -1;
        r0.Q = -1;
        r0.R = -1;
        r0.S = false;
        r0.T = false;
        r0.U = null;
        r0.V = true;
        r0.W = true;
        r0.X = false;
        r0.Y = false;
        r0.Z = false;
        r0.a0 = -1;
        r0.b0 = -1;
        r0.c0 = -1;
        r0.d0 = -1;
        r0.e0 = -1;
        r0.f0 = -1;
        r0.g0 = 0.5f;
        r0.k0 = new pc();
        return r0;
    }
}
