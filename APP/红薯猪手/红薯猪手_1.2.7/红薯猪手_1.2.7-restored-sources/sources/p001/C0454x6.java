package p001;

import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p001.InterfaceC0449x1;

/* JADX INFO: renamed from: ۟.x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0454x6 implements InterfaceC0449x1 {

    /* JADX INFO: renamed from: ۥ */
    public final OkHttpClient f1189;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0454x6(File file, long j) {
        OkHttpClient okHttpClientM963 = m963();
        this.f1189 = okHttpClientM963;
        try {
            okHttpClientM963.setCache(new Cache(file, j));
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static OkHttpClient m963() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(15000L, timeUnit);
        okHttpClient.setReadTimeout(20000L, timeUnit);
        okHttpClient.setWriteTimeout(20000L, timeUnit);
        return okHttpClient;
    }

    @Override // p001.InterfaceC0449x1
    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC0449x1.a mo960(Uri uri, int i) throws InterfaceC0449x1.b {
        CacheControl cacheControlBuild;
        if (i == 0) {
            cacheControlBuild = null;
        } else if (C0167c4.m834(i)) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!C0167c4.m835(i)) {
                builder.noCache();
            }
            if (!C0167c4.m1034(i)) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        Request.Builder builderUrl = new Request.Builder().url(uri.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        Response responseExecute = this.f1189.newCall(builderUrl.build()).execute();
        int iCode = responseExecute.code();
        if (iCode < 300) {
            boolean z = responseExecute.cacheResponse() != null;
            ResponseBody responseBodyBody = responseExecute.body();
            return new InterfaceC0449x1.a(responseBodyBody.byteStream(), z, responseBodyBody.contentLength());
        }
        responseExecute.body().close();
        throw new InterfaceC0449x1.b(iCode + " " + responseExecute.message(), i, iCode);
    }
}
