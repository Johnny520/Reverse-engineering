package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0213Ey;
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
public final class ThemeSimpleData {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final int themeCount;
    private final List<ThemeSimpleItem> themes;
    private final String wechat;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeSimpleData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, AbstractC0148Dc.m280n(2, new C1302d(22))};
    }

    public ThemeSimpleData() {
        String r1 = null;
        int r2 = 0;
        List r3 = null;
        this(r1, r2, r3, 7, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(ThemeSimpleItem$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3551a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeSimpleData copy$default(ThemeSimpleData r0, String r1, int r2, List r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.wechat;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.themeCount;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.themes;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeSimpleData r2, InterfaceC0962Wa r3, InterfaceC0126Cx r4) {
        InterfaceC0159Dn[] r42 = $childSerializers;
        if (r3.m1845g() == false) goto L6;
    L7:
        String r0 = r2.wechat;
        r3.m1842d();
    L9:
        if (r3.m1845g() == false) goto L12;
    L13:
        int r02 = r2.themeCount;
        r3.m1843e();
    L15:
        if (r3.m1845g() == false) goto L18;
    L19:
        InterfaceC0717Qm r43 = (InterfaceC0717Qm) r42[2].getValue();
        List<ThemeSimpleItem> r22 = r2.themes;
        r3.m1839a();
        return;
    L18:
        if (AbstractC0585Nj.m1134a(r2.themes, C0452Kf.f1484a) == false) goto L19;
        return;
    L12:
        if (r2.themeCount == 0) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r2.wechat, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.wechat;
    }

    public final int component2() {
        return this.themeCount;
    }

    public final List<ThemeSimpleItem> component3() {
        return this.themes;
    }

    public final ThemeSimpleData copy(String r2, int r3, List<ThemeSimpleItem> r4) {
        return new ThemeSimpleData(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ThemeSimpleData) == true) goto L8;
        return false;
    L8:
        ThemeSimpleData r52 = (ThemeSimpleData) r5;
        if (AbstractC0585Nj.m1134a(this.wechat, r52.wechat) == true) goto L12;
        return false;
    L12:
        if (this.themeCount == r52.themeCount) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.themes, r52.themes) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getThemeCount() {
        return this.themeCount;
    }

    public final List<ThemeSimpleItem> getThemes() {
        return this.themes;
    }

    public final String getWechat() {
        return this.wechat;
    }

    public int hashCode() {
        int r0 = this.wechat.hashCode() * 31;
        int r02 = AbstractC0213Ey.m403a(this.themeCount, r0, 31);
        return this.themes.hashCode() + r02;
    }

    public String toString() {
        return "ThemeSimpleData(wechat=" + this.wechat + ", themeCount=" + this.themeCount + ", themes=" + this.themes + ')';
    }

    public /* synthetic */ ThemeSimpleData(int r1, String r2, int r3, List r4, AbstractC0298Gx r5) {
        if ((r1 & 1) != 0) goto L5;
        r2 = "";
    L5:
        this.wechat = r2;
        if ((r1 & 2) != 0) goto L8;
        this.themeCount = 0;
    L10:
        if ((r1 & 4) != 0) goto L13;
        this.themes = C0452Kf.f1484a;
        return;
    L13:
        this.themes = r4;
        return;
    L8:
        this.themeCount = r3;
        goto L10
    }

    public ThemeSimpleData(String r1, int r2, List<ThemeSimpleItem> r3) {
        this.wechat = r1;
        this.themeCount = r2;
        this.themes = r3;
    }

    public /* synthetic */ ThemeSimpleData(String r1, int r2, List r3, int r4, AbstractC0621Oc r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = C0452Kf.f1484a;
    L11:
        this(r1, r2, r3);
    }
}
