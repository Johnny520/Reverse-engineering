package p000;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0239e8 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f3440 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.C0239e8.f3440 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m1859(java.lang.reflect.Member r5) {
            java.lang.String r0 = r5.getName()
            r0.getClass()
            boolean r0 = m1863(r0)
            if (r0 == 0) goto L10
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L11
        L10:
            r0 = 0
        L11:
            boolean r1 = r5 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L1d
            r2 = r5
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r2 = r2.getType()
            goto L2a
        L1d:
            boolean r2 = r5 instanceof java.lang.reflect.Method
            if (r2 == 0) goto L29
            r2 = r5
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r2 = r2.getReturnType()
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L34
            boolean r2 = m1864(r2)
            if (r2 == 0) goto L34
            int r0 = r0 + 2000
        L34:
            java.lang.String r2 = "author"
            if (r1 == 0) goto L4a
            r3 = r5
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r3 = m1870(r3)
            if (r3 == 0) goto L4a
            boolean r3 = r3.equalsIgnoreCase(r2)
            r4 = 1
            if (r3 != r4) goto L4a
            int r0 = r0 + 4000
        L4a:
            boolean r3 = r5 instanceof java.lang.reflect.Method
            if (r3 == 0) goto L5f
            r3 = r5
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "getAuthor"
            boolean r3 = p000.x02.m6480(r3, r4)
            if (r3 == 0) goto L5f
            int r0 = r0 + 500
        L5f:
            if (r1 == 0) goto L6f
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = p000.x02.m6480(r5, r2)
            if (r5 == 0) goto L6f
            int r0 = r0 + 500
        L6f:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m1860(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r0)
            goto L5
        L14:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.ArrayList m1861(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L1e
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1e
            java.lang.reflect.Method[] r1 = r2.getDeclaredMethods()
            r1.getClass()
            p000.AbstractC0984xh.m6659(r0, r1)
            java.lang.Class r2 = r2.getSuperclass()
            goto L5
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m1862(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            goto L19
        Lf:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L38
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.String r1 = r1.toString()
        L19:
            boolean r0 = p000.q02.m4671(r1)
            if (r0 != 0) goto L38
            java.lang.String r0 = "null"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = "未知"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = "unknown"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L38
            return r1
        L38:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1863(java.lang.String r1) {
            java.lang.String r0 = "author"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "mAuthor"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "authorInfo"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "getAuthor"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "getAuthorInfo"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = 0
            return r1
        L2b:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m1864(java.lang.Class r2) {
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r0 = "User"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.Object m1865(java.lang.reflect.Member r3, java.lang.Object r4) {
            r0 = 0
            boolean r1 = r3 instanceof java.lang.reflect.Field     // Catch: java.lang.Throwable -> L13
            r2 = 1
            if (r1 == 0) goto L15
            r1 = r3
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L13
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L13
            goto L2e
        L13:
            r3 = move-exception
            goto L28
        L15:
            boolean r1 = r3 instanceof java.lang.reflect.Method     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L26
            r1 = r3
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L13
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = r3.invoke(r4, r0)     // Catch: java.lang.Throwable -> L13
            goto L2e
        L26:
            r3 = r0
            goto L2e
        L28:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L2e:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L33
            goto L34
        L33:
            r0 = r3
        L34:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.Number m1866(java.lang.Object r1, java.lang.String... r2) {
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r1 = m1867(r1, r2)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L12
            java.lang.Number r1 = (java.lang.Number) r1
            return r1
        L12:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L25
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Long r1 = p000.x02.m6488(r1)
            return r1
        L25:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.Object m1867(java.lang.Object r9, java.lang.String... r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.length
            r0.<init>(r1)
            int r1 = r10.length
            r2 = 0
            r3 = r2
        L9:
            if (r3 >= r1) goto L1c
            r4 = r10[r3]
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            r0.add(r4)
            int r3 = r3 + 1
            goto L9
        L1c:
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r10.length
            r4 = r2
        L27:
            if (r4 >= r3) goto L63
            r5 = r10[r4]
            int r6 = r5.length()
            if (r6 <= 0) goto L4e
            char r6 = r5.charAt(r2)
            char r6 = java.lang.Character.toUpperCase(r6)
            r7 = 1
            java.lang.String r7 = r5.substring(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            goto L4f
        L4e:
            r6 = r5
        L4f:
            java.lang.String r7 = "get"
            java.lang.String r6 = r7.concat(r6)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.util.List r5 = p000.AbstractC1021yh.m6897(r5)
            p000.AbstractC0984xh.m6660(r1, r5)
            int r4 = r4 + 1
            goto L27
        L63:
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r1, r2)
            r10.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L72:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            r10.add(r2)
            goto L72
        L8b:
            java.util.Set r10 = p000.AbstractC0984xh.m6671(r10)
            java.lang.Class r1 = r9.getClass()
            java.util.ArrayList r1 = m1861(r1)
            java.util.Iterator r1 = r1.iterator()
        L9b:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto Le0
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L9b
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L9b
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 != 0) goto L9b
            java.lang.String r4 = r4.getName()
            r4.getClass()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            boolean r4 = r10.contains(r4)
            if (r4 == 0) goto L9b
            goto Le1
        Le0:
            r2 = r3
        Le1:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto Lec
            java.lang.Object r10 = m1865(r2, r9)
            if (r10 == 0) goto Lec
            return r10
        Lec:
            java.lang.Class r10 = r9.getClass()
            java.util.ArrayList r10 = m1860(r10)
            java.util.Iterator r1 = r10.iterator()
        Lf8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L126
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto Lf8
            java.lang.String r4 = r4.getName()
            r4.getClass()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lf8
            goto L127
        L126:
            r2 = r3
        L127:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L132
            java.lang.Object r1 = m1865(r2, r9)
            if (r1 == 0) goto L132
            return r1
        L132:
            java.util.Iterator r10 = r10.iterator()
        L136:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L168
            java.lang.Object r1 = r10.next()
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r4 = r2.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L136
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r2 = m1870(r2)
            if (r2 == 0) goto L160
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r5)
            r2.getClass()
            goto L161
        L160:
            r2 = r3
        L161:
            boolean r2 = p000.AbstractC0984xh.m6632(r4, r2)
            if (r2 == 0) goto L136
            goto L169
        L168:
            r1 = r3
        L169:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 == 0) goto L174
            java.lang.Object r9 = m1865(r1, r9)
            if (r9 == 0) goto L174
            return r9
        L174:
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public static p000.C0203d8 m1868(java.lang.Object r21) {
            r21.getClass()
            java.lang.Class r0 = r21.getClass()
            n7 r1 = new n7
            r2 = 2
            r1.<init>(r2)
            c8 r2 = new c8
            r3 = 0
            r2.<init>(r1, r3)
            java.util.concurrent.ConcurrentHashMap r1 = p000.C0239e8.f3440
            java.lang.Object r0 = r1.computeIfAbsent(r0, r2)
            r0.getClass()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Member r2 = (java.lang.reflect.Member) r2
            r3 = r21
            java.lang.Object r2 = m1865(r2, r3)
            if (r2 != 0) goto L3c
            goto L27
        L3c:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L43
            goto L54
        L43:
            java.util.Iterator r4 = r1.iterator()
        L47:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r4.next()
            if (r5 != r2) goto L47
            goto L27
        L54:
            r1.add(r2)
            goto L27
        L58:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r1, r2)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L19c
            java.lang.Object r2 = r1.next()
            java.lang.String r4 = "userId"
            java.lang.String r5 = "user_id"
            java.lang.String r6 = "uid"
            java.lang.String[] r4 = new java.lang.String[]{r6, r4, r5}
            java.lang.Object r4 = m1867(r2, r4)
            java.lang.String r4 = m1862(r4)
            r5 = 5
            r6 = 0
            if (r4 == 0) goto La5
            int r7 = r4.length()
            if (r7 < r5) goto La5
            r7 = r6
        L8f:
            int r8 = r4.length()
            if (r7 >= r8) goto La3
            char r8 = r4.charAt(r7)
            boolean r8 = java.lang.Character.isDigit(r8)
            if (r8 != 0) goto La0
            goto La5
        La0:
            int r7 = r7 + 1
            goto L8f
        La3:
            r11 = r4
            goto La6
        La5:
            r11 = r3
        La6:
            java.lang.String r4 = "nick_name"
            java.lang.String r7 = "displayName"
            java.lang.String r8 = "nickname"
            java.lang.String r9 = "nickName"
            java.lang.String[] r4 = new java.lang.String[]{r8, r9, r4, r7}
            java.lang.Object r4 = m1867(r2, r4)
            java.lang.String r4 = m1862(r4)
            if (r4 != 0) goto Lbe
            java.lang.String r4 = ""
        Lbe:
            r9 = r4
            java.lang.String r4 = "shortId"
            java.lang.String r7 = "short_id"
            java.lang.String r8 = "uniqueId"
            java.lang.String r10 = "unique_id"
            java.lang.String[] r4 = new java.lang.String[]{r8, r10, r4, r7}
            java.lang.Object r4 = m1867(r2, r4)
            java.lang.String r10 = m1862(r4)
            java.lang.String r4 = "sec_uid"
            java.lang.String r7 = "secUserId"
            java.lang.String r8 = "secUid"
            java.lang.String r12 = "secUID"
            java.lang.String[] r4 = new java.lang.String[]{r8, r12, r4, r7}
            java.lang.Object r4 = m1867(r2, r4)
            java.lang.String r4 = m1862(r4)
            if (r4 == 0) goto L104
            int r7 = r4.length()
            if (r7 < r5) goto L106
            r5 = r6
        Lf0:
            int r7 = r4.length()
            if (r5 >= r7) goto L104
            char r7 = r4.charAt(r5)
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 != 0) goto L101
            goto L106
        L101:
            int r5 = r5 + 1
            goto Lf0
        L104:
            r12 = r3
            goto L107
        L106:
            r12 = r4
        L107:
            java.lang.String r3 = "signature"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.Object r3 = m1867(r2, r3)
            java.lang.String r13 = m1862(r3)
            java.lang.String r3 = "followerCount"
            java.lang.String r4 = "follower_count"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.Number r3 = m1866(r2, r3)
            if (r3 == 0) goto L129
            int r3 = r3.intValue()
            r14 = r3
            goto L12a
        L129:
            r14 = r6
        L12a:
            java.lang.String r3 = "followingCount"
            java.lang.String r4 = "following_count"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.Number r3 = m1866(r2, r3)
            if (r3 == 0) goto L13e
            int r3 = r3.intValue()
            r15 = r3
            goto L13f
        L13e:
            r15 = r6
        L13f:
            java.lang.String r3 = "awemeCount"
            java.lang.String r4 = "aweme_count"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.Number r3 = m1866(r2, r3)
            if (r3 == 0) goto L154
            int r3 = r3.intValue()
            r16 = r3
            goto L156
        L154:
            r16 = r6
        L156:
            java.lang.String r3 = "verificationType"
            java.lang.String r4 = "verification_type"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.Number r3 = m1866(r2, r3)
            if (r3 == 0) goto L168
            int r6 = r3.intValue()
        L168:
            r17 = r6
            java.lang.String r3 = "ipLocation"
            java.lang.String r4 = "ip_location"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.Object r3 = m1867(r2, r3)
            java.lang.String r18 = m1862(r3)
            java.lang.String r3 = "liveStatus"
            java.lang.String r4 = "live_status"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.Number r2 = m1866(r2, r3)
            if (r2 == 0) goto L18f
            long r2 = r2.longValue()
        L18c:
            r19 = r2
            goto L192
        L18f:
            r2 = 0
            goto L18c
        L192:
            d8 r8 = new d8
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.add(r8)
            goto L67
        L19c:
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1a8
            r1 = r3
            goto L1cf
        L1a8:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L1b3
            goto L1cf
        L1b3:
            r2 = r1
            d8 r2 = (p000.C0203d8) r2
            int r2 = m1869(r2)
        L1ba:
            java.lang.Object r4 = r0.next()
            r5 = r4
            d8 r5 = (p000.C0203d8) r5
            int r5 = m1869(r5)
            if (r2 >= r5) goto L1c9
            r1 = r4
            r2 = r5
        L1c9:
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L1ba
        L1cf:
            d8 r1 = (p000.C0203d8) r1
            if (r1 == 0) goto L1dd
            int r0 = m1869(r1)
            if (r0 <= 0) goto L1da
            r3 = r1
        L1da:
            if (r3 == 0) goto L1dd
            return r3
        L1dd:
            d8 r4 = new d8
            r13 = 0
            r15 = 0
            java.lang.String r5 = ""
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r4
    }

    /* JADX INFO: renamed from: λ */
    public static int m1869(p000.C0203d8 r2) {
            java.lang.String r0 = r2.f2937
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto Lb
            r0 = 16
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.String r1 = r2.f2939
            if (r1 == 0) goto L19
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L17
            goto L19
        L17:
            int r0 = r0 + 12
        L19:
            java.lang.String r1 = r2.f2938
            if (r1 == 0) goto L26
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L24
            goto L26
        L24:
            int r0 = r0 + 8
        L26:
            java.lang.String r1 = r2.f2940
            if (r1 == 0) goto L33
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L31
            goto L33
        L31:
            int r0 = r0 + 6
        L33:
            java.lang.String r1 = r2.f2941
            if (r1 == 0) goto L40
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L3e
            goto L40
        L3e:
            int r0 = r0 + 2
        L40:
            int r2 = r2.f2942
            if (r2 <= 0) goto L46
            int r0 = r0 + 1
        L46:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m1870(java.lang.reflect.Field r6) {
            java.lang.annotation.Annotation[] r6 = r6.getDeclaredAnnotations()
            r6.getClass()
            int r0 = r6.length
            r1 = 0
        L9:
            r2 = 0
            if (r1 >= r0) goto L26
            r3 = r6[r1]
            wf r4 = p000.ln0.m3599(r3)
            java.lang.Class r4 = p000.ln0.m3604(r4)
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r5 = "SerializedName"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L23
            goto L27
        L23:
            int r1 = r1 + 1
            goto L9
        L26:
            r3 = r2
        L27:
            if (r3 != 0) goto L2a
            return r2
        L2a:
            wf r6 = p000.ln0.m3599(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Class r6 = p000.ln0.m3604(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "value"
            java.lang.reflect.Method r6 = r6.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r6 = r6.invoke(r3, r2)     // Catch: java.lang.Throwable -> L43
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L45
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L43
            goto L4d
        L43:
            r6 = move-exception
            goto L47
        L45:
            r6 = r2
            goto L4d
        L47:
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L4d:
            boolean r0 = r6 instanceof p000.eo1
            if (r0 == 0) goto L52
            goto L53
        L52:
            r2 = r6
        L53:
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }
}
