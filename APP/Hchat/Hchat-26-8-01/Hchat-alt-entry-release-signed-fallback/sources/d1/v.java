package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1.v f1958b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1.v f1959c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1.v f1960d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.b f1961a;

    static {
            d1.v r0 = new d1.v
            r0.<init>()
            d1.v.f1958b = r0
            d1.v r0 = new d1.v
            r0.<init>()
            d1.v.f1959c = r0
            d1.v r0 = new d1.v
            r0.<init>()
            d1.v.f1960d = r0
            return
    }

    public v() {
            r2 = this;
            r2.<init>()
            j0.b r0 = new j0.b
            r1 = 16
            d1.x[] r1 = new d1.x[r1]
            r0.<init>(r1)
            r2.f1961a = r0
            return
    }

    public static void a(d1.v r12) {
            r12.getClass()
            d1.v r0 = d1.v.f1958b
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r12 == r0) goto Lc0
            d1.v r0 = d1.v.f1959c
            if (r12 == r0) goto Lbc
            j0.b r12 = r12.f1961a
            int r0 = r12.f6673i
            if (r0 != 0) goto L1b
            java.lang.String r12 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r12)
            return
        L1b:
            java.lang.Object[] r12 = r12.f6671g
            r1 = 0
            r2 = r1
        L1f:
            if (r2 >= r0) goto Lbb
            r3 = r12[r2]
            d1.x r3 = (d1.x) r3
            y0.n r3 = (y0.n) r3
            y0.n r4 = r3.f21819g
            boolean r4 = r4.f21832t
            if (r4 != 0) goto L32
            java.lang.String r4 = "visitChildren called on an unattached node"
            u1.a.b(r4)
        L32:
            j0.b r4 = new j0.b
            r5 = 16
            y0.n[] r6 = new y0.n[r5]
            r4.<init>(r6)
            y0.n r3 = r3.f21819g
            y0.n r6 = r3.f21824l
            if (r6 != 0) goto L45
            x1.k.b(r4, r3)
            goto L48
        L45:
            r4.b(r6)
        L48:
            int r3 = r4.f6673i
            if (r3 == 0) goto Lb7
            int r3 = r3 + (-1)
            java.lang.Object r3 = r4.k(r3)
            y0.n r3 = (y0.n) r3
            int r6 = r3.f21822j
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L5e
            x1.k.b(r4, r3)
            goto L48
        L5e:
            if (r3 == 0) goto L48
            int r6 = r3.f21821i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb4
            r6 = 0
            r7 = r6
        L68:
            if (r3 == 0) goto L48
            boolean r8 = r3 instanceof d1.b0
            if (r8 == 0) goto L78
            d1.b0 r3 = (d1.b0) r3
            r8 = 7
            boolean r3 = r3.r1(r8)
            if (r3 == 0) goto Laf
            goto Lb7
        L78:
            int r8 = r3.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Laf
            boolean r8 = r3 instanceof x1.j
            if (r8 == 0) goto Laf
            r8 = r3
            x1.j r8 = (x1.j) r8
            y0.n r8 = r8.f20950v
            r9 = r1
        L88:
            r10 = 1
            if (r8 == 0) goto Lac
            int r11 = r8.f21821i
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto La9
            int r9 = r9 + 1
            if (r9 != r10) goto L97
            r3 = r8
            goto La9
        L97:
            if (r7 != 0) goto La0
            j0.b r7 = new j0.b
            y0.n[] r10 = new y0.n[r5]
            r7.<init>(r10)
        La0:
            if (r3 == 0) goto La6
            r7.b(r3)
            r3 = r6
        La6:
            r7.b(r8)
        La9:
            y0.n r8 = r8.f21824l
            goto L88
        Lac:
            if (r9 != r10) goto Laf
            goto L68
        Laf:
            y0.n r3 = x1.k.e(r7)
            goto L68
        Lb4:
            y0.n r3 = r3.f21824l
            goto L5e
        Lb7:
            int r2 = r2 + 1
            goto L1f
        Lbb:
            return
        Lbc:
            j8.o.A(r1)
            return
        Lc0:
            j8.o.A(r1)
            return
    }
}
