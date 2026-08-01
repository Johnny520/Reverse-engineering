package p386;

import android.content.Context;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0004;
import kotlin.C5175;
import lin.xposed.hook.javaplugin.view.C5548;
import p052.InterfaceC6542;
import p217.AbstractC7968;
import p257.C8207;
import p315.C8671;
import p319.C8700;
import p330.C8796;
import p343.C8831;
import p388.C9099;
import p388.C9105;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC9095 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f25407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7968 f25408;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8671 f25409;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25410;

    public /* synthetic */ ViewOnLongClickListenerC9095(AbstractC7968 abstractC7968, C8671 c8671, Object obj, int i) {
        this.f25410 = i;
        this.f25408 = abstractC7968;
        this.f25409 = c8671;
        this.f25407 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f25410;
        Object obj = this.f25407;
        final C8671 c8671 = this.f25409;
        AbstractC7968 abstractC7968 = this.f25408;
        final int i2 = 1;
        switch (i) {
            case 0:
                final C9094 c9094 = (C9094) abstractC7968;
                final C9099 c9099 = (C9099) obj;
                c8671.itemView.getContext().getClass();
                final int i3 = 2;
                C9094.m14602("是否复制插件名称？(下载到本地后可在本地脚本长按选中复制)", c9099.getPluginInfo().getName() + " v" + c9099.getPluginInfo().getVersion(), new InterfaceC6542(c9094, c8671, c9099, i3) { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C8671 f25414;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9099 f25415;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25416;

                    {
                        this.f25416 = i3;
                        this.f25414 = c8671;
                        this.f25415 = c9099;
                    }

                    @Override // p052.InterfaceC6542
                    public final Object invoke() {
                        int i4 = this.f25416;
                        C5175 c5175 = C5175.f14739;
                        C9099 c90992 = this.f25415;
                        C8671 c86712 = this.f25414;
                        switch (i4) {
                            case 0:
                                Context context = c86712.itemView.getContext();
                                context.getClass();
                                C9094.m14603(context, c90992.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c86712.itemView.getContext();
                                context2.getClass();
                                C9094.m14603(context2, "作者: " + c90992.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c86712.itemView.getContext();
                                context3.getClass();
                                C9094.m14603(context3, c90992.getPluginInfo().getName() + " v" + c90992.getPluginInfo().getVersion());
                                break;
                        }
                        return c5175;
                    }
                });
                break;
            case 1:
                final C9094 c90942 = (C9094) abstractC7968;
                final C9099 c90992 = (C9099) obj;
                c8671.itemView.getContext().getClass();
                C9094.m14602("是否复制作者信息？(下载到本地后可在本地脚本长按选中复制)", AbstractC0053.m152("作者: ", c90992.getPluginInfo().getAuthor()), new InterfaceC6542(c90942, c8671, c90992, i2) { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C8671 f25414;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9099 f25415;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25416;

                    {
                        this.f25416 = i2;
                        this.f25414 = c8671;
                        this.f25415 = c90992;
                    }

                    @Override // p052.InterfaceC6542
                    public final Object invoke() {
                        int i4 = this.f25416;
                        C5175 c5175 = C5175.f14739;
                        C9099 c909922 = this.f25415;
                        C8671 c86712 = this.f25414;
                        switch (i4) {
                            case 0:
                                Context context = c86712.itemView.getContext();
                                context.getClass();
                                C9094.m14603(context, c909922.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c86712.itemView.getContext();
                                context2.getClass();
                                C9094.m14603(context2, "作者: " + c909922.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c86712.itemView.getContext();
                                context3.getClass();
                                C9094.m14603(context3, c909922.getPluginInfo().getName() + " v" + c909922.getPluginInfo().getVersion());
                                break;
                        }
                        return c5175;
                    }
                });
                break;
            case 2:
                final C9094 c90943 = (C9094) abstractC7968;
                final C9099 c90993 = (C9099) obj;
                c8671.itemView.getContext().getClass();
                final int i4 = 0;
                C9094.m14602("是否复制脚本描述？(下载到本地后可在本地脚本长按选中复制)", c90993.getPluginInfo().getDescription(), new InterfaceC6542(c90943, c8671, c90993, i4) { // from class: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C8671 f25414;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9099 f25415;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25416;

                    {
                        this.f25416 = i4;
                        this.f25414 = c8671;
                        this.f25415 = c90993;
                    }

                    @Override // p052.InterfaceC6542
                    public final Object invoke() {
                        int i42 = this.f25416;
                        C5175 c5175 = C5175.f14739;
                        C9099 c909922 = this.f25415;
                        C8671 c86712 = this.f25414;
                        switch (i42) {
                            case 0:
                                Context context = c86712.itemView.getContext();
                                context.getClass();
                                C9094.m14603(context, c909922.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c86712.itemView.getContext();
                                context2.getClass();
                                C9094.m14603(context2, "作者: " + c909922.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c86712.itemView.getContext();
                                context3.getClass();
                                C9094.m14603(context3, c909922.getPluginInfo().getName() + " v" + c909922.getPluginInfo().getVersion());
                                break;
                        }
                        return c5175;
                    }
                });
                break;
            default:
                C9105 c9105 = (C9105) obj;
                c8671.itemView.getContext().getClass();
                String content = c9105.getContent();
                C0004 c0004 = new C0004((C8831) abstractC7968, c8671, c9105);
                C8207 c8207 = new C8207();
                c8207.f22615 = "是否复制评论内容？(下载到本地后可在本地脚本长按选中复制)";
                c8207.mo13704();
                c8207.f22627 = content;
                c8207.mo13704();
                C8796 c8796 = new C8796(10);
                c8207.f11592 = c8796;
                if (c8207.f11579) {
                    c8796.mo8081(c8207);
                }
                c8207.mo13702("复制", new C8700(c0004, 4));
                C5548 c5548 = new C5548(6);
                c8207.f22630 = "取消";
                c8207.f22623 = c5548;
                c8207.mo13704();
                c8207.m13714();
                break;
        }
        return true;
    }
}
