package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.C2033;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import okhttp3.internal.http2.ErrorCode;
import p007.AbstractC6136;
import p022.C6281;
import p052.InterfaceC6542;
import p144.C7546;
import p217.AbstractC7968;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0916 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2604;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2605;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2606;

    public /* synthetic */ C0916(C6281 c6281, int i, ErrorCode errorCode) {
        this.f2606 = 1;
        this.f2605 = c6281;
        this.f2604 = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        ArrayList arrayList;
        switch (this.f2606) {
            case 0:
                C0920 c0920 = (C0920) this.f2605;
                return Integer.valueOf(((C2033) c0920.f2609).f5989.m3778(this.f2604));
            case 1:
                C6281 c6281 = (C6281) this.f2605;
                int i = this.f2604;
                c6281.f17326.getClass();
                synchronized (c6281) {
                    c6281.f17320.remove(Integer.valueOf(i));
                }
                return C5175.f14739;
            default:
                AbstractC7968 abstractC7968 = (AbstractC7968) this.f2605;
                int i2 = this.f2604;
                if (i2 < 0 || i2 >= abstractC7968.f22045.size()) {
                    C7546.m12743(AbstractC6136.m11559(i2, abstractC7968.f22045.size(), "position: ", ". size:"));
                    return null;
                }
                List list = abstractC7968.f22045;
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList(abstractC7968.f22045);
                    abstractC7968.f22045 = arrayList;
                }
                arrayList.remove(i2);
                abstractC7968.f7297.m4799(i2, 1);
                abstractC7968.f22045.getClass();
                return C5175.f14739;
        }
    }

    public /* synthetic */ C0916(Object obj, int i, int i2) {
        this.f2606 = i2;
        this.f2605 = obj;
        this.f2604 = i;
    }
}
