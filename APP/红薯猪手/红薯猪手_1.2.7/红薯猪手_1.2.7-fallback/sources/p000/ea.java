package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ea implements p000.x3 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.kb f307;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.content.SharedPreferences.Editor f308;

    public static final class a extends p000.o4 implements p000.f3<android.content.SharedPreferences> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final ۟.ea.a f309 = null;

        static {
                ۟.ea$a r0 = new ۟.ea$a
                r0.<init>()
                ۟.ea.a.f309 = r0
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
                r2 = 29
                byte[] r2 = new byte[r2]
                r2 = {x0030: FILL_ARRAY_DATA , data: [125, 43, -1, 51, 85, 56, 103, 44, -13, 115, 66, 125, 124, 37, -31, 120, 94, 35, 118, 33, -2, 109, 67, 33, 48, 39, -3, 115, 64} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x0044: FILL_ARRAY_DATA , data: [30, 68, -110, 29, 38, 83} // fill-array
                java.lang.String r1 = p000.oa.m332(r2, r1)
                r2 = 0
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
                return r0
            L1b:
                r0 = 7
                byte[] r0 = new byte[r0]
                r0 = {x004c: FILL_ARRAY_DATA , data: [-121, -105, 15, -3, -9, 78, -112} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x0054: FILL_ARRAY_DATA , data: [-28, -8, 97, -119, -110, 54} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m191(r0)
                r0 = 0
                throw r0
        }
    }

    public ea() {
            r3 = this;
            r3.<init>()
            ۟.ea$a r0 = ۟.ea.a.f309
            ۟.kb r1 = new ۟.kb
            r1.<init>(r0)
            r3.f307 = r1
            android.content.SharedPreferences r0 = r3.m144()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = 9
            byte[] r1 = new byte[r1]
            r1 = {x002c: FILL_ARRAY_DATA , data: [49, -100, -121, -13, 109, 61, 122, -42, -57} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x0036: FILL_ARRAY_DATA , data: [84, -8, -18, -121, 69, 19} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m188(r1, r0)
            r3.f308 = r0
            return
    }

    @Override // p000.x3
    public final java.lang.String getPath() {
            r3 = this;
            android.content.Context r0 = p000.l3.f736
            if (r0 == 0) goto L2f
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r0 = r0.getParent()
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            java.lang.String r1 = java.io.File.separator
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "shared_prefs"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "com.skyhand.basexphelper.conf.xml"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L2f:
            r0 = 7
            byte[] r0 = new byte[r0]
            r0 = {x0044: FILL_ARRAY_DATA , data: [-121, -105, 15, -3, -9, 78, -112} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x004c: FILL_ARRAY_DATA , data: [-28, -8, 97, -119, -110, 54} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m191(r0)
            r0 = 0
            throw r0
    }

    @Override // p000.x3
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String mo140(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x0034: FILL_ARRAY_DATA , data: [-117, 44, -25} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x003a: FILL_ARRAY_DATA , data: [-32, 73, -98, -42, -83, 11} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r5)
            byte[] r0 = new byte[r0]
            r0 = {x0042: FILL_ARRAY_DATA , data: [-74, -5, -39} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x0048: FILL_ARRAY_DATA , data: [-46, -98, -65, 63, 52, -19} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r6)
            android.content.SharedPreferences r0 = r4.m144()     // Catch: java.lang.ClassCastException -> L31
            java.lang.String r5 = r0.getString(r5, r6)     // Catch: java.lang.ClassCastException -> L31
            if (r5 != 0) goto L2f
            goto L30
        L2f:
            r6 = r5
        L30:
            return r6
        L31:
            java.lang.String r5 = ""
            return r5
    }

    @Override // p000.x3
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void mo141(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x008e: FILL_ARRAY_DATA , data: [-79, -83, -81} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0094: FILL_ARRAY_DATA , data: [-38, -56, -42, 37, -109, 125} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x009c: FILL_ARRAY_DATA , data: [123, 64, -1, -65, -48} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x00a4: FILL_ARRAY_DATA , data: [13, 33, -109, -54, -75, -94} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r5)
            int r0 = r4.length()
            if (r0 != 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            if (r0 == 0) goto L31
            return
        L31:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L41
            android.content.SharedPreferences$Editor r0 = r3.f308
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0.putInt(r4, r5)
            goto L88
        L41:
            boolean r0 = r5 instanceof java.lang.Float
            if (r0 == 0) goto L51
            android.content.SharedPreferences$Editor r0 = r3.f308
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r0.putFloat(r4, r5)
            goto L88
        L51:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L5d
            android.content.SharedPreferences$Editor r0 = r3.f308
            java.lang.String r5 = (java.lang.String) r5
            r0.putString(r4, r5)
            goto L88
        L5d:
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L6d
            android.content.SharedPreferences$Editor r0 = r3.f308
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0.putBoolean(r4, r5)
            goto L88
        L6d:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L7d
            android.content.SharedPreferences$Editor r0 = r3.f308
            java.lang.Number r5 = (java.lang.Number) r5
            long r1 = r5.longValue()
            r0.putLong(r4, r1)
            goto L88
        L7d:
            boolean r0 = r5 instanceof java.util.Set
            if (r0 == 0) goto L88
            android.content.SharedPreferences$Editor r0 = r3.f308
            java.util.Set r5 = (java.util.Set) r5
            r0.putStringSet(r4, r5)
        L88:
            android.content.SharedPreferences$Editor r4 = r3.f308
            r4.apply()
            return
    }

    @Override // p000.x3
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.Set<java.lang.String> mo142(java.lang.String r5, java.util.Set<java.lang.String> r6) {
            r4 = this;
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x003e: FILL_ARRAY_DATA , data: [110, 5, 28} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x0044: FILL_ARRAY_DATA , data: [5, 96, 101, 92, 56, -84} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r5)
            byte[] r0 = new byte[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [-90, 79, 49} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x0052: FILL_ARRAY_DATA , data: [-62, 42, 87, -86, -63, -113} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r6)
            android.content.SharedPreferences r0 = r4.m144()
            java.util.Set r5 = r0.getStringSet(r5, r6)
            if (r5 != 0) goto L2f
            goto L30
        L2f:
            r6 = r5
        L30:
            boolean r5 = r6 instanceof p000.n4
            if (r5 != 0) goto L36
            return r6
        L36:
            java.lang.String r5 = "kotlin.collections.MutableSet"
            p000.sb.m409(r5, r6)
            r5 = 0
            throw r5
    }

    @Override // p000.x3
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final boolean mo143(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [-117, -21, 107} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0022: FILL_ARRAY_DATA , data: [-32, -114, 18, -55, 86, 97} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            android.content.SharedPreferences r0 = r2.m144()
            boolean r3 = r0.getBoolean(r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final android.content.SharedPreferences m144() {
            r3 = this;
            ۟.kb r0 = r3.f307
            java.lang.Object r0 = r0.m238()
            r1 = 13
            byte[] r1 = new byte[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [111, 5, 85, 78, -95, -14, 125, 5, 9, 54, -18, -80, 33} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x002a: FILL_ARRAY_DATA , data: [8, 96, 33, 24, -64, -98} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m188(r1, r0)
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            return r0
    }
}
