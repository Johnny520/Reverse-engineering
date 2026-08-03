package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.util.SparseArray<androidx.constraintlayout.widget.d.a> f865a;
    public android.util.SparseArray<androidx.constraintlayout.widget.e> b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f866a;
        public final java.util.ArrayList<androidx.constraintlayout.widget.d.b> b;
        public final int c;

        public a(android.content.Context r7, android.content.res.XmlResourceParser r8) {
                r6 = this;
                r6.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r6.b = r0
                r0 = -1
                r6.c = r0
                android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)
                int[] r0 = androidx.constraintlayout.widget.R.styleable.State
                android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
                int r0 = r8.getIndexCount()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L68
                int r2 = r8.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.R.styleable.State_android_id
                if (r2 != r3) goto L2f
                int r3 = r6.f866a
                int r2 = r8.getResourceId(r2, r3)
                r6.f866a = r2
                goto L65
            L2f:
                int r3 = androidx.constraintlayout.widget.R.styleable.State_constraints
                if (r2 != r3) goto L65
                int r3 = r6.c
                int r2 = r8.getResourceId(r2, r3)
                r6.c = r2
                android.content.res.Resources r3 = r7.getResources()
                java.lang.String r3 = r3.getResourceTypeName(r2)
                android.content.res.Resources r4 = r7.getResources()
                r4.getResourceName(r2)
                java.lang.String r4 = "layout"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L65
                androidx.constraintlayout.widget.e r3 = new androidx.constraintlayout.widget.e
                r3.<init>()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
                r5 = 0
                android.view.View r2 = r4.inflate(r2, r5)
                androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
                r3.b(r2)
            L65:
                int r1 = r1 + 1
                goto L1c
            L68:
                r8.recycle()
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f867a;
        public final float b;
        public final float c;
        public final float d;
        public final int e;

        public b(android.content.Context r7, android.content.res.XmlResourceParser r8) {
                r6 = this;
                r6.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r6.f867a = r0
                r6.b = r0
                r6.c = r0
                r6.d = r0
                r0 = -1
                r6.e = r0
                android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r8)
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Variant
                android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r0)
                int r0 = r8.getIndexCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L9a
                int r2 = r8.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_constraints
                if (r2 != r3) goto L5c
                int r3 = r6.e
                int r2 = r8.getResourceId(r2, r3)
                r6.e = r2
                android.content.res.Resources r3 = r7.getResources()
                java.lang.String r3 = r3.getResourceTypeName(r2)
                android.content.res.Resources r4 = r7.getResources()
                r4.getResourceName(r2)
                java.lang.String r4 = "layout"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L97
                androidx.constraintlayout.widget.e r3 = new androidx.constraintlayout.widget.e
                r3.<init>()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
                r5 = 0
                android.view.View r2 = r4.inflate(r2, r5)
                androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
                r3.b(r2)
                goto L97
            L5c:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan
                if (r2 != r3) goto L69
                float r3 = r6.d
                float r2 = r8.getDimension(r2, r3)
                r6.d = r2
                goto L97
            L69:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan
                if (r2 != r3) goto L76
                float r3 = r6.b
                float r2 = r8.getDimension(r2, r3)
                r6.b = r2
                goto L97
            L76:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan
                if (r2 != r3) goto L83
                float r3 = r6.c
                float r2 = r8.getDimension(r2, r3)
                r6.c = r2
                goto L97
            L83:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan
                if (r2 != r3) goto L90
                float r3 = r6.f867a
                float r2 = r8.getDimension(r2, r3)
                r6.f867a = r2
                goto L97
            L90:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L97:
                int r1 = r1 + 1
                goto L1f
            L9a:
                r8.recycle()
                return
        }
    }

    public final void a(android.content.Context r13, android.content.res.XmlResourceParser r14) {
            r12 = this;
            androidx.constraintlayout.widget.e r0 = new androidx.constraintlayout.widget.e
            r0.<init>()
            int r1 = r14.getAttributeCount()
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L1ea
            java.lang.String r4 = r14.getAttributeName(r3)
            java.lang.String r5 = "id"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L1e6
            java.lang.String r1 = r14.getAttributeValue(r3)
            java.lang.String r3 = "/"
            boolean r3 = r1.contains(r3)
            r4 = 1
            r6 = -1
            if (r3 == 0) goto L3f
            r3 = 47
            int r3 = r1.indexOf(r3)
            int r3 = r3 + r4
            java.lang.String r3 = r1.substring(r3)
            android.content.res.Resources r7 = r13.getResources()
            java.lang.String r8 = r13.getPackageName()
            int r3 = r7.getIdentifier(r3, r5, r8)
            goto L40
        L3f:
            r3 = r6
        L40:
            if (r3 != r6) goto L58
            int r5 = r1.length()
            if (r5 <= r4) goto L51
            java.lang.String r1 = r1.substring(r4)
            int r3 = java.lang.Integer.parseInt(r1)
            goto L58
        L51:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r5 = "error in parsing id"
            android.util.Log.e(r1, r5)
        L58:
            int r1 = r14.getEventType()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r5 = 0
            r7 = r5
        L5e:
            if (r1 == r4) goto L1e0
            if (r1 == 0) goto L1d0
            java.lang.String r8 = "Constraint"
            r9 = 3
            r10 = 2
            if (r1 == r10) goto L94
            if (r1 == r9) goto L6c
            goto L1d3
        L6c:
            java.lang.String r1 = r14.getName()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.String r9 = "ConstraintSet"
            boolean r9 = r9.equals(r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r9 == 0) goto L7a
            goto L1e0
        L7a:
            boolean r1 = r1.equalsIgnoreCase(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto L1d3
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.e$a> r1 = r0.c     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            int r8 = r7.f869a     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r1.put(r8, r7)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r7 = r5
            goto L1d3
        L8e:
            r13 = move-exception
            goto L1d9
        L91:
            r13 = move-exception
            goto L1dd
        L94:
            java.lang.String r1 = r14.getName()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            int r11 = r1.hashCode()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            switch(r11) {
                case -2025855158: goto Le3;
                case -1984451626: goto Ld9;
                case -1269513683: goto Ld0;
                case -1238332596: goto Lc6;
                case -71750448: goto Lbc;
                case 1331510167: goto Lb2;
                case 1791837707: goto La8;
                case 1803088381: goto La0;
                default: goto L9f;
            }     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
        L9f:
            goto Led
        La0:
            boolean r1 = r1.equals(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto Led
            r9 = r2
            goto Lee
        La8:
            java.lang.String r8 = "CustomAttribute"
            boolean r1 = r1.equals(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto Led
            r9 = 7
            goto Lee
        Lb2:
            java.lang.String r8 = "Barrier"
            boolean r1 = r1.equals(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto Led
            r9 = r10
            goto Lee
        Lbc:
            java.lang.String r8 = "Guideline"
            boolean r1 = r1.equals(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto Led
            r9 = r4
            goto Lee
        Lc6:
            java.lang.String r8 = "Transform"
            boolean r1 = r1.equals(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto Led
            r9 = 4
            goto Lee
        Ld0:
            java.lang.String r8 = "PropertySet"
            boolean r1 = r1.equals(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto Led
            goto Lee
        Ld9:
            java.lang.String r8 = "Motion"
            boolean r1 = r1.equals(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto Led
            r9 = 6
            goto Lee
        Le3:
            java.lang.String r8 = "Layout"
            boolean r1 = r1.equals(r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            if (r1 == 0) goto Led
            r9 = 5
            goto Lee
        Led:
            r9 = r6
        Lee:
            java.lang.String r1 = "XML parser error must be within a Constraint "
            switch(r9) {
                case 0: goto L1c7;
                case 1: goto L1ba;
                case 2: goto L1ad;
                case 3: goto L188;
                case 4: goto L163;
                case 5: goto L13d;
                case 6: goto L117;
                case 7: goto Lf5;
                default: goto Lf3;
            }
        Lf3:
            goto L1d3
        Lf5:
            if (r7 == 0) goto Lfe
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.b> r1 = r7.f     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            androidx.constraintlayout.widget.b.a(r13, r14, r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L1d3
        Lfe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.<init>()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            int r14 = r14.getLineNumber()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.String r14 = r2.toString()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r13.<init>(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            throw r13     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
        L117:
            if (r7 == 0) goto L124
            androidx.constraintlayout.widget.e$c r1 = r7.c     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r1.a(r13, r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L1d3
        L124:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.<init>()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            int r14 = r14.getLineNumber()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.String r14 = r2.toString()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r13.<init>(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            throw r13     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
        L13d:
            if (r7 == 0) goto L14a
            androidx.constraintlayout.widget.e$b r1 = r7.d     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r1.a(r13, r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L1d3
        L14a:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.<init>()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            int r14 = r14.getLineNumber()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.String r14 = r2.toString()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r13.<init>(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            throw r13     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
        L163:
            if (r7 == 0) goto L16f
            androidx.constraintlayout.widget.e$e r1 = r7.e     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r1.a(r13, r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L1d3
        L16f:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.<init>()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            int r14 = r14.getLineNumber()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.String r14 = r2.toString()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r13.<init>(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            throw r13     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
        L188:
            if (r7 == 0) goto L194
            androidx.constraintlayout.widget.e$d r1 = r7.b     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r1.a(r13, r8)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L1d3
        L194:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.<init>()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            int r14 = r14.getLineNumber()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r2.append(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            java.lang.String r14 = r2.toString()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r13.<init>(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            throw r13     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
        L1ad:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            androidx.constraintlayout.widget.e$a r7 = androidx.constraintlayout.widget.e.d(r13, r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            androidx.constraintlayout.widget.e$b r1 = r7.d     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r1.c0 = r4     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L1d3
        L1ba:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            androidx.constraintlayout.widget.e$a r7 = androidx.constraintlayout.widget.e.d(r13, r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            androidx.constraintlayout.widget.e$b r1 = r7.d     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            r1.f870a = r4     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L1d3
        L1c7:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r14)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            androidx.constraintlayout.widget.e$a r7 = androidx.constraintlayout.widget.e.d(r13, r1)     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L1d3
        L1d0:
            r14.getName()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
        L1d3:
            int r1 = r14.next()     // Catch: java.io.IOException -> L8e org.xmlpull.v1.XmlPullParserException -> L91
            goto L5e
        L1d9:
            r13.printStackTrace()
            goto L1e0
        L1dd:
            r13.printStackTrace()
        L1e0:
            android.util.SparseArray<androidx.constraintlayout.widget.e> r13 = r12.b
            r13.put(r3, r0)
            goto L1ea
        L1e6:
            int r3 = r3 + 1
            goto Lb
        L1ea:
            return
    }
}
