package p000;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: I2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0347I2 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1163a;

    /* JADX INFO: renamed from: b */
    public final C0649P3 f1164b;

    public /* synthetic */ C0347I2(C0649P3 r1, int r2) {
        this.f1163a = r2;
        this.f1164b = r1;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object r2, int r3, int r4, C2644vt r5) {
        switch(this.f1163a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return C0649P3.m1270l(ImageDecoder.createSource(AbstractC2529t6.m5010b((InputStream) r2)), r3, r4, r5);
    L7:
        return C0649P3.m1270l(ImageDecoder.createSource((ByteBuffer) r2), r3, r4, r5);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object r2, C2644vt r3) {
        switch(this.f1163a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        C0649P3 r32 = this.f1164b;
        ArrayList r0 = (ArrayList) r32.f2089b;
        ImageHeaderParser$ImageType r22 = AbstractC1406fG.m2697W(r0, (InputStream) r2, (C2812zp) r32.f2090c);
        if (r22 != ImageHeaderParser$ImageType.ANIMATED_WEBP) goto L7;
    L12:
        return true;
    L7:
        if (Build.VERSION.SDK_INT >= 31) goto L9;
    L11:
        return false;
    L9:
        if (r22 != ImageHeaderParser$ImageType.ANIMATED_AVIF) goto L11;
    L14:
        ArrayList r33 = (ArrayList) this.f1164b.f2089b;
        ImageHeaderParser$ImageType r23 = AbstractC1406fG.m2698X(r33, (ByteBuffer) r2);
        if (r23 != ImageHeaderParser$ImageType.ANIMATED_WEBP) goto L17;
    L22:
        return true;
    L17:
        if (Build.VERSION.SDK_INT >= 31) goto L19;
    L21:
        return false;
    L19:
        if (r23 != ImageHeaderParser$ImageType.ANIMATED_AVIF) goto L21;
        goto L21
    }
}
