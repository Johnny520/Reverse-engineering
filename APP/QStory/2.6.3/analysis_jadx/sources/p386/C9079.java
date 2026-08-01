package p386;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.foundation.lazy.C0756;
import androidx.compose.foundation.text.C1011;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.davemorrissey.labs.subscaleview.R;
import java.util.LinkedHashSet;
import p018.AbstractC6253;
import p034.AbstractC6347;
import p217.AbstractC7969;
import p315.C8663;
import p324.C8736;
import p342.C8812;
import p388.C9082;
import top.suzhelan.plugin.sdk.online.manager.AbstractC5804;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5843;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9079 extends AbstractC7969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f25451;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5805 f25452;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String f25453;

    public C9079(C5805 c5805) {
        c5805.getClass();
        this.f25452 = c5805;
        this.f25453 = "time";
        this.f25451 = "";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m14654(TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        for (TextView textView6 : AbstractC6347.m11931(textView, textView2, textView3, textView4)) {
            textView6.setTypeface(textView6.getTypeface(), textView6.equals(textView5) ? 1 : 0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m14655(TextView textView) {
        String str = this.f25453;
        switch (str.hashCode()) {
            case -938285885:
                if (str.equals("random")) {
                    textView.setText("排序：随机脚本");
                    break;
                }
                break;
            case 3560141:
                if (str.equals("time")) {
                    textView.setText("排序：按时间");
                }
                break;
            case 31392744:
                if (str.equals("download_desc")) {
                    textView.setText("排序：下载量由高到低");
                    break;
                }
                break;
            case 1109388858:
                if (str.equals("download_asc")) {
                    textView.setText("排序：下载量由低到高");
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14656(String str, CustomRecycleView customRecycleView, ProgressBar progressBar) {
        progressBar.setVisibility(0);
        C5805 c5805 = this.f25452;
        C9082 c9082 = new C9082(c5805);
        customRecycleView.setAdapter(c9082);
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m4734();
        }
        customRecycleView.m4731(new C8736(customRecycleView.getResources().getDimensionPixelSize(R.dimen.plugin_grid_spacing), 2));
        c5805.m11217(str, new C0756(c9082, progressBar, this, 10));
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC6253.m11750(viewGroup.getContext()).inflate(R.layout.item_online_pager, viewGroup, false);
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
        c8663.m14359(R.id.tv_page_title, "类别:".concat(str));
        CustomRecycleView customRecycleView = (CustomRecycleView) c8663.m14360(R.id.rv_plugin_list);
        ProgressBar progressBar = (ProgressBar) c8663.m14360(R.id.pb_loading);
        TextView textView = (TextView) c8663.m14360(R.id.tv_sort);
        ((EditText) c8663.m14360(R.id.et_search)).addTextChangedListener(new C8812(this, str, customRecycleView, progressBar, 1));
        m14655(textView);
        textView.setOnClickListener(new ViewOnClickListenerC5843(this, textView, str, customRecycleView, progressBar, 2));
        TextView textView2 = (TextView) c8663.m14360(R.id.btn_message);
        TextView textView3 = (TextView) c8663.m14360(R.id.tv_message_badge);
        int i2 = 2;
        textView2.setOnClickListener(new ViewOnClickListenerC9078(this, i2));
        C9080 c9080 = new C9080(textView3);
        LinkedHashSet linkedHashSet = AbstractC5804.f15914;
        synchronized (linkedHashSet) {
            linkedHashSet.add(c9080);
        }
        AbstractC5804.f15913.post(new RunnableC1107(c9080, 10));
        C9082 c9082 = new C9082(this.f25452);
        customRecycleView.setAdapter(c9082);
        customRecycleView.setLayoutManager(new StaggeredGridLayoutManager(1));
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m4734();
        }
        customRecycleView.m4731(new C8736(customRecycleView.getResources().getDimensionPixelSize(R.dimen.plugin_grid_spacing), i2));
        this.f25452.m11217(str, new C1011(c9082, c8663, str, progressBar, this, 2));
    }
}
