package yyds;

import java.io.File;
import java.io.IOException;
import java.net.SocketException;

/* JADX INFO: renamed from: yyds.ᲀᲇᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2115 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f10454;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f10455;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f10456;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f10457;

    public C2115(C0016 c0016, C0725 c0725) {
        this.f10457 = c0016;
        this.f10455 = c0725;
        this.f10456 = c0725.f3386 ? null : new boolean[c0016.f2682];
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static IOException m4031(C2115 c2115, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            c2115.m4035(iOException);
        }
        if (z3) {
            AbstractC2740 abstractC2740 = ((C2729) c2115.f10455).f13425;
            if (iOException != null) {
                abstractC2740.getClass();
            } else {
                abstractC2740.getClass();
            }
        }
        if (z2) {
            AbstractC2740 abstractC27402 = ((C2729) c2115.f10455).f13425;
            if (iOException != null) {
                abstractC27402.getClass();
            } else {
                abstractC27402.getClass();
            }
        }
        return ((C2729) c2115.f10455).m4860(c2115, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public C2133 m4032() throws SocketException {
        C2729 c2729 = (C2729) this.f10455;
        if (c2729.f13420) {
            C0188.m800("Check failed.");
            return null;
        }
        c2729.f13420 = true;
        c2729.f13417.m978();
        synchronized (c2729) {
            if (c2729.f13413 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (c2729.f13424 || c2729.f13416) {
                throw new IllegalStateException("Check failed.");
            }
            if (c2729.f13408) {
                throw new IllegalStateException("Check failed.");
            }
            if (!c2729.f13414) {
                throw new IllegalStateException("Check failed.");
            }
            c2729.f13414 = false;
            c2729.f13424 = true;
            c2729.f13416 = true;
        }
        C2723 c2723 = (C2723) ((InterfaceC2121) this.f10457).mo717();
        c2723.f13379.setSoTimeout(0);
        c2723.mo3290();
        return new C2133(this);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0627 m4033(C0837 c0837) throws IOException {
        C2115 c2115;
        String strM3306;
        long jMo707;
        try {
            strM3306 = c0837.f3847.m3306("Content-Type");
            if (strM3306 == null) {
                strM3306 = null;
            }
            jMo707 = ((InterfaceC2121) this.f10457).mo707(c0837);
            c2115 = this;
        } catch (IOException e) {
            e = e;
            c2115 = this;
        }
        try {
            return new C0627(strM3306, jMo707, new C2066(new C1770(c2115, ((InterfaceC2121) this.f10457).mo708(c0837), jMo707, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((C2729) c2115.f10455).f13425.getClass();
            c2115.m4035(iOException);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m4034() {
        ((C0016) this.f10457).m1430(this, false);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void m4035(IOException iOException) {
        this.f10454 = true;
        ((InterfaceC2121) this.f10457).mo717().mo3292((C2729) this.f10455, iOException);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2723 m4036() {
        InterfaceC1604 interfaceC1604Mo717 = ((InterfaceC2121) this.f10457).mo717();
        C2723 c2723 = interfaceC1604Mo717 instanceof C2723 ? (C2723) interfaceC1604Mo717 : null;
        if (c2723 != null) {
            return c2723;
        }
        C0188.m800("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2294 m4037(boolean z) throws IOException {
        try {
            C2294 c2294Mo715 = ((InterfaceC2121) this.f10457).mo715(z);
            if (c2294Mo715 == null) {
                return c2294Mo715;
            }
            c2294Mo715.f11259 = this;
            return c2294Mo715;
        } catch (IOException e) {
            ((C2729) this.f10455).f13425.getClass();
            m4035(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public File m4038() {
        File fileM1667;
        synchronized (((C0016) this.f10457)) {
            try {
                C0725 c0725 = (C0725) this.f10455;
                if (c0725.f3391 != this) {
                    throw new IllegalStateException();
                }
                if (!c0725.f3386) {
                    ((boolean[]) this.f10456)[0] = true;
                }
                fileM1667 = c0725.m1667(0);
                ((C0016) this.f10457).f2690.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileM1667;
    }

    public C2115(C0716 c0716, C2487 c2487) {
        this.f10457 = new C0750(this);
        this.f10456 = c0716;
        this.f10455 = c2487;
    }

    public C2115(C2729 c2729, InterfaceC1028 interfaceC1028, InterfaceC2121 interfaceC2121) {
        this.f10455 = c2729;
        this.f10456 = interfaceC1028;
        this.f10457 = interfaceC2121;
    }
}
