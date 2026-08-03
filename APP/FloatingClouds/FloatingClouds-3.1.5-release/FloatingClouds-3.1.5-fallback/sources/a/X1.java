package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.luckypray.dexkit.DexKitBridge f331a;

    public X1(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "bridge"
            a.C0193i9.e(r1, r2)
            r0.<init>()
            r0.f331a = r1
            return
    }

    public static long a(int r2, int r3) {
            long r0 = (long) r2
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r3
            long r2 = r2 | r0
            return r2
    }
}
