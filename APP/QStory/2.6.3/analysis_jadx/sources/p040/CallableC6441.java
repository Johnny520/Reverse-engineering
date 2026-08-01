package p040;

import java.util.concurrent.Callable;
import p010.AbstractC6185;
import p010.AbstractC6187;
import p287.AbstractC8405;
import p288.C8410;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC6441 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f17645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17646;

    public /* synthetic */ CallableC6441(Object obj, int i) {
        this.f17646 = i;
        this.f17645 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17646) {
            case 0:
                AbstractC6187.m11600(this.f17645);
                AbstractC6185.m11592(AbstractC8405.m13973("喵喵呜呜呜呜喵喵~喵喵呜呜呜呜呜喵"));
                return null;
            default:
                synchronized (((C8410) this.f17645)) {
                    try {
                        C8410 c8410 = (C8410) this.f17645;
                        if (c8410.f23297 != null) {
                            c8410.m13984();
                            if (((C8410) this.f17645).m13989()) {
                                ((C8410) this.f17645).m13983();
                                ((C8410) this.f17645).f23292 = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
        }
    }
}
