package p019;

import java.io.IOException;
import java.util.List;
import kotlin.C5176;
import okhttp3.internal.http2.ErrorCode;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6281 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ List f17339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6277 f17340;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f17341;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17342 = 0;

    public /* synthetic */ C6281(C6277 c6277, int i, List list) {
        this.f17340 = c6277;
        this.f17341 = i;
        this.f17339 = list;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f17342) {
            case 0:
                C6277 c6277 = this.f17340;
                int i = this.f17341;
                c6277.f17308.getClass();
                try {
                    c6277.f17300.m11800(i, ErrorCode.CANCEL);
                    synchronized (c6277) {
                        c6277.f17302.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return C5176.f14739;
            default:
                C6277 c62772 = this.f17340;
                int i2 = this.f17341;
                c62772.f17308.getClass();
                try {
                    c62772.f17300.m11800(i2, ErrorCode.CANCEL);
                    synchronized (c62772) {
                        c62772.f17302.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return C5176.f14739;
        }
    }

    public /* synthetic */ C6281(C6277 c6277, int i, List list, boolean z) {
        this.f17340 = c6277;
        this.f17341 = i;
        this.f17339 = list;
    }
}
