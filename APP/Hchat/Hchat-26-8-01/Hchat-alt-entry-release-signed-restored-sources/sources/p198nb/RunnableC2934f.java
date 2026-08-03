package p198nb;

import okhttp3.HttpUrl;

/* JADX INFO: renamed from: nb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2934f implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9620g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2954w f9621h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f9622i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC2934f(C2954w c2954w, String str, int i9) {
        this.f9620g = i9;
        this.f9621h = c2954w;
        this.f9622i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9620g) {
            case 0:
                C2945n c2945n = new C2945n(this.f9622i);
                C2954w c2954w = this.f9621h;
                if (c2954w.m6374y().m6377b("text_speech_enable")) {
                    c2954w.f9676c.addLast(c2945n);
                    c2954w.m6366n();
                    break;
                }
                break;
            case 1:
                String str = this.f9622i;
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                C2954w.m6348a(this.f9621h, str);
                break;
            case 2:
                String str2 = this.f9622i;
                if (str2 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                C2954w.m6348a(this.f9621h, str2);
                break;
            default:
                String str3 = this.f9622i;
                if (str3 == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                C2954w.m6348a(this.f9621h, str3);
                break;
        }
    }
}
