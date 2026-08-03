package Yue;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class C5319 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1442 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1443 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f12873 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f12874 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f12875 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f12876 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f12877 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f12878 = 32;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f12879 = 256;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f12880 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f12881 = 63;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۧ۟$ۥ */
    @InterfaceC7113(24)
    public static class C0714 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Spanned m2107(String str, int i) {
            return Html.fromHtml(str, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Spanned m2108(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static String m16345(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Spanned m2105(@InterfaceC6391 String str, int i) {
        return C0714.m2107(str, i);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static Spanned m2106(@InterfaceC6391 String str, int i, @InterfaceC6490 Html.ImageGetter imageGetter, @InterfaceC6490 Html.TagHandler tagHandler) {
        return C0714.m2108(str, i, imageGetter, tagHandler);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m16344(@InterfaceC6391 Spanned spanned, int i) {
        return C0714.m16345(spanned, i);
    }
}
