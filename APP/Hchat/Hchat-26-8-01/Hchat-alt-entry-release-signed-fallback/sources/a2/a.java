package a2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a implements ke.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f50g;

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.f50g = r1
            r0.<init>()
            return
    }

    public a(d1.c0 r1) {
            r0 = this;
            r1 = 0
            r0.f50g = r1
            r0.<init>()
            return
    }

    public a(java.util.ArrayList r2) {
            r1 = this;
            r0 = 11
            r1.f50g = r0
            r1.<init>()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Le
            return
        Le:
            java.lang.String r2 = "Conditions list can't be empty"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public static java.util.List A(org.json.JSONArray r5) {
            if (r5 != 0) goto L5
            tf.t r5 = tf.t.f13167g
            return r5
        L5:
            uf.c r0 = a.a.E()
            int r1 = r5.length()
            r2 = 0
        Le:
            if (r2 < r1) goto L19
            uf.c r5 = a.a.t(r0)
            java.util.List r5 = tf.m.p1(r5)
            return r5
        L19:
            java.lang.String r3 = r5.optString(r2)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L2f
            goto L30
        L2f:
            r3 = 0
        L30:
            if (r3 == 0) goto L35
            r0.add(r3)
        L35:
            int r2 = r2 + 1
            goto Le
    }

    public static java.util.Set B(org.json.JSONArray r5) {
            if (r5 != 0) goto L5
            tf.v r5 = tf.v.f13169g
            return r5
        L5:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        Lf:
            if (r2 < r1) goto L12
            return r0
        L12:
            java.lang.String r3 = r5.optString(r2)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r4 = r3.length()
            if (r4 <= 0) goto L2a
            r0.add(r3)
        L2a:
            int r2 = r2 + 1
            goto Lf
    }

    public static java.util.List C(java.lang.String r19) {
            boolean r0 = og.m.t0(r19)
            if (r0 == 0) goto L8
            goto Lbe
        L8:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lbe
            r1 = r19
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbe
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbe
            r1.<init>()     // Catch: java.lang.Throwable -> Lbe
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Lbe
            r3 = 0
            r4 = r3
        L1a:
            if (r4 < r2) goto L1d
            return r1
        L1d:
            org.json.JSONObject r5 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> Lbe
            if (r5 == 0) goto Lba
            java.lang.String r6 = "id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> Lbe
            boolean r7 = og.m.t0(r6)     // Catch: java.lang.Throwable -> Lbe
            if (r7 == 0) goto L47
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbe
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r8.<init>()     // Catch: java.lang.Throwable -> Lbe
            r8.append(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "_"
            r8.append(r6)     // Catch: java.lang.Throwable -> Lbe
            r8.append(r4)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> Lbe
        L47:
            r8 = r6
            java.lang.String r6 = "name"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> Lbe
            boolean r7 = og.m.t0(r6)     // Catch: java.lang.Throwable -> Lbe
            if (r7 == 0) goto L67
            int r6 = r4 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r7.<init>()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r9 = "模板 "
            r7.append(r9)     // Catch: java.lang.Throwable -> Lbe
            r7.append(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> Lbe
        L67:
            r9 = r6
            java.lang.String r6 = "enabled"
            r7 = 1
            boolean r10 = r5.optBoolean(r6, r7)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "mode"
            int r11 = r5.optInt(r6, r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "targets"
            java.lang.String r12 = r5.optString(r6)     // Catch: java.lang.Throwable -> Lbe
            r12.getClass()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "targetGroupMembers"
            java.lang.String r13 = r5.optString(r6)     // Catch: java.lang.Throwable -> Lbe
            r13.getClass()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "excludes"
            java.lang.String r14 = r5.optString(r6)     // Catch: java.lang.Throwable -> Lbe
            r14.getClass()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "excludeGroupMembers"
            java.lang.String r15 = r5.optString(r6)     // Catch: java.lang.Throwable -> Lbe
            r15.getClass()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "typeAll"
            boolean r16 = r5.optBoolean(r6, r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "types"
            org.json.JSONArray r6 = r5.optJSONArray(r6)     // Catch: java.lang.Throwable -> Lbe
            java.util.Set r17 = D(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r6 = "textKeywords"
            java.lang.String r18 = r5.optString(r6)     // Catch: java.lang.Throwable -> Lbe
            r18.getClass()     // Catch: java.lang.Throwable -> Lbe
            aa.h r7 = new aa.h     // Catch: java.lang.Throwable -> Lbe
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lbe
            r1.add(r7)     // Catch: java.lang.Throwable -> Lbe
        Lba:
            int r4 = r4 + 1
            goto L1a
        Lbe:
            tf.t r0 = tf.t.f13167g
            return r0
    }

    public static java.util.Set D(org.json.JSONArray r5) {
            if (r5 != 0) goto L5
            tf.v r5 = tf.v.f13169g
            return r5
        L5:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        Lf:
            if (r2 < r1) goto L12
            return r0
        L12:
            java.lang.String r3 = r5.optString(r2)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r4 = r3.length()
            if (r4 <= 0) goto L2a
            r0.add(r3)
        L2a:
            int r2 = r2 + 1
            goto Lf
    }

    public static ba.n E(ba.a r6, boolean r7, boolean r8) {
            r6.getClass()
            ba.n[] r0 = ba.n.values()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L27
            r4 = r0[r3]
            ba.a r5 = r4.f616i
            if (r5 != r6) goto L20
            boolean r5 = r4.f618k
            if (r5 != r8) goto L20
            ba.a r5 = ba.a.f548k
            if (r6 == r5) goto L1e
            boolean r5 = r4.f617j
            if (r5 != r7) goto L20
        L1e:
            r5 = 1
            goto L21
        L20:
            r5 = r2
        L21:
            if (r5 == 0) goto L24
            return r4
        L24:
            int r3 = r3 + 1
            goto La
        L27:
            java.lang.String r6 = "Array contains no element matching the predicate."
            j8.o.l(r6)
            r6 = 0
            return r6
    }

    public static long F(long r17, int r19, java.util.Set r20, long r21) {
            r0 = r17
            r2 = r19
            r3 = r20
            r3.getClass()
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L10
            return r4
        L10:
            if (r2 != 0) goto L13
            return r0
        L13:
            r4 = 2
            if (r2 != r4) goto L91
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L22:
            boolean r7 = r5.hasNext()
            r8 = 7
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r5.next()
            r9 = r7
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r11 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 5
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 6
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r8 = 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            java.lang.Integer[] r8 = new java.lang.Integer[]{r10, r11, r12, r13, r14, r15, r16}
            java.util.Set r8 = tf.d0.W(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L22
            r6.add(r7)
            goto L22
        L6b:
            java.util.Set r4 = tf.m.U1(r6)
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L91
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            r5.setTimeInMillis(r0)
            int r5 = r5.get(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L91
            long r0 = b(r0, r2, r4)
        L91:
            r4 = 0
        L92:
            int r5 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r5 > 0) goto La1
            r5 = 400(0x190, float:5.6E-43)
            if (r4 >= r5) goto La1
            long r0 = b(r0, r2, r3)
            int r4 = r4 + 1
            goto L92
        La1:
            return r0
    }

    public static java.util.ArrayList G(java.lang.String r5) {
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\r"
            java.lang.String r2 = "|"
            java.lang.String r3 = ","
            java.lang.String r4 = "，"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r5 = og.m.G0(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L1f
        L2f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L4d
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r2 == 0) goto L38
            r5.add(r1)
            goto L38
        L54:
            return r5
    }

    public static java.lang.String a(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "group_member"
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L9
            goto Lb
        L9:
            java.lang.String r0 = "contact"
        Lb:
            java.lang.CharSequence r1 = og.m.R0(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "|"
            java.lang.String r1 = wb.en.h(r0, r2, r1)
            return r1
    }

    public static long b(long r12, int r14, java.util.Set r15) {
            r15.getClass()
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            return r0
        La:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r12)
            r12 = 5
            r13 = 1
            if (r14 == r13) goto L92
            r1 = 2
            if (r14 == r1) goto L1a
            goto L95
        L1a:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r15.iterator()
        L25:
            boolean r2 = r15.hasNext()
            r3 = 7
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r15.next()
            r4 = r2
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r9 = 6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r5, r6, r7, r8, r9, r10, r11}
            java.util.Set r3 = tf.d0.W(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L25
            r14.add(r2)
            goto L25
        L6c:
            java.util.Set r14 = tf.m.U1(r14)
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L7a
            r0.add(r12, r13)
            goto L95
        L7a:
            r15 = 14
        L7c:
            r0.add(r12, r13)
            int r15 = r15 + (-1)
            if (r15 <= 0) goto L95
            int r1 = r0.get(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r14.contains(r1)
            if (r1 == 0) goto L7c
            goto L95
        L92:
            r0.add(r12, r13)
        L95:
            long r12 = r0.getTimeInMillis()
            return r12
    }

    public static aa.b d(boolean r11, boolean r12) {
            if (r12 == 0) goto L6
            java.lang.String r0 = "默认公众号规则"
        L4:
            r3 = r0
            goto Le
        L6:
            if (r11 == 0) goto Lb
            java.lang.String r0 = "默认群聊规则"
            goto L4
        Lb:
            java.lang.String r0 = "默认私聊规则"
            goto L4
        Le:
            aa.b r1 = new aa.b
            r8 = 0
            java.lang.String r10 = ""
            r5 = 0
            tf.v r6 = tf.v.f13169g
            r7 = 0
            r9 = r6
            r2 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    public static java.lang.String e(java.util.List r20) {
            r20.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r2 = r20.iterator()
        L11:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "contact"
            java.lang.String r5 = "group_member"
            if (r3 == 0) goto L110
            java.lang.Object r3 = r2.next()
            aa.a r3 = (aa.a) r3
            java.lang.String r6 = r3.f105b
            boolean r6 = gg.l.a(r6, r5)
            if (r6 == 0) goto L2b
            r9 = r5
            goto L2c
        L2b:
            r9 = r4
        L2c:
            java.lang.String r4 = r3.f106c
            java.lang.String r10 = q(r9, r4)
            if (r10 == 0) goto L10a
            java.lang.String r4 = r3.f109f
            java.lang.String r5 = "exclude"
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L40
        L3e:
            r13 = r5
            goto L43
        L40:
            java.lang.String r5 = "block"
            goto L3e
        L43:
            java.lang.String r8 = a(r9, r10)
            java.lang.Object r4 = r1.get(r8)
            aa.a r4 = (aa.a) r4
            java.lang.String r5 = r3.f107d
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L5d
            if (r4 == 0) goto L5c
            java.lang.String r5 = r4.f107d
            if (r5 == 0) goto L5c
            goto L5d
        L5c:
            r5 = r10
        L5d:
            r11 = r5
            boolean r12 = r3.f108e
            if (r4 == 0) goto L65
            java.util.Set r6 = r4.f110g
            goto L66
        L65:
            r6 = 0
        L66:
            tf.v r7 = tf.v.f13169g
            if (r6 != 0) goto L6b
            r6 = r7
        L6b:
            java.util.Set r14 = r3.f110g
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L78:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L90
            java.lang.Object r5 = r14.next()
            r16 = r5
            java.lang.String r16 = (java.lang.String) r16
            boolean r16 = og.m.t0(r16)
            if (r16 != 0) goto L78
            r15.add(r5)
            goto L78
        L90:
            java.util.LinkedHashSet r14 = tf.d0.U(r6, r15)
            boolean r5 = r3.f111h
            r15 = 1
            if (r5 != 0) goto La2
            if (r4 == 0) goto La0
            boolean r5 = r4.f111h
            if (r5 != r15) goto La0
            goto La2
        La0:
            r5 = 0
            goto La3
        La2:
            r5 = r15
        La3:
            boolean r6 = r3.f112i
            if (r6 != 0) goto Lb1
            if (r4 == 0) goto Lae
            boolean r6 = r4.f112i
            if (r6 != r15) goto Lae
            goto Lb1
        Lae:
            r16 = 0
            goto Lb3
        Lb1:
            r16 = r15
        Lb3:
            if (r4 == 0) goto Lb8
            java.util.Set r6 = r4.f113j
            goto Lb9
        Lb8:
            r6 = 0
        Lb9:
            if (r6 != 0) goto Lbc
            goto Lbd
        Lbc:
            r7 = r6
        Lbd:
            java.util.Set r6 = r3.f113j
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lca:
            boolean r17 = r6.hasNext()
            if (r17 == 0) goto Le6
            r19 = r2
            java.lang.Object r2 = r6.next()
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            boolean r17 = og.m.t0(r17)
            if (r17 != 0) goto Le3
            r15.add(r2)
        Le3:
            r2 = r19
            goto Lca
        Le6:
            r19 = r2
            java.util.LinkedHashSet r17 = tf.d0.U(r7, r15)
            java.lang.String r2 = r3.f114k
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto Lfe
            if (r4 == 0) goto Lf9
            java.lang.String r2 = r4.f114k
            goto Lfa
        Lf9:
            r2 = 0
        Lfa:
            if (r2 != 0) goto Lfe
            java.lang.String r2 = ""
        Lfe:
            r18 = r2
            aa.a r7 = new aa.a
            r15 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.put(r8, r7)
            goto L10c
        L10a:
            r19 = r2
        L10c:
            r2 = r19
            goto L11
        L110:
            java.util.Collection r1 = r1.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = tf.m.P1(r1)
            java.util.Iterator r1 = r1.iterator()
        L121:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1dd
            java.lang.Object r2 = r1.next()
            aa.a r2 = (aa.a) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r6 = r2.f104a
            java.lang.String r7 = r2.f106c
            java.lang.String r8 = r2.f105b
            boolean r9 = og.m.t0(r6)
            if (r9 == 0) goto L15b
            r8.getClass()
            r7.getClass()
            boolean r6 = r8.equals(r5)
            if (r6 == 0) goto L14c
            r6 = r5
            goto L14d
        L14c:
            r6 = r4
        L14d:
            java.lang.CharSequence r9 = og.m.R0(r7)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "|"
            java.lang.String r6 = wb.en.h(r6, r10, r9)
        L15b:
            java.lang.String r9 = "id"
            r3.put(r9, r6)
            java.lang.String r6 = "targetType"
            r3.put(r6, r8)
            java.lang.String r6 = "targetId"
            r3.put(r6, r7)
            java.lang.String r6 = "label"
            java.lang.String r7 = r2.f107d
            r3.put(r6, r7)
            java.lang.String r6 = "enabled"
            boolean r7 = r2.f108e
            r3.put(r6, r7)
            java.lang.String r6 = "action"
            java.lang.String r7 = r2.f109f
            r3.put(r6, r7)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Set r7 = r2.f110g
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L18c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L19c
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r6.put(r8)
            goto L18c
        L19c:
            java.lang.String r7 = "templateIds"
            r3.put(r7, r6)
            java.lang.String r6 = "customRules"
            boolean r7 = r2.f111h
            r3.put(r6, r7)
            java.lang.String r6 = "typeAll"
            boolean r7 = r2.f112i
            r3.put(r6, r7)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Set r7 = r2.f113j
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L1bc:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1cc
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r6.put(r8)
            goto L1bc
        L1cc:
            java.lang.String r7 = "types"
            r3.put(r7, r6)
            java.lang.String r6 = "textKeywords"
            java.lang.String r2 = r2.f114k
            r3.put(r6, r2)
            r0.put(r3)
            goto L121
        L1dd:
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
    }

    public static java.lang.String f(aa.b r12, boolean r13, boolean r14) {
            if (r14 == 0) goto L6
            java.lang.String r0 = "默认公众号规则"
        L4:
            r3 = r0
            goto Le
        L6:
            if (r13 == 0) goto Lb
            java.lang.String r0 = "默认群聊规则"
            goto L4
        Lb:
            java.lang.String r0 = "默认私聊规则"
            goto L4
        Le:
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            r2 = r13
            r4 = r14
            aa.b r12 = aa.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r14 = "enabled"
            boolean r0 = r12.f118d
            r13.put(r14, r0)
            org.json.JSONArray r14 = new org.json.JSONArray
            r14.<init>()
            java.util.Set r0 = r12.f119e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r14.put(r1)
            goto L36
        L46:
            java.lang.String r0 = "templateIds"
            r13.put(r0, r14)
            java.lang.String r14 = "customRules"
            boolean r0 = r12.f120f
            r13.put(r14, r0)
            java.lang.String r14 = "typeAll"
            boolean r0 = r12.f121g
            r13.put(r14, r0)
            org.json.JSONArray r14 = new org.json.JSONArray
            r14.<init>()
            java.util.Set r0 = r12.f122h
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r14.put(r1)
            goto L66
        L76:
            java.lang.String r0 = "types"
            r13.put(r0, r14)
            java.lang.String r14 = "textKeywords"
            java.lang.String r12 = r12.f123i
            r13.put(r14, r12)
            java.lang.String r12 = r13.toString()
            r12.getClass()
            return r12
    }

    public static java.lang.String g(java.util.List r6) {
            r6.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r6.next()
            aa.h r1 = (aa.h) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.String r4 = r1.f132a
            r2.put(r3, r4)
            java.lang.String r3 = "name"
            java.lang.String r4 = r1.f133b
            r2.put(r3, r4)
            java.lang.String r3 = "enabled"
            boolean r4 = r1.f134c
            r2.put(r3, r4)
            java.lang.String r3 = "mode"
            int r4 = r1.f135d
            r2.put(r3, r4)
            java.lang.String r3 = "targets"
            java.lang.String r4 = r1.f136e
            r2.put(r3, r4)
            java.lang.String r3 = "targetGroupMembers"
            java.lang.String r4 = r1.f137f
            r2.put(r3, r4)
            java.lang.String r3 = "excludes"
            java.lang.String r4 = r1.f138g
            r2.put(r3, r4)
            java.lang.String r3 = "excludeGroupMembers"
            java.lang.String r4 = r1.f139h
            r2.put(r3, r4)
            java.lang.String r3 = "typeAll"
            boolean r4 = r1.f140i
            r2.put(r3, r4)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Set r4 = r1.f141j
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L69:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r3.put(r5)
            goto L69
        L79:
            java.lang.String r4 = "types"
            r2.put(r4, r3)
            java.lang.String r3 = "textKeywords"
            java.lang.String r1 = r1.f142k
            r2.put(r3, r1)
            r0.put(r2)
            goto Lc
        L89:
            java.lang.String r6 = r0.toString()
            r6.getClass()
            return r6
    }

    public static boolean k(android.content.Context r9, java.lang.ClassLoader r10) {
            java.lang.String r0 = "[Hchat:MiniProgramVideoAds] 安装小程序视频广告 Hook 失败: "
            r1 = 0
            if (r10 != 0) goto L6
            return r1
        L6:
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            int r3 = java.lang.System.identityHashCode(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "@"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            java.util.HashSet r3 = ga.a.f4403e
            monitor-enter(r3)
            boolean r4 = r3.contains(r2)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L32
            monitor-exit(r3)
            r9 = 1
            return r9
        L32:
            java.lang.String r4 = "com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding"
            java.lang.Class r10 = h.Hchat.utils.KavaReflector.loadClass(r4, r10)     // Catch: java.lang.Throwable -> L41
            if (r10 != 0) goto L43
            java.lang.String r9 = "[Hchat:MiniProgramVideoAds] 未找到小程序 JS Bridge: com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding"
            fb.v0.m(r9)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r3)
            return r1
        L41:
            r9 = move-exception
            goto Laa
        L43:
            java.lang.String r4 = "subscribeHandler"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L41
            r7.getClass()     // Catch: java.lang.Throwable -> L41
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7, r8}     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Method r10 = h.Hchat.utils.KavaReflector.findMethod(r10, r4, r5)     // Catch: java.lang.Throwable -> L41
            if (r10 == 0) goto La3
            java.lang.Class r4 = r10.getReturnType()     // Catch: java.lang.Throwable -> L41
            java.lang.Class r5 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L41
            boolean r4 = gg.l.a(r4, r5)     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto L67
            goto La3
        L67:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L78
            ea.b r4 = new ea.b     // Catch: java.lang.Throwable -> L78
            r5 = 2
            r4.<init>(r9, r5)     // Catch: java.lang.Throwable -> L78
            r1.b(r10, r4)     // Catch: java.lang.Throwable -> L78
            r3.add(r2)     // Catch: java.lang.Throwable -> L78
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L78
            goto L7f
        L78:
            r9 = move-exception
            sf.f r10 = new sf.f     // Catch: java.lang.Throwable -> L41
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L41
            r9 = r10
        L7f:
            java.lang.Throwable r10 = sf.g.b(r9)     // Catch: java.lang.Throwable -> L41
            if (r10 != 0) goto L86
            goto L9b
        L86:
            java.lang.String r9 = r10.getMessage()     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L41
            r1.append(r9)     // Catch: java.lang.Throwable -> L41
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L41
            fb.v0.n(r9, r10)     // Catch: java.lang.Throwable -> L41
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L41
        L9b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L41
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r3)
            return r9
        La3:
            java.lang.String r9 = "[Hchat:MiniProgramVideoAds] 未找到 subscribeHandler(String,String,int,String)"
            fb.v0.m(r9)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r3)
            return r1
        Laa:
            monitor-exit(r3)
            throw r9
    }

    public static java.util.List m(java.util.List r8) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r8.next()
            aa.h r1 = (aa.h) r1
            java.lang.String r2 = r1.f136e
            java.util.ArrayList r2 = G(r2)
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "block"
            java.lang.String r5 = "contact"
            java.lang.String r6 = "group_member"
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = s(r3)
            if (r7 == 0) goto L38
            r5 = r6
        L38:
            n(r0, r5, r3, r4, r1)
            goto L1f
        L3c:
            java.lang.String r2 = r1.f137f
            java.util.ArrayList r2 = G(r2)
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            n(r0, r6, r3, r4, r1)
            goto L46
        L56:
            java.lang.String r2 = r1.f138g
            java.util.ArrayList r2 = G(r2)
            java.util.Iterator r2 = r2.iterator()
        L60:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "exclude"
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = s(r3)
            if (r7 == 0) goto L76
            r7 = r6
            goto L77
        L76:
            r7 = r5
        L77:
            n(r0, r7, r3, r4, r1)
            goto L60
        L7b:
            java.lang.String r2 = r1.f139h
            java.util.ArrayList r2 = G(r2)
            java.util.Iterator r2 = r2.iterator()
        L85:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            n(r0, r6, r3, r4, r1)
            goto L85
        L95:
            java.util.Collection r8 = r0.values()
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = tf.m.P1(r8)
            return r8
    }

    public static final void n(java.util.LinkedHashMap r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, aa.h r13) {
            java.lang.String r0 = "group_member"
            boolean r10 = gg.l.a(r10, r0)
            if (r10 == 0) goto La
        L8:
            r3 = r0
            goto Ld
        La:
            java.lang.String r0 = "contact"
            goto L8
        Ld:
            java.lang.String r4 = q(r3, r11)
            if (r4 == 0) goto L50
            java.lang.String r10 = a(r3, r4)
            java.lang.Object r11 = r9.get(r10)
            aa.a r11 = (aa.a) r11
            aa.a r1 = new aa.a
            if (r11 == 0) goto L27
            java.lang.String r0 = r11.f104a
            if (r0 == 0) goto L27
            r2 = r0
            goto L28
        L27:
            r2 = r10
        L28:
            if (r11 == 0) goto L30
            java.lang.String r0 = r11.f107d
            if (r0 == 0) goto L30
            r5 = r0
            goto L31
        L30:
            r5 = r4
        L31:
            if (r11 == 0) goto L37
            boolean r0 = r11.f108e
        L35:
            r6 = r0
            goto L39
        L37:
            r0 = 1
            goto L35
        L39:
            if (r11 == 0) goto L3e
            java.util.Set r11 = r11.f110g
            goto L3f
        L3e:
            r11 = 0
        L3f:
            if (r11 != 0) goto L43
            tf.v r11 = tf.v.f13169g
        L43:
            java.lang.String r13 = r13.f132a
            java.util.LinkedHashSet r8 = tf.d0.V(r11, r13)
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.put(r10, r1)
        L50:
            return
    }

    public static java.lang.String o(db.c r9) {
            int r0 = r9.f2185r
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L8
            goto Lbe
        L8:
            java.util.List r0 = u(r9)
            boolean r3 = r0.isEmpty()
            r4 = 0
            if (r3 == 0) goto L15
        L13:
            r3 = r4
            goto L37
        L15:
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L13
            java.lang.Object r5 = r3.next()
            db.a r5 = (db.a) r5
            int r6 = r5.f2166a
            if (r6 != 0) goto L33
            java.lang.String r5 = r5.f2167b
            boolean r5 = og.m.t0(r5)
            if (r5 != 0) goto L33
            r5 = r2
            goto L34
        L33:
            r5 = r4
        L34:
            if (r5 == 0) goto L19
            r3 = r2
        L37:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L3f
            r6 = r4
            goto L62
        L3f:
            java.util.Iterator r5 = r0.iterator()
            r6 = r4
        L44:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L62
            java.lang.Object r7 = r5.next()
            db.a r7 = (db.a) r7
            int r7 = r7.f2166a
            if (r7 != r2) goto L56
            r7 = r2
            goto L57
        L56:
            r7 = r4
        L57:
            if (r7 == 0) goto L44
            int r6 = r6 + 1
            if (r6 < 0) goto L5e
            goto L44
        L5e:
            a.a.P0()
            throw r1
        L62:
            boolean r5 = r0.isEmpty()
            r7 = 2
            if (r5 == 0) goto L6a
            goto L8e
        L6a:
            java.util.Iterator r0 = r0.iterator()
            r5 = r4
        L6f:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r0.next()
            db.a r8 = (db.a) r8
            int r8 = r8.f2166a
            if (r8 != r7) goto L81
            r8 = r2
            goto L82
        L81:
            r8 = r4
        L82:
            if (r8 == 0) goto L6f
            int r5 = r5 + 1
            if (r5 < 0) goto L89
            goto L6f
        L89:
            a.a.P0()
            throw r1
        L8d:
            r4 = r5
        L8e:
            int r9 = r9.f2186s
            if (r9 == 0) goto Lbc
            r0 = 10
            if (r9 == r2) goto Lb1
            if (r9 == r7) goto La9
            r3 = 3
            if (r9 == r3) goto La4
            r0 = 4
            if (r9 == r0) goto La1
            java.lang.String r9 = "请选择朋友圈类型"
            return r9
        La1:
            if (r4 != r2) goto Lae
            goto Lbe
        La4:
            if (r2 > r6) goto Lb9
            if (r6 >= r0) goto Lb9
            goto Lbe
        La9:
            if (r3 != 0) goto Lac
            goto Lbf
        Lac:
            if (r4 == r2) goto Lbe
        Lae:
            java.lang.String r9 = "请选择 1 个朋友圈视频"
            return r9
        Lb1:
            if (r3 != 0) goto Lb4
            goto Lbf
        Lb4:
            if (r2 > r6) goto Lb9
            if (r6 >= r0) goto Lb9
            goto Lbe
        Lb9:
            java.lang.String r9 = "请选择 1-9 张朋友圈图片"
            return r9
        Lbc:
            if (r3 == 0) goto Lbf
        Lbe:
            return r1
        Lbf:
            java.lang.String r9 = "请输入朋友圈文字"
            return r9
    }

    public static db.c p() {
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r0)
            r3 = 12
            r4 = 5
            r2.add(r3, r4)
            r3 = 13
            r4 = 0
            r2.set(r3, r4)
            r3 = 14
            r2.set(r3, r4)
            db.c r5 = new db.c
            r3 = 9999(0x270f, float:1.4012E-41)
            jg.a r4 = jg.d.f6902g
            r6 = 1000(0x3e8, float:1.401E-42)
            int r3 = r4.c(r6, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "task_"
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r0 = "_"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r6 = r4.toString()
            long r12 = r2.getTimeInMillis()
            r26 = 0
            r28 = 0
            r7 = 0
            java.lang.String r8 = ""
            tf.t r9 = tf.t.f13167g
            r14 = 0
            tf.v r15 = tf.v.f13169g
            r16 = 0
            r17 = 0
            r18 = 1
            java.lang.String r19 = "pending"
            r20 = 0
            r22 = 0
            r23 = 0
            java.lang.String r24 = ""
            r25 = 0
            r10 = r9
            r11 = r9
            r27 = r9
            r29 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)
            return r5
    }

    public static java.lang.String q(java.lang.String r1, java.lang.String r2) {
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            int r0 = r2.length()
            if (r0 != 0) goto L10
            r1 = 0
            return r1
        L10:
            java.lang.String r0 = "group_member"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1d
            java.lang.String r1 = s(r2)
            return r1
        L1d:
            return r2
    }

    public static db.c r(db.c r38) {
            r1 = r38
            r1.getClass()
            int r0 = r1.f2185r
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r26 = 0
            r3 = 1
            if (r0 == 0) goto L15
            if (r0 != r3) goto L13
            goto L15
        L13:
            r2 = r26
        L15:
            r0 = 0
            if (r2 == 0) goto L1d
            int r2 = r2.intValue()
            goto L1e
        L1d:
            r2 = r0
        L1e:
            int r4 = r1.f2186s
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 5
            if (r4 < 0) goto L2a
            if (r4 >= r6) goto L2a
            goto L2c
        L2a:
            r5 = r26
        L2c:
            if (r5 == 0) goto L35
            int r4 = r5.intValue()
            r21 = r4
            goto L37
        L35:
            r21 = r0
        L37:
            if (r2 != 0) goto L51
            int r4 = r1.f2188u
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r4 == 0) goto L46
            if (r4 != r3) goto L44
            goto L46
        L44:
            r5 = r26
        L46:
            if (r5 == 0) goto L4d
            int r4 = r5.intValue()
            goto L4e
        L4d:
            r4 = r0
        L4e:
            r27 = r4
            goto L53
        L51:
            r27 = r0
        L53:
            if (r2 != r3) goto L9f
            r24 = 0
            r25 = 3932159(0x3bffff, float:5.510128E-39)
            r20 = r2
            r2 = 0
            r4 = r3
            r3 = 0
            r5 = r4
            r4 = 0
            r7 = r5
            r5 = 0
            r8 = r6
            r6 = 0
            r10 = r7
            r9 = r8
            r7 = 0
            r11 = r9
            r9 = 0
            r12 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r12
            r12 = 0
            r15 = r13
            r13 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r18 = r16
            r15 = 0
            r19 = r17
            r17 = 0
            r22 = r18
            r18 = 0
            r23 = r19
            r19 = 0
            r28 = r20
            r20 = 0
            r29 = r22
            r22 = 0
            r30 = r23
            r23 = 0
            db.c r2 = db.c.a(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.util.List r2 = u(r2)
        L9c:
            r22 = r2
            goto Laa
        L9f:
            r28 = r2
            r29 = r3
            r30 = r6
            java.util.ArrayList r2 = t(r1)
            goto L9c
        Laa:
            java.lang.Object r2 = tf.m.v1(r22)
            db.a r2 = (db.a) r2
            if (r2 == 0) goto Lb5
            int r2 = r2.f2166a
            goto Lcb
        Lb5:
            int r2 = r1.f2169b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto Lc3
            r4 = 9
            if (r2 >= r4) goto Lc3
            r26 = r3
        Lc3:
            if (r26 == 0) goto Lca
            int r2 = r26.intValue()
            goto Lcb
        Lca:
            r2 = r0
        Lcb:
            r3 = 6
            tf.t r4 = tf.t.f13167g
            if (r2 == 0) goto Ld5
            if (r2 != r3) goto Ld3
            goto Ld5
        Ld3:
            r6 = r4
            goto L112
        Ld5:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r22.iterator()
        Lde:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lf3
            java.lang.Object r7 = r6.next()
            r8 = r7
            db.a r8 = (db.a) r8
            int r8 = r8.f2166a
            if (r8 != r2) goto Lde
            r5.add(r7)
            goto Lde
        Lf3:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r5)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L100:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L112
            java.lang.Object r7 = r5.next()
            db.a r7 = (db.a) r7
            java.lang.String r7 = r7.f2167b
            r6.add(r7)
            goto L100
        L112:
            if (r2 == 0) goto L161
            if (r2 != r3) goto L117
            goto L161
        L117:
            r5 = 8
            if (r2 == r5) goto L161
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r22.iterator()
        L124:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L139
            java.lang.Object r8 = r7.next()
            r9 = r8
            db.a r9 = (db.a) r9
            int r9 = r9.f2166a
            if (r9 != r2) goto L124
            r5.add(r8)
            goto L124
        L139:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = tf.n.e1(r5)
            r7.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L146:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L158
            java.lang.Object r8 = r5.next()
            db.a r8 = (db.a) r8
            java.lang.String r8 = r8.f2167b
            r7.add(r8)
            goto L146
        L158:
            java.util.Set r5 = tf.m.T1(r7)
            java.util.List r5 = tf.m.P1(r5)
            goto L162
        L161:
            r5 = r4
        L162:
            java.util.List r24 = v(r1)
            java.lang.String r7 = r1.f2184q
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r19 = r7.toString()
            java.lang.Object r7 = tf.m.v1(r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L17a
            java.lang.String r7 = ""
        L17a:
            if (r28 != 0) goto L1c3
            java.util.List r4 = r1.f2173f
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = tf.n.e1(r4)
            r8.<init>(r9)
            java.util.Iterator r4 = r4.iterator()
        L18b:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L19b
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            j8.b.r(r9, r8)
            goto L18b
        L19b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1a4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L1bb
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = og.m.t0(r10)
            if (r10 != 0) goto L1a4
            r4.add(r9)
            goto L1a4
        L1bb:
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r4 = tf.m.P1(r4)
        L1c3:
            java.util.Set r8 = r1.f2176i
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1d0:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L217
            java.lang.Object r10 = r8.next()
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r12 = 2
            java.lang.Integer r31 = java.lang.Integer.valueOf(r12)
            r12 = 3
            java.lang.Integer r32 = java.lang.Integer.valueOf(r12)
            r12 = 4
            java.lang.Integer r33 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r30)
            java.lang.Integer r35 = java.lang.Integer.valueOf(r3)
            r12 = 7
            java.lang.Integer r36 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r37 = java.lang.Integer.valueOf(r29)
            java.lang.Integer[] r12 = new java.lang.Integer[]{r31, r32, r33, r34, r35, r36, r37}
            java.util.Set r12 = tf.d0.W(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto L1d0
            r9.add(r10)
            goto L1d0
        L217:
            java.util.Set r10 = tf.m.U1(r9)
            int r3 = r1.f2177j
            r8 = 3600(0xe10, float:5.045E-42)
            int r11 = r9.e0.r(r3, r0, r8)
            int r3 = r1.f2178k
            int r12 = r9.e0.r(r3, r0, r8)
            java.lang.Object r0 = tf.m.v1(r24)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L236
            long r8 = r0.longValue()
            goto L238
        L236:
            r8 = 0
        L238:
            r18 = 0
            r25 = 59521(0xe881, float:8.3407E-41)
            r3 = r7
            r7 = r8
            r9 = 0
            r13 = 0
            java.lang.String r14 = "pending"
            r15 = 0
            r17 = 0
            r20 = r6
            r6 = r4
            r4 = r20
            r23 = r27
            r20 = r28
            db.c r0 = db.c.a(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
    }

    public static java.lang.String s(java.lang.String r7) {
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x008a: FILL_ARRAY_DATA , data: [47, 35, 58, -230} // fill-array
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r0) goto L28
            char r5 = r1[r4]
            r6 = 6
            int r5 = og.m.q0(r7, r5, r3, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L15
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L31:
            boolean r2 = r1.hasNext()
            r4 = 1
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            r5 = r2
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L46
            goto L47
        L46:
            r4 = r3
        L47:
            if (r4 == 0) goto L31
            r0.add(r2)
            goto L31
        L4d:
            java.lang.Comparable r0 = tf.m.D1(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L87
            int r0 = r0.intValue()
            java.lang.String r1 = r7.substring(r3, r0)
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            int r0 = r0 + r4
            java.lang.String r7 = r7.substring(r0)
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            int r0 = r1.length()
            if (r0 != 0) goto L79
            goto L87
        L79:
            int r0 = r7.length()
            if (r0 != 0) goto L80
            goto L87
        L80:
            java.lang.String r0 = "/"
            java.lang.String r7 = wb.en.h(r1, r0, r7)
            return r7
        L87:
            r7 = 0
            return r7
    }

    public static java.util.ArrayList t(db.c r6) {
            r6.getClass()
            int r0 = r6.f2169b
            java.util.List r1 = r6.f2187t
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 == 0) goto Lb5
            if (r0 == 0) goto L38
            r1 = 6
            if (r0 != r1) goto L14
            goto L38
        L14:
            java.util.List r6 = r6.f2172e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r6)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L23:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            db.a r4 = new db.a
            r4.<init>(r0, r2)
            r1.add(r4)
            goto L23
        L38:
            java.util.List r1 = r6.f2171d
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            java.lang.String r6 = r6.f2170c
            boolean r1 = og.m.t0(r6)
            if (r1 != 0) goto L49
            goto L4a
        L49:
            r6 = r3
        L4a:
            if (r6 == 0) goto L52
            java.util.List r6 = a.a.x0(r6)
        L50:
            r1 = r6
            goto L55
        L52:
            tf.t r6 = tf.t.f13167g
            goto L50
        L55:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = tf.n.e1(r1)
            r6.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            j8.b.r(r2, r6)
            goto L62
        L72:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L7b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L7b
            r1.add(r2)
            goto L7b
        L92:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = tf.n.e1(r1)
            r6.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L9f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            db.a r4 = new db.a
            r4.<init>(r0, r2)
            r6.add(r4)
            goto L9f
        Lb4:
            r1 = r6
        Lb5:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r1.iterator()
        Lbe:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lfd
            java.lang.Object r1 = r0.next()
            db.a r1 = (db.a) r1
            int r2 = r1.f2166a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto Ld7
            r5 = 9
            if (r2 >= r5) goto Ld7
            goto Ld8
        Ld7:
            r4 = r3
        Ld8:
            if (r4 == 0) goto Ldf
            int r2 = r4.intValue()
            goto Le0
        Ldf:
            r2 = 0
        Le0:
            java.lang.String r1 = r1.f2167b
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r4 = og.m.t0(r1)
            if (r4 == 0) goto Lf2
            r4 = r3
            goto Lf7
        Lf2:
            db.a r4 = new db.a
            r4.<init>(r2, r1)
        Lf7:
            if (r4 == 0) goto Lbe
            r6.add(r4)
            goto Lbe
        Lfd:
            return r6
    }

    public static java.util.List u(db.c r10) {
            java.util.List r0 = r10.f2187t
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            java.util.ArrayList r0 = t(r10)
        Lc:
            java.util.Iterator r1 = r0.iterator()
        L10:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            r6 = r2
            db.a r6 = (db.a) r6
            int r6 = r6.f2166a
            if (r6 != 0) goto L26
            r6 = r4
            goto L27
        L26:
            r6 = r3
        L27:
            if (r6 == 0) goto L10
            goto L2b
        L2a:
            r2 = r5
        L2b:
            db.a r2 = (db.a) r2
            if (r2 == 0) goto L3c
            java.lang.String r1 = r2.f2167b
            if (r1 == 0) goto L3c
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            goto L3d
        L3c:
            r1 = r5
        L3d:
            java.lang.String r2 = ""
            if (r1 != 0) goto L42
            r1 = r2
        L42:
            dg.n r6 = new dg.n
            r7 = 6
            r6.<init>(r0, r7)
            b4.b r7 = new b4.b
            r8 = 25
            r7.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r6, r4, r7)
            b4.b r6 = new b4.b
            r7 = 26
            r6.<init>(r7)
            ng.t r6 = ng.m.W(r8, r6)
            b4.b r7 = new b4.b
            r8 = 27
            r7.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r6, r4, r7)
            ng.c r6 = ng.m.S(r8)
            r7 = 9
            ng.j r6 = ng.m.Z(r6, r7)
            b4.b r7 = new b4.b
            r8 = 28
            r7.<init>(r8)
            ng.t r6 = ng.m.W(r6, r7)
            java.util.List r6 = ng.m.b0(r6)
            java.util.Iterator r0 = r0.iterator()
        L88:
            boolean r7 = r0.hasNext()
            r8 = 2
            if (r7 == 0) goto La0
            java.lang.Object r7 = r0.next()
            r9 = r7
            db.a r9 = (db.a) r9
            int r9 = r9.f2166a
            if (r9 != r8) goto L9c
            r9 = r4
            goto L9d
        L9c:
            r9 = r3
        L9d:
            if (r9 == 0) goto L88
            goto La1
        La0:
            r7 = r5
        La1:
            db.a r7 = (db.a) r7
            if (r7 == 0) goto Lb2
            java.lang.String r0 = r7.f2167b
            if (r0 == 0) goto Lb2
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto Lb3
        Lb2:
            r0 = r5
        Lb3:
            if (r0 != 0) goto Lb6
            goto Lb7
        Lb6:
            r2 = r0
        Lb7:
            boolean r0 = og.m.t0(r2)
            if (r0 != 0) goto Lc5
            boolean r0 = eh.a.y(r2)
            if (r0 == 0) goto Lc5
            r0 = r4
            goto Lc6
        Lc5:
            r0 = r3
        Lc6:
            if (r0 == 0) goto Lc9
            goto Lca
        Lc9:
            r2 = r5
        Lca:
            if (r2 == 0) goto Ld2
            db.a r0 = new db.a
            r0.<init>(r8, r2)
            goto Ld3
        Ld2:
            r0 = r5
        Ld3:
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto Lda
            goto Ldb
        Lda:
            r1 = r5
        Ldb:
            if (r1 == 0) goto Le2
            db.a r5 = new db.a
            r5.<init>(r3, r1)
        Le2:
            int r10 = r10.f2186s
            if (r10 == 0) goto L10b
            if (r10 == r4) goto L102
            if (r10 == r8) goto Lf9
            r1 = 3
            if (r10 == r1) goto Lf8
            r1 = 4
            if (r10 == r1) goto Lf3
            tf.t r10 = tf.t.f13167g
            return r10
        Lf3:
            java.util.List r10 = a.a.A0(r0)
            return r10
        Lf8:
            return r6
        Lf9:
            db.a[] r10 = new db.a[]{r5, r0}
            java.util.ArrayList r10 = a.a.z0(r10)
            return r10
        L102:
            java.util.List r10 = a.a.A0(r5)
            java.util.ArrayList r10 = tf.m.F1(r10, r6)
            return r10
        L10b:
            java.util.List r10 = a.a.A0(r5)
            return r10
    }

    public static java.util.List v(db.c r3) {
            r3.getClass()
            java.util.List r0 = r3.f2189v
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            long r0 = r3.f2174g
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.util.List r0 = a.a.x0(r3)
        L15:
            dg.n r3 = new dg.n
            r1 = 6
            r3.<init>(r0, r1)
            b4.b r0 = new b4.b
            r1 = 24
            r0.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r3, r2, r0)
            ng.c r3 = ng.m.S(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ng.m.a0(r3, r0)
            tf.q.f1(r0)
            java.util.Iterator r3 = r0.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L44
            tf.t r3 = tf.t.f13167g
            return r3
        L44:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            java.util.List r3 = a.a.x0(r0)
            return r3
        L53:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
        L5b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r3.next()
            r1.add(r0)
            goto L5b
        L69:
            return r1
    }

    public static java.util.List w(java.lang.String r21) {
            boolean r0 = og.m.t0(r21)
            if (r0 == 0) goto L8
            goto L17c
        L8:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L17c
            r1 = r21
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17c
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L17c
            r1.<init>()     // Catch: java.lang.Throwable -> L17c
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L17c
            r4 = 0
        L19:
            if (r4 < r2) goto L29
            java.util.Collection r0 = r1.values()     // Catch: java.lang.Throwable -> L17c
            r0.getClass()     // Catch: java.lang.Throwable -> L17c
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L17c
            java.util.List r0 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> L17c
            return r0
        L29:
            org.json.JSONObject r5 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L17c
            if (r5 == 0) goto L174
            java.lang.String r6 = "targetType"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L17c
            r6.getClass()     // Catch: java.lang.Throwable -> L17c
            java.lang.String r7 = "group_member"
            boolean r6 = gg.l.a(r6, r7)     // Catch: java.lang.Throwable -> L17c
            if (r6 == 0) goto L42
        L40:
            r10 = r7
            goto L45
        L42:
            java.lang.String r7 = "contact"
            goto L40
        L45:
            java.lang.String r6 = "targetId"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L17c
            r6.getClass()     // Catch: java.lang.Throwable -> L17c
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L17c
            java.lang.String r11 = q(r10, r6)     // Catch: java.lang.Throwable -> L17c
            if (r11 == 0) goto L174
            java.lang.String r6 = "action"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L17c
            boolean r7 = og.m.t0(r6)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r8 = "block"
            if (r7 == 0) goto L6b
            r6 = r8
        L6b:
            java.lang.String r7 = "exclude"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L17c
            r9 = 0
            if (r7 == 0) goto L75
            goto L76
        L75:
            r6 = r9
        L76:
            if (r6 == 0) goto L7a
            r14 = r6
            goto L7b
        L7a:
            r14 = r8
        L7b:
            java.lang.String r6 = "templateIds"
            org.json.JSONArray r6 = r5.optJSONArray(r6)     // Catch: java.lang.Throwable -> L17c
            java.util.Set r6 = B(r6)     // Catch: java.lang.Throwable -> L17c
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L17c
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> L17c
            tf.v r8 = tf.v.f13169g
            r12 = 1
            if (r7 == 0) goto Lb8
            java.lang.String r6 = "templateId"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L17c
            r6.getClass()     // Catch: java.lang.Throwable -> L17c
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L17c
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L17c
            if (r7 <= 0) goto La9
            r7 = r12
            goto Laa
        La9:
            r7 = 0
        Laa:
            if (r7 == 0) goto Lad
            goto Lae
        Lad:
            r6 = r9
        Lae:
            if (r6 == 0) goto Lb7
            java.util.Set r6 = ac.p.N(r6)     // Catch: java.lang.Throwable -> L17c
            java.util.Set r6 = (java.util.Set) r6     // Catch: java.lang.Throwable -> L17c
            goto Lb8
        Lb7:
            r6 = r8
        Lb8:
            java.util.Set r6 = (java.util.Set) r6     // Catch: java.lang.Throwable -> L17c
            r7 = r9
            java.lang.String r9 = a(r10, r11)     // Catch: java.lang.Throwable -> L17c
            java.lang.Object r13 = r1.get(r9)     // Catch: java.lang.Throwable -> L17c
            aa.a r13 = (aa.a) r13     // Catch: java.lang.Throwable -> L17c
            java.lang.String r15 = "label"
            java.lang.String r15 = r5.optString(r15)     // Catch: java.lang.Throwable -> L17c
            boolean r16 = og.m.t0(r15)     // Catch: java.lang.Throwable -> L17c
            if (r16 == 0) goto Ld9
            if (r13 == 0) goto Ld8
            java.lang.String r15 = r13.f107d     // Catch: java.lang.Throwable -> L17c
            if (r15 == 0) goto Ld8
            goto Ld9
        Ld8:
            r15 = r11
        Ld9:
            java.lang.String r3 = "enabled"
            if (r13 == 0) goto Ldf
            boolean r12 = r13.f108e     // Catch: java.lang.Throwable -> L17c
        Ldf:
            boolean r3 = r5.optBoolean(r3, r12)     // Catch: java.lang.Throwable -> L17c
            if (r13 == 0) goto Le8
            java.util.Set r12 = r13.f110g     // Catch: java.lang.Throwable -> L17c
            goto Le9
        Le8:
            r12 = r7
        Le9:
            if (r12 != 0) goto Lec
            r12 = r8
        Lec:
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L17c
            java.util.LinkedHashSet r6 = tf.d0.U(r12, r6)     // Catch: java.lang.Throwable -> L17c
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17c
            r12.<init>()     // Catch: java.lang.Throwable -> L17c
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L17c
        Lfb:
            boolean r16 = r6.hasNext()     // Catch: java.lang.Throwable -> L17c
            if (r16 == 0) goto L114
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L17c
            r17 = r7
            java.lang.String r17 = (java.lang.String) r17     // Catch: java.lang.Throwable -> L17c
            boolean r17 = og.m.t0(r17)     // Catch: java.lang.Throwable -> L17c
            if (r17 != 0) goto L112
            r12.add(r7)     // Catch: java.lang.Throwable -> L17c
        L112:
            r7 = 0
            goto Lfb
        L114:
            java.util.Set r6 = tf.m.U1(r12)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r7 = "customRules"
            if (r13 == 0) goto L11f
            boolean r12 = r13.f111h     // Catch: java.lang.Throwable -> L17c
            goto L120
        L11f:
            r12 = 0
        L120:
            boolean r7 = r5.optBoolean(r7, r12)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r12 = "typeAll"
            if (r13 == 0) goto L12d
            r20 = r0
            boolean r0 = r13.f112i     // Catch: java.lang.Throwable -> L17c
            goto L130
        L12d:
            r20 = r0
            r0 = 0
        L130:
            boolean r17 = r5.optBoolean(r12, r0)     // Catch: java.lang.Throwable -> L17c
            if (r13 == 0) goto L139
            java.util.Set r0 = r13.f113j     // Catch: java.lang.Throwable -> L17c
            goto L13a
        L139:
            r0 = 0
        L13a:
            if (r0 != 0) goto L13d
            goto L13e
        L13d:
            r8 = r0
        L13e:
            java.lang.String r0 = "types"
            org.json.JSONArray r0 = r5.optJSONArray(r0)     // Catch: java.lang.Throwable -> L17c
            java.util.Set r0 = D(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L17c
            java.util.LinkedHashSet r18 = tf.d0.U(r8, r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r0 = "textKeywords"
            if (r13 == 0) goto L157
            java.lang.String r8 = r13.f114k     // Catch: java.lang.Throwable -> L17c
            r16 = r8
            goto L159
        L157:
            r16 = 0
        L159:
            if (r16 != 0) goto L15d
            java.lang.String r16 = ""
        L15d:
            r8 = r16
            java.lang.String r19 = r5.optString(r0, r8)     // Catch: java.lang.Throwable -> L17c
            r19.getClass()     // Catch: java.lang.Throwable -> L17c
            aa.a r8 = new aa.a     // Catch: java.lang.Throwable -> L17c
            r13 = r3
            r16 = r7
            r12 = r15
            r15 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L17c
            r1.put(r9, r8)     // Catch: java.lang.Throwable -> L17c
            goto L176
        L174:
            r20 = r0
        L176:
            int r4 = r4 + 1
            r0 = r20
            goto L19
        L17c:
            tf.t r0 = tf.t.f13167g
            return r0
    }

    public static aa.b x(java.lang.String r12, boolean r13, boolean r14) {
            boolean r0 = og.m.t0(r12)
            if (r0 == 0) goto Lb
            aa.b r12 = d(r13, r14)
            return r12
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L81
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L81
            aa.b r1 = d(r13, r14)     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "enabled"
            r2 = 0
            boolean r5 = r0.optBoolean(r12, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "templateIds"
            org.json.JSONArray r12 = r0.optJSONArray(r12)     // Catch: java.lang.Throwable -> L81
            java.util.Set r12 = B(r12)     // Catch: java.lang.Throwable -> L81
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> L81
            boolean r3 = r12.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L56
            java.lang.String r12 = "templateId"
            java.lang.String r12 = r0.optString(r12)     // Catch: java.lang.Throwable -> L81
            r12.getClass()     // Catch: java.lang.Throwable -> L81
            java.lang.CharSequence r12 = og.m.R0(r12)     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L81
            int r3 = r12.length()     // Catch: java.lang.Throwable -> L81
            if (r3 <= 0) goto L46
            r3 = 1
            goto L47
        L46:
            r3 = r2
        L47:
            if (r3 == 0) goto L4a
            goto L4b
        L4a:
            r12 = 0
        L4b:
            if (r12 == 0) goto L54
            java.util.Set r12 = ac.p.N(r12)     // Catch: java.lang.Throwable -> L81
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> L81
            goto L56
        L54:
            tf.v r12 = tf.v.f13169g     // Catch: java.lang.Throwable -> L81
        L56:
            r6 = r12
            java.util.Set r6 = (java.util.Set) r6     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "customRules"
            boolean r7 = r0.optBoolean(r12, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "typeAll"
            boolean r8 = r0.optBoolean(r12, r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "types"
            org.json.JSONArray r12 = r0.optJSONArray(r12)     // Catch: java.lang.Throwable -> L81
            java.util.Set r9 = D(r12)     // Catch: java.lang.Throwable -> L81
            java.lang.String r12 = "textKeywords"
            java.lang.String r10 = r0.optString(r12)     // Catch: java.lang.Throwable -> L81
            r10.getClass()     // Catch: java.lang.Throwable -> L81
            r11 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            aa.b r12 = aa.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L81
            return r12
        L81:
            aa.b r12 = d(r13, r14)
            return r12
    }

    public static java.util.Set y(org.json.JSONArray r12) {
            if (r12 != 0) goto L5
            tf.v r12 = tf.v.f13169g
            return r12
        L5:
            uf.i r0 = new uf.i
            r0.<init>()
            int r1 = r12.length()
            r2 = 0
        Lf:
            if (r2 < r1) goto L16
            uf.i r12 = ac.p.h(r0)
            return r12
        L16:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r12.optInt(r2, r3)
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r4 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r4 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r4 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r4 = 6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r4 = 7
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r4 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            java.lang.Integer[] r4 = new java.lang.Integer[]{r5, r6, r7, r8, r9, r10, r11}
            java.util.Set r4 = tf.d0.W(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L58
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
        L58:
            int r2 = r2 + 1
            goto Lf
    }

    public static java.util.List z(org.json.JSONObject r11) {
            java.lang.String r0 = "planTimes"
            org.json.JSONArray r0 = r11.optJSONArray(r0)
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L48
            uf.c r6 = a.a.E()
            int r7 = r0.length()
            r11 = r3
        L16:
            if (r11 < r7) goto L25
            uf.c r11 = a.a.t(r6)
            java.util.List r11 = tf.m.p1(r11)
            java.util.List r11 = tf.m.J1(r11)
            return r11
        L25:
            long r8 = r0.optLong(r11, r4)
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 <= 0) goto L33
            r8 = r2
            goto L34
        L33:
            r8 = r3
        L34:
            if (r8 == 0) goto L37
            goto L38
        L37:
            r10 = r1
        L38:
            if (r10 == 0) goto L45
            long r8 = r10.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.add(r8)
        L45:
            int r11 = r11 + 1
            goto L16
        L48:
            java.lang.String r0 = "planTime"
            long r6 = r11.optLong(r0, r4)
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L57
            goto L58
        L57:
            r2 = r3
        L58:
            if (r2 == 0) goto L5b
            r1 = r11
        L5b:
            java.util.List r11 = a.a.A0(r1)
            return r11
    }

    @Override // ke.d
    public boolean c(ud.r r5, ud.n r6) {
            r4 = this;
            boolean r0 = r6 instanceof yd.c
            r1 = 0
            if (r0 == 0) goto L72
            yd.c r6 = (yd.c) r6
            ud.j r0 = r6.f22423n
            if (r0 != 0) goto Lc
            goto L72
        Lc:
            ud.j r0 = r6.f22422m
            if (r0 != 0) goto L12
            r0 = r1
            goto L16
        L12:
            boolean r0 = f8.i.L(r0, r0)
        L16:
            if (r0 != 0) goto L19
            goto L72
        L19:
            ud.j r0 = r6.f22422m
            ud.p r0 = f8.i.E(r0)
            pd.k r2 = pd.k.f10509r
            boolean r0 = xe.m.j(r0, r2)
            if (r0 == 0) goto L28
            goto L58
        L28:
            boolean r5 = r5.Z()
            if (r5 == 0) goto L58
            ud.j r5 = r6.f22422m
            int r5 = f8.i.R(r5)
            r0 = 5
            if (r5 >= r0) goto L58
            ud.j r0 = r6.f22423n
            int r0 = f8.i.R(r0)
            ud.j r2 = r6.f22423n
            md.e r2 = (md.e) r2
            md.f r2 = r2.f8877g
            md.a r3 = md.a.R
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L4d
            r2 = 4
            goto L4e
        L4d:
            r2 = 2
        L4e:
            if (r5 == r0) goto L72
            int r3 = r5 * r2
            if (r3 <= r0) goto L58
            int r0 = r0 * r2
            if (r5 >= r0) goto L58
            goto L72
        L58:
            ud.n r5 = r6.f21538i
            xd.b r0 = new xd.b
            r0.<init>(r5)
            boolean r5 = r5.l(r6, r0)
            if (r5 == 0) goto L72
            r0.H(r6)
            ud.j r5 = r6.f22423n
            r0.H(r5)
            r5 = 0
            r6.f22423n = r5
            r5 = 1
            return r5
        L72:
            return r1
    }

    public java.lang.String h(i5.a r5) {
            r4 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = r4.j(r0)     // Catch: java.io.IOException -> L23
            java.lang.String r2 = r5.getName()     // Catch: java.io.IOException -> L23
            r1.s(r2)     // Catch: java.io.IOException -> L23
            java.io.Writer r2 = r1.f10661g     // Catch: java.io.IOException -> L23
            r3 = 58
            r2.write(r3)     // Catch: java.io.IOException -> L23
            java.lang.String r5 = r5.getType()     // Catch: java.io.IOException -> L23
            r1.t(r5)     // Catch: java.io.IOException -> L23
            java.lang.String r5 = r0.toString()
            return r5
        L23:
            java.lang.String r5 = "Unexpected IOException"
            j8.o.f(r5)
            r5 = 0
            return r5
    }

    public android.content.pm.Signature[] i(android.content.pm.PackageManager r2, java.lang.String r3) {
            r1 = this;
            r0 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            android.content.pm.Signature[] r2 = r2.signatures
            return r2
    }

    public q5.a j(java.io.StringWriter r3) {
            r2 = this;
            e5.a r0 = new e5.a
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    public synchronized boolean l(android.content.Context r7, java.lang.ClassLoader r8) {
            r6 = this;
            java.lang.String r0 = "[Hchat:FakeMiniProgramHostVersion] 小程序进程升级跳转Hook安装失败: "
            monitor-enter(r6)
            r8.getClass()     // Catch: java.lang.Throwable -> L65
            boolean r1 = ea.a.f2478g     // Catch: java.lang.Throwable -> L65
            r2 = 1
            if (r1 == 0) goto Ld
            monitor-exit(r6)
            return r2
        Ld:
            java.lang.String r1 = "Hchat_fake_mini_program_host_version_member_cache"
            android.content.SharedPreferences r1 = ub.b.c(r7, r1)     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = e8.b.g(r7, r8)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "private_open_url_method"
            java.lang.reflect.Method r8 = e8.b.e(r1, r3, r8, r4)     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L67
            boolean r1 = x6.d.j(r8)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L26
            goto L27
        L26:
            r8 = 0
        L27:
            if (r8 == 0) goto L67
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L3a
            ea.b r3 = new ea.b     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            r5 = 0
            r3.<init>(r7, r4, r5)     // Catch: java.lang.Throwable -> L3a
            r1.b(r8, r3)     // Catch: java.lang.Throwable -> L3a
            ea.a.f2478g = r2     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r7 = move-exception
            sf.f r8 = new sf.f     // Catch: java.lang.Throwable -> L65
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L65
            r7 = r8
        L41:
            java.lang.Throwable r8 = sf.g.b(r7)     // Catch: java.lang.Throwable -> L65
            if (r8 != 0) goto L48
            goto L5d
        L48:
            java.lang.String r7 = r8.getMessage()     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L65
            r1.append(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L65
            fb.v0.n(r7, r8)     // Catch: java.lang.Throwable -> L65
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L65
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L65
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L65
            monitor-exit(r6)
            return r7
        L65:
            r7 = move-exception
            goto L6a
        L67:
            monitor-exit(r6)
            r7 = 0
            return r7
        L6a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L65
            throw r7
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f50g
            switch(r0) {
                case 4: goto Ld;
                case 25: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "dex-input: Dex Input - 'Load .dex and .apk files'"
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
