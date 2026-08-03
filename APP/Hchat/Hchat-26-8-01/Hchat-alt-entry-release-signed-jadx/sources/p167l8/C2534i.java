package p167l8;

import okhttp3.HttpUrl;

/* JADX INFO: renamed from: l8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2534i {

    /* JADX INFO: renamed from: a */
    public final long f8195a;

    /* JADX INFO: renamed from: b */
    public final long f8196b;

    /* JADX INFO: renamed from: c */
    public final String f8197c;

    /* JADX INFO: renamed from: d */
    public final String f8198d;

    /* JADX INFO: renamed from: e */
    public final String f8199e;

    /* JADX INFO: renamed from: f */
    public final String f8200f;

    /* JADX INFO: renamed from: g */
    public final String f8201g;

    /* JADX INFO: renamed from: h */
    public final String f8202h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2534i(String str, String str2, String str3, String str4, long j3, long j4, String str5, String str6) {
        this.f8195a = j3;
        this.f8196b = j4;
        this.f8197c = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f8198d = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.f8199e = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f8200f = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.f8201g = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
        this.f8202h = str6;
    }
}
