package androidx.compose.foundation.lazy.layout;

import androidx.compose.p001ui.layout.C2554;
import com.bumptech.glide.load.engine.C3836;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p023.C6961;
import p027.C7032;
import p027.C7036;
import p027.InterfaceC7039;
import p028.InterfaceC7044;
import p028.InterfaceC7045;
import p248.C8892;
import p248.C8897;
import p304.C9239;
import p304.C9240;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1575 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f2414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f2415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f2416;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2417;

    public C1575() {
        this.f2416 = new Object();
        this.f2415 = new ArrayList();
        this.f2414 = new ArrayList();
        this.f2417 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static IOException m2096(C1575 c1575, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            c1575.m2097(iOException);
        }
        return ((C7032) c1575.f2416).m12200(c1575, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m2097(IOException iOException) {
        this.f2417 = true;
        ((InterfaceC7044) this.f2414).mo12226().mo12178((C7032) this.f2416, iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6961 m2098(boolean z) throws IOException {
        try {
            C6961 c6961Mo12221 = ((InterfaceC7044) this.f2414).mo12221(z);
            if (c6961Mo12221 == null) {
                return c6961Mo12221;
            }
            c6961Mo12221.f17125 = this;
            return c6961Mo12221;
        } catch (IOException e) {
            m2097(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public File m2099() {
        File file;
        synchronized (((C9239) this.f2414)) {
            try {
                C9240 c9240 = (C9240) this.f2416;
                if (c9240.f23648 != this) {
                    throw new IllegalStateException();
                }
                if (!c9240.f23649) {
                    ((boolean[]) this.f2415)[0] = true;
                }
                file = c9240.f23650[0];
                ((C9239) this.f2414).f23647.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7036 m2100() {
        InterfaceC7045 interfaceC7045Mo12226 = ((InterfaceC7044) this.f2414).mo12226();
        C7036 c7036 = interfaceC7045Mo12226 instanceof C7036 ? (C7036) interfaceC7045Mo12226 : null;
        if (c7036 != null) {
            return c7036;
        }
        C6755.m11870("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2101() {
        C9239.m14538((C9239) this.f2414, this, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C5703 m2102() throws SocketException {
        C7032 c7032 = (C7032) this.f2416;
        if (c7032.f17427) {
            C6755.m11870("Check failed.");
            return null;
        }
        c7032.f17427 = true;
        c7032.f17425.m12054();
        synchronized (c7032) {
            if (c7032.f17422 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (c7032.f17417 || c7032.f17416) {
                throw new IllegalStateException("Check failed.");
            }
            if (c7032.f17419) {
                throw new IllegalStateException("Check failed.");
            }
            if (!c7032.f17418) {
                throw new IllegalStateException("Check failed.");
            }
            c7032.f17418 = false;
            c7032.f17417 = true;
            c7032.f17416 = true;
        }
        InterfaceC7045 interfaceC7045Mo12226 = ((InterfaceC7044) this.f2414).mo12226();
        interfaceC7045Mo12226.getClass();
        C7036 c7036 = (C7036) interfaceC7045Mo12226;
        c7036.f17455.setSoTimeout(0);
        c7036.mo12180();
        return new C5703(this);
    }

    public C1575(C7032 c7032, InterfaceC7039 interfaceC7039, InterfaceC7044 interfaceC7044) {
        interfaceC7039.getClass();
        this.f2416 = c7032;
        this.f2415 = interfaceC7039;
        this.f2414 = interfaceC7044;
    }

    public C1575(C3836 c3836, C8892 c8892) {
        this.f2414 = new C8897(this);
        this.f2415 = c3836;
        this.f2416 = c8892;
    }

    public C1575(C1552 c1552, C2554 c2554, InterfaceC1576 interfaceC1576) {
        this.f2416 = c1552;
        this.f2415 = c2554;
        this.f2414 = interfaceC1576;
        this.f2417 = true;
    }

    public C1575(C9239 c9239, C9240 c9240) {
        this.f2414 = c9239;
        this.f2416 = c9240;
        this.f2415 = c9240.f23649 ? null : new boolean[c9239.f23644];
    }
}
