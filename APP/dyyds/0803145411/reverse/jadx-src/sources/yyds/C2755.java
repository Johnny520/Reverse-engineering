package yyds;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᲈᲁᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2755 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C1440 f13475 = new C1440();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f13476;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public long f13477;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public long f13478;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public boolean mo2195() {
        return this.f13476;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public C2755 mo2196() {
        this.f13476 = false;
        return this;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public C2755 mo2197() {
        this.f13478 = 0L;
        return this;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public C2755 mo2198(long j) {
        if (j >= 0) {
            this.f13478 = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }
        C0188.m803(j, "timeout < 0: ");
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public long mo2199() {
        if (this.f13476) {
            return this.f13477;
        }
        C0188.m800("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public void mo2200() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f13476 && this.f13477 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public C2755 mo2201(long j) {
        this.f13476 = true;
        this.f13477 = j;
        return this;
    }
}
