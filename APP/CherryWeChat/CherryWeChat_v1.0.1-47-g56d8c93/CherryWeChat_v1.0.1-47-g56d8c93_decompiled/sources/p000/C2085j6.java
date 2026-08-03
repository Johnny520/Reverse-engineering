package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2085j6 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7346a;

    /* JADX INFO: renamed from: b */
    public final C2543te f7347b;

    public /* synthetic */ C2085j6(C2543te c2543te, int i) {
        this.f7346a = i;
        this.f7347b = c2543te;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object obj, int i, int i2, C2644vt c2644vt) {
        switch (this.f7346a) {
            case 0:
                C2543te c2543te = this.f7347b;
                return c2543te.m5024a(new C2656w4((ByteBuffer) obj, c2543te.f8856d, c2543te.f8855c, 15), i, i2, c2644vt, C2543te.f8851j);
            default:
                C2543te c2543te2 = this.f7347b;
                return c2543te2.m5024a(new C2656w4((ParcelFileDescriptor) obj, c2543te2.f8856d, c2543te2.f8855c), i, i2, c2644vt, C2543te.f8851j);
        }
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object obj, C2644vt c2644vt) {
        switch (this.f7346a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
