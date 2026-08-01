package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gc extends android.view.ViewGroup.MarginLayoutParams {
    public float A;
    public java.lang.String B;
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
    public java.lang.String U;
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
    public defpackage.pc k0;
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
            r6 = this;
            r0 = 0
            r6.Y = r0
            r1 = 1
            r6.V = r1
            r6.W = r1
            int r2 = r6.width
            r3 = -2
            if (r2 != r3) goto L19
            boolean r4 = r6.S
            if (r4 == 0) goto L19
            r6.V = r0
            int r4 = r6.H
            if (r4 != 0) goto L19
            r6.H = r1
        L19:
            int r4 = r6.height
            if (r4 != r3) goto L29
            boolean r5 = r6.T
            if (r5 == 0) goto L29
            r6.W = r0
            int r5 = r6.I
            if (r5 != 0) goto L29
            r6.I = r1
        L29:
            r5 = -1
            if (r2 == 0) goto L2e
            if (r2 != r5) goto L3a
        L2e:
            r6.V = r0
            if (r2 != 0) goto L3a
            int r2 = r6.H
            if (r2 != r1) goto L3a
            r6.width = r3
            r6.S = r1
        L3a:
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L4a
        L3e:
            r6.W = r0
            if (r4 != 0) goto L4a
            int r0 = r6.I
            if (r0 != r1) goto L4a
            r6.height = r3
            r6.T = r1
        L4a:
            float r0 = r6.c
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5c
            int r0 = r6.a
            if (r0 != r5) goto L5c
            int r0 = r6.b
            if (r0 == r5) goto L5b
            goto L5c
        L5b:
            return
        L5c:
            r6.Y = r1
            r6.V = r1
            r6.W = r1
            pc r0 = r6.k0
            boolean r0 = r0 instanceof defpackage.go
            if (r0 != 0) goto L6f
            go r0 = new go
            r0.<init>()
            r6.k0 = r0
        L6f:
            pc r0 = r6.k0
            go r0 = (defpackage.go) r0
            int r1 = r6.R
            r0.B(r1)
            return
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int r10) {
            r9 = this;
            int r0 = r9.leftMargin
            int r1 = r9.rightMargin
            super.resolveLayoutDirection(r10)
            int r10 = r9.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r3 != r10) goto L11
            r10 = r3
            goto L12
        L11:
            r10 = r2
        L12:
            r4 = -1
            r9.c0 = r4
            r9.d0 = r4
            r9.a0 = r4
            r9.b0 = r4
            int r5 = r9.t
            r9.e0 = r5
            int r5 = r9.v
            r9.f0 = r5
            float r5 = r9.z
            r9.g0 = r5
            int r6 = r9.a
            r9.h0 = r6
            int r7 = r9.b
            r9.i0 = r7
            float r8 = r9.c
            r9.j0 = r8
            if (r10 == 0) goto L8e
            int r10 = r9.p
            if (r10 == r4) goto L3d
            r9.c0 = r10
        L3b:
            r2 = r3
            goto L44
        L3d:
            int r10 = r9.q
            if (r10 == r4) goto L44
            r9.d0 = r10
            goto L3b
        L44:
            int r10 = r9.r
            if (r10 == r4) goto L4b
            r9.b0 = r10
            r2 = r3
        L4b:
            int r10 = r9.s
            if (r10 == r4) goto L52
            r9.a0 = r10
            r2 = r3
        L52:
            int r10 = r9.x
            if (r10 == r4) goto L58
            r9.f0 = r10
        L58:
            int r10 = r9.y
            if (r10 == r4) goto L5e
            r9.e0 = r10
        L5e:
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L66
            float r2 = r10 - r5
            r9.g0 = r2
        L66:
            boolean r2 = r9.Y
            if (r2 == 0) goto Lb2
            int r2 = r9.R
            if (r2 != r3) goto Lb2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 == 0) goto L7c
            float r10 = r10 - r8
            r9.j0 = r10
            r9.h0 = r4
            r9.i0 = r4
            goto Lb2
        L7c:
            if (r6 == r4) goto L85
            r9.i0 = r6
            r9.h0 = r4
            r9.j0 = r2
            goto Lb2
        L85:
            if (r7 == r4) goto Lb2
            r9.h0 = r7
            r9.i0 = r4
            r9.j0 = r2
            goto Lb2
        L8e:
            int r10 = r9.p
            if (r10 == r4) goto L94
            r9.b0 = r10
        L94:
            int r10 = r9.q
            if (r10 == r4) goto L9a
            r9.a0 = r10
        L9a:
            int r10 = r9.r
            if (r10 == r4) goto La0
            r9.c0 = r10
        La0:
            int r10 = r9.s
            if (r10 == r4) goto La6
            r9.d0 = r10
        La6:
            int r10 = r9.x
            if (r10 == r4) goto Lac
            r9.e0 = r10
        Lac:
            int r10 = r9.y
            if (r10 == r4) goto Lb2
            r9.f0 = r10
        Lb2:
            int r10 = r9.r
            if (r10 != r4) goto Lfc
            int r10 = r9.s
            if (r10 != r4) goto Lfc
            int r10 = r9.q
            if (r10 != r4) goto Lfc
            int r10 = r9.p
            if (r10 != r4) goto Lfc
            int r10 = r9.f
            if (r10 == r4) goto Ld1
            r9.c0 = r10
            int r10 = r9.rightMargin
            if (r10 > 0) goto Ldf
            if (r1 <= 0) goto Ldf
            r9.rightMargin = r1
            goto Ldf
        Ld1:
            int r10 = r9.g
            if (r10 == r4) goto Ldf
            r9.d0 = r10
            int r10 = r9.rightMargin
            if (r10 > 0) goto Ldf
            if (r1 <= 0) goto Ldf
            r9.rightMargin = r1
        Ldf:
            int r10 = r9.d
            if (r10 == r4) goto Lee
            r9.a0 = r10
            int r10 = r9.leftMargin
            if (r10 > 0) goto Lfc
            if (r0 <= 0) goto Lfc
            r9.leftMargin = r0
            return
        Lee:
            int r10 = r9.e
            if (r10 == r4) goto Lfc
            r9.b0 = r10
            int r10 = r9.leftMargin
            if (r10 > 0) goto Lfc
            if (r0 <= 0) goto Lfc
            r9.leftMargin = r0
        Lfc:
            return
    }
}
