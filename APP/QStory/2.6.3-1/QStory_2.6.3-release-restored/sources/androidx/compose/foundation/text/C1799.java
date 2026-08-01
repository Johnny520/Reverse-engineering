package androidx.compose.foundation.text;

import androidx.compose.foundation.lazy.layout.C1554;
import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1;
import androidx.compose.foundation.text.selection.C1720;
import p068.InterfaceC7387;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1799 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1720 f3084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3085;

    public /* synthetic */ C1799(C1720 c1720, int i) {
        this.f3085 = i;
        this.f3084 = c1720;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f3085;
        C1720 c1720 = this.f3084;
        switch (i) {
            case 0:
                return CoreTextFieldKt$TextFieldCursorHandle$2$1$1.C00862.invokeSuspend$lambda$0(c1720, (C8158) obj);
            default:
                return new C1554(c1720, 3);
        }
    }
}
