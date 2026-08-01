package top.suzhelan.plugin.sdk.online.net;

import androidx.compose.animation.core.C0325;
import com.google.gson.C3253;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p007.C6127;
import p007.C6143;
import p013.AbstractC6230;
import p396.C9113;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/net/PluginClient;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;", "getOkHttpClient", "()L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;", "Ltop/suzhelan/plugin/sdk/online/net/ApiService;", "getApiService", "()Ltop/suzhelan/plugin/sdk/online/net/ApiService;", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PluginClient {
    public static final PluginClient INSTANCE = new PluginClient();

    private PluginClient() {
    }

    public static final ApiService getApiService() {
        C9113 c9113 = new C9113(new C3253());
        C0325 c0325 = new C0325(19);
        c0325.m971(PluginSdkConfig.BASE_URL);
        C6127 okHttpClient = INSTANCE.getOkHttpClient();
        Objects.requireNonNull(okHttpClient, "client == null");
        c0325.f1095 = okHttpClient;
        ((ArrayList) c0325.f1094).add(c9113);
        Object objM548 = c0325.m970().m548(ApiService.class);
        objM548.getClass();
        return (ApiService) objM548;
    }

    private final C6127 getOkHttpClient() {
        C6143 c6143 = new C6143();
        HeaderInterceptor headerInterceptor = new HeaderInterceptor();
        ArrayList arrayList = c6143.f16837;
        arrayList.add(headerInterceptor);
        arrayList.add(new HttpLogInterceptor());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        c6143.f16842 = AbstractC6230.m11697(60L, timeUnit);
        timeUnit.getClass();
        c6143.f16833 = AbstractC6230.m11697(60L, timeUnit);
        c6143.f16832 = AbstractC6230.m11697(60L, timeUnit);
        c6143.f16843 = AbstractC6230.m11697(60L, timeUnit);
        return new C6127(c6143);
    }
}
