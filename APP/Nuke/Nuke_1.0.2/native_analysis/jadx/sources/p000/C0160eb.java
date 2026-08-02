package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: eb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0160eb implements p60, qm1, InterfaceC0965zk, kh1, z10, a90, wa0, ui0, n92 {

    /* JADX INFO: renamed from: i */
    public static volatile C0160eb f2377i;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2378h;

    public /* synthetic */ C0160eb(int i) {
        this.f2378h = i;
    }

    /* JADX INFO: renamed from: r */
    public static final void m1317r(C0846wg c0846wg) {
        C0133dk c0133dk = C0846wg.f12495h;
        if (C0846wg.f12496i == null) {
            C0846wg.f12496i = new C0846wg();
            C0809vg c0809vg = new C0809vg("Okio Watchdog");
            c0809vg.setDaemon(true);
            c0809vg.start();
        }
        long jNanoTime = System.nanoTime();
        long j = c0846wg.f7458c;
        boolean z = c0846wg.f7456a;
        if (j != 0 && z) {
            c0846wg.f12503g = Math.min(j, c0846wg.mo3475c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c0846wg.f12503g = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            c0846wg.f12503g = c0846wg.mo3475c();
        }
        C0133dk c0133dk2 = C0846wg.f12495h;
        int i = c0133dk2.f2081i + 1;
        c0133dk2.f2081i = i;
        C0846wg[] c0846wgArr = (C0846wg[]) c0133dk2.f2082j;
        if (i == c0846wgArr.length) {
            C0846wg[] c0846wgArr2 = new C0846wg[i * 2];
            AbstractC0460mg.m3091f0(c0846wgArr, c0846wgArr2, 0, 0, 14);
            c0133dk2.f2082j = c0846wgArr2;
        }
        c0133dk2.m1038l(i, c0846wg);
        if (c0846wg.f12502f == 1) {
            C0846wg.f12498k.signal();
        }
    }

    /* JADX INFO: renamed from: s */
    public static final float m1318s(float f, float[] fArr, float[] fArr2) {
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
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX INFO: renamed from: u */
    public static C0846wg m1319u() throws InterruptedException {
        C0133dk c0133dk = C0846wg.f12495h;
        C0846wg c0846wg = ((C0846wg[]) c0133dk.f2082j)[1];
        if (c0846wg == null) {
            long jNanoTime = System.nanoTime();
            C0846wg.f12498k.await(C0846wg.f12499l, TimeUnit.MILLISECONDS);
            if (((C0846wg[]) c0133dk.f2082j)[1] != null || System.nanoTime() - jNanoTime < C0846wg.f12500m) {
                return null;
            }
            return C0846wg.f12496i;
        }
        long jNanoTime2 = c0846wg.f12503g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C0846wg.f12498k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c0133dk.m1044v(c0846wg);
        c0846wg.f12501e = 2;
        return c0846wg;
    }

    /* JADX INFO: renamed from: y */
    public static C0505no m1320y(String str) {
        if (str.length() % 2 != 0) {
            C0676s.m4645c("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (op0.m3582d(str.charAt(i2 + 1)) + (op0.m3582d(str.charAt(i2)) << 4));
        }
        return new C0505no(bArr);
    }

    /* JADX INFO: renamed from: z */
    public static C0505no m1321z(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(AbstractC0856wq.f12612a);
        bytes.getClass();
        C0505no c0505no = new C0505no(bytes);
        c0505no.f7269j = str;
        return c0505no;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: a */
    public Class mo1322a() {
        return InputStream.class;
    }

    @Override // p000.p60
    /* JADX INFO: renamed from: b */
    public boolean mo312b(SSLSocket sSLSocket) {
        return wv2.m6012d0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p000.p60
    /* JADX INFO: renamed from: c */
    public zs2 mo313c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C0197fb(superclass);
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: d */
    public File mo112d(a51 a51Var) {
        return null;
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: e */
    public Bitmap mo1323e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: f */
    public Bitmap mo1324f(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: h */
    public void mo1325h(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p000.n92
    /* JADX INFO: renamed from: i */
    public d92 mo422i(d92 d92Var, ov1 ov1Var) {
        return new C0842wc(AbstractC0431lo.m2953d(((yo0) d92Var.get()).f13536h.f13087a.f2532a.f1023d.asReadOnlyBuffer()));
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: m */
    public Object mo1327m(File file) {
        return new FileInputStream(file);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: o */
    public void mo1329o(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // p000.kh1
    /* JADX INFO: renamed from: q */
    public jh1 mo1330q(kj1 kj1Var) {
        switch (this.f2378h) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new C0025ao(0, new C0953z8(6));
            case 7:
                return new C0025ao(0, new C0953z8(7));
            default:
                return new b83(1);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m1331t(ga1 ga1Var) {
        ga1Var.mo881x();
    }

    public String toString() {
        switch (this.f2378h) {
            case 11:
                return "Empty";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public long m1332v(long j, long j2) {
        float fM1470t = AbstractC0179eu.m1470t(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM1470t)) << 32) | (((long) Float.floatToRawIntBits(fM1470t)) & 4294967295L);
        int i = dd2.f2002a;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: w */
    public List mo1333w(Executor executor) {
        return Collections.singletonList(new b50(executor));
    }

    /* JADX INFO: renamed from: x */
    public List mo1334x() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: n */
    public void mo1328n() {
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: p */
    public void mo1107p() {
    }

    /* JADX INFO: renamed from: A */
    private final void m1316A(Object obj) {
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: k */
    public void mo1326k(int i) {
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: g */
    public void mo1104g(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap) {
    }

    @Override // p000.a90
    /* JADX INFO: renamed from: j */
    public void mo113j(a51 a51Var, C0043b5 c0043b5) {
    }
}
