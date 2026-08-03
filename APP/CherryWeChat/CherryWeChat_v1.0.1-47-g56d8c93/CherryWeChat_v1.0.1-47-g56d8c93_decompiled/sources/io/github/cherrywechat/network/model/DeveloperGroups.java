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
public final class DeveloperGroups {
    private final List<Developer> core;
    private final List<Developer> special;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {AbstractC0148Dc.m280n(2, new C1302d(9)), AbstractC0148Dc.m280n(2, new C1302d(10))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return DeveloperGroups$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeveloperGroups() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(Developer$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_$0() {
        return new C0263G4(Developer$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeveloperGroups copy$default(DeveloperGroups developerGroups, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = developerGroups.core;
        }
        if ((i & 2) != 0) {
            list2 = developerGroups.special;
        }
        return developerGroups.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$app_release(DeveloperGroups developerGroups, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        boolean zM1845g = interfaceC0962Wa.m1845g();
        C0452Kf c0452Kf = C0452Kf.f1484a;
        if (zM1845g || !AbstractC0585Nj.m1134a(developerGroups.core, c0452Kf)) {
            List<Developer> list = developerGroups.core;
            interfaceC0962Wa.m1839a();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(developerGroups.special, c0452Kf)) {
            return;
        }
        List<Developer> list2 = developerGroups.special;
        interfaceC0962Wa.m1839a();
    }

    public final List<Developer> component1() {
        return this.core;
    }

    public final List<Developer> component2() {
        return this.special;
    }

    public final DeveloperGroups copy(List<Developer> list, List<Developer> list2) {
        return new DeveloperGroups(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeveloperGroups)) {
            return false;
        }
        DeveloperGroups developerGroups = (DeveloperGroups) obj;
        return AbstractC0585Nj.m1134a(this.core, developerGroups.core) && AbstractC0585Nj.m1134a(this.special, developerGroups.special);
    }

    public final List<Developer> getCore() {
        return this.core;
    }

    public final List<Developer> getSpecial() {
        return this.special;
    }

    public int hashCode() {
        return this.special.hashCode() + (this.core.hashCode() * 31);
    }

    public String toString() {
        return "DeveloperGroups(core=" + this.core + ", special=" + this.special + ')';
    }

    public /* synthetic */ DeveloperGroups(int i, List list, List list2, AbstractC0298Gx abstractC0298Gx) {
        int i2 = i & 1;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        if (i2 == 0) {
            this.core = c0452Kf;
        } else {
            this.core = list;
        }
        if ((i & 2) == 0) {
            this.special = c0452Kf;
        } else {
            this.special = list2;
        }
    }

    public DeveloperGroups(List<Developer> list, List<Developer> list2) {
        this.core = list;
        this.special = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeveloperGroups(List list, List list2, int i, AbstractC0621Oc abstractC0621Oc) {
        int i2 = i & 1;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        this(i2 != 0 ? c0452Kf : list, (i & 2) != 0 ? c0452Kf : list2);
    }
}
