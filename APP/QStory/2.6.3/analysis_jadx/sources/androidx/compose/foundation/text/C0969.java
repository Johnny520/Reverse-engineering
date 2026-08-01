package androidx.compose.foundation.text;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.selection.AbstractC0904;
import androidx.compose.foundation.text.selection.C0893;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.runtime.C1355;
import androidx.compose.ui.draw.C1435;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5176;
import kotlin.Result;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0969 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f2759;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2760;

    public /* synthetic */ C0969(long j, int i) {
        this.f2760 = i;
        this.f2759 = j;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        C5444 c5444;
        Object objM163;
        int i = this.f2760;
        C5176 c5176 = C5176.f14739;
        long j = this.f2759;
        switch (i) {
            case 0:
                C1435 c1435 = (C1435) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c1435.f4116.mo2574() >> 32)) / 2.0f;
                break;
            case 1:
                ((InterfaceC1944) obj).mo3590(AbstractC0904.f2558, new C0893(Handle.Cursor, this.f2759, SelectionHandleAnchor.Middle, true));
                break;
            default:
                C1355 c1355 = (C1355) obj;
                InterfaceC6558 interfaceC6558 = c1355.f3928;
                if (interfaceC6558 != null && (c5444 = c1355.f3929) != null) {
                    try {
                        objM163 = Result.m8745constructorimpl(interfaceC6558.invoke(Long.valueOf(j)));
                    } catch (Throwable th) {
                        objM163 = AbstractC0053.m163(th);
                    }
                    c5444.resumeWith(objM163);
                }
                break;
        }
        return c5176;
    }
}
