package p358;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import p233.AbstractC8798;
import p402.C9908;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9641 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f25146;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8798 f25147;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f25148;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f25149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25150;

    public /* synthetic */ C9641(AbstractC8798 abstractC8798, String str, RecyclerView recyclerView, ProgressBar progressBar, int i) {
        this.f25150 = i;
        this.f25147 = abstractC8798;
        this.f25148 = str;
        this.f25146 = recyclerView;
        this.f25149 = progressBar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f25150;
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f25150;
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f25150;
        ProgressBar progressBar = this.f25149;
        RecyclerView recyclerView = this.f25146;
        String str = this.f25148;
        AbstractC8798 abstractC8798 = this.f25147;
        charSequence.getClass();
        switch (i4) {
            case 0:
                C9640 c9640 = (C9640) abstractC8798;
                c9640.f25143 = charSequence.toString();
                c9640.m15043(str, (CustomRecycleView) recyclerView, progressBar);
                break;
            default:
                C9908 c9908 = (C9908) abstractC8798;
                c9908.f25796 = charSequence.toString();
                c9908.m15215(str, (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) recyclerView, progressBar);
                break;
        }
    }
}
