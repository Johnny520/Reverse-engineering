package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3442<D> extends C5746<D> {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f5541 = "AsyncTaskLoader";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final boolean f5542 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Executor f5543;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public volatile AbstractC3442<D>.RunnableC0137 f5544;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public volatile AbstractC3442<D>.RunnableC0137 f5545;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public long f5546;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public long f5547;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Handler f5548;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢ۟$ۥ */
    public final class RunnableC0137 extends AbstractC6231<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final CountDownLatch f5549 = new CountDownLatch(1);

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public boolean f5550;

        public RunnableC0137() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5550 = false;
            AbstractC3442.this.m9065();
        }

        @Override // Yue.AbstractC6231
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void mo9072(D d) {
            try {
                AbstractC3442.this.m9063(this, d);
            } finally {
                this.f5549.countDown();
            }
        }

        @Override // Yue.AbstractC6231
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void mo9073(D d) {
            try {
                AbstractC3442.this.m9064(this, d);
            } finally {
                this.f5549.countDown();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.AbstractC6231
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public D mo513(Void... voidArr) {
            try {
                return (D) AbstractC3442.this.m9069();
            } catch (C6576 e) {
                if (m19255()) {
                    return null;
                }
                throw e;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void m9075() {
            try {
                this.f5549.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3442(@InterfaceC6391 Context context) {
        this(context, AbstractC6231.f15403);
    }

    @Override // Yue.C5746
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo9059(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo9059(str, fileDescriptor, printWriter, strArr);
        if (this.f5544 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f5544);
            printWriter.print(" waiting=");
            printWriter.println(this.f5544.f5550);
        }
        if (this.f5545 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f5545);
            printWriter.print(" waiting=");
            printWriter.println(this.f5545.f5550);
        }
        if (this.f5546 != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C7818.m24802(this.f5546, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C7818.m3915(this.f5547, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // Yue.C5746
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean mo9060() {
        if (this.f5544 == null) {
            return false;
        }
        if (!this.f14251) {
            this.f14254 = true;
        }
        if (this.f5545 != null) {
            if (this.f5544.f5550) {
                this.f5544.f5550 = false;
                this.f5548.removeCallbacks(this.f5544);
            }
            this.f5544 = null;
            return false;
        }
        if (this.f5544.f5550) {
            this.f5544.f5550 = false;
            this.f5548.removeCallbacks(this.f5544);
            this.f5544 = null;
            return false;
        }
        boolean zM2725 = this.f5544.m2725(false);
        if (zM2725) {
            this.f5545 = this.f5544;
            mo9062();
        }
        this.f5544 = null;
        return zM2725;
    }

    @Override // Yue.C5746
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo9061() {
        super.mo9061();
        m2422();
        this.f5544 = new RunnableC0137();
        m9065();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void mo9062() {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m9063(AbstractC3442<D>.RunnableC0137 runnableC0137, D d) {
        mo9068(d);
        if (this.f5545 == runnableC0137) {
            m17823();
            this.f5547 = SystemClock.uptimeMillis();
            this.f5545 = null;
            m17811();
            m9065();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m9064(AbstractC3442<D>.RunnableC0137 runnableC0137, D d) {
        if (this.f5544 != runnableC0137) {
            m9063(runnableC0137, d);
            return;
        }
        if (m17815()) {
            mo9068(d);
            return;
        }
        m17809();
        this.f5547 = SystemClock.uptimeMillis();
        this.f5544 = null;
        mo12295(d);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m9065() {
        if (this.f5545 != null || this.f5544 == null) {
            return;
        }
        if (this.f5544.f5550) {
            this.f5544.f5550 = false;
            this.f5548.removeCallbacks(this.f5544);
        }
        if (this.f5546 <= 0 || SystemClock.uptimeMillis() >= this.f5547 + this.f5546) {
            this.f5544.m19250(this.f5543, null);
        } else {
            this.f5544.f5550 = true;
            this.f5548.postAtTime(this.f5544, this.f5547 + this.f5546);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean m9066() {
        return this.f5545 != null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public abstract D mo9067();

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void mo9068(@InterfaceC6490 D d) {
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public D m9069() {
        return mo9067();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m9070(long j) {
        this.f5546 = j;
        if (j != 0) {
            this.f5548 = new Handler();
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m9071() {
        AbstractC3442<D>.RunnableC0137 runnableC0137 = this.f5544;
        if (runnableC0137 != null) {
            runnableC0137.m9075();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC3442(@InterfaceC6391 Context context, @InterfaceC6391 Executor executor) {
        super(context);
        this.f5547 = -10000L;
        this.f5543 = executor;
    }
}
