package p343;

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
import io.ktor.server.http.content.C4123;
import kotlin.jvm.internal.AbstractC4394;
import p053.AbstractC6560;
import p087.C7067;
import p193.C7827;
import p217.AbstractC7968;
import p257.C8239;
import p315.C8671;
import p319.C8684;
import p323.C8733;
import p341.C8816;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5830;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.presenter.C5979;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲世楪子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8825 extends AbstractC7968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f24816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public String f24817;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5979 f24818;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Activity f24819;

    public C8825(C5979 c5979, Activity activity) {
        c5979.getClass();
        this.f24818 = c5979;
        this.f24819 = activity;
        this.f24816 = "latest";
        this.f24817 = "";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14472(OnlineStickerInfo onlineStickerInfo) {
        Activity activity = this.f24819;
        activity.getClass();
        onlineStickerInfo.getClass();
        C5979 c5979 = this.f24818;
        c5979.getClass();
        C7827 c7827 = new C7827();
        c7827.f21371 = activity;
        c7827.f21369 = onlineStickerInfo;
        c7827.f21370 = c5979;
        C8239 c8239M13743 = C8239.m13743();
        c8239M13743.f11577 = DialogX$THEME.AUTO;
        c8239M13743.f22762 = onlineStickerInfo.getTitle();
        c8239M13743.m13746();
        c8239M13743.f22765 = new C8684(c7827);
        c8239M13743.m13746();
        c8239M13743.m13744();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14473(String str, CustomRecycleView customRecycleView, ProgressBar progressBar) {
        progressBar.setVisibility(0);
        C5979 c5979 = this.f24818;
        C8816 c8816 = new C8816(c5979);
        c8816.f24802 = new C8828(this, 2);
        c8816.f24800 = new C8828(this, 3);
        customRecycleView.setAdapter(c8816);
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m4724();
        }
        customRecycleView.m4721(new C8733(customRecycleView.getResources().getDimensionPixelSize(R.dimen.sticker_grid_spacing), 2));
        c5979.m11303(str, this.f24816, this.f24817, new C7067(c8816, 6, progressBar));
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC6560.m12028(context).inflate(R.layout.item_sticker_pager, viewGroup, false);
        viewInflate.getClass();
        return new C8671(viewInflate);
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13429(AbstractC2484 abstractC2484, int i, Object obj) {
        C8671 c8671 = (C8671) abstractC2484;
        String str = (String) obj;
        if (str == null) {
            C5919.m11250("Check failed.");
            return;
        }
        c8671.m14341(R.id.tv_page_title, str);
        CustomRecycleView customRecycleView = (CustomRecycleView) c8671.m14342(R.id.rv_sticker_list);
        ProgressBar progressBar = (ProgressBar) c8671.m14342(R.id.pb_loading);
        TextView textView = (TextView) c8671.m14342(R.id.tv_sort);
        ((EditText) c8671.m14342(R.id.et_search)).addTextChangedListener(new C8826(this, str, customRecycleView, progressBar, 0));
        String str2 = this.f24816;
        String str3 = "最新发布";
        if (!AbstractC4394.m8917(str2, "latest") && AbstractC4394.m8917(str2, "popular")) {
            str3 = "最多下载";
        }
        textView.setText(str3);
        textView.setOnClickListener(new ViewOnClickListenerC5830(this, textView, str, customRecycleView, progressBar, 1));
        C5979 c5979 = this.f24818;
        C8816 c8816 = new C8816(c5979);
        c8816.f24802 = new C8828(this, 0);
        c8816.f24800 = new C8828(this, 1);
        customRecycleView.setAdapter(c8816);
        customRecycleView.setLayoutManager(new StaggeredGridLayoutManager(2));
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m4724();
        }
        customRecycleView.m4721(new C8733(customRecycleView.getResources().getDimensionPixelSize(R.dimen.sticker_grid_spacing), 2));
        c5979.m11303(str, this.f24816, this.f24817, new C4123(c8816, c8671, str, progressBar));
    }
}
