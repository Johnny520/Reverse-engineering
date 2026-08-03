package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hc extends android.os.Handler {
    public hc(android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r3) {
            r2 = this;
            android.os.Message r3 = r2.obtainMessage()
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.sendMessageDelayed(r3, r0)
            return
    }
}
