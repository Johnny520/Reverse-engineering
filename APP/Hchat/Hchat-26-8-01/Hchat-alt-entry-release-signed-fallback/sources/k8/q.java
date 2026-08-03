package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static boolean a(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r1 = "receivehongbao"
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L53
            java.lang.String r2 = "wxhb_personalreceive"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L53
            java.lang.String r2 = "/hongbao/"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L25
            goto L53
        L25:
            java.lang.String r0 = "nativeurl"
            java.lang.String r0 = c(r3, r0)
            java.lang.String r0 = r0.toLowerCase()
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L53
            java.lang.String r1 = "wxhb"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L53
            java.lang.String r1 = "hongbao"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L46
            goto L53
        L46:
            java.lang.String r0 = "type"
            java.lang.String r3 = c(r3, r0)
            java.lang.String r0 = "2001"
            boolean r3 = r0.equals(r3)
            return r3
        L53:
            r3 = 1
            return r3
    }

    public static java.lang.String b(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r0 = ":\n"
            int r0 = r2.indexOf(r0)
            if (r0 <= 0) goto L1f
            java.lang.String r1 = "<"
            int r1 = r2.indexOf(r1)
            if (r1 <= r0) goto L1f
            int r0 = r0 + 2
            java.lang.String r2 = r2.substring(r0)
        L1f:
            return r2
    }

    public static java.lang.String c(java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = ">"
            java.lang.String r1 = "<"
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L66
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L11
            goto L66
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r2.append(r6)     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "><!\\[CDATA\\[(.*?)\\]></"
            r2.append(r3)     // Catch: java.lang.Throwable -> L66
            r2.append(r6)     // Catch: java.lang.Throwable -> L66
            r2.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L66
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Throwable -> L66
            java.util.regex.Matcher r2 = r2.matcher(r5)     // Catch: java.lang.Throwable -> L66
            boolean r3 = r2.find()     // Catch: java.lang.Throwable -> L66
            r4 = 1
            if (r3 == 0) goto L3c
            java.lang.String r5 = r2.group(r4)     // Catch: java.lang.Throwable -> L66
            return r5
        L3c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r2.append(r6)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = ">(.*?)</"
            r2.append(r1)     // Catch: java.lang.Throwable -> L66
            r2.append(r6)     // Catch: java.lang.Throwable -> L66
            r2.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L66
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Throwable -> L66
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: java.lang.Throwable -> L66
            boolean r6 = r5.find()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L66
            java.lang.String r5 = r5.group(r4)     // Catch: java.lang.Throwable -> L66
            return r5
        L66:
            java.lang.String r5 = ""
            return r5
    }

    public static java.lang.String d(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L27
            java.lang.String r0 = "msgsource"
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lf
            goto L27
        Lf:
            java.lang.String r0 = "<msgsource\\b[^>]*>(.*?)</msgsource>"
            r1 = 34
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)     // Catch: java.lang.Throwable -> L27
            java.util.regex.Matcher r2 = r0.matcher(r2)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r2.find()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            r0 = 1
            java.lang.String r2 = r2.group(r0)     // Catch: java.lang.Throwable -> L27
            return r2
        L27:
            java.lang.String r2 = ""
            return r2
    }

    public static boolean e(java.lang.Class r2, java.lang.String r3) {
        L0:
            if (r2 == 0) goto L2b
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r2 == r0) goto L2b
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r2)     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2b
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto Le
            r2 = 1
            return r2
        L26:
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L2b
            goto L0
        L2b:
            r2 = 0
            return r2
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

    public static boolean g(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            goto L2a
        L7:
            java.lang.String r0 = "false"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "1"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L28
            goto L2a
        L28:
            r1 = 0
            return r1
        L2a:
            r1 = 1
            return r1
    }

    public static boolean h(java.lang.Class r1) {
            if (r1 == 0) goto L52
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L52
            boolean r0 = r1.isArray()
            if (r0 == 0) goto Lf
            goto L52
        Lf:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 == r0) goto L52
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L52
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L20
            goto L52
        L20:
            java.lang.String r0 = "e"
            boolean r0 = e(r1, r0)
            if (r0 == 0) goto L52
            java.lang.String r0 = "f"
            boolean r0 = e(r1, r0)
            if (r0 == 0) goto L52
            java.lang.String r0 = "h"
            boolean r0 = e(r1, r0)
            if (r0 != 0) goto L40
            java.lang.String r0 = "m"
            boolean r0 = e(r1, r0)
            if (r0 == 0) goto L52
        L40:
            java.lang.String r0 = "g"
            boolean r0 = e(r1, r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "i"
            boolean r1 = e(r1, r0)
            if (r1 == 0) goto L52
        L50:
            r1 = 1
            return r1
        L52:
            r1 = 0
            return r1
    }

    public static java.lang.String i(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "<msgsource"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L16
            goto L40
        L16:
            java.lang.String r0 = "<atuserlist"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L27
            java.lang.String r0 = "<msgsource>"
            java.lang.String r1 = "</msgsource>"
        L22:
            java.lang.String r2 = eh.a.n(r0, r2, r1)
            return r2
        L27:
            java.lang.String r0 = "atuserlist"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "notify@all"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "announcement@all"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L40
            goto L41
        L40:
            return r2
        L41:
            java.lang.String r0 = "<msgsource><atuserlist>"
            java.lang.String r1 = "</atuserlist></msgsource>"
            goto L22
    }

    public static java.lang.String j(java.lang.String r2) {
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

    public static l8.e k(java.lang.Object r27, java.lang.String r28) {
            r0 = r27
            if (r0 != 0) goto L6
            goto L1f2
        L6:
            java.lang.String r1 = "h"
            java.lang.String r2 = "m"
            java.lang.String r3 = "i"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
            r2 = 0
            r4 = r2
        L12:
            java.lang.String r5 = ""
            r6 = 3
            if (r4 >= r6) goto L27
            r6 = r1[r4]
            java.lang.String r6 = o(r0, r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L24
            goto L28
        L24:
            int r4 = r4 + 1
            goto L12
        L27:
            r6 = r5
        L28:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L30
            goto L1f2
        L30:
            java.lang.String r7 = b(r6)
            java.lang.String r1 = "e"
            java.lang.String r1 = n(r0, r1)
            java.lang.String r1 = j(r1)
            java.lang.String r4 = "f"
            java.lang.String r4 = n(r0, r4)
            java.lang.String r4 = j(r4)
            boolean r8 = f(r4)
            if (r8 == 0) goto L51
            r8 = r28
            goto L6e
        L51:
            boolean r8 = f(r1)
            if (r8 == 0) goto L5a
        L57:
            r8 = r28
            goto L70
        L5a:
            boolean r8 = android.text.TextUtils.isEmpty(r28)
            if (r8 != 0) goto L57
            r8 = r28
            boolean r9 = r8.equals(r1)
            if (r9 == 0) goto L70
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L70
        L6e:
            r9 = r4
            goto L71
        L70:
            r9 = r1
        L71:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L78
            goto L79
        L78:
            r4 = r9
        L79:
            java.lang.String r9 = j(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L1f2
            boolean r4 = g(r9)
            if (r4 == 0) goto L8b
            goto L1f2
        L8b:
            java.lang.String r4 = "fromusername"
            java.lang.String r4 = c(r7, r4)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 == 0) goto La9
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto La9
            java.lang.String r10 = ":\n"
            int r10 = r6.indexOf(r10)
            if (r10 <= 0) goto La9
            java.lang.String r4 = r6.substring(r2, r10)
        La9:
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 == 0) goto Lb0
            goto Lb1
        Lb0:
            r1 = r4
        Lb1:
            java.lang.String r1 = j(r1)
            boolean r4 = g(r1)
            if (r4 == 0) goto Lbd
            goto L1f2
        Lbd:
            java.lang.String r4 = "nativeurl"
            java.lang.String r10 = c(r7, r4)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto Lcd
            java.lang.String r10 = c(r6, r4)
        Lcd:
            java.lang.String r4 = "exclusive_recv_username"
            java.lang.String r11 = c(r7, r4)
            java.lang.String r4 = d(r7)
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 == 0) goto Le1
            java.lang.String r4 = d(r6)
        Le1:
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r13 = "q"
            if (r12 != 0) goto Lf4
            java.lang.String r5 = "<msgsource>"
            java.lang.String r12 = "</msgsource>"
            java.lang.String r5 = eh.a.n(r5, r4, r12)
        Lf1:
            r18 = r5
            goto L14a
        Lf4:
            java.lang.String r4 = "p"
            java.lang.String r4 = o(r0, r4)
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 != 0) goto L105
            java.lang.String r5 = i(r4)
            goto Lf1
        L105:
            java.lang.String r4 = o(r0, r13)
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r14 = "msgsource"
            if (r12 != 0) goto L11c
            boolean r12 = r4.contains(r14)
            if (r12 == 0) goto L11c
            java.lang.String r5 = i(r4)
            goto Lf1
        L11c:
            java.lang.String r20 = "s"
            java.lang.String r21 = "t"
            java.lang.String r15 = "j"
            java.lang.String r16 = "k"
            java.lang.String r17 = "l"
            java.lang.String r18 = "n"
            java.lang.String r19 = "p"
            java.lang.String[] r4 = new java.lang.String[]{r15, r16, r17, r18, r19, r20, r21}
            r12 = r2
        L12f:
            r15 = 7
            if (r12 >= r15) goto Lf1
            r15 = r4[r12]
            java.lang.String r15 = o(r0, r15)
            boolean r16 = android.text.TextUtils.isEmpty(r15)
            if (r16 != 0) goto L147
            boolean r16 = r15.contains(r14)
            if (r16 == 0) goto L147
            r18 = r15
            goto L14a
        L147:
            int r12 = r12 + 1
            goto L12f
        L14a:
            f(r9)
            boolean r12 = a(r6)
            java.lang.String r4 = "g"
            long r4 = m(r0, r4)
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            r19 = -2147483648(0xffffffff80000000, double:NaN)
            if (r16 > 0) goto L168
            int r16 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r16 >= 0) goto L166
            goto L168
        L166:
            int r4 = (int) r4
            goto L169
        L168:
            r4 = r2
        L169:
            long r2 = m(r0, r3)
            int r14 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r14 > 0) goto L178
            int r14 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r14 >= 0) goto L176
            goto L178
        L176:
            int r2 = (int) r2
            goto L179
        L178:
            r2 = 0
        L179:
            if (r4 <= 0) goto L17c
            goto L184
        L17c:
            if (r2 <= 0) goto L180
            r4 = r2
            goto L184
        L180:
            int r4 = h.Hchat.hooks.api.model.WeChatMessage.inferType(r6)
        L184:
            java.lang.String r2 = "o"
            long r2 = m(r0, r2)
            long r13 = m(r0, r13)
            r15 = 946656000(0x386cd300, double:4.67710208E-315)
            int r5 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            r19 = 4102444800(0xf4865700, double:2.0268770396E-314)
            r17 = r1
            r21 = r2
            r1 = 0
            if (r5 < 0) goto L1a5
            int r3 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r3 > 0) goto L1a5
            goto L1b2
        L1a5:
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 < 0) goto L1b0
            int r3 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r3 > 0) goto L1b0
            r21 = r13
            goto L1b2
        L1b0:
            r21 = r1
        L1b2:
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 <= 0) goto L1b9
            r14 = r21
            goto L1ba
        L1b9:
            r14 = r1
        L1ba:
            java.lang.String r3 = "r"
            long r19 = m(r0, r3)
            java.lang.String r3 = "u"
            r21 = r1
            long r1 = m(r0, r3)
            r23 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r0 <= 0) goto L1d0
            goto L1dc
        L1d0:
            int r0 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r0 <= 0) goto L1d8
            r19 = r1
        L1d6:
            r13 = r4
            goto L1e4
        L1d8:
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 <= 0) goto L1dd
        L1dc:
            goto L1d6
        L1dd:
            r13 = r4
            r3 = r21
            long r19 = java.lang.Math.max(r1, r3)
        L1e4:
            l8.e r5 = new l8.e
            r25 = r19
            r19 = r8
            r8 = r17
            r16 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19)
            return r5
        L1f2:
            r0 = 0
            return r0
    }

    public static java.lang.Object l(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L18
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            goto L18
        L9:
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findFieldRecursive(r0, r2)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r2, r1)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static long m(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = l(r0, r1)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lf
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        Lf:
            if (r0 != 0) goto L12
            goto L1b
        L12:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L1b
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r0 = 0
            return r0
    }

    public static java.lang.String n(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = l(r0, r1)
            if (r0 == 0) goto L2a
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 != 0) goto L2a
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lf
            goto L2a
        Lf:
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L18
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L18:
            java.lang.String r1 = "d"
            java.lang.Object r1 = l(r0, r1)
            if (r1 == 0) goto L25
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
        L25:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L2a:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String o(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = l(r0, r1)
            if (r0 == 0) goto L25
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 != 0) goto L25
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lf
            goto L25
        Lf:
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L18
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L18:
            java.lang.String r1 = "d"
            java.lang.Object r0 = l(r0, r1)
            if (r0 == 0) goto L25
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L25:
            java.lang.String r0 = ""
            return r0
    }
}
