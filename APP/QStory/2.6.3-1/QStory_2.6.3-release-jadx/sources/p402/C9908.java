package p402;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.text.C1849;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.LinkedHashSet;
import p034.AbstractC7082;
import p050.AbstractC7176;
import p233.AbstractC8798;
import p331.C9492;
import p340.C9565;
import p358.C9641;
import p404.C9911;
import top.suzhelan.plugin.sdk.online.manager.AbstractC6634;
import top.suzhelan.plugin.sdk.online.presenter.C6635;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC6673;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9908 extends AbstractC8798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f25796;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C6635 f25797;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String f25798;

    public C9908(C6635 c6635) {
        c6635.getClass();
        this.f25797 = c6635;
        this.f25798 = "time";
        this.f25796 = "";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m15213(TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        for (TextView textView6 : AbstractC7176.m12490(textView, textView2, textView3, textView4)) {
            textView6.setTypeface(textView6.getTypeface(), textView6.equals(textView5) ? 1 : 0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m15214(TextView textView) {
        String str = this.f25798;
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
    public final void m15215(String str, CustomRecycleView customRecycleView, ProgressBar progressBar) {
        progressBar.setVisibility(0);
        C6635 c6635 = this.f25797;
        C9911 c9911 = new C9911(c6635);
        customRecycleView.setAdapter(c9911);
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m5294();
        }
        customRecycleView.m5291(new C9565(customRecycleView.getResources().getDimensionPixelSize(C0328R.dimen.plugin_grid_spacing), 2));
        c6635.m11776(str, new C1597(c9911, progressBar, this, 10));
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC7082.m12309(viewGroup.getContext()).inflate(C0328R.layout.item_online_pager, viewGroup, false);
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
        c9492.m14918(C0328R.id.tv_page_title, "类别:".concat(str));
        CustomRecycleView customRecycleView = (CustomRecycleView) c9492.m14919(C0328R.id.rv_plugin_list);
        ProgressBar progressBar = (ProgressBar) c9492.m14919(C0328R.id.pb_loading);
        TextView textView = (TextView) c9492.m14919(C0328R.id.tv_sort);
        ((EditText) c9492.m14919(C0328R.id.et_search)).addTextChangedListener(new C9641(this, str, customRecycleView, progressBar, 1));
        m15214(textView);
        textView.setOnClickListener(new ViewOnClickListenerC6673(this, textView, str, customRecycleView, progressBar, 2));
        TextView textView2 = (TextView) c9492.m14919(C0328R.id.btn_message);
        TextView textView3 = (TextView) c9492.m14919(C0328R.id.tv_message_badge);
        int i2 = 2;
        textView2.setOnClickListener(new ViewOnClickListenerC9907(this, i2));
        C9909 c9909 = new C9909(textView3);
        LinkedHashSet linkedHashSet = AbstractC6634.f16259;
        synchronized (linkedHashSet) {
            linkedHashSet.add(c9909);
        }
        AbstractC6634.f16258.post(new RunnableC1945(c9909, 10));
        C9911 c9911 = new C9911(this.f25797);
        customRecycleView.setAdapter(c9911);
        customRecycleView.setLayoutManager(new StaggeredGridLayoutManager(1));
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m5294();
        }
        customRecycleView.m5291(new C9565(customRecycleView.getResources().getDimensionPixelSize(C0328R.dimen.plugin_grid_spacing), i2));
        this.f25797.m11776(str, new C1849(c9911, c9492, str, progressBar, this, 2));
    }
}
