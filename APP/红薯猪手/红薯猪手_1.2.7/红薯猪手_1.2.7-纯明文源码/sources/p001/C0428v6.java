package p001;

import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import p001.AbstractC0469y8;
import p001.C0215fa;
import p001.C0481z7;
import p001.InterfaceC0449x1;

/* JADX INFO: renamed from: ۟.v6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0428v6 extends AbstractC0469y8 {

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC0449x1 f1152;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0215fa f1153;

    /* JADX INFO: renamed from: ۟.v6$a */
    public static class a extends IOException {
        public a() {
            super("Received response with 0 content-length header.");
        }
    }

    public C0428v6(InterfaceC0449x1 interfaceC0449x1, C0215fa c0215fa) {
        this.f1152 = interfaceC0449x1;
        this.f1153 = c0215fa;
    }

    @Override // p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo831(C0443w8 c0443w8) {
        String scheme = c0443w8.f1842.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final int mo1251() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final AbstractC0469y8.a mo1030(C0443w8 c0443w8) throws a {
        C0481z7.e eVar = C0481z7.e.DISK;
        C0481z7.e eVar2 = C0481z7.e.NETWORK;
        InterfaceC0449x1.a aVarMo960 = this.f1152.mo960(c0443w8.f1842, c0443w8.f1841);
        if (aVarMo960 == null) {
            return null;
        }
        C0481z7.e eVar3 = aVarMo960.f1184 ? eVar : eVar2;
        InputStream inputStream = aVarMo960.f1183;
        if (inputStream == null) {
            return null;
        }
        if (eVar3 == eVar && aVarMo960.f1865 == 0) {
            StringBuilder sb = C0259ic.f866;
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            throw new a();
        }
        if (eVar3 == eVar2) {
            long j = aVarMo960.f1865;
            if (j > 0) {
                C0215fa.a aVar = this.f1153.f795;
                aVar.sendMessage(aVar.obtainMessage(4, Long.valueOf(j)));
            }
        }
        return new AbstractC0469y8.a(inputStream, eVar3);
    }

    @Override // p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final boolean mo1252(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
