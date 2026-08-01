package top.suzhelan.plugin.sdk.online.presenter;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5964;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p105.C8009;
import p109.C8030;
import p111.C8036;
import p401.C9901;
import top.suzhelan.plugin.sdk.online.net.ApiService;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1", m556f = "CommentPresenter.kt", m557l = {101}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class CommentPresenter$addComment$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $content;
    final /* synthetic */ InterfaceC7383 $onMsg;
    final /* synthetic */ String $pluginId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C6637 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1$1", m556f = "CommentPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07831 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $onMsg;
        final /* synthetic */ QSResult<String> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07831(InterfaceC7383 interfaceC7383, QSResult<String> qSResult, InterfaceC5189<? super C07831> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onMsg = interfaceC7383;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07831(this.$onMsg, this.$res, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07831) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onMsg.invoke(this.$res.getMessage(), Boolean.valueOf(this.$res.getStatus() == 200));
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPresenter$addComment$1(C6637 c6637, String str, String str2, InterfaceC7383 interfaceC7383, InterfaceC5189<? super CommentPresenter$addComment$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6637;
        this.$pluginId = str;
        this.$content = str2;
        this.$onMsg = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CommentPresenter$addComment$1(this.this$0, this.$pluginId, this.$content, this.$onMsg, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CommentPresenter$addComment$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C9901 c9901 = this.this$0.f16269;
            LinkedHashMap linkedHashMapM9327 = AbstractC5171.m9327(new Pair("replyId", String.valueOf(c9901 != null ? c9901.getCommentId() : 0)), new Pair("pluginId", this.$pluginId), new Pair("nickname", PluginSdkConfig.getUSER_NICKNAME()), new Pair("uin", PluginSdkConfig.getUSER_UIN()), new Pair("content", this.$content), new Pair("ts", String.valueOf(System.currentTimeMillis())));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMapM9327.entrySet()) {
                if (!AbstractC5227.m9466((String) entry.getKey(), "sign")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            TreeMap treeMap = new TreeMap(linkedHashMap);
            ArrayList arrayList = new ArrayList(treeMap.size());
            for (Map.Entry entry2 : treeMap.entrySet()) {
                arrayList.add(entry2.getKey() + "=" + entry2.getValue());
            }
            String strM9369 = AbstractC5176.m9369(arrayList, "&", null, null, null, 62);
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = AbstractC5964.f15033;
            byte[] bytes = "D8VPRaGWspA2VMqm".getBytes(charset);
            bytes.getClass();
            mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
            byte[] bytes2 = strM9369.getBytes(charset);
            bytes2.getClass();
            byte[] bArrDoFinal = mac.doFinal(bytes2);
            bArrDoFinal.getClass();
            linkedHashMapM9327.put("sign", AbstractC5179.m9414(bArrDoFinal, new C8009(23), 30));
            ApiService apiService = PluginClientKt.getApiService();
            String str = (String) linkedHashMapM9327.get("replyId");
            int i2 = str != null ? Integer.parseInt(str) : 0;
            String str2 = (String) linkedHashMapM9327.get("pluginId");
            String str3 = str2 == null ? "" : str2;
            String str4 = (String) linkedHashMapM9327.get("nickname");
            String str5 = str4 == null ? "" : str4;
            String str6 = (String) linkedHashMapM9327.get("uin");
            String str7 = str6 == null ? "" : str6;
            String str8 = (String) linkedHashMapM9327.get("content");
            String str9 = str8 == null ? "" : str8;
            String str10 = (String) linkedHashMapM9327.get("ts");
            String str11 = str10 == null ? "" : str10;
            String str12 = (String) linkedHashMapM9327.get("sign");
            Object obj2 = apiService.addComment(str3, i2, str5, str7, str9, str11, str12 == null ? "" : str12).execute().f16101;
            obj2.getClass();
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C07831 c07831 = new C07831(this.$onMsg, (QSResult) obj2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (AbstractC6231.m11029(c8030, c07831, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
