package top.suzhelan.plugin.sdk.online.presenter;

import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C1251;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.InterfaceC5400;
import lin.xposed.hook.javaplugin.view.C5548;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p217.AbstractC7968;
import p257.C8207;
import p257.C8239;
import p343.C8831;
import p385.ViewOnClickListenerC9091;
import p388.C9105;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.qstory.hook.item.C5919;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2", f = "CommentPresenter.kt", l = {41, 63}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class CommentPresenter$getComments$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ String $pluginId;
    final /* synthetic */ InterfaceC6557 $updateUiAfter;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C5806 this$0;

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$1", f = "CommentPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ QSResult<List<C9105>> $res;
        int label;
        final /* synthetic */ C5806 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C5806 c5806, QSResult<List<C9105>> qSResult, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c5806;
            this.$res = qSResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.this$0, this.$res, interfaceC4356);
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
            C1251 c1251 = this.this$0.f15927;
            String message = this.$res.getMessage();
            message.getClass();
            ((C8239) c1251.f3627).m13747();
            C8207.m13712(message, "错误").mo13702("确定", new C5548(5));
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.presenter.CommentPresenter$getComments$2$3", f = "CommentPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ List<C9105> $comments;
        final /* synthetic */ InterfaceC6557 $updateUiAfter;
        int label;
        final /* synthetic */ C5806 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C5806 c5806, List<C9105> list, InterfaceC6557 interfaceC6557, InterfaceC4356<? super AnonymousClass3> interfaceC4356) {
            super(2, interfaceC4356);
            this.this$0 = c5806;
            this.$comments = list;
            this.$updateUiAfter = interfaceC6557;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass3(this.this$0, this.$comments, this.$updateUiAfter, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            C1251 c1251 = this.this$0.f15927;
            List<C9105> list = this.$comments;
            list.getClass();
            ProgressBar progressBar = (ProgressBar) c1251.f3632;
            if (progressBar == null) {
                AbstractC4394.m8918("isLoading");
                throw null;
            }
            progressBar.setVisibility(8);
            TextView textView = (TextView) c1251.f3634;
            if (textView == null) {
                AbstractC4394.m8918("tvTitle");
                throw null;
            }
            textView.setText("脚本昵称:" + ((String) c1251.f3630) + " 评论:" + list.size() + "条,点击此处可将回复对象置空");
            TextView textView2 = (TextView) c1251.f3634;
            if (textView2 == null) {
                AbstractC4394.m8918("tvTitle");
                throw null;
            }
            textView2.setOnClickListener(new ViewOnClickListenerC9091(c1251, 0));
            C8831 c8831 = new C8831(new C6051(c1251, 14), 2);
            AbstractC7968.m13430(c8831, list);
            CustomRecycleView customRecycleView = (CustomRecycleView) c1251.f3633;
            if (customRecycleView == null) {
                AbstractC4394.m8918("rvCommentList");
                throw null;
            }
            customRecycleView.setLayoutManager(new LinearLayoutManager(1));
            CustomRecycleView customRecycleView2 = (CustomRecycleView) c1251.f3633;
            if (customRecycleView2 == null) {
                AbstractC4394.m8918("rvCommentList");
                throw null;
            }
            customRecycleView2.setAdapter(c8831);
            Button button = (Button) c1251.f3636;
            if (button == null) {
                AbstractC4394.m8918("sendButton");
                throw null;
            }
            button.setOnClickListener(new ViewOnClickListenerC5561(c1251, 20, c8831));
            this.$updateUiAfter.invoke("OK");
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPresenter$getComments$2(String str, C5806 c5806, InterfaceC6557 interfaceC6557, InterfaceC4356<? super CommentPresenter$getComments$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$pluginId = str;
        this.this$0 = c5806;
        this.$updateUiAfter = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CommentPresenter$getComments$2(this.$pluginId, this.this$0, this.$updateUiAfter, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CommentPresenter$getComments$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
