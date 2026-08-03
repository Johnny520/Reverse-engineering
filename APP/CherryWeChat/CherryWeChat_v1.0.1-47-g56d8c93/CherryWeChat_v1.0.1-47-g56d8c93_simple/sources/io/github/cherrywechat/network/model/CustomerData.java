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
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final String accessToken;
    private final List<AuthorizedThemeData> authorizedThemes;
    private final CustomerInfo customer;
    private final long expires;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return CustomerData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, null, AbstractC0148Dc.m280n(2, new C1302d(8))};
    }

    public CustomerData() {
        CustomerInfo r1 = null;
        String r2 = null;
        long r3 = 0;
        List r5 = null;
        this(r1, r2, r3, r5, 15, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(AuthorizedThemeData$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3543a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerData copy$default(CustomerData r0, CustomerInfo r1, String r2, long r3, List r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.customer;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.accessToken;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.expires;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = r0.authorizedThemes;
    L14:
        List r72 = r5;
        long r52 = r3;
        return r0.copy(r1, r2, r52, r72);
    }

    public static final /* synthetic */ void write$Self$app_release(CustomerData r4, InterfaceC0962Wa r5, InterfaceC0126Cx r6) {
        InterfaceC0159Dn[] r62 = $childSerializers;
        if (r5.m1845g() == false) goto L6;
    L7:
        CustomerInfo$$serializer r0 = CustomerInfo$$serializer.INSTANCE;
        CustomerInfo r02 = r4.customer;
        r5.m1844f();
    L9:
        if (r5.m1845g() == false) goto L12;
    L13:
        String r03 = r4.accessToken;
        r5.m1842d();
    L15:
        if (r5.m1845g() == false) goto L18;
    L19:
        long r04 = r4.expires;
        r5.m1841c();
    L21:
        if (r5.m1845g() == false) goto L24;
    L25:
        InterfaceC0717Qm r63 = (InterfaceC0717Qm) r62[3].getValue();
        List<AuthorizedThemeData> r42 = r4.authorizedThemes;
        r5.m1839a();
        return;
    L24:
        if (AbstractC0585Nj.m1134a(r4.authorizedThemes, C0452Kf.f1484a) == false) goto L25;
        return;
    L18:
        if (r4.expires == 0) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r4.accessToken, "") == true) goto L15;
    L6:
        if (r4.customer == null) goto L9;
        goto L7
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

    public final CustomerData copy(CustomerInfo r7, String r8, long r9, List<AuthorizedThemeData> r11) {
        return new CustomerData(r7, r8, r9, r11);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof CustomerData) == true) goto L8;
        return false;
    L8:
        CustomerData r82 = (CustomerData) r8;
        if (AbstractC0585Nj.m1134a(this.customer, r82.customer) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.accessToken, r82.accessToken) == true) goto L15;
        return false;
    L15:
        if (this.expires == r82.expires) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.authorizedThemes, r82.authorizedThemes) == true) goto L20;
        return false;
    L20:
        return true;
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
        CustomerInfo r0 = this.customer;
        if (r0 != null) goto L5;
        int r02 = 0;
    L6:
        String r2 = this.accessToken;
        int r03 = AbstractC2374ph.m4810g(r2, r02 * 31, 31);
        int r22 = (Long.hashCode(this.expires) + r03) * 31;
        return this.authorizedThemes.hashCode() + r22;
    L5:
        r02 = r0.hashCode();
        goto L6
    }

    public String toString() {
        return "CustomerData(customer=" + this.customer + ", accessToken=" + this.accessToken + ", expires=" + this.expires + ", authorizedThemes=" + this.authorizedThemes + ')';
    }

    public /* synthetic */ CustomerData(int r1, CustomerInfo r2, String r3, long r4, List r6, AbstractC0298Gx r7) {
        if ((r1 & 1) != 0) goto L5;
        r2 = null;
    L5:
        this.customer = r2;
        if ((r1 & 2) != 0) goto L8;
        this.accessToken = "";
    L10:
        if ((r1 & 4) != 0) goto L12;
        this.expires = 0;
    L14:
        if ((r1 & 8) != 0) goto L17;
        this.authorizedThemes = C0452Kf.f1484a;
        return;
    L17:
        this.authorizedThemes = r6;
        return;
    L12:
        this.expires = r4;
        goto L14
    L8:
        this.accessToken = r3;
        goto L10
    }

    public CustomerData(CustomerInfo r1, String r2, long r3, List<AuthorizedThemeData> r5) {
        this.customer = r1;
        this.accessToken = r2;
        this.expires = r3;
        this.authorizedThemes = r5;
    }

    public /* synthetic */ CustomerData(CustomerInfo r1, String r2, long r3, List r5, int r6, AbstractC0621Oc r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = C0452Kf.f1484a;
    L14:
        List r72 = r5;
        long r52 = r3;
        this(r1, r2, r52, r72);
    }
}
