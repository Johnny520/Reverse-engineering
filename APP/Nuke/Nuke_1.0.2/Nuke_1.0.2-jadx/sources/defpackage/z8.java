package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 implements wl0, wf, yf, we0, e33, z10, na0, sh0, ui0, j92 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z8() {
        this.h = 4;
        new xd1(16);
        long[] jArr = ed2.a;
        new rk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ps g(z8 z8Var, String str) {
        ps psVar = new ps(str);
        ps.d.put(str, psVar);
        return psVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ByteArrayInputStream i(String str) {
        if (!str.startsWith("data:image")) {
            s.j("Not a valid image data URL.");
            return null;
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            s.j("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        s.j("Not a base64 image data URL.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bb1 l(List list) {
        return new bb1(list, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ui0
    public Class a() {
        switch (this.h) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ByteBuffer.class;
            case 7:
                return InputStream.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wf, defpackage.yf
    public float b() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.we0
    public boolean c(Object obj, File file, ov1 ov1Var) {
        switch (this.h) {
            case 8:
                try {
                    lo.e((ByteBuffer) obj, file);
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferEncoder", 3)) {
                        Log.d("ByteBufferEncoder", "Failed to write data", e);
                    }
                    return false;
                }
                break;
            default:
                try {
                    lo.e(((yo0) ((d92) obj).get()).h.a.a.d.asReadOnlyBuffer(), file);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.na0
    public List d(String str) throws UnknownHostException {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return mg.t0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wf
    public void e(pf1 pf1Var, int i, int[] iArr, d61 d61Var, int[] iArr2) {
        if (d61Var == d61.h) {
            tp0.C(i, iArr, iArr2, false);
        } else {
            tp0.C(i, iArr, iArr2, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yf
    public void f(int i, pf1 pf1Var, int[] iArr, int[] iArr2) {
        tp0.C(i, iArr, iArr2, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j92
    public int h(ov1 ov1Var) {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized ps j(String str) {
        ps psVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = ps.d;
            psVar = (ps) linkedHashMap.get(str);
            if (psVar == null) {
                psVar = (ps) linkedHashMap.get(wv2.d0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : wv2.d0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (psVar == null) {
                    psVar = new ps(str);
                }
                linkedHashMap.put(str, psVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return psVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sh0
    public Object k() {
        return new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ui0
    public Object m(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ui0
    public void o(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 3:
                return "Arrangement#Center";
            case 12:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [cg0.<clinit>():void, com.bumptech.glide.a.<init>(android.content.Context, bf0, yd1, zk, td1, y82, eb, eb, hg, java.util.List, java.util.ArrayList, p7, n4):void, eb.q(kj1):jh1, ff0.<clinit>():void, n4.<init>(int):void, na0.<clinit>():void, op0.<clinit>():void, pf.<clinit>():void, ps.<clinit>():void, sz0.B(java.lang.ClassLoader, java.io.File):java.lang.ClassLoader, t11.s(com.bumptech.glide.a, java.util.ArrayList):v72, tp0.<clinit>():void] */
    public /* synthetic */ z8(int i) {
        this.h = i;
    }
}
