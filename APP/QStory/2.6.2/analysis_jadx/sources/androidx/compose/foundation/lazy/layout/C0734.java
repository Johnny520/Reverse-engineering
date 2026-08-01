package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.C1719;
import com.bumptech.glide.load.engine.C3003;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p013.C6177;
import p013.C6181;
import p013.InterfaceC6184;
import p015.C6205;
import p021.InterfaceC6253;
import p021.InterfaceC6254;
import p232.C8062;
import p232.C8067;
import p288.C8418;
import p288.C8419;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0734 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f2068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f2069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f2070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2071;

    public C0734() {
        this.f2070 = new Object();
        this.f2069 = new ArrayList();
        this.f2068 = new ArrayList();
        this.f2071 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static IOException m1526(C0734 c0734, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            c0734.m1527(iOException);
        }
        return ((C6177) c0734.f2070).m11622(c0734, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m1527(IOException iOException) {
        this.f2071 = true;
        ((InterfaceC6253) this.f2068).mo11737().mo11601((C6177) this.f2070, iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6205 m1528(boolean z) throws IOException {
        try {
            C6205 c6205Mo11727 = ((InterfaceC6253) this.f2068).mo11727(z);
            if (c6205Mo11727 == null) {
                return c6205Mo11727;
            }
            c6205Mo11727.f17019 = this;
            return c6205Mo11727;
        } catch (IOException e) {
            m1527(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public File m1529() {
        File file;
        synchronized (((C8418) this.f2068)) {
            try {
                C8419 c8419 = (C8419) this.f2070;
                if (c8419.f23312 != this) {
                    throw new IllegalStateException();
                }
                if (!c8419.f23313) {
                    ((boolean[]) this.f2069)[0] = true;
                }
                file = c8419.f23314[0];
                ((C8418) this.f2068).f23311.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C6181 m1530() {
        InterfaceC6254 interfaceC6254Mo11737 = ((InterfaceC6253) this.f2068).mo11737();
        C6181 c6181 = interfaceC6254Mo11737 instanceof C6181 ? (C6181) interfaceC6254Mo11737 : null;
        if (c6181 != null) {
            return c6181;
        }
        C5919.m11250("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1531() {
        C8418.m13960((C8418) this.f2068, this, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C4870 m1532() throws SocketException {
        C6177 c6177 = (C6177) this.f2070;
        if (c6177.f16877) {
            C5919.m11250("Check failed.");
            return null;
        }
        c6177.f16877 = true;
        c6177.f16875.m11502();
        synchronized (c6177) {
            if (c6177.f16872 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (c6177.f16867 || c6177.f16866) {
                throw new IllegalStateException("Check failed.");
            }
            if (c6177.f16869) {
                throw new IllegalStateException("Check failed.");
            }
            if (!c6177.f16868) {
                throw new IllegalStateException("Check failed.");
            }
            c6177.f16868 = false;
            c6177.f16867 = true;
            c6177.f16866 = true;
        }
        InterfaceC6254 interfaceC6254Mo11737 = ((InterfaceC6253) this.f2068).mo11737();
        interfaceC6254Mo11737.getClass();
        C6181 c6181 = (C6181) interfaceC6254Mo11737;
        c6181.f16902.setSoTimeout(0);
        c6181.mo11602();
        return new C4870(this);
    }

    public C0734(C6177 c6177, InterfaceC6184 interfaceC6184, InterfaceC6253 interfaceC6253) {
        interfaceC6184.getClass();
        this.f2070 = c6177;
        this.f2069 = interfaceC6184;
        this.f2068 = interfaceC6253;
    }

    public C0734(C3003 c3003, C8062 c8062) {
        this.f2068 = new C8067(this);
        this.f2069 = c3003;
        this.f2070 = c8062;
    }

    public C0734(C0711 c0711, C1719 c1719, InterfaceC0735 interfaceC0735) {
        this.f2070 = c0711;
        this.f2069 = c1719;
        this.f2068 = interfaceC0735;
        this.f2071 = true;
    }

    public C0734(C8418 c8418, C8419 c8419) {
        this.f2068 = c8418;
        this.f2070 = c8419;
        this.f2069 = c8419.f23313 ? null : new boolean[c8418.f23308];
    }
}
