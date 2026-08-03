package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.widget.b.a f862a;
    public int b;
    public float c;
    public java.lang.String d;
    public boolean e;
    public int f;

    public enum a extends java.lang.Enum<androidx.constraintlayout.widget.b.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.constraintlayout.widget.b.a f863a = null;
        public static final androidx.constraintlayout.widget.b.a b = null;
        public static final androidx.constraintlayout.widget.b.a c = null;
        public static final androidx.constraintlayout.widget.b.a d = null;
        public static final androidx.constraintlayout.widget.b.a e = null;
        public static final androidx.constraintlayout.widget.b.a f = null;
        public static final androidx.constraintlayout.widget.b.a g = null;
        public static final /* synthetic */ androidx.constraintlayout.widget.b.a[] h = null;

        static {
                androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a
                java.lang.String r1 = "INT_TYPE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.widget.b.a.f863a = r0
                androidx.constraintlayout.widget.b$a r1 = new androidx.constraintlayout.widget.b$a
                java.lang.String r2 = "FLOAT_TYPE"
                r3 = 1
                r1.<init>(r2, r3)
                androidx.constraintlayout.widget.b.a.b = r1
                androidx.constraintlayout.widget.b$a r2 = new androidx.constraintlayout.widget.b$a
                java.lang.String r3 = "COLOR_TYPE"
                r4 = 2
                r2.<init>(r3, r4)
                androidx.constraintlayout.widget.b.a.c = r2
                androidx.constraintlayout.widget.b$a r3 = new androidx.constraintlayout.widget.b$a
                java.lang.String r4 = "COLOR_DRAWABLE_TYPE"
                r5 = 3
                r3.<init>(r4, r5)
                androidx.constraintlayout.widget.b.a.d = r3
                androidx.constraintlayout.widget.b$a r4 = new androidx.constraintlayout.widget.b$a
                java.lang.String r5 = "STRING_TYPE"
                r6 = 4
                r4.<init>(r5, r6)
                androidx.constraintlayout.widget.b.a.e = r4
                androidx.constraintlayout.widget.b$a r5 = new androidx.constraintlayout.widget.b$a
                java.lang.String r6 = "BOOLEAN_TYPE"
                r7 = 5
                r5.<init>(r6, r7)
                androidx.constraintlayout.widget.b.a.f = r5
                androidx.constraintlayout.widget.b$a r6 = new androidx.constraintlayout.widget.b$a
                java.lang.String r7 = "DIMENSION_TYPE"
                r8 = 6
                r6.<init>(r7, r8)
                androidx.constraintlayout.widget.b.a.g = r6
                androidx.constraintlayout.widget.b$a[] r0 = new androidx.constraintlayout.widget.b.a[]{r0, r1, r2, r3, r4, r5, r6}
                androidx.constraintlayout.widget.b.a.h = r0
                return
        }

        a() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static androidx.constraintlayout.widget.b.a valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.widget.b$a> r0 = androidx.constraintlayout.widget.b.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.widget.b$a r1 = (androidx.constraintlayout.widget.b.a) r1
                return r1
        }

        public static androidx.constraintlayout.widget.b.a[] values() {
                androidx.constraintlayout.widget.b$a[] r0 = androidx.constraintlayout.widget.b.a.h
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.widget.b$a[] r0 = (androidx.constraintlayout.widget.b.a[]) r0
                return r0
        }
    }

    public b(androidx.constraintlayout.widget.b r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            androidx.constraintlayout.widget.b$a r1 = r1.f862a
            r0.f862a = r1
            r0.b(r2)
            return
    }

    public static void a(android.content.Context r12, android.content.res.XmlResourceParser r13, java.util.HashMap r14) {
            android.util.AttributeSet r13 = android.util.Xml.asAttributeSet(r13)
            int[] r0 = androidx.constraintlayout.widget.R.styleable.CustomAttribute
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r0)
            int r0 = r13.getIndexCount()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
        L13:
            if (r5 >= r0) goto Ld2
            int r6 = r13.getIndex(r5)
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_attributeName
            r8 = 1
            if (r6 != r7) goto L47
            java.lang.String r1 = r13.getString(r6)
            if (r1 == 0) goto Lce
            int r6 = r1.length()
            if (r6 <= 0) goto Lce
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            char r7 = r1.charAt(r2)
            char r7 = java.lang.Character.toUpperCase(r7)
            r6.append(r7)
            java.lang.String r1 = r1.substring(r8)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            goto Lce
        L47:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customBoolean
            if (r6 != r7) goto L57
            boolean r3 = r13.getBoolean(r6, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            androidx.constraintlayout.widget.b$a r4 = androidx.constraintlayout.widget.b.a.f
            goto Lce
        L57:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customColorValue
            if (r6 != r7) goto L69
            androidx.constraintlayout.widget.b$a r3 = androidx.constraintlayout.widget.b.a.c
            int r4 = r13.getColor(r6, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L65:
            r11 = r4
            r4 = r3
            r3 = r11
            goto Lce
        L69:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customColorDrawableValue
            if (r6 != r7) goto L78
            androidx.constraintlayout.widget.b$a r3 = androidx.constraintlayout.widget.b.a.d
            int r4 = r13.getColor(r6, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L65
        L78:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customPixelDimension
            androidx.constraintlayout.widget.b$a r9 = androidx.constraintlayout.widget.b.a.g
            r10 = 0
            if (r6 != r7) goto L95
            float r3 = r13.getDimension(r6, r10)
            android.content.res.Resources r4 = r12.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r8, r3, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
        L93:
            r4 = r9
            goto Lce
        L95:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customDimension
            if (r6 != r7) goto La2
            float r3 = r13.getDimension(r6, r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L93
        La2:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customFloatValue
            if (r6 != r7) goto Lb3
            androidx.constraintlayout.widget.b$a r3 = androidx.constraintlayout.widget.b.a.b
            r4 = 2143289344(0x7fc00000, float:NaN)
            float r4 = r13.getFloat(r6, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L65
        Lb3:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customIntegerValue
            if (r6 != r7) goto Lc3
            androidx.constraintlayout.widget.b$a r3 = androidx.constraintlayout.widget.b.a.f863a
            r4 = -1
            int r4 = r13.getInteger(r6, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L65
        Lc3:
            int r7 = androidx.constraintlayout.widget.R.styleable.CustomAttribute_customStringValue
            if (r6 != r7) goto Lce
            androidx.constraintlayout.widget.b$a r3 = androidx.constraintlayout.widget.b.a.e
            java.lang.String r4 = r13.getString(r6)
            goto L65
        Lce:
            int r5 = r5 + 1
            goto L13
        Ld2:
            if (r1 == 0) goto Le3
            if (r3 == 0) goto Le3
            androidx.constraintlayout.widget.b r12 = new androidx.constraintlayout.widget.b
            r12.<init>()
            r12.f862a = r4
            r12.b(r3)
            r14.put(r1, r12)
        Le3:
            r13.recycle()
            return
    }

    public final void b(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.widget.b$a r0 = r1.f862a
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L33;
                case 1: goto L2a;
                case 2: goto L21;
                case 3: goto L21;
                case 4: goto L1c;
                case 5: goto L13;
                case 6: goto La;
                default: goto L9;
            }
        L9:
            return
        La:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.c = r2
            return
        L13:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.e = r2
            return
        L1c:
            java.lang.String r2 = (java.lang.String) r2
            r1.d = r2
            return
        L21:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.f = r2
            return
        L2a:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.c = r2
            return
        L33:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.b = r2
            return
    }
}
