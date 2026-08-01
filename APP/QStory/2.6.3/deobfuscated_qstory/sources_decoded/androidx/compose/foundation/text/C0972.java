package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AbstractC0904;
import androidx.compose.foundation.text.selection.C0893;
import androidx.compose.foundation.text.selection.C0915;
import androidx.compose.foundation.text.selection.InterfaceC0918;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.ui.semantics.InterfaceC1944;
import kotlin.C5176;
import p052.InterfaceC6558;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0972 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2767;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2768;

    public /* synthetic */ C0972(Object obj, int i) {
        this.f2768 = i;
        this.f2767 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2768;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f2767;
        switch (i) {
            case 0:
                ((InterfaceC1944) obj).mo3590(AbstractC0904.f2558, new C0893(Handle.Cursor, ((InterfaceC0918) obj2).mo1822(), SelectionHandleAnchor.Middle, true));
                return c5176;
            case 1:
                ((InterfaceC1013) obj2).mo1747(((C7329) obj).f19541, C0915.f2600);
                return c5176;
            default:
                C0998 c0998 = (C0998) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float fM1919 = c0998.m1919() + fFloatValue;
                InterfaceC1397 interfaceC1397 = c0998.f2929;
                if (fM1919 > ((AbstractC1349) interfaceC1397).m2434()) {
                    fFloatValue = ((AbstractC1349) interfaceC1397).m2434() - c0998.m1919();
                } else if (fM1919 < 0.0f) {
                    fFloatValue = -c0998.m1919();
                }
                ((AbstractC1349) c0998.f2930).m2435(c0998.m1919() + fFloatValue);
                return Float.valueOf(fFloatValue);
        }
    }
}
