package Yue;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
public final class C7509 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final SpannableStringBuilder m3704(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC3897 int i, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final SpannableStringBuilder m3705(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final SpannedString m23475(@InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        interfaceC5124.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final SpannableStringBuilder m23476(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC3897 int i, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final SpannableStringBuilder m23477(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC6399 Object obj, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final SpannableStringBuilder m23478(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC6399 Object[] objArr, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final SpannableStringBuilder m23479(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final SpannableStringBuilder m23480(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, float f, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final SpannableStringBuilder m23481(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final SpannableStringBuilder m23482(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final SpannableStringBuilder m23483(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final SpannableStringBuilder m23484(@InterfaceC6399 SpannableStringBuilder spannableStringBuilder, @InterfaceC6399 InterfaceC5124<? super SpannableStringBuilder, C8107> interfaceC5124) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        interfaceC5124.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
