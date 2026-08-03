package p332wb;

import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p085fg.InterfaceC1220a;
import p117i0.AbstractC1874r;
import p117i0.C1858m2;
import p338x0.AbstractC5575e;
import p338x0.AbstractC5577g;

/* JADX INFO: renamed from: wb.pp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5218pp implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20028g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f20028g) {
            case 0:
                return AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
            case 1:
                return AbstractC1874r.m4639u(Boolean.FALSE);
            case 2:
                return AbstractC1874r.m4639u(Boolean.FALSE);
            case 3:
                return AbstractC1874r.m4639u(null);
            case 4:
                C1858m2 c1858m2 = AbstractC5575e.f22702a;
                return null;
            case 5:
                C1858m2 c1858m22 = AbstractC5577g.f22704a;
                return null;
            case 6:
                throw new IllegalStateException("LocalWindowListPopupState not provided");
            default:
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return builder.connectTimeout(30L, timeUnit).readTimeout(300L, timeUnit).writeTimeout(300L, timeUnit).followRedirects(true).followSslRedirects(true).build();
        }
    }
}
