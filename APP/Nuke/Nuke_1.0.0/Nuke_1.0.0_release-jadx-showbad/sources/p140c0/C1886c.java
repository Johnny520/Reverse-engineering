package p140c0;

import p186k.C2404A;
import p186k.C2408E;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1886c implements InterfaceC1887d {

    /* JADX INFO: renamed from: e */
    public boolean f6409e;

    /* JADX INFO: renamed from: f */
    public boolean f6410f;

    /* JADX INFO: renamed from: d */
    public boolean f6408d = true;

    /* JADX INFO: renamed from: g */
    public final C2408E f6411g = new C2408E();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3373a() {
        C2408E c2408e = this.f6411g;
        Object[] objArr = c2408e.f7789c;
        long[] jArr = c2408e.f7787a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i5 << 3) + i7];
                            if (obj instanceof C2404A) {
                                C2404A c2404a = (C2404A) obj;
                                Object[] objArr2 = c2404a.f7766a;
                                int i8 = c2404a.f7767b;
                                for (int i9 = 0; i9 < i8; i9++) {
                                    Object obj2 = objArr2[i9];
                                }
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        c2408e.m4266a();
    }
}
