package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7624 extends C7623 {
    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use append(value: Any?) instead", replaceWith = @InterfaceC7097(expression = "append(value = obj)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final StringBuilder m23893(StringBuilder sb, Object obj) {
        C5499.m17103(sb, "<this>");
        sb.append(obj);
        C5499.m17102(sb, "this.append(obj)");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8971, message = "Use appendRange instead.", replaceWith = @InterfaceC7097(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final StringBuilder m23894(StringBuilder sb, char[] cArr, int i, int i2) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(cArr, "str");
        throw new C6398(null, 1, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final StringBuilder m23895(@InterfaceC6399 StringBuilder sb, @InterfaceC6399 Object... objArr) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(objArr, "value");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final StringBuilder m23896(@InterfaceC6399 StringBuilder sb, @InterfaceC6399 String... strArr) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(strArr, "value");
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final StringBuilder m23897(StringBuilder sb) {
        C5499.m17103(sb, "<this>");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final StringBuilder m23898(StringBuilder sb, char c) {
        C5499.m17103(sb, "<this>");
        sb.append(c);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final StringBuilder m23899(StringBuilder sb, CharSequence charSequence) {
        C5499.m17103(sb, "<this>");
        sb.append(charSequence);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final StringBuilder m23900(StringBuilder sb, Object obj) {
        C5499.m17103(sb, "<this>");
        sb.append(obj);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final StringBuilder m23901(StringBuilder sb, String str) {
        C5499.m17103(sb, "<this>");
        sb.append(str);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final StringBuilder m23902(StringBuilder sb, boolean z) {
        C5499.m17103(sb, "<this>");
        sb.append(z);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final StringBuilder m23903(StringBuilder sb, char[] cArr) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(cArr, "value");
        sb.append(cArr);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final String m23904(int i, InterfaceC5124<? super StringBuilder, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        StringBuilder sb = new StringBuilder(i);
        interfaceC5124.invoke(sb);
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final String m23905(InterfaceC5124<? super StringBuilder, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        StringBuilder sb = new StringBuilder();
        interfaceC5124.invoke(sb);
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
