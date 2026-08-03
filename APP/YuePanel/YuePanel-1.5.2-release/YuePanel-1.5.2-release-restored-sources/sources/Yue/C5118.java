package Yue;

import Yue.InterfaceC7144;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class C5118 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Executor f1305;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final InterfaceC5122<C8107> f1306;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final Object f12131;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC5225("lock")
    public int f12132;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC5225("lock")
    public boolean f12133;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC5225("lock")
    public boolean f12134;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5225("lock")
    public final List<InterfaceC5122<C8107>> f12135;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final Runnable f12136;

    public C5118(@InterfaceC6399 Executor executor, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        C5499.m17103(executor, "executor");
        C5499.m17103(interfaceC5122, "reportFullyDrawn");
        this.f1305 = executor;
        this.f1306 = interfaceC5122;
        this.f12131 = new Object();
        this.f12135 = new ArrayList();
        this.f12136 = new Runnable() { // from class: Yue.ۥۣۣ۠۠
            @Override // java.lang.Runnable
            public final void run() {
                C5118.m15791(this.f12130);
            }
        };
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m15791(C5118 c5118) {
        C5499.m17103(c5118, "this$0");
        synchronized (c5118.f12131) {
            try {
                c5118.f12133 = false;
                if (c5118.f12132 == 0 && !c5118.f12134) {
                    c5118.f1306.invoke();
                    c5118.m15793();
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1931(@InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        boolean z;
        C5499.m17103(interfaceC5122, "callback");
        synchronized (this.f12131) {
            if (this.f12134) {
                z = true;
            } else {
                this.f12135.add(interfaceC5122);
                z = false;
            }
        }
        if (z) {
            interfaceC5122.invoke();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m15792() {
        synchronized (this.f12131) {
            try {
                if (!this.f12134) {
                    this.f12132++;
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m15793() {
        synchronized (this.f12131) {
            try {
                this.f12134 = true;
                Iterator<T> it = this.f12135.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5122) it.next()).invoke();
                }
                this.f12135.clear();
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m15794() {
        boolean z;
        synchronized (this.f12131) {
            z = this.f12134;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m15795() {
        if (this.f12133 || this.f12132 != 0) {
            return;
        }
        this.f12133 = true;
        this.f1305.execute(this.f12136);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m15796(@InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        C5499.m17103(interfaceC5122, "callback");
        synchronized (this.f12131) {
            this.f12135.remove(interfaceC5122);
            C8107 c8107 = C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m15797() {
        int i;
        synchronized (this.f12131) {
            try {
                if (!this.f12134 && (i = this.f12132) > 0) {
                    this.f12132 = i - 1;
                    m15795();
                }
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
