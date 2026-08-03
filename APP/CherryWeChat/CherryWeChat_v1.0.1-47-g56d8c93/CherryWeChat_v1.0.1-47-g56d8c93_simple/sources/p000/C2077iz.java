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

    public C2077iz(ArrayList r1, C2306o6 r2, C2812zp r3) {
        this.f7332a = r1;
        this.f7333b = r2;
        this.f7334c = r3;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object r6, int r7, int r8, C2644vt r9) {
        InputStream r62 = (InputStream) r6;
        ByteArrayOutputStream r0 = new ByteArrayOutputStream(16384);
        byte[] r1 = new byte[16384];     // Catch: IOException -> L9
    L4:
        int r3 = r62.read(r1);     // Catch: IOException -> L9
        if (r3 == (-1)) goto L7;
        r0.write(r1, 0, r3);     // Catch: IOException -> L9
        goto L4
    L7:
        r0.flush();     // Catch: IOException -> L9
        byte[] r63 = r0.toByteArray();
    L10:
        if (r63 != null) goto L13;
        return null;
    L13:
        return this.f7333b.mo749a(ByteBuffer.wrap(r63), r7, r8, r9);
    L9:
        r63 = null;
        goto L10
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object r2, C2644vt r3) {
        InputStream r22 = (InputStream) r2;
        if (((Boolean) r3.m5177c(AbstractC0456Kj.f1499b)).booleanValue() == false) goto L5;
        return false;
    L5:
        if (AbstractC1406fG.m2697W(this.f7332a, r22, this.f7334c) != ImageHeaderParser$ImageType.GIF) goto L10;
        return true;
    L10:
        return false;
    }
}
