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
        File file;
        synchronized (((C1219be) this.f3480d)) {
            try {
                C1139ae c1139ae = (C1139ae) this.f3478b;
                if (c1139ae.f3604f != this) {
                    throw new IllegalStateException();
                }
                if (!c1139ae.f3603e) {
                    ((boolean[]) this.f3479c)[0] = true;
                }
                file = c1139ae.f3602d[0];
                ((C1219be) this.f3480d).f4157a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public C1094Zd(C0061Bb c0061Bb, C2606uy c2606uy) {
        this.f3480d = new C2649vy(0, this);
        this.f3479c = c0061Bb;
        this.f3478b = c2606uy;
    }

    public C1094Zd(C1219be c1219be, C1139ae c1139ae) {
        this.f3480d = c1219be;
        this.f3478b = c1139ae;
        this.f3479c = c1139ae.f3603e ? null : new boolean[c1219be.f4163g];
    }
}
