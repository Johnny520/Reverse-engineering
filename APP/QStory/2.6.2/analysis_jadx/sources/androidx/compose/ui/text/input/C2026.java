package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C2242;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2026 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2242 f5974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f5975 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new InterfaceC6542() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // p052.InterfaceC6542
        public final InputMethodManager invoke() {
            Object systemService = this.this$0.f5976.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f5976;

    public C2026(View view) {
        this.f5976 = view;
        this.f5974 = new C2242(view);
    }
}
