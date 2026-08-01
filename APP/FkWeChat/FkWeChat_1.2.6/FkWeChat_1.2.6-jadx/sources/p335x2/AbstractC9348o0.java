package p335x2;

import android.text.Spanned;

/* JADX INFO: renamed from: x2.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9348o0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m36446a(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m36447b(Spanned spanned, Class cls, int i10, int i11) {
        return spanned.nextSpanTransition(i10 - 1, i11, cls) != i11;
    }
}
