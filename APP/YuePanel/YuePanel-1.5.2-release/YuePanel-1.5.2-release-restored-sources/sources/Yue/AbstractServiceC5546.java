package Yue;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractServiceC5546 extends Service {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String f13511 = "JobIntentService";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final boolean f13512 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final Object f13513 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final HashMap<ComponentName, AbstractC5552> f13514 = new HashMap<>();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC0793 f13515;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public AbstractC5552 f13516;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public AsyncTaskC0792 f13517;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f13518 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f13519 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f13520 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final ArrayList<C5548> f13521 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ */
    public final class AsyncTaskC0792 extends AsyncTask<Void, Void, Void> {
        public AsyncTaskC0792() {
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC5549 interfaceC5549M2278 = AbstractServiceC5546.this.m2278();
                if (interfaceC5549M2278 == null) {
                    return null;
                }
                AbstractServiceC5546.this.m17180(interfaceC5549M2278.getIntent());
                interfaceC5549M2278.complete();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCancelled(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            AbstractServiceC5546.this.m17182();
        }

        /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            AbstractServiceC5546.this.m17182();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟ */
    public interface InterfaceC0793 {
        /* JADX INFO: renamed from: ۥ */
        IBinder mo2282();

        /* JADX INFO: renamed from: ۥ۟ */
        InterfaceC5549 mo2283();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5547 extends AbstractC5552 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Context f13522;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final PowerManager.WakeLock f13523;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final PowerManager.WakeLock f13524;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f13525;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f13526;

        public C5547(Context context, ComponentName componentName) {
            super(componentName);
            this.f13522 = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f13523 = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f13524 = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // Yue.AbstractServiceC5546.AbstractC5552
        /* JADX INFO: renamed from: ۥ */
        public void mo2284(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f1562);
            if (this.f13522.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f13525) {
                            this.f13525 = true;
                            if (!this.f13526) {
                                this.f13523.acquire(C7033.f21235);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // Yue.AbstractServiceC5546.AbstractC5552
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo17185() {
            synchronized (this) {
                try {
                    if (this.f13526) {
                        if (this.f13525) {
                            this.f13523.acquire(C7033.f21235);
                        }
                        this.f13526 = false;
                        this.f13524.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Yue.AbstractServiceC5546.AbstractC5552
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo17186() {
            synchronized (this) {
                try {
                    if (!this.f13526) {
                        this.f13526 = true;
                        this.f13524.acquire(600000L);
                        this.f13523.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Yue.AbstractServiceC5546.AbstractC5552
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo17187() {
            synchronized (this) {
                this.f13525 = false;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C5548 implements InterfaceC5549 {

        /* JADX INFO: renamed from: ۥ */
        public final Intent f1556;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1557;

        public C5548(Intent intent, int i) {
            this.f1556 = intent;
            this.f1557 = i;
        }

        @Override // Yue.AbstractServiceC5546.InterfaceC5549
        public void complete() {
            AbstractServiceC5546.this.stopSelf(this.f1557);
        }

        @Override // Yue.AbstractServiceC5546.InterfaceC5549
        public Intent getIntent() {
            return this.f1556;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC5549 {
        void complete();

        Intent getIntent();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static final class JobServiceEngineC5550 extends JobServiceEngine implements InterfaceC0793 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final String f13528 = "JobServiceEngineImpl";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final boolean f13529 = false;

        /* JADX INFO: renamed from: ۥ */
        public final AbstractServiceC5546 f1558;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Object f1559;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public JobParameters f13530;

        /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟۠$ۥ */
        public final class C0794 implements InterfaceC5549 {

            /* JADX INFO: renamed from: ۥ */
            public final JobWorkItem f1560;

            public C0794(JobWorkItem jobWorkItem) {
                this.f1560 = jobWorkItem;
            }

            @Override // Yue.AbstractServiceC5546.InterfaceC5549
            public void complete() {
                synchronized (JobServiceEngineC5550.this.f1559) {
                    try {
                        JobParameters jobParameters = JobServiceEngineC5550.this.f13530;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f1560);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // Yue.AbstractServiceC5546.InterfaceC5549
            public Intent getIntent() {
                return this.f1560.getIntent();
            }
        }

        public JobServiceEngineC5550(AbstractServiceC5546 abstractServiceC5546) {
            super(abstractServiceC5546);
            this.f1559 = new Object();
            this.f1558 = abstractServiceC5546;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f13530 = jobParameters;
            this.f1558.m17178(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zM2279 = this.f1558.m2279();
            synchronized (this.f1559) {
                this.f13530 = null;
            }
            return zM2279;
        }

        @Override // Yue.AbstractServiceC5546.InterfaceC0793
        /* JADX INFO: renamed from: ۥ */
        public IBinder mo2282() {
            return getBinder();
        }

        @Override // Yue.AbstractServiceC5546.InterfaceC0793
        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC5549 mo2283() {
            synchronized (this.f1559) {
                try {
                    JobParameters jobParameters = this.f13530;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f1558.getClassLoader());
                    return new C0794(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static final class C5551 extends AbstractC5552 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final JobInfo f13531;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final JobScheduler f13532;

        public C5551(Context context, ComponentName componentName, int i) {
            super(componentName);
            m2285(i);
            this.f13531 = new JobInfo.Builder(i, this.f1562).setOverrideDeadline(0L).build();
            this.f13532 = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // Yue.AbstractServiceC5546.AbstractC5552
        /* JADX INFO: renamed from: ۥ */
        public void mo2284(Intent intent) {
            this.f13532.enqueue(this.f13531, new JobWorkItem(intent));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۥ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static abstract class AbstractC5552 {

        /* JADX INFO: renamed from: ۥ */
        public final ComponentName f1562;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f1563;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f13533;

        public AbstractC5552(ComponentName componentName) {
            this.f1562 = componentName;
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo2284(Intent intent);

        /* JADX INFO: renamed from: ۥ۟ */
        public void m2285(int i) {
            if (!this.f1563) {
                this.f1563 = true;
                this.f13533 = i;
            } else {
                if (this.f13533 == i) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f13533);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo17185() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo17186() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo17187() {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m17175(@InterfaceC6391 Context context, @InterfaceC6391 ComponentName componentName, int i, @InterfaceC6391 Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f13513) {
            AbstractC5552 abstractC5552M17177 = m17177(context, componentName, true, i);
            abstractC5552M17177.m2285(i);
            abstractC5552M17177.mo2284(intent);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m17176(@InterfaceC6391 Context context, @InterfaceC6391 Class<?> cls, int i, @InterfaceC6391 Intent intent) {
        m17175(context, new ComponentName(context, cls), i, intent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static AbstractC5552 m17177(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, AbstractC5552> map = f13514;
        AbstractC5552 abstractC5552 = map.get(componentName);
        if (abstractC5552 != null) {
            return abstractC5552;
        }
        if (!z) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C5551 c5551 = new C5551(context, componentName, i);
        map.put(componentName, c5551);
        return c5551;
    }

    @Override // android.app.Service
    public IBinder onBind(@InterfaceC6391 Intent intent) {
        InterfaceC0793 interfaceC0793 = this.f13515;
        if (interfaceC0793 != null) {
            return interfaceC0793.mo2282();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f13515 = new JobServiceEngineC5550(this);
        this.f13516 = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C5548> arrayList = this.f13521;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f13520 = true;
                this.f13516.mo17185();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@InterfaceC6490 Intent intent, int i, int i2) {
        if (this.f13521 == null) {
            return 2;
        }
        this.f13516.mo17187();
        synchronized (this.f13521) {
            ArrayList<C5548> arrayList = this.f13521;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C5548(intent, i2));
            m17178(true);
        }
        return 3;
    }

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5549 m2278() {
        InterfaceC0793 interfaceC0793 = this.f13515;
        if (interfaceC0793 != null) {
            return interfaceC0793.mo2283();
        }
        synchronized (this.f13521) {
            try {
                if (this.f13521.size() <= 0) {
                    return null;
                }
                return this.f13521.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m2279() {
        AsyncTaskC0792 asyncTaskC0792 = this.f13517;
        if (asyncTaskC0792 != null) {
            asyncTaskC0792.cancel(this.f13518);
        }
        this.f13519 = true;
        return m17181();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m17178(boolean z) {
        if (this.f13517 == null) {
            this.f13517 = new AsyncTaskC0792();
            AbstractC5552 abstractC5552 = this.f13516;
            if (abstractC5552 != null && z) {
                abstractC5552.mo17186();
            }
            this.f13517.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m17179() {
        return this.f13519;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract void m17180(@InterfaceC6391 Intent intent);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m17181() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m17182() {
        ArrayList<C5548> arrayList = this.f13521;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f13517 = null;
                    ArrayList<C5548> arrayList2 = this.f13521;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        m17178(false);
                    } else if (!this.f13520) {
                        this.f13516.mo17185();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m17183(boolean z) {
        this.f13518 = z;
    }
}
