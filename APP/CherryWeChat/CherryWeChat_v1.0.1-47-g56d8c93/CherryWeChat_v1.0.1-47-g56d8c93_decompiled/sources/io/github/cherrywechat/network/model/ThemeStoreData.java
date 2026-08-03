package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeStoreData {
    private final List<ThemeStoreItem> items;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {AbstractC0148Dc.m280n(2, new C1302d(24))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeStoreData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeStoreData() {
        this((List) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(ThemeStoreItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeStoreData copy$default(ThemeStoreData themeStoreData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = themeStoreData.items;
        }
        return themeStoreData.copy(list);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeStoreData themeStoreData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(themeStoreData.items, C0452Kf.f1484a)) {
            return;
        }
        List<ThemeStoreItem> list = themeStoreData.items;
        interfaceC0962Wa.m1839a();
    }

    public final List<ThemeStoreItem> component1() {
        return this.items;
    }

    public final ThemeStoreData copy(List<ThemeStoreItem> list) {
        return new ThemeStoreData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThemeStoreData) && AbstractC0585Nj.m1134a(this.items, ((ThemeStoreData) obj).items);
    }

    public final List<ThemeStoreItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return "ThemeStoreData(items=" + this.items + ')';
    }

    public /* synthetic */ ThemeStoreData(int i, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.items = C0452Kf.f1484a;
        } else {
            this.items = list;
        }
    }

    public ThemeStoreData(List<ThemeStoreItem> list) {
        this.items = list;
    }

    public /* synthetic */ ThemeStoreData(List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? C0452Kf.f1484a : list);
    }
}
