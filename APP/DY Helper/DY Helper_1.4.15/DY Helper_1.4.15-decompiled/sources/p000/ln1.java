package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ln1 extends java.lang.Thread {

    /* JADX INFO: renamed from: ε */
    public final int f6724;

    public ln1(java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = "fonts-androidx"
            r1.<init>(r2, r0)
            r2 = 10
            r1.f6724 = r2
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f6724
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
    }
}
