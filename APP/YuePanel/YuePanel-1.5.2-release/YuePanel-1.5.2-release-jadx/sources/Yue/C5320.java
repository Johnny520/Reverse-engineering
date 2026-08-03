package Yue;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5320 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Spanned m2109(@InterfaceC6399 String str, int i, @InterfaceC6489 Html.ImageGetter imageGetter, @InterfaceC6489 Html.TagHandler tagHandler) {
        return C5319.m2106(str, i, imageGetter, tagHandler);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Spanned m2110(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        return C5319.m2106(str, i, imageGetter, tagHandler);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m16346(@InterfaceC6399 Spanned spanned, int i) {
        return C5319.m16344(spanned, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ String m16347(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return C5319.m16344(spanned, i);
    }
}
