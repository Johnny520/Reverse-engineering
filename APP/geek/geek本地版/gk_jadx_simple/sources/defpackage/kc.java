package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class kc {
    public static final SparseIntArray j0 = null;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public float Y;
    public float Z;
    public boolean a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int[] d0;
    public int e;
    public String e0;
    public float f;
    public String f0;
    public int g;
    public boolean g0;
    public int h;
    public boolean h0;
    public int i;
    public boolean i0;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public float t;
    public float u;
    public String v;
    public int w;
    public int x;
    public float y;
    public int z;

    static {
        SparseIntArray r0 = new SparseIntArray();
        j0 = r0;
        r0.append(38, 24);
        r0.append(39, 25);
        r0.append(41, 28);
        r0.append(42, 29);
        r0.append(47, 35);
        r0.append(46, 34);
        r0.append(20, 4);
        r0.append(19, 3);
        r0.append(17, 1);
        r0.append(55, 6);
        r0.append(56, 7);
        r0.append(27, 17);
        r0.append(28, 18);
        r0.append(29, 19);
        r0.append(0, 26);
        r0.append(43, 31);
        r0.append(44, 32);
        r0.append(26, 10);
        r0.append(25, 9);
        r0.append(59, 13);
        r0.append(62, 16);
        r0.append(60, 14);
        r0.append(57, 11);
        r0.append(61, 15);
        r0.append(58, 12);
        r0.append(50, 38);
        r0.append(36, 37);
        r0.append(35, 39);
        r0.append(49, 40);
        r0.append(34, 20);
        r0.append(48, 36);
        r0.append(24, 5);
        r0.append(37, 76);
        r0.append(45, 76);
        r0.append(40, 76);
        r0.append(18, 76);
        r0.append(16, 76);
        r0.append(3, 23);
        r0.append(5, 27);
        r0.append(7, 30);
        r0.append(8, 8);
        r0.append(4, 33);
        r0.append(6, 2);
        r0.append(1, 22);
        r0.append(2, 21);
        r0.append(21, 61);
        r0.append(23, 62);
        r0.append(22, 63);
        r0.append(54, 69);
        r0.append(33, 70);
        r0.append(12, 71);
        r0.append(10, 72);
        r0.append(11, 73);
        r0.append(13, 74);
        r0.append(9, 75);
    }

    public final void a(Context r8, AttributeSet r9) {
        TypedArray r82 = r8.obtainStyledAttributes(r9, ry.d);
        int r92 = r82.getIndexCount();
        int r0 = 0;
    L3:
        if (r0 >= r92) goto L75;
        int r1 = r82.getIndex(r0);
        SparseIntArray r2 = j0;
        int r3 = r2.get(r1);
        if (r3 != 80) goto L7;
        this.g0 = r82.getBoolean(r1, this.g0);
    L74:
        r0 = r0 + 1;
        goto L3
    L7:
        if (r3 == 81) goto L72;
        switch(r3) {
            case 1: goto L71;
            case 2: goto L70;
            case 3: goto L69;
            case 4: goto L68;
            case 5: goto L67;
            case 6: goto L66;
            case 7: goto L65;
            case 8: goto L64;
            case 9: goto L63;
            case 10: goto L62;
            case 11: goto L61;
            case 12: goto L60;
            case 13: goto L59;
            case 14: goto L58;
            case 15: goto L57;
            case 16: goto L56;
            case 17: goto L55;
            case 18: goto L54;
            case 19: goto L53;
            case 20: goto L52;
            case 21: goto L51;
            case 22: goto L50;
            case 23: goto L49;
            case 24: goto L48;
            case 25: goto L47;
            case 26: goto L46;
            case 27: goto L45;
            case 28: goto L44;
            case 29: goto L43;
            case 30: goto L42;
            case 31: goto L41;
            case 32: goto L40;
            case 33: goto L39;
            case 34: goto L38;
            case 35: goto L37;
            case 36: goto L36;
            case 37: goto L35;
            case 38: goto L34;
            case 39: goto L33;
            case 40: goto L32;
            default: goto L9;
        };
    L9:
        switch(r3) {
            case 54: goto L31;
            case 55: goto L30;
            case 56: goto L29;
            case 57: goto L28;
            case 58: goto L27;
            case 59: goto L26;
            default: goto L10;
        };
    L10:
        switch(r3) {
            case 61: goto L25;
            case 62: goto L24;
            case 63: goto L23;
            default: goto L12;
        };
    L23:
        this.y = r82.getFloat(r1, this.y);
        goto L74
    L24:
        this.x = r82.getDimensionPixelSize(r1, this.x);
        goto L74
    L25:
        this.w = oc.f(r82, r1, this.w);
        goto L74
    L12:
        switch(r3) {
            case 69: goto L22;
            case 70: goto L21;
            case 71: goto L20;
            case 72: goto L19;
            case 73: goto L18;
            case 74: goto L17;
            case 75: goto L16;
            case 76: goto L15;
            case 77: goto L14;
            default: goto L13;
        };
    L13:
        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(r1) + "   " + r2.get(r1));
        goto L74
    L14:
        this.f0 = r82.getString(r1);
        goto L74
    L15:
        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(r1) + "   " + r2.get(r1));
        goto L74
    L16:
        this.i0 = r82.getBoolean(r1, this.i0);
        goto L74
    L17:
        this.e0 = r82.getString(r1);
        goto L74
    L18:
        this.b0 = r82.getDimensionPixelSize(r1, this.b0);
        goto L74
    L19:
        this.a0 = r82.getInt(r1, this.a0);
        goto L74
    L20:
        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
        goto L74
    L21:
        this.Z = r82.getFloat(r1, 1.0f);
        goto L74
    L22:
        this.Y = r82.getFloat(r1, 1.0f);
        goto L74
    L26:
        this.X = r82.getDimensionPixelSize(r1, this.X);
        goto L74
    L27:
        this.W = r82.getDimensionPixelSize(r1, this.W);
        goto L74
    L28:
        this.V = r82.getDimensionPixelSize(r1, this.V);
        goto L74
    L29:
        this.U = r82.getDimensionPixelSize(r1, this.U);
        goto L74
    L30:
        this.T = r82.getInt(r1, this.T);
        goto L74
    L31:
        this.S = r82.getInt(r1, this.S);
        goto L74
    L32:
        this.R = r82.getInt(r1, this.R);
        goto L74
    L33:
        this.Q = r82.getInt(r1, this.Q);
        goto L74
    L34:
        this.O = r82.getFloat(r1, this.O);
        goto L74
    L35:
        this.P = r82.getFloat(r1, this.P);
        goto L74
    L36:
        this.u = r82.getFloat(r1, this.u);
        goto L74
    L37:
        this.k = oc.f(r82, r1, this.k);
        goto L74
    L38:
        this.l = oc.f(r82, r1, this.l);
        goto L74
    L39:
        this.E = r82.getDimensionPixelSize(r1, this.E);
        goto L74
    L40:
        this.q = oc.f(r82, r1, this.q);
        goto L74
    L41:
        this.p = oc.f(r82, r1, this.p);
        goto L74
    L42:
        this.H = r82.getDimensionPixelSize(r1, this.H);
        goto L74
    L43:
        this.j = oc.f(r82, r1, this.j);
        goto L74
    L44:
        this.i = oc.f(r82, r1, this.i);
        goto L74
    L45:
        this.D = r82.getDimensionPixelSize(r1, this.D);
        goto L74
    L46:
        this.B = r82.getInt(r1, this.B);
        goto L74
    L47:
        this.h = oc.f(r82, r1, this.h);
        goto L74
    L48:
        this.g = oc.f(r82, r1, this.g);
        goto L74
    L49:
        this.C = r82.getDimensionPixelSize(r1, this.C);
        goto L74
    L50:
        this.b = r82.getLayoutDimension(r1, this.b);
        goto L74
    L51:
        this.c = r82.getLayoutDimension(r1, this.c);
        goto L74
    L52:
        this.t = r82.getFloat(r1, this.t);
        goto L74
    L53:
        this.f = r82.getFloat(r1, this.f);
        goto L74
    L54:
        this.e = r82.getDimensionPixelOffset(r1, this.e);
        goto L74
    L55:
        this.d = r82.getDimensionPixelOffset(r1, this.d);
        goto L74
    L56:
        this.J = r82.getDimensionPixelSize(r1, this.J);
        goto L74
    L57:
        this.N = r82.getDimensionPixelSize(r1, this.N);
        goto L74
    L58:
        this.K = r82.getDimensionPixelSize(r1, this.K);
        goto L74
    L59:
        this.I = r82.getDimensionPixelSize(r1, this.I);
        goto L74
    L60:
        this.M = r82.getDimensionPixelSize(r1, this.M);
        goto L74
    L61:
        this.L = r82.getDimensionPixelSize(r1, this.L);
        goto L74
    L62:
        this.r = oc.f(r82, r1, this.r);
        goto L74
    L63:
        this.s = oc.f(r82, r1, this.s);
        goto L74
    L64:
        this.G = r82.getDimensionPixelSize(r1, this.G);
        goto L74
    L65:
        this.A = r82.getDimensionPixelOffset(r1, this.A);
        goto L74
    L66:
        this.z = r82.getDimensionPixelOffset(r1, this.z);
        goto L74
    L67:
        this.v = r82.getString(r1);
        goto L74
    L68:
        this.m = oc.f(r82, r1, this.m);
        goto L74
    L69:
        this.n = oc.f(r82, r1, this.n);
        goto L74
    L70:
        this.F = r82.getDimensionPixelSize(r1, this.F);
        goto L74
    L71:
        this.o = oc.f(r82, r1, this.o);
        goto L74
    L72:
        this.h0 = r82.getBoolean(r1, this.h0);
        goto L74
    L75:
        r82.recycle();
    }
}
