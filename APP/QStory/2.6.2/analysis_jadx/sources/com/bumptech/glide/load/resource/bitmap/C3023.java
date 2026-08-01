package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.load.engine.InterfaceC2988;
import java.nio.ByteBuffer;
import p286.C8396;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3023 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3039 f9634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9635;

    public /* synthetic */ C3023(C3039 c3039, int i) {
        this.f9635 = i;
        this.f9634 = c3039;
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6464(Object obj, int i, int i2, C8396 c8396) {
        switch (this.f9635) {
            case 0:
                C3039 c3039 = this.f9634;
                return c3039.m6524(new C0108((ByteBuffer) obj, c3039.f9682, c3039.f9683, 11), i, i2, c8396, C3039.f9680);
            default:
                C3039 c30392 = this.f9634;
                return c30392.m6524(new C0108((ParcelFileDescriptor) obj, c30392.f9682, c30392.f9683), i, i2, c8396, C3039.f9680);
        }
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6465(Object obj, C8396 c8396) {
        switch (this.f9635) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
