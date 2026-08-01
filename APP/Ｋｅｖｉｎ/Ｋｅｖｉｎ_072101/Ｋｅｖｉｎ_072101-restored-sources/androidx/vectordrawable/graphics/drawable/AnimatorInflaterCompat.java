package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatorInflaterCompat {
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final int MAX_NUM_POINTS = 100;
    private static final java.lang.String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_UNDEFINED = 4;

    private static class PathDataEvaluator implements android.animation.TypeEvaluator<androidx.core.graphics.PathParser.PathDataNode[]> {
        private androidx.core.graphics.PathParser.PathDataNode[] mNodeArray;

        PathDataEvaluator() {
                r0 = this;
                r0.<init>()
                return
        }

        PathDataEvaluator(androidx.core.graphics.PathParser.PathDataNode[] r1) {
                r0 = this;
                r0.<init>()
                r0.mNodeArray = r1
                return
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ androidx.core.graphics.PathParser.PathDataNode[] evaluate(float r1, androidx.core.graphics.PathParser.PathDataNode[] r2, androidx.core.graphics.PathParser.PathDataNode[] r3) {
                r0 = this;
                androidx.core.graphics.PathParser$PathDataNode[] r2 = (androidx.core.graphics.PathParser.PathDataNode[]) r2
                androidx.core.graphics.PathParser$PathDataNode[] r3 = (androidx.core.graphics.PathParser.PathDataNode[]) r3
                androidx.core.graphics.PathParser$PathDataNode[] r1 = r0.evaluate2(r1, r2, r3)
                return r1
        }

        /* JADX INFO: renamed from: evaluate, reason: avoid collision after fix types in other method */
        public androidx.core.graphics.PathParser.PathDataNode[] evaluate2(float r5, androidx.core.graphics.PathParser.PathDataNode[] r6, androidx.core.graphics.PathParser.PathDataNode[] r7) {
                r4 = this;
                boolean r0 = androidx.core.graphics.PathParser.canMorph(r6, r7)
                if (r0 == 0) goto L29
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r4.mNodeArray
                boolean r0 = androidx.core.graphics.PathParser.canMorph(r0, r6)
                if (r0 != 0) goto L14
                androidx.core.graphics.PathParser$PathDataNode[] r0 = androidx.core.graphics.PathParser.deepCopyNodes(r6)
                r4.mNodeArray = r0
            L14:
                r0 = 0
            L15:
                int r1 = r6.length
                if (r0 >= r1) goto L26
                androidx.core.graphics.PathParser$PathDataNode[] r1 = r4.mNodeArray
                r1 = r1[r0]
                r2 = r6[r0]
                r3 = r7[r0]
                r1.interpolatePathDataNode(r2, r3, r5)
                int r0 = r0 + 1
                goto L15
            L26:
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r4.mNodeArray
                return r0
            L29:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Can't interpolate between two incompatible pathData"
                r0.<init>(r1)
                throw r0
        }
    }

    private AnimatorInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.animation.Animator createAnimatorFromXml(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, org.xmlpull.v1.XmlPullParser r11, float r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r11)
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r12
            android.animation.Animator r0 = createAnimatorFromXml(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private static android.animation.Animator createAnimatorFromXml(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.animation.AnimatorSet r25, int r26, float r27) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r25
            r0 = 0
            r1 = 0
            int r12 = r23.getDepth()
            r7 = r0
            r13 = r1
        L10:
            int r0 = r23.next()
            r14 = r0
            r1 = 3
            if (r0 != r1) goto L23
            int r0 = r23.getDepth()
            if (r0 <= r12) goto L1f
            goto L23
        L1f:
            r1 = r20
            goto Lfb
        L23:
            r0 = 1
            if (r14 == r0) goto Lf9
            r0 = 2
            if (r14 == r0) goto L2a
            goto L10
        L2a:
            java.lang.String r15 = r23.getName()
            r16 = 0
            java.lang.String r0 = "objectAnimator"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L4d
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = r27
            r5 = r23
            android.animation.ObjectAnimator r0 = loadObjectAnimator(r0, r1, r2, r3, r4, r5)
            r1 = r20
            r7 = r0
            goto Lc9
        L4d:
            java.lang.String r0 = "animator"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L6a
            r4 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            r5 = r27
            r6 = r23
            android.animation.ValueAnimator r0 = loadAnimator(r0, r1, r2, r3, r4, r5, r6)
            r1 = r20
            r7 = r0
            goto Lc9
        L6a:
            java.lang.String r0 = "set"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto La7
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r17 = r0
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATOR_SET
            r7 = r24
            android.content.res.TypedArray r6 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            r1 = 0
            int r18 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r6, r10, r0, r1, r1)
            r5 = r17
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r19 = r6
            r6 = r18
            r7 = r27
            createAnimatorFromXml(r0, r1, r2, r3, r4, r5, r6, r7)
            r19.recycle()
            r1 = r20
            r7 = r17
            goto Lc9
        La7:
            java.lang.String r0 = "propertyValuesHolder"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto Lda
        Lb0:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r23)
            r1 = r20
            android.animation.PropertyValuesHolder[] r0 = loadValues(r1, r8, r9, r10, r0)
            if (r0 == 0) goto Lc6
            boolean r2 = r7 instanceof android.animation.ValueAnimator
            if (r2 == 0) goto Lc6
            r2 = r7
            android.animation.ValueAnimator r2 = (android.animation.ValueAnimator) r2
            r2.setValues(r0)
        Lc6:
            r16 = 1
        Lc9:
            if (r11 == 0) goto Ld8
            if (r16 != 0) goto Ld8
            if (r13 != 0) goto Ld5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13 = r0
        Ld5:
            r13.add(r7)
        Ld8:
            goto L10
        Lda:
            r1 = r20
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown animator name: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r23.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        Lf9:
            r1 = r20
        Lfb:
            if (r11 == 0) goto L125
            if (r13 == 0) goto L125
            int r0 = r13.size()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r2 = 0
            java.util.Iterator r3 = r13.iterator()
        L10a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L11c
            java.lang.Object r4 = r3.next()
            android.animation.Animator r4 = (android.animation.Animator) r4
            int r5 = r2 + 1
            r0[r2] = r4
            r2 = r5
            goto L10a
        L11c:
            if (r26 != 0) goto L122
            r11.playTogether(r0)
            goto L125
        L122:
            r11.playSequentially(r0)
        L125:
            return r7
    }

    private static android.animation.Keyframe createNewKeyframe(android.animation.Keyframe r2, float r3) {
            java.lang.Class r0 = r2.getType()
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto Ld
            android.animation.Keyframe r0 = android.animation.Keyframe.ofFloat(r3)
            goto L1e
        Ld:
            java.lang.Class r0 = r2.getType()
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L1a
            android.animation.Keyframe r0 = android.animation.Keyframe.ofInt(r3)
            goto L1e
        L1a:
            android.animation.Keyframe r0 = android.animation.Keyframe.ofObject(r3)
        L1e:
            return r0
    }

    private static void distributeKeyframes(android.animation.Keyframe[] r5, float r6, int r7, int r8) {
            int r0 = r8 - r7
            int r0 = r0 + 2
            float r1 = (float) r0
            float r1 = r6 / r1
            r2 = r7
        L8:
            if (r2 > r8) goto L1b
            r3 = r5[r2]
            int r4 = r2 + (-1)
            r4 = r5[r4]
            float r4 = r4.getFraction()
            float r4 = r4 + r1
            r3.setFraction(r4)
            int r2 = r2 + 1
            goto L8
        L1b:
            return
    }

    private static void dumpKeyframes(java.lang.Object[] r7, java.lang.String r8) {
            if (r7 == 0) goto L60
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L60
        L6:
            java.lang.String r0 = "AnimatorInflater"
            android.util.Log.d(r0, r8)
            int r1 = r7.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L5f
            r3 = r7[r2]
            android.animation.Keyframe r3 = (android.animation.Keyframe) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Keyframe "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r5 = ": fraction "
            java.lang.StringBuilder r4 = r4.append(r5)
            float r5 = r3.getFraction()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            java.lang.String r6 = "null"
            if (r5 >= 0) goto L35
            r5 = r6
            goto L3d
        L35:
            float r5 = r3.getFraction()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
        L3d:
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", , value : "
            java.lang.StringBuilder r4 = r4.append(r5)
            boolean r5 = r3.hasValue()
            if (r5 == 0) goto L51
            java.lang.Object r6 = r3.getValue()
        L51:
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r0, r4)
            int r2 = r2 + 1
            goto Ld
        L5f:
            return
        L60:
            return
    }

    private static android.animation.PropertyValuesHolder getPVH(android.content.res.TypedArray r20, int r21, int r22, int r23, java.lang.String r24) {
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            android.util.TypedValue r4 = r0.peekValue(r1)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L12
            r7 = r5
            goto L13
        L12:
            r7 = r6
        L13:
            if (r7 == 0) goto L18
            int r8 = r4.type
            goto L19
        L18:
            r8 = r6
        L19:
            android.util.TypedValue r9 = r0.peekValue(r2)
            if (r9 == 0) goto L21
            r10 = r5
            goto L22
        L21:
            r10 = r6
        L22:
            if (r10 == 0) goto L27
            int r11 = r9.type
            goto L28
        L27:
            r11 = r6
        L28:
            r12 = 4
            r13 = r21
            if (r13 != r12) goto L41
            if (r7 == 0) goto L35
            boolean r12 = isColorType(r8)
            if (r12 != 0) goto L3d
        L35:
            if (r10 == 0) goto L3f
            boolean r12 = isColorType(r11)
            if (r12 == 0) goto L3f
        L3d:
            r12 = 3
            goto L42
        L3f:
            r12 = 0
            goto L42
        L41:
            r12 = r13
        L42:
            if (r12 != 0) goto L46
            r13 = r5
            goto L47
        L46:
            r13 = r6
        L47:
            r14 = 0
            r15 = 2
            if (r12 != r15) goto Le7
            java.lang.String r5 = r0.getString(r1)
            java.lang.String r6 = r0.getString(r2)
            androidx.core.graphics.PathParser$PathDataNode[] r15 = androidx.core.graphics.PathParser.createNodesFromPathData(r5)
            r16 = r4
            androidx.core.graphics.PathParser$PathDataNode[] r4 = androidx.core.graphics.PathParser.createNodesFromPathData(r6)
            if (r15 != 0) goto L6c
            if (r4 == 0) goto L64
            goto L6c
        L64:
            r17 = r9
            r19 = r11
            r18 = r14
            goto Lde
        L6c:
            if (r15 == 0) goto Lc8
            androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator r17 = new androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator
            r17.<init>()
            r21 = r17
            if (r4 == 0) goto Lb6
            boolean r17 = androidx.core.graphics.PathParser.canMorph(r15, r4)
            if (r17 == 0) goto L8f
            r17 = r9
            java.lang.Object[] r9 = new java.lang.Object[]{r15, r4}
            r18 = r14
            r14 = r21
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofObject(r3, r14, r9)
            r14 = r9
            r19 = r11
            goto Lc7
        L8f:
            r17 = r9
            android.view.InflateException r9 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r19 = r11
            java.lang.String r11 = " Can't morph from "
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r11 = " to "
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r9.<init>(r2)
            throw r9
        Lb6:
            r17 = r9
            r19 = r11
            r18 = r14
            r14 = r21
            java.lang.Object[] r2 = new java.lang.Object[]{r15}
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofObject(r3, r14, r2)
            r14 = r2
        Lc7:
            goto Le0
        Lc8:
            r17 = r9
            r19 = r11
            r18 = r14
            if (r4 == 0) goto Lde
            androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator r2 = new androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat$PathDataEvaluator
            r2.<init>()
            java.lang.Object[] r9 = new java.lang.Object[]{r4}
            android.animation.PropertyValuesHolder r14 = android.animation.PropertyValuesHolder.ofObject(r3, r2, r9)
            goto Le0
        Lde:
            r14 = r18
        Le0:
            r11 = r23
            r5 = r14
            r14 = r19
            goto L1c3
        Le7:
            r16 = r4
            r17 = r9
            r19 = r11
            r18 = r14
            r2 = 0
            r4 = 3
            if (r12 != r4) goto Lf7
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator r2 = androidx.vectordrawable.graphics.drawable.ArgbEvaluator.getInstance()
        Lf7:
            r4 = 5
            r9 = 0
            if (r13 == 0) goto L14e
            if (r7 == 0) goto L135
            if (r8 != r4) goto L104
            float r11 = r0.getDimension(r1, r9)
            goto L108
        L104:
            float r11 = r0.getFloat(r1, r9)
        L108:
            if (r10 == 0) goto L127
            r14 = r19
            if (r14 != r4) goto L115
            r4 = r23
            float r9 = r0.getDimension(r4, r9)
            goto L11b
        L115:
            r4 = r23
            float r9 = r0.getFloat(r4, r9)
        L11b:
            float[] r15 = new float[r15]
            r15[r6] = r11
            r15[r5] = r9
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r3, r15)
            r11 = r4
            goto L14c
        L127:
            r4 = r23
            r14 = r19
            float[] r5 = new float[r5]
            r5[r6] = r11
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r3, r5)
            r11 = r4
            goto L14c
        L135:
            r11 = r23
            r14 = r19
            if (r14 != r4) goto L140
            float r4 = r0.getDimension(r11, r9)
            goto L144
        L140:
            float r4 = r0.getFloat(r11, r9)
        L144:
            float[] r5 = new float[r5]
            r5[r6] = r4
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r3, r5)
        L14c:
            goto L1bc
        L14e:
            r11 = r23
            r14 = r19
            if (r7 == 0) goto L198
            if (r8 != r4) goto L15c
            float r5 = r0.getDimension(r1, r9)
            int r5 = (int) r5
            goto L16b
        L15c:
            boolean r5 = isColorType(r8)
            if (r5 == 0) goto L167
            int r5 = r0.getColor(r1, r6)
            goto L16b
        L167:
            int r5 = r0.getInt(r1, r6)
        L16b:
            if (r10 == 0) goto L18e
            if (r14 != r4) goto L175
            float r4 = r0.getDimension(r11, r9)
            int r4 = (int) r4
            goto L184
        L175:
            boolean r4 = isColorType(r14)
            if (r4 == 0) goto L180
            int r4 = r0.getColor(r11, r6)
            goto L184
        L180:
            int r4 = r0.getInt(r11, r6)
        L184:
            int[] r6 = new int[]{r5, r4}
            android.animation.PropertyValuesHolder r6 = android.animation.PropertyValuesHolder.ofInt(r3, r6)
            r5 = r6
            goto L1bc
        L18e:
            int[] r4 = new int[]{r5}
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofInt(r3, r4)
            r5 = r4
            goto L1bc
        L198:
            if (r10 == 0) goto L1ba
            if (r14 != r4) goto L1a2
            float r4 = r0.getDimension(r11, r9)
            int r4 = (int) r4
            goto L1b1
        L1a2:
            boolean r4 = isColorType(r14)
            if (r4 == 0) goto L1ad
            int r4 = r0.getColor(r11, r6)
            goto L1b1
        L1ad:
            int r4 = r0.getInt(r11, r6)
        L1b1:
            int[] r5 = new int[]{r4}
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofInt(r3, r5)
            goto L1bc
        L1ba:
            r5 = r18
        L1bc:
            if (r5 == 0) goto L1c3
            if (r2 == 0) goto L1c3
            r5.setEvaluator(r2)
        L1c3:
            return r5
    }

    private static int inferValueTypeFromValues(android.content.res.TypedArray r7, int r8, int r9) {
            android.util.TypedValue r0 = r7.peekValue(r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r3 = r1
            goto Lb
        La:
            r3 = r2
        Lb:
            if (r3 == 0) goto L10
            int r4 = r0.type
            goto L11
        L10:
            r4 = r2
        L11:
            android.util.TypedValue r5 = r7.peekValue(r9)
            if (r5 == 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            if (r1 == 0) goto L1d
            int r2 = r5.type
        L1d:
            if (r3 == 0) goto L25
            boolean r6 = isColorType(r4)
            if (r6 != 0) goto L2d
        L25:
            if (r1 == 0) goto L2f
            boolean r6 = isColorType(r2)
            if (r6 == 0) goto L2f
        L2d:
            r6 = 3
            goto L30
        L2f:
            r6 = 0
        L30:
            return r6
    }

    private static int inferValueTypeOfKeyframe(android.content.res.Resources r4, android.content.res.Resources.Theme r5, android.util.AttributeSet r6, org.xmlpull.v1.XmlPullParser r7) {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_KEYFRAME
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r4, r5, r6, r0)
            java.lang.String r1 = "value"
            r2 = 0
            android.util.TypedValue r1 = androidx.core.content.res.TypedArrayUtils.peekNamedValue(r0, r7, r1, r2)
            if (r1 == 0) goto L10
            r2 = 1
        L10:
            if (r2 == 0) goto L1c
            int r3 = r1.type
            boolean r3 = isColorType(r3)
            if (r3 == 0) goto L1c
            r3 = 3
            goto L1d
        L1c:
            r3 = 0
        L1d:
            r0.recycle()
            return r3
    }

    private static boolean isColorType(int r1) {
            r0 = 28
            if (r1 < r0) goto La
            r0 = 31
            if (r1 > r0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static android.animation.Animator loadAnimator(android.content.Context r1, int r2) throws android.content.res.Resources.NotFoundException {
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r1, r2)
            return r0
    }

    public static android.animation.Animator loadAnimator(android.content.Context r1, android.content.res.Resources r2, android.content.res.Resources.Theme r3, int r4) throws android.content.res.Resources.NotFoundException {
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.Animator r0 = loadAnimator(r1, r2, r3, r4, r0)
            return r0
    }

    public static android.animation.Animator loadAnimator(android.content.Context r5, android.content.res.Resources r6, android.content.res.Resources.Theme r7, int r8, float r9) throws android.content.res.Resources.NotFoundException {
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r1 = 0
            android.content.res.XmlResourceParser r2 = r6.getAnimation(r8)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15 org.xmlpull.v1.XmlPullParserException -> L36
            r1 = r2
            android.animation.Animator r0 = createAnimatorFromXml(r5, r6, r7, r1, r9)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15 org.xmlpull.v1.XmlPullParserException -> L36
            if (r1 == 0) goto L12
            r1.close()
        L12:
            return r0
        L13:
            r0 = move-exception
            goto L57
        L15:
            r2 = move-exception
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r4.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = java.lang.Integer.toHexString(r8)     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L13
            r0 = r3
            r0.initCause(r2)     // Catch: java.lang.Throwable -> L13
            throw r0     // Catch: java.lang.Throwable -> L13
        L36:
            r2 = move-exception
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r4.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = java.lang.Integer.toHexString(r8)     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L13
            r0 = r3
            r0.initCause(r2)     // Catch: java.lang.Throwable -> L13
            throw r0     // Catch: java.lang.Throwable -> L13
        L57:
            if (r1 == 0) goto L5c
            r1.close()
        L5c:
            throw r0
    }

    private static android.animation.ValueAnimator loadAnimator(android.content.Context r4, android.content.res.Resources r5, android.content.res.Resources.Theme r6, android.util.AttributeSet r7, android.animation.ValueAnimator r8, float r9, org.xmlpull.v1.XmlPullParser r10) throws android.content.res.Resources.NotFoundException {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATOR
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r5, r6, r7, r0)
            int[] r1 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_PROPERTY_ANIMATOR
            android.content.res.TypedArray r1 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r5, r6, r7, r1)
            if (r8 != 0) goto L14
            android.animation.ValueAnimator r2 = new android.animation.ValueAnimator
            r2.<init>()
            r8 = r2
        L14:
            parseAnimatorFromTypeArray(r8, r0, r1, r9, r10)
            java.lang.String r2 = "interpolator"
            r3 = 0
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r0, r10, r2, r3, r3)
            if (r2 <= 0) goto L27
            android.view.animation.Interpolator r3 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r4, r2)
            r8.setInterpolator(r3)
        L27:
            r0.recycle()
            if (r1 == 0) goto L2f
            r1.recycle()
        L2f:
            return r8
    }

    private static android.animation.Keyframe loadKeyframe(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, android.util.AttributeSet r12, int r13, org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_KEYFRAME
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r10, r11, r12, r0)
            r1 = 0
            r2 = 3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r4 = "fraction"
            float r2 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r0, r14, r4, r2, r3)
            java.lang.String r3 = "value"
            r4 = 0
            android.util.TypedValue r5 = androidx.core.content.res.TypedArrayUtils.peekNamedValue(r0, r14, r3, r4)
            r6 = 1
            if (r5 == 0) goto L1c
            r7 = r6
            goto L1d
        L1c:
            r7 = r4
        L1d:
            r8 = 4
            if (r13 != r8) goto L2d
            if (r7 == 0) goto L2c
            int r8 = r5.type
            boolean r8 = isColorType(r8)
            if (r8 == 0) goto L2c
            r13 = 3
            goto L2d
        L2c:
            r13 = 0
        L2d:
            if (r7 == 0) goto L47
            switch(r13) {
                case 0: goto L3c;
                case 1: goto L33;
                case 2: goto L32;
                case 3: goto L33;
                default: goto L32;
            }
        L32:
            goto L46
        L33:
            int r3 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r0, r14, r3, r4, r4)
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r2, r3)
            goto L46
        L3c:
            r8 = 0
            float r3 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r0, r14, r3, r4, r8)
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r2, r3)
        L46:
            goto L53
        L47:
            if (r13 != 0) goto L4e
            android.animation.Keyframe r3 = android.animation.Keyframe.ofFloat(r2)
            goto L52
        L4e:
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r2)
        L52:
            r1 = r3
        L53:
            java.lang.String r3 = "interpolator"
            int r3 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(r0, r14, r3, r6, r4)
            if (r3 <= 0) goto L62
            android.view.animation.Interpolator r4 = androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(r9, r3)
            r1.setInterpolator(r4)
        L62:
            r0.recycle()
            return r1
    }

    private static android.animation.ObjectAnimator loadObjectAnimator(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, android.util.AttributeSet r11, float r12, org.xmlpull.v1.XmlPullParser r13) throws android.content.res.Resources.NotFoundException {
            android.animation.ObjectAnimator r0 = new android.animation.ObjectAnimator
            r0.<init>()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r0
            r6 = r12
            r7 = r13
            loadAnimator(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private static android.animation.PropertyValuesHolder loadPvh(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, org.xmlpull.v1.XmlPullParser r23, java.lang.String r24, int r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r25
        L5:
            int r3 = r23.next()
            r4 = r3
            r5 = 3
            if (r3 == r5) goto L5d
            r3 = 1
            if (r4 == r3) goto L5d
            java.lang.String r3 = r23.getName()
            java.lang.String r5 = "keyframe"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L56
            r5 = 4
            if (r1 != r5) goto L2e
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r23)
            r12 = r21
            r13 = r22
            r14 = r23
            int r1 = inferValueTypeOfKeyframe(r12, r13, r5, r14)
            goto L34
        L2e:
            r12 = r21
            r13 = r22
            r14 = r23
        L34:
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r23)
            r6 = r20
            r7 = r21
            r8 = r22
            r10 = r1
            r11 = r23
            android.animation.Keyframe r5 = loadKeyframe(r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L52
            if (r2 != 0) goto L4f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2 = r6
        L4f:
            r2.add(r5)
        L52:
            r23.next()
            goto L5c
        L56:
            r12 = r21
            r13 = r22
            r14 = r23
        L5c:
            goto L5
        L5d:
            r12 = r21
            r13 = r22
            r14 = r23
            if (r2 == 0) goto L15e
            int r3 = r2.size()
            r6 = r3
            if (r3 <= 0) goto L155
            r3 = 0
            java.lang.Object r7 = r2.get(r3)
            android.animation.Keyframe r7 = (android.animation.Keyframe) r7
            int r8 = r6 + (-1)
            java.lang.Object r8 = r2.get(r8)
            android.animation.Keyframe r8 = (android.animation.Keyframe) r8
            float r9 = r8.getFraction()
            r10 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r15 = 0
            if (r11 >= 0) goto L9b
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 >= 0) goto L8e
            r8.setFraction(r10)
            goto L9b
        L8e:
            int r11 = r2.size()
            android.animation.Keyframe r5 = createNewKeyframe(r8, r10)
            r2.add(r11, r5)
            int r6 = r6 + 1
        L9b:
            float r5 = r7.getFraction()
            int r11 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r11 == 0) goto Lb4
            int r11 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r11 >= 0) goto Lab
            r7.setFraction(r15)
            goto Lb4
        Lab:
            android.animation.Keyframe r11 = createNewKeyframe(r7, r15)
            r2.add(r3, r11)
            int r6 = r6 + 1
        Lb4:
            android.animation.Keyframe[] r3 = new android.animation.Keyframe[r6]
            r2.toArray(r3)
            r11 = 0
        Lba:
            if (r11 >= r6) goto L13e
            r10 = r3[r11]
            float r17 = r10.getFraction()
            int r17 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r17 >= 0) goto L128
            if (r11 != 0) goto Ld4
            r10.setFraction(r15)
            r19 = r0
            r16 = r2
            r18 = r4
            r17 = r15
            goto L130
        Ld4:
            int r15 = r6 + (-1)
            if (r11 != r15) goto Le6
            r15 = 1065353216(0x3f800000, float:1.0)
            r10.setFraction(r15)
            r19 = r0
            r16 = r2
            r18 = r4
            r17 = 0
            goto L130
        Le6:
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = r11
            r18 = r11
            r15 = r16
            int r16 = r15 + 1
            r19 = r0
            r0 = r16
            r16 = r2
            r2 = r18
        Lf8:
            r18 = r4
            int r4 = r6 + (-1)
            if (r0 >= r4) goto L111
            r4 = r3[r0]
            float r4 = r4.getFraction()
            r17 = 0
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 < 0) goto L10b
            goto L113
        L10b:
            r2 = r0
            int r0 = r0 + 1
            r4 = r18
            goto Lf8
        L111:
            r17 = 0
        L113:
            int r0 = r2 + 1
            r0 = r3[r0]
            float r0 = r0.getFraction()
            int r4 = r15 + (-1)
            r4 = r3[r4]
            float r4 = r4.getFraction()
            float r0 = r0 - r4
            distributeKeyframes(r3, r0, r15, r2)
            goto L130
        L128:
            r19 = r0
            r16 = r2
            r18 = r4
            r17 = r15
        L130:
            int r11 = r11 + 1
            r2 = r16
            r15 = r17
            r4 = r18
            r0 = r19
            r10 = 1065353216(0x3f800000, float:1.0)
            goto Lba
        L13e:
            r19 = r0
            r16 = r2
            r18 = r4
            r0 = r24
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofKeyframe(r0, r3)
            r4 = 3
            if (r1 != r4) goto L168
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator r4 = androidx.vectordrawable.graphics.drawable.ArgbEvaluator.getInstance()
            r2.setEvaluator(r4)
            goto L168
        L155:
            r19 = r0
            r16 = r2
            r18 = r4
            r0 = r24
            goto L166
        L15e:
            r19 = r0
            r16 = r2
            r18 = r4
            r0 = r24
        L166:
            r2 = r19
        L168:
            return r2
    }

    private static android.animation.PropertyValuesHolder[] loadValues(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r6 = r20
            r0 = 0
            r7 = r0
        L4:
            int r0 = r20.getEventType()
            r8 = r0
            r1 = 3
            if (r0 == r1) goto L71
            r9 = 1
            if (r8 == r9) goto L71
            r0 = 2
            if (r8 == r0) goto L16
            r20.next()
            goto L4
        L16:
            java.lang.String r10 = r20.getName()
            java.lang.String r2 = "propertyValuesHolder"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L67
            int[] r2 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_PROPERTY_VALUES_HOLDER
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r11, r12, r13, r2)
            java.lang.String r2 = "propertyName"
            java.lang.String r15 = androidx.core.content.res.TypedArrayUtils.getNamedString(r14, r6, r2, r1)
            java.lang.String r1 = "valueType"
            r2 = 4
            int r5 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r14, r6, r1, r0, r2)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = loadPvh(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L54
            r1 = 0
            r2 = r16
            android.animation.PropertyValuesHolder r0 = getPVH(r14, r2, r1, r9, r15)
            goto L56
        L54:
            r2 = r16
        L56:
            if (r0 == 0) goto L63
            if (r7 != 0) goto L60
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
        L60:
            r7.add(r0)
        L63:
            r14.recycle()
            goto L6d
        L67:
            r11 = r18
            r12 = r19
            r13 = r21
        L6d:
            r20.next()
            goto L4
        L71:
            r11 = r18
            r12 = r19
            r13 = r21
            r0 = 0
            if (r7 == 0) goto L8e
            int r1 = r7.size()
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r1]
            r2 = 0
        L81:
            if (r2 >= r1) goto L8e
            java.lang.Object r3 = r7.get(r2)
            android.animation.PropertyValuesHolder r3 = (android.animation.PropertyValuesHolder) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto L81
        L8e:
            return r0
    }

    private static void parseAnimatorFromTypeArray(android.animation.ValueAnimator r11, android.content.res.TypedArray r12, android.content.res.TypedArray r13, float r14, org.xmlpull.v1.XmlPullParser r15) {
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r1 = "duration"
            r2 = 1
            int r0 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r1, r2, r0)
            long r0 = (long) r0
            java.lang.String r3 = "startOffset"
            r4 = 2
            r5 = 0
            int r3 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r3, r4, r5)
            long r3 = (long) r3
            java.lang.String r6 = "valueType"
            r7 = 7
            r8 = 4
            int r6 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r6, r7, r8)
            java.lang.String r7 = "valueFrom"
            boolean r7 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r15, r7)
            if (r7 == 0) goto L42
            java.lang.String r7 = "valueTo"
            boolean r7 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r15, r7)
            if (r7 == 0) goto L42
            r7 = 6
            r9 = 5
            if (r6 != r8) goto L33
            int r6 = inferValueTypeFromValues(r12, r9, r7)
        L33:
            java.lang.String r10 = ""
            android.animation.PropertyValuesHolder r7 = getPVH(r12, r6, r9, r7, r10)
            if (r7 == 0) goto L42
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[]{r7}
            r11.setValues(r9)
        L42:
            r11.setDuration(r0)
            r11.setStartDelay(r3)
            java.lang.String r7 = "repeatCount"
            r9 = 3
            int r5 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r7, r9, r5)
            r11.setRepeatCount(r5)
            java.lang.String r5 = "repeatMode"
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r12, r15, r5, r8, r2)
            r11.setRepeatMode(r2)
            if (r13 == 0) goto L60
            setupObjectAnimator(r11, r13, r6, r14, r15)
        L60:
            return
    }

    private static void setupObjectAnimator(android.animation.ValueAnimator r7, android.content.res.TypedArray r8, int r9, float r10, org.xmlpull.v1.XmlPullParser r11) {
            r0 = r7
            android.animation.ObjectAnimator r0 = (android.animation.ObjectAnimator) r0
            java.lang.String r1 = "pathData"
            r2 = 1
            java.lang.String r1 = androidx.core.content.res.TypedArrayUtils.getNamedString(r8, r11, r1, r2)
            if (r1 == 0) goto L4d
            java.lang.String r2 = "propertyXName"
            r3 = 2
            java.lang.String r2 = androidx.core.content.res.TypedArrayUtils.getNamedString(r8, r11, r2, r3)
            java.lang.String r4 = "propertyYName"
            r5 = 3
            java.lang.String r4 = androidx.core.content.res.TypedArrayUtils.getNamedString(r8, r11, r4, r5)
            if (r9 == r3) goto L1f
            r3 = 4
            if (r9 != r3) goto L20
        L1f:
            r9 = 0
        L20:
            if (r2 != 0) goto L42
            if (r4 == 0) goto L25
            goto L42
        L25:
            android.view.InflateException r3 = new android.view.InflateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.getPositionDescription()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " propertyXName or propertyYName is needed for PathData"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.<init>(r5)
            throw r3
        L42:
            android.graphics.Path r3 = androidx.core.graphics.PathParser.createPathFromPathData(r1)
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r10
            setupPathMotion(r3, r0, r5, r2, r4)
            goto L58
        L4d:
            java.lang.String r2 = "propertyName"
            r3 = 0
            java.lang.String r2 = androidx.core.content.res.TypedArrayUtils.getNamedString(r8, r11, r2, r3)
            r0.setPropertyName(r2)
        L58:
            return
    }

    private static void setupPathMotion(android.graphics.Path r19, android.animation.ObjectAnimator r20, float r21, java.lang.String r22, java.lang.String r23) {
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
            r5 = 0
            r4.<init>(r0, r5)
            r6 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7.add(r8)
        L1c:
            float r8 = r4.getLength()
            float r6 = r6 + r8
            java.lang.Float r9 = java.lang.Float.valueOf(r6)
            r7.add(r9)
            boolean r8 = r4.nextContour()
            if (r8 != 0) goto Lbc
            android.graphics.PathMeasure r8 = new android.graphics.PathMeasure
            r8.<init>(r0, r5)
            float r9 = r6 / r21
            int r9 = (int) r9
            r10 = 1
            int r9 = r9 + r10
            r11 = 100
            int r9 = java.lang.Math.min(r11, r9)
            float[] r11 = new float[r9]
            float[] r12 = new float[r9]
            r13 = 2
            float[] r13 = new float[r13]
            r14 = 0
            int r15 = r9 + (-1)
            float r15 = (float) r15
            float r15 = r6 / r15
            r16 = 0
            r17 = 0
            r10 = r17
        L51:
            if (r10 >= r9) goto L92
            java.lang.Object r18 = r7.get(r14)
            java.lang.Float r18 = (java.lang.Float) r18
            float r18 = r18.floatValue()
            float r5 = r16 - r18
            r0 = 0
            r8.getPosTan(r5, r13, r0)
            r0 = 0
            r5 = r13[r0]
            r11[r10] = r5
            r5 = 1
            r17 = r13[r5]
            r12[r10] = r17
            float r16 = r16 + r15
            int r0 = r14 + 1
            int r5 = r7.size()
            if (r0 >= r5) goto L8c
            int r0 = r14 + 1
            java.lang.Object r0 = r7.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8c
            int r14 = r14 + 1
            r8.nextContour()
        L8c:
            int r10 = r10 + 1
            r5 = 0
            r0 = r19
            goto L51
        L92:
            r0 = 0
            r5 = 0
            if (r2 == 0) goto L9a
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r2, r11)
        L9a:
            if (r3 == 0) goto La0
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r3, r12)
        La0:
            if (r0 != 0) goto Laa
            android.animation.PropertyValuesHolder[] r10 = new android.animation.PropertyValuesHolder[]{r5}
            r1.setValues(r10)
            goto Lbb
        Laa:
            if (r5 != 0) goto Lb4
            android.animation.PropertyValuesHolder[] r10 = new android.animation.PropertyValuesHolder[]{r0}
            r1.setValues(r10)
            goto Lbb
        Lb4:
            android.animation.PropertyValuesHolder[] r10 = new android.animation.PropertyValuesHolder[]{r0, r5}
            r1.setValues(r10)
        Lbb:
            return
        Lbc:
            r5 = 0
            r0 = r19
            goto L1c
    }
}
