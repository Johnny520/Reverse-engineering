package oa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f9707a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f9708b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f9709c = null;

    static {
            java.lang.String r0 = "[|,，\\n\\r]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            oa.b.f9707a = r0
            java.lang.String r0 = "memo"
            java.lang.String r1 = "remark"
            java.lang.String r2 = "wishing"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            oa.b.f9708b = r0
            java.lang.String r0 = "des"
            java.lang.String r1 = "wording"
            java.lang.String r2 = "sendertitle"
            java.lang.String r3 = "description"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            oa.b.f9709c = r0
            return
    }

    public static void a(java.lang.String r2, java.lang.StringBuilder r3, boolean r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            goto L6a
        L7:
            java.lang.String r2 = r2.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L12
            goto L6a
        L12:
            if (r4 == 0) goto L64
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L1b
            goto L64
        L1b:
            java.lang.String r4 = " "
            java.lang.String r0 = ""
            java.lang.String r4 = r2.replace(r4, r0)
            java.lang.String r1 = " "
            java.lang.String r4 = r4.replace(r1, r0)
            java.lang.String r1 = "\u2005"
            java.lang.String r4 = r4.replace(r1, r0)
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "给你发了一个红包"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L6a
            java.lang.String r0 = "给您发了一个红包"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L6a
            java.lang.String r0 = "发了一个红包"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L6a
            java.lang.String r0 = "发来一个红包"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L6a
            java.lang.String r0 = "微信红包"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L6a
            java.lang.String r0 = "红包"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L64
            goto L6a
        L64:
            int r4 = r3.indexOf(r2)
            if (r4 < 0) goto L6b
        L6a:
            return
        L6b:
            int r4 = r3.length()
            if (r4 <= 0) goto L76
            r4 = 10
            r3.append(r4)
        L76:
            r3.append(r2)
            return
    }

    public static boolean b(java.lang.String r9, java.lang.String r10) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 != 0) goto La8
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto Lf
            goto La8
        Lf:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r2 = ""
            r3 = 1
            if (r0 == 0) goto L1a
        L18:
            r9 = r2
            goto L7d
        L1a:
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = ":\n"
            int r0 = r9.indexOf(r0)
            r4 = 60
            if (r0 <= 0) goto L38
            int r0 = r0 + 2
            int r5 = r9.indexOf(r4, r0)
            if (r5 < 0) goto L38
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r9 = r9.trim()
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r5 = oa.b.f9708b
            int r6 = r5.length
            r7 = r1
        L41:
            if (r7 >= r6) goto L4f
            r8 = r5[r7]
            java.lang.String r8 = e(r9, r8)
            a(r8, r0, r1)
            int r7 = r7 + 1
            goto L41
        L4f:
            java.lang.String[] r5 = oa.b.f9709c
            int r6 = r5.length
            r7 = r1
        L53:
            if (r7 >= r6) goto L61
            r8 = r5[r7]
            java.lang.String r8 = e(r9, r8)
            a(r8, r0, r3)
            int r7 = r7 + 1
            goto L53
        L61:
            int r5 = r0.length()
            if (r5 <= 0) goto L6c
            java.lang.String r9 = r0.toString()
            goto L7d
        L6c:
            int r0 = r9.indexOf(r4)
            int r4 = r0 + 1
            r5 = 62
            int r4 = r9.indexOf(r5, r4)
            if (r0 < 0) goto L7d
            if (r4 <= r0) goto L7d
            goto L18
        L7d:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L84
            return r1
        L84:
            java.util.regex.Pattern r0 = oa.b.f9707a
            java.lang.String[] r10 = r0.split(r10)
            int r0 = r10.length
            r4 = r1
        L8c:
            if (r4 >= r0) goto La8
            r5 = r10[r4]
            if (r5 == 0) goto L97
            java.lang.String r5 = r5.trim()
            goto L98
        L97:
            r5 = r2
        L98:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto La5
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto La5
            return r3
        La5:
            int r4 = r4 + 1
            goto L8c
        La8:
            return r1
    }

    public static int c(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = 1002(0x3ea, float:1.404E-42)
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "scene_id"
            java.lang.String r3 = "sceneid"
            if (r1 != 0) goto L27
            java.lang.String r1 = d(r7, r3)     // Catch: java.lang.Throwable -> L4e
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L1a
            java.lang.String r1 = d(r7, r2)     // Catch: java.lang.Throwable -> L4e
        L1a:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L28
            java.lang.String r1 = "scene"
            java.lang.String r1 = d(r7, r1)     // Catch: java.lang.Throwable -> L4e
            goto L28
        L27:
            r1 = 0
        L28:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L32
            java.lang.String r1 = e(r5, r3)     // Catch: java.lang.Throwable -> L4e
        L32:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L3c
            java.lang.String r1 = e(r5, r2)     // Catch: java.lang.Throwable -> L4e
        L3c:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L4e
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L49
            goto L4d
        L49:
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L4d
        L4d:
            return r0
        L4e:
            java.lang.String r1 = " "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld2
            r2.<init>()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Ld2
            r2.append(r6)     // Catch: java.lang.Throwable -> Ld2
            r2.append(r1)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> Ld2
            r2.append(r6)     // Catch: java.lang.Throwable -> Ld2
            r2.append(r1)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Ld2
            r2.append(r5)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r6 = "sceneid=1005"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "scene_id=1005"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "@openim"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "openim"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "@im.chatroom"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "im.chatroom"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "imchatroom"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "wework"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "wxwork"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "union_source"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r6 != 0) goto Ld0
            java.lang.String r6 = "企业微信"
            boolean r5 = r5.contains(r6)     // Catch: java.lang.Throwable -> Ld2
            if (r5 == 0) goto Ld2
        Ld0:
            r0 = 1005(0x3ed, float:1.408E-42)
        Ld2:
            return r0
    }

    public static java.lang.String d(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "="
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L44
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto Lf
            goto L44
        Lf:
            java.lang.String r4 = r4.concat(r0)     // Catch: java.lang.Throwable -> L44
            r0 = 63
            int r0 = r3.indexOf(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 < 0) goto L1e
            int r0 = r0 + 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L44
            if (r0 >= r1) goto L44
            r1 = 38
            int r1 = r3.indexOf(r1, r0)     // Catch: java.lang.Throwable -> L44
            if (r1 >= 0) goto L31
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L44
        L31:
            boolean r2 = r3.startsWith(r4, r0)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L41
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L44
            int r0 = r0 + r4
            java.lang.String r3 = r3.substring(r0, r1)     // Catch: java.lang.Throwable -> L44
            return r3
        L41:
            int r0 = r1 + 1
            goto L1f
        L44:
            r3 = 0
            return r3
    }

    public static java.lang.String e(java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = ">"
            java.lang.String r1 = "<"
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r3 = ""
            if (r2 != 0) goto L68
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L13
            goto L68
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r2.append(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "><!\\[CDATA\\[(.*?)\\]></"
            r2.append(r4)     // Catch: java.lang.Throwable -> L68
            r2.append(r7)     // Catch: java.lang.Throwable -> L68
            r2.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L68
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Throwable -> L68
            java.util.regex.Matcher r2 = r2.matcher(r6)     // Catch: java.lang.Throwable -> L68
            boolean r4 = r2.find()     // Catch: java.lang.Throwable -> L68
            r5 = 1
            if (r4 == 0) goto L3e
            java.lang.String r6 = r2.group(r5)     // Catch: java.lang.Throwable -> L68
            return r6
        L3e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r2.append(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = ">(.*?)</"
            r2.append(r1)     // Catch: java.lang.Throwable -> L68
            r2.append(r7)     // Catch: java.lang.Throwable -> L68
            r2.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L68
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)     // Catch: java.lang.Throwable -> L68
            java.util.regex.Matcher r6 = r7.matcher(r6)     // Catch: java.lang.Throwable -> L68
            boolean r7 = r6.find()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L68
            java.lang.String r6 = r6.group(r5)     // Catch: java.lang.Throwable -> L68
            return r6
        L68:
            return r3
    }

    public static boolean f(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L20
            java.lang.String r0 = "@chatroom"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "@im.chatroom"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "@openim"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L20
        L1e:
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static java.lang.String g(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r2 = r2.trim()
        Ld:
            java.lang.String r0 = "]"
            boolean r0 = r2.endsWith(r0)
            r1 = 0
            if (r0 != 0) goto L50
            java.lang.String r0 = ")"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "，"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = ","
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = ";"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "；"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L3f
            goto L50
        L3f:
            r0 = 10
            int r0 = r2.indexOf(r0)
            if (r0 <= 0) goto L4f
            java.lang.String r2 = r2.substring(r1, r0)
            java.lang.String r2 = r2.trim()
        L4f:
            return r2
        L50:
            int r0 = r2.length()
            int r0 = r0 + (-1)
            java.lang.String r2 = r2.substring(r1, r0)
            java.lang.String r2 = r2.trim()
            goto Ld
    }
}
