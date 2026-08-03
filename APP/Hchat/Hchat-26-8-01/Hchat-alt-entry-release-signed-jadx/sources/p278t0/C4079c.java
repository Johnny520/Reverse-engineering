package p278t0;

import p069f.C0933f0;
import p069f.C0943k0;

/* JADX INFO: renamed from: t0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4079c implements InterfaceC4080d {

    /* JADX INFO: renamed from: b */
    public boolean f13518b;

    /* JADX INFO: renamed from: c */
    public boolean f13519c;

    /* JADX INFO: renamed from: a */
    public boolean f13517a = true;

    /* JADX INFO: renamed from: d */
    public final C0943k0 f13520d = new C0943k0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8263a() {
        C0943k0 c0943k0 = this.f13520d;
        Object[] objArr = c0943k0.f2970c;
        long[] jArr = c0943k0.f2968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i9 << 3) + i11];
                            if (obj instanceof C0933f0) {
                                C0933f0 c0933f0 = (C0933f0) obj;
                                Object[] objArr2 = c0933f0.f2923a;
                                int i12 = c0933f0.f2924b;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    Object obj2 = objArr2[i13];
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i9 == length) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        c0943k0.m2314a();
    }
}
