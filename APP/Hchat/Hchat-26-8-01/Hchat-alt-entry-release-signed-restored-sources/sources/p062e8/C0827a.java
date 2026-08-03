package p062e8;

import okhttp3.HttpUrl;

/* JADX INFO: renamed from: e8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0827a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2475a;

    /* JADX INFO: renamed from: b */
    public String f2476b;

    /* JADX INFO: renamed from: c */
    public String f2477c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0827a() {
        this.f2475a = 1;
        this.f2476b = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f2477c = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f2475a) {
            case 0:
                return this.f2476b + "." + this.f2477c;
            default:
                return super.toString();
        }
    }

    public C0827a(String str, String str2) {
        this.f2475a = 0;
        this.f2476b = str;
        this.f2477c = str2;
    }
}
