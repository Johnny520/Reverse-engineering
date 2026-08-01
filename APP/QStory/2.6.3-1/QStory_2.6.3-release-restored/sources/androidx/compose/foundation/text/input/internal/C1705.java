package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1705 implements InterfaceC1701 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f2787 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C1707(this, 2));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f2788;

    public C1705(View view) {
        this.f2788 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InputMethodManager m2254() {
        return (InputMethodManager) this.f2787.getValue();
    }
}
