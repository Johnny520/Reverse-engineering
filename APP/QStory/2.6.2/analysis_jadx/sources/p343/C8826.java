package p343;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import p217.AbstractC7968;
import p385.C9092;
import top.suzhelan.sticker.sdk.widget.CustomRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲世楪子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8826 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f24820;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7968 f24821;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f24822;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f24823;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24824;

    public /* synthetic */ C8826(AbstractC7968 abstractC7968, String str, RecyclerView recyclerView, ProgressBar progressBar, int i) {
        this.f24824 = i;
        this.f24821 = abstractC7968;
        this.f24822 = str;
        this.f24820 = recyclerView;
        this.f24823 = progressBar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f24824;
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f24824;
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f24824;
        ProgressBar progressBar = this.f24823;
        RecyclerView recyclerView = this.f24820;
        String str = this.f24822;
        AbstractC7968 abstractC7968 = this.f24821;
        charSequence.getClass();
        switch (i4) {
            case 0:
                C8825 c8825 = (C8825) abstractC7968;
                c8825.f24817 = charSequence.toString();
                c8825.m14473(str, (CustomRecycleView) recyclerView, progressBar);
                break;
            default:
                C9092 c9092 = (C9092) abstractC7968;
                c9092.f25401 = charSequence.toString();
                c9092.m14599(str, (top.suzhelan.plugin.sdk.online.widget.CustomRecycleView) recyclerView, progressBar);
                break;
        }
    }
}
