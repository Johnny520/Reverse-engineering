package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AbstractC0904;
import androidx.compose.foundation.text.selection.C0893;
import androidx.compose.foundation.text.selection.C0915;
import androidx.compose.foundation.text.selection.InterfaceC0918;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5175;
import p052.InterfaceC6557;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0972 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2766;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2767;

    public /* synthetic */ C0972(Object obj, int i) {
        this.f2767 = i;
        this.f2766 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2767;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f2766;
        switch (i) {
            case 0:
                ((InterfaceC1944) obj).mo3580(AbstractC0904.f2557, new C0893(Handle.Cursor, ((InterfaceC0918) obj2).mo1812(), SelectionHandleAnchor.Middle, true));
                return c5175;
            case 1:
                ((InterfaceC1013) obj2).mo1737(((C7328) obj).f19546, C0915.f2599);
                return c5175;
            default:
                C0998 c0998 = (C0998) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float fM1909 = c0998.m1909() + fFloatValue;
                InterfaceC1397 interfaceC1397 = c0998.f2928;
                if (fM1909 > ((AbstractC1349) interfaceC1397).m2424()) {
                    fFloatValue = ((AbstractC1349) interfaceC1397).m2424() - c0998.m1909();
                } else if (fM1909 < 0.0f) {
                    fFloatValue = -c0998.m1909();
                }
                ((AbstractC1349) c0998.f2929).m2425(c0998.m1909() + fFloatValue);
                return Float.valueOf(fFloatValue);
        }
    }
}
