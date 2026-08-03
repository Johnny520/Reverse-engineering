package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7458 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f26086 = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f26087 = false;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.constraintlayout.widget.ConstraintLayout f26088;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7462 f26089;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f26090;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f26091;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.util.SparseArray<androidx.constraintlayout.widget.C7458.C7459> f26092;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.util.SparseArray<androidx.constraintlayout.widget.C7462> f26093;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.AbstractC1521 f26094;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟$ۥ, reason: contains not printable characters */
    public static class C7459 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f26095;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.util.ArrayList<androidx.constraintlayout.widget.C7458.C7460> f26096;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f26097;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public androidx.constraintlayout.widget.C7462 f26098;

        public C7459(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f26096 = r0
                r0 = -1
                r5.f26097 = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = androidx.constraintlayout.widget.C7473.C7486.f28799
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L65
                int r2 = r7.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28800
                if (r2 != r3) goto L2f
                int r3 = r5.f26095
                int r2 = r7.getResourceId(r2, r3)
                r5.f26095 = r2
                goto L62
            L2f:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28801
                if (r2 != r3) goto L62
                int r3 = r5.f26097
                int r2 = r7.getResourceId(r2, r3)
                r5.f26097 = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.f26097
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.f26097
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L62
                androidx.constraintlayout.widget.ۥ۟۟۟۠ r2 = new androidx.constraintlayout.widget.ۥ۟۟۟۠
                r2.<init>()
                r5.f26098 = r2
                int r3 = r5.f26097
                r2.m28626(r6, r3)
            L62:
                int r1 = r1 + 1
                goto L1c
            L65:
                r7.recycle()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m28548(androidx.constraintlayout.widget.C7458.C7460 r2) {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r0 = r1.f26096
                r0.add(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m28549(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r1 = r2.f26096
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r1 = r2.f26096
                java.lang.Object r1 = r1.get(r0)
                androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ r1 = (androidx.constraintlayout.widget.C7458.C7460) r1
                boolean r1 = r1.m28550(r3, r4)
                if (r1 == 0) goto L18
                return r0
            L18:
                int r0 = r0 + 1
                goto L1
            L1b:
                r3 = -1
                return r3
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟, reason: contains not printable characters */
    public static class C7460 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f26099;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public float f26100;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f26101;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f26102;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f26103;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f26104;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public androidx.constraintlayout.widget.C7462 f26105;

        public C7460(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r5.f26100 = r0
                r5.f26101 = r0
                r5.f26102 = r0
                r5.f26103 = r0
                r0 = -1
                r5.f26104 = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = androidx.constraintlayout.widget.C7473.C7486.f28900
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L97
                int r2 = r7.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28901
                if (r2 != r3) goto L59
                int r3 = r5.f26104
                int r2 = r7.getResourceId(r2, r3)
                r5.f26104 = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.f26104
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.f26104
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L94
                androidx.constraintlayout.widget.ۥ۟۟۟۠ r2 = new androidx.constraintlayout.widget.ۥ۟۟۟۠
                r2.<init>()
                r5.f26105 = r2
                int r3 = r5.f26104
                r2.m28626(r6, r3)
                goto L94
            L59:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28902
                if (r2 != r3) goto L66
                float r3 = r5.f26103
                float r2 = r7.getDimension(r2, r3)
                r5.f26103 = r2
                goto L94
            L66:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28903
                if (r2 != r3) goto L73
                float r3 = r5.f26101
                float r2 = r7.getDimension(r2, r3)
                r5.f26101 = r2
                goto L94
            L73:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28904
                if (r2 != r3) goto L80
                float r3 = r5.f26102
                float r2 = r7.getDimension(r2, r3)
                r5.f26102 = r2
                goto L94
            L80:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28905
                if (r2 != r3) goto L8d
                float r3 = r5.f26100
                float r2 = r7.getDimension(r2, r3)
                r5.f26100 = r2
                goto L94
            L8d:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L94:
                int r1 = r1 + 1
                goto L1f
            L97:
                r7.recycle()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m28550(float r3, float r4) {
                r2 = this;
                float r0 = r2.f26100
                boolean r0 = java.lang.Float.isNaN(r0)
                r1 = 0
                if (r0 != 0) goto L10
                float r0 = r2.f26100
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 >= 0) goto L10
                return r1
            L10:
                float r0 = r2.f26101
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L1f
                float r0 = r2.f26101
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L1f
                return r1
            L1f:
                float r0 = r2.f26102
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L2e
                float r0 = r2.f26102
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L2e
                return r1
            L2e:
                float r3 = r2.f26103
                boolean r3 = java.lang.Float.isNaN(r3)
                if (r3 != 0) goto L3d
                float r3 = r2.f26103
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L3d
                return r1
            L3d:
                r3 = 1
                return r3
        }
    }

    public C7458(android.content.Context r2, androidx.constraintlayout.widget.ConstraintLayout r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f26090 = r0
            r1.f26091 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.f26092 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.f26093 = r0
            r0 = 0
            r1.f26094 = r0
            r1.f26088 = r3
            r1.m28543(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m28543(android.content.Context r8, int r9) {
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto Lab
            if (r0 == 0) goto L9b
            r3 = 2
            if (r0 == r3) goto L17
            goto L9e
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L53;
                case 80204913: goto L49;
                case 1382829617: goto L3f;
                case 1657696882: goto L35;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
        L24:
            goto L5d
        L25:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r6
            goto L5e
        L2f:
            r8 = move-exception
            goto La4
        L32:
            r8 = move-exception
            goto La8
        L35:
            java.lang.String r4 = "layoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = 0
            goto L5e
        L3f:
            java.lang.String r4 = "StateSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r2
            goto L5e
        L49:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r3
            goto L5e
        L53:
            java.lang.String r4 = "ConstraintSet"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r4 == 0) goto L5d
            r4 = r5
            goto L5e
        L5d:
            r4 = -1
        L5e:
            if (r4 == 0) goto L9e
            if (r4 == r2) goto L9e
            if (r4 == r3) goto L8e
            if (r4 == r6) goto L83
            if (r4 == r5) goto L7f
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r3.<init>()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r3.append(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            java.lang.String r0 = r3.toString()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            android.util.Log.v(r2, r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L7f:
            r7.m28545(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L83:
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ r0 = new androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            if (r1 == 0) goto L9e
            r1.m28548(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L8e:
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ r1 = new androidx.constraintlayout.widget.ۥ۟۟۟$ۥ     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ> r0 = r7.f26092     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            int r2 = r1.f26095     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            r0.put(r2, r1)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto L9e
        L9b:
            r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
        L9e:
            int r0 = r9.next()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L32
            goto Ld
        La4:
            r8.printStackTrace()
            goto Lab
        La8:
            r8.printStackTrace()
        Lab:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m28544(int r5, float r6, float r7) {
            r4 = this;
            int r0 = r4.f26090
            r1 = 1
            if (r0 == r5) goto L6
            return r1
        L6:
            r2 = -1
            r3 = 0
            if (r5 != r2) goto L13
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ> r5 = r4.f26092
            java.lang.Object r5 = r5.valueAt(r3)
        L10:
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ r5 = (androidx.constraintlayout.widget.C7458.C7459) r5
            goto L1a
        L13:
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ> r5 = r4.f26092
            java.lang.Object r5 = r5.get(r0)
            goto L10
        L1a:
            int r0 = r4.f26091
            if (r0 == r2) goto L2d
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r2 = r5.f26096
            java.lang.Object r0 = r2.get(r0)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ r0 = (androidx.constraintlayout.widget.C7458.C7460) r0
            boolean r0 = r0.m28550(r6, r7)
            if (r0 == 0) goto L2d
            return r3
        L2d:
            int r0 = r4.f26091
            int r5 = r5.m28549(r6, r7)
            if (r0 != r5) goto L36
            return r3
        L36:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28545(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            androidx.constraintlayout.widget.ۥ۟۟۟۠ r0 = new androidx.constraintlayout.widget.ۥ۟۟۟۠
            r0.<init>()
            int r1 = r10.getAttributeCount()
            r2 = 0
        La:
            if (r2 >= r1) goto L63
            java.lang.String r3 = r10.getAttributeName(r2)
            java.lang.String r4 = "id"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L60
            java.lang.String r1 = r10.getAttributeValue(r2)
            java.lang.String r2 = "/"
            boolean r2 = r1.contains(r2)
            r3 = -1
            r5 = 1
            if (r2 == 0) goto L3e
            r2 = 47
            int r2 = r1.indexOf(r2)
            int r2 = r2 + r5
            java.lang.String r2 = r1.substring(r2)
            android.content.res.Resources r6 = r9.getResources()
            java.lang.String r7 = r9.getPackageName()
            int r2 = r6.getIdentifier(r2, r4, r7)
            goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 != r3) goto L57
            int r3 = r1.length()
            if (r3 <= r5) goto L50
            java.lang.String r1 = r1.substring(r5)
            int r2 = java.lang.Integer.parseInt(r1)
            goto L57
        L50:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r3 = "error in parsing id"
            android.util.Log.e(r1, r3)
        L57:
            r0.m28667(r9, r10)
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟۠> r9 = r8.f26093
            r9.put(r2, r0)
            goto L63
        L60:
            int r2 = r2 + 1
            goto La
        L63:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28546(Yue.AbstractC1521 r1) {
            r0 = this;
            r0.f26094 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m28547(int r5, float r6, float r7) {
            r4 = this;
            int r0 = r4.f26090
            r1 = -1
            if (r0 != r5) goto L6c
            if (r5 != r1) goto L11
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ> r5 = r4.f26092
            r0 = 0
            java.lang.Object r5 = r5.valueAt(r0)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ r5 = (androidx.constraintlayout.widget.C7458.C7459) r5
            goto L19
        L11:
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ> r5 = r4.f26092
            java.lang.Object r5 = r5.get(r0)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ r5 = (androidx.constraintlayout.widget.C7458.C7459) r5
        L19:
            int r0 = r4.f26091
            if (r0 == r1) goto L2c
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r2 = r5.f26096
            java.lang.Object r0 = r2.get(r0)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ r0 = (androidx.constraintlayout.widget.C7458.C7460) r0
            boolean r0 = r0.m28550(r6, r7)
            if (r0 == 0) goto L2c
            return
        L2c:
            int r6 = r5.m28549(r6, r7)
            int r7 = r4.f26091
            if (r7 != r6) goto L35
            return
        L35:
            if (r6 != r1) goto L3a
            androidx.constraintlayout.widget.ۥ۟۟۟۠ r7 = r4.f26089
            goto L44
        L3a:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r7 = r5.f26096
            java.lang.Object r7 = r7.get(r6)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ r7 = (androidx.constraintlayout.widget.C7458.C7460) r7
            androidx.constraintlayout.widget.ۥ۟۟۟۠ r7 = r7.f26105
        L44:
            if (r6 != r1) goto L49
            int r5 = r5.f26097
            goto L53
        L49:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r5 = r5.f26096
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ r5 = (androidx.constraintlayout.widget.C7458.C7460) r5
            int r5 = r5.f26104
        L53:
            if (r7 != 0) goto L56
            return
        L56:
            r4.f26091 = r6
            Yue.ۥ۟ۧ۟ۤ r6 = r4.f26094
            if (r6 == 0) goto L5f
            r6.m7663(r1, r5)
        L5f:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r4.f26088
            r7.m28612(r6)
            Yue.ۥ۟ۧ۟ۤ r6 = r4.f26094
            if (r6 == 0) goto Ld6
            r6.m7662(r1, r5)
            goto Ld6
        L6c:
            r4.f26090 = r5
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ> r0 = r4.f26092
            java.lang.Object r0 = r0.get(r5)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ r0 = (androidx.constraintlayout.widget.C7458.C7459) r0
            int r2 = r0.m28549(r6, r7)
            if (r2 != r1) goto L7f
            androidx.constraintlayout.widget.ۥ۟۟۟۠ r3 = r0.f26098
            goto L89
        L7f:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r3 = r0.f26096
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ r3 = (androidx.constraintlayout.widget.C7458.C7460) r3
            androidx.constraintlayout.widget.ۥ۟۟۟۠ r3 = r3.f26105
        L89:
            if (r2 != r1) goto L8e
            int r0 = r0.f26097
            goto L98
        L8e:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟> r0 = r0.f26096
            java.lang.Object r0 = r0.get(r2)
            androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ r0 = (androidx.constraintlayout.widget.C7458.C7460) r0
            int r0 = r0.f26104
        L98:
            if (r3 != 0) goto Lc1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NO Constraint set found ! id="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ", dim ="
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = ", "
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "ConstraintLayoutStates"
            android.util.Log.v(r6, r5)
            return
        Lc1:
            r4.f26091 = r2
            Yue.ۥ۟ۧ۟ۤ r6 = r4.f26094
            if (r6 == 0) goto Lca
            r6.m7663(r5, r0)
        Lca:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r4.f26088
            r3.m28612(r6)
            Yue.ۥ۟ۧ۟ۤ r6 = r4.f26094
            if (r6 == 0) goto Ld6
            r6.m7662(r5, r0)
        Ld6:
            return
    }
}
