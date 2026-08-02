package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: co */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0098co implements g92 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1633a;

    /* JADX INFO: renamed from: b */
    public final xa0 f1634b;

    public /* synthetic */ C0098co(xa0 xa0Var, int i) {
        this.f1633a = i;
        this.f1634b = xa0Var;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final d92 mo866a(Object obj, int i, int i2, ov1 ov1Var) {
        switch (this.f1633a) {
            case 0:
                xa0 xa0Var = this.f1634b;
                return xa0Var.m6078a(new C0043b5((ByteBuffer) obj, xa0Var.f12927d, xa0Var.f12926c, 14), i, i2, ov1Var, xa0.f12922j);
            default:
                xa0 xa0Var2 = this.f1634b;
                return xa0Var2.m6078a(new C0043b5((ParcelFileDescriptor) obj, xa0Var2.f12927d, xa0Var2.f12926c), i, i2, ov1Var, xa0.f12922j);
        }
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final boolean mo867b(Object obj, ov1 ov1Var) {
        switch (this.f1633a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
