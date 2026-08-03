package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements ke.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f1.g f11684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static f1.b f11685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static h1.b f11686i;

    public static java.lang.String A(java.util.List r5) {
            r5.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r5.next()
            r3 = r2
            o9.r r3 = (o9.r) r3
            java.lang.String r4 = r3.f9698a
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L30
            java.lang.String r3 = r3.f9700c
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L11
            r1.add(r2)
            goto L11
        L37:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r1.next()
            r4 = r3
            o9.r r4 = (o9.r) r4
            java.lang.String r4 = r4.f9698a
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r4 = r5.add(r4)
            if (r4 == 0) goto L45
            r2.add(r3)
            goto L45
        L66:
            java.util.Iterator r5 = r2.iterator()
        L6a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r5.next()
            o9.r r1 = (o9.r) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r1.f9698a
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "groupId"
            r2.put(r4, r3)
            java.lang.String r3 = "label"
            java.lang.String r4 = r1.f9699b
            r2.put(r3, r4)
            java.lang.String r1 = r1.f9700c
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "templateId"
            r2.put(r3, r1)
            r0.put(r2)
            goto L6a
        La4:
            java.lang.String r5 = r0.toString()
            r5.getClass()
            return r5
    }

    public static java.lang.String B(java.util.List r11) {
            r11.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        Lc:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r11.next()
            x8.s r1 = (x8.s) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.String r4 = r1.f21344a
            r2.put(r3, r4)
            java.lang.String r3 = "mode"
            int r4 = r1.f21345b
            r2.put(r3, r4)
            java.lang.String r3 = "content"
            java.lang.String r4 = r1.f21346c
            r2.put(r3, r4)
            long r5 = r1.f21347d
            r7 = 0
            r9 = 600000(0x927c0, double:2.964394E-318)
            long r3 = s(r5, r7, r9)
            java.lang.String r5 = "delayMs"
            r2.put(r5, r3)
            java.lang.String r3 = "randomDelay"
            boolean r1 = r1.f21348e
            r2.put(r3, r1)
            r0.put(r2)
            goto Lc
        L4d:
            java.lang.String r11 = r0.toString()
            r11.getClass()
            return r11
    }

    public static org.json.JSONArray C(java.util.Set r4) {
            r4.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            j8.b.r(r2, r1)
            goto L17
        L27:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L45
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            if (r3 == 0) goto L30
            r4.add(r2)
            goto L30
        L4c:
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r4 = tf.m.P1(r4)
            java.util.Iterator r4 = r4.iterator()
        L58:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r1)
            goto L58
        L68:
            return r0
    }

    public static java.lang.String D(java.util.ArrayList r6) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L154
            java.lang.Object r1 = r6.next()
            o9.q r1 = (o9.q) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.String r4 = r1.f9672a
            r2.put(r3, r4)
            java.lang.String r3 = "name"
            java.lang.String r4 = r1.f9673b
            r2.put(r3, r4)
            java.lang.String r3 = "enabled"
            boolean r4 = r1.f9674c
            r2.put(r3, r4)
            java.lang.String r3 = "joinEnabled"
            boolean r4 = r1.f9675d
            r2.put(r3, r4)
            java.lang.String r3 = "leftEnabled"
            boolean r4 = r1.f9676e
            r2.put(r3, r4)
            java.lang.String r3 = r1.f9677f
            java.lang.String r3 = P(r3)
            java.lang.String r4 = "promptType"
            r2.put(r4, r3)
            java.lang.String r3 = r1.f9678g
            java.lang.String r4 = "card_first"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L53
            goto L55
        L53:
            java.lang.String r4 = "text_first"
        L55:
            java.lang.String r3 = "bothOrder"
            r2.put(r3, r4)
            java.lang.String r3 = "joinText"
            java.lang.String r4 = r1.f9679h
            r2.put(r3, r4)
            java.lang.String r3 = "leftText"
            java.lang.String r4 = r1.f9680i
            r2.put(r3, r4)
            java.lang.String r3 = "joinCardTitle"
            java.lang.String r4 = r1.f9681j
            r2.put(r3, r4)
            java.lang.String r3 = "joinCardDesc"
            java.lang.String r4 = r1.f9682k
            r2.put(r3, r4)
            java.lang.String r3 = "leftCardTitle"
            java.lang.String r4 = r1.f9683l
            r2.put(r3, r4)
            java.lang.String r3 = "leftCardDesc"
            java.lang.String r4 = r1.f9684m
            r2.put(r3, r4)
            java.lang.String r3 = r1.f9685n
            java.lang.String r3 = N(r3)
            java.lang.String r4 = "mediaMode"
            r2.put(r4, r3)
            java.lang.String r3 = r1.f9686o
            java.lang.String r3 = O(r3)
            java.lang.String r4 = "mediaOrder"
            r2.put(r4, r3)
            java.lang.String r3 = "mediaSequence"
            java.lang.String r4 = r1.f9687p
            r2.put(r3, r4)
            java.lang.String r3 = "joinImages"
            java.lang.String r4 = r1.f9688q
            r2.put(r3, r4)
            java.lang.String r3 = "leftImages"
            java.lang.String r4 = r1.f9689r
            r2.put(r3, r4)
            java.lang.String r3 = "joinVoices"
            java.lang.String r4 = r1.f9690s
            r2.put(r3, r4)
            java.lang.String r3 = "leftVoices"
            java.lang.String r4 = r1.f9691t
            r2.put(r3, r4)
            java.lang.String r3 = "joinEmojis"
            java.lang.String r4 = r1.f9692u
            r2.put(r3, r4)
            java.lang.String r3 = "leftEmojis"
            java.lang.String r4 = r1.f9693v
            r2.put(r3, r4)
            java.lang.String r3 = "joinVideos"
            java.lang.String r4 = r1.f9694w
            r2.put(r3, r4)
            java.lang.String r3 = "leftVideos"
            java.lang.String r4 = r1.f9695x
            r2.put(r3, r4)
            java.lang.String r3 = "joinFiles"
            java.lang.String r4 = r1.f9696y
            r2.put(r3, r4)
            java.lang.String r3 = "leftFiles"
            java.lang.String r4 = r1.f9697z
            r2.put(r3, r4)
            java.lang.String r3 = "joinFavorites"
            java.lang.String r4 = r1.A
            r2.put(r3, r4)
            java.lang.String r3 = "leftFavorites"
            java.lang.String r4 = r1.B
            r2.put(r3, r4)
            java.lang.String r3 = r1.C
            java.lang.String r4 = "custom"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L100
            goto L102
        L100:
            java.lang.String r4 = "global"
        L102:
            java.lang.String r3 = "delayMode"
            r2.put(r3, r4)
            int r3 = r1.D
            r4 = 0
            if (r3 >= 0) goto L10d
            r3 = r4
        L10d:
            java.lang.String r5 = "promptDelayMs"
            r2.put(r5, r3)
            int r3 = r1.E
            if (r3 >= 0) goto L117
            r3 = r4
        L117:
            java.lang.String r5 = "imageDelayMs"
            r2.put(r5, r3)
            int r3 = r1.F
            if (r3 >= 0) goto L121
            r3 = r4
        L121:
            java.lang.String r5 = "voiceDelayMs"
            r2.put(r5, r3)
            int r3 = r1.G
            if (r3 >= 0) goto L12b
            r3 = r4
        L12b:
            java.lang.String r5 = "emojiDelayMs"
            r2.put(r5, r3)
            int r3 = r1.H
            if (r3 >= 0) goto L135
            r3 = r4
        L135:
            java.lang.String r5 = "videoDelayMs"
            r2.put(r5, r3)
            int r3 = r1.I
            if (r3 >= 0) goto L13f
            r3 = r4
        L13f:
            java.lang.String r5 = "fileDelayMs"
            r2.put(r5, r3)
            int r1 = r1.J
            if (r1 >= 0) goto L149
            goto L14a
        L149:
            r4 = r1
        L14a:
            java.lang.String r1 = "favoriteDelayMs"
            r2.put(r1, r4)
            r0.put(r2)
            goto L9
        L154:
            java.lang.String r6 = r0.toString()
            r6.getClass()
            return r6
    }

    public static java.lang.String E(java.lang.String r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "isError"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "message"
            r0.put(r1, r3)
            java.lang.String r3 = r0.toString()
            r3.getClass()
            return r3
    }

    public static java.lang.String F(int r6, int r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 1
            boolean r2 = G(r6, r1)
            if (r2 == 0) goto L11
            java.lang.String r2 = "public "
            r0.append(r2)
        L11:
            r2 = 2
            boolean r3 = G(r6, r2)
            if (r3 == 0) goto L1d
            java.lang.String r3 = "private "
            r0.append(r3)
        L1d:
            r3 = 4
            boolean r3 = G(r6, r3)
            if (r3 == 0) goto L29
            java.lang.String r3 = "protected "
            r0.append(r3)
        L29:
            r3 = 8
            boolean r3 = G(r6, r3)
            if (r3 == 0) goto L36
            java.lang.String r3 = "static "
            r0.append(r3)
        L36:
            r3 = 16
            boolean r3 = G(r6, r3)
            if (r3 == 0) goto L43
            java.lang.String r3 = "final "
            r0.append(r3)
        L43:
            r3 = 1024(0x400, float:1.435E-42)
            boolean r3 = G(r6, r3)
            if (r3 == 0) goto L50
            java.lang.String r3 = "abstract "
            r0.append(r3)
        L50:
            r3 = 256(0x100, float:3.59E-43)
            boolean r3 = G(r6, r3)
            if (r3 == 0) goto L5d
            java.lang.String r3 = "native "
            r0.append(r3)
        L5d:
            int r7 = t3.c.b(r7)
            r3 = 32
            if (r7 == 0) goto La8
            r4 = 128(0x80, float:1.8E-43)
            r5 = 64
            if (r7 == r1) goto L91
            if (r7 == r2) goto L6f
            goto Le8
        L6f:
            boolean r7 = G(r6, r3)
            if (r7 == 0) goto L7a
            java.lang.String r7 = "synchronized "
            r0.append(r7)
        L7a:
            boolean r7 = G(r6, r5)
            if (r7 == 0) goto L85
            java.lang.String r7 = "bridge "
            r0.append(r7)
        L85:
            boolean r7 = G(r6, r4)
            if (r7 == 0) goto Le8
            java.lang.String r7 = "varargs "
            r0.append(r7)
            goto Le8
        L91:
            boolean r7 = G(r6, r5)
            if (r7 == 0) goto L9c
            java.lang.String r7 = "volatile "
            r0.append(r7)
        L9c:
            boolean r7 = G(r6, r4)
            if (r7 == 0) goto Le8
            java.lang.String r7 = "transient "
            r0.append(r7)
            goto Le8
        La8:
            r7 = 32768(0x8000, float:4.5918E-41)
            boolean r7 = G(r6, r7)
            if (r7 == 0) goto Lb6
            java.lang.String r7 = "module "
            r0.append(r7)
        Lb6:
            r7 = 2048(0x800, float:2.87E-42)
            boolean r7 = G(r6, r7)
            if (r7 == 0) goto Lc3
            java.lang.String r7 = "strict "
            r0.append(r7)
        Lc3:
            boolean r7 = G(r6, r3)
            if (r7 == 0) goto Lce
            java.lang.String r7 = "super "
            r0.append(r7)
        Lce:
            r7 = 16384(0x4000, float:2.2959E-41)
            boolean r7 = G(r6, r7)
            if (r7 == 0) goto Ldb
            java.lang.String r7 = "enum "
            r0.append(r7)
        Ldb:
            r7 = 262144(0x40000, float:3.67342E-40)
            boolean r7 = G(r6, r7)
            if (r7 == 0) goto Le8
            java.lang.String r7 = "data "
            r0.append(r7)
        Le8:
            r7 = 4096(0x1000, float:5.74E-42)
            boolean r6 = G(r6, r7)
            if (r6 == 0) goto Lf5
            java.lang.String r6 = "synthetic "
            r0.append(r6)
        Lf5:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static boolean G(int r0, int r1) {
            r0 = r0 & r1
            if (r0 == 0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean H(java.lang.String r3, java.lang.String r4) {
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Integer r3 = U(r3)
            if (r3 == 0) goto L48
            int r3 = r3.intValue()
            java.lang.Integer r4 = U(r4)
            if (r4 == 0) goto L48
            int r4 = r4.intValue()
            if (r3 != r4) goto L1b
            goto L48
        L1b:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTimeInMillis(r0)
            r0 = 11
            int r0 = r2.get(r0)
            int r0 = r0 * 3600
            r1 = 12
            int r1 = r2.get(r1)
            int r1 = r1 * 60
            int r1 = r1 + r0
            r0 = 13
            int r0 = r2.get(r0)
            int r0 = r0 + r1
            if (r3 >= r4) goto L41
            if (r3 > r0) goto L46
            if (r0 >= r4) goto L46
            goto L48
        L41:
            if (r0 >= r3) goto L48
            if (r0 >= r4) goto L46
            goto L48
        L46:
            r3 = 0
            return r3
        L48:
            r3 = 1
            return r3
    }

    public static java.lang.String I(java.lang.String r6, java.lang.Object... r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            int r2 = r7.length
            int r2 = r2 * 16
            int r2 = r2 + r1
            r0.<init>(r2)
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r7.length
            if (r1 >= r3) goto L30
            java.lang.String r3 = "%s"
            int r3 = r6.indexOf(r3, r2)
            r4 = -1
            if (r3 != r4) goto L1c
            goto L30
        L1c:
            r0.append(r6, r2, r3)
            int r2 = r1 + 1
            r1 = r7[r1]
            java.lang.String r1 = J(r1)
            r0.append(r1)
            int r1 = r3 + 2
            r5 = r2
            r2 = r1
            r1 = r5
            goto Lf
        L30:
            int r3 = r6.length()
            r0.append(r6, r2, r3)
            int r6 = r7.length
            if (r1 >= r6) goto L55
            java.lang.String r6 = " ["
        L3c:
            int r2 = r7.length
            if (r1 >= r2) goto L50
            r0.append(r6)
            r6 = r7[r1]
            java.lang.String r6 = J(r6)
            r0.append(r6)
            int r1 = r1 + 1
            java.lang.String r6 = ", "
            goto L3c
        L50:
            r6 = 93
            r0.append(r6)
        L55:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String J(java.lang.Object r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = "null"
            return r4
        L5:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> La
            return r4
        La:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r2 = 64
            r1.append(r2)
            int r4 = java.lang.System.identityHashCode(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "com.google.common.base.Strings"
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "Exception during lenientFormat for "
            java.lang.String r3 = r3.concat(r4)
            r1.log(r2, r3, r0)
            java.lang.String r1 = "<"
            java.lang.String r2 = " threw "
            java.lang.StringBuilder r4 = bc.e.o(r1, r4, r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = ">"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    public static java.lang.String K(android.content.Context r17, java.lang.String r18, java.util.ArrayList r19) {
            r1 = r18
            r1.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L13
            r2 = r17
            r3 = r19
            java.lang.String r2 = f0(r2, r3)     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L1a:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto L21
            goto L26
        L21:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L26:
            r2 = r0
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r0 = r2.length()
            java.lang.String r3 = ""
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L62
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L41:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L47
            r0 = r4
        L47:
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            if (r0 == 0) goto L5d
            int r1 = r0.length()
            if (r1 <= 0) goto L52
            goto L53
        L52:
            r5 = r6
        L53:
            if (r5 == 0) goto L56
            goto L57
        L56:
            r0 = r4
        L57:
            if (r0 == 0) goto L5d
            java.lang.String r4 = r0.toString()
        L5d:
            if (r4 != 0) goto L60
            goto L61
        L60:
            r3 = r4
        L61:
            return r3
        L62:
            uf.i r0 = new uf.i
            r0.<init>()
            int r7 = r2.length()
            r8 = r6
        L6c:
            java.lang.String r9 = "id"
            java.lang.String r10 = "tool_calls"
            if (r8 < r7) goto L1ad
            uf.i r7 = ac.p.h(r0)
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L81
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L81
            goto L88
        L81:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L88:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L8f
            goto L94
        L8f:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L94:
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            r1 = r6
        L97:
            int r8 = r0.length()
            java.lang.String r12 = "assistant"
            java.lang.String r13 = "role"
            if (r1 >= r8) goto L13f
            org.json.JSONObject r8 = r0.optJSONObject(r1)
            if (r8 == 0) goto Lbc
            java.lang.String r13 = r8.optString(r13)
            boolean r12 = gg.l.a(r13, r12)
            if (r12 == 0) goto Lb3
            r12 = r8
            goto Lb4
        Lb3:
            r12 = r4
        Lb4:
            if (r12 == 0) goto Lbc
            org.json.JSONArray r12 = r12.optJSONArray(r10)
            r14 = r12
            goto Lbd
        Lbc:
            r14 = r4
        Lbd:
            if (r14 != 0) goto Lc7
            if (r8 == 0) goto Lc4
            r11.put(r8)
        Lc4:
            int r1 = r1 + 1
            goto L97
        Lc7:
            uf.i r8 = new uf.i
            r8.<init>()
            int r15 = r14.length()
            r12 = r6
        Ld1:
            if (r12 < r15) goto L123
            uf.i r8 = ac.p.h(r8)
            int r12 = r14.length()
            int r12 = r12 + r5
            if (r8 == 0) goto Le7
            uf.g r13 = r8.f13800g
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto Le7
            goto L106
        Le7:
            java.util.Iterator r8 = r8.iterator()
        Leb:
            r13 = r8
            m3.c r13 = (m3.c) r13
            boolean r13 = r13.hasNext()
            if (r13 == 0) goto L106
            r13 = r8
            uf.e r13 = (uf.e) r13
            java.lang.Object r13 = r13.next()
            java.lang.String r13 = (java.lang.String) r13
            uf.g r14 = r7.f13800g
            boolean r13 = r14.containsKey(r13)
            if (r13 == 0) goto Leb
            goto L120
        L106:
            int r8 = r0.length()
            int r8 = r8 - r1
            if (r12 <= r8) goto L10e
            goto L10f
        L10e:
            r8 = r12
        L10f:
            r13 = r6
        L110:
            if (r13 >= r8) goto L120
            int r14 = r13 + r1
            org.json.JSONObject r14 = r0.optJSONObject(r14)
            if (r14 == 0) goto L11d
            r11.put(r14)
        L11d:
            int r13 = r13 + 1
            goto L110
        L120:
            int r1 = r1 + r12
            goto L97
        L123:
            org.json.JSONObject r13 = r14.optJSONObject(r12)
            if (r13 == 0) goto L13c
            java.lang.String r13 = r13.optString(r9)
            if (r13 == 0) goto L13c
            boolean r16 = og.m.t0(r13)
            if (r16 != 0) goto L136
            goto L137
        L136:
            r13 = r4
        L137:
            if (r13 == 0) goto L13c
            r8.add(r13)
        L13c:
            int r12 = r12 + 1
            goto Ld1
        L13f:
            int r14 = r2.length()
            r0 = r6
        L144:
            if (r0 < r14) goto L1a1
        L146:
            int r0 = M(r11)
            if (r0 <= r5) goto L18a
            java.lang.String r0 = r11.toString()
            int r0 = r0.length()
            r1 = 120000(0x1d4c0, float:1.68156E-40)
            if (r0 <= r1) goto L18a
            org.json.JSONObject r0 = r11.optJSONObject(r6)
            if (r0 == 0) goto L164
            java.lang.String r1 = r0.optString(r13)
            goto L165
        L164:
            r1 = r4
        L165:
            boolean r1 = gg.l.a(r1, r12)
            if (r1 == 0) goto L176
            org.json.JSONArray r0 = r0.optJSONArray(r10)
            if (r0 == 0) goto L176
            int r0 = r0.length()
            goto L177
        L176:
            r0 = r6
        L177:
            r11.remove(r6)
            int r1 = r11.length()
            if (r0 <= r1) goto L181
            r0 = r1
        L181:
            r1 = r6
        L182:
            if (r1 >= r0) goto L146
            r11.remove(r6)
            int r1 = r1 + 1
            goto L182
        L18a:
            int r0 = r11.length()
            if (r0 <= 0) goto L191
            goto L192
        L191:
            r5 = r6
        L192:
            if (r5 == 0) goto L195
            goto L196
        L195:
            r11 = r4
        L196:
            if (r11 == 0) goto L19c
            java.lang.String r4 = r11.toString()
        L19c:
            if (r4 != 0) goto L19f
            goto L1a0
        L19f:
            r3 = r4
        L1a0:
            return r3
        L1a1:
            org.json.JSONObject r1 = r2.optJSONObject(r0)
            if (r1 == 0) goto L1aa
            r11.put(r1)
        L1aa:
            int r0 = r0 + 1
            goto L144
        L1ad:
            org.json.JSONObject r11 = r2.optJSONObject(r8)
            if (r11 == 0) goto L1dd
            org.json.JSONArray r10 = r11.optJSONArray(r10)
            if (r10 == 0) goto L1dd
            int r11 = r10.length()
            r12 = r6
        L1be:
            if (r12 < r11) goto L1c1
            goto L1dd
        L1c1:
            org.json.JSONObject r13 = r10.optJSONObject(r12)
            if (r13 == 0) goto L1da
            java.lang.String r13 = r13.optString(r9)
            if (r13 == 0) goto L1da
            boolean r14 = og.m.t0(r13)
            if (r14 != 0) goto L1d4
            goto L1d5
        L1d4:
            r13 = r4
        L1d5:
            if (r13 == 0) goto L1da
            r0.add(r13)
        L1da:
            int r12 = r12 + 1
            goto L1be
        L1dd:
            int r8 = r8 + 1
            goto L6c
    }

    public static final java.lang.String L(java.lang.Object r6) {
            r6.getClass()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "getTimeLine"
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r2, r1)
            java.lang.String r1 = ""
            if (r6 == 0) goto L3b
            java.lang.String r2 = "desc"
            java.lang.String r3 = "description"
            java.lang.String r4 = "ContentDesc"
            java.lang.String r5 = "contentDesc"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r2, r3}
        L1c:
            r3 = 4
            if (r0 < r3) goto L20
            return r1
        L20:
            r3 = r2[r0]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r6, r3)
            if (r3 == 0) goto L2d
            java.lang.String r3 = r3.toString()
            goto L2e
        L2d:
            r3 = 0
        L2e:
            if (r3 != 0) goto L31
            r3 = r1
        L31:
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L38
            return r3
        L38:
            int r0 = r0 + 1
            goto L1c
        L3b:
            return r1
    }

    public static int M(org.json.JSONArray r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r1 < r0) goto L9
            return r2
        L9:
            org.json.JSONObject r3 = r5.optJSONObject(r1)
            if (r3 == 0) goto L16
            java.lang.String r4 = "role"
            java.lang.String r3 = r3.optString(r4)
            goto L17
        L16:
            r3 = 0
        L17:
            java.lang.String r4 = "assistant"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L21
            int r2 = r2 + 1
        L21:
            int r1 = r1 + 1
            goto L6
    }

    public static java.lang.String N(java.lang.String r2) {
            r2.getClass()
            java.lang.String r0 = "custom"
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.String r0 = "none"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            return r0
        L15:
            java.lang.String r2 = "global"
            return r2
    }

    public static java.lang.String O(java.lang.String r3) {
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            java.lang.String r2 = "none"
            if (r0 == r1) goto L29
            r1 = 3387192(0x33af38, float:4.746467E-39)
            if (r0 == r1) goto L22
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r0 == r1) goto L19
            goto L31
        L19:
            java.lang.String r0 = "after"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L32
            goto L31
        L22:
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L32
            goto L31
        L29:
            java.lang.String r0 = "before"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L32
        L31:
            return r2
        L32:
            return r3
    }

    public static java.lang.String P(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            java.lang.String r1 = "text"
            switch(r0) {
                case -1243020381: goto L26;
                case 3029889: goto L1d;
                case 3046160: goto L14;
                case 3556653: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L2e
        Ld:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L2f
            goto L2e
        L14:
            java.lang.String r0 = "card"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2f
            goto L2e
        L1d:
            java.lang.String r0 = "both"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2f
            goto L2e
        L26:
            java.lang.String r0 = "global"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2f
        L2e:
            return r1
        L2f:
            return r2
    }

    public static java.lang.String Q(int r2, int r3, java.lang.String r4, java.lang.String r5, int r6) {
            int r3 = r3 + r2
            int r0 = r5.length()
            if (r3 <= r0) goto L8
            r3 = r0
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "handle"
            r0.put(r1, r4)
            java.lang.String r4 = "offset"
            r0.put(r4, r2)
            java.lang.String r4 = "totalChars"
            r0.put(r4, r6)
            java.lang.String r4 = "content"
            java.lang.String r2 = r5.substring(r2, r3)
            r0.put(r4, r2)
            if (r3 >= r6) goto L29
            r2 = 1
            goto L2a
        L29:
            r2 = 0
        L2a:
            java.lang.String r4 = "truncated"
            r0.put(r4, r2)
            if (r3 >= r6) goto L36
            java.lang.String r2 = "nextOffset"
            r0.put(r2, r3)
        L36:
            java.lang.String r2 = r0.toString()
            r2.getClass()
            return r2
    }

    public static java.util.List R(java.lang.String r7) {
            boolean r0 = og.m.t0(r7)
            if (r0 == 0) goto L7
            goto L74
        L7:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L74
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L74
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L74
            r7.<init>()     // Catch: java.lang.Throwable -> L74
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L74
            r2 = 0
        L16:
            if (r2 < r1) goto L26
            java.util.Collection r7 = r7.values()     // Catch: java.lang.Throwable -> L74
            r7.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L74
            java.util.List r7 = tf.m.P1(r7)     // Catch: java.lang.Throwable -> L74
            return r7
        L26:
            org.json.JSONObject r3 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L71
            java.lang.String r4 = "groupId"
            java.lang.String r4 = r3.optString(r4)     // Catch: java.lang.Throwable -> L74
            r4.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "templateId"
            java.lang.String r5 = r3.optString(r5)     // Catch: java.lang.Throwable -> L74
            r5.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L74
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L74
            if (r6 != 0) goto L55
            goto L71
        L55:
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L74
            if (r6 != 0) goto L5c
            goto L71
        L5c:
            java.lang.String r6 = "label"
            java.lang.String r3 = r3.optString(r6)     // Catch: java.lang.Throwable -> L74
            boolean r6 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L69
            r3 = r4
        L69:
            o9.r r6 = new o9.r     // Catch: java.lang.Throwable -> L74
            r6.<init>(r4, r3, r5)     // Catch: java.lang.Throwable -> L74
            r7.put(r4, r6)     // Catch: java.lang.Throwable -> L74
        L71:
            int r2 = r2 + 1
            goto L16
        L74:
            tf.t r7 = tf.t.f13167g
            return r7
    }

    public static final java.util.Set S(java.lang.String r3) {
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            r0 = 6
            char[] r1 = new char[r0]
            r1 = {x0056: FILL_ARRAY_DATA , data: [44, 124, 59, 10, -244, -229} // fill-array
            java.util.List r3 = og.m.F0(r3, r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L1b
        L2b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L49
            r2 = 1
            goto L4a
        L49:
            r2 = 0
        L4a:
            if (r2 == 0) goto L34
            r3.add(r1)
            goto L34
        L50:
            java.util.Set r3 = tf.m.U1(r3)
            return r3
    }

    public static final java.util.Set T(java.lang.String r3) {
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            r0 = 6
            char[] r1 = new char[r0]
            r1 = {x006a: FILL_ARRAY_DATA , data: [44, 124, 59, 10, -244, -229} // fill-array
            java.util.List r3 = og.m.F0(r3, r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r2 = java.util.Locale.ROOT
            r2.getClass()
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.getClass()
            r0.add(r1)
            goto L1b
        L3f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L5d
            r2 = 1
            goto L5e
        L5d:
            r2 = 0
        L5e:
            if (r2 == 0) goto L48
            r3.add(r1)
            goto L48
        L64:
            java.util.Set r3 = tf.m.U1(r3)
            return r3
    }

    public static final java.lang.Integer U(java.lang.String r5) {
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 58
            r3 = 0
            r1[r3] = r2
            r2 = 6
            java.util.List r5 = og.m.F0(r5, r1, r2)
            int r1 = r5.size()
            r2 = 2
            if (r2 > r1) goto L6d
            r4 = 4
            if (r1 >= r4) goto L6d
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r1 = og.t.f0(r1)
            if (r1 == 0) goto L6d
            int r1 = r1.intValue()
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = og.t.f0(r0)
            if (r0 == 0) goto L6d
            int r0 = r0.intValue()
            java.lang.Object r5 = tf.m.w1(r2, r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L53
            r2 = 10
            java.lang.Integer r5 = og.t.e0(r2, r5)
            if (r5 == 0) goto L53
            int r3 = r5.intValue()
        L53:
            if (r1 < 0) goto L6d
            r5 = 24
            if (r1 >= r5) goto L6d
            if (r0 < 0) goto L6d
            r5 = 60
            if (r0 >= r5) goto L6d
            if (r3 < 0) goto L6d
            if (r3 >= r5) goto L6d
            int r1 = r1 * 3600
            int r0 = r0 * r5
            int r0 = r0 + r1
            int r0 = r0 + r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L6d:
            r5 = 0
            return r5
    }

    public static java.util.List V(java.lang.String r20) {
            r0 = r20
            tf.t r1 = tf.t.f13167g
            if (r0 == 0) goto Laf
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto Le
            goto Laf
        Le:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L25
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L25
            uf.c r0 = a.a.E()     // Catch: java.lang.Throwable -> L25
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L25
            r4 = 0
            r5 = r4
        L1d:
            if (r5 < r3) goto L28
            uf.c r0 = a.a.t(r0)     // Catch: java.lang.Throwable -> L25
            goto La6
        L25:
            r0 = move-exception
            goto La0
        L28:
            org.json.JSONObject r6 = r2.optJSONObject(r5)     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L9c
            java.lang.String r7 = "mode"
            int r10 = r6.optInt(r7, r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = "content"
            java.lang.String r8 = ""
            java.lang.String r11 = r6.optString(r7, r8)     // Catch: java.lang.Throwable -> L25
            r11.getClass()     // Catch: java.lang.Throwable -> L25
            boolean r7 = og.m.t0(r11)     // Catch: java.lang.Throwable -> L25
            if (r7 == 0) goto L58
            r7 = 10
            if (r10 == r7) goto L54
            r7 = 11
            if (r10 == r7) goto L54
            r7 = 12
            if (r10 != r7) goto L52
            goto L54
        L52:
            r7 = r4
            goto L55
        L54:
            r7 = 1
        L55:
            if (r7 != 0) goto L58
            goto L9c
        L58:
            java.lang.String r7 = "id"
            java.lang.String r7 = r6.optString(r7)     // Catch: java.lang.Throwable -> L25
            boolean r8 = og.m.t0(r7)     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L7c
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r9.<init>()     // Catch: java.lang.Throwable -> L25
            r9.append(r7)     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = "_"
            r9.append(r7)     // Catch: java.lang.Throwable -> L25
            r9.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L25
        L7c:
            r9 = r7
            java.lang.String r7 = "delayMs"
            r12 = 0
            long r14 = r6.optLong(r7, r12)     // Catch: java.lang.Throwable -> L25
            r16 = 0
            r18 = 600000(0x927c0, double:2.964394E-318)
            long r12 = s(r14, r16, r18)     // Catch: java.lang.Throwable -> L25
            java.lang.String r7 = "randomDelay"
            boolean r14 = r6.optBoolean(r7, r4)     // Catch: java.lang.Throwable -> L25
            x8.s r8 = new x8.s     // Catch: java.lang.Throwable -> L25
            r8.<init>(r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L25
            r0.add(r8)     // Catch: java.lang.Throwable -> L25
        L9c:
            int r5 = r5 + 1
            goto L1d
        La0:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        La6:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto Lac
            goto Lad
        Lac:
            r1 = r0
        Lad:
            java.util.List r1 = (java.util.List) r1
        Laf:
            return r1
    }

    public static java.util.Set W(org.json.JSONArray r5) {
            if (r5 != 0) goto L5
            tf.v r5 = tf.v.f13169g
            return r5
        L5:
            uf.i r0 = new uf.i
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        Lf:
            if (r2 < r1) goto L16
            uf.i r5 = ac.p.h(r0)
            return r5
        L16:
            java.lang.String r3 = r5.optString(r2)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r4 = r3.length()
            if (r4 <= 0) goto L2e
            r0.add(r3)
        L2e:
            int r2 = r2 + 1
            goto Lf
    }

    public static java.util.List X(java.lang.String r47) {
            java.lang.String r0 = "text_first"
            java.lang.String r1 = "global"
            java.lang.String r2 = "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%"
            boolean r3 = og.m.t0(r47)
            if (r3 == 0) goto Le
            goto L1f6
        Le:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1f6
            r4 = r47
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1f6
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f6
            r4.<init>()     // Catch: java.lang.Throwable -> L1f6
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L1f6
            r6 = 0
            r7 = r6
        L20:
            if (r7 < r5) goto L23
            return r4
        L23:
            org.json.JSONObject r8 = r3.optJSONObject(r7)     // Catch: java.lang.Throwable -> L1f6
            if (r8 == 0) goto L1f2
            java.lang.String r9 = "id"
            java.lang.String r9 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L1f6
            if (r10 == 0) goto L4d
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f6
            r11.<init>()     // Catch: java.lang.Throwable -> L1f6
            r11.append(r9)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "_"
            r11.append(r9)     // Catch: java.lang.Throwable -> L1f6
            r11.append(r7)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L1f6
        L4d:
            r11 = r9
            java.lang.String r9 = "name"
            java.lang.String r9 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L1f6
            if (r10 == 0) goto L6d
            int r9 = r7 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f6
            r10.<init>()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r12 = "模板 "
            r10.append(r12)     // Catch: java.lang.Throwable -> L1f6
            r10.append(r9)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L1f6
        L6d:
            r12 = r9
            java.lang.String r9 = "enabled"
            r10 = 1
            boolean r13 = r8.optBoolean(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinEnabled"
            boolean r14 = r8.optBoolean(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftEnabled"
            boolean r15 = r8.optBoolean(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "promptType"
            java.lang.String r10 = "text"
            java.lang.String r9 = r8.optString(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            r9.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r16 = P(r9)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "bothOrder"
            java.lang.String r9 = r8.optString(r9, r0)     // Catch: java.lang.Throwable -> L1f6
            r9.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r10 = "card_first"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L1f6
            if (r9 == 0) goto La4
            r17 = r10
            goto La6
        La4:
            r17 = r0
        La6:
            java.lang.String r9 = "joinText"
            java.lang.String r10 = "[AtWx=%userWxid%]\n欢迎进群\n时间：%time%\n群昵称：%groupName%\n进群者微信昵称：%userName%\n进群者群内昵称：%groupNickname%\n进群者ID：%userWxid%"
            java.lang.String r18 = r8.optString(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            r18.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftText"
            java.lang.String r10 = "退群通知：\n时间：%time%\n群昵称：%groupName%\n退群者微信昵称：%userName%\n退群者群内昵称：%groupNickname%\n退群者ID：%userWxid%"
            java.lang.String r19 = r8.optString(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            r19.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinCardTitle"
            java.lang.String r10 = "欢迎：%userName%"
            java.lang.String r20 = r8.optString(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            r20.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinCardDesc"
            java.lang.String r21 = r8.optString(r9, r2)     // Catch: java.lang.Throwable -> L1f6
            r21.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftCardTitle"
            java.lang.String r10 = "离群：%userName%"
            java.lang.String r22 = r8.optString(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            r22.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftCardDesc"
            java.lang.String r23 = r8.optString(r9, r2)     // Catch: java.lang.Throwable -> L1f6
            r23.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "mediaMode"
            java.lang.String r9 = r8.optString(r9, r1)     // Catch: java.lang.Throwable -> L1f6
            r9.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r24 = N(r9)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "mediaOrder"
            java.lang.String r10 = "none"
            java.lang.String r9 = r8.optString(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            r9.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r25 = O(r9)     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "mediaSequence"
            java.lang.String r10 = "image,voice,emoji,video,file,favorite"
            java.lang.String r26 = r8.optString(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            r26.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinImages"
            java.lang.String r27 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r27.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftImages"
            java.lang.String r28 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r28.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinVoices"
            java.lang.String r29 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r29.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftVoices"
            java.lang.String r30 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r30.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinEmojis"
            java.lang.String r31 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r31.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftEmojis"
            java.lang.String r32 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r32.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinVideos"
            java.lang.String r33 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r33.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftVideos"
            java.lang.String r34 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r34.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinFiles"
            java.lang.String r35 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r35.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftFiles"
            java.lang.String r36 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r36.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "joinFavorites"
            java.lang.String r37 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r37.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "leftFavorites"
            java.lang.String r38 = r8.optString(r9)     // Catch: java.lang.Throwable -> L1f6
            r38.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r9 = "delayMode"
            java.lang.String r9 = r8.optString(r9, r1)     // Catch: java.lang.Throwable -> L1f6
            r9.getClass()     // Catch: java.lang.Throwable -> L1f6
            java.lang.String r10 = "custom"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L1f6
            if (r9 == 0) goto L18b
            r39 = r10
            goto L18d
        L18b:
            r39 = r1
        L18d:
            java.lang.String r9 = "promptDelayMs"
            int r9 = r8.optInt(r9, r6)     // Catch: java.lang.Throwable -> L1f6
            if (r9 >= 0) goto L198
            r40 = r6
            goto L19a
        L198:
            r40 = r9
        L19a:
            java.lang.String r9 = "imageDelayMs"
            r10 = 100
            int r9 = r8.optInt(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            if (r9 >= 0) goto L1a7
            r41 = r6
            goto L1a9
        L1a7:
            r41 = r9
        L1a9:
            java.lang.String r9 = "voiceDelayMs"
            int r9 = r8.optInt(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            if (r9 >= 0) goto L1b4
            r42 = r6
            goto L1b6
        L1b4:
            r42 = r9
        L1b6:
            java.lang.String r9 = "emojiDelayMs"
            int r9 = r8.optInt(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            if (r9 >= 0) goto L1c1
            r43 = r6
            goto L1c3
        L1c1:
            r43 = r9
        L1c3:
            java.lang.String r9 = "videoDelayMs"
            int r9 = r8.optInt(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            if (r9 >= 0) goto L1ce
            r44 = r6
            goto L1d0
        L1ce:
            r44 = r9
        L1d0:
            java.lang.String r9 = "fileDelayMs"
            int r9 = r8.optInt(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            if (r9 >= 0) goto L1db
            r45 = r6
            goto L1dd
        L1db:
            r45 = r9
        L1dd:
            java.lang.String r9 = "favoriteDelayMs"
            int r8 = r8.optInt(r9, r10)     // Catch: java.lang.Throwable -> L1f6
            if (r8 >= 0) goto L1e8
            r46 = r6
            goto L1ea
        L1e8:
            r46 = r8
        L1ea:
            o9.q r10 = new o9.q     // Catch: java.lang.Throwable -> L1f6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)     // Catch: java.lang.Throwable -> L1f6
            r4.add(r10)     // Catch: java.lang.Throwable -> L1f6
        L1f2:
            int r7 = r7 + 1
            goto L20
        L1f6:
            tf.t r0 = tf.t.f13167g
            return r0
    }

    public static java.util.Set Y(java.lang.String r3) {
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            r0 = 6
            char[] r1 = new char[r0]
            r1 = {x0056: FILL_ARRAY_DATA , data: [44, -244, 59, -229, 10, 13} // fill-array
            java.util.List r3 = og.m.F0(r3, r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L1b
        L2b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L49
            r2 = 1
            goto L4a
        L49:
            r2 = 0
        L4a:
            if (r2 == 0) goto L34
            r3.add(r1)
            goto L34
        L50:
            java.util.Set r3 = tf.m.U1(r3)
            return r3
    }

    public static final java.lang.String Z(h.Hchat.hooks.api.model.WeChatContact r2, boolean r3) {
            r2.getClass()
            if (r3 != 0) goto L13
            java.lang.String r3 = r2.displayName()
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L12
            java.lang.String r2 = r2.wxId
            return r2
        L12:
            return r3
        L13:
            java.lang.String r3 = r2.remarkName
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r2.nickname
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r3.length()
            if (r1 <= 0) goto L42
            int r1 = r0.length()
            if (r1 <= 0) goto L42
            boolean r1 = gg.l.a(r3, r0)
            if (r1 != 0) goto L42
            java.lang.String r2 = "("
            java.lang.String r1 = ")"
            java.lang.String r2 = wb.en.i(r3, r2, r0, r1)
            return r2
        L42:
            int r1 = r3.length()
            if (r1 <= 0) goto L49
            return r3
        L49:
            int r3 = r0.length()
            if (r3 <= 0) goto L50
            return r0
        L50:
            java.lang.String r2 = r2.wxId
            return r2
    }

    public static java.io.Serializable c0(android.content.Context r0, java.lang.String r1) {
            r0.getClass()
            r1.getClass()
            java.io.File r0 = h0(r0, r1)     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r0.isFile()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L17
            java.nio.charset.Charset r1 = og.a.f9804a     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = dg.l.h0(r0, r1)     // Catch: java.lang.Throwable -> L1f
            return r0
        L17:
            java.lang.String r0 = "工具结果已不存在"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L1f:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            return r1
    }

    public static java.lang.String d0(android.content.Context r4, org.json.JSONObject r5) {
            java.lang.String r0 = "handle"
            java.lang.String r1 = ""
            java.lang.String r0 = bc.e.l(r0, r1, r5)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L15
            java.lang.String r4 = "结果 handle 为空"
            java.lang.String r4 = E(r4)
            return r4
        L15:
            java.io.Serializable r4 = c0(r4, r0)
            java.lang.Throwable r1 = sf.g.b(r4)
            if (r1 != 0) goto L4a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "offset"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            int r3 = r4.length()
            int r1 = r(r1, r2, r3)
            java.lang.String r2 = "max_chars"
            r3 = 24000(0x5dc0, float:3.3631E-41)
            int r5 = r5.optInt(r2, r3)
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 48000(0xbb80, float:6.7262E-41)
            int r5 = r(r5, r2, r3)
            int r2 = r4.length()
            java.lang.String r4 = Q(r1, r5, r0, r4, r2)
            return r4
        L4a:
            java.lang.String r4 = r1.getMessage()
            if (r4 == 0) goto L51
            goto L53
        L51:
            java.lang.String r4 = "工具结果不存在"
        L53:
            java.lang.String r4 = E(r4)
            return r4
    }

    public static final void e(y0.o r11, i0.p1 r12, s0.d r13, i0.h0 r14, int r15) {
            r1 = -714464401(0xffffffffd56a236f, float:-1.6089869E13)
            r14.b0(r1)
            r1 = r15 & 6
            if (r1 != 0) goto L15
            boolean r3 = r14.f(r11)
            if (r3 == 0) goto L12
            r3 = 4
            goto L13
        L12:
            r3 = 2
        L13:
            r3 = r3 | r15
            goto L16
        L15:
            r3 = r15
        L16:
            r5 = r15 & 48
            if (r5 != 0) goto L26
            boolean r5 = r14.f(r12)
            if (r5 == 0) goto L23
            r5 = 32
            goto L25
        L23:
            r5 = 16
        L25:
            r3 = r3 | r5
        L26:
            r5 = r15 & 384(0x180, float:5.38E-43)
            s0.d r6 = b0.o.f392a
            if (r5 != 0) goto L38
            boolean r5 = r14.h(r6)
            if (r5 == 0) goto L35
            r5 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r5 = 128(0x80, float:1.8E-43)
        L37:
            r3 = r3 | r5
        L38:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L48
            boolean r5 = r14.h(r13)
            if (r5 == 0) goto L45
            r5 = 2048(0x800, float:2.87E-42)
            goto L47
        L45:
            r5 = 1024(0x400, float:1.435E-42)
        L47:
            r3 = r3 | r5
        L48:
            r5 = r3 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r5 == r7) goto L50
            r5 = 1
            goto L51
        L50:
            r5 = 0
        L51:
            r7 = r3 & 1
            boolean r5 = r14.S(r7, r5)
            if (r5 == 0) goto L91
            java.lang.Object r5 = r14.P()
            i0.e r7 = i0.l.f5952a
            if (r5 != r7) goto L6d
            i0.e r5 = i0.e.f5867j
            i0.j1 r7 = new i0.j1
            r9 = 0
            r7.<init>(r9, r5)
            r14.k0(r7)
            r5 = r7
        L6d:
            r7 = r5
            i0.a1 r7 = (i0.a1) r7
            int r3 = r3 >> 6
            r3 = r3 & 14
            d0.c r9 = j(r6, r14, r3)
            i0.q1 r3 = r12.a(r9)
            c9.q0 r5 = new c9.q0
            r10 = 1
            r6 = r11
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r1 = 274270255(0x1059082f, float:4.280201E-29)
            s0.d r1 = s0.i.e(r1, r5, r14)
            r5 = 56
            i0.r.a(r3, r1, r14, r5)
            goto L94
        L91:
            r14.V()
        L94:
            i0.r1 r6 = r14.t()
            if (r6 == 0) goto La6
            b0.r r0 = new b0.r
            r5 = 2
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        La6:
            return
    }

    public static final java.lang.String e0(java.io.Reader r4) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            char[] r1 = new char[r1]
            int r2 = r4.read(r1)
        Ld:
            if (r2 < 0) goto L18
            r3 = 0
            r0.write(r1, r3, r2)
            int r2 = r4.read(r1)
            goto Ld
        L18:
            java.lang.String r4 = r0.toString()
            r4.getClass()
            return r4
    }

    public static final void f(java.util.ArrayList r35, int r36, java.lang.String r37, y0.o r38, sh.a r39, java.lang.String r40, sh.a r41, sh.t r42, p.x0 r43, boolean r44, fg.l r45, i0.h0 r46, int r47, int r48) {
            r10 = r44
            r8 = r46
            r12 = r47
            r13 = r48
            r0 = -920742512(0xffffffffc91e9590, float:-649561.0)
            r8.b0(r0)
            r0 = r12 & 6
            r1 = r35
            if (r0 != 0) goto L1f
            boolean r0 = r8.h(r1)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r12
            goto L20
        L1f:
            r0 = r12
        L20:
            r2 = r12 & 48
            if (r2 != 0) goto L33
            r2 = r36
            boolean r3 = r8.d(r2)
            if (r3 == 0) goto L2f
            r3 = 32
            goto L31
        L2f:
            r3 = 16
        L31:
            r0 = r0 | r3
            goto L35
        L33:
            r2 = r36
        L35:
            r3 = r12 & 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L4a
            r3 = r37
            boolean r6 = r8.f(r3)
            if (r6 == 0) goto L47
            r6 = r4
            goto L48
        L47:
            r6 = r5
        L48:
            r0 = r0 | r6
            goto L4c
        L4a:
            r3 = r37
        L4c:
            r6 = r0 | 3072(0xc00, float:4.305E-42)
            r7 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L54
            r6 = r0 | 11264(0x2c00, float:1.5784E-41)
        L54:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r12
            if (r0 != 0) goto L68
            r0 = r40
            boolean r7 = r8.f(r0)
            if (r7 == 0) goto L64
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L66
        L64:
            r7 = 65536(0x10000, float:9.1835E-41)
        L66:
            r6 = r6 | r7
            goto L6a
        L68:
            r0 = r40
        L6a:
            r7 = 1572864(0x180000, float:2.204052E-39)
            r9 = r12 & r7
            if (r9 != 0) goto L73
            r9 = 524288(0x80000, float:7.34684E-40)
            r6 = r6 | r9
        L73:
            r9 = 12582912(0xc00000, float:1.7632415E-38)
            r9 = r9 & r12
            if (r9 != 0) goto L7b
            r9 = 4194304(0x400000, float:5.877472E-39)
            r6 = r6 | r9
        L7b:
            r9 = 905969664(0x36000000, float:1.9073486E-6)
            r6 = r6 | r9
            r9 = r13 | 54
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L8d
            boolean r11 = r8.g(r10)
            if (r11 == 0) goto L8b
            goto L8c
        L8b:
            r4 = r5
        L8c:
            r9 = r9 | r4
        L8d:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            r5 = 1
            if (r4 != 0) goto L9e
            boolean r4 = r8.g(r5)
            if (r4 == 0) goto L9b
            r4 = 2048(0x800, float:2.87E-42)
            goto L9d
        L9b:
            r4 = 1024(0x400, float:1.435E-42)
        L9d:
            r9 = r9 | r4
        L9e:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            r11 = r45
            if (r4 != 0) goto Lb0
            boolean r4 = r8.h(r11)
            if (r4 == 0) goto Lad
            r4 = 16384(0x4000, float:2.2959E-41)
            goto Laf
        Lad:
            r4 = 8192(0x2000, float:1.148E-41)
        Laf:
            r9 = r9 | r4
        Lb0:
            r4 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r4 & r6
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r14) goto Lc2
            r4 = r9 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r4 == r14) goto Lc0
            goto Lc2
        Lc0:
            r4 = 0
            goto Lc3
        Lc2:
            r4 = r5
        Lc3:
            r14 = r6 & 1
            boolean r4 = r8.S(r14, r4)
            if (r4 == 0) goto L2fe
            r8.X()
            r4 = r12 & 1
            r14 = -33087489(0xfffffffffe071fff, float:-4.490298E37)
            i0.e r5 = i0.l.f5952a
            if (r4 == 0) goto Lf1
            boolean r4 = r8.B()
            if (r4 == 0) goto Lde
            goto Lf1
        Lde:
            r8.V()
            r4 = r6 & r14
            r0 = r38
            r1 = r39
            r2 = r41
            r21 = r42
            r3 = r43
            r25 = r7
            goto L1d0
        Lf1:
            p.z0 r4 = sh.b.f12506a
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r17 = r8.j(r4)
            bi.b r17 = (bi.b) r17
            r19 = r14
            long r14 = r17.d()
            java.lang.Object r17 = r8.j(r4)
            bi.b r17 = (bi.b) r17
            long r0 = r17.c()
            boolean r17 = r8.e(r14)
            boolean r20 = r8.e(r0)
            r17 = r17 | r20
            r25 = r7
            java.lang.Object r7 = r8.P()
            if (r17 != 0) goto L11f
            if (r7 != r5) goto L127
        L11f:
            sh.a r7 = new sh.a
            r7.<init>(r14, r0)
            r8.k0(r7)
        L127:
            r0 = r7
            sh.a r0 = (sh.a) r0
            java.lang.Object r1 = r8.j(r4)
            bi.b r1 = (bi.b) r1
            long r14 = r1.h()
            java.lang.Object r1 = r8.j(r4)
            bi.b r1 = (bi.b) r1
            r38 = r0
            long r0 = r1.c()
            boolean r4 = r8.e(r14)
            boolean r7 = r8.e(r0)
            r4 = r4 | r7
            java.lang.Object r7 = r8.P()
            if (r4 != 0) goto L151
            if (r7 != r5) goto L159
        L151:
            sh.a r7 = new sh.a
            r7.<init>(r14, r0)
            r8.k0(r7)
        L159:
            r0 = r7
            sh.a r0 = (sh.a) r0
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r4 = r8.j(r1)
            bi.b r4 = (bi.b) r4
            i0.j1 r4 = r4.P
            java.lang.Object r4 = r4.getValue()
            f1.w r4 = (f1.w) r4
            long r14 = r4.f3133a
            java.lang.Object r4 = r8.j(r1)
            bi.b r4 = (bi.b) r4
            long r2 = r4.m()
            java.lang.Object r4 = r8.j(r1)
            bi.b r4 = (bi.b) r4
            r17 = r6
            long r6 = r4.j()
            java.lang.Object r1 = r8.j(r1)
            bi.b r1 = (bi.b) r1
            r39 = r0
            long r0 = r1.m()
            boolean r4 = r8.e(r14)
            boolean r20 = r8.e(r2)
            r4 = r4 | r20
            boolean r20 = r8.e(r6)
            r4 = r4 | r20
            boolean r20 = r8.e(r0)
            r4 = r4 | r20
            r33 = r0
            java.lang.Object r0 = r8.P()
            if (r4 != 0) goto L1b0
            if (r0 != r5) goto L1c0
        L1b0:
            sh.t r26 = new sh.t
            r29 = r2
            r31 = r6
            r27 = r14
            r26.<init>(r27, r29, r31, r33)
            r0 = r26
            r8.k0(r0)
        L1c0:
            sh.t r0 = (sh.t) r0
            r4 = r17 & r19
            p.z0 r1 = sh.b.f12506a
            y0.l r2 = y0.l.f21818a
            r21 = r0
            r3 = r1
            r0 = r2
            r1 = r38
            r2 = r39
        L1d0:
            r8.q()
            java.lang.Object r6 = r8.P()
            if (r6 != r5) goto L1e1
            n.k r6 = new n.k
            r6.<init>()
            r8.k0(r6)
        L1e1:
            n.k r6 = (n.k) r6
            java.lang.Object r7 = r8.P()
            if (r7 != r5) goto L1f2
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            i0.j1 r7 = i0.r.u(r7)
            r8.k0(r7)
        L1f2:
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r14 = r8.P()
            if (r14 != r5) goto L203
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            i0.j1 r14 = i0.r.u(r14)
            r8.k0(r14)
        L203:
            i0.a1 r14 = (i0.a1) r14
            i0.m2 r15 = y1.h1.f21950l
            java.lang.Object r15 = r8.j(r15)
            n1.a r15 = (n1.a) r15
            r38 = r0
            i0.a1 r0 = i0.r.y(r15, r8)
            boolean r17 = r35.isEmpty()
            r22 = r15
            r15 = r17 ^ 1
            if (r10 == 0) goto L223
            if (r17 != 0) goto L223
            r39 = r1
            r1 = 1
            goto L226
        L223:
            r39 = r1
            r1 = 0
        L226:
            if (r1 == 0) goto L24d
            r41 = r2
            r2 = 2117080340(0x7e301514, float:5.8513393E37)
            r8.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r8.j(r2)
            bi.b r2 = (bi.b) r2
            i0.j1 r2 = r2.M
            java.lang.Object r2 = r2.getValue()
            f1.w r2 = (f1.w) r2
            r42 = r3
            long r2 = r2.f3133a
            r16 = r2
            r2 = 0
            r8.p(r2)
        L24a:
            r18 = r16
            goto L268
        L24d:
            r41 = r2
            r42 = r3
            r2 = 0
            r3 = 2117147889(0x7e311cf1, float:5.8855907E37)
            r8.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r8.j(r3)
            bi.b r3 = (bi.b) r3
            long r16 = r3.c()
            r8.p(r2)
            goto L24a
        L268:
            boolean r2 = r8.g(r1)
            java.lang.Object r3 = r8.P()
            if (r2 != 0) goto L274
            if (r3 != r5) goto L27c
        L274:
            wb.gf r3 = new wb.gf
            r3.<init>(r1, r7, r14, r0)
            r8.k0(r3)
        L27c:
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r14.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r24 = r14
            xh.s r14 = new xh.s
            r16 = r35
            r17 = r36
            r20 = r7
            r23 = r11
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r24)
            r2 = -1045264474(0xffffffffc1b287a6, float:-22.316235)
            s0.d r2 = s0.i.e(r2, r14, r8)
            int r5 = r4 >> 9
            r7 = r5 & 14
            r7 = r7 | r25
            int r11 = r4 >> 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r7 = r7 | r11
            int r4 = r4 >> 6
            r11 = r4 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r11
            r5 = r5 | r7
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r7
            r4 = r4 | r5
            int r5 = r9 << 24
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r7
            r4 = r4 | r5
            sh.m r14 = new sh.m
            r15 = r37
            r16 = r39
            r18 = r40
            r19 = r41
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            r5 = r17
            r1 = -682683637(0xffffffffd74f130b, float:-2.276807E14)
            s0.d r7 = s0.i.e(r1, r14, r8)
            r1 = r4 & 14
            r9 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r9
            int r4 = r4 >> 12
            r9 = r4 & 112(0x70, float:1.57E-43)
            r1 = r1 | r9
            r1 = r1 | 384(0x180, float:5.38E-43)
            r9 = r4 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r9
            r1 = r1 | r4
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r9 = r1 | r4
            r4 = r0
            r1 = r2
            r0 = r38
            r2 = r42
            sh.s.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r4 = r0
            r9 = r2
            r5 = r16
            r7 = r19
            r8 = r21
            goto L30b
        L2fe:
            r46.V()
            r4 = r38
            r5 = r39
            r7 = r41
            r8 = r42
            r9 = r43
        L30b:
            i0.r1 r14 = r46.t()
            if (r14 == 0) goto L322
            xh.t r0 = new xh.t
            r1 = r35
            r2 = r36
            r3 = r37
            r6 = r40
            r11 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.f6035d = r0
        L322:
            return
    }

    public static java.lang.String f0(android.content.Context r17, java.util.List r18) {
            r17.getClass()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r18.iterator()
        L16:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            r5 = r4
            fb.c r5 = (fb.c) r5
            java.util.List r5 = r5.f3440j
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L16
            r0.add(r4)
            goto L16
        L2f:
            java.util.Iterator r3 = r0.iterator()
        L33:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L20e
            java.lang.Object r0 = r3.next()
            fb.c r0 = (fb.c) r0
            java.util.List r0 = r0.f3440j
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L91
            java.lang.Object r8 = r0.next()
            r9 = r8
            fb.q1 r9 = (fb.q1) r9
            java.lang.String r10 = r9.f3727g
            java.lang.String r11 = r9.f3732l
            java.lang.String r12 = "running"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L8a
            java.lang.String r12 = "queued"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L8a
            java.lang.String r12 = "interrupted"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L8a
            boolean r10 = og.m.t0(r11)
            if (r10 != 0) goto L8a
            java.lang.String r9 = r9.f3733m
            boolean r9 = og.m.t0(r9)
            if (r9 != 0) goto L8a
            boolean r9 = r2.add(r11)
            if (r9 == 0) goto L8a
            r9 = 1
            goto L8b
        L8a:
            r9 = r5
        L8b:
            if (r9 == 0) goto L4b
            r7.add(r8)
            goto L4b
        L91:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L9a
            r12 = r17
            goto L33
        L9a:
            java.lang.String r8 = "role"
            java.lang.String r9 = "assistant"
            org.json.JSONObject r0 = wb.en.k(r8, r9)
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
            java.util.Iterator r11 = r7.iterator()
        Lab:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lfb
            java.lang.Object r12 = r11.next()
            fb.q1 r12 = (fb.q1) r12
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r14 = r12.f3732l
            java.lang.String r15 = r12.f3734n
            java.lang.String r4 = "id"
            r13.put(r4, r14)
            java.lang.String r4 = "type"
            java.lang.String r14 = "function"
            r13.put(r4, r14)
            boolean r4 = og.m.t0(r15)
            if (r4 != 0) goto Ld7
            java.lang.String r4 = "provider_metadata"
            r13.put(r4, r15)
        Ld7:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r15 = "name"
            r16 = 1
            java.lang.String r6 = r12.f3733m
            r4.put(r15, r6)
            java.lang.String r6 = r12.f3724d
            boolean r12 = og.m.t0(r6)
            if (r12 == 0) goto Lef
            java.lang.String r6 = "{}"
        Lef:
            java.lang.String r12 = "arguments"
            r4.put(r12, r6)
            r13.put(r14, r4)
            r10.put(r13)
            goto Lab
        Lfb:
            r16 = 1
            java.lang.String r4 = "tool_calls"
            r0.put(r4, r10)
            r1.put(r0)
            java.util.Iterator r6 = r7.iterator()
        L109:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1c3
            java.lang.Object r0 = r6.next()
            r7 = r0
            fb.q1 r7 = (fb.q1) r7
            java.lang.String r0 = r7.f3736p
            java.lang.String r10 = r7.f3736p
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L1a8
            r11 = 24000(0x5dc0, float:3.3631E-41)
            r12 = r17
            java.io.File r0 = h0(r12, r10)     // Catch: java.lang.Throwable -> L16c
            boolean r13 = r0.isFile()     // Catch: java.lang.Throwable -> L16c
            if (r13 == 0) goto L174
            java.nio.charset.Charset r13 = og.a.f9804a     // Catch: java.lang.Throwable -> L16c
            java.io.InputStreamReader r14 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L16c
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L16c
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L16c
            r14.<init>(r15, r13)     // Catch: java.lang.Throwable -> L16c
            java.io.BufferedReader r13 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L16c
            r0 = 8192(0x2000, float:1.148E-41)
            r13.<init>(r14, r0)     // Catch: java.lang.Throwable -> L16c
            char[] r0 = new char[r11]     // Catch: java.lang.Throwable -> L151
            r14 = r5
        L144:
            if (r14 >= r11) goto L154
            int r15 = 24000 - r14
            int r15 = r13.read(r0, r14, r15)     // Catch: java.lang.Throwable -> L151
            if (r15 > 0) goto L14f
            goto L154
        L14f:
            int r14 = r14 + r15
            goto L144
        L151:
            r0 = move-exception
            r11 = r0
            goto L16e
        L154:
            fb.r1 r15 = new fb.r1     // Catch: java.lang.Throwable -> L151
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L151
            r11.<init>(r0, r5, r14)     // Catch: java.lang.Throwable -> L151
            int r0 = r13.read()     // Catch: java.lang.Throwable -> L151
            if (r0 < 0) goto L164
            r0 = r16
            goto L165
        L164:
            r0 = r5
        L165:
            r15.<init>(r11, r0)     // Catch: java.lang.Throwable -> L151
            r13.close()     // Catch: java.lang.Throwable -> L16c
            goto L181
        L16c:
            r0 = move-exception
            goto L17c
        L16e:
            throw r11     // Catch: java.lang.Throwable -> L16f
        L16f:
            r0 = move-exception
            ig.a.i(r13, r11)     // Catch: java.lang.Throwable -> L16c
            throw r0     // Catch: java.lang.Throwable -> L16c
        L174:
            java.lang.String r0 = "工具结果已不存在"
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L16c
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L16c
            throw r11     // Catch: java.lang.Throwable -> L16c
        L17c:
            sf.f r15 = new sf.f
            r15.<init>(r0)
        L181:
            java.lang.Throwable r0 = sf.g.b(r15)
            if (r0 != 0) goto L1a1
            fb.r1 r15 = (fb.r1) r15
            boolean r0 = r15.f3750b
            java.lang.String r11 = r15.f3749a
            if (r0 == 0) goto L1ac
            int r0 = r7.f3737q
            int r13 = r11.length()
            int r13 = r13 + 1
            if (r0 >= r13) goto L19a
            r0 = r13
        L19a:
            r13 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.String r11 = Q(r5, r13, r10, r11, r0)
            goto L1ac
        L1a1:
            java.lang.String r0 = "完整工具结果已不存在"
            java.lang.String r11 = E(r0)
            goto L1ac
        L1a8:
            r12 = r17
            java.lang.String r11 = r7.f3725e
        L1ac:
            java.lang.String r0 = "tool"
            org.json.JSONObject r0 = wb.en.k(r8, r0)
            java.lang.String r10 = "tool_call_id"
            java.lang.String r7 = r7.f3732l
            r0.put(r10, r7)
            java.lang.String r7 = "content"
            r0.put(r7, r11)
            r1.put(r0)
            goto L109
        L1c3:
            r12 = r17
        L1c5:
            int r0 = M(r1)
            r6 = r16
            if (r0 <= r6) goto L33
            java.lang.String r0 = r1.toString()
            int r0 = r0.length()
            r7 = 120000(0x1d4c0, float:1.68156E-40)
            if (r0 <= r7) goto L33
            org.json.JSONObject r0 = r1.optJSONObject(r5)
            if (r0 == 0) goto L1e5
            java.lang.String r7 = r0.optString(r8)
            goto L1e6
        L1e5:
            r7 = 0
        L1e6:
            boolean r7 = gg.l.a(r7, r9)
            if (r7 == 0) goto L1f7
            org.json.JSONArray r0 = r0.optJSONArray(r4)
            if (r0 == 0) goto L1f7
            int r0 = r0.length()
            goto L1f8
        L1f7:
            r0 = r5
        L1f8:
            r1.remove(r5)
            int r7 = r1.length()
            if (r0 <= r7) goto L202
            r0 = r7
        L202:
            r7 = r5
        L203:
            if (r7 >= r0) goto L20b
            r1.remove(r5)
            int r7 = r7 + 1
            goto L203
        L20b:
            r16 = r6
            goto L1c5
        L20e:
            r6 = 1
            int r0 = r1.length()
            if (r0 <= 0) goto L216
            r5 = r6
        L216:
            if (r5 == 0) goto L219
            goto L21a
        L219:
            r1 = 0
        L21a:
            if (r1 == 0) goto L221
            java.lang.String r4 = r1.toString()
            goto L222
        L221:
            r4 = 0
        L222:
            if (r4 != 0) goto L226
            java.lang.String r4 = ""
        L226:
            return r4
    }

    public static final void g(java.util.ArrayList r19, int r20, boolean r21, fg.a r22, fg.a r23, sh.t r24, n1.a r25, fg.l r26, i0.h0 r27, int r28) {
            r7 = r25
            r0 = r27
            r1 = -202719700(0xfffffffff3eabe2c, float:-3.719649E31)
            r0.b0(r1)
            r11 = r19
            boolean r1 = r0.h(r11)
            if (r1 == 0) goto L14
            r1 = 4
            goto L15
        L14:
            r1 = 2
        L15:
            r1 = r28 | r1
            r12 = r20
            boolean r2 = r0.d(r12)
            if (r2 == 0) goto L22
            r2 = 32
            goto L24
        L22:
            r2 = 16
        L24:
            r1 = r1 | r2
            r3 = r21
            boolean r2 = r0.g(r3)
            if (r2 == 0) goto L30
            r2 = 256(0x100, float:3.59E-43)
            goto L32
        L30:
            r2 = 128(0x80, float:1.8E-43)
        L32:
            r1 = r1 | r2
            r2 = 0
            boolean r2 = r0.f(r2)
            if (r2 == 0) goto L3d
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L3f
        L3d:
            r2 = 65536(0x10000, float:9.1835E-41)
        L3f:
            r1 = r1 | r2
            r6 = r24
            boolean r2 = r0.f(r6)
            if (r2 == 0) goto L4b
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L4d
        L4b:
            r2 = 524288(0x80000, float:7.34684E-40)
        L4d:
            r1 = r1 | r2
            boolean r2 = r0.h(r7)
            if (r2 == 0) goto L57
            r2 = 8388608(0x800000, float:1.1754944E-38)
            goto L59
        L57:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L59:
            r1 = r1 | r2
            r2 = r26
            boolean r4 = r0.h(r2)
            if (r4 == 0) goto L65
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L67
        L65:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L67:
            r1 = r1 | r4
            r4 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r4 & r1
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 == r5) goto L73
            r4 = 1
            goto L74
        L73:
            r4 = 0
        L74:
            r5 = r1 & 1
            boolean r4 = r0.S(r5, r4)
            if (r4 == 0) goto Lb3
            i0.a1 r9 = i0.r.y(r26, r27)
            i0.a1 r10 = i0.r.y(r7, r0)
            s0.c r8 = new s0.c
            r14 = 13
            r13 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4 = 93904438(0x598de36, float:1.4375639E-35)
            s0.d r16 = s0.i.e(r4, r8, r0)
            int r4 = r1 >> 6
            r4 = r4 & 14
            int r1 = r1 << 6
            r5 = 807078912(0x301b0c00, float:5.6405725E-10)
            r4 = r4 | r5
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r5
            r18 = r4 | r1
            r9 = 0
            r10 = 0
            sh.g0 r11 = sh.g0.f12583h
            r12 = 0
            r15 = 0
            r13 = r22
            r14 = r23
            r17 = r0
            r8 = r3
            xh.v.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto Lb6
        Lb3:
            r27.V()
        Lb6:
            i0.r1 r10 = r27.t()
            if (r10 == 0) goto Ld2
            w.u r0 = new w.u
            r1 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r9 = r28
            r8 = r2
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        Ld2:
            return
    }

    public static final void g0(java.lang.Object[] r1, int r2, int r3) {
            r1.getClass()
        L3:
            if (r2 >= r3) goto Lb
            r0 = 0
            r1[r2] = r0
            int r2 = r2 + 1
            goto L3
        Lb:
            return
    }

    public static final boolean h(b1.h r10, long r11) {
            y0.n r0 = r10.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto L7
            goto L5b
        L7:
            x1.f0 r0 = x1.k.w(r10)
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            x1.b2 r1 = r0.Y
            boolean r1 = r1.f21832t
            if (r1 != 0) goto L16
            goto L5b
        L16:
            r1 = 0
            long r0 = r0.m0(r1)
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r6 = r10.f443w
            long r8 = r6 >> r2
            int r10 = (int) r8
            float r10 = (float) r10
            float r10 = r10 + r3
            long r6 = r6 & r4
            int r1 = (int) r6
            float r1 = (float) r1
            float r1 = r1 + r0
            long r6 = r11 >> r2
            int r2 = (int) r6
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L5b
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 > 0) goto L5b
            long r10 = r11 & r4
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 > 0) goto L5b
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 > 0) goto L5b
            r10 = 1
            return r10
        L5b:
            r10 = 0
            return r10
    }

    public static java.io.File h0(android.content.Context r6, java.lang.String r7) {
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 58
            r3 = 0
            r1[r3] = r2
            r2 = 2
            java.util.List r7 = og.m.F0(r7, r1, r2)
            int r1 = r7.size()
            r4 = 0
            java.lang.String r5 = "结果 handle 无效"
            if (r1 != r2) goto L57
            java.lang.Object r1 = r7.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = j0(r1)
            java.lang.Object r2 = r7.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = j0(r2)
            java.lang.Object r3 = r7.get(r3)
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L53
            java.lang.Object r7 = r7.get(r0)
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L53
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.io.File r6 = i0(r6)
            r0.<init>(r6, r1)
            java.lang.String r6 = ".txt"
            java.lang.String r6 = r2.concat(r6)
            r7.<init>(r0, r6)
            return r7
        L53:
            j8.o.t(r5)
            return r4
        L57:
            j8.o.t(r5)
            return r4
    }

    public static final java.lang.String i(java.lang.Object[] r3, int r4, int r5, tf.g r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lf:
            if (r1 >= r5) goto L2a
            if (r1 <= 0) goto L18
            java.lang.String r2 = ", "
            r0.append(r2)
        L18:
            int r2 = r4 + r1
            r2 = r3[r2]
            if (r2 != r6) goto L24
            java.lang.String r2 = "(this Collection)"
            r0.append(r2)
            goto L27
        L24:
            r0.append(r2)
        L27:
            int r1 = r1 + 1
            goto Lf
        L2a:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.io.File i0(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.io.File r2 = r1.scriptDir(r2)
            java.io.File r2 = r2.getParentFile()
            java.lang.String r1 = "Agent/tool-results"
            r0.<init>(r2, r1)
            r0.mkdirs()
            return r0
    }

    public static final d0.c j(s0.d r2, i0.h0 r3, int r4) {
            r0 = r4 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto Ld
            boolean r0 = r3.f(r2)
            if (r0 != 0) goto L11
        Ld:
            r4 = r4 & 6
            if (r4 != r1) goto L13
        L11:
            r4 = 1
            goto L14
        L13:
            r4 = 0
        L14:
            java.lang.Object r0 = r3.P()
            i0.e r1 = i0.l.f5952a
            if (r4 != 0) goto L1e
            if (r0 != r1) goto L26
        L1e:
            d0.c r0 = new d0.c
            r0.<init>(r2)
            r3.k0(r0)
        L26:
            d0.c r0 = (d0.c) r0
            boolean r2 = r3.f(r0)
            java.lang.Object r4 = r3.P()
            if (r2 != 0) goto L34
            if (r4 != r1) goto L3e
        L34:
            b0.d0 r4 = new b0.d0
            r2 = 9
            r4.<init>(r0, r2)
            r3.k0(r4)
        L3e:
            fg.l r4 = (fg.l) r4
            i0.r.c(r0, r4, r3)
            return r0
    }

    public static java.lang.String j0(java.lang.String r1) {
            java.lang.String r0 = "[^A-Za-z0-9_-]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r1.getClass()
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = "_"
            java.lang.String r1 = r1.replaceAll(r0)
            r1.getClass()
            r0 = 96
            java.lang.String r1 = og.m.P0(r0, r1)
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L27
            java.lang.String r1 = "item"
        L27:
            return r1
    }

    public static void k0(android.view.inputmethod.EditorInfo r11, java.lang.CharSequence r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            b2.b.f(r11, r12)
            return
        La:
            r12.getClass()
            if (r0 < r1) goto L13
            b2.b.f(r11, r12)
            return
        L13:
            int r0 = r11.initialSelStart
            int r1 = r11.initialSelEnd
            if (r0 <= r1) goto L1b
            r2 = r1
            goto L1c
        L1b:
            r2 = r0
        L1c:
            if (r0 <= r1) goto L1f
            goto L20
        L1f:
            r0 = r1
        L20:
            int r1 = r12.length()
            r3 = 0
            r4 = 0
            if (r2 < 0) goto Lb6
            if (r0 <= r1) goto L2c
            goto Lb6
        L2c:
            int r5 = r11.inputType
            r5 = r5 & 4095(0xfff, float:5.738E-42)
            r6 = 129(0x81, float:1.81E-43)
            if (r5 == r6) goto Lb2
            r6 = 225(0xe1, float:3.15E-43)
            if (r5 == r6) goto Lb2
            r6 = 18
            if (r5 != r6) goto L3e
            goto Lb2
        L3e:
            r4 = 2048(0x800, float:2.87E-42)
            if (r1 > r4) goto L46
            m0(r11, r12, r2, r0)
            return
        L46:
            int r1 = r0 - r2
            r4 = 1024(0x400, float:1.435E-42)
            if (r1 <= r4) goto L4e
            r4 = r3
            goto L4f
        L4e:
            r4 = r1
        L4f:
            int r5 = r12.length()
            int r5 = r5 - r0
            int r6 = 2048 - r4
            r7 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r9 = (double) r6
            double r9 = r9 * r7
            int r7 = (int) r9
            int r7 = java.lang.Math.min(r2, r7)
            int r7 = r6 - r7
            int r5 = java.lang.Math.min(r5, r7)
            int r6 = r6 - r5
            int r6 = java.lang.Math.min(r2, r6)
            int r2 = r2 - r6
            char r7 = r12.charAt(r2)
            boolean r7 = java.lang.Character.isLowSurrogate(r7)
            if (r7 == 0) goto L7c
            int r2 = r2 + 1
            int r6 = r6 + (-1)
        L7c:
            int r7 = r0 + r5
            r8 = 1
            int r7 = r7 - r8
            char r7 = r12.charAt(r7)
            boolean r7 = java.lang.Character.isHighSurrogate(r7)
            if (r7 == 0) goto L8c
            int r5 = r5 + (-1)
        L8c:
            int r7 = r6 + r4
            int r9 = r7 + r5
            if (r4 == r1) goto La9
            int r1 = r2 + r6
            java.lang.CharSequence r1 = r12.subSequence(r2, r1)
            int r5 = r5 + r0
            java.lang.CharSequence r12 = r12.subSequence(r0, r5)
            r0 = 2
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            r0[r3] = r1
            r0[r8] = r12
            java.lang.CharSequence r12 = android.text.TextUtils.concat(r0)
            goto Lae
        La9:
            int r9 = r9 + r2
            java.lang.CharSequence r12 = r12.subSequence(r2, r9)
        Lae:
            m0(r11, r12, r6, r7)
            return
        Lb2:
            m0(r11, r4, r3, r3)
            return
        Lb6:
            m0(r11, r4, r3, r3)
            return
    }

    public static void l0(android.view.inputmethod.EditorInfo r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L9
            i3.a.b(r2, r3)
        L9:
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto L14
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        L14:
            android.os.Bundle r2 = r2.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r2.putBoolean(r0, r3)
            return
    }

    public static void m0(android.view.inputmethod.EditorInfo r2, java.lang.CharSequence r3, int r4, int r5) {
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        Lb:
            if (r3 == 0) goto L13
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r3)
            goto L14
        L13:
            r0 = 0
        L14:
            android.os.Bundle r3 = r2.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            r3.putCharSequence(r1, r0)
            android.os.Bundle r3 = r2.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            r3.putInt(r0, r4)
            android.os.Bundle r2 = r2.extras
            java.lang.String r3 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            r2.putInt(r3, r5)
            return
    }

    public static int n(int r0, int r1) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            return r0
    }

    public static lg.b n0(lg.d r2, int r3) {
            r2.getClass()
            if (r3 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L1e
            int r0 = r2.f8042g
            int r1 = r2.f8043h
            int r2 = r2.f8044i
            if (r2 <= 0) goto L17
            goto L18
        L17:
            int r3 = -r3
        L18:
            lg.b r2 = new lg.b
            r2.<init>(r0, r1, r3)
            return r2
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Step must be positive, was: "
            r3.<init>(r0)
            r3.append(r1)
            r0 = 46
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.Comparable o(u2.f r1, u2.f r2) {
            int r0 = r1.compareTo(r2)
            if (r0 <= 0) goto L7
            return r2
        L7:
            return r1
    }

    public static fb.s1 o0(android.content.Context r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            r12.getClass()
            r13.getClass()
            if (r14 == 0) goto L18
            fb.s1 r0 = new fb.s1
            int r4 = r13.length()
            r5 = 0
            r6 = 0
            java.lang.String r3 = ""
            r2 = r13
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L18:
            r1 = r13
            int r13 = r1.length()
            r14 = 24000(0x5dc0, float:3.3631E-41)
            if (r13 > r14) goto L31
            r2 = r1
            fb.s1 r1 = new fb.s1
            int r5 = r2.length()
            r6 = 0
            r7 = 0
            java.lang.String r4 = ""
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L31:
            boolean r13 = og.m.t0(r12)
            if (r13 == 0) goto L39
            java.lang.String r12 = "session"
        L39:
            java.lang.String r12 = j0(r12)
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r13.getClass()
            java.lang.String r0 = "-"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r13 = og.t.a0(r13, r0, r2, r3)
            java.io.File r0 = new java.io.File
            java.io.File r11 = i0(r11)
            r0.<init>(r11, r12)
            r0.mkdirs()
            java.io.File r11 = new java.io.File
            java.lang.String r2 = ".txt"
            java.lang.String r2 = r13.concat(r2)
            r11.<init>(r0, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r4 = ".tmp"
            java.lang.String r4 = r13.concat(r4)
            r2.<init>(r0, r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r2)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Ld6
            r0.getClass()     // Catch: java.lang.Throwable -> Ld6
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Ld6
            r0.getClass()     // Catch: java.lang.Throwable -> Ld6
            r4.write(r0)     // Catch: java.lang.Throwable -> Ld6
            java.io.FileDescriptor r0 = r4.getFD()     // Catch: java.lang.Throwable -> Ld6
            r0.sync()     // Catch: java.lang.Throwable -> Ld6
            r4.close()
            java.lang.String r0 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L9d
            android.system.Os.rename(r0, r4)     // Catch: java.lang.Throwable -> L9d
            goto La4
        L9d:
            r0 = move-exception
            boolean r11 = r2.renameTo(r11)
            if (r11 == 0) goto Lcb
        La4:
            java.lang.String r11 = ":"
            java.lang.String r7 = wb.en.h(r12, r11, r13)
            fb.s1 r4 = new fb.s1
            r11 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.String r11 = og.m.P0(r11, r1)
            java.lang.String r12 = "\n\n[结果较长，完整内容可分页读取]"
            java.lang.String r5 = r11.concat(r12)
            int r11 = r1.length()
            java.lang.String r6 = Q(r3, r14, r7, r1, r11)
            int r8 = r1.length()
            r9 = 1
            r10 = 24000(0x5dc0, float:3.3631E-41)
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        Lcb:
            r2.delete()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "保存完整工具结果失败"
            r11.<init>(r12, r0)
            throw r11
        Ld6:
            r0 = move-exception
            r11 = r0
            throw r11     // Catch: java.lang.Throwable -> Ld9
        Ld9:
            r0 = move-exception
            r12 = r0
            ig.a.i(r4, r11)
            throw r12
    }

    public static double p(double r1, double r3, double r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r2.<init>(r0)
            r2.append(r5)
            java.lang.String r5 = " is less than minimum "
            r2.append(r5)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final long p0(long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (int) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = (int) r6
            long r4 = (long) r1
            long r0 = r4 << r0
            long r6 = (long) r6
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }

    public static float q(float r2, float r3, float r4) {
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r4
        Le:
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static final long q0(long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = (float) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = (float) r6
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            long r0 = r4 << r0
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }

    public static int r(int r2, int r3, int r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static lg.d r0(int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 > r0) goto L9
            lg.d r2 = lg.d.f8049j
            lg.d r2 = lg.d.f8049j
            return r2
        L9:
            lg.d r0 = new lg.d
            r1 = 1
            int r3 = r3 - r1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static long s(long r1, long r3, long r5) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return r3
        L9:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto Le
            return r5
        Le:
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot coerce value to an empty range: maximum "
            java.lang.String r0 = " is less than minimum "
            java.lang.StringBuilder r2 = p.a.o(r5, r2, r0)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static void s0(e5.a r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            if (r1 == 0) goto L6
            r0.m(r1)
            goto Lb
        L6:
            b6.h r1 = b6.h.f499g
            r0.g(r1)
        Lb:
            r1 = 58
            r0.write(r1)
            if (r2 == 0) goto L16
            r0.t(r2)
            goto L1b
        L16:
            java.lang.String r1 = "V"
            r0.t(r1)
        L1b:
            if (r3 == 0) goto L25
            java.lang.String r1 = ", "
            r0.write(r1)
            r0.m(r3)
        L25:
            return
    }

    public static java.lang.Comparable t(java.lang.Float r3, lg.a r4) {
            float r0 = r4.f8041b
            float r1 = r4.f8040a
            boolean r2 = r4.c()
            if (r2 != 0) goto L3c
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            boolean r4 = lg.a.d(r3, r4)
            if (r4 == 0) goto L23
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            boolean r4 = lg.a.d(r4, r3)
            if (r4 != 0) goto L23
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            return r3
        L23:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            boolean r4 = lg.a.d(r4, r3)
            if (r4 == 0) goto L3b
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            boolean r4 = lg.a.d(r3, r4)
            if (r4 != 0) goto L3b
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
        L3b:
            return r3
        L3c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.<init>(r1)
            r0.append(r4)
            r4 = 46
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public static java.lang.Comparable u(u2.f r2, u2.f r3, u2.f r4) {
            int r0 = r3.compareTo(r4)
            if (r0 > 0) goto L15
            int r0 = r2.compareTo(r3)
            if (r0 >= 0) goto Ld
            return r3
        Ld:
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L14
            return r4
        L14:
            return r2
        L15:
            java.lang.String r2 = " is less than minimum "
            r0 = 46
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            ah.a.j(r4, r1, r2, r3, r0)
            r2 = 0
            return r2
    }

    public static void v(f1.h r2, android.graphics.BlurMaskFilter r3, int r4) {
            long r0 = f1.w.f3126b
            r4 = r4 & 8
            if (r4 == 0) goto L8
            r4 = 0
            goto L9
        L8:
            r4 = 1
        L9:
            r2.w(r0)
            r0 = 3
            r2.v(r0)
            r2.D(r4)
            java.lang.Object r2 = r2.f3058i
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            r2.setMaskFilter(r3)
            return
    }

    public static int w(int r1) {
            int r0 = t3.c.b(r1)
            switch(r0) {
                case 4: goto L1c;
                case 5: goto L1a;
                case 6: goto L18;
                case 7: goto L18;
                case 8: goto L16;
                default: goto L7;
            }
        L7:
            java.lang.String r1 = j8.b.v(r1)
            java.lang.String r0 = "Unsupported method handle type: "
            java.lang.String r1 = r0.concat(r1)
            ah.a.k(r1)
            r1 = 0
            return r1
        L16:
            r1 = 4
            return r1
        L18:
            r1 = 2
            return r1
        L1a:
            r1 = 3
            return r1
        L1c:
            r1 = 1
            return r1
    }

    public static java.util.List x(android.content.Context r25, java.lang.String r26, java.lang.String r27, java.util.List r28) {
            java.lang.String r0 = ".txt"
            r26.getClass()
            java.lang.String r1 = j0(r26)
            java.lang.String r2 = j0(r27)
            java.io.File r3 = new java.io.File
            java.io.File r4 = i0(r25)
            r3.<init>(r4, r1)
            java.io.File r4 = new java.io.File
            java.io.File r5 = i0(r25)
            r4.<init>(r5, r2)
            r4.mkdirs()
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lff
            int r6 = tf.n.e1(r28)     // Catch: java.lang.Throwable -> Lff
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lff
            java.util.Iterator r6 = r28.iterator()     // Catch: java.lang.Throwable -> Lff
        L2f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Lff
            if (r7 == 0) goto L13f
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lff
            r8 = r7
            fb.c r8 = (fb.c) r8     // Catch: java.lang.Throwable -> Lff
            java.util.List r7 = r8.f3440j     // Catch: java.lang.Throwable -> Lff
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> Lff
            if (r7 == 0) goto L46
            goto L135
        L46:
            java.util.List r7 = r8.f3440j     // Catch: java.lang.Throwable -> Lff
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lff
            int r10 = tf.n.e1(r7)     // Catch: java.lang.Throwable -> Lff
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lff
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lff
        L55:
            boolean r10 = r7.hasNext()     // Catch: java.lang.Throwable -> Lff
            if (r10 == 0) goto L119
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> Lff
            r11 = r10
            fb.q1 r11 = (fb.q1) r11     // Catch: java.lang.Throwable -> Lff
            java.lang.String r10 = r11.f3736p     // Catch: java.lang.Throwable -> Lff
            boolean r10 = og.m.t0(r10)     // Catch: java.lang.Throwable -> Lff
            if (r10 == 0) goto L6c
            goto Lfa
        L6c:
            java.lang.String r10 = r11.f3736p     // Catch: java.lang.Throwable -> Lff
            r12 = 1
            char[] r13 = new char[r12]     // Catch: java.lang.Throwable -> Lff
            r14 = 0
            r15 = 58
            r13[r14] = r15     // Catch: java.lang.Throwable -> Lff
            r15 = 2
            java.util.List r10 = og.m.F0(r10, r13, r15)     // Catch: java.lang.Throwable -> Lff
            int r13 = r10.size()     // Catch: java.lang.Throwable -> Lff
            if (r13 != r15) goto L111
            java.lang.Object r13 = r10.get(r14)     // Catch: java.lang.Throwable -> Lff
            boolean r13 = gg.l.a(r13, r1)     // Catch: java.lang.Throwable -> Lff
            if (r13 == 0) goto L111
            java.lang.Object r13 = r10.get(r12)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> Lff
            java.lang.String r13 = j0(r13)     // Catch: java.lang.Throwable -> Lff
            java.lang.Object r10 = r10.get(r12)     // Catch: java.lang.Throwable -> Lff
            boolean r10 = r13.equals(r10)     // Catch: java.lang.Throwable -> Lff
            if (r10 == 0) goto L109
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> Lff
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r12.<init>()     // Catch: java.lang.Throwable -> Lff
            r12.append(r13)     // Catch: java.lang.Throwable -> Lff
            r12.append(r0)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lff
            r10.<init>(r3, r12)     // Catch: java.lang.Throwable -> Lff
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> Lff
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r14.<init>()     // Catch: java.lang.Throwable -> Lff
            r14.append(r13)     // Catch: java.lang.Throwable -> Lff
            r14.append(r0)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Lff
            r12.<init>(r4, r14)     // Catch: java.lang.Throwable -> Lff
            boolean r14 = r10.isFile()     // Catch: java.lang.Throwable -> Lff
            if (r14 == 0) goto L101
            dg.l.a0(r10, r12)     // Catch: java.lang.Throwable -> Lff
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lff
            r10.<init>()     // Catch: java.lang.Throwable -> Lff
            r10.append(r2)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r12 = ":"
            r10.append(r12)     // Catch: java.lang.Throwable -> Lff
            r10.append(r13)     // Catch: java.lang.Throwable -> Lff
            java.lang.String r20 = r10.toString()     // Catch: java.lang.Throwable -> Lff
            r23 = 0
            r24 = 491519(0x77fff, float:6.88765E-40)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            fb.q1 r11 = fb.q1.a(r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> Lff
        Lfa:
            r9.add(r11)     // Catch: java.lang.Throwable -> Lff
            goto L55
        Lff:
            r0 = move-exception
            goto L13a
        L101:
            java.lang.String r0 = "分支所需的完整工具结果已不存在"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lff
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lff
            throw r1     // Catch: java.lang.Throwable -> Lff
        L109:
            java.lang.String r0 = "工具结果 handle 无效"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lff
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lff
            throw r1     // Catch: java.lang.Throwable -> Lff
        L111:
            java.lang.String r0 = "分支工具结果不属于当前会话"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lff
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lff
            throw r1     // Catch: java.lang.Throwable -> Lff
        L119:
            r22 = 0
            r24 = 261631(0x3fdff, float:3.66623E-40)
            r17 = r9
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            fb.c r8 = fb.c.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24)     // Catch: java.lang.Throwable -> Lff
        L135:
            r5.add(r8)     // Catch: java.lang.Throwable -> Lff
            goto L2f
        L13a:
            sf.f r5 = new sf.f
            r5.<init>(r0)
        L13f:
            java.lang.Throwable r0 = sf.g.b(r5)
            if (r0 != 0) goto L148
            java.util.List r5 = (java.util.List) r5
            return r5
        L148:
            dg.l.b0(r4)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "复制分支工具结果失败"
            r1.<init>(r2, r0)
            throw r1
    }

    public static y1.y1 y(java.lang.Class r4) {
            java.lang.String r0 = "Cannot create an instance of "
            r1 = 0
            java.lang.reflect.Constructor r2 = r4.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L38
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)
            if (r3 == 0) goto L30
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.IllegalAccessException -> L1b java.lang.InstantiationException -> L1d
            r1.getClass()     // Catch: java.lang.IllegalAccessException -> L1b java.lang.InstantiationException -> L1d
            y1.y1 r1 = (y1.y1) r1     // Catch: java.lang.IllegalAccessException -> L1b java.lang.InstantiationException -> L1d
            return r1
        L1b:
            r1 = move-exception
            goto L1f
        L1d:
            r1 = move-exception
            goto L28
        L1f:
            java.lang.String r4 = p.a.k(r4, r0)
            ah.a.p(r4, r1)
        L26:
            r4 = 0
            return r4
        L28:
            java.lang.String r4 = p.a.k(r4, r0)
            ah.a.p(r4, r1)
            goto L26
        L30:
            java.lang.String r4 = p.a.k(r4, r0)
            bsh.j.g(r4)
            goto L26
        L38:
            r1 = move-exception
            java.lang.String r4 = p.a.k(r4, r0)
            ah.a.p(r4, r1)
            goto L26
    }

    public static java.lang.String z(int r10, boolean r11) {
            int r0 = r10 >> 4
            r1 = 3
            r0 = r0 & r1
            r2 = 2
            r3 = 1
            if (r0 != 0) goto La
            r1 = r3
            goto L14
        La:
            if (r0 != r3) goto Le
            r1 = r2
            goto L14
        Le:
            if (r0 != r2) goto L11
            goto L14
        L11:
            if (r0 != r1) goto L99
            r1 = 4
        L14:
            r0 = r10 & (-256(0xffffffffffffff00, float:NaN))
            float r0 = (float) r0
            r4 = 1
            if (r1 == r4) goto L2e
            r4 = 2
            if (r1 == r4) goto L2b
            r4 = 3
            if (r1 == r4) goto L28
            r4 = 4
            if (r1 != r4) goto L26
            r4 = 805306368(0x30000000, float:4.656613E-10)
            goto L30
        L26:
            r10 = 0
            throw r10
        L28:
            r4 = 872415232(0x34000000, float:1.1920929E-7)
            goto L30
        L2b:
            r4 = 939524096(0x38000000, float:3.0517578E-5)
            goto L30
        L2e:
            r4 = 998244352(0x3b800000, float:0.00390625)
        L30:
            float r4 = r4 * r0
            r10 = r10 & 15
            r0 = 0
            r5 = 0
            if (r11 == 0) goto L47
            n7.f[] r6 = n7.f.f9047k
            r7 = r5
        L3a:
            if (r7 >= r2) goto L57
            r8 = r6[r7]
            int r9 = r8.f4232h
            if (r10 != r9) goto L44
        L42:
            r0 = r8
            goto L57
        L44:
            int r7 = r7 + 1
            goto L3a
        L47:
            n7.f[] r6 = n7.f.f9046j
            r7 = r5
        L4a:
            r8 = 7
            if (r7 >= r8) goto L57
            r8 = r6[r7]
            int r9 = r8.f4232h
            if (r10 != r9) goto L54
            goto L42
        L54:
            int r7 = r7 + 1
            goto L4a
        L57:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L63
            r6 = r3
            goto L64
        L63:
            r6 = r5
        L64:
            if (r6 == 0) goto L67
            float r4 = -r4
        L67:
            int r1 = t3.c.b(r1)
            int r1 = r1 * r2
        L6c:
            if (r5 >= r1) goto L73
            int r3 = r3 * 10
            int r5 = r5 + 1
            goto L6c
        L73:
            float r1 = (float) r3
            float r4 = r4 * r1
            int r2 = (int) r4
            float r3 = (float) r2
            float r4 = r4 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L80
            int r2 = r2 + 1
        L80:
            float r2 = (float) r2
            float r2 = r2 / r1
            if (r6 == 0) goto L85
            float r2 = -r2
        L85:
            if (r11 == 0) goto L8a
            r11 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r11
        L8a:
            java.lang.String r11 = java.lang.Float.toString(r2)
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            return r10
        L99:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.String r11 = "Unknown radix flag = "
            java.lang.String r11 = eh.a.l(r0, r11)
            r10.<init>(r11)
            throw r10
    }

    @Override // ke.e
    public boolean a(ud.r r1, ud.n r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    public abstract void a0(z2.f r1, z2.f r2);

    @Override // ke.e
    public void b(ud.r r1, ud.n r2) {
            r0 = this;
            return
    }

    public abstract void b0(z2.f r1, java.lang.Thread r2);

    @Override // ke.e
    public void d(ud.r r1, ud.h r2) {
            r0 = this;
            return
    }

    public abstract boolean k(z2.g r1, z2.c r2);

    public abstract boolean l(z2.g r1, java.lang.Object r2, java.lang.Object r3);

    public abstract boolean m(z2.g r1, z2.f r2, z2.f r3);
}
