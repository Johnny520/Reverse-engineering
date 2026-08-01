package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wg1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f11716 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.wg1.f11716 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m6379(android.app.Activity r5, p000.rf1 r6, java.lang.String r7) {
            java.lang.Throwable r6 = r6.f9363
            r0 = 0
            if (r6 == 0) goto Lb
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L1c
        Lb:
            if (r6 == 0) goto L17
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r1 = r6
            goto L18
        L17:
            r1 = r0
        L18:
            if (r1 != 0) goto L1c
            java.lang.String r1 = "未知错误"
        L1c:
            java.lang.String r6 = ": "
            java.lang.String r2 = p000.lz1.m3688(r7, r6, r1)
            r3 = 4
            java.lang.String r4 = "rc62a71041a7416a5"
            p000.C0888ux.m5979(r4, r2, r0, r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = p000.AbstractC0602nx.m4133(r0, r7, r6, r1)
            r7 = 1
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r7)
            r5.show()
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m6380(android.app.Activity r3, java.lang.String r4, p000.p70 r5) {
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.wg1.f11716
            r2 = 0
            boolean r0 = r1.compareAndSet(r2, r0)
            if (r0 != 0) goto L14
            java.lang.String r4 = "已有火星发送测试正在执行"
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r2)
            r3.show()
            return
        L14:
            android.widget.Toast r4 = android.widget.Toast.makeText(r3, r4, r2)
            r4.show()
            java.lang.Thread r4 = new java.lang.Thread
            fn0 r0 = new fn0
            r1 = 1
            r0.<init>(r1, r5, r3)
            java.lang.String r3 = "rf9a544ecc2a1c2bc"
            r4.<init>(r0, r3)
            r4.start()
            return
    }
}
