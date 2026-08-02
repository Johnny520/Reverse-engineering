package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: wg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0846wg extends o23 {

    /* JADX INFO: renamed from: h */
    public static final C0133dk f12495h;

    /* JADX INFO: renamed from: i */
    public static C0846wg f12496i;

    /* JADX INFO: renamed from: j */
    public static final ReentrantLock f12497j;

    /* JADX INFO: renamed from: k */
    public static final Condition f12498k;

    /* JADX INFO: renamed from: l */
    public static final long f12499l;

    /* JADX INFO: renamed from: m */
    public static final long f12500m;

    /* JADX INFO: renamed from: e */
    public int f12501e;

    /* JADX INFO: renamed from: f */
    public int f12502f = -1;

    /* JADX INFO: renamed from: g */
    public long f12503g;

    static {
        C0133dk c0133dk = new C0133dk((byte) 0, 11);
        c0133dk.f2082j = new C0846wg[8];
        f12495h = c0133dk;
        ReentrantLock reentrantLock = new ReentrantLock();
        f12497j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        f12498k = conditionNewCondition;
        f12499l = AIChatConfig.MaxReplyDelayMs;
        f12500m = TimeUnit.MILLISECONDS.toNanos(AIChatConfig.MaxReplyDelayMs);
    }

    /* JADX INFO: renamed from: h */
    public final void m5886h() {
        long j = this.f7458c;
        boolean z = this.f7456a;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f12497j;
            reentrantLock.lock();
            try {
                if (this.f12501e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f12501e = 1;
                C0160eb.m1317r(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5887i() {
        ReentrantLock reentrantLock = f12497j;
        reentrantLock.lock();
        try {
            int i = this.f12501e;
            this.f12501e = 0;
            if (i != 1) {
                return i == 2;
            }
            f12495h.m1044v(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public IOException mo276j(IOException iOException) {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public void mo277k() {
    }
}
