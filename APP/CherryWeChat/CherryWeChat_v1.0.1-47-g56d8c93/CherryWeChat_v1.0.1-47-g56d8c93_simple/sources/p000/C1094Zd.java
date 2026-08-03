package p000;

import io.sentry.EnumC1983r1;
import java.io.File;

/* JADX INFO: renamed from: Zd */
/* JADX INFO: loaded from: classes.dex */
public class C1094Zd {

    /* JADX INFO: renamed from: a */
    public boolean f3477a;

    /* JADX INFO: renamed from: b */
    public Object f3478b;

    /* JADX INFO: renamed from: c */
    public final Object f3479c;

    /* JADX INFO: renamed from: d */
    public Object f3480d;

    public C1094Zd() {
        this.f3478b = null;
        this.f3479c = EnumC1983r1.AUTO;
        this.f3477a = false;
        this.f3480d = "manual";
    }

    /* JADX INFO: renamed from: a */
    public void m2020a() {
        C1219be.m2334d((C1219be) this.f3480d, this, false);
    }

    /* JADX INFO: renamed from: b */
    public File m2021b() {
        C1219be r0 = (C1219be) this.f3480d;
        monitor-enter(r0);
        C1139ae r1 = (C1139ae) this.f3478b;     // Catch: Throwable -> L9
        if (r1.f3604f != this) goto L15;
        if (r1.f3603e == true) goto L11;
        ((boolean[]) this.f3479c)[0] = true;     // Catch: Throwable -> L9
    L11:
        File r12 = r1.f3602d[0];     // Catch: Throwable -> L9
        ((C1219be) this.f3480d).f4157a.mkdirs();     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r12;
    L15:
        throw new IllegalStateException();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public C1094Zd(C0061Bb r3, C2606uy r4) {
        this.f3480d = new C2649vy(0, this);
        this.f3479c = r3;
        this.f3478b = r4;
    }

    public C1094Zd(C1219be r1, C1139ae r2) {
        this.f3480d = r1;
        this.f3478b = r2;
        if (r2.f3603e == false) goto L5;
        boolean[] r12 = null;
    L6:
        this.f3479c = r12;
        return;
    L5:
        r12 = new boolean[r1.f4163g];
        goto L6
    }
}
