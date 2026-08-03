package zb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final og.k f22656a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final og.k f22657b = null;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "[0-9a-fA-F]{24,64}"
            r0.<init>(r1)
            zb.c.f22656a = r0
            og.k r0 = new og.k
            java.lang.String r1 = "[0-9]{12,}"
            r0.<init>(r1)
            zb.c.f22657b = r0
            return
    }

    public static boolean a(char r1) {
            r0 = 65
            if (r0 > r1) goto L9
            r0 = 91
            if (r1 >= r0) goto L9
            goto L2a
        L9:
            r0 = 97
            if (r0 > r1) goto L12
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 >= r0) goto L12
            goto L2a
        L12:
            r0 = 48
            if (r0 > r1) goto L1b
            r0 = 58
            if (r1 >= r0) goto L1b
            goto L2a
        L1b:
            r0 = 95
            if (r1 == r0) goto L2a
            r0 = 45
            if (r1 == r0) goto L2a
            r0 = 46
            if (r1 != r0) goto L28
            goto L2a
        L28:
            r1 = 0
            return r1
        L2a:
            r1 = 1
            return r1
    }

    public static boolean b(java.lang.String r5) {
            if (r5 == 0) goto Lb
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            goto Lc
        Lb:
            r5 = 0
        Lc:
            if (r5 != 0) goto L10
            java.lang.String r5 = ""
        L10:
            int r0 = r5.length()
            r1 = 3
            r2 = 0
            if (r1 > r0) goto Led
            r1 = 81
            if (r0 >= r1) goto Led
            java.lang.String r0 = "@chatroom"
            boolean r0 = og.t.W(r5, r0, r2)
            if (r0 != 0) goto Led
            java.lang.String r0 = "@im.chatroom"
            boolean r0 = og.t.W(r5, r0, r2)
            if (r0 == 0) goto L2e
            goto Led
        L2e:
            r0 = 58
            boolean r0 = og.m.i0(r5, r0)
            if (r0 != 0) goto Led
            r0 = 10
            boolean r0 = og.m.i0(r5, r0)
            if (r0 != 0) goto Led
            r0 = 13
            boolean r0 = og.m.i0(r5, r0)
            if (r0 != 0) goto Led
            r0 = 32
            boolean r0 = og.m.i0(r5, r0)
            if (r0 == 0) goto L50
            goto Led
        L50:
            java.lang.String r0 = "http://"
            boolean r0 = og.t.d0(r5, r0, r2)
            if (r0 != 0) goto Led
            java.lang.String r0 = "https://"
            boolean r0 = og.t.d0(r5, r0, r2)
            if (r0 != 0) goto Led
            java.lang.String r0 = "THUMBNAIL_DIRPATH://"
            boolean r0 = og.t.d0(r5, r0, r2)
            if (r0 == 0) goto L6a
            goto Led
        L6a:
            java.lang.String r0 = "@openim"
            boolean r1 = og.t.W(r5, r0, r2)
            r3 = 64
            r4 = 1
            if (r1 == 0) goto L9a
            java.lang.String r5 = og.m.B0(r5, r0)
            int r0 = r5.length()
            if (r0 <= 0) goto Led
            boolean r0 = og.m.i0(r5, r3)
            if (r0 != 0) goto Led
            r0 = r2
        L86:
            int r1 = r5.length()
            if (r0 >= r1) goto Le9
            char r1 = r5.charAt(r0)
            boolean r1 = a(r1)
            if (r1 != 0) goto L97
            goto Led
        L97:
            int r0 = r0 + 1
            goto L86
        L9a:
            boolean r0 = og.m.i0(r5, r3)
            if (r0 == 0) goto La1
            goto Led
        La1:
            og.k r0 = zb.c.f22656a
            boolean r0 = r0.d(r5)
            if (r0 == 0) goto Laa
            goto Led
        Laa:
            og.k r0 = zb.c.f22657b
            boolean r0 = r0.d(r5)
            if (r0 == 0) goto Lb3
            goto Led
        Lb3:
            r0 = r2
        Lb4:
            int r1 = r5.length()
            if (r0 >= r1) goto Led
            char r1 = r5.charAt(r0)
            r3 = 65
            if (r3 > r1) goto Lc7
            r3 = 91
            if (r1 >= r3) goto Lc7
            goto Lcf
        Lc7:
            r3 = 97
            if (r3 > r1) goto Ld1
            r3 = 123(0x7b, float:1.72E-43)
            if (r1 >= r3) goto Ld1
        Lcf:
            r1 = r4
            goto Ld2
        Ld1:
            r1 = r2
        Ld2:
            if (r1 == 0) goto Lea
            r0 = r2
        Ld5:
            int r1 = r5.length()
            if (r0 >= r1) goto Le9
            char r1 = r5.charAt(r0)
            boolean r1 = a(r1)
            if (r1 != 0) goto Le6
            goto Led
        Le6:
            int r0 = r0 + 1
            goto Ld5
        Le9:
            return r4
        Lea:
            int r0 = r0 + 1
            goto Lb4
        Led:
            return r2
    }
}
