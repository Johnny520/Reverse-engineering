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
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5132;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.internal.AbstractC5365;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p089.C7180;
import p093.C7201;
import p095.C7207;
import p385.C9072;
import top.suzhelan.plugin.sdk.online.net.ApiService;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1", f = "CommentPresenter.kt", l = {101}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class CommentPresenter$addComment$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ String $content;
    final /* synthetic */ InterfaceC6554 $onMsg;
    final /* synthetic */ String $pluginId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C5807 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$addComment$1$1", f = "CommentPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6554 $onMsg;
        final /* synthetic */ QSResult<String> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6554 interfaceC6554, QSResult<String> qSResult, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$onMsg = interfaceC6554;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$onMsg, this.$res, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            this.$onMsg.invoke(this.$res.getMessage(), Boolean.valueOf(this.$res.getStatus() == 200));
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPresenter$addComment$1(C5807 c5807, String str, String str2, InterfaceC6554 interfaceC6554, InterfaceC4357<? super CommentPresenter$addComment$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c5807;
        this.$pluginId = str;
        this.$content = str2;
        this.$onMsg = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new CommentPresenter$addComment$1(this.this$0, this.$pluginId, this.$content, this.$onMsg, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CommentPresenter$addComment$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C9072 c9072 = this.this$0.f15924;
            LinkedHashMap linkedHashMapM8768 = AbstractC4339.m8768(new Pair("replyId", String.valueOf(c9072 != null ? c9072.getCommentId() : 0)), new Pair("pluginId", this.$pluginId), new Pair("nickname", PluginSdkConfig.getUSER_NICKNAME()), new Pair("uin", PluginSdkConfig.getUSER_UIN()), new Pair("content", this.$content), new Pair("ts", String.valueOf(System.currentTimeMillis())));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMapM8768.entrySet()) {
                if (!AbstractC4395.m8907((String) entry.getKey(), "sign")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            TreeMap treeMap = new TreeMap(linkedHashMap);
            ArrayList arrayList = new ArrayList(treeMap.size());
            for (Map.Entry entry2 : treeMap.entrySet()) {
                arrayList.add(entry2.getKey() + "=" + entry2.getValue());
            }
            String strM8810 = AbstractC4344.m8810(arrayList, "&", null, null, null, 62);
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = AbstractC5132.f14688;
            byte[] bytes = "D8VPRaGWspA2VMqm".getBytes(charset);
            bytes.getClass();
            mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
            byte[] bytes2 = strM8810.getBytes(charset);
            bytes2.getClass();
            byte[] bArrDoFinal = mac.doFinal(bytes2);
            bArrDoFinal.getClass();
            linkedHashMapM8768.put("sign", AbstractC4347.m8855(bArrDoFinal, new C7180(23), 30));
            ApiService apiService = PluginClientKt.getApiService();
            String str = (String) linkedHashMapM8768.get("replyId");
            int i2 = str != null ? Integer.parseInt(str) : 0;
            String str2 = (String) linkedHashMapM8768.get("pluginId");
            String str3 = str2 == null ? "" : str2;
            String str4 = (String) linkedHashMapM8768.get("nickname");
            String str5 = str4 == null ? "" : str4;
            String str6 = (String) linkedHashMapM8768.get("uin");
            String str7 = str6 == null ? "" : str6;
            String str8 = (String) linkedHashMapM8768.get("content");
            String str9 = str8 == null ? "" : str8;
            String str10 = (String) linkedHashMapM8768.get("ts");
            String str11 = str10 == null ? "" : str10;
            String str12 = (String) linkedHashMapM8768.get("sign");
            Object obj2 = apiService.addComment(str3, i2, str5, str7, str9, str11, str12 == null ? "" : str12).execute().f15756;
            obj2.getClass();
            C7207 c7207 = AbstractC5395.f15030;
            C7201 c7201 = AbstractC5365.f14960;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onMsg, (QSResult) obj2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (AbstractC5399.m10470(c7201, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
