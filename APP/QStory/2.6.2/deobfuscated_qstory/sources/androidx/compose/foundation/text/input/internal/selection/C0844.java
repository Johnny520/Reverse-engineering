package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2;
import p052.InterfaceC6557;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0844 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2376;

    public /* synthetic */ C0844(int i) {
        this.f2376 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f2376) {
            case 0:
                return TextFieldSelectionState$cursorHandleGestures$2.AnonymousClass3.invokeSuspend$lambda$0(null, (C7328) obj);
            default:
                return TextFieldSelectionState$selectionHandleGestures$2.invokeSuspend$lambda$0(null, (Throwable) obj);
        }
    }
}
