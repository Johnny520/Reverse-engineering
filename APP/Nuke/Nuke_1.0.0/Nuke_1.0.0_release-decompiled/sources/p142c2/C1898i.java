package p142c2;

import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.ArrayList;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p093S1.C1294f;

/* JADX INFO: renamed from: c2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1898i implements InterfaceC1149k {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6462a;

    /* JADX INFO: renamed from: b */
    public final C1890a f6463b;

    /* JADX INFO: renamed from: c */
    public final C1294f f6464c;

    public C1898i(ArrayList arrayList, C1890a c1890a, C1294f c1294f) {
        this.f6462a = arrayList;
        this.f6463b = c1890a;
        this.f6464c = c1294f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p088R1.InterfaceC1194D mo2202a(java.lang.Object r6, int r7, int r8, p078P1.C1147i r9) {
        /*
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L18
        Lc:
            int r3 = r6.read(r1)     // Catch: java.io.IOException -> L18
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.io.IOException -> L18
            goto Lc
        L18:
            r6 = move-exception
            goto L22
        L1a:
            r0.flush()     // Catch: java.io.IOException -> L18
            byte[] r6 = r0.toByteArray()
            goto L31
        L22:
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = "Error reading data from stream"
            android.util.Log.w(r1, r0, r6)
        L30:
            r6 = r2
        L31:
            if (r6 != 0) goto L34
            goto L3e
        L34:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            c2.a r0 = r5.f6463b
            R1.D r2 = r0.mo2202a(r6, r7, r8, r9)
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p142c2.C1898i.mo2202a(java.lang.Object, int, int, P1.i):R1.D");
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final boolean mo2203b(Object obj, C1147i c1147i) {
        return !((Boolean) c1147i.m2201c(AbstractC1897h.f6461b)).booleanValue() && AbstractC1922d.m3438u(this.f6462a, (InputStream) obj, this.f6464c) == ImageHeaderParser$ImageType.GIF;
    }
}
