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
public final class AboutData {
    private final AppInfo appInfo;
    private final DeveloperGroups developers;
    private final List<Feature> features;
    private final List<Link> links;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, AbstractC0148Dc.m280n(2, new C1302d(0)), null, AbstractC0148Dc.m280n(2, new C1302d(1))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AboutData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public AboutData() {
        this((AppInfo) null, (List) null, (DeveloperGroups) null, (List) null, 15, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(Feature$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_$0() {
        return new C0263G4(Link$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AboutData copy$default(AboutData aboutData, AppInfo appInfo, List list, DeveloperGroups developerGroups, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            appInfo = aboutData.appInfo;
        }
        if ((i & 2) != 0) {
            list = aboutData.features;
        }
        if ((i & 4) != 0) {
            developerGroups = aboutData.developers;
        }
        if ((i & 8) != 0) {
            list2 = aboutData.links;
        }
        return aboutData.copy(appInfo, list, developerGroups, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$app_release(AboutData aboutData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g()) {
            AppInfo$$serializer appInfo$$serializer = AppInfo$$serializer.INSTANCE;
            AppInfo appInfo = aboutData.appInfo;
            interfaceC0962Wa.m1839a();
        } else {
            if (!AbstractC0585Nj.m1134a(aboutData.appInfo, new AppInfo((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null))) {
            }
        }
        boolean zM1845g = interfaceC0962Wa.m1845g();
        C0452Kf c0452Kf = C0452Kf.f1484a;
        if (zM1845g || !AbstractC0585Nj.m1134a(aboutData.features, c0452Kf)) {
            List<Feature> list = aboutData.features;
            interfaceC0962Wa.m1839a();
        }
        int i = 3;
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(aboutData.developers, new DeveloperGroups((List) null, (List) (0 == true ? 1 : 0), i, (AbstractC0621Oc) (0 == true ? 1 : 0)))) {
            DeveloperGroups$$serializer developerGroups$$serializer = DeveloperGroups$$serializer.INSTANCE;
            DeveloperGroups developerGroups = aboutData.developers;
            interfaceC0962Wa.m1839a();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(aboutData.links, c0452Kf)) {
            return;
        }
        List<Link> list2 = aboutData.links;
        interfaceC0962Wa.m1839a();
    }

    public final AppInfo component1() {
        return this.appInfo;
    }

    public final List<Feature> component2() {
        return this.features;
    }

    public final DeveloperGroups component3() {
        return this.developers;
    }

    public final List<Link> component4() {
        return this.links;
    }

    public final AboutData copy(AppInfo appInfo, List<Feature> list, DeveloperGroups developerGroups, List<Link> list2) {
        return new AboutData(appInfo, list, developerGroups, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutData)) {
            return false;
        }
        AboutData aboutData = (AboutData) obj;
        return AbstractC0585Nj.m1134a(this.appInfo, aboutData.appInfo) && AbstractC0585Nj.m1134a(this.features, aboutData.features) && AbstractC0585Nj.m1134a(this.developers, aboutData.developers) && AbstractC0585Nj.m1134a(this.links, aboutData.links);
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final DeveloperGroups getDevelopers() {
        return this.developers;
    }

    public final List<Feature> getFeatures() {
        return this.features;
    }

    public final List<Link> getLinks() {
        return this.links;
    }

    public int hashCode() {
        return this.links.hashCode() + ((this.developers.hashCode() + ((this.features.hashCode() + (this.appInfo.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AboutData(appInfo=" + this.appInfo + ", features=" + this.features + ", developers=" + this.developers + ", links=" + this.links + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AboutData(int i, AppInfo appInfo, List list, DeveloperGroups developerGroups, List list2, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.appInfo = new AppInfo((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null);
        } else {
            this.appInfo = appInfo;
        }
        int i2 = i & 2;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        if (i2 == 0) {
            this.features = c0452Kf;
        } else {
            this.features = list;
        }
        if ((i & 4) == 0) {
            this.developers = new DeveloperGroups((List) null, (List) (0 == true ? 1 : 0), 3, (AbstractC0621Oc) (0 == true ? 1 : 0));
        } else {
            this.developers = developerGroups;
        }
        if ((i & 8) == 0) {
            this.links = c0452Kf;
        } else {
            this.links = list2;
        }
    }

    public AboutData(AppInfo appInfo, List<Feature> list, DeveloperGroups developerGroups, List<Link> list2) {
        this.appInfo = appInfo;
        this.features = list;
        this.developers = developerGroups;
        this.links = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AboutData(AppInfo appInfo, List list, DeveloperGroups developerGroups, List list2, int i, AbstractC0621Oc abstractC0621Oc) {
        appInfo = (i & 1) != 0 ? new AppInfo((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null) : appInfo;
        int i2 = i & 2;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        this(appInfo, i2 != 0 ? c0452Kf : list, (i & 4) != 0 ? new DeveloperGroups((List) null, (List) (0 == true ? 1 : 0), 3, (AbstractC0621Oc) (0 == true ? 1 : 0)) : developerGroups, (i & 8) != 0 ? c0452Kf : list2);
    }
}
