package Yue;

import android.text.Spanned;
import android.text.SpannedString;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7511 {
    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ <T> T[] m3708(Spanned spanned, int i, int i2) {
        C5499.m17112(4, C4750.f10502);
        return (T[]) spanned.getSpans(i, i2, Object.class);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Object[] m3709(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        C5499.m17112(4, C4750.f10502);
        return spanned.getSpans(i, i2, Object.class);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Spanned m23487(@InterfaceC6399 CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
