package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final og.k f693c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f695b;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "[0-9a-fA-F]{24,64}"
            r0.<init>(r1)
            bb.l.f693c = r0
            return
    }

    public l(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Hchat_real_name_tail_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f694a = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f695b = r2
            return
    }

    public final java.lang.String a(java.lang.String r9) {
            r8 = this;
            if (r9 == 0) goto Lb
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            goto Lc
        Lb:
            r9 = 0
        Lc:
            java.lang.String r0 = ""
            if (r9 != 0) goto L11
            r9 = r0
        L11:
            boolean r1 = zb.c.b(r9)
            if (r1 != 0) goto L18
            goto L7b
        L18:
            java.lang.String r1 = "tail_"
            java.lang.String r1 = r1.concat(r9)
            boolean r2 = fb.v0.A(r9)
            android.content.SharedPreferences r3 = r8.f694a
            java.util.concurrent.ConcurrentHashMap r4 = r8.f695b
            if (r2 != 0) goto L3d
            r4.remove(r9)
            boolean r9 = r3.contains(r1)
            if (r9 == 0) goto L7b
            android.content.SharedPreferences$Editor r9 = r3.edit()
            android.content.SharedPreferences$Editor r9 = r9.remove(r1)
            r9.apply()
            return r0
        L3d:
            java.lang.Object r2 = r4.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L46
            goto L4d
        L46:
            java.lang.String r2 = r3.getString(r1, r0)
            if (r2 != 0) goto L4d
            r2 = r0
        L4d:
            java.lang.String r5 = fb.v0.G(r2)
            int r6 = r5.length()
            if (r6 != 0) goto L58
            goto L67
        L58:
            int r6 = r5.length()
            r7 = 1
            if (r6 != r7) goto L7c
            r6 = 42
            boolean r6 = og.m.i0(r5, r6)
            if (r6 != 0) goto L7c
        L67:
            r4.remove(r9)
            boolean r9 = r3.contains(r1)
            if (r9 == 0) goto L7b
            android.content.SharedPreferences$Editor r9 = r3.edit()
            android.content.SharedPreferences$Editor r9 = r9.remove(r1)
            r9.apply()
        L7b:
            return r0
        L7c:
            r4.put(r9, r5)
            boolean r9 = r5.equals(r2)
            if (r9 != 0) goto L90
            android.content.SharedPreferences$Editor r9 = r3.edit()
            android.content.SharedPreferences$Editor r9 = r9.putString(r1, r5)
            r9.apply()
        L90:
            return r5
    }

    public final y9.f b(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f694a
            java.lang.String r1 = ""
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 == 0) goto Lb
            r1 = r3
        Lb:
            y9.f r3 = a7.a.G(r1)
            return r3
    }

    public final java.lang.String c(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = r4.a(r5)
            int r0 = r5.length()
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r0 = "global_prefix_enable"
            r2 = 0
            android.content.SharedPreferences r3 = r4.f694a
            boolean r0 = r3.getBoolean(r0, r2)
            if (r0 != 0) goto L19
            goto L50
        L19:
            java.lang.String r0 = "global_prefix"
            java.lang.String r0 = r3.getString(r0, r1)
            if (r0 == 0) goto L22
            r1 = r0
        L22:
            java.lang.CharSequence r0 = og.m.R0(r1)
            java.lang.String r0 = r0.toString()
            r1 = 10
            r2 = 32
            java.lang.String r0 = og.t.b0(r0, r1, r2)
            r1 = 13
            java.lang.String r0 = r0.replace(r1, r2)
            r0.getClass()
            r1 = 9
            java.lang.String r0 = r0.replace(r1, r2)
            r0.getClass()
            r1 = 8
            java.lang.String r0 = og.m.P0(r1, r0)
            int r1 = r0.length()
            if (r1 != 0) goto L51
        L50:
            return r5
        L51:
            r1 = 1
            java.lang.String r5 = og.m.Q0(r1, r5)
            java.lang.String r5 = r0.concat(r5)
            return r5
    }

    public final java.lang.String d(int r4) {
            r3 = this;
            r0 = 2
            r1 = 1
            if (r4 == r1) goto Lc
            if (r4 == r0) goto L9
            java.lang.String r2 = "gender_unknown_text"
            goto Le
        L9:
            java.lang.String r2 = "gender_female_text"
            goto Le
        Lc:
            java.lang.String r2 = "gender_male_text"
        Le:
            if (r4 == r1) goto L18
            if (r4 == r0) goto L15
            java.lang.String r4 = ""
            goto L1a
        L15:
            java.lang.String r4 = "女"
            goto L1a
        L18:
            java.lang.String r4 = "男"
        L1a:
            android.content.SharedPreferences r0 = r3.f694a
            java.lang.String r0 = r0.getString(r2, r4)
            if (r0 == 0) goto L23
            r4 = r0
        L23:
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            r0 = 10
            r1 = 32
            java.lang.String r4 = og.t.b0(r4, r0, r1)
            r0 = 13
            java.lang.String r4 = r4.replace(r0, r1)
            r4.getClass()
            r0 = 9
            java.lang.String r4 = r4.replace(r0, r1)
            r4.getClass()
            r0 = 12
            java.lang.String r4 = og.m.P0(r0, r4)
            return r4
    }

    public final boolean e(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.a(r1)
            int r1 = r1.length()
            if (r1 <= 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public final int f(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f694a
            r1 = 400(0x190, float:5.6E-43)
            int r3 = r0.getInt(r3, r1)
            int r3 = fb.v0.h(r3)
            return r3
    }
}
