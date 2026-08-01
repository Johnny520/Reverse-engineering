package top.suzhelan.sticker.sdk.net;

import androidx.compose.animation.core.C0325;
import com.google.gson.C3252;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p015.C6200;
import p015.C6216;
import p017.AbstractC6238;
import p398.C9152;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltop/suzhelan/sticker/sdk/net/StickerClient;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;", "getOkHttpClient", "()L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;", "Ltop/suzhelan/sticker/sdk/net/StickerApiService;", "getApiService", "()Ltop/suzhelan/sticker/sdk/net/StickerApiService;", "online-sticker-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickerClient {
    public static final StickerClient INSTANCE = new StickerClient();

    private StickerClient() {
    }

    public static final StickerApiService getApiService() {
        C0325 c0325 = new C0325(19);
        c0325.m971(StickerSdkConfig.BASE_URL);
        C6200 okHttpClient = INSTANCE.getOkHttpClient();
        Objects.requireNonNull(okHttpClient, "client == null");
        c0325.f1095 = okHttpClient;
        ((ArrayList) c0325.f1094).add(new C9152(new C3252()));
        Object objM547 = c0325.m970().m547(StickerApiService.class);
        objM547.getClass();
        return (StickerApiService) objM547;
    }

    private final C6200 getOkHttpClient() {
        C6216 c6216 = new C6216();
        c6216.f17076.add(new HeaderInterceptor());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        c6216.f17081 = AbstractC6238.m11705(60L, timeUnit);
        timeUnit.getClass();
        c6216.f17072 = AbstractC6238.m11705(60L, timeUnit);
        c6216.f17071 = AbstractC6238.m11705(60L, timeUnit);
        c6216.f17082 = AbstractC6238.m11705(60L, timeUnit);
        return new C6200(c6216);
    }
}
