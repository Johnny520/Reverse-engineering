package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5985 extends Yue.C5984 {
    public C5985() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5580, message = "Use append(value: Any?) instead", replaceWith = @Yue.InterfaceC5313(expression = "append(value = obj)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22200(java.lang.StringBuilder r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.append(r2)
            java.lang.String r2 = "this.append(obj)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use appendRange instead.", replaceWith = @Yue.InterfaceC5313(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22201(java.lang.StringBuilder r0, char[] r1, int r2, int r3) {
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            java.lang.String r0 = "str"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۢۥ۟ r0 = new Yue.ۥۡۢۥ۟
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22202(@Yue.InterfaceC4418 java.lang.StringBuilder r3, @Yue.InterfaceC4418 java.lang.Object... r4) {
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

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22203(@Yue.InterfaceC4418 java.lang.StringBuilder r3, @Yue.InterfaceC4418 java.lang.String... r4) {
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

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22204(java.lang.StringBuilder r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r0 = 10
            r1.append(r0)
            java.lang.String r0 = "append('\\n')"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22205(java.lang.StringBuilder r1, char r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.append(r2)
            java.lang.String r2 = "append(value)"
            Yue.C3329.m13905(r1, r2)
            r2 = 10
            r1.append(r2)
            java.lang.String r2 = "append('\\n')"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22206(java.lang.StringBuilder r1, java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.append(r2)
            java.lang.String r2 = "append(value)"
            Yue.C3329.m13905(r1, r2)
            r2 = 10
            r1.append(r2)
            java.lang.String r2 = "append('\\n')"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22207(java.lang.StringBuilder r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.append(r2)
            java.lang.String r2 = "append(value)"
            Yue.C3329.m13905(r1, r2)
            r2 = 10
            r1.append(r2)
            java.lang.String r2 = "append('\\n')"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22208(java.lang.StringBuilder r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.append(r2)
            java.lang.String r2 = "append(value)"
            Yue.C3329.m13905(r1, r2)
            r2 = 10
            r1.append(r2)
            java.lang.String r2 = "append('\\n')"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22209(java.lang.StringBuilder r1, boolean r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.append(r2)
            java.lang.String r2 = "append(value)"
            Yue.C3329.m13905(r1, r2)
            r2 = 10
            r1.append(r2)
            java.lang.String r2 = "append('\\n')"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.StringBuilder m22210(java.lang.StringBuilder r1, char[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            r1.append(r2)
            java.lang.String r2 = "append(value)"
            Yue.C3329.m13905(r1, r2)
            r2 = 10
            r1.append(r2)
            java.lang.String r2 = "append('\\n')"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m22211(int r1, Yue.InterfaceC2825<? super java.lang.StringBuilder, Yue.C6593> r2) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r2.invoke(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final java.lang.String m22212(Yue.InterfaceC2825<? super java.lang.StringBuilder, Yue.C6593> r1) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.invoke(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r1, r0)
            return r1
    }
}
