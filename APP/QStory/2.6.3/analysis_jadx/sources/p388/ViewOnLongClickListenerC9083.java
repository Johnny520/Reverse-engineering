package p388;

import android.content.Context;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0004;
import kotlin.C5176;
import lin.xposed.hook.javaplugin.view.C5549;
import p052.InterfaceC6543;
import p217.AbstractC7969;
import p257.C8208;
import p315.C8663;
import p322.C8703;
import p336.C8791;
import p342.C8817;
import p385.C9066;
import p385.C9072;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC9083 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f25458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7969 f25459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C8663 f25460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25461;

    public /* synthetic */ ViewOnLongClickListenerC9083(AbstractC7969 abstractC7969, C8663 c8663, Object obj, int i) {
        this.f25461 = i;
        this.f25459 = abstractC7969;
        this.f25460 = c8663;
        this.f25458 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f25461;
        Object obj = this.f25458;
        final C8663 c8663 = this.f25460;
        AbstractC7969 abstractC7969 = this.f25459;
        final int i2 = 1;
        switch (i) {
            case 0:
                final C9082 c9082 = (C9082) abstractC7969;
                final C9066 c9066 = (C9066) obj;
                c8663.itemView.getContext().getClass();
                final int i3 = 2;
                C9082.m14660("是否复制插件名称？(下载到本地后可在本地脚本长按选中复制)", c9066.getPluginInfo().getName() + " v" + c9066.getPluginInfo().getVersion(), new InterfaceC6543(c9082, c8663, c9066, i3) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C8663 f25465;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9066 f25466;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25467;

                    {
                        this.f25467 = i3;
                        this.f25465 = c8663;
                        this.f25466 = c9066;
                    }

                    @Override // p052.InterfaceC6543
                    public final Object invoke() {
                        int i4 = this.f25467;
                        C5176 c5176 = C5176.f14739;
                        C9066 c90662 = this.f25466;
                        C8663 c86632 = this.f25465;
                        switch (i4) {
                            case 0:
                                Context context = c86632.itemView.getContext();
                                context.getClass();
                                C9082.m14661(context, c90662.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c86632.itemView.getContext();
                                context2.getClass();
                                C9082.m14661(context2, "作者: " + c90662.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c86632.itemView.getContext();
                                context3.getClass();
                                C9082.m14661(context3, c90662.getPluginInfo().getName() + " v" + c90662.getPluginInfo().getVersion());
                                break;
                        }
                        return c5176;
                    }
                });
                break;
            case 1:
                final C9082 c90822 = (C9082) abstractC7969;
                final C9066 c90662 = (C9066) obj;
                c8663.itemView.getContext().getClass();
                C9082.m14660("是否复制作者信息？(下载到本地后可在本地脚本长按选中复制)", AbstractC0053.m157("作者: ", c90662.getPluginInfo().getAuthor()), new InterfaceC6543(c90822, c8663, c90662, i2) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C8663 f25465;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9066 f25466;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25467;

                    {
                        this.f25467 = i2;
                        this.f25465 = c8663;
                        this.f25466 = c90662;
                    }

                    @Override // p052.InterfaceC6543
                    public final Object invoke() {
                        int i4 = this.f25467;
                        C5176 c5176 = C5176.f14739;
                        C9066 c906622 = this.f25466;
                        C8663 c86632 = this.f25465;
                        switch (i4) {
                            case 0:
                                Context context = c86632.itemView.getContext();
                                context.getClass();
                                C9082.m14661(context, c906622.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c86632.itemView.getContext();
                                context2.getClass();
                                C9082.m14661(context2, "作者: " + c906622.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c86632.itemView.getContext();
                                context3.getClass();
                                C9082.m14661(context3, c906622.getPluginInfo().getName() + " v" + c906622.getPluginInfo().getVersion());
                                break;
                        }
                        return c5176;
                    }
                });
                break;
            case 2:
                final C9082 c90823 = (C9082) abstractC7969;
                final C9066 c90663 = (C9066) obj;
                c8663.itemView.getContext().getClass();
                final int i4 = 0;
                C9082.m14660("是否复制脚本描述？(下载到本地后可在本地脚本长按选中复制)", c90663.getPluginInfo().getDescription(), new InterfaceC6543(c90823, c8663, c90663, i4) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C8663 f25465;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9066 f25466;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25467;

                    {
                        this.f25467 = i4;
                        this.f25465 = c8663;
                        this.f25466 = c90663;
                    }

                    @Override // p052.InterfaceC6543
                    public final Object invoke() {
                        int i42 = this.f25467;
                        C5176 c5176 = C5176.f14739;
                        C9066 c906622 = this.f25466;
                        C8663 c86632 = this.f25465;
                        switch (i42) {
                            case 0:
                                Context context = c86632.itemView.getContext();
                                context.getClass();
                                C9082.m14661(context, c906622.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c86632.itemView.getContext();
                                context2.getClass();
                                C9082.m14661(context2, "作者: " + c906622.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c86632.itemView.getContext();
                                context3.getClass();
                                C9082.m14661(context3, c906622.getPluginInfo().getName() + " v" + c906622.getPluginInfo().getVersion());
                                break;
                        }
                        return c5176;
                    }
                });
                break;
            default:
                C9072 c9072 = (C9072) obj;
                c8663.itemView.getContext().getClass();
                String content = c9072.getContent();
                C0004 c0004 = new C0004((C8817) abstractC7969, c8663, c9072);
                C8208 c8208 = new C8208();
                c8208.f22614 = "是否复制评论内容？(下载到本地后可在本地脚本长按选中复制)";
                c8208.mo13721();
                c8208.f22626 = content;
                c8208.mo13721();
                C8791 c8791 = new C8791(11);
                c8208.f11597 = c8791;
                if (c8208.f11584) {
                    c8791.mo8068(c8208);
                }
                c8208.mo13719("复制", new C8703(c0004, 4));
                C5549 c5549 = new C5549(6);
                c8208.f22629 = "取消";
                c8208.f22622 = c5549;
                c8208.mo13721();
                c8208.m13731();
                break;
        }
        return true;
    }
}
