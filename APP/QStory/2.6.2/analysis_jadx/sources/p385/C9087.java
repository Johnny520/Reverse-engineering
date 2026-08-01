package p385;

import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6553;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9087 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f25371;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ CustomRecycleView f25372;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ PopupWindow f25373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f25374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f25375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9092 f25376;

    public /* synthetic */ C9087(C9092 c9092, View view, String str, CustomRecycleView customRecycleView, ProgressBar progressBar, PopupWindow popupWindow) {
        this.f25376 = c9092;
        this.f25374 = view;
        this.f25375 = str;
        this.f25372 = customRecycleView;
        this.f25371 = progressBar;
        this.f25373 = popupWindow;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        str.getClass();
        ((TextView) obj2).getClass();
        C9092 c9092 = this.f25376;
        if (!AbstractC4394.m8917(c9092.f25403, str)) {
            c9092.f25403 = str;
            c9092.m14598((TextView) this.f25374);
            c9092.m14599(this.f25375, this.f25372, this.f25371);
        }
        this.f25373.dismiss();
        return C5175.f14739;
    }
}
