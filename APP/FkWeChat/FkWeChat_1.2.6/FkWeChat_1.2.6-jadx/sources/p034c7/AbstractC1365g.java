package p034c7;

import java.util.List;
import java.util.Locale;
import p024b9.AbstractC1061t;
import p108h7.InterfaceC2891b;
import p185m8.AbstractC5114x;
import p314vb.AbstractC8899f;
import p314vb.C8895b;
import p314vb.EnumC8900g;

/* JADX INFO: renamed from: c7.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1365g {
    /* JADX INFO: renamed from: a */
    public static final List m5395a(InterfaceC1359d interfaceC1359d) {
        interfaceC1359d.getClass();
        InterfaceC2891b interfaceC2891bMo10537a = interfaceC1359d.mo5385a().mo10537a("ktor.application.modules");
        List listMo10538b = interfaceC2891bMo10537a != null ? interfaceC2891bMo10537a.mo10538b() : null;
        return listMo10538b == null ? AbstractC5114x.m20800o() : listMo10538b;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC1381o m5396b(InterfaceC1359d interfaceC1359d) {
        String lowerCase;
        String string;
        interfaceC1359d.getClass();
        InterfaceC2891b interfaceC2891bMo10537a = interfaceC1359d.mo5385a().mo10537a("ktor.application.startup");
        if (interfaceC2891bMo10537a == null || (string = interfaceC2891bMo10537a.getString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (AbstractC1061t.m3842c(lowerCase, "concurrent")) {
            return EnumC1381o.f4121r;
        }
        if (AbstractC1061t.m3842c(lowerCase, "sequential") || lowerCase == null) {
            return EnumC1381o.f4120q;
        }
        throw new IllegalStateException("Invalid startup mode: ".concat(lowerCase).toString());
    }

    /* JADX INFO: renamed from: c */
    public static final long m5397c(InterfaceC1359d interfaceC1359d) {
        String string;
        interfaceC1359d.getClass();
        InterfaceC2891b interfaceC2891bMo10537a = interfaceC1359d.mo5385a().mo10537a("ktor.application.startupTimeoutMillis");
        if (interfaceC2891bMo10537a == null || (string = interfaceC2891bMo10537a.getString()) == null) {
            C8895b.a aVar = C8895b.f29484r;
            return AbstractC8899f.m34137B(10, EnumC8900g.f29496u);
        }
        long j10 = Long.parseLong(string);
        C8895b.a aVar2 = C8895b.f29484r;
        return AbstractC8899f.m34138C(j10, EnumC8900g.f29495t);
    }
}
