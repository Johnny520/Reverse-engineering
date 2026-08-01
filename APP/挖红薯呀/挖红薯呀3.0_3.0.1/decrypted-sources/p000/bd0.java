package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bd0 implements fv0 {

    /* JADX INFO: renamed from: e */
    public boolean f496e;

    /* JADX INFO: renamed from: f */
    public boolean f497f;

    /* JADX INFO: renamed from: d */
    public boolean f495d = true;

    /* JADX INFO: renamed from: g */
    public final jh0 f498g = new jh0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m349a() {
        jh0 jh0Var = this.f498g;
        Object[] objArr = jh0Var.f2880c;
        long[] jArr = jh0Var.f2878a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof dh0) {
                                dh0 dh0Var = (dh0) obj;
                                Object[] objArr2 = dh0Var.f1108a;
                                int i4 = dh0Var.f1109b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        jh0Var.m1695a();
    }
}
