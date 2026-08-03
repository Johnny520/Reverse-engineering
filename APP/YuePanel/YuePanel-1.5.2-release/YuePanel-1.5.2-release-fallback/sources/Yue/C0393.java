package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C0393 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f921 = "AnimatorInflater";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f922 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f923 = 100;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f924 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f925 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f926 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f927 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f928 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f929 = false;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۧ۠$ۥ, reason: contains not printable characters */
    public static class C0394 implements android.animation.TypeEvaluator<Yue.C4710.C4712[]> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C4710.C4712[] f930;

        public C0394() {
                r0 = this;
                r0.<init>()
                return
        }

        public C0394(Yue.C4710.C4712[] r1) {
                r0 = this;
                r0.<init>()
                r0.f930 = r1
                return
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Yue.C4710.C4712[] evaluate(float r1, Yue.C4710.C4712[] r2, Yue.C4710.C4712[] r3) {
                r0 = this;
                Yue.ۥۣۣۡۨ$ۥ۟[] r2 = (Yue.C4710.C4712[]) r2
                Yue.ۥۣۣۡۨ$ۥ۟[] r3 = (Yue.C4710.C4712[]) r3
                Yue.ۥۣۣۡۨ$ۥ۟[] r1 = r0.m1532(r1, r2, r3)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C4710.C4712[] m1532(float r5, Yue.C4710.C4712[] r6, Yue.C4710.C4712[] r7) {
                r4 = this;
                boolean r0 = Yue.C4710.m18705(r6, r7)
                if (r0 == 0) goto L29
                Yue.ۥۣۣۡۨ$ۥ۟[] r0 = r4.f930
                boolean r0 = Yue.C4710.m18705(r0, r6)
                if (r0 != 0) goto L14
                Yue.ۥۣۣۡۨ$ۥ۟[] r0 = Yue.C4710.m18709(r6)
                r4.f930 = r0
            L14:
                r0 = 0
            L15:
                int r1 = r6.length
                if (r0 >= r1) goto L26
                Yue.ۥۣۣۡۨ$ۥ۟[] r1 = r4.f930
                r1 = r1[r0]
                r2 = r6[r0]
                r3 = r7[r0]
                r1.m18727(r2, r3, r5)
                int r0 = r0 + 1
                goto L15
            L26:
                Yue.ۥۣۣۡۨ$ۥ۟[] r5 = r4.f930
                return r5
            L29:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Can't interpolate between two incompatible pathData"
                r5.<init>(r6)
                throw r5
        }
    }

    public C0393() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.animation.Animator m1512(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, org.xmlpull.v1.XmlPullParser r11, float r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r11)
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            android.animation.Animator r8 = m1513(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.animation.Animator m1513(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        Le:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L1c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto Ldd
        L1c:
            r2 = 1
            if (r1 == r2) goto Ldd
            r3 = 2
            if (r1 == r3) goto L23
            goto Le
        L23:
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L43
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m1526(r0, r1, r2, r3, r4, r5)
        L3f:
            r3 = r18
            goto Lb2
        L43:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L5d
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m1524(r0, r1, r2, r3, r4, r5, r6)
            goto L3f
        L5d:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L93
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = Yue.C0347.f818
            r7 = r22
            android.content.res.TypedArray r6 = Yue.C6478.m23906(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = Yue.C6478.m23898(r6, r10, r0, r14, r14)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r25
            m1513(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto Lb2
        L93:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lc2
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m1528(r3, r8, r9, r10, r1)
            if (r1 == 0) goto Lb1
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto Lb1
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        Lb1:
            r14 = r2
        Lb2:
            if (r11 == 0) goto Le
            if (r14 != 0) goto Le
            if (r13 != 0) goto Lbd
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        Lbd:
            r13.add(r0)
            goto Le
        Lc2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown animator name: "
            r1.append(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Ldd:
            if (r11 == 0) goto L106
            if (r13 == 0) goto L106
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        Leb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lfd
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto Leb
        Lfd:
            if (r24 != 0) goto L103
            r11.playTogether(r1)
            goto L106
        L103:
            r11.playSequentially(r1)
        L106:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.animation.Keyframe m1514(android.animation.Keyframe r2, float r3) {
            java.lang.Class r0 = r2.getType()
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto Ld
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r3)
            goto L1e
        Ld:
            java.lang.Class r2 = r2.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto L1a
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r3)
            goto L1e
        L1a:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofObject(r3)
        L1e:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m1515(android.animation.Keyframe[] r2, float r3, int r4, int r5) {
            int r0 = r5 - r4
            int r0 = r0 + 2
            float r0 = (float) r0
            float r3 = r3 / r0
        L6:
            if (r4 > r5) goto L19
            r0 = r2[r4]
            int r1 = r4 + (-1)
            r1 = r2[r1]
            float r1 = r1.getFraction()
            float r1 = r1 + r3
            r0.setFraction(r1)
            int r4 = r4 + 1
            goto L6
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m1516(java.lang.Object[] r6, java.lang.String r7) {
            if (r6 == 0) goto L59
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L59
        L6:
            java.lang.String r0 = "AnimatorInflater"
            android.util.Log.d(r0, r7)
            int r7 = r6.length
            r1 = 0
        Ld:
            if (r1 >= r7) goto L59
            r2 = r6[r1]
            android.animation.Keyframe r2 = (android.animation.Keyframe) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Keyframe "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ": fraction "
            r3.append(r4)
            float r4 = r2.getFraction()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            java.lang.String r5 = "null"
            if (r4 >= 0) goto L32
            r4 = r5
            goto L3a
        L32:
            float r4 = r2.getFraction()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L3a:
            r3.append(r4)
            java.lang.String r4 = ", , value : "
            r3.append(r4)
            boolean r4 = r2.hasValue()
            if (r4 == 0) goto L4c
            java.lang.Object r5 = r2.getValue()
        L4c:
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r0, r2)
            int r1 = r1 + 1
            goto Ld
        L59:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.animation.PropertyValuesHolder m1517(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
            r0 = 2
            android.util.TypedValue r1 = r11.peekValue(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lb
            r4 = r2
            goto Lc
        Lb:
            r4 = r3
        Lc:
            if (r4 == 0) goto L11
            int r1 = r1.type
            goto L12
        L11:
            r1 = r3
        L12:
            android.util.TypedValue r5 = r11.peekValue(r14)
            if (r5 == 0) goto L1a
            r6 = r2
            goto L1b
        L1a:
            r6 = r3
        L1b:
            if (r6 == 0) goto L20
            int r5 = r5.type
            goto L21
        L20:
            r5 = r3
        L21:
            r7 = 4
            r8 = 3
            if (r12 != r7) goto L38
            if (r4 == 0) goto L2d
            boolean r12 = m1520(r1)
            if (r12 != 0) goto L35
        L2d:
            if (r6 == 0) goto L37
            boolean r12 = m1520(r5)
            if (r12 == 0) goto L37
        L35:
            r12 = r8
            goto L38
        L37:
            r12 = r3
        L38:
            if (r12 != 0) goto L3c
            r7 = r2
            goto L3d
        L3c:
            r7 = r3
        L3d:
            r9 = 0
            if (r12 != r0) goto La7
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            Yue.ۥۣۣۡۨ$ۥ۟[] r13 = Yue.C4710.m18707(r12)
            Yue.ۥۣۣۡۨ$ۥ۟[] r14 = Yue.C4710.m18707(r11)
            if (r13 != 0) goto L54
            if (r14 == 0) goto L163
        L54:
            if (r13 == 0) goto L96
            Yue.ۥ۟۠ۧ۠$ۥ r0 = new Yue.ۥ۟۠ۧ۠$ۥ
            r0.<init>()
            if (r14 == 0) goto L8d
            boolean r1 = Yue.C4710.m18705(r13, r14)
            if (r1 == 0) goto L6e
            java.lang.Object[] r11 = new java.lang.Object[]{r13, r14}
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L6b:
            r9 = r11
            goto L163
        L6e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L8d:
            java.lang.Object[] r11 = new java.lang.Object[]{r13}
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L6b
        L96:
            if (r14 == 0) goto L163
            Yue.ۥ۟۠ۧ۠$ۥ r11 = new Yue.ۥ۟۠ۧ۠$ۥ
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[]{r14}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L163
        La7:
            if (r12 != r8) goto Lae
            Yue.ۥ۟ۡۦۥ r12 = Yue.C0552.m1950()
            goto Laf
        Lae:
            r12 = r9
        Laf:
            r8 = 5
            r10 = 0
            if (r7 == 0) goto Lf7
            if (r4 == 0) goto Le3
            if (r1 != r8) goto Lbc
            float r13 = r11.getDimension(r13, r10)
            goto Lc0
        Lbc:
            float r13 = r11.getFloat(r13, r10)
        Lc0:
            if (r6 == 0) goto Lda
            if (r5 != r8) goto Lc9
            float r11 = r11.getDimension(r14, r10)
            goto Lcd
        Lc9:
            float r11 = r11.getFloat(r14, r10)
        Lcd:
            float[] r14 = new float[r0]
            r14[r3] = r13
            r14[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
        Ld7:
            r9 = r11
            goto L15c
        Lda:
            float[] r11 = new float[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto Ld7
        Le3:
            if (r5 != r8) goto Lea
            float r11 = r11.getDimension(r14, r10)
            goto Lee
        Lea:
            float r11 = r11.getFloat(r14, r10)
        Lee:
            float[] r13 = new float[r2]
            r13[r3] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto Ld7
        Lf7:
            if (r4 == 0) goto L13b
            if (r1 != r8) goto L101
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L110
        L101:
            boolean r0 = m1520(r1)
            if (r0 == 0) goto L10c
            int r13 = r11.getColor(r13, r3)
            goto L110
        L10c:
            int r13 = r11.getInt(r13, r3)
        L110:
            if (r6 == 0) goto L132
            if (r5 != r8) goto L11a
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L129
        L11a:
            boolean r0 = m1520(r5)
            if (r0 == 0) goto L125
            int r11 = r11.getColor(r14, r3)
            goto L129
        L125:
            int r11 = r11.getInt(r14, r3)
        L129:
            int[] r11 = new int[]{r13, r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L15c
        L132:
            int[] r11 = new int[]{r13}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L15c
        L13b:
            if (r6 == 0) goto L15c
            if (r5 != r8) goto L145
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L154
        L145:
            boolean r13 = m1520(r5)
            if (r13 == 0) goto L150
            int r11 = r11.getColor(r14, r3)
            goto L154
        L150:
            int r11 = r11.getInt(r14, r3)
        L154:
            int[] r11 = new int[]{r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
        L15c:
            if (r9 == 0) goto L163
            if (r12 == 0) goto L163
            r9.setEvaluator(r12)
        L163:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m1518(android.content.res.TypedArray r3, int r4, int r5) {
            android.util.TypedValue r4 = r3.peekValue(r4)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto La
            r2 = r0
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 == 0) goto L10
            int r4 = r4.type
            goto L11
        L10:
            r4 = r1
        L11:
            android.util.TypedValue r3 = r3.peekValue(r5)
            if (r3 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L1e
            int r3 = r3.type
            goto L1f
        L1e:
            r3 = r1
        L1f:
            if (r2 == 0) goto L27
            boolean r4 = m1520(r4)
            if (r4 != 0) goto L2f
        L27:
            if (r0 == 0) goto L30
            boolean r3 = m1520(r3)
            if (r3 == 0) goto L30
        L2f:
            r1 = 3
        L30:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m1519(android.content.res.Resources r1, android.content.res.Resources.Theme r2, android.util.AttributeSet r3, org.xmlpull.v1.XmlPullParser r4) {
            int[] r0 = Yue.C0347.f825
            android.content.res.TypedArray r1 = Yue.C6478.m23906(r1, r2, r3, r0)
            java.lang.String r2 = "value"
            r3 = 0
            android.util.TypedValue r2 = Yue.C6478.m23907(r1, r4, r2, r3)
            if (r2 == 0) goto L18
            int r2 = r2.type
            boolean r2 = m1520(r2)
            if (r2 == 0) goto L18
            r3 = 3
        L18:
            r1.recycle()
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m1520(int r1) {
            r0 = 28
            if (r1 < r0) goto La
            r0 = 31
            if (r1 > r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static android.animation.Animator m1521(android.content.Context r0, @Yue.InterfaceC0408 int r1) throws android.content.res.Resources.NotFoundException {
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static android.animation.Animator m1522(android.content.Context r1, android.content.res.Resources r2, android.content.res.Resources.Theme r3, @Yue.InterfaceC0408 int r4) throws android.content.res.Resources.NotFoundException {
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.Animator r1 = m1523(r1, r2, r3, r4, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static android.animation.Animator m1523(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, @Yue.InterfaceC0408 int r5, float r6) throws android.content.res.Resources.NotFoundException {
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r1 = 0
            android.content.res.XmlResourceParser r1 = r3.getAnimation(r5)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L15
            android.animation.Animator r2 = m1512(r2, r3, r4, r1, r6)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13 org.xmlpull.v1.XmlPullParserException -> L15
            if (r1 == 0) goto L10
            r1.close()
        L10:
            return r2
        L11:
            r2 = move-exception
            goto L4f
        L13:
            r2 = move-exception
            goto L17
        L15:
            r2 = move-exception
            goto L33
        L17:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r4.<init>()     // Catch: java.lang.Throwable -> L11
            r4.append(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L11
            r4.append(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L11
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L11
            r3.initCause(r2)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.Throwable -> L11
        L33:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r4.<init>()     // Catch: java.lang.Throwable -> L11
            r4.append(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch: java.lang.Throwable -> L11
            r4.append(r5)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L11
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L11
            r3.initCause(r2)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.Throwable -> L11
        L4f:
            if (r1 == 0) goto L54
            r1.close()
        L54:
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static android.animation.ValueAnimator m1524(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, android.util.AttributeSet r5, android.animation.ValueAnimator r6, float r7, org.xmlpull.v1.XmlPullParser r8) throws android.content.res.Resources.NotFoundException {
            int[] r0 = Yue.C0347.f809
            android.content.res.TypedArray r0 = Yue.C6478.m23906(r3, r4, r5, r0)
            int[] r1 = Yue.C0347.f830
            android.content.res.TypedArray r3 = Yue.C6478.m23906(r3, r4, r5, r1)
            if (r6 != 0) goto L13
            android.animation.ValueAnimator r6 = new android.animation.ValueAnimator
            r6.<init>()
        L13:
            m1529(r6, r0, r3, r7, r8)
            java.lang.String r4 = "interpolator"
            r5 = 0
            int r4 = Yue.C6478.m23899(r0, r8, r4, r5, r5)
            if (r4 <= 0) goto L26
            android.view.animation.Interpolator r2 = Yue.C0392.m1511(r2, r4)
            r6.setInterpolator(r2)
        L26:
            r0.recycle()
            if (r3 == 0) goto L2e
            r3.recycle()
        L2e:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static android.animation.Keyframe m1525(android.content.Context r6, android.content.res.Resources r7, android.content.res.Resources.Theme r8, android.util.AttributeSet r9, int r10, org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int[] r0 = Yue.C0347.f825
            android.content.res.TypedArray r7 = Yue.C6478.m23906(r7, r8, r9, r0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r9 = "fraction"
            r0 = 3
            float r8 = Yue.C6478.m23897(r7, r11, r9, r0, r8)
            java.lang.String r9 = "value"
            r1 = 0
            android.util.TypedValue r2 = Yue.C6478.m23907(r7, r11, r9, r1)
            r3 = 1
            if (r2 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r1
        L1c:
            r5 = 4
            if (r10 != r5) goto L2c
            if (r4 == 0) goto L2b
            int r10 = r2.type
            boolean r10 = m1520(r10)
            if (r10 == 0) goto L2b
            r10 = r0
            goto L2c
        L2b:
            r10 = r1
        L2c:
            if (r4 == 0) goto L49
            if (r10 == 0) goto L3f
            if (r10 == r3) goto L36
            if (r10 == r0) goto L36
            r8 = 0
            goto L54
        L36:
            int r9 = Yue.C6478.m23898(r7, r11, r9, r1, r1)
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r8, r9)
            goto L54
        L3f:
            r10 = 0
            float r9 = Yue.C6478.m23897(r7, r11, r9, r1, r10)
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r8, r9)
            goto L54
        L49:
            if (r10 != 0) goto L50
            android.animation.Keyframe r8 = android.animation.Keyframe.ofFloat(r8)
            goto L54
        L50:
            android.animation.Keyframe r8 = android.animation.Keyframe.ofInt(r8)
        L54:
            java.lang.String r9 = "interpolator"
            int r9 = Yue.C6478.m23899(r7, r11, r9, r3, r1)
            if (r9 <= 0) goto L63
            android.view.animation.Interpolator r6 = Yue.C0392.m1511(r6, r9)
            r8.setInterpolator(r6)
        L63:
            r7.recycle()
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static android.animation.ObjectAnimator m1526(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, android.util.AttributeSet r11, float r12, org.xmlpull.v1.XmlPullParser r13) throws android.content.res.Resources.NotFoundException {
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r7
            r5 = r12
            r6 = r13
            m1524(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static android.animation.PropertyValuesHolder m1527(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L40
            r4 = 1
            if (r2 == r4) goto L40
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2
            r2 = 4
            if (r14 != r2) goto L23
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r12)
            int r14 = m1519(r10, r11, r14, r12)
        L23:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r7 = r12
            android.animation.Keyframe r2 = m1525(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L3c
            if (r1 != 0) goto L39
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L39:
            r1.add(r2)
        L3c:
            r12.next()
            goto L2
        L40:
            if (r1 == 0) goto Le9
            int r9 = r1.size()
            if (r9 <= 0) goto Le9
            r10 = 0
            java.lang.Object r11 = r1.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + (-1)
            java.lang.Object r12 = r1.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L77
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6a
            r12.setFraction(r2)
            goto L77
        L6a:
            int r0 = r1.size()
            android.animation.Keyframe r12 = m1514(r12, r2)
            r1.add(r0, r12)
            int r9 = r9 + 1
        L77:
            float r12 = r11.getFraction()
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L90
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L87
            r11.setFraction(r5)
            goto L90
        L87:
            android.animation.Keyframe r11 = m1514(r11, r5)
            r1.add(r10, r11)
            int r9 = r9 + 1
        L90:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r1.toArray(r11)
        L95:
            if (r10 >= r9) goto Ldc
            r12 = r11[r10]
            float r0 = r12.getFraction()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto Ld9
            if (r10 != 0) goto La7
            r12.setFraction(r5)
            goto Ld9
        La7:
            int r0 = r9 + (-1)
            if (r10 != r0) goto Laf
            r12.setFraction(r2)
            goto Ld9
        Laf:
            int r12 = r10 + 1
            r1 = r10
        Lb2:
            if (r12 >= r0) goto Lc5
            r4 = r11[r12]
            float r4 = r4.getFraction()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto Lbf
            goto Lc5
        Lbf:
            int r1 = r12 + 1
            r8 = r1
            r1 = r12
            r12 = r8
            goto Lb2
        Lc5:
            int r12 = r1 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r0 = r10 + (-1)
            r0 = r11[r0]
            float r0 = r0.getFraction()
            float r12 = r12 - r0
            m1515(r11, r12, r10, r1)
        Ld9:
            int r10 = r10 + 1
            goto L95
        Ldc:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r14 != r3) goto Le9
            Yue.ۥ۟ۡۦۥ r9 = Yue.C0552.m1950()
            r0.setEvaluator(r9)
        Le9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static android.animation.PropertyValuesHolder[] m1528(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r6 = r20
            r7 = 0
            r8 = r7
        L4:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L6c
            r10 = 1
            if (r0 == r10) goto L6c
            r2 = 2
            if (r0 == r2) goto L16
            r20.next()
            goto L4
        L16:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L62
            int[] r0 = Yue.C0347.f820
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = Yue.C6478.m23906(r11, r12, r13, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = Yue.C6478.m23900(r14, r6, r0, r1)
            java.lang.String r0 = "valueType"
            r1 = 4
            int r5 = Yue.C6478.m23898(r14, r6, r0, r2, r1)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = m1527(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L52
            r1 = r16
            android.animation.PropertyValuesHolder r0 = m1517(r14, r1, r9, r10, r15)
        L52:
            if (r0 == 0) goto L5e
            if (r8 != 0) goto L5b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L5b:
            r8.add(r0)
        L5e:
            r14.recycle()
            goto L68
        L62:
            r11 = r18
            r12 = r19
            r13 = r21
        L68:
            r20.next()
            goto L4
        L6c:
            if (r8 == 0) goto L81
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L74:
            if (r9 >= r0) goto L81
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L74
        L81:
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m1529(android.animation.ValueAnimator r11, android.content.res.TypedArray r12, android.content.res.TypedArray r13, float r14, org.xmlpull.v1.XmlPullParser r15) {
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = "duration"
            r2 = 1
            int r0 = Yue.C6478.m23898(r12, r15, r1, r2, r0)
            long r0 = (long) r0
            java.lang.String r3 = "startOffset"
            r4 = 2
            r5 = 0
            int r3 = Yue.C6478.m23898(r12, r15, r3, r4, r5)
            long r3 = (long) r3
            java.lang.String r6 = "valueType"
            r7 = 7
            r8 = 4
            int r6 = Yue.C6478.m23898(r12, r15, r6, r7, r8)
            java.lang.String r7 = "valueFrom"
            boolean r7 = Yue.C6478.m23905(r15, r7)
            if (r7 == 0) goto L42
            java.lang.String r7 = "valueTo"
            boolean r7 = Yue.C6478.m23905(r15, r7)
            if (r7 == 0) goto L42
            r7 = 6
            r9 = 5
            if (r6 != r8) goto L33
            int r6 = m1518(r12, r9, r7)
        L33:
            java.lang.String r10 = ""
            android.animation.PropertyValuesHolder r7 = m1517(r12, r6, r9, r7, r10)
            if (r7 == 0) goto L42
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[]{r7}
            r11.setValues(r7)
        L42:
            r11.setDuration(r0)
            r11.setStartDelay(r3)
            java.lang.String r0 = "repeatCount"
            r1 = 3
            int r0 = Yue.C6478.m23898(r12, r15, r0, r1, r5)
            r11.setRepeatCount(r0)
            java.lang.String r0 = "repeatMode"
            int r12 = Yue.C6478.m23898(r12, r15, r0, r8, r2)
            r11.setRepeatMode(r12)
            if (r13 == 0) goto L60
            m1530(r11, r13, r6, r14, r15)
        L60:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m1530(android.animation.ValueAnimator r5, android.content.res.TypedArray r6, int r7, float r8, org.xmlpull.v1.XmlPullParser r9) {
            android.animation.ObjectAnimator r5 = (android.animation.ObjectAnimator) r5
            java.lang.String r0 = "pathData"
            r1 = 1
            java.lang.String r0 = Yue.C6478.m23900(r6, r9, r0, r1)
            if (r0 == 0) goto L47
            java.lang.String r1 = "propertyXName"
            r2 = 2
            java.lang.String r1 = Yue.C6478.m23900(r6, r9, r1, r2)
            java.lang.String r3 = "propertyYName"
            r4 = 3
            java.lang.String r9 = Yue.C6478.m23900(r6, r9, r3, r4)
            if (r7 == r2) goto L1c
            r2 = 4
        L1c:
            if (r1 != 0) goto L3c
            if (r9 == 0) goto L21
            goto L3c
        L21:
            android.view.InflateException r5 = new android.view.InflateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = r6.getPositionDescription()
            r7.append(r6)
            java.lang.String r6 = " propertyXName or propertyYName is needed for PathData"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L3c:
            android.graphics.Path r6 = Yue.C4710.m18708(r0)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r7
            m1531(r6, r5, r8, r1, r9)
            goto L51
        L47:
            java.lang.String r7 = "propertyName"
            r8 = 0
            java.lang.String r6 = Yue.C6478.m23900(r6, r9, r7, r8)
            r5.setPropertyName(r6)
        L51:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m1531(android.graphics.Path r17, android.animation.ObjectAnimator r18, float r19, java.lang.String r20, java.lang.String r21) {
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r5 = 0
            r4.<init>(r0, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            r6.add(r8)
            r8 = r7
        L1c:
            float r9 = r4.getLength()
            float r8 = r8 + r9
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            r6.add(r9)
            boolean r9 = r4.nextContour()
            if (r9 != 0) goto L1c
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r4.<init>(r0, r5)
            float r0 = r8 / r19
            int r0 = (int) r0
            r9 = 1
            int r0 = r0 + r9
            r10 = 100
            int r0 = java.lang.Math.min(r10, r0)
            float[] r10 = new float[r0]
            float[] r11 = new float[r0]
            r12 = 2
            float[] r12 = new float[r12]
            int r13 = r0 + (-1)
            float r13 = (float) r13
            float r8 = r8 / r13
            r13 = r5
            r14 = r13
        L4b:
            r15 = 0
            if (r13 >= r0) goto L85
            java.lang.Object r16 = r6.get(r14)
            java.lang.Float r16 = (java.lang.Float) r16
            float r16 = r16.floatValue()
            float r9 = r7 - r16
            r4.getPosTan(r9, r12, r15)
            r9 = r12[r5]
            r10[r13] = r9
            r9 = 1
            r15 = r12[r9]
            r11[r13] = r15
            float r7 = r7 + r8
            int r15 = r14 + 1
            int r5 = r6.size()
            if (r15 >= r5) goto L81
            java.lang.Object r5 = r6.get(r15)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L81
            r4.nextContour()
            r14 = r15
        L81:
            int r13 = r13 + 1
            r5 = 0
            goto L4b
        L85:
            if (r2 == 0) goto L8c
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r2, r10)
            goto L8d
        L8c:
            r0 = r15
        L8d:
            if (r3 == 0) goto L93
            android.animation.PropertyValuesHolder r15 = android.animation.PropertyValuesHolder.ofFloat(r3, r11)
        L93:
            if (r0 != 0) goto L9d
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r15}
            r1.setValues(r0)
            goto Lae
        L9d:
            if (r15 != 0) goto La7
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r0}
            r1.setValues(r0)
            goto Lae
        La7:
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[]{r0, r15}
            r1.setValues(r0)
        Lae:
            return
    }
}
