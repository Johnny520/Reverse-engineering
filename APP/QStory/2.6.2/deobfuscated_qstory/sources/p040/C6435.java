package p040;

import android.text.Editable;
import android.text.TextWatcher;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6435 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f17635;

    public C6435(String str) {
        this.f17635 = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!editable.toString().contains("\n") || editable.toString().equals("")) {
            return;
        }
        AbstractC3065.m6853(this.f17635, editable.toString().replace("\n", ""));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
