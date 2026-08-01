package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867 implements InterfaceC0863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f2442 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new C0869(this, 2));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2443;

    public C0867(View view) {
        this.f2443 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InputMethodManager m1694() {
        return (InputMethodManager) this.f2442.getValue();
    }
}
