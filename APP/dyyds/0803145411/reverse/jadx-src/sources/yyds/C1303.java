package yyds;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: yyds.ᛶᛳᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1303 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final long[] f5963;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean[] f5964;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public volatile boolean f5965;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile boolean f5966;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ReentrantLock f5962 = new ReentrantLock();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ReentrantLock f5961 = new ReentrantLock();

    public C1303(int i) {
        this.f5963 = new long[i];
        this.f5964 = new boolean[i];
    }
}
