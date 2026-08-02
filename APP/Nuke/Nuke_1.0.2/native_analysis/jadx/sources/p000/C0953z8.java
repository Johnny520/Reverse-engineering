package p000;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: z8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0953z8 implements wl0, InterfaceC0845wf, InterfaceC0921yf, we0, e33, z10, na0, sh0, ui0, j92 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13781h;

    public C0953z8() {
        this.f13781h = 4;
        new xd1(16);
        long[] jArr = ed2.f2401a;
        new rk1();
    }

    /* JADX INFO: renamed from: g */
    public static final C0591ps m6396g(C0953z8 c0953z8, String str) {
        C0591ps c0591ps = new C0591ps(str);
        C0591ps.f8531d.put(str, c0591ps);
        return c0591ps;
    }

    /* JADX INFO: renamed from: i */
    public static ByteArrayInputStream m6397i(String str) {
        if (!str.startsWith("data:image")) {
            C0676s.m4651j("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            C0676s.m4651j("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        C0676s.m4651j("Not a base64 image data URL.");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static bb1 m6398l(List list) {
        return new bb1(list, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: a */
    public Class mo1322a() {
        switch (this.f13781h) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ByteBuffer.class;
            case 7:
                return InputStream.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.InterfaceC0845wf, p000.InterfaceC0921yf
    /* JADX INFO: renamed from: b */
    public float mo5883b() {
        return 0.0f;
    }

    @Override // p000.we0
    /* JADX INFO: renamed from: c */
    public boolean mo2184c(Object obj, File file, ov1 ov1Var) {
        switch (this.f13781h) {
            case 8:
                try {
                    AbstractC0431lo.m2954e((ByteBuffer) obj, file);
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferEncoder", 3)) {
                        Log.d("ByteBufferEncoder", "Failed to write data", e);
                    }
                    return false;
                }
                break;
            default:
                try {
                    AbstractC0431lo.m2954e(((yo0) ((d92) obj).get()).f13536h.f13087a.f2532a.f1023d.asReadOnlyBuffer(), file);
                } catch (IOException e2) {
                    if (Log.isLoggable("GifEncoder", 5)) {
                        Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
                    }
                    return false;
                }
                break;
        }
        return false;
    }

    @Override // p000.na0
    /* JADX INFO: renamed from: d */
    public List mo2618d(String str) throws UnknownHostException {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return AbstractC0460mg.m3105t0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // p000.InterfaceC0845wf
    /* JADX INFO: renamed from: e */
    public void mo5488e(pf1 pf1Var, int i, int[] iArr, d61 d61Var, int[] iArr2) {
        if (d61Var == d61.f1885h) {
            tp0.m5341C(i, iArr, iArr2, false);
        } else {
            tp0.m5341C(i, iArr, iArr2, true);
        }
    }

    @Override // p000.InterfaceC0921yf
    /* JADX INFO: renamed from: f */
    public void mo5670f(int i, pf1 pf1Var, int[] iArr, int[] iArr2) {
        tp0.m5341C(i, iArr, iArr2, false);
    }

    @Override // p000.j92
    /* JADX INFO: renamed from: h */
    public int mo2471h(ov1 ov1Var) {
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public synchronized C0591ps m6399j(String str) {
        C0591ps c0591ps;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = C0591ps.f8531d;
            c0591ps = (C0591ps) linkedHashMap.get(str);
            if (c0591ps == null) {
                c0591ps = (C0591ps) linkedHashMap.get(wv2.m6012d0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : wv2.m6012d0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (c0591ps == null) {
                    c0591ps = new C0591ps(str);
                }
                linkedHashMap.put(str, c0591ps);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0591ps;
    }

    @Override // p000.sh0
    /* JADX INFO: renamed from: k */
    public Object mo2447k() {
        return new ArrayList();
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: m */
    public Object mo1327m(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: o */
    public void mo1329o(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public String toString() {
        switch (this.f13781h) {
            case 3:
                return "Arrangement#Center";
            case 12:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0953z8(int i) {
        this.f13781h = i;
    }
}
