package top.suzhelan.plugin.sdk.online.presenter;

import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C1251;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.InterfaceC5401;
import lin.xposed.hook.javaplugin.view.C5549;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p217.AbstractC7969;
import p257.C8208;
import p257.C8240;
import p342.C8817;
import p385.C9072;
import p386.ViewOnClickListenerC9078;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.qstory.hook.item.C5925;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2", f = "CommentPresenter.kt", l = {41, 63}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class CommentPresenter$getComments$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ String $pluginId;
    final /* synthetic */ InterfaceC6558 $updateUiAfter;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C5807 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$1", f = "CommentPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ QSResult<List<C9072>> $res;
        int label;
        final /* synthetic */ C5807 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C5807 c5807, QSResult<List<C9072>> qSResult, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.this$0 = c5807;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.this$0, this.$res, interfaceC4357);
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
            C1251 c1251 = this.this$0.f15927;
            String message = this.$res.getMessage();
            message.getClass();
            ((C8240) c1251.f3628).m13764();
            C8208.m13729(message, "错误").mo13719("确定", new C5549(5));
            return C5176.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$3", f = "CommentPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ List<C9072> $comments;
        final /* synthetic */ InterfaceC6558 $updateUiAfter;
        int label;
        final /* synthetic */ C5807 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C5807 c5807, List<C9072> list, InterfaceC6558 interfaceC6558, InterfaceC4357<? super AnonymousClass3> interfaceC4357) {
            super(2, interfaceC4357);
            this.this$0 = c5807;
            this.$comments = list;
            this.$updateUiAfter = interfaceC6558;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass3(this.this$0, this.$comments, this.$updateUiAfter, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            C1251 c1251 = this.this$0.f15927;
            List<C9072> list = this.$comments;
            list.getClass();
            ProgressBar progressBar = (ProgressBar) c1251.f3633;
            if (progressBar == null) {
                AbstractC4395.m8908("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            TextView textView = (TextView) c1251.f3635;
            if (textView == null) {
                AbstractC4395.m8908("tvTitle");
                throw null;
            }
            textView.setText("脚本昵称:" + ((String) c1251.f3631) + " 评论:" + list.size() + "条,点击此处可将回复对象置空");
            TextView textView2 = (TextView) c1251.f3635;
            if (textView2 == null) {
                AbstractC4395.m8908("tvTitle");
                throw null;
            }
            textView2.setOnClickListener(new ViewOnClickListenerC9078(c1251, 0));
            C8817 c8817 = new C8817(new C6057(c1251, 13), 2);
            AbstractC7969.m13458(c8817, list);
            CustomRecycleView customRecycleView = (CustomRecycleView) c1251.f3634;
            if (customRecycleView == null) {
                AbstractC4395.m8908("rvCommentList");
                throw null;
            }
            customRecycleView.setLayoutManager(new LinearLayoutManager(1));
            CustomRecycleView customRecycleView2 = (CustomRecycleView) c1251.f3634;
            if (customRecycleView2 == null) {
                AbstractC4395.m8908("rvCommentList");
                throw null;
            }
            customRecycleView2.setAdapter(c8817);
            Button button = (Button) c1251.f3637;
            if (button == null) {
                AbstractC4395.m8908("sendButton");
                throw null;
            }
            button.setOnClickListener(new ViewOnClickListenerC5562(c1251, 20, c8817));
            this.$updateUiAfter.invoke("OK");
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPresenter$getComments$2(String str, C5807 c5807, InterfaceC6558 interfaceC6558, InterfaceC4357<? super CommentPresenter$getComments$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$pluginId = str;
        this.this$0 = c5807;
        this.$updateUiAfter = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new CommentPresenter$getComments$2(this.$pluginId, this.this$0, this.$updateUiAfter, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CommentPresenter$getComments$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
