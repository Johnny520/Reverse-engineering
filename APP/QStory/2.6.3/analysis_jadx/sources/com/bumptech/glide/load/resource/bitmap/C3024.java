package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.load.engine.InterfaceC2989;
import java.nio.ByteBuffer;
import p286.C8397;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3024 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3040 f9636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9637;

    public /* synthetic */ C3024(C3040 c3040, int i) {
        this.f9637 = i;
        this.f9636 = c3040;
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) {
        switch (this.f9637) {
            case 0:
                C3040 c3040 = this.f9636;
                return c3040.m6584(new C0108((ByteBuffer) obj, c3040.f9684, c3040.f9685, 11), i, i2, c8397, C3040.f9682);
            default:
                C3040 c30402 = this.f9636;
                return c30402.m6584(new C0108((ParcelFileDescriptor) obj, c30402.f9684, c30402.f9685), i, i2, c8397, C3040.f9682);
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6525(Object obj, C8397 c8397) {
        switch (this.f9637) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
