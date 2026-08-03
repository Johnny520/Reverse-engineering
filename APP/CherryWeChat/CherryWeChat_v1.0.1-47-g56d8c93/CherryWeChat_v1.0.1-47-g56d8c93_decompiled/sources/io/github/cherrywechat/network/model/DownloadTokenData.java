package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadTokenData {
    public static final Companion Companion = new Companion(null);
    private final String token;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return DownloadTokenData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadTokenData() {
        this((String) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ DownloadTokenData copy$default(DownloadTokenData downloadTokenData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadTokenData.token;
        }
        return downloadTokenData.copy(str);
    }

    public static final /* synthetic */ void write$Self$app_release(DownloadTokenData downloadTokenData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(downloadTokenData.token, "")) {
            return;
        }
        String str = downloadTokenData.token;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.token;
    }

    public final DownloadTokenData copy(String str) {
        return new DownloadTokenData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DownloadTokenData) && AbstractC0585Nj.m1134a(this.token, ((DownloadTokenData) obj).token);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("DownloadTokenData(token="), this.token, ')');
    }

    public /* synthetic */ DownloadTokenData(int i, String str, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.token = "";
        } else {
            this.token = str;
        }
    }

    public DownloadTokenData(String str) {
        this.token = str;
    }

    public /* synthetic */ DownloadTokenData(String str, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str);
    }
}
