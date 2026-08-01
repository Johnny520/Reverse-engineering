package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867 implements InterfaceC0863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f2441 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C0869(this, 2));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2442;

    public C0867(View view) {
        this.f2442 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InputMethodManager m1684() {
        return (InputMethodManager) this.f2441.getValue();
    }
}
