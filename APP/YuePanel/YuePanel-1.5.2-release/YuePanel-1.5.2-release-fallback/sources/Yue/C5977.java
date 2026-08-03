package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5977 {
    public C5977() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T extends java.lang.Appendable> T m22138(@Yue.InterfaceC4418 T r3, @Yue.InterfaceC4418 java.lang.CharSequence... r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L16
            r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto Lc
        L16:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static <T> void m22139(@Yue.InterfaceC4418 java.lang.Appendable r1, T r2, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super T, ? extends java.lang.CharSequence> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            if (r3 == 0) goto L11
            java.lang.Object r2 = r3.invoke(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.append(r2)
            goto L34
        L11:
            if (r2 != 0) goto L15
            r3 = 1
            goto L17
        L15:
            boolean r3 = r2 instanceof java.lang.CharSequence
        L17:
            if (r3 == 0) goto L1f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.append(r2)
            goto L34
        L1f:
            boolean r3 = r2 instanceof java.lang.Character
            if (r3 == 0) goto L2d
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.append(r2)
            goto L34
        L2d:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.append(r2)
        L34:
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Appendable m22140(java.lang.Appendable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r0 = 10
            java.lang.Appendable r1 = r1.append(r0)
            java.lang.String r0 = "append('\\n')"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.Appendable m22141(java.lang.Appendable r1, char r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Appendable r1 = r1.append(r2)
            java.lang.String r2 = "append(value)"
            Yue.C3329.m13905(r1, r2)
            r2 = 10
            java.lang.Appendable r1 = r1.append(r2)
            java.lang.String r2 = "append('\\n')"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.Appendable m22142(java.lang.Appendable r1, java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Appendable r1 = r1.append(r2)
            java.lang.String r2 = "append(value)"
            Yue.C3329.m13905(r1, r2)
            r2 = 10
            java.lang.Appendable r1 = r1.append(r2)
            java.lang.String r2 = "append('\\n')"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T extends java.lang.Appendable> T m22143(@Yue.InterfaceC4418 T r1, @Yue.InterfaceC4418 java.lang.CharSequence r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.lang.Appendable r1 = r1.append(r2, r3, r4)
            java.lang.String r2 = "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange"
            Yue.C3329.m13904(r1, r2)
            return r1
    }
}
