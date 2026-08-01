package p038;

import android.text.Editable;
import android.text.TextWatcher;
import p303.AbstractC9234;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7133 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ String f17754;

    public C7133(String str) {
        this.f17754 = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!editable.toString().contains(AbstractC9234.m14532("喵呜呜呜呜喵喵呜")) || editable.toString().equals("")) {
            return;
        }
        C9496.m14921(this.f17754, editable.toString().replace(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"), ""));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
