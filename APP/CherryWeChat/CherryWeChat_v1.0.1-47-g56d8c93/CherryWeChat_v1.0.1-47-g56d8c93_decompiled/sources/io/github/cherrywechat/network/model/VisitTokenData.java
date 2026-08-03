package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class VisitTokenData {
    public static final Companion Companion = new Companion(null);
    private final String visitUrl;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return VisitTokenData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VisitTokenData() {
        this((String) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ VisitTokenData copy$default(VisitTokenData visitTokenData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = visitTokenData.visitUrl;
        }
        return visitTokenData.copy(str);
    }

    public static /* synthetic */ void getVisitUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(VisitTokenData visitTokenData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(visitTokenData.visitUrl, "")) {
            return;
        }
        String str = visitTokenData.visitUrl;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.visitUrl;
    }

    public final VisitTokenData copy(String str) {
        return new VisitTokenData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VisitTokenData) && AbstractC0585Nj.m1134a(this.visitUrl, ((VisitTokenData) obj).visitUrl);
    }

    public final String getVisitUrl() {
        return this.visitUrl;
    }

    public int hashCode() {
        return this.visitUrl.hashCode();
    }

    public String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("VisitTokenData(visitUrl="), this.visitUrl, ')');
    }

    public /* synthetic */ VisitTokenData(int i, String str, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.visitUrl = "";
        } else {
            this.visitUrl = str;
        }
    }

    public VisitTokenData(String str) {
        this.visitUrl = str;
    }

    public /* synthetic */ VisitTokenData(String str, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str);
    }
}
