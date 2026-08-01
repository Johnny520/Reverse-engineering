package p386;

import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6554;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9074 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f25421;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ CustomRecycleView f25422;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ PopupWindow f25423;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f25424;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f25425;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9079 f25426;

    public /* synthetic */ C9074(C9079 c9079, View view, String str, CustomRecycleView customRecycleView, ProgressBar progressBar, PopupWindow popupWindow) {
        this.f25426 = c9079;
        this.f25424 = view;
        this.f25425 = str;
        this.f25422 = customRecycleView;
        this.f25421 = progressBar;
        this.f25423 = popupWindow;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        ((TextView) obj2).getClass();
        C9079 c9079 = this.f25426;
        if (!AbstractC4395.m8907(c9079.f25453, str)) {
            c9079.f25453 = str;
            c9079.m14655((TextView) this.f25424);
            c9079.m14656(this.f25425, this.f25422, this.f25421);
        }
        this.f25423.dismiss();
        return C5176.f14739;
    }
}
