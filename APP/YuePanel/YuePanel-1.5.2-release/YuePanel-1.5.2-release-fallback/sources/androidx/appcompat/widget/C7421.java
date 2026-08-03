package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7421 extends android.database.DataSetObservable {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean f25785 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f25786 = "ۥ۟";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final java.lang.String f25787 = "historical-records";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final java.lang.String f25788 = "historical-record";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final java.lang.String f25789 = "activity";

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final java.lang.String f25790 = "time";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f25791 = "weight";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f25792 = "activity_choser_model_history.xml";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f25793 = 50;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f25794 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final float f25795 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final java.lang.String f25796 = ".xml";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f25797 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.lang.Object f25798 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final java.util.Map<java.lang.String, androidx.appcompat.widget.C7421> f25799 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object f25800;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<androidx.appcompat.widget.C7421.C7423> f25801;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.List<androidx.appcompat.widget.C7421.C7426> f25802;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final android.content.Context f25803;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.lang.String f25804;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.content.Intent f25805;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.appcompat.widget.C7421.InterfaceC7424 f25806;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f25807;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f25808;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f25809;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f25810;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f25811;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public androidx.appcompat.widget.C7421.InterfaceC7427 f25812;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ, reason: contains not printable characters */
    public interface InterfaceC7422 {
        void setActivityChooserModel(androidx.appcompat.widget.C7421 r1);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟, reason: contains not printable characters */
    public static final class C7423 implements java.lang.Comparable<androidx.appcompat.widget.C7421.C7423> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.content.pm.ResolveInfo f25813;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public float f25814;

        public C7423(android.content.pm.ResolveInfo r1) {
                r0 = this;
                r0.<init>()
                r0.f25813 = r1
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(androidx.appcompat.widget.C7421.C7423 r1) {
                r0 = this;
                androidx.appcompat.widget.ۥ۟$ۥ۟ r1 = (androidx.appcompat.widget.C7421.C7423) r1
                int r1 = r0.m28458(r1)
                return r1
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r5.getClass()
                java.lang.Class<androidx.appcompat.widget.ۥ۟$ۥ۟> r3 = androidx.appcompat.widget.C7421.C7423.class
                if (r3 == r2) goto L11
                return r1
            L11:
                androidx.appcompat.widget.ۥ۟$ۥ۟ r5 = (androidx.appcompat.widget.C7421.C7423) r5
                float r2 = r4.f25814
                int r2 = java.lang.Float.floatToIntBits(r2)
                float r5 = r5.f25814
                int r5 = java.lang.Float.floatToIntBits(r5)
                if (r2 == r5) goto L22
                return r1
            L22:
                return r0
        }

        public int hashCode() {
                r1 = this;
                float r0 = r1.f25814
                int r0 = java.lang.Float.floatToIntBits(r0)
                int r0 = r0 + 31
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "["
                r0.append(r1)
                java.lang.String r1 = "resolveInfo:"
                r0.append(r1)
                android.content.pm.ResolveInfo r1 = r4.f25813
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "; weight:"
                r0.append(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                float r2 = r4.f25814
                double r2 = (double) r2
                r1.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m28458(androidx.appcompat.widget.C7421.C7423 r2) {
                r1 = this;
                float r2 = r2.f25814
                int r2 = java.lang.Float.floatToIntBits(r2)
                float r0 = r1.f25814
                int r0 = java.lang.Float.floatToIntBits(r0)
                int r2 = r2 - r0
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC7424 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo28459(android.content.Intent r1, java.util.List<androidx.appcompat.widget.C7421.C7423> r2, java.util.List<androidx.appcompat.widget.C7421.C7426> r3);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7425 implements androidx.appcompat.widget.C7421.InterfaceC7424 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final float f25815 = 0.95f;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.Map<android.content.ComponentName, androidx.appcompat.widget.C7421.C7423> f25816;

        public C7425() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f25816 = r0
                return
        }

        @Override // androidx.appcompat.widget.C7421.InterfaceC7424
        /* JADX INFO: renamed from: ۥ */
        public void mo28459(android.content.Intent r7, java.util.List<androidx.appcompat.widget.C7421.C7423> r8, java.util.List<androidx.appcompat.widget.C7421.C7426> r9) {
                r6 = this;
                java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ۥ۟$ۥ۟> r7 = r6.f25816
                r7.clear()
                int r0 = r8.size()
                r1 = 0
            La:
                if (r1 >= r0) goto L28
                java.lang.Object r2 = r8.get(r1)
                androidx.appcompat.widget.ۥ۟$ۥ۟ r2 = (androidx.appcompat.widget.C7421.C7423) r2
                r3 = 0
                r2.f25814 = r3
                android.content.ComponentName r3 = new android.content.ComponentName
                android.content.pm.ResolveInfo r4 = r2.f25813
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                java.lang.String r5 = r4.packageName
                java.lang.String r4 = r4.name
                r3.<init>(r5, r4)
                r7.put(r3, r2)
                int r1 = r1 + 1
                goto La
            L28:
                int r0 = r9.size()
                int r0 = r0 + (-1)
                r1 = 1065353216(0x3f800000, float:1.0)
            L30:
                if (r0 < 0) goto L51
                java.lang.Object r2 = r9.get(r0)
                androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟ r2 = (androidx.appcompat.widget.C7421.C7426) r2
                android.content.ComponentName r3 = r2.f25817
                java.lang.Object r3 = r7.get(r3)
                androidx.appcompat.widget.ۥ۟$ۥ۟ r3 = (androidx.appcompat.widget.C7421.C7423) r3
                if (r3 == 0) goto L4e
                float r4 = r3.f25814
                float r2 = r2.f25819
                float r2 = r2 * r1
                float r4 = r4 + r2
                r3.f25814 = r4
                r2 = 1064514355(0x3f733333, float:0.95)
                float r1 = r1 * r2
            L4e:
                int r0 = r0 + (-1)
                goto L30
            L51:
                java.util.Collections.sort(r8)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7426 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.ComponentName f25817;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final long f25818;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final float f25819;

        public C7426(android.content.ComponentName r1, long r2, float r4) {
                r0 = this;
                r0.<init>()
                r0.f25817 = r1
                r0.f25818 = r2
                r0.f25819 = r4
                return
        }

        public C7426(java.lang.String r1, long r2, float r4) {
                r0 = this;
                android.content.ComponentName r1 = android.content.ComponentName.unflattenFromString(r1)
                r0.<init>(r1, r2, r4)
                return
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r7.getClass()
                java.lang.Class<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r3 = androidx.appcompat.widget.C7421.C7426.class
                if (r3 == r2) goto L11
                return r1
            L11:
                androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟ r7 = (androidx.appcompat.widget.C7421.C7426) r7
                android.content.ComponentName r2 = r6.f25817
                if (r2 != 0) goto L1c
                android.content.ComponentName r2 = r7.f25817
                if (r2 == 0) goto L25
                return r1
            L1c:
                android.content.ComponentName r3 = r7.f25817
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L25
                return r1
            L25:
                long r2 = r6.f25818
                long r4 = r7.f25818
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L2e
                return r1
            L2e:
                float r2 = r6.f25819
                int r2 = java.lang.Float.floatToIntBits(r2)
                float r7 = r7.f25819
                int r7 = java.lang.Float.floatToIntBits(r7)
                if (r2 == r7) goto L3d
                return r1
            L3d:
                return r0
        }

        public int hashCode() {
                r6 = this;
                android.content.ComponentName r0 = r6.f25817
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                r1 = 31
                int r0 = r0 + r1
                int r0 = r0 * r1
                long r2 = r6.f25818
                r4 = 32
                long r4 = r2 >>> r4
                long r2 = r2 ^ r4
                int r2 = (int) r2
                int r0 = r0 + r2
                int r0 = r0 * r1
                float r1 = r6.f25819
                int r1 = java.lang.Float.floatToIntBits(r1)
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "["
                r0.append(r1)
                java.lang.String r1 = "; activity:"
                r0.append(r1)
                android.content.ComponentName r1 = r4.f25817
                r0.append(r1)
                java.lang.String r1 = "; time:"
                r0.append(r1)
                long r1 = r4.f25818
                r0.append(r1)
                java.lang.String r1 = "; weight:"
                r0.append(r1)
                java.math.BigDecimal r1 = new java.math.BigDecimal
                float r2 = r4.f25819
                double r2 = (double) r2
                r1.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceC7427 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        boolean mo28460(androidx.appcompat.widget.C7421 r1, android.content.Intent r2);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final class AsyncTaskC7428 extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Void> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.C7421 f25820;

        public AsyncTaskC7428(androidx.appcompat.widget.C7421 r1) {
                r0 = this;
                r0.f25820 = r1
                r0.<init>()
                return
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Void r1 = r0.m28461(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Void m28461(java.lang.Object... r15) {
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                androidx.appcompat.widget.ۥ۟ r7 = r14.f25820     // Catch: java.io.FileNotFoundException -> Le2
                android.content.Context r7 = r7.f25803     // Catch: java.io.FileNotFoundException -> Le2
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch: java.io.FileNotFoundException -> Le2
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r7.startDocument(r8, r9)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r7.startTag(r6, r1)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                int r8 = r4.size()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r9 = r3
            L2f:
                if (r9 >= r8) goto L6a
                java.lang.Object r10 = r4.remove(r3)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟ r10 = (androidx.appcompat.widget.C7421.C7426) r10     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r7.startTag(r6, r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.f25817     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                java.lang.String r12 = r12.flattenToString()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r7.attribute(r6, r11, r12)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                java.lang.String r11 = "time"
                long r12 = r10.f25818     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r7.attribute(r6, r11, r12)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                java.lang.String r11 = "weight"
                float r10 = r10.f25819     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r7.attribute(r6, r11, r10)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r7.endTag(r6, r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                int r9 = r9 + 1
                goto L2f
            L61:
                r0 = move-exception
                goto Ld8
            L64:
                r0 = move-exception
                goto L7a
            L66:
                r0 = move-exception
                goto L99
            L68:
                r0 = move-exception
                goto Lb8
            L6a:
                r7.endTag(r6, r1)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                r7.endDocument()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64 java.lang.IllegalStateException -> L66 java.lang.IllegalArgumentException -> L68
                androidx.appcompat.widget.ۥ۟ r0 = r14.f25820
                r0.f25808 = r5
                if (r15 == 0) goto Ld7
            L76:
                r15.close()     // Catch: java.io.IOException -> Ld7
                goto Ld7
            L7a:
                java.lang.String r1 = androidx.appcompat.widget.C7421.f25786     // Catch: java.lang.Throwable -> L61
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
                r3.<init>()     // Catch: java.lang.Throwable -> L61
                r3.append(r2)     // Catch: java.lang.Throwable -> L61
                androidx.appcompat.widget.ۥ۟ r2 = r14.f25820     // Catch: java.lang.Throwable -> L61
                java.lang.String r2 = r2.f25804     // Catch: java.lang.Throwable -> L61
                r3.append(r2)     // Catch: java.lang.Throwable -> L61
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L61
                android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L61
                androidx.appcompat.widget.ۥ۟ r0 = r14.f25820
                r0.f25808 = r5
                if (r15 == 0) goto Ld7
                goto L76
            L99:
                java.lang.String r1 = androidx.appcompat.widget.C7421.f25786     // Catch: java.lang.Throwable -> L61
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
                r3.<init>()     // Catch: java.lang.Throwable -> L61
                r3.append(r2)     // Catch: java.lang.Throwable -> L61
                androidx.appcompat.widget.ۥ۟ r2 = r14.f25820     // Catch: java.lang.Throwable -> L61
                java.lang.String r2 = r2.f25804     // Catch: java.lang.Throwable -> L61
                r3.append(r2)     // Catch: java.lang.Throwable -> L61
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L61
                android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L61
                androidx.appcompat.widget.ۥ۟ r0 = r14.f25820
                r0.f25808 = r5
                if (r15 == 0) goto Ld7
                goto L76
            Lb8:
                java.lang.String r1 = androidx.appcompat.widget.C7421.f25786     // Catch: java.lang.Throwable -> L61
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
                r3.<init>()     // Catch: java.lang.Throwable -> L61
                r3.append(r2)     // Catch: java.lang.Throwable -> L61
                androidx.appcompat.widget.ۥ۟ r2 = r14.f25820     // Catch: java.lang.Throwable -> L61
                java.lang.String r2 = r2.f25804     // Catch: java.lang.Throwable -> L61
                r3.append(r2)     // Catch: java.lang.Throwable -> L61
                java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L61
                android.util.Log.e(r1, r2, r0)     // Catch: java.lang.Throwable -> L61
                androidx.appcompat.widget.ۥ۟ r0 = r14.f25820
                r0.f25808 = r5
                if (r15 == 0) goto Ld7
                goto L76
            Ld7:
                return r6
            Ld8:
                androidx.appcompat.widget.ۥ۟ r1 = r14.f25820
                r1.f25808 = r5
                if (r15 == 0) goto Le1
                r15.close()     // Catch: java.io.IOException -> Le1
            Le1:
                throw r0
            Le2:
                r0 = move-exception
                java.lang.String r1 = androidx.appcompat.widget.C7421.f25786
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                r3.append(r15)
                java.lang.String r15 = r3.toString()
                android.util.Log.e(r1, r15, r0)
                return r6
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.widget.C7421.f25798 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.appcompat.widget.C7421.f25799 = r0
            return
    }

    public C7421(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f25800 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f25801 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f25802 = r0
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟ r0 = new androidx.appcompat.widget.ۥ۟$ۥ۟۟۟
            r0.<init>()
            r2.f25806 = r0
            r0 = 50
            r2.f25807 = r0
            r0 = 1
            r2.f25808 = r0
            r1 = 0
            r2.f25809 = r1
            r2.f25810 = r0
            r2.f25811 = r1
            android.content.Context r3 = r3.getApplicationContext()
            r2.f25803 = r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L53
            java.lang.String r3 = ".xml"
            boolean r0 = r4.endsWith(r3)
            if (r0 != 0) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.f25804 = r3
            goto L55
        L53:
            r2.f25804 = r4
        L55:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static androidx.appcompat.widget.C7421 m28436(android.content.Context r3, java.lang.String r4) {
            java.lang.Object r0 = androidx.appcompat.widget.C7421.f25798
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.appcompat.widget.ۥ۟> r1 = androidx.appcompat.widget.C7421.f25799     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            androidx.appcompat.widget.ۥ۟ r2 = (androidx.appcompat.widget.C7421) r2     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            androidx.appcompat.widget.ۥ۟ r2 = new androidx.appcompat.widget.ۥ۟     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r2
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m28437(androidx.appcompat.widget.C7421.C7426 r2) {
            r1 = this;
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r0 = r1.f25802
            boolean r2 = r0.add(r2)
            if (r2 == 0) goto L17
            r0 = 1
            r1.f25810 = r0
            r1.m28449()
            r1.m28448()
            r1.m28457()
            r1.notifyChanged()
        L17:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.Intent m28438(int r7) {
            r6 = this;
            java.lang.Object r0 = r6.f25800
            monitor-enter(r0)
            android.content.Intent r1 = r6.f25805     // Catch: java.lang.Throwable -> La
            r2 = 0
            if (r1 != 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        La:
            r7 = move-exception
            goto L51
        Lc:
            r6.m28439()     // Catch: java.lang.Throwable -> La
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r1 = r6.f25801     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.Throwable -> La
            androidx.appcompat.widget.ۥ۟$ۥ۟ r7 = (androidx.appcompat.widget.C7421.C7423) r7     // Catch: java.lang.Throwable -> La
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La
            android.content.pm.ResolveInfo r7 = r7.f25813     // Catch: java.lang.Throwable -> La
            android.content.pm.ActivityInfo r7 = r7.activityInfo     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = r7.packageName     // Catch: java.lang.Throwable -> La
            java.lang.String r7 = r7.name     // Catch: java.lang.Throwable -> La
            r1.<init>(r3, r7)     // Catch: java.lang.Throwable -> La
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Throwable -> La
            android.content.Intent r3 = r6.f25805     // Catch: java.lang.Throwable -> La
            r7.<init>(r3)     // Catch: java.lang.Throwable -> La
            r7.setComponent(r1)     // Catch: java.lang.Throwable -> La
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۠ r3 = r6.f25812     // Catch: java.lang.Throwable -> La
            if (r3 == 0) goto L41
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> La
            r3.<init>(r7)     // Catch: java.lang.Throwable -> La
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۠ r4 = r6.f25812     // Catch: java.lang.Throwable -> La
            boolean r3 = r4.mo28460(r6, r3)     // Catch: java.lang.Throwable -> La
            if (r3 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r2
        L41:
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟ r2 = new androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟     // Catch: java.lang.Throwable -> La
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r1, r3, r5)     // Catch: java.lang.Throwable -> La
            r6.m28437(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r7
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m28439() {
            r2 = this;
            boolean r0 = r2.m28447()
            boolean r1 = r2.m28450()
            r0 = r0 | r1
            r2.m28449()
            if (r0 == 0) goto L14
            r2.m28457()
            r2.notifyChanged()
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.content.pm.ResolveInfo m28440(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f25800
            monitor-enter(r0)
            r2.m28439()     // Catch: java.lang.Throwable -> L12
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r1 = r2.f25801     // Catch: java.lang.Throwable -> L12
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L12
            androidx.appcompat.widget.ۥ۟$ۥ۟ r3 = (androidx.appcompat.widget.C7421.C7423) r3     // Catch: java.lang.Throwable -> L12
            android.content.pm.ResolveInfo r3 = r3.f25813     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r3
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m28441() {
            r2 = this;
            java.lang.Object r0 = r2.f25800
            monitor-enter(r0)
            r2.m28439()     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r1 = r2.f25801     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m28442(android.content.pm.ResolveInfo r6) {
            r5 = this;
            java.lang.Object r0 = r5.f25800
            monitor-enter(r0)
            r5.m28439()     // Catch: java.lang.Throwable -> L1b
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r1 = r5.f25801     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
        Ld:
            if (r3 >= r2) goto L20
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L1b
            androidx.appcompat.widget.ۥ۟$ۥ۟ r4 = (androidx.appcompat.widget.C7421.C7423) r4     // Catch: java.lang.Throwable -> L1b
            android.content.pm.ResolveInfo r4 = r4.f25813     // Catch: java.lang.Throwable -> L1b
            if (r4 != r6) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r3
        L1b:
            r6 = move-exception
            goto L23
        L1d:
            int r3 = r3 + 1
            goto Ld
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r6 = -1
            return r6
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.content.pm.ResolveInfo m28443() {
            r3 = this;
            java.lang.Object r0 = r3.f25800
            monitor-enter(r0)
            r3.m28439()     // Catch: java.lang.Throwable -> L1b
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r1 = r3.f25801     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r1 = r3.f25801     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1b
            androidx.appcompat.widget.ۥ۟$ۥ۟ r1 = (androidx.appcompat.widget.C7421.C7423) r1     // Catch: java.lang.Throwable -> L1b
            android.content.pm.ResolveInfo r1 = r1.f25813     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            return r0
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m28444() {
            r2 = this;
            java.lang.Object r0 = r2.f25800
            monitor-enter(r0)
            int r1 = r2.f25807     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m28445() {
            r2 = this;
            java.lang.Object r0 = r2.f25800
            monitor-enter(r0)
            r2.m28439()     // Catch: java.lang.Throwable -> Le
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r1 = r2.f25802     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.content.Intent m28446() {
            r2 = this;
            java.lang.Object r0 = r2.f25800
            monitor-enter(r0)
            android.content.Intent r1 = r2.f25805     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m28447() {
            r6 = this;
            boolean r0 = r6.f25811
            r1 = 0
            if (r0 == 0) goto L37
            android.content.Intent r0 = r6.f25805
            if (r0 == 0) goto L37
            r6.f25811 = r1
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r0 = r6.f25801
            r0.clear()
            android.content.Context r0 = r6.f25803
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r2 = r6.f25805
            java.util.List r0 = r0.queryIntentActivities(r2, r1)
            int r2 = r0.size()
        L20:
            if (r1 >= r2) goto L35
            java.lang.Object r3 = r0.get(r1)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r4 = r6.f25801
            androidx.appcompat.widget.ۥ۟$ۥ۟ r5 = new androidx.appcompat.widget.ۥ۟$ۥ۟
            r5.<init>(r3)
            r4.add(r5)
            int r1 = r1 + 1
            goto L20
        L35:
            r0 = 1
            return r0
        L37:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m28448() {
            r4 = this;
            boolean r0 = r4.f25809
            if (r0 == 0) goto L2c
            boolean r0 = r4.f25810
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            r4.f25810 = r0
            java.lang.String r0 = r4.f25804
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2b
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟ۡ r0 = new androidx.appcompat.widget.ۥ۟$ۥ۟۟۟ۡ
            r0.<init>(r4)
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r3 = r4.f25802
            r2.<init>(r3)
            java.lang.String r3 = r4.f25804
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            r0.executeOnExecutor(r1, r2)
        L2b:
            return
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No preceding call to #readHistoricalData"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m28449() {
            r4 = this;
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r0 = r4.f25802
            int r0 = r0.size()
            int r1 = r4.f25807
            int r0 = r0 - r1
            if (r0 > 0) goto Lc
            return
        Lc:
            r1 = 1
            r4.f25810 = r1
            r1 = 0
            r2 = r1
        L11:
            if (r2 >= r0) goto L1e
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r3 = r4.f25802
            java.lang.Object r3 = r3.remove(r1)
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟ r3 = (androidx.appcompat.widget.C7421.C7426) r3
            int r2 = r2 + 1
            goto L11
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m28450() {
            r2 = this;
            boolean r0 = r2.f25808
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r2.f25810
            if (r0 == 0) goto L1a
            java.lang.String r0 = r2.f25804
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            r2.f25808 = r1
            r0 = 1
            r2.f25809 = r0
            r2.m28451()
            return r0
        L1a:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m28451() {
            r10 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            android.content.Context r1 = r10.f25803     // Catch: java.io.FileNotFoundException -> Lc5
            java.lang.String r2 = r10.f25804     // Catch: java.io.FileNotFoundException -> Lc5
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> Lc5
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            java.lang.String r3 = "UTF-8"
            r2.setInput(r1, r3)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            r3 = 0
        L14:
            r4 = 1
            if (r3 == r4) goto L27
            r5 = 2
            if (r3 == r5) goto L27
            int r3 = r2.next()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            goto L14
        L1f:
            r0 = move-exception
            goto Lbf
        L22:
            r2 = move-exception
            goto L8c
        L24:
            r2 = move-exception
            goto La5
        L27:
            java.lang.String r3 = "historical-records"
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            if (r3 == 0) goto L84
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r3 = r10.f25802     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            r3.clear()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
        L38:
            int r5 = r2.next()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            if (r5 != r4) goto L45
            if (r1 == 0) goto Lbe
        L40:
            r1.close()     // Catch: java.io.IOException -> Lbe
            goto Lbe
        L45:
            r6 = 3
            if (r5 == r6) goto L38
            r6 = 4
            if (r5 != r6) goto L4c
            goto L38
        L4c:
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            if (r5 == 0) goto L7c
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            java.lang.String r7 = "time"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            java.lang.String r9 = "weight"
            java.lang.String r6 = r2.getAttributeValue(r6, r9)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟ r9 = new androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            r9.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            r3.add(r9)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            goto L38
        L7c:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            java.lang.String r3 = "Share records file not well-formed."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            throw r2     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
        L84:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
            throw r2     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L22 org.xmlpull.v1.XmlPullParserException -> L24
        L8c:
            java.lang.String r3 = androidx.appcompat.widget.C7421.f25786     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r4.<init>()     // Catch: java.lang.Throwable -> L1f
            r4.append(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r10.f25804     // Catch: java.lang.Throwable -> L1f
            r4.append(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L1f
            android.util.Log.e(r3, r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto Lbe
            goto L40
        La5:
            java.lang.String r3 = androidx.appcompat.widget.C7421.f25786     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r4.<init>()     // Catch: java.lang.Throwable -> L1f
            r4.append(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r10.f25804     // Catch: java.lang.Throwable -> L1f
            r4.append(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L1f
            android.util.Log.e(r3, r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto Lbe
            goto L40
        Lbe:
            return
        Lbf:
            if (r1 == 0) goto Lc4
            r1.close()     // Catch: java.io.IOException -> Lc4
        Lc4:
            throw r0
        Lc5:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m28452(androidx.appcompat.widget.C7421.InterfaceC7424 r3) {
            r2 = this;
            java.lang.Object r0 = r2.f25800
            monitor-enter(r0)
            androidx.appcompat.widget.ۥ۟$ۥ۟۟ r1 = r2.f25806     // Catch: java.lang.Throwable -> L9
            if (r1 != r3) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L18
        Lb:
            r2.f25806 = r3     // Catch: java.lang.Throwable -> L9
            boolean r3 = r2.m28457()     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L16
            r2.notifyChanged()     // Catch: java.lang.Throwable -> L9
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m28453(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.f25800
            monitor-enter(r0)
            r5.m28439()     // Catch: java.lang.Throwable -> L22
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r1 = r5.f25801     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.ۥ۟$ۥ۟ r6 = (androidx.appcompat.widget.C7421.C7423) r6     // Catch: java.lang.Throwable -> L22
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r1 = r5.f25801     // Catch: java.lang.Throwable -> L22
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.ۥ۟$ۥ۟ r1 = (androidx.appcompat.widget.C7421.C7423) r1     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            float r1 = r1.f25814     // Catch: java.lang.Throwable -> L22
            float r2 = r6.f25814     // Catch: java.lang.Throwable -> L22
            float r1 = r1 - r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 + r2
            goto L26
        L22:
            r6 = move-exception
            goto L41
        L24:
            r1 = 1065353216(0x3f800000, float:1.0)
        L26:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L22
            android.content.pm.ResolveInfo r6 = r6.f25813     // Catch: java.lang.Throwable -> L22
            android.content.pm.ActivityInfo r6 = r6.activityInfo     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r6.packageName     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r6.name     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L22
            androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟ r6 = new androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟     // Catch: java.lang.Throwable -> L22
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
            r6.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L22
            r5.m28437(r6)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m28454(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f25800
            monitor-enter(r0)
            int r1 = r2.f25807     // Catch: java.lang.Throwable -> L9
            if (r1 != r3) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L1b
        Lb:
            r2.f25807 = r3     // Catch: java.lang.Throwable -> L9
            r2.m28449()     // Catch: java.lang.Throwable -> L9
            boolean r3 = r2.m28457()     // Catch: java.lang.Throwable -> L9
            if (r3 == 0) goto L19
            r2.notifyChanged()     // Catch: java.lang.Throwable -> L9
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m28455(android.content.Intent r3) {
            r2 = this;
            java.lang.Object r0 = r2.f25800
            monitor-enter(r0)
            android.content.Intent r1 = r2.f25805     // Catch: java.lang.Throwable -> L9
            if (r1 != r3) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L15
        Lb:
            r2.f25805 = r3     // Catch: java.lang.Throwable -> L9
            r3 = 1
            r2.f25811 = r3     // Catch: java.lang.Throwable -> L9
            r2.m28439()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m28456(androidx.appcompat.widget.C7421.InterfaceC7427 r2) {
            r1 = this;
            java.lang.Object r0 = r1.f25800
            monitor-enter(r0)
            r1.f25812 = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m28457() {
            r4 = this;
            androidx.appcompat.widget.ۥ۟$ۥ۟۟ r0 = r4.f25806
            if (r0 == 0) goto L29
            android.content.Intent r0 = r4.f25805
            if (r0 == 0) goto L29
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r0 = r4.f25801
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r0 = r4.f25802
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            androidx.appcompat.widget.ۥ۟$ۥ۟۟ r0 = r4.f25806
            android.content.Intent r1 = r4.f25805
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟> r2 = r4.f25801
            java.util.List<androidx.appcompat.widget.ۥ۟$ۥ۟۟۟۟> r3 = r4.f25802
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r0.mo28459(r1, r2, r3)
            r0 = 1
            return r0
        L29:
            r0 = 0
            return r0
    }
}
