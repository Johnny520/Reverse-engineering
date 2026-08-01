package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.app.C0955;
import com.bumptech.glide.load.engine.InterfaceC3821;
import java.nio.ByteBuffer;
import p302.C9226;
import p302.InterfaceC9229;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3856 implements InterfaceC9229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3872 f9981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9982;

    public /* synthetic */ C3856(C3872 c3872, int i) {
        this.f9982 = i;
        this.f9981 = c3872;
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7084(Object obj, int i, int i2, C9226 c9226) {
        switch (this.f9982) {
            case 0:
                C3872 c3872 = this.f9981;
                return c3872.m7144(new C0955((ByteBuffer) obj, c3872.f10029, c3872.f10030, 11), i, i2, c9226, C3872.f10027);
            default:
                C3872 c38722 = this.f9981;
                return c38722.m7144(new C0955((ParcelFileDescriptor) obj, c38722.f10029, c38722.f10030), i, i2, c9226, C3872.f10027);
        }
    }

    @Override // p302.InterfaceC9229
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7085(Object obj, C9226 c9226) {
        switch (this.f9982) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
