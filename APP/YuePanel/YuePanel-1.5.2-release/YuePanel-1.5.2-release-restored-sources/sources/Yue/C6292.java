package Yue;

import android.content.res.Configuration;

/* JADX INFO: renamed from: Yue.ۥۡۡۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6292 {

    /* JADX INFO: renamed from: ۥ */
    public final boolean f1985;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    @InterfaceC7113(26)
    public Configuration f1986;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6292(boolean z) {
        this.f1985 = z;
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ */
    public final Configuration m2763() {
        Configuration configuration = this.f1986;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?".toString());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m2764() {
        return this.f1985;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC7113(26)
    public C6292(boolean z, @InterfaceC6399 Configuration configuration) {
        this(z);
        C5499.m17103(configuration, "newConfig");
        this.f1986 = configuration;
    }
}
