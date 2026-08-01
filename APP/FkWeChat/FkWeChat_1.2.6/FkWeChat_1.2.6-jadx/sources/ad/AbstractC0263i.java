package ad;

import p185m8.C5096o;

/* JADX INFO: renamed from: ad.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0263i {

    /* JADX INFO: renamed from: a */
    public final C5096o f644a = new C5096o();

    /* JADX INFO: renamed from: b */
    public int f645b;

    /* JADX INFO: renamed from: a */
    public final byte[] m774a(int i10) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f644a.m20636y();
            if (bArr != null) {
                this.f645b -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i10] : bArr;
    }
}
