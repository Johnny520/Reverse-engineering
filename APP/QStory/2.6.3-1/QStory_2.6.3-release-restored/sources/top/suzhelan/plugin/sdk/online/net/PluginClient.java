package top.suzhelan.plugin.sdk.online.net;

import androidx.compose.animation.core.C1171;
import com.google.gson.C4085;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p023.C6956;
import p023.C6972;
import p029.AbstractC7059;
import p412.C9942;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m151d2 = {"Ltop/suzhelan/plugin/sdk/online/net/PluginClient;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;", "getOkHttpClient", "()L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;", "Ltop/suzhelan/plugin/sdk/online/net/ApiService;", "getApiService", "()Ltop/suzhelan/plugin/sdk/online/net/ApiService;", "online-plugin-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class PluginClient {
    public static final PluginClient INSTANCE = new PluginClient();

    private PluginClient() {
    }

    public static final ApiService getApiService() {
        C9942 c9942 = new C9942(new C4085());
        C1171 c1171 = new C1171(19);
        c1171.m1531(PluginSdkConfig.BASE_URL);
        C6956 okHttpClient = INSTANCE.getOkHttpClient();
        Objects.requireNonNull(okHttpClient, "client == null");
        c1171.f1440 = okHttpClient;
        ((ArrayList) c1171.f1439).add(c9942);
        Object objM1108 = c1171.m1530().m1108(ApiService.class);
        objM1108.getClass();
        return (ApiService) objM1108;
    }

    private final C6956 getOkHttpClient() {
        C6972 c6972 = new C6972();
        HeaderInterceptor headerInterceptor = new HeaderInterceptor();
        ArrayList arrayList = c6972.f17182;
        arrayList.add(headerInterceptor);
        arrayList.add(new HttpLogInterceptor());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        c6972.f17187 = AbstractC7059.m12256(60L, timeUnit);
        timeUnit.getClass();
        c6972.f17178 = AbstractC7059.m12256(60L, timeUnit);
        c6972.f17177 = AbstractC7059.m12256(60L, timeUnit);
        c6972.f17188 = AbstractC7059.m12256(60L, timeUnit);
        return new C6956(c6972);
    }
}
