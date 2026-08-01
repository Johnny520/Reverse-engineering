package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d90 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ι */
    public static final java.lang.ThreadLocal f2987 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.C0736qt f2988 = null;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f2989;

    /* JADX INFO: renamed from: ζ */
    public long f2990;

    /* JADX INFO: renamed from: η */
    public long f2991;

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList f2992;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.d90.f2987 = r0
            qt r0 = new qt
            r1 = 19
            r0.<init>(r1)
            p000.d90.f2988 = r0
            return
    }

    public d90() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2989 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2992 = r0
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            java.util.ArrayList r0 = r9.f2989
            r1 = 0
            java.lang.String r3 = "RV Prefetch"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L32
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L15
        Lf:
            r9.f2990 = r1
            android.os.Trace.endSection()
            return
        L15:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r5 = r1
        L1b:
            if (r4 >= r3) goto L37
            java.lang.Object r7 = r0.get(r4)     // Catch: java.lang.Throwable -> L32
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7     // Catch: java.lang.Throwable -> L32
            int r8 = r7.getWindowVisibility()     // Catch: java.lang.Throwable -> L32
            if (r8 != 0) goto L34
            long r7 = r7.getDrawingTime()     // Catch: java.lang.Throwable -> L32
            long r5 = java.lang.Math.max(r7, r5)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L49
        L34:
            int r4 = r4 + 1
            goto L1b
        L37:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            goto Lf
        L3c:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L32
            long r3 = r0.toNanos(r5)     // Catch: java.lang.Throwable -> L32
            long r5 = r9.f2991     // Catch: java.lang.Throwable -> L32
            long r3 = r3 + r5
            r9.m1676(r3)     // Catch: java.lang.Throwable -> L32
            goto Lf
        L49:
            r9.f2990 = r1
            android.os.Trace.endSection()
            throw r0
    }

    /* JADX INFO: renamed from: α */
    public final void m1675(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r5.f1164
            if (r0 == 0) goto L28
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f1118
            if (r0 == 0) goto L17
            java.util.ArrayList r0 = r4.f2989
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L11
            goto L17
        L11:
            java.lang.String r4 = "attempting to post unregistered view!"
            p000.C1080.m7279(r4)
            return
        L17:
            long r0 = r4.f2990
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r5.getNanoTime()
            r4.f2990 = r0
            r5.post(r4)
        L28:
            b90 r4 = r5.f1173
            r4.f1565 = r6
            r4.f1566 = r7
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1676(long r8) {
            r7 = this;
            java.util.ArrayList r0 = r7.f2989
            int r1 = r0.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            if (r3 >= r1) goto L21
            java.lang.Object r5 = r0.get(r3)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            int r6 = r5.getWindowVisibility()
            b90 r5 = r5.f1173
            if (r6 != 0) goto L1e
            r5.f1567 = r2
            int r5 = r5.f1567
            int r4 = r4 + r5
        L1e:
            int r3 = r3 + 1
            goto L9
        L21:
            java.util.ArrayList r7 = r7.f2992
            r7.ensureCapacity(r4)
            r3 = r2
        L27:
            if (r3 >= r1) goto L62
            java.lang.Object r4 = r0.get(r3)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            int r5 = r4.getWindowVisibility()
            if (r5 == 0) goto L36
            goto L5f
        L36:
            b90 r4 = r4.f1173
            int r5 = r4.f1565
            java.lang.Math.abs(r5)
            int r5 = r4.f1566
            java.lang.Math.abs(r5)
            int r4 = r4.f1567
            int r4 = r4 * 2
            if (r4 <= 0) goto L5f
            int r8 = r7.size()
            if (r8 > 0) goto L57
            c90 r8 = new c90
            r8.<init>()
            r7.add(r8)
            goto L5d
        L57:
            java.lang.Object r7 = r7.get(r2)
            c90 r7 = (p000.c90) r7
        L5d:
            r7 = 0
            throw r7
        L5f:
            int r3 = r3 + 1
            goto L27
        L62:
            qt r0 = p000.d90.f2988
            java.util.Collections.sort(r7, r0)
            int r0 = r7.size()
            if (r0 <= 0) goto Lb9
            java.lang.Object r7 = r7.get(r2)
            c90 r7 = (p000.c90) r7
            androidx.recyclerview.widget.RecyclerView r0 = r7.f2014
            if (r0 != 0) goto L78
            goto Lb9
        L78:
            boolean r1 = r7.f2011
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L82
            r8 = r3
        L82:
            int r7 = r7.f2015
            m6 r1 = r0.f1154
            int r1 = r1.m3760()
            r5 = 0
            if (r1 > 0) goto Laf
            fm1 r1 = r0.f1151
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto La1
            boolean r8 = android.os.Trace.isEnabled()     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto La1
            java.lang.String r8 = "RV Prefetch forced - needed next frame"
            android.os.Trace.beginSection(r8)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r7 = move-exception
            goto La8
        La1:
            r0.m535()     // Catch: java.lang.Throwable -> L9f
            r1.m2152(r7)     // Catch: java.lang.Throwable -> L9f
            throw r5     // Catch: java.lang.Throwable -> L9f
        La8:
            r0.m536(r2)
            android.os.Trace.endSection()
            throw r7
        Laf:
            m6 r7 = r0.f1154
            android.view.View r7 = r7.m3759(r2)
            androidx.recyclerview.widget.RecyclerView.m507(r7)
            throw r5
        Lb9:
            return
    }
}
