package p357y1;

import android.content.ClipData;
import android.os.Build;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: y1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5886h implements InterfaceC5955y0 {

    /* JADX INFO: renamed from: a */
    public final C5890i f23887a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5886h(C5890i c5890i) {
        this.f23887a = c5890i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10607a(C5951x0 c5951x0) {
        C5890i c5890i = this.f23887a;
        if (c5951x0 != null) {
            c5890i.m10610a().setPrimaryClip(c5951x0.f24180a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            c5890i.m10610a().clearPrimaryClip();
        } else {
            c5890i.m10610a().setPrimaryClip(ClipData.newPlainText(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        }
    }
}
