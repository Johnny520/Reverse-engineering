package yyds;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: yyds.ᛲᛳᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0313 extends C2755 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C1760 f1629;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final long f1630;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static C0313 f1631;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final Condition f1632;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final long f1633;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final ReentrantLock f1634;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f1635;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public long f1636;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f1637 = -1;

    static {
        C1760 c1760 = new C1760((char) 0, 6);
        c1760.f8839 = new C0313[8];
        f1629 = c1760;
        ReentrantLock reentrantLock = new ReentrantLock();
        f1634 = reentrantLock;
        f1632 = reentrantLock.newCondition();
        f1633 = 60000L;
        f1630 = 60000000000L;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m977() {
        long j = this.f13478;
        boolean z = this.f13476;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f1634;
            reentrantLock.lock();
            try {
                if (this.f1635 != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f1635 = 1;
                AbstractC0427.m1194(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean m978() {
        ReentrantLock reentrantLock = f1634;
        reentrantLock.lock();
        try {
            int i = this.f1635;
            this.f1635 = 0;
            if (i != 1) {
                return i == 2;
            }
            f1629.m3500(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public void mo979() {
    }
}
