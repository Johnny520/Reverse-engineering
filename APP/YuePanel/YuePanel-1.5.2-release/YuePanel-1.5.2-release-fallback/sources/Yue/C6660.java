package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6660 extends Yue.AbstractC6659 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f23216 = "VectorDrawableCompat";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final android.graphics.PorterDuff.Mode f23217 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final java.lang.String f23218 = "clip-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final java.lang.String f23219 = "group";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final java.lang.String f23220 = "path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final java.lang.String f23221 = "vector";

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f23222 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f23223 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f23224 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f23225 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f23226 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f23227 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f23228 = 2048;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final boolean f23229 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.C6660.C6668 f23230;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.graphics.PorterDuffColorFilter f23231;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.graphics.ColorFilter f23232;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f23233;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f23234;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable.ConstantState f23235;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final float[] f23236;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final android.graphics.Matrix f23237;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final android.graphics.Rect f23238;

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C6661 {
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟, reason: contains not printable characters */
    public static class C6662 extends Yue.C6660.AbstractC6666 {
        public C6662() {
                r0 = this;
                r0.<init>()
                return
        }

        public C6662(Yue.C6660.C6662 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        private void m25651(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5) {
                r3 = this;
                r0 = 0
                java.lang.String r1 = r4.getString(r0)
                if (r1 == 0) goto L9
                r3.f23266 = r1
            L9:
                r1 = 1
                java.lang.String r1 = r4.getString(r1)
                if (r1 == 0) goto L16
                Yue.ۥۣۣۡۨ$ۥ۟[] r1 = Yue.C4710.m18707(r1)
                r3.f23265 = r1
            L16:
                java.lang.String r1 = "fillType"
                r2 = 2
                int r4 = Yue.C6478.m23898(r4, r5, r1, r2, r0)
                r3.f23267 = r4
                return
        }

        @Override // Yue.C6660.AbstractC6666
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo25652() {
                r1 = this;
                r0 = 1
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m25653(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                java.lang.String r0 = "pathData"
                boolean r0 = Yue.C6478.m23905(r5, r0)
                if (r0 != 0) goto L9
                return
            L9:
                int[] r0 = Yue.C0347.f800
                android.content.res.TypedArray r2 = Yue.C6478.m23906(r2, r4, r3, r0)
                r1.m25651(r2, r5)
                r2.recycle()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟, reason: contains not printable characters */
    public static class C6663 extends Yue.C6660.AbstractC6666 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int[] f23239;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C1424 f23240;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public float f23241;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Yue.C1424 f23242;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public float f23243;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public float f23244;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public float f23245;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public float f23246;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public float f23247;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public android.graphics.Paint.Cap f23248;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public android.graphics.Paint.Join f23249;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public float f23250;

        public C6663() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f23241 = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.f23243 = r1
                r2.f23244 = r1
                r2.f23245 = r0
                r2.f23246 = r1
                r2.f23247 = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.f23248 = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.f23249 = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.f23250 = r0
                return
        }

        public C6663(Yue.C6660.C6663 r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.f23241 = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.f23243 = r1
                r2.f23244 = r1
                r2.f23245 = r0
                r2.f23246 = r1
                r2.f23247 = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.f23248 = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.f23249 = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.f23250 = r0
                int[] r0 = r3.f23239
                r2.f23239 = r0
                Yue.ۥ۟ۦۤ r0 = r3.f23240
                r2.f23240 = r0
                float r0 = r3.f23241
                r2.f23241 = r0
                float r0 = r3.f23243
                r2.f23243 = r0
                Yue.ۥ۟ۦۤ r0 = r3.f23242
                r2.f23242 = r0
                int r0 = r3.f23267
                r2.f23267 = r0
                float r0 = r3.f23244
                r2.f23244 = r0
                float r0 = r3.f23245
                r2.f23245 = r0
                float r0 = r3.f23246
                r2.f23246 = r0
                float r0 = r3.f23247
                r2.f23247 = r0
                android.graphics.Paint$Cap r0 = r3.f23248
                r2.f23248 = r0
                android.graphics.Paint$Join r0 = r3.f23249
                r2.f23249 = r0
                float r3 = r3.f23250
                r2.f23250 = r3
                return
        }

        public float getFillAlpha() {
                r1 = this;
                float r0 = r1.f23244
                return r0
        }

        @Yue.InterfaceC1230
        public int getFillColor() {
                r1 = this;
                Yue.ۥ۟ۦۤ r0 = r1.f23242
                int r0 = r0.m7060()
                return r0
        }

        public float getStrokeAlpha() {
                r1 = this;
                float r0 = r1.f23243
                return r0
        }

        @Yue.InterfaceC1230
        public int getStrokeColor() {
                r1 = this;
                Yue.ۥ۟ۦۤ r0 = r1.f23240
                int r0 = r0.m7060()
                return r0
        }

        public float getStrokeWidth() {
                r1 = this;
                float r0 = r1.f23241
                return r0
        }

        public float getTrimPathEnd() {
                r1 = this;
                float r0 = r1.f23246
                return r0
        }

        public float getTrimPathOffset() {
                r1 = this;
                float r0 = r1.f23247
                return r0
        }

        public float getTrimPathStart() {
                r1 = this;
                float r0 = r1.f23245
                return r0
        }

        public void setFillAlpha(float r1) {
                r0 = this;
                r0.f23244 = r1
                return
        }

        public void setFillColor(int r2) {
                r1 = this;
                Yue.ۥ۟ۦۤ r0 = r1.f23242
                r0.m7065(r2)
                return
        }

        public void setStrokeAlpha(float r1) {
                r0 = this;
                r0.f23243 = r1
                return
        }

        public void setStrokeColor(int r2) {
                r1 = this;
                Yue.ۥ۟ۦۤ r0 = r1.f23240
                r0.m7065(r2)
                return
        }

        public void setStrokeWidth(float r1) {
                r0 = this;
                r0.f23241 = r1
                return
        }

        public void setTrimPathEnd(float r1) {
                r0 = this;
                r0.f23246 = r1
                return
        }

        public void setTrimPathOffset(float r1) {
                r0 = this;
                r0.f23247 = r1
                return
        }

        public void setTrimPathStart(float r1) {
                r0 = this;
                r0.f23245 = r1
                return
        }

        @Override // Yue.C6660.AbstractC6665
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean mo25654() {
                r1 = this;
                Yue.ۥ۟ۦۤ r0 = r1.f23242
                boolean r0 = r0.m7063()
                if (r0 != 0) goto L13
                Yue.ۥ۟ۦۤ r0 = r1.f23240
                boolean r0 = r0.m7063()
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }

        @Override // Yue.C6660.AbstractC6665
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean mo25655(int[] r3) {
                r2 = this;
                Yue.ۥ۟ۦۤ r0 = r2.f23242
                boolean r0 = r0.m7064(r3)
                Yue.ۥ۟ۦۤ r1 = r2.f23240
                boolean r3 = r1.m7064(r3)
                r3 = r3 | r0
                return r3
        }

        @Override // Yue.C6660.AbstractC6666
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo25656(android.content.res.Resources.Theme r1) {
                r0 = this;
                return
        }

        @Override // Yue.C6660.AbstractC6666
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean mo25657() {
                r1 = this;
                int[] r0 = r1.f23239
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final android.graphics.Paint.Cap m25658(int r2, android.graphics.Paint.Cap r3) {
                r1 = this;
                if (r2 == 0) goto Lf
                r0 = 1
                if (r2 == r0) goto Lc
                r0 = 2
                if (r2 == r0) goto L9
                return r3
            L9:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.SQUARE
                return r2
            Lc:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.ROUND
                return r2
            Lf:
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final android.graphics.Paint.Join m25659(int r2, android.graphics.Paint.Join r3) {
                r1 = this;
                if (r2 == 0) goto Lf
                r0 = 1
                if (r2 == r0) goto Lc
                r0 = 2
                if (r2 == r0) goto L9
                return r3
            L9:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.BEVEL
                return r2
            Lc:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.ROUND
                return r2
            Lf:
                android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m25660(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = Yue.C0347.f785
                android.content.res.TypedArray r2 = Yue.C6478.m23906(r2, r4, r3, r0)
                r1.m25661(r2, r5, r4)
                r2.recycle()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m25661(android.content.res.TypedArray r8, org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources.Theme r10) {
                r7 = this;
                r0 = 0
                r7.f23239 = r0
                java.lang.String r0 = "pathData"
                boolean r0 = Yue.C6478.m23905(r9, r0)
                if (r0 != 0) goto Lc
                return
            Lc:
                r0 = 0
                java.lang.String r0 = r8.getString(r0)
                if (r0 == 0) goto L15
                r7.f23266 = r0
            L15:
                r0 = 2
                java.lang.String r0 = r8.getString(r0)
                if (r0 == 0) goto L22
                Yue.ۥۣۣۡۨ$ۥ۟[] r0 = Yue.C4710.m18707(r0)
                r7.f23265 = r0
            L22:
                r5 = 1
                r6 = 0
                java.lang.String r4 = "fillColor"
                r1 = r8
                r2 = r9
                r3 = r10
                Yue.ۥ۟ۦۤ r0 = Yue.C6478.m23896(r1, r2, r3, r4, r5, r6)
                r7.f23242 = r0
                r0 = 12
                float r1 = r7.f23244
                java.lang.String r2 = "fillAlpha"
                float r0 = Yue.C6478.m23897(r8, r9, r2, r0, r1)
                r7.f23244 = r0
                java.lang.String r0 = "strokeLineCap"
                r1 = 8
                r2 = -1
                int r0 = Yue.C6478.m23898(r8, r9, r0, r1, r2)
                android.graphics.Paint$Cap r1 = r7.f23248
                android.graphics.Paint$Cap r0 = r7.m25658(r0, r1)
                r7.f23248 = r0
                java.lang.String r0 = "strokeLineJoin"
                r1 = 9
                int r0 = Yue.C6478.m23898(r8, r9, r0, r1, r2)
                android.graphics.Paint$Join r1 = r7.f23249
                android.graphics.Paint$Join r0 = r7.m25659(r0, r1)
                r7.f23249 = r0
                r0 = 10
                float r1 = r7.f23250
                java.lang.String r2 = "strokeMiterLimit"
                float r0 = Yue.C6478.m23897(r8, r9, r2, r0, r1)
                r7.f23250 = r0
                r5 = 3
                java.lang.String r4 = "strokeColor"
                r1 = r8
                r2 = r9
                Yue.ۥ۟ۦۤ r10 = Yue.C6478.m23896(r1, r2, r3, r4, r5, r6)
                r7.f23240 = r10
                r10 = 11
                float r0 = r7.f23243
                java.lang.String r1 = "strokeAlpha"
                float r10 = Yue.C6478.m23897(r8, r9, r1, r10, r0)
                r7.f23243 = r10
                r10 = 4
                float r0 = r7.f23241
                java.lang.String r1 = "strokeWidth"
                float r10 = Yue.C6478.m23897(r8, r9, r1, r10, r0)
                r7.f23241 = r10
                r10 = 6
                float r0 = r7.f23246
                java.lang.String r1 = "trimPathEnd"
                float r10 = Yue.C6478.m23897(r8, r9, r1, r10, r0)
                r7.f23246 = r10
                r10 = 7
                float r0 = r7.f23247
                java.lang.String r1 = "trimPathOffset"
                float r10 = Yue.C6478.m23897(r8, r9, r1, r10, r0)
                r7.f23247 = r10
                r10 = 5
                float r0 = r7.f23245
                java.lang.String r1 = "trimPathStart"
                float r10 = Yue.C6478.m23897(r8, r9, r1, r10, r0)
                r7.f23245 = r10
                r10 = 13
                int r0 = r7.f23267
                java.lang.String r1 = "fillType"
                int r8 = Yue.C6478.m23898(r8, r9, r1, r10, r0)
                r7.f23267 = r8
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C6664 extends Yue.C6660.AbstractC6665 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.graphics.Matrix f23251;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.ArrayList<Yue.C6660.AbstractC6665> f23252;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f23253;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f23254;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f23255;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float f23256;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public float f23257;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public float f23258;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float f23259;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final android.graphics.Matrix f23260;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f23261;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int[] f23262;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public java.lang.String f23263;

        public C6664() {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.f23251 = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3.f23252 = r1
                r1 = 0
                r3.f23253 = r1
                r3.f23254 = r1
                r3.f23255 = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r3.f23256 = r2
                r3.f23257 = r2
                r3.f23258 = r1
                r3.f23259 = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.f23260 = r1
                r3.f23263 = r0
                return
        }

        public C6664(Yue.C6660.C6664 r5, Yue.C0573<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.f23251 = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r4.f23252 = r1
                r1 = 0
                r4.f23253 = r1
                r4.f23254 = r1
                r4.f23255 = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r4.f23256 = r2
                r4.f23257 = r2
                r4.f23258 = r1
                r4.f23259 = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.f23260 = r1
                r4.f23263 = r0
                float r0 = r5.f23253
                r4.f23253 = r0
                float r0 = r5.f23254
                r4.f23254 = r0
                float r0 = r5.f23255
                r4.f23255 = r0
                float r0 = r5.f23256
                r4.f23256 = r0
                float r0 = r5.f23257
                r4.f23257 = r0
                float r0 = r5.f23258
                r4.f23258 = r0
                float r0 = r5.f23259
                r4.f23259 = r0
                int[] r0 = r5.f23262
                r4.f23262 = r0
                java.lang.String r0 = r5.f23263
                r4.f23263 = r0
                int r2 = r5.f23261
                r4.f23261 = r2
                if (r0 == 0) goto L59
                r6.put(r0, r4)
            L59:
                android.graphics.Matrix r0 = r5.f23260
                r1.set(r0)
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r5 = r5.f23252
                r0 = 0
            L61:
                int r1 = r5.size()
                if (r0 >= r1) goto Laa
                java.lang.Object r1 = r5.get(r0)
                boolean r2 = r1 instanceof Yue.C6660.C6664
                if (r2 == 0) goto L7c
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r1 = (Yue.C6660.C6664) r1
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r2 = r4.f23252
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r3 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟
                r3.<init>(r1, r6)
                r2.add(r3)
                goto L9f
            L7c:
                boolean r2 = r1 instanceof Yue.C6660.C6663
                if (r2 == 0) goto L88
                Yue.ۥۣۢۥۣ$ۥ۟۟ r2 = new Yue.ۥۣۢۥۣ$ۥ۟۟
                Yue.ۥۣۢۥۣ$ۥ۟۟ r1 = (Yue.C6660.C6663) r1
                r2.<init>(r1)
                goto L93
            L88:
                boolean r2 = r1 instanceof Yue.C6660.C6662
                if (r2 == 0) goto La2
                Yue.ۥۣۢۥۣ$ۥ۟ r2 = new Yue.ۥۣۢۥۣ$ۥ۟
                Yue.ۥۣۢۥۣ$ۥ۟ r1 = (Yue.C6660.C6662) r1
                r2.<init>(r1)
            L93:
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r1 = r4.f23252
                r1.add(r2)
                java.lang.String r1 = r2.f23266
                if (r1 == 0) goto L9f
                r6.put(r1, r2)
            L9f:
                int r0 = r0 + 1
                goto L61
            La2:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Unknown object in the tree!"
                r5.<init>(r6)
                throw r5
            Laa:
                return
        }

        public java.lang.String getGroupName() {
                r1 = this;
                java.lang.String r0 = r1.f23263
                return r0
        }

        public android.graphics.Matrix getLocalMatrix() {
                r1 = this;
                android.graphics.Matrix r0 = r1.f23260
                return r0
        }

        public float getPivotX() {
                r1 = this;
                float r0 = r1.f23254
                return r0
        }

        public float getPivotY() {
                r1 = this;
                float r0 = r1.f23255
                return r0
        }

        public float getRotation() {
                r1 = this;
                float r0 = r1.f23253
                return r0
        }

        public float getScaleX() {
                r1 = this;
                float r0 = r1.f23256
                return r0
        }

        public float getScaleY() {
                r1 = this;
                float r0 = r1.f23257
                return r0
        }

        public float getTranslateX() {
                r1 = this;
                float r0 = r1.f23258
                return r0
        }

        public float getTranslateY() {
                r1 = this;
                float r0 = r1.f23259
                return r0
        }

        public void setPivotX(float r2) {
                r1 = this;
                float r0 = r1.f23254
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f23254 = r2
                r1.m25663()
            Lb:
                return
        }

        public void setPivotY(float r2) {
                r1 = this;
                float r0 = r1.f23255
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f23255 = r2
                r1.m25663()
            Lb:
                return
        }

        public void setRotation(float r2) {
                r1 = this;
                float r0 = r1.f23253
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f23253 = r2
                r1.m25663()
            Lb:
                return
        }

        public void setScaleX(float r2) {
                r1 = this;
                float r0 = r1.f23256
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f23256 = r2
                r1.m25663()
            Lb:
                return
        }

        public void setScaleY(float r2) {
                r1 = this;
                float r0 = r1.f23257
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f23257 = r2
                r1.m25663()
            Lb:
                return
        }

        public void setTranslateX(float r2) {
                r1 = this;
                float r0 = r1.f23258
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f23258 = r2
                r1.m25663()
            Lb:
                return
        }

        public void setTranslateY(float r2) {
                r1 = this;
                float r0 = r1.f23259
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f23259 = r2
                r1.m25663()
            Lb:
                return
        }

        @Override // Yue.C6660.AbstractC6665
        /* JADX INFO: renamed from: ۥ */
        public boolean mo25654() {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r2 = r3.f23252
                int r2 = r2.size()
                if (r1 >= r2) goto L1d
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r2 = r3.f23252
                java.lang.Object r2 = r2.get(r1)
                Yue.ۥۣۢۥۣ$ۥ۟۟۟۟ r2 = (Yue.C6660.AbstractC6665) r2
                boolean r2 = r2.mo25654()
                if (r2 == 0) goto L1a
                r0 = 1
                return r0
            L1a:
                int r1 = r1 + 1
                goto L2
            L1d:
                return r0
        }

        @Override // Yue.C6660.AbstractC6665
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo25655(int[] r4) {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r2 = r3.f23252
                int r2 = r2.size()
                if (r0 >= r2) goto L1a
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r2 = r3.f23252
                java.lang.Object r2 = r2.get(r0)
                Yue.ۥۣۢۥۣ$ۥ۟۟۟۟ r2 = (Yue.C6660.AbstractC6665) r2
                boolean r2 = r2.mo25655(r4)
                r1 = r1 | r2
                int r0 = r0 + 1
                goto L2
            L1a:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m25662(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = Yue.C0347.f776
                android.content.res.TypedArray r2 = Yue.C6478.m23906(r2, r4, r3, r0)
                r1.m25664(r2, r5)
                r2.recycle()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m25663() {
                r4 = this;
                android.graphics.Matrix r0 = r4.f23260
                r0.reset()
                android.graphics.Matrix r0 = r4.f23260
                float r1 = r4.f23254
                float r1 = -r1
                float r2 = r4.f23255
                float r2 = -r2
                r0.postTranslate(r1, r2)
                android.graphics.Matrix r0 = r4.f23260
                float r1 = r4.f23256
                float r2 = r4.f23257
                r0.postScale(r1, r2)
                android.graphics.Matrix r0 = r4.f23260
                float r1 = r4.f23253
                r2 = 0
                r0.postRotate(r1, r2, r2)
                android.graphics.Matrix r0 = r4.f23260
                float r1 = r4.f23258
                float r2 = r4.f23254
                float r1 = r1 + r2
                float r2 = r4.f23259
                float r3 = r4.f23255
                float r2 = r2 + r3
                r0.postTranslate(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m25664(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5) {
                r3 = this;
                r0 = 0
                r3.f23262 = r0
                r0 = 5
                float r1 = r3.f23253
                java.lang.String r2 = "rotation"
                float r0 = Yue.C6478.m23897(r4, r5, r2, r0, r1)
                r3.f23253 = r0
                r0 = 1
                float r1 = r3.f23254
                float r0 = r4.getFloat(r0, r1)
                r3.f23254 = r0
                r0 = 2
                float r1 = r3.f23255
                float r0 = r4.getFloat(r0, r1)
                r3.f23255 = r0
                r0 = 3
                float r1 = r3.f23256
                java.lang.String r2 = "scaleX"
                float r0 = Yue.C6478.m23897(r4, r5, r2, r0, r1)
                r3.f23256 = r0
                r0 = 4
                float r1 = r3.f23257
                java.lang.String r2 = "scaleY"
                float r0 = Yue.C6478.m23897(r4, r5, r2, r0, r1)
                r3.f23257 = r0
                r0 = 6
                float r1 = r3.f23258
                java.lang.String r2 = "translateX"
                float r0 = Yue.C6478.m23897(r4, r5, r2, r0, r1)
                r3.f23258 = r0
                r0 = 7
                float r1 = r3.f23259
                java.lang.String r2 = "translateY"
                float r5 = Yue.C6478.m23897(r4, r5, r2, r0, r1)
                r3.f23259 = r5
                r5 = 0
                java.lang.String r4 = r4.getString(r5)
                if (r4 == 0) goto L55
                r3.f23263 = r4
            L55:
                r3.m25663()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC6665 {
        public AbstractC6665() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AbstractC6665(Yue.C6660.C6661 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean mo25654() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo25655(int[] r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC6666 extends Yue.C6660.AbstractC6665 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f23264 = 0;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C4710.C4712[] f23265;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.String f23266;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f23267;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f23268;

        public AbstractC6666() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f23265 = r0
                r0 = 0
                r1.f23267 = r0
                return
        }

        public AbstractC6666(Yue.C6660.AbstractC6666 r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f23265 = r0
                r0 = 0
                r1.f23267 = r0
                java.lang.String r0 = r2.f23266
                r1.f23266 = r0
                int r0 = r2.f23268
                r1.f23268 = r0
                Yue.ۥۣۣۡۨ$ۥ۟[] r2 = r2.f23265
                Yue.ۥۣۣۡۨ$ۥ۟[] r2 = Yue.C4710.m18709(r2)
                r1.f23265 = r2
                return
        }

        public Yue.C4710.C4712[] getPathData() {
                r1 = this;
                Yue.ۥۣۣۡۨ$ۥ۟[] r0 = r1.f23265
                return r0
        }

        public java.lang.String getPathName() {
                r1 = this;
                java.lang.String r0 = r1.f23266
                return r0
        }

        public void setPathData(Yue.C4710.C4712[] r2) {
                r1 = this;
                Yue.ۥۣۣۡۨ$ۥ۟[] r0 = r1.f23265
                boolean r0 = Yue.C4710.m18705(r0, r2)
                if (r0 != 0) goto Lf
                Yue.ۥۣۣۡۨ$ۥ۟[] r2 = Yue.C4710.m18709(r2)
                r1.f23265 = r2
                goto L14
            Lf:
                Yue.ۥۣۣۡۨ$ۥ۟[] r0 = r1.f23265
                Yue.C4710.m18716(r0, r2)
            L14:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo25656(android.content.res.Resources.Theme r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo25657() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo25652() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public java.lang.String m25665(Yue.C4710.C4712[] r7) {
                r6 = this;
                java.lang.String r0 = " "
                r1 = 0
                r2 = r1
            L4:
                int r3 = r7.length
                if (r2 >= r3) goto L43
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r0 = r7[r2]
                char r0 = r0.f14946
                r3.append(r0)
                java.lang.String r0 = ":"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r3 = r7[r2]
                float[] r3 = r3.f14947
                r4 = r1
            L24:
                int r5 = r3.length
                if (r4 >= r5) goto L40
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                r0 = r3[r4]
                r5.append(r0)
                java.lang.String r0 = ","
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                int r4 = r4 + 1
                goto L24
            L40:
                int r2 = r2 + 1
                goto L4
            L43:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m25666(int r4) {
                r3 = this;
                java.lang.String r0 = ""
                r1 = 0
            L3:
                if (r1 >= r4) goto L19
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = "    "
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                int r1 = r1 + 1
                goto L3
            L19:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                java.lang.String r0 = "current path is :"
                r4.append(r0)
                java.lang.String r0 = r3.f23266
                r4.append(r0)
                java.lang.String r0 = " pathData is "
                r4.append(r0)
                Yue.ۥۣۣۡۨ$ۥ۟[] r0 = r3.f23265
                java.lang.String r0 = r3.m25665(r0)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r0 = "VectorDrawableCompat"
                android.util.Log.v(r0, r4)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m25667(android.graphics.Path r2) {
                r1 = this;
                r2.reset()
                Yue.ۥۣۣۡۨ$ۥ۟[] r0 = r1.f23265
                if (r0 == 0) goto La
                Yue.C4710.C4712.m18724(r0, r2)
            La:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C6667 {

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final android.graphics.Matrix f23269 = null;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.graphics.Path f23270;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.graphics.Path f23271;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.graphics.Matrix f23272;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.graphics.Paint f23273;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.graphics.Paint f23274;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public android.graphics.PathMeasure f23275;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f23276;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Yue.C6660.C6664 f23277;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float f23278;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public float f23279;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public float f23280;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public float f23281;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f23282;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public java.lang.String f23283;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public java.lang.Boolean f23284;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final Yue.C0573<java.lang.String, java.lang.Object> f23285;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                Yue.C6660.C6667.f23269 = r0
                return
        }

        public C6667() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.f23272 = r0
                r0 = 0
                r1.f23278 = r0
                r1.f23279 = r0
                r1.f23280 = r0
                r1.f23281 = r0
                r0 = 255(0xff, float:3.57E-43)
                r1.f23282 = r0
                r0 = 0
                r1.f23283 = r0
                r1.f23284 = r0
                Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
                r0.<init>()
                r1.f23285 = r0
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r0 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟
                r0.<init>()
                r1.f23277 = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f23270 = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f23271 = r0
                return
        }

        public C6667(Yue.C6660.C6667 r4) {
                r3 = this;
                r3.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r3.f23272 = r0
                r0 = 0
                r3.f23278 = r0
                r3.f23279 = r0
                r3.f23280 = r0
                r3.f23281 = r0
                r0 = 255(0xff, float:3.57E-43)
                r3.f23282 = r0
                r0 = 0
                r3.f23283 = r0
                r3.f23284 = r0
                Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
                r0.<init>()
                r3.f23285 = r0
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r1 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r2 = r4.f23277
                r1.<init>(r2, r0)
                r3.f23277 = r1
                android.graphics.Path r1 = new android.graphics.Path
                android.graphics.Path r2 = r4.f23270
                r1.<init>(r2)
                r3.f23270 = r1
                android.graphics.Path r1 = new android.graphics.Path
                android.graphics.Path r2 = r4.f23271
                r1.<init>(r2)
                r3.f23271 = r1
                float r1 = r4.f23278
                r3.f23278 = r1
                float r1 = r4.f23279
                r3.f23279 = r1
                float r1 = r4.f23280
                r3.f23280 = r1
                float r1 = r4.f23281
                r3.f23281 = r1
                int r1 = r4.f23276
                r3.f23276 = r1
                int r1 = r4.f23282
                r3.f23282 = r1
                java.lang.String r1 = r4.f23283
                r3.f23283 = r1
                java.lang.String r1 = r4.f23283
                if (r1 == 0) goto L61
                r0.put(r1, r3)
            L61:
                java.lang.Boolean r4 = r4.f23284
                r3.f23284 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m25668(float r0, float r1, float r2, float r3) {
                float r0 = r0 * r3
                float r1 = r1 * r2
                float r0 = r0 - r1
                return r0
        }

        public float getAlpha() {
                r2 = this;
                int r0 = r2.getRootAlpha()
                float r0 = (float) r0
                r1 = 1132396544(0x437f0000, float:255.0)
                float r0 = r0 / r1
                return r0
        }

        public int getRootAlpha() {
                r1 = this;
                int r0 = r1.f23282
                return r0
        }

        public void setAlpha(float r2) {
                r1 = this;
                r0 = 1132396544(0x437f0000, float:255.0)
                float r2 = r2 * r0
                int r2 = (int) r2
                r1.setRootAlpha(r2)
                return
        }

        public void setRootAlpha(int r1) {
                r0 = this;
                r0.f23282 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m25669(android.graphics.Canvas r8, int r9, int r10, android.graphics.ColorFilter r11) {
                r7 = this;
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r1 = r7.f23277
                android.graphics.Matrix r2 = Yue.C6660.C6667.f23269
                r0 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r6 = r11
                r0.m25670(r1, r2, r3, r4, r5, r6)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m25670(Yue.C6660.C6664 r10, android.graphics.Matrix r11, android.graphics.Canvas r12, int r13, int r14, android.graphics.ColorFilter r15) {
                r9 = this;
                android.graphics.Matrix r0 = r10.f23251
                r0.set(r11)
                android.graphics.Matrix r11 = r10.f23251
                android.graphics.Matrix r0 = r10.f23260
                r11.preConcat(r0)
                r12.save()
                r11 = 0
            L10:
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r0 = r10.f23252
                int r0 = r0.size()
                if (r11 >= r0) goto L45
                java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r0 = r10.f23252
                java.lang.Object r0 = r0.get(r11)
                Yue.ۥۣۢۥۣ$ۥ۟۟۟۟ r0 = (Yue.C6660.AbstractC6665) r0
                boolean r1 = r0 instanceof Yue.C6660.C6664
                if (r1 == 0) goto L32
                r3 = r0
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r3 = (Yue.C6660.C6664) r3
                android.graphics.Matrix r4 = r10.f23251
                r2 = r9
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r2.m25670(r3, r4, r5, r6, r7, r8)
                goto L42
            L32:
                boolean r1 = r0 instanceof Yue.C6660.AbstractC6666
                if (r1 == 0) goto L42
                r4 = r0
                Yue.ۥۣۢۥۣ$ۥ۟۟۟۠ r4 = (Yue.C6660.AbstractC6666) r4
                r2 = r9
                r3 = r10
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r2.m25671(r3, r4, r5, r6, r7, r8)
            L42:
                int r11 = r11 + 1
                goto L10
            L45:
                r12.restore()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m25671(Yue.C6660.C6664 r8, Yue.C6660.AbstractC6666 r9, android.graphics.Canvas r10, int r11, int r12, android.graphics.ColorFilter r13) {
                r7 = this;
                float r11 = (float) r11
                float r0 = r7.f23280
                float r11 = r11 / r0
                float r12 = (float) r12
                float r0 = r7.f23281
                float r12 = r12 / r0
                float r0 = java.lang.Math.min(r11, r12)
                android.graphics.Matrix r8 = r8.f23251
                android.graphics.Matrix r1 = r7.f23272
                r1.set(r8)
                android.graphics.Matrix r1 = r7.f23272
                r1.postScale(r11, r12)
                float r8 = r7.m25672(r8)
                r11 = 0
                int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r12 != 0) goto L22
                return
            L22:
                android.graphics.Path r12 = r7.f23270
                r9.m25667(r12)
                android.graphics.Path r12 = r7.f23270
                android.graphics.Path r1 = r7.f23271
                r1.reset()
                boolean r1 = r9.mo25652()
                if (r1 == 0) goto L50
                android.graphics.Path r8 = r7.f23271
                int r9 = r9.f23267
                if (r9 != 0) goto L3d
                android.graphics.Path$FillType r9 = android.graphics.Path.FillType.WINDING
                goto L3f
            L3d:
                android.graphics.Path$FillType r9 = android.graphics.Path.FillType.EVEN_ODD
            L3f:
                r8.setFillType(r9)
                android.graphics.Path r8 = r7.f23271
                android.graphics.Matrix r9 = r7.f23272
                r8.addPath(r12, r9)
                android.graphics.Path r8 = r7.f23271
                r10.clipPath(r8)
                goto L17a
            L50:
                Yue.ۥۣۢۥۣ$ۥ۟۟ r9 = (Yue.C6660.C6663) r9
                float r1 = r9.f23245
                int r2 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = 1
                if (r2 != 0) goto L61
                float r2 = r9.f23246
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L9e
            L61:
                float r2 = r9.f23247
                float r1 = r1 + r2
                float r1 = r1 % r3
                float r5 = r9.f23246
                float r5 = r5 + r2
                float r5 = r5 % r3
                android.graphics.PathMeasure r2 = r7.f23275
                if (r2 != 0) goto L74
                android.graphics.PathMeasure r2 = new android.graphics.PathMeasure
                r2.<init>()
                r7.f23275 = r2
            L74:
                android.graphics.PathMeasure r2 = r7.f23275
                android.graphics.Path r3 = r7.f23270
                r6 = 0
                r2.setPath(r3, r6)
                android.graphics.PathMeasure r2 = r7.f23275
                float r2 = r2.getLength()
                float r1 = r1 * r2
                float r5 = r5 * r2
                r12.reset()
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 <= 0) goto L96
                android.graphics.PathMeasure r3 = r7.f23275
                r3.getSegment(r1, r2, r12, r4)
                android.graphics.PathMeasure r1 = r7.f23275
                r1.getSegment(r11, r5, r12, r4)
                goto L9b
            L96:
                android.graphics.PathMeasure r2 = r7.f23275
                r2.getSegment(r1, r5, r12, r4)
            L9b:
                r12.rLineTo(r11, r11)
            L9e:
                android.graphics.Path r11 = r7.f23271
                android.graphics.Matrix r1 = r7.f23272
                r11.addPath(r12, r1)
                Yue.ۥ۟ۦۤ r11 = r9.f23242
                boolean r11 = r11.m7066()
                r12 = 255(0xff, float:3.57E-43)
                r1 = 0
                r2 = 1132396544(0x437f0000, float:255.0)
                if (r11 == 0) goto L10c
                Yue.ۥ۟ۦۤ r11 = r9.f23242
                android.graphics.Paint r3 = r7.f23274
                if (r3 != 0) goto Lc4
                android.graphics.Paint r3 = new android.graphics.Paint
                r3.<init>(r4)
                r7.f23274 = r3
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
                r3.setStyle(r5)
            Lc4:
                android.graphics.Paint r3 = r7.f23274
                boolean r5 = r11.m7062()
                if (r5 == 0) goto Le3
                android.graphics.Shader r11 = r11.m7061()
                android.graphics.Matrix r5 = r7.f23272
                r11.setLocalMatrix(r5)
                r3.setShader(r11)
                float r11 = r9.f23244
                float r11 = r11 * r2
                int r11 = java.lang.Math.round(r11)
                r3.setAlpha(r11)
                goto Lf6
            Le3:
                r3.setShader(r1)
                r3.setAlpha(r12)
                int r11 = r11.m7060()
                float r5 = r9.f23244
                int r11 = Yue.C6660.m25639(r11, r5)
                r3.setColor(r11)
            Lf6:
                r3.setColorFilter(r13)
                android.graphics.Path r11 = r7.f23271
                int r5 = r9.f23267
                if (r5 != 0) goto L102
                android.graphics.Path$FillType r5 = android.graphics.Path.FillType.WINDING
                goto L104
            L102:
                android.graphics.Path$FillType r5 = android.graphics.Path.FillType.EVEN_ODD
            L104:
                r11.setFillType(r5)
                android.graphics.Path r11 = r7.f23271
                r10.drawPath(r11, r3)
            L10c:
                Yue.ۥ۟ۦۤ r11 = r9.f23240
                boolean r11 = r11.m7066()
                if (r11 == 0) goto L17a
                Yue.ۥ۟ۦۤ r11 = r9.f23240
                android.graphics.Paint r3 = r7.f23273
                if (r3 != 0) goto L126
                android.graphics.Paint r3 = new android.graphics.Paint
                r3.<init>(r4)
                r7.f23273 = r3
                android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
                r3.setStyle(r4)
            L126:
                android.graphics.Paint r3 = r7.f23273
                android.graphics.Paint$Join r4 = r9.f23249
                if (r4 == 0) goto L12f
                r3.setStrokeJoin(r4)
            L12f:
                android.graphics.Paint$Cap r4 = r9.f23248
                if (r4 == 0) goto L136
                r3.setStrokeCap(r4)
            L136:
                float r4 = r9.f23250
                r3.setStrokeMiter(r4)
                boolean r4 = r11.m7062()
                if (r4 == 0) goto L158
                android.graphics.Shader r11 = r11.m7061()
                android.graphics.Matrix r12 = r7.f23272
                r11.setLocalMatrix(r12)
                r3.setShader(r11)
                float r11 = r9.f23243
                float r11 = r11 * r2
                int r11 = java.lang.Math.round(r11)
                r3.setAlpha(r11)
                goto L16b
            L158:
                r3.setShader(r1)
                r3.setAlpha(r12)
                int r11 = r11.m7060()
                float r12 = r9.f23243
                int r11 = Yue.C6660.m25639(r11, r12)
                r3.setColor(r11)
            L16b:
                r3.setColorFilter(r13)
                float r0 = r0 * r8
                float r8 = r9.f23241
                float r8 = r8 * r0
                r3.setStrokeWidth(r8)
                android.graphics.Path r8 = r7.f23271
                r10.drawPath(r8, r3)
            L17a:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final float m25672(android.graphics.Matrix r11) {
                r10 = this;
                r0 = 0
                r1 = 4
                float[] r1 = new float[r1]
                r1 = {x0040: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 0} // fill-array
                r11.mapVectors(r1)
                r11 = 0
                r2 = r1[r11]
                double r2 = (double) r2
                r4 = 1
                r5 = r1[r4]
                double r5 = (double) r5
                double r2 = java.lang.Math.hypot(r2, r5)
                float r2 = (float) r2
                r3 = 2
                r5 = r1[r3]
                double r5 = (double) r5
                r7 = 3
                r8 = r1[r7]
                double r8 = (double) r8
                double r5 = java.lang.Math.hypot(r5, r8)
                float r5 = (float) r5
                r11 = r1[r11]
                r4 = r1[r4]
                r3 = r1[r3]
                r1 = r1[r7]
                float r11 = m25668(r11, r4, r3, r1)
                float r1 = java.lang.Math.max(r2, r5)
                int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r2 <= 0) goto L3e
                float r11 = java.lang.Math.abs(r11)
                float r0 = r11 / r1
            L3e:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m25673() {
                r1 = this;
                java.lang.Boolean r0 = r1.f23284
                if (r0 != 0) goto L10
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r0 = r1.f23277
                boolean r0 = r0.mo25654()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.f23284 = r0
            L10:
                java.lang.Boolean r0 = r1.f23284
                boolean r0 = r0.booleanValue()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m25674(int[] r2) {
                r1 = this;
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ r0 = r1.f23277
                boolean r2 = r0.mo25655(r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C6668 extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f23286;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C6660.C6667 f23287;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.content.res.ColorStateList f23288;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.graphics.PorterDuff.Mode f23289;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f23290;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public android.graphics.Bitmap f23291;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int[] f23292;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public android.content.res.ColorStateList f23293;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public android.graphics.PorterDuff.Mode f23294;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f23295;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean f23296;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f23297;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public android.graphics.Paint f23298;

        public C6668() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f23288 = r0
                android.graphics.PorterDuff$Mode r0 = Yue.C6660.f23217
                r1.f23289 = r0
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ
                r0.<init>()
                r1.f23287 = r0
                return
        }

        public C6668(Yue.C6660.C6668 r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f23288 = r0
                android.graphics.PorterDuff$Mode r0 = Yue.C6660.f23217
                r3.f23289 = r0
                if (r4 == 0) goto L49
                int r0 = r4.f23286
                r3.f23286 = r0
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r1 = r4.f23287
                r0.<init>(r1)
                r3.f23287 = r0
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r1 = r4.f23287
                android.graphics.Paint r1 = r1.f23274
                if (r1 == 0) goto L2a
                android.graphics.Paint r1 = new android.graphics.Paint
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r2 = r4.f23287
                android.graphics.Paint r2 = r2.f23274
                r1.<init>(r2)
                r0.f23274 = r1
            L2a:
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r4.f23287
                android.graphics.Paint r0 = r0.f23273
                if (r0 == 0) goto L3d
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r3.f23287
                android.graphics.Paint r1 = new android.graphics.Paint
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r2 = r4.f23287
                android.graphics.Paint r2 = r2.f23273
                r1.<init>(r2)
                r0.f23273 = r1
            L3d:
                android.content.res.ColorStateList r0 = r4.f23288
                r3.f23288 = r0
                android.graphics.PorterDuff$Mode r0 = r4.f23289
                r3.f23289 = r0
                boolean r4 = r4.f23290
                r3.f23290 = r4
            L49:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.f23286
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC4410
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                Yue.ۥۣۢۥۣ r0 = new Yue.ۥۣۢۥۣ
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC4410
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                Yue.ۥۣۢۥۣ r1 = new Yue.ۥۣۢۥۣ
                r1.<init>(r0)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m25675(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f23291
                int r0 = r0.getWidth()
                if (r2 != r0) goto L12
                android.graphics.Bitmap r2 = r1.f23291
                int r2 = r2.getHeight()
                if (r3 != r2) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m25676() {
                r2 = this;
                boolean r0 = r2.f23297
                if (r0 != 0) goto L22
                android.content.res.ColorStateList r0 = r2.f23293
                android.content.res.ColorStateList r1 = r2.f23288
                if (r0 != r1) goto L22
                android.graphics.PorterDuff$Mode r0 = r2.f23294
                android.graphics.PorterDuff$Mode r1 = r2.f23289
                if (r0 != r1) goto L22
                boolean r0 = r2.f23296
                boolean r1 = r2.f23290
                if (r0 != r1) goto L22
                int r0 = r2.f23295
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r1 = r2.f23287
                int r1 = r1.getRootAlpha()
                if (r0 != r1) goto L22
                r0 = 1
                return r0
            L22:
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m25677(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.f23291
                if (r0 == 0) goto La
                boolean r0 = r1.m25675(r2, r3)
                if (r0 != 0) goto L15
            La:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
                r1.f23291 = r2
                r2 = 1
                r1.f23297 = r2
            L15:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m25678(android.graphics.Canvas r3, android.graphics.ColorFilter r4, android.graphics.Rect r5) {
                r2 = this;
                android.graphics.Paint r4 = r2.m25679(r4)
                android.graphics.Bitmap r0 = r2.f23291
                r1 = 0
                r3.drawBitmap(r0, r1, r5, r4)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.graphics.Paint m25679(android.graphics.ColorFilter r3) {
                r2 = this;
                boolean r0 = r2.m25680()
                if (r0 != 0) goto La
                if (r3 != 0) goto La
                r3 = 0
                return r3
            La:
                android.graphics.Paint r0 = r2.f23298
                if (r0 != 0) goto L19
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r2.f23298 = r0
                r1 = 1
                r0.setFilterBitmap(r1)
            L19:
                android.graphics.Paint r0 = r2.f23298
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r1 = r2.f23287
                int r1 = r1.getRootAlpha()
                r0.setAlpha(r1)
                android.graphics.Paint r0 = r2.f23298
                r0.setColorFilter(r3)
                android.graphics.Paint r3 = r2.f23298
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m25680() {
                r2 = this;
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r2.f23287
                int r0 = r0.getRootAlpha()
                r1 = 255(0xff, float:3.57E-43)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m25681() {
                r1 = this;
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r1.f23287
                boolean r0 = r0.m25673()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean m25682(int[] r2) {
                r1 = this;
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r1.f23287
                boolean r2 = r0.m25674(r2)
                boolean r0 = r1.f23297
                r0 = r0 | r2
                r1.f23297 = r0
                return r2
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m25683() {
                r1 = this;
                android.content.res.ColorStateList r0 = r1.f23288
                r1.f23293 = r0
                android.graphics.PorterDuff$Mode r0 = r1.f23289
                r1.f23294 = r0
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r1.f23287
                int r0 = r0.getRootAlpha()
                r1.f23295 = r0
                boolean r0 = r1.f23290
                r1.f23296 = r0
                r0 = 0
                r1.f23297 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m25684(int r4, int r5) {
                r3 = this;
                android.graphics.Bitmap r0 = r3.f23291
                r1 = 0
                r0.eraseColor(r1)
                android.graphics.Canvas r0 = new android.graphics.Canvas
                android.graphics.Bitmap r1 = r3.f23291
                r0.<init>(r1)
                Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r1 = r3.f23287
                r2 = 0
                r1.m25669(r0, r4, r5, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C6669 extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.graphics.drawable.Drawable.ConstantState f23299;

        public C6669(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f23299 = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f23299
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f23299
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                Yue.ۥۣۢۥۣ r0 = new Yue.ۥۣۢۥۣ
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f23299
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.f23215 = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                Yue.ۥۣۢۥۣ r0 = new Yue.ۥۣۢۥۣ
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f23299
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.f23215 = r3
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                Yue.ۥۣۢۥۣ r0 = new Yue.ۥۣۢۥۣ
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f23299
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.f23215 = r3
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            Yue.C6660.f23217 = r0
            return
    }

    public C6660() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f23234 = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.f23236 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f23237 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f23238 = r0
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ
            r0.<init>()
            r1.f23230 = r0
            return
    }

    public C6660(@Yue.InterfaceC4410 Yue.C6660.C6668 r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f23234 = r0
            r0 = 9
            float[] r0 = new float[r0]
            r2.f23236 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f23237 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f23238 = r0
            r2.f23230 = r3
            android.graphics.PorterDuffColorFilter r0 = r2.f23231
            android.content.res.ColorStateList r1 = r3.f23288
            android.graphics.PorterDuff$Mode r3 = r3.f23289
            android.graphics.PorterDuffColorFilter r3 = r2.m25650(r0, r1, r3)
            r2.f23231 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m25639(int r2, float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            int r3 = r3 << 24
            r2 = r2 | r3
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C6660 m25640(@Yue.InterfaceC4410 android.content.res.Resources r1, @Yue.InterfaceC2004 int r2, @Yue.InterfaceC4544 android.content.res.Resources.Theme r3) {
            Yue.ۥۣۢۥۣ r0 = new Yue.ۥۣۢۥۣ
            r0.<init>()
            android.graphics.drawable.Drawable r1 = Yue.C5362.m20228(r1, r2, r3)
            r0.f23215 = r1
            Yue.ۥۣۢۥۣ$ۥۣ۟۟۟ r1 = new Yue.ۥۣۢۥۣ$ۥۣ۟۟۟
            android.graphics.drawable.Drawable r2 = r0.f23215
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            r0.f23235 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C6660 m25641(android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            Yue.ۥۣۢۥۣ r0 = new Yue.ۥۣۢۥۣ
            r0.<init>()
            r0.inflate(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.graphics.PorterDuff.Mode m25642(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            super.applyTheme(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L7
            Yue.C1995.m9219(r0)
        L7:
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
            r0 = this;
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.f23215
            if (r0 == 0) goto L8
            r0.draw(r10)
            return
        L8:
            android.graphics.Rect r0 = r9.f23238
            r9.copyBounds(r0)
            android.graphics.Rect r0 = r9.f23238
            int r0 = r0.width()
            if (r0 <= 0) goto Ld7
            android.graphics.Rect r0 = r9.f23238
            int r0 = r0.height()
            if (r0 > 0) goto L1f
            goto Ld7
        L1f:
            android.graphics.ColorFilter r0 = r9.f23232
            if (r0 != 0) goto L25
            android.graphics.PorterDuffColorFilter r0 = r9.f23231
        L25:
            android.graphics.Matrix r1 = r9.f23237
            r10.getMatrix(r1)
            android.graphics.Matrix r1 = r9.f23237
            float[] r2 = r9.f23236
            r1.getValues(r2)
            float[] r1 = r9.f23236
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r9.f23236
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r9.f23236
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r5 = r9.f23236
            r6 = 3
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L60
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 == 0) goto L62
        L60:
            r1 = r7
            r3 = r1
        L62:
            android.graphics.Rect r4 = r9.f23238
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r9.f23238
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto Ld7
            if (r3 > 0) goto L83
            goto Ld7
        L83:
            int r4 = r10.save()
            android.graphics.Rect r5 = r9.f23238
            int r8 = r5.left
            float r8 = (float) r8
            int r5 = r5.top
            float r5 = (float) r5
            r10.translate(r8, r5)
            boolean r5 = r9.m25646()
            if (r5 == 0) goto La7
            android.graphics.Rect r5 = r9.f23238
            int r5 = r5.width()
            float r5 = (float) r5
            r10.translate(r5, r6)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.scale(r5, r7)
        La7:
            android.graphics.Rect r5 = r9.f23238
            r5.offsetTo(r2, r2)
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r2 = r9.f23230
            r2.m25677(r1, r3)
            boolean r2 = r9.f23234
            if (r2 != 0) goto Lbb
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r2 = r9.f23230
            r2.m25684(r1, r3)
            goto Lcd
        Lbb:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r2 = r9.f23230
            boolean r2 = r2.m25676()
            if (r2 != 0) goto Lcd
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r2 = r9.f23230
            r2.m25684(r1, r3)
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r1 = r9.f23230
            r1.m25683()
        Lcd:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r1 = r9.f23230
            android.graphics.Rect r2 = r9.f23238
            r1.m25678(r10, r0, r2)
            r10.restoreToCount(r4)
        Ld7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            int r0 = Yue.C1995.m9221(r0)
            return r0
        L9:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r0.f23287
            int r0 = r0.getRootAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f23215
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super.getChangingConfigurations()
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r1 = r2.f23230
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = Yue.C1995.m9222(r0)
            return r0
        L9:
            android.graphics.ColorFilter r0 = r1.f23232
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f23215
            if (r0 == 0) goto L10
            Yue.ۥۣۢۥۣ$ۥۣ۟۟۟ r0 = new Yue.ۥۣۢۥۣ$ۥۣ۟۟۟
            android.graphics.drawable.Drawable r1 = r2.f23215
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r2.f23230
            int r1 = r2.getChangingConfigurations()
            r0.f23286 = r1
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r2.f23230
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicHeight()
            return r0
        L9:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r0.f23287
            float r0 = r0.f23279
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicWidth()
            return r0
        L9:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r0.f23287
            float r0 = r0.f23278
            int r0 = (int) r0
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
            r1 = this;
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
            r1 = this;
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            r0 = -3
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.getPadding(r1)
            return r1
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
            r1 = this;
            int[] r0 = super.getState()
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.inflate(r2, r3, r4)
            return
        L8:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r3, org.xmlpull.v1.XmlPullParser r4, android.util.AttributeSet r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9224(r0, r3, r4, r5, r6)
            return
        L8:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r2.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r1 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ
            r1.<init>()
            r0.f23287 = r1
            int[] r1 = Yue.C0347.f766
            android.content.res.TypedArray r1 = Yue.C6478.m23906(r3, r6, r5, r1)
            r2.m25649(r1, r4, r6)
            r1.recycle()
            int r1 = r2.getChangingConfigurations()
            r0.f23286 = r1
            r1 = 1
            r0.f23297 = r1
            r2.m25645(r3, r4, r5, r6)
            android.graphics.PorterDuffColorFilter r3 = r2.f23231
            android.content.res.ColorStateList r4 = r0.f23288
            android.graphics.PorterDuff$Mode r5 = r0.f23289
            android.graphics.PorterDuffColorFilter r3 = r2.m25650(r3, r4, r5)
            r2.f23231 = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.invalidateSelf()
            return
        L8:
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r0 = Yue.C1995.m9225(r0)
            return r0
        L9:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            boolean r0 = r0.f23290
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r0 = r0.isStateful()
            return r0
        L9:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L28
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            if (r0 == 0) goto L26
            boolean r0 = r0.m25681()
            if (r0 != 0) goto L28
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            android.content.res.ColorStateList r0 = r0.f23288
            if (r0 == 0) goto L26
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            return r0
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            r0 = this;
            super.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f23215
            if (r0 == 0) goto L8
            r0.mutate()
            return r2
        L8:
            boolean r0 = r2.f23233
            if (r0 != 0) goto L1e
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L1e
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r1 = r2.f23230
            r0.<init>(r1)
            r2.f23230 = r0
            r0 = 1
            r2.f23233 = r0
        L1e:
            return r2
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f23215
            if (r0 == 0) goto L9
            boolean r6 = r0.setState(r6)
            return r6
        L9:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r5.f23230
            android.content.res.ColorStateList r1 = r0.f23288
            r2 = 1
            if (r1 == 0) goto L21
            android.graphics.PorterDuff$Mode r3 = r0.f23289
            if (r3 == 0) goto L21
            android.graphics.PorterDuffColorFilter r4 = r5.f23231
            android.graphics.PorterDuffColorFilter r1 = r5.m25650(r4, r1, r3)
            r5.f23231 = r1
            r5.invalidateSelf()
            r1 = r2
            goto L22
        L21:
            r1 = 0
        L22:
            boolean r3 = r0.m25681()
            if (r3 == 0) goto L32
            boolean r6 = r0.m25682(r6)
            if (r6 == 0) goto L32
            r5.invalidateSelf()
            goto L33
        L32:
            r2 = r1
        L33:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.scheduleSelf(r2, r3)
            return
        L8:
            super.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r0.f23287
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L1c
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r0.f23287
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9227(r0, r2)
            return
        L8:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            r0.f23290 = r2
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
            r0 = this;
            super.setChangingConfigurations(r1)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = this;
            super.setColorFilter(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            r1.f23232 = r2
            r1.invalidateSelf()
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean r1) {
            r0 = this;
            super.setFilterBitmap(r1)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float r1, float r2) {
            r0 = this;
            super.setHotspot(r1, r2)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    @Override // Yue.AbstractC6659, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            return r1
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9231(r0, r2)
            return
        L8:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9232(r0, r3)
            return
        L8:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r2.f23230
            android.content.res.ColorStateList r1 = r0.f23288
            if (r1 == r3) goto L1d
            r0.f23288 = r3
            android.graphics.PorterDuffColorFilter r1 = r2.f23231
            android.graphics.PorterDuff$Mode r0 = r0.f23289
            android.graphics.PorterDuffColorFilter r3 = r2.m25650(r1, r3, r0)
            r2.f23231 = r3
            r2.invalidateSelf()
        L1d:
            return
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC6260
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f23215
            if (r0 == 0) goto L8
            Yue.C1995.m9233(r0, r3)
            return
        L8:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r2.f23230
            android.graphics.PorterDuff$Mode r1 = r0.f23289
            if (r1 == r3) goto L1d
            r0.f23289 = r3
            android.graphics.PorterDuffColorFilter r1 = r2.f23231
            android.content.res.ColorStateList r0 = r0.f23288
            android.graphics.PorterDuffColorFilter r3 = r2.m25650(r1, r0, r3)
            r2.f23231 = r3
            r2.invalidateSelf()
        L1d:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L9
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L9:
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f23215
            if (r0 == 0) goto L8
            r0.unscheduleSelf(r2)
            return
        L8:
            super.unscheduleSelf(r2)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m25643() {
            r6 = this;
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r6.f23230
            if (r0 == 0) goto L29
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r0.f23287
            if (r0 == 0) goto L29
            float r1 = r0.f23278
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 == 0) goto L29
            float r3 = r0.f23279
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            float r4 = r0.f23281
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 == 0) goto L29
            float r0 = r0.f23280
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L22
            goto L29
        L22:
            float r0 = r0 / r1
            float r4 = r4 / r3
            float r0 = java.lang.Math.min(r0, r4)
            return r0
        L29:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Object m25644(java.lang.String r2) {
            r1 = this;
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r1.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r0 = r0.f23287
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Object> r0 = r0.f23285
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m25645(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r10 = this;
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r10.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r1 = r0.f23287
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ r3 = r1.f23277
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = r5
        L19:
            if (r3 == r5) goto Lce
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L24
            if (r3 == r8) goto Lce
        L24:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto Lb9
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ r7 = (Yue.C6660.C6664) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L60
            Yue.ۥۣۢۥۣ$ۥ۟۟ r3 = new Yue.ۥۣۢۥۣ$ۥ۟۟
            r3.<init>()
            r3.m25660(r11, r13, r14, r12)
            java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r6 = r7.f23252
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L57
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Object> r6 = r1.f23285
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L57:
            int r6 = r0.f23286
            int r3 = r3.f23268
            r3 = r3 | r6
            r0.f23286 = r3
            r6 = 0
            goto Lc8
        L60:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L8c
            Yue.ۥۣۢۥۣ$ۥ۟ r3 = new Yue.ۥۣۢۥۣ$ۥ۟
            r3.<init>()
            r3.m25653(r11, r13, r14, r12)
            java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r7 = r7.f23252
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L84
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Object> r7 = r1.f23285
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L84:
            int r7 = r0.f23286
            int r3 = r3.f23268
            r3 = r3 | r7
            r0.f23286 = r3
            goto Lc8
        L8c:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto Lc8
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ r3 = new Yue.ۥۣۢۥۣ$ۥ۟۟۟
            r3.<init>()
            r3.m25662(r11, r13, r14, r12)
            java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r7 = r7.f23252
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto Lb1
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Object> r7 = r1.f23285
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        Lb1:
            int r7 = r0.f23286
            int r3 = r3.f23261
            r3 = r3 | r7
            r0.f23286 = r3
            goto Lc8
        Lb9:
            if (r3 != r8) goto Lc8
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto Lc8
            r2.pop()
        Lc8:
            int r3 = r12.next()
            goto L19
        Lce:
            if (r6 != 0) goto Ld1
            return
        Ld1:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m25646() {
            r2 = this;
            boolean r0 = r2.isAutoMirrored()
            if (r0 == 0) goto Le
            int r0 = Yue.C1995.m9223(r2)
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m25647(Yue.C6660.C6664 r5, int r6) {
            r4 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r6) goto L1a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "    "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r2 = r2 + 1
            goto L4
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = "current group is :"
            r2.append(r3)
            java.lang.String r3 = r5.getGroupName()
            r2.append(r3)
            java.lang.String r3 = " rotation is "
            r2.append(r3)
            float r3 = r5.f23253
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "VectorDrawableCompat"
            android.util.Log.v(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "matrix is :"
            r2.append(r0)
            android.graphics.Matrix r0 = r5.getLocalMatrix()
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.v(r3, r0)
        L60:
            java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r0 = r5.f23252
            int r0 = r0.size()
            if (r1 >= r0) goto L86
            java.util.ArrayList<Yue.ۥۣۢۥۣ$ۥ۟۟۟۟> r0 = r5.f23252
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۣۢۥۣ$ۥ۟۟۟۟ r0 = (Yue.C6660.AbstractC6665) r0
            boolean r2 = r0 instanceof Yue.C6660.C6664
            if (r2 == 0) goto L7c
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ r0 = (Yue.C6660.C6664) r0
            int r2 = r6 + 1
            r4.m25647(r0, r2)
            goto L83
        L7c:
            Yue.ۥۣۢۥۣ$ۥ۟۟۟۠ r0 = (Yue.C6660.AbstractC6666) r0
            int r2 = r6 + 1
            r0.m25666(r2)
        L83:
            int r1 = r1 + 1
            goto L60
        L86:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m25648(boolean r1) {
            r0 = this;
            r0.f23234 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m25649(android.content.res.TypedArray r6, org.xmlpull.v1.XmlPullParser r7, android.content.res.Resources.Theme r8) throws org.xmlpull.v1.XmlPullParserException {
            r5 = this;
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ r0 = r5.f23230
            Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ r1 = r0.f23287
            r2 = 6
            r3 = -1
            java.lang.String r4 = "tintMode"
            int r2 = Yue.C6478.m23898(r6, r7, r4, r2, r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r2 = m25642(r2, r3)
            r0.f23289 = r2
            java.lang.String r2 = "tint"
            r3 = 1
            android.content.res.ColorStateList r8 = Yue.C6478.m23894(r6, r7, r8, r2, r3)
            if (r8 == 0) goto L1f
            r0.f23288 = r8
        L1f:
            r8 = 5
            boolean r2 = r0.f23290
            java.lang.String r3 = "autoMirrored"
            boolean r8 = Yue.C6478.m23892(r6, r7, r3, r8, r2)
            r0.f23290 = r8
            float r8 = r1.f23280
            java.lang.String r0 = "viewportWidth"
            r2 = 7
            float r8 = Yue.C6478.m23897(r6, r7, r0, r2, r8)
            r1.f23280 = r8
            r8 = 8
            float r0 = r1.f23281
            java.lang.String r2 = "viewportHeight"
            float r8 = Yue.C6478.m23897(r6, r7, r2, r8, r0)
            r1.f23281 = r8
            float r0 = r1.f23280
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Ld6
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto Lbb
            r8 = 3
            float r0 = r1.f23278
            float r8 = r6.getDimension(r8, r0)
            r1.f23278 = r8
            r8 = 2
            float r0 = r1.f23279
            float r8 = r6.getDimension(r8, r0)
            r1.f23279 = r8
            float r0 = r1.f23278
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L85
            r8 = 4
            float r0 = r1.getAlpha()
            java.lang.String r2 = "alpha"
            float r7 = Yue.C6478.m23897(r6, r7, r2, r8, r0)
            r1.setAlpha(r7)
            r7 = 0
            java.lang.String r6 = r6.getString(r7)
            if (r6 == 0) goto L84
            r1.f23283 = r6
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Object> r7 = r1.f23285
            r7.put(r6, r1)
        L84:
            return
        L85:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r8.append(r6)
            java.lang.String r6 = "<vector> tag requires height > 0"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        La0:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r8.append(r6)
            java.lang.String r6 = "<vector> tag requires width > 0"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        Lbb:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r8.append(r6)
            java.lang.String r6 = "<vector> tag requires viewportHeight > 0"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        Ld6:
            org.xmlpull.v1.XmlPullParserException r7 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r8.append(r6)
            java.lang.String r6 = "<vector> tag requires viewportWidth > 0"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public android.graphics.PorterDuffColorFilter m25650(android.graphics.PorterDuffColorFilter r2, android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r1 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r2 = r1.getState()
            r0 = 0
            int r2 = r3.getColorForState(r2, r0)
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            r3.<init>(r2, r4)
            return r3
        L14:
            r2 = 0
            return r2
    }
}
