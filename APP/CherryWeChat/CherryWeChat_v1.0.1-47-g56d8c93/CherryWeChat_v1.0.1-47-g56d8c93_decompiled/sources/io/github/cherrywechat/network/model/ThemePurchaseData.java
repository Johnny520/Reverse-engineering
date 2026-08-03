package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemePurchaseData {
    public static final Companion Companion = new Companion(null);
    private final String qrCode;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemePurchaseData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemePurchaseData() {
        this((String) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ThemePurchaseData copy$default(ThemePurchaseData themePurchaseData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themePurchaseData.qrCode;
        }
        return themePurchaseData.copy(str);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemePurchaseData themePurchaseData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(themePurchaseData.qrCode, "")) {
            return;
        }
        String str = themePurchaseData.qrCode;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.qrCode;
    }

    public final ThemePurchaseData copy(String str) {
        return new ThemePurchaseData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThemePurchaseData) && AbstractC0585Nj.m1134a(this.qrCode, ((ThemePurchaseData) obj).qrCode);
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public int hashCode() {
        return this.qrCode.hashCode();
    }

    public String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("ThemePurchaseData(qrCode="), this.qrCode, ')');
    }

    public /* synthetic */ ThemePurchaseData(int i, String str, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.qrCode = "";
        } else {
            this.qrCode = str;
        }
    }

    public ThemePurchaseData(String str) {
        this.qrCode = str;
    }

    public /* synthetic */ ThemePurchaseData(String str, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str);
    }
}
