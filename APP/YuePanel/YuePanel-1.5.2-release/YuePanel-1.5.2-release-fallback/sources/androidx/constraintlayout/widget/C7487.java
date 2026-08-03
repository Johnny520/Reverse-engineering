package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7487 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f28920 = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f28921 = false;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f28922;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.constraintlayout.widget.C7462 f28923;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f28924;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f28925;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.util.SparseArray<androidx.constraintlayout.widget.C7487.C7488> f28926;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.util.SparseArray<androidx.constraintlayout.widget.C7462> f28927;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.AbstractC1521 f28928;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ, reason: contains not printable characters */
    public static class C7488 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f28929;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.util.ArrayList<androidx.constraintlayout.widget.C7487.C7489> f28930;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f28931;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f28932;

        public C7488(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f28930 = r0
                r0 = -1
                r5.f28931 = r0
                r0 = 0
                r5.f28932 = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28799
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
                int r1 = r7.getIndexCount()
            L1e:
                if (r0 >= r1) goto L5e
                int r2 = r7.getIndex(r0)
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28800
                if (r2 != r3) goto L31
                int r3 = r5.f28929
                int r2 = r7.getResourceId(r2, r3)
                r5.f28929 = r2
                goto L5b
            L31:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28801
                if (r2 != r3) goto L5b
                int r3 = r5.f28931
                int r2 = r7.getResourceId(r2, r3)
                r5.f28931 = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.f28931
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.f28931
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L5b
                r2 = 1
                r5.f28932 = r2
            L5b:
                int r0 = r0 + 1
                goto L1e
            L5e:
                r7.recycle()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m28756(androidx.constraintlayout.widget.C7487.C7489 r2) {
                r1 = this;
                java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r0 = r1.f28930
                r0.add(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m28757(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r1 = r2.f28930
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r1 = r2.f28930
                java.lang.Object r1 = r1.get(r0)
                androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ r1 = (androidx.constraintlayout.widget.C7487.C7489) r1
                boolean r1 = r1.m28758(r3, r4)
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

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟, reason: contains not printable characters */
    public static class C7489 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f28933;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public float f28934;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f28935;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f28936;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f28937;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f28938;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f28939;

        public C7489(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r5.f28934 = r0
                r5.f28935 = r0
                r5.f28936 = r0
                r5.f28937 = r0
                r0 = -1
                r5.f28938 = r0
                r0 = 0
                r5.f28939 = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28900
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r1)
                int r1 = r7.getIndexCount()
            L21:
                if (r0 >= r1) goto L90
                int r2 = r7.getIndex(r0)
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28901
                if (r2 != r3) goto L52
                int r3 = r5.f28938
                int r2 = r7.getResourceId(r2, r3)
                r5.f28938 = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.f28938
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.f28938
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L8d
                r2 = 1
                r5.f28939 = r2
                goto L8d
            L52:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28902
                if (r2 != r3) goto L5f
                float r3 = r5.f28937
                float r2 = r7.getDimension(r2, r3)
                r5.f28937 = r2
                goto L8d
            L5f:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28903
                if (r2 != r3) goto L6c
                float r3 = r5.f28935
                float r2 = r7.getDimension(r2, r3)
                r5.f28935 = r2
                goto L8d
            L6c:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28904
                if (r2 != r3) goto L79
                float r3 = r5.f28936
                float r2 = r7.getDimension(r2, r3)
                r5.f28936 = r2
                goto L8d
            L79:
                int r3 = androidx.constraintlayout.widget.C7473.C7486.f28905
                if (r2 != r3) goto L86
                float r3 = r5.f28934
                float r2 = r7.getDimension(r2, r3)
                r5.f28934 = r2
                goto L8d
            L86:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L8d:
                int r0 = r0 + 1
                goto L21
            L90:
                r7.recycle()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m28758(float r3, float r4) {
                r2 = this;
                float r0 = r2.f28934
                boolean r0 = java.lang.Float.isNaN(r0)
                r1 = 0
                if (r0 != 0) goto L10
                float r0 = r2.f28934
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 >= 0) goto L10
                return r1
            L10:
                float r0 = r2.f28935
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L1f
                float r0 = r2.f28935
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L1f
                return r1
            L1f:
                float r0 = r2.f28936
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L2e
                float r0 = r2.f28936
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L2e
                return r1
            L2e:
                float r3 = r2.f28937
                boolean r3 = java.lang.Float.isNaN(r3)
                if (r3 != 0) goto L3d
                float r3 = r2.f28937
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L3d
                return r1
            L3d:
                r3 = 1
                return r3
        }
    }

    public C7487(android.content.Context r2, org.xmlpull.v1.XmlPullParser r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f28922 = r0
            r1.f28924 = r0
            r1.f28925 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.f28926 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.f28927 = r0
            r0 = 0
            r1.f28928 = r0
            r1.m28751(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m28750(int r5, int r6, float r7, float r8) {
            r4 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ> r0 = r4.f28926
            java.lang.Object r0 = r0.get(r6)
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ r0 = (androidx.constraintlayout.widget.C7487.C7488) r0
            if (r0 != 0) goto Lb
            return r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r1 == 0) goto L3e
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L16
            goto L3e
        L16:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r6 = r0.f28930
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        L1d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r6.next()
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ r2 = (androidx.constraintlayout.widget.C7487.C7489) r2
            boolean r3 = r2.m28758(r7, r8)
            if (r3 == 0) goto L1d
            int r1 = r2.f28938
            if (r5 != r1) goto L34
            return r5
        L34:
            r1 = r2
            goto L1d
        L36:
            if (r1 == 0) goto L3b
            int r5 = r1.f28938
            return r5
        L3b:
            int r5 = r0.f28931
            return r5
        L3e:
            int r6 = r0.f28931
            if (r6 != r5) goto L43
            return r5
        L43:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r6 = r0.f28930
            java.util.Iterator r6 = r6.iterator()
        L49:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ r7 = (androidx.constraintlayout.widget.C7487.C7489) r7
            int r7 = r7.f28938
            if (r5 != r7) goto L49
            return r5
        L5a:
            int r5 = r0.f28931
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m28751(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28811
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.C7473.C7486.f28812
            if (r4 != r5) goto L22
            int r5 = r8.f28922
            int r4 = r0.getResourceId(r4, r5)
            r8.f28922 = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            r0.recycle()
            int r0 = r10.getEventType()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r1 = 0
        L2d:
            r3 = 1
            if (r0 == r3) goto Lc7
            if (r0 == 0) goto Lb7
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L4d
            if (r0 == r5) goto L3c
            goto Lba
        L3c:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto Lba
            return
        L47:
            r9 = move-exception
            goto Lc0
        L4a:
            r9 = move-exception
            goto Lc4
        L4d:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            int r7 = r0.hashCode()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            switch(r7) {
                case 80204913: goto L75;
                case 1301459538: goto L6b;
                case 1382829617: goto L63;
                case 1901439077: goto L59;
                default: goto L58;
            }     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
        L58:
            goto L7f
        L59:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r4 == 0) goto L7f
            r4 = r5
            goto L80
        L63:
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r4 == 0) goto L7f
            r4 = r3
            goto L80
        L6b:
            java.lang.String r4 = "LayoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r4 == 0) goto L7f
            r4 = r2
            goto L80
        L75:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r4 == 0) goto L7f
            r4 = r6
            goto L80
        L7f:
            r4 = -1
        L80:
            if (r4 == 0) goto Lba
            if (r4 == r3) goto Lba
            if (r4 == r6) goto Laa
            if (r4 == r5) goto L9f
            java.lang.String r3 = "ConstraintLayoutStates"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r4.<init>()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            java.lang.String r5 = "unknown tag "
            r4.append(r5)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r4.append(r0)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            java.lang.String r0 = r4.toString()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            android.util.Log.v(r3, r0)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            goto Lba
        L9f:
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ r0 = new androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r1 == 0) goto Lba
            r1.m28756(r0)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            goto Lba
        Laa:
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ r1 = new androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ> r0 = r8.f28926     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            int r3 = r1.f28929     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            r0.put(r3, r1)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            goto Lba
        Lb7:
            r10.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
        Lba:
            int r0 = r10.next()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L2d
        Lc0:
            r9.printStackTrace()
            goto Lc7
        Lc4:
            r9.printStackTrace()
        Lc7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m28752(int r5, float r6, float r7) {
            r4 = this;
            int r0 = r4.f28924
            r1 = 1
            if (r0 == r5) goto L6
            return r1
        L6:
            r2 = -1
            r3 = 0
            if (r5 != r2) goto L13
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ> r5 = r4.f28926
            java.lang.Object r5 = r5.valueAt(r3)
        L10:
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ r5 = (androidx.constraintlayout.widget.C7487.C7488) r5
            goto L1a
        L13:
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ> r5 = r4.f28926
            java.lang.Object r5 = r5.get(r0)
            goto L10
        L1a:
            int r0 = r4.f28925
            if (r0 == r2) goto L2d
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r2 = r5.f28930
            java.lang.Object r0 = r2.get(r0)
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ r0 = (androidx.constraintlayout.widget.C7487.C7489) r0
            boolean r0 = r0.m28758(r6, r7)
            if (r0 == 0) goto L2d
            return r3
        L2d:
            int r0 = r4.f28925
            int r5 = r5.m28757(r6, r7)
            if (r0 != r5) goto L36
            return r3
        L36:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28753(Yue.AbstractC1521 r1) {
            r0 = this;
            r0.f28928 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m28754(int r2, int r3, int r4) {
            r1 = this;
            float r3 = (float) r3
            float r4 = (float) r4
            r0 = -1
            int r2 = r1.m28755(r0, r2, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m28755(int r3, int r4, float r5, float r6) {
            r2 = this;
            r0 = -1
            if (r3 != r4) goto L46
            if (r4 != r0) goto Lf
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ> r4 = r2.f28926
            r1 = 0
            java.lang.Object r4 = r4.valueAt(r1)
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ r4 = (androidx.constraintlayout.widget.C7487.C7488) r4
            goto L19
        Lf:
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ> r4 = r2.f28926
            int r1 = r2.f28924
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ r4 = (androidx.constraintlayout.widget.C7487.C7488) r4
        L19:
            if (r4 != 0) goto L1c
            return r0
        L1c:
            int r1 = r2.f28925
            if (r1 == r0) goto L2f
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r1 = r4.f28930
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ r1 = (androidx.constraintlayout.widget.C7487.C7489) r1
            boolean r1 = r1.m28758(r5, r6)
            if (r1 == 0) goto L2f
            return r3
        L2f:
            int r5 = r4.m28757(r5, r6)
            if (r3 != r5) goto L36
            return r3
        L36:
            if (r5 != r0) goto L3b
            int r3 = r4.f28931
            goto L45
        L3b:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r3 = r4.f28930
            java.lang.Object r3 = r3.get(r5)
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ r3 = (androidx.constraintlayout.widget.C7487.C7489) r3
            int r3 = r3.f28938
        L45:
            return r3
        L46:
            android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ> r3 = r2.f28926
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ r3 = (androidx.constraintlayout.widget.C7487.C7488) r3
            if (r3 != 0) goto L51
            return r0
        L51:
            int r4 = r3.m28757(r5, r6)
            if (r4 != r0) goto L5a
            int r3 = r3.f28931
            goto L64
        L5a:
            java.util.ArrayList<androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟> r3 = r3.f28930
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ r3 = (androidx.constraintlayout.widget.C7487.C7489) r3
            int r3 = r3.f28938
        L64:
            return r3
    }
}
