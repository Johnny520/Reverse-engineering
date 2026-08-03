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
    private final String categoryId;
    private final String categoryName;
    private final List<FAQItem> items;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, AbstractC0148Dc.m280n(2, new C1302d(11))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return FAQCategory$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public FAQCategory() {
        this((String) null, (String) null, (List) null, 7, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(FAQItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FAQCategory copy$default(FAQCategory fAQCategory, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fAQCategory.categoryId;
        }
        if ((i & 2) != 0) {
            str2 = fAQCategory.categoryName;
        }
        if ((i & 4) != 0) {
            list = fAQCategory.items;
        }
        return fAQCategory.copy(str, str2, list);
    }

    public static /* synthetic */ void getCategoryId$annotations() {
    }

    public static /* synthetic */ void getCategoryName$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(FAQCategory fAQCategory, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(fAQCategory.categoryId, "")) {
            String str = fAQCategory.categoryId;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(fAQCategory.categoryName, "")) {
            String str2 = fAQCategory.categoryName;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(fAQCategory.items, C0452Kf.f1484a)) {
            return;
        }
        List<FAQItem> list = fAQCategory.items;
        interfaceC0962Wa.m1839a();
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

    public final FAQCategory copy(String str, String str2, List<FAQItem> list) {
        return new FAQCategory(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FAQCategory)) {
            return false;
        }
        FAQCategory fAQCategory = (FAQCategory) obj;
        return AbstractC0585Nj.m1134a(this.categoryId, fAQCategory.categoryId) && AbstractC0585Nj.m1134a(this.categoryName, fAQCategory.categoryName) && AbstractC0585Nj.m1134a(this.items, fAQCategory.items);
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
        return this.items.hashCode() + AbstractC2374ph.m4810g(this.categoryName, this.categoryId.hashCode() * 31, 31);
    }

    public String toString() {
        return "FAQCategory(categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", items=" + this.items + ')';
    }

    public /* synthetic */ FAQCategory(int i, String str, String str2, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.categoryId = "";
        } else {
            this.categoryId = str;
        }
        if ((i & 2) == 0) {
            this.categoryName = "";
        } else {
            this.categoryName = str2;
        }
        if ((i & 4) == 0) {
            this.items = C0452Kf.f1484a;
        } else {
            this.items = list;
        }
    }

    public FAQCategory(String str, String str2, List<FAQItem> list) {
        this.categoryId = str;
        this.categoryName = str2;
        this.items = list;
    }

    public /* synthetic */ FAQCategory(String str, String str2, List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C0452Kf.f1484a : list);
    }
}
