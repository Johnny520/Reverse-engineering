package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: iz */
/* JADX INFO: loaded from: classes.dex */
public final class C2077iz implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7332a;

    /* JADX INFO: renamed from: b */
    public final C2306o6 f7333b;

    /* JADX INFO: renamed from: c */
    public final C2812zp f7334c;

    public C2077iz(ArrayList arrayList, C2306o6 c2306o6, C2812zp c2812zp) {
        this.f7332a = arrayList;
        this.f7333b = c2306o6;
        this.f7334c = c2812zp;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2389pw mo749a(Object obj, int i, int i2, C2644vt c2644vt) {
        byte[] byteArray;
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            bArr = new byte[16384];
        } catch (IOException unused) {
            byteArray = null;
        }
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i3);
            if (byteArray != null) {
                return null;
            }
            return this.f7333b.mo749a(ByteBuffer.wrap(byteArray), i, i2, c2644vt);
        }
        byteArrayOutputStream.flush();
        byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
        }
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object obj, C2644vt c2644vt) {
        return !((Boolean) c2644vt.m5177c(AbstractC0456Kj.f1499b)).booleanValue() && AbstractC1406fG.m2697W(this.f7332a, (InputStream) obj, this.f7334c) == ImageHeaderParser$ImageType.GIF;
    }
}
