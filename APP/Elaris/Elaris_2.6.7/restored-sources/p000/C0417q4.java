package p000;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: q4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0417q4 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f736a;

    /* JADX INFO: renamed from: b */
    public final int f737b;

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder f738c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0417q4(int i, int i2, SpannableStringBuilder spannableStringBuilder) {
        this.f736a = i;
        this.f737b = i2;
        this.f738c = spannableStringBuilder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0417q4 c0417q4 = (C0417q4) obj;
        if (c0417q4 == null) {
            return 1;
        }
        return this.f736a - c0417q4.f736a;
    }
}
