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
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final List<Developer> core;
    private final List<Developer> special;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return DeveloperGroups$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{AbstractC0148Dc.m280n(2, new C1302d(9)), AbstractC0148Dc.m280n(2, new C1302d(10))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeveloperGroups() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(Developer$$serializer.INSTANCE);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_$0() {
        return new C0263G4(Developer$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3544a() {
        return _childSerializers$_anonymous_$0();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC0717Qm m3545b() {
        return _childSerializers$_anonymous_();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeveloperGroups copy$default(DeveloperGroups r0, List r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.core;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.special;
    L9:
        return r0.copy(r1, r2);
    }

    public static final /* synthetic */ void write$Self$app_release(DeveloperGroups r2, InterfaceC0962Wa r3, InterfaceC0126Cx r4) {
        InterfaceC0159Dn[] r42 = $childSerializers;
        boolean r0 = r3.m1845g();
        C0452Kf r1 = C0452Kf.f1484a;
        if (r0 == false) goto L6;
    L7:
        InterfaceC0717Qm r02 = (InterfaceC0717Qm) r42[0].getValue();
        List<Developer> r03 = r2.core;
        r3.m1839a();
    L9:
        if (r3.m1845g() == false) goto L12;
    L13:
        InterfaceC0717Qm r43 = (InterfaceC0717Qm) r42[1].getValue();
        List<Developer> r22 = r2.special;
        r3.m1839a();
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r2.special, r1) == false) goto L13;
        return;
    L6:
        if (AbstractC0585Nj.m1134a(r2.core, r1) == true) goto L9;
        goto L7
    }

    public final List<Developer> component1() {
        return this.core;
    }

    public final List<Developer> component2() {
        return this.special;
    }

    public final DeveloperGroups copy(List<Developer> r2, List<Developer> r3) {
        return new DeveloperGroups(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DeveloperGroups) == true) goto L8;
        return false;
    L8:
        DeveloperGroups r52 = (DeveloperGroups) r5;
        if (AbstractC0585Nj.m1134a(this.core, r52.core) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.special, r52.special) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final List<Developer> getCore() {
        return this.core;
    }

    public final List<Developer> getSpecial() {
        return this.special;
    }

    public int hashCode() {
        int r0 = this.core.hashCode() * 31;
        return this.special.hashCode() + r0;
    }

    public String toString() {
        return "DeveloperGroups(core=" + this.core + ", special=" + this.special + ')';
    }

    public /* synthetic */ DeveloperGroups(int r2, List r3, List r4, AbstractC0298Gx r5) {
        int r52 = r2 & 1;
        C0452Kf r0 = C0452Kf.f1484a;
        if (r52 != 0) goto L5;
        this.core = r0;
    L7:
        if ((r2 & 2) != 0) goto L10;
        this.special = r0;
        return;
    L10:
        this.special = r4;
        return;
    L5:
        this.core = r3;
        goto L7
    }

    public DeveloperGroups(List<Developer> r1, List<Developer> r2) {
        this.core = r1;
        this.special = r2;
    }

    public /* synthetic */ DeveloperGroups(List r2, List r3, int r4, AbstractC0621Oc r5) {
        int r52 = r4 & 1;
        C0452Kf r0 = C0452Kf.f1484a;
        if (r52 == 0) goto L6;
        r2 = r0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = r0;
    L8:
        this(r2, r3);
    }
}
