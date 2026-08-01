package p208n4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p013C0.C0236c;
import p117X2.AbstractC1665j;
import p191k4.C2475a;

/* JADX INFO: renamed from: n4.b */
/* JADX INFO: loaded from: classes.dex */
public class C2703b extends AbstractC2724w {

    /* JADX INFO: renamed from: h */
    public static final C0236c f8616h;

    /* JADX INFO: renamed from: i */
    public static C2703b f8617i;

    /* JADX INFO: renamed from: j */
    public static final ReentrantLock f8618j;

    /* JADX INFO: renamed from: k */
    public static final Condition f8619k;

    /* JADX INFO: renamed from: l */
    public static final long f8620l;

    /* JADX INFO: renamed from: m */
    public static final long f8621m;

    /* JADX INFO: renamed from: e */
    public int f8622e;

    /* JADX INFO: renamed from: f */
    public int f8623f = -1;

    /* JADX INFO: renamed from: g */
    public long f8624g;

    static {
        C0236c c0236c = new C0236c(5);
        c0236c.f794f = new C2703b[8];
        f8616h = c0236c;
        ReentrantLock reentrantLock = new ReentrantLock();
        f8618j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC1665j.m2984d(conditionNewCondition, "newCondition(...)");
        f8619k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f8620l = millis;
        f8621m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: h */
    public final void m4696h() {
        long j5 = this.f8668c;
        boolean z5 = this.f8666a;
        if (j5 != 0 || z5) {
            ReentrantLock reentrantLock = f8618j;
            reentrantLock.lock();
            try {
                if (this.f8622e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f8622e = 1;
                C2475a.m4413b(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4697i() {
        ReentrantLock reentrantLock = f8618j;
        reentrantLock.lock();
        try {
            int i5 = this.f8622e;
            this.f8622e = 0;
            if (i5 != 1) {
                return i5 == 2;
            }
            f8616h.m420i(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public IOException mo3767j(IOException iOException) {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public void mo3347k() {
    }
}
