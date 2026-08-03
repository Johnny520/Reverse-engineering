package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class CustomerInfo {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id */
    private final String f5566id;
    private final String status;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return CustomerInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerInfo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerInfo.f5566id;
        }
        if ((i & 2) != 0) {
            str2 = customerInfo.status;
        }
        return customerInfo.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app_release(CustomerInfo customerInfo, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(customerInfo.f5566id, "")) {
            String str = customerInfo.f5566id;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(customerInfo.status, "")) {
            return;
        }
        String str2 = customerInfo.status;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.f5566id;
    }

    public final String component2() {
        return this.status;
    }

    public final CustomerInfo copy(String str, String str2) {
        return new CustomerInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerInfo)) {
            return false;
        }
        CustomerInfo customerInfo = (CustomerInfo) obj;
        return AbstractC0585Nj.m1134a(this.f5566id, customerInfo.f5566id) && AbstractC0585Nj.m1134a(this.status, customerInfo.status);
    }

    public final String getId() {
        return this.f5566id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.f5566id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomerInfo(id=");
        sb.append(this.f5566id);
        sb.append(", status=");
        return AbstractC2374ph.m4815l(sb, this.status, ')');
    }

    public /* synthetic */ CustomerInfo(int i, String str, String str2, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.f5566id = "";
        } else {
            this.f5566id = str;
        }
        if ((i & 2) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
    }

    public CustomerInfo(String str, String str2) {
        this.f5566id = str;
        this.status = str2;
    }

    public /* synthetic */ CustomerInfo(String str, String str2, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
