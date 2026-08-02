package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class eb implements p60, qm1, zk, kh1, z10, a90, wa0, ui0, n92 {
    public static volatile eb i;
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [af0.a():a90, bf0.<init>(yd1, n4, aq0, aq0, aq0, aq0):void, com.bumptech.glide.a.b(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void, f20.<clinit>():void, fb.<clinit>():void, l41.<clinit>():void, nx.<clinit>():void, op0.<clinit>():void, rp0.<clinit>():void, s11.<clinit>():void, sp0.<clinit>():void, sx0.<clinit>():void, t11.s(com.bumptech.glide.a, java.util.ArrayList):v72, v72.<init>():void] */
    public /* synthetic */ eb(int i2) {
        this.h = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void r(wg wgVar) {
        dk dkVar = wg.h;
        if (wg.i == null) {
            wg.i = new wg();
            vg vgVar = new vg("Okio Watchdog");
            vgVar.setDaemon(true);
            vgVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j = wgVar.c;
        boolean z = wgVar.a;
        if (j != 0 && z) {
            wgVar.g = Math.min(j, wgVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            wgVar.g = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            wgVar.g = wgVar.c();
        }
        dk dkVar2 = wg.h;
        int i2 = dkVar2.i + 1;
        dkVar2.i = i2;
        wg[] wgVarArr = (wg[]) dkVar2.j;
        if (i2 == wgVarArr.length) {
            wg[] wgVarArr2 = new wg[i2 * 2];
            mg.f0(wgVarArr, wgVarArr2, 0, 0, 14);
            dkVar2.j = wgVarArr2;
        }
        dkVar2.l(i2, wgVar);
        if (wgVar.f == 1) {
            wg.k.signal();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float s(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        int i3 = i2 - 1;
        if (i3 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i3 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i3];
            float f10 = fArr[i2];
            f2 = fArr2[i3];
            f3 = f9;
            f4 = fArr2[i2];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wg u() throws InterruptedException {
        dk dkVar = wg.h;
        wg wgVar = ((wg[]) dkVar.j)[1];
        if (wgVar == null) {
            long jNanoTime = System.nanoTime();
            wg.k.await(wg.l, TimeUnit.MILLISECONDS);
            if (((wg[]) dkVar.j)[1] != null || System.nanoTime() - jNanoTime < wg.m) {
                return null;
            }
            return wg.i;
        }
        long jNanoTime2 = wgVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            wg.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        dkVar.v(wgVar);
        wgVar.e = 2;
        return wgVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static no y(String str) {
        if (str.length() % 2 != 0) {
            s.c("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (op0.d(str.charAt(i3 + 1)) + (op0.d(str.charAt(i3)) << 4));
        }
        return new no(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static no z(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(wq.a);
        bytes.getClass();
        no noVar = new no(bytes);
        noVar.j = str;
        return noVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ui0
    public Class a() {
        return InputStream.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.p60
    public boolean b(SSLSocket sSLSocket) {
        return wv2.d0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.p60
    public zs2 c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new fb(superclass);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a90
    public File d(a51 a51Var) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zk
    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zk
    public Bitmap f(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zk
    public void h(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n92
    public d92 i(d92 d92Var, ov1 ov1Var) {
        return new wc(lo.d(((yo0) d92Var.get()).h.a.a.d.asReadOnlyBuffer()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ui0
    public Object m(File file) {
        return new FileInputStream(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ui0
    public void o(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        switch (this.h) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new ao(0, new z8(6));
            case 7:
                return new ao(0, new z8(7));
            default:
                return new b83(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(ga1 ga1Var) {
        ga1Var.x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 11:
                return "Empty";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long v(long j, long j2) {
        float fT = eu.t(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fT)) << 32) | (((long) Float.floatToRawIntBits(fT)) & 4294967295L);
        int i2 = dd2.a;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List w(Executor executor) {
        return Collections.singletonList(new b50(executor));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List x() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.zk
    public void n() {
    }

    @Override // defpackage.wa0
    public void p() {
    }

    private final void A(Object obj) {
    }

    @Override // defpackage.zk
    public void k(int i2) {
    }

    @Override // defpackage.wa0
    public void g(zk zkVar, Bitmap bitmap) {
    }

    @Override // defpackage.a90
    public void j(a51 a51Var, b5 b5Var) {
    }
}
