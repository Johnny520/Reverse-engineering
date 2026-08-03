package Yue;

import Yue.InterfaceC5491;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class C7031 implements InterfaceC5491.InterfaceC0776 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C7024 f2637;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final List<InterfaceC5491> f2638;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f21222;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final C4742 f21223;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7101 f21224;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f21225;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int f21226;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int f21227;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f21228;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends Yue.ۥ۠ۥۦۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7031(@InterfaceC6399 C7024 c7024, @InterfaceC6399 List<? extends InterfaceC5491> list, int i, @InterfaceC6489 C4742 c4742, @InterfaceC6399 C7101 c7101, int i2, int i3, int i4) {
        C5499.m17103(c7024, C6411.f16272);
        C5499.m17103(list, "interceptors");
        C5499.m17103(c7101, "request");
        this.f2637 = c7024;
        this.f2638 = list;
        this.f21222 = i;
        this.f21223 = c4742;
        this.f21224 = c7101;
        this.f21225 = i2;
        this.f21226 = i3;
        this.f21227 = i4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ C7031 m21884(C7031 c7031, int i, C4742 c4742, C7101 c7101, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = c7031.f21222;
        }
        if ((i5 & 2) != 0) {
            c4742 = c7031.f21223;
        }
        C4742 c47422 = c4742;
        if ((i5 & 4) != 0) {
            c7101 = c7031.f21224;
        }
        C7101 c71012 = c7101;
        if ((i5 & 8) != 0) {
            i2 = c7031.f21225;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = c7031.f21226;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = c7031.f21227;
        }
        return c7031.m21885(i, c47422, c71012, i6, i7, i4);
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    @InterfaceC6399
    public InterfaceC3645 call() {
        return this.f2637;
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5491.InterfaceC0776 mo2247(int i, @InterfaceC6399 TimeUnit timeUnit) {
        C5499.m17103(timeUnit, "unit");
        if (this.f21223 == null) {
            return m21884(this, 0, null, null, 0, 0, C8158.m26842("writeTimeout", i, timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public C7101 mo2248() {
        return this.f21224;
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo17077() {
        return this.f21226;
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public int mo17078() {
        return this.f21227;
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC5491.InterfaceC0776 mo17079(int i, @InterfaceC6399 TimeUnit timeUnit) {
        C5499.m17103(timeUnit, "unit");
        if (this.f21223 == null) {
            return m21884(this, 0, null, null, C8158.m26842("connectTimeout", i, timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public InterfaceC4107 mo17080() {
        C4742 c4742 = this.f21223;
        if (c4742 != null) {
            return c4742.m14276();
        }
        return null;
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public InterfaceC5491.InterfaceC0776 mo17081(int i, @InterfaceC6399 TimeUnit timeUnit) {
        C5499.m17103(timeUnit, "unit");
        if (this.f21223 == null) {
            return m21884(this, 0, null, null, 0, C8158.m26842("readTimeout", i, timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public int mo17082() {
        return this.f21225;
    }

    @Override // Yue.InterfaceC5491.InterfaceC0776
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public C7141 mo17083(@InterfaceC6399 C7101 c7101) throws IOException {
        C5499.m17103(c7101, "request");
        if (this.f21222 >= this.f2638.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f21228++;
        C4742 c4742 = this.f21223;
        if (c4742 != null) {
            if (!c4742.m14278().m14306(c7101.m22160())) {
                throw new IllegalStateException(("network interceptor " + this.f2638.get(this.f21222 - 1) + " must retain the same host and port").toString());
            }
            if (this.f21228 != 1) {
                throw new IllegalStateException(("network interceptor " + this.f2638.get(this.f21222 - 1) + " must call proceed() exactly once").toString());
            }
        }
        C7031 c7031M21884 = m21884(this, this.f21222 + 1, null, c7101, 0, 0, 0, 58, null);
        InterfaceC5491 interfaceC5491 = this.f2638.get(this.f21222);
        C7141 c7141Mo638 = interfaceC5491.mo638(c7031M21884);
        if (c7141Mo638 == null) {
            throw new NullPointerException("interceptor " + interfaceC5491 + " returned null");
        }
        if (this.f21223 != null && this.f21222 + 1 < this.f2638.size() && c7031M21884.f21228 != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC5491 + " must call proceed() exactly once").toString());
        }
        if (c7141Mo638.m22311() != null) {
            return c7141Mo638;
        }
        throw new IllegalStateException(("interceptor " + interfaceC5491 + " returned a response with no body").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C7031 m21885(int i, @InterfaceC6489 C4742 c4742, @InterfaceC6399 C7101 c7101, int i2, int i3, int i4) {
        C5499.m17103(c7101, "request");
        return new C7031(this.f2637, this.f2638, i, c4742, c7101, i2, i3, i4);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final C7024 m21886() {
        return this.f2637;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m21887() {
        return this.f21225;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C4742 m21888() {
        return this.f21223;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m21889() {
        return this.f21226;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final C7101 m21890() {
        return this.f21224;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m21891() {
        return this.f21227;
    }
}
