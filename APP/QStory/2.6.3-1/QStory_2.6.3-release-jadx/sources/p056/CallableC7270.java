package p056;

import java.util.concurrent.Callable;
import p026.AbstractC7014;
import p026.AbstractC7016;
import p303.AbstractC9234;
import p304.C9239;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7270 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f17990;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17991;

    public /* synthetic */ CallableC7270(Object obj, int i) {
        this.f17991 = i;
        this.f17990 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17991) {
            case 0:
                AbstractC7016.m12159(this.f17990);
                AbstractC7014.m12151(AbstractC9234.m14532("喵喵呜呜呜呜喵喵~喵喵呜呜呜呜呜喵"));
                return null;
            default:
                synchronized (((C9239) this.f17990)) {
                    try {
                        C9239 c9239 = (C9239) this.f17990;
                        if (c9239.f23642 != null) {
                            c9239.m14543();
                            if (((C9239) this.f17990).m14548()) {
                                ((C9239) this.f17990).m14542();
                                ((C9239) this.f17990).f23637 = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
        }
    }
}
