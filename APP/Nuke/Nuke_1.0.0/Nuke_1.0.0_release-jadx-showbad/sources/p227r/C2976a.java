package p227r;

import com.bumptech.glide.AbstractC1926h;
import java.util.concurrent.CancellationException;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p105V.C1483e;
import p132a3.C1804d;
import p160f3.InterfaceC2133f;
import p238t.AbstractC3204b;
import p260x.C3427j;

/* JADX INFO: renamed from: r.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2976a {

    /* JADX INFO: renamed from: a */
    public final C1483e f9424a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2976a(int i5) {
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f9424a = new C1483e(new C3427j[16]);
                break;
            default:
                this.f9424a = new C1483e(new C2988g[16]);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m5172a(CancellationException cancellationException) {
        C1483e c1483e = this.f9424a;
        int i5 = c1483e.f5183f;
        InterfaceC2133f[] interfaceC2133fArr = new InterfaceC2133f[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            interfaceC2133fArr[i6] = ((C2988g) c1483e.f5181d[i6]).f9459b;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            interfaceC2133fArr[i7].mo3952k(cancellationException);
        }
        if (c1483e.f5183f == 0) {
            return;
        }
        AbstractC3204b.m5477c("uncancelled requests present");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m5173b() {
        C1483e c1483e = this.f9424a;
        C1804d c1804dM3557J = AbstractC1926h.m3557J(0, c1483e.f5183f);
        int i5 = c1804dM3557J.f6140d;
        int i6 = c1804dM3557J.f6141e;
        if (i5 <= i6) {
            while (true) {
                ((C2988g) c1483e.f5181d[i5]).f9459b.mo278i(C0891q.f2780a);
                if (i5 == i6) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        c1483e.m2758g();
    }
}
