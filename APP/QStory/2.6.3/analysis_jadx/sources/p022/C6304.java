package p022;

import android.text.Editable;
import android.text.TextWatcher;
import p287.AbstractC8405;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6304 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f17409;

    public C6304(String str) {
        this.f17409 = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!editable.toString().contains(AbstractC8405.m13973("喵呜呜呜呜喵喵呜")) || editable.toString().equals("")) {
            return;
        }
        C8667.m14362(this.f17409, editable.toString().replace(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"), ""));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
