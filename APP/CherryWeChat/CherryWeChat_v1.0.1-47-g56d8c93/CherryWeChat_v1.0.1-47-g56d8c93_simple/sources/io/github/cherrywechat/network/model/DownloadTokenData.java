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
    public static final Companion Companion = null;
    private final String token;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return DownloadTokenData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadTokenData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DownloadTokenData copy$default(DownloadTokenData r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.token;
    L6:
        return r0.copy(r1);
    }

    public static final /* synthetic */ void write$Self$app_release(DownloadTokenData r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r12 = r1.token;
        r2.m1842d();
        return;
    L6:
        if (AbstractC0585Nj.m1134a(r1.token, "") == false) goto L7;
    }

    public final String component1() {
        return this.token;
    }

    public final DownloadTokenData copy(String r2) {
        return new DownloadTokenData(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof DownloadTokenData) == true) goto L9;
        return false;
    L9:
        if (AbstractC0585Nj.m1134a(this.token, ((DownloadTokenData) r4).token) == true) goto L11;
        return false;
    L11:
        return true;
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

    public /* synthetic */ DownloadTokenData(int r1, String r2, AbstractC0298Gx r3) {
        if ((r1 & 1) != 0) goto L6;
        this.token = "";
        return;
    L6:
        this.token = r2;
    }

    public DownloadTokenData(String r1) {
        this.token = r1;
    }

    public /* synthetic */ DownloadTokenData(String r1, int r2, AbstractC0621Oc r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
