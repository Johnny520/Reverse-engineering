package p167l8;

import okhttp3.HttpUrl;
import p099h.Hchat.hooks.api.model.WeChatMessage;

/* JADX INFO: renamed from: l8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2531f {

    /* JADX INFO: renamed from: a */
    public final long f8185a;

    /* JADX INFO: renamed from: b */
    public final long f8186b;

    /* JADX INFO: renamed from: c */
    public final String f8187c;

    /* JADX INFO: renamed from: d */
    public final String f8188d;

    /* JADX INFO: renamed from: e */
    public final String f8189e;

    /* JADX INFO: renamed from: f */
    public final long f8190f;

    /* JADX INFO: renamed from: g */
    public final String f8191g;

    /* JADX INFO: renamed from: h */
    public final String f8192h;

    /* JADX INFO: renamed from: i */
    public final int f8193i;

    /* JADX INFO: renamed from: j */
    public final WeChatMessage f8194j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2531f(long j3, long j4, String str, String str2, String str3, long j5, String str4, String str5, int i9, WeChatMessage weChatMessage) {
        this.f8185a = j3;
        this.f8186b = j4;
        this.f8187c = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f8188d = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.f8189e = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f8190f = j5;
        this.f8191g = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.f8192h = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
        this.f8193i = i9;
        this.f8194j = weChatMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m5950a() {
        WeChatMessage weChatMessage = this.f8194j;
        if (weChatMessage != null) {
            long j3 = weChatMessage.createTime;
            if (j3 > 0) {
                return j3;
            }
        }
        return this.f8190f;
    }
}
