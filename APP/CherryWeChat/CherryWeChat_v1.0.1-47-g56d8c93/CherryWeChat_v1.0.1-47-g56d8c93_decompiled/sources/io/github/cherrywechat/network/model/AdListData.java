package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.C0263G4;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class AdListData {
    private final List<RawAdItem> items;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {AbstractC0148Dc.m280n(2, new C1302d(2))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AdListData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdListData() {
        this((List) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(RawAdItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdListData copy$default(AdListData adListData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adListData.items;
        }
        return adListData.copy(list);
    }

    public static final /* synthetic */ void write$Self$app_release(AdListData adListData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (!interfaceC0962Wa.m1845g() && adListData.items == null) {
            return;
        }
        List<RawAdItem> list = adListData.items;
        interfaceC0962Wa.m1844f();
    }

    public final List<RawAdItem> component1() {
        return this.items;
    }

    public final AdListData copy(List<RawAdItem> list) {
        return new AdListData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdListData) && AbstractC0585Nj.m1134a(this.items, ((AdListData) obj).items);
    }

    public final List<RawAdItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<RawAdItem> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "AdListData(items=" + this.items + ')';
    }

    public /* synthetic */ AdListData(int i, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
    }

    public AdListData(List<RawAdItem> list) {
        this.items = list;
    }

    public /* synthetic */ AdListData(List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? null : list);
    }
}
