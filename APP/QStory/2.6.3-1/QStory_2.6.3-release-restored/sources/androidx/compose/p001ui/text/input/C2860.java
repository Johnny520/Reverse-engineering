package androidx.compose.p001ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C3075;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2860 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3075 f6320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f6321 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new InterfaceC7372() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // p068.InterfaceC7372
        public final InputMethodManager invoke() {
            Object systemService = this.this$0.f6322.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f6322;

    public C2860(View view) {
        this.f6322 = view;
        this.f6320 = new C3075(view);
    }
}
