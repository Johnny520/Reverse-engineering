package p096g8;

import android.text.TextUtils;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: g8.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1370k {

    /* JADX INFO: renamed from: a */
    public final C1360a f4554a;

    /* JADX INFO: renamed from: b */
    public final C1368i f4555b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1370k(C1360a c1360a, C1368i c1368i) {
        this.f4554a = c1360a;
        this.f4555b = c1368i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m3739a(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM3729r = this.f4555b.m3729r(str);
        return !TextUtils.isEmpty(strM3729r) ? strM3729r != null ? strM3729r : HttpUrl.FRAGMENT_ENCODE_SET : str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
