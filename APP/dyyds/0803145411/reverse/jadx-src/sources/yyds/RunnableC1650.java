package yyds;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: yyds.ᛷᲁᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1650 implements InterfaceC2662, Runnable, Comparable, InterfaceC2054 {

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public static final C2120 f8400 = new C2120("glide_thread_priority_override", null, C2120.f10466);

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public volatile InterfaceC2633 f8401;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f8402;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C1876 f8404;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public Object f8405;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public Thread f8408;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public long f8409;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f8410;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public C2028 f8411;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public InterfaceC1410 f8412;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public Supplier f8413;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public C0822 f8414;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC0942 f8415;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public C0052 f8416;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public Object f8417;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public InterfaceC1410 f8418;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public EnumC0296 f8419;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public int f8420;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public InterfaceC0724 f8421;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public int f8422;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C2572 f8423;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public volatile boolean f8424;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public volatile boolean f8425;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public int f8426;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public boolean f8428;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public C2340 f8429;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0716 f8430;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public int f8432;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public InterfaceC1410 f8433;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1008 f8427 = new C1008();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayList f8431 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1202 f8407 = new C1202();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0644 f8403 = new C0644(10, false);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0047 f8406 = new C0047();

    public RunnableC1650(C0716 c0716, C0644 c0644) {
        this.f8430 = c0716;
        this.f8415 = c0644;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC1650 runnableC1650 = (RunnableC1650) obj;
        int iCompareTo = this.f8419.compareTo(runnableC1650.f8419);
        return iCompareTo == 0 ? this.f8426 - runnableC1650.f8426 : iCompareTo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0724 interfaceC0724 = this.f8421;
        try {
            try {
                if (this.f8425) {
                    m3372();
                    if (interfaceC0724 != null) {
                        interfaceC0724.mo512();
                        return;
                    }
                    return;
                }
                m3363();
                if (interfaceC0724 != null) {
                    interfaceC0724.mo512();
                }
            } catch (Throwable th) {
                if (interfaceC0724 != null) {
                    interfaceC0724.mo512();
                }
                throw th;
            }
        } catch (C0953 e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f8425 + ", stage: " + AbstractC2104.m4009(this.f8420), th2);
            }
            if (this.f8420 != 5) {
                this.f8431.add(th2);
                m3372();
            }
            if (!this.f8425) {
                throw th2;
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m3363() {
        int iM4012 = AbstractC2104.m4012(this.f8422);
        if (iM4012 == 0) {
            this.f8420 = m3364(1);
            this.f8401 = m3369();
            m3365();
        } else if (iM4012 == 1) {
            m3365();
        } else if (iM4012 == 2) {
            m3373();
        } else {
            int i = this.f8422;
            C0188.m800("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int m3364(int i) {
        int iM4012 = AbstractC2104.m4012(i);
        boolean z = false;
        if (iM4012 == 0) {
            switch (this.f8429.f11507) {
                case 0:
                default:
                    z = true;
                    break;
                case 1:
                case 2:
                    break;
            }
            if (z) {
                return 2;
            }
            return m3364(2);
        }
        if (iM4012 != 1) {
            if (iM4012 == 2) {
                return 4;
            }
            if (iM4012 == 3 || iM4012 == 5) {
                return 6;
            }
            C0188.m798("Unrecognized stage: ".concat(AbstractC2104.m4009(i)));
            return 0;
        }
        switch (this.f8429.f11507) {
            case 0:
            case 2:
            default:
                z = true;
                break;
            case 1:
                break;
        }
        if (z) {
            return 3;
        }
        return m3364(3);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m3365() {
        this.f8408 = Thread.currentThread();
        int i = AbstractC1382.f6429;
        this.f8409 = SystemClock.elapsedRealtimeNanos();
        boolean zMo1721 = false;
        while (!this.f8425 && this.f8401 != null && !(zMo1721 = this.f8401.mo1721())) {
            this.f8420 = m3364(this.f8420);
            this.f8401 = m3369();
            if (this.f8420 == 4) {
                this.f8422 = 2;
                C2028 c2028 = this.f8411;
                (c2028.f10107 ? c2028.f10121 : c2028.f10110).execute(this);
                return;
            }
        }
        if ((this.f8420 == 6 || this.f8425) && !zMo1721) {
            m3372();
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m3366(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(" in ");
        sb.append(AbstractC1382.m2794(j));
        sb.append(", load key: ");
        sb.append(this.f8404);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2162 m3367(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C1008 c1008 = this.f8427;
        C1362 c1362M2188 = c1008.m2188(cls);
        C0822 c0822 = this.f8414;
        boolean z = i == 4 || c1008.f4587;
        C2120 c2120 = C2707.f13280;
        Boolean bool = (Boolean) c0822.m1891(c2120);
        if (bool == null || (bool.booleanValue() && !z)) {
            c0822 = new C0822();
            C0410 c0410 = this.f8414.f3758;
            C0410 c04102 = c0822.f3758;
            c04102.mo1165(c0410);
            c04102.put(c2120, Boolean.valueOf(z));
        }
        C0822 c08222 = c0822;
        InterfaceC0740 interfaceC0740M3227 = this.f8423.m4645().m3227(obj);
        try {
            return c1362M2188.m2761(this.f8402, this.f8410, new C1760(this, i), interfaceC0740M3227, c08222);
        } finally {
            interfaceC0740M3227.mo244();
        }
    }

    @Override // yyds.InterfaceC2662
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo2883(InterfaceC1410 interfaceC1410, Object obj, InterfaceC0724 interfaceC0724, int i, InterfaceC1410 interfaceC14102) {
        this.f8433 = interfaceC1410;
        this.f8405 = obj;
        this.f8421 = interfaceC0724;
        this.f8432 = i;
        this.f8412 = interfaceC14102;
        this.f8428 = interfaceC1410 != this.f8427.m2186().get(0);
        if (Thread.currentThread() == this.f8408) {
            m3373();
            return;
        }
        this.f8422 = 3;
        C2028 c2028 = this.f8411;
        (c2028.f10107 ? c2028.f10121 : c2028.f10110).execute(this);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m3368() {
        Throwable th;
        this.f8407.m2395();
        if (!this.f8424) {
            this.f8424 = true;
            return;
        }
        if (this.f8431.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f8431;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // yyds.InterfaceC2662
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo2884(InterfaceC1410 interfaceC1410, Exception exc, InterfaceC0724 interfaceC0724, int i) {
        interfaceC0724.mo512();
        C0975 c0975 = new C0975("Fetching data failed", Collections.singletonList(exc));
        Class clsMo417 = interfaceC0724.mo417();
        c0975.f4471 = interfaceC1410;
        c0975.f4467 = i;
        c0975.f4470 = clsMo417;
        this.f8431.add(c0975);
        if (Thread.currentThread() == this.f8408) {
            m3365();
            return;
        }
        this.f8422 = 2;
        C2028 c2028 = this.f8411;
        (c2028.f10107 ? c2028.f10121 : c2028.f10110).execute(this);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC2633 m3369() {
        int iM4012 = AbstractC2104.m4012(this.f8420);
        C1008 c1008 = this.f8427;
        if (iM4012 == 1) {
            return new C1753(c1008, this);
        }
        if (iM4012 == 2) {
            return new C0768(c1008.m2186(), c1008, this);
        }
        if (iM4012 == 3) {
            return new C1419(c1008, this);
        }
        if (iM4012 == 5) {
            return null;
        }
        C0188.m800("Unrecognized stage: ".concat(AbstractC2104.m4009(this.f8420)));
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void m3370() {
        C0047 c0047 = this.f8406;
        synchronized (c0047) {
            c0047.f543 = false;
            c0047.f542 = false;
            c0047.f544 = false;
        }
        C0644 c0644 = this.f8403;
        c0644.f3099 = null;
        c0644.f3102 = null;
        c0644.f3101 = null;
        C1008 c1008 = this.f8427;
        c1008.f4594 = null;
        c1008.f4597 = null;
        c1008.f4580 = null;
        c1008.f4590 = null;
        c1008.f4591 = null;
        c1008.f4583 = null;
        c1008.f4586 = null;
        c1008.f4593 = null;
        c1008.f4595 = null;
        c1008.f4585.clear();
        c1008.f4592 = false;
        c1008.f4588.clear();
        c1008.f4582 = false;
        this.f8424 = false;
        this.f8423 = null;
        this.f8418 = null;
        this.f8414 = null;
        this.f8419 = null;
        this.f8404 = null;
        this.f8411 = null;
        this.f8420 = 0;
        this.f8401 = null;
        this.f8408 = null;
        this.f8433 = null;
        this.f8405 = null;
        this.f8432 = 0;
        this.f8421 = null;
        this.f8409 = 0L;
        this.f8425 = false;
        this.f8417 = null;
        this.f8431.clear();
        this.f8415.mo1557(this);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m3371() {
        if (!((Map) this.f8416.f551).containsKey(AbstractC0476.class)) {
            C0188.m800("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.f8413;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f8413 = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m3372() {
        boolean zM372;
        if (((Map) this.f8416.f551).containsKey(AbstractC0476.class)) {
            m3371();
        }
        m3368();
        C0975 c0975 = new C0975("Failed to load resource", new ArrayList(this.f8431));
        C2028 c2028 = this.f8411;
        synchronized (c2028) {
            c2028.f10114 = c0975;
        }
        synchronized (c2028) {
            try {
                c2028.f10126.m2395();
                if (c2028.f10117) {
                    c2028.m3908();
                } else {
                    if (c2028.f10123.f11163.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c2028.f10122) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c2028.f10122 = true;
                    C1876 c1876 = c2028.f10120;
                    ArrayList<C0792> arrayList = new ArrayList(c2028.f10123.f11163);
                    c2028.m3909(arrayList.size() + 1);
                    c2028.f10116.m4730(c2028, c1876, null);
                    for (C0792 c0792 : arrayList) {
                        c0792.f3630.execute(new RunnableC2588(c2028, c0792.f3629, 0));
                    }
                    c2028.m3906();
                }
            } finally {
            }
        }
        C0047 c0047 = this.f8406;
        synchronized (c0047) {
            c0047.f544 = true;
            zM372 = c0047.m372();
        }
        if (zM372) {
            m3370();
        }
    }

    @Override // yyds.InterfaceC2054
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C1202 mo2540() {
        return this.f8407;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3373() {
        InterfaceC2162 interfaceC2162M3374;
        boolean zM372;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m3366(this.f8409, "Retrieved data", "data: " + this.f8405 + ", cache key: " + this.f8433 + ", fetcher: " + this.f8421);
        }
        C1264 c1264 = null;
        if (((Map) this.f8416.f551).containsKey(AbstractC0476.class) && (supplier = this.f8413) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f8413.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f8413 = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            interfaceC2162M3374 = m3374(this.f8421, this.f8405, this.f8432);
        } catch (C0975 e2) {
            InterfaceC1410 interfaceC1410 = this.f8412;
            int i = this.f8432;
            e2.f4471 = interfaceC1410;
            e2.f4467 = i;
            e2.f4470 = null;
            this.f8431.add(e2);
            interfaceC2162M3374 = null;
        }
        if (interfaceC2162M3374 == null) {
            m3365();
            return;
        }
        int i2 = this.f8432;
        if (interfaceC2162M3374 instanceof InterfaceC0765) {
            ((InterfaceC0765) interfaceC2162M3374).mo1575();
        }
        int i3 = 1;
        if (((C1264) this.f8403.f3101) != null) {
            c1264 = (C1264) C1264.f5822.mo1548();
            c1264.f5825 = false;
            c1264.f5823 = true;
            c1264.f5826 = interfaceC2162M3374;
            interfaceC2162M3374 = c1264;
        }
        if (((Map) this.f8416.f551).containsKey(AbstractC0476.class)) {
            m3371();
        }
        m3368();
        C2028 c2028 = this.f8411;
        synchronized (c2028) {
            c2028.f10113 = interfaceC2162M3374;
            c2028.f10124 = i2;
        }
        synchronized (c2028) {
            try {
                c2028.f10126.m2395();
                if (c2028.f10117) {
                    c2028.f10113.mo1177();
                    c2028.m3908();
                } else {
                    if (c2028.f10123.f11163.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c2028.f10115) {
                        throw new IllegalStateException("Already have resource");
                    }
                    c2028.f10112 = new C2061(c2028.f10113, c2028.f10109, true, c2028.f10120, c2028.f10111);
                    c2028.f10115 = true;
                    ArrayList<C0792> arrayList = new ArrayList(c2028.f10123.f11163);
                    c2028.m3909(arrayList.size() + 1);
                    c2028.f10116.m4730(c2028, c2028.f10120, c2028.f10112);
                    for (C0792 c0792 : arrayList) {
                        c0792.f3630.execute(new RunnableC2588(c2028, c0792.f3629, i3));
                    }
                    c2028.m3906();
                }
            } finally {
            }
        }
        this.f8420 = 5;
        try {
            C0644 c0644 = this.f8403;
            if (((C1264) c0644.f3101) != null) {
                try {
                    this.f8430.m1635().mo948((InterfaceC1410) c0644.f3099, new C0644((InterfaceC0723) c0644.f3102, (C1264) c0644.f3101, this.f8414, 9));
                    ((C1264) c0644.f3101).m2539();
                } catch (Throwable th) {
                    ((C1264) c0644.f3101).m2539();
                    throw th;
                }
            }
            if (c1264 != null) {
                c1264.m2539();
            }
            C0047 c0047 = this.f8406;
            synchronized (c0047) {
                c0047.f543 = true;
                zM372 = c0047.m372();
            }
            if (zM372) {
                m3370();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC2162 m3374(InterfaceC0724 interfaceC0724, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i2 = AbstractC1382.f6429;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC2162 interfaceC2162M3367 = m3367(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m3366(jElapsedRealtimeNanos, "Decoded result " + interfaceC2162M3367, null);
            }
            return interfaceC2162M3367;
        } finally {
            interfaceC0724.mo512();
        }
    }
}
