package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0339 implements Yue.InterfaceC3871 {
    public C0339() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC3871
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String mo1409() {
            r1 = this;
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            return r0
    }

    @Override // Yue.InterfaceC3871
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.AbstractC3862 mo1410(@Yue.InterfaceC4418 java.util.List<? extends Yue.InterfaceC3871> r4) {
            r3 = this;
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r4 == 0) goto L13
            Yue.ۥ۠ۤ۠ۦ r0 = new Yue.ۥ۠ۤ۠ۦ
            r1 = 1
            android.os.Handler r4 = Yue.C2967.m12596(r4, r1)
            r1 = 2
            r2 = 0
            r0.<init>(r4, r2, r1, r2)
            return r0
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "The main looper is not available"
            r4.<init>(r0)
            throw r4
    }

    @Override // Yue.InterfaceC3871
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int mo1411() {
            r1 = this;
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            return r0
    }
}
