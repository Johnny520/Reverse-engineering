package p402;

import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7383;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9903 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f25766;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ CustomRecycleView f25767;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ PopupWindow f25768;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f25769;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f25770;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9908 f25771;

    public /* synthetic */ C9903(C9908 c9908, View view, String str, CustomRecycleView customRecycleView, ProgressBar progressBar, PopupWindow popupWindow) {
        this.f25771 = c9908;
        this.f25769 = view;
        this.f25770 = str;
        this.f25767 = customRecycleView;
        this.f25766 = progressBar;
        this.f25768 = popupWindow;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        ((TextView) obj2).getClass();
        C9908 c9908 = this.f25771;
        if (!AbstractC5227.m9466(c9908.f25798, str)) {
            c9908.f25798 = str;
            c9908.m15214((TextView) this.f25769);
            c9908.m15215(this.f25770, this.f25767, this.f25766);
        }
        this.f25768.dismiss();
        return C6008.f15084;
    }
}
