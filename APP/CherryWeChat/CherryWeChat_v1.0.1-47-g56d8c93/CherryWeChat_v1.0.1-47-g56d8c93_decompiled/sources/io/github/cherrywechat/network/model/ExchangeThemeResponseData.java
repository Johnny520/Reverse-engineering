package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C2521sz;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ExchangeThemeResponseData {
    public static final Companion Companion = new Companion(null);
    private final String baiduInputSkinLink;

    /* JADX INFO: renamed from: id */
    private final String f5567id;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ExchangeThemeResponseData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public ExchangeThemeResponseData() {
        this((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ ExchangeThemeResponseData copy$default(ExchangeThemeResponseData exchangeThemeResponseData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeThemeResponseData.name;
        }
        if ((i & 2) != 0) {
            str2 = exchangeThemeResponseData.f5567id;
        }
        if ((i & 4) != 0) {
            str3 = exchangeThemeResponseData.baiduInputSkinLink;
        }
        return exchangeThemeResponseData.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app_release(ExchangeThemeResponseData exchangeThemeResponseData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || exchangeThemeResponseData.name != null) {
            C2521sz c2521sz = C2521sz.f8819a;
            String str = exchangeThemeResponseData.name;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || exchangeThemeResponseData.f5567id != null) {
            C2521sz c2521sz2 = C2521sz.f8819a;
            String str2 = exchangeThemeResponseData.f5567id;
            interfaceC0962Wa.m1844f();
        }
        if (!interfaceC0962Wa.m1845g() && exchangeThemeResponseData.baiduInputSkinLink == null) {
            return;
        }
        C2521sz c2521sz3 = C2521sz.f8819a;
        String str3 = exchangeThemeResponseData.baiduInputSkinLink;
        interfaceC0962Wa.m1844f();
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.f5567id;
    }

    public final String component3() {
        return this.baiduInputSkinLink;
    }

    public final ExchangeThemeResponseData copy(String str, String str2, String str3) {
        return new ExchangeThemeResponseData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeThemeResponseData)) {
            return false;
        }
        ExchangeThemeResponseData exchangeThemeResponseData = (ExchangeThemeResponseData) obj;
        return AbstractC0585Nj.m1134a(this.name, exchangeThemeResponseData.name) && AbstractC0585Nj.m1134a(this.f5567id, exchangeThemeResponseData.f5567id) && AbstractC0585Nj.m1134a(this.baiduInputSkinLink, exchangeThemeResponseData.baiduInputSkinLink);
    }

    public final String getBaiduInputSkinLink() {
        return this.baiduInputSkinLink;
    }

    public final String getId() {
        return this.f5567id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5567id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.baiduInputSkinLink;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExchangeThemeResponseData(name=");
        sb.append(this.name);
        sb.append(", id=");
        sb.append(this.f5567id);
        sb.append(", baiduInputSkinLink=");
        return AbstractC2374ph.m4815l(sb, this.baiduInputSkinLink, ')');
    }

    public /* synthetic */ ExchangeThemeResponseData(int i, String str, String str2, String str3, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.f5567id = null;
        } else {
            this.f5567id = str2;
        }
        if ((i & 4) == 0) {
            this.baiduInputSkinLink = null;
        } else {
            this.baiduInputSkinLink = str3;
        }
    }

    public ExchangeThemeResponseData(String str, String str2, String str3) {
        this.name = str;
        this.f5567id = str2;
        this.baiduInputSkinLink = str3;
    }

    public /* synthetic */ ExchangeThemeResponseData(String str, String str2, String str3, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
