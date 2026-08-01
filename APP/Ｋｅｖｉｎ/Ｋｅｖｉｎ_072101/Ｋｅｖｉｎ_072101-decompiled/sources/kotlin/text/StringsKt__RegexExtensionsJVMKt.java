package kotlin.text;

/* JADX INFO: compiled from: RegexExtensionsJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¨\u0006\u0003"}, m115d2 = {"toRegex", "Lkotlin/text/Regex;", "Ljava/util/regex/Pattern;", "kotlin-stdlib"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/text/StringsKt")
class StringsKt__RegexExtensionsJVMKt extends kotlin.text.StringsKt__IndentKt {
    public StringsKt__RegexExtensionsJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final kotlin.text.Regex toRegex(java.util.regex.Pattern r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r0.<init>(r1)
            return r0
    }
}
