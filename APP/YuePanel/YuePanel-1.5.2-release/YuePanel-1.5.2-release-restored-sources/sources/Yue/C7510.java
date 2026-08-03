package Yue;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
public final class C7510 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m3706(@InterfaceC6399 Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m3707(@InterfaceC6399 Spannable spannable, int i, int i2, @InterfaceC6399 Object obj) {
        spannable.setSpan(obj, i, i2, 17);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m23485(@InterfaceC6399 Spannable spannable, @InterfaceC6399 C5458 c5458, @InterfaceC6399 Object obj) {
        spannable.setSpan(obj, c5458.mo830().intValue(), c5458.mo10384().intValue(), 17);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Spannable m23486(@InterfaceC6399 CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }
}
