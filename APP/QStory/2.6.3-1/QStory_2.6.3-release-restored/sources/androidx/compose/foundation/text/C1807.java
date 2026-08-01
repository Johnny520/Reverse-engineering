package androidx.compose.foundation.text;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.selection.AbstractC1742;
import androidx.compose.foundation.text.selection.C1731;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.p001ui.draw.C2270;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.runtime.C2190;
import kotlin.C6008;
import kotlin.Result;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1807 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f3104;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3105;

    public /* synthetic */ C1807(long j, int i) {
        this.f3105 = i;
        this.f3104 = j;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        C6276 c6276;
        Object objM723;
        int i = this.f3105;
        C6008 c6008 = C6008.f15084;
        long j = this.f3104;
        switch (i) {
            case 0:
                C2270 c2270 = (C2270) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c2270.f4461.mo3134() >> 32)) / 2.0f;
                break;
            case 1:
                ((InterfaceC2779) obj).mo4150(AbstractC1742.f2903, new C1731(Handle.Cursor, this.f3104, SelectionHandleAnchor.Middle, true));
                break;
            default:
                C2190 c2190 = (C2190) obj;
                InterfaceC7387 interfaceC7387 = c2190.f4273;
                if (interfaceC7387 != null && (c6276 = c2190.f4274) != null) {
                    try {
                        objM723 = Result.m9304constructorimpl(interfaceC7387.invoke(Long.valueOf(j)));
                    } catch (Throwable th) {
                        objM723 = AbstractC0900.m723(th);
                    }
                    c6276.resumeWith(objM723);
                }
                break;
        }
        return c6008;
    }
}
