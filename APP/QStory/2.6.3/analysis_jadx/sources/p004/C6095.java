package p004;

import androidx.appcompat.app.C0107;
import io.ktor.client.plugins.api.C3886;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C6095 extends C6090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long f16652;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0107 f16653;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Condition f16654;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long f16655;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C6095 f16656;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final ReentrantLock f16657;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f16658 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f16659;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f16660;

    static {
        C0107 c0107 = new C0107((byte) 0, 7);
        c0107.f315 = new C6095[8];
        f16653 = c0107;
        ReentrantLock reentrantLock = new ReentrantLock();
        f16657 = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        f16654 = conditionNewCondition;
        f16655 = 60000L;
        f16652 = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11494() {
        long j = this.f16644;
        boolean z = this.f16646;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f16657;
            reentrantLock.lock();
            try {
                if (this.f16659 != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f16659 = 1;
                C3886.m8265(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m11495() {
        ReentrantLock reentrantLock = f16657;
        reentrantLock.lock();
        try {
            int i = this.f16659;
            this.f16659 = 0;
            if (i != 1) {
                return i == 2;
            }
            f16653.m344(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public IOException mo10931(IOException iOException) {
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo10930() {
    }
}
