package top.suzhelan.plugin.sdk.online.presenter;

import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C2086;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import lin.xposed.hook.javaplugin.view.C6380;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p233.AbstractC8798;
import p273.C9037;
import p273.C9069;
import p358.C9646;
import p401.C9901;
import p402.ViewOnClickListenerC9907;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2", m556f = "CommentPresenter.kt", m557l = {41, 63}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class CommentPresenter$getComments$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $pluginId;
    final /* synthetic */ InterfaceC7387 $updateUiAfter;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C6637 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$1", m556f = "CommentPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07841 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ QSResult<List<C9901>> $res;
        int label;
        final /* synthetic */ C6637 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07841(C6637 c6637, QSResult<List<C9901>> qSResult, InterfaceC5189<? super C07841> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6637;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07841(this.this$0, this.$res, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07841) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C2086 c2086 = this.this$0.f16272;
            String message = this.$res.getMessage();
            message.getClass();
            ((C9069) c2086.f3973).m14323();
            C9037.m14288(message, "错误").mo14278("确定", new C6380(5));
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$3", m556f = "CommentPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C07853 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ List<C9901> $comments;
        final /* synthetic */ InterfaceC7387 $updateUiAfter;
        int label;
        final /* synthetic */ C6637 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07853(C6637 c6637, List<C9901> list, InterfaceC7387 interfaceC7387, InterfaceC5189<? super C07853> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c6637;
            this.$comments = list;
            this.$updateUiAfter = interfaceC7387;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C07853(this.this$0, this.$comments, this.$updateUiAfter, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C07853) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C2086 c2086 = this.this$0.f16272;
            List<C9901> list = this.$comments;
            list.getClass();
            ProgressBar progressBar = (ProgressBar) c2086.f3978;
            if (progressBar == null) {
                AbstractC5227.m9467("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            TextView textView = (TextView) c2086.f3980;
            if (textView == null) {
                AbstractC5227.m9467("tvTitle");
                throw null;
            }
            textView.setText("脚本昵称:" + ((String) c2086.f3976) + " 评论:" + list.size() + "条,点击此处可将回复对象置空");
            TextView textView2 = (TextView) c2086.f3980;
            if (textView2 == null) {
                AbstractC5227.m9467("tvTitle");
                throw null;
            }
            textView2.setOnClickListener(new ViewOnClickListenerC9907(c2086, 0));
            C9646 c9646 = new C9646(new C6886(c2086, 13), 2);
            AbstractC8798.m14017(c9646, list);
            CustomRecycleView customRecycleView = (CustomRecycleView) c2086.f3979;
            if (customRecycleView == null) {
                AbstractC5227.m9467("rvCommentList");
                throw null;
            }
            customRecycleView.setLayoutManager(new LinearLayoutManager(1));
            CustomRecycleView customRecycleView2 = (CustomRecycleView) c2086.f3979;
            if (customRecycleView2 == null) {
                AbstractC5227.m9467("rvCommentList");
                throw null;
            }
            customRecycleView2.setAdapter(c9646);
            Button button = (Button) c2086.f3982;
            if (button == null) {
                AbstractC5227.m9467("sendButton");
                throw null;
            }
            button.setOnClickListener(new ViewOnClickListenerC6392(c2086, 20, c9646));
            this.$updateUiAfter.invoke("OK");
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPresenter$getComments$2(String str, C6637 c6637, InterfaceC7387 interfaceC7387, InterfaceC5189<? super CommentPresenter$getComments$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$pluginId = str;
        this.this$0 = c6637;
        this.$updateUiAfter = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CommentPresenter$getComments$2(this.$pluginId, this.this$0, this.$updateUiAfter, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CommentPresenter$getComments$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            AbstractC6017.m10769(obj);
            return c6008;
        }
        AbstractC6017.m10769(obj);
        Object obj2 = PluginClientKt.getApiService().getComments(this.$pluginId).execute().f16101;
        obj2.getClass();
        QSResult qSResult = (QSResult) obj2;
        if (qSResult.isError()) {
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C07841 c07841 = new C07841(this.this$0, qSResult, null);
            this.L$0 = null;
            this.label = 1;
            return AbstractC6231.m11029(c8030, c07841, this) == coroutineSingletons ? coroutineSingletons : c6008;
        }
        Object data = qSResult.getData();
        data.getClass();
        List<C9901> list = (List) data;
        ArrayList arrayList = new ArrayList();
        for (C9901 c9901 : list) {
            if (c9901.getReplyId() == 0) {
                arrayList.add(c9901);
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C9901) next).getCommentId() == c9901.getReplyId()) {
                        break;
                    }
                }
                C9901 c99012 = (C9901) next;
                String nickname = c99012 != null ? c99012.getNickname() : null;
                arrayList.add(C9901.m15202(c9901, "@" + nickname + " " + c9901.getContent()));
            }
        }
        C8036 c80362 = AbstractC6227.f15375;
        C8030 c80302 = AbstractC6197.f15305;
        C07853 c07853 = new C07853(this.this$0, arrayList, this.$updateUiAfter, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        if (AbstractC6231.m11029(c80302, c07853, this) == coroutineSingletons) {
        }
    }
}
