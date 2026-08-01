package androidx.compose.foundation.text;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.selection.AbstractC0904;
import androidx.compose.foundation.text.selection.C0893;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.runtime.C1355;
import androidx.compose.ui.draw.C1435;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5175;
import kotlin.Result;
import kotlinx.coroutines.C5443;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0969 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f2758;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2759;

    public /* synthetic */ C0969(long j, int i) {
        this.f2759 = i;
        this.f2758 = j;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        C5443 c5443;
        Object objM162;
        int i = this.f2759;
        C5175 c5175 = C5175.f14739;
        long j = this.f2758;
        switch (i) {
            case 0:
                C1435 c1435 = (C1435) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c1435.f4115.mo2564() >> 32)) / 2.0f;
                break;
            case 1:
                ((InterfaceC1944) obj).mo3580(AbstractC0904.f2557, new C0893(Handle.Cursor, this.f2758, SelectionHandleAnchor.Middle, true));
                break;
            default:
                C1355 c1355 = (C1355) obj;
                InterfaceC6557 interfaceC6557 = c1355.f3927;
                if (interfaceC6557 != null && (c5443 = c1355.f3928) != null) {
                    try {
                        objM162 = Result.m8755constructorimpl(interfaceC6557.invoke(Long.valueOf(j)));
                    } catch (Throwable th) {
                        objM162 = AbstractC0053.m162(th);
                    }
                    c5443.resumeWith(objM162);
                }
                break;
        }
        return c5175;
    }
}
