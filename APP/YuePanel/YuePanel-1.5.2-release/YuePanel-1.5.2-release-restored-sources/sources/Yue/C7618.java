package Yue;

import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7618 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T extends Appendable> T m3768(@InterfaceC6399 T t, @InterfaceC6399 CharSequence... charSequenceArr) throws IOException {
        C5499.m17103(t, "<this>");
        C5499.m17103(charSequenceArr, "value");
        for (CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T> void m3769(@InterfaceC6399 Appendable appendable, T t, @InterfaceC6489 InterfaceC5124<? super T, ? extends CharSequence> interfaceC5124) {
        C5499.m17103(appendable, "<this>");
        if (interfaceC5124 != null) {
            appendable.append(interfaceC5124.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Appendable m23833(Appendable appendable) throws IOException {
        C5499.m17103(appendable, "<this>");
        Appendable appendableAppend = appendable.append('\n');
        C5499.m17102(appendableAppend, "append('\\n')");
        return appendableAppend;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Appendable m23834(Appendable appendable, char c) throws IOException {
        C5499.m17103(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c);
        C5499.m17102(appendableAppend, "append(value)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        C5499.m17102(appendableAppend2, "append('\\n')");
        return appendableAppend2;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Appendable m23835(Appendable appendable, CharSequence charSequence) throws IOException {
        C5499.m17103(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        C5499.m17102(appendableAppend, "append(value)");
        Appendable appendableAppend2 = appendableAppend.append('\n');
        C5499.m17102(appendableAppend2, "append('\\n')");
        return appendableAppend2;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T extends Appendable> T m23836(@InterfaceC6399 T t, @InterfaceC6399 CharSequence charSequence, int i, int i2) {
        C5499.m17103(t, "<this>");
        C5499.m17103(charSequence, "value");
        T t2 = (T) t.append(charSequence, i, i2);
        C5499.m17101(t2, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t2;
    }
}
