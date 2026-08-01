package p043;

import com.bumptech.glide.AbstractC3056;
import java.util.concurrent.Callable;
import p010.AbstractC6154;
import p010.AbstractC6156;
import p288.C8418;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC6451 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f17693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17694;

    public /* synthetic */ CallableC6451(Object obj, int i) {
        this.f17694 = i;
        this.f17693 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17694) {
            case 0:
                AbstractC6156.m11569(this.f17693);
                AbstractC6154.m11561("OK");
                return null;
            default:
                synchronized (((C8418) this.f17693)) {
                    try {
                        C8418 c8418 = (C8418) this.f17693;
                        if (c8418.f23306 != null) {
                            c8418.m13965();
                            if (((C8418) this.f17693).m13970()) {
                                ((C8418) this.f17693).m13966();
                                ((C8418) this.f17693).f23301 = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
        }
    }
}
