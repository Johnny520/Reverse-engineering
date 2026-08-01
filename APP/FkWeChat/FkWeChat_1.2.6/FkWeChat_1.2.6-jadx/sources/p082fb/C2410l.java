package p082fb;

import p376zd.C10010p0;

/* JADX INFO: renamed from: fb.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2410l {

    /* JADX INFO: renamed from: a */
    public final Object f6543a;

    /* JADX INFO: renamed from: b */
    public final Thread f6544b = Thread.currentThread();

    public C2410l(Object obj) {
        this.f6543a = obj;
    }

    /* JADX INFO: renamed from: a */
    public Object m8700a() {
        if (m8701b()) {
            return this.f6543a;
        }
        C10010p0.m38820a("No value in this thread (hasValue should be checked before)");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m8701b() {
        return this.f6544b == Thread.currentThread();
    }
}
