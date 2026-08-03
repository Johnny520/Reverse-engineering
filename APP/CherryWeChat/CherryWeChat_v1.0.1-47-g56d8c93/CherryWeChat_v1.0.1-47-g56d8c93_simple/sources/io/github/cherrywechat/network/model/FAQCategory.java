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
public final class FAQCategory {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final String categoryId;
    private final String categoryName;
    private final List<FAQItem> items;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return FAQCategory$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, AbstractC0148Dc.m280n(2, new C1302d(11))};
    }

    public FAQCategory() {
        String r1 = null;
        String r2 = null;
        List r3 = null;
        this(r1, r2, r3, 7, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(FAQItem$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3546a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FAQCategory copy$default(FAQCategory r0, String r1, String r2, List r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.categoryId;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.categoryName;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.items;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public static /* synthetic */ void getCategoryId$annotations() {
    }

    public static /* synthetic */ void getCategoryName$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(FAQCategory r2, InterfaceC0962Wa r3, InterfaceC0126Cx r4) {
        InterfaceC0159Dn[] r42 = $childSerializers;
        if (r3.m1845g() == false) goto L6;
    L7:
        String r0 = r2.categoryId;
        r3.m1842d();
    L9:
        if (r3.m1845g() == false) goto L12;
    L13:
        String r02 = r2.categoryName;
        r3.m1842d();
    L15:
        if (r3.m1845g() == false) goto L18;
    L19:
        InterfaceC0717Qm r43 = (InterfaceC0717Qm) r42[2].getValue();
        List<FAQItem> r22 = r2.items;
        r3.m1839a();
        return;
    L18:
        if (AbstractC0585Nj.m1134a(r2.items, C0452Kf.f1484a) == false) goto L19;
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r2.categoryName, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r2.categoryId, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.categoryId;
    }

    public final String component2() {
        return this.categoryName;
    }

    public final List<FAQItem> component3() {
        return this.items;
    }

    public final FAQCategory copy(String r2, String r3, List<FAQItem> r4) {
        return new FAQCategory(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FAQCategory) == true) goto L8;
        return false;
    L8:
        FAQCategory r52 = (FAQCategory) r5;
        if (AbstractC0585Nj.m1134a(this.categoryId, r52.categoryId) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.categoryName, r52.categoryName) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.items, r52.items) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final List<FAQItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        int r0 = this.categoryId.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.categoryName, r0, 31);
        return this.items.hashCode() + r02;
    }

    public String toString() {
        return "FAQCategory(categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", items=" + this.items + ')';
    }

    public /* synthetic */ FAQCategory(int r2, String r3, String r4, List r5, AbstractC0298Gx r6) {
        if ((r2 & 1) != 0) goto L5;
        this.categoryId = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.categoryName = "";
    L11:
        if ((r2 & 4) != 0) goto L14;
        this.items = C0452Kf.f1484a;
        return;
    L14:
        this.items = r5;
        return;
    L9:
        this.categoryName = r4;
        goto L11
    L5:
        this.categoryId = r3;
        goto L7
    }

    public FAQCategory(String r1, String r2, List<FAQItem> r3) {
        this.categoryId = r1;
        this.categoryName = r2;
        this.items = r3;
    }

    public /* synthetic */ FAQCategory(String r2, String r3, List r4, int r5, AbstractC0621Oc r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = C0452Kf.f1484a;
    L11:
        this(r2, r3, r4);
    }
}
