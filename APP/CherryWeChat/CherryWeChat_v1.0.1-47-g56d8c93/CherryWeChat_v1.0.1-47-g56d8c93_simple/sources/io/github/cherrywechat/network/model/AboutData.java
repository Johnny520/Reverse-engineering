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
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final AppInfo appInfo;
    private final DeveloperGroups developers;
    private final List<Feature> features;
    private final List<Link> links;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AboutData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, AbstractC0148Dc.m280n(2, new C1302d(0)), null, AbstractC0148Dc.m280n(2, new C1302d(1))};
    }

    public AboutData() {
        AppInfo r1 = null;
        List r2 = null;
        DeveloperGroups r3 = null;
        List r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(Feature$$serializer.INSTANCE);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_$0() {
        return new C0263G4(Link$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3537a() {
        return _childSerializers$_anonymous_$0();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC0717Qm m3538b() {
        return _childSerializers$_anonymous_();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AboutData copy$default(AboutData r0, AppInfo r1, List r2, DeveloperGroups r3, List r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.appInfo;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.features;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.developers;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.links;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public static final /* synthetic */ void write$Self$app_release(AboutData r7, InterfaceC0962Wa r8, InterfaceC0126Cx r9) {
        InterfaceC0159Dn[] r92 = $childSerializers;
        if (r8.m1845g() == false) goto L6;
    L7:
        AppInfo$$serializer r0 = AppInfo$$serializer.INSTANCE;
        AppInfo r02 = r7.appInfo;
        r8.m1839a();
    L8:
        boolean r03 = r8.m1845g();
        C0452Kf r1 = C0452Kf.f1484a;
        if (r03 == false) goto L12;
    L13:
        InterfaceC0717Qm r04 = (InterfaceC0717Qm) r92[1].getValue();
        List<Feature> r05 = r7.features;
        r8.m1839a();
    L15:
        if (r8.m1845g() == false) goto L18;
    L19:
        DeveloperGroups$$serializer r06 = DeveloperGroups$$serializer.INSTANCE;
        DeveloperGroups r07 = r7.developers;
        r8.m1839a();
    L21:
        if (r8.m1845g() == false) goto L24;
    L25:
        InterfaceC0717Qm r93 = (InterfaceC0717Qm) r92[3].getValue();
        List<Link> r72 = r7.links;
        r8.m1839a();
        return;
    L24:
        if (AbstractC0585Nj.m1134a(r7.links, r1) == false) goto L25;
        return;
    L18:
        if (AbstractC0585Nj.m1134a(r7.developers, new DeveloperGroups(null, null, 3, null)) == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r7.features, r1) == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r7.appInfo, new AppInfo(null, null, null, 7, null)) == true) goto L8;
        goto L7
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

    public final AboutData copy(AppInfo r2, List<Feature> r3, DeveloperGroups r4, List<Link> r5) {
        return new AboutData(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AboutData) == true) goto L8;
        return false;
    L8:
        AboutData r52 = (AboutData) r5;
        if (AbstractC0585Nj.m1134a(this.appInfo, r52.appInfo) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.features, r52.features) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.developers, r52.developers) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.links, r52.links) == true) goto L20;
        return false;
    L20:
        return true;
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
        int r0 = this.appInfo.hashCode() * 31;
        int r1 = (this.features.hashCode() + r0) * 31;
        int r02 = (this.developers.hashCode() + r1) * 31;
        return this.links.hashCode() + r02;
    }

    public String toString() {
        return "AboutData(appInfo=" + this.appInfo + ", features=" + this.features + ", developers=" + this.developers + ", links=" + this.links + ')';
    }

    public /* synthetic */ AboutData(int r7, AppInfo r8, List r9, DeveloperGroups r10, List r11, AbstractC0298Gx r12) {
        if ((r7 & 1) != 0) goto L5;
        this.appInfo = new AppInfo(null, null, null, 7, null);
    L6:
        int r82 = r7 & 2;
        C0452Kf r122 = C0452Kf.f1484a;
        if (r82 != 0) goto L9;
        this.features = r122;
    L11:
        if ((r7 & 4) != 0) goto L13;
        this.developers = new DeveloperGroups(null, null, 3, null);
    L15:
        if ((r7 & 8) != 0) goto L18;
        this.links = r122;
        return;
    L18:
        this.links = r11;
        return;
    L13:
        this.developers = r10;
        goto L15
    L9:
        this.features = r9;
        goto L11
    L5:
        this.appInfo = r8;
        goto L6
    }

    public AboutData(AppInfo r1, List<Feature> r2, DeveloperGroups r3, List<Link> r4) {
        this.appInfo = r1;
        this.features = r2;
        this.developers = r3;
        this.links = r4;
    }

    public /* synthetic */ AboutData(AppInfo r7, List r8, DeveloperGroups r9, List r10, int r11, AbstractC0621Oc r12) {
        if ((r11 & 1) == 0) goto L5;
        r7 = new AppInfo(null, null, null, 7, null);
    L5:
        int r122 = r11 & 2;
        C0452Kf r0 = C0452Kf.f1484a;
        if (r122 == 0) goto L9;
        r8 = r0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r9 = new DeveloperGroups(null, null, 3, null);
    L12:
        if ((r11 & 8) == 0) goto L14;
        r10 = r0;
    L14:
        this(r7, r8, r9, r10);
    }
}
