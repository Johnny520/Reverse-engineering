package yyds;

import android.util.CloseGuard;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: yyds.ᲈᲀᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2729 implements Cloneable {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean f13408;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final AtomicBoolean f13409;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public C2115 f13410;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public CloseGuard f13411;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2142 f13412;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public volatile C2115 f13413;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f13414;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public boolean f13415;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f13416;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2064 f13417;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f13418;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C2723 f13419;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f13420;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public InterfaceC1028 f13421;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public volatile boolean f13422;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1284 f13423;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f13424;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public volatile AbstractC2740 f13425;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2098 f13426;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C2729.class, AbstractC2740.class, "ᲇᲇᲇᛱ");
    }

    public C2729(C1284 c1284, C2098 c2098) {
        this.f13423 = c1284;
        this.f13426 = c2098;
        this.f13412 = (C2142) c1284.f5895.f551;
        c1284.f5922.getClass();
        this.f13425 = AbstractC2740.f13447;
        C2064 c2064 = new C2064(this);
        c2064.mo2198(0L);
        this.f13417 = c2064;
        this.f13409 = new AtomicBoolean();
        this.f13415 = true;
        this.f13418 = new CopyOnWriteArrayList();
        new AtomicReference(c2098.f10388);
    }

    public final Object clone() {
        return new C2729(this.f13423, this.f13426);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final IOException m4855(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f13415) {
                this.f13415 = false;
                if (!this.f13408 && !this.f13414 && !this.f13424) {
                    if (!this.f13416) {
                        z = true;
                    }
                }
            }
        }
        return z ? m4859(iOException) : iOException;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final Socket m4856() {
        C2723 c2723 = this.f13419;
        TimeZone timeZone = AbstractC0795.f3653;
        ArrayList arrayList = c2723.f13388;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC1544.m3188(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C0188.m800("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f13419 = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c2723.f13382 = System.nanoTime();
        C2142 c2142 = this.f13412;
        ConcurrentLinkedQueue concurrentLinkedQueue = c2142.f10582;
        TimeZone timeZone2 = AbstractC0795.f3653;
        if (!c2723.f13386) {
            c2142.f10580.m697(c2142.f10581, 0L);
            return null;
        }
        c2723.f13386 = true;
        concurrentLinkedQueue.remove(c2723);
        if (concurrentLinkedQueue.isEmpty()) {
            C0153 c0153 = c2142.f10580;
            synchronized (c0153.f950) {
                if (c0153.m696()) {
                    c0153.f950.m509(c0153);
                }
            }
        }
        return c2723.f13379;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4857(boolean z) {
        C2115 c2115;
        synchronized (this) {
            if (!this.f13415) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c2115 = this.f13413) != null) {
            ((InterfaceC2121) c2115.f10457).cancel();
            ((C2729) c2115.f10455).m4860(c2115, true, true, true, true, null);
        }
        this.f13410 = null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4858(C2723 c2723) {
        TimeZone timeZone = AbstractC0795.f3653;
        if (this.f13419 != null) {
            C0188.m800("Check failed.");
        } else {
            this.f13419 = c2723;
            c2723.f13388.add(new C1380(this, this.f13411));
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final IOException m4859(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM4856;
        TimeZone timeZone = AbstractC0795.f3653;
        C2723 c2723 = this.f13419;
        if (c2723 != null) {
            synchronized (c2723) {
                socketM4856 = m4856();
            }
            if (this.f13419 == null) {
                if (socketM4856 != null) {
                    AbstractC0795.m1808(socketM4856);
                }
                this.f13425.getClass();
            } else if (socketM4856 != null) {
                C0188.m800("Check failed.");
                return null;
            }
        }
        if (!this.f13420 && this.f13417.m978()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        AbstractC2740 abstractC2740 = this.f13425;
        if (iOException != null) {
            abstractC2740.getClass();
            return interruptedIOException;
        }
        abstractC2740.getClass();
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final IOException m4860(C2115 c2115, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        if (c2115.equals(this.f13413)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.f13408) {
                            if ((z2 || !this.f13414) && ((!z4 || !this.f13424) && (!z3 || !this.f13416))) {
                            }
                        }
                        if (z) {
                            this.f13408 = false;
                        }
                        if (z2) {
                            this.f13414 = false;
                        }
                        if (z4) {
                            this.f13424 = false;
                        }
                        if (z3) {
                            this.f13416 = false;
                        }
                        boolean z7 = (this.f13408 || this.f13414 || this.f13424 || this.f13416) ? false : true;
                        if (z7) {
                            if (!this.f13415) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.f13413 = null;
                C2723 c2723 = this.f13419;
                if (c2723 != null) {
                    synchronized (c2723) {
                        c2723.f13377++;
                    }
                }
            }
            if (z6) {
                return m4859(iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m4861() {
        if (this.f13422) {
            return;
        }
        this.f13422 = true;
        C2115 c2115 = this.f13413;
        if (c2115 != null) {
            ((InterfaceC2121) c2115.f10457).cancel();
        }
        Iterator it = this.f13418.iterator();
        while (it.hasNext()) {
            ((InterfaceC2144) it.next()).cancel();
        }
        this.f13425.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0837 m4862() {
        ArrayList arrayList = new ArrayList();
        AbstractC1432.m2928(this.f13423.f5907, arrayList);
        arrayList.add(new C2717(4));
        arrayList.add(new C2717(2));
        arrayList.add(new C2717(3));
        arrayList.add(C2717.f13345);
        AbstractC1432.m2928(this.f13423.f5919, arrayList);
        arrayList.add(C2717.f13344);
        C2098 c2098 = this.f13426;
        C1284 c1284 = this.f13423;
        C2537 c2537 = new C2537(this, arrayList, 0, null, c2098, c1284.f5912, c1284.f5909, c1284.f5902, c1284.f5911, c1284.f5904, c1284.f5895, c1284.f5917, c1284.f5914, c1284.f5918, c1284.f5898, c1284.f5915, c1284.f5901, c1284.f5896, c1284.f5905, c1284.f5920, c1284.f5913);
        boolean z = false;
        try {
            try {
                C0837 c0837M4578 = c2537.m4578(c2098);
                if (this.f13422) {
                    AbstractC1429.m2918(c0837M4578);
                    throw new IOException("Canceled");
                }
                m4855(null);
                return c0837M4578;
            } catch (IOException e) {
                z = true;
                throw m4855(e);
            }
        } catch (Throwable th) {
            if (!z) {
            }
            throw th;
        }
        if (!z) {
            m4855(null);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0837 m4863() {
        if (!this.f13409.compareAndSet(false, true)) {
            C0188.m800("Already Executed");
            return null;
        }
        this.f13417.m977();
        C1966 c1966 = AbstractC1325.f6087;
        AbstractC1325.f6087.getClass();
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        this.f13411 = closeGuard;
        this.f13425.getClass();
        try {
            C0299 c0299 = this.f13423.f5903;
            synchronized (c0299) {
                ((ArrayDeque) c0299.f1574).add(this);
            }
            return m4862();
        } finally {
            this.f13423.f5903.m953(this);
        }
    }
}
