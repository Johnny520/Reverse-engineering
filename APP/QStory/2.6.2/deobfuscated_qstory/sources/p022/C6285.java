package p022;

import java.io.IOException;
import java.util.List;
import kotlin.C5175;
import okhttp3.internal.http2.ErrorCode;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6285 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ List f17357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6281 f17358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f17359;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17360 = 0;

    public /* synthetic */ C6285(C6281 c6281, int i, List list) {
        this.f17358 = c6281;
        this.f17359 = i;
        this.f17357 = list;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        switch (this.f17360) {
            case 0:
                C6281 c6281 = this.f17358;
                int i = this.f17359;
                c6281.f17326.getClass();
                try {
                    c6281.f17318.m11783(i, ErrorCode.CANCEL);
                    synchronized (c6281) {
                        c6281.f17320.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return C5175.f14739;
            default:
                C6281 c62812 = this.f17358;
                int i2 = this.f17359;
                c62812.f17326.getClass();
                try {
                    c62812.f17318.m11783(i2, ErrorCode.CANCEL);
                    synchronized (c62812) {
                        c62812.f17320.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return C5175.f14739;
        }
    }

    public /* synthetic */ C6285(C6281 c6281, int i, List list, boolean z) {
        this.f17358 = c6281;
        this.f17359 = i;
        this.f17357 = list;
    }
}
