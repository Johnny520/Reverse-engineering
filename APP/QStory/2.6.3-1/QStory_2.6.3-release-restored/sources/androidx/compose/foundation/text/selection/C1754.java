package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.text.C2867;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import okhttp3.internal.http2.ErrorCode;
import p025.AbstractC7012;
import p035.C7106;
import p068.InterfaceC7372;
import p160.C8376;
import p233.AbstractC8798;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1754 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f2950;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2951;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2952;

    public /* synthetic */ C1754(C7106 c7106, int i, ErrorCode errorCode) {
        this.f2952 = 1;
        this.f2951 = c7106;
        this.f2950 = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        ArrayList arrayList;
        switch (this.f2952) {
            case 0:
                C1758 c1758 = (C1758) this.f2951;
                return Integer.valueOf(((C2867) c1758.f2955).f6335.m4348(this.f2950));
            case 1:
                C7106 c7106 = (C7106) this.f2951;
                int i = this.f2950;
                c7106.f17653.getClass();
                synchronized (c7106) {
                    c7106.f17647.remove(Integer.valueOf(i));
                }
                return C6008.f15084;
            default:
                AbstractC8798 abstractC8798 = (AbstractC8798) this.f2951;
                int i2 = this.f2950;
                if (i2 < 0 || i2 >= abstractC8798.f22387.size()) {
                    C8376.m13331(AbstractC7012.m12150(i2, abstractC8798.f22387.size(), "position: ", ". size:"));
                    return null;
                }
                List list = abstractC8798.f22387;
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList(abstractC8798.f22387);
                    abstractC8798.f22387 = arrayList;
                }
                arrayList.remove(i2);
                abstractC8798.f7643.m5369(i2, 1);
                abstractC8798.f22387.getClass();
                return C6008.f15084;
        }
    }

    public /* synthetic */ C1754(Object obj, int i, int i2) {
        this.f2952 = i2;
        this.f2951 = obj;
        this.f2950 = i;
    }
}
