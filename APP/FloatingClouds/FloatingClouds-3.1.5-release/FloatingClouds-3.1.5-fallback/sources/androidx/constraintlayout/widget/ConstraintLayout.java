package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    public static final /* synthetic */ int p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray<android.view.View> f857a;
    public final java.util.ArrayList<androidx.constraintlayout.widget.c> b;
    public final a.O3 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public androidx.constraintlayout.widget.e j;
    public androidx.constraintlayout.widget.d k;
    public int l;
    public java.util.HashMap<java.lang.String, java.lang.Integer> m;
    public final android.util.SparseArray<a.N3> n;
    public final androidx.constraintlayout.widget.ConstraintLayout.b o;

    public static class a extends android.view.ViewGroup.MarginLayoutParams {
        public float A;
        public java.lang.String B;
        public final int C;
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f858a;
        public boolean a0;
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
        public int g0;
        public int h;
        public float h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public float k0;
        public int l;
        public a.N3 l0;
        public int m;
        public int n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public final int t;
        public int u;
        public final int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        public static class C0012a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final android.util.SparseIntArray f859a = null;

            static {
                    android.util.SparseIntArray r0 = new android.util.SparseIntArray
                    r0.<init>()
                    androidx.constraintlayout.widget.ConstraintLayout.a.C0012a.f859a = r0
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf
                    r2 = 8
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf
                    r2 = 9
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf
                    r2 = 10
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf
                    r2 = 11
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf
                    r2 = 12
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf
                    r2 = 13
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf
                    r2 = 14
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf
                    r2 = 15
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf
                    r2 = 16
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircle
                    r2 = 2
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius
                    r2 = 3
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle
                    r2 = 4
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX
                    r2 = 49
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY
                    r2 = 50
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin
                    r2 = 5
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end
                    r2 = 6
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent
                    r2 = 7
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_orientation
                    r2 = 1
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf
                    r2 = 17
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf
                    r2 = 18
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf
                    r2 = 19
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf
                    r2 = 20
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft
                    r2 = 21
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginTop
                    r2 = 22
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginRight
                    r2 = 23
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom
                    r2 = 24
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginStart
                    r2 = 25
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd
                    r2 = 26
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias
                    r2 = 29
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias
                    r2 = 30
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio
                    r2 = 44
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight
                    r2 = 45
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight
                    r2 = 46
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle
                    r2 = 47
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle
                    r2 = 48
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedWidth
                    r2 = 27
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedHeight
                    r2 = 28
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default
                    r2 = 31
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default
                    r2 = 32
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min
                    r2 = 33
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max
                    r2 = 34
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent
                    r2 = 35
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min
                    r2 = 36
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max
                    r2 = 37
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent
                    r2 = 38
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator
                    r2 = 39
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator
                    r2 = 40
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator
                    r2 = 41
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator
                    r2 = 42
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator
                    r2 = 43
                    r0.append(r1, r2)
                    int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTag
                    r2 = 51
                    r0.append(r1, r2)
                    return
            }
        }

        public a() {
                r6 = this;
                r0 = -2
                r6.<init>(r0, r0)
                r0 = -1
                r6.f858a = r0
                r6.b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r6.c = r1
                r6.d = r0
                r6.e = r0
                r6.f = r0
                r6.g = r0
                r6.h = r0
                r6.i = r0
                r6.j = r0
                r6.k = r0
                r6.l = r0
                r6.m = r0
                r2 = 0
                r6.n = r2
                r3 = 0
                r6.o = r3
                r6.p = r0
                r6.q = r0
                r6.r = r0
                r6.s = r0
                r6.t = r0
                r6.u = r0
                r6.v = r0
                r6.w = r0
                r6.x = r0
                r6.y = r0
                r3 = 1056964608(0x3f000000, float:0.5)
                r6.z = r3
                r6.A = r3
                r4 = 0
                r6.B = r4
                r5 = 1
                r6.C = r5
                r6.D = r1
                r6.E = r1
                r6.F = r2
                r6.G = r2
                r6.H = r2
                r6.I = r2
                r6.J = r2
                r6.K = r2
                r6.L = r2
                r6.M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r6.N = r1
                r6.O = r1
                r6.P = r0
                r6.Q = r0
                r6.R = r0
                r6.S = r2
                r6.T = r2
                r6.U = r4
                r6.V = r5
                r6.W = r5
                r6.X = r2
                r6.Y = r2
                r6.Z = r2
                r6.a0 = r2
                r6.b0 = r0
                r6.c0 = r0
                r6.d0 = r0
                r6.e0 = r0
                r6.f0 = r0
                r6.g0 = r0
                r6.h0 = r3
                a.N3 r0 = new a.N3
                r0.<init>()
                r6.l0 = r0
                return
        }

        public a(android.content.Context r11, android.util.AttributeSet r12) {
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f858a = r0
                r10.b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.c = r1
                r10.d = r0
                r10.e = r0
                r10.f = r0
                r10.g = r0
                r10.h = r0
                r10.i = r0
                r10.j = r0
                r10.k = r0
                r10.l = r0
                r10.m = r0
                r2 = 0
                r10.n = r2
                r3 = 0
                r10.o = r3
                r10.p = r0
                r10.q = r0
                r10.r = r0
                r10.s = r0
                r10.t = r0
                r10.u = r0
                r10.v = r0
                r10.w = r0
                r10.x = r0
                r10.y = r0
                r4 = 1056964608(0x3f000000, float:0.5)
                r10.z = r4
                r10.A = r4
                r5 = 0
                r10.B = r5
                r6 = 1
                r10.C = r6
                r10.D = r1
                r10.E = r1
                r10.F = r2
                r10.G = r2
                r10.H = r2
                r10.I = r2
                r10.J = r2
                r10.K = r2
                r10.L = r2
                r10.M = r2
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.N = r1
                r10.O = r1
                r10.P = r0
                r10.Q = r0
                r10.R = r0
                r10.S = r2
                r10.T = r2
                r10.U = r5
                r10.V = r6
                r10.W = r6
                r10.X = r2
                r10.Y = r2
                r10.Z = r2
                r10.a0 = r2
                r10.b0 = r0
                r10.c0 = r0
                r10.d0 = r0
                r10.e0 = r0
                r10.f0 = r0
                r10.g0 = r0
                r10.h0 = r4
                a.N3 r1 = new a.N3
                r1.<init>()
                r10.l0 = r1
                int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = r2
            L98:
                if (r1 >= r12) goto L3bc
                int r4 = r11.getIndex(r1)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintLayout.a.C0012a.f859a
                int r5 = r5.get(r4)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r5) {
                    case 1: goto L3b0;
                    case 2: goto L39f;
                    case 3: goto L396;
                    case 4: goto L381;
                    case 5: goto L378;
                    case 6: goto L36f;
                    case 7: goto L366;
                    case 8: goto L355;
                    case 9: goto L344;
                    case 10: goto L332;
                    case 11: goto L320;
                    case 12: goto L30e;
                    case 13: goto L2fc;
                    case 14: goto L2ea;
                    case 15: goto L2d8;
                    case 16: goto L2c6;
                    case 17: goto L2b4;
                    case 18: goto L2a2;
                    case 19: goto L290;
                    case 20: goto L27e;
                    case 21: goto L274;
                    case 22: goto L26a;
                    case 23: goto L260;
                    case 24: goto L256;
                    case 25: goto L24c;
                    case 26: goto L242;
                    case 27: goto L238;
                    case 28: goto L22e;
                    case 29: goto L224;
                    case 30: goto L21a;
                    case 31: goto L20b;
                    case 32: goto L1fc;
                    case 33: goto L1e6;
                    case 34: goto L1d0;
                    case 35: goto L1c0;
                    case 36: goto L1aa;
                    case 37: goto L194;
                    case 38: goto L184;
                    default: goto Lab;
                }
            Lab:
                switch(r5) {
                    case 44: goto Lf0;
                    case 45: goto Le6;
                    case 46: goto Ldc;
                    case 47: goto Ld4;
                    case 48: goto Lcc;
                    case 49: goto Lc2;
                    case 50: goto Lb8;
                    case 51: goto Lb0;
                    default: goto Lae;
                }
            Lae:
                goto L3b8
            Lb0:
                java.lang.String r4 = r11.getString(r4)
                r10.U = r4
                goto L3b8
            Lb8:
                int r5 = r10.Q
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.Q = r4
                goto L3b8
            Lc2:
                int r5 = r10.P
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.P = r4
                goto L3b8
            Lcc:
                int r4 = r11.getInt(r4, r2)
                r10.G = r4
                goto L3b8
            Ld4:
                int r4 = r11.getInt(r4, r2)
                r10.F = r4
                goto L3b8
            Ldc:
                float r5 = r10.E
                float r4 = r11.getFloat(r4, r5)
                r10.E = r4
                goto L3b8
            Le6:
                float r5 = r10.D
                float r4 = r11.getFloat(r4, r5)
                r10.D = r4
                goto L3b8
            Lf0:
                java.lang.String r4 = r11.getString(r4)
                r10.B = r4
                r10.C = r0
                if (r4 == 0) goto L3b8
                int r4 = r4.length()
                java.lang.String r5 = r10.B
                r7 = 44
                int r5 = r5.indexOf(r7)
                if (r5 <= 0) goto L12a
                int r7 = r4 + (-1)
                if (r5 >= r7) goto L12a
                java.lang.String r7 = r10.B
                java.lang.String r7 = r7.substring(r2, r5)
                java.lang.String r8 = "W"
                boolean r8 = r7.equalsIgnoreCase(r8)
                if (r8 == 0) goto L11d
                r10.C = r2
                goto L127
            L11d:
                java.lang.String r8 = "H"
                boolean r7 = r7.equalsIgnoreCase(r8)
                if (r7 == 0) goto L127
                r10.C = r6
            L127:
                int r5 = r5 + 1
                goto L12b
            L12a:
                r5 = r2
            L12b:
                java.lang.String r7 = r10.B
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 < 0) goto L173
                int r4 = r4 + (-1)
                if (r7 >= r4) goto L173
                java.lang.String r4 = r10.B
                java.lang.String r4 = r4.substring(r5, r7)
                java.lang.String r5 = r10.B
                int r7 = r7 + 1
                java.lang.String r5 = r5.substring(r7)
                int r7 = r4.length()
                if (r7 <= 0) goto L3b8
                int r7 = r5.length()
                if (r7 <= 0) goto L3b8
                float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3b8
                float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L3b8
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 <= 0) goto L3b8
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L3b8
                int r7 = r10.C     // Catch: java.lang.NumberFormatException -> L3b8
                if (r7 != r6) goto L16d
                float r5 = r5 / r4
                java.lang.Math.abs(r5)     // Catch: java.lang.NumberFormatException -> L3b8
                goto L3b8
            L16d:
                float r4 = r4 / r5
                java.lang.Math.abs(r4)     // Catch: java.lang.NumberFormatException -> L3b8
                goto L3b8
            L173:
                java.lang.String r4 = r10.B
                java.lang.String r4 = r4.substring(r5)
                int r5 = r4.length()
                if (r5 <= 0) goto L3b8
                java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L3b8
                goto L3b8
            L184:
                float r5 = r10.O
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.O = r4
                r10.I = r8
                goto L3b8
            L194:
                int r5 = r10.M     // Catch: java.lang.Exception -> L19e
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L19e
                r10.M = r5     // Catch: java.lang.Exception -> L19e
                goto L3b8
            L19e:
                int r5 = r10.M
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3b8
                r10.M = r9
                goto L3b8
            L1aa:
                int r5 = r10.K     // Catch: java.lang.Exception -> L1b4
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1b4
                r10.K = r5     // Catch: java.lang.Exception -> L1b4
                goto L3b8
            L1b4:
                int r5 = r10.K
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3b8
                r10.K = r9
                goto L3b8
            L1c0:
                float r5 = r10.N
                float r4 = r11.getFloat(r4, r5)
                float r4 = java.lang.Math.max(r3, r4)
                r10.N = r4
                r10.H = r8
                goto L3b8
            L1d0:
                int r5 = r10.L     // Catch: java.lang.Exception -> L1da
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1da
                r10.L = r5     // Catch: java.lang.Exception -> L1da
                goto L3b8
            L1da:
                int r5 = r10.L
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3b8
                r10.L = r9
                goto L3b8
            L1e6:
                int r5 = r10.J     // Catch: java.lang.Exception -> L1f0
                int r5 = r11.getDimensionPixelSize(r4, r5)     // Catch: java.lang.Exception -> L1f0
                r10.J = r5     // Catch: java.lang.Exception -> L1f0
                goto L3b8
            L1f0:
                int r5 = r10.J
                int r4 = r11.getInt(r4, r5)
                if (r4 != r9) goto L3b8
                r10.J = r9
                goto L3b8
            L1fc:
                int r4 = r11.getInt(r4, r2)
                r10.I = r4
                if (r4 != r6) goto L3b8
                java.lang.String r4 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                android.util.Log.e(r7, r4)
                goto L3b8
            L20b:
                int r4 = r11.getInt(r4, r2)
                r10.H = r4
                if (r4 != r6) goto L3b8
                java.lang.String r4 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
                android.util.Log.e(r7, r4)
                goto L3b8
            L21a:
                float r5 = r10.A
                float r4 = r11.getFloat(r4, r5)
                r10.A = r4
                goto L3b8
            L224:
                float r5 = r10.z
                float r4 = r11.getFloat(r4, r5)
                r10.z = r4
                goto L3b8
            L22e:
                boolean r5 = r10.T
                boolean r4 = r11.getBoolean(r4, r5)
                r10.T = r4
                goto L3b8
            L238:
                boolean r5 = r10.S
                boolean r4 = r11.getBoolean(r4, r5)
                r10.S = r4
                goto L3b8
            L242:
                int r5 = r10.y
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.y = r4
                goto L3b8
            L24c:
                int r5 = r10.x
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.x = r4
                goto L3b8
            L256:
                int r5 = r10.w
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.w = r4
                goto L3b8
            L260:
                int r5 = r10.v
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.v = r4
                goto L3b8
            L26a:
                int r5 = r10.u
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.u = r4
                goto L3b8
            L274:
                int r5 = r10.t
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.t = r4
                goto L3b8
            L27e:
                int r5 = r10.s
                int r5 = r11.getResourceId(r4, r5)
                r10.s = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.s = r4
                goto L3b8
            L290:
                int r5 = r10.r
                int r5 = r11.getResourceId(r4, r5)
                r10.r = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.r = r4
                goto L3b8
            L2a2:
                int r5 = r10.q
                int r5 = r11.getResourceId(r4, r5)
                r10.q = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.q = r4
                goto L3b8
            L2b4:
                int r5 = r10.p
                int r5 = r11.getResourceId(r4, r5)
                r10.p = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.p = r4
                goto L3b8
            L2c6:
                int r5 = r10.l
                int r5 = r11.getResourceId(r4, r5)
                r10.l = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.l = r4
                goto L3b8
            L2d8:
                int r5 = r10.k
                int r5 = r11.getResourceId(r4, r5)
                r10.k = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.k = r4
                goto L3b8
            L2ea:
                int r5 = r10.j
                int r5 = r11.getResourceId(r4, r5)
                r10.j = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.j = r4
                goto L3b8
            L2fc:
                int r5 = r10.i
                int r5 = r11.getResourceId(r4, r5)
                r10.i = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.i = r4
                goto L3b8
            L30e:
                int r5 = r10.h
                int r5 = r11.getResourceId(r4, r5)
                r10.h = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.h = r4
                goto L3b8
            L320:
                int r5 = r10.g
                int r5 = r11.getResourceId(r4, r5)
                r10.g = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.g = r4
                goto L3b8
            L332:
                int r5 = r10.f
                int r5 = r11.getResourceId(r4, r5)
                r10.f = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.f = r4
                goto L3b8
            L344:
                int r5 = r10.e
                int r5 = r11.getResourceId(r4, r5)
                r10.e = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.e = r4
                goto L3b8
            L355:
                int r5 = r10.d
                int r5 = r11.getResourceId(r4, r5)
                r10.d = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.d = r4
                goto L3b8
            L366:
                float r5 = r10.c
                float r4 = r11.getFloat(r4, r5)
                r10.c = r4
                goto L3b8
            L36f:
                int r5 = r10.b
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.b = r4
                goto L3b8
            L378:
                int r5 = r10.f858a
                int r4 = r11.getDimensionPixelOffset(r4, r5)
                r10.f858a = r4
                goto L3b8
            L381:
                float r5 = r10.o
                float r4 = r11.getFloat(r4, r5)
                r5 = 1135869952(0x43b40000, float:360.0)
                float r4 = r4 % r5
                r10.o = r4
                int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r7 >= 0) goto L3b8
                float r4 = r5 - r4
                float r4 = r4 % r5
                r10.o = r4
                goto L3b8
            L396:
                int r5 = r10.n
                int r4 = r11.getDimensionPixelSize(r4, r5)
                r10.n = r4
                goto L3b8
            L39f:
                int r5 = r10.m
                int r5 = r11.getResourceId(r4, r5)
                r10.m = r5
                if (r5 != r0) goto L3b8
                int r4 = r11.getInt(r4, r0)
                r10.m = r4
                goto L3b8
            L3b0:
                int r5 = r10.R
                int r4 = r11.getInt(r4, r5)
                r10.R = r4
            L3b8:
                int r1 = r1 + 1
                goto L98
            L3bc:
                r11.recycle()
                r10.a()
                return
        }

        public a(android.view.ViewGroup.LayoutParams r6) {
                r5 = this;
                r5.<init>(r6)
                r6 = -1
                r5.f858a = r6
                r5.b = r6
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r5.c = r0
                r5.d = r6
                r5.e = r6
                r5.f = r6
                r5.g = r6
                r5.h = r6
                r5.i = r6
                r5.j = r6
                r5.k = r6
                r5.l = r6
                r5.m = r6
                r1 = 0
                r5.n = r1
                r2 = 0
                r5.o = r2
                r5.p = r6
                r5.q = r6
                r5.r = r6
                r5.s = r6
                r5.t = r6
                r5.u = r6
                r5.v = r6
                r5.w = r6
                r5.x = r6
                r5.y = r6
                r2 = 1056964608(0x3f000000, float:0.5)
                r5.z = r2
                r5.A = r2
                r3 = 0
                r5.B = r3
                r4 = 1
                r5.C = r4
                r5.D = r0
                r5.E = r0
                r5.F = r1
                r5.G = r1
                r5.H = r1
                r5.I = r1
                r5.J = r1
                r5.K = r1
                r5.L = r1
                r5.M = r1
                r0 = 1065353216(0x3f800000, float:1.0)
                r5.N = r0
                r5.O = r0
                r5.P = r6
                r5.Q = r6
                r5.R = r6
                r5.S = r1
                r5.T = r1
                r5.U = r3
                r5.V = r4
                r5.W = r4
                r5.X = r1
                r5.Y = r1
                r5.Z = r1
                r5.a0 = r1
                r5.b0 = r6
                r5.c0 = r6
                r5.d0 = r6
                r5.e0 = r6
                r5.f0 = r6
                r5.g0 = r6
                r5.h0 = r2
                a.N3 r6 = new a.N3
                r6.<init>()
                r5.l0 = r6
                return
        }

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
                int r0 = r6.f858a
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
                a.N3 r0 = r6.l0
                boolean r0 = r0 instanceof a.C0046a8
                if (r0 != 0) goto L6f
                a.a8 r0 = new a.a8
                r0.<init>()
                r6.l0 = r0
            L6f:
                a.N3 r0 = r6.l0
                a.a8 r0 = (a.C0046a8) r0
                int r1 = r6.R
                r0.B(r1)
                return
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
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
                r9.d0 = r4
                r9.e0 = r4
                r9.b0 = r4
                r9.c0 = r4
                int r5 = r9.t
                r9.f0 = r5
                int r5 = r9.v
                r9.g0 = r5
                float r5 = r9.z
                r9.h0 = r5
                int r6 = r9.f858a
                r9.i0 = r6
                int r7 = r9.b
                r9.j0 = r7
                float r8 = r9.c
                r9.k0 = r8
                if (r10 == 0) goto L8e
                int r10 = r9.p
                if (r10 == r4) goto L3d
                r9.d0 = r10
            L3b:
                r2 = r3
                goto L44
            L3d:
                int r10 = r9.q
                if (r10 == r4) goto L44
                r9.e0 = r10
                goto L3b
            L44:
                int r10 = r9.r
                if (r10 == r4) goto L4b
                r9.c0 = r10
                r2 = r3
            L4b:
                int r10 = r9.s
                if (r10 == r4) goto L52
                r9.b0 = r10
                r2 = r3
            L52:
                int r10 = r9.x
                if (r10 == r4) goto L58
                r9.g0 = r10
            L58:
                int r10 = r9.y
                if (r10 == r4) goto L5e
                r9.f0 = r10
            L5e:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L66
                float r2 = r10 - r5
                r9.h0 = r2
            L66:
                boolean r2 = r9.Y
                if (r2 == 0) goto Lb2
                int r2 = r9.R
                if (r2 != r3) goto Lb2
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L7c
                float r10 = r10 - r8
                r9.k0 = r10
                r9.i0 = r4
                r9.j0 = r4
                goto Lb2
            L7c:
                if (r6 == r4) goto L85
                r9.j0 = r6
                r9.i0 = r4
                r9.k0 = r2
                goto Lb2
            L85:
                if (r7 == r4) goto Lb2
                r9.i0 = r7
                r9.j0 = r4
                r9.k0 = r2
                goto Lb2
            L8e:
                int r10 = r9.p
                if (r10 == r4) goto L94
                r9.c0 = r10
            L94:
                int r10 = r9.q
                if (r10 == r4) goto L9a
                r9.b0 = r10
            L9a:
                int r10 = r9.r
                if (r10 == r4) goto La0
                r9.d0 = r10
            La0:
                int r10 = r9.s
                if (r10 == r4) goto La6
                r9.e0 = r10
            La6:
                int r10 = r9.x
                if (r10 == r4) goto Lac
                r9.f0 = r10
            Lac:
                int r10 = r9.y
                if (r10 == r4) goto Lb2
                r9.g0 = r10
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
                r9.d0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto Ldf
                if (r1 <= 0) goto Ldf
                r9.rightMargin = r1
                goto Ldf
            Ld1:
                int r10 = r9.g
                if (r10 == r4) goto Ldf
                r9.e0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto Ldf
                if (r1 <= 0) goto Ldf
                r9.rightMargin = r1
            Ldf:
                int r10 = r9.d
                if (r10 == r4) goto Lee
                r9.b0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto Lfc
                if (r0 <= 0) goto Lfc
                r9.leftMargin = r0
                return
            Lee:
                int r10 = r9.e
                if (r10 == r4) goto Lfc
                r9.c0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto Lfc
                if (r0 <= 0) goto Lfc
                r9.leftMargin = r0
            Lfc:
                return
        }
    }

    public class b implements a.C0114e2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.constraintlayout.widget.ConstraintLayout f860a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b(androidx.constraintlayout.widget.ConstraintLayout r1) {
                r0 = this;
                r0.<init>()
                r0.f860a = r1
                return
        }

        @android.annotation.SuppressLint({"WrongCall"})
        public final void a(a.N3 r22, a.C0114e2.a r23) {
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                if (r1 != 0) goto L9
                return
            L9:
                int r3 = r1.X
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L1b
                boolean r3 = r1.x
                if (r3 != 0) goto L1b
                r2.e = r5
                r2.f = r5
                r2.g = r5
                return
            L1b:
                a.N3$a r3 = r2.f448a
                a.N3$a r4 = r2.b
                int r6 = r2.c
                int r7 = r2.d
                int r8 = r0.b
                int r9 = r0.c
                int r8 = r8 + r9
                int r9 = r0.d
                android.view.View r10 = r1.W
                int r11 = r3.ordinal()
                a.M3 r12 = r1.A
                a.M3 r13 = r1.y
                int[] r14 = r1.g
                r16 = r5
                r15 = 2
                r5 = 1
                if (r11 == 0) goto Lbb
                if (r11 == r5) goto Lad
                if (r11 == r15) goto L69
                r6 = 3
                if (r11 == r6) goto L4a
                r19 = r15
                r6 = r16
                r9 = r6
                goto Lc7
            L4a:
                int r6 = r0.f
                if (r13 == 0) goto L51
                int r11 = r13.e
                goto L53
            L51:
                r11 = r16
            L53:
                if (r12 == 0) goto L5b
                r19 = r15
                int r15 = r12.e
                int r11 = r11 + r15
                goto L5d
            L5b:
                r19 = r15
            L5d:
                int r9 = r9 + r11
                r11 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
                r14[r19] = r11
            L65:
                r9 = r16
                goto Lc7
            L69:
                r19 = r15
                int r6 = r0.f
                r11 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
                int r9 = r1.j
                if (r9 != r5) goto L78
                r9 = r5
                goto L7a
            L78:
                r9 = r16
            L7a:
                r14[r19] = r16
                boolean r11 = r2.j
                if (r11 == 0) goto L9d
                if (r9 == 0) goto L90
                r18 = 3
                r11 = r14[r18]
                if (r11 == 0) goto L90
                r11 = r14[r16]
                int r15 = r1.l()
                if (r11 != r15) goto L94
            L90:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.h
                if (r11 == 0) goto L96
            L94:
                r11 = r5
                goto L98
            L96:
                r11 = r16
            L98:
                if (r9 == 0) goto La0
                if (r11 == 0) goto L9d
                goto La0
            L9d:
                r11 = 1073741824(0x40000000, float:2.0)
                goto Lab
            La0:
                int r6 = r1.l()
                r11 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
                goto L65
            Lab:
                r9 = r5
                goto Lc7
            Lad:
                r19 = r15
                r11 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f
                r15 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r15)
                r14[r19] = r15
                goto Lab
            Lbb:
                r19 = r15
                r11 = 1073741824(0x40000000, float:2.0)
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
                r14[r19] = r6
                r6 = r9
                goto L65
            Lc7:
                int r11 = r4.ordinal()
                if (r11 == 0) goto L14d
                if (r11 == r5) goto L13f
                r7 = r19
                if (r11 == r7) goto Lfb
                r7 = 3
                if (r11 == r7) goto Ldb
                r7 = r16
                r8 = r7
                goto L159
            Ldb:
                int r7 = r0.g
                if (r13 == 0) goto Le4
                a.M3 r11 = r1.z
                int r11 = r11.e
                goto Le6
            Le4:
                r11 = r16
            Le6:
                if (r12 == 0) goto Led
                a.M3 r12 = r1.B
                int r12 = r12.e
                int r11 = r11 + r12
            Led:
                int r8 = r8 + r11
                r11 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                r18 = 3
                r14[r18] = r11
            Lf7:
                r8 = r16
                goto L159
            Lfb:
                r18 = 3
                int r7 = r0.g
                r15 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r15)
                int r8 = r1.k
                if (r8 != r5) goto L10a
                r8 = r5
                goto L10c
            L10a:
                r8 = r16
            L10c:
                r14[r18] = r16
                boolean r11 = r2.j
                if (r11 == 0) goto L12f
                if (r8 == 0) goto L122
                r19 = 2
                r11 = r14[r19]
                if (r11 == 0) goto L122
                r11 = r14[r5]
                int r12 = r1.i()
                if (r11 != r12) goto L126
            L122:
                boolean r11 = r10 instanceof androidx.constraintlayout.widget.h
                if (r11 == 0) goto L128
            L126:
                r11 = r5
                goto L12a
            L128:
                r11 = r16
            L12a:
                if (r8 == 0) goto L132
                if (r11 == 0) goto L12f
                goto L132
            L12f:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L13d
            L132:
                int r7 = r1.i()
                r11 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
                goto Lf7
            L13d:
                r8 = r5
                goto L159
            L13f:
                r11 = 1073741824(0x40000000, float:2.0)
                int r7 = r0.g
                r15 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r15)
                r18 = 3
                r14[r18] = r15
                goto L13d
            L14d:
                r11 = 1073741824(0x40000000, float:2.0)
                r18 = 3
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r11)
                r14[r18] = r7
                r7 = r8
                goto Lf7
            L159:
                a.N3$a r11 = a.N3.a.c
                if (r3 != r11) goto L15f
                r12 = r5
                goto L161
            L15f:
                r12 = r16
            L161:
                if (r4 != r11) goto L165
                r11 = r5
                goto L167
            L165:
                r11 = r16
            L167:
                a.N3$a r13 = a.N3.a.d
                a.N3$a r15 = a.N3.a.f181a
                if (r4 == r13) goto L173
                if (r4 != r15) goto L170
                goto L173
            L170:
                r4 = r16
                goto L174
            L173:
                r4 = r5
            L174:
                if (r3 == r13) goto L17c
                if (r3 != r15) goto L179
                goto L17c
            L179:
                r3 = r16
                goto L17d
            L17c:
                r3 = r5
            L17d:
                r13 = 0
                if (r12 == 0) goto L188
                float r15 = r1.N
                int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r15 <= 0) goto L188
                r15 = r5
                goto L18a
            L188:
                r15 = r16
            L18a:
                if (r11 == 0) goto L196
                r17 = r13
                float r13 = r1.N
                int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
                if (r13 <= 0) goto L196
                r13 = r5
                goto L198
            L196:
                r13 = r16
            L198:
                android.view.ViewGroup$LayoutParams r17 = r10.getLayoutParams()
                r20 = r5
                r5 = r17
                androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.a) r5
                boolean r0 = r2.j
                if (r0 != 0) goto L1ba
                if (r12 == 0) goto L1ba
                int r0 = r1.j
                if (r0 != 0) goto L1ba
                if (r11 == 0) goto L1ba
                int r0 = r1.k
                if (r0 == 0) goto L1b3
                goto L1ba
            L1b3:
                r8 = r16
                r9 = r8
                r12 = r9
            L1b7:
                r11 = -1
                goto L25a
            L1ba:
                boolean r0 = r10 instanceof androidx.constraintlayout.widget.i
                if (r0 == 0) goto L1cc
                boolean r0 = r1 instanceof a.Yg
                if (r0 == 0) goto L1cc
                r0 = r1
                a.Yg r0 = (a.Yg) r0
                r11 = r10
                androidx.constraintlayout.widget.i r11 = (androidx.constraintlayout.widget.i) r11
                r11.h(r0, r6, r7)
                goto L1cf
            L1cc:
                r10.measure(r6, r7)
            L1cf:
                int r0 = r10.getMeasuredWidth()
                int r11 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                if (r9 == 0) goto L1e4
                r14[r16] = r0
                r19 = 2
                r14[r19] = r11
                goto L1ea
            L1e4:
                r19 = 2
                r14[r16] = r16
                r14[r19] = r16
            L1ea:
                if (r8 == 0) goto L1f3
                r14[r20] = r11
                r18 = 3
                r14[r18] = r0
                goto L1f9
            L1f3:
                r18 = 3
                r14[r20] = r16
                r14[r18] = r16
            L1f9:
                int r8 = r1.m
                if (r8 <= 0) goto L202
                int r8 = java.lang.Math.max(r8, r0)
                goto L203
            L202:
                r8 = r0
            L203:
                int r9 = r1.n
                if (r9 <= 0) goto L20b
                int r8 = java.lang.Math.min(r9, r8)
            L20b:
                int r9 = r1.p
                if (r9 <= 0) goto L214
                int r9 = java.lang.Math.max(r9, r11)
                goto L215
            L214:
                r9 = r11
            L215:
                int r14 = r1.q
                if (r14 <= 0) goto L21d
                int r9 = java.lang.Math.min(r14, r9)
            L21d:
                r14 = 1056964608(0x3f000000, float:0.5)
                if (r15 == 0) goto L22a
                if (r4 == 0) goto L22a
                float r3 = r1.N
                float r4 = (float) r9
                float r4 = r4 * r3
                float r4 = r4 + r14
                int r8 = (int) r4
                goto L234
            L22a:
                if (r13 == 0) goto L234
                if (r3 == 0) goto L234
                float r3 = r1.N
                float r4 = (float) r8
                float r4 = r4 / r3
                float r4 = r4 + r14
                int r9 = (int) r4
            L234:
                if (r0 != r8) goto L238
                if (r11 == r9) goto L1b7
            L238:
                if (r0 == r8) goto L241
                r0 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
                goto L243
            L241:
                r0 = 1073741824(0x40000000, float:2.0)
            L243:
                if (r11 == r9) goto L249
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            L249:
                r10.measure(r6, r7)
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                goto L1b7
            L25a:
                if (r12 == r11) goto L25f
                r0 = r20
                goto L261
            L25f:
                r0 = r16
            L261:
                int r3 = r2.c
                if (r8 != r3) goto L26d
                int r3 = r2.d
                if (r9 == r3) goto L26a
                goto L26d
            L26a:
                r3 = r16
                goto L26f
            L26d:
                r3 = r20
            L26f:
                r2.i = r3
                boolean r3 = r5.X
                if (r3 == 0) goto L277
                r0 = r20
            L277:
                if (r0 == 0) goto L284
                r11 = -1
                if (r12 == r11) goto L284
                int r1 = r1.R
                if (r1 == r12) goto L284
                r1 = r20
                r2.i = r1
            L284:
                r2.e = r8
                r2.f = r9
                r2.h = r0
                r2.g = r12
                return
        }
    }

    public ConstraintLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.f857a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 4
            r2.<init>(r0)
            r1.b = r2
            a.O3 r2 = new a.O3
            r2.<init>()
            r1.c = r2
            r2 = 0
            r1.d = r2
            r1.e = r2
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f = r0
            r1.g = r0
            r0 = 1
            r1.h = r0
            r0 = 263(0x107, float:3.69E-43)
            r1.i = r0
            r0 = 0
            r1.j = r0
            r1.k = r0
            r0 = -1
            r1.l = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.m = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.n = r0
            androidx.constraintlayout.widget.ConstraintLayout$b r0 = new androidx.constraintlayout.widget.ConstraintLayout$b
            r0.<init>(r1)
            r1.o = r0
            r1.c(r3, r2)
            return
    }

    public ConstraintLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.f857a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 4
            r2.<init>(r0)
            r1.b = r2
            a.O3 r2 = new a.O3
            r2.<init>()
            r1.c = r2
            r2 = 0
            r1.d = r2
            r1.e = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f = r2
            r1.g = r2
            r2 = 1
            r1.h = r2
            r2 = 263(0x107, float:3.69E-43)
            r1.i = r2
            r2 = 0
            r1.j = r2
            r1.k = r2
            r2 = -1
            r1.l = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.m = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.n = r2
            androidx.constraintlayout.widget.ConstraintLayout$b r2 = new androidx.constraintlayout.widget.ConstraintLayout$b
            r2.<init>(r1)
            r1.o = r2
            r1.c(r3, r4)
            return
    }

    private int getPaddingWidth() {
            r4 = this;
            int r0 = r4.getPaddingLeft()
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r4.getPaddingRight()
            int r2 = java.lang.Math.max(r1, r2)
            int r2 = r2 + r0
            int r0 = r4.getPaddingStart()
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = r4.getPaddingEnd()
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + r0
            if (r1 <= 0) goto L26
            return r1
        L26:
            return r2
    }

    public final a.N3 b(android.view.View r1) {
            r0 = this;
            if (r1 != r0) goto L5
            a.O3 r1 = r0.c
            return r1
        L5:
            if (r1 != 0) goto L9
            r1 = 0
            return r1
        L9:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r1 = (androidx.constraintlayout.widget.ConstraintLayout.a) r1
            a.N3 r1 = r1.l0
            return r1
    }

    public final void c(android.util.AttributeSet r8, int r9) {
            r7 = this;
            a.O3 r0 = r7.c
            r0.W = r7
            androidx.constraintlayout.widget.ConstraintLayout$b r1 = r7.o
            r0.h0 = r1
            a.U4 r2 = r0.g0
            r2.f = r1
            android.util.SparseArray<android.view.View> r1 = r7.f857a
            int r2 = r7.getId()
            r1.put(r2, r7)
            r1 = 0
            r7.j = r1
            r2 = 0
            if (r8 == 0) goto La3
            android.content.Context r3 = r7.getContext()
            int[] r4 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout
            android.content.res.TypedArray r8 = r3.obtainStyledAttributes(r8, r4, r9, r2)
            int r9 = r8.getIndexCount()
            r3 = r2
        L2a:
            if (r3 >= r9) goto La0
            int r4 = r8.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minWidth
            if (r4 != r5) goto L3d
            int r5 = r7.d
            int r4 = r8.getDimensionPixelOffset(r4, r5)
            r7.d = r4
            goto L9d
        L3d:
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minHeight
            if (r4 != r5) goto L4a
            int r5 = r7.e
            int r4 = r8.getDimensionPixelOffset(r4, r5)
            r7.e = r4
            goto L9d
        L4a:
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxWidth
            if (r4 != r5) goto L57
            int r5 = r7.f
            int r4 = r8.getDimensionPixelOffset(r4, r5)
            r7.f = r4
            goto L9d
        L57:
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxHeight
            if (r4 != r5) goto L64
            int r5 = r7.g
            int r4 = r8.getDimensionPixelOffset(r4, r5)
            r7.g = r4
            goto L9d
        L64:
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_optimizationLevel
            if (r4 != r5) goto L71
            int r5 = r7.i
            int r4 = r8.getInt(r4, r5)
            r7.i = r4
            goto L9d
        L71:
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layoutDescription
            if (r4 != r5) goto L82
            int r4 = r8.getResourceId(r4, r2)
            if (r4 == 0) goto L9d
            r7.d(r4)     // Catch: android.content.res.Resources.NotFoundException -> L7f
            goto L9d
        L7f:
            r7.k = r1
            goto L9d
        L82:
            int r5 = androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraintSet
            if (r4 != r5) goto L9d
            int r4 = r8.getResourceId(r4, r2)
            androidx.constraintlayout.widget.e r5 = new androidx.constraintlayout.widget.e     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r7.j = r5     // Catch: android.content.res.Resources.NotFoundException -> L99
            android.content.Context r6 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L99
            r5.e(r6, r4)     // Catch: android.content.res.Resources.NotFoundException -> L99
            goto L9b
        L99:
            r7.j = r1
        L9b:
            r7.l = r4
        L9d:
            int r3 = r3 + 1
            goto L2a
        La0:
            r8.recycle()
        La3:
            int r8 = r7.i
            r0.q0 = r8
            r9 = 256(0x100, float:3.59E-43)
            r8 = r8 & r9
            if (r8 != r9) goto Lad
            r2 = 1
        Lad:
            a.B9.p = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            return r1
    }

    public final void d(int r10) {
            r9 = this;
            androidx.constraintlayout.widget.d r0 = new androidx.constraintlayout.widget.d
            android.content.Context r1 = r9.getContext()
            r0.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f865a = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.b = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r3 = 0
        L24:
            r4 = 1
            if (r2 == r4) goto Lc4
            if (r2 == 0) goto Lb4
            r5 = 2
            if (r2 == r5) goto L2e
            goto Lb7
        L2e:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6a;
                case 80204913: goto L60;
                case 1382829617: goto L56;
                case 1657696882: goto L4c;
                case 1901439077: goto L3c;
                default: goto L3b;
            }     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
        L3b:
            goto L74
        L3c:
            java.lang.String r6 = "Variant"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r6 == 0) goto L74
            r6 = r8
            goto L75
        L46:
            r10 = move-exception
            goto Lbd
        L49:
            r10 = move-exception
            goto Lc1
        L4c:
            java.lang.String r6 = "layoutDescription"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r6 == 0) goto L74
            r6 = 0
            goto L75
        L56:
            java.lang.String r6 = "StateSet"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r6 == 0) goto L74
            r6 = r4
            goto L75
        L60:
            java.lang.String r6 = "State"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r6 == 0) goto L74
            r6 = r5
            goto L75
        L6a:
            java.lang.String r6 = "ConstraintSet"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r6 == 0) goto L74
            r6 = r7
            goto L75
        L74:
            r6 = -1
        L75:
            if (r6 == 0) goto Lb7
            if (r6 == r4) goto Lb7
            if (r6 == r5) goto La7
            if (r6 == r8) goto L9a
            if (r6 == r7) goto L96
            java.lang.String r4 = "ConstraintLayoutStates"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r5.<init>()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            java.lang.String r6 = "unknown tag "
            r5.append(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r5.append(r2)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            java.lang.String r2 = r5.toString()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            android.util.Log.v(r4, r2)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto Lb7
        L96:
            r0.a(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto Lb7
        L9a:
            androidx.constraintlayout.widget.d$b r2 = new androidx.constraintlayout.widget.d$b     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            if (r3 == 0) goto Lb7
            java.util.ArrayList<androidx.constraintlayout.widget.d$b> r4 = r3.b     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r4.add(r2)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto Lb7
        La7:
            androidx.constraintlayout.widget.d$a r3 = new androidx.constraintlayout.widget.d$a     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            android.util.SparseArray<androidx.constraintlayout.widget.d$a> r2 = r0.f865a     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            int r4 = r3.f866a     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            r2.put(r4, r3)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto Lb7
        Lb4:
            r10.getName()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
        Lb7:
            int r2 = r10.next()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L49
            goto L24
        Lbd:
            r10.printStackTrace()
            goto Lc4
        Lc1:
            r10.printStackTrace()
        Lc4:
            r9.k = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            r1 = 0
            java.util.ArrayList<androidx.constraintlayout.widget.c> r2 = r0.b
            if (r2 == 0) goto L1c
            int r3 = r2.size()
            if (r3 <= 0) goto L1c
            r4 = r1
        Le:
            if (r4 >= r3) goto L1c
            java.lang.Object r5 = r2.get(r4)
            androidx.constraintlayout.widget.c r5 = (androidx.constraintlayout.widget.c) r5
            r5.getClass()
            int r4 = r4 + 1
            goto Le
        L1c:
            super.dispatchDraw(r18)
            boolean r2 = r0.isInEditMode()
            if (r2 == 0) goto Lcb
            int r2 = r0.getChildCount()
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r4 = r0.getHeight()
            float r4 = (float) r4
            r5 = r1
        L34:
            if (r5 >= r2) goto Lcb
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L44
            goto Lc7
        L44:
            java.lang.Object r6 = r6.getTag()
            if (r6 == 0) goto Lc7
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto Lc7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            r8 = 4
            if (r7 != r8) goto Lc7
            r7 = r6[r1]
            int r7 = java.lang.Integer.parseInt(r7)
            r8 = 1
            r8 = r6[r8]
            int r8 = java.lang.Integer.parseInt(r8)
            r9 = 2
            r9 = r6[r9]
            int r9 = java.lang.Integer.parseInt(r9)
            r10 = 3
            r6 = r6[r10]
            int r6 = java.lang.Integer.parseInt(r6)
            float r7 = (float) r7
            r10 = 1149698048(0x44870000, float:1080.0)
            float r7 = r7 / r10
            float r7 = r7 * r3
            int r7 = (int) r7
            float r8 = (float) r8
            r11 = 1156579328(0x44f00000, float:1920.0)
            float r8 = r8 / r11
            float r8 = r8 * r4
            int r8 = (int) r8
            float r9 = (float) r9
            float r9 = r9 / r10
            float r9 = r9 * r3
            int r9 = (int) r9
            float r6 = (float) r6
            float r6 = r6 / r11
            float r6 = r6 * r4
            int r6 = (int) r6
            android.graphics.Paint r15 = new android.graphics.Paint
            r15.<init>()
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r15.setColor(r10)
            float r11 = (float) r7
            float r12 = (float) r8
            int r7 = r7 + r9
            float r13 = (float) r7
            r14 = r12
            r10 = r18
            r10.drawLine(r11, r12, r13, r14, r15)
            r7 = r11
            int r8 = r8 + r6
            float r14 = (float) r8
            r11 = r13
            r10.drawLine(r11, r12, r13, r14, r15)
            r6 = r12
            r12 = r14
            r13 = r7
            r10.drawLine(r11, r12, r13, r14, r15)
            r7 = r11
            r11 = r13
            r14 = r6
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r14
            r14 = r12
            r12 = r16
            r6 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r15.setColor(r6)
            r13 = r7
            r10.drawLine(r11, r12, r13, r14, r15)
            r16 = r14
            r14 = r12
            r12 = r16
            r10.drawLine(r11, r12, r13, r14, r15)
        Lc7:
            int r5 = r5 + 1
            goto L34
        Lcb:
            return
    }

    public final void e(a.O3 r27, int r28, int r29, int r30) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            int r3 = android.view.View.MeasureSpec.getMode(r29)
            int r4 = android.view.View.MeasureSpec.getSize(r29)
            int r5 = android.view.View.MeasureSpec.getMode(r30)
            int r6 = android.view.View.MeasureSpec.getSize(r30)
            int r7 = r0.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r0.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r0.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r12 = r0.o
            r12.b = r7
            r12.c = r9
            r12.d = r11
            r12.e = r10
            r9 = r29
            r12.f = r9
            r9 = r30
            r12.g = r9
            int r9 = r0.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r13 = r0.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            r14 = 1
            if (r9 > 0) goto L5e
            if (r13 <= 0) goto L55
            goto L5e
        L55:
            int r9 = r0.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L75
        L5e:
            android.content.Context r15 = r0.getContext()
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()
            int r15 = r15.flags
            r16 = 4194304(0x400000, float:5.877472E-39)
            r15 = r15 & r16
            if (r15 == 0) goto L75
            int r15 = r0.getLayoutDirection()
            if (r14 != r15) goto L75
            r9 = r13
        L75:
            int r4 = r4 - r11
            int r6 = r6 - r10
            int r10 = r12.e
            int r11 = r12.d
            a.N3$a r12 = a.N3.a.f181a
            int r13 = r0.getChildCount()
            a.N3$a r15 = a.N3.a.b
            r14 = 1073741824(0x40000000, float:2.0)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r8) goto Lb4
            if (r3 == 0) goto L9d
            if (r3 == r14) goto L92
            r17 = r10
            r10 = r12
            r14 = 0
            goto Lc0
        L92:
            int r14 = r0.f
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r4)
            r17 = r10
            r10 = r12
            goto Lc0
        L9d:
            if (r13 != 0) goto Lae
            int r14 = r0.d
            r8 = 0
            int r16 = java.lang.Math.max(r8, r14)
            r17 = r10
            r10 = r15
            r14 = r16
        Lab:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto Lc0
        Lae:
            r8 = 0
            r14 = r8
        Lb0:
            r17 = r10
            r10 = r15
            goto Lab
        Lb4:
            r8 = 0
            if (r13 != 0) goto Lbe
            int r14 = r0.d
            int r14 = java.lang.Math.max(r8, r14)
            goto Lb0
        Lbe:
            r14 = r4
            goto Lb0
        Lc0:
            if (r5 == r8) goto Lee
            if (r5 == 0) goto Lda
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r8) goto Lcd
            r18 = r11
            r8 = r12
            r13 = 0
            goto Lfa
        Lcd:
            int r8 = r0.g
            int r8 = r8 - r17
            int r8 = java.lang.Math.min(r8, r6)
            r13 = r8
            r18 = r11
            r8 = r12
            goto Lfa
        Lda:
            if (r13 != 0) goto Le9
            int r8 = r0.e
            r13 = 0
            int r16 = java.lang.Math.max(r13, r8)
            r18 = r11
            r8 = r15
            r13 = r16
            goto Lfa
        Le9:
            r13 = 0
        Lea:
            r18 = r11
            r8 = r15
            goto Lfa
        Lee:
            r8 = 0
            if (r13 != 0) goto Lf8
            int r13 = r0.e
            int r13 = java.lang.Math.max(r8, r13)
            goto Lea
        Lf8:
            r13 = r6
            goto Lea
        Lfa:
            int r11 = r1.l()
            r19 = r12
            a.U4 r12 = r1.g0
            if (r14 != r11) goto L10a
            int r11 = r1.i()
            if (r13 == r11) goto L10c
        L10a:
            r11 = 1
            goto L10e
        L10c:
            r11 = 0
            goto L111
        L10e:
            r12.c = r11
            goto L10c
        L111:
            r1.P = r11
            r1.Q = r11
            r16 = r11
            int r11 = r0.f
            int r11 = r11 - r18
            r20 = r11
            int[] r11 = r1.u
            r11[r16] = r20
            r20 = r11
            int r11 = r0.g
            int r11 = r11 - r17
            r21 = 1
            r20[r21] = r11
            r11 = r16
            r1.S = r11
            r1.T = r11
            r1.w(r10)
            r1.y(r14)
            r1.x(r8)
            r1.v(r13)
            int r8 = r0.d
            int r8 = r8 - r18
            if (r8 >= 0) goto L146
            r1.S = r11
            goto L148
        L146:
            r1.S = r8
        L148:
            int r8 = r0.e
            int r8 = r8 - r17
            if (r8 >= 0) goto L151
            r1.T = r11
            goto L153
        L151:
            r1.T = r8
        L153:
            r1.k0 = r9
            r1.l0 = r7
            a.e2 r7 = r1.f0
            r7.getClass()
            a.e2$b r8 = r1.h0
            java.util.ArrayList<a.N3> r9 = r1.e0
            int r9 = r9.size()
            int r10 = r1.l()
            int r11 = r1.i()
            r13 = r2 & 128(0x80, float:1.8E-43)
            r14 = 128(0x80, float:1.8E-43)
            if (r13 != r14) goto L174
            r13 = 1
            goto L175
        L174:
            r13 = 0
        L175:
            if (r13 != 0) goto L17f
            r14 = 64
            r2 = r2 & r14
            if (r2 != r14) goto L17d
            goto L17f
        L17d:
            r2 = 0
            goto L180
        L17f:
            r2 = 1
        L180:
            a.N3$a r14 = a.N3.a.c
            if (r2 == 0) goto L1e7
            r0 = 0
        L185:
            if (r0 >= r9) goto L1e7
            r28 = r2
            java.util.ArrayList<a.N3> r2 = r1.e0
            java.lang.Object r2 = r2.get(r0)
            a.N3 r2 = (a.N3) r2
            r17 = r0
            a.N3$a[] r0 = r2.J
            r18 = r0
            r16 = 0
            r0 = r18[r16]
            if (r0 != r14) goto L1a2
            r22 = 1
        L19f:
            r21 = 1
            goto L1a5
        L1a2:
            r22 = 0
            goto L19f
        L1a5:
            r0 = r18[r21]
            if (r0 != r14) goto L1ab
            r0 = 1
            goto L1ac
        L1ab:
            r0 = 0
        L1ac:
            if (r22 == 0) goto L1ba
            if (r0 == 0) goto L1ba
            float r0 = r2.N
            r18 = 0
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L1ba
            r0 = 1
            goto L1bb
        L1ba:
            r0 = 0
        L1bb:
            boolean r18 = r2.q()
            if (r18 == 0) goto L1c7
            if (r0 == 0) goto L1c7
        L1c3:
            r0 = 0
        L1c4:
            r2 = 1073741824(0x40000000, float:2.0)
            goto L1ec
        L1c7:
            boolean r18 = r2.r()
            if (r18 == 0) goto L1d0
            if (r0 == 0) goto L1d0
            goto L1c3
        L1d0:
            boolean r0 = r2 instanceof a.Yg
            if (r0 == 0) goto L1d5
            goto L1c3
        L1d5:
            boolean r0 = r2.q()
            if (r0 != 0) goto L1c3
            boolean r0 = r2.r()
            if (r0 == 0) goto L1e2
            goto L1c3
        L1e2:
            int r0 = r17 + 1
            r2 = r28
            goto L185
        L1e7:
            r28 = r2
            r0 = r28
            goto L1c4
        L1ec:
            if (r3 != r2) goto L1f0
            if (r5 == r2) goto L1f2
        L1f0:
            if (r13 == 0) goto L1f4
        L1f2:
            r2 = 1
            goto L1f5
        L1f4:
            r2 = 0
        L1f5:
            r0 = r0 & r2
            if (r0 == 0) goto L44a
            r16 = 0
            r0 = r20[r16]
            int r0 = java.lang.Math.min(r0, r4)
            r4 = 1
            r2 = r20[r4]
            int r2 = java.lang.Math.min(r2, r6)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 != r6) goto L21a
            int r6 = r1.l()
            if (r6 == r0) goto L218
            r1.y(r0)
            a.U4 r0 = r1.g0
            r0.b = r4
        L218:
            r6 = 1073741824(0x40000000, float:2.0)
        L21a:
            if (r5 != r6) goto L229
            int r0 = r1.i()
            if (r0 == r2) goto L229
            r1.v(r2)
            a.U4 r0 = r1.g0
            r0.b = r4
        L229:
            if (r3 != r6) goto L3b1
            if (r5 != r6) goto L3b1
            boolean r0 = r12.b
            a.O3 r2 = r12.f286a
            if (r0 != 0) goto L23a
            boolean r0 = r12.c
            if (r0 == 0) goto L238
            goto L23a
        L238:
            r6 = 0
            goto L269
        L23a:
            java.util.ArrayList<a.N3> r0 = r2.e0
            java.util.Iterator r0 = r0.iterator()
        L240:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L25a
            java.lang.Object r4 = r0.next()
            a.N3 r4 = (a.N3) r4
            r6 = 0
            r4.f180a = r6
            a.K8 r6 = r4.d
            r6.n()
            a.og r4 = r4.e
            r4.m()
            goto L240
        L25a:
            r6 = 0
            r2.f180a = r6
            a.K8 r0 = r2.d
            r0.n()
            a.og r0 = r2.e
            r0.m()
            r12.c = r6
        L269:
            a.O3 r0 = r12.d
            r12.b(r0)
            r2.P = r6
            r2.Q = r6
            a.N3$a r0 = r2.h(r6)
            r4 = 1
            a.N3$a r6 = r2.h(r4)
            boolean r4 = r12.b
            if (r4 == 0) goto L282
            r12.c()
        L282:
            int r4 = r2.m()
            r17 = r9
            int r9 = r2.n()
            r18 = r8
            a.K8 r8 = r2.d
            r20 = r10
            a.V4 r10 = r8.h
            r10.d(r4)
            a.og r10 = r2.e
            r21 = r4
            a.V4 r4 = r10.h
            r4.d(r9)
            r12.g()
            java.util.ArrayList<a.ih> r4 = r12.e
            r22 = r4
            a.l5 r4 = r8.e
            r23 = r9
            a.l5 r9 = r10.e
            if (r0 == r15) goto L2b9
            if (r6 != r15) goto L2b2
            goto L2b9
        L2b2:
            r25 = r7
            r24 = r11
            r11 = r19
            goto L30f
        L2b9:
            if (r13 == 0) goto L2d2
            java.util.Iterator r24 = r22.iterator()
        L2bf:
            boolean r25 = r24.hasNext()
            if (r25 == 0) goto L2d2
            java.lang.Object r25 = r24.next()
            a.ih r25 = (a.ih) r25
            boolean r25 = r25.k()
            if (r25 != 0) goto L2bf
            r13 = 0
        L2d2:
            if (r13 == 0) goto L2f1
            if (r0 != r15) goto L2f1
            r24 = r11
            r11 = r19
            r2.w(r11)
            r25 = r7
            r19 = r13
            r13 = 0
            int r7 = r12.d(r2, r13)
            r2.y(r7)
            int r7 = r2.l()
            r4.d(r7)
            goto L2f9
        L2f1:
            r25 = r7
            r24 = r11
            r11 = r19
            r19 = r13
        L2f9:
            if (r19 == 0) goto L30f
            if (r6 != r15) goto L30f
            r2.x(r11)
            r7 = 1
            int r13 = r12.d(r2, r7)
            r2.v(r13)
            int r7 = r2.i()
            r9.d(r7)
        L30f:
            a.N3$a[] r7 = r2.J
            r16 = 0
            r13 = r7[r16]
            r19 = r7
            a.N3$a r7 = a.N3.a.d
            if (r13 == r11) goto L320
            if (r13 != r7) goto L31e
            goto L320
        L31e:
            r4 = 0
            goto L34e
        L320:
            int r13 = r2.l()
            int r13 = r13 + r21
            a.V4 r8 = r8.i
            r8.d(r13)
            int r13 = r13 - r21
            r4.d(r13)
            r12.g()
            r4 = 1
            r8 = r19[r4]
            if (r8 == r11) goto L33a
            if (r8 != r7) goto L34a
        L33a:
            int r4 = r2.i()
            int r4 = r4 + r23
            a.V4 r7 = r10.i
            r7.d(r4)
            int r4 = r4 - r23
            r9.d(r4)
        L34a:
            r12.g()
            r4 = 1
        L34e:
            java.util.Iterator r7 = r22.iterator()
        L352:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L36b
            java.lang.Object r8 = r7.next()
            a.ih r8 = (a.ih) r8
            a.N3 r9 = r8.b
            if (r9 != r2) goto L367
            boolean r9 = r8.g
            if (r9 != 0) goto L367
            goto L352
        L367:
            r8.e()
            goto L352
        L36b:
            java.util.Iterator r7 = r22.iterator()
        L36f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3a4
            java.lang.Object r8 = r7.next()
            a.ih r8 = (a.ih) r8
            if (r4 != 0) goto L382
            a.N3 r9 = r8.b
            if (r9 != r2) goto L382
            goto L36f
        L382:
            a.V4 r9 = r8.h
            boolean r9 = r9.j
            if (r9 != 0) goto L38a
        L388:
            r4 = 0
            goto L3a5
        L38a:
            a.V4 r9 = r8.i
            boolean r9 = r9.j
            if (r9 != 0) goto L395
            boolean r9 = r8 instanceof a.C0065b8
            if (r9 != 0) goto L395
            goto L388
        L395:
            a.l5 r9 = r8.e
            boolean r9 = r9.j
            if (r9 != 0) goto L36f
            boolean r9 = r8 instanceof a.U2
            if (r9 != 0) goto L36f
            boolean r8 = r8 instanceof a.C0065b8
            if (r8 != 0) goto L36f
            goto L388
        L3a4:
            r4 = 1
        L3a5:
            r2.w(r0)
            r2.x(r6)
            r0 = r4
            r2 = 1073741824(0x40000000, float:2.0)
            r4 = 2
            goto L43a
        L3b1:
            r25 = r7
            r18 = r8
            r17 = r9
            r20 = r10
            r24 = r11
            r11 = r19
            boolean r0 = r12.b
            a.O3 r2 = r12.f286a
            if (r0 == 0) goto L40c
            java.util.ArrayList<a.N3> r0 = r2.e0
            java.util.Iterator r0 = r0.iterator()
        L3c9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3ef
            java.lang.Object r4 = r0.next()
            a.N3 r4 = (a.N3) r4
            r6 = 0
            r4.f180a = r6
            a.K8 r7 = r4.d
            a.l5 r8 = r7.e
            r8.j = r6
            r7.g = r6
            r7.n()
            a.og r4 = r4.e
            a.l5 r7 = r4.e
            r7.j = r6
            r4.g = r6
            r4.m()
            goto L3c9
        L3ef:
            r6 = 0
            r2.f180a = r6
            a.K8 r0 = r2.d
            a.l5 r4 = r0.e
            r4.j = r6
            r0.g = r6
            r0.n()
            a.og r0 = r2.e
            a.l5 r4 = r0.e
            r4.j = r6
            r0.g = r6
            r0.m()
            r12.c()
            goto L40d
        L40c:
            r6 = 0
        L40d:
            a.O3 r0 = r12.d
            r12.b(r0)
            r2.P = r6
            r2.Q = r6
            a.K8 r0 = r2.d
            a.V4 r0 = r0.h
            r0.d(r6)
            a.og r0 = r2.e
            a.V4 r0 = r0.h
            r0.d(r6)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r3 != r2) goto L42e
            boolean r0 = r1.E(r6, r13)
            r4 = 1
            goto L430
        L42e:
            r0 = 1
            r4 = 0
        L430:
            if (r5 != r2) goto L43a
            r7 = 1
            boolean r6 = r1.E(r7, r13)
            r0 = r0 & r6
            int r4 = r4 + 1
        L43a:
            if (r0 == 0) goto L458
            if (r3 != r2) goto L440
            r3 = 1
            goto L441
        L440:
            r3 = 0
        L441:
            if (r5 != r2) goto L445
            r2 = 1
            goto L446
        L445:
            r2 = 0
        L446:
            r1.z(r3, r2)
            goto L458
        L44a:
            r25 = r7
            r18 = r8
            r17 = r9
            r20 = r10
            r24 = r11
            r11 = r19
            r0 = 0
            r4 = 0
        L458:
            if (r0 == 0) goto L45f
            r0 = 2
            if (r4 == r0) goto L45e
            goto L45f
        L45e:
            return
        L45f:
            r0 = 8
            if (r17 <= 0) goto L51f
            java.util.ArrayList<a.N3> r2 = r1.e0
            int r2 = r2.size()
            a.e2$b r3 = r1.h0
            r4 = 0
        L46c:
            if (r4 >= r2) goto L4b0
            java.util.ArrayList<a.N3> r5 = r1.e0
            java.lang.Object r5 = r5.get(r4)
            a.N3 r5 = (a.N3) r5
            boolean r6 = r5 instanceof a.C0046a8
            if (r6 == 0) goto L47d
        L47a:
            r7 = r25
            goto L4ab
        L47d:
            a.K8 r6 = r5.d
            a.l5 r6 = r6.e
            boolean r6 = r6.j
            if (r6 == 0) goto L48e
            a.og r6 = r5.e
            a.l5 r6 = r6.e
            boolean r6 = r6.j
            if (r6 == 0) goto L48e
            goto L47a
        L48e:
            r6 = 0
            a.N3$a r7 = r5.h(r6)
            r6 = 1
            a.N3$a r8 = r5.h(r6)
            if (r7 != r14) goto L4a5
            int r7 = r5.j
            if (r7 == r6) goto L4a5
            if (r8 != r14) goto L4a5
            int r7 = r5.k
            if (r7 == r6) goto L4a5
            goto L47a
        L4a5:
            r7 = r25
            r6 = 0
            r7.a(r3, r5, r6)
        L4ab:
            int r4 = r4 + 1
            r25 = r7
            goto L46c
        L4b0:
            r7 = r25
            androidx.constraintlayout.widget.ConstraintLayout$b r3 = (androidx.constraintlayout.widget.ConstraintLayout.b) r3
            androidx.constraintlayout.widget.ConstraintLayout r2 = r3.f860a
            int r3 = r2.getChildCount()
            r8 = 0
        L4bb:
            if (r8 >= r3) goto L508
            android.view.View r4 = r2.getChildAt(r8)
            boolean r5 = r4 instanceof androidx.constraintlayout.widget.h
            if (r5 == 0) goto L505
            androidx.constraintlayout.widget.h r4 = (androidx.constraintlayout.widget.h) r4
            android.view.View r5 = r4.b
            if (r5 != 0) goto L4cc
            goto L505
        L4cc:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.a) r5
            android.view.View r4 = r4.b
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r4 = (androidx.constraintlayout.widget.ConstraintLayout.a) r4
            a.N3 r6 = r4.l0
            r13 = 0
            r6.X = r13
            a.N3 r9 = r5.l0
            a.N3$a[] r10 = r9.J
            r10 = r10[r13]
            if (r10 == r11) goto L4ee
            int r6 = r6.l()
            r9.y(r6)
        L4ee:
            a.N3 r5 = r5.l0
            a.N3$a[] r6 = r5.J
            r21 = 1
            r6 = r6[r21]
            if (r6 == r11) goto L501
            a.N3 r6 = r4.l0
            int r6 = r6.i()
            r5.v(r6)
        L501:
            a.N3 r4 = r4.l0
            r4.X = r0
        L505:
            int r8 = r8 + 1
            goto L4bb
        L508:
            java.util.ArrayList<androidx.constraintlayout.widget.c> r2 = r2.b
            int r3 = r2.size()
            if (r3 <= 0) goto L521
            r8 = 0
        L511:
            if (r8 >= r3) goto L521
            java.lang.Object r4 = r2.get(r8)
            androidx.constraintlayout.widget.c r4 = (androidx.constraintlayout.widget.c) r4
            r4.getClass()
            int r8 = r8 + 1
            goto L511
        L51f:
            r7 = r25
        L521:
            int r2 = r1.q0
            java.util.ArrayList<a.N3> r3 = r7.f447a
            int r4 = r3.size()
            r5 = r20
            r6 = r24
            if (r17 <= 0) goto L532
            r7.b(r1, r5, r6)
        L532:
            if (r4 <= 0) goto L712
            a.N3$a[] r8 = r1.J
            r16 = 0
            r9 = r8[r16]
            if (r9 != r15) goto L540
            r9 = 1
        L53d:
            r21 = 1
            goto L543
        L540:
            r9 = r16
            goto L53d
        L543:
            r8 = r8[r21]
            if (r8 != r15) goto L549
            r8 = 1
            goto L54b
        L549:
            r8 = r16
        L54b:
            int r10 = r1.l()
            a.O3 r11 = r7.c
            int r12 = r11.S
            int r10 = java.lang.Math.max(r10, r12)
            int r12 = r1.i()
            int r11 = r11.T
            int r11 = java.lang.Math.max(r12, r11)
            r12 = r10
            r13 = r11
            r10 = r16
            r11 = r10
        L566:
            a.M3$a r14 = a.M3.a.d
            a.M3$a r15 = a.M3.a.c
            if (r10 >= r4) goto L60b
            java.lang.Object r17 = r3.get(r10)
            r0 = r17
            a.N3 r0 = (a.N3) r0
            r17 = r8
            boolean r8 = r0 instanceof a.Yg
            if (r8 != 0) goto L585
            r21 = r2
            r19 = r9
            r20 = r10
            r0 = r11
            r11 = r18
            goto L5fc
        L585:
            int r8 = r0.l()
            r19 = r9
            int r9 = r0.i()
            r20 = r18
            r18 = r11
            r11 = r20
            r20 = r10
            r10 = 1
            boolean r21 = r7.a(r11, r0, r10)
            r10 = r18 | r21
            r18 = r10
            int r10 = r0.l()
            r21 = r2
            int r2 = r0.i()
            if (r10 == r8) goto L5d0
            r0.y(r10)
            if (r19 == 0) goto L5ce
            int r8 = r0.m()
            int r10 = r0.L
            int r8 = r8 + r10
            if (r8 <= r12) goto L5ce
            int r8 = r0.m()
            int r10 = r0.L
            int r8 = r8 + r10
            a.M3 r10 = r0.g(r15)
            int r10 = r10.c()
            int r10 = r10 + r8
            int r12 = java.lang.Math.max(r12, r10)
        L5ce:
            r18 = 1
        L5d0:
            if (r2 == r9) goto L5f6
            r0.v(r2)
            if (r17 == 0) goto L5f4
            int r2 = r0.n()
            int r8 = r0.M
            int r2 = r2 + r8
            if (r2 <= r13) goto L5f4
            int r2 = r0.n()
            int r8 = r0.M
            int r2 = r2 + r8
            a.M3 r8 = r0.g(r14)
            int r8 = r8.c()
            int r8 = r8 + r2
            int r13 = java.lang.Math.max(r13, r8)
        L5f4:
            r18 = 1
        L5f6:
            a.Yg r0 = (a.Yg) r0
            boolean r0 = r0.m0
            r0 = r18 | r0
        L5fc:
            int r10 = r20 + 1
            r18 = r11
            r8 = r17
            r9 = r19
            r2 = r21
            r11 = r0
            r0 = 8
            goto L566
        L60b:
            r17 = r18
            r18 = r11
            r11 = r17
            r21 = r2
            r17 = r8
            r19 = r9
            r8 = r16
        L619:
            r0 = 2
            if (r8 >= r0) goto L6ec
            r2 = r16
        L61e:
            if (r2 >= r4) goto L6d9
            java.lang.Object r9 = r3.get(r2)
            a.N3 r9 = (a.N3) r9
            boolean r10 = r9 instanceof a.C0138f8
            if (r10 == 0) goto L632
            boolean r10 = r9 instanceof a.Yg
            if (r10 == 0) goto L62f
            goto L632
        L62f:
            r0 = 8
            goto L653
        L632:
            boolean r10 = r9 instanceof a.C0046a8
            if (r10 == 0) goto L637
            goto L62f
        L637:
            int r10 = r9.X
            r0 = 8
            if (r10 != r0) goto L63e
            goto L653
        L63e:
            a.K8 r10 = r9.d
            a.l5 r10 = r10.e
            boolean r10 = r10.j
            if (r10 == 0) goto L64f
            a.og r10 = r9.e
            a.l5 r10 = r10.e
            boolean r10 = r10.j
            if (r10 == 0) goto L64f
            goto L653
        L64f:
            boolean r10 = r9 instanceof a.Yg
            if (r10 == 0) goto L65b
        L653:
            r20 = r2
            r22 = r3
            r23 = r4
            goto L6d0
        L65b:
            int r10 = r9.l()
            int r0 = r9.i()
            r20 = r2
            int r2 = r9.R
            r22 = r3
            r3 = 1
            boolean r23 = r7.a(r11, r9, r3)
            r18 = r18 | r23
            int r3 = r9.l()
            r23 = r4
            int r4 = r9.i()
            if (r3 == r10) goto L6a0
            r9.y(r3)
            if (r19 == 0) goto L69e
            int r3 = r9.m()
            int r10 = r9.L
            int r3 = r3 + r10
            if (r3 <= r12) goto L69e
            int r3 = r9.m()
            int r10 = r9.L
            int r3 = r3 + r10
            a.M3 r10 = r9.g(r15)
            int r10 = r10.c()
            int r10 = r10 + r3
            int r12 = java.lang.Math.max(r12, r10)
        L69e:
            r18 = 1
        L6a0:
            if (r4 == r0) goto L6c6
            r9.v(r4)
            if (r17 == 0) goto L6c4
            int r0 = r9.n()
            int r3 = r9.M
            int r0 = r0 + r3
            if (r0 <= r13) goto L6c4
            int r0 = r9.n()
            int r3 = r9.M
            int r0 = r0 + r3
            a.M3 r3 = r9.g(r14)
            int r3 = r3.c()
            int r3 = r3 + r0
            int r13 = java.lang.Math.max(r13, r3)
        L6c4:
            r18 = 1
        L6c6:
            boolean r0 = r9.w
            if (r0 == 0) goto L6d0
            int r0 = r9.R
            if (r2 == r0) goto L6d0
            r18 = 1
        L6d0:
            int r2 = r20 + 1
            r3 = r22
            r4 = r23
            r0 = 2
            goto L61e
        L6d9:
            r22 = r3
            r23 = r4
            if (r18 == 0) goto L6e4
            r7.b(r1, r5, r6)
            r18 = r16
        L6e4:
            int r8 = r8 + 1
            r3 = r22
            r4 = r23
            goto L619
        L6ec:
            if (r18 == 0) goto L70f
            r7.b(r1, r5, r6)
            int r0 = r1.l()
            if (r0 >= r12) goto L6fc
            r1.y(r12)
            r8 = 1
            goto L6fe
        L6fc:
            r8 = r16
        L6fe:
            int r0 = r1.i()
            if (r0 >= r13) goto L709
            r1.v(r13)
            r11 = 1
            goto L70a
        L709:
            r11 = r8
        L70a:
            if (r11 == 0) goto L70f
            r7.b(r1, r5, r6)
        L70f:
            r0 = r21
            goto L715
        L712:
            r16 = 0
            r0 = r2
        L715:
            r1.q0 = r0
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L71e
            r8 = 1
            goto L720
        L71e:
            r8 = r16
        L720:
            a.B9.p = r8
            return
    }

    @Override // android.view.View
    public final void forceLayout() {
            r1 = this;
            r0 = 1
            r1.h = r0
            super.forceLayout()
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = new androidx.constraintlayout.widget.ConstraintLayout$a
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = new androidx.constraintlayout.widget.ConstraintLayout$a
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = new androidx.constraintlayout.widget.ConstraintLayout$a
            r0.<init>(r2)
            return r0
    }

    public int getMaxHeight() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int getMinHeight() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public int getOptimizationLevel() {
            r1 = this;
            a.O3 r0 = r1.c
            int r0 = r0.q0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            int r6 = r5.getChildCount()
            boolean r7 = r5.isInEditMode()
            r8 = 0
            r9 = r8
        La:
            if (r9 >= r6) goto L5a
            android.view.View r10 = r5.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.a) r0
            a.N3 r1 = r0.l0
            int r2 = r10.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2b
            boolean r2 = r0.Y
            if (r2 != 0) goto L2b
            boolean r2 = r0.Z
            if (r2 != 0) goto L2b
            if (r7 != 0) goto L2b
            goto L57
        L2b:
            boolean r0 = r0.a0
            if (r0 == 0) goto L30
            goto L57
        L30:
            int r0 = r1.m()
            int r2 = r1.n()
            int r3 = r1.l()
            int r3 = r3 + r0
            int r1 = r1.i()
            int r1 = r1 + r2
            r10.layout(r0, r2, r3, r1)
            boolean r4 = r10 instanceof androidx.constraintlayout.widget.h
            if (r4 == 0) goto L57
            androidx.constraintlayout.widget.h r10 = (androidx.constraintlayout.widget.h) r10
            android.view.View r10 = r10.getContent()
            if (r10 == 0) goto L57
            r10.setVisibility(r8)
            r10.layout(r0, r2, r3, r1)
        L57:
            int r9 = r9 + 1
            goto La
        L5a:
            java.util.ArrayList<androidx.constraintlayout.widget.c> r6 = r5.b
            int r7 = r6.size()
            if (r7 <= 0) goto L70
        L62:
            if (r8 >= r7) goto L70
            java.lang.Object r9 = r6.get(r8)
            androidx.constraintlayout.widget.c r9 = (androidx.constraintlayout.widget.c) r9
            r9.getClass()
            int r8 = r8 + 1
            goto L62
        L70:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r37, int r38) {
            r36 = this;
            r0 = r36
            android.content.Context r3 = r0.getContext()
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.flags
            r4 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r4
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1b
            int r3 = r0.getLayoutDirection()
            if (r5 != r3) goto L1b
            r3 = r5
            goto L1c
        L1b:
            r3 = r4
        L1c:
            a.O3 r6 = r0.c
            r6.i0 = r3
            boolean r3 = r0.h
            if (r3 == 0) goto L688
            r0.h = r4
            int r3 = r0.getChildCount()
            r7 = r4
        L2b:
            if (r7 >= r3) goto L3c
            android.view.View r8 = r0.getChildAt(r7)
            boolean r8 = r8.isLayoutRequested()
            if (r8 == 0) goto L39
            r3 = r5
            goto L3d
        L39:
            int r7 = r7 + 1
            goto L2b
        L3c:
            r3 = r4
        L3d:
            a.N3$a r7 = a.N3.a.c
            a.N3$a r8 = a.N3.a.d
            if (r3 == 0) goto L64f
            boolean r9 = r0.isInEditMode()
            int r10 = r0.getChildCount()
            r11 = r4
        L4c:
            if (r11 >= r10) goto L5f
            android.view.View r12 = r0.getChildAt(r11)
            a.N3 r12 = r0.b(r12)
            if (r12 != 0) goto L59
            goto L5c
        L59:
            r12.s()
        L5c:
            int r11 = r11 + 1
            goto L4c
        L5f:
            android.util.SparseArray<android.view.View> r11 = r0.f857a
            r13 = -1
            if (r9 == 0) goto Lec
            r14 = r4
        L65:
            if (r14 >= r10) goto Lec
            android.view.View r15 = r0.getChildAt(r14)
            r16 = r5
            android.content.res.Resources r5 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Le4
            int r12 = r15.getId()     // Catch: android.content.res.Resources.NotFoundException -> Le4
            java.lang.String r5 = r5.getResourceName(r12)     // Catch: android.content.res.Resources.NotFoundException -> Le4
            int r12 = r15.getId()     // Catch: android.content.res.Resources.NotFoundException -> Le4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: android.content.res.Resources.NotFoundException -> Le4
            if (r5 == 0) goto La3
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r0.m     // Catch: android.content.res.Resources.NotFoundException -> Le4
            if (r4 != 0) goto L8e
            java.util.HashMap r4 = new java.util.HashMap     // Catch: android.content.res.Resources.NotFoundException -> Le4
            r4.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Le4
            r0.m = r4     // Catch: android.content.res.Resources.NotFoundException -> Le4
        L8e:
            java.lang.String r4 = "/"
            int r4 = r5.indexOf(r4)     // Catch: android.content.res.Resources.NotFoundException -> Le4
            if (r4 == r13) goto L9d
            int r4 = r4 + 1
            java.lang.String r4 = r5.substring(r4)     // Catch: android.content.res.Resources.NotFoundException -> Le4
            goto L9e
        L9d:
            r4 = r5
        L9e:
            java.util.HashMap<java.lang.String, java.lang.Integer> r13 = r0.m     // Catch: android.content.res.Resources.NotFoundException -> Le4
            r13.put(r4, r12)     // Catch: android.content.res.Resources.NotFoundException -> Le4
        La3:
            r4 = 47
            int r4 = r5.indexOf(r4)     // Catch: android.content.res.Resources.NotFoundException -> Le4
            r12 = -1
            if (r4 == r12) goto Lb2
            int r4 = r4 + 1
            java.lang.String r5 = r5.substring(r4)     // Catch: android.content.res.Resources.NotFoundException -> Le4
        Lb2:
            int r4 = r15.getId()     // Catch: android.content.res.Resources.NotFoundException -> Le4
            if (r4 != 0) goto Lba
        Lb8:
            r4 = r6
            goto Le2
        Lba:
            java.lang.Object r12 = r11.get(r4)     // Catch: android.content.res.Resources.NotFoundException -> Le4
            android.view.View r12 = (android.view.View) r12     // Catch: android.content.res.Resources.NotFoundException -> Le4
            if (r12 != 0) goto Ld3
            android.view.View r12 = r0.findViewById(r4)     // Catch: android.content.res.Resources.NotFoundException -> Le4
            if (r12 == 0) goto Ld3
            if (r12 == r0) goto Ld3
            android.view.ViewParent r4 = r12.getParent()     // Catch: android.content.res.Resources.NotFoundException -> Le4
            if (r4 != r0) goto Ld3
            r0.onViewAdded(r12)     // Catch: android.content.res.Resources.NotFoundException -> Le4
        Ld3:
            if (r12 != r0) goto Ld6
            goto Lb8
        Ld6:
            if (r12 != 0) goto Lda
            r4 = 0
            goto Le2
        Lda:
            android.view.ViewGroup$LayoutParams r4 = r12.getLayoutParams()     // Catch: android.content.res.Resources.NotFoundException -> Le4
            androidx.constraintlayout.widget.ConstraintLayout$a r4 = (androidx.constraintlayout.widget.ConstraintLayout.a) r4     // Catch: android.content.res.Resources.NotFoundException -> Le4
            a.N3 r4 = r4.l0     // Catch: android.content.res.Resources.NotFoundException -> Le4
        Le2:
            r4.Y = r5     // Catch: android.content.res.Resources.NotFoundException -> Le4
        Le4:
            int r14 = r14 + 1
            r5 = r16
            r4 = 0
            r13 = -1
            goto L65
        Lec:
            r16 = r5
            int r4 = r0.l
            r12 = -1
            if (r4 == r12) goto L111
            r4 = 0
        Lf4:
            if (r4 >= r10) goto L111
            android.view.View r5 = r0.getChildAt(r4)
            int r12 = r5.getId()
            int r13 = r0.l
            if (r12 != r13) goto L10e
            boolean r12 = r5 instanceof androidx.constraintlayout.widget.f
            if (r12 == 0) goto L10e
            androidx.constraintlayout.widget.f r5 = (androidx.constraintlayout.widget.f) r5
            androidx.constraintlayout.widget.e r5 = r5.getConstraintSet()
            r0.j = r5
        L10e:
            int r4 = r4 + 1
            goto Lf4
        L111:
            androidx.constraintlayout.widget.e r4 = r0.j
            if (r4 == 0) goto L118
            r4.a(r0)
        L118:
            java.util.ArrayList<a.N3> r4 = r6.e0
            r4.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.c> r4 = r0.b
            int r5 = r4.size()
            if (r5 <= 0) goto L1ea
            r13 = 0
        L126:
            if (r13 >= r5) goto L1ea
            java.lang.Object r14 = r4.get(r13)
            androidx.constraintlayout.widget.c r14 = (androidx.constraintlayout.widget.c) r14
            boolean r15 = r14.isInEditMode()
            if (r15 == 0) goto L139
            java.lang.String r15 = r14.e
            r14.setIds(r15)
        L139:
            a.f8 r15 = r14.d
            if (r15 != 0) goto L147
            r19 = r3
            r21 = r4
            r22 = r5
            r18 = 2
            goto L1e0
        L147:
            r12 = 0
            r18 = 2
            r15.f0 = r12
            a.N3[] r12 = r15.e0
            r15 = 0
            java.util.Arrays.fill(r12, r15)
            r12 = 0
        L153:
            int r15 = r14.b
            if (r12 >= r15) goto L1d5
            int[] r15 = r14.f864a
            r15 = r15[r12]
            r19 = r3
            android.util.SparseArray<android.view.View> r3 = r0.f857a
            java.lang.Object r3 = r3.get(r15)
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L193
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r20 = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r14.f
            java.lang.Object r15 = r3.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            r21 = r4
            int r4 = r14.d(r0, r15)
            r22 = r5
            if (r4 == 0) goto L199
            int[] r5 = r14.f864a
            r5[r12] = r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.put(r5, r15)
            android.util.SparseArray<android.view.View> r3 = r0.f857a
            java.lang.Object r3 = r3.get(r4)
            android.view.View r3 = (android.view.View) r3
            goto L19b
        L193:
            r20 = r3
            r21 = r4
            r22 = r5
        L199:
            r3 = r20
        L19b:
            if (r3 == 0) goto L1cb
            a.f8 r4 = r14.d
            a.N3 r3 = r0.b(r3)
            r4.getClass()
            if (r3 == r4) goto L1cb
            if (r3 != 0) goto L1ab
            goto L1cb
        L1ab:
            int r5 = r4.f0
            int r5 = r5 + 1
            a.N3[] r15 = r4.e0
            r20 = r3
            int r3 = r15.length
            if (r5 <= r3) goto L1c1
            int r3 = r15.length
            int r3 = r3 * 2
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r15, r3)
            a.N3[] r3 = (a.N3[]) r3
            r4.e0 = r3
        L1c1:
            a.N3[] r3 = r4.e0
            int r5 = r4.f0
            r3[r5] = r20
            int r5 = r5 + 1
            r4.f0 = r5
        L1cb:
            int r12 = r12 + 1
            r3 = r19
            r4 = r21
            r5 = r22
            goto L153
        L1d5:
            r19 = r3
            r21 = r4
            r22 = r5
            a.f8 r3 = r14.d
            r3.B()
        L1e0:
            int r13 = r13 + 1
            r3 = r19
            r4 = r21
            r5 = r22
            goto L126
        L1ea:
            r19 = r3
            r18 = 2
            r3 = 0
        L1ef:
            if (r3 >= r10) goto L22f
            android.view.View r4 = r0.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.constraintlayout.widget.h
            if (r5 == 0) goto L229
            androidx.constraintlayout.widget.h r4 = (androidx.constraintlayout.widget.h) r4
            int r5 = r4.f874a
            r12 = -1
            if (r5 != r12) goto L20b
            boolean r5 = r4.isInEditMode()
            if (r5 != 0) goto L20b
            int r5 = r4.c
            r4.setVisibility(r5)
        L20b:
            int r5 = r4.f874a
            android.view.View r5 = r0.findViewById(r5)
            r4.b = r5
            if (r5 == 0) goto L229
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.a) r5
            r12 = r16
            r5.a0 = r12
            android.view.View r5 = r4.b
            r12 = 0
            r5.setVisibility(r12)
            r4.setVisibility(r12)
            goto L22a
        L229:
            r12 = 0
        L22a:
            int r3 = r3 + 1
            r16 = 1
            goto L1ef
        L22f:
            r12 = 0
            android.util.SparseArray<a.N3> r3 = r0.n
            r3.clear()
            r3.put(r12, r6)
            int r4 = r0.getId()
            r3.put(r4, r6)
            r4 = 0
        L240:
            if (r4 >= r10) goto L254
            android.view.View r5 = r0.getChildAt(r4)
            a.N3 r12 = r0.b(r5)
            int r5 = r5.getId()
            r3.put(r5, r12)
            int r4 = r4 + 1
            goto L240
        L254:
            r4 = 0
        L255:
            if (r4 >= r10) goto L651
            android.view.View r5 = r0.getChildAt(r4)
            a.N3 r12 = r0.b(r5)
            if (r12 != 0) goto L270
        L261:
            r20 = r3
            r26 = r4
            r27 = r9
            r29 = r10
            r21 = r11
            r0 = r18
            r9 = -1
            goto L63f
        L270:
            android.view.ViewGroup$LayoutParams r13 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r13 = (androidx.constraintlayout.widget.ConstraintLayout.a) r13
            java.util.ArrayList<a.N3> r14 = r6.e0
            r14.add(r12)
            a.N3 r14 = r12.K
            if (r14 == 0) goto L28a
            a.hh r14 = (a.hh) r14
            java.util.ArrayList<a.N3> r14 = r14.e0
            r14.remove(r12)
            r15 = 0
            r12.K = r15
            goto L28b
        L28a:
            r15 = 0
        L28b:
            r12.K = r6
            r13.a()
            int r14 = r5.getVisibility()
            r12.X = r14
            boolean r14 = r13.a0
            if (r14 == 0) goto L2a1
            r14 = 1
            r12.x = r14
            r14 = 8
            r12.X = r14
        L2a1:
            r12.W = r5
            boolean r14 = r5 instanceof androidx.constraintlayout.widget.c
            if (r14 == 0) goto L2ae
            androidx.constraintlayout.widget.c r5 = (androidx.constraintlayout.widget.c) r5
            boolean r14 = r6.i0
            r5.f(r12, r14)
        L2ae:
            boolean r5 = r13.Y
            if (r5 == 0) goto L2f0
            a.a8 r12 = (a.C0046a8) r12
            int r5 = r13.i0
            int r14 = r13.j0
            float r13 = r13.k0
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r20 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r20 == 0) goto L2ca
            if (r20 <= 0) goto L261
            r12.e0 = r13
            r13 = -1
            r12.f0 = r13
            r12.g0 = r13
            goto L2d5
        L2ca:
            r13 = -1
            if (r5 == r13) goto L2e4
            if (r5 <= r13) goto L2d5
            r12.e0 = r15
            r12.f0 = r5
            r12.g0 = r13
        L2d5:
            r20 = r3
            r26 = r4
            r27 = r9
            r29 = r10
            r21 = r11
            r9 = r13
            r0 = r18
            goto L63f
        L2e4:
            if (r14 == r13) goto L2d5
            if (r14 <= r13) goto L2d5
            r12.e0 = r15
            r12.f0 = r13
            r12.g0 = r14
            goto L261
        L2f0:
            int r5 = r13.b0
            int r14 = r13.c0
            int r15 = r13.d0
            r26 = r4
            int r4 = r13.e0
            r27 = r9
            int r9 = r13.f0
            r25 = r9
            int r9 = r13.g0
            r28 = r9
            float r9 = r13.h0
            r29 = r10
            int r10 = r13.m
            a.M3$a r30 = a.M3.a.c
            a.M3$a r31 = a.M3.a.f172a
            a.M3$a r32 = a.M3.a.d
            a.M3$a r33 = a.M3.a.b
            r20 = r12
            r12 = -1
            r34 = 0
            if (r10 == r12) goto L348
            java.lang.Object r4 = r3.get(r10)
            r22 = r4
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L337
            float r4 = r13.o
            int r5 = r13.n
            a.M3$a r21 = a.M3.a.f
            r25 = 0
            r23 = r21
            r24 = r5
            r20.o(r21, r22, r23, r24, r25)
            r10 = r20
            r10.v = r4
            goto L339
        L337:
            r10 = r20
        L339:
            r20 = r3
            r12 = r10
            r21 = r11
            r4 = r30
            r5 = r31
            r14 = r32
            r10 = r33
            goto L4b4
        L348:
            r10 = r20
            if (r5 == r12) goto L36d
            java.lang.Object r5 = r3.get(r5)
            r22 = r5
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L364
            int r5 = r13.leftMargin
            r23 = r31
            r24 = r5
            r20 = r10
            r21 = r31
            r20.o(r21, r22, r23, r24, r25)
            goto L368
        L364:
            r20 = r10
            r21 = r31
        L368:
            r23 = r21
            r21 = r30
            goto L38c
        L36d:
            r20 = r10
            r21 = r31
            if (r14 == r12) goto L368
            java.lang.Object r5 = r3.get(r14)
            r22 = r5
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L368
            int r5 = r13.leftMargin
            r24 = r5
            r23 = r30
            r20.o(r21, r22, r23, r24, r25)
            r35 = r23
            r23 = r21
            r21 = r35
        L38c:
            if (r15 == r12) goto L3a6
            java.lang.Object r4 = r3.get(r15)
            r22 = r4
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L3a1
            int r4 = r13.rightMargin
            r24 = r4
            r25 = r28
            r20.o(r21, r22, r23, r24, r25)
        L3a1:
            r5 = r23
        L3a3:
            r4 = r21
            goto L3c0
        L3a6:
            r5 = r23
            r25 = r28
            if (r4 == r12) goto L3a3
            java.lang.Object r4 = r3.get(r4)
            r22 = r4
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L3a3
            int r4 = r13.rightMargin
            r23 = r21
            r24 = r4
            r20.o(r21, r22, r23, r24, r25)
            goto L3a3
        L3c0:
            int r10 = r13.h
            if (r10 == r12) goto L3e6
            java.lang.Object r10 = r3.get(r10)
            r22 = r10
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L3de
            int r10 = r13.topMargin
            int r12 = r13.u
            r23 = r33
            r24 = r10
            r25 = r12
            r21 = r33
            r20.o(r21, r22, r23, r24, r25)
            goto L3e0
        L3de:
            r21 = r33
        L3e0:
            r23 = r21
            r21 = r32
            r12 = -1
            goto L40f
        L3e6:
            r21 = r33
            int r10 = r13.i
            r12 = -1
            if (r10 == r12) goto L40b
            java.lang.Object r10 = r3.get(r10)
            r22 = r10
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L40b
            int r10 = r13.topMargin
            int r14 = r13.u
            r24 = r10
            r25 = r14
            r23 = r32
            r20.o(r21, r22, r23, r24, r25)
            r35 = r23
            r23 = r21
            r21 = r35
            goto L40f
        L40b:
            r23 = r21
            r21 = r32
        L40f:
            int r10 = r13.j
            if (r10 == r12) goto L42f
            java.lang.Object r10 = r3.get(r10)
            r22 = r10
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L428
            int r10 = r13.bottomMargin
            int r14 = r13.w
            r24 = r10
            r25 = r14
            r20.o(r21, r22, r23, r24, r25)
        L428:
            r10 = r23
        L42a:
            r12 = r20
            r14 = r21
            goto L44d
        L42f:
            r10 = r23
            int r14 = r13.k
            if (r14 == r12) goto L42a
            java.lang.Object r12 = r3.get(r14)
            r22 = r12
            a.N3 r22 = (a.N3) r22
            if (r22 == 0) goto L42a
            int r12 = r13.bottomMargin
            int r14 = r13.w
            r23 = r21
            r24 = r12
            r25 = r14
            r20.o(r21, r22, r23, r24, r25)
            goto L42a
        L44d:
            int r15 = r13.l
            r1 = -1
            if (r15 == r1) goto L4a2
            java.lang.Object r1 = r11.get(r15)
            android.view.View r1 = (android.view.View) r1
            int r15 = r13.l
            java.lang.Object r15 = r3.get(r15)
            a.N3 r15 = (a.N3) r15
            if (r15 == 0) goto L4a2
            if (r1 == 0) goto L4a2
            r20 = r1
            android.view.ViewGroup$LayoutParams r1 = r20.getLayoutParams()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r1 == 0) goto L4a2
            android.view.ViewGroup$LayoutParams r1 = r20.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r1 = (androidx.constraintlayout.widget.ConstraintLayout.a) r1
            r20 = r3
            r3 = 1
            r13.X = r3
            r1.X = r3
            a.M3$a r3 = a.M3.a.e
            r21 = r11
            a.M3 r11 = r12.g(r3)
            a.M3 r3 = r15.g(r3)
            r0 = -1
            r2 = 1
            r15 = 0
            r11.b(r3, r15, r0, r2)
            r12.w = r2
            a.N3 r0 = r1.l0
            r0.w = r2
            a.M3 r0 = r12.g(r10)
            r0.h()
            a.M3 r0 = r12.g(r14)
            r0.h()
            goto L4a6
        L4a2:
            r20 = r3
            r21 = r11
        L4a6:
            int r0 = (r9 > r34 ? 1 : (r9 == r34 ? 0 : -1))
            if (r0 < 0) goto L4ac
            r12.U = r9
        L4ac:
            float r0 = r13.A
            int r1 = (r0 > r34 ? 1 : (r0 == r34 ? 0 : -1))
            if (r1 < 0) goto L4b4
            r12.V = r0
        L4b4:
            if (r27 == 0) goto L4c5
            int r0 = r13.P
            r1 = -1
            if (r0 != r1) goto L4bf
            int r2 = r13.Q
            if (r2 == r1) goto L4c5
        L4bf:
            int r1 = r13.Q
            r12.P = r0
            r12.Q = r1
        L4c5:
            boolean r0 = r13.V
            a.N3$a r1 = a.N3.a.b
            a.N3$a r2 = a.N3.a.f181a
            r3 = -2
            if (r0 != 0) goto L4f7
            int r0 = r13.width
            r9 = -1
            if (r0 != r9) goto L4ef
            boolean r0 = r13.S
            if (r0 == 0) goto L4db
            r12.w(r7)
            goto L4de
        L4db:
            r12.w(r8)
        L4de:
            a.M3 r0 = r12.g(r5)
            int r5 = r13.leftMargin
            r0.e = r5
            a.M3 r0 = r12.g(r4)
            int r4 = r13.rightMargin
            r0.e = r4
            goto L506
        L4ef:
            r12.w(r7)
            r15 = 0
            r12.y(r15)
            goto L506
        L4f7:
            r12.w(r2)
            int r0 = r13.width
            r12.y(r0)
            int r0 = r13.width
            if (r0 != r3) goto L506
            r12.w(r1)
        L506:
            boolean r0 = r13.W
            if (r0 != 0) goto L533
            int r0 = r13.height
            r9 = -1
            if (r0 != r9) goto L52b
            boolean r0 = r13.T
            if (r0 == 0) goto L517
            r12.x(r7)
            goto L51a
        L517:
            r12.x(r8)
        L51a:
            a.M3 r0 = r12.g(r10)
            int r1 = r13.topMargin
            r0.e = r1
            a.M3 r0 = r12.g(r14)
            int r1 = r13.bottomMargin
            r0.e = r1
            goto L543
        L52b:
            r12.x(r7)
            r15 = 0
            r12.v(r15)
            goto L543
        L533:
            r9 = -1
            r12.x(r2)
            int r0 = r13.height
            r12.v(r0)
            int r0 = r13.height
            if (r0 != r3) goto L543
            r12.x(r1)
        L543:
            java.lang.String r0 = r13.B
            if (r0 == 0) goto L54d
            int r1 = r0.length()
            if (r1 != 0) goto L551
        L54d:
            r0 = r34
            goto L5db
        L551:
            int r1 = r0.length()
            r2 = 44
            int r2 = r0.indexOf(r2)
            if (r2 <= 0) goto L57e
            int r3 = r1 + (-1)
            if (r2 >= r3) goto L57e
            r15 = 0
            java.lang.String r3 = r0.substring(r15, r2)
            java.lang.String r4 = "W"
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto L570
            r3 = 0
            goto L57b
        L570:
            java.lang.String r4 = "H"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L57a
            r3 = 1
            goto L57b
        L57a:
            r3 = r9
        L57b:
            int r2 = r2 + 1
            goto L580
        L57e:
            r3 = r9
            r2 = 0
        L580:
            r4 = 58
            int r4 = r0.indexOf(r4)
            if (r4 < 0) goto L5c1
            int r1 = r1 + (-1)
            if (r4 >= r1) goto L5c1
            java.lang.String r1 = r0.substring(r2, r4)
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r4)
            int r2 = r1.length()
            if (r2 <= 0) goto L5d0
            int r2 = r0.length()
            if (r2 <= 0) goto L5d0
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L5d0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L5d0
            int r2 = (r1 > r34 ? 1 : (r1 == r34 ? 0 : -1))
            if (r2 <= 0) goto L5d0
            int r2 = (r0 > r34 ? 1 : (r0 == r34 ? 0 : -1))
            if (r2 <= 0) goto L5d0
            r14 = 1
            if (r3 != r14) goto L5bb
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.NumberFormatException -> L5d0
            goto L5d2
        L5bb:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L5d0
            goto L5d2
        L5c1:
            java.lang.String r0 = r0.substring(r2)
            int r1 = r0.length()
            if (r1 <= 0) goto L5d0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L5d0
            goto L5d2
        L5d0:
            r0 = r34
        L5d2:
            int r1 = (r0 > r34 ? 1 : (r0 == r34 ? 0 : -1))
            if (r1 <= 0) goto L5dd
            r12.N = r0
            r12.O = r3
            goto L5dd
        L5db:
            r12.N = r0
        L5dd:
            float r0 = r13.D
            float[] r1 = r12.b0
            r17 = 0
            r1[r17] = r0
            float r0 = r13.E
            r16 = 1
            r1[r16] = r0
            int r0 = r13.F
            r12.Z = r0
            int r0 = r13.G
            r12.a0 = r0
            int r0 = r13.H
            int r1 = r13.J
            int r2 = r13.L
            float r3 = r13.N
            r12.j = r0
            r12.m = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L605
            r2 = 0
        L605:
            r12.n = r2
            r12.o = r3
            r34 = 0
            int r2 = (r3 > r34 ? 1 : (r3 == r34 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 <= 0) goto L61b
            int r2 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r2 >= 0) goto L61b
            if (r0 != 0) goto L61b
            r0 = r18
            r12.j = r0
        L61b:
            int r0 = r13.I
            int r2 = r13.K
            int r3 = r13.M
            float r5 = r13.O
            r12.k = r0
            r12.p = r2
            if (r3 != r1) goto L62a
            r3 = 0
        L62a:
            r12.q = r3
            r12.r = r5
            r34 = 0
            int r1 = (r5 > r34 ? 1 : (r5 == r34 ? 0 : -1))
            if (r1 <= 0) goto L63e
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 >= 0) goto L63e
            if (r0 != 0) goto L63e
            r0 = 2
            r12.k = r0
            goto L63f
        L63e:
            r0 = 2
        L63f:
            int r4 = r26 + 1
            r18 = r0
            r3 = r20
            r11 = r21
            r9 = r27
            r10 = r29
            r0 = r36
            goto L255
        L64f:
            r19 = r3
        L651:
            if (r19 == 0) goto L688
            a.e2 r0 = r6.f0
            java.util.ArrayList<a.N3> r0 = r0.f447a
            r0.clear()
            java.util.ArrayList<a.N3> r1 = r6.e0
            int r1 = r1.size()
            r12 = 0
        L661:
            if (r12 >= r1) goto L683
            java.util.ArrayList<a.N3> r2 = r6.e0
            java.lang.Object r2 = r2.get(r12)
            a.N3 r2 = (a.N3) r2
            a.N3$a[] r3 = r2.J
            r17 = 0
            r4 = r3[r17]
            if (r4 == r7) goto L67d
            if (r4 == r8) goto L67d
            r16 = 1
            r3 = r3[r16]
            if (r3 == r7) goto L67d
            if (r3 != r8) goto L680
        L67d:
            r0.add(r2)
        L680:
            int r12 = r12 + 1
            goto L661
        L683:
            a.U4 r0 = r6.g0
            r14 = 1
            r0.b = r14
        L688:
            r0 = r36
            int r1 = r0.i
            r2 = r37
            r3 = r38
            r0.e(r6, r1, r2, r3)
            int r1 = r6.l()
            int r4 = r6.i()
            boolean r5 = r6.r0
            boolean r6 = r6.s0
            androidx.constraintlayout.widget.ConstraintLayout$b r7 = r0.o
            int r8 = r7.e
            int r7 = r7.d
            int r1 = r1 + r7
            int r4 = r4 + r8
            r15 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r2, r15)
            int r2 = android.view.View.resolveSizeAndState(r4, r3, r15)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.g
            int r2 = java.lang.Math.min(r3, r2)
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r5 == 0) goto L6c6
            r1 = r1 | r3
        L6c6:
            if (r6 == 0) goto L6c9
            r2 = r2 | r3
        L6c9:
            r0.setMeasuredDimension(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View r5) {
            r4 = this;
            super.onViewAdded(r5)
            a.N3 r0 = r4.b(r5)
            boolean r1 = r5 instanceof androidx.constraintlayout.widget.g
            r2 = 1
            if (r1 == 0) goto L24
            boolean r0 = r0 instanceof a.C0046a8
            if (r0 != 0) goto L24
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.a) r0
            a.a8 r1 = new a.a8
            r1.<init>()
            r0.l0 = r1
            r0.Y = r2
            int r0 = r0.R
            r1.B(r0)
        L24:
            boolean r0 = r5 instanceof androidx.constraintlayout.widget.c
            if (r0 == 0) goto L41
            r0 = r5
            androidx.constraintlayout.widget.c r0 = (androidx.constraintlayout.widget.c) r0
            r0.g()
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r1 = (androidx.constraintlayout.widget.ConstraintLayout.a) r1
            r1.Z = r2
            java.util.ArrayList<androidx.constraintlayout.widget.c> r1 = r4.b
            boolean r3 = r1.contains(r0)
            if (r3 != 0) goto L41
            r1.add(r0)
        L41:
            int r0 = r5.getId()
            android.util.SparseArray<android.view.View> r1 = r4.f857a
            r1.put(r0, r5)
            r4.h = r2
            return
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            int r0 = r3.getId()
            android.util.SparseArray<android.view.View> r1 = r2.f857a
            r1.remove(r0)
            a.N3 r0 = r2.b(r3)
            a.O3 r1 = r2.c
            java.util.ArrayList<a.N3> r1 = r1.e0
            r1.remove(r0)
            r1 = 0
            r0.K = r1
            java.util.ArrayList<androidx.constraintlayout.widget.c> r0 = r2.b
            r0.remove(r3)
            r3 = 1
            r2.h = r3
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            r0 = 1
            r1.h = r0
            super.requestLayout()
            return
    }

    public void setConstraintSet(androidx.constraintlayout.widget.e r1) {
            r0 = this;
            r0.j = r1
            return
    }

    @Override // android.view.View
    public void setId(int r3) {
            r2 = this;
            int r0 = r2.getId()
            android.util.SparseArray<android.view.View> r1 = r2.f857a
            r1.remove(r0)
            super.setId(r3)
            int r3 = r2.getId()
            r1.put(r3, r2)
            return
    }

    public void setMaxHeight(int r2) {
            r1 = this;
            int r0 = r1.g
            if (r2 != r0) goto L5
            return
        L5:
            r1.g = r2
            r1.requestLayout()
            return
    }

    public void setMaxWidth(int r2) {
            r1 = this;
            int r0 = r1.f
            if (r2 != r0) goto L5
            return
        L5:
            r1.f = r2
            r1.requestLayout()
            return
    }

    public void setMinHeight(int r2) {
            r1 = this;
            int r0 = r1.e
            if (r2 != r0) goto L5
            return
        L5:
            r1.e = r2
            r1.requestLayout()
            return
    }

    public void setMinWidth(int r2) {
            r1 = this;
            int r0 = r1.d
            if (r2 != r0) goto L5
            return
        L5:
            r1.d = r2
            r1.requestLayout()
            return
    }

    public void setOnConstraintsChanged(a.P3 r1) {
            r0 = this;
            androidx.constraintlayout.widget.d r1 = r0.k
            if (r1 == 0) goto L7
            r1.getClass()
        L7:
            return
    }

    public void setOptimizationLevel(int r2) {
            r1 = this;
            r1.i = r2
            a.O3 r0 = r1.c
            r0.q0 = r2
            r0 = 256(0x100, float:3.59E-43)
            r2 = r2 & r0
            if (r2 != r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            a.B9.p = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
