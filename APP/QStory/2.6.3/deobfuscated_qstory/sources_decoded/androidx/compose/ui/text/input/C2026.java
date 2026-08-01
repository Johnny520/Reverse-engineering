package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C2242;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2026 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2242 f5975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f5976 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new InterfaceC6543() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // p052.InterfaceC6543
        public final InputMethodManager invoke() {
            Object systemService = this.this$0.f5977.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f5977;

    public C2026(View view) {
        this.f5977 = view;
        this.f5975 = new C2242(view);
    }
}
