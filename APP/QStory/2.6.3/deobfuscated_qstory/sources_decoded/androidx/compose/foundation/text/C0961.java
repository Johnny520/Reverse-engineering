package androidx.compose.foundation.text;

import androidx.compose.foundation.lazy.layout.C0713;
import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1;
import androidx.compose.foundation.text.selection.C0882;
import p052.InterfaceC6558;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0961 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2739;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2740;

    public /* synthetic */ C0961(C0882 c0882, int i) {
        this.f2740 = i;
        this.f2739 = c0882;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2740;
        C0882 c0882 = this.f2739;
        switch (i) {
            case 0:
                return CoreTextFieldKt$TextFieldCursorHandle$2$1$1.AnonymousClass2.invokeSuspend$lambda$0(c0882, (C7329) obj);
            default:
                return new C0713(c0882, 3);
        }
    }
}
