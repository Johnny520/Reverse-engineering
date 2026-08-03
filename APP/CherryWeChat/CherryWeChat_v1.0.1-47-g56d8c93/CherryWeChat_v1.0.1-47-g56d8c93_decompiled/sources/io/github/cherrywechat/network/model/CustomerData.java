package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class CustomerData {
    private final String accessToken;
    private final List<AuthorizedThemeData> authorizedThemes;
    private final CustomerInfo customer;
    private final long expires;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, null, AbstractC0148Dc.m280n(2, new C1302d(8))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return CustomerData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public CustomerData() {
        this((CustomerInfo) null, (String) null, 0L, (List) null, 15, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(AuthorizedThemeData$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerData copy$default(CustomerData customerData, CustomerInfo customerInfo, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            customerInfo = customerData.customer;
        }
        if ((i & 2) != 0) {
            str = customerData.accessToken;
        }
        if ((i & 4) != 0) {
            j = customerData.expires;
        }
        if ((i & 8) != 0) {
            list = customerData.authorizedThemes;
        }
        List list2 = list;
        return customerData.copy(customerInfo, str, j, list2);
    }

    public static final /* synthetic */ void write$Self$app_release(CustomerData customerData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || customerData.customer != null) {
            CustomerInfo$$serializer customerInfo$$serializer = CustomerInfo$$serializer.INSTANCE;
            CustomerInfo customerInfo = customerData.customer;
            interfaceC0962Wa.m1844f();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(customerData.accessToken, "")) {
            String str = customerData.accessToken;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || customerData.expires != 0) {
            long j = customerData.expires;
            interfaceC0962Wa.m1841c();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(customerData.authorizedThemes, C0452Kf.f1484a)) {
            return;
        }
        List<AuthorizedThemeData> list = customerData.authorizedThemes;
        interfaceC0962Wa.m1839a();
    }

    public final CustomerInfo component1() {
        return this.customer;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final long component3() {
        return this.expires;
    }

    public final List<AuthorizedThemeData> component4() {
        return this.authorizedThemes;
    }

    public final CustomerData copy(CustomerInfo customerInfo, String str, long j, List<AuthorizedThemeData> list) {
        return new CustomerData(customerInfo, str, j, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerData)) {
            return false;
        }
        CustomerData customerData = (CustomerData) obj;
        return AbstractC0585Nj.m1134a(this.customer, customerData.customer) && AbstractC0585Nj.m1134a(this.accessToken, customerData.accessToken) && this.expires == customerData.expires && AbstractC0585Nj.m1134a(this.authorizedThemes, customerData.authorizedThemes);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final List<AuthorizedThemeData> getAuthorizedThemes() {
        return this.authorizedThemes;
    }

    public final CustomerInfo getCustomer() {
        return this.customer;
    }

    public final long getExpires() {
        return this.expires;
    }

    public int hashCode() {
        CustomerInfo customerInfo = this.customer;
        return this.authorizedThemes.hashCode() + ((Long.hashCode(this.expires) + AbstractC2374ph.m4810g(this.accessToken, (customerInfo == null ? 0 : customerInfo.hashCode()) * 31, 31)) * 31);
    }

    public String toString() {
        return "CustomerData(customer=" + this.customer + ", accessToken=" + this.accessToken + ", expires=" + this.expires + ", authorizedThemes=" + this.authorizedThemes + ')';
    }

    public /* synthetic */ CustomerData(int i, CustomerInfo customerInfo, String str, long j, List list, AbstractC0298Gx abstractC0298Gx) {
        this.customer = (i & 1) == 0 ? null : customerInfo;
        if ((i & 2) == 0) {
            this.accessToken = "";
        } else {
            this.accessToken = str;
        }
        if ((i & 4) == 0) {
            this.expires = 0L;
        } else {
            this.expires = j;
        }
        if ((i & 8) == 0) {
            this.authorizedThemes = C0452Kf.f1484a;
        } else {
            this.authorizedThemes = list;
        }
    }

    public CustomerData(CustomerInfo customerInfo, String str, long j, List<AuthorizedThemeData> list) {
        this.customer = customerInfo;
        this.accessToken = str;
        this.expires = j;
        this.authorizedThemes = list;
    }

    public /* synthetic */ CustomerData(CustomerInfo customerInfo, String str, long j, List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? null : customerInfo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? C0452Kf.f1484a : list);
    }
}
