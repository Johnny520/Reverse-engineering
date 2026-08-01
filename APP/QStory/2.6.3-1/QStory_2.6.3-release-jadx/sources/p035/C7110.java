package p035;

import java.io.IOException;
import java.util.List;
import kotlin.C6008;
import okhttp3.internal.http2.ErrorCode;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7110 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ List f17684;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7106 f17685;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f17686;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17687 = 0;

    public /* synthetic */ C7110(C7106 c7106, int i, List list) {
        this.f17685 = c7106;
        this.f17686 = i;
        this.f17684 = list;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        switch (this.f17687) {
            case 0:
                C7106 c7106 = this.f17685;
                int i = this.f17686;
                c7106.f17653.getClass();
                try {
                    c7106.f17645.m12359(i, ErrorCode.CANCEL);
                    synchronized (c7106) {
                        c7106.f17647.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return C6008.f15084;
            default:
                C7106 c71062 = this.f17685;
                int i2 = this.f17686;
                c71062.f17653.getClass();
                try {
                    c71062.f17645.m12359(i2, ErrorCode.CANCEL);
                    synchronized (c71062) {
                        c71062.f17647.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return C6008.f15084;
        }
    }

    public /* synthetic */ C7110(C7106 c7106, int i, List list, boolean z) {
        this.f17685 = c7106;
        this.f17686 = i;
        this.f17684 = list;
    }
}
