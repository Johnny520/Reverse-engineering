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
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: id */
    private final String f5566id;
    private final String status;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return CustomerInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerInfo() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CustomerInfo copy$default(CustomerInfo r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.f5566id;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.status;
    L9:
        return r0.copy(r1, r2);
    }

    public static final /* synthetic */ void write$Self$app_release(CustomerInfo r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.f5566id;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r12 = r1.status;
        r2.m1842d();
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r1.status, "") == false) goto L13;
        return;
    L6:
        if (AbstractC0585Nj.m1134a(r1.f5566id, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.f5566id;
    }

    public final String component2() {
        return this.status;
    }

    public final CustomerInfo copy(String r2, String r3) {
        return new CustomerInfo(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CustomerInfo) == true) goto L8;
        return false;
    L8:
        CustomerInfo r52 = (CustomerInfo) r5;
        if (AbstractC0585Nj.m1134a(this.f5566id, r52.f5566id) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.status, r52.status) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final String getId() {
        return this.f5566id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int r0 = this.f5566id.hashCode() * 31;
        return this.status.hashCode() + r0;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("CustomerInfo(id=");
        r0.append(this.f5566id);
        r0.append(", status=");
        return AbstractC2374ph.m4815l(r0, this.status, ')');
    }

    public /* synthetic */ CustomerInfo(int r2, String r3, String r4, AbstractC0298Gx r5) {
        if ((r2 & 1) != 0) goto L5;
        this.f5566id = "";
    L7:
        if ((r2 & 2) != 0) goto L10;
        this.status = "";
        return;
    L10:
        this.status = r4;
        return;
    L5:
        this.f5566id = r3;
        goto L7
    }

    public CustomerInfo(String r1, String r2) {
        this.f5566id = r1;
        this.status = r2;
    }

    public /* synthetic */ CustomerInfo(String r2, String r3, int r4, AbstractC0621Oc r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
