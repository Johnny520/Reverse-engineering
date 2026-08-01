package p020;

import androidx.appcompat.app.C0954;
import io.ktor.client.plugins.api.C4718;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C6924 extends C6919 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final long f16997;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0954 f16998;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Condition f16999;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long f17000;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C6924 f17001;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final ReentrantLock f17002;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f17003 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f17004;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f17005;

    static {
        C0954 c0954 = new C0954((byte) 0, 7);
        c0954.f660 = new C6924[8];
        f16998 = c0954;
        ReentrantLock reentrantLock = new ReentrantLock();
        f17002 = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        f16999 = conditionNewCondition;
        f17000 = 60000L;
        f16997 = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12053() {
        long j = this.f16989;
        boolean z = this.f16991;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f17002;
            reentrantLock.lock();
            try {
                if (this.f17004 != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f17004 = 1;
                C4718.m8824(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m12054() {
        ReentrantLock reentrantLock = f17002;
        reentrantLock.lock();
        try {
            int i = this.f17004;
            this.f17004 = 0;
            if (i != 1) {
                return i == 2;
            }
            f16998.m904(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public IOException mo11490(IOException iOException) {
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo11489() {
    }
}
