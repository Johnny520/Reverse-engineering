package Yue;

import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
public class C7623 extends C7622 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final StringBuilder m23856(StringBuilder sb, byte b) {
        C5499.m17103(sb, "<this>");
        sb.append((int) b);
        C5499.m17102(sb, "append(value.toInt())");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final StringBuilder m23857(StringBuilder sb, double d) {
        C5499.m17103(sb, "<this>");
        sb.append(d);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final StringBuilder m23858(StringBuilder sb, float f) {
        C5499.m17103(sb, "<this>");
        sb.append(f);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final StringBuilder m23859(StringBuilder sb, int i) {
        C5499.m17103(sb, "<this>");
        sb.append(i);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final StringBuilder m23860(StringBuilder sb, long j) {
        C5499.m17103(sb, "<this>");
        sb.append(j);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final StringBuilder m23861(StringBuilder sb, StringBuffer stringBuffer) {
        C5499.m17103(sb, "<this>");
        sb.append(stringBuffer);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final StringBuilder m23862(StringBuilder sb, StringBuilder sb2) {
        C5499.m17103(sb, "<this>");
        sb.append((CharSequence) sb2);
        C5499.m17102(sb, "append(value)");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final StringBuilder m23863(StringBuilder sb, short s) {
        C5499.m17103(sb, "<this>");
        sb.append((int) s);
        C5499.m17102(sb, "append(value.toInt())");
        sb.append('\n');
        C5499.m17102(sb, "append('\\n')");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final StringBuilder m23864(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(charSequence, "value");
        sb.append(charSequence, i, i2);
        C5499.m17102(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final StringBuilder m23865(StringBuilder sb, char[] cArr, int i, int i2) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(cArr, "value");
        sb.append(cArr, i, i2 - i);
        C5499.m17102(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final Appendable m23866(@InterfaceC6399 Appendable appendable) throws IOException {
        C5499.m17103(appendable, "<this>");
        Appendable appendableAppend = appendable.append(C7704.f3033);
        C5499.m17102(appendableAppend, "append(SystemProperties.LINE_SEPARATOR)");
        return appendableAppend;
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final Appendable m23867(Appendable appendable, char c) throws IOException {
        C5499.m17103(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c);
        C5499.m17102(appendableAppend, "append(value)");
        return m23866(appendableAppend);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final Appendable m23868(Appendable appendable, CharSequence charSequence) throws IOException {
        C5499.m17103(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        C5499.m17102(appendableAppend, "append(value)");
        return m23866(appendableAppend);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final StringBuilder m23869(@InterfaceC6399 StringBuilder sb) {
        C5499.m17103(sb, "<this>");
        sb.append(C7704.f3033);
        C5499.m17102(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final StringBuilder m23870(StringBuilder sb, byte b) {
        C5499.m17103(sb, "<this>");
        sb.append((int) b);
        C5499.m17102(sb, "append(value.toInt())");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final StringBuilder m23871(StringBuilder sb, char c) {
        C5499.m17103(sb, "<this>");
        sb.append(c);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final StringBuilder m23872(StringBuilder sb, double d) {
        C5499.m17103(sb, "<this>");
        sb.append(d);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final StringBuilder m23873(StringBuilder sb, float f) {
        C5499.m17103(sb, "<this>");
        sb.append(f);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final StringBuilder m23874(StringBuilder sb, int i) {
        C5499.m17103(sb, "<this>");
        sb.append(i);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final StringBuilder m23875(StringBuilder sb, long j) {
        C5499.m17103(sb, "<this>");
        sb.append(j);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final StringBuilder m23876(StringBuilder sb, CharSequence charSequence) {
        C5499.m17103(sb, "<this>");
        sb.append(charSequence);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final StringBuilder m23877(StringBuilder sb, Object obj) {
        C5499.m17103(sb, "<this>");
        sb.append(obj);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final StringBuilder m23878(StringBuilder sb, String str) {
        C5499.m17103(sb, "<this>");
        sb.append(str);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final StringBuilder m23879(StringBuilder sb, StringBuffer stringBuffer) {
        C5499.m17103(sb, "<this>");
        sb.append(stringBuffer);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final StringBuilder m23880(StringBuilder sb, StringBuilder sb2) {
        C5499.m17103(sb, "<this>");
        sb.append((CharSequence) sb2);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final StringBuilder m23881(StringBuilder sb, short s) {
        C5499.m17103(sb, "<this>");
        sb.append((int) s);
        C5499.m17102(sb, "append(value.toInt())");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final StringBuilder m23882(StringBuilder sb, boolean z) {
        C5499.m17103(sb, "<this>");
        sb.append(z);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC5438
    @InterfaceC4372(level = EnumC0393.f8970, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC7097(expression = "appendLine(value)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final StringBuilder m23883(StringBuilder sb, char[] cArr) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(cArr, "value");
        sb.append(cArr);
        C5499.m17102(sb, "append(value)");
        return m23869(sb);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final StringBuilder m23884(@InterfaceC6399 StringBuilder sb) {
        C5499.m17103(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final StringBuilder m23885(StringBuilder sb, int i) {
        C5499.m17103(sb, "<this>");
        StringBuilder sbDeleteCharAt = sb.deleteCharAt(i);
        C5499.m17102(sbDeleteCharAt, "this.deleteCharAt(index)");
        return sbDeleteCharAt;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final StringBuilder m23886(StringBuilder sb, int i, int i2) {
        C5499.m17103(sb, "<this>");
        StringBuilder sbDelete = sb.delete(i, i2);
        C5499.m17102(sbDelete, "this.delete(startIndex, endIndex)");
        return sbDelete;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final StringBuilder m23887(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(charSequence, "value");
        StringBuilder sbInsert = sb.insert(i, charSequence, i2, i3);
        C5499.m17102(sbInsert, "this.insert(index, value, startIndex, endIndex)");
        return sbInsert;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final StringBuilder m23888(StringBuilder sb, int i, char[] cArr, int i2, int i3) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(cArr, "value");
        StringBuilder sbInsert = sb.insert(i, cArr, i2, i3 - i2);
        C5499.m17102(sbInsert, "this.insert(index, value…x, endIndex - startIndex)");
        return sbInsert;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final void m23889(StringBuilder sb, int i, char c) {
        C5499.m17103(sb, "<this>");
        sb.setCharAt(i, c);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final StringBuilder m23890(StringBuilder sb, int i, int i2, String str) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(str, "value");
        StringBuilder sbReplace = sb.replace(i, i2, str);
        C5499.m17102(sbReplace, "this.replace(startIndex, endIndex, value)");
        return sbReplace;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final void m23891(StringBuilder sb, char[] cArr, int i, int i2, int i3) {
        C5499.m17103(sb, "<this>");
        C5499.m17103(cArr, "destination");
        sb.getChars(i2, i3, cArr, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m23892(StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        C5499.m17103(sb, "<this>");
        C5499.m17103(cArr, "destination");
        sb.getChars(i2, i3, cArr, i);
    }
}
