package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o7 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final p000.o7 f856 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final p000.kb f857 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final android.content.SharedPreferences.Editor f858 = null;

    public static final class a extends p000.o4 implements p000.f3<android.content.SharedPreferences> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final ۟.o7.a f859 = null;

        static {
                ۟.o7$a r0 = new ۟.o7$a
                r0.<init>()
                ۟.o7.a.f859 = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000.f3
        /* JADX INFO: renamed from: ۥ */
        public final android.content.SharedPreferences mo11() {
                r3 = this;
                android.content.Context r0 = p000.l3.f736
                r1 = 6
                if (r0 == 0) goto L1b
                r2 = 18
                byte[] r2 = new byte[r2]
                r2 = {x0030: FILL_ARRAY_DATA , data: [-79, -120, 52, -56, 104, -81, -85, -113, 56, -120, 127, -22, -96, -126, 58, -119, 105, -96} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x003e: FILL_ARRAY_DATA , data: [-46, -25, 89, -26, 27, -60} // fill-array
                java.lang.String r1 = p000.oa.m332(r2, r1)
                r2 = 0
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
                return r0
            L1b:
                r0 = 7
                byte[] r0 = new byte[r0]
                r0 = {x0046: FILL_ARRAY_DATA , data: [-121, -105, 15, -3, -9, 78, -112} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x004e: FILL_ARRAY_DATA , data: [-28, -8, 97, -119, -110, 54} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m191(r0)
                r0 = 0
                throw r0
        }
    }

    static {
            ۟.o7 r0 = new ۟.o7
            r0.<init>()
            p000.o7.f856 = r0
            ۟.o7$a r0 = ۟.o7.a.f859
            ۟.kb r1 = new ۟.kb
            r1.<init>(r0)
            p000.o7.f857 = r1
            android.content.SharedPreferences r0 = m326()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = 9
            byte[] r1 = new byte[r1]
            r1 = {x0030: FILL_ARRAY_DATA , data: [-15, 66, 20, 48, -14, -111, -70, 8, 84} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x003a: FILL_ARRAY_DATA , data: [-108, 38, 125, 68, -38, -65} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m188(r1, r0)
            p000.o7.f858 = r0
            return
    }

    public o7() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m324(java.lang.String r2, boolean r3) {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [-66, 26, 51} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0022: FILL_ARRAY_DATA , data: [-43, 127, 74, -13, -9, 83} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r2)
            android.content.SharedPreferences r0 = m326()
            boolean r2 = r0.getBoolean(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m325(java.lang.String r3) {
            r0 = 0
            r1 = 3
            byte[] r1 = new byte[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [-111, 23, 55} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x0024: FILL_ARRAY_DATA , data: [-6, 114, 78, 59, -67, -127} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m189(r1, r3)
            android.content.SharedPreferences r1 = m326()
            int r3 = r1.getInt(r3, r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.content.SharedPreferences m326() {
            ۟.kb r0 = p000.o7.f857
            java.lang.Object r0 = r0.m238()
            r1 = 13
            byte[] r1 = new byte[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [-53, 23, -54, -39, 11, 50, -39, 23, -106, -95, 68, 112, -123} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x002a: FILL_ARRAY_DATA , data: [-84, 114, -66, -113, 106, 94} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m188(r1, r0)
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static java.lang.String m327(java.lang.String r4) {
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x0030: FILL_ARRAY_DATA , data: [40, -124, 105} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x0036: FILL_ARRAY_DATA , data: [67, -31, 16, -58, 121, 43} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r4)
            byte[] r0 = new byte[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [3, 57, 39} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x0044: FILL_ARRAY_DATA , data: [103, 92, 65, -27, -15, 91} // fill-array
            p000.oa.m332(r0, r1)
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = m326()
            java.lang.String r4 = r1.getString(r4, r0)
            if (r4 != 0) goto L2d
            goto L2e
        L2d:
            r0 = r4
        L2e:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static void m328(java.lang.String r2) {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [26, -23, -95} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0024: FILL_ARRAY_DATA , data: [113, -116, -40, -127, -72, -81} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r2)
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            android.content.SharedPreferences$Editor r2 = r0.remove(r2)
            r2.apply()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static void m329(java.lang.String r4, java.lang.Object r5) {
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x0082: FILL_ARRAY_DATA , data: [-17, -5, -81} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x0088: FILL_ARRAY_DATA , data: [-124, -98, -42, 74, -78, 125} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r4)
            byte[] r0 = new byte[r0]
            r0 = {x0090: FILL_ARRAY_DATA , data: [123, 96, -71} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x0096: FILL_ARRAY_DATA , data: [26, 14, -64, -4, -49, -40} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r5)
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L34
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0.putInt(r4, r5)
            goto L7b
        L34:
            boolean r0 = r5 instanceof java.lang.Float
            if (r0 == 0) goto L44
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r0.putFloat(r4, r5)
            goto L7b
        L44:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L50
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            java.lang.String r5 = (java.lang.String) r5
            r0.putString(r4, r5)
            goto L7b
        L50:
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L60
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0.putBoolean(r4, r5)
            goto L7b
        L60:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L70
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            java.lang.Number r5 = (java.lang.Number) r5
            long r1 = r5.longValue()
            r0.putLong(r4, r1)
            goto L7b
        L70:
            boolean r0 = r5 instanceof java.util.Set
            if (r0 == 0) goto L7b
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            java.util.Set r5 = (java.util.Set) r5
            r0.putStringSet(r4, r5)
        L7b:
            android.content.SharedPreferences$Editor r4 = p000.o7.f858
            r4.apply()
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final void m330(java.lang.String r3) {
            r2 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [-115, 89, -13} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0020: FILL_ARRAY_DATA , data: [-26, 60, -118, -78, -19, -41} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            r0.remove(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m331(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [120, -56, 8} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x004c: FILL_ARRAY_DATA , data: [19, -83, 113, -3, -66, 26} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r5)
            byte[] r0 = new byte[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [-11, 85, 62} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x005a: FILL_ARRAY_DATA , data: [-108, 59, 71, 117, -43, 119} // fill-array
            p000.oa.m332(r0, r1)
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L30
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.putInt(r5, r6)
            goto L45
        L30:
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 == 0) goto L40
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r0.putFloat(r5, r6)
            goto L45
        L40:
            android.content.SharedPreferences$Editor r0 = p000.o7.f858
            r0.putString(r5, r6)
        L45:
            return
    }
}
