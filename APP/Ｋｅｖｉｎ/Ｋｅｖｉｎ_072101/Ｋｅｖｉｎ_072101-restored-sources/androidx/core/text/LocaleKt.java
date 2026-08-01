package androidx.core.text;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m115d2 = {"layoutDirection", "", "Ljava/util/Locale;", "getLayoutDirection", "(Ljava/util/Locale;)I", "core-ktx_release"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class LocaleKt {
    public static final int getLayoutDirection(java.util.Locale r2) {
            r0 = 0
            int r1 = android.text.TextUtils.getLayoutDirectionFromLocale(r2)
            return r1
    }
}
