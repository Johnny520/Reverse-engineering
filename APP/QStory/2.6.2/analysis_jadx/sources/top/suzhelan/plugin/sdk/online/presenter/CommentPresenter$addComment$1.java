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
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5131;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.internal.AbstractC5364;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p089.C7179;
import p093.C7200;
import p095.C7206;
import p388.C9105;
import top.suzhelan.plugin.sdk.online.net.ApiService;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1", f = "CommentPresenter.kt", l = {101}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class CommentPresenter$addComment$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ String $content;
    final /* synthetic */ InterfaceC6553 $onMsg;
    final /* synthetic */ String $pluginId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C5806 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1$1", f = "CommentPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6553 $onMsg;
        final /* synthetic */ QSResult<String> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6553 interfaceC6553, QSResult<String> qSResult, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onMsg = interfaceC6553;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$onMsg, this.$res, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.$onMsg.invoke(this.$res.getMessage(), Boolean.valueOf(this.$res.getStatus() == 200));
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPresenter$addComment$1(C5806 c5806, String str, String str2, InterfaceC6553 interfaceC6553, InterfaceC4356<? super CommentPresenter$addComment$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c5806;
        this.$pluginId = str;
        this.$content = str2;
        this.$onMsg = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CommentPresenter$addComment$1(this.this$0, this.$pluginId, this.$content, this.$onMsg, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CommentPresenter$addComment$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C9105 c9105 = this.this$0.f15924;
            LinkedHashMap linkedHashMapM8786 = AbstractC4338.m8786(new Pair("replyId", String.valueOf(c9105 != null ? c9105.getCommentId() : 0)), new Pair("pluginId", this.$pluginId), new Pair("nickname", PluginSdkConfig.getUSER_NICKNAME()), new Pair("uin", PluginSdkConfig.getUSER_UIN()), new Pair("content", this.$content), new Pair("ts", String.valueOf(System.currentTimeMillis())));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMapM8786.entrySet()) {
                if (!AbstractC4394.m8917((String) entry.getKey(), "sign")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            TreeMap treeMap = new TreeMap(linkedHashMap);
            ArrayList arrayList = new ArrayList(treeMap.size());
            for (Map.Entry entry2 : treeMap.entrySet()) {
                arrayList.add(entry2.getKey() + "=" + entry2.getValue());
            }
            String strM8813 = AbstractC4343.m8813(arrayList, "&", null, null, null, 62);
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = AbstractC5131.f14688;
            byte[] bytes = "D8VPRaGWspA2VMqm".getBytes(charset);
            bytes.getClass();
            mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
            byte[] bytes2 = strM8813.getBytes(charset);
            bytes2.getClass();
            byte[] bArrDoFinal = mac.doFinal(bytes2);
            bArrDoFinal.getClass();
            linkedHashMapM8786.put("sign", AbstractC4346.m8860(bArrDoFinal, new C7179(23), 30));
            ApiService apiService = PluginClientKt.getApiService();
            String str = (String) linkedHashMapM8786.get("replyId");
            int i2 = str != null ? Integer.parseInt(str) : 0;
            String str2 = (String) linkedHashMapM8786.get("pluginId");
            String str3 = str2 == null ? "" : str2;
            String str4 = (String) linkedHashMapM8786.get("nickname");
            String str5 = str4 == null ? "" : str4;
            String str6 = (String) linkedHashMapM8786.get("uin");
            String str7 = str6 == null ? "" : str6;
            String str8 = (String) linkedHashMapM8786.get("content");
            String str9 = str8 == null ? "" : str8;
            String str10 = (String) linkedHashMapM8786.get("ts");
            String str11 = str10 == null ? "" : str10;
            String str12 = (String) linkedHashMapM8786.get("sign");
            Object obj2 = apiService.addComment(str3, i2, str5, str7, str9, str11, str12 == null ? "" : str12).execute().f15756;
            obj2.getClass();
            C7206 c7206 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onMsg, (QSResult) obj2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (AbstractC5398.m10466(c7200, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
