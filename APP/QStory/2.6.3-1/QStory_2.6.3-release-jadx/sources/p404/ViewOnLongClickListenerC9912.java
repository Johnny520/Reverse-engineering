package p404;

import android.content.Context;
import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.activity.compose.C0851;
import kotlin.C6008;
import lin.xposed.hook.javaplugin.view.C6380;
import p068.InterfaceC7372;
import p233.AbstractC8798;
import p273.C9037;
import p331.C9492;
import p338.C9532;
import p352.C9620;
import p358.C9646;
import p401.C9895;
import p401.C9901;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC9912 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f25803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8798 f25804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C9492 f25805;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25806;

    public /* synthetic */ ViewOnLongClickListenerC9912(AbstractC8798 abstractC8798, C9492 c9492, Object obj, int i) {
        this.f25806 = i;
        this.f25804 = abstractC8798;
        this.f25805 = c9492;
        this.f25803 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f25806;
        Object obj = this.f25803;
        final C9492 c9492 = this.f25805;
        AbstractC8798 abstractC8798 = this.f25804;
        final int i2 = 1;
        switch (i) {
            case 0:
                final C9911 c9911 = (C9911) abstractC8798;
                final C9895 c9895 = (C9895) obj;
                c9492.itemView.getContext().getClass();
                final int i3 = 2;
                C9911.m15219("是否复制插件名称？(下载到本地后可在本地脚本长按选中复制)", c9895.getPluginInfo().getName() + " v" + c9895.getPluginInfo().getVersion(), new InterfaceC7372(c9911, c9492, c9895, i3) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C9492 f25810;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9895 f25811;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25812;

                    {
                        this.f25812 = i3;
                        this.f25810 = c9492;
                        this.f25811 = c9895;
                    }

                    @Override // p068.InterfaceC7372
                    public final Object invoke() {
                        int i4 = this.f25812;
                        C6008 c6008 = C6008.f15084;
                        C9895 c98952 = this.f25811;
                        C9492 c94922 = this.f25810;
                        switch (i4) {
                            case 0:
                                Context context = c94922.itemView.getContext();
                                context.getClass();
                                C9911.m15220(context, c98952.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c94922.itemView.getContext();
                                context2.getClass();
                                C9911.m15220(context2, "作者: " + c98952.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c94922.itemView.getContext();
                                context3.getClass();
                                C9911.m15220(context3, c98952.getPluginInfo().getName() + " v" + c98952.getPluginInfo().getVersion());
                                break;
                        }
                        return c6008;
                    }
                });
                break;
            case 1:
                final C9911 c99112 = (C9911) abstractC8798;
                final C9895 c98952 = (C9895) obj;
                c9492.itemView.getContext().getClass();
                C9911.m15219("是否复制作者信息？(下载到本地后可在本地脚本长按选中复制)", AbstractC0900.m717("作者: ", c98952.getPluginInfo().getAuthor()), new InterfaceC7372(c99112, c9492, c98952, i2) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C9492 f25810;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9895 f25811;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25812;

                    {
                        this.f25812 = i2;
                        this.f25810 = c9492;
                        this.f25811 = c98952;
                    }

                    @Override // p068.InterfaceC7372
                    public final Object invoke() {
                        int i4 = this.f25812;
                        C6008 c6008 = C6008.f15084;
                        C9895 c989522 = this.f25811;
                        C9492 c94922 = this.f25810;
                        switch (i4) {
                            case 0:
                                Context context = c94922.itemView.getContext();
                                context.getClass();
                                C9911.m15220(context, c989522.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c94922.itemView.getContext();
                                context2.getClass();
                                C9911.m15220(context2, "作者: " + c989522.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c94922.itemView.getContext();
                                context3.getClass();
                                C9911.m15220(context3, c989522.getPluginInfo().getName() + " v" + c989522.getPluginInfo().getVersion());
                                break;
                        }
                        return c6008;
                    }
                });
                break;
            case 2:
                final C9911 c99113 = (C9911) abstractC8798;
                final C9895 c98953 = (C9895) obj;
                c9492.itemView.getContext().getClass();
                final int i4 = 0;
                C9911.m15219("是否复制脚本描述？(下载到本地后可在本地脚本长按选中复制)", c98953.getPluginInfo().getDescription(), new InterfaceC7372(c99113, c9492, c98953, i4) { // from class: 飘花落叶言苏楪兰子哲世.飘花落叶言子楪世苏哲兰

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C9492 f25810;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                    public final /* synthetic */ C9895 f25811;

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                    public final /* synthetic */ int f25812;

                    {
                        this.f25812 = i4;
                        this.f25810 = c9492;
                        this.f25811 = c98953;
                    }

                    @Override // p068.InterfaceC7372
                    public final Object invoke() {
                        int i42 = this.f25812;
                        C6008 c6008 = C6008.f15084;
                        C9895 c989522 = this.f25811;
                        C9492 c94922 = this.f25810;
                        switch (i42) {
                            case 0:
                                Context context = c94922.itemView.getContext();
                                context.getClass();
                                C9911.m15220(context, c989522.getPluginInfo().getDescription());
                                break;
                            case 1:
                                Context context2 = c94922.itemView.getContext();
                                context2.getClass();
                                C9911.m15220(context2, "作者: " + c989522.getPluginInfo().getAuthor());
                                break;
                            default:
                                Context context3 = c94922.itemView.getContext();
                                context3.getClass();
                                C9911.m15220(context3, c989522.getPluginInfo().getName() + " v" + c989522.getPluginInfo().getVersion());
                                break;
                        }
                        return c6008;
                    }
                });
                break;
            default:
                C9901 c9901 = (C9901) obj;
                c9492.itemView.getContext().getClass();
                String content = c9901.getContent();
                C0851 c0851 = new C0851((C9646) abstractC8798, c9492, c9901);
                C9037 c9037 = new C9037();
                c9037.f22959 = "是否复制评论内容？(下载到本地后可在本地脚本长按选中复制)";
                c9037.mo14280();
                c9037.f22971 = content;
                c9037.mo14280();
                C9620 c9620 = new C9620(11);
                c9037.f11942 = c9620;
                if (c9037.f11929) {
                    c9620.mo8627(c9037);
                }
                c9037.mo14278("复制", new C9532(c0851, 4));
                C6380 c6380 = new C6380(6);
                c9037.f22974 = "取消";
                c9037.f22967 = c6380;
                c9037.mo14280();
                c9037.m14290();
                break;
        }
        return true;
    }
}
