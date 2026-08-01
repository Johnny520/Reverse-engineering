package p342;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import p217.AbstractC7969;
import p386.C9079;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8812 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f24801;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7969 f24802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f24803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f24804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24805;

    public /* synthetic */ C8812(AbstractC7969 abstractC7969, String str, RecyclerView recyclerView, ProgressBar progressBar, int i) {
        this.f24805 = i;
        this.f24802 = abstractC7969;
        this.f24803 = str;
        this.f24801 = recyclerView;
        this.f24804 = progressBar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f24805;
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f24805;
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f24805;
        ProgressBar progressBar = this.f24804;
        RecyclerView recyclerView = this.f24801;
        String str = this.f24803;
        AbstractC7969 abstractC7969 = this.f24802;
        charSequence.getClass();
        switch (i4) {
            case 0:
                C8811 c8811 = (C8811) abstractC7969;
                c8811.f24798 = charSequence.toString();
                c8811.m14484(str, (CustomRecycleView) recyclerView, progressBar);
                break;
            default:
                C9079 c9079 = (C9079) abstractC7969;
                c9079.f25451 = charSequence.toString();
                c9079.m14656(str, (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) recyclerView, progressBar);
                break;
        }
    }
}
