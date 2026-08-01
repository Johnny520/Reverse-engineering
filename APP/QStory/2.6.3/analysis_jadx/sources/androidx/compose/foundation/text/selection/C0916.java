package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.C2033;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5176;
import okhttp3.internal.http2.ErrorCode;
import p009.AbstractC6183;
import p019.C6277;
import p052.InterfaceC6543;
import p144.C7547;
import p217.AbstractC7969;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0916 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2605;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2607;

    public /* synthetic */ C0916(C6277 c6277, int i, ErrorCode errorCode) {
        this.f2607 = 1;
        this.f2606 = c6277;
        this.f2605 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        ArrayList arrayList;
        switch (this.f2607) {
            case 0:
                C0920 c0920 = (C0920) this.f2606;
                return Integer.valueOf(((C2033) c0920.f2610).f5990.m3788(this.f2605));
            case 1:
                C6277 c6277 = (C6277) this.f2606;
                int i = this.f2605;
                c6277.f17308.getClass();
                synchronized (c6277) {
                    c6277.f17302.remove(Integer.valueOf(i));
                }
                return C5176.f14739;
            default:
                AbstractC7969 abstractC7969 = (AbstractC7969) this.f2606;
                int i2 = this.f2605;
                if (i2 < 0 || i2 >= abstractC7969.f22042.size()) {
                    C7547.m12772(AbstractC6183.m11591(i2, abstractC7969.f22042.size(), "position: ", ". size:"));
                    return null;
                }
                List list = abstractC7969.f22042;
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList(abstractC7969.f22042);
                    abstractC7969.f22042 = arrayList;
                }
                arrayList.remove(i2);
                abstractC7969.f7298.m4809(i2, 1);
                abstractC7969.f22042.getClass();
                return C5176.f14739;
        }
    }

    public /* synthetic */ C0916(Object obj, int i, int i2) {
        this.f2607 = i2;
        this.f2606 = obj;
        this.f2605 = i;
    }
}
