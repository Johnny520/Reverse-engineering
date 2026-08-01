package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class gc extends ViewGroup.MarginLayoutParams {
    public float A;
    public String B;
    public int C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a;
    public int a0;
    public int b;
    public int b0;
    public float c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g;
    public float g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public float j0;
    public int k;
    public pc k0;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public float z;

    public final void a() {
        this.Y = false;
        this.V = true;
        this.W = true;
        int r2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (r2 == (-2)) goto L5;
    L9:
        int r4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (r4 != (-2)) goto L17;
        if (this.T == false) goto L17;
        this.W = false;
        if (this.I != 0) goto L17;
        this.I = 1;
    L17:
        if (r2 == 0) goto L19;
        if (r2 == (-1)) goto L19;
    L24:
        if (r4 == 0) goto L26;
        if (r4 == (-1)) goto L26;
    L32:
        if (this.c == (-1.0f)) goto L34;
    L39:
        this.Y = true;
        this.V = true;
        this.W = true;
        if ((this.k0 instanceof go) == true) goto L42;
        this.k0 = new go();
    L42:
        ((go) this.k0).B(this.R);
        return;
    L34:
        if (this.a != (-1)) goto L39;
        if (this.b != (-1)) goto L39;
        return;
    L26:
        this.W = false;
        if (r4 != 0) goto L32;
        if (this.I != 1) goto L32;
        ((ViewGroup.MarginLayoutParams) this).height = -2;
        this.T = true;
    L19:
        this.V = false;
        if (r2 != 0) goto L24;
        if (this.H != 1) goto L24;
        ((ViewGroup.MarginLayoutParams) this).width = -2;
        this.S = true;
        goto L24
    L5:
        if (this.S == false) goto L9;
        this.V = false;
        if (this.H != 0) goto L9;
        this.H = 1;
        goto L9
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int r10) {
        int r0 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int r1 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(r10);
        boolean r2 = false;
        if (1 != getLayoutDirection()) goto L5;
        boolean r102 = true;
    L6:
        this.c0 = -1;
        this.d0 = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.e0 = this.t;
        this.f0 = this.v;
        float r5 = this.z;
        this.g0 = r5;
        int r6 = this.a;
        this.h0 = r6;
        int r7 = this.b;
        this.i0 = r7;
        float r8 = this.c;
        this.j0 = r8;
        if (r102 == false) goto L41;
        int r103 = this.p;
        if (r103 == (-1)) goto L12;
        this.c0 = r103;
    L11:
        r2 = true;
    L15:
        int r104 = this.r;
        if (r104 == (-1)) goto L18;
        this.b0 = r104;
        r2 = true;
    L18:
        int r105 = this.s;
        if (r105 == (-1)) goto L21;
        this.a0 = r105;
        r2 = true;
    L21:
        int r106 = this.x;
        if (r106 == (-1)) goto L24;
        this.f0 = r106;
    L24:
        int r107 = this.y;
        if (r107 == (-1)) goto L28;
        this.e0 = r107;
    L28:
        if (r2 == false) goto L31;
        this.g0 = 1.0f - r5;
    L31:
        if (this.Y == false) goto L60;
        if (this.R != 1) goto L60;
        if (r8 == (-1.0f)) goto L37;
        this.j0 = 1.0f - r8;
        this.h0 = -1;
        this.i0 = -1;
        goto L60
    L37:
        if (r6 == (-1)) goto L39;
        this.i0 = r6;
        this.h0 = -1;
        this.j0 = -1.0f;
        goto L60
    L39:
        if (r7 == (-1)) goto L60;
        this.h0 = r7;
        this.i0 = -1;
        this.j0 = -1.0f;
    L60:
        if (this.r == (-1)) goto L62;
        return;
    L62:
        if (this.s == (-1)) goto L64;
        return;
    L64:
        if (this.q == (-1)) goto L66;
        return;
    L66:
        if (this.p != (-1)) goto L96;
        int r108 = this.f;
        if (r108 == (-1)) goto L73;
        this.c0 = r108;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L79;
        if (r1 <= 0) goto L79;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
    L79:
        int r109 = this.d;
        if (r109 == (-1)) goto L86;
        this.a0 = r109;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L97;
        if (r0 <= 0) goto L98;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r0;
        return;
    L98:
        return;
    L97:
        return;
    L86:
        int r1010 = this.e;
        if (r1010 == (-1)) goto L99;
        this.b0 = r1010;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L100;
        if (r0 <= 0) goto L101;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r0;
        return;
    L101:
        return;
    L100:
        return;
    L99:
        return;
    L73:
        int r1011 = this.g;
        if (r1011 == (-1)) goto L79;
        this.d0 = r1011;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L79;
        if (r1 <= 0) goto L79;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
        goto L79
    L96:
        return;
    L12:
        int r1012 = this.q;
        if (r1012 == (-1)) goto L15;
        this.d0 = r1012;
        goto L11
    L41:
        int r1013 = this.p;
        if (r1013 == (-1)) goto L44;
        this.b0 = r1013;
    L44:
        int r1014 = this.q;
        if (r1014 == (-1)) goto L47;
        this.a0 = r1014;
    L47:
        int r1015 = this.r;
        if (r1015 == (-1)) goto L50;
        this.c0 = r1015;
    L50:
        int r1016 = this.s;
        if (r1016 == (-1)) goto L53;
        this.d0 = r1016;
    L53:
        int r1017 = this.x;
        if (r1017 == (-1)) goto L56;
        this.e0 = r1017;
    L56:
        int r1018 = this.y;
        if (r1018 == (-1)) goto L60;
        this.f0 = r1018;
        goto L60
    L5:
        r102 = false;
        goto L6
    }
}
