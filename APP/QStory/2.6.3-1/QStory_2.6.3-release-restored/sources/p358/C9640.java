package p358;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.DialogX$THEME;
import io.ktor.server.http.content.C4956;
import kotlin.jvm.internal.AbstractC5227;
import p034.AbstractC7082;
import p103.C7897;
import p209.C8657;
import p233.AbstractC8798;
import p273.C9069;
import p331.C9492;
import p339.C9536;
import p340.C9565;
import p359.C9648;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC6673;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.presenter.C6815;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9640 extends AbstractC8798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f25142;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public String f25143;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6815 f25144;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Activity f25145;

    public C9640(C6815 c6815, Activity activity) {
        c6815.getClass();
        this.f25144 = c6815;
        this.f25145 = activity;
        this.f25142 = "latest";
        this.f25143 = "";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m15042(OnlineStickerInfo onlineStickerInfo) {
        Activity activity = this.f25145;
        activity.getClass();
        onlineStickerInfo.getClass();
        C6815 c6815 = this.f25144;
        c6815.getClass();
        C8657 c8657 = new C8657();
        c8657.f21713 = activity;
        c8657.f21711 = onlineStickerInfo;
        c8657.f21712 = c6815;
        C9069 c9069M14318 = C9069.m14318();
        c9069M14318.f11927 = DialogX$THEME.AUTO;
        c9069M14318.f23106 = onlineStickerInfo.getTitle();
        c9069M14318.m14322();
        c9069M14318.f23109 = new C9536(c8657);
        c9069M14318.m14322();
        c9069M14318.m14319();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m15043(String str, CustomRecycleView customRecycleView, ProgressBar progressBar) {
        progressBar.setVisibility(0);
        C6815 c6815 = this.f25144;
        C9648 c9648 = new C9648(c6815);
        c9648.f25169 = new C9643(this, 2);
        c9648.f25167 = new C9643(this, 3);
        customRecycleView.setAdapter(c9648);
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m5294();
        }
        customRecycleView.m5291(new C9565(customRecycleView.getResources().getDimensionPixelSize(C0328R.dimen.sticker_grid_spacing), 1));
        c6815.m11922(str, this.f25142, this.f25143, new C7897(c9648, 6, progressBar));
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC7082.m12309(context).inflate(C0328R.layout.item_sticker_pager, viewGroup, false);
        viewInflate.getClass();
        return new C9492(viewInflate);
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo14016(AbstractC3317 abstractC3317, int i, Object obj) {
        C9492 c9492 = (C9492) abstractC3317;
        String str = (String) obj;
        if (str == null) {
            C6755.m11870("Check failed.");
            return;
        }
        c9492.m14918(C0328R.id.tv_page_title, str);
        CustomRecycleView customRecycleView = (CustomRecycleView) c9492.m14919(C0328R.id.rv_sticker_list);
        ProgressBar progressBar = (ProgressBar) c9492.m14919(C0328R.id.pb_loading);
        TextView textView = (TextView) c9492.m14919(C0328R.id.tv_sort);
        ((EditText) c9492.m14919(C0328R.id.et_search)).addTextChangedListener(new C9641(this, str, customRecycleView, progressBar, 0));
        String str2 = this.f25142;
        String str3 = "最新发布";
        if (!AbstractC5227.m9466(str2, "latest") && AbstractC5227.m9466(str2, "popular")) {
            str3 = "最多下载";
        }
        textView.setText(str3);
        textView.setOnClickListener(new ViewOnClickListenerC6673(this, textView, str, customRecycleView, progressBar, 1));
        C6815 c6815 = this.f25144;
        C9648 c9648 = new C9648(c6815);
        c9648.f25169 = new C9643(this, 0);
        c9648.f25167 = new C9643(this, 1);
        customRecycleView.setAdapter(c9648);
        customRecycleView.setLayoutManager(new StaggeredGridLayoutManager(2));
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m5294();
        }
        customRecycleView.m5291(new C9565(customRecycleView.getResources().getDimensionPixelSize(C0328R.dimen.sticker_grid_spacing), 1));
        c6815.m11922(str, this.f25142, this.f25143, new C4956(c9648, c9492, str, progressBar));
    }
}
