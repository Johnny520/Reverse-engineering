package p342;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.DialogX$THEME;
import io.ktor.server.http.content.C4124;
import kotlin.jvm.internal.AbstractC4395;
import p018.AbstractC6253;
import p087.C7068;
import p193.C7828;
import p217.AbstractC7969;
import p257.C8240;
import p315.C8663;
import p323.C8707;
import p324.C8736;
import p343.C8819;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5843;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.presenter.C5985;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8811 extends AbstractC7969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f24797;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public String f24798;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5985 f24799;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Activity f24800;

    public C8811(C5985 c5985, Activity activity) {
        c5985.getClass();
        this.f24799 = c5985;
        this.f24800 = activity;
        this.f24797 = "latest";
        this.f24798 = "";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14483(OnlineStickerInfo onlineStickerInfo) {
        Activity activity = this.f24800;
        activity.getClass();
        onlineStickerInfo.getClass();
        C5985 c5985 = this.f24799;
        c5985.getClass();
        C7828 c7828 = new C7828();
        c7828.f21368 = activity;
        c7828.f21366 = onlineStickerInfo;
        c7828.f21367 = c5985;
        C8240 c8240M13759 = C8240.m13759();
        c8240M13759.f11582 = DialogX$THEME.AUTO;
        c8240M13759.f22761 = onlineStickerInfo.getTitle();
        c8240M13759.m13763();
        c8240M13759.f22764 = new C8707(c7828);
        c8240M13759.m13763();
        c8240M13759.m13760();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14484(String str, CustomRecycleView customRecycleView, ProgressBar progressBar) {
        progressBar.setVisibility(0);
        C5985 c5985 = this.f24799;
        C8819 c8819 = new C8819(c5985);
        c8819.f24824 = new C8814(this, 2);
        c8819.f24822 = new C8814(this, 3);
        customRecycleView.setAdapter(c8819);
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m4734();
        }
        customRecycleView.m4731(new C8736(customRecycleView.getResources().getDimensionPixelSize(R.dimen.sticker_grid_spacing), 1));
        c5985.m11363(str, this.f24797, this.f24798, new C7068(c8819, 6, progressBar));
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC6253.m11750(context).inflate(R.layout.item_sticker_pager, viewGroup, false);
        viewInflate.getClass();
        return new C8663(viewInflate);
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13457(AbstractC2484 abstractC2484, int i, Object obj) {
        C8663 c8663 = (C8663) abstractC2484;
        String str = (String) obj;
        if (str == null) {
            C5925.m11311("Check failed.");
            return;
        }
        c8663.m14359(R.id.tv_page_title, str);
        CustomRecycleView customRecycleView = (CustomRecycleView) c8663.m14360(R.id.rv_sticker_list);
        ProgressBar progressBar = (ProgressBar) c8663.m14360(R.id.pb_loading);
        TextView textView = (TextView) c8663.m14360(R.id.tv_sort);
        ((EditText) c8663.m14360(R.id.et_search)).addTextChangedListener(new C8812(this, str, customRecycleView, progressBar, 0));
        String str2 = this.f24797;
        String str3 = "最新发布";
        if (!AbstractC4395.m8907(str2, "latest") && AbstractC4395.m8907(str2, "popular")) {
            str3 = "最多下载";
        }
        textView.setText(str3);
        textView.setOnClickListener(new ViewOnClickListenerC5843(this, textView, str, customRecycleView, progressBar, 1));
        C5985 c5985 = this.f24799;
        C8819 c8819 = new C8819(c5985);
        c8819.f24824 = new C8814(this, 0);
        c8819.f24822 = new C8814(this, 1);
        customRecycleView.setAdapter(c8819);
        customRecycleView.setLayoutManager(new StaggeredGridLayoutManager(2));
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m4734();
        }
        customRecycleView.m4731(new C8736(customRecycleView.getResources().getDimensionPixelSize(R.dimen.sticker_grid_spacing), 1));
        c5985.m11363(str, this.f24797, this.f24798, new C4124(c8819, c8663, str, progressBar));
    }
}
