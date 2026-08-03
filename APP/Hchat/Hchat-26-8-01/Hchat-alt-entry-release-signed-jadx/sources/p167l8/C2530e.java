package p167l8;

import okhttp3.HttpUrl;

/* JADX INFO: renamed from: l8.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2530e {

    /* JADX INFO: renamed from: a */
    public final boolean f8174a;

    /* JADX INFO: renamed from: b */
    public final int f8175b;

    /* JADX INFO: renamed from: c */
    public final long f8176c;

    /* JADX INFO: renamed from: d */
    public final long f8177d;

    /* JADX INFO: renamed from: e */
    public final String f8178e;

    /* JADX INFO: renamed from: f */
    public final String f8179f;

    /* JADX INFO: renamed from: g */
    public final String f8180g;

    /* JADX INFO: renamed from: h */
    public final String f8181h;

    /* JADX INFO: renamed from: i */
    public final String f8182i;

    /* JADX INFO: renamed from: j */
    public final String f8183j;

    /* JADX INFO: renamed from: k */
    public final String f8184k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2530e(String str, String str2, String str3, String str4, String str5, String str6, boolean z9, int i9, long j3, long j4, String str7, String str8) {
        this.f8174a = z9;
        this.f8175b = i9;
        this.f8176c = j3;
        this.f8177d = j4;
        this.f8178e = str;
        this.f8179f = str2;
        this.f8180g = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f8181h = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.f8182i = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
        this.f8183j = str7;
        this.f8184k = str8 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str8;
    }
}
