package p121Y1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import p000A.C0072l0;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p088R1.InterfaceC1194D;

/* JADX INFO: renamed from: Y1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1745f implements InterfaceC1149k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6018a;

    /* JADX INFO: renamed from: b */
    public final C1757r f6019b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1745f(C1757r c1757r, int i5) {
        this.f6018a = i5;
        this.f6019b = c1757r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2202a(Object obj, int i5, int i6, C1147i c1147i) {
        switch (this.f6018a) {
            case 0:
                C1757r c1757r = this.f6019b;
                return c1757r.m3132a(new C0072l0((ByteBuffer) obj, c1757r.f6049d, c1757r.f6048c, 10), i5, i6, c1147i, C1757r.f6044j);
            default:
                C1757r c1757r2 = this.f6019b;
                return c1757r2.m3132a(new C0072l0((ParcelFileDescriptor) obj, c1757r2.f6049d, c1757r2.f6048c), i5, i6, c1147i, C1757r.f6044j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final boolean mo2203b(Object obj, C1147i c1147i) {
        switch (this.f6018a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
