package p385;

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
import p053.AbstractC6560;
import p217.AbstractC7968;
import p253.AbstractC8189;
import p315.C8671;
import p323.C8733;
import p343.C8826;
import p386.C9094;
import top.suzhelan.plugin.sdk.online.manager.AbstractC5803;
import top.suzhelan.plugin.sdk.online.presenter.C5804;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5830;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9092 extends AbstractC7968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f25401;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5804 f25402;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String f25403;

    public C9092(C5804 c5804) {
        c5804.getClass();
        this.f25402 = c5804;
        this.f25403 = "time";
        this.f25401 = "";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m14597(TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        for (TextView textView6 : AbstractC8189.m13659(textView, textView2, textView3, textView4)) {
            textView6.setTypeface(textView6.getTypeface(), textView6.equals(textView5) ? 1 : 0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m14598(TextView textView) {
        String str = this.f25403;
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
    public final void m14599(String str, CustomRecycleView customRecycleView, ProgressBar progressBar) {
        progressBar.setVisibility(0);
        C5804 c5804 = this.f25402;
        C9094 c9094 = new C9094(c5804);
        customRecycleView.setAdapter(c9094);
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m4724();
        }
        customRecycleView.m4721(new C8733(customRecycleView.getResources().getDimensionPixelSize(R.dimen.plugin_grid_spacing), 1));
        c5804.m11160(str, new C0756(c9094, progressBar, this, 10));
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        View viewInflate = AbstractC6560.m12028(viewGroup.getContext()).inflate(R.layout.item_online_pager, viewGroup, false);
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
        c8671.m14341(R.id.tv_page_title, "类别:".concat(str));
        CustomRecycleView customRecycleView = (CustomRecycleView) c8671.m14342(R.id.rv_plugin_list);
        ProgressBar progressBar = (ProgressBar) c8671.m14342(R.id.pb_loading);
        TextView textView = (TextView) c8671.m14342(R.id.tv_sort);
        ((EditText) c8671.m14342(R.id.et_search)).addTextChangedListener(new C8826(this, str, customRecycleView, progressBar, 1));
        m14598(textView);
        textView.setOnClickListener(new ViewOnClickListenerC5830(this, textView, str, customRecycleView, progressBar, 2));
        TextView textView2 = (TextView) c8671.m14342(R.id.btn_message);
        TextView textView3 = (TextView) c8671.m14342(R.id.tv_message_badge);
        textView2.setOnClickListener(new ViewOnClickListenerC9091(this, 2));
        C9093 c9093 = new C9093(textView3);
        LinkedHashSet linkedHashSet = AbstractC5803.f15914;
        synchronized (linkedHashSet) {
            linkedHashSet.add(c9093);
        }
        AbstractC5803.f15913.post(new RunnableC1107(c9093, 10));
        C9094 c9094 = new C9094(this.f25402);
        customRecycleView.setAdapter(c9094);
        int i2 = 1;
        customRecycleView.setLayoutManager(new StaggeredGridLayoutManager(1));
        while (customRecycleView.getItemDecorationCount() > 0) {
            customRecycleView.m4724();
        }
        customRecycleView.m4721(new C8733(customRecycleView.getResources().getDimensionPixelSize(R.dimen.plugin_grid_spacing), i2));
        this.f25402.m11160(str, new C1011(c9094, c8671, str, progressBar, this, 2));
    }
}
