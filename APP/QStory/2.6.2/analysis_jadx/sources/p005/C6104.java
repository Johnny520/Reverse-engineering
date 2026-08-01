package p005;

import androidx.appcompat.app.C0107;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C6104 extends C6099 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long f16662;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0107 f16663;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Condition f16664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long f16665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C6104 f16666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final ReentrantLock f16667;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f16668 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f16669;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f16670;

    static {
        C0107 c0107 = new C0107((byte) 0, 7);
        c0107.f315 = new C6104[8];
        f16663 = c0107;
        ReentrantLock reentrantLock = new ReentrantLock();
        f16667 = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        f16664 = conditionNewCondition;
        f16665 = 60000L;
        f16662 = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11501() {
        long j = this.f16654;
        boolean z = this.f16656;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f16667;
            reentrantLock.lock();
            try {
                if (this.f16669 != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f16669 = 1;
                C8631.m14289(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m11502() {
        ReentrantLock reentrantLock = f16667;
        reentrantLock.lock();
        try {
            int i = this.f16669;
            this.f16669 = 0;
            if (i != 1) {
                return i == 2;
            }
            f16663.m343(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public IOException mo10874(IOException iOException) {
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo10873() {
    }
}
