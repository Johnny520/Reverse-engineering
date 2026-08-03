package a;

/* JADX INFO: loaded from: classes.dex */
public final class yh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Me f774a = null;

    static {
            a.w3 r0 = new a.w3
            r1 = 24
            r0.<init>(r1)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            a.yh.f774a = r1
            a.w3 r0 = new a.w3
            r1 = 25
            r0.<init>(r1)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            return
    }

    public static final boolean a(java.lang.String r6) {
            r0 = 0
            if (r6 == 0) goto L1bd
            boolean r1 = a.Be.P(r6)
            if (r1 == 0) goto Lb
            goto L1bd
        Lb:
            java.lang.CharSequence r6 = a.Be.V(r6)
            java.lang.String r6 = r6.toString()
            int r1 = r6.length()
            if (r1 != 0) goto L1b
            goto L1bd
        L1b:
            java.lang.String r1 = "wxid_"
            r2 = 1
            boolean r1 = a.Ae.H(r6, r1, r2)
            if (r1 == 0) goto L2d
            int r6 = r6.length()
            r1 = 5
            if (r6 <= r1) goto L1bd
            goto L1bc
        L2d:
            java.lang.String r1 = "gh_"
            boolean r1 = a.Ae.H(r6, r1, r2)
            r3 = 3
            if (r1 == 0) goto L3e
            int r6 = r6.length()
            if (r6 <= r3) goto L1bd
            goto L1bc
        L3e:
            java.lang.String r1 = "phacct_"
            boolean r1 = a.Ae.H(r6, r1, r2)
            if (r1 == 0) goto L4f
            int r6 = r6.length()
            r1 = 7
            if (r6 <= r1) goto L1bd
            goto L1bc
        L4f:
            java.lang.String r1 = "wx_"
            boolean r1 = a.Ae.H(r6, r1, r2)
            if (r1 == 0) goto L5f
            int r6 = r6.length()
            if (r6 <= r3) goto L1bd
            goto L1bc
        L5f:
            java.lang.String r1 = "@"
            boolean r1 = a.Be.I(r6, r1, r0)
            r3 = 6
            java.lang.String r4 = "toLowerCase(...)"
            if (r1 == 0) goto L16e
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            a.C0193i9.d(r6, r4)
            r1 = 64
            int r1 = a.Be.O(r6, r1, r0, r3)
            if (r1 > 0) goto L7d
            goto L1bd
        L7d:
            java.lang.String r1 = "@chatroom"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@im.chatroom"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@openim"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@kefu.openim"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@stranger"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@finder"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@findermsg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@findermsgalias"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@findermsgstranger"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@qqim"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@bottle"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@bottle:"
            boolean r1 = a.Be.I(r6, r1, r0)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@status"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@app"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@bizfansmsg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@picfansmsg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@zhugemsg"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@zhugepublic"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@zhugeprivate"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@gamelife"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@gamelifesess"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@weclaw"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@t.qq.com"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@micromsg.qq.com"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@qr"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@fb"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@google"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@fakeuser"
            boolean r1 = r6.endsWith(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "brandecstemplatemsg@fakeuser"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L1bc
            java.lang.String r1 = "@placeholder_foldgroup"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L1bd
            goto L1bc
        L16e:
            a.Me r1 = a.yh.f774a
            java.lang.Object r1 = r1.a()
            java.util.Set r1 = (java.util.Set) r1
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r6.toLowerCase(r5)
            a.C0193i9.d(r5, r4)
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L186
            goto L1bc
        L186:
            int r1 = r6.length()
            if (r1 < r3) goto L1bd
            int r1 = r6.length()
            r3 = 20
            if (r1 <= r3) goto L195
            goto L1bd
        L195:
            char r1 = r6.charAt(r0)
            boolean r1 = java.lang.Character.isLetter(r1)
            if (r1 != 0) goto L1a0
            goto L1bd
        L1a0:
            r1 = r0
        L1a1:
            int r3 = r6.length()
            if (r1 >= r3) goto L1bc
            char r3 = r6.charAt(r1)
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 != 0) goto L1b9
            r4 = 95
            if (r3 == r4) goto L1b9
            r4 = 45
            if (r3 != r4) goto L1bd
        L1b9:
            int r1 = r1 + 1
            goto L1a1
        L1bc:
            return r2
        L1bd:
            return r0
    }
}
