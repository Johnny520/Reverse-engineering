package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: z */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0556z {

    /* JADX INFO: renamed from: a */
    public final byte[] f1117a;

    /* JADX INFO: renamed from: b */
    public int f1118b;

    /* JADX INFO: renamed from: c */
    public final int f1119c;

    /* JADX INFO: renamed from: d */
    public int f1120d;

    /* JADX INFO: renamed from: e */
    public int f1121e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0556z(byte[] bArr) {
        bArr = bArr == null ? new byte[0] : bArr;
        this.f1117a = bArr;
        this.f1119c = bArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1174a() {
        if (this.f1118b >= this.f1119c) {
            return false;
        }
        long jM1176c = m1176c();
        if (jM1176c == 0) {
            return false;
        }
        int i = (int) (jM1176c >>> 3);
        this.f1120d = i;
        this.f1121e = (int) (jM1176c & 7);
        return i > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final byte[] m1175b() {
        int i;
        int i2;
        int iM1176c = (int) m1176c();
        int i3 = this.f1119c;
        if (iM1176c < 0 || (i2 = (i = this.f1118b) + iM1176c) > i3) {
            this.f1118b = i3;
            return new byte[0];
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f1117a, i, i2);
        this.f1118b += iM1176c;
        return bArrCopyOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r6.f1118b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return r0;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m1176c() {
        int i;
        long j = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.f1119c;
            if (i2 >= 64 || (i = this.f1118b) >= i3) {
                break;
            }
            this.f1118b = i + 1;
            byte b = this.f1117a[i];
            j |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                return j;
            }
            i2 += 7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1177d() {
        return new String(m1175b(), StandardCharsets.UTF_8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1178e() {
        int i = this.f1121e;
        if (i == 0) {
            m1176c();
            return;
        }
        int iMin = this.f1119c;
        if (i == 1) {
            this.f1118b = Math.min(iMin, this.f1118b + 8);
            return;
        }
        if (i != 2) {
            if (i != 5) {
                this.f1118b = iMin;
                return;
            } else {
                this.f1118b = Math.min(iMin, this.f1118b + 4);
                return;
            }
        }
        int iM1176c = (int) m1176c();
        if (iM1176c >= 0) {
            iMin = Math.min(iMin, this.f1118b + iM1176c);
        }
        this.f1118b = iMin;
    }
}
