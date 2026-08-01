package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2;
import p052.InterfaceC6558;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0844 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2377;

    public /* synthetic */ C0844(int i) {
        this.f2377 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f2377) {
            case 0:
                return TextFieldSelectionState$cursorHandleGestures$2.AnonymousClass3.invokeSuspend$lambda$0(null, (C7329) obj);
            default:
                return TextFieldSelectionState$selectionHandleGestures$2.invokeSuspend$lambda$0(null, (Throwable) obj);
        }
    }
}
