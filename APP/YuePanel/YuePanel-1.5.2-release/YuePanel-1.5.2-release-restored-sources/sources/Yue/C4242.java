package Yue;

import Yue.ExecutorC4239;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4242 {
    @InterfaceC5572(name = "isSchedulerWorker")
    /* JADX INFO: renamed from: ۥ */
    public static final boolean m1206(@InterfaceC6399 Thread thread) {
        return thread instanceof ExecutorC4239.C4240;
    }

    @InterfaceC5572(name = "mayNotBlock")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m1207(@InterfaceC6399 Thread thread) {
        return (thread instanceof ExecutorC4239.C4240) && ((ExecutorC4239.C4240) thread).f8621 == ExecutorC4239.EnumC4241.CPU_ACQUIRED;
    }
}
